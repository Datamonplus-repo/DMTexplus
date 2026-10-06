package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class duplicararticulos_1_wc_impl extends GXWebComponent
{
   public duplicararticulos_1_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public duplicararticulos_1_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( duplicararticulos_1_wc_impl.class ));
   }

   public duplicararticulos_1_wc_impl( int remoteHandle ,
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
      chkavDuplicararticulos_sdt__seleccionar = UIFactory.getCheckbox(this);
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
               AV15CliCodOrig = (int)(GXutil.lval( httpContext.GetPar( "CliCodOrig"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15CliCodOrig", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCodOrig), 6, 0));
               AV17CliNomOrig = httpContext.GetPar( "CliNomOrig") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17CliNomOrig", AV17CliNomOrig);
               AV14CliCodDes = (int)(GXutil.lval( httpContext.GetPar( "CliCodDes"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14CliCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CliCodDes), 6, 0));
               AV13ClicNomDes = httpContext.GetPar( "ClicNomDes") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13ClicNomDes", AV13ClicNomDes);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV6EmprCod,Integer.valueOf(AV15CliCodOrig),AV17CliNomOrig,Integer.valueOf(AV14CliCodDes),AV13ClicNomDes});
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
      nRC_GXsfl_60 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_60"))) ;
      nGXsfl_60_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_60_idx"))) ;
      sGXsfl_60_idx = httpContext.GetPar( "sGXsfl_60_idx") ;
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
      AV56Pgmname = httpContext.GetPar( "Pgmname") ;
      AV29OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV30OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV33TFDuplicarArticulos_SDT__Artcod = httpContext.GetPar( "TFDuplicarArticulos_SDT__Artcod") ;
      AV34TFDuplicarArticulos_SDT__ArtDsc = httpContext.GetPar( "TFDuplicarArticulos_SDT__ArtDsc") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV19DuplicarArticulos_SDT);
      AV6EmprCod = httpContext.GetPar( "EmprCod") ;
      AV15CliCodOrig = (int)(GXutil.lval( httpContext.GetPar( "CliCodOrig"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV56Pgmname, AV29OrderedBy, AV30OrderedDsc, AV33TFDuplicarArticulos_SDT__Artcod, AV34TFDuplicarArticulos_SDT__ArtDsc, AV19DuplicarArticulos_SDT, AV6EmprCod, AV15CliCodOrig, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa26C2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Duplicar Articulos", "")) ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ficherosbasicos.duplicararticulos_1_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV15CliCodOrig,6,0)),GXutil.URLEncode(GXutil.rtrim(AV17CliNomOrig)),GXutil.URLEncode(GXutil.ltrimstr(AV14CliCodDes,6,0)),GXutil.URLEncode(GXutil.rtrim(AV13ClicNomDes))}, new String[] {"EmprCod","CliCodOrig","CliNomOrig","CliCodDes","ClicNomDes"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"DuplicarArticulos_1_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV56Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ficherosbasicos\\duplicararticulos_1_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Duplicararticulos_sdt", AV19DuplicarArticulos_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Duplicararticulos_sdt", AV19DuplicarArticulos_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_60", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_60, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV21GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV22GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV18DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV18DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6EmprCod", GXutil.rtrim( wcpOAV6EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV15CliCodOrig", GXutil.ltrim( localUtil.ntoc( wcpOAV15CliCodOrig, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV17CliNomOrig", GXutil.rtrim( wcpOAV17CliNomOrig));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV14CliCodDes", GXutil.ltrim( localUtil.ntoc( wcpOAV14CliCodDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV13ClicNomDes", GXutil.rtrim( wcpOAV13ClicNomDes));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV29OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV30OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDUPLICARARTICULOS_SDT__ARTCOD", GXutil.rtrim( AV33TFDuplicarArticulos_SDT__Artcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDUPLICARARTICULOS_SDT__ARTDSC", GXutil.rtrim( AV34TFDuplicarArticulos_SDT__ArtDsc));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDUPLICARARTICULOS_SDT", AV19DuplicarArticulos_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDUPLICARARTICULOS_SDT", AV19DuplicarArticulos_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV6EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCANTIDADREGISTROSAPROCESAR", GXutil.ltrim( localUtil.ntoc( AV40CantidadRegistrosAProcesar, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vVAR_SELECCIONAR", AV37Var_seleccionar);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vI", GXutil.ltrim( localUtil.ntoc( AV26i, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
   }

   public void renderHtmlCloseForm26C2( )
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
      return "FicherosBasicos.DuplicarArticulos_1_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Duplicar Articulos", "") ;
   }

   public void wb26C0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.ficherosbasicos.duplicararticulos_1_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
            httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup3_Internalname, httpContext.getMessage( "Origen", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_FicherosBasicos\\DuplicarArticulos_1_WC.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicodorig_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicodorig_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodorig_Internalname, GXutil.ltrim( localUtil.ntoc( AV15CliCodOrig, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicodorig_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV15CliCodOrig), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV15CliCodOrig), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodorig_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicodorig_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\DuplicarArticulos_1_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinomorig_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinomorig_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinomorig_Internalname, GXutil.rtrim( AV17CliNomOrig), GXutil.rtrim( localUtil.format( AV17CliNomOrig, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinomorig_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinomorig_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\DuplicarArticulos_1_WC.htm");
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
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup5_Internalname, httpContext.getMessage( "Destino", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_FicherosBasicos\\DuplicarArticulos_1_WC.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicoddes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicoddes_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicoddes_Internalname, GXutil.ltrim( localUtil.ntoc( AV14CliCodDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicoddes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14CliCodDes), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV14CliCodDes), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicoddes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicoddes_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\DuplicarArticulos_1_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicnomdes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicnomdes_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicnomdes_Internalname, GXutil.rtrim( AV13ClicNomDes), GXutil.rtrim( localUtil.format( AV13ClicNomDes, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicnomdes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicnomdes_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\DuplicarArticulos_1_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
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
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 60, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1126c1_client"+"'", TempTags, "", 2, "HLP_FicherosBasicos\\DuplicarArticulos_1_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnmarcartodas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 60, 2, 0)+","+"null"+");", "++", bttBtnmarcartodas_Jsonclick, 5, "++", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOMARCARTODAS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\DuplicarArticulos_1_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndesmarcartodas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 60, 2, 0)+","+"null"+");", "--", bttBtndesmarcartodas_Jsonclick, 5, "--", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DODESMARCARTODAS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\DuplicarArticulos_1_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucBarradeprogreso.render(context, "gxprogressindicator", Barradeprogreso_Internalname, sPrefix+"BARRADEPROGRESOContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol60( ) ;
      }
      if ( wbEnd == 60 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_60 = (int)(nGXsfl_60_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV52GXV1 = nGXsfl_60_idx ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV21GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV22GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV56Pgmname), GXutil.rtrim( localUtil.format( AV56Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\DuplicarArticulos_1_WC.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV18DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         wb_table1_78_26C2( true) ;
      }
      else
      {
         wb_table1_78_26C2( false) ;
      }
      return  ;
   }

   public void wb_table1_78_26C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 60 )
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
               AV52GXV1 = nGXsfl_60_idx ;
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

   public void start26C2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Duplicar Articulos", ""), (short)(0)) ;
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
            strup26C0( ) ;
         }
      }
   }

   public void ws26C2( )
   {
      start26C2( ) ;
      evt26C2( ) ;
   }

   public void evt26C2( )
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
                              strup26C0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26C0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1226C2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26C0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1326C2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26C0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1426C2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26C0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1526C2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOMARCARTODAS'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26C0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoMarcarTodas' */
                                 e1626C2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DODESMARCARTODAS'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26C0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoDesmarcarTodas' */
                                 e1726C2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26C0( ) ;
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
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26C0( ) ;
                           }
                           nGXsfl_60_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_602( ) ;
                           AV52GXV1 = (int)(nGXsfl_60_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV19DuplicarArticulos_SDT.size() >= AV52GXV1 ) && ( AV52GXV1 > 0 ) )
                           {
                              AV19DuplicarArticulos_SDT.currentItem( ((app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem)AV19DuplicarArticulos_SDT.elementAt(-1+AV52GXV1)) );
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
                                       /* Execute user event: Start */
                                       e1826C2 ();
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
                                       /* Execute user event: Refresh */
                                       e1926C2 ();
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
                                       e2026C2 ();
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
                                    strup26C0( ) ;
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

   public void we26C2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm26C2( ) ;
         }
      }
   }

   public void pa26C2( )
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
      subsflControlProps_602( ) ;
      while ( nGXsfl_60_idx <= nRC_GXsfl_60 )
      {
         sendrow_602( ) ;
         nGXsfl_60_idx = ((subGrid_Islastpage==1)&&(nGXsfl_60_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_602( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV56Pgmname ,
                                 short AV29OrderedBy ,
                                 boolean AV30OrderedDsc ,
                                 String AV33TFDuplicarArticulos_SDT__Artcod ,
                                 String AV34TFDuplicarArticulos_SDT__ArtDsc ,
                                 GXBaseCollection<app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem> AV19DuplicarArticulos_SDT ,
                                 String AV6EmprCod ,
                                 int AV15CliCodOrig ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1926C2 ();
      GRID_nCurrentRecord = 0 ;
      rf26C2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"DuplicarArticulos_1_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV56Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ficherosbasicos\\duplicararticulos_1_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf26C2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV56Pgmname = "FicherosBasicos.DuplicarArticulos_1_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56Pgmname", AV56Pgmname);
      Gx_err = (short)(0) ;
      edtavClicodorig_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicodorig_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicodorig_Enabled), 5, 0), true);
      edtavClinomorig_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinomorig_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinomorig_Enabled), 5, 0), true);
      edtavClicoddes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicoddes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicoddes_Enabled), 5, 0), true);
      edtavClicnomdes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicnomdes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicnomdes_Enabled), 5, 0), true);
      edtavDuplicararticulos_sdt__artcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDuplicararticulos_sdt__artcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDuplicararticulos_sdt__artcod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtavDuplicararticulos_sdt__artdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDuplicararticulos_sdt__artdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDuplicararticulos_sdt__artdsc_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf26C2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(60) ;
      /* Execute user event: Refresh */
      e1926C2 ();
      nGXsfl_60_idx = 1 ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_602( ) ;
      bGXsfl_60_Refreshing = true ;
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
         subsflControlProps_602( ) ;
         e2026C2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_60_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e2026C2 ();
         }
         wbEnd = (short)(60) ;
         wb26C0( ) ;
      }
      bGXsfl_60_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes26C2( )
   {
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
      return AV19DuplicarArticulos_SDT.size() ;
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
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV56Pgmname, AV29OrderedBy, AV30OrderedDsc, AV33TFDuplicarArticulos_SDT__Artcod, AV34TFDuplicarArticulos_SDT__ArtDsc, AV19DuplicarArticulos_SDT, AV6EmprCod, AV15CliCodOrig, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV56Pgmname, AV29OrderedBy, AV30OrderedDsc, AV33TFDuplicarArticulos_SDT__Artcod, AV34TFDuplicarArticulos_SDT__ArtDsc, AV19DuplicarArticulos_SDT, AV6EmprCod, AV15CliCodOrig, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV56Pgmname, AV29OrderedBy, AV30OrderedDsc, AV33TFDuplicarArticulos_SDT__Artcod, AV34TFDuplicarArticulos_SDT__ArtDsc, AV19DuplicarArticulos_SDT, AV6EmprCod, AV15CliCodOrig, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV56Pgmname, AV29OrderedBy, AV30OrderedDsc, AV33TFDuplicarArticulos_SDT__Artcod, AV34TFDuplicarArticulos_SDT__ArtDsc, AV19DuplicarArticulos_SDT, AV6EmprCod, AV15CliCodOrig, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV56Pgmname, AV29OrderedBy, AV30OrderedDsc, AV33TFDuplicarArticulos_SDT__Artcod, AV34TFDuplicarArticulos_SDT__ArtDsc, AV19DuplicarArticulos_SDT, AV6EmprCod, AV15CliCodOrig, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV56Pgmname = "FicherosBasicos.DuplicarArticulos_1_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56Pgmname", AV56Pgmname);
      Gx_err = (short)(0) ;
      edtavClicodorig_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicodorig_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicodorig_Enabled), 5, 0), true);
      edtavClinomorig_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinomorig_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinomorig_Enabled), 5, 0), true);
      edtavClicoddes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicoddes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicoddes_Enabled), 5, 0), true);
      edtavClicnomdes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicnomdes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicnomdes_Enabled), 5, 0), true);
      edtavDuplicararticulos_sdt__artcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDuplicararticulos_sdt__artcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDuplicararticulos_sdt__artcod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtavDuplicararticulos_sdt__artdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDuplicararticulos_sdt__artdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDuplicararticulos_sdt__artdsc_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup26C0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1826C2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Duplicararticulos_sdt"), AV19DuplicarArticulos_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV18DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDUPLICARARTICULOS_SDT"), AV19DuplicarArticulos_SDT);
         /* Read saved values. */
         nRC_GXsfl_60 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_60"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV21GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV22GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV6EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV6EmprCod") ;
         wcpOAV15CliCodOrig = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV15CliCodOrig"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV17CliNomOrig = httpContext.cgiGet( sPrefix+"wcpOAV17CliNomOrig") ;
         wcpOAV14CliCodDes = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV14CliCodDes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV13ClicNomDes = httpContext.cgiGet( sPrefix+"wcpOAV13ClicNomDes") ;
         AV26i = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV40CantidadRegistrosAProcesar = localUtil.ctol( httpContext.cgiGet( sPrefix+"vCANTIDADREGISTROSAPROCESAR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Dvelop_confirmpanel_confirmar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Title") ;
         Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_confirmar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Dvelop_confirmpanel_confirmar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result") ;
         nRC_GXsfl_60 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_60"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_60_fel_idx = 0 ;
         while ( nGXsfl_60_fel_idx < nRC_GXsfl_60 )
         {
            nGXsfl_60_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_60_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_60_fel_idx+1) ;
            sGXsfl_60_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_602( ) ;
            AV52GXV1 = (int)(nGXsfl_60_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV19DuplicarArticulos_SDT.size() >= AV52GXV1 ) && ( AV52GXV1 > 0 ) )
            {
               AV19DuplicarArticulos_SDT.currentItem( ((app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem)AV19DuplicarArticulos_SDT.elementAt(-1+AV52GXV1)) );
            }
         }
         if ( nGXsfl_60_fel_idx == 0 )
         {
            nGXsfl_60_idx = 1 ;
            sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_602( ) ;
         }
         nGXsfl_60_fel_idx = 1 ;
         /* Read variables values. */
         AV56Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56Pgmname", AV56Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"DuplicarArticulos_1_WC");
         AV56Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56Pgmname", AV56Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV56Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("ficherosbasicos\\duplicararticulos_1_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1826C2 ();
      if (returnInSub) return;
   }

   public void e1826C2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV8Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      duplicararticulos_1_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV8Station = GXt_char1 ;
      GXv_char2[0] = AV6EmprCod ;
      GXv_char3[0] = AV7EmprNom ;
      GXv_char4[0] = AV9UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV8Station, GXv_char2, GXv_char3, GXv_char4) ;
      duplicararticulos_1_wc_impl.this.AV6EmprCod = GXv_char2[0] ;
      duplicararticulos_1_wc_impl.this.AV7EmprNom = GXv_char3[0] ;
      duplicararticulos_1_wc_impl.this.AV9UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6EmprCod", AV6EmprCod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      if ( AV29OrderedBy < 1 )
      {
         AV29OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S122 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV18DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV18DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e1926C2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV38WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV38WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S142 ();
      if (returnInSub) return;
      AV21GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21GridCurrentPage), 10, 0));
      AV22GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22GridPageCount), 10, 0));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19DuplicarArticulos_SDT", AV19DuplicarArticulos_SDT);
   }

   public void e1226C2( )
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
         AV31PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV31PageToGo) ;
      }
   }

   public void e1326C2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1426C2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV29OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29OrderedBy), 4, 0));
         AV30OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30OrderedDsc", AV30OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S122 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DuplicarArticulos_SDT__Artcod") == 0 )
         {
            AV33TFDuplicarArticulos_SDT__Artcod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFDuplicarArticulos_SDT__Artcod", AV33TFDuplicarArticulos_SDT__Artcod);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DuplicarArticulos_SDT__ArtDsc") == 0 )
         {
            AV34TFDuplicarArticulos_SDT__ArtDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFDuplicarArticulos_SDT__ArtDsc", AV34TFDuplicarArticulos_SDT__ArtDsc);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e2026C2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV52GXV1 = 1 ;
      while ( AV52GXV1 <= AV19DuplicarArticulos_SDT.size() )
      {
         AV19DuplicarArticulos_SDT.currentItem( ((app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem)AV19DuplicarArticulos_SDT.elementAt(-1+AV52GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(60) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_602( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_60_Refreshing )
         {
            httpContext.doAjaxLoad(60, GridRow);
         }
         AV52GXV1 = (int)(AV52GXV1+1) ;
      }
   }

   public void e1526C2( )
   {
      AV52GXV1 = (int)(nGXsfl_60_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV52GXV1 > 0 ) && ( AV19DuplicarArticulos_SDT.size() >= AV52GXV1 ) )
      {
         AV19DuplicarArticulos_SDT.currentItem( ((app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem)AV19DuplicarArticulos_SDT.elementAt(-1+AV52GXV1)) );
      }
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S152 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV39ProgressIndicator", AV39ProgressIndicator);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19DuplicarArticulos_SDT", AV19DuplicarArticulos_SDT);
      nGXsfl_60_bak_idx = nGXsfl_60_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV56Pgmname, AV29OrderedBy, AV30OrderedDsc, AV33TFDuplicarArticulos_SDT__Artcod, AV34TFDuplicarArticulos_SDT__ArtDsc, AV19DuplicarArticulos_SDT, AV6EmprCod, AV15CliCodOrig, sPrefix) ;
      nGXsfl_60_idx = nGXsfl_60_bak_idx ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_602( ) ;
   }

   public void e1626C2( )
   {
      AV52GXV1 = (int)(nGXsfl_60_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV52GXV1 > 0 ) && ( AV19DuplicarArticulos_SDT.size() >= AV52GXV1 ) )
      {
         AV19DuplicarArticulos_SDT.currentItem( ((app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem)AV19DuplicarArticulos_SDT.elementAt(-1+AV52GXV1)) );
      }
      /* 'DoMarcarTodas' Routine */
      returnInSub = false ;
      AV37Var_seleccionar = true ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Var_seleccionar", AV37Var_seleccionar);
      /* Execute user subroutine: 'APLICOGRID' */
      S162 ();
      if (returnInSub) return;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19DuplicarArticulos_SDT", AV19DuplicarArticulos_SDT);
      nGXsfl_60_bak_idx = nGXsfl_60_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV56Pgmname, AV29OrderedBy, AV30OrderedDsc, AV33TFDuplicarArticulos_SDT__Artcod, AV34TFDuplicarArticulos_SDT__ArtDsc, AV19DuplicarArticulos_SDT, AV6EmprCod, AV15CliCodOrig, sPrefix) ;
      nGXsfl_60_idx = nGXsfl_60_bak_idx ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_602( ) ;
   }

   public void e1726C2( )
   {
      AV52GXV1 = (int)(nGXsfl_60_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV52GXV1 > 0 ) && ( AV19DuplicarArticulos_SDT.size() >= AV52GXV1 ) )
      {
         AV19DuplicarArticulos_SDT.currentItem( ((app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem)AV19DuplicarArticulos_SDT.elementAt(-1+AV52GXV1)) );
      }
      /* 'DoDesmarcarTodas' Routine */
      returnInSub = false ;
      AV37Var_seleccionar = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Var_seleccionar", AV37Var_seleccionar);
      /* Execute user subroutine: 'APLICOGRID' */
      S162 ();
      if (returnInSub) return;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19DuplicarArticulos_SDT", AV19DuplicarArticulos_SDT);
      nGXsfl_60_bak_idx = nGXsfl_60_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV56Pgmname, AV29OrderedBy, AV30OrderedDsc, AV33TFDuplicarArticulos_SDT__Artcod, AV34TFDuplicarArticulos_SDT__ArtDsc, AV19DuplicarArticulos_SDT, AV6EmprCod, AV15CliCodOrig, sPrefix) ;
      nGXsfl_60_idx = nGXsfl_60_bak_idx ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_602( ) ;
   }

   public void S142( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
      AV20DuplicarArticulos_SDT_Aux = AV19DuplicarArticulos_SDT.Clone() ;
      GXt_objcol_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem8 = AV19DuplicarArticulos_SDT ;
      GXv_objcol_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem9[0] = GXt_objcol_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem8 ;
      new app.ficherosbasicos.duplicararticulos_dp(remoteHandle, context).execute( AV6EmprCod, AV15CliCodOrig, AV33TFDuplicarArticulos_SDT__Artcod, AV34TFDuplicarArticulos_SDT__ArtDsc, GXv_objcol_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem9) ;
      GXt_objcol_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem8 = GXv_objcol_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem9[0] ;
      AV19DuplicarArticulos_SDT = GXt_objcol_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem8 ;
      gx_BV60 = true ;
      AV26i = (short)(1) ;
      while ( AV26i <= AV20DuplicarArticulos_SDT_Aux.size() )
      {
         if ( ((app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem)AV20DuplicarArticulos_SDT_Aux.elementAt(-1+AV26i)).getgxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Seleccionar() )
         {
            AV28j = (short)(1) ;
            while ( AV28j <= AV19DuplicarArticulos_SDT.size() )
            {
               if ( GXutil.strcmp(((app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem)AV19DuplicarArticulos_SDT.elementAt(-1+AV26i)).getgxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artcod(), ((app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem)AV20DuplicarArticulos_SDT_Aux.elementAt(-1+AV28j)).getgxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artcod()) == 0 )
               {
                  ((app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem)AV19DuplicarArticulos_SDT.elementAt(-1+AV28j)).setgxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Seleccionar( true );
                  if (true) break;
               }
               AV28j = (short)(AV28j+1) ;
            }
         }
         AV26i = (short)(AV26i+1) ;
      }
      AV19DuplicarArticulos_SDT.sort((AV30OrderedDsc ? "[" : "")+GXutil.format( "%"+GXutil.trim( GXutil.str( AV29OrderedBy, 4, 0)), "Artcod", "ArtDsc", "", "", "", "", "", "", "")+(AV30OrderedDsc ? "]" : ""));
      gx_BV60 = true ;
      AV20DuplicarArticulos_SDT_Aux.clear();
   }

   public void S122( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV29OrderedBy, 4, 0))+":"+(AV30OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      AV39ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV39ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV39ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV39ProgressIndicator.setgxTv_SdtProgress_Maxvalue( 100 );
      AV39ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV39ProgressIndicator.show();
      AV41CantidadRegistrosProcesados = 0 ;
      AV48CantidadRegistrosexistentes = 0 ;
      AV43messages.clear();
      AV57GXV5 = 1 ;
      while ( AV57GXV5 <= AV19DuplicarArticulos_SDT.size() )
      {
         AV44DuplicarArticulos_SDTItem = (app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem)((app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem)AV19DuplicarArticulos_SDT.elementAt(-1+AV57GXV5));
         if ( AV44DuplicarArticulos_SDTItem.getgxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Seleccionar() )
         {
            AV5Artcod = AV44DuplicarArticulos_SDTItem.getgxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artcod() ;
            AV11artdsc = AV44DuplicarArticulos_SDTItem.getgxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artdsc() ;
            AV10ArtcodDes = AV5Artcod ;
            AV12Artdscdes = AV11artdsc ;
            GXv_char4[0] = AV47Mensaje ;
            new app.ppartdsc(remoteHandle, context).execute( AV6EmprCod, AV14CliCodDes, AV5Artcod, GXv_char4) ;
            duplicararticulos_1_wc_impl.this.AV47Mensaje = GXv_char4[0] ;
            if ( GXutil.strcmp(AV47Mensaje, httpContext.getMessage( "Error", "")) != 0 )
            {
               AV48CantidadRegistrosexistentes = (long)(AV48CantidadRegistrosexistentes+1) ;
            }
            if ( GXutil.strcmp(AV47Mensaje, httpContext.getMessage( "Error", "")) == 0 )
            {
               GXv_char4[0] = AV6EmprCod ;
               GXv_char3[0] = AV10ArtcodDes ;
               GXv_char2[0] = AV12Artdscdes ;
               new app.pnewse2(remoteHandle, context).execute( GXv_char4, AV15CliCodOrig, AV14CliCodDes, AV5Artcod, GXv_char3, GXv_char2) ;
               duplicararticulos_1_wc_impl.this.AV6EmprCod = GXv_char4[0] ;
               duplicararticulos_1_wc_impl.this.AV10ArtcodDes = GXv_char3[0] ;
               duplicararticulos_1_wc_impl.this.AV12Artdscdes = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6EmprCod", AV6EmprCod);
            }
            AV41CantidadRegistrosProcesados = (long)(AV41CantidadRegistrosProcesados+1) ;
            AV42Porcentaje = (short)((AV41CantidadRegistrosProcesados/ (double) (AV40CantidadRegistrosAProcesar))*100) ;
            AV39ProgressIndicator.setgxTv_SdtProgress_Value( AV42Porcentaje );
            AV39ProgressIndicator.showwithtitle(GXutil.format( httpContext.getMessage( "Procesando %1 de %2.", ""), GXutil.trim( GXutil.str( AV41CantidadRegistrosProcesados, 12, 0)), GXutil.trim( GXutil.str( AV40CantidadRegistrosAProcesar, 12, 0)), "", "", "", "", "", "", ""));
            AV45message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
            AV45message.setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( AV41CantidadRegistrosProcesados, 12, 0)) );
            AV45message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Articulo ", "")+GXutil.trim( AV5Artcod)+" "+AV11artdsc );
            AV43messages.add(AV45message, 0);
         }
         AV57GXV5 = (int)(AV57GXV5+1) ;
      }
      AV39ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado.", ""));
      AV39ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV39ProgressIndicator.hide();
      AV20DuplicarArticulos_SDT_Aux.clear();
      AV19DuplicarArticulos_SDT.clear();
      gx_BV60 = true ;
      GXt_objcol_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem8 = AV19DuplicarArticulos_SDT ;
      GXv_objcol_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem9[0] = GXt_objcol_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem8 ;
      new app.ficherosbasicos.duplicararticulos_dp(remoteHandle, context).execute( AV6EmprCod, AV15CliCodOrig, AV33TFDuplicarArticulos_SDT__Artcod, AV34TFDuplicarArticulos_SDT__ArtDsc, GXv_objcol_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem9) ;
      GXt_objcol_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem8 = GXv_objcol_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem9[0] ;
      AV19DuplicarArticulos_SDT = GXt_objcol_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem8 ;
      gx_BV60 = true ;
      AV49CantidadRegistroscreados = (long)(AV41CantidadRegistrosProcesados-AV48CantidadRegistrosexistentes) ;
      AV46Var_messages = httpContext.getMessage( "Registros Procesados= ", "") + GXutil.trim( GXutil.str( AV41CantidadRegistrosProcesados, 12, 0)) + GXutil.newLine( ) ;
      AV46Var_messages += httpContext.getMessage( "Registros ya EXISTENTES= ", "") + GXutil.trim( GXutil.str( AV48CantidadRegistrosexistentes, 12, 0)) + GXutil.newLine( ) ;
      AV46Var_messages += httpContext.getMessage( "Registros Duplicados= ", "") + GXutil.trim( GXutil.str( AV49CantidadRegistroscreados, 12, 0)) ;
      httpContext.GX_msglist.addItem(AV46Var_messages);
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S112( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV32Session.getValue(AV56Pgmname+"GridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV56Pgmname+"GridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV32Session.getValue(AV56Pgmname+"GridState"), null, null);
      }
      AV29OrderedBy = AV23GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29OrderedBy), 4, 0));
      AV30OrderedDsc = AV23GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30OrderedDsc", AV30OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S122 ();
      if (returnInSub) return;
      AV58GXV6 = 1 ;
      while ( AV58GXV6 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV58GXV6));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDUPLICARARTICULOS_SDT__ARTCOD") == 0 )
         {
            AV33TFDuplicarArticulos_SDT__Artcod = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFDuplicarArticulos_SDT__Artcod", AV33TFDuplicarArticulos_SDT__Artcod);
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDUPLICARARTICULOS_SDT__ARTDSC") == 0 )
         {
            AV34TFDuplicarArticulos_SDT__ArtDsc = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFDuplicarArticulos_SDT__ArtDsc", AV34TFDuplicarArticulos_SDT__ArtDsc);
         }
         AV58GXV6 = (int)(AV58GXV6+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFDuplicarArticulos_SDT__Artcod)==0), AV33TFDuplicarArticulos_SDT__Artcod, GXv_char4) ;
      duplicararticulos_1_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char10 = "" ;
      GXv_char3[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFDuplicarArticulos_SDT__ArtDsc)==0), AV34TFDuplicarArticulos_SDT__ArtDsc, GXv_char3) ;
      duplicararticulos_1_wc_impl.this.GXt_char10 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = GXt_char1+"|"+GXt_char10 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV23GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV23GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV23GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV23GridState.fromxml(AV32Session.getValue(AV56Pgmname+"GridState"), null, null);
      AV23GridState.setgxTv_SdtWWPGridState_Orderedby( AV29OrderedBy );
      AV23GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV30OrderedDsc );
      AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState11[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState11, "TFDUPLICARARTICULOS_SDT__ARTCOD", "", !(GXutil.strcmp("", AV33TFDuplicarArticulos_SDT__Artcod)==0), (short)(0), AV33TFDuplicarArticulos_SDT__Artcod, "") ;
      AV23GridState = GXv_SdtWWPGridState11[0] ;
      GXv_SdtWWPGridState11[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState11, "TFDUPLICARARTICULOS_SDT__ARTDSC", "", !(GXutil.strcmp("", AV34TFDuplicarArticulos_SDT__ArtDsc)==0), (short)(0), AV34TFDuplicarArticulos_SDT__ArtDsc, "") ;
      AV23GridState = GXv_SdtWWPGridState11[0] ;
      AV23GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV23GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV56Pgmname+"GridState", AV23GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S162( )
   {
      /* 'APLICOGRID' Routine */
      returnInSub = false ;
      AV26i = (short)(1) ;
      while ( AV26i <= AV19DuplicarArticulos_SDT.size() )
      {
         ((app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem)AV19DuplicarArticulos_SDT.elementAt(-1+AV26i)).setgxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Seleccionar( AV37Var_seleccionar );
         AV26i = (short)(AV26i+1) ;
      }
   }

   public void wb_table1_78_26C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_confirmar_Internalname, tblTabledvelop_confirmpanel_confirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_confirmar.setProperty("Title", Dvelop_confirmpanel_confirmar_Title);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_confirmar_Confirmationtext);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_confirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_confirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_confirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_confirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmType", Dvelop_confirmpanel_confirmar_Confirmtype);
         ucDvelop_confirmpanel_confirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_confirmar_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_78_26C2e( true) ;
      }
      else
      {
         wb_table1_78_26C2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV6EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6EmprCod", AV6EmprCod);
      AV15CliCodOrig = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15CliCodOrig", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCodOrig), 6, 0));
      AV17CliNomOrig = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17CliNomOrig", AV17CliNomOrig);
      AV14CliCodDes = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14CliCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CliCodDes), 6, 0));
      AV13ClicNomDes = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13ClicNomDes", AV13ClicNomDes);
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
      pa26C2( ) ;
      ws26C2( ) ;
      we26C2( ) ;
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
      sCtrlAV15CliCodOrig = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV17CliNomOrig = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV14CliCodDes = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV13ClicNomDes = (String)getParm(obj,4,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa26C2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "ficherosbasicos\\duplicararticulos_1_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa26C2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV6EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6EmprCod", AV6EmprCod);
         AV15CliCodOrig = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15CliCodOrig", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCodOrig), 6, 0));
         AV17CliNomOrig = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17CliNomOrig", AV17CliNomOrig);
         AV14CliCodDes = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14CliCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CliCodDes), 6, 0));
         AV13ClicNomDes = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13ClicNomDes", AV13ClicNomDes);
      }
      wcpOAV6EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV6EmprCod") ;
      wcpOAV15CliCodOrig = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV15CliCodOrig"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV17CliNomOrig = httpContext.cgiGet( sPrefix+"wcpOAV17CliNomOrig") ;
      wcpOAV14CliCodDes = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV14CliCodDes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV13ClicNomDes = httpContext.cgiGet( sPrefix+"wcpOAV13ClicNomDes") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV6EmprCod, wcpOAV6EmprCod) != 0 ) || ( AV15CliCodOrig != wcpOAV15CliCodOrig ) || ( GXutil.strcmp(AV17CliNomOrig, wcpOAV17CliNomOrig) != 0 ) || ( AV14CliCodDes != wcpOAV14CliCodDes ) || ( GXutil.strcmp(AV13ClicNomDes, wcpOAV13ClicNomDes) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV6EmprCod = AV6EmprCod ;
      wcpOAV15CliCodOrig = AV15CliCodOrig ;
      wcpOAV17CliNomOrig = AV17CliNomOrig ;
      wcpOAV14CliCodDes = AV14CliCodDes ;
      wcpOAV13ClicNomDes = AV13ClicNomDes ;
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
      sCtrlAV15CliCodOrig = httpContext.cgiGet( sPrefix+"AV15CliCodOrig_CTRL") ;
      if ( GXutil.len( sCtrlAV15CliCodOrig) > 0 )
      {
         AV15CliCodOrig = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV15CliCodOrig), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15CliCodOrig", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCodOrig), 6, 0));
      }
      else
      {
         AV15CliCodOrig = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV15CliCodOrig_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV17CliNomOrig = httpContext.cgiGet( sPrefix+"AV17CliNomOrig_CTRL") ;
      if ( GXutil.len( sCtrlAV17CliNomOrig) > 0 )
      {
         AV17CliNomOrig = httpContext.cgiGet( sCtrlAV17CliNomOrig) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17CliNomOrig", AV17CliNomOrig);
      }
      else
      {
         AV17CliNomOrig = httpContext.cgiGet( sPrefix+"AV17CliNomOrig_PARM") ;
      }
      sCtrlAV14CliCodDes = httpContext.cgiGet( sPrefix+"AV14CliCodDes_CTRL") ;
      if ( GXutil.len( sCtrlAV14CliCodDes) > 0 )
      {
         AV14CliCodDes = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV14CliCodDes), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14CliCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CliCodDes), 6, 0));
      }
      else
      {
         AV14CliCodDes = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV14CliCodDes_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV13ClicNomDes = httpContext.cgiGet( sPrefix+"AV13ClicNomDes_CTRL") ;
      if ( GXutil.len( sCtrlAV13ClicNomDes) > 0 )
      {
         AV13ClicNomDes = httpContext.cgiGet( sCtrlAV13ClicNomDes) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13ClicNomDes", AV13ClicNomDes);
      }
      else
      {
         AV13ClicNomDes = httpContext.cgiGet( sPrefix+"AV13ClicNomDes_PARM") ;
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
      pa26C2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws26C2( ) ;
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
      ws26C2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15CliCodOrig_PARM", GXutil.ltrim( localUtil.ntoc( AV15CliCodOrig, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV15CliCodOrig)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15CliCodOrig_CTRL", GXutil.rtrim( sCtrlAV15CliCodOrig));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17CliNomOrig_PARM", GXutil.rtrim( AV17CliNomOrig));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV17CliNomOrig)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17CliNomOrig_CTRL", GXutil.rtrim( sCtrlAV17CliNomOrig));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14CliCodDes_PARM", GXutil.ltrim( localUtil.ntoc( AV14CliCodDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV14CliCodDes)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14CliCodDes_CTRL", GXutil.rtrim( sCtrlAV14CliCodDes));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13ClicNomDes_PARM", GXutil.rtrim( AV13ClicNomDes));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV13ClicNomDes)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13ClicNomDes_CTRL", GXutil.rtrim( sCtrlAV13ClicNomDes));
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
      we26C2( ) ;
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
      httpContext.AddStyleSheetFile("GXProgressIndicator/css/bootstrap-progressbar-3.0.1.css", "");
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115552268", true, true);
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
      httpContext.AddJavascriptSource("ficherosbasicos/duplicararticulos_1_wc.js", "?202682115552268", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_602( )
   {
      chkavDuplicararticulos_sdt__seleccionar.setInternalname( sPrefix+"DUPLICARARTICULOS_SDT__SELECCIONAR_"+sGXsfl_60_idx );
      edtavDuplicararticulos_sdt__artcod_Internalname = sPrefix+"DUPLICARARTICULOS_SDT__ARTCOD_"+sGXsfl_60_idx ;
      edtavDuplicararticulos_sdt__artdsc_Internalname = sPrefix+"DUPLICARARTICULOS_SDT__ARTDSC_"+sGXsfl_60_idx ;
   }

   public void subsflControlProps_fel_602( )
   {
      chkavDuplicararticulos_sdt__seleccionar.setInternalname( sPrefix+"DUPLICARARTICULOS_SDT__SELECCIONAR_"+sGXsfl_60_fel_idx );
      edtavDuplicararticulos_sdt__artcod_Internalname = sPrefix+"DUPLICARARTICULOS_SDT__ARTCOD_"+sGXsfl_60_fel_idx ;
      edtavDuplicararticulos_sdt__artdsc_Internalname = sPrefix+"DUPLICARARTICULOS_SDT__ARTDSC_"+sGXsfl_60_fel_idx ;
   }

   public void sendrow_602( )
   {
      subsflControlProps_602( ) ;
      wb26C0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_60_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_60_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_60_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavDuplicararticulos_sdt__seleccionar.getEnabled()!=0)&&(chkavDuplicararticulos_sdt__seleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 61,'"+sPrefix+"',false,'"+sGXsfl_60_idx+"',60)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "DUPLICARARTICULOS_SDT__SELECCIONAR_" + sGXsfl_60_idx ;
         chkavDuplicararticulos_sdt__seleccionar.setName( GXCCtl );
         chkavDuplicararticulos_sdt__seleccionar.setWebtags( "" );
         chkavDuplicararticulos_sdt__seleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavDuplicararticulos_sdt__seleccionar.getInternalname(), "TitleCaption", chkavDuplicararticulos_sdt__seleccionar.getCaption(), !bGXsfl_60_Refreshing);
         chkavDuplicararticulos_sdt__seleccionar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavDuplicararticulos_sdt__seleccionar.getInternalname(),GXutil.booltostr( ((app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem)AV19DuplicarArticulos_SDT.elementAt(-1+AV52GXV1)).getgxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Seleccionar()),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(61, this, 'true', 'false',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+((chkavDuplicararticulos_sdt__seleccionar.getEnabled()!=0)&&(chkavDuplicararticulos_sdt__seleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,61);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDuplicararticulos_sdt__artcod_Internalname,GXutil.rtrim( ((app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem)AV19DuplicarArticulos_SDT.elementAt(-1+AV52GXV1)).getgxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artcod()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDuplicararticulos_sdt__artcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDuplicararticulos_sdt__artcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDuplicararticulos_sdt__artdsc_Internalname,GXutil.rtrim( ((app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem)AV19DuplicarArticulos_SDT.elementAt(-1+AV52GXV1)).getgxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDuplicararticulos_sdt__artdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDuplicararticulos_sdt__artdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes26C2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_60_idx = ((subGrid_Islastpage==1)&&(nGXsfl_60_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_602( ) ;
      }
      /* End function sendrow_602 */
   }

   public void startgridcontrol60( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"60\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Seleccionar", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
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
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDuplicararticulos_sdt__artcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDuplicararticulos_sdt__artdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavClicodorig_Internalname = sPrefix+"vCLICODORIG" ;
      edtavClinomorig_Internalname = sPrefix+"vCLINOMORIG" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      grpUnnamedgroup3_Internalname = sPrefix+"UNNAMEDGROUP3" ;
      edtavClicoddes_Internalname = sPrefix+"vCLICODDES" ;
      edtavClicnomdes_Internalname = sPrefix+"vCLICNOMDES" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      grpUnnamedgroup5_Internalname = sPrefix+"UNNAMEDGROUP5" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      bttBtnconfirmar_Internalname = sPrefix+"BTNCONFIRMAR" ;
      bttBtnmarcartodas_Internalname = sPrefix+"BTNMARCARTODAS" ;
      bttBtndesmarcartodas_Internalname = sPrefix+"BTNDESMARCARTODAS" ;
      Barradeprogreso_Internalname = sPrefix+"BARRADEPROGRESO" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      chkavDuplicararticulos_sdt__seleccionar.setInternalname( sPrefix+"DUPLICARARTICULOS_SDT__SELECCIONAR" );
      edtavDuplicararticulos_sdt__artcod_Internalname = sPrefix+"DUPLICARARTICULOS_SDT__ARTCOD" ;
      edtavDuplicararticulos_sdt__artdsc_Internalname = sPrefix+"DUPLICARARTICULOS_SDT__ARTDSC" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Dvelop_confirmpanel_confirmar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR" ;
      tblTabledvelop_confirmpanel_confirmar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_CONFIRMAR" ;
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
      edtavDuplicararticulos_sdt__artdsc_Jsonclick = "" ;
      edtavDuplicararticulos_sdt__artdsc_Enabled = 0 ;
      edtavDuplicararticulos_sdt__artcod_Jsonclick = "" ;
      edtavDuplicararticulos_sdt__artcod_Enabled = 0 ;
      chkavDuplicararticulos_sdt__seleccionar.setCaption( "" );
      chkavDuplicararticulos_sdt__seleccionar.setVisible( -1 );
      chkavDuplicararticulos_sdt__seleccionar.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavDuplicararticulos_sdt__artdsc_Enabled = -1 ;
      edtavDuplicararticulos_sdt__artcod_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavClicnomdes_Jsonclick = "" ;
      edtavClicnomdes_Enabled = 0 ;
      edtavClicoddes_Jsonclick = "" ;
      edtavClicoddes_Enabled = 0 ;
      edtavClinomorig_Jsonclick = "" ;
      edtavClinomorig_Enabled = 0 ;
      edtavClicodorig_Jsonclick = "" ;
      edtavClicodorig_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "¿Confirma Datos?" ;
      Dvelop_confirmpanel_confirmar_Title = "" ;
      Ddo_grid_Filtertype = "Character|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2" ;
      Ddo_grid_Columnids = "1:DuplicarArticulos_SDT__Artcod|2:DuplicarArticulos_SDT__ArtDsc" ;
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
      GXCCtl = "DUPLICARARTICULOS_SDT__SELECCIONAR_" + sGXsfl_60_idx ;
      chkavDuplicararticulos_sdt__seleccionar.setName( GXCCtl );
      chkavDuplicararticulos_sdt__seleccionar.setWebtags( "" );
      chkavDuplicararticulos_sdt__seleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavDuplicararticulos_sdt__seleccionar.getInternalname(), "TitleCaption", chkavDuplicararticulos_sdt__seleccionar.getCaption(), !bGXsfl_60_Refreshing);
      chkavDuplicararticulos_sdt__seleccionar.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV56Pgmname',fld:'vPGMNAME',pic:''},{av:'AV29OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV30OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33TFDuplicarArticulos_SDT__Artcod',fld:'vTFDUPLICARARTICULOS_SDT__ARTCOD',pic:''},{av:'AV34TFDuplicarArticulos_SDT__ArtDsc',fld:'vTFDUPLICARARTICULOS_SDT__ARTDSC',pic:''},{av:'AV19DuplicarArticulos_SDT',fld:'vDUPLICARARTICULOS_SDT',grid:60,pic:''},{av:'nGXsfl_60_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:60},{av:'nRC_GXsfl_60',ctrl:'GRID',prop:'GridRC',grid:60},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV15CliCodOrig',fld:'vCLICODORIG',pic:'ZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV21GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV22GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV19DuplicarArticulos_SDT',fld:'vDUPLICARARTICULOS_SDT',grid:60,pic:''},{av:'nGXsfl_60_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:60},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_60',ctrl:'GRID',prop:'GridRC',grid:60}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1226C2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV56Pgmname',fld:'vPGMNAME',pic:''},{av:'AV29OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV30OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33TFDuplicarArticulos_SDT__Artcod',fld:'vTFDUPLICARARTICULOS_SDT__ARTCOD',pic:''},{av:'AV34TFDuplicarArticulos_SDT__ArtDsc',fld:'vTFDUPLICARARTICULOS_SDT__ARTDSC',pic:''},{av:'AV19DuplicarArticulos_SDT',fld:'vDUPLICARARTICULOS_SDT',grid:60,pic:''},{av:'nGXsfl_60_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:60},{av:'nRC_GXsfl_60',ctrl:'GRID',prop:'GridRC',grid:60},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV15CliCodOrig',fld:'vCLICODORIG',pic:'ZZZZZ9'},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1326C2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV56Pgmname',fld:'vPGMNAME',pic:''},{av:'AV29OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV30OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33TFDuplicarArticulos_SDT__Artcod',fld:'vTFDUPLICARARTICULOS_SDT__ARTCOD',pic:''},{av:'AV34TFDuplicarArticulos_SDT__ArtDsc',fld:'vTFDUPLICARARTICULOS_SDT__ARTDSC',pic:''},{av:'AV19DuplicarArticulos_SDT',fld:'vDUPLICARARTICULOS_SDT',grid:60,pic:''},{av:'nGXsfl_60_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:60},{av:'nRC_GXsfl_60',ctrl:'GRID',prop:'GridRC',grid:60},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV15CliCodOrig',fld:'vCLICODORIG',pic:'ZZZZZ9'},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1426C2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV56Pgmname',fld:'vPGMNAME',pic:''},{av:'AV29OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV30OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33TFDuplicarArticulos_SDT__Artcod',fld:'vTFDUPLICARARTICULOS_SDT__ARTCOD',pic:''},{av:'AV34TFDuplicarArticulos_SDT__ArtDsc',fld:'vTFDUPLICARARTICULOS_SDT__ARTDSC',pic:''},{av:'AV19DuplicarArticulos_SDT',fld:'vDUPLICARARTICULOS_SDT',grid:60,pic:''},{av:'nGXsfl_60_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:60},{av:'nRC_GXsfl_60',ctrl:'GRID',prop:'GridRC',grid:60},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV15CliCodOrig',fld:'vCLICODORIG',pic:'ZZZZZ9'},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV29OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV30OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33TFDuplicarArticulos_SDT__Artcod',fld:'vTFDUPLICARARTICULOS_SDT__ARTCOD',pic:''},{av:'AV34TFDuplicarArticulos_SDT__ArtDsc',fld:'vTFDUPLICARARTICULOS_SDT__ARTDSC',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2026C2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e1126C1',iparms:[{av:'AV19DuplicarArticulos_SDT',fld:'vDUPLICARARTICULOS_SDT',grid:60,pic:''},{av:'nGXsfl_60_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:60},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_60',ctrl:'GRID',prop:'GridRC',grid:60},{av:'AV14CliCodDes',fld:'vCLICODDES',pic:'ZZZZZ9'},{av:'AV13ClicNomDes',fld:'vCLICNOMDES',pic:''}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV40CantidadRegistrosAProcesar',fld:'vCANTIDADREGISTROSAPROCESAR',pic:'ZZZZZZZZZZZ9'},{av:'Dvelop_confirmpanel_confirmar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e1526C2',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV56Pgmname',fld:'vPGMNAME',pic:''},{av:'AV29OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV30OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33TFDuplicarArticulos_SDT__Artcod',fld:'vTFDUPLICARARTICULOS_SDT__ARTCOD',pic:''},{av:'AV34TFDuplicarArticulos_SDT__ArtDsc',fld:'vTFDUPLICARARTICULOS_SDT__ARTDSC',pic:''},{av:'AV19DuplicarArticulos_SDT',fld:'vDUPLICARARTICULOS_SDT',grid:60,pic:''},{av:'nGXsfl_60_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:60},{av:'nRC_GXsfl_60',ctrl:'GRID',prop:'GridRC',grid:60},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV15CliCodOrig',fld:'vCLICODORIG',pic:'ZZZZZ9'},{av:'sPrefix'},{av:'AV14CliCodDes',fld:'vCLICODDES',pic:'ZZZZZ9'},{av:'AV40CantidadRegistrosAProcesar',fld:'vCANTIDADREGISTROSAPROCESAR',pic:'ZZZZZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV19DuplicarArticulos_SDT',fld:'vDUPLICARARTICULOS_SDT',grid:60,pic:''},{av:'nGXsfl_60_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:60},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_60',ctrl:'GRID',prop:'GridRC',grid:60},{av:'AV21GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV22GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOMARCARTODAS'","{handler:'e1626C2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV56Pgmname',fld:'vPGMNAME',pic:''},{av:'AV29OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV30OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33TFDuplicarArticulos_SDT__Artcod',fld:'vTFDUPLICARARTICULOS_SDT__ARTCOD',pic:''},{av:'AV34TFDuplicarArticulos_SDT__ArtDsc',fld:'vTFDUPLICARARTICULOS_SDT__ARTDSC',pic:''},{av:'AV19DuplicarArticulos_SDT',fld:'vDUPLICARARTICULOS_SDT',grid:60,pic:''},{av:'nGXsfl_60_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:60},{av:'nRC_GXsfl_60',ctrl:'GRID',prop:'GridRC',grid:60},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV15CliCodOrig',fld:'vCLICODORIG',pic:'ZZZZZ9'},{av:'sPrefix'},{av:'AV37Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:''}]");
      setEventMetadata("'DOMARCARTODAS'",",oparms:[{av:'AV37Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:''},{av:'AV19DuplicarArticulos_SDT',fld:'vDUPLICARARTICULOS_SDT',grid:60,pic:''},{av:'nGXsfl_60_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:60},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_60',ctrl:'GRID',prop:'GridRC',grid:60},{av:'AV21GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV22GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DODESMARCARTODAS'","{handler:'e1726C2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV56Pgmname',fld:'vPGMNAME',pic:''},{av:'AV29OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV30OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33TFDuplicarArticulos_SDT__Artcod',fld:'vTFDUPLICARARTICULOS_SDT__ARTCOD',pic:''},{av:'AV34TFDuplicarArticulos_SDT__ArtDsc',fld:'vTFDUPLICARARTICULOS_SDT__ARTDSC',pic:''},{av:'AV19DuplicarArticulos_SDT',fld:'vDUPLICARARTICULOS_SDT',grid:60,pic:''},{av:'nGXsfl_60_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:60},{av:'nRC_GXsfl_60',ctrl:'GRID',prop:'GridRC',grid:60},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV15CliCodOrig',fld:'vCLICODORIG',pic:'ZZZZZ9'},{av:'sPrefix'},{av:'AV37Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:''}]");
      setEventMetadata("'DODESMARCARTODAS'",",oparms:[{av:'AV37Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:''},{av:'AV19DuplicarArticulos_SDT',fld:'vDUPLICARARTICULOS_SDT',grid:60,pic:''},{av:'nGXsfl_60_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:60},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_60',ctrl:'GRID',prop:'GridRC',grid:60},{av:'AV21GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV22GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("NULL","{handler:'validv_Gxv4',iparms:[]");
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
      wcpOAV17CliNomOrig = "" ;
      wcpOAV13ClicNomDes = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV6EmprCod = "" ;
      AV17CliNomOrig = "" ;
      AV13ClicNomDes = "" ;
      AV56Pgmname = "" ;
      AV33TFDuplicarArticulos_SDT__Artcod = "" ;
      AV34TFDuplicarArticulos_SDT__ArtDsc = "" ;
      AV19DuplicarArticulos_SDT = new GXBaseCollection<app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem>(app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem.class, "DuplicarArticulos_SDTItem", "TexplusNET", remoteHandle);
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV18DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtnmarcartodas_Jsonclick = "" ;
      bttBtndesmarcartodas_Jsonclick = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      AV8Station = "" ;
      AV7EmprNom = "" ;
      AV9UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV38WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV39ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      AV20DuplicarArticulos_SDT_Aux = new GXBaseCollection<app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem>(app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem.class, "DuplicarArticulos_SDTItem", "TexplusNET", remoteHandle);
      AV43messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV44DuplicarArticulos_SDTItem = new app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem(remoteHandle, context);
      AV5Artcod = "" ;
      AV11artdsc = "" ;
      AV10ArtcodDes = "" ;
      AV12Artdscdes = "" ;
      AV47Mensaje = "" ;
      GXv_char2 = new String[1] ;
      AV45message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      GXt_objcol_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem8 = new GXBaseCollection<app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem>(app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem.class, "DuplicarArticulos_SDTItem", "TexplusNET", remoteHandle);
      GXv_objcol_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem9 = new GXBaseCollection[1] ;
      AV46Var_messages = "" ;
      AV32Session = httpContext.getWebSession();
      AV23GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV24GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char10 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState11 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV6EmprCod = "" ;
      sCtrlAV15CliCodOrig = "" ;
      sCtrlAV17CliNomOrig = "" ;
      sCtrlAV14CliCodDes = "" ;
      sCtrlAV13ClicNomDes = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV56Pgmname = "FicherosBasicos.DuplicarArticulos_1_WC" ;
      /* GeneXus formulas. */
      AV56Pgmname = "FicherosBasicos.DuplicarArticulos_1_WC" ;
      Gx_err = (short)(0) ;
      edtavClicodorig_Enabled = 0 ;
      edtavClinomorig_Enabled = 0 ;
      edtavClicoddes_Enabled = 0 ;
      edtavClicnomdes_Enabled = 0 ;
      edtavDuplicararticulos_sdt__artcod_Enabled = 0 ;
      edtavDuplicararticulos_sdt__artdsc_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nDraw ;
   private byte nDoneStart ;
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
   private short AV29OrderedBy ;
   private short AV26i ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV28j ;
   private short AV42Porcentaje ;
   private int wcpOAV15CliCodOrig ;
   private int wcpOAV14CliCodDes ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_60 ;
   private int AV15CliCodOrig ;
   private int AV14CliCodDes ;
   private int nGXsfl_60_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavClicodorig_Enabled ;
   private int edtavClinomorig_Enabled ;
   private int edtavClicoddes_Enabled ;
   private int edtavClicnomdes_Enabled ;
   private int AV52GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavDuplicararticulos_sdt__artcod_Enabled ;
   private int edtavDuplicararticulos_sdt__artdsc_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_60_fel_idx=1 ;
   private int AV31PageToGo ;
   private int nGXsfl_60_bak_idx=1 ;
   private int AV57GXV5 ;
   private int AV58GXV6 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV21GridCurrentPage ;
   private long AV22GridPageCount ;
   private long AV40CantidadRegistrosAProcesar ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long AV41CantidadRegistrosProcesados ;
   private long AV48CantidadRegistrosexistentes ;
   private long AV49CantidadRegistroscreados ;
   private String wcpOAV6EmprCod ;
   private String wcpOAV17CliNomOrig ;
   private String wcpOAV13ClicNomDes ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV6EmprCod ;
   private String AV17CliNomOrig ;
   private String AV13ClicNomDes ;
   private String sGXsfl_60_idx="0001" ;
   private String AV56Pgmname ;
   private String AV33TFDuplicarArticulos_SDT__Artcod ;
   private String AV34TFDuplicarArticulos_SDT__ArtDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Dvelop_confirmpanel_confirmar_Title ;
   private String Dvelop_confirmpanel_confirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_confirmar_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String grpUnnamedgroup3_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavClicodorig_Internalname ;
   private String edtavClicodorig_Jsonclick ;
   private String edtavClinomorig_Internalname ;
   private String edtavClinomorig_Jsonclick ;
   private String grpUnnamedgroup5_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavClicoddes_Internalname ;
   private String edtavClicoddes_Jsonclick ;
   private String edtavClicnomdes_Internalname ;
   private String edtavClicnomdes_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtnmarcartodas_Internalname ;
   private String bttBtnmarcartodas_Jsonclick ;
   private String bttBtndesmarcartodas_Internalname ;
   private String bttBtndesmarcartodas_Jsonclick ;
   private String Barradeprogreso_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavDuplicararticulos_sdt__artcod_Internalname ;
   private String edtavDuplicararticulos_sdt__artdsc_Internalname ;
   private String sGXsfl_60_fel_idx="0001" ;
   private String hsh ;
   private String AV8Station ;
   private String AV7EmprNom ;
   private String AV9UsurCod ;
   private String AV5Artcod ;
   private String AV11artdsc ;
   private String AV10ArtcodDes ;
   private String AV12Artdscdes ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char10 ;
   private String GXv_char3[] ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String sCtrlAV6EmprCod ;
   private String sCtrlAV15CliCodOrig ;
   private String sCtrlAV17CliNomOrig ;
   private String sCtrlAV14CliCodDes ;
   private String sCtrlAV13ClicNomDes ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavDuplicararticulos_sdt__artcod_Jsonclick ;
   private String edtavDuplicararticulos_sdt__artdsc_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV30OrderedDsc ;
   private boolean AV37Var_seleccionar ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_60_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean gx_BV60 ;
   private String AV46Var_messages ;
   private String AV47Mensaje ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV32Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavDuplicararticulos_sdt__seleccionar ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV43messages ;
   private GXBaseCollection<app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem> AV19DuplicarArticulos_SDT ;
   private GXBaseCollection<app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem> AV20DuplicarArticulos_SDT_Aux ;
   private GXBaseCollection<app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem> GXt_objcol_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem8 ;
   private GXBaseCollection<app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem> GXv_objcol_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem9[] ;
   private com.genexus.SdtMessages_Message AV45message ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV18DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.ficherosbasicos.SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem AV44DuplicarArticulos_SDTItem ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState11[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV39ProgressIndicator ;
   private app.wwpbaseobjects.SdtWWPContext AV38WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

