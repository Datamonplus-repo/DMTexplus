package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wctrabajosexternosrecepcionmantenimiento_impl extends GXWebComponent
{
   public wctrabajosexternosrecepcionmantenimiento_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wctrabajosexternosrecepcionmantenimiento_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wctrabajosexternosrecepcionmantenimiento_impl.class ));
   }

   public wctrabajosexternosrecepcionmantenimiento_impl( int remoteHandle ,
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
      cmbavRpexhdtip = new HTMLChoice();
      cmbavFlag = new HTMLChoice();
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
               AV54EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54EmprCod", AV54EmprCod);
               AV53Mancod = (short)(GXutil.lval( httpContext.GetPar( "Mancod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Mancod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Mancod), 4, 0));
               AV52RpExHdFe = localUtil.parseDateParm( httpContext.GetPar( "RpExHdFe")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52RpExHdFe", localUtil.format(AV52RpExHdFe, "99/99/99"));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV54EmprCod,Short.valueOf(AV53Mancod),AV52RpExHdFe});
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
      nRC_GXsfl_51 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_51"))) ;
      nGXsfl_51_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_51_idx"))) ;
      sGXsfl_51_idx = httpContext.GetPar( "sGXsfl_51_idx") ;
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
      AV54EmprCod = httpContext.GetPar( "EmprCod") ;
      AV53Mancod = (short)(GXutil.lval( httpContext.GetPar( "Mancod"))) ;
      AV52RpExHdFe = localUtil.parseDateParm( httpContext.GetPar( "RpExHdFe")) ;
      AV29ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV24ColumnsSelector);
      AV36TFRpExHdLi = (short)(GXutil.lval( httpContext.GetPar( "TFRpExHdLi"))) ;
      AV37TFRpExHdLi_To = (short)(GXutil.lval( httpContext.GetPar( "TFRpExHdLi_To"))) ;
      AV32TFRpExHdFe = localUtil.parseDateParm( httpContext.GetPar( "TFRpExHdFe")) ;
      AV30TFRpExHdAlb = (int)(GXutil.lval( httpContext.GetPar( "TFRpExHdAlb"))) ;
      AV31TFRpExHdAlb_To = (int)(GXutil.lval( httpContext.GetPar( "TFRpExHdAlb_To"))) ;
      AV38TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV39TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV40TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV41TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV42TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV43TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV44TFBarSerDsc = httpContext.GetPar( "TFBarSerDsc") ;
      AV45TFBarSerDsc_Sel = httpContext.GetPar( "TFBarSerDsc_Sel") ;
      AV115Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV93FlagLin = (byte)(GXutil.lval( httpContext.GetPar( "FlagLin"))) ;
      AV94Informacion = (byte)(GXutil.lval( httpContext.GetPar( "Informacion"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A2248ManCod = (short)(GXutil.lval( httpContext.GetPar( "ManCod"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV54EmprCod, AV53Mancod, AV52RpExHdFe, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV36TFRpExHdLi, AV37TFRpExHdLi_To, AV32TFRpExHdFe, AV30TFRpExHdAlb, AV31TFRpExHdAlb_To, AV38TFCliCod, AV39TFCliCod_To, AV40TFCliNom, AV41TFCliNom_Sel, AV42TFBarSer, AV43TFBarSer_Sel, AV44TFBarSerDsc, AV45TFBarSerDsc_Sel, AV115Pgmname, AV12OrderedBy, AV13OrderedDsc, AV93FlagLin, AV94Informacion, A396EmprCod, A2248ManCod, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa18A2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Tabla LREXHD", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wctrabajosexternosrecepcionmantenimiento", new String[] {GXutil.URLEncode(GXutil.rtrim(AV54EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV53Mancod,4,0)),GXutil.URLEncode(GXutil.formatDateParm(AV52RpExHdFe))}, new String[] {"EmprCod","Mancod","RpExHdFe"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV115Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGLIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV93FlagLin), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MANCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV15FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_51", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_51, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV27ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV27ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV50GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV51GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV48DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV48DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV24ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV24ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV54EmprCod", GXutil.rtrim( wcpOAV54EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV53Mancod", GXutil.ltrim( localUtil.ntoc( wcpOAV53Mancod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV52RpExHdFe", localUtil.dtoc( wcpOAV52RpExHdFe, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV29ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRPEXHDLI", GXutil.ltrim( localUtil.ntoc( AV36TFRpExHdLi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRPEXHDLI_TO", GXutil.ltrim( localUtil.ntoc( AV37TFRpExHdLi_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRPEXHDFE", localUtil.dtoc( AV32TFRpExHdFe, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRPEXHDALB", GXutil.ltrim( localUtil.ntoc( AV30TFRpExHdAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRPEXHDALB_TO", GXutil.ltrim( localUtil.ntoc( AV31TFRpExHdAlb_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV38TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV39TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV40TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV41TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER", GXutil.rtrim( AV42TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER_SEL", GXutil.rtrim( AV43TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC", GXutil.rtrim( AV44TFBarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC_SEL", GXutil.rtrim( AV45TFBarSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV115Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV115Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RPEXHDCNS", GXutil.ltrim( localUtil.ntoc( A2716RpExHdCns, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MANCOD", GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MANCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGLIN", GXutil.ltrim( localUtil.ntoc( AV93FlagLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGLIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV93FlagLin), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RPEXHDKGS", GXutil.ltrim( localUtil.ntoc( A2715RpExHdKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RPEXHDMTS", GXutil.ltrim( localUtil.ntoc( A2847RpExHdMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RPEXHDTIP", GXutil.rtrim( A2717RpExHdTip));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV54EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANCOD", GXutil.ltrim( localUtil.ntoc( AV53Mancod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRPEXHDFE", localUtil.dtoc( AV52RpExHdFe, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMSG", GXutil.rtrim( Gx_msg));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMTSD", GXutil.ltrim( localUtil.ntoc( AV89mtsd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vKGSD", GXutil.ltrim( localUtil.ntoc( AV88kgsd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD_SELECTED", GXutil.rtrim( AV116Emprcod_selected));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANCOD_SELECTED", GXutil.ltrim( localUtil.ntoc( AV117Mancod_selected, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRPEXHDFE_SELECTED", localUtil.dtoc( AV118Rpexhdfe_selected, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRPEXHDLI_SELECTED", GXutil.ltrim( localUtil.ntoc( AV119Rpexhdli_selected, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_INFORMACION_Gridinternalname", GXutil.rtrim( Popover_informacion_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_INFORMACION_Iteminternalname", GXutil.rtrim( Popover_informacion_Iteminternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_INFORMACION_Isgriditem", GXutil.booltostr( Popover_informacion_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_INFORMACION_Trigger", GXutil.rtrim( Popover_informacion_Trigger));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_INFORMACION_Popoverwidth", GXutil.ltrim( localUtil.ntoc( Popover_informacion_Popoverwidth, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_INFORMACION_Position", GXutil.rtrim( Popover_informacion_Position));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_MODIFICARLINEA_Title", GXutil.rtrim( Dvelop_confirmpanel_modificarlinea_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_MODIFICARLINEA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_modificarlinea_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_MODIFICARLINEA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_modificarlinea_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_MODIFICARLINEA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_modificarlinea_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_MODIFICARLINEA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_modificarlinea_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_MODIFICARLINEA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_modificarlinea_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_MODIFICARLINEA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_modificarlinea_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminarentrada_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminarentrada_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarentrada_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarentrada_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarentrada_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminarentrada_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminarentrada_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Popoversingrid", GXutil.rtrim( Grid_empowerer_Popoversingrid));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_MODIFICARLINEA_Result", GXutil.rtrim( Dvelop_confirmpanel_modificarlinea_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarentrada_Result));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_MODIFICARLINEA_Result", GXutil.rtrim( Dvelop_confirmpanel_modificarlinea_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarentrada_Result));
   }

   public void renderHtmlCloseForm18A2( )
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
         if ( ! ( WebComp_Wwpaux_wc == null ) )
         {
            WebComp_Wwpaux_wc.componentjscripts();
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
      return "WCTrabajosExternosRecepcionMantenimiento" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Tabla LREXHD", "") ;
   }

   public void wb18A0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wctrabajosexternosrecepcionmantenimiento");
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
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
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
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
         }
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table TableWithSelectableGrid", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 51, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCTrabajosExternosRecepcionMantenimiento.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 51, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCTrabajosExternosRecepcionMantenimiento.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 51, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCTrabajosExternosRecepcionMantenimiento.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_18A2( true) ;
      }
      else
      {
         wb_table1_23_18A2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_18A2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable1.setProperty("Width", Dvpanel_unnamedtable1_Width);
         ucDvpanel_unnamedtable1.setProperty("AutoWidth", Dvpanel_unnamedtable1_Autowidth);
         ucDvpanel_unnamedtable1.setProperty("AutoHeight", Dvpanel_unnamedtable1_Autoheight);
         ucDvpanel_unnamedtable1.setProperty("Cls", Dvpanel_unnamedtable1_Cls);
         ucDvpanel_unnamedtable1.setProperty("Title", Dvpanel_unnamedtable1_Title);
         ucDvpanel_unnamedtable1.setProperty("Collapsible", Dvpanel_unnamedtable1_Collapsible);
         ucDvpanel_unnamedtable1.setProperty("Collapsed", Dvpanel_unnamedtable1_Collapsed);
         ucDvpanel_unnamedtable1.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable1_Showcollapseicon);
         ucDvpanel_unnamedtable1.setProperty("IconPosition", Dvpanel_unnamedtable1_Iconposition);
         ucDvpanel_unnamedtable1.setProperty("AutoScroll", Dvpanel_unnamedtable1_Autoscroll);
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminarentrada_Internalname, "gx.evt.setGridEvt("+GXutil.str( 51, 2, 0)+","+"null"+");", httpContext.getMessage( "Eliminar Entrada", ""), bttBtneliminarentrada_Jsonclick, 7, httpContext.getMessage( "Eliminar Entrada", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1118a1_client"+"'", TempTags, "", 2, "HLP_WCTrabajosExternosRecepcionMantenimiento.htm");
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
         startgridcontrol51( ) ;
      }
      if ( wbEnd == 51 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_51 = (int)(nGXsfl_51_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV50GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV51GridPageCount);
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
         ucPopover_informacion.setProperty("IsGridItem", Popover_informacion_Isgriditem);
         ucPopover_informacion.setProperty("Trigger", Popover_informacion_Trigger);
         ucPopover_informacion.setProperty("PopoverWidth", Popover_informacion_Popoverwidth);
         ucPopover_informacion.setProperty("Position", Popover_informacion_Position);
         ucPopover_informacion.render(context, "dvelop.wwppopover", Popover_informacion_Internalname, sPrefix+"POPOVER_INFORMACIONContainer");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV48DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV48DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV24ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_87_18A2( true) ;
      }
      else
      {
         wb_table2_87_18A2( false) ;
      }
      return  ;
   }

   public void wb_table2_87_18A2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_92_18A2( true) ;
      }
      else
      {
         wb_table3_92_18A2( false) ;
      }
      return  ;
   }

   public void wb_table3_92_18A2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_97_18A2( true) ;
      }
      else
      {
         wb_table4_97_18A2( false) ;
      }
      return  ;
   }

   public void wb_table4_97_18A2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, sPrefix+"GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("PopoversInGrid", Grid_empowerer_Popoversingrid);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDiv_wwpauxwc_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0105"+"", GXutil.rtrim( WebComp_Wwpaux_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0105"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_51_Refreshing )
            {
               if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0105"+"");
                  }
                  WebComp_Wwpaux_wc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspEndCmp();
                  }
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_rpexhdfeauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'" + sPrefix + "',false,'" + sGXsfl_51_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_rpexhdfeauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_rpexhdfeauxdate_Internalname, localUtil.format(AV34DDO_RpExHdFeAuxDate, "99/99/99"), localUtil.format( AV34DDO_RpExHdFeAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,107);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_rpexhdfeauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCTrabajosExternosRecepcionMantenimiento.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_rpexhdfeauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCTrabajosExternosRecepcionMantenimiento.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 51 )
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

   public void start18A2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Tabla LREXHD", ""), (short)(0)) ;
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
            strup18A0( ) ;
         }
      }
   }

   public void ws18A2( )
   {
      start18A2( ) ;
      evt18A2( ) ;
   }

   public void evt18A2( )
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
                              strup18A0( ) ;
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
                              strup18A0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1218A2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup18A0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1318A2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup18A0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1418A2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup18A0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1518A2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup18A0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1618A2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup18A0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1718A2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_MODIFICARLINEA.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup18A0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1818A2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARENTRADA.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup18A0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1918A2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup18A0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e2018A2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup18A0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e2118A2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup18A0( ) ;
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
                              strup18A0( ) ;
                           }
                           nGXsfl_51_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_512( ) ;
                           cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
                           cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
                           AV79GrupodeAcciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79GrupodeAcciones), 4, 0));
                           A2713RpExHdLi = (short)(localUtil.ctol( httpContext.cgiGet( edtRpExHdLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A2711RpExHdFe = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtRpExHdFe_Internalname), 0)) ;
                           A2714RpExHdAlb = (int)(localUtil.ctol( httpContext.cgiGet( edtRpExHdAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n2714RpExHdAlb = false ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n252CliCod = false ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavRpexhdcns_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavRpexhdcns_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRPEXHDCNS");
                              GX_FocusControl = edtavRpexhdcns_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV16RpExHdCns = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRpexhdcns_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16RpExHdCns), 4, 0));
                           }
                           else
                           {
                              AV16RpExHdCns = (short)(localUtil.ctol( httpContext.cgiGet( edtavRpexhdcns_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRpexhdcns_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16RpExHdCns), 4, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPZS");
                              GX_FocusControl = edtavPzs_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV80Pzs = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPzs_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80Pzs), 4, 0));
                           }
                           else
                           {
                              AV80Pzs = (short)(localUtil.ctol( httpContext.cgiGet( edtavPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPzs_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80Pzs), 4, 0));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRpexhdkgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRpexhdkgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRPEXHDKGS");
                              GX_FocusControl = edtavRpexhdkgs_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV17RpExHdKgs = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRpexhdkgs_Internalname, GXutil.ltrimstr( AV17RpExHdKgs, 9, 2));
                           }
                           else
                           {
                              AV17RpExHdKgs = localUtil.ctond( httpContext.cgiGet( edtavRpexhdkgs_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRpexhdkgs_Internalname, GXutil.ltrimstr( AV17RpExHdKgs, 9, 2));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavKgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavKgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vKGS");
                              GX_FocusControl = edtavKgs_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV81Kgs = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavKgs_Internalname, GXutil.ltrimstr( AV81Kgs, 9, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vKGS"+"_"+sGXsfl_51_idx, getSecureSignedToken( sPrefix+sGXsfl_51_idx, localUtil.format( AV81Kgs, "ZZZZZ9.99")));
                           }
                           else
                           {
                              AV81Kgs = localUtil.ctond( httpContext.cgiGet( edtavKgs_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavKgs_Internalname, GXutil.ltrimstr( AV81Kgs, 9, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vKGS"+"_"+sGXsfl_51_idx, getSecureSignedToken( sPrefix+sGXsfl_51_idx, localUtil.format( AV81Kgs, "ZZZZZ9.99")));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRpexhdmts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRpexhdmts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRPEXHDMTS");
                              GX_FocusControl = edtavRpexhdmts_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV18RpExHdMts = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRpexhdmts_Internalname, GXutil.ltrimstr( AV18RpExHdMts, 9, 2));
                           }
                           else
                           {
                              AV18RpExHdMts = localUtil.ctond( httpContext.cgiGet( edtavRpexhdmts_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRpexhdmts_Internalname, GXutil.ltrimstr( AV18RpExHdMts, 9, 2));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMTS");
                              GX_FocusControl = edtavMts_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV82Mts = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMts_Internalname, GXutil.ltrimstr( AV82Mts, 9, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMTS"+"_"+sGXsfl_51_idx, getSecureSignedToken( sPrefix+sGXsfl_51_idx, localUtil.format( AV82Mts, "ZZZZZ9.99")));
                           }
                           else
                           {
                              AV82Mts = localUtil.ctond( httpContext.cgiGet( edtavMts_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMts_Internalname, GXutil.ltrimstr( AV82Mts, 9, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMTS"+"_"+sGXsfl_51_idx, getSecureSignedToken( sPrefix+sGXsfl_51_idx, localUtil.format( AV82Mts, "ZZZZZ9.99")));
                           }
                           cmbavRpexhdtip.setName( cmbavRpexhdtip.getInternalname() );
                           cmbavRpexhdtip.setValue( httpContext.cgiGet( cmbavRpexhdtip.getInternalname()) );
                           AV19RpExHdTip = httpContext.cgiGet( cmbavRpexhdtip.getInternalname()) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavRpexhdtip.getInternalname(), AV19RpExHdTip);
                           cmbavFlag.setName( cmbavFlag.getInternalname() );
                           cmbavFlag.setValue( httpContext.cgiGet( cmbavFlag.getInternalname()) );
                           AV92Flag = httpContext.cgiGet( cmbavFlag.getInternalname()) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavFlag.getInternalname(), AV92Flag);
                           AV95InformacionWithTags = httpContext.cgiGet( edtavInformacionwithtags_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavInformacionwithtags_Internalname, AV95InformacionWithTags);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavInformacion_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavInformacion_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINFORMACION");
                              GX_FocusControl = edtavInformacion_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV94Informacion = (byte)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavInformacion_Internalname, GXutil.str( AV94Informacion, 1, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINFORMACION"+"_"+sGXsfl_51_idx, getSecureSignedToken( sPrefix+sGXsfl_51_idx, localUtil.format( DecimalUtil.doubleToDec(AV94Informacion), "Z")));
                           }
                           else
                           {
                              AV94Informacion = (byte)(localUtil.ctol( httpContext.cgiGet( edtavInformacion_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavInformacion_Internalname, GXutil.str( AV94Informacion, 1, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINFORMACION"+"_"+sGXsfl_51_idx, getSecureSignedToken( sPrefix+sGXsfl_51_idx, localUtil.format( DecimalUtil.doubleToDec(AV94Informacion), "Z")));
                           }
                           A228BarUniMed = GXutil.upper( httpContext.cgiGet( edtBarUniMed_Internalname)) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavOldrpexhdcns_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavOldrpexhdcns_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vOLDRPEXHDCNS");
                              GX_FocusControl = edtavOldrpexhdcns_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV83oldRpExHdCns = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOldrpexhdcns_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83oldRpExHdCns), 4, 0));
                           }
                           else
                           {
                              AV83oldRpExHdCns = (short)(localUtil.ctol( httpContext.cgiGet( edtavOldrpexhdcns_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOldrpexhdcns_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83oldRpExHdCns), 4, 0));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavOldrpexhdkgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavOldrpexhdkgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vOLDRPEXHDKGS");
                              GX_FocusControl = edtavOldrpexhdkgs_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV84oldRpExHdKgs = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOldrpexhdkgs_Internalname, GXutil.ltrimstr( AV84oldRpExHdKgs, 9, 2));
                           }
                           else
                           {
                              AV84oldRpExHdKgs = localUtil.ctond( httpContext.cgiGet( edtavOldrpexhdkgs_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOldrpexhdkgs_Internalname, GXutil.ltrimstr( AV84oldRpExHdKgs, 9, 2));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavOldrpexhdmts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavOldrpexhdmts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vOLDRPEXHDMTS");
                              GX_FocusControl = edtavOldrpexhdmts_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV85OldRpExHdMts = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOldrpexhdmts_Internalname, GXutil.ltrimstr( AV85OldRpExHdMts, 9, 2));
                           }
                           else
                           {
                              AV85OldRpExHdMts = localUtil.ctond( httpContext.cgiGet( edtavOldrpexhdmts_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOldrpexhdmts_Internalname, GXutil.ltrimstr( AV85OldRpExHdMts, 9, 2));
                           }
                           A6262RpExSalLn = (short)(localUtil.ctol( httpContext.cgiGet( edtRpExSalLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n6262RpExSalLn = false ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
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
                                       e2218A2 ();
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
                                       e2318A2 ();
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
                                       e2418A2 ();
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
                                    strup18A0( ) ;
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 105 )
                     {
                        OldWwpaux_wc = httpContext.cgiGet( sPrefix+"W0105") ;
                        if ( ( GXutil.len( OldWwpaux_wc) == 0 ) || ( GXutil.strcmp(OldWwpaux_wc, WebComp_Wwpaux_wc_Component) != 0 ) )
                        {
                           WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app." + OldWwpaux_wc + "_impl", remoteHandle, context);
                           WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                        }
                        if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
                        {
                           WebComp_Wwpaux_wc.componentprocess(sPrefix+"W0105", "", sEvt);
                        }
                        WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we18A2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm18A2( ) ;
         }
      }
   }

   public void pa18A2( )
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
      subsflControlProps_512( ) ;
      while ( nGXsfl_51_idx <= nRC_GXsfl_51 )
      {
         sendrow_512( ) ;
         nGXsfl_51_idx = ((subGrid_Islastpage==1)&&(nGXsfl_51_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_51_idx+1) ;
         sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_512( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV15FilterFullText ,
                                 String AV54EmprCod ,
                                 short AV53Mancod ,
                                 java.util.Date AV52RpExHdFe ,
                                 byte AV29ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelector ,
                                 short AV36TFRpExHdLi ,
                                 short AV37TFRpExHdLi_To ,
                                 java.util.Date AV32TFRpExHdFe ,
                                 int AV30TFRpExHdAlb ,
                                 int AV31TFRpExHdAlb_To ,
                                 int AV38TFCliCod ,
                                 int AV39TFCliCod_To ,
                                 String AV40TFCliNom ,
                                 String AV41TFCliNom_Sel ,
                                 String AV42TFBarSer ,
                                 String AV43TFBarSer_Sel ,
                                 String AV44TFBarSerDsc ,
                                 String AV45TFBarSerDsc_Sel ,
                                 String AV115Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 byte AV93FlagLin ,
                                 byte AV94Informacion ,
                                 String A396EmprCod ,
                                 short A2248ManCod ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2318A2 ();
      GRID_nCurrentRecord = 0 ;
      rf18A2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINFORMACION", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV94Informacion), "Z")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINFORMACION", GXutil.ltrim( localUtil.ntoc( AV94Informacion, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vKGS", getSecureSignedToken( sPrefix, localUtil.format( AV81Kgs, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vKGS", GXutil.ltrim( localUtil.ntoc( AV81Kgs, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMTS", getSecureSignedToken( sPrefix, localUtil.format( AV82Mts, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMTS", GXutil.ltrim( localUtil.ntoc( AV82Mts, (byte)(9), (byte)(2), ".", "")));
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
      rf18A2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV115Pgmname = "WCTrabajosExternosRecepcionMantenimiento" ;
      Gx_err = (short)(0) ;
      edtavPzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPzs_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKgs_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMts_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavInformacionwithtags_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformacionwithtags_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformacionwithtags_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavInformacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformacion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformacion_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavOldrpexhdcns_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOldrpexhdcns_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOldrpexhdcns_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavOldrpexhdkgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOldrpexhdkgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOldrpexhdkgs_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavOldrpexhdmts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOldrpexhdmts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOldrpexhdmts_Enabled), 5, 0), !bGXsfl_51_Refreshing);
   }

   public void rf18A2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(51) ;
      /* Execute user event: Refresh */
      e2318A2 ();
      nGXsfl_51_idx = 1 ;
      sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_512( ) ;
      bGXsfl_51_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
            {
               WebComp_Wwpaux_wc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_512( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext ,
                                              Short.valueOf(AV102Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli) ,
                                              Short.valueOf(AV103Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to) ,
                                              AV104Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe ,
                                              Integer.valueOf(AV105Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb) ,
                                              Integer.valueOf(AV106Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to) ,
                                              Integer.valueOf(AV107Wctrabajosexternosrecepcionmantenimientods_7_tfclicod) ,
                                              Integer.valueOf(AV108Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to) ,
                                              AV110Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel ,
                                              AV109Wctrabajosexternosrecepcionmantenimientods_9_tfclinom ,
                                              AV112Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel ,
                                              AV111Wctrabajosexternosrecepcionmantenimientods_11_tfbarser ,
                                              AV114Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel ,
                                              AV113Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc ,
                                              Short.valueOf(A2713RpExHdLi) ,
                                              Integer.valueOf(A2714RpExHdAlb) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A212BarSer ,
                                              A1652BarSerDsc ,
                                              A2711RpExHdFe ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV54EmprCod ,
                                              Short.valueOf(AV53Mancod) ,
                                              AV52RpExHdFe ,
                                              A396EmprCod ,
                                              Short.valueOf(A2248ManCod) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT
                                              }
         });
         lV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
         lV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
         lV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
         lV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
         lV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
         lV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
         lV109Wctrabajosexternosrecepcionmantenimientods_9_tfclinom = GXutil.padr( GXutil.rtrim( AV109Wctrabajosexternosrecepcionmantenimientods_9_tfclinom), 30, "%") ;
         lV111Wctrabajosexternosrecepcionmantenimientods_11_tfbarser = GXutil.padr( GXutil.rtrim( AV111Wctrabajosexternosrecepcionmantenimientods_11_tfbarser), 16, "%") ;
         lV113Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV113Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc), 26, "%") ;
         /* Using cursor H018A2 */
         pr_default.execute(0, new Object[] {AV54EmprCod, Short.valueOf(AV53Mancod), AV52RpExHdFe, lV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, Short.valueOf(AV102Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli), Short.valueOf(AV103Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to), AV104Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe, Integer.valueOf(AV105Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb), Integer.valueOf(AV106Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to), Integer.valueOf(AV107Wctrabajosexternosrecepcionmantenimientods_7_tfclicod), Integer.valueOf(AV108Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to), lV109Wctrabajosexternosrecepcionmantenimientods_9_tfclinom, AV110Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel, lV111Wctrabajosexternosrecepcionmantenimientods_11_tfbarser, AV112Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel, lV113Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc, AV114Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_51_idx = 1 ;
         sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_512( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A2716RpExHdCns = H018A2_A2716RpExHdCns[0] ;
            n2716RpExHdCns = H018A2_n2716RpExHdCns[0] ;
            A2715RpExHdKgs = H018A2_A2715RpExHdKgs[0] ;
            n2715RpExHdKgs = H018A2_n2715RpExHdKgs[0] ;
            A2847RpExHdMts = H018A2_A2847RpExHdMts[0] ;
            n2847RpExHdMts = H018A2_n2847RpExHdMts[0] ;
            A2717RpExHdTip = H018A2_A2717RpExHdTip[0] ;
            n2717RpExHdTip = H018A2_n2717RpExHdTip[0] ;
            A2248ManCod = H018A2_A2248ManCod[0] ;
            A396EmprCod = H018A2_A396EmprCod[0] ;
            A130BarCodPar = H018A2_A130BarCodPar[0] ;
            A132BarCodReo = H018A2_A132BarCodReo[0] ;
            A129BarCod = H018A2_A129BarCod[0] ;
            A6262RpExSalLn = H018A2_A6262RpExSalLn[0] ;
            n6262RpExSalLn = H018A2_n6262RpExSalLn[0] ;
            A228BarUniMed = H018A2_A228BarUniMed[0] ;
            A1652BarSerDsc = H018A2_A1652BarSerDsc[0] ;
            A212BarSer = H018A2_A212BarSer[0] ;
            A279CliNom = H018A2_A279CliNom[0] ;
            A252CliCod = H018A2_A252CliCod[0] ;
            n252CliCod = H018A2_n252CliCod[0] ;
            A2714RpExHdAlb = H018A2_A2714RpExHdAlb[0] ;
            n2714RpExHdAlb = H018A2_n2714RpExHdAlb[0] ;
            A2711RpExHdFe = H018A2_A2711RpExHdFe[0] ;
            A2713RpExHdLi = H018A2_A2713RpExHdLi[0] ;
            A228BarUniMed = H018A2_A228BarUniMed[0] ;
            A1652BarSerDsc = H018A2_A1652BarSerDsc[0] ;
            A212BarSer = H018A2_A212BarSer[0] ;
            A252CliCod = H018A2_A252CliCod[0] ;
            n252CliCod = H018A2_n252CliCod[0] ;
            A279CliNom = H018A2_A279CliNom[0] ;
            e2418A2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(51) ;
         wb18A0( ) ;
      }
      bGXsfl_51_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes18A2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV115Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV115Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGLIN", GXutil.ltrim( localUtil.ntoc( AV93FlagLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGLIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV93FlagLin), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINFORMACION"+"_"+sGXsfl_51_idx, getSecureSignedToken( sPrefix+sGXsfl_51_idx, localUtil.format( DecimalUtil.doubleToDec(AV94Informacion), "Z")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MANCOD", GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MANCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vKGS"+"_"+sGXsfl_51_idx, getSecureSignedToken( sPrefix+sGXsfl_51_idx, localUtil.format( AV81Kgs, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMTS"+"_"+sGXsfl_51_idx, getSecureSignedToken( sPrefix+sGXsfl_51_idx, localUtil.format( AV82Mts, "ZZZZZ9.99")));
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
      AV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = AV15FilterFullText ;
      AV102Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli = AV36TFRpExHdLi ;
      AV103Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to = AV37TFRpExHdLi_To ;
      AV104Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe = AV32TFRpExHdFe ;
      AV105Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb = AV30TFRpExHdAlb ;
      AV106Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to = AV31TFRpExHdAlb_To ;
      AV107Wctrabajosexternosrecepcionmantenimientods_7_tfclicod = AV38TFCliCod ;
      AV108Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to = AV39TFCliCod_To ;
      AV109Wctrabajosexternosrecepcionmantenimientods_9_tfclinom = AV40TFCliNom ;
      AV110Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel = AV41TFCliNom_Sel ;
      AV111Wctrabajosexternosrecepcionmantenimientods_11_tfbarser = AV42TFBarSer ;
      AV112Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel = AV43TFBarSer_Sel ;
      AV113Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc = AV44TFBarSerDsc ;
      AV114Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel = AV45TFBarSerDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext ,
                                           Short.valueOf(AV102Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli) ,
                                           Short.valueOf(AV103Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to) ,
                                           AV104Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe ,
                                           Integer.valueOf(AV105Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb) ,
                                           Integer.valueOf(AV106Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to) ,
                                           Integer.valueOf(AV107Wctrabajosexternosrecepcionmantenimientods_7_tfclicod) ,
                                           Integer.valueOf(AV108Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to) ,
                                           AV110Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel ,
                                           AV109Wctrabajosexternosrecepcionmantenimientods_9_tfclinom ,
                                           AV112Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel ,
                                           AV111Wctrabajosexternosrecepcionmantenimientods_11_tfbarser ,
                                           AV114Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel ,
                                           AV113Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc ,
                                           Short.valueOf(A2713RpExHdLi) ,
                                           Integer.valueOf(A2714RpExHdAlb) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A2711RpExHdFe ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV54EmprCod ,
                                           Short.valueOf(AV53Mancod) ,
                                           AV52RpExHdFe ,
                                           A396EmprCod ,
                                           Short.valueOf(A2248ManCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      lV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV109Wctrabajosexternosrecepcionmantenimientods_9_tfclinom = GXutil.padr( GXutil.rtrim( AV109Wctrabajosexternosrecepcionmantenimientods_9_tfclinom), 30, "%") ;
      lV111Wctrabajosexternosrecepcionmantenimientods_11_tfbarser = GXutil.padr( GXutil.rtrim( AV111Wctrabajosexternosrecepcionmantenimientods_11_tfbarser), 16, "%") ;
      lV113Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV113Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc), 26, "%") ;
      /* Using cursor H018A3 */
      pr_default.execute(1, new Object[] {AV54EmprCod, Short.valueOf(AV53Mancod), AV52RpExHdFe, lV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, Short.valueOf(AV102Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli), Short.valueOf(AV103Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to), AV104Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe, Integer.valueOf(AV105Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb), Integer.valueOf(AV106Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to), Integer.valueOf(AV107Wctrabajosexternosrecepcionmantenimientods_7_tfclicod), Integer.valueOf(AV108Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to), lV109Wctrabajosexternosrecepcionmantenimientods_9_tfclinom, AV110Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel, lV111Wctrabajosexternosrecepcionmantenimientods_11_tfbarser, AV112Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel, lV113Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc, AV114Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel});
      GRID_nRecordCount = H018A3_AGRID_nRecordCount[0] ;
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
      AV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = AV15FilterFullText ;
      AV102Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli = AV36TFRpExHdLi ;
      AV103Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to = AV37TFRpExHdLi_To ;
      AV104Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe = AV32TFRpExHdFe ;
      AV105Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb = AV30TFRpExHdAlb ;
      AV106Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to = AV31TFRpExHdAlb_To ;
      AV107Wctrabajosexternosrecepcionmantenimientods_7_tfclicod = AV38TFCliCod ;
      AV108Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to = AV39TFCliCod_To ;
      AV109Wctrabajosexternosrecepcionmantenimientods_9_tfclinom = AV40TFCliNom ;
      AV110Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel = AV41TFCliNom_Sel ;
      AV111Wctrabajosexternosrecepcionmantenimientods_11_tfbarser = AV42TFBarSer ;
      AV112Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel = AV43TFBarSer_Sel ;
      AV113Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc = AV44TFBarSerDsc ;
      AV114Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel = AV45TFBarSerDsc_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV54EmprCod, AV53Mancod, AV52RpExHdFe, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV36TFRpExHdLi, AV37TFRpExHdLi_To, AV32TFRpExHdFe, AV30TFRpExHdAlb, AV31TFRpExHdAlb_To, AV38TFCliCod, AV39TFCliCod_To, AV40TFCliNom, AV41TFCliNom_Sel, AV42TFBarSer, AV43TFBarSer_Sel, AV44TFBarSerDsc, AV45TFBarSerDsc_Sel, AV115Pgmname, AV12OrderedBy, AV13OrderedDsc, AV93FlagLin, AV94Informacion, A396EmprCod, A2248ManCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = AV15FilterFullText ;
      AV102Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli = AV36TFRpExHdLi ;
      AV103Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to = AV37TFRpExHdLi_To ;
      AV104Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe = AV32TFRpExHdFe ;
      AV105Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb = AV30TFRpExHdAlb ;
      AV106Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to = AV31TFRpExHdAlb_To ;
      AV107Wctrabajosexternosrecepcionmantenimientods_7_tfclicod = AV38TFCliCod ;
      AV108Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to = AV39TFCliCod_To ;
      AV109Wctrabajosexternosrecepcionmantenimientods_9_tfclinom = AV40TFCliNom ;
      AV110Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel = AV41TFCliNom_Sel ;
      AV111Wctrabajosexternosrecepcionmantenimientods_11_tfbarser = AV42TFBarSer ;
      AV112Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel = AV43TFBarSer_Sel ;
      AV113Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc = AV44TFBarSerDsc ;
      AV114Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel = AV45TFBarSerDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV54EmprCod, AV53Mancod, AV52RpExHdFe, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV36TFRpExHdLi, AV37TFRpExHdLi_To, AV32TFRpExHdFe, AV30TFRpExHdAlb, AV31TFRpExHdAlb_To, AV38TFCliCod, AV39TFCliCod_To, AV40TFCliNom, AV41TFCliNom_Sel, AV42TFBarSer, AV43TFBarSer_Sel, AV44TFBarSerDsc, AV45TFBarSerDsc_Sel, AV115Pgmname, AV12OrderedBy, AV13OrderedDsc, AV93FlagLin, AV94Informacion, A396EmprCod, A2248ManCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = AV15FilterFullText ;
      AV102Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli = AV36TFRpExHdLi ;
      AV103Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to = AV37TFRpExHdLi_To ;
      AV104Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe = AV32TFRpExHdFe ;
      AV105Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb = AV30TFRpExHdAlb ;
      AV106Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to = AV31TFRpExHdAlb_To ;
      AV107Wctrabajosexternosrecepcionmantenimientods_7_tfclicod = AV38TFCliCod ;
      AV108Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to = AV39TFCliCod_To ;
      AV109Wctrabajosexternosrecepcionmantenimientods_9_tfclinom = AV40TFCliNom ;
      AV110Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel = AV41TFCliNom_Sel ;
      AV111Wctrabajosexternosrecepcionmantenimientods_11_tfbarser = AV42TFBarSer ;
      AV112Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel = AV43TFBarSer_Sel ;
      AV113Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc = AV44TFBarSerDsc ;
      AV114Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel = AV45TFBarSerDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV54EmprCod, AV53Mancod, AV52RpExHdFe, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV36TFRpExHdLi, AV37TFRpExHdLi_To, AV32TFRpExHdFe, AV30TFRpExHdAlb, AV31TFRpExHdAlb_To, AV38TFCliCod, AV39TFCliCod_To, AV40TFCliNom, AV41TFCliNom_Sel, AV42TFBarSer, AV43TFBarSer_Sel, AV44TFBarSerDsc, AV45TFBarSerDsc_Sel, AV115Pgmname, AV12OrderedBy, AV13OrderedDsc, AV93FlagLin, AV94Informacion, A396EmprCod, A2248ManCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = AV15FilterFullText ;
      AV102Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli = AV36TFRpExHdLi ;
      AV103Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to = AV37TFRpExHdLi_To ;
      AV104Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe = AV32TFRpExHdFe ;
      AV105Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb = AV30TFRpExHdAlb ;
      AV106Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to = AV31TFRpExHdAlb_To ;
      AV107Wctrabajosexternosrecepcionmantenimientods_7_tfclicod = AV38TFCliCod ;
      AV108Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to = AV39TFCliCod_To ;
      AV109Wctrabajosexternosrecepcionmantenimientods_9_tfclinom = AV40TFCliNom ;
      AV110Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel = AV41TFCliNom_Sel ;
      AV111Wctrabajosexternosrecepcionmantenimientods_11_tfbarser = AV42TFBarSer ;
      AV112Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel = AV43TFBarSer_Sel ;
      AV113Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc = AV44TFBarSerDsc ;
      AV114Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel = AV45TFBarSerDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV54EmprCod, AV53Mancod, AV52RpExHdFe, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV36TFRpExHdLi, AV37TFRpExHdLi_To, AV32TFRpExHdFe, AV30TFRpExHdAlb, AV31TFRpExHdAlb_To, AV38TFCliCod, AV39TFCliCod_To, AV40TFCliNom, AV41TFCliNom_Sel, AV42TFBarSer, AV43TFBarSer_Sel, AV44TFBarSerDsc, AV45TFBarSerDsc_Sel, AV115Pgmname, AV12OrderedBy, AV13OrderedDsc, AV93FlagLin, AV94Informacion, A396EmprCod, A2248ManCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = AV15FilterFullText ;
      AV102Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli = AV36TFRpExHdLi ;
      AV103Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to = AV37TFRpExHdLi_To ;
      AV104Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe = AV32TFRpExHdFe ;
      AV105Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb = AV30TFRpExHdAlb ;
      AV106Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to = AV31TFRpExHdAlb_To ;
      AV107Wctrabajosexternosrecepcionmantenimientods_7_tfclicod = AV38TFCliCod ;
      AV108Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to = AV39TFCliCod_To ;
      AV109Wctrabajosexternosrecepcionmantenimientods_9_tfclinom = AV40TFCliNom ;
      AV110Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel = AV41TFCliNom_Sel ;
      AV111Wctrabajosexternosrecepcionmantenimientods_11_tfbarser = AV42TFBarSer ;
      AV112Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel = AV43TFBarSer_Sel ;
      AV113Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc = AV44TFBarSerDsc ;
      AV114Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel = AV45TFBarSerDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV54EmprCod, AV53Mancod, AV52RpExHdFe, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV36TFRpExHdLi, AV37TFRpExHdLi_To, AV32TFRpExHdFe, AV30TFRpExHdAlb, AV31TFRpExHdAlb_To, AV38TFCliCod, AV39TFCliCod_To, AV40TFCliNom, AV41TFCliNom_Sel, AV42TFBarSer, AV43TFBarSer_Sel, AV44TFBarSerDsc, AV45TFBarSerDsc_Sel, AV115Pgmname, AV12OrderedBy, AV13OrderedDsc, AV93FlagLin, AV94Informacion, A396EmprCod, A2248ManCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV115Pgmname = "WCTrabajosExternosRecepcionMantenimiento" ;
      Gx_err = (short)(0) ;
      edtavPzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPzs_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKgs_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMts_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavInformacionwithtags_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformacionwithtags_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformacionwithtags_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavInformacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformacion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformacion_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavOldrpexhdcns_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOldrpexhdcns_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOldrpexhdcns_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavOldrpexhdkgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOldrpexhdkgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOldrpexhdkgs_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavOldrpexhdmts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOldrpexhdmts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOldrpexhdmts_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup18A0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2218A2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV27ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV48DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV24ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_51 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_51"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV50GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV51GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV54EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV54EmprCod") ;
         wcpOAV53Mancod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV53Mancod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV52RpExHdFe = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV52RpExHdFe"), 0) ;
         Gx_msg = httpContext.cgiGet( sPrefix+"vMSG") ;
         AV89mtsd = localUtil.ctond( httpContext.cgiGet( sPrefix+"vMTSD")) ;
         AV88kgsd = localUtil.ctond( httpContext.cgiGet( sPrefix+"vKGSD")) ;
         A396EmprCod = httpContext.cgiGet( sPrefix+"EMPRCOD") ;
         AV52RpExHdFe = localUtil.ctod( httpContext.cgiGet( sPrefix+"vRPEXHDFE"), 0) ;
         AV116Emprcod_selected = httpContext.cgiGet( sPrefix+"vEMPRCOD_SELECTED") ;
         AV117Mancod_selected = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vMANCOD_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A2248ManCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"MANCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV118Rpexhdfe_selected = localUtil.ctod( httpContext.cgiGet( sPrefix+"vRPEXHDFE_SELECTED"), 0) ;
         AV119Rpexhdli_selected = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vRPEXHDLI_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
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
         Popover_informacion_Gridinternalname = httpContext.cgiGet( sPrefix+"POPOVER_INFORMACION_Gridinternalname") ;
         Popover_informacion_Iteminternalname = httpContext.cgiGet( sPrefix+"POPOVER_INFORMACION_Iteminternalname") ;
         Popover_informacion_Isgriditem = GXutil.strtobool( httpContext.cgiGet( sPrefix+"POPOVER_INFORMACION_Isgriditem")) ;
         Popover_informacion_Trigger = httpContext.cgiGet( sPrefix+"POPOVER_INFORMACION_Trigger") ;
         Popover_informacion_Popoverwidth = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"POPOVER_INFORMACION_Popoverwidth"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Popover_informacion_Position = httpContext.cgiGet( sPrefix+"POPOVER_INFORMACION_Position") ;
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
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
         Dvelop_confirmpanel_modificarlinea_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_MODIFICARLINEA_Title") ;
         Dvelop_confirmpanel_modificarlinea_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_MODIFICARLINEA_Confirmationtext") ;
         Dvelop_confirmpanel_modificarlinea_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_MODIFICARLINEA_Yesbuttoncaption") ;
         Dvelop_confirmpanel_modificarlinea_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_MODIFICARLINEA_Nobuttoncaption") ;
         Dvelop_confirmpanel_modificarlinea_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_MODIFICARLINEA_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_modificarlinea_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_MODIFICARLINEA_Yesbuttonposition") ;
         Dvelop_confirmpanel_modificarlinea_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_MODIFICARLINEA_Confirmtype") ;
         Dvelop_confirmpanel_eliminarentrada_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Title") ;
         Dvelop_confirmpanel_eliminarentrada_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Confirmationtext") ;
         Dvelop_confirmpanel_eliminarentrada_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminarentrada_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminarentrada_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminarentrada_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminarentrada_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Confirmtype") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         Grid_empowerer_Popoversingrid = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Popoversingrid") ;
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
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         Dvelop_confirmpanel_modificarlinea_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_MODIFICARLINEA_Result") ;
         Dvelop_confirmpanel_eliminarentrada_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Result") ;
         /* Read variables values. */
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_rpexhdfeauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_RPEXHDFEAUXDATE");
            GX_FocusControl = edtavDdo_rpexhdfeauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV34DDO_RpExHdFeAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34DDO_RpExHdFeAuxDate", localUtil.format(AV34DDO_RpExHdFeAuxDate, "99/99/99"));
         }
         else
         {
            AV34DDO_RpExHdFeAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_rpexhdfeauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34DDO_RpExHdFeAuxDate", localUtil.format(AV34DDO_RpExHdFeAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_51_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_512( ) ;
         if ( nGXsfl_51_idx > 0 )
         {
            cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
            cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
            AV79GrupodeAcciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79GrupodeAcciones), 4, 0));
            A2713RpExHdLi = (short)(localUtil.ctol( httpContext.cgiGet( edtRpExHdLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2711RpExHdFe = localUtil.ctod( httpContext.cgiGet( edtRpExHdFe_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A2714RpExHdAlb = (int)(localUtil.ctol( httpContext.cgiGet( edtRpExHdAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n2714RpExHdAlb = false ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavRpexhdcns_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavRpexhdcns_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRPEXHDCNS");
               GX_FocusControl = edtavRpexhdcns_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV16RpExHdCns = (short)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRpexhdcns_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16RpExHdCns), 4, 0));
            }
            else
            {
               AV16RpExHdCns = (short)(localUtil.ctol( httpContext.cgiGet( edtavRpexhdcns_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRpexhdcns_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16RpExHdCns), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPZS");
               GX_FocusControl = edtavPzs_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV80Pzs = (short)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPzs_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80Pzs), 4, 0));
            }
            else
            {
               AV80Pzs = (short)(localUtil.ctol( httpContext.cgiGet( edtavPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPzs_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80Pzs), 4, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRpexhdkgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRpexhdkgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRPEXHDKGS");
               GX_FocusControl = edtavRpexhdkgs_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV17RpExHdKgs = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRpexhdkgs_Internalname, GXutil.ltrimstr( AV17RpExHdKgs, 9, 2));
            }
            else
            {
               AV17RpExHdKgs = localUtil.ctond( httpContext.cgiGet( edtavRpexhdkgs_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRpexhdkgs_Internalname, GXutil.ltrimstr( AV17RpExHdKgs, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavKgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavKgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vKGS");
               GX_FocusControl = edtavKgs_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV81Kgs = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavKgs_Internalname, GXutil.ltrimstr( AV81Kgs, 9, 2));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vKGS"+"_"+sGXsfl_51_idx, getSecureSignedToken( sPrefix+sGXsfl_51_idx, localUtil.format( AV81Kgs, "ZZZZZ9.99")));
            }
            else
            {
               AV81Kgs = localUtil.ctond( httpContext.cgiGet( edtavKgs_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavKgs_Internalname, GXutil.ltrimstr( AV81Kgs, 9, 2));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vKGS"+"_"+sGXsfl_51_idx, getSecureSignedToken( sPrefix+sGXsfl_51_idx, localUtil.format( AV81Kgs, "ZZZZZ9.99")));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRpexhdmts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRpexhdmts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRPEXHDMTS");
               GX_FocusControl = edtavRpexhdmts_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV18RpExHdMts = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRpexhdmts_Internalname, GXutil.ltrimstr( AV18RpExHdMts, 9, 2));
            }
            else
            {
               AV18RpExHdMts = localUtil.ctond( httpContext.cgiGet( edtavRpexhdmts_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRpexhdmts_Internalname, GXutil.ltrimstr( AV18RpExHdMts, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMTS");
               GX_FocusControl = edtavMts_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV82Mts = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMts_Internalname, GXutil.ltrimstr( AV82Mts, 9, 2));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMTS"+"_"+sGXsfl_51_idx, getSecureSignedToken( sPrefix+sGXsfl_51_idx, localUtil.format( AV82Mts, "ZZZZZ9.99")));
            }
            else
            {
               AV82Mts = localUtil.ctond( httpContext.cgiGet( edtavMts_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMts_Internalname, GXutil.ltrimstr( AV82Mts, 9, 2));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMTS"+"_"+sGXsfl_51_idx, getSecureSignedToken( sPrefix+sGXsfl_51_idx, localUtil.format( AV82Mts, "ZZZZZ9.99")));
            }
            cmbavRpexhdtip.setName( cmbavRpexhdtip.getInternalname() );
            cmbavRpexhdtip.setValue( httpContext.cgiGet( cmbavRpexhdtip.getInternalname()) );
            AV19RpExHdTip = httpContext.cgiGet( cmbavRpexhdtip.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavRpexhdtip.getInternalname(), AV19RpExHdTip);
            cmbavFlag.setName( cmbavFlag.getInternalname() );
            cmbavFlag.setValue( httpContext.cgiGet( cmbavFlag.getInternalname()) );
            AV92Flag = httpContext.cgiGet( cmbavFlag.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavFlag.getInternalname(), AV92Flag);
            AV95InformacionWithTags = httpContext.cgiGet( edtavInformacionwithtags_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavInformacionwithtags_Internalname, AV95InformacionWithTags);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavInformacion_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavInformacion_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINFORMACION");
               GX_FocusControl = edtavInformacion_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV94Informacion = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavInformacion_Internalname, GXutil.str( AV94Informacion, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINFORMACION"+"_"+sGXsfl_51_idx, getSecureSignedToken( sPrefix+sGXsfl_51_idx, localUtil.format( DecimalUtil.doubleToDec(AV94Informacion), "Z")));
            }
            else
            {
               AV94Informacion = (byte)(localUtil.ctol( httpContext.cgiGet( edtavInformacion_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavInformacion_Internalname, GXutil.str( AV94Informacion, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINFORMACION"+"_"+sGXsfl_51_idx, getSecureSignedToken( sPrefix+sGXsfl_51_idx, localUtil.format( DecimalUtil.doubleToDec(AV94Informacion), "Z")));
            }
            A228BarUniMed = GXutil.upper( httpContext.cgiGet( edtBarUniMed_Internalname)) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavOldrpexhdcns_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavOldrpexhdcns_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vOLDRPEXHDCNS");
               GX_FocusControl = edtavOldrpexhdcns_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV83oldRpExHdCns = (short)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOldrpexhdcns_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83oldRpExHdCns), 4, 0));
            }
            else
            {
               AV83oldRpExHdCns = (short)(localUtil.ctol( httpContext.cgiGet( edtavOldrpexhdcns_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOldrpexhdcns_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83oldRpExHdCns), 4, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavOldrpexhdkgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavOldrpexhdkgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vOLDRPEXHDKGS");
               GX_FocusControl = edtavOldrpexhdkgs_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV84oldRpExHdKgs = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOldrpexhdkgs_Internalname, GXutil.ltrimstr( AV84oldRpExHdKgs, 9, 2));
            }
            else
            {
               AV84oldRpExHdKgs = localUtil.ctond( httpContext.cgiGet( edtavOldrpexhdkgs_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOldrpexhdkgs_Internalname, GXutil.ltrimstr( AV84oldRpExHdKgs, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavOldrpexhdmts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavOldrpexhdmts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vOLDRPEXHDMTS");
               GX_FocusControl = edtavOldrpexhdmts_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV85OldRpExHdMts = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOldrpexhdmts_Internalname, GXutil.ltrimstr( AV85OldRpExHdMts, 9, 2));
            }
            else
            {
               AV85OldRpExHdMts = localUtil.ctond( httpContext.cgiGet( edtavOldrpexhdmts_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOldrpexhdmts_Internalname, GXutil.ltrimstr( AV85OldRpExHdMts, 9, 2));
            }
            A6262RpExSalLn = (short)(localUtil.ctol( httpContext.cgiGet( edtRpExSalLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6262RpExSalLn = false ;
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         }
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
      e2218A2 ();
      if (returnInSub) return;
   }

   public void e2218A2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV98Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.GXt_char1 = GXv_char2[0] ;
      AV98Station = GXt_char1 ;
      GXv_char2[0] = AV54EmprCod ;
      GXv_char3[0] = AV99Emprnom ;
      GXv_char4[0] = AV100Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV98Station, GXv_char2, GXv_char3, GXv_char4) ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.AV54EmprCod = GXv_char2[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.AV99Emprnom = GXv_char3[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.AV100Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54EmprCod", AV54EmprCod);
      Popover_informacion_Gridinternalname = subGrid_Internalname ;
      ucPopover_informacion.sendProperty(context, sPrefix, false, Popover_informacion_Internalname, "GridInternalName", Popover_informacion_Gridinternalname);
      Popover_informacion_Iteminternalname = edtavInformacionwithtags_Internalname ;
      ucPopover_informacion.sendProperty(context, sPrefix, false, Popover_informacion_Internalname, "ItemInternalName", Popover_informacion_Iteminternalname);
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
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV48DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV48DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e2318A2( )
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
      if ( AV29ManageFiltersExecutionStep == 1 )
      {
         AV29ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV29ManageFiltersExecutionStep == 2 )
      {
         AV29ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV26Session.getValue("WCTrabajosExternosRecepcionMantenimientoColumnsSelector"), "") != 0 )
      {
         AV22ColumnsSelectorXML = AV26Session.getValue("WCTrabajosExternosRecepcionMantenimientoColumnsSelector") ;
         AV24ColumnsSelector.fromxml(AV22ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtRpExHdLi_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRpExHdLi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdLi_Visible), 5, 0), !bGXsfl_51_Refreshing);
      edtRpExHdFe_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRpExHdFe_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdFe_Visible), 5, 0), !bGXsfl_51_Refreshing);
      edtRpExHdAlb_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRpExHdAlb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdAlb_Visible), 5, 0), !bGXsfl_51_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_51_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_51_Refreshing);
      edtBarSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Visible), 5, 0), !bGXsfl_51_Refreshing);
      edtBarSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Visible), 5, 0), !bGXsfl_51_Refreshing);
      edtavRpexhdcns_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRpexhdcns_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRpexhdcns_Visible), 5, 0), !bGXsfl_51_Refreshing);
      edtavPzs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPzs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPzs_Visible), 5, 0), !bGXsfl_51_Refreshing);
      edtavRpexhdkgs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRpexhdkgs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRpexhdkgs_Visible), 5, 0), !bGXsfl_51_Refreshing);
      edtavKgs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavKgs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKgs_Visible), 5, 0), !bGXsfl_51_Refreshing);
      edtavRpexhdmts_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRpexhdmts_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRpexhdmts_Visible), 5, 0), !bGXsfl_51_Refreshing);
      edtavMts_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMts_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMts_Visible), 5, 0), !bGXsfl_51_Refreshing);
      cmbavRpexhdtip.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavRpexhdtip.getInternalname(), "Visible", GXutil.ltrimstr( cmbavRpexhdtip.getVisible(), 5, 0), !bGXsfl_51_Refreshing);
      cmbavFlag.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavFlag.getInternalname(), "Visible", GXutil.ltrimstr( cmbavFlag.getVisible(), 5, 0), !bGXsfl_51_Refreshing);
      edtavInformacionwithtags_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformacionwithtags_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformacionwithtags_Visible), 5, 0), !bGXsfl_51_Refreshing);
      AV50GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50GridCurrentPage), 10, 0));
      AV51GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51GridPageCount), 10, 0));
      AV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = AV15FilterFullText ;
      AV102Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli = AV36TFRpExHdLi ;
      AV103Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to = AV37TFRpExHdLi_To ;
      AV104Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe = AV32TFRpExHdFe ;
      AV105Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb = AV30TFRpExHdAlb ;
      AV106Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to = AV31TFRpExHdAlb_To ;
      AV107Wctrabajosexternosrecepcionmantenimientods_7_tfclicod = AV38TFCliCod ;
      AV108Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to = AV39TFCliCod_To ;
      AV109Wctrabajosexternosrecepcionmantenimientods_9_tfclinom = AV40TFCliNom ;
      AV110Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel = AV41TFCliNom_Sel ;
      AV111Wctrabajosexternosrecepcionmantenimientods_11_tfbarser = AV42TFBarSer ;
      AV112Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel = AV43TFBarSer_Sel ;
      AV113Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc = AV44TFBarSerDsc ;
      AV114Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel = AV45TFBarSerDsc_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e1318A2( )
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
         AV49PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV49PageToGo) ;
      }
   }

   public void e1418A2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1518A2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RpExHdLi") == 0 )
         {
            AV36TFRpExHdLi = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFRpExHdLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFRpExHdLi), 4, 0));
            AV37TFRpExHdLi_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFRpExHdLi_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFRpExHdLi_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RpExHdFe") == 0 )
         {
            AV32TFRpExHdFe = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFRpExHdFe", localUtil.format(AV32TFRpExHdFe, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RpExHdAlb") == 0 )
         {
            AV30TFRpExHdAlb = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFRpExHdAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFRpExHdAlb), 8, 0));
            AV31TFRpExHdAlb_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFRpExHdAlb_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFRpExHdAlb_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV38TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFCliCod), 6, 0));
            AV39TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV40TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFCliNom", AV40TFCliNom);
            AV41TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFCliNom_Sel", AV41TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV42TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFBarSer", AV42TFBarSer);
            AV43TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarSer_Sel", AV43TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSerDsc") == 0 )
         {
            AV44TFBarSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarSerDsc", AV44TFBarSerDsc);
            AV45TFBarSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFBarSerDsc_Sel", AV45TFBarSerDsc_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e2418A2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGrupodeacciones.removeAllItems();
      cmbavGrupodeacciones.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGrupodeacciones.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      cmbavGrupodeacciones.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Modificar", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      AV16RpExHdCns = A2716RpExHdCns ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRpexhdcns_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16RpExHdCns), 4, 0));
      GXt_int8 = AV80Pzs ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int9[0] = A2714RpExHdAlb ;
      GXv_int10[0] = A129BarCod ;
      GXv_int11[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      GXv_int12[0] = A2248ManCod ;
      GXv_int13[0] = A6262RpExSalLn ;
      GXv_int14[0] = AV93FlagLin ;
      GXv_int15[0] = GXt_int8 ;
      new app.piezaspendientesexhdpz(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int10, GXv_int11, GXv_char3, GXv_int12, GXv_int13, GXv_int14, GXv_int15) ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.A396EmprCod = GXv_char4[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.A2714RpExHdAlb = GXv_int9[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.A129BarCod = GXv_int10[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.A132BarCodReo = GXv_int11[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.A130BarCodPar = GXv_char3[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.A2248ManCod = GXv_int12[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.A6262RpExSalLn = GXv_int13[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.AV93FlagLin = GXv_int14[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.GXt_int8 = GXv_int15[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MANCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9")));
      AV80Pzs = (short)(GXt_int8) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPzs_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80Pzs), 4, 0));
      AV17RpExHdKgs = A2715RpExHdKgs ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRpexhdkgs_Internalname, GXutil.ltrimstr( AV17RpExHdKgs, 9, 2));
      GXt_decimal16 = AV81Kgs ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int15[0] = A2714RpExHdAlb ;
      GXv_int10[0] = A129BarCod ;
      GXv_int14[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      GXv_int13[0] = A2248ManCod ;
      GXv_int12[0] = A6262RpExSalLn ;
      GXv_int11[0] = AV93FlagLin ;
      GXv_decimal17[0] = GXt_decimal16 ;
      new app.kilospendientesexhdpz(remoteHandle, context).execute( GXv_char4, GXv_int15, GXv_int10, GXv_int14, GXv_char3, GXv_int13, GXv_int12, GXv_int11, GXv_decimal17) ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.A396EmprCod = GXv_char4[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.A2714RpExHdAlb = GXv_int15[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.A129BarCod = GXv_int10[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.A132BarCodReo = GXv_int14[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.A130BarCodPar = GXv_char3[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.A2248ManCod = GXv_int13[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.A6262RpExSalLn = GXv_int12[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.AV93FlagLin = GXv_int11[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.GXt_decimal16 = GXv_decimal17[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MANCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9")));
      AV81Kgs = GXt_decimal16 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavKgs_Internalname, GXutil.ltrimstr( AV81Kgs, 9, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vKGS"+"_"+sGXsfl_51_idx, getSecureSignedToken( sPrefix+sGXsfl_51_idx, localUtil.format( AV81Kgs, "ZZZZZ9.99")));
      AV18RpExHdMts = A2847RpExHdMts ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRpexhdmts_Internalname, GXutil.ltrimstr( AV18RpExHdMts, 9, 2));
      GXt_decimal16 = AV82Mts ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int15[0] = A2714RpExHdAlb ;
      GXv_int10[0] = A129BarCod ;
      GXv_int14[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      GXv_int13[0] = A2248ManCod ;
      GXv_int12[0] = A6262RpExSalLn ;
      GXv_int11[0] = AV93FlagLin ;
      GXv_decimal17[0] = GXt_decimal16 ;
      new app.metrospendientesexhdpz(remoteHandle, context).execute( GXv_char4, GXv_int15, GXv_int10, GXv_int14, GXv_char3, GXv_int13, GXv_int12, GXv_int11, GXv_decimal17) ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.A396EmprCod = GXv_char4[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.A2714RpExHdAlb = GXv_int15[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.A129BarCod = GXv_int10[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.A132BarCodReo = GXv_int14[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.A130BarCodPar = GXv_char3[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.A2248ManCod = GXv_int13[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.A6262RpExSalLn = GXv_int12[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.AV93FlagLin = GXv_int11[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.GXt_decimal16 = GXv_decimal17[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MANCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9")));
      AV82Mts = GXt_decimal16 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMts_Internalname, GXutil.ltrimstr( AV82Mts, 9, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMTS"+"_"+sGXsfl_51_idx, getSecureSignedToken( sPrefix+sGXsfl_51_idx, localUtil.format( AV82Mts, "ZZZZZ9.99")));
      AV19RpExHdTip = A2717RpExHdTip ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavRpexhdtip.getInternalname(), AV19RpExHdTip);
      AV92Flag = ((GXutil.strcmp(AV19RpExHdTip, "T")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavFlag.getInternalname(), AV92Flag);
      AV83oldRpExHdCns = A2716RpExHdCns ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOldrpexhdcns_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83oldRpExHdCns), 4, 0));
      AV84oldRpExHdKgs = A2715RpExHdKgs ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOldrpexhdkgs_Internalname, GXutil.ltrimstr( AV84oldRpExHdKgs, 9, 2));
      AV85OldRpExHdMts = A2847RpExHdMts ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOldrpexhdmts_Internalname, GXutil.ltrimstr( AV85OldRpExHdMts, 9, 2));
      edtavInformacionwithtags_Horizontalalignment = "Right" ;
      AV95InformacionWithTags = GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV94Informacion), "Z")) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavInformacionwithtags_Internalname, AV95InformacionWithTags);
      AV95InformacionWithTags += "<i class='WWPPopoverIcon TagAfterText fa fa-caret-down'></i>" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavInformacionwithtags_Internalname, AV95InformacionWithTags);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(51) ;
      }
      sendrow_512( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_51_Refreshing )
      {
         httpContext.doAjaxLoad(51, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV79GrupodeAcciones, 4, 0)) );
      cmbavRpexhdtip.setValue( GXutil.rtrim( AV19RpExHdTip) );
      cmbavFlag.setValue( GXutil.rtrim( AV92Flag) );
   }

   public void e1618A2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV22ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV24ColumnsSelector.fromJSonString(AV22ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WCTrabajosExternosRecepcionMantenimientoColumnsSelector", ((GXutil.strcmp("", AV22ColumnsSelectorXML)==0) ? "" : AV24ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e1218A2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WCTrabajosExternosRecepcionMantenimientoFilters")),GXutil.URLEncode(GXutil.rtrim(AV115Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV29ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WCTrabajosExternosRecepcionMantenimientoFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV29ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV28ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WCTrabajosExternosRecepcionMantenimientoFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         wctrabajosexternosrecepcionmantenimiento_impl.this.GXt_char1 = GXv_char4[0] ;
         AV28ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV28ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV115Pgmname+"GridState", AV28ManageFiltersXml) ;
            AV10GridState.fromxml(AV28ManageFiltersXml, null, null);
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV27ManageFiltersData", AV27ManageFiltersData);
   }

   public void e1718A2( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S212 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e1818A2( )
   {
      /* Dvelop_confirmpanel_modificarlinea_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_modificarlinea_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION MODIFICARLINEA' */
         S222 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      cmbavRpexhdtip.setValue( GXutil.rtrim( AV19RpExHdTip) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavRpexhdtip.getInternalname(), "Values", cmbavRpexhdtip.ToJavascriptSource(), true);
      cmbavFlag.setValue( GXutil.rtrim( AV92Flag) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavFlag.getInternalname(), "Values", cmbavFlag.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e1918A2( )
   {
      /* Dvelop_confirmpanel_eliminarentrada_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminarentrada_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARENTRADA' */
         S232 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e2018A2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV20ExcelFilename ;
      GXv_char3[0] = AV21ErrorMessage ;
      new app.wctrabajosexternosrecepcionmantenimientoexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.AV20ExcelFilename = GXv_char4[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.AV21ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV20ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV20ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV21ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e2118A2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.wctrabajosexternosrecepcionmantenimientoexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
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
      AV24ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "RpExHdLi", "", "#", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "RpExHdFe", "", "Fecha Recepcion", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "RpExHdAlb", "", "Nº Documento", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "CliCod", "", "Cliente", false, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "CliNom", "", "Nombre Cliente", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "BarSer", "", "Serie", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&RpExHdCns", "Recepcion", "Piezas", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&Pzs", "", "", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&RpExHdKgs", "Recepcion", "Kgs", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&Kgs", "", "", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&RpExHdMts", "Recepcion", "Metros", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&Mts", "", "", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&RpExHdTip", "", "Tipo Entrega", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&Flag", "", "Cerrar Fase?", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&Informacion", "", "Inf Fase", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXt_char1 = AV23UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCTrabajosExternosRecepcionMantenimientoColumnsSelector", GXv_char4) ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.GXt_char1 = GXv_char4[0] ;
      AV23UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV23UserCustomValue)==0) ) )
      {
         AV25ColumnsSelectorAux.fromxml(AV23UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector18[0] = AV25ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector19[0] = AV24ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, GXv_SdtWWPColumnsSelector19) ;
         AV25ColumnsSelectorAux = GXv_SdtWWPColumnsSelector18[0] ;
         AV24ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item20 = AV27ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item21[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item20 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WCTrabajosExternosRecepcionMantenimientoFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item21) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item20 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item21[0] ;
      AV27ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item20 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
      AV36TFRpExHdLi = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFRpExHdLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFRpExHdLi), 4, 0));
      AV37TFRpExHdLi_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFRpExHdLi_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFRpExHdLi_To), 4, 0));
      AV32TFRpExHdFe = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFRpExHdFe", localUtil.format(AV32TFRpExHdFe, "99/99/99"));
      AV30TFRpExHdAlb = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFRpExHdAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFRpExHdAlb), 8, 0));
      AV31TFRpExHdAlb_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFRpExHdAlb_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFRpExHdAlb_To), 8, 0));
      AV38TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFCliCod), 6, 0));
      AV39TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFCliCod_To), 6, 0));
      AV40TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFCliNom", AV40TFCliNom);
      AV41TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFCliNom_Sel", AV41TFCliNom_Sel);
      AV42TFBarSer = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFBarSer", AV42TFBarSer);
      AV43TFBarSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarSer_Sel", AV43TFBarSer_Sel);
      AV44TFBarSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarSerDsc", AV44TFBarSerDsc);
      AV45TFBarSerDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFBarSerDsc_Sel", AV45TFBarSerDsc_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S192( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.getMessage( "Deseas elimina la linea ", "")+GXutil.trim( GXutil.str( A2713RpExHdLi, 4, 0))+"?" ;
      ucDvelop_confirmpanel_eliminar.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_eliminar_Internalname, "ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
      AV116Emprcod_selected = A396EmprCod ;
      AV117Mancod_selected = A2248ManCod ;
      AV118Rpexhdfe_selected = A2711RpExHdFe ;
      AV119Rpexhdli_selected = A2713RpExHdLi ;
      this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
   }

   public void S212( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV54EmprCod ;
      GXv_int13[0] = AV53Mancod ;
      GXv_date22[0] = A2711RpExHdFe ;
      GXv_int12[0] = A2713RpExHdLi ;
      new app.pwork07(remoteHandle, context).execute( GXv_char4, GXv_int13, GXv_date22, GXv_int12) ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.AV54EmprCod = GXv_char4[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.AV53Mancod = GXv_int13[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.A2711RpExHdFe = GXv_date22[0] ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.A2713RpExHdLi = GXv_int12[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54EmprCod", AV54EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Mancod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Mancod), 4, 0));
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S202( )
   {
      /* 'DO MODIFICARLINEA' Routine */
      returnInSub = false ;
      Dvelop_confirmpanel_modificarlinea_Confirmationtext = httpContext.getMessage( "Desea modificar la linea ", "")+GXutil.trim( GXutil.str( A2713RpExHdLi, 4, 0))+"?" ;
      ucDvelop_confirmpanel_modificarlinea.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_modificarlinea_Internalname, "ConfirmationText", Dvelop_confirmpanel_modificarlinea_Confirmationtext);
      AV116Emprcod_selected = A396EmprCod ;
      AV117Mancod_selected = A2248ManCod ;
      AV118Rpexhdfe_selected = A2711RpExHdFe ;
      AV119Rpexhdli_selected = A2713RpExHdLi ;
      this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_MODIFICARLINEAContainer", "Confirm", "", new Object[] {});
   }

   public void S222( )
   {
      /* 'DO ACTION MODIFICARLINEA' Routine */
      returnInSub = false ;
      AV88kgsd = AV81Kgs.add(AV84oldRpExHdKgs) ;
      AV89mtsd = AV82Mts.add(AV85OldRpExHdMts) ;
      if ( ( DecimalUtil.compareTo(AV17RpExHdKgs, (AV88kgsd)) > 0 ) && ( GXutil.strcmp(A228BarUniMed, "K") == 0 ) )
      {
         Gx_msg = httpContext.getMessage( "Kgs =", "") + GXutil.trim( GXutil.str( AV17RpExHdKgs, 9, 2)) + httpContext.getMessage( " > a Kgs Disponibles= ", "") + GXutil.trim( GXutil.str( AV88kgsd, 9, 2)) ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      else
      {
         if ( ( DecimalUtil.compareTo(AV18RpExHdMts, (AV89mtsd)) > 0 ) && ( GXutil.strcmp(A228BarUniMed, "M") == 0 ) )
         {
            Gx_msg = httpContext.getMessage( "Mts =", "") + GXutil.trim( GXutil.str( AV18RpExHdMts, 9, 2)) + httpContext.getMessage( " > a Mts Disponibles= ", "") + GXutil.trim( GXutil.str( AV89mtsd, 9, 2)) ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            GXv_char4[0] = AV54EmprCod ;
            GXv_int13[0] = AV53Mancod ;
            GXv_date22[0] = A2711RpExHdFe ;
            GXv_int12[0] = A2713RpExHdLi ;
            GXv_int23[0] = AV83oldRpExHdCns ;
            GXv_decimal17[0] = AV84oldRpExHdKgs ;
            GXv_decimal24[0] = AV85OldRpExHdMts ;
            GXv_int25[0] = AV16RpExHdCns ;
            GXv_decimal26[0] = AV17RpExHdKgs ;
            GXv_decimal27[0] = AV18RpExHdMts ;
            GXv_char3[0] = AV19RpExHdTip ;
            new app.pwork06(remoteHandle, context).execute( GXv_char4, GXv_int13, GXv_date22, GXv_int12, GXv_int23, GXv_decimal17, GXv_decimal24, GXv_int25, GXv_decimal26, GXv_decimal27, GXv_char3) ;
            wctrabajosexternosrecepcionmantenimiento_impl.this.AV54EmprCod = GXv_char4[0] ;
            wctrabajosexternosrecepcionmantenimiento_impl.this.AV53Mancod = GXv_int13[0] ;
            wctrabajosexternosrecepcionmantenimiento_impl.this.A2711RpExHdFe = GXv_date22[0] ;
            wctrabajosexternosrecepcionmantenimiento_impl.this.A2713RpExHdLi = GXv_int12[0] ;
            wctrabajosexternosrecepcionmantenimiento_impl.this.AV83oldRpExHdCns = GXv_int23[0] ;
            wctrabajosexternosrecepcionmantenimiento_impl.this.AV84oldRpExHdKgs = GXv_decimal17[0] ;
            wctrabajosexternosrecepcionmantenimiento_impl.this.AV85OldRpExHdMts = GXv_decimal24[0] ;
            wctrabajosexternosrecepcionmantenimiento_impl.this.AV16RpExHdCns = GXv_int25[0] ;
            wctrabajosexternosrecepcionmantenimiento_impl.this.AV17RpExHdKgs = GXv_decimal26[0] ;
            wctrabajosexternosrecepcionmantenimiento_impl.this.AV18RpExHdMts = GXv_decimal27[0] ;
            wctrabajosexternosrecepcionmantenimiento_impl.this.AV19RpExHdTip = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54EmprCod", AV54EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Mancod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Mancod), 4, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOldrpexhdcns_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83oldRpExHdCns), 4, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOldrpexhdkgs_Internalname, GXutil.ltrimstr( AV84oldRpExHdKgs, 9, 2));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOldrpexhdmts_Internalname, GXutil.ltrimstr( AV85OldRpExHdMts, 9, 2));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRpexhdcns_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16RpExHdCns), 4, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRpexhdkgs_Internalname, GXutil.ltrimstr( AV17RpExHdKgs, 9, 2));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRpexhdmts_Internalname, GXutil.ltrimstr( AV18RpExHdMts, 9, 2));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavRpexhdtip.getInternalname(), AV19RpExHdTip);
            GXv_char4[0] = AV54EmprCod ;
            GXv_int25[0] = AV53Mancod ;
            GXv_char3[0] = httpContext.getMessage( "R", "") ;
            GXv_int15[0] = A2714RpExHdAlb ;
            GXv_int23[0] = A2713RpExHdLi ;
            GXv_decimal27[0] = AV84oldRpExHdKgs ;
            GXv_decimal26[0] = AV85OldRpExHdMts ;
            GXv_int13[0] = AV83oldRpExHdCns ;
            GXv_decimal24[0] = AV17RpExHdKgs ;
            GXv_decimal17[0] = AV18RpExHdMts ;
            GXv_int12[0] = AV16RpExHdCns ;
            GXv_date22[0] = A2711RpExHdFe ;
            GXv_int10[0] = A129BarCod ;
            GXv_int14[0] = A132BarCodReo ;
            GXv_char2[0] = A130BarCodPar ;
            GXv_char28[0] = A2717RpExHdTip ;
            GXv_char29[0] = "N" ;
            GXv_int30[0] = A6262RpExSalLn ;
            new app.pmmvrhd1(remoteHandle, context).execute( GXv_char4, GXv_int25, GXv_char3, GXv_int15, GXv_int23, GXv_decimal27, GXv_decimal26, GXv_int13, GXv_decimal24, GXv_decimal17, GXv_int12, GXv_date22, GXv_int10, GXv_int14, GXv_char2, GXv_char28, GXv_char29, GXv_int30) ;
            wctrabajosexternosrecepcionmantenimiento_impl.this.AV54EmprCod = GXv_char4[0] ;
            wctrabajosexternosrecepcionmantenimiento_impl.this.AV53Mancod = GXv_int25[0] ;
            wctrabajosexternosrecepcionmantenimiento_impl.this.A2714RpExHdAlb = GXv_int15[0] ;
            wctrabajosexternosrecepcionmantenimiento_impl.this.A2713RpExHdLi = GXv_int23[0] ;
            wctrabajosexternosrecepcionmantenimiento_impl.this.AV84oldRpExHdKgs = GXv_decimal27[0] ;
            wctrabajosexternosrecepcionmantenimiento_impl.this.AV85OldRpExHdMts = GXv_decimal26[0] ;
            wctrabajosexternosrecepcionmantenimiento_impl.this.AV83oldRpExHdCns = GXv_int13[0] ;
            wctrabajosexternosrecepcionmantenimiento_impl.this.AV17RpExHdKgs = GXv_decimal24[0] ;
            wctrabajosexternosrecepcionmantenimiento_impl.this.AV18RpExHdMts = GXv_decimal17[0] ;
            wctrabajosexternosrecepcionmantenimiento_impl.this.AV16RpExHdCns = GXv_int12[0] ;
            wctrabajosexternosrecepcionmantenimiento_impl.this.A2711RpExHdFe = GXv_date22[0] ;
            wctrabajosexternosrecepcionmantenimiento_impl.this.A129BarCod = GXv_int10[0] ;
            wctrabajosexternosrecepcionmantenimiento_impl.this.A132BarCodReo = GXv_int14[0] ;
            wctrabajosexternosrecepcionmantenimiento_impl.this.A130BarCodPar = GXv_char2[0] ;
            wctrabajosexternosrecepcionmantenimiento_impl.this.A2717RpExHdTip = GXv_char28[0] ;
            wctrabajosexternosrecepcionmantenimiento_impl.this.A6262RpExSalLn = GXv_int30[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54EmprCod", AV54EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Mancod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Mancod), 4, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOldrpexhdkgs_Internalname, GXutil.ltrimstr( AV84oldRpExHdKgs, 9, 2));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOldrpexhdmts_Internalname, GXutil.ltrimstr( AV85OldRpExHdMts, 9, 2));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOldrpexhdcns_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83oldRpExHdCns), 4, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRpexhdkgs_Internalname, GXutil.ltrimstr( AV17RpExHdKgs, 9, 2));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRpexhdmts_Internalname, GXutil.ltrimstr( AV18RpExHdMts, 9, 2));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRpexhdcns_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16RpExHdCns), 4, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2717RpExHdTip", A2717RpExHdTip);
            if ( GXutil.strcmp(AV19RpExHdTip, "T") == 0 )
            {
               GXv_char29[0] = AV54EmprCod ;
               GXv_int15[0] = A129BarCod ;
               GXv_int14[0] = A132BarCodReo ;
               GXv_char28[0] = A130BarCodPar ;
               GXv_date22[0] = A2711RpExHdFe ;
               GXv_int11[0] = (byte)(2) ;
               GXv_int10[0] = A2714RpExHdAlb ;
               GXv_int30[0] = A6262RpExSalLn ;
               GXv_char4[0] = AV92Flag ;
               new app.pbarext(remoteHandle, context).execute( GXv_char29, GXv_int15, GXv_int14, GXv_char28, GXv_date22, GXv_int11, GXv_int10, GXv_int30, GXv_char4) ;
               wctrabajosexternosrecepcionmantenimiento_impl.this.AV54EmprCod = GXv_char29[0] ;
               wctrabajosexternosrecepcionmantenimiento_impl.this.A129BarCod = GXv_int15[0] ;
               wctrabajosexternosrecepcionmantenimiento_impl.this.A132BarCodReo = GXv_int14[0] ;
               wctrabajosexternosrecepcionmantenimiento_impl.this.A130BarCodPar = GXv_char28[0] ;
               wctrabajosexternosrecepcionmantenimiento_impl.this.A2711RpExHdFe = GXv_date22[0] ;
               wctrabajosexternosrecepcionmantenimiento_impl.this.A2714RpExHdAlb = GXv_int10[0] ;
               wctrabajosexternosrecepcionmantenimiento_impl.this.A6262RpExSalLn = GXv_int30[0] ;
               wctrabajosexternosrecepcionmantenimiento_impl.this.AV92Flag = GXv_char4[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54EmprCod", AV54EmprCod);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavFlag.getInternalname(), AV92Flag);
            }
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
   }

   public void S232( )
   {
      /* 'DO ACTION ELIMINARENTRADA' Routine */
      returnInSub = false ;
      new app.pwork08(remoteHandle, context).execute( AV54EmprCod, AV53Mancod, AV52RpExHdFe) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV26Session.getValue(AV115Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV115Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV26Session.getValue(AV115Pgmname+"GridState"), null, null);
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
      AV121GXV1 = 1 ;
      while ( AV121GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV121GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRPEXHDLI") == 0 )
         {
            AV36TFRpExHdLi = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFRpExHdLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFRpExHdLi), 4, 0));
            AV37TFRpExHdLi_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFRpExHdLi_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFRpExHdLi_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRPEXHDFE") == 0 )
         {
            AV32TFRpExHdFe = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFRpExHdFe", localUtil.format(AV32TFRpExHdFe, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRPEXHDALB") == 0 )
         {
            AV30TFRpExHdAlb = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFRpExHdAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFRpExHdAlb), 8, 0));
            AV31TFRpExHdAlb_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFRpExHdAlb_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFRpExHdAlb_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV38TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFCliCod), 6, 0));
            AV39TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV40TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFCliNom", AV40TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV41TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFCliNom_Sel", AV41TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV42TFBarSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFBarSer", AV42TFBarSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV43TFBarSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarSer_Sel", AV43TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV44TFBarSerDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarSerDsc", AV44TFBarSerDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV45TFBarSerDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFBarSerDsc_Sel", AV45TFBarSerDsc_Sel);
         }
         AV121GXV1 = (int)(AV121GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char29[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFCliNom_Sel)==0), AV41TFCliNom_Sel, GXv_char29) ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.GXt_char1 = GXv_char29[0] ;
      GXt_char31 = "" ;
      GXv_char28[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFBarSer_Sel)==0), AV43TFBarSer_Sel, GXv_char28) ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.GXt_char31 = GXv_char28[0] ;
      GXt_char32 = "" ;
      GXv_char4[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFBarSerDsc_Sel)==0), AV45TFBarSerDsc_Sel, GXv_char4) ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.GXt_char32 = GXv_char4[0] ;
      Ddo_grid_Selectedvalue_set = "||||"+GXt_char1+"|"+GXt_char31+"|"+GXt_char32+"|||||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char32 = "" ;
      GXv_char29[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFCliNom)==0), AV40TFCliNom, GXv_char29) ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.GXt_char32 = GXv_char29[0] ;
      GXt_char31 = "" ;
      GXv_char28[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFBarSer)==0), AV42TFBarSer, GXv_char28) ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.GXt_char31 = GXv_char28[0] ;
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFBarSerDsc)==0), AV44TFBarSerDsc, GXv_char4) ;
      wctrabajosexternosrecepcionmantenimiento_impl.this.GXt_char1 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV36TFRpExHdLi) ? "" : GXutil.str( AV36TFRpExHdLi, 4, 0))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV32TFRpExHdFe)) ? "" : localUtil.dtoc( AV32TFRpExHdFe, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV30TFRpExHdAlb) ? "" : GXutil.str( AV30TFRpExHdAlb, 8, 0))+"|"+((0==AV38TFCliCod) ? "" : GXutil.str( AV38TFCliCod, 6, 0))+"|"+GXt_char32+"|"+GXt_char31+"|"+GXt_char1+"|||||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV37TFRpExHdLi_To) ? "" : GXutil.str( AV37TFRpExHdLi_To, 4, 0))+"||"+((0==AV31TFRpExHdAlb_To) ? "" : GXutil.str( AV31TFRpExHdAlb_To, 8, 0))+"|"+((0==AV39TFCliCod_To) ? "" : GXutil.str( AV39TFCliCod_To, 6, 0))+"||||||||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV26Session.getValue(AV115Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFRPEXHDLI", "", !((0==AV36TFRpExHdLi)&&(0==AV37TFRpExHdLi_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFRpExHdLi, 4, 0)), GXutil.trim( GXutil.str( AV37TFRpExHdLi_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFRPEXHDFE", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV32TFRpExHdFe)), (short)(0), GXutil.trim( localUtil.dtoc( AV32TFRpExHdFe, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFRPEXHDALB", "", !((0==AV30TFRpExHdAlb)&&(0==AV31TFRpExHdAlb_To)), (short)(0), GXutil.trim( GXutil.str( AV30TFRpExHdAlb, 8, 0)), GXutil.trim( GXutil.str( AV31TFRpExHdAlb_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFCLICOD", "", !((0==AV38TFCliCod)&&(0==AV39TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV38TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV39TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFCLINOM", "", !(GXutil.strcmp("", AV40TFCliNom)==0), (short)(0), AV40TFCliNom, "", !(GXutil.strcmp("", AV41TFCliNom_Sel)==0), AV41TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFBARSER", "", !(GXutil.strcmp("", AV42TFBarSer)==0), (short)(0), AV42TFBarSer, "", !(GXutil.strcmp("", AV43TFBarSer_Sel)==0), AV43TFBarSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFBARSERDSC", "", !(GXutil.strcmp("", AV44TFBarSerDsc)==0), (short)(0), AV44TFBarSerDsc, "", !(GXutil.strcmp("", AV45TFBarSerDsc_Sel)==0), AV45TFBarSerDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV115Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV115Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "LREXHD" );
      AV26Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table4_97_18A2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminarentrada_Internalname, tblTabledvelop_confirmpanel_eliminarentrada_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminarentrada.setProperty("Title", Dvelop_confirmpanel_eliminarentrada_Title);
         ucDvelop_confirmpanel_eliminarentrada.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminarentrada_Confirmationtext);
         ucDvelop_confirmpanel_eliminarentrada.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminarentrada_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminarentrada.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminarentrada_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminarentrada.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminarentrada_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminarentrada.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminarentrada_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminarentrada.setProperty("ConfirmType", Dvelop_confirmpanel_eliminarentrada_Confirmtype);
         ucDvelop_confirmpanel_eliminarentrada.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminarentrada_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARENTRADAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARENTRADAContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_97_18A2e( true) ;
      }
      else
      {
         wb_table4_97_18A2e( false) ;
      }
   }

   public void wb_table3_92_18A2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_modificarlinea_Internalname, tblTabledvelop_confirmpanel_modificarlinea_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_modificarlinea.setProperty("Title", Dvelop_confirmpanel_modificarlinea_Title);
         ucDvelop_confirmpanel_modificarlinea.setProperty("ConfirmationText", Dvelop_confirmpanel_modificarlinea_Confirmationtext);
         ucDvelop_confirmpanel_modificarlinea.setProperty("YesButtonCaption", Dvelop_confirmpanel_modificarlinea_Yesbuttoncaption);
         ucDvelop_confirmpanel_modificarlinea.setProperty("NoButtonCaption", Dvelop_confirmpanel_modificarlinea_Nobuttoncaption);
         ucDvelop_confirmpanel_modificarlinea.setProperty("CancelButtonCaption", Dvelop_confirmpanel_modificarlinea_Cancelbuttoncaption);
         ucDvelop_confirmpanel_modificarlinea.setProperty("YesButtonPosition", Dvelop_confirmpanel_modificarlinea_Yesbuttonposition);
         ucDvelop_confirmpanel_modificarlinea.setProperty("ConfirmType", Dvelop_confirmpanel_modificarlinea_Confirmtype);
         ucDvelop_confirmpanel_modificarlinea.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_modificarlinea_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_MODIFICARLINEAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_MODIFICARLINEAContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_92_18A2e( true) ;
      }
      else
      {
         wb_table3_92_18A2e( false) ;
      }
   }

   public void wb_table2_87_18A2( boolean wbgen )
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
         wb_table2_87_18A2e( true) ;
      }
      else
      {
         wb_table2_87_18A2e( false) ;
      }
   }

   public void wb_table1_23_18A2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV27ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_28_18A2( true) ;
      }
      else
      {
         wb_table5_28_18A2( false) ;
      }
      return  ;
   }

   public void wb_table5_28_18A2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_18A2e( true) ;
      }
      else
      {
         wb_table1_23_18A2e( false) ;
      }
   }

   public void wb_table5_28_18A2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'" + sGXsfl_51_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WCTrabajosExternosRecepcionMantenimiento.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_28_18A2e( true) ;
      }
      else
      {
         wb_table5_28_18A2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV54EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54EmprCod", AV54EmprCod);
      AV53Mancod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Mancod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Mancod), 4, 0));
      AV52RpExHdFe = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52RpExHdFe", localUtil.format(AV52RpExHdFe, "99/99/99"));
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
      pa18A2( ) ;
      ws18A2( ) ;
      we18A2( ) ;
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
      sCtrlAV54EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV53Mancod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV52RpExHdFe = (String)getParm(obj,2,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa18A2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wctrabajosexternosrecepcionmantenimiento", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa18A2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV54EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54EmprCod", AV54EmprCod);
         AV53Mancod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Mancod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Mancod), 4, 0));
         AV52RpExHdFe = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52RpExHdFe", localUtil.format(AV52RpExHdFe, "99/99/99"));
      }
      wcpOAV54EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV54EmprCod") ;
      wcpOAV53Mancod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV53Mancod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV52RpExHdFe = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV52RpExHdFe"), 0) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV54EmprCod, wcpOAV54EmprCod) != 0 ) || ( AV53Mancod != wcpOAV53Mancod ) || !( GXutil.dateCompare(GXutil.resetTime(AV52RpExHdFe), GXutil.resetTime(wcpOAV52RpExHdFe)) ) ) )
      {
         setjustcreated();
      }
      wcpOAV54EmprCod = AV54EmprCod ;
      wcpOAV53Mancod = AV53Mancod ;
      wcpOAV52RpExHdFe = AV52RpExHdFe ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV54EmprCod = httpContext.cgiGet( sPrefix+"AV54EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV54EmprCod) > 0 )
      {
         AV54EmprCod = httpContext.cgiGet( sCtrlAV54EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54EmprCod", AV54EmprCod);
      }
      else
      {
         AV54EmprCod = httpContext.cgiGet( sPrefix+"AV54EmprCod_PARM") ;
      }
      sCtrlAV53Mancod = httpContext.cgiGet( sPrefix+"AV53Mancod_CTRL") ;
      if ( GXutil.len( sCtrlAV53Mancod) > 0 )
      {
         AV53Mancod = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV53Mancod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Mancod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Mancod), 4, 0));
      }
      else
      {
         AV53Mancod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV53Mancod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV52RpExHdFe = httpContext.cgiGet( sPrefix+"AV52RpExHdFe_CTRL") ;
      if ( GXutil.len( sCtrlAV52RpExHdFe) > 0 )
      {
         AV52RpExHdFe = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV52RpExHdFe), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52RpExHdFe", localUtil.format(AV52RpExHdFe, "99/99/99"));
      }
      else
      {
         AV52RpExHdFe = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV52RpExHdFe_PARM"), 0) ;
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
      pa18A2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws18A2( ) ;
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
      ws18A2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54EmprCod_PARM", GXutil.rtrim( AV54EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV54EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54EmprCod_CTRL", GXutil.rtrim( sCtrlAV54EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV53Mancod_PARM", GXutil.ltrim( localUtil.ntoc( AV53Mancod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV53Mancod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV53Mancod_CTRL", GXutil.rtrim( sCtrlAV53Mancod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV52RpExHdFe_PARM", localUtil.dtoc( AV52RpExHdFe, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV52RpExHdFe)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV52RpExHdFe_CTRL", GXutil.rtrim( sCtrlAV52RpExHdFe));
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
      we18A2( ) ;
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
      if ( ! ( WebComp_Wwpaux_wc == null ) )
      {
         WebComp_Wwpaux_wc.componentjscripts();
      }
   }

   public void componentthemes( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wwpaux_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
         {
            WebComp_Wwpaux_wc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115563279", true, true);
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
      httpContext.AddJavascriptSource("wctrabajosexternosrecepcionmantenimiento.js", "?202682115563279", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_512( )
   {
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES_"+sGXsfl_51_idx );
      edtRpExHdLi_Internalname = sPrefix+"RPEXHDLI_"+sGXsfl_51_idx ;
      edtRpExHdFe_Internalname = sPrefix+"RPEXHDFE_"+sGXsfl_51_idx ;
      edtRpExHdAlb_Internalname = sPrefix+"RPEXHDALB_"+sGXsfl_51_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_51_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_51_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_51_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_51_idx ;
      edtavRpexhdcns_Internalname = sPrefix+"vRPEXHDCNS_"+sGXsfl_51_idx ;
      edtavPzs_Internalname = sPrefix+"vPZS_"+sGXsfl_51_idx ;
      edtavRpexhdkgs_Internalname = sPrefix+"vRPEXHDKGS_"+sGXsfl_51_idx ;
      edtavKgs_Internalname = sPrefix+"vKGS_"+sGXsfl_51_idx ;
      edtavRpexhdmts_Internalname = sPrefix+"vRPEXHDMTS_"+sGXsfl_51_idx ;
      edtavMts_Internalname = sPrefix+"vMTS_"+sGXsfl_51_idx ;
      cmbavRpexhdtip.setInternalname( sPrefix+"vRPEXHDTIP_"+sGXsfl_51_idx );
      cmbavFlag.setInternalname( sPrefix+"vFLAG_"+sGXsfl_51_idx );
      edtavInformacionwithtags_Internalname = sPrefix+"vINFORMACIONWITHTAGS_"+sGXsfl_51_idx ;
      edtavInformacion_Internalname = sPrefix+"vINFORMACION_"+sGXsfl_51_idx ;
      edtBarUniMed_Internalname = sPrefix+"BARUNIMED_"+sGXsfl_51_idx ;
      edtavOldrpexhdcns_Internalname = sPrefix+"vOLDRPEXHDCNS_"+sGXsfl_51_idx ;
      edtavOldrpexhdkgs_Internalname = sPrefix+"vOLDRPEXHDKGS_"+sGXsfl_51_idx ;
      edtavOldrpexhdmts_Internalname = sPrefix+"vOLDRPEXHDMTS_"+sGXsfl_51_idx ;
      edtRpExSalLn_Internalname = sPrefix+"RPEXSALLN_"+sGXsfl_51_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_51_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_51_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_51_idx ;
   }

   public void subsflControlProps_fel_512( )
   {
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES_"+sGXsfl_51_fel_idx );
      edtRpExHdLi_Internalname = sPrefix+"RPEXHDLI_"+sGXsfl_51_fel_idx ;
      edtRpExHdFe_Internalname = sPrefix+"RPEXHDFE_"+sGXsfl_51_fel_idx ;
      edtRpExHdAlb_Internalname = sPrefix+"RPEXHDALB_"+sGXsfl_51_fel_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_51_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_51_fel_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_51_fel_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_51_fel_idx ;
      edtavRpexhdcns_Internalname = sPrefix+"vRPEXHDCNS_"+sGXsfl_51_fel_idx ;
      edtavPzs_Internalname = sPrefix+"vPZS_"+sGXsfl_51_fel_idx ;
      edtavRpexhdkgs_Internalname = sPrefix+"vRPEXHDKGS_"+sGXsfl_51_fel_idx ;
      edtavKgs_Internalname = sPrefix+"vKGS_"+sGXsfl_51_fel_idx ;
      edtavRpexhdmts_Internalname = sPrefix+"vRPEXHDMTS_"+sGXsfl_51_fel_idx ;
      edtavMts_Internalname = sPrefix+"vMTS_"+sGXsfl_51_fel_idx ;
      cmbavRpexhdtip.setInternalname( sPrefix+"vRPEXHDTIP_"+sGXsfl_51_fel_idx );
      cmbavFlag.setInternalname( sPrefix+"vFLAG_"+sGXsfl_51_fel_idx );
      edtavInformacionwithtags_Internalname = sPrefix+"vINFORMACIONWITHTAGS_"+sGXsfl_51_fel_idx ;
      edtavInformacion_Internalname = sPrefix+"vINFORMACION_"+sGXsfl_51_fel_idx ;
      edtBarUniMed_Internalname = sPrefix+"BARUNIMED_"+sGXsfl_51_fel_idx ;
      edtavOldrpexhdcns_Internalname = sPrefix+"vOLDRPEXHDCNS_"+sGXsfl_51_fel_idx ;
      edtavOldrpexhdkgs_Internalname = sPrefix+"vOLDRPEXHDKGS_"+sGXsfl_51_fel_idx ;
      edtavOldrpexhdmts_Internalname = sPrefix+"vOLDRPEXHDMTS_"+sGXsfl_51_fel_idx ;
      edtRpExSalLn_Internalname = sPrefix+"RPEXSALLN_"+sGXsfl_51_fel_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_51_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_51_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_51_fel_idx ;
   }

   public void sendrow_512( )
   {
      subsflControlProps_512( ) ;
      wb18A0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_51_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_51_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_51_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 52,'"+sPrefix+"',false,'"+sGXsfl_51_idx+"',51)\"" : " ") ;
         if ( ( cmbavGrupodeacciones.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_51_idx ;
            cmbavGrupodeacciones.setName( GXCCtl );
            cmbavGrupodeacciones.setWebtags( "" );
            if ( cmbavGrupodeacciones.getItemCount() > 0 )
            {
               AV79GrupodeAcciones = (short)(GXutil.lval( cmbavGrupodeacciones.getValidValue(GXutil.trim( GXutil.str( AV79GrupodeAcciones, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79GrupodeAcciones), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGrupodeacciones,cmbavGrupodeacciones.getInternalname(),GXutil.trim( GXutil.str( AV79GrupodeAcciones, 4, 0)),Integer.valueOf(1),cmbavGrupodeacciones.getJsonclick(),Integer.valueOf(7),"'"+sPrefix+"'"+",false,"+"'"+"e2518a2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,52);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV79GrupodeAcciones, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGrupodeacciones.getInternalname(), "Values", cmbavGrupodeacciones.ToJavascriptSource(), !bGXsfl_51_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRpExHdLi_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRpExHdLi_Internalname,GXutil.ltrim( localUtil.ntoc( A2713RpExHdLi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2713RpExHdLi), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRpExHdLi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtRpExHdLi_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRpExHdFe_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRpExHdFe_Internalname,localUtil.format(A2711RpExHdFe, "99/99/99"),localUtil.format( A2711RpExHdFe, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRpExHdFe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtRpExHdFe_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRpExHdAlb_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRpExHdAlb_Internalname,GXutil.ltrim( localUtil.ntoc( A2714RpExHdAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2714RpExHdAlb), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRpExHdAlb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRpExHdAlb_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRpexhdcns_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavRpexhdcns_Enabled!=0)&&(edtavRpexhdcns_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 60,'"+sPrefix+"',false,'"+sGXsfl_51_idx+"',51)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRpexhdcns_Internalname,GXutil.ltrim( localUtil.ntoc( AV16RpExHdCns, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16RpExHdCns), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavRpexhdcns_Enabled!=0)&&(edtavRpexhdcns_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,60);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRpexhdcns_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRpexhdcns_Visible),Integer.valueOf(1),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPzs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPzs_Enabled!=0)&&(edtavPzs_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 61,'"+sPrefix+"',false,'"+sGXsfl_51_idx+"',51)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPzs_Internalname,GXutil.ltrim( localUtil.ntoc( AV80Pzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV80Pzs), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV80Pzs), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavPzs_Enabled!=0)&&(edtavPzs_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPzs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPzs_Visible),Integer.valueOf(edtavPzs_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRpexhdkgs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavRpexhdkgs_Enabled!=0)&&(edtavRpexhdkgs_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 62,'"+sPrefix+"',false,'"+sGXsfl_51_idx+"',51)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRpexhdkgs_Internalname,GXutil.ltrim( localUtil.ntoc( AV17RpExHdKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV17RpExHdKgs, "ZZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavRpexhdkgs_Enabled!=0)&&(edtavRpexhdkgs_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,62);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRpexhdkgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRpexhdkgs_Visible),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavKgs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavKgs_Enabled!=0)&&(edtavKgs_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 63,'"+sPrefix+"',false,'"+sGXsfl_51_idx+"',51)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavKgs_Internalname,GXutil.ltrim( localUtil.ntoc( AV81Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavKgs_Enabled!=0) ? localUtil.format( AV81Kgs, "ZZZZZ9.99") : localUtil.format( AV81Kgs, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavKgs_Enabled!=0)&&(edtavKgs_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,63);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavKgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavKgs_Visible),Integer.valueOf(edtavKgs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRpexhdmts_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavRpexhdmts_Enabled!=0)&&(edtavRpexhdmts_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 64,'"+sPrefix+"',false,'"+sGXsfl_51_idx+"',51)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRpexhdmts_Internalname,GXutil.ltrim( localUtil.ntoc( AV18RpExHdMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV18RpExHdMts, "ZZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavRpexhdmts_Enabled!=0)&&(edtavRpexhdmts_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,64);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRpexhdmts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRpexhdmts_Visible),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavMts_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMts_Enabled!=0)&&(edtavMts_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 65,'"+sPrefix+"',false,'"+sGXsfl_51_idx+"',51)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMts_Internalname,GXutil.ltrim( localUtil.ntoc( AV82Mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavMts_Enabled!=0) ? localUtil.format( AV82Mts, "ZZZZZ9.99") : localUtil.format( AV82Mts, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavMts_Enabled!=0)&&(edtavMts_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,65);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavMts_Visible),Integer.valueOf(edtavMts_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbavRpexhdtip.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         TempTags = " " + ((cmbavRpexhdtip.getEnabled()!=0)&&(cmbavRpexhdtip.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 66,'"+sPrefix+"',false,'"+sGXsfl_51_idx+"',51)\"" : " ") ;
         if ( ( cmbavRpexhdtip.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vRPEXHDTIP_" + sGXsfl_51_idx ;
            cmbavRpexhdtip.setName( GXCCtl );
            cmbavRpexhdtip.setWebtags( "" );
            cmbavRpexhdtip.addItem("P", httpContext.getMessage( "Parcial", ""), (short)(0));
            cmbavRpexhdtip.addItem("T", httpContext.getMessage( "Total", ""), (short)(0));
            if ( cmbavRpexhdtip.getItemCount() > 0 )
            {
               AV19RpExHdTip = cmbavRpexhdtip.getValidValue(AV19RpExHdTip) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavRpexhdtip.getInternalname(), AV19RpExHdTip);
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavRpexhdtip,cmbavRpexhdtip.getInternalname(),GXutil.rtrim( AV19RpExHdTip),Integer.valueOf(1),cmbavRpexhdtip.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbavRpexhdtip.getVisible()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavRpexhdtip.getEnabled()!=0)&&(cmbavRpexhdtip.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,66);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavRpexhdtip.setValue( GXutil.rtrim( AV19RpExHdTip) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavRpexhdtip.getInternalname(), "Values", cmbavRpexhdtip.ToJavascriptSource(), !bGXsfl_51_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbavFlag.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         TempTags = " " + ((cmbavFlag.getEnabled()!=0)&&(cmbavFlag.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 67,'"+sPrefix+"',false,'"+sGXsfl_51_idx+"',51)\"" : " ") ;
         if ( ( cmbavFlag.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vFLAG_" + sGXsfl_51_idx ;
            cmbavFlag.setName( GXCCtl );
            cmbavFlag.setWebtags( "" );
            cmbavFlag.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
            cmbavFlag.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
            if ( cmbavFlag.getItemCount() > 0 )
            {
               AV92Flag = cmbavFlag.getValidValue(AV92Flag) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavFlag.getInternalname(), AV92Flag);
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavFlag,cmbavFlag.getInternalname(),GXutil.rtrim( AV92Flag),Integer.valueOf(1),cmbavFlag.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbavFlag.getVisible()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavFlag.getEnabled()!=0)&&(cmbavFlag.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,67);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavFlag.setValue( GXutil.rtrim( AV92Flag) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavFlag.getInternalname(), "Values", cmbavFlag.ToJavascriptSource(), !bGXsfl_51_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+edtavInformacionwithtags_Horizontalalignment+"\""+" style=\""+((edtavInformacionwithtags_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavInformacionwithtags_Enabled!=0)&&(edtavInformacionwithtags_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 68,'"+sPrefix+"',false,'"+sGXsfl_51_idx+"',51)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformacionwithtags_Internalname,AV95InformacionWithTags,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavInformacionwithtags_Enabled!=0)&&(edtavInformacionwithtags_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,68);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformacionwithtags_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformacionwithtags_Visible),Integer.valueOf(edtavInformacionwithtags_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"",edtavInformacionwithtags_Horizontalalignment,Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavInformacion_Enabled!=0)&&(edtavInformacion_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 69,'"+sPrefix+"',false,'"+sGXsfl_51_idx+"',51)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformacion_Internalname,GXutil.ltrim( localUtil.ntoc( AV94Informacion, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavInformacion_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV94Informacion), "Z") : localUtil.format( DecimalUtil.doubleToDec(AV94Informacion), "Z")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavInformacion_Enabled!=0)&&(edtavInformacion_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+"e2618a2_client"+"'","","","","",edtavInformacion_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavInformacion_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarUniMed_Internalname,GXutil.rtrim( A228BarUniMed),GXutil.rtrim( localUtil.format( A228BarUniMed, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarUniMed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavOldrpexhdcns_Enabled!=0)&&(edtavOldrpexhdcns_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 71,'"+sPrefix+"',false,'"+sGXsfl_51_idx+"',51)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOldrpexhdcns_Internalname,GXutil.ltrim( localUtil.ntoc( AV83oldRpExHdCns, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavOldrpexhdcns_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV83oldRpExHdCns), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV83oldRpExHdCns), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavOldrpexhdcns_Enabled!=0)&&(edtavOldrpexhdcns_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavOldrpexhdcns_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavOldrpexhdcns_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavOldrpexhdkgs_Enabled!=0)&&(edtavOldrpexhdkgs_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 72,'"+sPrefix+"',false,'"+sGXsfl_51_idx+"',51)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOldrpexhdkgs_Internalname,GXutil.ltrim( localUtil.ntoc( AV84oldRpExHdKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavOldrpexhdkgs_Enabled!=0) ? localUtil.format( AV84oldRpExHdKgs, "ZZZZZ9.99") : localUtil.format( AV84oldRpExHdKgs, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavOldrpexhdkgs_Enabled!=0)&&(edtavOldrpexhdkgs_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,72);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavOldrpexhdkgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavOldrpexhdkgs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavOldrpexhdmts_Enabled!=0)&&(edtavOldrpexhdmts_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 73,'"+sPrefix+"',false,'"+sGXsfl_51_idx+"',51)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOldrpexhdmts_Internalname,GXutil.ltrim( localUtil.ntoc( AV85OldRpExHdMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavOldrpexhdmts_Enabled!=0) ? localUtil.format( AV85OldRpExHdMts, "ZZZZZ9.99") : localUtil.format( AV85OldRpExHdMts, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavOldrpexhdmts_Enabled!=0)&&(edtavOldrpexhdmts_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,73);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavOldrpexhdmts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavOldrpexhdmts_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRpExSalLn_Internalname,GXutil.ltrim( localUtil.ntoc( A6262RpExSalLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6262RpExSalLn), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRpExSalLn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes18A2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_51_idx = ((subGrid_Islastpage==1)&&(nGXsfl_51_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_51_idx+1) ;
         sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_512( ) ;
      }
      /* End function sendrow_512 */
   }

   public void startgridcontrol51( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"51\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRpExHdLi_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRpExHdFe_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Recepcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRpExHdAlb_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Documento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Serie", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción Serie", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRpexhdcns_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPzs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRpexhdkgs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavKgs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRpexhdmts_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavMts_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbavRpexhdtip.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Entrega", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbavFlag.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cerrar Fase?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+edtavInformacionwithtags_Horizontalalignment+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformacionwithtags_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inf Fase", "")) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV79GrupodeAcciones, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2713RpExHdLi, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRpExHdLi_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A2711RpExHdFe, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRpExHdFe_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2714RpExHdAlb, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRpExHdAlb_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1652BarSerDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSerDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV16RpExHdCns, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRpexhdcns_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV80Pzs, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPzs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPzs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV17RpExHdKgs, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRpexhdkgs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV81Kgs, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavKgs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavKgs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV18RpExHdMts, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRpexhdmts_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV82Mts, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMts_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavMts_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV19RpExHdTip));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbavRpexhdtip.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV92Flag));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbavFlag.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV95InformacionWithTags);
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformacionwithtags_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformacionwithtags_Visible, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtavInformacionwithtags_Horizontalalignment));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV94Informacion, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformacion_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A228BarUniMed));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV83oldRpExHdCns, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOldrpexhdcns_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV84oldRpExHdKgs, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOldrpexhdkgs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV85OldRpExHdMts, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOldrpexhdmts_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6262RpExSalLn, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
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
      bttBtneliminarentrada_Internalname = sPrefix+"BTNELIMINARENTRADA" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES" );
      edtRpExHdLi_Internalname = sPrefix+"RPEXHDLI" ;
      edtRpExHdFe_Internalname = sPrefix+"RPEXHDFE" ;
      edtRpExHdAlb_Internalname = sPrefix+"RPEXHDALB" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtBarSer_Internalname = sPrefix+"BARSER" ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC" ;
      edtavRpexhdcns_Internalname = sPrefix+"vRPEXHDCNS" ;
      edtavPzs_Internalname = sPrefix+"vPZS" ;
      edtavRpexhdkgs_Internalname = sPrefix+"vRPEXHDKGS" ;
      edtavKgs_Internalname = sPrefix+"vKGS" ;
      edtavRpexhdmts_Internalname = sPrefix+"vRPEXHDMTS" ;
      edtavMts_Internalname = sPrefix+"vMTS" ;
      cmbavRpexhdtip.setInternalname( sPrefix+"vRPEXHDTIP" );
      cmbavFlag.setInternalname( sPrefix+"vFLAG" );
      edtavInformacionwithtags_Internalname = sPrefix+"vINFORMACIONWITHTAGS" ;
      edtavInformacion_Internalname = sPrefix+"vINFORMACION" ;
      edtBarUniMed_Internalname = sPrefix+"BARUNIMED" ;
      edtavOldrpexhdcns_Internalname = sPrefix+"vOLDRPEXHDCNS" ;
      edtavOldrpexhdkgs_Internalname = sPrefix+"vOLDRPEXHDKGS" ;
      edtavOldrpexhdmts_Internalname = sPrefix+"vOLDRPEXHDMTS" ;
      edtRpExSalLn_Internalname = sPrefix+"RPEXSALLN" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Popover_informacion_Internalname = sPrefix+"POPOVER_INFORMACION" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_eliminar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Dvelop_confirmpanel_modificarlinea_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_MODIFICARLINEA" ;
      tblTabledvelop_confirmpanel_modificarlinea_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_MODIFICARLINEA" ;
      Dvelop_confirmpanel_eliminarentrada_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARENTRADA" ;
      tblTabledvelop_confirmpanel_eliminarentrada_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_ELIMINARENTRADA" ;
      Grid_titlescategories_Internalname = sPrefix+"GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      divDiv_wwpauxwc_Internalname = sPrefix+"DIV_WWPAUXWC" ;
      edtavDdo_rpexhdfeauxdate_Internalname = sPrefix+"vDDO_RPEXHDFEAUXDATE" ;
      divDdo_rpexhdfeauxdates_Internalname = sPrefix+"DDO_RPEXHDFEAUXDATES" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtRpExSalLn_Jsonclick = "" ;
      edtavOldrpexhdmts_Jsonclick = "" ;
      edtavOldrpexhdmts_Visible = 0 ;
      edtavOldrpexhdmts_Enabled = 1 ;
      edtavOldrpexhdkgs_Jsonclick = "" ;
      edtavOldrpexhdkgs_Visible = 0 ;
      edtavOldrpexhdkgs_Enabled = 1 ;
      edtavOldrpexhdcns_Jsonclick = "" ;
      edtavOldrpexhdcns_Visible = 0 ;
      edtavOldrpexhdcns_Enabled = 1 ;
      edtBarUniMed_Jsonclick = "" ;
      edtavInformacion_Jsonclick = "" ;
      edtavInformacion_Visible = 0 ;
      edtavInformacion_Enabled = 1 ;
      edtavInformacionwithtags_Jsonclick = "" ;
      edtavInformacionwithtags_Enabled = 1 ;
      edtavInformacionwithtags_Horizontalalignment = "left" ;
      cmbavFlag.setJsonclick( "" );
      cmbavFlag.setEnabled( 1 );
      cmbavRpexhdtip.setJsonclick( "" );
      cmbavRpexhdtip.setEnabled( 1 );
      edtavMts_Jsonclick = "" ;
      edtavMts_Enabled = 1 ;
      edtavRpexhdmts_Jsonclick = "" ;
      edtavRpexhdmts_Enabled = 1 ;
      edtavKgs_Jsonclick = "" ;
      edtavKgs_Enabled = 1 ;
      edtavRpexhdkgs_Jsonclick = "" ;
      edtavRpexhdkgs_Enabled = 1 ;
      edtavPzs_Jsonclick = "" ;
      edtavPzs_Enabled = 1 ;
      edtavRpexhdcns_Jsonclick = "" ;
      edtavRpexhdcns_Enabled = 1 ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtRpExHdAlb_Jsonclick = "" ;
      edtRpExHdFe_Jsonclick = "" ;
      edtRpExHdLi_Jsonclick = "" ;
      cmbavGrupodeacciones.setJsonclick( "" );
      cmbavGrupodeacciones.setVisible( -1 );
      cmbavGrupodeacciones.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavInformacionwithtags_Visible = -1 ;
      cmbavFlag.setVisible( -1 );
      cmbavRpexhdtip.setVisible( -1 );
      edtavMts_Visible = -1 ;
      edtavRpexhdmts_Visible = -1 ;
      edtavKgs_Visible = -1 ;
      edtavRpexhdkgs_Visible = -1 ;
      edtavPzs_Visible = -1 ;
      edtavRpexhdcns_Visible = -1 ;
      edtBarSerDsc_Visible = -1 ;
      edtBarSer_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      edtRpExHdAlb_Visible = -1 ;
      edtRpExHdFe_Visible = -1 ;
      edtRpExHdLi_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_rpexhdfeauxdate_Jsonclick = "" ;
      Grid_empowerer_Popoversingrid = "Popover_Informacion" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;Recepcion;;Recepcion;;Recepcion;;;;;;;;;;;;;" ;
      Dvelop_confirmpanel_eliminarentrada_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminarentrada_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminarentrada_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminarentrada_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminarentrada_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminarentrada_Confirmationtext = "¿Deseas eliminar la ENTRADA?" ;
      Dvelop_confirmpanel_eliminarentrada_Title = "" ;
      Dvelop_confirmpanel_modificarlinea_Confirmtype = "1" ;
      Dvelop_confirmpanel_modificarlinea_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_modificarlinea_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_modificarlinea_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_modificarlinea_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_modificarlinea_Confirmationtext = "¿Desea modificar la Linea?" ;
      Dvelop_confirmpanel_modificarlinea_Title = "" ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea eliminar la linea?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "WCTrabajosExternosRecepcionMantenimientoGetFilterData" ;
      Ddo_grid_Datalisttype = "||||Dynamic|Dynamic|Dynamic|||||||||" ;
      Ddo_grid_Includedatalist = "||||T|T|T|||||||||" ;
      Ddo_grid_Filterisrange = "T||T|T||||||||||||" ;
      Ddo_grid_Filtertype = "Numeric|Date|Numeric|Numeric|Character|Character|Character|||||||||" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|||||||||" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|||||||||" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|||||||||" ;
      Ddo_grid_Columnids = "1:RpExHdLi|2:RpExHdFe|3:RpExHdAlb|4:CliCod|5:CliNom|6:BarSer|7:BarSerDsc|8:RpExHdCns|9:Pzs|10:RpExHdKgs|11:Kgs|12:RpExHdMts|13:Mts|14:RpExHdTip|15:Flag|16:Informacion" ;
      Ddo_grid_Gridinternalname = "" ;
      Popover_informacion_Position = "Bottom" ;
      Popover_informacion_Popoverwidth = 500 ;
      Popover_informacion_Trigger = "Click" ;
      Popover_informacion_Isgriditem = GXutil.toBoolean( -1) ;
      Popover_informacion_Iteminternalname = "" ;
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
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Eliminar Entrada (Total)", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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
      GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_51_idx ;
      cmbavGrupodeacciones.setName( GXCCtl );
      cmbavGrupodeacciones.setWebtags( "" );
      if ( cmbavGrupodeacciones.getItemCount() > 0 )
      {
      }
      GXCCtl = "vRPEXHDTIP_" + sGXsfl_51_idx ;
      cmbavRpexhdtip.setName( GXCCtl );
      cmbavRpexhdtip.setWebtags( "" );
      cmbavRpexhdtip.addItem("P", httpContext.getMessage( "Parcial", ""), (short)(0));
      cmbavRpexhdtip.addItem("T", httpContext.getMessage( "Total", ""), (short)(0));
      if ( cmbavRpexhdtip.getItemCount() > 0 )
      {
      }
      GXCCtl = "vFLAG_" + sGXsfl_51_idx ;
      cmbavFlag.setName( GXCCtl );
      cmbavFlag.setWebtags( "" );
      cmbavFlag.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbavFlag.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbavFlag.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV54EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV53Mancod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV52RpExHdFe',fld:'vRPEXHDFE',pic:''},{av:'AV94Informacion',fld:'vINFORMACION',pic:'Z',hsh:true},{av:'sPrefix'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV36TFRpExHdLi',fld:'vTFRPEXHDLI',pic:'ZZZ9'},{av:'AV37TFRpExHdLi_To',fld:'vTFRPEXHDLI_TO',pic:'ZZZ9'},{av:'AV32TFRpExHdFe',fld:'vTFRPEXHDFE',pic:''},{av:'AV30TFRpExHdAlb',fld:'vTFRPEXHDALB',pic:'ZZZZZZZ9'},{av:'AV31TFRpExHdAlb_To',fld:'vTFRPEXHDALB_TO',pic:'ZZZZZZZ9'},{av:'AV38TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV39TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV40TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV41TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV42TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV43TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV44TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV45TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV93FlagLin',fld:'vFLAGLIN',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtRpExHdLi_Visible',ctrl:'RPEXHDLI',prop:'Visible'},{av:'edtRpExHdFe_Visible',ctrl:'RPEXHDFE',prop:'Visible'},{av:'edtRpExHdAlb_Visible',ctrl:'RPEXHDALB',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtavRpexhdcns_Visible',ctrl:'vRPEXHDCNS',prop:'Visible'},{av:'edtavPzs_Visible',ctrl:'vPZS',prop:'Visible'},{av:'edtavRpexhdkgs_Visible',ctrl:'vRPEXHDKGS',prop:'Visible'},{av:'edtavKgs_Visible',ctrl:'vKGS',prop:'Visible'},{av:'edtavRpexhdmts_Visible',ctrl:'vRPEXHDMTS',prop:'Visible'},{av:'edtavMts_Visible',ctrl:'vMTS',prop:'Visible'},{av:'cmbavRpexhdtip'},{av:'cmbavFlag'},{av:'edtavInformacionwithtags_Visible',ctrl:'vINFORMACIONWITHTAGS',prop:'Visible'},{av:'AV50GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV51GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1318A2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV54EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV53Mancod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV52RpExHdFe',fld:'vRPEXHDFE',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV36TFRpExHdLi',fld:'vTFRPEXHDLI',pic:'ZZZ9'},{av:'AV37TFRpExHdLi_To',fld:'vTFRPEXHDLI_TO',pic:'ZZZ9'},{av:'AV32TFRpExHdFe',fld:'vTFRPEXHDFE',pic:''},{av:'AV30TFRpExHdAlb',fld:'vTFRPEXHDALB',pic:'ZZZZZZZ9'},{av:'AV31TFRpExHdAlb_To',fld:'vTFRPEXHDALB_TO',pic:'ZZZZZZZ9'},{av:'AV38TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV39TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV40TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV41TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV42TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV43TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV44TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV45TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV93FlagLin',fld:'vFLAGLIN',pic:'9',hsh:true},{av:'AV94Informacion',fld:'vINFORMACION',pic:'Z',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1418A2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV54EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV53Mancod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV52RpExHdFe',fld:'vRPEXHDFE',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV36TFRpExHdLi',fld:'vTFRPEXHDLI',pic:'ZZZ9'},{av:'AV37TFRpExHdLi_To',fld:'vTFRPEXHDLI_TO',pic:'ZZZ9'},{av:'AV32TFRpExHdFe',fld:'vTFRPEXHDFE',pic:''},{av:'AV30TFRpExHdAlb',fld:'vTFRPEXHDALB',pic:'ZZZZZZZ9'},{av:'AV31TFRpExHdAlb_To',fld:'vTFRPEXHDALB_TO',pic:'ZZZZZZZ9'},{av:'AV38TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV39TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV40TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV41TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV42TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV43TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV44TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV45TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV93FlagLin',fld:'vFLAGLIN',pic:'9',hsh:true},{av:'AV94Informacion',fld:'vINFORMACION',pic:'Z',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1518A2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV54EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV53Mancod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV52RpExHdFe',fld:'vRPEXHDFE',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV36TFRpExHdLi',fld:'vTFRPEXHDLI',pic:'ZZZ9'},{av:'AV37TFRpExHdLi_To',fld:'vTFRPEXHDLI_TO',pic:'ZZZ9'},{av:'AV32TFRpExHdFe',fld:'vTFRPEXHDFE',pic:''},{av:'AV30TFRpExHdAlb',fld:'vTFRPEXHDALB',pic:'ZZZZZZZ9'},{av:'AV31TFRpExHdAlb_To',fld:'vTFRPEXHDALB_TO',pic:'ZZZZZZZ9'},{av:'AV38TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV39TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV40TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV41TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV42TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV43TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV44TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV45TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV93FlagLin',fld:'vFLAGLIN',pic:'9',hsh:true},{av:'AV94Informacion',fld:'vINFORMACION',pic:'Z',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV44TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV45TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV42TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV43TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV40TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV41TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV38TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV39TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFRpExHdAlb',fld:'vTFRPEXHDALB',pic:'ZZZZZZZ9'},{av:'AV31TFRpExHdAlb_To',fld:'vTFRPEXHDALB_TO',pic:'ZZZZZZZ9'},{av:'AV32TFRpExHdFe',fld:'vTFRPEXHDFE',pic:''},{av:'AV36TFRpExHdLi',fld:'vTFRPEXHDLI',pic:'ZZZ9'},{av:'AV37TFRpExHdLi_To',fld:'vTFRPEXHDLI_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2418A2',iparms:[{av:'A2716RpExHdCns',fld:'RPEXHDCNS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2714RpExHdAlb',fld:'RPEXHDALB',pic:'ZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9',hsh:true},{av:'A6262RpExSalLn',fld:'RPEXSALLN',pic:'ZZZ9'},{av:'AV93FlagLin',fld:'vFLAGLIN',pic:'9',hsh:true},{av:'A2715RpExHdKgs',fld:'RPEXHDKGS',pic:'ZZZZZ9.99'},{av:'A2847RpExHdMts',fld:'RPEXHDMTS',pic:'ZZZZZ9.99'},{av:'A2717RpExHdTip',fld:'RPEXHDTIP',pic:''},{av:'AV94Informacion',fld:'vINFORMACION',pic:'Z',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV79GrupodeAcciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'AV16RpExHdCns',fld:'vRPEXHDCNS',pic:'ZZZ9'},{av:'AV80Pzs',fld:'vPZS',pic:'ZZZ9'},{av:'AV17RpExHdKgs',fld:'vRPEXHDKGS',pic:'ZZZZZ9.99'},{av:'AV81Kgs',fld:'vKGS',pic:'ZZZZZ9.99',hsh:true},{av:'AV18RpExHdMts',fld:'vRPEXHDMTS',pic:'ZZZZZ9.99'},{av:'AV82Mts',fld:'vMTS',pic:'ZZZZZ9.99',hsh:true},{av:'cmbavRpexhdtip'},{av:'AV19RpExHdTip',fld:'vRPEXHDTIP',pic:''},{av:'cmbavFlag'},{av:'AV92Flag',fld:'vFLAG',pic:''},{av:'AV83oldRpExHdCns',fld:'vOLDRPEXHDCNS',pic:'ZZZ9'},{av:'AV84oldRpExHdKgs',fld:'vOLDRPEXHDKGS',pic:'ZZZZZ9.99'},{av:'AV85OldRpExHdMts',fld:'vOLDRPEXHDMTS',pic:'ZZZZZ9.99'},{av:'edtavInformacionwithtags_Horizontalalignment',ctrl:'vINFORMACIONWITHTAGS',prop:'Horizontalalignment'},{av:'AV95InformacionWithTags',fld:'vINFORMACIONWITHTAGS',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1618A2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV54EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV53Mancod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV52RpExHdFe',fld:'vRPEXHDFE',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV36TFRpExHdLi',fld:'vTFRPEXHDLI',pic:'ZZZ9'},{av:'AV37TFRpExHdLi_To',fld:'vTFRPEXHDLI_TO',pic:'ZZZ9'},{av:'AV32TFRpExHdFe',fld:'vTFRPEXHDFE',pic:''},{av:'AV30TFRpExHdAlb',fld:'vTFRPEXHDALB',pic:'ZZZZZZZ9'},{av:'AV31TFRpExHdAlb_To',fld:'vTFRPEXHDALB_TO',pic:'ZZZZZZZ9'},{av:'AV38TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV39TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV40TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV41TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV42TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV43TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV44TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV45TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV93FlagLin',fld:'vFLAGLIN',pic:'9',hsh:true},{av:'AV94Informacion',fld:'vINFORMACION',pic:'Z',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtRpExHdLi_Visible',ctrl:'RPEXHDLI',prop:'Visible'},{av:'edtRpExHdFe_Visible',ctrl:'RPEXHDFE',prop:'Visible'},{av:'edtRpExHdAlb_Visible',ctrl:'RPEXHDALB',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtavRpexhdcns_Visible',ctrl:'vRPEXHDCNS',prop:'Visible'},{av:'edtavPzs_Visible',ctrl:'vPZS',prop:'Visible'},{av:'edtavRpexhdkgs_Visible',ctrl:'vRPEXHDKGS',prop:'Visible'},{av:'edtavKgs_Visible',ctrl:'vKGS',prop:'Visible'},{av:'edtavRpexhdmts_Visible',ctrl:'vRPEXHDMTS',prop:'Visible'},{av:'edtavMts_Visible',ctrl:'vMTS',prop:'Visible'},{av:'cmbavRpexhdtip'},{av:'cmbavFlag'},{av:'edtavInformacionwithtags_Visible',ctrl:'vINFORMACIONWITHTAGS',prop:'Visible'},{av:'AV50GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV51GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1218A2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV54EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV53Mancod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV52RpExHdFe',fld:'vRPEXHDFE',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV36TFRpExHdLi',fld:'vTFRPEXHDLI',pic:'ZZZ9'},{av:'AV37TFRpExHdLi_To',fld:'vTFRPEXHDLI_TO',pic:'ZZZ9'},{av:'AV32TFRpExHdFe',fld:'vTFRPEXHDFE',pic:''},{av:'AV30TFRpExHdAlb',fld:'vTFRPEXHDALB',pic:'ZZZZZZZ9'},{av:'AV31TFRpExHdAlb_To',fld:'vTFRPEXHDALB_TO',pic:'ZZZZZZZ9'},{av:'AV38TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV39TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV40TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV41TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV42TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV43TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV44TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV45TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV93FlagLin',fld:'vFLAGLIN',pic:'9',hsh:true},{av:'AV94Informacion',fld:'vINFORMACION',pic:'Z',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV36TFRpExHdLi',fld:'vTFRPEXHDLI',pic:'ZZZ9'},{av:'AV37TFRpExHdLi_To',fld:'vTFRPEXHDLI_TO',pic:'ZZZ9'},{av:'AV32TFRpExHdFe',fld:'vTFRPEXHDFE',pic:''},{av:'AV30TFRpExHdAlb',fld:'vTFRPEXHDALB',pic:'ZZZZZZZ9'},{av:'AV31TFRpExHdAlb_To',fld:'vTFRPEXHDALB_TO',pic:'ZZZZZZZ9'},{av:'AV38TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV39TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV40TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV41TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV42TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV43TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV44TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV45TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtRpExHdLi_Visible',ctrl:'RPEXHDLI',prop:'Visible'},{av:'edtRpExHdFe_Visible',ctrl:'RPEXHDFE',prop:'Visible'},{av:'edtRpExHdAlb_Visible',ctrl:'RPEXHDALB',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtavRpexhdcns_Visible',ctrl:'vRPEXHDCNS',prop:'Visible'},{av:'edtavPzs_Visible',ctrl:'vPZS',prop:'Visible'},{av:'edtavRpexhdkgs_Visible',ctrl:'vRPEXHDKGS',prop:'Visible'},{av:'edtavKgs_Visible',ctrl:'vKGS',prop:'Visible'},{av:'edtavRpexhdmts_Visible',ctrl:'vRPEXHDMTS',prop:'Visible'},{av:'edtavMts_Visible',ctrl:'vMTS',prop:'Visible'},{av:'cmbavRpexhdtip'},{av:'cmbavFlag'},{av:'edtavInformacionwithtags_Visible',ctrl:'vINFORMACIONWITHTAGS',prop:'Visible'},{av:'AV50GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV51GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRUPODEACCIONES.CLICK","{handler:'e2518A2',iparms:[{av:'cmbavGrupodeacciones'},{av:'AV79GrupodeAcciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'A2713RpExHdLi',fld:'RPEXHDLI',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9',hsh:true},{av:'A2711RpExHdFe',fld:'RPEXHDFE',pic:''}]");
      setEventMetadata("VGRUPODEACCIONES.CLICK",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV79GrupodeAcciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'Dvelop_confirmpanel_eliminar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'ConfirmationText'},{av:'Dvelop_confirmpanel_modificarlinea_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_MODIFICARLINEA',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e1718A2',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV54EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV53Mancod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV52RpExHdFe',fld:'vRPEXHDFE',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV36TFRpExHdLi',fld:'vTFRPEXHDLI',pic:'ZZZ9'},{av:'AV37TFRpExHdLi_To',fld:'vTFRPEXHDLI_TO',pic:'ZZZ9'},{av:'AV32TFRpExHdFe',fld:'vTFRPEXHDFE',pic:''},{av:'AV30TFRpExHdAlb',fld:'vTFRPEXHDALB',pic:'ZZZZZZZ9'},{av:'AV31TFRpExHdAlb_To',fld:'vTFRPEXHDALB_TO',pic:'ZZZZZZZ9'},{av:'AV38TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV39TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV40TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV41TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV42TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV43TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV44TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV45TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV93FlagLin',fld:'vFLAGLIN',pic:'9',hsh:true},{av:'AV94Informacion',fld:'vINFORMACION',pic:'Z',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'A2711RpExHdFe',fld:'RPEXHDFE',pic:''},{av:'A2713RpExHdLi',fld:'RPEXHDLI',pic:'ZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'A2713RpExHdLi',fld:'RPEXHDLI',pic:'ZZZ9'},{av:'A2711RpExHdFe',fld:'RPEXHDFE',pic:''},{av:'AV53Mancod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV54EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtRpExHdLi_Visible',ctrl:'RPEXHDLI',prop:'Visible'},{av:'edtRpExHdFe_Visible',ctrl:'RPEXHDFE',prop:'Visible'},{av:'edtRpExHdAlb_Visible',ctrl:'RPEXHDALB',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtavRpexhdcns_Visible',ctrl:'vRPEXHDCNS',prop:'Visible'},{av:'edtavPzs_Visible',ctrl:'vPZS',prop:'Visible'},{av:'edtavRpexhdkgs_Visible',ctrl:'vRPEXHDKGS',prop:'Visible'},{av:'edtavKgs_Visible',ctrl:'vKGS',prop:'Visible'},{av:'edtavRpexhdmts_Visible',ctrl:'vRPEXHDMTS',prop:'Visible'},{av:'edtavMts_Visible',ctrl:'vMTS',prop:'Visible'},{av:'cmbavRpexhdtip'},{av:'cmbavFlag'},{av:'edtavInformacionwithtags_Visible',ctrl:'vINFORMACIONWITHTAGS',prop:'Visible'},{av:'AV50GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV51GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_MODIFICARLINEA.CLOSE","{handler:'e1818A2',iparms:[{av:'Dvelop_confirmpanel_modificarlinea_Result',ctrl:'DVELOP_CONFIRMPANEL_MODIFICARLINEA',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV54EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV53Mancod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV52RpExHdFe',fld:'vRPEXHDFE',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV36TFRpExHdLi',fld:'vTFRPEXHDLI',pic:'ZZZ9'},{av:'AV37TFRpExHdLi_To',fld:'vTFRPEXHDLI_TO',pic:'ZZZ9'},{av:'AV32TFRpExHdFe',fld:'vTFRPEXHDFE',pic:''},{av:'AV30TFRpExHdAlb',fld:'vTFRPEXHDALB',pic:'ZZZZZZZ9'},{av:'AV31TFRpExHdAlb_To',fld:'vTFRPEXHDALB_TO',pic:'ZZZZZZZ9'},{av:'AV38TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV39TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV40TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV41TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV42TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV43TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV44TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV45TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV93FlagLin',fld:'vFLAGLIN',pic:'9',hsh:true},{av:'AV94Informacion',fld:'vINFORMACION',pic:'Z',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'AV81Kgs',fld:'vKGS',pic:'ZZZZZ9.99',hsh:true},{av:'AV84oldRpExHdKgs',fld:'vOLDRPEXHDKGS',pic:'ZZZZZ9.99'},{av:'AV82Mts',fld:'vMTS',pic:'ZZZZZ9.99',hsh:true},{av:'AV85OldRpExHdMts',fld:'vOLDRPEXHDMTS',pic:'ZZZZZ9.99'},{av:'AV17RpExHdKgs',fld:'vRPEXHDKGS',pic:'ZZZZZ9.99'},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!'},{av:'AV18RpExHdMts',fld:'vRPEXHDMTS',pic:'ZZZZZ9.99'},{av:'A2711RpExHdFe',fld:'RPEXHDFE',pic:''},{av:'A2713RpExHdLi',fld:'RPEXHDLI',pic:'ZZZ9'},{av:'AV83oldRpExHdCns',fld:'vOLDRPEXHDCNS',pic:'ZZZ9'},{av:'AV16RpExHdCns',fld:'vRPEXHDCNS',pic:'ZZZ9'},{av:'cmbavRpexhdtip'},{av:'AV19RpExHdTip',fld:'vRPEXHDTIP',pic:''},{av:'A2714RpExHdAlb',fld:'RPEXHDALB',pic:'ZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2717RpExHdTip',fld:'RPEXHDTIP',pic:''},{av:'A6262RpExSalLn',fld:'RPEXSALLN',pic:'ZZZ9'},{av:'cmbavFlag'},{av:'AV92Flag',fld:'vFLAG',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_MODIFICARLINEA.CLOSE",",oparms:[{av:'cmbavRpexhdtip'},{av:'AV19RpExHdTip',fld:'vRPEXHDTIP',pic:''},{av:'AV18RpExHdMts',fld:'vRPEXHDMTS',pic:'ZZZZZ9.99'},{av:'AV17RpExHdKgs',fld:'vRPEXHDKGS',pic:'ZZZZZ9.99'},{av:'AV16RpExHdCns',fld:'vRPEXHDCNS',pic:'ZZZ9'},{av:'AV85OldRpExHdMts',fld:'vOLDRPEXHDMTS',pic:'ZZZZZ9.99'},{av:'AV84oldRpExHdKgs',fld:'vOLDRPEXHDKGS',pic:'ZZZZZ9.99'},{av:'AV83oldRpExHdCns',fld:'vOLDRPEXHDCNS',pic:'ZZZ9'},{av:'A2713RpExHdLi',fld:'RPEXHDLI',pic:'ZZZ9'},{av:'A2711RpExHdFe',fld:'RPEXHDFE',pic:''},{av:'AV53Mancod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV54EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A6262RpExSalLn',fld:'RPEXSALLN',pic:'ZZZ9'},{av:'A2717RpExHdTip',fld:'RPEXHDTIP',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A2714RpExHdAlb',fld:'RPEXHDALB',pic:'ZZZZZZZ9'},{av:'cmbavFlag'},{av:'AV92Flag',fld:'vFLAG',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtRpExHdLi_Visible',ctrl:'RPEXHDLI',prop:'Visible'},{av:'edtRpExHdFe_Visible',ctrl:'RPEXHDFE',prop:'Visible'},{av:'edtRpExHdAlb_Visible',ctrl:'RPEXHDALB',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtavRpexhdcns_Visible',ctrl:'vRPEXHDCNS',prop:'Visible'},{av:'edtavPzs_Visible',ctrl:'vPZS',prop:'Visible'},{av:'edtavRpexhdkgs_Visible',ctrl:'vRPEXHDKGS',prop:'Visible'},{av:'edtavKgs_Visible',ctrl:'vKGS',prop:'Visible'},{av:'edtavRpexhdmts_Visible',ctrl:'vRPEXHDMTS',prop:'Visible'},{av:'edtavMts_Visible',ctrl:'vMTS',prop:'Visible'},{av:'edtavInformacionwithtags_Visible',ctrl:'vINFORMACIONWITHTAGS',prop:'Visible'},{av:'AV50GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV51GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOELIMINARENTRADA'","{handler:'e1118A1',iparms:[{av:'AV52RpExHdFe',fld:'vRPEXHDFE',pic:''}]");
      setEventMetadata("'DOELIMINARENTRADA'",",oparms:[{av:'Dvelop_confirmpanel_eliminarentrada_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARENTRADA',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARENTRADA.CLOSE","{handler:'e1918A2',iparms:[{av:'Dvelop_confirmpanel_eliminarentrada_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARENTRADA',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV54EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV53Mancod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV52RpExHdFe',fld:'vRPEXHDFE',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV36TFRpExHdLi',fld:'vTFRPEXHDLI',pic:'ZZZ9'},{av:'AV37TFRpExHdLi_To',fld:'vTFRPEXHDLI_TO',pic:'ZZZ9'},{av:'AV32TFRpExHdFe',fld:'vTFRPEXHDFE',pic:''},{av:'AV30TFRpExHdAlb',fld:'vTFRPEXHDALB',pic:'ZZZZZZZ9'},{av:'AV31TFRpExHdAlb_To',fld:'vTFRPEXHDALB_TO',pic:'ZZZZZZZ9'},{av:'AV38TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV39TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV40TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV41TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV42TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV43TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV44TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV45TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV93FlagLin',fld:'vFLAGLIN',pic:'9',hsh:true},{av:'AV94Informacion',fld:'vINFORMACION',pic:'Z',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9',hsh:true},{av:'sPrefix'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARENTRADA.CLOSE",",oparms:[{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtRpExHdLi_Visible',ctrl:'RPEXHDLI',prop:'Visible'},{av:'edtRpExHdFe_Visible',ctrl:'RPEXHDFE',prop:'Visible'},{av:'edtRpExHdAlb_Visible',ctrl:'RPEXHDALB',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtavRpexhdcns_Visible',ctrl:'vRPEXHDCNS',prop:'Visible'},{av:'edtavPzs_Visible',ctrl:'vPZS',prop:'Visible'},{av:'edtavRpexhdkgs_Visible',ctrl:'vRPEXHDKGS',prop:'Visible'},{av:'edtavKgs_Visible',ctrl:'vKGS',prop:'Visible'},{av:'edtavRpexhdmts_Visible',ctrl:'vRPEXHDMTS',prop:'Visible'},{av:'edtavMts_Visible',ctrl:'vMTS',prop:'Visible'},{av:'cmbavRpexhdtip'},{av:'cmbavFlag'},{av:'edtavInformacionwithtags_Visible',ctrl:'vINFORMACIONWITHTAGS',prop:'Visible'},{av:'AV50GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV51GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e2018A2',iparms:[{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV41TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV45TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFRpExHdLi',fld:'vTFRPEXHDLI',pic:'ZZZ9'},{av:'AV32TFRpExHdFe',fld:'vTFRPEXHDFE',pic:''},{av:'AV30TFRpExHdAlb',fld:'vTFRPEXHDALB',pic:'ZZZZZZZ9'},{av:'AV38TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV40TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV42TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV44TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV37TFRpExHdLi_To',fld:'vTFRPEXHDLI_TO',pic:'ZZZ9'},{av:'AV31TFRpExHdAlb_To',fld:'vTFRPEXHDALB_TO',pic:'ZZZZZZZ9'},{av:'AV39TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV54EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV53Mancod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV52RpExHdFe',fld:'vRPEXHDFE',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV36TFRpExHdLi',fld:'vTFRPEXHDLI',pic:'ZZZ9'},{av:'AV37TFRpExHdLi_To',fld:'vTFRPEXHDLI_TO',pic:'ZZZ9'},{av:'AV32TFRpExHdFe',fld:'vTFRPEXHDFE',pic:''},{av:'AV30TFRpExHdAlb',fld:'vTFRPEXHDALB',pic:'ZZZZZZZ9'},{av:'AV31TFRpExHdAlb_To',fld:'vTFRPEXHDALB_TO',pic:'ZZZZZZZ9'},{av:'AV38TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV39TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV40TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV41TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV42TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV43TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV44TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV45TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV93FlagLin',fld:'vFLAGLIN',pic:'9',hsh:true},{av:'AV94Informacion',fld:'vINFORMACION',pic:'Z',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e2118A2',iparms:[{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV41TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV45TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFRpExHdLi',fld:'vTFRPEXHDLI',pic:'ZZZ9'},{av:'AV32TFRpExHdFe',fld:'vTFRPEXHDFE',pic:''},{av:'AV30TFRpExHdAlb',fld:'vTFRPEXHDALB',pic:'ZZZZZZZ9'},{av:'AV38TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV40TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV42TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV44TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV37TFRpExHdLi_To',fld:'vTFRPEXHDLI_TO',pic:'ZZZ9'},{av:'AV31TFRpExHdAlb_To',fld:'vTFRPEXHDALB_TO',pic:'ZZZZZZZ9'},{av:'AV39TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV54EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV53Mancod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV52RpExHdFe',fld:'vRPEXHDFE',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV36TFRpExHdLi',fld:'vTFRPEXHDLI',pic:'ZZZ9'},{av:'AV37TFRpExHdLi_To',fld:'vTFRPEXHDLI_TO',pic:'ZZZ9'},{av:'AV32TFRpExHdFe',fld:'vTFRPEXHDFE',pic:''},{av:'AV30TFRpExHdAlb',fld:'vTFRPEXHDALB',pic:'ZZZZZZZ9'},{av:'AV31TFRpExHdAlb_To',fld:'vTFRPEXHDALB_TO',pic:'ZZZZZZZ9'},{av:'AV38TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV39TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV40TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV41TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV42TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV43TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV44TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV45TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV93FlagLin',fld:'vFLAGLIN',pic:'9',hsh:true},{av:'AV94Informacion',fld:'vINFORMACION',pic:'Z',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VINFORMACION.CLICK","{handler:'e2618A2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV16RpExHdCns',fld:'vRPEXHDCNS',pic:'ZZZ9'},{av:'AV17RpExHdKgs',fld:'vRPEXHDKGS',pic:'ZZZZZ9.99'},{av:'AV18RpExHdMts',fld:'vRPEXHDMTS',pic:'ZZZZZ9.99'},{av:'AV83oldRpExHdCns',fld:'vOLDRPEXHDCNS',pic:'ZZZ9'},{av:'AV84oldRpExHdKgs',fld:'vOLDRPEXHDKGS',pic:'ZZZZZ9.99'},{av:'AV85OldRpExHdMts',fld:'vOLDRPEXHDMTS',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VINFORMACION.CLICK",",oparms:[{ctrl:'WWPAUX_WC'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
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
      wcpOAV54EmprCod = "" ;
      wcpOAV52RpExHdFe = GXutil.nullDate() ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      Dvelop_confirmpanel_modificarlinea_Result = "" ;
      Dvelop_confirmpanel_eliminarentrada_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV54EmprCod = "" ;
      AV52RpExHdFe = GXutil.nullDate() ;
      AV15FilterFullText = "" ;
      AV24ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV32TFRpExHdFe = GXutil.nullDate() ;
      AV40TFCliNom = "" ;
      AV41TFCliNom_Sel = "" ;
      AV42TFBarSer = "" ;
      AV43TFBarSer_Sel = "" ;
      AV44TFBarSerDsc = "" ;
      AV45TFBarSerDsc_Sel = "" ;
      AV115Pgmname = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV27ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV48DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A2715RpExHdKgs = DecimalUtil.ZERO ;
      A2847RpExHdMts = DecimalUtil.ZERO ;
      A2717RpExHdTip = "" ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Gx_msg = "" ;
      AV89mtsd = DecimalUtil.ZERO ;
      AV88kgsd = DecimalUtil.ZERO ;
      AV116Emprcod_selected = "" ;
      AV118Rpexhdfe_selected = GXutil.nullDate() ;
      Popover_informacion_Gridinternalname = "" ;
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
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      bttBtneliminarentrada_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucPopover_informacion = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      WebComp_Wwpaux_wc_Component = "" ;
      OldWwpaux_wc = "" ;
      AV34DDO_RpExHdFeAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A2711RpExHdFe = GXutil.nullDate() ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      AV17RpExHdKgs = DecimalUtil.ZERO ;
      AV81Kgs = DecimalUtil.ZERO ;
      AV18RpExHdMts = DecimalUtil.ZERO ;
      AV82Mts = DecimalUtil.ZERO ;
      AV19RpExHdTip = "" ;
      AV92Flag = "" ;
      AV95InformacionWithTags = "" ;
      A228BarUniMed = "" ;
      AV84oldRpExHdKgs = DecimalUtil.ZERO ;
      AV85OldRpExHdMts = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      scmdbuf = "" ;
      lV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = "" ;
      lV109Wctrabajosexternosrecepcionmantenimientods_9_tfclinom = "" ;
      lV111Wctrabajosexternosrecepcionmantenimientods_11_tfbarser = "" ;
      lV113Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc = "" ;
      AV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = "" ;
      AV104Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe = GXutil.nullDate() ;
      AV110Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel = "" ;
      AV109Wctrabajosexternosrecepcionmantenimientods_9_tfclinom = "" ;
      AV112Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel = "" ;
      AV111Wctrabajosexternosrecepcionmantenimientods_11_tfbarser = "" ;
      AV114Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel = "" ;
      AV113Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc = "" ;
      H018A2_A2716RpExHdCns = new short[1] ;
      H018A2_n2716RpExHdCns = new boolean[] {false} ;
      H018A2_A2715RpExHdKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H018A2_n2715RpExHdKgs = new boolean[] {false} ;
      H018A2_A2847RpExHdMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H018A2_n2847RpExHdMts = new boolean[] {false} ;
      H018A2_A2717RpExHdTip = new String[] {""} ;
      H018A2_n2717RpExHdTip = new boolean[] {false} ;
      H018A2_A2248ManCod = new short[1] ;
      H018A2_A396EmprCod = new String[] {""} ;
      H018A2_A130BarCodPar = new String[] {""} ;
      H018A2_A132BarCodReo = new byte[1] ;
      H018A2_A129BarCod = new int[1] ;
      H018A2_A6262RpExSalLn = new short[1] ;
      H018A2_n6262RpExSalLn = new boolean[] {false} ;
      H018A2_A228BarUniMed = new String[] {""} ;
      H018A2_A1652BarSerDsc = new String[] {""} ;
      H018A2_A212BarSer = new String[] {""} ;
      H018A2_A279CliNom = new String[] {""} ;
      H018A2_A252CliCod = new int[1] ;
      H018A2_n252CliCod = new boolean[] {false} ;
      H018A2_A2714RpExHdAlb = new int[1] ;
      H018A2_n2714RpExHdAlb = new boolean[] {false} ;
      H018A2_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      H018A2_A2713RpExHdLi = new short[1] ;
      H018A3_AGRID_nRecordCount = new long[1] ;
      AV98Station = "" ;
      AV99Emprnom = "" ;
      AV100Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV26Session = httpContext.getWebSession();
      AV22ColumnsSelectorXML = "" ;
      GXv_int9 = new int[1] ;
      GXt_decimal16 = DecimalUtil.ZERO ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV28ManageFiltersXml = "" ;
      AV20ExcelFilename = "" ;
      AV21ErrorMessage = "" ;
      AV23UserCustomValue = "" ;
      AV25ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector18 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector19 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item20 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item21 = new GXBaseCollection[1] ;
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_modificarlinea = new com.genexus.webpanels.GXUserControl();
      GXv_int25 = new short[1] ;
      GXv_char3 = new String[1] ;
      GXv_int23 = new short[1] ;
      GXv_decimal27 = new java.math.BigDecimal[1] ;
      GXv_decimal26 = new java.math.BigDecimal[1] ;
      GXv_int13 = new short[1] ;
      GXv_decimal24 = new java.math.BigDecimal[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_int12 = new short[1] ;
      GXv_char2 = new String[1] ;
      GXv_int15 = new int[1] ;
      GXv_int14 = new byte[1] ;
      GXv_date22 = new java.util.Date[1] ;
      GXv_int11 = new byte[1] ;
      GXv_int10 = new int[1] ;
      GXv_int30 = new short[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char32 = "" ;
      GXv_char29 = new String[1] ;
      GXt_char31 = "" ;
      GXv_char28 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_SdtWWPGridState33 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      ucDvelop_confirmpanel_eliminarentrada = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV54EmprCod = "" ;
      sCtrlAV53Mancod = "" ;
      sCtrlAV52RpExHdFe = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wctrabajosexternosrecepcionmantenimiento__default(),
         new Object[] {
             new Object[] {
            H018A2_A2716RpExHdCns, H018A2_n2716RpExHdCns, H018A2_A2715RpExHdKgs, H018A2_n2715RpExHdKgs, H018A2_A2847RpExHdMts, H018A2_n2847RpExHdMts, H018A2_A2717RpExHdTip, H018A2_n2717RpExHdTip, H018A2_A2248ManCod, H018A2_A396EmprCod,
            H018A2_A130BarCodPar, H018A2_A132BarCodReo, H018A2_A129BarCod, H018A2_A6262RpExSalLn, H018A2_n6262RpExSalLn, H018A2_A228BarUniMed, H018A2_A1652BarSerDsc, H018A2_A212BarSer, H018A2_A279CliNom, H018A2_A252CliCod,
            H018A2_n252CliCod, H018A2_A2714RpExHdAlb, H018A2_n2714RpExHdAlb, H018A2_A2711RpExHdFe, H018A2_A2713RpExHdLi
            }
            , new Object[] {
            H018A3_AGRID_nRecordCount
            }
         }
      );
      AV115Pgmname = "WCTrabajosExternosRecepcionMantenimiento" ;
      /* GeneXus formulas. */
      AV115Pgmname = "WCTrabajosExternosRecepcionMantenimiento" ;
      Gx_err = (short)(0) ;
      edtavPzs_Enabled = 0 ;
      edtavKgs_Enabled = 0 ;
      edtavMts_Enabled = 0 ;
      edtavInformacionwithtags_Enabled = 0 ;
      edtavInformacion_Enabled = 0 ;
      edtavOldrpexhdcns_Enabled = 0 ;
      edtavOldrpexhdkgs_Enabled = 0 ;
      edtavOldrpexhdmts_Enabled = 0 ;
      WebComp_Wwpaux_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV29ManageFiltersExecutionStep ;
   private byte AV93FlagLin ;
   private byte AV94Informacion ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A132BarCodReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXv_int14[] ;
   private byte GXv_int11[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV53Mancod ;
   private short AV53Mancod ;
   private short AV36TFRpExHdLi ;
   private short AV37TFRpExHdLi_To ;
   private short AV12OrderedBy ;
   private short A2248ManCod ;
   private short A2716RpExHdCns ;
   private short AV117Mancod_selected ;
   private short AV119Rpexhdli_selected ;
   private short wbEnd ;
   private short wbStart ;
   private short AV79GrupodeAcciones ;
   private short A2713RpExHdLi ;
   private short AV16RpExHdCns ;
   private short AV80Pzs ;
   private short AV83oldRpExHdCns ;
   private short A6262RpExSalLn ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV102Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli ;
   private short AV103Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to ;
   private short GXv_int25[] ;
   private short GXv_int23[] ;
   private short GXv_int13[] ;
   private short GXv_int12[] ;
   private short GXv_int30[] ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_51 ;
   private int nGXsfl_51_idx=1 ;
   private int AV30TFRpExHdAlb ;
   private int AV31TFRpExHdAlb_To ;
   private int AV38TFCliCod ;
   private int AV39TFCliCod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int Popover_informacion_Popoverwidth ;
   private int A2714RpExHdAlb ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int edtavPzs_Enabled ;
   private int edtavKgs_Enabled ;
   private int edtavMts_Enabled ;
   private int edtavInformacionwithtags_Enabled ;
   private int edtavInformacion_Enabled ;
   private int edtavOldrpexhdcns_Enabled ;
   private int edtavOldrpexhdkgs_Enabled ;
   private int edtavOldrpexhdmts_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV105Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb ;
   private int AV106Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to ;
   private int AV107Wctrabajosexternosrecepcionmantenimientods_7_tfclicod ;
   private int AV108Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to ;
   private int edtRpExHdLi_Visible ;
   private int edtRpExHdFe_Visible ;
   private int edtRpExHdAlb_Visible ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtBarSer_Visible ;
   private int edtBarSerDsc_Visible ;
   private int edtavRpexhdcns_Visible ;
   private int edtavPzs_Visible ;
   private int edtavRpexhdkgs_Visible ;
   private int edtavKgs_Visible ;
   private int edtavRpexhdmts_Visible ;
   private int edtavMts_Visible ;
   private int edtavInformacionwithtags_Visible ;
   private int AV49PageToGo ;
   private int GXt_int8 ;
   private int GXv_int9[] ;
   private int GXv_int15[] ;
   private int GXv_int10[] ;
   private int AV121GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavRpexhdcns_Enabled ;
   private int edtavRpexhdkgs_Enabled ;
   private int edtavRpexhdmts_Enabled ;
   private int edtavInformacion_Visible ;
   private int edtavOldrpexhdcns_Visible ;
   private int edtavOldrpexhdkgs_Visible ;
   private int edtavOldrpexhdmts_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV50GridCurrentPage ;
   private long AV51GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal A2715RpExHdKgs ;
   private java.math.BigDecimal A2847RpExHdMts ;
   private java.math.BigDecimal AV89mtsd ;
   private java.math.BigDecimal AV88kgsd ;
   private java.math.BigDecimal AV17RpExHdKgs ;
   private java.math.BigDecimal AV81Kgs ;
   private java.math.BigDecimal AV18RpExHdMts ;
   private java.math.BigDecimal AV82Mts ;
   private java.math.BigDecimal AV84oldRpExHdKgs ;
   private java.math.BigDecimal AV85OldRpExHdMts ;
   private java.math.BigDecimal GXt_decimal16 ;
   private java.math.BigDecimal GXv_decimal27[] ;
   private java.math.BigDecimal GXv_decimal26[] ;
   private java.math.BigDecimal GXv_decimal24[] ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private String wcpOAV54EmprCod ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String Dvelop_confirmpanel_modificarlinea_Result ;
   private String Dvelop_confirmpanel_eliminarentrada_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV54EmprCod ;
   private String sGXsfl_51_idx="0001" ;
   private String AV40TFCliNom ;
   private String AV41TFCliNom_Sel ;
   private String AV42TFBarSer ;
   private String AV43TFBarSer_Sel ;
   private String AV44TFBarSerDsc ;
   private String AV45TFBarSerDsc_Sel ;
   private String AV115Pgmname ;
   private String A396EmprCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A2717RpExHdTip ;
   private String Gx_msg ;
   private String AV116Emprcod_selected ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String Popover_informacion_Gridinternalname ;
   private String Popover_informacion_Iteminternalname ;
   private String Popover_informacion_Trigger ;
   private String Popover_informacion_Position ;
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
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
   private String Dvelop_confirmpanel_modificarlinea_Title ;
   private String Dvelop_confirmpanel_modificarlinea_Confirmationtext ;
   private String Dvelop_confirmpanel_modificarlinea_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_modificarlinea_Nobuttoncaption ;
   private String Dvelop_confirmpanel_modificarlinea_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_modificarlinea_Yesbuttonposition ;
   private String Dvelop_confirmpanel_modificarlinea_Confirmtype ;
   private String Dvelop_confirmpanel_eliminarentrada_Title ;
   private String Dvelop_confirmpanel_eliminarentrada_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminarentrada_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarentrada_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminarentrada_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarentrada_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminarentrada_Confirmtype ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Popoversingrid ;
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
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtneliminarentrada_Internalname ;
   private String bttBtneliminarentrada_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Popover_informacion_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDiv_wwpauxwc_Internalname ;
   private String WebComp_Wwpaux_wc_Component ;
   private String OldWwpaux_wc ;
   private String divDdo_rpexhdfeauxdates_Internalname ;
   private String edtavDdo_rpexhdfeauxdate_Internalname ;
   private String edtavDdo_rpexhdfeauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtRpExHdLi_Internalname ;
   private String edtRpExHdFe_Internalname ;
   private String edtRpExHdAlb_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Internalname ;
   private String edtavRpexhdcns_Internalname ;
   private String edtavPzs_Internalname ;
   private String edtavRpexhdkgs_Internalname ;
   private String edtavKgs_Internalname ;
   private String edtavRpexhdmts_Internalname ;
   private String edtavMts_Internalname ;
   private String AV19RpExHdTip ;
   private String AV92Flag ;
   private String edtavInformacionwithtags_Internalname ;
   private String edtavInformacion_Internalname ;
   private String A228BarUniMed ;
   private String edtBarUniMed_Internalname ;
   private String edtavOldrpexhdcns_Internalname ;
   private String edtavOldrpexhdkgs_Internalname ;
   private String edtavOldrpexhdmts_Internalname ;
   private String edtRpExSalLn_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV109Wctrabajosexternosrecepcionmantenimientods_9_tfclinom ;
   private String lV111Wctrabajosexternosrecepcionmantenimientods_11_tfbarser ;
   private String lV113Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc ;
   private String AV110Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel ;
   private String AV109Wctrabajosexternosrecepcionmantenimientods_9_tfclinom ;
   private String AV112Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel ;
   private String AV111Wctrabajosexternosrecepcionmantenimientods_11_tfbarser ;
   private String AV114Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel ;
   private String AV113Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc ;
   private String AV98Station ;
   private String AV99Emprnom ;
   private String AV100Usurcod ;
   private String edtavInformacionwithtags_Horizontalalignment ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String Dvelop_confirmpanel_modificarlinea_Internalname ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXt_char32 ;
   private String GXv_char29[] ;
   private String GXt_char31 ;
   private String GXv_char28[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_eliminarentrada_Internalname ;
   private String Dvelop_confirmpanel_eliminarentrada_Internalname ;
   private String tblTabledvelop_confirmpanel_modificarlinea_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV54EmprCod ;
   private String sCtrlAV53Mancod ;
   private String sCtrlAV52RpExHdFe ;
   private String sGXsfl_51_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtRpExHdLi_Jsonclick ;
   private String edtRpExHdFe_Jsonclick ;
   private String edtRpExHdAlb_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtavRpexhdcns_Jsonclick ;
   private String edtavPzs_Jsonclick ;
   private String edtavRpexhdkgs_Jsonclick ;
   private String edtavKgs_Jsonclick ;
   private String edtavRpexhdmts_Jsonclick ;
   private String edtavMts_Jsonclick ;
   private String edtavInformacionwithtags_Jsonclick ;
   private String edtavInformacion_Jsonclick ;
   private String edtBarUniMed_Jsonclick ;
   private String edtavOldrpexhdcns_Jsonclick ;
   private String edtavOldrpexhdkgs_Jsonclick ;
   private String edtavOldrpexhdmts_Jsonclick ;
   private String edtRpExSalLn_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV52RpExHdFe ;
   private java.util.Date AV52RpExHdFe ;
   private java.util.Date AV32TFRpExHdFe ;
   private java.util.Date AV118Rpexhdfe_selected ;
   private java.util.Date AV34DDO_RpExHdFeAuxDate ;
   private java.util.Date A2711RpExHdFe ;
   private java.util.Date AV104Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe ;
   private java.util.Date GXv_date22[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Popover_informacion_Isgriditem ;
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean bGXsfl_51_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n2714RpExHdAlb ;
   private boolean n252CliCod ;
   private boolean n6262RpExSalLn ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n2716RpExHdCns ;
   private boolean n2715RpExHdKgs ;
   private boolean n2847RpExHdMts ;
   private boolean n2717RpExHdTip ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV22ColumnsSelectorXML ;
   private String AV28ManageFiltersXml ;
   private String AV23UserCustomValue ;
   private String AV15FilterFullText ;
   private String AV95InformacionWithTags ;
   private String lV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext ;
   private String AV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext ;
   private String AV20ExcelFilename ;
   private String AV21ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wwpaux_wc ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV26Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucPopover_informacion ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_modificarlinea ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminarentrada ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavGrupodeacciones ;
   private HTMLChoice cmbavRpexhdtip ;
   private HTMLChoice cmbavFlag ;
   private IDataStoreProvider pr_default ;
   private short[] H018A2_A2716RpExHdCns ;
   private boolean[] H018A2_n2716RpExHdCns ;
   private java.math.BigDecimal[] H018A2_A2715RpExHdKgs ;
   private boolean[] H018A2_n2715RpExHdKgs ;
   private java.math.BigDecimal[] H018A2_A2847RpExHdMts ;
   private boolean[] H018A2_n2847RpExHdMts ;
   private String[] H018A2_A2717RpExHdTip ;
   private boolean[] H018A2_n2717RpExHdTip ;
   private short[] H018A2_A2248ManCod ;
   private String[] H018A2_A396EmprCod ;
   private String[] H018A2_A130BarCodPar ;
   private byte[] H018A2_A132BarCodReo ;
   private int[] H018A2_A129BarCod ;
   private short[] H018A2_A6262RpExSalLn ;
   private boolean[] H018A2_n6262RpExSalLn ;
   private String[] H018A2_A228BarUniMed ;
   private String[] H018A2_A1652BarSerDsc ;
   private String[] H018A2_A212BarSer ;
   private String[] H018A2_A279CliNom ;
   private int[] H018A2_A252CliCod ;
   private boolean[] H018A2_n252CliCod ;
   private int[] H018A2_A2714RpExHdAlb ;
   private boolean[] H018A2_n2714RpExHdAlb ;
   private java.util.Date[] H018A2_A2711RpExHdFe ;
   private short[] H018A2_A2713RpExHdLi ;
   private long[] H018A3_AGRID_nRecordCount ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV27ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item20 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item21[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector18[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector19[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV48DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState33[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class wctrabajosexternosrecepcionmantenimiento__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H018A2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext ,
                                          short AV102Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli ,
                                          short AV103Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to ,
                                          java.util.Date AV104Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe ,
                                          int AV105Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb ,
                                          int AV106Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to ,
                                          int AV107Wctrabajosexternosrecepcionmantenimientods_7_tfclicod ,
                                          int AV108Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to ,
                                          String AV110Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel ,
                                          String AV109Wctrabajosexternosrecepcionmantenimientods_9_tfclinom ,
                                          String AV112Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel ,
                                          String AV111Wctrabajosexternosrecepcionmantenimientods_11_tfbarser ,
                                          String AV114Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel ,
                                          String AV113Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc ,
                                          short A2713RpExHdLi ,
                                          int A2714RpExHdAlb ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          java.util.Date A2711RpExHdFe ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV54EmprCod ,
                                          short AV53Mancod ,
                                          java.util.Date AV52RpExHdFe ,
                                          String A396EmprCod ,
                                          short A2248ManCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int34 = new byte[27];
      Object[] GXv_Object35 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.RpExHdCns, T1.RpExHdKgs, T1.RpExHdMts, T1.RpExHdTip, T1.ManCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.RpExSalLn, T2.BarUniMed, T2.BarSerDsc," ;
      sSelectString += " T2.BarSer, T3.CliNom, T2.CliCod, T1.RpExHdAlb, T1.RpExHdFe, T1.RpExHdLi" ;
      sFromString = " FROM ((TXPLREXHD T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      sFromString += " LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ManCod = ? and T1.RpExHdFe = ?)");
      if ( ! (GXutil.strcmp("", AV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RpExHdLi,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RpExHdAlb,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int34[3] = (byte)(1) ;
         GXv_int34[4] = (byte)(1) ;
         GXv_int34[5] = (byte)(1) ;
         GXv_int34[6] = (byte)(1) ;
         GXv_int34[7] = (byte)(1) ;
         GXv_int34[8] = (byte)(1) ;
      }
      if ( ! (0==AV102Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli) )
      {
         addWhere(sWhereString, "(T1.RpExHdLi >= ?)");
      }
      else
      {
         GXv_int34[9] = (byte)(1) ;
      }
      if ( ! (0==AV103Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to) )
      {
         addWhere(sWhereString, "(T1.RpExHdLi <= ?)");
      }
      else
      {
         GXv_int34[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe)) )
      {
         addWhere(sWhereString, "(T1.RpExHdFe >= ?)");
      }
      else
      {
         GXv_int34[11] = (byte)(1) ;
      }
      if ( ! (0==AV105Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb) )
      {
         addWhere(sWhereString, "(T1.RpExHdAlb >= ?)");
      }
      else
      {
         GXv_int34[12] = (byte)(1) ;
      }
      if ( ! (0==AV106Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to) )
      {
         addWhere(sWhereString, "(T1.RpExHdAlb <= ?)");
      }
      else
      {
         GXv_int34[13] = (byte)(1) ;
      }
      if ( ! (0==AV107Wctrabajosexternosrecepcionmantenimientods_7_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int34[14] = (byte)(1) ;
      }
      if ( ! (0==AV108Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int34[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV109Wctrabajosexternosrecepcionmantenimientods_9_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int34[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV111Wctrabajosexternosrecepcionmantenimientods_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int34[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int34[21] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RpExHdLi" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RpExHdLi DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RpExHdFe" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RpExHdFe DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RpExHdAlb" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RpExHdAlb DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.ManCod, T1.RpExHdFe, T1.RpExHdLi" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object35[0] = scmdbuf ;
      GXv_Object35[1] = GXv_int34 ;
      return GXv_Object35 ;
   }

   protected Object[] conditional_H018A3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext ,
                                          short AV102Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli ,
                                          short AV103Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to ,
                                          java.util.Date AV104Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe ,
                                          int AV105Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb ,
                                          int AV106Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to ,
                                          int AV107Wctrabajosexternosrecepcionmantenimientods_7_tfclicod ,
                                          int AV108Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to ,
                                          String AV110Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel ,
                                          String AV109Wctrabajosexternosrecepcionmantenimientods_9_tfclinom ,
                                          String AV112Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel ,
                                          String AV111Wctrabajosexternosrecepcionmantenimientods_11_tfbarser ,
                                          String AV114Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel ,
                                          String AV113Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc ,
                                          short A2713RpExHdLi ,
                                          int A2714RpExHdAlb ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          java.util.Date A2711RpExHdFe ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV54EmprCod ,
                                          short AV53Mancod ,
                                          java.util.Date AV52RpExHdFe ,
                                          String A396EmprCod ,
                                          short A2248ManCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int36 = new byte[22];
      Object[] GXv_Object37 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPLREXHD T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ManCod = ? and T1.RpExHdFe = ?)");
      if ( ! (GXutil.strcmp("", AV101Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RpExHdLi,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RpExHdAlb,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int36[3] = (byte)(1) ;
         GXv_int36[4] = (byte)(1) ;
         GXv_int36[5] = (byte)(1) ;
         GXv_int36[6] = (byte)(1) ;
         GXv_int36[7] = (byte)(1) ;
         GXv_int36[8] = (byte)(1) ;
      }
      if ( ! (0==AV102Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli) )
      {
         addWhere(sWhereString, "(T1.RpExHdLi >= ?)");
      }
      else
      {
         GXv_int36[9] = (byte)(1) ;
      }
      if ( ! (0==AV103Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to) )
      {
         addWhere(sWhereString, "(T1.RpExHdLi <= ?)");
      }
      else
      {
         GXv_int36[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe)) )
      {
         addWhere(sWhereString, "(T1.RpExHdFe >= ?)");
      }
      else
      {
         GXv_int36[11] = (byte)(1) ;
      }
      if ( ! (0==AV105Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb) )
      {
         addWhere(sWhereString, "(T1.RpExHdAlb >= ?)");
      }
      else
      {
         GXv_int36[12] = (byte)(1) ;
      }
      if ( ! (0==AV106Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to) )
      {
         addWhere(sWhereString, "(T1.RpExHdAlb <= ?)");
      }
      else
      {
         GXv_int36[13] = (byte)(1) ;
      }
      if ( ! (0==AV107Wctrabajosexternosrecepcionmantenimientods_7_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int36[14] = (byte)(1) ;
      }
      if ( ! (0==AV108Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int36[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV109Wctrabajosexternosrecepcionmantenimientods_9_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int36[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV111Wctrabajosexternosrecepcionmantenimientods_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int36[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int36[21] = (byte)(1) ;
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object37[0] = scmdbuf ;
      GXv_Object37[1] = GXv_int36 ;
      return GXv_Object37 ;
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
                  return conditional_H018A2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , (java.util.Date)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() );
            case 1 :
                  return conditional_H018A3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , (java.util.Date)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H018A2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H018A3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(8);
               ((int[]) buf[12])[0] = rslt.getInt(9);
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 1);
               ((String[]) buf[16])[0] = rslt.getString(12, 26);
               ((String[]) buf[17])[0] = rslt.getString(13, 16);
               ((String[]) buf[18])[0] = rslt.getString(14, 30);
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(17);
               ((short[]) buf[24])[0] = rslt.getShort(18);
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
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
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
                  stmt.setShort(sIdx, ((Number) parms[36]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[37]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
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
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               return;
      }
   }

}

