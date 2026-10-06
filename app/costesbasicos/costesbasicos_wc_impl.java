package app.costesbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class costesbasicos_wc_impl extends GXWebComponent
{
   public costesbasicos_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public costesbasicos_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( costesbasicos_wc_impl.class ));
   }

   public costesbasicos_wc_impl( int remoteHandle ,
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
            gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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
               AV28Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
               AV29Clicodfrom = (int)(GXutil.lval( httpContext.GetPar( "Clicodfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Clicodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Clicodfrom), 6, 0));
               AV30Clicodto = (int)(GXutil.lval( httpContext.GetPar( "Clicodto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Clicodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Clicodto), 6, 0));
               AV31barfecgenfrom = localUtil.parseDateParm( httpContext.GetPar( "barfecgenfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31barfecgenfrom", localUtil.format(AV31barfecgenfrom, "99/99/99"));
               AV32barfecgento = localUtil.parseDateParm( httpContext.GetPar( "barfecgento")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32barfecgento", localUtil.format(AV32barfecgento, "99/99/99"));
               AV33barfecsalfrom = localUtil.parseDateParm( httpContext.GetPar( "barfecsalfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33barfecsalfrom", localUtil.format(AV33barfecsalfrom, "99/99/99"));
               AV34barfecsalto = localUtil.parseDateParm( httpContext.GetPar( "barfecsalto")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34barfecsalto", localUtil.format(AV34barfecsalto, "99/99/99"));
               AV35artcod = httpContext.GetPar( "artcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35artcod", AV35artcod);
               AV36barcod = (int)(GXutil.lval( httpContext.GetPar( "barcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36barcod), 8, 0));
               AV37barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37barcodreo", GXutil.str( AV37barcodreo, 1, 0));
               AV38barcodpar = httpContext.GetPar( "barcodpar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38barcodpar", AV38barcodpar);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV28Emprcod,Integer.valueOf(AV29Clicodfrom),Integer.valueOf(AV30Clicodto),AV31barfecgenfrom,AV32barfecgento,AV33barfecsalfrom,AV34barfecsalto,AV35artcod,Integer.valueOf(AV36barcod),Byte.valueOf(AV37barcodreo),AV38barcodpar});
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
               gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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
      nRC_GXsfl_41 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_41"))) ;
      nGXsfl_41_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_41_idx"))) ;
      sGXsfl_41_idx = httpContext.GetPar( "sGXsfl_41_idx") ;
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
      AV23ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV18ColumnsSelector);
      AV102Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV28Emprcod = httpContext.GetPar( "Emprcod") ;
      AV29Clicodfrom = (int)(GXutil.lval( httpContext.GetPar( "Clicodfrom"))) ;
      AV30Clicodto = (int)(GXutil.lval( httpContext.GetPar( "Clicodto"))) ;
      AV31barfecgenfrom = localUtil.parseDateParm( httpContext.GetPar( "barfecgenfrom")) ;
      AV32barfecgento = localUtil.parseDateParm( httpContext.GetPar( "barfecgento")) ;
      AV33barfecsalfrom = localUtil.parseDateParm( httpContext.GetPar( "barfecsalfrom")) ;
      AV34barfecsalto = localUtil.parseDateParm( httpContext.GetPar( "barfecsalto")) ;
      AV35artcod = httpContext.GetPar( "artcod") ;
      AV36barcod = (int)(GXutil.lval( httpContext.GetPar( "barcod"))) ;
      AV37barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "barcodreo"))) ;
      AV38barcodpar = httpContext.GetPar( "barcodpar") ;
      AV43TasasEstandar = (short)(GXutil.lval( httpContext.GetPar( "TasasEstandar"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV13CostesBasicos_SDT);
      AV42CostesBasicos_SDTjson = httpContext.GetPar( "CostesBasicos_SDTjson") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV102Pgmname, AV12FilterFullText, AV28Emprcod, AV29Clicodfrom, AV30Clicodto, AV31barfecgenfrom, AV32barfecgento, AV33barfecsalfrom, AV34barfecsalto, AV35artcod, AV36barcod, AV37barcodreo, AV38barcodpar, AV43TasasEstandar, AV13CostesBasicos_SDT, AV42CostesBasicos_SDTjson, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa2DB2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Costes Basicos", "")) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.costesbasicos.costesbasicos_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV28Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV29Clicodfrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV30Clicodto,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV31barfecgenfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV32barfecgento)),GXutil.URLEncode(GXutil.formatDateParm(AV33barfecsalfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV34barfecsalto)),GXutil.URLEncode(GXutil.rtrim(AV35artcod)),GXutil.URLEncode(GXutil.ltrimstr(AV36barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV37barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV38barcodpar))}, new String[] {"Emprcod","Clicodfrom","Clicodto","barfecgenfrom","barfecgento","barfecsalfrom","barfecsalto","artcod","barcod","barcodreo","barcodpar"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTASASESTANDAR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV43TasasEstandar), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTESBASICOS_SDTJSON", getSecureSignedToken( sPrefix, AV42CostesBasicos_SDTjson));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTESBASICOS_SDT", getSecureSignedToken( sPrefix, AV13CostesBasicos_SDT));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"CostesBasicos_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV102Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("costesbasicos\\costesbasicos_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Costesbasicos_sdt", AV13CostesBasicos_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Costesbasicos_sdt", AV13CostesBasicos_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_Costesbasicos_sdt", getSecureSignedToken( sPrefix, AV13CostesBasicos_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_41", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_41, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV21ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV21ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV26GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV27GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV24DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV24DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV18ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV18ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV28Emprcod", GXutil.rtrim( wcpOAV28Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV29Clicodfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV29Clicodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30Clicodto", GXutil.ltrim( localUtil.ntoc( wcpOAV30Clicodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV31barfecgenfrom", localUtil.dtoc( wcpOAV31barfecgenfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV32barfecgento", localUtil.dtoc( wcpOAV32barfecgento, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33barfecsalfrom", localUtil.dtoc( wcpOAV33barfecsalfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34barfecsalto", localUtil.dtoc( wcpOAV34barfecsalto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV35artcod", GXutil.rtrim( wcpOAV35artcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV36barcod", GXutil.ltrim( localUtil.ntoc( wcpOAV36barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV37barcodreo", GXutil.ltrim( localUtil.ntoc( wcpOAV37barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV38barcodpar", GXutil.rtrim( wcpOAV38barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV23ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV28Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODFROM", GXutil.ltrim( localUtil.ntoc( AV29Clicodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODTO", GXutil.ltrim( localUtil.ntoc( AV30Clicodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECGENFROM", localUtil.dtoc( AV31barfecgenfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECGENTO", localUtil.dtoc( AV32barfecgento, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECSALFROM", localUtil.dtoc( AV33barfecsalfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECSALTO", localUtil.dtoc( AV34barfecsalto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vARTCOD", GXutil.rtrim( AV35artcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD", GXutil.ltrim( localUtil.ntoc( AV36barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV37barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR", GXutil.rtrim( AV38barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTASASESTANDAR", GXutil.ltrim( localUtil.ntoc( AV43TasasEstandar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTASASESTANDAR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV43TasasEstandar), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOSTESBASICOS_SDTJSON", AV42CostesBasicos_SDTjson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTESBASICOS_SDTJSON", getSecureSignedToken( sPrefix, AV42CostesBasicos_SDTjson));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOSTESBASICOS_SDT", AV13CostesBasicos_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOSTESBASICOS_SDT", AV13CostesBasicos_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTESBASICOS_SDT", getSecureSignedToken( sPrefix, AV13CostesBasicos_SDT));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm2DB2( )
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
         if ( ! ( WebComp_Grid_dwc == null ) )
         {
            WebComp_Grid_dwc.componentjscripts();
         }
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
      return "CostesBasicos.CostesBasicos_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Costes Basicos", "") ;
   }

   public void wb2DB0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.costesbasicos.costesbasicos_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesBasicos\\CostesBasicos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesBasicos\\CostesBasicos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesBasicos\\CostesBasicos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_2DB2( true) ;
      }
      else
      {
         wb_table1_23_2DB2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_2DB2e( boolean wbgen )
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
         startgridcontrol41( ) ;
      }
      if ( wbEnd == 41 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_41 = (int)(nGXsfl_41_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV67GXV1 = nGXsfl_41_idx ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV26GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV27GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divCell_grid_dwc_Internalname, 1, 0, "px", 0, "px", divCell_grid_dwc_Class, "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0082"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0082"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_41_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0082"+"");
                  }
                  WebComp_Grid_dwc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspEndCmp();
                  }
               }
            }
            httpContext.writeText( "</div>") ;
         }
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV102Pgmname), GXutil.rtrim( localUtil.format( AV102Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CostesBasicos\\CostesBasicos_WC.htm");
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
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV24DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV24DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV18ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 41 )
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
               AV67GXV1 = nGXsfl_41_idx ;
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

   public void start2DB2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Costes Basicos", ""), (short)(0)) ;
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
            strup2DB0( ) ;
         }
      }
   }

   public void ws2DB2( )
   {
      start2DB2( ) ;
      evt2DB2( ) ;
   }

   public void evt2DB2( )
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
                              strup2DB0( ) ;
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
                              strup2DB0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e112DB2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DB0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e122DB2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DB0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e132DB2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DB0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e142DB2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DB0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e152DB2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DB0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e162DB2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DB0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavCostesbasicos_sdt__clicod_Internalname ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 25), "VDETAILWEBCOMPONENT.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 25), "VDETAILWEBCOMPONENT.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DB0( ) ;
                           }
                           nGXsfl_41_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_412( ) ;
                           AV67GXV1 = (int)(nGXsfl_41_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV13CostesBasicos_SDT.size() >= AV67GXV1 ) && ( AV67GXV1 > 0 ) )
                           {
                              AV13CostesBasicos_SDT.currentItem( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)) );
                              AV46DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV46DetailWebComponent);
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
                                       GX_FocusControl = edtavCostesbasicos_sdt__clicod_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e172DB2 ();
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
                                       GX_FocusControl = edtavCostesbasicos_sdt__clicod_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e182DB2 ();
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
                                       GX_FocusControl = edtavCostesbasicos_sdt__clicod_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e192DB2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VDETAILWEBCOMPONENT.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavCostesbasicos_sdt__clicod_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e202DB2 ();
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
                                    strup2DB0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavCostesbasicos_sdt__clicod_Internalname ;
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 82 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( sPrefix+"W0082") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess(sPrefix+"W0082", "", sEvt);
                        }
                        WebComp_Grid_dwc_Component = OldGrid_dwc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we2DB2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2DB2( ) ;
         }
      }
   }

   public void pa2DB2( )
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
      subsflControlProps_412( ) ;
      while ( nGXsfl_41_idx <= nRC_GXsfl_41 )
      {
         sendrow_412( ) ;
         nGXsfl_41_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 byte AV23ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ,
                                 String AV102Pgmname ,
                                 String AV12FilterFullText ,
                                 String AV28Emprcod ,
                                 int AV29Clicodfrom ,
                                 int AV30Clicodto ,
                                 java.util.Date AV31barfecgenfrom ,
                                 java.util.Date AV32barfecgento ,
                                 java.util.Date AV33barfecsalfrom ,
                                 java.util.Date AV34barfecsalto ,
                                 String AV35artcod ,
                                 int AV36barcod ,
                                 byte AV37barcodreo ,
                                 String AV38barcodpar ,
                                 short AV43TasasEstandar ,
                                 GXBaseCollection<app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem> AV13CostesBasicos_SDT ,
                                 String AV42CostesBasicos_SDTjson ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e182DB2 ();
      GRID_nCurrentRecord = 0 ;
      rf2DB2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"CostesBasicos_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV102Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("costesbasicos\\costesbasicos_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf2DB2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV102Pgmname = "CostesBasicos.CostesBasicos_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102Pgmname", AV102Pgmname);
      Gx_err = (short)(0) ;
      edtavCostesbasicos_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__clicod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__clinom_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barcod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barcodreo_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barcodpar_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barnhdr_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barser_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barserdsc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__bartipart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__bartipart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__bartipart_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barcolnom_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barcolnum_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barkgm_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barmtr_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__coste_p_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__coste_p_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__coste_p_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__costequimicoacumulado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__costequimicoacumulado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__costequimicoacumulado_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__costefab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__costefab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__costefab_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__costefab2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__costefab2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__costefab2_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__costefabacumulado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__costefabacumulado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__costefabacumulado_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__valor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__valor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__valor_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__margen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__margen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__margen_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__txtalb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__txtalb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__txtalb_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barprekgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barprekgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barprekgm_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barfecgen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barfecgen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barfecgen_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barfecsal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barfecsal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barfecsal_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__mmod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__mmod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__mmod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__mmoi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__mmoi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__mmoi_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__menergia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__menergia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__menergia_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__mgas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__mgas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__mgas_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__magua_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__magua_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__magua_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__mgi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__mgi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__mgi_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__mam_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__mam_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__mam_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__madc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__madc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__madc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barunimed_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__costeteo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__costeteo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__costeteo_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2DB2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e182DB2 ();
      nGXsfl_41_idx = 1 ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_412( ) ;
      bGXsfl_41_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
            {
               WebComp_Grid_dwc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_412( ) ;
         e192DB2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_41_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e192DB2 ();
         }
         wbEnd = (short)(41) ;
         wb2DB0( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2DB2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTASASESTANDAR", GXutil.ltrim( localUtil.ntoc( AV43TasasEstandar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTASASESTANDAR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV43TasasEstandar), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOSTESBASICOS_SDTJSON", AV42CostesBasicos_SDTjson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTESBASICOS_SDTJSON", getSecureSignedToken( sPrefix, AV42CostesBasicos_SDTjson));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOSTESBASICOS_SDT", AV13CostesBasicos_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOSTESBASICOS_SDT", AV13CostesBasicos_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTESBASICOS_SDT", getSecureSignedToken( sPrefix, AV13CostesBasicos_SDT));
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
      return AV13CostesBasicos_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV102Pgmname, AV12FilterFullText, AV28Emprcod, AV29Clicodfrom, AV30Clicodto, AV31barfecgenfrom, AV32barfecgento, AV33barfecsalfrom, AV34barfecsalto, AV35artcod, AV36barcod, AV37barcodreo, AV38barcodpar, AV43TasasEstandar, AV13CostesBasicos_SDT, AV42CostesBasicos_SDTjson, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV102Pgmname, AV12FilterFullText, AV28Emprcod, AV29Clicodfrom, AV30Clicodto, AV31barfecgenfrom, AV32barfecgento, AV33barfecsalfrom, AV34barfecsalto, AV35artcod, AV36barcod, AV37barcodreo, AV38barcodpar, AV43TasasEstandar, AV13CostesBasicos_SDT, AV42CostesBasicos_SDTjson, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV102Pgmname, AV12FilterFullText, AV28Emprcod, AV29Clicodfrom, AV30Clicodto, AV31barfecgenfrom, AV32barfecgento, AV33barfecsalfrom, AV34barfecsalto, AV35artcod, AV36barcod, AV37barcodreo, AV38barcodpar, AV43TasasEstandar, AV13CostesBasicos_SDT, AV42CostesBasicos_SDTjson, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV102Pgmname, AV12FilterFullText, AV28Emprcod, AV29Clicodfrom, AV30Clicodto, AV31barfecgenfrom, AV32barfecgento, AV33barfecsalfrom, AV34barfecsalto, AV35artcod, AV36barcod, AV37barcodreo, AV38barcodpar, AV43TasasEstandar, AV13CostesBasicos_SDT, AV42CostesBasicos_SDTjson, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV102Pgmname, AV12FilterFullText, AV28Emprcod, AV29Clicodfrom, AV30Clicodto, AV31barfecgenfrom, AV32barfecgento, AV33barfecsalfrom, AV34barfecsalto, AV35artcod, AV36barcod, AV37barcodreo, AV38barcodpar, AV43TasasEstandar, AV13CostesBasicos_SDT, AV42CostesBasicos_SDTjson, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV102Pgmname = "CostesBasicos.CostesBasicos_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102Pgmname", AV102Pgmname);
      Gx_err = (short)(0) ;
      edtavCostesbasicos_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__clicod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__clinom_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barcod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barcodreo_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barcodpar_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barnhdr_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barser_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barserdsc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__bartipart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__bartipart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__bartipart_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barcolnom_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barcolnum_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barkgm_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barmtr_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__coste_p_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__coste_p_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__coste_p_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__costequimicoacumulado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__costequimicoacumulado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__costequimicoacumulado_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__costefab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__costefab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__costefab_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__costefab2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__costefab2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__costefab2_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__costefabacumulado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__costefabacumulado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__costefabacumulado_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__valor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__valor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__valor_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__margen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__margen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__margen_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__txtalb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__txtalb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__txtalb_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barprekgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barprekgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barprekgm_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barfecgen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barfecgen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barfecgen_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barfecsal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barfecsal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barfecsal_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__mmod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__mmod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__mmod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__mmoi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__mmoi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__mmoi_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__menergia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__menergia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__menergia_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__mgas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__mgas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__mgas_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__magua_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__magua_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__magua_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__mgi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__mgi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__mgi_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__mam_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__mam_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__mam_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__madc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__madc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__madc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barunimed_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__costeteo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__costeteo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__costeteo_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2DB0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e172DB2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Costesbasicos_sdt"), AV13CostesBasicos_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV21ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV24DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV18ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOSTESBASICOS_SDT"), AV13CostesBasicos_SDT);
         /* Read saved values. */
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV26GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV27GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV28Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV28Emprcod") ;
         wcpOAV29Clicodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV29Clicodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV30Clicodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV30Clicodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV31barfecgenfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV31barfecgenfrom"), 0) ;
         wcpOAV32barfecgento = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV32barfecgento"), 0) ;
         wcpOAV33barfecsalfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV33barfecsalfrom"), 0) ;
         wcpOAV34barfecsalto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV34barfecsalto"), 0) ;
         wcpOAV35artcod = httpContext.cgiGet( sPrefix+"wcpOAV35artcod") ;
         wcpOAV36barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV36barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV37barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV37barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV38barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV38barcodpar") ;
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
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
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
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_41_fel_idx = 0 ;
         while ( nGXsfl_41_fel_idx < nRC_GXsfl_41 )
         {
            nGXsfl_41_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_fel_idx+1) ;
            sGXsfl_41_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_412( ) ;
            AV67GXV1 = (int)(nGXsfl_41_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV13CostesBasicos_SDT.size() >= AV67GXV1 ) && ( AV67GXV1 > 0 ) )
            {
               AV13CostesBasicos_SDT.currentItem( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)) );
               AV46DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
            }
         }
         if ( nGXsfl_41_fel_idx == 0 )
         {
            nGXsfl_41_idx = 1 ;
            sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_412( ) ;
         }
         nGXsfl_41_fel_idx = 1 ;
         /* Read variables values. */
         AV12FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
         AV102Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102Pgmname", AV102Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"CostesBasicos_WC");
         AV102Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102Pgmname", AV102Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV102Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("costesbasicos\\costesbasicos_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e172DB2 ();
      if (returnInSub) return;
   }

   public void e172DB2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV39Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      costesbasicos_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV39Station = GXt_char1 ;
      GXv_char2[0] = AV28Emprcod ;
      GXv_char3[0] = AV40EmprNom ;
      GXv_char4[0] = AV41UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV39Station, GXv_char2, GXv_char3, GXv_char4) ;
      costesbasicos_wc_impl.this.AV28Emprcod = GXv_char2[0] ;
      costesbasicos_wc_impl.this.AV40EmprNom = GXv_char3[0] ;
      costesbasicos_wc_impl.this.AV41UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
      divCell_grid_dwc_Class = "Invisible WCD_"+GXutil.upper( subGrid_Internalname) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divCell_grid_dwc_Internalname, "Class", divCell_grid_dwc_Class, true);
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
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV24DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV24DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_char1 = AV42CostesBasicos_SDTjson ;
      GXv_char4[0] = GXt_char1 ;
      new app.costesbasicos.costesbasicos_prc(remoteHandle, context).execute( AV28Emprcod, AV35artcod, AV36barcod, AV37barcodreo, AV38barcodpar, AV29Clicodfrom, AV30Clicodto, AV33barfecsalfrom, AV34barfecsalto, AV31barfecgenfrom, AV32barfecgento, GXv_char4) ;
      costesbasicos_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV42CostesBasicos_SDTjson = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42CostesBasicos_SDTjson", AV42CostesBasicos_SDTjson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTESBASICOS_SDTJSON", getSecureSignedToken( sPrefix, AV42CostesBasicos_SDTjson));
      AV13CostesBasicos_SDT.fromJSonString(AV42CostesBasicos_SDTjson, null);
      gx_BV41 = true ;
      GXt_int7 = (byte)(AV43TasasEstandar) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV28Emprcod, httpContext.getMessage( "TASSTD", ""), GXv_int8) ;
      costesbasicos_wc_impl.this.GXt_int7 = GXv_int8[0] ;
      AV43TasasEstandar = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TasasEstandar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TasasEstandar), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTASASESTANDAR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV43TasasEstandar), "ZZZ9")));
      GXt_int7 = (byte)(AV44Moda21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV28Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      costesbasicos_wc_impl.this.GXt_int7 = GXv_int8[0] ;
      AV44Moda21 = GXt_int7 ;
   }

   public void e182DB2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV6WWPContext = GXv_SdtWWPContext9[0] ;
      if ( AV23ManageFiltersExecutionStep == 1 )
      {
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV23ManageFiltersExecutionStep == 2 )
      {
         AV23ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV20Session.getValue("CostesBasicos.CostesBasicos_WCColumnsSelector"), "") != 0 )
      {
         AV16ColumnsSelectorXML = AV20Session.getValue("CostesBasicos.CostesBasicos_WCColumnsSelector") ;
         AV18ColumnsSelector.fromxml(AV16ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S142 ();
         if (returnInSub) return;
      }
      edtavCostesbasicos_sdt__clicod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__clicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__clicod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__clinom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__clinom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__clinom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barnhdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barnhdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barnhdr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barser_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barser_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barser_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barserdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barserdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barserdsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__bartipart_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__bartipart_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__bartipart_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barcolnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barcolnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barcolnom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barcolnum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barcolnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barcolnum_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barkgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barkgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barkgm_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barmtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barmtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barmtr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__coste_p_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__coste_p_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__coste_p_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__costequimicoacumulado_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__costequimicoacumulado_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__costequimicoacumulado_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__costefab_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__costefab_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__costefab_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__costefabacumulado_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__costefabacumulado_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__costefabacumulado_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__valor_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__valor_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__valor_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__margen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__margen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__margen_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__txtalb_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__txtalb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__txtalb_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barprekgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barprekgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barprekgm_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barfecgen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barfecgen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barfecgen_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barfecsal_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barfecsal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barfecsal_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__mmod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__mmod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__mmod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__mmoi_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__mmoi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__mmoi_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__menergia_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__menergia_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__menergia_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__mgas_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__mgas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__mgas_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__magua_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__magua_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__magua_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__mgi_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__mgi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__mgi_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__mam_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__mam_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__mam_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__madc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__madc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__madc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__barunimed_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__barunimed_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__barunimed_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostesbasicos_sdt__costeteo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostesbasicos_sdt__costeteo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostesbasicos_sdt__costeteo_Visible), 5, 0), !bGXsfl_41_Refreshing);
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S152 ();
      if (returnInSub) return;
      AV26GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridCurrentPage), 10, 0));
      AV27GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27GridPageCount), 10, 0));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e122DB2( )
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
         AV25PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV25PageToGo) ;
      }
   }

   public void e132DB2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e192DB2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV67GXV1 = 1 ;
      while ( AV67GXV1 <= AV13CostesBasicos_SDT.size() )
      {
         AV13CostesBasicos_SDT.currentItem( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)) );
         AV46DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV46DetailWebComponent);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(41) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_412( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_41_Refreshing )
         {
            httpContext.doAjaxLoad(41, GridRow);
         }
         AV67GXV1 = (int)(AV67GXV1+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e142DB2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV16ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV18ColumnsSelector.fromJSonString(AV16ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "CostesBasicos.CostesBasicos_WCColumnsSelector", ((GXutil.strcmp("", AV16ColumnsSelectorXML)==0) ? "" : AV18ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e112DB2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S162 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S132 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("CostesBasicos.CostesBasicos_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV102Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("CostesBasicos.CostesBasicos_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV22ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "CostesBasicos.CostesBasicos_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         costesbasicos_wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV22ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV22ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S162 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV102Pgmname+"GridState", AV22ManageFiltersXml) ;
            AV10GridState.fromxml(AV22ManageFiltersXml, null, null);
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S172 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
   }

   public void e152DB2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV45wEBSESSION.setValue(httpContext.getMessage( "&CostesBasicos_SDT", ""), AV42CostesBasicos_SDTjson);
      GXv_char4[0] = AV14ExcelFilename ;
      GXv_char3[0] = AV15ErrorMessage ;
      new app.costesbasicos.costesbasicos_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      costesbasicos_wc_impl.this.AV14ExcelFilename = GXv_char4[0] ;
      costesbasicos_wc_impl.this.AV15ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV14ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV14ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV15ErrorMessage);
      }
   }

   public void e162DB2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV45wEBSESSION.setValue(httpContext.getMessage( "&CostesBasicos_SDT", ""), AV42CostesBasicos_SDTjson);
      callWebObject(formatLink("app.costesbasicos.costesbasicos_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void e202DB2( )
   {
      AV67GXV1 = (int)(nGXsfl_41_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV67GXV1 > 0 ) && ( AV13CostesBasicos_SDT.size() >= AV67GXV1 ) )
      {
         AV13CostesBasicos_SDT.currentItem( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)) );
      }
      /* Detailwebcomponent_Click Routine */
      returnInSub = false ;
      AV47clicod = ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)(AV13CostesBasicos_SDT.currentItem())).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clicod() ;
      AV48Clinom = ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)(AV13CostesBasicos_SDT.currentItem())).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clinom() ;
      AV49barser = ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)(AV13CostesBasicos_SDT.currentItem())).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barser() ;
      AV50barserdsc = ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)(AV13CostesBasicos_SDT.currentItem())).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barserdsc() ;
      AV51barcolnom = ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)(AV13CostesBasicos_SDT.currentItem())).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnom() ;
      AV52Barcolnum = ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)(AV13CostesBasicos_SDT.currentItem())).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnum() ;
      AV53barkgm = ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)(AV13CostesBasicos_SDT.currentItem())).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barkgm() ;
      AV54Barmtr = ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)(AV13CostesBasicos_SDT.currentItem())).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barmtr() ;
      AV55costefab2 = ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)(AV13CostesBasicos_SDT.currentItem())).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab2() ;
      AV56magua = ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)(AV13CostesBasicos_SDT.currentItem())).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Magua() ;
      AV57menergia = ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)(AV13CostesBasicos_SDT.currentItem())).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Menergia() ;
      AV58mgas = ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)(AV13CostesBasicos_SDT.currentItem())).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgas() ;
      AV59mmod = ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)(AV13CostesBasicos_SDT.currentItem())).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmod() ;
      AV60mmoi = ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)(AV13CostesBasicos_SDT.currentItem())).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmoi() ;
      AV61madc = ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)(AV13CostesBasicos_SDT.currentItem())).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Madc() ;
      AV62mam = ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)(AV13CostesBasicos_SDT.currentItem())).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mam() ;
      AV63mgi = ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)(AV13CostesBasicos_SDT.currentItem())).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgi() ;
      AV64costeoperario1 = DecimalUtil.doubleToDec(0) ;
      /* Object Property */
      if ( GXutil.len( sPrefix) == 0 )
      {
         bDynCreated_Grid_dwc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Grid_dwc_Component), GXutil.lower( "CostesBasicos.CostesBasicos_Fases_WC")) != 0 )
      {
         WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app.costesbasicos.costesbasicos_fases_wc_impl", remoteHandle, context);
         WebComp_Grid_dwc_Component = "CostesBasicos.CostesBasicos_Fases_WC" ;
      }
      if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
      {
         WebComp_Grid_dwc.setjustcreated();
         WebComp_Grid_dwc.componentprepare(new Object[] {sPrefix+"W0082","",AV28Emprcod,Integer.valueOf(AV36barcod),Byte.valueOf(AV37barcodreo),AV38barcodpar,Integer.valueOf(AV47clicod),AV48Clinom,AV49barser,AV50barserdsc,AV51barcolnom,Integer.valueOf(AV52Barcolnum),AV53barkgm,AV54Barmtr,AV55costefab2,AV56magua,AV57menergia,AV58mgas,AV59mmod,AV60mmoi,AV61madc,AV62mam,AV63mgi,AV64costeoperario1});
         WebComp_Grid_dwc.componentbind(new Object[] {"","","","","","","","","","","","","","","","","","","","","",""});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Grid_dwc )
      {
         httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0082"+"");
         WebComp_Grid_dwc.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /*  Sending Event outputs  */
   }

   public void S152( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
   }

   public void S142( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV18ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__Clicod", "", "Cliente", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__CliNom", "", "Nombre", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__Barnhdr", "", "N Hdr", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__Barser", "", "Articulo", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__Barserdsc", "", "Descripcion", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__Bartipart", "", "Tipo Art.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__Barcolnom", "", "Color", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__Barcolnum", "", "Numero", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__Barkgm", "", "Kilos", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__Barmtr", "", "Metros", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__Coste_p", "", "Coste Quimicos", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__Costequimicoacumulado", "", "Coste Q. Acumulado", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__CosteFab", "", "Coste Fab.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__CosteFabAcumulado", "", "Coste Fab. Acum.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__Valor", "", "Tot. Fac. Liq.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__Margen", "", "Margen", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__TxtAlb", "", "Guias", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__BarPrekgm", "", "Precio Kilo", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__BarFecgen", "", "Fecha HDR", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__Barfecsal", "", "Fecha Salida", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      if ( AV43TasasEstandar == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__mmod", "", "MOD", true, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      if ( AV43TasasEstandar == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__mmoi", "", "MOI", true, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      if ( AV43TasasEstandar == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__menergia", "", "Energia", true, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      if ( AV43TasasEstandar == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__mgas", "", "Gas", true, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      if ( AV43TasasEstandar == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__magua", "", "Agua", true, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      if ( AV43TasasEstandar == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__mgi", "", "Gastos Ind.", true, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      if ( AV43TasasEstandar == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__mam", "", "Amortizaciones", true, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      if ( AV43TasasEstandar == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__madc", "", "Adm. Cent.", true, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__BarUnimed", "", "Unidad", false, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostesBasicos_SDT__CosteTeo", "", "Coste Teo", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char1 = AV17UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "CostesBasicos.CostesBasicos_WCColumnsSelector", GXv_char4) ;
      costesbasicos_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV17UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV17UserCustomValue)==0) ) )
      {
         AV19ColumnsSelectorAux.fromxml(AV17UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV19ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = AV21ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "CostesBasicos.CostesBasicos_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] ;
      AV21ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   }

   public void S162( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV12FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue(AV102Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV102Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV20Session.getValue(AV102Pgmname+"GridState"), null, null);
      }
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S172 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S172( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV103GXV36 = 1 ;
      while ( AV103GXV36 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV103GXV36));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
         }
         AV103GXV36 = (int)(AV103GXV36+1) ;
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV20Session.getValue(AV102Pgmname+"GridState"), null, null);
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV12FilterFullText)==0), (short)(0), AV12FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      if ( ! (GXutil.strcmp("", AV28Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV28Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV29Clicodfrom) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICODFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV29Clicodfrom, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV30Clicodto) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICODTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV30Clicodto, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV31barfecgenfrom)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFECGENFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV31barfecgenfrom, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV32barfecgento)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFECGENTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV32barfecgento, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV33barfecsalfrom)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFECSALFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV33barfecsalfrom, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34barfecsalto)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFECSALTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV34barfecsalto, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV35artcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ARTCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV35artcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV36barcod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV36barcod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV37barcodreo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV37barcodreo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV38barcodpar)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV38barcodpar );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV102Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void wb_table1_23_2DB2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV21ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_28_2DB2( true) ;
      }
      else
      {
         wb_table2_28_2DB2( false) ;
      }
      return  ;
   }

   public void wb_table2_28_2DB2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_2DB2e( true) ;
      }
      else
      {
         wb_table1_23_2DB2e( false) ;
      }
   }

   public void wb_table2_28_2DB2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV12FilterFullText, GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_CostesBasicos\\CostesBasicos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_28_2DB2e( true) ;
      }
      else
      {
         wb_table2_28_2DB2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV28Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
      AV29Clicodfrom = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Clicodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Clicodfrom), 6, 0));
      AV30Clicodto = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Clicodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Clicodto), 6, 0));
      AV31barfecgenfrom = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31barfecgenfrom", localUtil.format(AV31barfecgenfrom, "99/99/99"));
      AV32barfecgento = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32barfecgento", localUtil.format(AV32barfecgento, "99/99/99"));
      AV33barfecsalfrom = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33barfecsalfrom", localUtil.format(AV33barfecsalfrom, "99/99/99"));
      AV34barfecsalto = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34barfecsalto", localUtil.format(AV34barfecsalto, "99/99/99"));
      AV35artcod = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35artcod", AV35artcod);
      AV36barcod = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36barcod), 8, 0));
      AV37barcodreo = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37barcodreo", GXutil.str( AV37barcodreo, 1, 0));
      AV38barcodpar = (String)getParm(obj,10,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38barcodpar", AV38barcodpar);
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
      pa2DB2( ) ;
      ws2DB2( ) ;
      we2DB2( ) ;
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
      sCtrlAV28Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV29Clicodfrom = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV30Clicodto = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV31barfecgenfrom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV32barfecgento = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV33barfecsalfrom = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV34barfecsalto = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV35artcod = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV36barcod = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV37barcodreo = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV38barcodpar = (String)getParm(obj,10,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2DB2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "costesbasicos\\costesbasicos_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2DB2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV28Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
         AV29Clicodfrom = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Clicodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Clicodfrom), 6, 0));
         AV30Clicodto = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Clicodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Clicodto), 6, 0));
         AV31barfecgenfrom = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31barfecgenfrom", localUtil.format(AV31barfecgenfrom, "99/99/99"));
         AV32barfecgento = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32barfecgento", localUtil.format(AV32barfecgento, "99/99/99"));
         AV33barfecsalfrom = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33barfecsalfrom", localUtil.format(AV33barfecsalfrom, "99/99/99"));
         AV34barfecsalto = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34barfecsalto", localUtil.format(AV34barfecsalto, "99/99/99"));
         AV35artcod = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35artcod", AV35artcod);
         AV36barcod = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36barcod), 8, 0));
         AV37barcodreo = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37barcodreo", GXutil.str( AV37barcodreo, 1, 0));
         AV38barcodpar = (String)getParm(obj,12,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38barcodpar", AV38barcodpar);
      }
      wcpOAV28Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV28Emprcod") ;
      wcpOAV29Clicodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV29Clicodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV30Clicodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV30Clicodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV31barfecgenfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV31barfecgenfrom"), 0) ;
      wcpOAV32barfecgento = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV32barfecgento"), 0) ;
      wcpOAV33barfecsalfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV33barfecsalfrom"), 0) ;
      wcpOAV34barfecsalto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV34barfecsalto"), 0) ;
      wcpOAV35artcod = httpContext.cgiGet( sPrefix+"wcpOAV35artcod") ;
      wcpOAV36barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV36barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV37barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV37barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV38barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV38barcodpar") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV28Emprcod, wcpOAV28Emprcod) != 0 ) || ( AV29Clicodfrom != wcpOAV29Clicodfrom ) || ( AV30Clicodto != wcpOAV30Clicodto ) || !( GXutil.dateCompare(GXutil.resetTime(AV31barfecgenfrom), GXutil.resetTime(wcpOAV31barfecgenfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV32barfecgento), GXutil.resetTime(wcpOAV32barfecgento)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV33barfecsalfrom), GXutil.resetTime(wcpOAV33barfecsalfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV34barfecsalto), GXutil.resetTime(wcpOAV34barfecsalto)) ) || ( GXutil.strcmp(AV35artcod, wcpOAV35artcod) != 0 ) || ( AV36barcod != wcpOAV36barcod ) || ( AV37barcodreo != wcpOAV37barcodreo ) || ( GXutil.strcmp(AV38barcodpar, wcpOAV38barcodpar) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV28Emprcod = AV28Emprcod ;
      wcpOAV29Clicodfrom = AV29Clicodfrom ;
      wcpOAV30Clicodto = AV30Clicodto ;
      wcpOAV31barfecgenfrom = AV31barfecgenfrom ;
      wcpOAV32barfecgento = AV32barfecgento ;
      wcpOAV33barfecsalfrom = AV33barfecsalfrom ;
      wcpOAV34barfecsalto = AV34barfecsalto ;
      wcpOAV35artcod = AV35artcod ;
      wcpOAV36barcod = AV36barcod ;
      wcpOAV37barcodreo = AV37barcodreo ;
      wcpOAV38barcodpar = AV38barcodpar ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV28Emprcod = httpContext.cgiGet( sPrefix+"AV28Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV28Emprcod) > 0 )
      {
         AV28Emprcod = httpContext.cgiGet( sCtrlAV28Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
      }
      else
      {
         AV28Emprcod = httpContext.cgiGet( sPrefix+"AV28Emprcod_PARM") ;
      }
      sCtrlAV29Clicodfrom = httpContext.cgiGet( sPrefix+"AV29Clicodfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV29Clicodfrom) > 0 )
      {
         AV29Clicodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV29Clicodfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Clicodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Clicodfrom), 6, 0));
      }
      else
      {
         AV29Clicodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV29Clicodfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV30Clicodto = httpContext.cgiGet( sPrefix+"AV30Clicodto_CTRL") ;
      if ( GXutil.len( sCtrlAV30Clicodto) > 0 )
      {
         AV30Clicodto = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV30Clicodto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Clicodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Clicodto), 6, 0));
      }
      else
      {
         AV30Clicodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV30Clicodto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV31barfecgenfrom = httpContext.cgiGet( sPrefix+"AV31barfecgenfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV31barfecgenfrom) > 0 )
      {
         AV31barfecgenfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV31barfecgenfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31barfecgenfrom", localUtil.format(AV31barfecgenfrom, "99/99/99"));
      }
      else
      {
         AV31barfecgenfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV31barfecgenfrom_PARM"), 0) ;
      }
      sCtrlAV32barfecgento = httpContext.cgiGet( sPrefix+"AV32barfecgento_CTRL") ;
      if ( GXutil.len( sCtrlAV32barfecgento) > 0 )
      {
         AV32barfecgento = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV32barfecgento), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32barfecgento", localUtil.format(AV32barfecgento, "99/99/99"));
      }
      else
      {
         AV32barfecgento = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV32barfecgento_PARM"), 0) ;
      }
      sCtrlAV33barfecsalfrom = httpContext.cgiGet( sPrefix+"AV33barfecsalfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV33barfecsalfrom) > 0 )
      {
         AV33barfecsalfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV33barfecsalfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33barfecsalfrom", localUtil.format(AV33barfecsalfrom, "99/99/99"));
      }
      else
      {
         AV33barfecsalfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV33barfecsalfrom_PARM"), 0) ;
      }
      sCtrlAV34barfecsalto = httpContext.cgiGet( sPrefix+"AV34barfecsalto_CTRL") ;
      if ( GXutil.len( sCtrlAV34barfecsalto) > 0 )
      {
         AV34barfecsalto = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV34barfecsalto), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34barfecsalto", localUtil.format(AV34barfecsalto, "99/99/99"));
      }
      else
      {
         AV34barfecsalto = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV34barfecsalto_PARM"), 0) ;
      }
      sCtrlAV35artcod = httpContext.cgiGet( sPrefix+"AV35artcod_CTRL") ;
      if ( GXutil.len( sCtrlAV35artcod) > 0 )
      {
         AV35artcod = httpContext.cgiGet( sCtrlAV35artcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35artcod", AV35artcod);
      }
      else
      {
         AV35artcod = httpContext.cgiGet( sPrefix+"AV35artcod_PARM") ;
      }
      sCtrlAV36barcod = httpContext.cgiGet( sPrefix+"AV36barcod_CTRL") ;
      if ( GXutil.len( sCtrlAV36barcod) > 0 )
      {
         AV36barcod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV36barcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36barcod), 8, 0));
      }
      else
      {
         AV36barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV36barcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV37barcodreo = httpContext.cgiGet( sPrefix+"AV37barcodreo_CTRL") ;
      if ( GXutil.len( sCtrlAV37barcodreo) > 0 )
      {
         AV37barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV37barcodreo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37barcodreo", GXutil.str( AV37barcodreo, 1, 0));
      }
      else
      {
         AV37barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV37barcodreo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV38barcodpar = httpContext.cgiGet( sPrefix+"AV38barcodpar_CTRL") ;
      if ( GXutil.len( sCtrlAV38barcodpar) > 0 )
      {
         AV38barcodpar = httpContext.cgiGet( sCtrlAV38barcodpar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38barcodpar", AV38barcodpar);
      }
      else
      {
         AV38barcodpar = httpContext.cgiGet( sPrefix+"AV38barcodpar_PARM") ;
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
      pa2DB2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2DB2( ) ;
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
      ws2DB2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28Emprcod_PARM", GXutil.rtrim( AV28Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV28Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28Emprcod_CTRL", GXutil.rtrim( sCtrlAV28Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29Clicodfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV29Clicodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV29Clicodfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29Clicodfrom_CTRL", GXutil.rtrim( sCtrlAV29Clicodfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30Clicodto_PARM", GXutil.ltrim( localUtil.ntoc( AV30Clicodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30Clicodto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30Clicodto_CTRL", GXutil.rtrim( sCtrlAV30Clicodto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31barfecgenfrom_PARM", localUtil.dtoc( AV31barfecgenfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV31barfecgenfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31barfecgenfrom_CTRL", GXutil.rtrim( sCtrlAV31barfecgenfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32barfecgento_PARM", localUtil.dtoc( AV32barfecgento, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV32barfecgento)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32barfecgento_CTRL", GXutil.rtrim( sCtrlAV32barfecgento));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33barfecsalfrom_PARM", localUtil.dtoc( AV33barfecsalfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33barfecsalfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33barfecsalfrom_CTRL", GXutil.rtrim( sCtrlAV33barfecsalfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34barfecsalto_PARM", localUtil.dtoc( AV34barfecsalto, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV34barfecsalto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34barfecsalto_CTRL", GXutil.rtrim( sCtrlAV34barfecsalto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35artcod_PARM", GXutil.rtrim( AV35artcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV35artcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35artcod_CTRL", GXutil.rtrim( sCtrlAV35artcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36barcod_PARM", GXutil.ltrim( localUtil.ntoc( AV36barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV36barcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36barcod_CTRL", GXutil.rtrim( sCtrlAV36barcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37barcodreo_PARM", GXutil.ltrim( localUtil.ntoc( AV37barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV37barcodreo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37barcodreo_CTRL", GXutil.rtrim( sCtrlAV37barcodreo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV38barcodpar_PARM", GXutil.rtrim( AV38barcodpar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV38barcodpar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV38barcodpar_CTRL", GXutil.rtrim( sCtrlAV38barcodpar));
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
      we2DB2( ) ;
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
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         WebComp_Grid_dwc.componentjscripts();
      }
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
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
         {
            WebComp_Grid_dwc.componentthemes();
         }
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115551088", true, true);
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
      httpContext.AddJavascriptSource("costesbasicos/costesbasicos_wc.js", "?202682115551088", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_412( )
   {
      edtavCostesbasicos_sdt__clicod_Internalname = sPrefix+"COSTESBASICOS_SDT__CLICOD_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__clinom_Internalname = sPrefix+"COSTESBASICOS_SDT__CLINOM_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__barcod_Internalname = sPrefix+"COSTESBASICOS_SDT__BARCOD_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__barcodreo_Internalname = sPrefix+"COSTESBASICOS_SDT__BARCODREO_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__barcodpar_Internalname = sPrefix+"COSTESBASICOS_SDT__BARCODPAR_"+sGXsfl_41_idx ;
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__barnhdr_Internalname = sPrefix+"COSTESBASICOS_SDT__BARNHDR_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__barser_Internalname = sPrefix+"COSTESBASICOS_SDT__BARSER_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__barserdsc_Internalname = sPrefix+"COSTESBASICOS_SDT__BARSERDSC_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__bartipart_Internalname = sPrefix+"COSTESBASICOS_SDT__BARTIPART_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__barcolnom_Internalname = sPrefix+"COSTESBASICOS_SDT__BARCOLNOM_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__barcolnum_Internalname = sPrefix+"COSTESBASICOS_SDT__BARCOLNUM_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__barkgm_Internalname = sPrefix+"COSTESBASICOS_SDT__BARKGM_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__barmtr_Internalname = sPrefix+"COSTESBASICOS_SDT__BARMTR_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__coste_p_Internalname = sPrefix+"COSTESBASICOS_SDT__COSTE_P_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__costequimicoacumulado_Internalname = sPrefix+"COSTESBASICOS_SDT__COSTEQUIMICOACUMULADO_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__costefab_Internalname = sPrefix+"COSTESBASICOS_SDT__COSTEFAB_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__costefab2_Internalname = sPrefix+"COSTESBASICOS_SDT__COSTEFAB2_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__costefabacumulado_Internalname = sPrefix+"COSTESBASICOS_SDT__COSTEFABACUMULADO_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__valor_Internalname = sPrefix+"COSTESBASICOS_SDT__VALOR_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__margen_Internalname = sPrefix+"COSTESBASICOS_SDT__MARGEN_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__txtalb_Internalname = sPrefix+"COSTESBASICOS_SDT__TXTALB_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__barprekgm_Internalname = sPrefix+"COSTESBASICOS_SDT__BARPREKGM_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__barfecgen_Internalname = sPrefix+"COSTESBASICOS_SDT__BARFECGEN_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__barfecsal_Internalname = sPrefix+"COSTESBASICOS_SDT__BARFECSAL_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__mmod_Internalname = sPrefix+"COSTESBASICOS_SDT__MMOD_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__mmoi_Internalname = sPrefix+"COSTESBASICOS_SDT__MMOI_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__menergia_Internalname = sPrefix+"COSTESBASICOS_SDT__MENERGIA_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__mgas_Internalname = sPrefix+"COSTESBASICOS_SDT__MGAS_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__magua_Internalname = sPrefix+"COSTESBASICOS_SDT__MAGUA_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__mgi_Internalname = sPrefix+"COSTESBASICOS_SDT__MGI_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__mam_Internalname = sPrefix+"COSTESBASICOS_SDT__MAM_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__madc_Internalname = sPrefix+"COSTESBASICOS_SDT__MADC_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__barunimed_Internalname = sPrefix+"COSTESBASICOS_SDT__BARUNIMED_"+sGXsfl_41_idx ;
      edtavCostesbasicos_sdt__costeteo_Internalname = sPrefix+"COSTESBASICOS_SDT__COSTETEO_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      edtavCostesbasicos_sdt__clicod_Internalname = sPrefix+"COSTESBASICOS_SDT__CLICOD_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__clinom_Internalname = sPrefix+"COSTESBASICOS_SDT__CLINOM_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__barcod_Internalname = sPrefix+"COSTESBASICOS_SDT__BARCOD_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__barcodreo_Internalname = sPrefix+"COSTESBASICOS_SDT__BARCODREO_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__barcodpar_Internalname = sPrefix+"COSTESBASICOS_SDT__BARCODPAR_"+sGXsfl_41_fel_idx ;
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__barnhdr_Internalname = sPrefix+"COSTESBASICOS_SDT__BARNHDR_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__barser_Internalname = sPrefix+"COSTESBASICOS_SDT__BARSER_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__barserdsc_Internalname = sPrefix+"COSTESBASICOS_SDT__BARSERDSC_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__bartipart_Internalname = sPrefix+"COSTESBASICOS_SDT__BARTIPART_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__barcolnom_Internalname = sPrefix+"COSTESBASICOS_SDT__BARCOLNOM_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__barcolnum_Internalname = sPrefix+"COSTESBASICOS_SDT__BARCOLNUM_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__barkgm_Internalname = sPrefix+"COSTESBASICOS_SDT__BARKGM_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__barmtr_Internalname = sPrefix+"COSTESBASICOS_SDT__BARMTR_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__coste_p_Internalname = sPrefix+"COSTESBASICOS_SDT__COSTE_P_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__costequimicoacumulado_Internalname = sPrefix+"COSTESBASICOS_SDT__COSTEQUIMICOACUMULADO_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__costefab_Internalname = sPrefix+"COSTESBASICOS_SDT__COSTEFAB_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__costefab2_Internalname = sPrefix+"COSTESBASICOS_SDT__COSTEFAB2_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__costefabacumulado_Internalname = sPrefix+"COSTESBASICOS_SDT__COSTEFABACUMULADO_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__valor_Internalname = sPrefix+"COSTESBASICOS_SDT__VALOR_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__margen_Internalname = sPrefix+"COSTESBASICOS_SDT__MARGEN_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__txtalb_Internalname = sPrefix+"COSTESBASICOS_SDT__TXTALB_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__barprekgm_Internalname = sPrefix+"COSTESBASICOS_SDT__BARPREKGM_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__barfecgen_Internalname = sPrefix+"COSTESBASICOS_SDT__BARFECGEN_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__barfecsal_Internalname = sPrefix+"COSTESBASICOS_SDT__BARFECSAL_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__mmod_Internalname = sPrefix+"COSTESBASICOS_SDT__MMOD_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__mmoi_Internalname = sPrefix+"COSTESBASICOS_SDT__MMOI_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__menergia_Internalname = sPrefix+"COSTESBASICOS_SDT__MENERGIA_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__mgas_Internalname = sPrefix+"COSTESBASICOS_SDT__MGAS_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__magua_Internalname = sPrefix+"COSTESBASICOS_SDT__MAGUA_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__mgi_Internalname = sPrefix+"COSTESBASICOS_SDT__MGI_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__mam_Internalname = sPrefix+"COSTESBASICOS_SDT__MAM_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__madc_Internalname = sPrefix+"COSTESBASICOS_SDT__MADC_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__barunimed_Internalname = sPrefix+"COSTESBASICOS_SDT__BARUNIMED_"+sGXsfl_41_fel_idx ;
      edtavCostesbasicos_sdt__costeteo_Internalname = sPrefix+"COSTESBASICOS_SDT__COSTETEO_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wb2DB0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_41_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_41_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_41_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_sdt__clicod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_sdt__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__clicod_Visible),Integer.valueOf(edtavCostesbasicos_sdt__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCostesbasicos_sdt__clinom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__clinom_Internalname,GXutil.rtrim( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clinom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__clinom_Visible),Integer.valueOf(edtavCostesbasicos_sdt__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__barcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_sdt__barcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__barcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCostesbasicos_sdt__barcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__barcodreo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodreo(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_sdt__barcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodreo()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodreo()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__barcodreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCostesbasicos_sdt__barcodreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__barcodpar_Internalname,GXutil.rtrim( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodpar()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__barcodpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCostesbasicos_sdt__barcodpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 47,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV46DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,47);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVDETAILWEBCOMPONENT.CLICK."+sGXsfl_41_idx+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCostesbasicos_sdt__barnhdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__barnhdr_Internalname,GXutil.rtrim( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barnhdr()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__barnhdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__barnhdr_Visible),Integer.valueOf(edtavCostesbasicos_sdt__barnhdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCostesbasicos_sdt__barser_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__barser_Internalname,GXutil.rtrim( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barser()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__barser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__barser_Visible),Integer.valueOf(edtavCostesbasicos_sdt__barser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCostesbasicos_sdt__barserdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__barserdsc_Internalname,GXutil.rtrim( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barserdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__barserdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__barserdsc_Visible),Integer.valueOf(edtavCostesbasicos_sdt__barserdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_sdt__bartipart_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__bartipart_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Bartipart(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_sdt__bartipart_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Bartipart()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Bartipart()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__bartipart_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__bartipart_Visible),Integer.valueOf(edtavCostesbasicos_sdt__bartipart_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCostesbasicos_sdt__barcolnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__barcolnom_Internalname,GXutil.rtrim( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__barcolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__barcolnom_Visible),Integer.valueOf(edtavCostesbasicos_sdt__barcolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_sdt__barcolnum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__barcolnum_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnum(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_sdt__barcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnum()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnum()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__barcolnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__barcolnum_Visible),Integer.valueOf(edtavCostesbasicos_sdt__barcolnum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_sdt__barkgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__barkgm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barkgm(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_sdt__barkgm_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barkgm(), "ZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barkgm(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__barkgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__barkgm_Visible),Integer.valueOf(edtavCostesbasicos_sdt__barkgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_sdt__barmtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__barmtr_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barmtr(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_sdt__barmtr_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barmtr(), "ZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barmtr(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__barmtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__barmtr_Visible),Integer.valueOf(edtavCostesbasicos_sdt__barmtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_sdt__coste_p_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__coste_p_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Coste_p(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_sdt__coste_p_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Coste_p(), "ZZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Coste_p(), "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__coste_p_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__coste_p_Visible),Integer.valueOf(edtavCostesbasicos_sdt__coste_p_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_sdt__costequimicoacumulado_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__costequimicoacumulado_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costequimicoacumulado(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_sdt__costequimicoacumulado_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costequimicoacumulado(), "ZZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costequimicoacumulado(), "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__costequimicoacumulado_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__costequimicoacumulado_Visible),Integer.valueOf(edtavCostesbasicos_sdt__costequimicoacumulado_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_sdt__costefab_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__costefab_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_sdt__costefab_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab(), "ZZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab(), "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__costefab_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__costefab_Visible),Integer.valueOf(edtavCostesbasicos_sdt__costefab_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__costefab2_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab2(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_sdt__costefab2_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab2(), "ZZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab2(), "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__costefab2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCostesbasicos_sdt__costefab2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_sdt__costefabacumulado_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__costefabacumulado_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefabacumulado(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_sdt__costefabacumulado_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefabacumulado(), "ZZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefabacumulado(), "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__costefabacumulado_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__costefabacumulado_Visible),Integer.valueOf(edtavCostesbasicos_sdt__costefabacumulado_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_sdt__valor_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__valor_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Valor(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_sdt__valor_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Valor(), "ZZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Valor(), "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__valor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__valor_Visible),Integer.valueOf(edtavCostesbasicos_sdt__valor_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_sdt__margen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__margen_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Margen(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_sdt__margen_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Margen(), "ZZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Margen(), "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__margen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__margen_Visible),Integer.valueOf(edtavCostesbasicos_sdt__margen_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCostesbasicos_sdt__txtalb_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__txtalb_Internalname,((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Txtalb(),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__txtalb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__txtalb_Visible),Integer.valueOf(edtavCostesbasicos_sdt__txtalb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_sdt__barprekgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__barprekgm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barprekgm(), (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_sdt__barprekgm_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barprekgm(), "ZZZZZZ9.999") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barprekgm(), "ZZZZZZ9.999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__barprekgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__barprekgm_Visible),Integer.valueOf(edtavCostesbasicos_sdt__barprekgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_sdt__barfecgen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__barfecgen_Internalname,localUtil.format(((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen(), "99/99/99"),localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__barfecgen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__barfecgen_Visible),Integer.valueOf(edtavCostesbasicos_sdt__barfecgen_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_sdt__barfecsal_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__barfecsal_Internalname,localUtil.format(((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal(), "99/99/99"),localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__barfecsal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__barfecsal_Visible),Integer.valueOf(edtavCostesbasicos_sdt__barfecsal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_sdt__mmod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__mmod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmod(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_sdt__mmod_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmod(), "ZZZZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmod(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__mmod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__mmod_Visible),Integer.valueOf(edtavCostesbasicos_sdt__mmod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_sdt__mmoi_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__mmoi_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmoi(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_sdt__mmoi_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmoi(), "ZZZZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmoi(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__mmoi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__mmoi_Visible),Integer.valueOf(edtavCostesbasicos_sdt__mmoi_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_sdt__menergia_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__menergia_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Menergia(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_sdt__menergia_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Menergia(), "ZZZZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Menergia(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__menergia_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__menergia_Visible),Integer.valueOf(edtavCostesbasicos_sdt__menergia_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_sdt__mgas_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__mgas_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgas(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_sdt__mgas_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgas(), "ZZZZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgas(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__mgas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__mgas_Visible),Integer.valueOf(edtavCostesbasicos_sdt__mgas_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_sdt__magua_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__magua_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Magua(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_sdt__magua_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Magua(), "ZZZZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Magua(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__magua_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__magua_Visible),Integer.valueOf(edtavCostesbasicos_sdt__magua_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_sdt__mgi_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__mgi_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgi(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_sdt__mgi_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgi(), "ZZZZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgi(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__mgi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__mgi_Visible),Integer.valueOf(edtavCostesbasicos_sdt__mgi_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_sdt__mam_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__mam_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mam(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_sdt__mam_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mam(), "ZZZZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mam(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__mam_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__mam_Visible),Integer.valueOf(edtavCostesbasicos_sdt__mam_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_sdt__madc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__madc_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Madc(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_sdt__madc_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Madc(), "ZZZZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Madc(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__madc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__madc_Visible),Integer.valueOf(edtavCostesbasicos_sdt__madc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCostesbasicos_sdt__barunimed_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__barunimed_Internalname,GXutil.rtrim( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barunimed()),GXutil.rtrim( localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barunimed(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__barunimed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__barunimed_Visible),Integer.valueOf(edtavCostesbasicos_sdt__barunimed_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostesbasicos_sdt__costeteo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostesbasicos_sdt__costeteo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costeteo(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostesbasicos_sdt__costeteo_Enabled!=0) ? localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costeteo(), "ZZZZZZ9.99") : localUtil.format( ((app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)AV13CostesBasicos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costeteo(), "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostesbasicos_sdt__costeteo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostesbasicos_sdt__costeteo_Visible),Integer.valueOf(edtavCostesbasicos_sdt__costeteo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2DB2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_41_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
      /* End function sendrow_412 */
   }

   public void startgridcontrol41( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"41\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__clicod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__clinom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__barnhdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__barser_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__barserdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__bartipart_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Art.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__barcolnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__barcolnum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__barkgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__barmtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__coste_p_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Quimicos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__costequimicoacumulado_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Q. Acumulado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__costefab_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Fab.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__costefabacumulado_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Fab. Acum.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__valor_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tot. Fac. Liq.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__margen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Margen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__txtalb_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Guias", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__barprekgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio Kilo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__barfecgen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha HDR", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__barfecsal_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Salida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__mmod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "MOD", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__mmoi_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "MOI", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__menergia_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Energia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__mgas_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Gas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__magua_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Agua", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__mgi_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Gastos Ind.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__mam_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Amortizaciones", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__madc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Adm. Cent.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__barunimed_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostesbasicos_sdt__costeteo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Teo", "")) ;
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
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__clicod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__clinom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__barcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__barcodreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__barcodpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV46DetailWebComponent));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__barnhdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__barnhdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__barser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__barser_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__barserdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__barserdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__bartipart_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__bartipart_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__barcolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__barcolnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__barcolnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__barcolnum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__barkgm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__barkgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__barmtr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__barmtr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__coste_p_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__coste_p_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__costequimicoacumulado_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__costequimicoacumulado_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__costefab_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__costefab_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__costefab2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__costefabacumulado_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__costefabacumulado_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__valor_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__valor_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__margen_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__margen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__txtalb_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__txtalb_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__barprekgm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__barprekgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__barfecgen_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__barfecgen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__barfecsal_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__barfecsal_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__mmod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__mmod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__mmoi_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__mmoi_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__menergia_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__menergia_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__mgas_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__mgas_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__magua_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__magua_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__mgi_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__mgi_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__mam_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__mam_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__madc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__madc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__barunimed_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__barunimed_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__costeteo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostesbasicos_sdt__costeteo_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavCostesbasicos_sdt__clicod_Internalname = sPrefix+"COSTESBASICOS_SDT__CLICOD" ;
      edtavCostesbasicos_sdt__clinom_Internalname = sPrefix+"COSTESBASICOS_SDT__CLINOM" ;
      edtavCostesbasicos_sdt__barcod_Internalname = sPrefix+"COSTESBASICOS_SDT__BARCOD" ;
      edtavCostesbasicos_sdt__barcodreo_Internalname = sPrefix+"COSTESBASICOS_SDT__BARCODREO" ;
      edtavCostesbasicos_sdt__barcodpar_Internalname = sPrefix+"COSTESBASICOS_SDT__BARCODPAR" ;
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT" ;
      edtavCostesbasicos_sdt__barnhdr_Internalname = sPrefix+"COSTESBASICOS_SDT__BARNHDR" ;
      edtavCostesbasicos_sdt__barser_Internalname = sPrefix+"COSTESBASICOS_SDT__BARSER" ;
      edtavCostesbasicos_sdt__barserdsc_Internalname = sPrefix+"COSTESBASICOS_SDT__BARSERDSC" ;
      edtavCostesbasicos_sdt__bartipart_Internalname = sPrefix+"COSTESBASICOS_SDT__BARTIPART" ;
      edtavCostesbasicos_sdt__barcolnom_Internalname = sPrefix+"COSTESBASICOS_SDT__BARCOLNOM" ;
      edtavCostesbasicos_sdt__barcolnum_Internalname = sPrefix+"COSTESBASICOS_SDT__BARCOLNUM" ;
      edtavCostesbasicos_sdt__barkgm_Internalname = sPrefix+"COSTESBASICOS_SDT__BARKGM" ;
      edtavCostesbasicos_sdt__barmtr_Internalname = sPrefix+"COSTESBASICOS_SDT__BARMTR" ;
      edtavCostesbasicos_sdt__coste_p_Internalname = sPrefix+"COSTESBASICOS_SDT__COSTE_P" ;
      edtavCostesbasicos_sdt__costequimicoacumulado_Internalname = sPrefix+"COSTESBASICOS_SDT__COSTEQUIMICOACUMULADO" ;
      edtavCostesbasicos_sdt__costefab_Internalname = sPrefix+"COSTESBASICOS_SDT__COSTEFAB" ;
      edtavCostesbasicos_sdt__costefab2_Internalname = sPrefix+"COSTESBASICOS_SDT__COSTEFAB2" ;
      edtavCostesbasicos_sdt__costefabacumulado_Internalname = sPrefix+"COSTESBASICOS_SDT__COSTEFABACUMULADO" ;
      edtavCostesbasicos_sdt__valor_Internalname = sPrefix+"COSTESBASICOS_SDT__VALOR" ;
      edtavCostesbasicos_sdt__margen_Internalname = sPrefix+"COSTESBASICOS_SDT__MARGEN" ;
      edtavCostesbasicos_sdt__txtalb_Internalname = sPrefix+"COSTESBASICOS_SDT__TXTALB" ;
      edtavCostesbasicos_sdt__barprekgm_Internalname = sPrefix+"COSTESBASICOS_SDT__BARPREKGM" ;
      edtavCostesbasicos_sdt__barfecgen_Internalname = sPrefix+"COSTESBASICOS_SDT__BARFECGEN" ;
      edtavCostesbasicos_sdt__barfecsal_Internalname = sPrefix+"COSTESBASICOS_SDT__BARFECSAL" ;
      edtavCostesbasicos_sdt__mmod_Internalname = sPrefix+"COSTESBASICOS_SDT__MMOD" ;
      edtavCostesbasicos_sdt__mmoi_Internalname = sPrefix+"COSTESBASICOS_SDT__MMOI" ;
      edtavCostesbasicos_sdt__menergia_Internalname = sPrefix+"COSTESBASICOS_SDT__MENERGIA" ;
      edtavCostesbasicos_sdt__mgas_Internalname = sPrefix+"COSTESBASICOS_SDT__MGAS" ;
      edtavCostesbasicos_sdt__magua_Internalname = sPrefix+"COSTESBASICOS_SDT__MAGUA" ;
      edtavCostesbasicos_sdt__mgi_Internalname = sPrefix+"COSTESBASICOS_SDT__MGI" ;
      edtavCostesbasicos_sdt__mam_Internalname = sPrefix+"COSTESBASICOS_SDT__MAM" ;
      edtavCostesbasicos_sdt__madc_Internalname = sPrefix+"COSTESBASICOS_SDT__MADC" ;
      edtavCostesbasicos_sdt__barunimed_Internalname = sPrefix+"COSTESBASICOS_SDT__BARUNIMED" ;
      edtavCostesbasicos_sdt__costeteo_Internalname = sPrefix+"COSTESBASICOS_SDT__COSTETEO" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divCell_grid_dwc_Internalname = sPrefix+"CELL_GRID_DWC" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
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
      edtavCostesbasicos_sdt__costeteo_Jsonclick = "" ;
      edtavCostesbasicos_sdt__costeteo_Enabled = 0 ;
      edtavCostesbasicos_sdt__costeteo_Visible = -1 ;
      edtavCostesbasicos_sdt__barunimed_Jsonclick = "" ;
      edtavCostesbasicos_sdt__barunimed_Enabled = 0 ;
      edtavCostesbasicos_sdt__barunimed_Visible = -1 ;
      edtavCostesbasicos_sdt__madc_Jsonclick = "" ;
      edtavCostesbasicos_sdt__madc_Enabled = 0 ;
      edtavCostesbasicos_sdt__madc_Visible = -1 ;
      edtavCostesbasicos_sdt__mam_Jsonclick = "" ;
      edtavCostesbasicos_sdt__mam_Enabled = 0 ;
      edtavCostesbasicos_sdt__mam_Visible = -1 ;
      edtavCostesbasicos_sdt__mgi_Jsonclick = "" ;
      edtavCostesbasicos_sdt__mgi_Enabled = 0 ;
      edtavCostesbasicos_sdt__mgi_Visible = -1 ;
      edtavCostesbasicos_sdt__magua_Jsonclick = "" ;
      edtavCostesbasicos_sdt__magua_Enabled = 0 ;
      edtavCostesbasicos_sdt__magua_Visible = -1 ;
      edtavCostesbasicos_sdt__mgas_Jsonclick = "" ;
      edtavCostesbasicos_sdt__mgas_Enabled = 0 ;
      edtavCostesbasicos_sdt__mgas_Visible = -1 ;
      edtavCostesbasicos_sdt__menergia_Jsonclick = "" ;
      edtavCostesbasicos_sdt__menergia_Enabled = 0 ;
      edtavCostesbasicos_sdt__menergia_Visible = -1 ;
      edtavCostesbasicos_sdt__mmoi_Jsonclick = "" ;
      edtavCostesbasicos_sdt__mmoi_Enabled = 0 ;
      edtavCostesbasicos_sdt__mmoi_Visible = -1 ;
      edtavCostesbasicos_sdt__mmod_Jsonclick = "" ;
      edtavCostesbasicos_sdt__mmod_Enabled = 0 ;
      edtavCostesbasicos_sdt__mmod_Visible = -1 ;
      edtavCostesbasicos_sdt__barfecsal_Jsonclick = "" ;
      edtavCostesbasicos_sdt__barfecsal_Enabled = 0 ;
      edtavCostesbasicos_sdt__barfecsal_Visible = -1 ;
      edtavCostesbasicos_sdt__barfecgen_Jsonclick = "" ;
      edtavCostesbasicos_sdt__barfecgen_Enabled = 0 ;
      edtavCostesbasicos_sdt__barfecgen_Visible = -1 ;
      edtavCostesbasicos_sdt__barprekgm_Jsonclick = "" ;
      edtavCostesbasicos_sdt__barprekgm_Enabled = 0 ;
      edtavCostesbasicos_sdt__barprekgm_Visible = -1 ;
      edtavCostesbasicos_sdt__txtalb_Jsonclick = "" ;
      edtavCostesbasicos_sdt__txtalb_Enabled = 0 ;
      edtavCostesbasicos_sdt__txtalb_Visible = -1 ;
      edtavCostesbasicos_sdt__margen_Jsonclick = "" ;
      edtavCostesbasicos_sdt__margen_Enabled = 0 ;
      edtavCostesbasicos_sdt__margen_Visible = -1 ;
      edtavCostesbasicos_sdt__valor_Jsonclick = "" ;
      edtavCostesbasicos_sdt__valor_Enabled = 0 ;
      edtavCostesbasicos_sdt__valor_Visible = -1 ;
      edtavCostesbasicos_sdt__costefabacumulado_Jsonclick = "" ;
      edtavCostesbasicos_sdt__costefabacumulado_Enabled = 0 ;
      edtavCostesbasicos_sdt__costefabacumulado_Visible = -1 ;
      edtavCostesbasicos_sdt__costefab2_Jsonclick = "" ;
      edtavCostesbasicos_sdt__costefab2_Enabled = 0 ;
      edtavCostesbasicos_sdt__costefab_Jsonclick = "" ;
      edtavCostesbasicos_sdt__costefab_Enabled = 0 ;
      edtavCostesbasicos_sdt__costefab_Visible = -1 ;
      edtavCostesbasicos_sdt__costequimicoacumulado_Jsonclick = "" ;
      edtavCostesbasicos_sdt__costequimicoacumulado_Enabled = 0 ;
      edtavCostesbasicos_sdt__costequimicoacumulado_Visible = -1 ;
      edtavCostesbasicos_sdt__coste_p_Jsonclick = "" ;
      edtavCostesbasicos_sdt__coste_p_Enabled = 0 ;
      edtavCostesbasicos_sdt__coste_p_Visible = -1 ;
      edtavCostesbasicos_sdt__barmtr_Jsonclick = "" ;
      edtavCostesbasicos_sdt__barmtr_Enabled = 0 ;
      edtavCostesbasicos_sdt__barmtr_Visible = -1 ;
      edtavCostesbasicos_sdt__barkgm_Jsonclick = "" ;
      edtavCostesbasicos_sdt__barkgm_Enabled = 0 ;
      edtavCostesbasicos_sdt__barkgm_Visible = -1 ;
      edtavCostesbasicos_sdt__barcolnum_Jsonclick = "" ;
      edtavCostesbasicos_sdt__barcolnum_Enabled = 0 ;
      edtavCostesbasicos_sdt__barcolnum_Visible = -1 ;
      edtavCostesbasicos_sdt__barcolnom_Jsonclick = "" ;
      edtavCostesbasicos_sdt__barcolnom_Enabled = 0 ;
      edtavCostesbasicos_sdt__barcolnom_Visible = -1 ;
      edtavCostesbasicos_sdt__bartipart_Jsonclick = "" ;
      edtavCostesbasicos_sdt__bartipart_Enabled = 0 ;
      edtavCostesbasicos_sdt__bartipart_Visible = -1 ;
      edtavCostesbasicos_sdt__barserdsc_Jsonclick = "" ;
      edtavCostesbasicos_sdt__barserdsc_Enabled = 0 ;
      edtavCostesbasicos_sdt__barserdsc_Visible = -1 ;
      edtavCostesbasicos_sdt__barser_Jsonclick = "" ;
      edtavCostesbasicos_sdt__barser_Enabled = 0 ;
      edtavCostesbasicos_sdt__barser_Visible = -1 ;
      edtavCostesbasicos_sdt__barnhdr_Jsonclick = "" ;
      edtavCostesbasicos_sdt__barnhdr_Enabled = 0 ;
      edtavCostesbasicos_sdt__barnhdr_Visible = -1 ;
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      edtavCostesbasicos_sdt__barcodpar_Jsonclick = "" ;
      edtavCostesbasicos_sdt__barcodpar_Enabled = 0 ;
      edtavCostesbasicos_sdt__barcodreo_Jsonclick = "" ;
      edtavCostesbasicos_sdt__barcodreo_Enabled = 0 ;
      edtavCostesbasicos_sdt__barcod_Jsonclick = "" ;
      edtavCostesbasicos_sdt__barcod_Enabled = 0 ;
      edtavCostesbasicos_sdt__clinom_Jsonclick = "" ;
      edtavCostesbasicos_sdt__clinom_Enabled = 0 ;
      edtavCostesbasicos_sdt__clinom_Visible = -1 ;
      edtavCostesbasicos_sdt__clicod_Jsonclick = "" ;
      edtavCostesbasicos_sdt__clicod_Enabled = 0 ;
      edtavCostesbasicos_sdt__clicod_Visible = -1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavCostesbasicos_sdt__costeteo_Visible = -1 ;
      edtavCostesbasicos_sdt__barunimed_Visible = -1 ;
      edtavCostesbasicos_sdt__madc_Visible = -1 ;
      edtavCostesbasicos_sdt__mam_Visible = -1 ;
      edtavCostesbasicos_sdt__mgi_Visible = -1 ;
      edtavCostesbasicos_sdt__magua_Visible = -1 ;
      edtavCostesbasicos_sdt__mgas_Visible = -1 ;
      edtavCostesbasicos_sdt__menergia_Visible = -1 ;
      edtavCostesbasicos_sdt__mmoi_Visible = -1 ;
      edtavCostesbasicos_sdt__mmod_Visible = -1 ;
      edtavCostesbasicos_sdt__barfecsal_Visible = -1 ;
      edtavCostesbasicos_sdt__barfecgen_Visible = -1 ;
      edtavCostesbasicos_sdt__barprekgm_Visible = -1 ;
      edtavCostesbasicos_sdt__txtalb_Visible = -1 ;
      edtavCostesbasicos_sdt__margen_Visible = -1 ;
      edtavCostesbasicos_sdt__valor_Visible = -1 ;
      edtavCostesbasicos_sdt__costefabacumulado_Visible = -1 ;
      edtavCostesbasicos_sdt__costefab_Visible = -1 ;
      edtavCostesbasicos_sdt__costequimicoacumulado_Visible = -1 ;
      edtavCostesbasicos_sdt__coste_p_Visible = -1 ;
      edtavCostesbasicos_sdt__barmtr_Visible = -1 ;
      edtavCostesbasicos_sdt__barkgm_Visible = -1 ;
      edtavCostesbasicos_sdt__barcolnum_Visible = -1 ;
      edtavCostesbasicos_sdt__barcolnom_Visible = -1 ;
      edtavCostesbasicos_sdt__bartipart_Visible = -1 ;
      edtavCostesbasicos_sdt__barserdsc_Visible = -1 ;
      edtavCostesbasicos_sdt__barser_Visible = -1 ;
      edtavCostesbasicos_sdt__barnhdr_Visible = -1 ;
      edtavCostesbasicos_sdt__clinom_Visible = -1 ;
      edtavCostesbasicos_sdt__clicod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavCostesbasicos_sdt__costeteo_Enabled = -1 ;
      edtavCostesbasicos_sdt__barunimed_Enabled = -1 ;
      edtavCostesbasicos_sdt__madc_Enabled = -1 ;
      edtavCostesbasicos_sdt__mam_Enabled = -1 ;
      edtavCostesbasicos_sdt__mgi_Enabled = -1 ;
      edtavCostesbasicos_sdt__magua_Enabled = -1 ;
      edtavCostesbasicos_sdt__mgas_Enabled = -1 ;
      edtavCostesbasicos_sdt__menergia_Enabled = -1 ;
      edtavCostesbasicos_sdt__mmoi_Enabled = -1 ;
      edtavCostesbasicos_sdt__mmod_Enabled = -1 ;
      edtavCostesbasicos_sdt__barfecsal_Enabled = -1 ;
      edtavCostesbasicos_sdt__barfecgen_Enabled = -1 ;
      edtavCostesbasicos_sdt__barprekgm_Enabled = -1 ;
      edtavCostesbasicos_sdt__txtalb_Enabled = -1 ;
      edtavCostesbasicos_sdt__margen_Enabled = -1 ;
      edtavCostesbasicos_sdt__valor_Enabled = -1 ;
      edtavCostesbasicos_sdt__costefabacumulado_Enabled = -1 ;
      edtavCostesbasicos_sdt__costefab2_Enabled = -1 ;
      edtavCostesbasicos_sdt__costefab_Enabled = -1 ;
      edtavCostesbasicos_sdt__costequimicoacumulado_Enabled = -1 ;
      edtavCostesbasicos_sdt__coste_p_Enabled = -1 ;
      edtavCostesbasicos_sdt__barmtr_Enabled = -1 ;
      edtavCostesbasicos_sdt__barkgm_Enabled = -1 ;
      edtavCostesbasicos_sdt__barcolnum_Enabled = -1 ;
      edtavCostesbasicos_sdt__barcolnom_Enabled = -1 ;
      edtavCostesbasicos_sdt__bartipart_Enabled = -1 ;
      edtavCostesbasicos_sdt__barserdsc_Enabled = -1 ;
      edtavCostesbasicos_sdt__barser_Enabled = -1 ;
      edtavCostesbasicos_sdt__barnhdr_Enabled = -1 ;
      edtavCostesbasicos_sdt__barcodpar_Enabled = -1 ;
      edtavCostesbasicos_sdt__barcodreo_Enabled = -1 ;
      edtavCostesbasicos_sdt__barcod_Enabled = -1 ;
      edtavCostesbasicos_sdt__clinom_Enabled = -1 ;
      edtavCostesbasicos_sdt__clicod_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divCell_grid_dwc_Class = "col-xs-12" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "|||||||||||||||||||||||||||||" ;
      Ddo_grid_Columnids = "0:CostesBasicos_SDT__Clicod|1:CostesBasicos_SDT__CliNom|6:CostesBasicos_SDT__Barnhdr|7:CostesBasicos_SDT__Barser|8:CostesBasicos_SDT__Barserdsc|9:CostesBasicos_SDT__Bartipart|10:CostesBasicos_SDT__Barcolnom|11:CostesBasicos_SDT__Barcolnum|12:CostesBasicos_SDT__Barkgm|13:CostesBasicos_SDT__Barmtr|14:CostesBasicos_SDT__Coste_p|15:CostesBasicos_SDT__Costequimicoacumulado|16:CostesBasicos_SDT__CosteFab|18:CostesBasicos_SDT__CosteFabAcumulado|19:CostesBasicos_SDT__Valor|20:CostesBasicos_SDT__Margen|21:CostesBasicos_SDT__TxtAlb|22:CostesBasicos_SDT__BarPrekgm|23:CostesBasicos_SDT__BarFecgen|24:CostesBasicos_SDT__Barfecsal|25:CostesBasicos_SDT__mmod|26:CostesBasicos_SDT__mmoi|27:CostesBasicos_SDT__menergia|28:CostesBasicos_SDT__mgas|29:CostesBasicos_SDT__magua|30:CostesBasicos_SDT__mgi|31:CostesBasicos_SDT__mam|32:CostesBasicos_SDT__madc|33:CostesBasicos_SDT__BarUnimed|34:CostesBasicos_SDT__CosteTeo" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV102Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29Clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV30Clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV31barfecgenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV32barfecgento',fld:'vBARFECGENTO',pic:''},{av:'AV33barfecsalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV34barfecsalto',fld:'vBARFECSALTO',pic:''},{av:'AV35artcod',fld:'vARTCOD',pic:''},{av:'AV36barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV37barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV38barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV43TasasEstandar',fld:'vTASASESTANDAR',pic:'ZZZ9',hsh:true},{av:'AV13CostesBasicos_SDT',fld:'vCOSTESBASICOS_SDT',grid:41,pic:'',hsh:true},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'AV42CostesBasicos_SDTjson',fld:'vCOSTESBASICOS_SDTJSON',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'COSTESBASICOS_SDT__CLICOD',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__CLINOM',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARNHDR',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARSER',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARSERDSC',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARTIPART',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARCOLNUM',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARKGM',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARMTR',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__COSTE_P',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__COSTEQUIMICOACUMULADO',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__COSTEFAB',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__COSTEFABACUMULADO',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__VALOR',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__MARGEN',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__TXTALB',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARPREKGM',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARFECGEN',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARFECSAL',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__MMOD',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__MMOI',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__MENERGIA',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__MGAS',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__MAGUA',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__MGI',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__MAM',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__MADC',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARUNIMED',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__COSTETEO',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e122DB2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV102Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29Clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV30Clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV31barfecgenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV32barfecgento',fld:'vBARFECGENTO',pic:''},{av:'AV33barfecsalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV34barfecsalto',fld:'vBARFECSALTO',pic:''},{av:'AV35artcod',fld:'vARTCOD',pic:''},{av:'AV36barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV37barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV38barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV43TasasEstandar',fld:'vTASASESTANDAR',pic:'ZZZ9',hsh:true},{av:'AV13CostesBasicos_SDT',fld:'vCOSTESBASICOS_SDT',grid:41,pic:'',hsh:true},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'AV42CostesBasicos_SDTjson',fld:'vCOSTESBASICOS_SDTJSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e132DB2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV102Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29Clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV30Clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV31barfecgenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV32barfecgento',fld:'vBARFECGENTO',pic:''},{av:'AV33barfecsalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV34barfecsalto',fld:'vBARFECSALTO',pic:''},{av:'AV35artcod',fld:'vARTCOD',pic:''},{av:'AV36barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV37barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV38barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV43TasasEstandar',fld:'vTASASESTANDAR',pic:'ZZZ9',hsh:true},{av:'AV13CostesBasicos_SDT',fld:'vCOSTESBASICOS_SDT',grid:41,pic:'',hsh:true},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'AV42CostesBasicos_SDTjson',fld:'vCOSTESBASICOS_SDTJSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e192DB2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV46DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e142DB2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV102Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29Clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV30Clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV31barfecgenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV32barfecgento',fld:'vBARFECGENTO',pic:''},{av:'AV33barfecsalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV34barfecsalto',fld:'vBARFECSALTO',pic:''},{av:'AV35artcod',fld:'vARTCOD',pic:''},{av:'AV36barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV37barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV38barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV43TasasEstandar',fld:'vTASASESTANDAR',pic:'ZZZ9',hsh:true},{av:'AV13CostesBasicos_SDT',fld:'vCOSTESBASICOS_SDT',grid:41,pic:'',hsh:true},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'AV42CostesBasicos_SDTjson',fld:'vCOSTESBASICOS_SDTJSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{ctrl:'COSTESBASICOS_SDT__CLICOD',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__CLINOM',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARNHDR',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARSER',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARSERDSC',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARTIPART',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARCOLNUM',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARKGM',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARMTR',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__COSTE_P',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__COSTEQUIMICOACUMULADO',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__COSTEFAB',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__COSTEFABACUMULADO',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__VALOR',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__MARGEN',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__TXTALB',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARPREKGM',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARFECGEN',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARFECSAL',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__MMOD',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__MMOI',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__MENERGIA',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__MGAS',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__MAGUA',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__MGI',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__MAM',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__MADC',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARUNIMED',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__COSTETEO',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e112DB2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV102Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29Clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV30Clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV31barfecgenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV32barfecgento',fld:'vBARFECGENTO',pic:''},{av:'AV33barfecsalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV34barfecsalto',fld:'vBARFECSALTO',pic:''},{av:'AV35artcod',fld:'vARTCOD',pic:''},{av:'AV36barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV37barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV38barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV43TasasEstandar',fld:'vTASASESTANDAR',pic:'ZZZ9',hsh:true},{av:'AV13CostesBasicos_SDT',fld:'vCOSTESBASICOS_SDT',grid:41,pic:'',hsh:true},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'AV42CostesBasicos_SDTjson',fld:'vCOSTESBASICOS_SDTJSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'COSTESBASICOS_SDT__CLICOD',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__CLINOM',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARNHDR',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARSER',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARSERDSC',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARTIPART',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARCOLNUM',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARKGM',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARMTR',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__COSTE_P',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__COSTEQUIMICOACUMULADO',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__COSTEFAB',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__COSTEFABACUMULADO',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__VALOR',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__MARGEN',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__TXTALB',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARPREKGM',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARFECGEN',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARFECSAL',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__MMOD',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__MMOI',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__MENERGIA',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__MGAS',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__MAGUA',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__MGI',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__MAM',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__MADC',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__BARUNIMED',prop:'Visible'},{ctrl:'COSTESBASICOS_SDT__COSTETEO',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e152DB2',iparms:[{av:'AV42CostesBasicos_SDTjson',fld:'vCOSTESBASICOS_SDTJSON',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e162DB2',iparms:[{av:'AV42CostesBasicos_SDTjson',fld:'vCOSTESBASICOS_SDTJSON',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e202DB2',iparms:[{av:'AV13CostesBasicos_SDT',fld:'vCOSTESBASICOS_SDT',grid:41,pic:'',hsh:true},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV37barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV38barcodpar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("VALIDV_GXV34","{handler:'validv_Gxv34',iparms:[]");
      setEventMetadata("VALIDV_GXV34",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv35',iparms:[]");
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
      wcpOAV28Emprcod = "" ;
      wcpOAV31barfecgenfrom = GXutil.nullDate() ;
      wcpOAV32barfecgento = GXutil.nullDate() ;
      wcpOAV33barfecsalfrom = GXutil.nullDate() ;
      wcpOAV34barfecsalto = GXutil.nullDate() ;
      wcpOAV35artcod = "" ;
      wcpOAV38barcodpar = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV28Emprcod = "" ;
      AV31barfecgenfrom = GXutil.nullDate() ;
      AV32barfecgento = GXutil.nullDate() ;
      AV33barfecsalfrom = GXutil.nullDate() ;
      AV34barfecsalto = GXutil.nullDate() ;
      AV35artcod = "" ;
      AV38barcodpar = "" ;
      AV18ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV102Pgmname = "" ;
      AV12FilterFullText = "" ;
      AV13CostesBasicos_SDT = new GXBaseCollection<app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem>(app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem.class, "CostesBasicos_SDTItem", "TexplusNET", remoteHandle);
      AV42CostesBasicos_SDTjson = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV21ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV24DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      WebComp_Grid_dwc_Component = "" ;
      OldGrid_dwc = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV46DetailWebComponent = "" ;
      hsh = "" ;
      AV39Station = "" ;
      GXv_char2 = new String[1] ;
      AV40EmprNom = "" ;
      AV41UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_int8 = new byte[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV20Session = httpContext.getWebSession();
      AV16ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV22ManageFiltersXml = "" ;
      AV45wEBSESSION = httpContext.getWebSession();
      AV14ExcelFilename = "" ;
      AV15ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      AV48Clinom = "" ;
      AV49barser = "" ;
      AV50barserdsc = "" ;
      AV51barcolnom = "" ;
      AV53barkgm = DecimalUtil.ZERO ;
      AV54Barmtr = DecimalUtil.ZERO ;
      AV55costefab2 = DecimalUtil.ZERO ;
      AV56magua = DecimalUtil.ZERO ;
      AV57menergia = DecimalUtil.ZERO ;
      AV58mgas = DecimalUtil.ZERO ;
      AV59mmod = DecimalUtil.ZERO ;
      AV60mmoi = DecimalUtil.ZERO ;
      AV61madc = DecimalUtil.ZERO ;
      AV62mam = DecimalUtil.ZERO ;
      AV63mgi = DecimalUtil.ZERO ;
      AV64costeoperario1 = DecimalUtil.ZERO ;
      AV17UserCustomValue = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV19ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState14 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV28Emprcod = "" ;
      sCtrlAV29Clicodfrom = "" ;
      sCtrlAV30Clicodto = "" ;
      sCtrlAV31barfecgenfrom = "" ;
      sCtrlAV32barfecgento = "" ;
      sCtrlAV33barfecsalfrom = "" ;
      sCtrlAV34barfecsalto = "" ;
      sCtrlAV35artcod = "" ;
      sCtrlAV36barcod = "" ;
      sCtrlAV37barcodreo = "" ;
      sCtrlAV38barcodpar = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV102Pgmname = "CostesBasicos.CostesBasicos_WC" ;
      /* GeneXus formulas. */
      AV102Pgmname = "CostesBasicos.CostesBasicos_WC" ;
      Gx_err = (short)(0) ;
      edtavCostesbasicos_sdt__clicod_Enabled = 0 ;
      edtavCostesbasicos_sdt__clinom_Enabled = 0 ;
      edtavCostesbasicos_sdt__barcod_Enabled = 0 ;
      edtavCostesbasicos_sdt__barcodreo_Enabled = 0 ;
      edtavCostesbasicos_sdt__barcodpar_Enabled = 0 ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavCostesbasicos_sdt__barnhdr_Enabled = 0 ;
      edtavCostesbasicos_sdt__barser_Enabled = 0 ;
      edtavCostesbasicos_sdt__barserdsc_Enabled = 0 ;
      edtavCostesbasicos_sdt__bartipart_Enabled = 0 ;
      edtavCostesbasicos_sdt__barcolnom_Enabled = 0 ;
      edtavCostesbasicos_sdt__barcolnum_Enabled = 0 ;
      edtavCostesbasicos_sdt__barkgm_Enabled = 0 ;
      edtavCostesbasicos_sdt__barmtr_Enabled = 0 ;
      edtavCostesbasicos_sdt__coste_p_Enabled = 0 ;
      edtavCostesbasicos_sdt__costequimicoacumulado_Enabled = 0 ;
      edtavCostesbasicos_sdt__costefab_Enabled = 0 ;
      edtavCostesbasicos_sdt__costefab2_Enabled = 0 ;
      edtavCostesbasicos_sdt__costefabacumulado_Enabled = 0 ;
      edtavCostesbasicos_sdt__valor_Enabled = 0 ;
      edtavCostesbasicos_sdt__margen_Enabled = 0 ;
      edtavCostesbasicos_sdt__txtalb_Enabled = 0 ;
      edtavCostesbasicos_sdt__barprekgm_Enabled = 0 ;
      edtavCostesbasicos_sdt__barfecgen_Enabled = 0 ;
      edtavCostesbasicos_sdt__barfecsal_Enabled = 0 ;
      edtavCostesbasicos_sdt__mmod_Enabled = 0 ;
      edtavCostesbasicos_sdt__mmoi_Enabled = 0 ;
      edtavCostesbasicos_sdt__menergia_Enabled = 0 ;
      edtavCostesbasicos_sdt__mgas_Enabled = 0 ;
      edtavCostesbasicos_sdt__magua_Enabled = 0 ;
      edtavCostesbasicos_sdt__mgi_Enabled = 0 ;
      edtavCostesbasicos_sdt__mam_Enabled = 0 ;
      edtavCostesbasicos_sdt__madc_Enabled = 0 ;
      edtavCostesbasicos_sdt__barunimed_Enabled = 0 ;
      edtavCostesbasicos_sdt__costeteo_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV37barcodreo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV37barcodreo ;
   private byte AV23ManageFiltersExecutionStep ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV43TasasEstandar ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV44Moda21 ;
   private int wcpOAV29Clicodfrom ;
   private int wcpOAV30Clicodto ;
   private int wcpOAV36barcod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_41 ;
   private int AV29Clicodfrom ;
   private int AV30Clicodto ;
   private int AV36barcod ;
   private int nGXsfl_41_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV67GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavCostesbasicos_sdt__clicod_Enabled ;
   private int edtavCostesbasicos_sdt__clinom_Enabled ;
   private int edtavCostesbasicos_sdt__barcod_Enabled ;
   private int edtavCostesbasicos_sdt__barcodreo_Enabled ;
   private int edtavCostesbasicos_sdt__barcodpar_Enabled ;
   private int edtavDetailwebcomponent_Enabled ;
   private int edtavCostesbasicos_sdt__barnhdr_Enabled ;
   private int edtavCostesbasicos_sdt__barser_Enabled ;
   private int edtavCostesbasicos_sdt__barserdsc_Enabled ;
   private int edtavCostesbasicos_sdt__bartipart_Enabled ;
   private int edtavCostesbasicos_sdt__barcolnom_Enabled ;
   private int edtavCostesbasicos_sdt__barcolnum_Enabled ;
   private int edtavCostesbasicos_sdt__barkgm_Enabled ;
   private int edtavCostesbasicos_sdt__barmtr_Enabled ;
   private int edtavCostesbasicos_sdt__coste_p_Enabled ;
   private int edtavCostesbasicos_sdt__costequimicoacumulado_Enabled ;
   private int edtavCostesbasicos_sdt__costefab_Enabled ;
   private int edtavCostesbasicos_sdt__costefab2_Enabled ;
   private int edtavCostesbasicos_sdt__costefabacumulado_Enabled ;
   private int edtavCostesbasicos_sdt__valor_Enabled ;
   private int edtavCostesbasicos_sdt__margen_Enabled ;
   private int edtavCostesbasicos_sdt__txtalb_Enabled ;
   private int edtavCostesbasicos_sdt__barprekgm_Enabled ;
   private int edtavCostesbasicos_sdt__barfecgen_Enabled ;
   private int edtavCostesbasicos_sdt__barfecsal_Enabled ;
   private int edtavCostesbasicos_sdt__mmod_Enabled ;
   private int edtavCostesbasicos_sdt__mmoi_Enabled ;
   private int edtavCostesbasicos_sdt__menergia_Enabled ;
   private int edtavCostesbasicos_sdt__mgas_Enabled ;
   private int edtavCostesbasicos_sdt__magua_Enabled ;
   private int edtavCostesbasicos_sdt__mgi_Enabled ;
   private int edtavCostesbasicos_sdt__mam_Enabled ;
   private int edtavCostesbasicos_sdt__madc_Enabled ;
   private int edtavCostesbasicos_sdt__barunimed_Enabled ;
   private int edtavCostesbasicos_sdt__costeteo_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_41_fel_idx=1 ;
   private int edtavCostesbasicos_sdt__clicod_Visible ;
   private int edtavCostesbasicos_sdt__clinom_Visible ;
   private int edtavCostesbasicos_sdt__barnhdr_Visible ;
   private int edtavCostesbasicos_sdt__barser_Visible ;
   private int edtavCostesbasicos_sdt__barserdsc_Visible ;
   private int edtavCostesbasicos_sdt__bartipart_Visible ;
   private int edtavCostesbasicos_sdt__barcolnom_Visible ;
   private int edtavCostesbasicos_sdt__barcolnum_Visible ;
   private int edtavCostesbasicos_sdt__barkgm_Visible ;
   private int edtavCostesbasicos_sdt__barmtr_Visible ;
   private int edtavCostesbasicos_sdt__coste_p_Visible ;
   private int edtavCostesbasicos_sdt__costequimicoacumulado_Visible ;
   private int edtavCostesbasicos_sdt__costefab_Visible ;
   private int edtavCostesbasicos_sdt__costefabacumulado_Visible ;
   private int edtavCostesbasicos_sdt__valor_Visible ;
   private int edtavCostesbasicos_sdt__margen_Visible ;
   private int edtavCostesbasicos_sdt__txtalb_Visible ;
   private int edtavCostesbasicos_sdt__barprekgm_Visible ;
   private int edtavCostesbasicos_sdt__barfecgen_Visible ;
   private int edtavCostesbasicos_sdt__barfecsal_Visible ;
   private int edtavCostesbasicos_sdt__mmod_Visible ;
   private int edtavCostesbasicos_sdt__mmoi_Visible ;
   private int edtavCostesbasicos_sdt__menergia_Visible ;
   private int edtavCostesbasicos_sdt__mgas_Visible ;
   private int edtavCostesbasicos_sdt__magua_Visible ;
   private int edtavCostesbasicos_sdt__mgi_Visible ;
   private int edtavCostesbasicos_sdt__mam_Visible ;
   private int edtavCostesbasicos_sdt__madc_Visible ;
   private int edtavCostesbasicos_sdt__barunimed_Visible ;
   private int edtavCostesbasicos_sdt__costeteo_Visible ;
   private int AV25PageToGo ;
   private int AV47clicod ;
   private int AV52Barcolnum ;
   private int AV103GXV36 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavDetailwebcomponent_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV26GridCurrentPage ;
   private long AV27GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV53barkgm ;
   private java.math.BigDecimal AV54Barmtr ;
   private java.math.BigDecimal AV55costefab2 ;
   private java.math.BigDecimal AV56magua ;
   private java.math.BigDecimal AV57menergia ;
   private java.math.BigDecimal AV58mgas ;
   private java.math.BigDecimal AV59mmod ;
   private java.math.BigDecimal AV60mmoi ;
   private java.math.BigDecimal AV61madc ;
   private java.math.BigDecimal AV62mam ;
   private java.math.BigDecimal AV63mgi ;
   private java.math.BigDecimal AV64costeoperario1 ;
   private String wcpOAV28Emprcod ;
   private String wcpOAV35artcod ;
   private String wcpOAV38barcodpar ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV28Emprcod ;
   private String AV35artcod ;
   private String AV38barcodpar ;
   private String sGXsfl_41_idx="0001" ;
   private String AV102Pgmname ;
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
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Fixable ;
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
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divCell_grid_dwc_Internalname ;
   private String divCell_grid_dwc_Class ;
   private String WebComp_Grid_dwc_Component ;
   private String OldGrid_dwc ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavCostesbasicos_sdt__clicod_Internalname ;
   private String AV46DetailWebComponent ;
   private String edtavDetailwebcomponent_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String edtavCostesbasicos_sdt__clinom_Internalname ;
   private String edtavCostesbasicos_sdt__barcod_Internalname ;
   private String edtavCostesbasicos_sdt__barcodreo_Internalname ;
   private String edtavCostesbasicos_sdt__barcodpar_Internalname ;
   private String edtavCostesbasicos_sdt__barnhdr_Internalname ;
   private String edtavCostesbasicos_sdt__barser_Internalname ;
   private String edtavCostesbasicos_sdt__barserdsc_Internalname ;
   private String edtavCostesbasicos_sdt__bartipart_Internalname ;
   private String edtavCostesbasicos_sdt__barcolnom_Internalname ;
   private String edtavCostesbasicos_sdt__barcolnum_Internalname ;
   private String edtavCostesbasicos_sdt__barkgm_Internalname ;
   private String edtavCostesbasicos_sdt__barmtr_Internalname ;
   private String edtavCostesbasicos_sdt__coste_p_Internalname ;
   private String edtavCostesbasicos_sdt__costequimicoacumulado_Internalname ;
   private String edtavCostesbasicos_sdt__costefab_Internalname ;
   private String edtavCostesbasicos_sdt__costefab2_Internalname ;
   private String edtavCostesbasicos_sdt__costefabacumulado_Internalname ;
   private String edtavCostesbasicos_sdt__valor_Internalname ;
   private String edtavCostesbasicos_sdt__margen_Internalname ;
   private String edtavCostesbasicos_sdt__txtalb_Internalname ;
   private String edtavCostesbasicos_sdt__barprekgm_Internalname ;
   private String edtavCostesbasicos_sdt__barfecgen_Internalname ;
   private String edtavCostesbasicos_sdt__barfecsal_Internalname ;
   private String edtavCostesbasicos_sdt__mmod_Internalname ;
   private String edtavCostesbasicos_sdt__mmoi_Internalname ;
   private String edtavCostesbasicos_sdt__menergia_Internalname ;
   private String edtavCostesbasicos_sdt__mgas_Internalname ;
   private String edtavCostesbasicos_sdt__magua_Internalname ;
   private String edtavCostesbasicos_sdt__mgi_Internalname ;
   private String edtavCostesbasicos_sdt__mam_Internalname ;
   private String edtavCostesbasicos_sdt__madc_Internalname ;
   private String edtavCostesbasicos_sdt__barunimed_Internalname ;
   private String edtavCostesbasicos_sdt__costeteo_Internalname ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String hsh ;
   private String AV39Station ;
   private String GXv_char2[] ;
   private String AV40EmprNom ;
   private String AV41UsurCod ;
   private String GXv_char3[] ;
   private String AV48Clinom ;
   private String AV49barser ;
   private String AV50barserdsc ;
   private String AV51barcolnom ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV28Emprcod ;
   private String sCtrlAV29Clicodfrom ;
   private String sCtrlAV30Clicodto ;
   private String sCtrlAV31barfecgenfrom ;
   private String sCtrlAV32barfecgento ;
   private String sCtrlAV33barfecsalfrom ;
   private String sCtrlAV34barfecsalto ;
   private String sCtrlAV35artcod ;
   private String sCtrlAV36barcod ;
   private String sCtrlAV37barcodreo ;
   private String sCtrlAV38barcodpar ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavCostesbasicos_sdt__clicod_Jsonclick ;
   private String edtavCostesbasicos_sdt__clinom_Jsonclick ;
   private String edtavCostesbasicos_sdt__barcod_Jsonclick ;
   private String edtavCostesbasicos_sdt__barcodreo_Jsonclick ;
   private String edtavCostesbasicos_sdt__barcodpar_Jsonclick ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String edtavCostesbasicos_sdt__barnhdr_Jsonclick ;
   private String edtavCostesbasicos_sdt__barser_Jsonclick ;
   private String edtavCostesbasicos_sdt__barserdsc_Jsonclick ;
   private String edtavCostesbasicos_sdt__bartipart_Jsonclick ;
   private String edtavCostesbasicos_sdt__barcolnom_Jsonclick ;
   private String edtavCostesbasicos_sdt__barcolnum_Jsonclick ;
   private String edtavCostesbasicos_sdt__barkgm_Jsonclick ;
   private String edtavCostesbasicos_sdt__barmtr_Jsonclick ;
   private String edtavCostesbasicos_sdt__coste_p_Jsonclick ;
   private String edtavCostesbasicos_sdt__costequimicoacumulado_Jsonclick ;
   private String edtavCostesbasicos_sdt__costefab_Jsonclick ;
   private String edtavCostesbasicos_sdt__costefab2_Jsonclick ;
   private String edtavCostesbasicos_sdt__costefabacumulado_Jsonclick ;
   private String edtavCostesbasicos_sdt__valor_Jsonclick ;
   private String edtavCostesbasicos_sdt__margen_Jsonclick ;
   private String edtavCostesbasicos_sdt__txtalb_Jsonclick ;
   private String edtavCostesbasicos_sdt__barprekgm_Jsonclick ;
   private String edtavCostesbasicos_sdt__barfecgen_Jsonclick ;
   private String edtavCostesbasicos_sdt__barfecsal_Jsonclick ;
   private String edtavCostesbasicos_sdt__mmod_Jsonclick ;
   private String edtavCostesbasicos_sdt__mmoi_Jsonclick ;
   private String edtavCostesbasicos_sdt__menergia_Jsonclick ;
   private String edtavCostesbasicos_sdt__mgas_Jsonclick ;
   private String edtavCostesbasicos_sdt__magua_Jsonclick ;
   private String edtavCostesbasicos_sdt__mgi_Jsonclick ;
   private String edtavCostesbasicos_sdt__mam_Jsonclick ;
   private String edtavCostesbasicos_sdt__madc_Jsonclick ;
   private String edtavCostesbasicos_sdt__barunimed_Jsonclick ;
   private String edtavCostesbasicos_sdt__costeteo_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV31barfecgenfrom ;
   private java.util.Date wcpOAV32barfecgento ;
   private java.util.Date wcpOAV33barfecsalfrom ;
   private java.util.Date wcpOAV34barfecsalto ;
   private java.util.Date AV31barfecgenfrom ;
   private java.util.Date AV32barfecgento ;
   private java.util.Date AV33barfecsalfrom ;
   private java.util.Date AV34barfecsalto ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private boolean bGXsfl_41_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV41 ;
   private boolean gx_refresh_fired ;
   private boolean bDynCreated_Grid_dwc ;
   private String AV42CostesBasicos_SDTjson ;
   private String AV16ColumnsSelectorXML ;
   private String AV22ManageFiltersXml ;
   private String AV17UserCustomValue ;
   private String AV12FilterFullText ;
   private String AV14ExcelFilename ;
   private String AV15ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private com.genexus.webpanels.WebSession AV45wEBSESSION ;
   private GXBaseCollection<app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem> AV13CostesBasicos_SDT ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV21ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState14[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV24DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

