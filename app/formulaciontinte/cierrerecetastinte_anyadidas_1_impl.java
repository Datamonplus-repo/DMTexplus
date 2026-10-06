package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class cierrerecetastinte_anyadidas_1_impl extends GXWebComponent
{
   public cierrerecetastinte_anyadidas_1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public cierrerecetastinte_anyadidas_1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cierrerecetastinte_anyadidas_1_impl.class ));
   }

   public cierrerecetastinte_anyadidas_1_impl( int remoteHandle ,
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
               AV6BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
               AV7BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
               AV8BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarCodPar", AV8BarCodPar);
               AV9RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9RecLinMaq), 4, 0));
               AV10FecCieTin = localUtil.parseDateParm( httpContext.GetPar( "FecCieTin")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10FecCieTin", localUtil.format(AV10FecCieTin, "99/99/99"));
               AV11consumos = (short)(GXutil.lval( httpContext.GetPar( "consumos"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11consumos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11consumos), 4, 0));
               AV12Maqcod = httpContext.GetPar( "Maqcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12Maqcod", AV12Maqcod);
               AV13Cc_almcod = (byte)(GXutil.lval( httpContext.GetPar( "Cc_almcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Cc_almcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Cc_almcod), 2, 0));
               AV14fechaCierre = localUtil.parseDateParm( httpContext.GetPar( "fechaCierre")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14fechaCierre", localUtil.format(AV14fechaCierre, "99/99/99"));
               AV15flagM = (short)(GXutil.lval( httpContext.GetPar( "flagM"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15flagM", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15flagM), 4, 0));
               AV16recfec = localUtil.parseDateParm( httpContext.GetPar( "recfec")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16recfec", localUtil.format(AV16recfec, "99/99/99"));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5EmprCod,Integer.valueOf(AV6BarCod),Byte.valueOf(AV7BarCodReo),AV8BarCodPar,Short.valueOf(AV9RecLinMaq),AV10FecCieTin,Short.valueOf(AV11consumos),AV12Maqcod,Byte.valueOf(AV13Cc_almcod),AV14fechaCierre,Short.valueOf(AV15flagM),AV16recfec});
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
      nRC_GXsfl_49 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_49"))) ;
      nGXsfl_49_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_49_idx"))) ;
      sGXsfl_49_idx = httpContext.GetPar( "sGXsfl_49_idx") ;
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
      AV27FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV5EmprCod = httpContext.GetPar( "EmprCod") ;
      AV6BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV7BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV8BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV9RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
      AV35ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV30ColumnsSelector);
      AV44TFRecLinPro = (byte)(GXutil.lval( httpContext.GetPar( "TFRecLinPro"))) ;
      AV45TFRecLinPro_To = (byte)(GXutil.lval( httpContext.GetPar( "TFRecLinPro_To"))) ;
      AV50TFRecLin = (short)(GXutil.lval( httpContext.GetPar( "TFRecLin"))) ;
      AV51TFRecLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFRecLin_To"))) ;
      AV52TFRecPrdNum = httpContext.GetPar( "TFRecPrdNum") ;
      AV53TFRecPrdNum_Sel = httpContext.GetPar( "TFRecPrdNum_Sel") ;
      AV54TFRecPrdDsc = httpContext.GetPar( "TFRecPrdDsc") ;
      AV55TFRecPrdDsc_Sel = httpContext.GetPar( "TFRecPrdDsc_Sel") ;
      AV56TFForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "TFForPrdUMe"))) ;
      AV57TFForPrdUMe_To = (byte)(GXutil.lval( httpContext.GetPar( "TFForPrdUMe_To"))) ;
      AV58TFForPrdDsc = httpContext.GetPar( "TFForPrdDsc") ;
      AV59TFForPrdDsc_Sel = httpContext.GetPar( "TFForPrdDsc_Sel") ;
      AV60TFPrdCant = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCant"), ".") ;
      AV61TFPrdCant_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCant_To"), ".") ;
      AV62TFPrdCanFin = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCanFin"), ".") ;
      AV63TFPrdCanFin_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCanFin_To"), ".") ;
      AV92Pgmname = httpContext.GetPar( "Pgmname") ;
      AV24OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV25OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV27FilterFullText, AV5EmprCod, AV6BarCod, AV7BarCodReo, AV8BarCodPar, AV9RecLinMaq, AV35ManageFiltersExecutionStep, AV30ColumnsSelector, AV44TFRecLinPro, AV45TFRecLinPro_To, AV50TFRecLin, AV51TFRecLin_To, AV52TFRecPrdNum, AV53TFRecPrdNum_Sel, AV54TFRecPrdDsc, AV55TFRecPrdDsc_Sel, AV56TFForPrdUMe, AV57TFForPrdUMe_To, AV58TFForPrdDsc, AV59TFForPrdDsc_Sel, AV60TFPrdCant, AV61TFPrdCant_To, AV62TFPrdCanFin, AV63TFPrdCanFin_To, AV92Pgmname, AV24OrderedBy, AV25OrderedDsc, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1LH2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Relacion de Productos Quimicos", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.cierrerecetastinte_anyadidas_1", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV9RecLinMaq,4,0)),GXutil.URLEncode(GXutil.formatDateParm(AV10FecCieTin)),GXutil.URLEncode(GXutil.ltrimstr(AV11consumos,4,0)),GXutil.URLEncode(GXutil.rtrim(AV12Maqcod)),GXutil.URLEncode(GXutil.ltrimstr(AV13Cc_almcod,2,0)),GXutil.URLEncode(GXutil.formatDateParm(AV14fechaCierre)),GXutil.URLEncode(GXutil.ltrimstr(AV15flagM,4,0)),GXutil.URLEncode(GXutil.formatDateParm(AV16recfec))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","RecLinMaq","FecCieTin","consumos","Maqcod","Cc_almcod","fechaCierre","flagM","recfec"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV92Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV27FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_49", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_49, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV33ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV33ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV48GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV49GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV46DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV46DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV30ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV30ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5EmprCod", GXutil.rtrim( wcpOAV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6BarCod", GXutil.ltrim( localUtil.ntoc( wcpOAV6BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7BarCodReo", GXutil.ltrim( localUtil.ntoc( wcpOAV7BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8BarCodPar", GXutil.rtrim( wcpOAV8BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9RecLinMaq", GXutil.ltrim( localUtil.ntoc( wcpOAV9RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10FecCieTin", localUtil.dtoc( wcpOAV10FecCieTin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11consumos", GXutil.ltrim( localUtil.ntoc( wcpOAV11consumos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV12Maqcod", GXutil.rtrim( wcpOAV12Maqcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV13Cc_almcod", GXutil.ltrim( localUtil.ntoc( wcpOAV13Cc_almcod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV14fechaCierre", localUtil.dtoc( wcpOAV14fechaCierre, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV15flagM", GXutil.ltrim( localUtil.ntoc( wcpOAV15flagM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV16recfec", localUtil.dtoc( wcpOAV16recfec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV35ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECLINPRO", GXutil.ltrim( localUtil.ntoc( AV44TFRecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECLINPRO_TO", GXutil.ltrim( localUtil.ntoc( AV45TFRecLinPro_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECLIN", GXutil.ltrim( localUtil.ntoc( AV50TFRecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECLIN_TO", GXutil.ltrim( localUtil.ntoc( AV51TFRecLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECPRDNUM", GXutil.rtrim( AV52TFRecPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECPRDNUM_SEL", GXutil.rtrim( AV53TFRecPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECPRDDSC", GXutil.rtrim( AV54TFRecPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECPRDDSC_SEL", GXutil.rtrim( AV55TFRecPrdDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORPRDUME", GXutil.ltrim( localUtil.ntoc( AV56TFForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORPRDUME_TO", GXutil.ltrim( localUtil.ntoc( AV57TFForPrdUMe_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORPRDDSC", GXutil.rtrim( AV58TFForPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFORPRDDSC_SEL", GXutil.rtrim( AV59TFForPrdDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDCANT", GXutil.ltrim( localUtil.ntoc( AV60TFPrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDCANT_TO", GXutil.ltrim( localUtil.ntoc( AV61TFPrdCant_To, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDCANFIN", GXutil.ltrim( localUtil.ntoc( AV62TFPrdCanFin, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDCANFIN_TO", GXutil.ltrim( localUtil.ntoc( AV63TFPrdCanFin_To, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV92Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV92Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV24OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV25OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDCANANY", GXutil.ltrim( localUtil.ntoc( A1797PrdCanAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV22GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV22GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECFEC", localUtil.dtoc( AV16recfec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGM", GXutil.ltrim( localUtil.ntoc( AV15flagM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECHACIERRE", localUtil.dtoc( AV14fechaCierre, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCC_ALMCOD", GXutil.ltrim( localUtil.ntoc( AV13Cc_almcod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD", GXutil.rtrim( AV12Maqcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONSUMOS", GXutil.ltrim( localUtil.ntoc( AV11consumos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECCIETIN", localUtil.dtoc( AV10FecCieTin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECLINMAQ", GXutil.ltrim( localUtil.ntoc( AV9RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR", GXutil.rtrim( AV8BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV7BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD", GXutil.ltrim( localUtil.ntoc( AV6BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ACCIONES_Width", GXutil.rtrim( Dvpanel_acciones_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ACCIONES_Autowidth", GXutil.booltostr( Dvpanel_acciones_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ACCIONES_Autoheight", GXutil.booltostr( Dvpanel_acciones_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ACCIONES_Cls", GXutil.rtrim( Dvpanel_acciones_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ACCIONES_Title", GXutil.rtrim( Dvpanel_acciones_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ACCIONES_Collapsible", GXutil.booltostr( Dvpanel_acciones_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ACCIONES_Collapsed", GXutil.booltostr( Dvpanel_acciones_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ACCIONES_Showcollapseicon", GXutil.booltostr( Dvpanel_acciones_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ACCIONES_Iconposition", GXutil.rtrim( Dvpanel_acciones_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ACCIONES_Autoscroll", GXutil.booltostr( Dvpanel_acciones_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
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

   public void renderHtmlCloseForm1LH2( )
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
      return "FormulacionTinte.CierreRecetasTinte_Anyadidas_1" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Relacion de Productos Quimicos", "") ;
   }

   public void wb1LH0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.formulaciontinte.cierrerecetastinte_anyadidas_1");
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
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 49, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\CierreRecetasTinte_Anyadidas_1.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_19_1LH2( true) ;
      }
      else
      {
         wb_table1_19_1LH2( false) ;
      }
      return  ;
   }

   public void wb_table1_19_1LH2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_acciones.setProperty("Width", Dvpanel_acciones_Width);
         ucDvpanel_acciones.setProperty("AutoWidth", Dvpanel_acciones_Autowidth);
         ucDvpanel_acciones.setProperty("AutoHeight", Dvpanel_acciones_Autoheight);
         ucDvpanel_acciones.setProperty("Cls", Dvpanel_acciones_Cls);
         ucDvpanel_acciones.setProperty("Title", Dvpanel_acciones_Title);
         ucDvpanel_acciones.setProperty("Collapsible", Dvpanel_acciones_Collapsible);
         ucDvpanel_acciones.setProperty("Collapsed", Dvpanel_acciones_Collapsed);
         ucDvpanel_acciones.setProperty("ShowCollapseIcon", Dvpanel_acciones_Showcollapseicon);
         ucDvpanel_acciones.setProperty("IconPosition", Dvpanel_acciones_Iconposition);
         ucDvpanel_acciones.setProperty("AutoScroll", Dvpanel_acciones_Autoscroll);
         ucDvpanel_acciones.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_acciones_Internalname, sPrefix+"DVPANEL_ACCIONESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_ACCIONESContainer"+"Acciones"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divAcciones_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 49, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111lh1_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\CierreRecetasTinte_Anyadidas_1.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 49, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\CierreRecetasTinte_Anyadidas_1.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol49( ) ;
      }
      if ( wbEnd == 49 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_49 = (int)(nGXsfl_49_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV48GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV49GridPageCount);
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV46DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV46DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV30ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, sPrefix+"GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 49 )
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

   public void start1LH2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Relacion de Productos Quimicos", ""), (short)(0)) ;
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
            strup1LH0( ) ;
         }
      }
   }

   public void ws1LH2( )
   {
      start1LH2( ) ;
      evt1LH2( ) ;
   }

   public void evt1LH2( )
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
                              strup1LH0( ) ;
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
                              strup1LH0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121LH2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1LH0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131LH2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1LH0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141LH2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1LH0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151LH2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1LH0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e161LH2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1LH0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoCerrar' */
                                 e171LH2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1LH0( ) ;
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
                              strup1LH0( ) ;
                           }
                           nGXsfl_49_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_492( ) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1273RecLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A811RecLin = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A872RecPrdNum = httpContext.cgiGet( edtRecPrdNum_Internalname) ;
                           A875RecPrdDsc = httpContext.cgiGet( edtRecPrdDsc_Internalname) ;
                           A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n490ForPrdUMe = false ;
                           A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
                           n488ForPrdDsc = false ;
                           A686PrdCant = localUtil.ctond( httpContext.cgiGet( edtPrdCant_Internalname)) ;
                           A683PrdCanFin = localUtil.ctond( httpContext.cgiGet( edtPrdCanFin_Internalname)) ;
                           AV64Acumulada = localUtil.ctond( httpContext.cgiGet( edtavAcumulada_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavAcumulada_Internalname, GXutil.ltrimstr( AV64Acumulada, 11, 3));
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vACUMULADA"+"_"+sGXsfl_49_idx, getSecureSignedToken( sPrefix+sGXsfl_49_idx, localUtil.format( AV64Acumulada, "ZZZZZZ9.999")));
                           AV65Porcen = localUtil.ctond( httpContext.cgiGet( edtavPorcen_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPorcen_Internalname, GXutil.ltrimstr( AV65Porcen, 6, 2));
                           AV66PorTot = (short)(localUtil.ctol( httpContext.cgiGet( edtavPortot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPortot_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66PorTot), 4, 0));
                           AV68Anyadida = localUtil.ctond( httpContext.cgiGet( edtavAnyadida_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavAnyadida_Internalname, GXutil.ltrimstr( AV68Anyadida, 11, 3));
                           AV67Porc = localUtil.ctond( httpContext.cgiGet( edtavPorc_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPorc_Internalname, GXutil.ltrimstr( AV67Porc, 6, 2));
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
                                       e181LH2 ();
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
                                       e191LH2 ();
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
                                       e201LH2 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV27FilterFullText) != 0 )
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
                                    strup1LH0( ) ;
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

   public void we1LH2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1LH2( ) ;
         }
      }
   }

   public void pa1LH2( )
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
      subsflControlProps_492( ) ;
      while ( nGXsfl_49_idx <= nRC_GXsfl_49 )
      {
         sendrow_492( ) ;
         nGXsfl_49_idx = ((subGrid_Islastpage==1)&&(nGXsfl_49_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_49_idx+1) ;
         sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_492( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV27FilterFullText ,
                                 String AV5EmprCod ,
                                 int AV6BarCod ,
                                 byte AV7BarCodReo ,
                                 String AV8BarCodPar ,
                                 short AV9RecLinMaq ,
                                 byte AV35ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV30ColumnsSelector ,
                                 byte AV44TFRecLinPro ,
                                 byte AV45TFRecLinPro_To ,
                                 short AV50TFRecLin ,
                                 short AV51TFRecLin_To ,
                                 String AV52TFRecPrdNum ,
                                 String AV53TFRecPrdNum_Sel ,
                                 String AV54TFRecPrdDsc ,
                                 String AV55TFRecPrdDsc_Sel ,
                                 byte AV56TFForPrdUMe ,
                                 byte AV57TFForPrdUMe_To ,
                                 String AV58TFForPrdDsc ,
                                 String AV59TFForPrdDsc_Sel ,
                                 java.math.BigDecimal AV60TFPrdCant ,
                                 java.math.BigDecimal AV61TFPrdCant_To ,
                                 java.math.BigDecimal AV62TFPrdCanFin ,
                                 java.math.BigDecimal AV63TFPrdCanFin_To ,
                                 String AV92Pgmname ,
                                 short AV24OrderedBy ,
                                 boolean AV25OrderedDsc ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e191LH2 ();
      GRID_nCurrentRecord = 0 ;
      rf1LH2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vACUMULADA", getSecureSignedToken( sPrefix, localUtil.format( AV64Acumulada, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vACUMULADA", GXutil.ltrim( localUtil.ntoc( AV64Acumulada, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PRDCANT", getSecureSignedToken( sPrefix, localUtil.format( A686PrdCant, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDCANT", GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), ".", "")));
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
      rf1LH2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV92Pgmname = "FormulacionTinte.CierreRecetasTinte_Anyadidas_1" ;
      Gx_err = (short)(0) ;
      edtavAcumulada_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAcumulada_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAcumulada_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavPorc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPorc_Enabled), 5, 0), !bGXsfl_49_Refreshing);
   }

   public void rf1LH2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(49) ;
      /* Execute user event: Refresh */
      e191LH2 ();
      nGXsfl_49_idx = 1 ;
      sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_492( ) ;
      bGXsfl_49_Refreshing = true ;
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
         subsflControlProps_492( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext ,
                                              Byte.valueOf(AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro) ,
                                              Byte.valueOf(AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to) ,
                                              Short.valueOf(AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin) ,
                                              Short.valueOf(AV79Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to) ,
                                              AV81Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel ,
                                              AV80Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum ,
                                              AV83Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel ,
                                              AV82Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc ,
                                              Byte.valueOf(AV84Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume) ,
                                              Byte.valueOf(AV85Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to) ,
                                              AV87Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel ,
                                              AV86Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc ,
                                              AV88Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant ,
                                              AV89Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to ,
                                              AV90Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin ,
                                              AV91Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to ,
                                              Byte.valueOf(A1273RecLinPro) ,
                                              Short.valueOf(A811RecLin) ,
                                              A872RecPrdNum ,
                                              A875RecPrdDsc ,
                                              Byte.valueOf(A490ForPrdUMe) ,
                                              A488ForPrdDsc ,
                                              A686PrdCant ,
                                              A683PrdCanFin ,
                                              Short.valueOf(AV24OrderedBy) ,
                                              Boolean.valueOf(AV25OrderedDsc) ,
                                              AV5EmprCod ,
                                              Integer.valueOf(AV6BarCod) ,
                                              Byte.valueOf(AV7BarCodReo) ,
                                              AV8BarCodPar ,
                                              Short.valueOf(AV9RecLinMaq) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              Short.valueOf(A2804RecLinMaq) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT
                                              }
         });
         lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
         lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
         lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
         lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
         lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
         lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
         lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
         lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
         lV80Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV80Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum), 6, "%") ;
         lV82Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV82Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc), 26, "%") ;
         lV86Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc = GXutil.padr( GXutil.rtrim( AV86Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc), 5, "%") ;
         /* Using cursor H01LH2 */
         pr_default.execute(0, new Object[] {AV5EmprCod, Integer.valueOf(AV6BarCod), Byte.valueOf(AV7BarCodReo), AV8BarCodPar, Short.valueOf(AV9RecLinMaq), lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, Byte.valueOf(AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro), Byte.valueOf(AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to), Short.valueOf(AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin), Short.valueOf(AV79Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to), lV80Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum, AV81Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel, lV82Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc, AV83Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel, Byte.valueOf(AV84Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume), Byte.valueOf(AV85Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to), lV86Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc, AV87Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel, AV88Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant, AV89Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to, AV90Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin, AV91Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_49_idx = 1 ;
         sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_492( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H01LH2_A396EmprCod[0] ;
            A1797PrdCanAny = H01LH2_A1797PrdCanAny[0] ;
            A683PrdCanFin = H01LH2_A683PrdCanFin[0] ;
            A686PrdCant = H01LH2_A686PrdCant[0] ;
            A488ForPrdDsc = H01LH2_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H01LH2_n488ForPrdDsc[0] ;
            A490ForPrdUMe = H01LH2_A490ForPrdUMe[0] ;
            n490ForPrdUMe = H01LH2_n490ForPrdUMe[0] ;
            A875RecPrdDsc = H01LH2_A875RecPrdDsc[0] ;
            A872RecPrdNum = H01LH2_A872RecPrdNum[0] ;
            A811RecLin = H01LH2_A811RecLin[0] ;
            A1273RecLinPro = H01LH2_A1273RecLinPro[0] ;
            A2804RecLinMaq = H01LH2_A2804RecLinMaq[0] ;
            A130BarCodPar = H01LH2_A130BarCodPar[0] ;
            A132BarCodReo = H01LH2_A132BarCodReo[0] ;
            A129BarCod = H01LH2_A129BarCod[0] ;
            A488ForPrdDsc = H01LH2_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H01LH2_n488ForPrdDsc[0] ;
            e201LH2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(49) ;
         wb1LH0( ) ;
      }
      bGXsfl_49_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1LH2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV92Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV92Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vACUMULADA"+"_"+sGXsfl_49_idx, getSecureSignedToken( sPrefix+sGXsfl_49_idx, localUtil.format( AV64Acumulada, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PRDCANT"+"_"+sGXsfl_49_idx, getSecureSignedToken( sPrefix+sGXsfl_49_idx, localUtil.format( A686PrdCant, "ZZZZZZ9.999")));
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
      AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = AV27FilterFullText ;
      AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro = AV44TFRecLinPro ;
      AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to = AV45TFRecLinPro_To ;
      AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin = AV50TFRecLin ;
      AV79Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to = AV51TFRecLin_To ;
      AV80Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum = AV52TFRecPrdNum ;
      AV81Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel = AV53TFRecPrdNum_Sel ;
      AV82Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc = AV54TFRecPrdDsc ;
      AV83Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel = AV55TFRecPrdDsc_Sel ;
      AV84Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume = AV56TFForPrdUMe ;
      AV85Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to = AV57TFForPrdUMe_To ;
      AV86Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc = AV58TFForPrdDsc ;
      AV87Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel = AV59TFForPrdDsc_Sel ;
      AV88Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant = AV60TFPrdCant ;
      AV89Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to = AV61TFPrdCant_To ;
      AV90Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin = AV62TFPrdCanFin ;
      AV91Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to = AV63TFPrdCanFin_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext ,
                                           Byte.valueOf(AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro) ,
                                           Byte.valueOf(AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to) ,
                                           Short.valueOf(AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin) ,
                                           Short.valueOf(AV79Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to) ,
                                           AV81Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel ,
                                           AV80Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum ,
                                           AV83Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel ,
                                           AV82Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc ,
                                           Byte.valueOf(AV84Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume) ,
                                           Byte.valueOf(AV85Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to) ,
                                           AV87Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel ,
                                           AV86Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc ,
                                           AV88Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant ,
                                           AV89Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to ,
                                           AV90Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin ,
                                           AV91Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A686PrdCant ,
                                           A683PrdCanFin ,
                                           Short.valueOf(AV24OrderedBy) ,
                                           Boolean.valueOf(AV25OrderedDsc) ,
                                           AV5EmprCod ,
                                           Integer.valueOf(AV6BarCod) ,
                                           Byte.valueOf(AV7BarCodReo) ,
                                           AV8BarCodPar ,
                                           Short.valueOf(AV9RecLinMaq) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV80Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV80Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum), 6, "%") ;
      lV82Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV82Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc), 26, "%") ;
      lV86Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc = GXutil.padr( GXutil.rtrim( AV86Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc), 5, "%") ;
      /* Using cursor H01LH3 */
      pr_default.execute(1, new Object[] {AV5EmprCod, Integer.valueOf(AV6BarCod), Byte.valueOf(AV7BarCodReo), AV8BarCodPar, Short.valueOf(AV9RecLinMaq), lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, Byte.valueOf(AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro), Byte.valueOf(AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to), Short.valueOf(AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin), Short.valueOf(AV79Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to), lV80Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum, AV81Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel, lV82Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc, AV83Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel, Byte.valueOf(AV84Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume), Byte.valueOf(AV85Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to), lV86Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc, AV87Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel, AV88Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant, AV89Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to, AV90Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin, AV91Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to});
      GRID_nRecordCount = H01LH3_AGRID_nRecordCount[0] ;
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
      AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = AV27FilterFullText ;
      AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro = AV44TFRecLinPro ;
      AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to = AV45TFRecLinPro_To ;
      AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin = AV50TFRecLin ;
      AV79Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to = AV51TFRecLin_To ;
      AV80Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum = AV52TFRecPrdNum ;
      AV81Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel = AV53TFRecPrdNum_Sel ;
      AV82Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc = AV54TFRecPrdDsc ;
      AV83Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel = AV55TFRecPrdDsc_Sel ;
      AV84Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume = AV56TFForPrdUMe ;
      AV85Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to = AV57TFForPrdUMe_To ;
      AV86Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc = AV58TFForPrdDsc ;
      AV87Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel = AV59TFForPrdDsc_Sel ;
      AV88Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant = AV60TFPrdCant ;
      AV89Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to = AV61TFPrdCant_To ;
      AV90Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin = AV62TFPrdCanFin ;
      AV91Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to = AV63TFPrdCanFin_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV27FilterFullText, AV5EmprCod, AV6BarCod, AV7BarCodReo, AV8BarCodPar, AV9RecLinMaq, AV35ManageFiltersExecutionStep, AV30ColumnsSelector, AV44TFRecLinPro, AV45TFRecLinPro_To, AV50TFRecLin, AV51TFRecLin_To, AV52TFRecPrdNum, AV53TFRecPrdNum_Sel, AV54TFRecPrdDsc, AV55TFRecPrdDsc_Sel, AV56TFForPrdUMe, AV57TFForPrdUMe_To, AV58TFForPrdDsc, AV59TFForPrdDsc_Sel, AV60TFPrdCant, AV61TFPrdCant_To, AV62TFPrdCanFin, AV63TFPrdCanFin_To, AV92Pgmname, AV24OrderedBy, AV25OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = AV27FilterFullText ;
      AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro = AV44TFRecLinPro ;
      AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to = AV45TFRecLinPro_To ;
      AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin = AV50TFRecLin ;
      AV79Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to = AV51TFRecLin_To ;
      AV80Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum = AV52TFRecPrdNum ;
      AV81Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel = AV53TFRecPrdNum_Sel ;
      AV82Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc = AV54TFRecPrdDsc ;
      AV83Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel = AV55TFRecPrdDsc_Sel ;
      AV84Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume = AV56TFForPrdUMe ;
      AV85Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to = AV57TFForPrdUMe_To ;
      AV86Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc = AV58TFForPrdDsc ;
      AV87Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel = AV59TFForPrdDsc_Sel ;
      AV88Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant = AV60TFPrdCant ;
      AV89Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to = AV61TFPrdCant_To ;
      AV90Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin = AV62TFPrdCanFin ;
      AV91Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to = AV63TFPrdCanFin_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27FilterFullText, AV5EmprCod, AV6BarCod, AV7BarCodReo, AV8BarCodPar, AV9RecLinMaq, AV35ManageFiltersExecutionStep, AV30ColumnsSelector, AV44TFRecLinPro, AV45TFRecLinPro_To, AV50TFRecLin, AV51TFRecLin_To, AV52TFRecPrdNum, AV53TFRecPrdNum_Sel, AV54TFRecPrdDsc, AV55TFRecPrdDsc_Sel, AV56TFForPrdUMe, AV57TFForPrdUMe_To, AV58TFForPrdDsc, AV59TFForPrdDsc_Sel, AV60TFPrdCant, AV61TFPrdCant_To, AV62TFPrdCanFin, AV63TFPrdCanFin_To, AV92Pgmname, AV24OrderedBy, AV25OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = AV27FilterFullText ;
      AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro = AV44TFRecLinPro ;
      AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to = AV45TFRecLinPro_To ;
      AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin = AV50TFRecLin ;
      AV79Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to = AV51TFRecLin_To ;
      AV80Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum = AV52TFRecPrdNum ;
      AV81Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel = AV53TFRecPrdNum_Sel ;
      AV82Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc = AV54TFRecPrdDsc ;
      AV83Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel = AV55TFRecPrdDsc_Sel ;
      AV84Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume = AV56TFForPrdUMe ;
      AV85Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to = AV57TFForPrdUMe_To ;
      AV86Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc = AV58TFForPrdDsc ;
      AV87Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel = AV59TFForPrdDsc_Sel ;
      AV88Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant = AV60TFPrdCant ;
      AV89Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to = AV61TFPrdCant_To ;
      AV90Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin = AV62TFPrdCanFin ;
      AV91Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to = AV63TFPrdCanFin_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27FilterFullText, AV5EmprCod, AV6BarCod, AV7BarCodReo, AV8BarCodPar, AV9RecLinMaq, AV35ManageFiltersExecutionStep, AV30ColumnsSelector, AV44TFRecLinPro, AV45TFRecLinPro_To, AV50TFRecLin, AV51TFRecLin_To, AV52TFRecPrdNum, AV53TFRecPrdNum_Sel, AV54TFRecPrdDsc, AV55TFRecPrdDsc_Sel, AV56TFForPrdUMe, AV57TFForPrdUMe_To, AV58TFForPrdDsc, AV59TFForPrdDsc_Sel, AV60TFPrdCant, AV61TFPrdCant_To, AV62TFPrdCanFin, AV63TFPrdCanFin_To, AV92Pgmname, AV24OrderedBy, AV25OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = AV27FilterFullText ;
      AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro = AV44TFRecLinPro ;
      AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to = AV45TFRecLinPro_To ;
      AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin = AV50TFRecLin ;
      AV79Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to = AV51TFRecLin_To ;
      AV80Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum = AV52TFRecPrdNum ;
      AV81Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel = AV53TFRecPrdNum_Sel ;
      AV82Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc = AV54TFRecPrdDsc ;
      AV83Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel = AV55TFRecPrdDsc_Sel ;
      AV84Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume = AV56TFForPrdUMe ;
      AV85Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to = AV57TFForPrdUMe_To ;
      AV86Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc = AV58TFForPrdDsc ;
      AV87Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel = AV59TFForPrdDsc_Sel ;
      AV88Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant = AV60TFPrdCant ;
      AV89Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to = AV61TFPrdCant_To ;
      AV90Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin = AV62TFPrdCanFin ;
      AV91Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to = AV63TFPrdCanFin_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27FilterFullText, AV5EmprCod, AV6BarCod, AV7BarCodReo, AV8BarCodPar, AV9RecLinMaq, AV35ManageFiltersExecutionStep, AV30ColumnsSelector, AV44TFRecLinPro, AV45TFRecLinPro_To, AV50TFRecLin, AV51TFRecLin_To, AV52TFRecPrdNum, AV53TFRecPrdNum_Sel, AV54TFRecPrdDsc, AV55TFRecPrdDsc_Sel, AV56TFForPrdUMe, AV57TFForPrdUMe_To, AV58TFForPrdDsc, AV59TFForPrdDsc_Sel, AV60TFPrdCant, AV61TFPrdCant_To, AV62TFPrdCanFin, AV63TFPrdCanFin_To, AV92Pgmname, AV24OrderedBy, AV25OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = AV27FilterFullText ;
      AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro = AV44TFRecLinPro ;
      AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to = AV45TFRecLinPro_To ;
      AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin = AV50TFRecLin ;
      AV79Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to = AV51TFRecLin_To ;
      AV80Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum = AV52TFRecPrdNum ;
      AV81Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel = AV53TFRecPrdNum_Sel ;
      AV82Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc = AV54TFRecPrdDsc ;
      AV83Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel = AV55TFRecPrdDsc_Sel ;
      AV84Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume = AV56TFForPrdUMe ;
      AV85Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to = AV57TFForPrdUMe_To ;
      AV86Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc = AV58TFForPrdDsc ;
      AV87Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel = AV59TFForPrdDsc_Sel ;
      AV88Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant = AV60TFPrdCant ;
      AV89Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to = AV61TFPrdCant_To ;
      AV90Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin = AV62TFPrdCanFin ;
      AV91Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to = AV63TFPrdCanFin_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27FilterFullText, AV5EmprCod, AV6BarCod, AV7BarCodReo, AV8BarCodPar, AV9RecLinMaq, AV35ManageFiltersExecutionStep, AV30ColumnsSelector, AV44TFRecLinPro, AV45TFRecLinPro_To, AV50TFRecLin, AV51TFRecLin_To, AV52TFRecPrdNum, AV53TFRecPrdNum_Sel, AV54TFRecPrdDsc, AV55TFRecPrdDsc_Sel, AV56TFForPrdUMe, AV57TFForPrdUMe_To, AV58TFForPrdDsc, AV59TFForPrdDsc_Sel, AV60TFPrdCant, AV61TFPrdCant_To, AV62TFPrdCanFin, AV63TFPrdCanFin_To, AV92Pgmname, AV24OrderedBy, AV25OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV92Pgmname = "FormulacionTinte.CierreRecetasTinte_Anyadidas_1" ;
      Gx_err = (short)(0) ;
      edtavAcumulada_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAcumulada_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAcumulada_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavPorc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPorc_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup1LH0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e181LH2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV33ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV46DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV30ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_49 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_49"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV48GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV49GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV5EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV5EmprCod") ;
         wcpOAV6BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV7BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV8BarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV8BarCodPar") ;
         wcpOAV9RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9RecLinMaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV10FecCieTin = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV10FecCieTin"), 0) ;
         wcpOAV11consumos = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV11consumos"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV12Maqcod = httpContext.cgiGet( sPrefix+"wcpOAV12Maqcod") ;
         wcpOAV13Cc_almcod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV13Cc_almcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV14fechaCierre = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV14fechaCierre"), 0) ;
         wcpOAV15flagM = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV15flagM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV16recfec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV16recfec"), 0) ;
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
         Dvpanel_acciones_Width = httpContext.cgiGet( sPrefix+"DVPANEL_ACCIONES_Width") ;
         Dvpanel_acciones_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_ACCIONES_Autowidth")) ;
         Dvpanel_acciones_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_ACCIONES_Autoheight")) ;
         Dvpanel_acciones_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_ACCIONES_Cls") ;
         Dvpanel_acciones_Title = httpContext.cgiGet( sPrefix+"DVPANEL_ACCIONES_Title") ;
         Dvpanel_acciones_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_ACCIONES_Collapsible")) ;
         Dvpanel_acciones_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_ACCIONES_Collapsed")) ;
         Dvpanel_acciones_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_ACCIONES_Showcollapseicon")) ;
         Dvpanel_acciones_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_ACCIONES_Iconposition") ;
         Dvpanel_acciones_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_ACCIONES_Autoscroll")) ;
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
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Fixedcolumns") ;
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
         AV27FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27FilterFullText", AV27FilterFullText);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV27FilterFullText) != 0 )
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
      e181LH2 ();
      if (returnInSub) return;
   }

   public void e181LH2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV72Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      cierrerecetastinte_anyadidas_1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV72Station = GXt_char1 ;
      GXv_char2[0] = AV5EmprCod ;
      GXv_char3[0] = AV73Emprnom ;
      GXv_char4[0] = AV74Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV72Station, GXv_char2, GXv_char3, GXv_char4) ;
      cierrerecetastinte_anyadidas_1_impl.this.AV5EmprCod = GXv_char2[0] ;
      cierrerecetastinte_anyadidas_1_impl.this.AV73Emprnom = GXv_char3[0] ;
      cierrerecetastinte_anyadidas_1_impl.this.AV74Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, sPrefix, false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
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
      if ( AV24OrderedBy < 1 )
      {
         AV24OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV46DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV46DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e191LH2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV18WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV18WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV35ManageFiltersExecutionStep == 1 )
      {
         AV35ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35ManageFiltersExecutionStep", GXutil.str( AV35ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV35ManageFiltersExecutionStep == 2 )
      {
         AV35ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35ManageFiltersExecutionStep", GXutil.str( AV35ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV32Session.getValue("FormulacionTinte.CierreRecetasTinte_Anyadidas_1ColumnsSelector"), "") != 0 )
      {
         AV28ColumnsSelectorXML = AV32Session.getValue("FormulacionTinte.CierreRecetasTinte_Anyadidas_1ColumnsSelector") ;
         AV30ColumnsSelector.fromxml(AV28ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtRecLinPro_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRecLinPro_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinPro_Visible), 5, 0), !bGXsfl_49_Refreshing);
      edtRecLin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRecLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLin_Visible), 5, 0), !bGXsfl_49_Refreshing);
      edtRecPrdNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRecPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdNum_Visible), 5, 0), !bGXsfl_49_Refreshing);
      edtRecPrdDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRecPrdDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdDsc_Visible), 5, 0), !bGXsfl_49_Refreshing);
      edtForPrdUMe_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForPrdUMe_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Visible), 5, 0), !bGXsfl_49_Refreshing);
      edtForPrdDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForPrdDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Visible), 5, 0), !bGXsfl_49_Refreshing);
      edtPrdCant_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdCant_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCant_Visible), 5, 0), !bGXsfl_49_Refreshing);
      edtPrdCanFin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdCanFin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanFin_Visible), 5, 0), !bGXsfl_49_Refreshing);
      edtavAcumulada_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAcumulada_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAcumulada_Visible), 5, 0), !bGXsfl_49_Refreshing);
      edtavPorcen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPorcen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPorcen_Visible), 5, 0), !bGXsfl_49_Refreshing);
      edtavPortot_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPortot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPortot_Visible), 5, 0), !bGXsfl_49_Refreshing);
      edtavAnyadida_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnyadida_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnyadida_Visible), 5, 0), !bGXsfl_49_Refreshing);
      edtavPorc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPorc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPorc_Visible), 5, 0), !bGXsfl_49_Refreshing);
      AV48GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridCurrentPage), 10, 0));
      AV49GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49GridPageCount), 10, 0));
      AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = AV27FilterFullText ;
      AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro = AV44TFRecLinPro ;
      AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to = AV45TFRecLinPro_To ;
      AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin = AV50TFRecLin ;
      AV79Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to = AV51TFRecLin_To ;
      AV80Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum = AV52TFRecPrdNum ;
      AV81Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel = AV53TFRecPrdNum_Sel ;
      AV82Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc = AV54TFRecPrdDsc ;
      AV83Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel = AV55TFRecPrdDsc_Sel ;
      AV84Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume = AV56TFForPrdUMe ;
      AV85Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to = AV57TFForPrdUMe_To ;
      AV86Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc = AV58TFForPrdDsc ;
      AV87Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel = AV59TFForPrdDsc_Sel ;
      AV88Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant = AV60TFPrdCant ;
      AV89Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to = AV61TFPrdCant_To ;
      AV90Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin = AV62TFPrdCanFin ;
      AV91Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to = AV63TFPrdCanFin_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV30ColumnsSelector", AV30ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV33ManageFiltersData", AV33ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22GridState", AV22GridState);
   }

   public void e131LH2( )
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
         AV47PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV47PageToGo) ;
      }
   }

   public void e141LH2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e151LH2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV24OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24OrderedBy), 4, 0));
         AV25OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25OrderedDsc", AV25OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecLinPro") == 0 )
         {
            AV44TFRecLinPro = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFRecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFRecLinPro), 2, 0));
            AV45TFRecLinPro_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFRecLinPro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFRecLinPro_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecLin") == 0 )
         {
            AV50TFRecLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFRecLin), 4, 0));
            AV51TFRecLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFRecLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFRecLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecPrdNum") == 0 )
         {
            AV52TFRecPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFRecPrdNum", AV52TFRecPrdNum);
            AV53TFRecPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFRecPrdNum_Sel", AV53TFRecPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecPrdDsc") == 0 )
         {
            AV54TFRecPrdDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFRecPrdDsc", AV54TFRecPrdDsc);
            AV55TFRecPrdDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFRecPrdDsc_Sel", AV55TFRecPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForPrdUMe") == 0 )
         {
            AV56TFForPrdUMe = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFForPrdUMe", GXutil.str( AV56TFForPrdUMe, 1, 0));
            AV57TFForPrdUMe_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFForPrdUMe_To", GXutil.str( AV57TFForPrdUMe_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForPrdDsc") == 0 )
         {
            AV58TFForPrdDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFForPrdDsc", AV58TFForPrdDsc);
            AV59TFForPrdDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFForPrdDsc_Sel", AV59TFForPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdCant") == 0 )
         {
            AV60TFPrdCant = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFPrdCant", GXutil.ltrimstr( AV60TFPrdCant, 11, 3));
            AV61TFPrdCant_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFPrdCant_To", GXutil.ltrimstr( AV61TFPrdCant_To, 11, 3));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdCanFin") == 0 )
         {
            AV62TFPrdCanFin = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFPrdCanFin", GXutil.ltrimstr( AV62TFPrdCanFin, 11, 3));
            AV63TFPrdCanFin_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFPrdCanFin_To", GXutil.ltrimstr( AV63TFPrdCanFin_To, 11, 3));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e201LH2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV64Acumulada = A686PrdCant.add(A1797PrdCanAny) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavAcumulada_Internalname, GXutil.ltrimstr( AV64Acumulada, 11, 3));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vACUMULADA"+"_"+sGXsfl_49_idx, getSecureSignedToken( sPrefix+sGXsfl_49_idx, localUtil.format( AV64Acumulada, "ZZZZZZ9.999")));
      edtavPorcen_Class = "Attribute" ;
      edtavPorcen_Enabled = 1 ;
      AV65Porcen = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPorcen_Internalname, GXutil.ltrimstr( AV65Porcen, 6, 2));
      edtavPorcen_Backcolor = GXutil.getColor( 0, 255, 0) ;
      edtavPorcen_Forecolor = GXutil.getColor( 0, 0, 0) ;
      edtavPortot_Class = "Attribute" ;
      edtavPortot_Enabled = 1 ;
      AV66PorTot = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPortot_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66PorTot), 4, 0));
      edtavPortot_Backcolor = GXutil.getColor( 0, 255, 0) ;
      edtavPortot_Forecolor = GXutil.getColor( 0, 0, 0) ;
      edtavAnyadida_Class = "Attribute" ;
      edtavAnyadida_Enabled = 1 ;
      AV68Anyadida = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavAnyadida_Internalname, GXutil.ltrimstr( AV68Anyadida, 11, 3));
      edtavAnyadida_Backcolor = GXutil.getColor( 0, 255, 0) ;
      edtavAnyadida_Forecolor = GXutil.getColor( 0, 0, 0) ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(49) ;
      }
      sendrow_492( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_49_Refreshing )
      {
         httpContext.doAjaxLoad(49, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e161LH2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV28ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV30ColumnsSelector.fromJSonString(AV28ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.CierreRecetasTinte_Anyadidas_1ColumnsSelector", ((GXutil.strcmp("", AV28ColumnsSelectorXML)==0) ? "" : AV30ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV30ColumnsSelector", AV30ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV33ManageFiltersData", AV33ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22GridState", AV22GridState);
   }

   public void e121LH2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.CierreRecetasTinte_Anyadidas_1Filters")),GXutil.URLEncode(GXutil.rtrim(AV92Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV35ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35ManageFiltersExecutionStep", GXutil.str( AV35ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.CierreRecetasTinte_Anyadidas_1Filters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV35ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35ManageFiltersExecutionStep", GXutil.str( AV35ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV34ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "FormulacionTinte.CierreRecetasTinte_Anyadidas_1Filters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         cierrerecetastinte_anyadidas_1_impl.this.GXt_char1 = GXv_char4[0] ;
         AV34ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV34ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV92Pgmname+"GridState", AV34ManageFiltersXml) ;
            AV22GridState.fromxml(AV34ManageFiltersXml, null, null);
            AV24OrderedBy = AV22GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24OrderedBy), 4, 0));
            AV25OrderedDsc = AV22GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25OrderedDsc", AV25OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22GridState", AV22GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV30ColumnsSelector", AV30ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV33ManageFiltersData", AV33ManageFiltersData);
   }

   public void e171LH2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV5EmprCod,Integer.valueOf(AV6BarCod),Byte.valueOf(AV7BarCodReo),AV8BarCodPar,Short.valueOf(AV9RecLinMaq),localUtil.format( AV10FecCieTin, "99/99/99"),Short.valueOf(AV11consumos),AV12Maqcod,Byte.valueOf(AV13Cc_almcod),localUtil.format( AV14fechaCierre, "99/99/99"),Short.valueOf(AV15flagM),localUtil.format( AV16recfec, "99/99/99")});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV5EmprCod","AV6BarCod","AV7BarCodReo","AV8BarCodPar","AV9RecLinMaq","AV10FecCieTin","AV11consumos","AV12Maqcod","AV13Cc_almcod","AV14fechaCierre","AV15flagM","AV16recfec"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV24OrderedBy, 4, 0))+":"+(AV25OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV30ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "RecLinPro", "", "#", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "RecLin", "", "##", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "RecPrdNum", "", "Codigo", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "RecPrdDsc", "", "Producto", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ForPrdUMe", "", "Und", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ForPrdDsc", "", "", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdCant", "Cantidad", "Inicial", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdCanFin", "Cantidad", "Teorica", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&Acumulada", "Cantidad", "Acumulada", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&Porcen", "%", "Entrada", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&PorTot", "%", "Acumulada", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&Anyadida", "Cantidad", "Añadida", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&Porc", "", "%", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV29UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.CierreRecetasTinte_Anyadidas_1ColumnsSelector", GXv_char4) ;
      cierrerecetastinte_anyadidas_1_impl.this.GXt_char1 = GXv_char4[0] ;
      AV29UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV29UserCustomValue)==0) ) )
      {
         AV31ColumnsSelectorAux.fromxml(AV29UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV31ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV30ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV31ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV30ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV33ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "FormulacionTinte.CierreRecetasTinte_Anyadidas_1Filters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV33ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV27FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27FilterFullText", AV27FilterFullText);
      AV44TFRecLinPro = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFRecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFRecLinPro), 2, 0));
      AV45TFRecLinPro_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFRecLinPro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFRecLinPro_To), 2, 0));
      AV50TFRecLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFRecLin), 4, 0));
      AV51TFRecLin_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFRecLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFRecLin_To), 4, 0));
      AV52TFRecPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFRecPrdNum", AV52TFRecPrdNum);
      AV53TFRecPrdNum_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFRecPrdNum_Sel", AV53TFRecPrdNum_Sel);
      AV54TFRecPrdDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFRecPrdDsc", AV54TFRecPrdDsc);
      AV55TFRecPrdDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFRecPrdDsc_Sel", AV55TFRecPrdDsc_Sel);
      AV56TFForPrdUMe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFForPrdUMe", GXutil.str( AV56TFForPrdUMe, 1, 0));
      AV57TFForPrdUMe_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFForPrdUMe_To", GXutil.str( AV57TFForPrdUMe_To, 1, 0));
      AV58TFForPrdDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFForPrdDsc", AV58TFForPrdDsc);
      AV59TFForPrdDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFForPrdDsc_Sel", AV59TFForPrdDsc_Sel);
      AV60TFPrdCant = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFPrdCant", GXutil.ltrimstr( AV60TFPrdCant, 11, 3));
      AV61TFPrdCant_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFPrdCant_To", GXutil.ltrimstr( AV61TFPrdCant_To, 11, 3));
      AV62TFPrdCanFin = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFPrdCanFin", GXutil.ltrimstr( AV62TFPrdCanFin, 11, 3));
      AV63TFPrdCanFin_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFPrdCanFin_To", GXutil.ltrimstr( AV63TFPrdCanFin_To, 11, 3));
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
      if ( GXutil.strcmp(AV32Session.getValue(AV92Pgmname+"GridState"), "") == 0 )
      {
         AV22GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV92Pgmname+"GridState"), null, null);
      }
      else
      {
         AV22GridState.fromxml(AV32Session.getValue(AV92Pgmname+"GridState"), null, null);
      }
      AV24OrderedBy = AV22GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24OrderedBy), 4, 0));
      AV25OrderedDsc = AV22GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25OrderedDsc", AV25OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV22GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV22GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV22GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV93GXV1 = 1 ;
      while ( AV93GXV1 <= AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV23GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV93GXV1));
         if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV27FilterFullText = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27FilterFullText", AV27FilterFullText);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINPRO") == 0 )
         {
            AV44TFRecLinPro = (byte)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFRecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFRecLinPro), 2, 0));
            AV45TFRecLinPro_To = (byte)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFRecLinPro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFRecLinPro_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLIN") == 0 )
         {
            AV50TFRecLin = (short)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFRecLin), 4, 0));
            AV51TFRecLin_To = (short)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFRecLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFRecLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM") == 0 )
         {
            AV52TFRecPrdNum = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFRecPrdNum", AV52TFRecPrdNum);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM_SEL") == 0 )
         {
            AV53TFRecPrdNum_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFRecPrdNum_Sel", AV53TFRecPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC") == 0 )
         {
            AV54TFRecPrdDsc = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFRecPrdDsc", AV54TFRecPrdDsc);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC_SEL") == 0 )
         {
            AV55TFRecPrdDsc_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFRecPrdDsc_Sel", AV55TFRecPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDUME") == 0 )
         {
            AV56TFForPrdUMe = (byte)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFForPrdUMe", GXutil.str( AV56TFForPrdUMe, 1, 0));
            AV57TFForPrdUMe_To = (byte)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFForPrdUMe_To", GXutil.str( AV57TFForPrdUMe_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV58TFForPrdDsc = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFForPrdDsc", AV58TFForPrdDsc);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV59TFForPrdDsc_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFForPrdDsc_Sel", AV59TFForPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANT") == 0 )
         {
            AV60TFPrdCant = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFPrdCant", GXutil.ltrimstr( AV60TFPrdCant, 11, 3));
            AV61TFPrdCant_To = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFPrdCant_To", GXutil.ltrimstr( AV61TFPrdCant_To, 11, 3));
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANFIN") == 0 )
         {
            AV62TFPrdCanFin = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFPrdCanFin", GXutil.ltrimstr( AV62TFPrdCanFin, 11, 3));
            AV63TFPrdCanFin_To = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFPrdCanFin_To", GXutil.ltrimstr( AV63TFPrdCanFin_To, 11, 3));
         }
         AV93GXV1 = (int)(AV93GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFRecPrdNum_Sel)==0), AV53TFRecPrdNum_Sel, GXv_char4) ;
      cierrerecetastinte_anyadidas_1_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFRecPrdDsc_Sel)==0), AV55TFRecPrdDsc_Sel, GXv_char3) ;
      cierrerecetastinte_anyadidas_1_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFForPrdDsc_Sel)==0), AV59TFForPrdDsc_Sel, GXv_char2) ;
      cierrerecetastinte_anyadidas_1_impl.this.GXt_char13 = GXv_char2[0] ;
      Ddo_grid_Selectedvalue_set = "||"+GXt_char1+"|"+GXt_char12+"||"+GXt_char13+"|||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFRecPrdNum)==0), AV52TFRecPrdNum, GXv_char4) ;
      cierrerecetastinte_anyadidas_1_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFRecPrdDsc)==0), AV54TFRecPrdDsc, GXv_char3) ;
      cierrerecetastinte_anyadidas_1_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFForPrdDsc)==0), AV58TFForPrdDsc, GXv_char2) ;
      cierrerecetastinte_anyadidas_1_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV44TFRecLinPro) ? "" : GXutil.str( AV44TFRecLinPro, 2, 0))+"|"+((0==AV50TFRecLin) ? "" : GXutil.str( AV50TFRecLin, 4, 0))+"|"+GXt_char13+"|"+GXt_char12+"|"+((0==AV56TFForPrdUMe) ? "" : GXutil.str( AV56TFForPrdUMe, 1, 0))+"|"+GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFPrdCant)==0) ? "" : GXutil.str( AV60TFPrdCant, 11, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFPrdCanFin)==0) ? "" : GXutil.str( AV62TFPrdCanFin, 11, 3))+"|||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV45TFRecLinPro_To) ? "" : GXutil.str( AV45TFRecLinPro_To, 2, 0))+"|"+((0==AV51TFRecLin_To) ? "" : GXutil.str( AV51TFRecLin_To, 4, 0))+"|||"+((0==AV57TFForPrdUMe_To) ? "" : GXutil.str( AV57TFForPrdUMe_To, 1, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFPrdCant_To)==0) ? "" : GXutil.str( AV61TFPrdCant_To, 11, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV63TFPrdCanFin_To)==0) ? "" : GXutil.str( AV63TFPrdCanFin_To, 11, 3))+"|||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV22GridState.fromxml(AV32Session.getValue(AV92Pgmname+"GridState"), null, null);
      AV22GridState.setgxTv_SdtWWPGridState_Orderedby( AV24OrderedBy );
      AV22GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV25OrderedDsc );
      AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState14[0] = AV22GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV27FilterFullText)==0), (short)(0), AV27FilterFullText, "") ;
      AV22GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV22GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFRECLINPRO", "", !((0==AV44TFRecLinPro)&&(0==AV45TFRecLinPro_To)), (short)(0), GXutil.trim( GXutil.str( AV44TFRecLinPro, 2, 0)), GXutil.trim( GXutil.str( AV45TFRecLinPro_To, 2, 0))) ;
      AV22GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV22GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFRECLIN", "", !((0==AV50TFRecLin)&&(0==AV51TFRecLin_To)), (short)(0), GXutil.trim( GXutil.str( AV50TFRecLin, 4, 0)), GXutil.trim( GXutil.str( AV51TFRecLin_To, 4, 0))) ;
      AV22GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV22GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFRECPRDNUM", "", !(GXutil.strcmp("", AV52TFRecPrdNum)==0), (short)(0), AV52TFRecPrdNum, "", !(GXutil.strcmp("", AV53TFRecPrdNum_Sel)==0), AV53TFRecPrdNum_Sel, "") ;
      AV22GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV22GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFRECPRDDSC", "", !(GXutil.strcmp("", AV54TFRecPrdDsc)==0), (short)(0), AV54TFRecPrdDsc, "", !(GXutil.strcmp("", AV55TFRecPrdDsc_Sel)==0), AV55TFRecPrdDsc_Sel, "") ;
      AV22GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV22GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFFORPRDUME", "", !((0==AV56TFForPrdUMe)&&(0==AV57TFForPrdUMe_To)), (short)(0), GXutil.trim( GXutil.str( AV56TFForPrdUMe, 1, 0)), GXutil.trim( GXutil.str( AV57TFForPrdUMe_To, 1, 0))) ;
      AV22GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV22GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFFORPRDDSC", "", !(GXutil.strcmp("", AV58TFForPrdDsc)==0), (short)(0), AV58TFForPrdDsc, "", !(GXutil.strcmp("", AV59TFForPrdDsc_Sel)==0), AV59TFForPrdDsc_Sel, "") ;
      AV22GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV22GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPRDCANT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFPrdCant)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFPrdCant_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV60TFPrdCant, 11, 3)), GXutil.trim( GXutil.str( AV61TFPrdCant_To, 11, 3))) ;
      AV22GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV22GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPRDCANFIN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFPrdCanFin)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV63TFPrdCanFin_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV62TFPrdCanFin, 11, 3)), GXutil.trim( GXutil.str( AV63TFPrdCanFin_To, 11, 3))) ;
      AV22GridState = GXv_SdtWWPGridState14[0] ;
      AV22GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV22GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV92Pgmname+"GridState", AV22GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV20TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV20TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV92Pgmname );
      AV20TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV20TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV19HTTPRequest.getScriptName()+"?"+AV19HTTPRequest.getQuerystring() );
      AV20TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "MantenimientoProductosReceta_TRN" );
      AV32Session.setValue("TrnContext", AV20TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_19_1LH2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV33ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_24_1LH2( true) ;
      }
      else
      {
         wb_table2_24_1LH2( false) ;
      }
      return  ;
   }

   public void wb_table2_24_1LH2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_19_1LH2e( true) ;
      }
      else
      {
         wb_table1_19_1LH2e( false) ;
      }
   }

   public void wb_table2_24_1LH2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'" + sPrefix + "',false,'" + sGXsfl_49_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV27FilterFullText, GXutil.rtrim( localUtil.format( AV27FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,28);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_FormulacionTinte\\CierreRecetasTinte_Anyadidas_1.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_24_1LH2e( true) ;
      }
      else
      {
         wb_table2_24_1LH2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      AV6BarCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
      AV7BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
      AV8BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarCodPar", AV8BarCodPar);
      AV9RecLinMaq = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9RecLinMaq), 4, 0));
      AV10FecCieTin = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10FecCieTin", localUtil.format(AV10FecCieTin, "99/99/99"));
      AV11consumos = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11consumos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11consumos), 4, 0));
      AV12Maqcod = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12Maqcod", AV12Maqcod);
      AV13Cc_almcod = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Cc_almcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Cc_almcod), 2, 0));
      AV14fechaCierre = (java.util.Date)getParm(obj,9,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14fechaCierre", localUtil.format(AV14fechaCierre, "99/99/99"));
      AV15flagM = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15flagM", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15flagM), 4, 0));
      AV16recfec = (java.util.Date)getParm(obj,11,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16recfec", localUtil.format(AV16recfec, "99/99/99"));
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
      pa1LH2( ) ;
      ws1LH2( ) ;
      we1LH2( ) ;
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
      sCtrlAV6BarCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV7BarCodReo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV8BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV9RecLinMaq = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV10FecCieTin = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV11consumos = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV12Maqcod = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV13Cc_almcod = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV14fechaCierre = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV15flagM = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV16recfec = (String)getParm(obj,11,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1LH2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "formulaciontinte\\cierrerecetastinte_anyadidas_1", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1LH2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
         AV6BarCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
         AV7BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
         AV8BarCodPar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarCodPar", AV8BarCodPar);
         AV9RecLinMaq = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9RecLinMaq), 4, 0));
         AV10FecCieTin = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10FecCieTin", localUtil.format(AV10FecCieTin, "99/99/99"));
         AV11consumos = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11consumos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11consumos), 4, 0));
         AV12Maqcod = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12Maqcod", AV12Maqcod);
         AV13Cc_almcod = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Cc_almcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Cc_almcod), 2, 0));
         AV14fechaCierre = (java.util.Date)getParm(obj,11,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14fechaCierre", localUtil.format(AV14fechaCierre, "99/99/99"));
         AV15flagM = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15flagM", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15flagM), 4, 0));
         AV16recfec = (java.util.Date)getParm(obj,13,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16recfec", localUtil.format(AV16recfec, "99/99/99"));
      }
      wcpOAV5EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV5EmprCod") ;
      wcpOAV6BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV7BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV8BarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV8BarCodPar") ;
      wcpOAV9RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9RecLinMaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV10FecCieTin = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV10FecCieTin"), 0) ;
      wcpOAV11consumos = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV11consumos"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV12Maqcod = httpContext.cgiGet( sPrefix+"wcpOAV12Maqcod") ;
      wcpOAV13Cc_almcod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV13Cc_almcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV14fechaCierre = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV14fechaCierre"), 0) ;
      wcpOAV15flagM = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV15flagM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV16recfec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV16recfec"), 0) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5EmprCod, wcpOAV5EmprCod) != 0 ) || ( AV6BarCod != wcpOAV6BarCod ) || ( AV7BarCodReo != wcpOAV7BarCodReo ) || ( GXutil.strcmp(AV8BarCodPar, wcpOAV8BarCodPar) != 0 ) || ( AV9RecLinMaq != wcpOAV9RecLinMaq ) || !( GXutil.dateCompare(GXutil.resetTime(AV10FecCieTin), GXutil.resetTime(wcpOAV10FecCieTin)) ) || ( AV11consumos != wcpOAV11consumos ) || ( GXutil.strcmp(AV12Maqcod, wcpOAV12Maqcod) != 0 ) || ( AV13Cc_almcod != wcpOAV13Cc_almcod ) || !( GXutil.dateCompare(GXutil.resetTime(AV14fechaCierre), GXutil.resetTime(wcpOAV14fechaCierre)) ) || ( AV15flagM != wcpOAV15flagM ) || !( GXutil.dateCompare(GXutil.resetTime(AV16recfec), GXutil.resetTime(wcpOAV16recfec)) ) ) )
      {
         setjustcreated();
      }
      wcpOAV5EmprCod = AV5EmprCod ;
      wcpOAV6BarCod = AV6BarCod ;
      wcpOAV7BarCodReo = AV7BarCodReo ;
      wcpOAV8BarCodPar = AV8BarCodPar ;
      wcpOAV9RecLinMaq = AV9RecLinMaq ;
      wcpOAV10FecCieTin = AV10FecCieTin ;
      wcpOAV11consumos = AV11consumos ;
      wcpOAV12Maqcod = AV12Maqcod ;
      wcpOAV13Cc_almcod = AV13Cc_almcod ;
      wcpOAV14fechaCierre = AV14fechaCierre ;
      wcpOAV15flagM = AV15flagM ;
      wcpOAV16recfec = AV16recfec ;
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
      sCtrlAV6BarCod = httpContext.cgiGet( sPrefix+"AV6BarCod_CTRL") ;
      if ( GXutil.len( sCtrlAV6BarCod) > 0 )
      {
         AV6BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV6BarCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
      }
      else
      {
         AV6BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV6BarCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV7BarCodReo = httpContext.cgiGet( sPrefix+"AV7BarCodReo_CTRL") ;
      if ( GXutil.len( sCtrlAV7BarCodReo) > 0 )
      {
         AV7BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV7BarCodReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
      }
      else
      {
         AV7BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV7BarCodReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV8BarCodPar = httpContext.cgiGet( sPrefix+"AV8BarCodPar_CTRL") ;
      if ( GXutil.len( sCtrlAV8BarCodPar) > 0 )
      {
         AV8BarCodPar = httpContext.cgiGet( sCtrlAV8BarCodPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarCodPar", AV8BarCodPar);
      }
      else
      {
         AV8BarCodPar = httpContext.cgiGet( sPrefix+"AV8BarCodPar_PARM") ;
      }
      sCtrlAV9RecLinMaq = httpContext.cgiGet( sPrefix+"AV9RecLinMaq_CTRL") ;
      if ( GXutil.len( sCtrlAV9RecLinMaq) > 0 )
      {
         AV9RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV9RecLinMaq), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9RecLinMaq), 4, 0));
      }
      else
      {
         AV9RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV9RecLinMaq_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV10FecCieTin = httpContext.cgiGet( sPrefix+"AV10FecCieTin_CTRL") ;
      if ( GXutil.len( sCtrlAV10FecCieTin) > 0 )
      {
         AV10FecCieTin = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV10FecCieTin), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10FecCieTin", localUtil.format(AV10FecCieTin, "99/99/99"));
      }
      else
      {
         AV10FecCieTin = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV10FecCieTin_PARM"), 0) ;
      }
      sCtrlAV11consumos = httpContext.cgiGet( sPrefix+"AV11consumos_CTRL") ;
      if ( GXutil.len( sCtrlAV11consumos) > 0 )
      {
         AV11consumos = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV11consumos), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11consumos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11consumos), 4, 0));
      }
      else
      {
         AV11consumos = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV11consumos_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV12Maqcod = httpContext.cgiGet( sPrefix+"AV12Maqcod_CTRL") ;
      if ( GXutil.len( sCtrlAV12Maqcod) > 0 )
      {
         AV12Maqcod = httpContext.cgiGet( sCtrlAV12Maqcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12Maqcod", AV12Maqcod);
      }
      else
      {
         AV12Maqcod = httpContext.cgiGet( sPrefix+"AV12Maqcod_PARM") ;
      }
      sCtrlAV13Cc_almcod = httpContext.cgiGet( sPrefix+"AV13Cc_almcod_CTRL") ;
      if ( GXutil.len( sCtrlAV13Cc_almcod) > 0 )
      {
         AV13Cc_almcod = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV13Cc_almcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Cc_almcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Cc_almcod), 2, 0));
      }
      else
      {
         AV13Cc_almcod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV13Cc_almcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV14fechaCierre = httpContext.cgiGet( sPrefix+"AV14fechaCierre_CTRL") ;
      if ( GXutil.len( sCtrlAV14fechaCierre) > 0 )
      {
         AV14fechaCierre = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV14fechaCierre), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14fechaCierre", localUtil.format(AV14fechaCierre, "99/99/99"));
      }
      else
      {
         AV14fechaCierre = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV14fechaCierre_PARM"), 0) ;
      }
      sCtrlAV15flagM = httpContext.cgiGet( sPrefix+"AV15flagM_CTRL") ;
      if ( GXutil.len( sCtrlAV15flagM) > 0 )
      {
         AV15flagM = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV15flagM), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15flagM", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15flagM), 4, 0));
      }
      else
      {
         AV15flagM = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV15flagM_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV16recfec = httpContext.cgiGet( sPrefix+"AV16recfec_CTRL") ;
      if ( GXutil.len( sCtrlAV16recfec) > 0 )
      {
         AV16recfec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV16recfec), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16recfec", localUtil.format(AV16recfec, "99/99/99"));
      }
      else
      {
         AV16recfec = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV16recfec_PARM"), 0) ;
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
      pa1LH2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1LH2( ) ;
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
      ws1LH2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6BarCod_PARM", GXutil.ltrim( localUtil.ntoc( AV6BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6BarCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6BarCod_CTRL", GXutil.rtrim( sCtrlAV6BarCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7BarCodReo_PARM", GXutil.ltrim( localUtil.ntoc( AV7BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7BarCodReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7BarCodReo_CTRL", GXutil.rtrim( sCtrlAV7BarCodReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8BarCodPar_PARM", GXutil.rtrim( AV8BarCodPar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8BarCodPar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8BarCodPar_CTRL", GXutil.rtrim( sCtrlAV8BarCodPar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9RecLinMaq_PARM", GXutil.ltrim( localUtil.ntoc( AV9RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9RecLinMaq)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9RecLinMaq_CTRL", GXutil.rtrim( sCtrlAV9RecLinMaq));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10FecCieTin_PARM", localUtil.dtoc( AV10FecCieTin, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10FecCieTin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10FecCieTin_CTRL", GXutil.rtrim( sCtrlAV10FecCieTin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11consumos_PARM", GXutil.ltrim( localUtil.ntoc( AV11consumos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11consumos)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11consumos_CTRL", GXutil.rtrim( sCtrlAV11consumos));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12Maqcod_PARM", GXutil.rtrim( AV12Maqcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV12Maqcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12Maqcod_CTRL", GXutil.rtrim( sCtrlAV12Maqcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13Cc_almcod_PARM", GXutil.ltrim( localUtil.ntoc( AV13Cc_almcod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV13Cc_almcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13Cc_almcod_CTRL", GXutil.rtrim( sCtrlAV13Cc_almcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14fechaCierre_PARM", localUtil.dtoc( AV14fechaCierre, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV14fechaCierre)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14fechaCierre_CTRL", GXutil.rtrim( sCtrlAV14fechaCierre));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15flagM_PARM", GXutil.ltrim( localUtil.ntoc( AV15flagM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV15flagM)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15flagM_CTRL", GXutil.rtrim( sCtrlAV15flagM));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16recfec_PARM", localUtil.dtoc( AV16recfec, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV16recfec)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16recfec_CTRL", GXutil.rtrim( sCtrlAV16recfec));
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
      we1LH2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211691798", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/cierrerecetastinte_anyadidas_1.js", "?20268211691798", false, true);
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_492( )
   {
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_49_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_49_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_49_idx ;
      edtRecLinMaq_Internalname = sPrefix+"RECLINMAQ_"+sGXsfl_49_idx ;
      edtRecLinPro_Internalname = sPrefix+"RECLINPRO_"+sGXsfl_49_idx ;
      edtRecLin_Internalname = sPrefix+"RECLIN_"+sGXsfl_49_idx ;
      edtRecPrdNum_Internalname = sPrefix+"RECPRDNUM_"+sGXsfl_49_idx ;
      edtRecPrdDsc_Internalname = sPrefix+"RECPRDDSC_"+sGXsfl_49_idx ;
      edtForPrdUMe_Internalname = sPrefix+"FORPRDUME_"+sGXsfl_49_idx ;
      edtForPrdDsc_Internalname = sPrefix+"FORPRDDSC_"+sGXsfl_49_idx ;
      edtPrdCant_Internalname = sPrefix+"PRDCANT_"+sGXsfl_49_idx ;
      edtPrdCanFin_Internalname = sPrefix+"PRDCANFIN_"+sGXsfl_49_idx ;
      edtavAcumulada_Internalname = sPrefix+"vACUMULADA_"+sGXsfl_49_idx ;
      edtavPorcen_Internalname = sPrefix+"vPORCEN_"+sGXsfl_49_idx ;
      edtavPortot_Internalname = sPrefix+"vPORTOT_"+sGXsfl_49_idx ;
      edtavAnyadida_Internalname = sPrefix+"vANYADIDA_"+sGXsfl_49_idx ;
      edtavPorc_Internalname = sPrefix+"vPORC_"+sGXsfl_49_idx ;
   }

   public void subsflControlProps_fel_492( )
   {
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_49_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_49_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_49_fel_idx ;
      edtRecLinMaq_Internalname = sPrefix+"RECLINMAQ_"+sGXsfl_49_fel_idx ;
      edtRecLinPro_Internalname = sPrefix+"RECLINPRO_"+sGXsfl_49_fel_idx ;
      edtRecLin_Internalname = sPrefix+"RECLIN_"+sGXsfl_49_fel_idx ;
      edtRecPrdNum_Internalname = sPrefix+"RECPRDNUM_"+sGXsfl_49_fel_idx ;
      edtRecPrdDsc_Internalname = sPrefix+"RECPRDDSC_"+sGXsfl_49_fel_idx ;
      edtForPrdUMe_Internalname = sPrefix+"FORPRDUME_"+sGXsfl_49_fel_idx ;
      edtForPrdDsc_Internalname = sPrefix+"FORPRDDSC_"+sGXsfl_49_fel_idx ;
      edtPrdCant_Internalname = sPrefix+"PRDCANT_"+sGXsfl_49_fel_idx ;
      edtPrdCanFin_Internalname = sPrefix+"PRDCANFIN_"+sGXsfl_49_fel_idx ;
      edtavAcumulada_Internalname = sPrefix+"vACUMULADA_"+sGXsfl_49_fel_idx ;
      edtavPorcen_Internalname = sPrefix+"vPORCEN_"+sGXsfl_49_fel_idx ;
      edtavPortot_Internalname = sPrefix+"vPORTOT_"+sGXsfl_49_fel_idx ;
      edtavAnyadida_Internalname = sPrefix+"vANYADIDA_"+sGXsfl_49_fel_idx ;
      edtavPorc_Internalname = sPrefix+"vPORC_"+sGXsfl_49_fel_idx ;
   }

   public void sendrow_492( )
   {
      subsflControlProps_492( ) ;
      wb1LH0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_49_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_49_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_49_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinMaq_Internalname,GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecLinMaq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecLinPro_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinPro_Internalname,GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1273RecLinPro), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecLinPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecLinPro_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecLin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLin_Internalname,GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A811RecLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecLin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtRecPrdNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdNum_Internalname,GXutil.rtrim( A872RecPrdNum),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecPrdNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtRecPrdDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdDsc_Internalname,GXutil.rtrim( A875RecPrdDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecPrdDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtForPrdUMe_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdUMe_Internalname,GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForPrdUMe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtForPrdUMe_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtForPrdDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdDsc_Internalname,GXutil.rtrim( A488ForPrdDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtForPrdDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdCant_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCant_Internalname,GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A686PrdCant, "ZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdCant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdCant_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdCanFin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCanFin_Internalname,GXutil.ltrim( localUtil.ntoc( A683PrdCanFin, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A683PrdCanFin, "ZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdCanFin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdCanFin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAcumulada_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAcumulada_Internalname,GXutil.ltrim( localUtil.ntoc( AV64Acumulada, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAcumulada_Enabled!=0) ? localUtil.format( AV64Acumulada, "ZZZZZZ9.999") : localUtil.format( AV64Acumulada, "ZZZZZZ9.999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAcumulada_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAcumulada_Visible),Integer.valueOf(edtavAcumulada_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPorcen_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavPorcen_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPorcen_Enabled!=0)&&(edtavPorcen_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 63,'"+sPrefix+"',false,'"+sGXsfl_49_idx+"',49)\"" : " ") ;
         ROClassString = edtavPorcen_Class ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPorcen_Internalname,GXutil.ltrim( localUtil.ntoc( AV65Porcen, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV65Porcen, "ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavPorcen_Enabled!=0)&&(edtavPorcen_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,63);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPorcen_Jsonclick,Integer.valueOf(0),edtavPorcen_Class,"color:"+WebUtils.getHTMLColor( edtavPorcen_Forecolor)+";"+((edtavPorcen_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavPorcen_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavPorcen_Visible),Integer.valueOf(edtavPorcen_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPortot_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavPortot_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPortot_Enabled!=0)&&(edtavPortot_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 64,'"+sPrefix+"',false,'"+sGXsfl_49_idx+"',49)\"" : " ") ;
         ROClassString = edtavPortot_Class ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPortot_Internalname,GXutil.ltrim( localUtil.ntoc( AV66PorTot, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV66PorTot), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavPortot_Enabled!=0)&&(edtavPortot_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPortot_Jsonclick,Integer.valueOf(0),edtavPortot_Class,"color:"+WebUtils.getHTMLColor( edtavPortot_Forecolor)+";"+((edtavPortot_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavPortot_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavPortot_Visible),Integer.valueOf(edtavPortot_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAnyadida_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavAnyadida_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavAnyadida_Enabled!=0)&&(edtavAnyadida_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 65,'"+sPrefix+"',false,'"+sGXsfl_49_idx+"',49)\"" : " ") ;
         ROClassString = edtavAnyadida_Class ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnyadida_Internalname,GXutil.ltrim( localUtil.ntoc( AV68Anyadida, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV68Anyadida, "ZZZZZZ9.999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+((edtavAnyadida_Enabled!=0)&&(edtavAnyadida_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,65);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnyadida_Jsonclick,Integer.valueOf(0),edtavAnyadida_Class,"color:"+WebUtils.getHTMLColor( edtavAnyadida_Forecolor)+";"+((edtavAnyadida_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavAnyadida_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavAnyadida_Visible),Integer.valueOf(edtavAnyadida_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPorc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPorc_Internalname,GXutil.ltrim( localUtil.ntoc( AV67Porc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPorc_Enabled!=0) ? localUtil.format( AV67Porc, "ZZ9.99") : localUtil.format( AV67Porc, "ZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPorc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPorc_Visible),Integer.valueOf(edtavPorc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1LH2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_49_idx = ((subGrid_Islastpage==1)&&(nGXsfl_49_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_49_idx+1) ;
         sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_492( ) ;
      }
      /* End function sendrow_492 */
   }

   public void startgridcontrol49( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"49\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecLinPro_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecLin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "##") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecPrdNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecPrdDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForPrdUMe_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Und", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForPrdDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdCant_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicial", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdCanFin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Teorica", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAcumulada_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Acumulada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+edtavPorcen_Class+"\" "+" style=\""+((edtavPorcen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+edtavPortot_Class+"\" "+" style=\""+((edtavPortot_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Acumulada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+edtavAnyadida_Class+"\" "+" style=\""+((edtavAnyadida_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Añadida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPorc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "%") ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecLinPro_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecLin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A872RecPrdNum));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecPrdNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A875RecPrdDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecPrdDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A488ForPrdDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdCant_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A683PrdCanFin, (byte)(11), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdCanFin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV64Acumulada, (byte)(11), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAcumulada_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAcumulada_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV65Porcen, (byte)(6), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavPorcen_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavPorcen_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Class", GXutil.rtrim( edtavPorcen_Class));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPorcen_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPorcen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV66PorTot, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavPortot_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavPortot_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Class", GXutil.rtrim( edtavPortot_Class));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPortot_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPortot_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV68Anyadida, (byte)(11), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavAnyadida_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavAnyadida_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Class", GXutil.rtrim( edtavAnyadida_Class));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnyadida_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAnyadida_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV67Porc, (byte)(6), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPorc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPorc_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      bttBtnconfirmar_Internalname = sPrefix+"BTNCONFIRMAR" ;
      bttBtncerrar_Internalname = sPrefix+"BTNCERRAR" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      divAcciones_Internalname = sPrefix+"ACCIONES" ;
      Dvpanel_acciones_Internalname = sPrefix+"DVPANEL_ACCIONES" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      edtRecLinMaq_Internalname = sPrefix+"RECLINMAQ" ;
      edtRecLinPro_Internalname = sPrefix+"RECLINPRO" ;
      edtRecLin_Internalname = sPrefix+"RECLIN" ;
      edtRecPrdNum_Internalname = sPrefix+"RECPRDNUM" ;
      edtRecPrdDsc_Internalname = sPrefix+"RECPRDDSC" ;
      edtForPrdUMe_Internalname = sPrefix+"FORPRDUME" ;
      edtForPrdDsc_Internalname = sPrefix+"FORPRDDSC" ;
      edtPrdCant_Internalname = sPrefix+"PRDCANT" ;
      edtPrdCanFin_Internalname = sPrefix+"PRDCANFIN" ;
      edtavAcumulada_Internalname = sPrefix+"vACUMULADA" ;
      edtavPorcen_Internalname = sPrefix+"vPORCEN" ;
      edtavPortot_Internalname = sPrefix+"vPORTOT" ;
      edtavAnyadida_Internalname = sPrefix+"vANYADIDA" ;
      edtavPorc_Internalname = sPrefix+"vPORC" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
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
      edtavPorc_Jsonclick = "" ;
      edtavPorc_Enabled = 0 ;
      edtavAnyadida_Jsonclick = "" ;
      edtavAnyadida_Class = "Attribute" ;
      edtavAnyadida_Forecolor = (int)(0x000000) ;
      edtavAnyadida_Enabled = 0 ;
      edtavAnyadida_Backcolor = -1 ;
      edtavPortot_Jsonclick = "" ;
      edtavPortot_Class = "Attribute" ;
      edtavPortot_Forecolor = (int)(0x000000) ;
      edtavPortot_Enabled = 0 ;
      edtavPortot_Backcolor = -1 ;
      edtavPorcen_Jsonclick = "" ;
      edtavPorcen_Class = "Attribute" ;
      edtavPorcen_Forecolor = (int)(0x000000) ;
      edtavPorcen_Enabled = 0 ;
      edtavPorcen_Backcolor = -1 ;
      edtavAcumulada_Jsonclick = "" ;
      edtavAcumulada_Enabled = 0 ;
      edtPrdCanFin_Jsonclick = "" ;
      edtPrdCant_Jsonclick = "" ;
      edtForPrdDsc_Jsonclick = "" ;
      edtForPrdUMe_Jsonclick = "" ;
      edtRecPrdDsc_Jsonclick = "" ;
      edtRecPrdNum_Jsonclick = "" ;
      edtRecLin_Jsonclick = "" ;
      edtRecLinPro_Jsonclick = "" ;
      edtRecLinMaq_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavPorc_Visible = -1 ;
      edtavAnyadida_Visible = -1 ;
      edtavPortot_Visible = -1 ;
      edtavPorcen_Visible = -1 ;
      edtavAcumulada_Visible = -1 ;
      edtPrdCanFin_Visible = -1 ;
      edtPrdCant_Visible = -1 ;
      edtForPrdDsc_Visible = -1 ;
      edtForPrdUMe_Visible = -1 ;
      edtRecPrdDsc_Visible = -1 ;
      edtRecPrdNum_Visible = -1 ;
      edtRecLin_Visible = -1 ;
      edtRecLinPro_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      Grid_empowerer_Fixedcolumns = ";;;;L;L;L;L;L;L;L;L;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;;;Cantidad;Cantidad;Cantidad;%;%;Cantidad;" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "FormulacionTinte.CierreRecetasTinte_Anyadidas_1GetFilterData" ;
      Ddo_grid_Datalisttype = "||Dynamic|Dynamic||Dynamic|||||||" ;
      Ddo_grid_Includedatalist = "||T|T||T|||||||" ;
      Ddo_grid_Filterisrange = "T|T|||T||T|T|||||" ;
      Ddo_grid_Filtertype = "Numeric|Numeric|Character|Character|Numeric|Character|Numeric|Numeric|||||" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|||||" ;
      Ddo_grid_Fixable = "||||||||T|T|T|T|T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|T|||||" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8|||||" ;
      Ddo_grid_Columnids = "4:RecLinPro|5:RecLin|6:RecPrdNum|7:RecPrdDsc|8:ForPrdUMe|9:ForPrdDsc|10:PrdCant|11:PrdCanFin|12:Acumulada|13:Porcen|14:PorTot|15:Anyadida|16:Porc" ;
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
      Dvpanel_acciones_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_acciones_Iconposition = "Right" ;
      Dvpanel_acciones_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_acciones_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_acciones_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_acciones_Title = httpContext.getMessage( "Acciones", "") ;
      Dvpanel_acciones_Cls = "PanelNoHeader" ;
      Dvpanel_acciones_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_acciones_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_acciones_Width = "100%" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV9RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'sPrefix'},{av:'AV35ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV30ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV44TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV45TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV50TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV51TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV52TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV53TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV54TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV55TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV56TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV57TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV58TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV59TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV60TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV61TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV62TFPrdCanFin',fld:'vTFPRDCANFIN',pic:'ZZZZZZ9.999'},{av:'AV63TFPrdCanFin_To',fld:'vTFPRDCANFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV24OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV25OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV35ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV30ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtRecLinPro_Visible',ctrl:'RECLINPRO',prop:'Visible'},{av:'edtRecLin_Visible',ctrl:'RECLIN',prop:'Visible'},{av:'edtRecPrdNum_Visible',ctrl:'RECPRDNUM',prop:'Visible'},{av:'edtRecPrdDsc_Visible',ctrl:'RECPRDDSC',prop:'Visible'},{av:'edtForPrdUMe_Visible',ctrl:'FORPRDUME',prop:'Visible'},{av:'edtForPrdDsc_Visible',ctrl:'FORPRDDSC',prop:'Visible'},{av:'edtPrdCant_Visible',ctrl:'PRDCANT',prop:'Visible'},{av:'edtPrdCanFin_Visible',ctrl:'PRDCANFIN',prop:'Visible'},{av:'edtavAcumulada_Visible',ctrl:'vACUMULADA',prop:'Visible'},{av:'edtavPorcen_Visible',ctrl:'vPORCEN',prop:'Visible'},{av:'edtavPortot_Visible',ctrl:'vPORTOT',prop:'Visible'},{av:'edtavAnyadida_Visible',ctrl:'vANYADIDA',prop:'Visible'},{av:'edtavPorc_Visible',ctrl:'vPORC',prop:'Visible'},{av:'AV48GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV49GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV33ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV22GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e131LH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV9RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV35ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV30ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV44TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV45TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV50TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV51TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV52TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV53TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV54TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV55TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV56TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV57TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV58TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV59TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV60TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV61TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV62TFPrdCanFin',fld:'vTFPRDCANFIN',pic:'ZZZZZZ9.999'},{av:'AV63TFPrdCanFin_To',fld:'vTFPRDCANFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV24OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV25OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e141LH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV9RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV35ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV30ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV44TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV45TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV50TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV51TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV52TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV53TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV54TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV55TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV56TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV57TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV58TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV59TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV60TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV61TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV62TFPrdCanFin',fld:'vTFPRDCANFIN',pic:'ZZZZZZ9.999'},{av:'AV63TFPrdCanFin_To',fld:'vTFPRDCANFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV24OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV25OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e151LH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV9RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV35ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV30ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV44TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV45TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV50TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV51TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV52TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV53TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV54TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV55TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV56TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV57TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV58TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV59TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV60TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV61TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV62TFPrdCanFin',fld:'vTFPRDCANFIN',pic:'ZZZZZZ9.999'},{av:'AV63TFPrdCanFin_To',fld:'vTFPRDCANFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV24OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV25OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV24OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV25OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV62TFPrdCanFin',fld:'vTFPRDCANFIN',pic:'ZZZZZZ9.999'},{av:'AV63TFPrdCanFin_To',fld:'vTFPRDCANFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV60TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV61TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV58TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV59TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV56TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV57TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV54TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV55TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV52TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV53TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV50TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV51TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV44TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV45TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e201LH2',iparms:[{av:'A686PrdCant',fld:'PRDCANT',pic:'ZZZZZZ9.999',hsh:true},{av:'A1797PrdCanAny',fld:'PRDCANANY',pic:'ZZZZZZ9.999'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV64Acumulada',fld:'vACUMULADA',pic:'ZZZZZZ9.999',hsh:true},{av:'edtavPorcen_Class',ctrl:'vPORCEN',prop:'Class'},{av:'edtavPorcen_Enabled',ctrl:'vPORCEN',prop:'Enabled'},{av:'AV65Porcen',fld:'vPORCEN',pic:'ZZ9.99'},{av:'edtavPorcen_Backcolor',ctrl:'vPORCEN',prop:'Backcolor'},{av:'edtavPorcen_Forecolor',ctrl:'vPORCEN',prop:'Forecolor'},{av:'edtavPortot_Class',ctrl:'vPORTOT',prop:'Class'},{av:'edtavPortot_Enabled',ctrl:'vPORTOT',prop:'Enabled'},{av:'AV66PorTot',fld:'vPORTOT',pic:'ZZZ9'},{av:'edtavPortot_Backcolor',ctrl:'vPORTOT',prop:'Backcolor'},{av:'edtavPortot_Forecolor',ctrl:'vPORTOT',prop:'Forecolor'},{av:'edtavAnyadida_Class',ctrl:'vANYADIDA',prop:'Class'},{av:'edtavAnyadida_Enabled',ctrl:'vANYADIDA',prop:'Enabled'},{av:'AV68Anyadida',fld:'vANYADIDA',pic:'ZZZZZZ9.999'},{av:'edtavAnyadida_Backcolor',ctrl:'vANYADIDA',prop:'Backcolor'},{av:'edtavAnyadida_Forecolor',ctrl:'vANYADIDA',prop:'Forecolor'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e161LH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV9RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV35ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV30ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV44TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV45TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV50TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV51TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV52TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV53TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV54TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV55TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV56TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV57TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV58TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV59TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV60TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV61TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV62TFPrdCanFin',fld:'vTFPRDCANFIN',pic:'ZZZZZZ9.999'},{av:'AV63TFPrdCanFin_To',fld:'vTFPRDCANFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV24OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV25OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV30ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV35ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtRecLinPro_Visible',ctrl:'RECLINPRO',prop:'Visible'},{av:'edtRecLin_Visible',ctrl:'RECLIN',prop:'Visible'},{av:'edtRecPrdNum_Visible',ctrl:'RECPRDNUM',prop:'Visible'},{av:'edtRecPrdDsc_Visible',ctrl:'RECPRDDSC',prop:'Visible'},{av:'edtForPrdUMe_Visible',ctrl:'FORPRDUME',prop:'Visible'},{av:'edtForPrdDsc_Visible',ctrl:'FORPRDDSC',prop:'Visible'},{av:'edtPrdCant_Visible',ctrl:'PRDCANT',prop:'Visible'},{av:'edtPrdCanFin_Visible',ctrl:'PRDCANFIN',prop:'Visible'},{av:'edtavAcumulada_Visible',ctrl:'vACUMULADA',prop:'Visible'},{av:'edtavPorcen_Visible',ctrl:'vPORCEN',prop:'Visible'},{av:'edtavPortot_Visible',ctrl:'vPORTOT',prop:'Visible'},{av:'edtavAnyadida_Visible',ctrl:'vANYADIDA',prop:'Visible'},{av:'edtavPorc_Visible',ctrl:'vPORC',prop:'Visible'},{av:'AV48GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV49GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV33ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV22GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e121LH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV9RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV35ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV30ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV44TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV45TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV50TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV51TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV52TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV53TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV54TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV55TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV56TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV57TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV58TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV59TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV60TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV61TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV62TFPrdCanFin',fld:'vTFPRDCANFIN',pic:'ZZZZZZ9.999'},{av:'AV63TFPrdCanFin_To',fld:'vTFPRDCANFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV24OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV25OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV22GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV35ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22GridState',fld:'vGRIDSTATE',pic:''},{av:'AV24OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV25OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV44TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV45TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV50TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV51TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV52TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV53TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV54TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV55TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV56TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV57TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV58TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV59TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV60TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV61TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV62TFPrdCanFin',fld:'vTFPRDCANFIN',pic:'ZZZZZZ9.999'},{av:'AV63TFPrdCanFin_To',fld:'vTFPRDCANFIN_TO',pic:'ZZZZZZ9.999'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV30ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtRecLinPro_Visible',ctrl:'RECLINPRO',prop:'Visible'},{av:'edtRecLin_Visible',ctrl:'RECLIN',prop:'Visible'},{av:'edtRecPrdNum_Visible',ctrl:'RECPRDNUM',prop:'Visible'},{av:'edtRecPrdDsc_Visible',ctrl:'RECPRDDSC',prop:'Visible'},{av:'edtForPrdUMe_Visible',ctrl:'FORPRDUME',prop:'Visible'},{av:'edtForPrdDsc_Visible',ctrl:'FORPRDDSC',prop:'Visible'},{av:'edtPrdCant_Visible',ctrl:'PRDCANT',prop:'Visible'},{av:'edtPrdCanFin_Visible',ctrl:'PRDCANFIN',prop:'Visible'},{av:'edtavAcumulada_Visible',ctrl:'vACUMULADA',prop:'Visible'},{av:'edtavPorcen_Visible',ctrl:'vPORCEN',prop:'Visible'},{av:'edtavPortot_Visible',ctrl:'vPORTOT',prop:'Visible'},{av:'edtavAnyadida_Visible',ctrl:'vANYADIDA',prop:'Visible'},{av:'edtavPorc_Visible',ctrl:'vPORC',prop:'Visible'},{av:'AV48GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV49GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV33ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e111LH1',iparms:[]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[]}");
      setEventMetadata("'DOCERRAR'","{handler:'e171LH2',iparms:[{av:'AV16recfec',fld:'vRECFEC',pic:''},{av:'AV15flagM',fld:'vFLAGM',pic:'ZZZ9'},{av:'AV14fechaCierre',fld:'vFECHACIERRE',pic:''},{av:'AV13Cc_almcod',fld:'vCC_ALMCOD',pic:'Z9'},{av:'AV12Maqcod',fld:'vMAQCOD',pic:''},{av:'AV11consumos',fld:'vCONSUMOS',pic:'ZZZ9'},{av:'AV10FecCieTin',fld:'vFECCIETIN',pic:''},{av:'AV9RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Porc',iparms:[]");
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
      wcpOAV8BarCodPar = "" ;
      wcpOAV10FecCieTin = GXutil.nullDate() ;
      wcpOAV12Maqcod = "" ;
      wcpOAV14fechaCierre = GXutil.nullDate() ;
      wcpOAV16recfec = GXutil.nullDate() ;
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
      AV5EmprCod = "" ;
      AV8BarCodPar = "" ;
      AV10FecCieTin = GXutil.nullDate() ;
      AV12Maqcod = "" ;
      AV14fechaCierre = GXutil.nullDate() ;
      AV16recfec = GXutil.nullDate() ;
      AV27FilterFullText = "" ;
      AV30ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV52TFRecPrdNum = "" ;
      AV53TFRecPrdNum_Sel = "" ;
      AV54TFRecPrdDsc = "" ;
      AV55TFRecPrdDsc_Sel = "" ;
      AV58TFForPrdDsc = "" ;
      AV59TFForPrdDsc_Sel = "" ;
      AV60TFPrdCant = DecimalUtil.ZERO ;
      AV61TFPrdCant_To = DecimalUtil.ZERO ;
      AV62TFPrdCanFin = DecimalUtil.ZERO ;
      AV63TFPrdCanFin_To = DecimalUtil.ZERO ;
      AV92Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV33ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV46DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A1797PrdCanAny = DecimalUtil.ZERO ;
      AV22GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      ucDvpanel_acciones = new com.genexus.webpanels.GXUserControl();
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A130BarCodPar = "" ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A488ForPrdDsc = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      A683PrdCanFin = DecimalUtil.ZERO ;
      AV64Acumulada = DecimalUtil.ZERO ;
      AV65Porcen = DecimalUtil.ZERO ;
      AV68Anyadida = DecimalUtil.ZERO ;
      AV67Porc = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = "" ;
      lV80Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum = "" ;
      lV82Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc = "" ;
      lV86Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc = "" ;
      AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = "" ;
      AV81Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel = "" ;
      AV80Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum = "" ;
      AV83Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel = "" ;
      AV82Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc = "" ;
      AV87Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel = "" ;
      AV86Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc = "" ;
      AV88Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant = DecimalUtil.ZERO ;
      AV89Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to = DecimalUtil.ZERO ;
      AV90Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin = DecimalUtil.ZERO ;
      AV91Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      H01LH2_A396EmprCod = new String[] {""} ;
      H01LH2_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01LH2_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01LH2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01LH2_A488ForPrdDsc = new String[] {""} ;
      H01LH2_n488ForPrdDsc = new boolean[] {false} ;
      H01LH2_A490ForPrdUMe = new byte[1] ;
      H01LH2_n490ForPrdUMe = new boolean[] {false} ;
      H01LH2_A875RecPrdDsc = new String[] {""} ;
      H01LH2_A872RecPrdNum = new String[] {""} ;
      H01LH2_A811RecLin = new short[1] ;
      H01LH2_A1273RecLinPro = new byte[1] ;
      H01LH2_A2804RecLinMaq = new short[1] ;
      H01LH2_A130BarCodPar = new String[] {""} ;
      H01LH2_A132BarCodReo = new byte[1] ;
      H01LH2_A129BarCod = new int[1] ;
      H01LH3_AGRID_nRecordCount = new long[1] ;
      AV72Station = "" ;
      AV73Emprnom = "" ;
      AV74Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV18WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV32Session = httpContext.getWebSession();
      AV28ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV34ManageFiltersXml = "" ;
      AV29UserCustomValue = "" ;
      AV31ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV23GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState14 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV20TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV19HTTPRequest = httpContext.getHttpRequest();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5EmprCod = "" ;
      sCtrlAV6BarCod = "" ;
      sCtrlAV7BarCodReo = "" ;
      sCtrlAV8BarCodPar = "" ;
      sCtrlAV9RecLinMaq = "" ;
      sCtrlAV10FecCieTin = "" ;
      sCtrlAV11consumos = "" ;
      sCtrlAV12Maqcod = "" ;
      sCtrlAV13Cc_almcod = "" ;
      sCtrlAV14fechaCierre = "" ;
      sCtrlAV15flagM = "" ;
      sCtrlAV16recfec = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.cierrerecetastinte_anyadidas_1__default(),
         new Object[] {
             new Object[] {
            H01LH2_A396EmprCod, H01LH2_A1797PrdCanAny, H01LH2_A683PrdCanFin, H01LH2_A686PrdCant, H01LH2_A488ForPrdDsc, H01LH2_n488ForPrdDsc, H01LH2_A490ForPrdUMe, H01LH2_n490ForPrdUMe, H01LH2_A875RecPrdDsc, H01LH2_A872RecPrdNum,
            H01LH2_A811RecLin, H01LH2_A1273RecLinPro, H01LH2_A2804RecLinMaq, H01LH2_A130BarCodPar, H01LH2_A132BarCodReo, H01LH2_A129BarCod
            }
            , new Object[] {
            H01LH3_AGRID_nRecordCount
            }
         }
      );
      AV92Pgmname = "FormulacionTinte.CierreRecetasTinte_Anyadidas_1" ;
      /* GeneXus formulas. */
      AV92Pgmname = "FormulacionTinte.CierreRecetasTinte_Anyadidas_1" ;
      Gx_err = (short)(0) ;
      edtavAcumulada_Enabled = 0 ;
      edtavPorc_Enabled = 0 ;
   }

   private byte wcpOAV7BarCodReo ;
   private byte wcpOAV13Cc_almcod ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV7BarCodReo ;
   private byte AV13Cc_almcod ;
   private byte AV35ManageFiltersExecutionStep ;
   private byte AV44TFRecLinPro ;
   private byte AV45TFRecLinPro_To ;
   private byte AV56TFForPrdUMe ;
   private byte AV57TFForPrdUMe_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte A490ForPrdUMe ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro ;
   private byte AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to ;
   private byte AV84Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume ;
   private byte AV85Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV9RecLinMaq ;
   private short wcpOAV11consumos ;
   private short wcpOAV15flagM ;
   private short AV9RecLinMaq ;
   private short AV11consumos ;
   private short AV15flagM ;
   private short AV50TFRecLin ;
   private short AV51TFRecLin_To ;
   private short AV24OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short AV66PorTot ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin ;
   private short AV79Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to ;
   private int wcpOAV6BarCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_49 ;
   private int AV6BarCod ;
   private int nGXsfl_49_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int edtavAcumulada_Enabled ;
   private int edtavPorc_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtRecLinPro_Visible ;
   private int edtRecLin_Visible ;
   private int edtRecPrdNum_Visible ;
   private int edtRecPrdDsc_Visible ;
   private int edtForPrdUMe_Visible ;
   private int edtForPrdDsc_Visible ;
   private int edtPrdCant_Visible ;
   private int edtPrdCanFin_Visible ;
   private int edtavAcumulada_Visible ;
   private int edtavPorcen_Visible ;
   private int edtavPortot_Visible ;
   private int edtavAnyadida_Visible ;
   private int edtavPorc_Visible ;
   private int AV47PageToGo ;
   private int edtavPorcen_Enabled ;
   private int edtavPorcen_Backcolor ;
   private int edtavPorcen_Forecolor ;
   private int edtavPortot_Enabled ;
   private int edtavPortot_Backcolor ;
   private int edtavPortot_Forecolor ;
   private int edtavAnyadida_Enabled ;
   private int edtavAnyadida_Backcolor ;
   private int edtavAnyadida_Forecolor ;
   private int AV93GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV48GridCurrentPage ;
   private long AV49GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV60TFPrdCant ;
   private java.math.BigDecimal AV61TFPrdCant_To ;
   private java.math.BigDecimal AV62TFPrdCanFin ;
   private java.math.BigDecimal AV63TFPrdCanFin_To ;
   private java.math.BigDecimal A1797PrdCanAny ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A683PrdCanFin ;
   private java.math.BigDecimal AV64Acumulada ;
   private java.math.BigDecimal AV65Porcen ;
   private java.math.BigDecimal AV68Anyadida ;
   private java.math.BigDecimal AV67Porc ;
   private java.math.BigDecimal AV88Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant ;
   private java.math.BigDecimal AV89Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to ;
   private java.math.BigDecimal AV90Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin ;
   private java.math.BigDecimal AV91Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to ;
   private String wcpOAV5EmprCod ;
   private String wcpOAV8BarCodPar ;
   private String wcpOAV12Maqcod ;
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
   private String AV5EmprCod ;
   private String AV8BarCodPar ;
   private String AV12Maqcod ;
   private String sGXsfl_49_idx="0001" ;
   private String AV52TFRecPrdNum ;
   private String AV53TFRecPrdNum_Sel ;
   private String AV54TFRecPrdDsc ;
   private String AV55TFRecPrdDsc_Sel ;
   private String AV58TFForPrdDsc ;
   private String AV59TFForPrdDsc_Sel ;
   private String AV92Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Dvpanel_acciones_Width ;
   private String Dvpanel_acciones_Cls ;
   private String Dvpanel_acciones_Title ;
   private String Dvpanel_acciones_Iconposition ;
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
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String Dvpanel_acciones_Internalname ;
   private String divAcciones_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtRecLinMaq_Internalname ;
   private String edtRecLinPro_Internalname ;
   private String edtRecLin_Internalname ;
   private String A872RecPrdNum ;
   private String edtRecPrdNum_Internalname ;
   private String A875RecPrdDsc ;
   private String edtRecPrdDsc_Internalname ;
   private String edtForPrdUMe_Internalname ;
   private String A488ForPrdDsc ;
   private String edtForPrdDsc_Internalname ;
   private String edtPrdCant_Internalname ;
   private String edtPrdCanFin_Internalname ;
   private String edtavAcumulada_Internalname ;
   private String edtavPorcen_Internalname ;
   private String edtavPortot_Internalname ;
   private String edtavAnyadida_Internalname ;
   private String edtavPorc_Internalname ;
   private String scmdbuf ;
   private String lV80Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum ;
   private String lV82Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc ;
   private String lV86Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc ;
   private String AV81Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel ;
   private String AV80Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum ;
   private String AV83Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel ;
   private String AV82Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc ;
   private String AV87Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel ;
   private String AV86Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc ;
   private String A396EmprCod ;
   private String AV72Station ;
   private String AV73Emprnom ;
   private String AV74Usurcod ;
   private String edtavPorcen_Class ;
   private String edtavPortot_Class ;
   private String edtavAnyadida_Class ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV5EmprCod ;
   private String sCtrlAV6BarCod ;
   private String sCtrlAV7BarCodReo ;
   private String sCtrlAV8BarCodPar ;
   private String sCtrlAV9RecLinMaq ;
   private String sCtrlAV10FecCieTin ;
   private String sCtrlAV11consumos ;
   private String sCtrlAV12Maqcod ;
   private String sCtrlAV13Cc_almcod ;
   private String sCtrlAV14fechaCierre ;
   private String sCtrlAV15flagM ;
   private String sCtrlAV16recfec ;
   private String sGXsfl_49_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtRecLinMaq_Jsonclick ;
   private String edtRecLinPro_Jsonclick ;
   private String edtRecLin_Jsonclick ;
   private String edtRecPrdNum_Jsonclick ;
   private String edtRecPrdDsc_Jsonclick ;
   private String edtForPrdUMe_Jsonclick ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtPrdCant_Jsonclick ;
   private String edtPrdCanFin_Jsonclick ;
   private String edtavAcumulada_Jsonclick ;
   private String edtavPorcen_Jsonclick ;
   private String edtavPortot_Jsonclick ;
   private String edtavAnyadida_Jsonclick ;
   private String edtavPorc_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV10FecCieTin ;
   private java.util.Date wcpOAV14fechaCierre ;
   private java.util.Date wcpOAV16recfec ;
   private java.util.Date AV10FecCieTin ;
   private java.util.Date AV14fechaCierre ;
   private java.util.Date AV16recfec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV25OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Dvpanel_acciones_Autowidth ;
   private boolean Dvpanel_acciones_Autoheight ;
   private boolean Dvpanel_acciones_Collapsible ;
   private boolean Dvpanel_acciones_Collapsed ;
   private boolean Dvpanel_acciones_Showcollapseicon ;
   private boolean Dvpanel_acciones_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n490ForPrdUMe ;
   private boolean n488ForPrdDsc ;
   private boolean bGXsfl_49_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV28ColumnsSelectorXML ;
   private String AV34ManageFiltersXml ;
   private String AV29UserCustomValue ;
   private String AV27FilterFullText ;
   private String lV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext ;
   private String AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV19HTTPRequest ;
   private com.genexus.webpanels.WebSession AV32Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_acciones ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private IDataStoreProvider pr_default ;
   private String[] H01LH2_A396EmprCod ;
   private java.math.BigDecimal[] H01LH2_A1797PrdCanAny ;
   private java.math.BigDecimal[] H01LH2_A683PrdCanFin ;
   private java.math.BigDecimal[] H01LH2_A686PrdCant ;
   private String[] H01LH2_A488ForPrdDsc ;
   private boolean[] H01LH2_n488ForPrdDsc ;
   private byte[] H01LH2_A490ForPrdUMe ;
   private boolean[] H01LH2_n490ForPrdUMe ;
   private String[] H01LH2_A875RecPrdDsc ;
   private String[] H01LH2_A872RecPrdNum ;
   private short[] H01LH2_A811RecLin ;
   private byte[] H01LH2_A1273RecLinPro ;
   private short[] H01LH2_A2804RecLinMaq ;
   private String[] H01LH2_A130BarCodPar ;
   private byte[] H01LH2_A132BarCodReo ;
   private int[] H01LH2_A129BarCod ;
   private long[] H01LH3_AGRID_nRecordCount ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV33ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV18WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV20TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV22GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState14[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV23GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV30ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV31ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV46DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class cierrerecetastinte_anyadidas_1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01LH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext ,
                                          byte AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro ,
                                          byte AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to ,
                                          short AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin ,
                                          short AV79Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to ,
                                          String AV81Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel ,
                                          String AV80Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum ,
                                          String AV83Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel ,
                                          String AV82Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc ,
                                          byte AV84Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume ,
                                          byte AV85Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to ,
                                          String AV87Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel ,
                                          String AV86Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc ,
                                          java.math.BigDecimal AV88Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant ,
                                          java.math.BigDecimal AV89Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to ,
                                          java.math.BigDecimal AV90Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin ,
                                          java.math.BigDecimal AV91Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to ,
                                          byte A1273RecLinPro ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A686PrdCant ,
                                          java.math.BigDecimal A683PrdCanFin ,
                                          short AV24OrderedBy ,
                                          boolean AV25OrderedDsc ,
                                          String AV5EmprCod ,
                                          int AV6BarCod ,
                                          byte AV7BarCodReo ,
                                          String AV8BarCodPar ,
                                          short AV9RecLinMaq ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[34];
      Object[] GXv_Object16 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.PrdCanAny, T1.PrdCanFin, T1.PrdCant, T2.ForPrdDsc, T1.ForPrdUMe, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin, T1.RecLinPro, T1.RecLinMaq, T1.BarCodPar," ;
      sSelectString += " T1.BarCodReo, T1.BarCod" ;
      sFromString = " FROM (TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?)");
      addWhere(sWhereString, "(Not (rtrim(T1.RecPrdNum) IS NULL AND NOT(T1.RecPrdNum IS NULL)))");
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLinPro,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.RecPrdNum) like '%' || UPPER(?)) or ( UPPER(T1.RecPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForPrdUMe,'90'), 2) like '%' || ?) or ( UPPER(T2.ForPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdCant,'9999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdCanFin,'9999990.999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int15[5] = (byte)(1) ;
         GXv_int15[6] = (byte)(1) ;
         GXv_int15[7] = (byte)(1) ;
         GXv_int15[8] = (byte)(1) ;
         GXv_int15[9] = (byte)(1) ;
         GXv_int15[10] = (byte)(1) ;
         GXv_int15[11] = (byte)(1) ;
         GXv_int15[12] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int15[13] = (byte)(1) ;
      }
      if ( ! (0==AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int15[14] = (byte)(1) ;
      }
      if ( ! (0==AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int15[15] = (byte)(1) ;
      }
      if ( ! (0==AV79Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int15[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV80Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int15[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int15[20] = (byte)(1) ;
      }
      if ( ! (0==AV84Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int15[21] = (byte)(1) ;
      }
      if ( ! (0==AV85Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int15[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int15[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int15[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int15[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin >= ?)");
      }
      else
      {
         GXv_int15[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin <= ?)");
      }
      else
      {
         GXv_int15[28] = (byte)(1) ;
      }
      if ( ( AV24OrderedBy == 1 ) && ! AV25OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecLinPro" ;
      }
      else if ( ( AV24OrderedBy == 1 ) && ( AV25OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecLinPro DESC" ;
      }
      else if ( ( AV24OrderedBy == 2 ) && ! AV25OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecLin" ;
      }
      else if ( ( AV24OrderedBy == 2 ) && ( AV25OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecLin DESC" ;
      }
      else if ( ( AV24OrderedBy == 3 ) && ! AV25OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecPrdNum" ;
      }
      else if ( ( AV24OrderedBy == 3 ) && ( AV25OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecPrdNum DESC" ;
      }
      else if ( ( AV24OrderedBy == 4 ) && ! AV25OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecPrdDsc" ;
      }
      else if ( ( AV24OrderedBy == 4 ) && ( AV25OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecPrdDsc DESC" ;
      }
      else if ( ( AV24OrderedBy == 5 ) && ! AV25OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForPrdUMe" ;
      }
      else if ( ( AV24OrderedBy == 5 ) && ( AV25OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForPrdUMe DESC" ;
      }
      else if ( ( AV24OrderedBy == 6 ) && ! AV25OrderedDsc )
      {
         sOrderString += " ORDER BY T2.ForPrdDsc" ;
      }
      else if ( ( AV24OrderedBy == 6 ) && ( AV25OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.ForPrdDsc DESC" ;
      }
      else if ( ( AV24OrderedBy == 7 ) && ! AV25OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdCant" ;
      }
      else if ( ( AV24OrderedBy == 7 ) && ( AV25OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdCant DESC" ;
      }
      else if ( ( AV24OrderedBy == 8 ) && ! AV25OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdCanFin" ;
      }
      else if ( ( AV24OrderedBy == 8 ) && ( AV25OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdCanFin DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
   }

   protected Object[] conditional_H01LH3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext ,
                                          byte AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro ,
                                          byte AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to ,
                                          short AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin ,
                                          short AV79Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to ,
                                          String AV81Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel ,
                                          String AV80Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum ,
                                          String AV83Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel ,
                                          String AV82Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc ,
                                          byte AV84Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume ,
                                          byte AV85Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to ,
                                          String AV87Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel ,
                                          String AV86Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc ,
                                          java.math.BigDecimal AV88Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant ,
                                          java.math.BigDecimal AV89Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to ,
                                          java.math.BigDecimal AV90Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin ,
                                          java.math.BigDecimal AV91Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to ,
                                          byte A1273RecLinPro ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A686PrdCant ,
                                          java.math.BigDecimal A683PrdCanFin ,
                                          short AV24OrderedBy ,
                                          boolean AV25OrderedDsc ,
                                          String AV5EmprCod ,
                                          int AV6BarCod ,
                                          byte AV7BarCodReo ,
                                          String AV8BarCodPar ,
                                          short AV9RecLinMaq ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[29];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?)");
      addWhere(sWhereString, "(Not (rtrim(T1.RecPrdNum) IS NULL AND NOT(T1.RecPrdNum IS NULL)))");
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLinPro,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.RecPrdNum) like '%' || UPPER(?)) or ( UPPER(T1.RecPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForPrdUMe,'90'), 2) like '%' || ?) or ( UPPER(T2.ForPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdCant,'9999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdCanFin,'9999990.999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
         GXv_int17[6] = (byte)(1) ;
         GXv_int17[7] = (byte)(1) ;
         GXv_int17[8] = (byte)(1) ;
         GXv_int17[9] = (byte)(1) ;
         GXv_int17[10] = (byte)(1) ;
         GXv_int17[11] = (byte)(1) ;
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (0==AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (0==AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! (0==AV79Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV80Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (0==AV84Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( ! (0==AV85Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin >= ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin <= ?)");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV24OrderedBy == 1 ) && ! AV25OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 1 ) && ( AV25OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 2 ) && ! AV25OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 2 ) && ( AV25OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 3 ) && ! AV25OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 3 ) && ( AV25OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 4 ) && ! AV25OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 4 ) && ( AV25OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 5 ) && ! AV25OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 5 ) && ( AV25OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 6 ) && ! AV25OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 6 ) && ( AV25OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 7 ) && ! AV25OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 7 ) && ( AV25OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 8 ) && ! AV25OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 8 ) && ( AV25OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
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
                  return conditional_H01LH2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Boolean) dynConstraints[26]).booleanValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() );
            case 1 :
                  return conditional_H01LH3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Boolean) dynConstraints[26]).booleanValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01LH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01LH3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 26);
               ((String[]) buf[9])[0] = rslt.getString(8, 6);
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((int[]) buf[15])[0] = rslt.getInt(14);
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
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 5);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 5);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 3);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 3);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 5);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 5);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 3);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 3);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 3);
               }
               return;
      }
   }

}

