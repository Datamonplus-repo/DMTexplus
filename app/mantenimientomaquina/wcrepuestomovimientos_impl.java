package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcrepuestomovimientos_impl extends GXWebComponent
{
   public wcrepuestomovimientos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcrepuestomovimientos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcrepuestomovimientos_impl.class ));
   }

   public wcrepuestomovimientos_impl( int remoteHandle ,
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
               AV58EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58EmprCod", AV58EmprCod);
               AV59MRCod = (int)(GXutil.lval( httpContext.GetPar( "MRCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59MRCod), 8, 0));
               AV61MRNom = httpContext.GetPar( "MRNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61MRNom", AV61MRNom);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV58EmprCod,Integer.valueOf(AV59MRCod),AV61MRNom});
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
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV58EmprCod = httpContext.GetPar( "EmprCod") ;
      AV59MRCod = (int)(GXutil.lval( httpContext.GetPar( "MRCod"))) ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV61MRNom = httpContext.GetPar( "MRNom") ;
      AV34TFMRMov = GXutil.lval( httpContext.GetPar( "TFMRMov")) ;
      AV35TFMRMov_To = GXutil.lval( httpContext.GetPar( "TFMRMov_To")) ;
      AV36TFMRMovOrd = (int)(GXutil.lval( httpContext.GetPar( "TFMRMovOrd"))) ;
      AV37TFMRMovOrd_To = (int)(GXutil.lval( httpContext.GetPar( "TFMRMovOrd_To"))) ;
      AV38TFMRMovFch = localUtil.parseDTimeParm( httpContext.GetPar( "TFMRMovFch")) ;
      AV42TFMRMovTpo = (int)(GXutil.lval( httpContext.GetPar( "TFMRMovTpo"))) ;
      AV43TFMRMovTpo_To = (int)(GXutil.lval( httpContext.GetPar( "TFMRMovTpo_To"))) ;
      AV44TFMRMovTpoD = httpContext.GetPar( "TFMRMovTpoD") ;
      AV45TFMRMovTpoD_Sel = httpContext.GetPar( "TFMRMovTpoD_Sel") ;
      AV46TFMRMovDsc = httpContext.GetPar( "TFMRMovDsc") ;
      AV47TFMRMovDsc_Sel = httpContext.GetPar( "TFMRMovDsc_Sel") ;
      AV48TFMRMovCnt = CommonUtil.decimalVal( httpContext.GetPar( "TFMRMovCnt"), ".") ;
      AV49TFMRMovCnt_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMRMovCnt_To"), ".") ;
      AV50TFMRMovPre = CommonUtil.decimalVal( httpContext.GetPar( "TFMRMovPre"), ".") ;
      AV51TFMRMovPre_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMRMovPre_To"), ".") ;
      AV103Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      A9410MTMovCod = (int)(GXutil.lval( httpContext.GetPar( "MTMovCod"))) ;
      AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod = httpContext.GetPar( "Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod") ;
      AV85Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod = (int)(GXutil.lval( httpContext.GetPar( "Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV58EmprCod, AV59MRCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV61MRNom, AV34TFMRMov, AV35TFMRMov_To, AV36TFMRMovOrd, AV37TFMRMovOrd_To, AV38TFMRMovFch, AV42TFMRMovTpo, AV43TFMRMovTpo_To, AV44TFMRMovTpoD, AV45TFMRMovTpoD_Sel, AV46TFMRMovDsc, AV47TFMRMovDsc_Sel, AV48TFMRMovCnt, AV49TFMRMovCnt_To, AV50TFMRMovPre, AV51TFMRMovPre_To, AV103Pgmname, AV12OrderedBy, AV13OrderedDsc, A9410MTMovCod, AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod, AV85Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paYK2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Tabla MRe Mov (Movimientos Repuestos)", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.mantenimientomaquina.wcrepuestomovimientos", new String[] {GXutil.URLEncode(GXutil.rtrim(AV58EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV59MRCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV61MRNom))}, new String[] {"EmprCod","MRCod","MRNom"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV103Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV15FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_43", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_43, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV54GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV55GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV52DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV52DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV58EmprCod", GXutil.rtrim( wcpOAV58EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV59MRCod", GXutil.ltrim( localUtil.ntoc( wcpOAV59MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV61MRNom", GXutil.rtrim( wcpOAV61MRNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV25ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV58EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMRCOD", GXutil.ltrim( localUtil.ntoc( AV59MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMRNOM", GXutil.rtrim( AV61MRNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRMOV", GXutil.ltrim( localUtil.ntoc( AV34TFMRMov, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRMOV_TO", GXutil.ltrim( localUtil.ntoc( AV35TFMRMov_To, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRMOVORD", GXutil.ltrim( localUtil.ntoc( AV36TFMRMovOrd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRMOVORD_TO", GXutil.ltrim( localUtil.ntoc( AV37TFMRMovOrd_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRMOVFCH", localUtil.ttoc( AV38TFMRMovFch, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRMOVTPO", GXutil.ltrim( localUtil.ntoc( AV42TFMRMovTpo, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRMOVTPO_TO", GXutil.ltrim( localUtil.ntoc( AV43TFMRMovTpo_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRMOVTPOD", GXutil.rtrim( AV44TFMRMovTpoD));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRMOVTPOD_SEL", GXutil.rtrim( AV45TFMRMovTpoD_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRMOVDSC", GXutil.rtrim( AV46TFMRMovDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRMOVDSC_SEL", GXutil.rtrim( AV47TFMRMovDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRMOVCNT", GXutil.ltrim( localUtil.ntoc( AV48TFMRMovCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRMOVCNT_TO", GXutil.ltrim( localUtil.ntoc( AV49TFMRMovCnt_To, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRMOVPRE", GXutil.ltrim( localUtil.ntoc( AV50TFMRMovPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRMOVPRE_TO", GXutil.ltrim( localUtil.ntoc( AV51TFMRMovPre_To, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV103Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV103Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MTMOVCOD", GXutil.ltrim( localUtil.ntoc( A9410MTMovCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANTENIMIENTOMAQUINA_WCREPUESTOMOVIMIENTOSDS_1_EMPRCOD", GXutil.rtrim( AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANTENIMIENTOMAQUINA_WCREPUESTOMOVIMIENTOSDS_2_MRCOD", GXutil.ltrim( localUtil.ntoc( AV85Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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

   public void renderHtmlCloseFormYK2( )
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
      return "MantenimientoMaquina.WCRepuestoMovimientos" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Tabla MRe Mov (Movimientos Repuestos)", "") ;
   }

   public void wbYK0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.mantenimientomaquina.wcrepuestomovimientos");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\WCRepuestoMovimientos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 7, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e11yk1_client"+"'", TempTags, "", 2, "HLP_MantenimientoMaquina\\WCRepuestoMovimientos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\WCRepuestoMovimientos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\WCRepuestoMovimientos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_YK2( true) ;
      }
      else
      {
         wb_table1_25_YK2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_YK2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV54GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV55GridPageCount);
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV52DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMRNom_Internalname, GXutil.rtrim( A9493MRNom), GXutil.rtrim( localUtil.format( A9493MRNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRNom_Jsonclick, 0, "Attribute", "", "", "", "", edtMRNom_Visible, 0, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\WCRepuestoMovimientos.htm");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, sPrefix+"INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV52DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_mrmovfchauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_mrmovfchauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_mrmovfchauxdate_Internalname, localUtil.format(AV40DDO_MRMovFchAuxDate, "99/99/99"), localUtil.format( AV40DDO_MRMovFchAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,66);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_mrmovfchauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\WCRepuestoMovimientos.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_mrmovfchauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\WCRepuestoMovimientos.htm");
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

   public void startYK2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Tabla MRe Mov (Movimientos Repuestos)", ""), (short)(0)) ;
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
            strupYK0( ) ;
         }
      }
   }

   public void wsYK2( )
   {
      startYK2( ) ;
      evtYK2( ) ;
   }

   public void evtYK2( )
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
                              strupYK0( ) ;
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
                              strupYK0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e12YK2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupYK0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e13YK2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupYK0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e14YK2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupYK0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e15YK2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupYK0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e16YK2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupYK0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e17YK2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupYK0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e18YK2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupYK0( ) ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "'DOKARDEXEXPORT'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupYK0( ) ;
                           }
                           nGXsfl_43_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_432( ) ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A9492MRCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A9502MRMov = localUtil.ctol( httpContext.cgiGet( edtMRMov_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A9503MRMovOrd = (int)(localUtil.ctol( httpContext.cgiGet( edtMRMovOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A9504MRMovFch = localUtil.ctot( httpContext.cgiGet( edtMRMovFch_Internalname), 0) ;
                           A9505MRMovTpo = (int)(localUtil.ctol( httpContext.cgiGet( edtMRMovTpo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A9506MRMovTpoD = httpContext.cgiGet( edtMRMovTpoD_Internalname) ;
                           n9506MRMovTpoD = false ;
                           A9507MRMovDsc = httpContext.cgiGet( edtMRMovDsc_Internalname) ;
                           A9508MRMovCnt = localUtil.ctond( httpContext.cgiGet( edtMRMovCnt_Internalname)) ;
                           A9509MRMovPre = localUtil.ctond( httpContext.cgiGet( edtMRMovPre_Internalname)) ;
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
                                       e19YK2 ();
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
                                       e20YK2 ();
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
                                       e21YK2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "'DOKARDEXEXPORT'") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: 'DoKardexExport' */
                                       e22YK2 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
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
                                    strupYK0( ) ;
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

   public void weYK2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormYK2( ) ;
         }
      }
   }

   public void paYK2( )
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
                                 String AV15FilterFullText ,
                                 String AV58EmprCod ,
                                 int AV59MRCod ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV61MRNom ,
                                 long AV34TFMRMov ,
                                 long AV35TFMRMov_To ,
                                 int AV36TFMRMovOrd ,
                                 int AV37TFMRMovOrd_To ,
                                 java.util.Date AV38TFMRMovFch ,
                                 int AV42TFMRMovTpo ,
                                 int AV43TFMRMovTpo_To ,
                                 String AV44TFMRMovTpoD ,
                                 String AV45TFMRMovTpoD_Sel ,
                                 String AV46TFMRMovDsc ,
                                 String AV47TFMRMovDsc_Sel ,
                                 java.math.BigDecimal AV48TFMRMovCnt ,
                                 java.math.BigDecimal AV49TFMRMovCnt_To ,
                                 java.math.BigDecimal AV50TFMRMovPre ,
                                 java.math.BigDecimal AV51TFMRMovPre_To ,
                                 String AV103Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 int A9410MTMovCod ,
                                 String AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod ,
                                 int AV85Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e20YK2 ();
      GRID_nCurrentRecord = 0 ;
      rfYK2( ) ;
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
      rfYK2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV103Pgmname = "MantenimientoMaquina.WCRepuestoMovimientos" ;
      Gx_err = (short)(0) ;
   }

   public void rfYK2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(43) ;
      /* Execute user event: Refresh */
      e20YK2 ();
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
                                              AV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext ,
                                              Long.valueOf(AV88Mantenimientomaquina_wcrepuestomovimientosds_5_tfmrmov) ,
                                              Long.valueOf(AV89Mantenimientomaquina_wcrepuestomovimientosds_6_tfmrmov_to) ,
                                              Integer.valueOf(AV90Mantenimientomaquina_wcrepuestomovimientosds_7_tfmrmovord) ,
                                              Integer.valueOf(AV91Mantenimientomaquina_wcrepuestomovimientosds_8_tfmrmovord_to) ,
                                              AV92Mantenimientomaquina_wcrepuestomovimientosds_9_tfmrmovfch ,
                                              Integer.valueOf(AV93Mantenimientomaquina_wcrepuestomovimientosds_10_tfmrmovtpo) ,
                                              Integer.valueOf(AV94Mantenimientomaquina_wcrepuestomovimientosds_11_tfmrmovtpo_to) ,
                                              AV96Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel ,
                                              AV95Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod ,
                                              AV98Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel ,
                                              AV97Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc ,
                                              AV99Mantenimientomaquina_wcrepuestomovimientosds_16_tfmrmovcnt ,
                                              AV100Mantenimientomaquina_wcrepuestomovimientosds_17_tfmrmovcnt_to ,
                                              AV101Mantenimientomaquina_wcrepuestomovimientosds_18_tfmrmovpre ,
                                              AV102Mantenimientomaquina_wcrepuestomovimientosds_19_tfmrmovpre_to ,
                                              Long.valueOf(A9502MRMov) ,
                                              Integer.valueOf(A9503MRMovOrd) ,
                                              Integer.valueOf(A9505MRMovTpo) ,
                                              A9506MRMovTpoD ,
                                              A9507MRMovDsc ,
                                              A9508MRMovCnt ,
                                              A9509MRMovPre ,
                                              A9504MRMovFch ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              A9493MRNom ,
                                              AV86Mantenimientomaquina_wcrepuestomovimientosds_3_mrnom ,
                                              A396EmprCod ,
                                              AV58EmprCod ,
                                              Integer.valueOf(A9492MRCod) ,
                                              Integer.valueOf(AV59MRCod) ,
                                              AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod ,
                                              Integer.valueOf(AV85Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
         lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
         lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
         lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
         lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
         lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
         lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
         lV95Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod = GXutil.padr( GXutil.rtrim( AV95Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod), 30, "%") ;
         lV97Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc = GXutil.padr( GXutil.rtrim( AV97Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc), 30, "%") ;
         /* Using cursor H00YK2 */
         pr_default.execute(0, new Object[] {AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod, Integer.valueOf(AV85Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod), AV86Mantenimientomaquina_wcrepuestomovimientosds_3_mrnom, AV58EmprCod, Integer.valueOf(AV59MRCod), lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext, lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext, lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext, lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext, lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext, lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext, lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext, Long.valueOf(AV88Mantenimientomaquina_wcrepuestomovimientosds_5_tfmrmov), Long.valueOf(AV89Mantenimientomaquina_wcrepuestomovimientosds_6_tfmrmov_to), Integer.valueOf(AV90Mantenimientomaquina_wcrepuestomovimientosds_7_tfmrmovord), Integer.valueOf(AV91Mantenimientomaquina_wcrepuestomovimientosds_8_tfmrmovord_to), AV92Mantenimientomaquina_wcrepuestomovimientosds_9_tfmrmovfch, Integer.valueOf(AV93Mantenimientomaquina_wcrepuestomovimientosds_10_tfmrmovtpo), Integer.valueOf(AV94Mantenimientomaquina_wcrepuestomovimientosds_11_tfmrmovtpo_to), lV95Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod, AV96Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel, lV97Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc, AV98Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel, AV99Mantenimientomaquina_wcrepuestomovimientosds_16_tfmrmovcnt, AV100Mantenimientomaquina_wcrepuestomovimientosds_17_tfmrmovcnt_to, AV101Mantenimientomaquina_wcrepuestomovimientosds_18_tfmrmovpre, AV102Mantenimientomaquina_wcrepuestomovimientosds_19_tfmrmovpre_to, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_43_idx = 1 ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A9493MRNom = H00YK2_A9493MRNom[0] ;
            n9493MRNom = H00YK2_n9493MRNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9493MRNom", A9493MRNom);
            A9509MRMovPre = H00YK2_A9509MRMovPre[0] ;
            A9508MRMovCnt = H00YK2_A9508MRMovCnt[0] ;
            A9507MRMovDsc = H00YK2_A9507MRMovDsc[0] ;
            A9506MRMovTpoD = H00YK2_A9506MRMovTpoD[0] ;
            n9506MRMovTpoD = H00YK2_n9506MRMovTpoD[0] ;
            A9505MRMovTpo = H00YK2_A9505MRMovTpo[0] ;
            A9504MRMovFch = H00YK2_A9504MRMovFch[0] ;
            A9503MRMovOrd = H00YK2_A9503MRMovOrd[0] ;
            A9502MRMov = H00YK2_A9502MRMov[0] ;
            A9492MRCod = H00YK2_A9492MRCod[0] ;
            A396EmprCod = H00YK2_A396EmprCod[0] ;
            A9493MRNom = H00YK2_A9493MRNom[0] ;
            n9493MRNom = H00YK2_n9493MRNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9493MRNom", A9493MRNom);
            A9506MRMovTpoD = H00YK2_A9506MRMovTpoD[0] ;
            n9506MRMovTpoD = H00YK2_n9506MRMovTpoD[0] ;
            e21YK2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(43) ;
         wbYK0( ) ;
      }
      bGXsfl_43_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesYK2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV103Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV103Pgmname, ""))));
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
      AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod = AV58EmprCod ;
      AV85Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod = AV59MRCod ;
      AV86Mantenimientomaquina_wcrepuestomovimientosds_3_mrnom = AV61MRNom ;
      AV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = AV15FilterFullText ;
      AV88Mantenimientomaquina_wcrepuestomovimientosds_5_tfmrmov = AV34TFMRMov ;
      AV89Mantenimientomaquina_wcrepuestomovimientosds_6_tfmrmov_to = AV35TFMRMov_To ;
      AV90Mantenimientomaquina_wcrepuestomovimientosds_7_tfmrmovord = AV36TFMRMovOrd ;
      AV91Mantenimientomaquina_wcrepuestomovimientosds_8_tfmrmovord_to = AV37TFMRMovOrd_To ;
      AV92Mantenimientomaquina_wcrepuestomovimientosds_9_tfmrmovfch = AV38TFMRMovFch ;
      AV93Mantenimientomaquina_wcrepuestomovimientosds_10_tfmrmovtpo = AV42TFMRMovTpo ;
      AV94Mantenimientomaquina_wcrepuestomovimientosds_11_tfmrmovtpo_to = AV43TFMRMovTpo_To ;
      AV95Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod = AV44TFMRMovTpoD ;
      AV96Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel = AV45TFMRMovTpoD_Sel ;
      AV97Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc = AV46TFMRMovDsc ;
      AV98Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel = AV47TFMRMovDsc_Sel ;
      AV99Mantenimientomaquina_wcrepuestomovimientosds_16_tfmrmovcnt = AV48TFMRMovCnt ;
      AV100Mantenimientomaquina_wcrepuestomovimientosds_17_tfmrmovcnt_to = AV49TFMRMovCnt_To ;
      AV101Mantenimientomaquina_wcrepuestomovimientosds_18_tfmrmovpre = AV50TFMRMovPre ;
      AV102Mantenimientomaquina_wcrepuestomovimientosds_19_tfmrmovpre_to = AV51TFMRMovPre_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext ,
                                           Long.valueOf(AV88Mantenimientomaquina_wcrepuestomovimientosds_5_tfmrmov) ,
                                           Long.valueOf(AV89Mantenimientomaquina_wcrepuestomovimientosds_6_tfmrmov_to) ,
                                           Integer.valueOf(AV90Mantenimientomaquina_wcrepuestomovimientosds_7_tfmrmovord) ,
                                           Integer.valueOf(AV91Mantenimientomaquina_wcrepuestomovimientosds_8_tfmrmovord_to) ,
                                           AV92Mantenimientomaquina_wcrepuestomovimientosds_9_tfmrmovfch ,
                                           Integer.valueOf(AV93Mantenimientomaquina_wcrepuestomovimientosds_10_tfmrmovtpo) ,
                                           Integer.valueOf(AV94Mantenimientomaquina_wcrepuestomovimientosds_11_tfmrmovtpo_to) ,
                                           AV96Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel ,
                                           AV95Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod ,
                                           AV98Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel ,
                                           AV97Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc ,
                                           AV99Mantenimientomaquina_wcrepuestomovimientosds_16_tfmrmovcnt ,
                                           AV100Mantenimientomaquina_wcrepuestomovimientosds_17_tfmrmovcnt_to ,
                                           AV101Mantenimientomaquina_wcrepuestomovimientosds_18_tfmrmovpre ,
                                           AV102Mantenimientomaquina_wcrepuestomovimientosds_19_tfmrmovpre_to ,
                                           Long.valueOf(A9502MRMov) ,
                                           Integer.valueOf(A9503MRMovOrd) ,
                                           Integer.valueOf(A9505MRMovTpo) ,
                                           A9506MRMovTpoD ,
                                           A9507MRMovDsc ,
                                           A9508MRMovCnt ,
                                           A9509MRMovPre ,
                                           A9504MRMovFch ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           A9493MRNom ,
                                           AV86Mantenimientomaquina_wcrepuestomovimientosds_3_mrnom ,
                                           A396EmprCod ,
                                           AV58EmprCod ,
                                           Integer.valueOf(A9492MRCod) ,
                                           Integer.valueOf(AV59MRCod) ,
                                           AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod ,
                                           Integer.valueOf(AV85Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV95Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod = GXutil.padr( GXutil.rtrim( AV95Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod), 30, "%") ;
      lV97Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc = GXutil.padr( GXutil.rtrim( AV97Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc), 30, "%") ;
      /* Using cursor H00YK3 */
      pr_default.execute(1, new Object[] {AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod, Integer.valueOf(AV85Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod), AV86Mantenimientomaquina_wcrepuestomovimientosds_3_mrnom, AV58EmprCod, Integer.valueOf(AV59MRCod), lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext, lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext, lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext, lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext, lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext, lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext, lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext, Long.valueOf(AV88Mantenimientomaquina_wcrepuestomovimientosds_5_tfmrmov), Long.valueOf(AV89Mantenimientomaquina_wcrepuestomovimientosds_6_tfmrmov_to), Integer.valueOf(AV90Mantenimientomaquina_wcrepuestomovimientosds_7_tfmrmovord), Integer.valueOf(AV91Mantenimientomaquina_wcrepuestomovimientosds_8_tfmrmovord_to), AV92Mantenimientomaquina_wcrepuestomovimientosds_9_tfmrmovfch, Integer.valueOf(AV93Mantenimientomaquina_wcrepuestomovimientosds_10_tfmrmovtpo), Integer.valueOf(AV94Mantenimientomaquina_wcrepuestomovimientosds_11_tfmrmovtpo_to), lV95Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod, AV96Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel, lV97Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc, AV98Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel, AV99Mantenimientomaquina_wcrepuestomovimientosds_16_tfmrmovcnt, AV100Mantenimientomaquina_wcrepuestomovimientosds_17_tfmrmovcnt_to, AV101Mantenimientomaquina_wcrepuestomovimientosds_18_tfmrmovpre, AV102Mantenimientomaquina_wcrepuestomovimientosds_19_tfmrmovpre_to});
      GRID_nRecordCount = H00YK3_AGRID_nRecordCount[0] ;
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
      AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod = AV58EmprCod ;
      AV85Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod = AV59MRCod ;
      AV86Mantenimientomaquina_wcrepuestomovimientosds_3_mrnom = AV61MRNom ;
      AV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = AV15FilterFullText ;
      AV88Mantenimientomaquina_wcrepuestomovimientosds_5_tfmrmov = AV34TFMRMov ;
      AV89Mantenimientomaquina_wcrepuestomovimientosds_6_tfmrmov_to = AV35TFMRMov_To ;
      AV90Mantenimientomaquina_wcrepuestomovimientosds_7_tfmrmovord = AV36TFMRMovOrd ;
      AV91Mantenimientomaquina_wcrepuestomovimientosds_8_tfmrmovord_to = AV37TFMRMovOrd_To ;
      AV92Mantenimientomaquina_wcrepuestomovimientosds_9_tfmrmovfch = AV38TFMRMovFch ;
      AV93Mantenimientomaquina_wcrepuestomovimientosds_10_tfmrmovtpo = AV42TFMRMovTpo ;
      AV94Mantenimientomaquina_wcrepuestomovimientosds_11_tfmrmovtpo_to = AV43TFMRMovTpo_To ;
      AV95Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod = AV44TFMRMovTpoD ;
      AV96Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel = AV45TFMRMovTpoD_Sel ;
      AV97Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc = AV46TFMRMovDsc ;
      AV98Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel = AV47TFMRMovDsc_Sel ;
      AV99Mantenimientomaquina_wcrepuestomovimientosds_16_tfmrmovcnt = AV48TFMRMovCnt ;
      AV100Mantenimientomaquina_wcrepuestomovimientosds_17_tfmrmovcnt_to = AV49TFMRMovCnt_To ;
      AV101Mantenimientomaquina_wcrepuestomovimientosds_18_tfmrmovpre = AV50TFMRMovPre ;
      AV102Mantenimientomaquina_wcrepuestomovimientosds_19_tfmrmovpre_to = AV51TFMRMovPre_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV58EmprCod, AV59MRCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV61MRNom, AV34TFMRMov, AV35TFMRMov_To, AV36TFMRMovOrd, AV37TFMRMovOrd_To, AV38TFMRMovFch, AV42TFMRMovTpo, AV43TFMRMovTpo_To, AV44TFMRMovTpoD, AV45TFMRMovTpoD_Sel, AV46TFMRMovDsc, AV47TFMRMovDsc_Sel, AV48TFMRMovCnt, AV49TFMRMovCnt_To, AV50TFMRMovPre, AV51TFMRMovPre_To, AV103Pgmname, AV12OrderedBy, AV13OrderedDsc, A9410MTMovCod, AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod, AV85Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod = AV58EmprCod ;
      AV85Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod = AV59MRCod ;
      AV86Mantenimientomaquina_wcrepuestomovimientosds_3_mrnom = AV61MRNom ;
      AV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = AV15FilterFullText ;
      AV88Mantenimientomaquina_wcrepuestomovimientosds_5_tfmrmov = AV34TFMRMov ;
      AV89Mantenimientomaquina_wcrepuestomovimientosds_6_tfmrmov_to = AV35TFMRMov_To ;
      AV90Mantenimientomaquina_wcrepuestomovimientosds_7_tfmrmovord = AV36TFMRMovOrd ;
      AV91Mantenimientomaquina_wcrepuestomovimientosds_8_tfmrmovord_to = AV37TFMRMovOrd_To ;
      AV92Mantenimientomaquina_wcrepuestomovimientosds_9_tfmrmovfch = AV38TFMRMovFch ;
      AV93Mantenimientomaquina_wcrepuestomovimientosds_10_tfmrmovtpo = AV42TFMRMovTpo ;
      AV94Mantenimientomaquina_wcrepuestomovimientosds_11_tfmrmovtpo_to = AV43TFMRMovTpo_To ;
      AV95Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod = AV44TFMRMovTpoD ;
      AV96Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel = AV45TFMRMovTpoD_Sel ;
      AV97Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc = AV46TFMRMovDsc ;
      AV98Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel = AV47TFMRMovDsc_Sel ;
      AV99Mantenimientomaquina_wcrepuestomovimientosds_16_tfmrmovcnt = AV48TFMRMovCnt ;
      AV100Mantenimientomaquina_wcrepuestomovimientosds_17_tfmrmovcnt_to = AV49TFMRMovCnt_To ;
      AV101Mantenimientomaquina_wcrepuestomovimientosds_18_tfmrmovpre = AV50TFMRMovPre ;
      AV102Mantenimientomaquina_wcrepuestomovimientosds_19_tfmrmovpre_to = AV51TFMRMovPre_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV58EmprCod, AV59MRCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV61MRNom, AV34TFMRMov, AV35TFMRMov_To, AV36TFMRMovOrd, AV37TFMRMovOrd_To, AV38TFMRMovFch, AV42TFMRMovTpo, AV43TFMRMovTpo_To, AV44TFMRMovTpoD, AV45TFMRMovTpoD_Sel, AV46TFMRMovDsc, AV47TFMRMovDsc_Sel, AV48TFMRMovCnt, AV49TFMRMovCnt_To, AV50TFMRMovPre, AV51TFMRMovPre_To, AV103Pgmname, AV12OrderedBy, AV13OrderedDsc, A9410MTMovCod, AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod, AV85Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod = AV58EmprCod ;
      AV85Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod = AV59MRCod ;
      AV86Mantenimientomaquina_wcrepuestomovimientosds_3_mrnom = AV61MRNom ;
      AV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = AV15FilterFullText ;
      AV88Mantenimientomaquina_wcrepuestomovimientosds_5_tfmrmov = AV34TFMRMov ;
      AV89Mantenimientomaquina_wcrepuestomovimientosds_6_tfmrmov_to = AV35TFMRMov_To ;
      AV90Mantenimientomaquina_wcrepuestomovimientosds_7_tfmrmovord = AV36TFMRMovOrd ;
      AV91Mantenimientomaquina_wcrepuestomovimientosds_8_tfmrmovord_to = AV37TFMRMovOrd_To ;
      AV92Mantenimientomaquina_wcrepuestomovimientosds_9_tfmrmovfch = AV38TFMRMovFch ;
      AV93Mantenimientomaquina_wcrepuestomovimientosds_10_tfmrmovtpo = AV42TFMRMovTpo ;
      AV94Mantenimientomaquina_wcrepuestomovimientosds_11_tfmrmovtpo_to = AV43TFMRMovTpo_To ;
      AV95Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod = AV44TFMRMovTpoD ;
      AV96Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel = AV45TFMRMovTpoD_Sel ;
      AV97Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc = AV46TFMRMovDsc ;
      AV98Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel = AV47TFMRMovDsc_Sel ;
      AV99Mantenimientomaquina_wcrepuestomovimientosds_16_tfmrmovcnt = AV48TFMRMovCnt ;
      AV100Mantenimientomaquina_wcrepuestomovimientosds_17_tfmrmovcnt_to = AV49TFMRMovCnt_To ;
      AV101Mantenimientomaquina_wcrepuestomovimientosds_18_tfmrmovpre = AV50TFMRMovPre ;
      AV102Mantenimientomaquina_wcrepuestomovimientosds_19_tfmrmovpre_to = AV51TFMRMovPre_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV58EmprCod, AV59MRCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV61MRNom, AV34TFMRMov, AV35TFMRMov_To, AV36TFMRMovOrd, AV37TFMRMovOrd_To, AV38TFMRMovFch, AV42TFMRMovTpo, AV43TFMRMovTpo_To, AV44TFMRMovTpoD, AV45TFMRMovTpoD_Sel, AV46TFMRMovDsc, AV47TFMRMovDsc_Sel, AV48TFMRMovCnt, AV49TFMRMovCnt_To, AV50TFMRMovPre, AV51TFMRMovPre_To, AV103Pgmname, AV12OrderedBy, AV13OrderedDsc, A9410MTMovCod, AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod, AV85Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod = AV58EmprCod ;
      AV85Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod = AV59MRCod ;
      AV86Mantenimientomaquina_wcrepuestomovimientosds_3_mrnom = AV61MRNom ;
      AV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = AV15FilterFullText ;
      AV88Mantenimientomaquina_wcrepuestomovimientosds_5_tfmrmov = AV34TFMRMov ;
      AV89Mantenimientomaquina_wcrepuestomovimientosds_6_tfmrmov_to = AV35TFMRMov_To ;
      AV90Mantenimientomaquina_wcrepuestomovimientosds_7_tfmrmovord = AV36TFMRMovOrd ;
      AV91Mantenimientomaquina_wcrepuestomovimientosds_8_tfmrmovord_to = AV37TFMRMovOrd_To ;
      AV92Mantenimientomaquina_wcrepuestomovimientosds_9_tfmrmovfch = AV38TFMRMovFch ;
      AV93Mantenimientomaquina_wcrepuestomovimientosds_10_tfmrmovtpo = AV42TFMRMovTpo ;
      AV94Mantenimientomaquina_wcrepuestomovimientosds_11_tfmrmovtpo_to = AV43TFMRMovTpo_To ;
      AV95Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod = AV44TFMRMovTpoD ;
      AV96Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel = AV45TFMRMovTpoD_Sel ;
      AV97Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc = AV46TFMRMovDsc ;
      AV98Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel = AV47TFMRMovDsc_Sel ;
      AV99Mantenimientomaquina_wcrepuestomovimientosds_16_tfmrmovcnt = AV48TFMRMovCnt ;
      AV100Mantenimientomaquina_wcrepuestomovimientosds_17_tfmrmovcnt_to = AV49TFMRMovCnt_To ;
      AV101Mantenimientomaquina_wcrepuestomovimientosds_18_tfmrmovpre = AV50TFMRMovPre ;
      AV102Mantenimientomaquina_wcrepuestomovimientosds_19_tfmrmovpre_to = AV51TFMRMovPre_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV58EmprCod, AV59MRCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV61MRNom, AV34TFMRMov, AV35TFMRMov_To, AV36TFMRMovOrd, AV37TFMRMovOrd_To, AV38TFMRMovFch, AV42TFMRMovTpo, AV43TFMRMovTpo_To, AV44TFMRMovTpoD, AV45TFMRMovTpoD_Sel, AV46TFMRMovDsc, AV47TFMRMovDsc_Sel, AV48TFMRMovCnt, AV49TFMRMovCnt_To, AV50TFMRMovPre, AV51TFMRMovPre_To, AV103Pgmname, AV12OrderedBy, AV13OrderedDsc, A9410MTMovCod, AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod, AV85Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod = AV58EmprCod ;
      AV85Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod = AV59MRCod ;
      AV86Mantenimientomaquina_wcrepuestomovimientosds_3_mrnom = AV61MRNom ;
      AV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = AV15FilterFullText ;
      AV88Mantenimientomaquina_wcrepuestomovimientosds_5_tfmrmov = AV34TFMRMov ;
      AV89Mantenimientomaquina_wcrepuestomovimientosds_6_tfmrmov_to = AV35TFMRMov_To ;
      AV90Mantenimientomaquina_wcrepuestomovimientosds_7_tfmrmovord = AV36TFMRMovOrd ;
      AV91Mantenimientomaquina_wcrepuestomovimientosds_8_tfmrmovord_to = AV37TFMRMovOrd_To ;
      AV92Mantenimientomaquina_wcrepuestomovimientosds_9_tfmrmovfch = AV38TFMRMovFch ;
      AV93Mantenimientomaquina_wcrepuestomovimientosds_10_tfmrmovtpo = AV42TFMRMovTpo ;
      AV94Mantenimientomaquina_wcrepuestomovimientosds_11_tfmrmovtpo_to = AV43TFMRMovTpo_To ;
      AV95Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod = AV44TFMRMovTpoD ;
      AV96Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel = AV45TFMRMovTpoD_Sel ;
      AV97Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc = AV46TFMRMovDsc ;
      AV98Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel = AV47TFMRMovDsc_Sel ;
      AV99Mantenimientomaquina_wcrepuestomovimientosds_16_tfmrmovcnt = AV48TFMRMovCnt ;
      AV100Mantenimientomaquina_wcrepuestomovimientosds_17_tfmrmovcnt_to = AV49TFMRMovCnt_To ;
      AV101Mantenimientomaquina_wcrepuestomovimientosds_18_tfmrmovpre = AV50TFMRMovPre ;
      AV102Mantenimientomaquina_wcrepuestomovimientosds_19_tfmrmovpre_to = AV51TFMRMovPre_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV58EmprCod, AV59MRCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV61MRNom, AV34TFMRMov, AV35TFMRMov_To, AV36TFMRMovOrd, AV37TFMRMovOrd_To, AV38TFMRMovFch, AV42TFMRMovTpo, AV43TFMRMovTpo_To, AV44TFMRMovTpoD, AV45TFMRMovTpoD_Sel, AV46TFMRMovDsc, AV47TFMRMovDsc_Sel, AV48TFMRMovCnt, AV49TFMRMovCnt_To, AV50TFMRMovPre, AV51TFMRMovPre_To, AV103Pgmname, AV12OrderedBy, AV13OrderedDsc, A9410MTMovCod, AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod, AV85Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV103Pgmname = "MantenimientoMaquina.WCRepuestoMovimientos" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupYK0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e19YK2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV52DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV54GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV55GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV58EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV58EmprCod") ;
         wcpOAV59MRCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV59MRCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV61MRNom = httpContext.cgiGet( sPrefix+"wcpOAV61MRNom") ;
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
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         A9493MRNom = httpContext.cgiGet( edtMRNom_Internalname) ;
         n9493MRNom = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9493MRNom", A9493MRNom);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_mrmovfchauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_MRMOVFCHAUXDATE");
            GX_FocusControl = edtavDdo_mrmovfchauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV40DDO_MRMovFchAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40DDO_MRMovFchAuxDate", localUtil.format(AV40DDO_MRMovFchAuxDate, "99/99/99"));
         }
         else
         {
            AV40DDO_MRMovFchAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_mrmovfchauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40DDO_MRMovFchAuxDate", localUtil.format(AV40DDO_MRMovFchAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
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
      e19YK2 ();
      if (returnInSub) return;
   }

   public void e19YK2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV82Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcrepuestomovimientos_impl.this.GXt_char1 = GXv_char2[0] ;
      AV82Station = GXt_char1 ;
      GXv_char2[0] = AV58EmprCod ;
      GXv_char3[0] = AV83Emprnom ;
      GXv_char4[0] = AV72UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV82Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcrepuestomovimientos_impl.this.AV58EmprCod = GXv_char2[0] ;
      wcrepuestomovimientos_impl.this.AV83Emprnom = GXv_char3[0] ;
      wcrepuestomovimientos_impl.this.AV72UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58EmprCod", AV58EmprCod);
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
      edtMRNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMRNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRNom_Visible), 5, 0), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV52DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV52DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e20YK2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV6WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV25ManageFiltersExecutionStep == 1 )
      {
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV25ManageFiltersExecutionStep == 2 )
      {
         AV25ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV22Session.getValue("MantenimientoMaquina.WCRepuestoMovimientosColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("MantenimientoMaquina.WCRepuestoMovimientosColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtMRMov_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMRMov_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMov_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtMRMovOrd_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMRMovOrd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMovOrd_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtMRMovFch_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMRMovFch_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMovFch_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtMRMovTpo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMRMovTpo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMovTpo_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtMRMovTpoD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMRMovTpoD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMovTpoD_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtMRMovDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMRMovDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMovDsc_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtMRMovCnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMRMovCnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMovCnt_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtMRMovPre_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMRMovPre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMovPre_Visible), 5, 0), !bGXsfl_43_Refreshing);
      AV54GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54GridCurrentPage), 10, 0));
      AV55GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55GridPageCount), 10, 0));
      AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod = AV58EmprCod ;
      AV85Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod = AV59MRCod ;
      AV86Mantenimientomaquina_wcrepuestomovimientosds_3_mrnom = AV61MRNom ;
      AV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = AV15FilterFullText ;
      AV88Mantenimientomaquina_wcrepuestomovimientosds_5_tfmrmov = AV34TFMRMov ;
      AV89Mantenimientomaquina_wcrepuestomovimientosds_6_tfmrmov_to = AV35TFMRMov_To ;
      AV90Mantenimientomaquina_wcrepuestomovimientosds_7_tfmrmovord = AV36TFMRMovOrd ;
      AV91Mantenimientomaquina_wcrepuestomovimientosds_8_tfmrmovord_to = AV37TFMRMovOrd_To ;
      AV92Mantenimientomaquina_wcrepuestomovimientosds_9_tfmrmovfch = AV38TFMRMovFch ;
      AV93Mantenimientomaquina_wcrepuestomovimientosds_10_tfmrmovtpo = AV42TFMRMovTpo ;
      AV94Mantenimientomaquina_wcrepuestomovimientosds_11_tfmrmovtpo_to = AV43TFMRMovTpo_To ;
      AV95Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod = AV44TFMRMovTpoD ;
      AV96Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel = AV45TFMRMovTpoD_Sel ;
      AV97Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc = AV46TFMRMovDsc ;
      AV98Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel = AV47TFMRMovDsc_Sel ;
      AV99Mantenimientomaquina_wcrepuestomovimientosds_16_tfmrmovcnt = AV48TFMRMovCnt ;
      AV100Mantenimientomaquina_wcrepuestomovimientosds_17_tfmrmovcnt_to = AV49TFMRMovCnt_To ;
      AV101Mantenimientomaquina_wcrepuestomovimientosds_18_tfmrmovpre = AV50TFMRMovPre ;
      AV102Mantenimientomaquina_wcrepuestomovimientosds_19_tfmrmovpre_to = AV51TFMRMovPre_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e13YK2( )
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
         AV53PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV53PageToGo) ;
      }
   }

   public void e14YK2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e15YK2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV12OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         AV13OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRMov") == 0 )
         {
            AV34TFMRMov = GXutil.lval( Ddo_grid_Filteredtext_get) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFMRMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFMRMov), 10, 0));
            AV35TFMRMov_To = GXutil.lval( Ddo_grid_Filteredtextto_get) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFMRMov_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFMRMov_To), 10, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRMovOrd") == 0 )
         {
            AV36TFMRMovOrd = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFMRMovOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFMRMovOrd), 8, 0));
            AV37TFMRMovOrd_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFMRMovOrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFMRMovOrd_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRMovFch") == 0 )
         {
            AV38TFMRMovFch = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFMRMovFch", localUtil.ttoc( AV38TFMRMovFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRMovTpo") == 0 )
         {
            AV42TFMRMovTpo = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFMRMovTpo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFMRMovTpo), 8, 0));
            AV43TFMRMovTpo_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFMRMovTpo_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFMRMovTpo_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRMovTpoD") == 0 )
         {
            AV44TFMRMovTpoD = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFMRMovTpoD", AV44TFMRMovTpoD);
            AV45TFMRMovTpoD_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFMRMovTpoD_Sel", AV45TFMRMovTpoD_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRMovDsc") == 0 )
         {
            AV46TFMRMovDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFMRMovDsc", AV46TFMRMovDsc);
            AV47TFMRMovDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFMRMovDsc_Sel", AV47TFMRMovDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRMovCnt") == 0 )
         {
            AV48TFMRMovCnt = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFMRMovCnt", GXutil.ltrimstr( AV48TFMRMovCnt, 10, 3));
            AV49TFMRMovCnt_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFMRMovCnt_To", GXutil.ltrimstr( AV49TFMRMovCnt_To, 10, 3));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRMovPre") == 0 )
         {
            AV50TFMRMovPre = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFMRMovPre", GXutil.ltrimstr( AV50TFMRMovPre, 12, 3));
            AV51TFMRMovPre_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFMRMovPre_To", GXutil.ltrimstr( AV51TFMRMovPre_To, 12, 3));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e21YK2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      edtMRMovTpoD_Link = formatLink("app.mantenimientomaquina.tmtpomoview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9410MTMovCod,8,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","MTMovCod","TabCode"})  ;
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

   public void e16YK2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "MantenimientoMaquina.WCRepuestoMovimientosColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e12YK2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("MantenimientoMaquina.WCRepuestoMovimientosFilters")),GXutil.URLEncode(GXutil.rtrim(AV103Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("MantenimientoMaquina.WCRepuestoMovimientosFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "MantenimientoMaquina.WCRepuestoMovimientosFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         wcrepuestomovimientos_impl.this.GXt_char1 = GXv_char4[0] ;
         AV24ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV24ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV103Pgmname+"GridState", AV24ManageFiltersXml) ;
            AV10GridState.fromxml(AV24ManageFiltersXml, null, null);
            AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
            AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e17YK2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.mantenimientomaquina.wcrepuestomovimientosexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      wcrepuestomovimientos_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      wcrepuestomovimientos_impl.this.AV17ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV16ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV16ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV17ErrorMessage);
      }
   }

   public void e18YK2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.mantenimientomaquina.wcrepuestomovimientosexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV20ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MRMov", "", "Movimiento", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MRMovOrd", "", "Orden", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MRMovFch", "", "Fecha", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MRMovTpo", "", "Tipo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MRMovTpoD", "", "Desc Tipo Movimiento", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MRMovDsc", "", "Descripción", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MRMovCnt", "", "Cantidad", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MRMovPre", "", "Precio del Mov.", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "MantenimientoMaquina.WCRepuestoMovimientosColumnsSelector", GXv_char4) ;
      wcrepuestomovimientos_impl.this.GXt_char1 = GXv_char4[0] ;
      AV19UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV19UserCustomValue)==0) ) )
      {
         AV21ColumnsSelectorAux.fromxml(AV19UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV21ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV23ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "MantenimientoMaquina.WCRepuestoMovimientosFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
      AV34TFMRMov = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFMRMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFMRMov), 10, 0));
      AV35TFMRMov_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFMRMov_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFMRMov_To), 10, 0));
      AV36TFMRMovOrd = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFMRMovOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFMRMovOrd), 8, 0));
      AV37TFMRMovOrd_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFMRMovOrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFMRMovOrd_To), 8, 0));
      AV38TFMRMovFch = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFMRMovFch", localUtil.ttoc( AV38TFMRMovFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV42TFMRMovTpo = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFMRMovTpo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFMRMovTpo), 8, 0));
      AV43TFMRMovTpo_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFMRMovTpo_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFMRMovTpo_To), 8, 0));
      AV44TFMRMovTpoD = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFMRMovTpoD", AV44TFMRMovTpoD);
      AV45TFMRMovTpoD_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFMRMovTpoD_Sel", AV45TFMRMovTpoD_Sel);
      AV46TFMRMovDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFMRMovDsc", AV46TFMRMovDsc);
      AV47TFMRMovDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFMRMovDsc_Sel", AV47TFMRMovDsc_Sel);
      AV48TFMRMovCnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFMRMovCnt", GXutil.ltrimstr( AV48TFMRMovCnt, 10, 3));
      AV49TFMRMovCnt_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFMRMovCnt_To", GXutil.ltrimstr( AV49TFMRMovCnt_To, 10, 3));
      AV50TFMRMovPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFMRMovPre", GXutil.ltrimstr( AV50TFMRMovPre, 12, 3));
      AV51TFMRMovPre_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFMRMovPre_To", GXutil.ltrimstr( AV51TFMRMovPre_To, 12, 3));
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
      if ( GXutil.strcmp(AV22Session.getValue(AV103Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV103Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV103Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV104GXV1 = 1 ;
      while ( AV104GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV104GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOV") == 0 )
         {
            AV34TFMRMov = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFMRMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFMRMov), 10, 0));
            AV35TFMRMov_To = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFMRMov_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFMRMov_To), 10, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVORD") == 0 )
         {
            AV36TFMRMovOrd = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFMRMovOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFMRMovOrd), 8, 0));
            AV37TFMRMovOrd_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFMRMovOrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFMRMovOrd_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVFCH") == 0 )
         {
            AV38TFMRMovFch = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFMRMovFch", localUtil.ttoc( AV38TFMRMovFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV40DDO_MRMovFchAuxDate = GXutil.resetTime(AV38TFMRMovFch) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40DDO_MRMovFchAuxDate", localUtil.format(AV40DDO_MRMovFchAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVTPO") == 0 )
         {
            AV42TFMRMovTpo = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFMRMovTpo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFMRMovTpo), 8, 0));
            AV43TFMRMovTpo_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFMRMovTpo_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFMRMovTpo_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVTPOD") == 0 )
         {
            AV44TFMRMovTpoD = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFMRMovTpoD", AV44TFMRMovTpoD);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVTPOD_SEL") == 0 )
         {
            AV45TFMRMovTpoD_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFMRMovTpoD_Sel", AV45TFMRMovTpoD_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVDSC") == 0 )
         {
            AV46TFMRMovDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFMRMovDsc", AV46TFMRMovDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVDSC_SEL") == 0 )
         {
            AV47TFMRMovDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFMRMovDsc_Sel", AV47TFMRMovDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVCNT") == 0 )
         {
            AV48TFMRMovCnt = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFMRMovCnt", GXutil.ltrimstr( AV48TFMRMovCnt, 10, 3));
            AV49TFMRMovCnt_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFMRMovCnt_To", GXutil.ltrimstr( AV49TFMRMovCnt_To, 10, 3));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVPRE") == 0 )
         {
            AV50TFMRMovPre = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFMRMovPre", GXutil.ltrimstr( AV50TFMRMovPre, 12, 3));
            AV51TFMRMovPre_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFMRMovPre_To", GXutil.ltrimstr( AV51TFMRMovPre_To, 12, 3));
         }
         AV104GXV1 = (int)(AV104GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFMRMovTpoD_Sel)==0), AV45TFMRMovTpoD_Sel, GXv_char4) ;
      wcrepuestomovimientos_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFMRMovDsc_Sel)==0), AV47TFMRMovDsc_Sel, GXv_char3) ;
      wcrepuestomovimientos_impl.this.GXt_char12 = GXv_char3[0] ;
      Ddo_grid_Selectedvalue_set = "||||"+GXt_char1+"|"+GXt_char12+"||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char12 = "" ;
      GXv_char4[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFMRMovTpoD)==0), AV44TFMRMovTpoD, GXv_char4) ;
      wcrepuestomovimientos_impl.this.GXt_char12 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char3[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFMRMovDsc)==0), AV46TFMRMovDsc, GXv_char3) ;
      wcrepuestomovimientos_impl.this.GXt_char1 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV34TFMRMov) ? "" : GXutil.str( AV34TFMRMov, 10, 0))+"|"+((0==AV36TFMRMovOrd) ? "" : GXutil.str( AV36TFMRMovOrd, 8, 0))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV38TFMRMovFch) ? "" : localUtil.dtoc( AV40DDO_MRMovFchAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV42TFMRMovTpo) ? "" : GXutil.str( AV42TFMRMovTpo, 8, 0))+"|"+GXt_char12+"|"+GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFMRMovCnt)==0) ? "" : GXutil.str( AV48TFMRMovCnt, 10, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFMRMovPre)==0) ? "" : GXutil.str( AV50TFMRMovPre, 12, 3)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV35TFMRMov_To) ? "" : GXutil.str( AV35TFMRMov_To, 10, 0))+"|"+((0==AV37TFMRMovOrd_To) ? "" : GXutil.str( AV37TFMRMovOrd_To, 8, 0))+"||"+((0==AV43TFMRMovTpo_To) ? "" : GXutil.str( AV43TFMRMovTpo_To, 8, 0))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFMRMovCnt_To)==0) ? "" : GXutil.str( AV49TFMRMovCnt_To, 10, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFMRMovPre_To)==0) ? "" : GXutil.str( AV51TFMRMovPre_To, 12, 3)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV103Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFMRMOV", "", !((0==AV34TFMRMov)&&(0==AV35TFMRMov_To)), (short)(0), GXutil.trim( GXutil.str( AV34TFMRMov, 10, 0)), GXutil.trim( GXutil.str( AV35TFMRMov_To, 10, 0))) ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFMRMOVORD", "", !((0==AV36TFMRMovOrd)&&(0==AV37TFMRMovOrd_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFMRMovOrd, 8, 0)), GXutil.trim( GXutil.str( AV37TFMRMovOrd_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFMRMOVFCH", "", !GXutil.dateCompare(GXutil.nullDate(), AV38TFMRMovFch), (short)(0), GXutil.trim( localUtil.ttoc( AV38TFMRMovFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFMRMOVTPO", "", !((0==AV42TFMRMovTpo)&&(0==AV43TFMRMovTpo_To)), (short)(0), GXutil.trim( GXutil.str( AV42TFMRMovTpo, 8, 0)), GXutil.trim( GXutil.str( AV43TFMRMovTpo_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFMRMOVTPOD", "", !(GXutil.strcmp("", AV44TFMRMovTpoD)==0), (short)(0), AV44TFMRMovTpoD, "", !(GXutil.strcmp("", AV45TFMRMovTpoD_Sel)==0), AV45TFMRMovTpoD_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFMRMOVDSC", "", !(GXutil.strcmp("", AV46TFMRMovDsc)==0), (short)(0), AV46TFMRMovDsc, "", !(GXutil.strcmp("", AV47TFMRMovDsc_Sel)==0), AV47TFMRMovDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFMRMOVCNT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFMRMovCnt)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFMRMovCnt_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV48TFMRMovCnt, 10, 3)), GXutil.trim( GXutil.str( AV49TFMRMovCnt_To, 10, 3))) ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFMRMOVPRE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFMRMovPre)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFMRMovPre_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV50TFMRMovPre, 12, 3)), GXutil.trim( GXutil.str( AV51TFMRMovPre_To, 12, 3))) ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      if ( ! (GXutil.strcmp("", AV58EmprCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV58EmprCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV59MRCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV59MRCod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV61MRNom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MRNOM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV61MRNom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV103Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV103Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "MReMov" );
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "EmprCod" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV58EmprCod );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "MRCod" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV59MRCod, 8, 0) );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "MRNom" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV61MRNom );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void e22YK2( )
   {
      /* 'DoKardexExport' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.mantenimientomaquina.web_consultakardexrepuestos", new String[] {GXutil.URLEncode(GXutil.rtrim(AV58EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV59MRCod,8,0))}, new String[] {"EmprCod","MRCod"}) , new Object[] {"AV58EmprCod","AV59MRCod"});
      /*  Sending Event outputs  */
   }

   public void wb_table1_25_YK2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV23ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_30_YK2( true) ;
      }
      else
      {
         wb_table2_30_YK2( false) ;
      }
      return  ;
   }

   public void wb_table2_30_YK2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_YK2e( true) ;
      }
      else
      {
         wb_table1_25_YK2e( false) ;
      }
   }

   public void wb_table2_30_YK2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_MantenimientoMaquina\\WCRepuestoMovimientos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_30_YK2e( true) ;
      }
      else
      {
         wb_table2_30_YK2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV58EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58EmprCod", AV58EmprCod);
      AV59MRCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59MRCod), 8, 0));
      AV61MRNom = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61MRNom", AV61MRNom);
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
      paYK2( ) ;
      wsYK2( ) ;
      weYK2( ) ;
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
      sCtrlAV58EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV59MRCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV61MRNom = (String)getParm(obj,2,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paYK2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "mantenimientomaquina\\wcrepuestomovimientos", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paYK2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV58EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58EmprCod", AV58EmprCod);
         AV59MRCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59MRCod), 8, 0));
         AV61MRNom = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61MRNom", AV61MRNom);
      }
      wcpOAV58EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV58EmprCod") ;
      wcpOAV59MRCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV59MRCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV61MRNom = httpContext.cgiGet( sPrefix+"wcpOAV61MRNom") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV58EmprCod, wcpOAV58EmprCod) != 0 ) || ( AV59MRCod != wcpOAV59MRCod ) || ( GXutil.strcmp(AV61MRNom, wcpOAV61MRNom) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV58EmprCod = AV58EmprCod ;
      wcpOAV59MRCod = AV59MRCod ;
      wcpOAV61MRNom = AV61MRNom ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV58EmprCod = httpContext.cgiGet( sPrefix+"AV58EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV58EmprCod) > 0 )
      {
         AV58EmprCod = httpContext.cgiGet( sCtrlAV58EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58EmprCod", AV58EmprCod);
      }
      else
      {
         AV58EmprCod = httpContext.cgiGet( sPrefix+"AV58EmprCod_PARM") ;
      }
      sCtrlAV59MRCod = httpContext.cgiGet( sPrefix+"AV59MRCod_CTRL") ;
      if ( GXutil.len( sCtrlAV59MRCod) > 0 )
      {
         AV59MRCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV59MRCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59MRCod), 8, 0));
      }
      else
      {
         AV59MRCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV59MRCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV61MRNom = httpContext.cgiGet( sPrefix+"AV61MRNom_CTRL") ;
      if ( GXutil.len( sCtrlAV61MRNom) > 0 )
      {
         AV61MRNom = httpContext.cgiGet( sCtrlAV61MRNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61MRNom", AV61MRNom);
      }
      else
      {
         AV61MRNom = httpContext.cgiGet( sPrefix+"AV61MRNom_PARM") ;
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
      paYK2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsYK2( ) ;
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
      wsYK2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58EmprCod_PARM", GXutil.rtrim( AV58EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV58EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58EmprCod_CTRL", GXutil.rtrim( sCtrlAV58EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59MRCod_PARM", GXutil.ltrim( localUtil.ntoc( AV59MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV59MRCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59MRCod_CTRL", GXutil.rtrim( sCtrlAV59MRCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61MRNom_PARM", GXutil.rtrim( AV61MRNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV61MRNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61MRNom_CTRL", GXutil.rtrim( sCtrlAV61MRNom));
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
      weYK2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115564418", true, true);
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
      httpContext.AddJavascriptSource("mantenimientomaquina/wcrepuestomovimientos.js", "?202682115564418", false, true);
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
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_43_idx ;
      edtMRCod_Internalname = sPrefix+"MRCOD_"+sGXsfl_43_idx ;
      edtMRMov_Internalname = sPrefix+"MRMOV_"+sGXsfl_43_idx ;
      edtMRMovOrd_Internalname = sPrefix+"MRMOVORD_"+sGXsfl_43_idx ;
      edtMRMovFch_Internalname = sPrefix+"MRMOVFCH_"+sGXsfl_43_idx ;
      edtMRMovTpo_Internalname = sPrefix+"MRMOVTPO_"+sGXsfl_43_idx ;
      edtMRMovTpoD_Internalname = sPrefix+"MRMOVTPOD_"+sGXsfl_43_idx ;
      edtMRMovDsc_Internalname = sPrefix+"MRMOVDSC_"+sGXsfl_43_idx ;
      edtMRMovCnt_Internalname = sPrefix+"MRMOVCNT_"+sGXsfl_43_idx ;
      edtMRMovPre_Internalname = sPrefix+"MRMOVPRE_"+sGXsfl_43_idx ;
   }

   public void subsflControlProps_fel_432( )
   {
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_43_fel_idx ;
      edtMRCod_Internalname = sPrefix+"MRCOD_"+sGXsfl_43_fel_idx ;
      edtMRMov_Internalname = sPrefix+"MRMOV_"+sGXsfl_43_fel_idx ;
      edtMRMovOrd_Internalname = sPrefix+"MRMOVORD_"+sGXsfl_43_fel_idx ;
      edtMRMovFch_Internalname = sPrefix+"MRMOVFCH_"+sGXsfl_43_fel_idx ;
      edtMRMovTpo_Internalname = sPrefix+"MRMOVTPO_"+sGXsfl_43_fel_idx ;
      edtMRMovTpoD_Internalname = sPrefix+"MRMOVTPOD_"+sGXsfl_43_fel_idx ;
      edtMRMovDsc_Internalname = sPrefix+"MRMOVDSC_"+sGXsfl_43_fel_idx ;
      edtMRMovCnt_Internalname = sPrefix+"MRMOVCNT_"+sGXsfl_43_fel_idx ;
      edtMRMovPre_Internalname = sPrefix+"MRMOVPRE_"+sGXsfl_43_fel_idx ;
   }

   public void sendrow_432( )
   {
      subsflControlProps_432( ) ;
      wbYK0( ) ;
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRCod_Internalname,GXutil.ltrim( localUtil.ntoc( A9492MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9492MRCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMRMov_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRMov_Internalname,GXutil.ltrim( localUtil.ntoc( A9502MRMov, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9502MRMov), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRMov_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMRMov_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMRMovOrd_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRMovOrd_Internalname,GXutil.ltrim( localUtil.ntoc( A9503MRMovOrd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9503MRMovOrd), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRMovOrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMRMovOrd_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMRMovFch_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRMovFch_Internalname,localUtil.ttoc( A9504MRMovFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A9504MRMovFch, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRMovFch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMRMovFch_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMRMovTpo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRMovTpo_Internalname,GXutil.ltrim( localUtil.ntoc( A9505MRMovTpo, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9505MRMovTpo), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRMovTpo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMRMovTpo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMRMovTpoD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRMovTpoD_Internalname,GXutil.rtrim( A9506MRMovTpoD),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtMRMovTpoD_Link,"","","",edtMRMovTpoD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMRMovTpoD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMRMovDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRMovDsc_Internalname,GXutil.rtrim( A9507MRMovDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRMovDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMRMovDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMRMovCnt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRMovCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A9508MRMovCnt, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A9508MRMovCnt, "ZZZ,ZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRMovCnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMRMovCnt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMRMovPre_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRMovPre_Internalname,GXutil.ltrim( localUtil.ntoc( A9509MRMovPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A9509MRMovPre, "ZZ,ZZZ,ZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRMovPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMRMovPre_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesYK2( ) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRMov_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Movimiento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRMovOrd_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRMovFch_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRMovTpo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRMovTpoD_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Desc Tipo Movimiento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRMovDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRMovCnt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRMovPre_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio del Mov.", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9492MRCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9502MRMov, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRMov_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9503MRMovOrd, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRMovOrd_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A9504MRMovFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRMovFch_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9505MRMovTpo, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRMovTpo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9506MRMovTpoD));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtMRMovTpoD_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRMovTpoD_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9507MRMovDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRMovDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9508MRMovCnt, (byte)(11), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRMovCnt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9509MRMovPre, (byte)(14), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRMovPre_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtMRCod_Internalname = sPrefix+"MRCOD" ;
      edtMRMov_Internalname = sPrefix+"MRMOV" ;
      edtMRMovOrd_Internalname = sPrefix+"MRMOVORD" ;
      edtMRMovFch_Internalname = sPrefix+"MRMOVFCH" ;
      edtMRMovTpo_Internalname = sPrefix+"MRMOVTPO" ;
      edtMRMovTpoD_Internalname = sPrefix+"MRMOVTPOD" ;
      edtMRMovDsc_Internalname = sPrefix+"MRMOVDSC" ;
      edtMRMovCnt_Internalname = sPrefix+"MRMOVCNT" ;
      edtMRMovPre_Internalname = sPrefix+"MRMOVPRE" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      edtMRNom_Internalname = sPrefix+"MRNOM" ;
      Innewwindow1_Internalname = sPrefix+"INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_mrmovfchauxdate_Internalname = sPrefix+"vDDO_MRMOVFCHAUXDATE" ;
      divDdo_mrmovfchauxdates_Internalname = sPrefix+"DDO_MRMOVFCHAUXDATES" ;
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
      edtMRMovPre_Jsonclick = "" ;
      edtMRMovCnt_Jsonclick = "" ;
      edtMRMovDsc_Jsonclick = "" ;
      edtMRMovTpoD_Jsonclick = "" ;
      edtMRMovTpoD_Link = "" ;
      edtMRMovTpo_Jsonclick = "" ;
      edtMRMovFch_Jsonclick = "" ;
      edtMRMovOrd_Jsonclick = "" ;
      edtMRMov_Jsonclick = "" ;
      edtMRCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtMRMovPre_Visible = -1 ;
      edtMRMovCnt_Visible = -1 ;
      edtMRMovDsc_Visible = -1 ;
      edtMRMovTpoD_Visible = -1 ;
      edtMRMovTpo_Visible = -1 ;
      edtMRMovFch_Visible = -1 ;
      edtMRMovOrd_Visible = -1 ;
      edtMRMov_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_mrmovfchauxdate_Jsonclick = "" ;
      edtMRNom_Jsonclick = "" ;
      edtMRNom_Visible = 1 ;
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
      Ddo_grid_Datalistproc = "MantenimientoMaquina.WCRepuestoMovimientosGetFilterData" ;
      Ddo_grid_Datalisttype = "||||Dynamic|Dynamic||" ;
      Ddo_grid_Includedatalist = "||||T|T||" ;
      Ddo_grid_Filterisrange = "T|T||T|||T|T" ;
      Ddo_grid_Filtertype = "Numeric|Numeric|Date|Numeric|Character|Character|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8" ;
      Ddo_grid_Columnids = "2:MRMov|3:MRMovOrd|4:MRMovFch|5:MRMovTpo|6:MRMovTpoD|7:MRMovDsc|8:MRMovCnt|9:MRMovPre" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A9410MTMovCod',fld:'MTMOVCOD',pic:'ZZZZZZZ9'},{av:'AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod',fld:'vMANTENIMIENTOMAQUINA_WCREPUESTOMOVIMIENTOSDS_1_EMPRCOD',pic:'@!'},{av:'AV85Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod',fld:'vMANTENIMIENTOMAQUINA_WCREPUESTOMOVIMIENTOSDS_2_MRCOD',pic:'ZZZZZZZ9'},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV58EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV59MRCod',fld:'vMRCOD',pic:'ZZZZZZZ9'},{av:'AV61MRNom',fld:'vMRNOM',pic:''},{av:'AV34TFMRMov',fld:'vTFMRMOV',pic:'ZZZZZZZZZ9'},{av:'AV35TFMRMov_To',fld:'vTFMRMOV_TO',pic:'ZZZZZZZZZ9'},{av:'AV36TFMRMovOrd',fld:'vTFMRMOVORD',pic:'ZZZZZZZ9'},{av:'AV37TFMRMovOrd_To',fld:'vTFMRMOVORD_TO',pic:'ZZZZZZZ9'},{av:'AV38TFMRMovFch',fld:'vTFMRMOVFCH',pic:'99/99/99 99:99'},{av:'AV42TFMRMovTpo',fld:'vTFMRMOVTPO',pic:'ZZZZZZZ9'},{av:'AV43TFMRMovTpo_To',fld:'vTFMRMOVTPO_TO',pic:'ZZZZZZZ9'},{av:'AV44TFMRMovTpoD',fld:'vTFMRMOVTPOD',pic:''},{av:'AV45TFMRMovTpoD_Sel',fld:'vTFMRMOVTPOD_SEL',pic:''},{av:'AV46TFMRMovDsc',fld:'vTFMRMOVDSC',pic:''},{av:'AV47TFMRMovDsc_Sel',fld:'vTFMRMOVDSC_SEL',pic:''},{av:'AV48TFMRMovCnt',fld:'vTFMRMOVCNT',pic:'ZZZ,ZZ9.999'},{av:'AV49TFMRMovCnt_To',fld:'vTFMRMOVCNT_TO',pic:'ZZZ,ZZ9.999'},{av:'AV50TFMRMovPre',fld:'vTFMRMOVPRE',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV51TFMRMovPre_To',fld:'vTFMRMOVPRE_TO',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV103Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMRMov_Visible',ctrl:'MRMOV',prop:'Visible'},{av:'edtMRMovOrd_Visible',ctrl:'MRMOVORD',prop:'Visible'},{av:'edtMRMovFch_Visible',ctrl:'MRMOVFCH',prop:'Visible'},{av:'edtMRMovTpo_Visible',ctrl:'MRMOVTPO',prop:'Visible'},{av:'edtMRMovTpoD_Visible',ctrl:'MRMOVTPOD',prop:'Visible'},{av:'edtMRMovDsc_Visible',ctrl:'MRMOVDSC',prop:'Visible'},{av:'edtMRMovCnt_Visible',ctrl:'MRMOVCNT',prop:'Visible'},{av:'edtMRMovPre_Visible',ctrl:'MRMOVPRE',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e13YK2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV58EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV59MRCod',fld:'vMRCOD',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV61MRNom',fld:'vMRNOM',pic:''},{av:'AV34TFMRMov',fld:'vTFMRMOV',pic:'ZZZZZZZZZ9'},{av:'AV35TFMRMov_To',fld:'vTFMRMOV_TO',pic:'ZZZZZZZZZ9'},{av:'AV36TFMRMovOrd',fld:'vTFMRMOVORD',pic:'ZZZZZZZ9'},{av:'AV37TFMRMovOrd_To',fld:'vTFMRMOVORD_TO',pic:'ZZZZZZZ9'},{av:'AV38TFMRMovFch',fld:'vTFMRMOVFCH',pic:'99/99/99 99:99'},{av:'AV42TFMRMovTpo',fld:'vTFMRMOVTPO',pic:'ZZZZZZZ9'},{av:'AV43TFMRMovTpo_To',fld:'vTFMRMOVTPO_TO',pic:'ZZZZZZZ9'},{av:'AV44TFMRMovTpoD',fld:'vTFMRMOVTPOD',pic:''},{av:'AV45TFMRMovTpoD_Sel',fld:'vTFMRMOVTPOD_SEL',pic:''},{av:'AV46TFMRMovDsc',fld:'vTFMRMOVDSC',pic:''},{av:'AV47TFMRMovDsc_Sel',fld:'vTFMRMOVDSC_SEL',pic:''},{av:'AV48TFMRMovCnt',fld:'vTFMRMOVCNT',pic:'ZZZ,ZZ9.999'},{av:'AV49TFMRMovCnt_To',fld:'vTFMRMOVCNT_TO',pic:'ZZZ,ZZ9.999'},{av:'AV50TFMRMovPre',fld:'vTFMRMOVPRE',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV51TFMRMovPre_To',fld:'vTFMRMOVPRE_TO',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV103Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A9410MTMovCod',fld:'MTMOVCOD',pic:'ZZZZZZZ9'},{av:'AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod',fld:'vMANTENIMIENTOMAQUINA_WCREPUESTOMOVIMIENTOSDS_1_EMPRCOD',pic:'@!'},{av:'AV85Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod',fld:'vMANTENIMIENTOMAQUINA_WCREPUESTOMOVIMIENTOSDS_2_MRCOD',pic:'ZZZZZZZ9'},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e14YK2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV58EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV59MRCod',fld:'vMRCOD',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV61MRNom',fld:'vMRNOM',pic:''},{av:'AV34TFMRMov',fld:'vTFMRMOV',pic:'ZZZZZZZZZ9'},{av:'AV35TFMRMov_To',fld:'vTFMRMOV_TO',pic:'ZZZZZZZZZ9'},{av:'AV36TFMRMovOrd',fld:'vTFMRMOVORD',pic:'ZZZZZZZ9'},{av:'AV37TFMRMovOrd_To',fld:'vTFMRMOVORD_TO',pic:'ZZZZZZZ9'},{av:'AV38TFMRMovFch',fld:'vTFMRMOVFCH',pic:'99/99/99 99:99'},{av:'AV42TFMRMovTpo',fld:'vTFMRMOVTPO',pic:'ZZZZZZZ9'},{av:'AV43TFMRMovTpo_To',fld:'vTFMRMOVTPO_TO',pic:'ZZZZZZZ9'},{av:'AV44TFMRMovTpoD',fld:'vTFMRMOVTPOD',pic:''},{av:'AV45TFMRMovTpoD_Sel',fld:'vTFMRMOVTPOD_SEL',pic:''},{av:'AV46TFMRMovDsc',fld:'vTFMRMOVDSC',pic:''},{av:'AV47TFMRMovDsc_Sel',fld:'vTFMRMOVDSC_SEL',pic:''},{av:'AV48TFMRMovCnt',fld:'vTFMRMOVCNT',pic:'ZZZ,ZZ9.999'},{av:'AV49TFMRMovCnt_To',fld:'vTFMRMOVCNT_TO',pic:'ZZZ,ZZ9.999'},{av:'AV50TFMRMovPre',fld:'vTFMRMOVPRE',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV51TFMRMovPre_To',fld:'vTFMRMOVPRE_TO',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV103Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A9410MTMovCod',fld:'MTMOVCOD',pic:'ZZZZZZZ9'},{av:'AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod',fld:'vMANTENIMIENTOMAQUINA_WCREPUESTOMOVIMIENTOSDS_1_EMPRCOD',pic:'@!'},{av:'AV85Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod',fld:'vMANTENIMIENTOMAQUINA_WCREPUESTOMOVIMIENTOSDS_2_MRCOD',pic:'ZZZZZZZ9'},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e15YK2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV58EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV59MRCod',fld:'vMRCOD',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV61MRNom',fld:'vMRNOM',pic:''},{av:'AV34TFMRMov',fld:'vTFMRMOV',pic:'ZZZZZZZZZ9'},{av:'AV35TFMRMov_To',fld:'vTFMRMOV_TO',pic:'ZZZZZZZZZ9'},{av:'AV36TFMRMovOrd',fld:'vTFMRMOVORD',pic:'ZZZZZZZ9'},{av:'AV37TFMRMovOrd_To',fld:'vTFMRMOVORD_TO',pic:'ZZZZZZZ9'},{av:'AV38TFMRMovFch',fld:'vTFMRMOVFCH',pic:'99/99/99 99:99'},{av:'AV42TFMRMovTpo',fld:'vTFMRMOVTPO',pic:'ZZZZZZZ9'},{av:'AV43TFMRMovTpo_To',fld:'vTFMRMOVTPO_TO',pic:'ZZZZZZZ9'},{av:'AV44TFMRMovTpoD',fld:'vTFMRMOVTPOD',pic:''},{av:'AV45TFMRMovTpoD_Sel',fld:'vTFMRMOVTPOD_SEL',pic:''},{av:'AV46TFMRMovDsc',fld:'vTFMRMOVDSC',pic:''},{av:'AV47TFMRMovDsc_Sel',fld:'vTFMRMOVDSC_SEL',pic:''},{av:'AV48TFMRMovCnt',fld:'vTFMRMOVCNT',pic:'ZZZ,ZZ9.999'},{av:'AV49TFMRMovCnt_To',fld:'vTFMRMOVCNT_TO',pic:'ZZZ,ZZ9.999'},{av:'AV50TFMRMovPre',fld:'vTFMRMOVPRE',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV51TFMRMovPre_To',fld:'vTFMRMOVPRE_TO',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV103Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A9410MTMovCod',fld:'MTMOVCOD',pic:'ZZZZZZZ9'},{av:'AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod',fld:'vMANTENIMIENTOMAQUINA_WCREPUESTOMOVIMIENTOSDS_1_EMPRCOD',pic:'@!'},{av:'AV85Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod',fld:'vMANTENIMIENTOMAQUINA_WCREPUESTOMOVIMIENTOSDS_2_MRCOD',pic:'ZZZZZZZ9'},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV50TFMRMovPre',fld:'vTFMRMOVPRE',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV51TFMRMovPre_To',fld:'vTFMRMOVPRE_TO',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV48TFMRMovCnt',fld:'vTFMRMOVCNT',pic:'ZZZ,ZZ9.999'},{av:'AV49TFMRMovCnt_To',fld:'vTFMRMOVCNT_TO',pic:'ZZZ,ZZ9.999'},{av:'AV46TFMRMovDsc',fld:'vTFMRMOVDSC',pic:''},{av:'AV47TFMRMovDsc_Sel',fld:'vTFMRMOVDSC_SEL',pic:''},{av:'AV44TFMRMovTpoD',fld:'vTFMRMOVTPOD',pic:''},{av:'AV45TFMRMovTpoD_Sel',fld:'vTFMRMOVTPOD_SEL',pic:''},{av:'AV42TFMRMovTpo',fld:'vTFMRMOVTPO',pic:'ZZZZZZZ9'},{av:'AV43TFMRMovTpo_To',fld:'vTFMRMOVTPO_TO',pic:'ZZZZZZZ9'},{av:'AV38TFMRMovFch',fld:'vTFMRMOVFCH',pic:'99/99/99 99:99'},{av:'AV36TFMRMovOrd',fld:'vTFMRMOVORD',pic:'ZZZZZZZ9'},{av:'AV37TFMRMovOrd_To',fld:'vTFMRMOVORD_TO',pic:'ZZZZZZZ9'},{av:'AV34TFMRMov',fld:'vTFMRMOV',pic:'ZZZZZZZZZ9'},{av:'AV35TFMRMov_To',fld:'vTFMRMOV_TO',pic:'ZZZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e21YK2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9410MTMovCod',fld:'MTMOVCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'edtMRMovTpoD_Link',ctrl:'MRMOVTPOD',prop:'Link'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e16YK2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV58EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV59MRCod',fld:'vMRCOD',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV61MRNom',fld:'vMRNOM',pic:''},{av:'AV34TFMRMov',fld:'vTFMRMOV',pic:'ZZZZZZZZZ9'},{av:'AV35TFMRMov_To',fld:'vTFMRMOV_TO',pic:'ZZZZZZZZZ9'},{av:'AV36TFMRMovOrd',fld:'vTFMRMOVORD',pic:'ZZZZZZZ9'},{av:'AV37TFMRMovOrd_To',fld:'vTFMRMOVORD_TO',pic:'ZZZZZZZ9'},{av:'AV38TFMRMovFch',fld:'vTFMRMOVFCH',pic:'99/99/99 99:99'},{av:'AV42TFMRMovTpo',fld:'vTFMRMOVTPO',pic:'ZZZZZZZ9'},{av:'AV43TFMRMovTpo_To',fld:'vTFMRMOVTPO_TO',pic:'ZZZZZZZ9'},{av:'AV44TFMRMovTpoD',fld:'vTFMRMOVTPOD',pic:''},{av:'AV45TFMRMovTpoD_Sel',fld:'vTFMRMOVTPOD_SEL',pic:''},{av:'AV46TFMRMovDsc',fld:'vTFMRMOVDSC',pic:''},{av:'AV47TFMRMovDsc_Sel',fld:'vTFMRMOVDSC_SEL',pic:''},{av:'AV48TFMRMovCnt',fld:'vTFMRMOVCNT',pic:'ZZZ,ZZ9.999'},{av:'AV49TFMRMovCnt_To',fld:'vTFMRMOVCNT_TO',pic:'ZZZ,ZZ9.999'},{av:'AV50TFMRMovPre',fld:'vTFMRMOVPRE',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV51TFMRMovPre_To',fld:'vTFMRMOVPRE_TO',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV103Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A9410MTMovCod',fld:'MTMOVCOD',pic:'ZZZZZZZ9'},{av:'AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod',fld:'vMANTENIMIENTOMAQUINA_WCREPUESTOMOVIMIENTOSDS_1_EMPRCOD',pic:'@!'},{av:'AV85Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod',fld:'vMANTENIMIENTOMAQUINA_WCREPUESTOMOVIMIENTOSDS_2_MRCOD',pic:'ZZZZZZZ9'},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtMRMov_Visible',ctrl:'MRMOV',prop:'Visible'},{av:'edtMRMovOrd_Visible',ctrl:'MRMOVORD',prop:'Visible'},{av:'edtMRMovFch_Visible',ctrl:'MRMOVFCH',prop:'Visible'},{av:'edtMRMovTpo_Visible',ctrl:'MRMOVTPO',prop:'Visible'},{av:'edtMRMovTpoD_Visible',ctrl:'MRMOVTPOD',prop:'Visible'},{av:'edtMRMovDsc_Visible',ctrl:'MRMOVDSC',prop:'Visible'},{av:'edtMRMovCnt_Visible',ctrl:'MRMOVCNT',prop:'Visible'},{av:'edtMRMovPre_Visible',ctrl:'MRMOVPRE',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e12YK2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV58EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV59MRCod',fld:'vMRCOD',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV61MRNom',fld:'vMRNOM',pic:''},{av:'AV34TFMRMov',fld:'vTFMRMOV',pic:'ZZZZZZZZZ9'},{av:'AV35TFMRMov_To',fld:'vTFMRMOV_TO',pic:'ZZZZZZZZZ9'},{av:'AV36TFMRMovOrd',fld:'vTFMRMOVORD',pic:'ZZZZZZZ9'},{av:'AV37TFMRMovOrd_To',fld:'vTFMRMOVORD_TO',pic:'ZZZZZZZ9'},{av:'AV38TFMRMovFch',fld:'vTFMRMOVFCH',pic:'99/99/99 99:99'},{av:'AV42TFMRMovTpo',fld:'vTFMRMOVTPO',pic:'ZZZZZZZ9'},{av:'AV43TFMRMovTpo_To',fld:'vTFMRMOVTPO_TO',pic:'ZZZZZZZ9'},{av:'AV44TFMRMovTpoD',fld:'vTFMRMOVTPOD',pic:''},{av:'AV45TFMRMovTpoD_Sel',fld:'vTFMRMOVTPOD_SEL',pic:''},{av:'AV46TFMRMovDsc',fld:'vTFMRMOVDSC',pic:''},{av:'AV47TFMRMovDsc_Sel',fld:'vTFMRMOVDSC_SEL',pic:''},{av:'AV48TFMRMovCnt',fld:'vTFMRMOVCNT',pic:'ZZZ,ZZ9.999'},{av:'AV49TFMRMovCnt_To',fld:'vTFMRMOVCNT_TO',pic:'ZZZ,ZZ9.999'},{av:'AV50TFMRMovPre',fld:'vTFMRMOVPRE',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV51TFMRMovPre_To',fld:'vTFMRMOVPRE_TO',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV103Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A9410MTMovCod',fld:'MTMOVCOD',pic:'ZZZZZZZ9'},{av:'AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod',fld:'vMANTENIMIENTOMAQUINA_WCREPUESTOMOVIMIENTOSDS_1_EMPRCOD',pic:'@!'},{av:'AV85Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod',fld:'vMANTENIMIENTOMAQUINA_WCREPUESTOMOVIMIENTOSDS_2_MRCOD',pic:'ZZZZZZZ9'},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV40DDO_MRMovFchAuxDate',fld:'vDDO_MRMOVFCHAUXDATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV34TFMRMov',fld:'vTFMRMOV',pic:'ZZZZZZZZZ9'},{av:'AV35TFMRMov_To',fld:'vTFMRMOV_TO',pic:'ZZZZZZZZZ9'},{av:'AV36TFMRMovOrd',fld:'vTFMRMOVORD',pic:'ZZZZZZZ9'},{av:'AV37TFMRMovOrd_To',fld:'vTFMRMOVORD_TO',pic:'ZZZZZZZ9'},{av:'AV38TFMRMovFch',fld:'vTFMRMOVFCH',pic:'99/99/99 99:99'},{av:'AV42TFMRMovTpo',fld:'vTFMRMOVTPO',pic:'ZZZZZZZ9'},{av:'AV43TFMRMovTpo_To',fld:'vTFMRMOVTPO_TO',pic:'ZZZZZZZ9'},{av:'AV44TFMRMovTpoD',fld:'vTFMRMOVTPOD',pic:''},{av:'AV45TFMRMovTpoD_Sel',fld:'vTFMRMOVTPOD_SEL',pic:''},{av:'AV46TFMRMovDsc',fld:'vTFMRMOVDSC',pic:''},{av:'AV47TFMRMovDsc_Sel',fld:'vTFMRMOVDSC_SEL',pic:''},{av:'AV48TFMRMovCnt',fld:'vTFMRMOVCNT',pic:'ZZZ,ZZ9.999'},{av:'AV49TFMRMovCnt_To',fld:'vTFMRMOVCNT_TO',pic:'ZZZ,ZZ9.999'},{av:'AV50TFMRMovPre',fld:'vTFMRMOVPRE',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV51TFMRMovPre_To',fld:'vTFMRMOVPRE_TO',pic:'ZZ,ZZZ,ZZ9.999'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV40DDO_MRMovFchAuxDate',fld:'vDDO_MRMOVFCHAUXDATE',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMRMov_Visible',ctrl:'MRMOV',prop:'Visible'},{av:'edtMRMovOrd_Visible',ctrl:'MRMOVORD',prop:'Visible'},{av:'edtMRMovFch_Visible',ctrl:'MRMOVFCH',prop:'Visible'},{av:'edtMRMovTpo_Visible',ctrl:'MRMOVTPO',prop:'Visible'},{av:'edtMRMovTpoD_Visible',ctrl:'MRMOVTPOD',prop:'Visible'},{av:'edtMRMovDsc_Visible',ctrl:'MRMOVDSC',prop:'Visible'},{av:'edtMRMovCnt_Visible',ctrl:'MRMOVCNT',prop:'Visible'},{av:'edtMRMovPre_Visible',ctrl:'MRMOVPRE',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e17YK2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e11YK1',iparms:[]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e18YK2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("'DOKARDEXEXPORT'","{handler:'e22YK2',iparms:[{av:'AV58EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV59MRCod',fld:'vMRCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOKARDEXEXPORT'",",oparms:[{av:'AV59MRCod',fld:'vMRCOD',pic:'ZZZZZZZ9'},{av:'AV58EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_MRCOD","{handler:'valid_Mrcod',iparms:[]");
      setEventMetadata("VALID_MRCOD",",oparms:[]}");
      setEventMetadata("VALID_MRMOVTPO","{handler:'valid_Mrmovtpo',iparms:[]");
      setEventMetadata("VALID_MRMOVTPO",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Mrmovpre',iparms:[]");
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
      wcpOAV58EmprCod = "" ;
      wcpOAV61MRNom = "" ;
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
      AV58EmprCod = "" ;
      AV61MRNom = "" ;
      AV15FilterFullText = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV38TFMRMovFch = GXutil.resetTime( GXutil.nullDate() );
      AV44TFMRMovTpoD = "" ;
      AV45TFMRMovTpoD_Sel = "" ;
      AV46TFMRMovDsc = "" ;
      AV47TFMRMovDsc_Sel = "" ;
      AV48TFMRMovCnt = DecimalUtil.ZERO ;
      AV49TFMRMovCnt_To = DecimalUtil.ZERO ;
      AV50TFMRMovPre = DecimalUtil.ZERO ;
      AV51TFMRMovPre_To = DecimalUtil.ZERO ;
      AV103Pgmname = "" ;
      AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV52DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
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
      A9493MRNom = "" ;
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV40DDO_MRMovFchAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A9504MRMovFch = GXutil.resetTime( GXutil.nullDate() );
      A9506MRMovTpoD = "" ;
      A9507MRMovDsc = "" ;
      A9508MRMovCnt = DecimalUtil.ZERO ;
      A9509MRMovPre = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = "" ;
      lV95Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod = "" ;
      lV97Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc = "" ;
      AV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = "" ;
      AV92Mantenimientomaquina_wcrepuestomovimientosds_9_tfmrmovfch = GXutil.resetTime( GXutil.nullDate() );
      AV96Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel = "" ;
      AV95Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod = "" ;
      AV98Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel = "" ;
      AV97Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc = "" ;
      AV99Mantenimientomaquina_wcrepuestomovimientosds_16_tfmrmovcnt = DecimalUtil.ZERO ;
      AV100Mantenimientomaquina_wcrepuestomovimientosds_17_tfmrmovcnt_to = DecimalUtil.ZERO ;
      AV101Mantenimientomaquina_wcrepuestomovimientosds_18_tfmrmovpre = DecimalUtil.ZERO ;
      AV102Mantenimientomaquina_wcrepuestomovimientosds_19_tfmrmovpre_to = DecimalUtil.ZERO ;
      AV86Mantenimientomaquina_wcrepuestomovimientosds_3_mrnom = "" ;
      H00YK2_A9493MRNom = new String[] {""} ;
      H00YK2_n9493MRNom = new boolean[] {false} ;
      H00YK2_A9509MRMovPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00YK2_A9508MRMovCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00YK2_A9507MRMovDsc = new String[] {""} ;
      H00YK2_A9506MRMovTpoD = new String[] {""} ;
      H00YK2_n9506MRMovTpoD = new boolean[] {false} ;
      H00YK2_A9505MRMovTpo = new int[1] ;
      H00YK2_A9504MRMovFch = new java.util.Date[] {GXutil.nullDate()} ;
      H00YK2_A9503MRMovOrd = new int[1] ;
      H00YK2_A9502MRMov = new long[1] ;
      H00YK2_A9492MRCod = new int[1] ;
      H00YK2_A396EmprCod = new String[] {""} ;
      H00YK3_AGRID_nRecordCount = new long[1] ;
      AV82Station = "" ;
      GXv_char2 = new String[1] ;
      AV83Emprnom = "" ;
      AV72UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV24ManageFiltersXml = "" ;
      AV16ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      AV19UserCustomValue = "" ;
      AV21ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char12 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState13 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      AV9TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV58EmprCod = "" ;
      sCtrlAV59MRCod = "" ;
      sCtrlAV61MRNom = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.wcrepuestomovimientos__default(),
         new Object[] {
             new Object[] {
            H00YK2_A9493MRNom, H00YK2_n9493MRNom, H00YK2_A9509MRMovPre, H00YK2_A9508MRMovCnt, H00YK2_A9507MRMovDsc, H00YK2_A9506MRMovTpoD, H00YK2_n9506MRMovTpoD, H00YK2_A9505MRMovTpo, H00YK2_A9504MRMovFch, H00YK2_A9503MRMovOrd,
            H00YK2_A9502MRMov, H00YK2_A9492MRCod, H00YK2_A396EmprCod
            }
            , new Object[] {
            H00YK3_AGRID_nRecordCount
            }
         }
      );
      AV103Pgmname = "MantenimientoMaquina.WCRepuestoMovimientos" ;
      /* GeneXus formulas. */
      AV103Pgmname = "MantenimientoMaquina.WCRepuestoMovimientos" ;
      Gx_err = (short)(0) ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV25ManageFiltersExecutionStep ;
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
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV59MRCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_43 ;
   private int AV59MRCod ;
   private int nGXsfl_43_idx=1 ;
   private int AV36TFMRMovOrd ;
   private int AV37TFMRMovOrd_To ;
   private int AV42TFMRMovTpo ;
   private int AV43TFMRMovTpo_To ;
   private int A9410MTMovCod ;
   private int AV85Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtMRNom_Visible ;
   private int A9492MRCod ;
   private int A9503MRMovOrd ;
   private int A9505MRMovTpo ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV90Mantenimientomaquina_wcrepuestomovimientosds_7_tfmrmovord ;
   private int AV91Mantenimientomaquina_wcrepuestomovimientosds_8_tfmrmovord_to ;
   private int AV93Mantenimientomaquina_wcrepuestomovimientosds_10_tfmrmovtpo ;
   private int AV94Mantenimientomaquina_wcrepuestomovimientosds_11_tfmrmovtpo_to ;
   private int edtMRMov_Visible ;
   private int edtMRMovOrd_Visible ;
   private int edtMRMovFch_Visible ;
   private int edtMRMovTpo_Visible ;
   private int edtMRMovTpoD_Visible ;
   private int edtMRMovDsc_Visible ;
   private int edtMRMovCnt_Visible ;
   private int edtMRMovPre_Visible ;
   private int AV53PageToGo ;
   private int AV104GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV34TFMRMov ;
   private long AV35TFMRMov_To ;
   private long AV54GridCurrentPage ;
   private long AV55GridPageCount ;
   private long A9502MRMov ;
   private long GRID_nCurrentRecord ;
   private long AV88Mantenimientomaquina_wcrepuestomovimientosds_5_tfmrmov ;
   private long AV89Mantenimientomaquina_wcrepuestomovimientosds_6_tfmrmov_to ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV48TFMRMovCnt ;
   private java.math.BigDecimal AV49TFMRMovCnt_To ;
   private java.math.BigDecimal AV50TFMRMovPre ;
   private java.math.BigDecimal AV51TFMRMovPre_To ;
   private java.math.BigDecimal A9508MRMovCnt ;
   private java.math.BigDecimal A9509MRMovPre ;
   private java.math.BigDecimal AV99Mantenimientomaquina_wcrepuestomovimientosds_16_tfmrmovcnt ;
   private java.math.BigDecimal AV100Mantenimientomaquina_wcrepuestomovimientosds_17_tfmrmovcnt_to ;
   private java.math.BigDecimal AV101Mantenimientomaquina_wcrepuestomovimientosds_18_tfmrmovpre ;
   private java.math.BigDecimal AV102Mantenimientomaquina_wcrepuestomovimientosds_19_tfmrmovpre_to ;
   private String wcpOAV58EmprCod ;
   private String wcpOAV61MRNom ;
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
   private String AV58EmprCod ;
   private String AV61MRNom ;
   private String sGXsfl_43_idx="0001" ;
   private String AV44TFMRMovTpoD ;
   private String AV45TFMRMovTpoD_Sel ;
   private String AV46TFMRMovDsc ;
   private String AV47TFMRMovDsc_Sel ;
   private String AV103Pgmname ;
   private String AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod ;
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
   private String edtMRNom_Internalname ;
   private String A9493MRNom ;
   private String edtMRNom_Jsonclick ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_mrmovfchauxdates_Internalname ;
   private String edtavDdo_mrmovfchauxdate_Internalname ;
   private String edtavDdo_mrmovfchauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtMRCod_Internalname ;
   private String edtMRMov_Internalname ;
   private String edtMRMovOrd_Internalname ;
   private String edtMRMovFch_Internalname ;
   private String edtMRMovTpo_Internalname ;
   private String A9506MRMovTpoD ;
   private String edtMRMovTpoD_Internalname ;
   private String A9507MRMovDsc ;
   private String edtMRMovDsc_Internalname ;
   private String edtMRMovCnt_Internalname ;
   private String edtMRMovPre_Internalname ;
   private String scmdbuf ;
   private String lV95Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod ;
   private String lV97Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc ;
   private String AV96Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel ;
   private String AV95Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod ;
   private String AV98Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel ;
   private String AV97Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc ;
   private String AV86Mantenimientomaquina_wcrepuestomovimientosds_3_mrnom ;
   private String AV82Station ;
   private String GXv_char2[] ;
   private String AV83Emprnom ;
   private String AV72UsurCod ;
   private String edtMRMovTpoD_Link ;
   private String GXt_char12 ;
   private String GXv_char4[] ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV58EmprCod ;
   private String sCtrlAV59MRCod ;
   private String sCtrlAV61MRNom ;
   private String sGXsfl_43_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtMRCod_Jsonclick ;
   private String edtMRMov_Jsonclick ;
   private String edtMRMovOrd_Jsonclick ;
   private String edtMRMovFch_Jsonclick ;
   private String edtMRMovTpo_Jsonclick ;
   private String edtMRMovTpoD_Jsonclick ;
   private String edtMRMovDsc_Jsonclick ;
   private String edtMRMovCnt_Jsonclick ;
   private String edtMRMovPre_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV38TFMRMovFch ;
   private java.util.Date A9504MRMovFch ;
   private java.util.Date AV92Mantenimientomaquina_wcrepuestomovimientosds_9_tfmrmovfch ;
   private java.util.Date AV40DDO_MRMovFchAuxDate ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
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
   private boolean n9506MRMovTpoD ;
   private boolean bGXsfl_43_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n9493MRNom ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String lV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext ;
   private String AV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private IDataStoreProvider pr_default ;
   private String[] H00YK2_A9493MRNom ;
   private boolean[] H00YK2_n9493MRNom ;
   private java.math.BigDecimal[] H00YK2_A9509MRMovPre ;
   private java.math.BigDecimal[] H00YK2_A9508MRMovCnt ;
   private String[] H00YK2_A9507MRMovDsc ;
   private String[] H00YK2_A9506MRMovTpoD ;
   private boolean[] H00YK2_n9506MRMovTpoD ;
   private int[] H00YK2_A9505MRMovTpo ;
   private java.util.Date[] H00YK2_A9504MRMovFch ;
   private int[] H00YK2_A9503MRMovOrd ;
   private long[] H00YK2_A9502MRMov ;
   private int[] H00YK2_A9492MRCod ;
   private String[] H00YK2_A396EmprCod ;
   private long[] H00YK3_AGRID_nRecordCount ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV9TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState13[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV52DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class wcrepuestomovimientos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00YK2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext ,
                                          long AV88Mantenimientomaquina_wcrepuestomovimientosds_5_tfmrmov ,
                                          long AV89Mantenimientomaquina_wcrepuestomovimientosds_6_tfmrmov_to ,
                                          int AV90Mantenimientomaquina_wcrepuestomovimientosds_7_tfmrmovord ,
                                          int AV91Mantenimientomaquina_wcrepuestomovimientosds_8_tfmrmovord_to ,
                                          java.util.Date AV92Mantenimientomaquina_wcrepuestomovimientosds_9_tfmrmovfch ,
                                          int AV93Mantenimientomaquina_wcrepuestomovimientosds_10_tfmrmovtpo ,
                                          int AV94Mantenimientomaquina_wcrepuestomovimientosds_11_tfmrmovtpo_to ,
                                          String AV96Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel ,
                                          String AV95Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod ,
                                          String AV98Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel ,
                                          String AV97Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc ,
                                          java.math.BigDecimal AV99Mantenimientomaquina_wcrepuestomovimientosds_16_tfmrmovcnt ,
                                          java.math.BigDecimal AV100Mantenimientomaquina_wcrepuestomovimientosds_17_tfmrmovcnt_to ,
                                          java.math.BigDecimal AV101Mantenimientomaquina_wcrepuestomovimientosds_18_tfmrmovpre ,
                                          java.math.BigDecimal AV102Mantenimientomaquina_wcrepuestomovimientosds_19_tfmrmovpre_to ,
                                          long A9502MRMov ,
                                          int A9503MRMovOrd ,
                                          int A9505MRMovTpo ,
                                          String A9506MRMovTpoD ,
                                          String A9507MRMovDsc ,
                                          java.math.BigDecimal A9508MRMovCnt ,
                                          java.math.BigDecimal A9509MRMovPre ,
                                          java.util.Date A9504MRMovFch ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A9493MRNom ,
                                          String AV86Mantenimientomaquina_wcrepuestomovimientosds_3_mrnom ,
                                          String A396EmprCod ,
                                          String AV58EmprCod ,
                                          int A9492MRCod ,
                                          int AV59MRCod ,
                                          String AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod ,
                                          int AV85Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[32];
      Object[] GXv_Object15 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T2.MRNom, T1.MRMovPre, T1.MRMovCnt, T1.MRMovDsc, T3.MTMovNom AS MRMovTpoD, T1.MRMovTpo AS MRMovTpo, T1.MRMovFch, T1.MRMovOrd, T1.MRMov, T1.MRCod, T1.EmprCod" ;
      sFromString = " FROM ((TXPMReMov T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MRCod) INNER JOIN TXPMTPOMO T3 ON T3.EmprCod = T1.EmprCod AND T3.MTMovCod" ;
      sFromString += " = T1.MRMovTpo)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MRCod = ?)");
      addWhere(sWhereString, "(T2.MRNom = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MRCod = ?)");
      if ( ! (GXutil.strcmp("", AV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.MRMov,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRMovOrd,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRMovTpo,'99999990'), 2) like '%' || ?) or ( UPPER(T3.MTMovNom) like '%' || UPPER(?)) or ( UPPER(T1.MRMovDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MRMovCnt,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRMovPre,'99999990.999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
         GXv_int14[6] = (byte)(1) ;
         GXv_int14[7] = (byte)(1) ;
         GXv_int14[8] = (byte)(1) ;
         GXv_int14[9] = (byte)(1) ;
         GXv_int14[10] = (byte)(1) ;
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (0==AV88Mantenimientomaquina_wcrepuestomovimientosds_5_tfmrmov) )
      {
         addWhere(sWhereString, "(T1.MRMov >= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (0==AV89Mantenimientomaquina_wcrepuestomovimientosds_6_tfmrmov_to) )
      {
         addWhere(sWhereString, "(T1.MRMov <= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (0==AV90Mantenimientomaquina_wcrepuestomovimientosds_7_tfmrmovord) )
      {
         addWhere(sWhereString, "(T1.MRMovOrd >= ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (0==AV91Mantenimientomaquina_wcrepuestomovimientosds_8_tfmrmovord_to) )
      {
         addWhere(sWhereString, "(T1.MRMovOrd <= ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV92Mantenimientomaquina_wcrepuestomovimientosds_9_tfmrmovfch) )
      {
         addWhere(sWhereString, "(T1.MRMovFch >= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (0==AV93Mantenimientomaquina_wcrepuestomovimientosds_10_tfmrmovtpo) )
      {
         addWhere(sWhereString, "(T1.MRMovTpo >= ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (0==AV94Mantenimientomaquina_wcrepuestomovimientosds_11_tfmrmovtpo_to) )
      {
         addWhere(sWhereString, "(T1.MRMovTpo <= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel)==0) && ( ! (GXutil.strcmp("", AV95Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MTMovNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MTMovNom = ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel)==0) && ( ! (GXutil.strcmp("", AV97Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MRMovDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovDsc = ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Mantenimientomaquina_wcrepuestomovimientosds_16_tfmrmovcnt)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovCnt >= ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Mantenimientomaquina_wcrepuestomovimientosds_17_tfmrmovcnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovCnt <= ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Mantenimientomaquina_wcrepuestomovimientosds_18_tfmrmovpre)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovPre >= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Mantenimientomaquina_wcrepuestomovimientosds_19_tfmrmovpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovPre <= ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMov" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRMov DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMovOrd" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRMovOrd DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMovFch" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRMovFch DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMovTpo" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRMovTpo DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T3.MTMovNom" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T3.MTMovNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMovDsc" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRMovDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMovCnt" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRMovCnt DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMovPre" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRMovPre DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MRCod, T1.MRMov" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_H00YK3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext ,
                                          long AV88Mantenimientomaquina_wcrepuestomovimientosds_5_tfmrmov ,
                                          long AV89Mantenimientomaquina_wcrepuestomovimientosds_6_tfmrmov_to ,
                                          int AV90Mantenimientomaquina_wcrepuestomovimientosds_7_tfmrmovord ,
                                          int AV91Mantenimientomaquina_wcrepuestomovimientosds_8_tfmrmovord_to ,
                                          java.util.Date AV92Mantenimientomaquina_wcrepuestomovimientosds_9_tfmrmovfch ,
                                          int AV93Mantenimientomaquina_wcrepuestomovimientosds_10_tfmrmovtpo ,
                                          int AV94Mantenimientomaquina_wcrepuestomovimientosds_11_tfmrmovtpo_to ,
                                          String AV96Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel ,
                                          String AV95Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod ,
                                          String AV98Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel ,
                                          String AV97Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc ,
                                          java.math.BigDecimal AV99Mantenimientomaquina_wcrepuestomovimientosds_16_tfmrmovcnt ,
                                          java.math.BigDecimal AV100Mantenimientomaquina_wcrepuestomovimientosds_17_tfmrmovcnt_to ,
                                          java.math.BigDecimal AV101Mantenimientomaquina_wcrepuestomovimientosds_18_tfmrmovpre ,
                                          java.math.BigDecimal AV102Mantenimientomaquina_wcrepuestomovimientosds_19_tfmrmovpre_to ,
                                          long A9502MRMov ,
                                          int A9503MRMovOrd ,
                                          int A9505MRMovTpo ,
                                          String A9506MRMovTpoD ,
                                          String A9507MRMovDsc ,
                                          java.math.BigDecimal A9508MRMovCnt ,
                                          java.math.BigDecimal A9509MRMovPre ,
                                          java.util.Date A9504MRMovFch ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A9493MRNom ,
                                          String AV86Mantenimientomaquina_wcrepuestomovimientosds_3_mrnom ,
                                          String A396EmprCod ,
                                          String AV58EmprCod ,
                                          int A9492MRCod ,
                                          int AV59MRCod ,
                                          String AV84Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod ,
                                          int AV85Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[27];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPMReMov T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MRCod) INNER JOIN TXPMTPOMO T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.MTMovCod = T1.MRMovTpo)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MRCod = ?)");
      addWhere(sWhereString, "(T2.MRNom = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MRCod = ?)");
      if ( ! (GXutil.strcmp("", AV87Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.MRMov,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRMovOrd,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRMovTpo,'99999990'), 2) like '%' || ?) or ( UPPER(T3.MTMovNom) like '%' || UPPER(?)) or ( UPPER(T1.MRMovDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MRMovCnt,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRMovPre,'99999990.999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
         GXv_int16[6] = (byte)(1) ;
         GXv_int16[7] = (byte)(1) ;
         GXv_int16[8] = (byte)(1) ;
         GXv_int16[9] = (byte)(1) ;
         GXv_int16[10] = (byte)(1) ;
         GXv_int16[11] = (byte)(1) ;
      }
      if ( ! (0==AV88Mantenimientomaquina_wcrepuestomovimientosds_5_tfmrmov) )
      {
         addWhere(sWhereString, "(T1.MRMov >= ?)");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
      }
      if ( ! (0==AV89Mantenimientomaquina_wcrepuestomovimientosds_6_tfmrmov_to) )
      {
         addWhere(sWhereString, "(T1.MRMov <= ?)");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      if ( ! (0==AV90Mantenimientomaquina_wcrepuestomovimientosds_7_tfmrmovord) )
      {
         addWhere(sWhereString, "(T1.MRMovOrd >= ?)");
      }
      else
      {
         GXv_int16[14] = (byte)(1) ;
      }
      if ( ! (0==AV91Mantenimientomaquina_wcrepuestomovimientosds_8_tfmrmovord_to) )
      {
         addWhere(sWhereString, "(T1.MRMovOrd <= ?)");
      }
      else
      {
         GXv_int16[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV92Mantenimientomaquina_wcrepuestomovimientosds_9_tfmrmovfch) )
      {
         addWhere(sWhereString, "(T1.MRMovFch >= ?)");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( ! (0==AV93Mantenimientomaquina_wcrepuestomovimientosds_10_tfmrmovtpo) )
      {
         addWhere(sWhereString, "(T1.MRMovTpo >= ?)");
      }
      else
      {
         GXv_int16[17] = (byte)(1) ;
      }
      if ( ! (0==AV94Mantenimientomaquina_wcrepuestomovimientosds_11_tfmrmovtpo_to) )
      {
         addWhere(sWhereString, "(T1.MRMovTpo <= ?)");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel)==0) && ( ! (GXutil.strcmp("", AV95Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MTMovNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MTMovNom = ?)");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel)==0) && ( ! (GXutil.strcmp("", AV97Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MRMovDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovDsc = ?)");
      }
      else
      {
         GXv_int16[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Mantenimientomaquina_wcrepuestomovimientosds_16_tfmrmovcnt)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovCnt >= ?)");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Mantenimientomaquina_wcrepuestomovimientosds_17_tfmrmovcnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovCnt <= ?)");
      }
      else
      {
         GXv_int16[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Mantenimientomaquina_wcrepuestomovimientosds_18_tfmrmovpre)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovPre >= ?)");
      }
      else
      {
         GXv_int16[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Mantenimientomaquina_wcrepuestomovimientosds_19_tfmrmovpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovPre <= ?)");
      }
      else
      {
         GXv_int16[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
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
                  return conditional_H00YK2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).longValue() , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() );
            case 1 :
                  return conditional_H00YK3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).longValue() , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00YK2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00YK3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((long[]) buf[10])[0] = rslt.getLong(9);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 3);
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
                  stmt.setString(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[44]).longValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[45]).longValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[48], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 3);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 3);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 3);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 3);
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
                  stmt.setString(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[39]).longValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[40]).longValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[43], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 3);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 3);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 3);
               }
               return;
      }
   }

}

