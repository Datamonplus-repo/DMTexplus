package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mrec_analisishdr_impl extends GXWebComponent
{
   public mrec_analisishdr_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mrec_analisishdr_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrec_analisishdr_impl.class ));
   }

   public mrec_analisishdr_impl( int remoteHandle ,
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
      chkMRPrEr = UIFactory.getCheckbox(this);
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "inEmprCod") ;
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
               AV107inEmprCod = httpContext.GetPar( "inEmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107inEmprCod", AV107inEmprCod);
               AV40MaqCodJSON = httpContext.GetPar( "MaqCodJSON") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40MaqCodJSON", AV40MaqCodJSON);
               AV41FasCodJSON = httpContext.GetPar( "FasCodJSON") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41FasCodJSON", AV41FasCodJSON);
               AV42HdrJSON = httpContext.GetPar( "HdrJSON") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42HdrJSON", AV42HdrJSON);
               AV45Desde = localUtil.parseDTimeParm( httpContext.GetPar( "Desde")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Desde", localUtil.ttoc( AV45Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV46Hasta = localUtil.parseDTimeParm( httpContext.GetPar( "Hasta")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46Hasta", localUtil.ttoc( AV46Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV108inUsurCod = httpContext.GetPar( "inUsurCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108inUsurCod", AV108inUsurCod);
               AV36Ip = httpContext.GetPar( "Ip") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Ip", AV36Ip);
               AV47Now = localUtil.parseDTimeParm( httpContext.GetPar( "Now")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Now", localUtil.ttoc( AV47Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV37MTkn = httpContext.GetPar( "MTkn") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37MTkn", AV37MTkn);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV107inEmprCod,AV40MaqCodJSON,AV41FasCodJSON,AV42HdrJSON,AV45Desde,AV46Hasta,AV108inUsurCod,AV36Ip,AV47Now,AV37MTkn});
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
               gxfirstwebparm = httpContext.GetFirstPar( "inEmprCod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "inEmprCod") ;
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
      nRC_GXsfl_39 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_39"))) ;
      nGXsfl_39_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_39_idx"))) ;
      sGXsfl_39_idx = httpContext.GetPar( "sGXsfl_39_idx") ;
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
      AV12FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV29EmprCod = httpContext.GetPar( "EmprCod") ;
      AV31UsurCod = httpContext.GetPar( "UsurCod") ;
      AV45Desde = localUtil.parseDTimeParm( httpContext.GetPar( "Desde")) ;
      AV46Hasta = localUtil.parseDTimeParm( httpContext.GetPar( "Hasta")) ;
      AV36Ip = httpContext.GetPar( "Ip") ;
      AV47Now = localUtil.parseDTimeParm( httpContext.GetPar( "Now")) ;
      AV37MTkn = httpContext.GetPar( "MTkn") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV32MaqCod);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV33FasCod);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV34Hdr);
      AV23ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV18ColumnsSelector);
      AV53TFEmprCod = httpContext.GetPar( "TFEmprCod") ;
      AV54TFEmprCod_Sel = httpContext.GetPar( "TFEmprCod_Sel") ;
      AV55TFBarCod = (int)(GXutil.lval( httpContext.GetPar( "TFBarCod"))) ;
      AV56TFBarCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarCod_To"))) ;
      AV57TFBarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "TFBarCodReo"))) ;
      AV58TFBarCodReo_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarCodReo_To"))) ;
      AV59TFBarCodPar = httpContext.GetPar( "TFBarCodPar") ;
      AV60TFBarCodPar_Sel = httpContext.GetPar( "TFBarCodPar_Sel") ;
      AV73TFMRPrHdr = httpContext.GetPar( "TFMRPrHdr") ;
      AV74TFMRPrHdr_Sel = httpContext.GetPar( "TFMRPrHdr_Sel") ;
      AV75TFMRPrHdr2 = httpContext.GetPar( "TFMRPrHdr2") ;
      AV76TFMRPrHdr2_Sel = httpContext.GetPar( "TFMRPrHdr2_Sel") ;
      AV61TFMRPrOrd = (short)(GXutil.lval( httpContext.GetPar( "TFMRPrOrd"))) ;
      AV62TFMRPrOrd_To = (short)(GXutil.lval( httpContext.GetPar( "TFMRPrOrd_To"))) ;
      AV63TFMRPrLin = GXutil.lval( httpContext.GetPar( "TFMRPrLin")) ;
      AV64TFMRPrLin_To = GXutil.lval( httpContext.GetPar( "TFMRPrLin_To")) ;
      AV69TFMRPrMaqCod = httpContext.GetPar( "TFMRPrMaqCod") ;
      AV70TFMRPrMaqCod_Sel = httpContext.GetPar( "TFMRPrMaqCod_Sel") ;
      AV71TFMRPrMaqDsc = httpContext.GetPar( "TFMRPrMaqDsc") ;
      AV72TFMRPrMaqDsc_Sel = httpContext.GetPar( "TFMRPrMaqDsc_Sel") ;
      AV65TFMRPrFasCod = httpContext.GetPar( "TFMRPrFasCod") ;
      AV66TFMRPrFasCod_Sel = httpContext.GetPar( "TFMRPrFasCod_Sel") ;
      AV67TFMRPrFasDsc = httpContext.GetPar( "TFMRPrFasDsc") ;
      AV68TFMRPrFasDsc_Sel = httpContext.GetPar( "TFMRPrFasDsc_Sel") ;
      AV92TFMRPrParId = GXutil.lval( httpContext.GetPar( "TFMRPrParId")) ;
      AV93TFMRPrParId_To = GXutil.lval( httpContext.GetPar( "TFMRPrParId_To")) ;
      AV88TFMRPrParCod = (short)(GXutil.lval( httpContext.GetPar( "TFMRPrParCod"))) ;
      AV89TFMRPrParCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFMRPrParCod_To"))) ;
      AV90TFMRPrParDsc = httpContext.GetPar( "TFMRPrParDsc") ;
      AV91TFMRPrParDsc_Sel = httpContext.GetPar( "TFMRPrParDsc_Sel") ;
      AV86TFMRPrPLC = httpContext.GetPar( "TFMRPrPLC") ;
      AV87TFMRPrPLC_Sel = httpContext.GetPar( "TFMRPrPLC_Sel") ;
      AV78TFMRPrFec = localUtil.parseDTimeParm( httpContext.GetPar( "TFMRPrFec")) ;
      AV82TFMRPrValMin = httpContext.GetPar( "TFMRPrValMin") ;
      AV83TFMRPrValMin_Sel = httpContext.GetPar( "TFMRPrValMin_Sel") ;
      AV80TFMRPrVal = httpContext.GetPar( "TFMRPrVal") ;
      AV81TFMRPrVal_Sel = httpContext.GetPar( "TFMRPrVal_Sel") ;
      AV84TFMRPrValMax = httpContext.GetPar( "TFMRPrValMax") ;
      AV85TFMRPrValMax_Sel = httpContext.GetPar( "TFMRPrValMax_Sel") ;
      AV77TFMRPrEr_Sel = (byte)(GXutil.lval( httpContext.GetPar( "TFMRPrEr_Sel"))) ;
      AV94TFMRPrFecEv = localUtil.parseDTimeParm( httpContext.GetPar( "TFMRPrFecEv")) ;
      AV131Pgmname = httpContext.GetPar( "Pgmname") ;
      AV48OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV49OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV107inEmprCod = httpContext.GetPar( "inEmprCod") ;
      AV40MaqCodJSON = httpContext.GetPar( "MaqCodJSON") ;
      AV41FasCodJSON = httpContext.GetPar( "FasCodJSON") ;
      AV42HdrJSON = httpContext.GetPar( "HdrJSON") ;
      AV108inUsurCod = httpContext.GetPar( "inUsurCod") ;
      AV126AntMrPrHdr2 = httpContext.GetPar( "AntMrPrHdr2") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, AV29EmprCod, AV31UsurCod, AV45Desde, AV46Hasta, AV36Ip, AV47Now, AV37MTkn, AV32MaqCod, AV33FasCod, AV34Hdr, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV53TFEmprCod, AV54TFEmprCod_Sel, AV55TFBarCod, AV56TFBarCod_To, AV57TFBarCodReo, AV58TFBarCodReo_To, AV59TFBarCodPar, AV60TFBarCodPar_Sel, AV73TFMRPrHdr, AV74TFMRPrHdr_Sel, AV75TFMRPrHdr2, AV76TFMRPrHdr2_Sel, AV61TFMRPrOrd, AV62TFMRPrOrd_To, AV63TFMRPrLin, AV64TFMRPrLin_To, AV69TFMRPrMaqCod, AV70TFMRPrMaqCod_Sel, AV71TFMRPrMaqDsc, AV72TFMRPrMaqDsc_Sel, AV65TFMRPrFasCod, AV66TFMRPrFasCod_Sel, AV67TFMRPrFasDsc, AV68TFMRPrFasDsc_Sel, AV92TFMRPrParId, AV93TFMRPrParId_To, AV88TFMRPrParCod, AV89TFMRPrParCod_To, AV90TFMRPrParDsc, AV91TFMRPrParDsc_Sel, AV86TFMRPrPLC, AV87TFMRPrPLC_Sel, AV78TFMRPrFec, AV82TFMRPrValMin, AV83TFMRPrValMin_Sel, AV80TFMRPrVal, AV81TFMRPrVal_Sel, AV84TFMRPrValMax, AV85TFMRPrValMax_Sel, AV77TFMRPrEr_Sel, AV94TFMRPrFecEv, AV131Pgmname, AV48OrderedBy, AV49OrderedDsc, AV107inEmprCod, AV40MaqCodJSON, AV41FasCodJSON, AV42HdrJSON, AV108inUsurCod, AV126AntMrPrHdr2, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa2DX2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Analisis PLCs HDR", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ingenieria.mrec_analisishdr", new String[] {GXutil.URLEncode(GXutil.rtrim(AV107inEmprCod)),GXutil.URLEncode(GXutil.rtrim(AV40MaqCodJSON)),GXutil.URLEncode(GXutil.rtrim(AV41FasCodJSON)),GXutil.URLEncode(GXutil.rtrim(AV42HdrJSON)),GXutil.URLEncode(GXutil.formatDateTimeParmMS(AV45Desde)),GXutil.URLEncode(GXutil.formatDateTimeParmMS(AV46Hasta)),GXutil.URLEncode(GXutil.rtrim(AV108inUsurCod)),GXutil.URLEncode(GXutil.rtrim(AV36Ip)),GXutil.URLEncode(GXutil.formatDateTimeParmMS(AV47Now)),GXutil.URLEncode(GXutil.rtrim(AV37MTkn))}, new String[] {"inEmprCod","MaqCodJSON","FasCodJSON","HdrJSON","Desde","Hasta","inUsurCod","Ip","Now","MTkn"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vANTMRPRHDR2", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV126AntMrPrHdr2, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MRec_AnalisisHdr");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV131Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ingenieria\\mrec_analisishdr:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV12FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_39", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_39, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV107inEmprCod", GXutil.rtrim( wcpOAV107inEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV40MaqCodJSON", wcpOAV40MaqCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV41FasCodJSON", wcpOAV41FasCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV42HdrJSON", wcpOAV42HdrJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV45Desde", localUtil.ttoc( wcpOAV45Desde, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV46Hasta", localUtil.ttoc( wcpOAV46Hasta, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV108inUsurCod", GXutil.rtrim( wcpOAV108inUsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV36Ip", wcpOAV36Ip);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV47Now", localUtil.ttoc( wcpOAV47Now, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV37MTkn", wcpOAV37MTkn);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV23ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFEMPRCOD", GXutil.rtrim( AV53TFEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFEMPRCOD_SEL", GXutil.rtrim( AV54TFEmprCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOD", GXutil.ltrim( localUtil.ntoc( AV55TFBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOD_TO", GXutil.ltrim( localUtil.ntoc( AV56TFBarCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCODREO", GXutil.ltrim( localUtil.ntoc( AV57TFBarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCODREO_TO", GXutil.ltrim( localUtil.ntoc( AV58TFBarCodReo_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCODPAR", GXutil.rtrim( AV59TFBarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCODPAR_SEL", GXutil.rtrim( AV60TFBarCodPar_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRHDR", GXutil.rtrim( AV73TFMRPrHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRHDR_SEL", GXutil.rtrim( AV74TFMRPrHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRHDR2", AV75TFMRPrHdr2);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRHDR2_SEL", AV76TFMRPrHdr2_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRORD", GXutil.ltrim( localUtil.ntoc( AV61TFMRPrOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRORD_TO", GXutil.ltrim( localUtil.ntoc( AV62TFMRPrOrd_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRLIN", GXutil.ltrim( localUtil.ntoc( AV63TFMRPrLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRLIN_TO", GXutil.ltrim( localUtil.ntoc( AV64TFMRPrLin_To, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRMAQCOD", GXutil.rtrim( AV69TFMRPrMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRMAQCOD_SEL", GXutil.rtrim( AV70TFMRPrMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRMAQDSC", AV71TFMRPrMaqDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRMAQDSC_SEL", AV72TFMRPrMaqDsc_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRFASCOD", GXutil.rtrim( AV65TFMRPrFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRFASCOD_SEL", GXutil.rtrim( AV66TFMRPrFasCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRFASDSC", AV67TFMRPrFasDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRFASDSC_SEL", AV68TFMRPrFasDsc_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRPARID", GXutil.ltrim( localUtil.ntoc( AV92TFMRPrParId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRPARID_TO", GXutil.ltrim( localUtil.ntoc( AV93TFMRPrParId_To, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRPARCOD", GXutil.ltrim( localUtil.ntoc( AV88TFMRPrParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRPARCOD_TO", GXutil.ltrim( localUtil.ntoc( AV89TFMRPrParCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRPARDSC", AV90TFMRPrParDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRPARDSC_SEL", AV91TFMRPrParDsc_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRPLC", AV86TFMRPrPLC);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRPLC_SEL", AV87TFMRPrPLC_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRFEC", localUtil.ttoc( AV78TFMRPrFec, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRVALMIN", GXutil.rtrim( AV82TFMRPrValMin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRVALMIN_SEL", GXutil.rtrim( AV83TFMRPrValMin_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRVAL", GXutil.rtrim( AV80TFMRPrVal));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRVAL_SEL", GXutil.rtrim( AV81TFMRPrVal_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRVALMAX", GXutil.rtrim( AV84TFMRPrValMax));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRVALMAX_SEL", GXutil.rtrim( AV85TFMRPrValMax_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRER_SEL", GXutil.ltrim( localUtil.ntoc( AV77TFMRPrEr_Sel, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMRPRFECEV", localUtil.ttoc( AV94TFMRPrFecEv, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV48OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV49OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINEMPRCOD", GXutil.rtrim( AV107inEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODJSON", AV40MaqCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFASCODJSON", AV41FasCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHDRJSON", AV42HdrJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDESDE", localUtil.ttoc( AV45Desde, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHASTA", localUtil.ttoc( AV46Hasta, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINUSURCOD", GXutil.rtrim( AV108inUsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIP", AV36Ip);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNOW", localUtil.ttoc( AV47Now, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMTKN", AV37MTkn);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vANTMRPRHDR2", AV126AntMrPrHdr2);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vANTMRPRHDR2", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV126AntMrPrHdr2, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV29EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV31UsurCod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMAQCOD", AV32MaqCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMAQCOD", AV32MaqCod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vFASCOD", AV33FasCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vFASCOD", AV33FasCod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vHDR", AV34Hdr);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vHDR", AV34Hdr);
      }
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
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

   public void renderHtmlCloseForm2DX2( )
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
      return "Ingenieria.MRec_AnalisisHdr" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Analisis PLCs HDR", "") ;
   }

   public void wb2DX0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.ingenieria.mrec_analisishdr");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 39, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MRec_AnalisisHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 39, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MRec_AnalisisHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_21_2DX2( true) ;
      }
      else
      {
         wb_table1_21_2DX2( false) ;
      }
      return  ;
   }

   public void wb_table1_21_2DX2e( boolean wbgen )
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
         startgridcontrol39( ) ;
      }
      if ( wbEnd == 39 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_39 = (int)(nGXsfl_39_idx-1) ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_76_2DX2( true) ;
      }
      else
      {
         wb_table2_76_2DX2( false) ;
      }
      return  ;
   }

   public void wb_table2_76_2DX2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV131Pgmname), GXutil.rtrim( localUtil.format( AV131Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRec_AnalisisHdr.htm");
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
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_mrprfecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_mrprfecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_mrprfecauxdate_Internalname, localUtil.format(AV79DDO_MRPrFecAuxDate, "99/99/99"), localUtil.format( AV79DDO_MRPrFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,131);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_mrprfecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MRec_AnalisisHdr.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_mrprfecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\MRec_AnalisisHdr.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_mrprfecevauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_mrprfecevauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_mrprfecevauxdate_Internalname, localUtil.format(AV95DDO_MRPrFecEvAuxDate, "99/99/99"), localUtil.format( AV95DDO_MRPrFecEvAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,133);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_mrprfecevauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MRec_AnalisisHdr.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_mrprfecevauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\MRec_AnalisisHdr.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 39 )
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

   public void start2DX2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Analisis PLCs HDR", ""), (short)(0)) ;
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
            strup2DX0( ) ;
         }
      }
   }

   public void ws2DX2( )
   {
      start2DX2( ) ;
      evt2DX2( ) ;
   }

   public void evt2DX2( )
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
                              strup2DX0( ) ;
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
                              strup2DX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e112DX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e122DX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e132DX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e142DX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e152DX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e162DX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DX0( ) ;
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
                              strup2DX0( ) ;
                           }
                           nGXsfl_39_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_392( ) ;
                           A14681MRPrId = localUtil.ctol( httpContext.cgiGet( edtMRPrId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A14755MRPrHdr = httpContext.cgiGet( edtMRPrHdr_Internalname) ;
                           A14754MRPrHdr2 = httpContext.cgiGet( edtMRPrHdr2_Internalname) ;
                           A14761MRPrOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtMRPrOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14762MRPrLin = localUtil.ctol( httpContext.cgiGet( edtMRPrLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A14720MRPrMaqCod = httpContext.cgiGet( edtMRPrMaqCod_Internalname) ;
                           A14760MRPrMaqDsc = httpContext.cgiGet( edtMRPrMaqDsc_Internalname) ;
                           A14719MRPrFasCod = httpContext.cgiGet( edtMRPrFasCod_Internalname) ;
                           A14759MRPrFasDsc = httpContext.cgiGet( edtMRPrFasDsc_Internalname) ;
                           A14723MRPrParId = localUtil.ctol( httpContext.cgiGet( edtMRPrParId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A14750MRPrParCod = (short)(localUtil.ctol( httpContext.cgiGet( edtMRPrParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14758MRPrParDsc = httpContext.cgiGet( edtMRPrParDsc_Internalname) ;
                           A14757MRPrPLC = httpContext.cgiGet( edtMRPrPLC_Internalname) ;
                           A14682MRPrFec = localUtil.ctot( httpContext.cgiGet( edtMRPrFec_Internalname), 0) ;
                           A14764MRPrValMin = httpContext.cgiGet( edtMRPrValMin_Internalname) ;
                           A14721MRPrVal = httpContext.cgiGet( edtMRPrVal_Internalname) ;
                           A14765MRPrValMax = httpContext.cgiGet( edtMRPrValMax_Internalname) ;
                           A14722MRPrEr = GXutil.strtobool( httpContext.cgiGet( chkMRPrEr.getInternalname())) ;
                           A14763MRPrFecEv = localUtil.ctot( httpContext.cgiGet( edtMRPrFecEv_Internalname), 0) ;
                           A14751MRPrUsu = httpContext.cgiGet( edtMRPrUsu_Internalname) ;
                           A14752MRPrIp = httpContext.cgiGet( edtMRPrIp_Internalname) ;
                           A14753MRPrReg = localUtil.ctot( httpContext.cgiGet( edtMRPrReg_Internalname), 0) ;
                           A14756MRPrTkn = httpContext.cgiGet( edtMRPrTkn_Internalname) ;
                           AV111CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111CliCod), 6, 0));
                           AV112CliNom = httpContext.cgiGet( edtavClinom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavClinom_Internalname, AV112CliNom);
                           AV117BarSer = httpContext.cgiGet( edtavBarser_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarser_Internalname, AV117BarSer);
                           AV118BarSerDsc = httpContext.cgiGet( edtavBarserdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarserdsc_Internalname, AV118BarSerDsc);
                           AV120BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcolnum_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV120BarColNum), 6, 0));
                           AV121BarColNom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcolnom_Internalname, AV121BarColNom);
                           AV119BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBartipcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBartipcol_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV119BarTipCol), 2, 0));
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
                                       e172DX2 ();
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
                                       e182DX2 ();
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
                                       e192DX2 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV12FilterFullText) != 0 )
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
                                    strup2DX0( ) ;
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

   public void we2DX2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2DX2( ) ;
         }
      }
   }

   public void pa2DX2( )
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
      subsflControlProps_392( ) ;
      while ( nGXsfl_39_idx <= nRC_GXsfl_39 )
      {
         sendrow_392( ) ;
         nGXsfl_39_idx = ((subGrid_Islastpage==1)&&(nGXsfl_39_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_39_idx+1) ;
         sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_392( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV12FilterFullText ,
                                 String AV29EmprCod ,
                                 String AV31UsurCod ,
                                 java.util.Date AV45Desde ,
                                 java.util.Date AV46Hasta ,
                                 String AV36Ip ,
                                 java.util.Date AV47Now ,
                                 String AV37MTkn ,
                                 GXSimpleCollection<String> AV32MaqCod ,
                                 GXSimpleCollection<String> AV33FasCod ,
                                 GXSimpleCollection<String> AV34Hdr ,
                                 byte AV23ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ,
                                 String AV53TFEmprCod ,
                                 String AV54TFEmprCod_Sel ,
                                 int AV55TFBarCod ,
                                 int AV56TFBarCod_To ,
                                 byte AV57TFBarCodReo ,
                                 byte AV58TFBarCodReo_To ,
                                 String AV59TFBarCodPar ,
                                 String AV60TFBarCodPar_Sel ,
                                 String AV73TFMRPrHdr ,
                                 String AV74TFMRPrHdr_Sel ,
                                 String AV75TFMRPrHdr2 ,
                                 String AV76TFMRPrHdr2_Sel ,
                                 short AV61TFMRPrOrd ,
                                 short AV62TFMRPrOrd_To ,
                                 long AV63TFMRPrLin ,
                                 long AV64TFMRPrLin_To ,
                                 String AV69TFMRPrMaqCod ,
                                 String AV70TFMRPrMaqCod_Sel ,
                                 String AV71TFMRPrMaqDsc ,
                                 String AV72TFMRPrMaqDsc_Sel ,
                                 String AV65TFMRPrFasCod ,
                                 String AV66TFMRPrFasCod_Sel ,
                                 String AV67TFMRPrFasDsc ,
                                 String AV68TFMRPrFasDsc_Sel ,
                                 long AV92TFMRPrParId ,
                                 long AV93TFMRPrParId_To ,
                                 short AV88TFMRPrParCod ,
                                 short AV89TFMRPrParCod_To ,
                                 String AV90TFMRPrParDsc ,
                                 String AV91TFMRPrParDsc_Sel ,
                                 String AV86TFMRPrPLC ,
                                 String AV87TFMRPrPLC_Sel ,
                                 java.util.Date AV78TFMRPrFec ,
                                 String AV82TFMRPrValMin ,
                                 String AV83TFMRPrValMin_Sel ,
                                 String AV80TFMRPrVal ,
                                 String AV81TFMRPrVal_Sel ,
                                 String AV84TFMRPrValMax ,
                                 String AV85TFMRPrValMax_Sel ,
                                 byte AV77TFMRPrEr_Sel ,
                                 java.util.Date AV94TFMRPrFecEv ,
                                 String AV131Pgmname ,
                                 short AV48OrderedBy ,
                                 boolean AV49OrderedDsc ,
                                 String AV107inEmprCod ,
                                 String AV40MaqCodJSON ,
                                 String AV41FasCodJSON ,
                                 String AV42HdrJSON ,
                                 String AV108inUsurCod ,
                                 String AV126AntMrPrHdr2 ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e182DX2 ();
      GRID_nCurrentRecord = 0 ;
      rf2DX2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MRec_AnalisisHdr");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV131Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ingenieria\\mrec_analisishdr:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf2DX2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV131Pgmname = "Ingenieria.MRec_AnalisisHdr" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131Pgmname", AV131Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavBartipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBartipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipcol_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavTotvaluemrprhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemrprhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemrprhdr_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2DX2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(39) ;
      /* Execute user event: Refresh */
      e182DX2 ();
      nGXsfl_39_idx = 1 ;
      sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_392( ) ;
      bGXsfl_39_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
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
         subsflControlProps_392( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              A14720MRPrMaqCod ,
                                              AV32MaqCod ,
                                              A14719MRPrFasCod ,
                                              AV33FasCod ,
                                              A14755MRPrHdr ,
                                              AV34Hdr ,
                                              AV132Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                              AV134Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                              AV133Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                              Integer.valueOf(AV135Ingenieria_mrec_analisishdrds_4_tfbarcod) ,
                                              Integer.valueOf(AV136Ingenieria_mrec_analisishdrds_5_tfbarcod_to) ,
                                              Byte.valueOf(AV137Ingenieria_mrec_analisishdrds_6_tfbarcodreo) ,
                                              Byte.valueOf(AV138Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) ,
                                              AV140Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                              AV139Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                              AV142Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                              AV141Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                              AV144Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                              AV143Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                              Short.valueOf(AV145Ingenieria_mrec_analisishdrds_14_tfmrprord) ,
                                              Short.valueOf(AV146Ingenieria_mrec_analisishdrds_15_tfmrprord_to) ,
                                              Long.valueOf(AV147Ingenieria_mrec_analisishdrds_16_tfmrprlin) ,
                                              Long.valueOf(AV148Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) ,
                                              AV150Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                              AV149Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                              AV152Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                              AV151Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                              AV154Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                              AV153Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                              AV156Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                              AV155Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                              Long.valueOf(AV157Ingenieria_mrec_analisishdrds_26_tfmrprparid) ,
                                              Long.valueOf(AV158Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) ,
                                              Short.valueOf(AV159Ingenieria_mrec_analisishdrds_28_tfmrprparcod) ,
                                              Short.valueOf(AV160Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) ,
                                              AV162Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                              AV161Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                              AV164Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                              AV163Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                              AV165Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                              AV167Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                              AV166Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                              AV169Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                              AV168Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                              AV171Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                              AV170Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                              Byte.valueOf(AV172Ingenieria_mrec_analisishdrds_41_tfmrprer_sel) ,
                                              AV173Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                              Integer.valueOf(AV32MaqCod.size()) ,
                                              Integer.valueOf(AV33FasCod.size()) ,
                                              Integer.valueOf(AV34Hdr.size()) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              A14754MRPrHdr2 ,
                                              Short.valueOf(A14761MRPrOrd) ,
                                              Long.valueOf(A14762MRPrLin) ,
                                              A14760MRPrMaqDsc ,
                                              A14759MRPrFasDsc ,
                                              Long.valueOf(A14723MRPrParId) ,
                                              Short.valueOf(A14750MRPrParCod) ,
                                              A14758MRPrParDsc ,
                                              A14757MRPrPLC ,
                                              A14764MRPrValMin ,
                                              A14721MRPrVal ,
                                              A14765MRPrValMax ,
                                              A14682MRPrFec ,
                                              Boolean.valueOf(A14722MRPrEr) ,
                                              A14763MRPrFecEv ,
                                              Short.valueOf(AV48OrderedBy) ,
                                              Boolean.valueOf(AV49OrderedDsc) ,
                                              AV45Desde ,
                                              AV46Hasta ,
                                              A14751MRPrUsu ,
                                              AV31UsurCod ,
                                              A14752MRPrIp ,
                                              AV36Ip ,
                                              A14753MRPrReg ,
                                              AV47Now ,
                                              A14756MRPrTkn ,
                                              AV37MTkn ,
                                              AV29EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.LONG,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG,
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
         lV133Ingenieria_mrec_analisishdrds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV133Ingenieria_mrec_analisishdrds_2_tfemprcod), 3, "%") ;
         lV139Ingenieria_mrec_analisishdrds_8_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV139Ingenieria_mrec_analisishdrds_8_tfbarcodpar), 1, "%") ;
         lV141Ingenieria_mrec_analisishdrds_10_tfmrprhdr = GXutil.padr( GXutil.rtrim( AV141Ingenieria_mrec_analisishdrds_10_tfmrprhdr), 10, "%") ;
         lV143Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = GXutil.concat( GXutil.rtrim( AV143Ingenieria_mrec_analisishdrds_12_tfmrprhdr2), "%", "") ;
         lV149Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = GXutil.padr( GXutil.rtrim( AV149Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod), 6, "%") ;
         lV151Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = GXutil.concat( GXutil.rtrim( AV151Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc), "%", "") ;
         lV153Ingenieria_mrec_analisishdrds_22_tfmrprfascod = GXutil.padr( GXutil.rtrim( AV153Ingenieria_mrec_analisishdrds_22_tfmrprfascod), 8, "%") ;
         lV155Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = GXutil.concat( GXutil.rtrim( AV155Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc), "%", "") ;
         lV161Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = GXutil.concat( GXutil.rtrim( AV161Ingenieria_mrec_analisishdrds_30_tfmrprpardsc), "%", "") ;
         lV163Ingenieria_mrec_analisishdrds_32_tfmrprplc = GXutil.concat( GXutil.rtrim( AV163Ingenieria_mrec_analisishdrds_32_tfmrprplc), "%", "") ;
         lV166Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = GXutil.padr( GXutil.rtrim( AV166Ingenieria_mrec_analisishdrds_35_tfmrprvalmin), 12, "%") ;
         lV168Ingenieria_mrec_analisishdrds_37_tfmrprval = GXutil.padr( GXutil.rtrim( AV168Ingenieria_mrec_analisishdrds_37_tfmrprval), 12, "%") ;
         lV170Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = GXutil.padr( GXutil.rtrim( AV170Ingenieria_mrec_analisishdrds_39_tfmrprvalmax), 12, "%") ;
         /* Using cursor H02DX2 */
         pr_default.execute(0, new Object[] {AV29EmprCod, AV45Desde, AV46Hasta, AV31UsurCod, AV36Ip, AV47Now, AV37MTkn, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV133Ingenieria_mrec_analisishdrds_2_tfemprcod, AV134Ingenieria_mrec_analisishdrds_3_tfemprcod_sel, Integer.valueOf(AV135Ingenieria_mrec_analisishdrds_4_tfbarcod), Integer.valueOf(AV136Ingenieria_mrec_analisishdrds_5_tfbarcod_to), Byte.valueOf(AV137Ingenieria_mrec_analisishdrds_6_tfbarcodreo), Byte.valueOf(AV138Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to), lV139Ingenieria_mrec_analisishdrds_8_tfbarcodpar, AV140Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel, lV141Ingenieria_mrec_analisishdrds_10_tfmrprhdr, AV142Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel, lV143Ingenieria_mrec_analisishdrds_12_tfmrprhdr2, AV144Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel, Short.valueOf(AV145Ingenieria_mrec_analisishdrds_14_tfmrprord), Short.valueOf(AV146Ingenieria_mrec_analisishdrds_15_tfmrprord_to), Long.valueOf(AV147Ingenieria_mrec_analisishdrds_16_tfmrprlin), Long.valueOf(AV148Ingenieria_mrec_analisishdrds_17_tfmrprlin_to), lV149Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod, AV150Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel, lV151Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc, AV152Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel, lV153Ingenieria_mrec_analisishdrds_22_tfmrprfascod, AV154Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel, lV155Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc, AV156Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel, Long.valueOf(AV157Ingenieria_mrec_analisishdrds_26_tfmrprparid), Long.valueOf(AV158Ingenieria_mrec_analisishdrds_27_tfmrprparid_to), Short.valueOf(AV159Ingenieria_mrec_analisishdrds_28_tfmrprparcod), Short.valueOf(AV160Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to), lV161Ingenieria_mrec_analisishdrds_30_tfmrprpardsc, AV162Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel, lV163Ingenieria_mrec_analisishdrds_32_tfmrprplc, AV164Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel, AV165Ingenieria_mrec_analisishdrds_34_tfmrprfec, lV166Ingenieria_mrec_analisishdrds_35_tfmrprvalmin, AV167Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel, lV168Ingenieria_mrec_analisishdrds_37_tfmrprval, AV169Ingenieria_mrec_analisishdrds_38_tfmrprval_sel, lV170Ingenieria_mrec_analisishdrds_39_tfmrprvalmax, AV171Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel, AV173Ingenieria_mrec_analisishdrds_42_tfmrprfecev, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_39_idx = 1 ;
         sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_392( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A14756MRPrTkn = H02DX2_A14756MRPrTkn[0] ;
            A14753MRPrReg = H02DX2_A14753MRPrReg[0] ;
            A14752MRPrIp = H02DX2_A14752MRPrIp[0] ;
            A14751MRPrUsu = H02DX2_A14751MRPrUsu[0] ;
            A14763MRPrFecEv = H02DX2_A14763MRPrFecEv[0] ;
            A14722MRPrEr = H02DX2_A14722MRPrEr[0] ;
            A14765MRPrValMax = H02DX2_A14765MRPrValMax[0] ;
            A14721MRPrVal = H02DX2_A14721MRPrVal[0] ;
            A14764MRPrValMin = H02DX2_A14764MRPrValMin[0] ;
            A14682MRPrFec = H02DX2_A14682MRPrFec[0] ;
            A14757MRPrPLC = H02DX2_A14757MRPrPLC[0] ;
            A14758MRPrParDsc = H02DX2_A14758MRPrParDsc[0] ;
            A14750MRPrParCod = H02DX2_A14750MRPrParCod[0] ;
            A14723MRPrParId = H02DX2_A14723MRPrParId[0] ;
            A14759MRPrFasDsc = H02DX2_A14759MRPrFasDsc[0] ;
            A14719MRPrFasCod = H02DX2_A14719MRPrFasCod[0] ;
            A14760MRPrMaqDsc = H02DX2_A14760MRPrMaqDsc[0] ;
            A14720MRPrMaqCod = H02DX2_A14720MRPrMaqCod[0] ;
            A14762MRPrLin = H02DX2_A14762MRPrLin[0] ;
            A14761MRPrOrd = H02DX2_A14761MRPrOrd[0] ;
            A14754MRPrHdr2 = H02DX2_A14754MRPrHdr2[0] ;
            A14755MRPrHdr = H02DX2_A14755MRPrHdr[0] ;
            A130BarCodPar = H02DX2_A130BarCodPar[0] ;
            A132BarCodReo = H02DX2_A132BarCodReo[0] ;
            A129BarCod = H02DX2_A129BarCod[0] ;
            A396EmprCod = H02DX2_A396EmprCod[0] ;
            A14681MRPrId = H02DX2_A14681MRPrId[0] ;
            e192DX2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(39) ;
         wb2DX0( ) ;
      }
      bGXsfl_39_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2DX2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vANTMRPRHDR2", AV126AntMrPrHdr2);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vANTMRPRHDR2", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV126AntMrPrHdr2, ""))));
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
      AV132Ingenieria_mrec_analisishdrds_1_filterfulltext = AV12FilterFullText ;
      AV133Ingenieria_mrec_analisishdrds_2_tfemprcod = AV53TFEmprCod ;
      AV134Ingenieria_mrec_analisishdrds_3_tfemprcod_sel = AV54TFEmprCod_Sel ;
      AV135Ingenieria_mrec_analisishdrds_4_tfbarcod = AV55TFBarCod ;
      AV136Ingenieria_mrec_analisishdrds_5_tfbarcod_to = AV56TFBarCod_To ;
      AV137Ingenieria_mrec_analisishdrds_6_tfbarcodreo = AV57TFBarCodReo ;
      AV138Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to = AV58TFBarCodReo_To ;
      AV139Ingenieria_mrec_analisishdrds_8_tfbarcodpar = AV59TFBarCodPar ;
      AV140Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel = AV60TFBarCodPar_Sel ;
      AV141Ingenieria_mrec_analisishdrds_10_tfmrprhdr = AV73TFMRPrHdr ;
      AV142Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel = AV74TFMRPrHdr_Sel ;
      AV143Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = AV75TFMRPrHdr2 ;
      AV144Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel = AV76TFMRPrHdr2_Sel ;
      AV145Ingenieria_mrec_analisishdrds_14_tfmrprord = AV61TFMRPrOrd ;
      AV146Ingenieria_mrec_analisishdrds_15_tfmrprord_to = AV62TFMRPrOrd_To ;
      AV147Ingenieria_mrec_analisishdrds_16_tfmrprlin = AV63TFMRPrLin ;
      AV148Ingenieria_mrec_analisishdrds_17_tfmrprlin_to = AV64TFMRPrLin_To ;
      AV149Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = AV69TFMRPrMaqCod ;
      AV150Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel = AV70TFMRPrMaqCod_Sel ;
      AV151Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = AV71TFMRPrMaqDsc ;
      AV152Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel = AV72TFMRPrMaqDsc_Sel ;
      AV153Ingenieria_mrec_analisishdrds_22_tfmrprfascod = AV65TFMRPrFasCod ;
      AV154Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel = AV66TFMRPrFasCod_Sel ;
      AV155Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = AV67TFMRPrFasDsc ;
      AV156Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel = AV68TFMRPrFasDsc_Sel ;
      AV157Ingenieria_mrec_analisishdrds_26_tfmrprparid = AV92TFMRPrParId ;
      AV158Ingenieria_mrec_analisishdrds_27_tfmrprparid_to = AV93TFMRPrParId_To ;
      AV159Ingenieria_mrec_analisishdrds_28_tfmrprparcod = AV88TFMRPrParCod ;
      AV160Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to = AV89TFMRPrParCod_To ;
      AV161Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = AV90TFMRPrParDsc ;
      AV162Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel = AV91TFMRPrParDsc_Sel ;
      AV163Ingenieria_mrec_analisishdrds_32_tfmrprplc = AV86TFMRPrPLC ;
      AV164Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel = AV87TFMRPrPLC_Sel ;
      AV165Ingenieria_mrec_analisishdrds_34_tfmrprfec = AV78TFMRPrFec ;
      AV166Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = AV82TFMRPrValMin ;
      AV167Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel = AV83TFMRPrValMin_Sel ;
      AV168Ingenieria_mrec_analisishdrds_37_tfmrprval = AV80TFMRPrVal ;
      AV169Ingenieria_mrec_analisishdrds_38_tfmrprval_sel = AV81TFMRPrVal_Sel ;
      AV170Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = AV84TFMRPrValMax ;
      AV171Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel = AV85TFMRPrValMax_Sel ;
      AV172Ingenieria_mrec_analisishdrds_41_tfmrprer_sel = AV77TFMRPrEr_Sel ;
      AV173Ingenieria_mrec_analisishdrds_42_tfmrprfecev = AV94TFMRPrFecEv ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A14720MRPrMaqCod ,
                                           AV32MaqCod ,
                                           A14719MRPrFasCod ,
                                           AV33FasCod ,
                                           A14755MRPrHdr ,
                                           AV34Hdr ,
                                           AV132Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                           AV134Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                           AV133Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                           Integer.valueOf(AV135Ingenieria_mrec_analisishdrds_4_tfbarcod) ,
                                           Integer.valueOf(AV136Ingenieria_mrec_analisishdrds_5_tfbarcod_to) ,
                                           Byte.valueOf(AV137Ingenieria_mrec_analisishdrds_6_tfbarcodreo) ,
                                           Byte.valueOf(AV138Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) ,
                                           AV140Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                           AV139Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                           AV142Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                           AV141Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                           AV144Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                           AV143Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                           Short.valueOf(AV145Ingenieria_mrec_analisishdrds_14_tfmrprord) ,
                                           Short.valueOf(AV146Ingenieria_mrec_analisishdrds_15_tfmrprord_to) ,
                                           Long.valueOf(AV147Ingenieria_mrec_analisishdrds_16_tfmrprlin) ,
                                           Long.valueOf(AV148Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) ,
                                           AV150Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                           AV149Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                           AV152Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                           AV151Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                           AV154Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                           AV153Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                           AV156Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                           AV155Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                           Long.valueOf(AV157Ingenieria_mrec_analisishdrds_26_tfmrprparid) ,
                                           Long.valueOf(AV158Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) ,
                                           Short.valueOf(AV159Ingenieria_mrec_analisishdrds_28_tfmrprparcod) ,
                                           Short.valueOf(AV160Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) ,
                                           AV162Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                           AV161Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                           AV164Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                           AV163Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                           AV165Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                           AV167Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                           AV166Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                           AV169Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                           AV168Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                           AV171Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                           AV170Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                           Byte.valueOf(AV172Ingenieria_mrec_analisishdrds_41_tfmrprer_sel) ,
                                           AV173Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                           Integer.valueOf(AV32MaqCod.size()) ,
                                           Integer.valueOf(AV33FasCod.size()) ,
                                           Integer.valueOf(AV34Hdr.size()) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A14754MRPrHdr2 ,
                                           Short.valueOf(A14761MRPrOrd) ,
                                           Long.valueOf(A14762MRPrLin) ,
                                           A14760MRPrMaqDsc ,
                                           A14759MRPrFasDsc ,
                                           Long.valueOf(A14723MRPrParId) ,
                                           Short.valueOf(A14750MRPrParCod) ,
                                           A14758MRPrParDsc ,
                                           A14757MRPrPLC ,
                                           A14764MRPrValMin ,
                                           A14721MRPrVal ,
                                           A14765MRPrValMax ,
                                           A14682MRPrFec ,
                                           Boolean.valueOf(A14722MRPrEr) ,
                                           A14763MRPrFecEv ,
                                           Short.valueOf(AV48OrderedBy) ,
                                           Boolean.valueOf(AV49OrderedDsc) ,
                                           AV45Desde ,
                                           AV46Hasta ,
                                           A14751MRPrUsu ,
                                           AV31UsurCod ,
                                           A14752MRPrIp ,
                                           AV36Ip ,
                                           A14753MRPrReg ,
                                           AV47Now ,
                                           A14756MRPrTkn ,
                                           AV37MTkn ,
                                           AV29EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV133Ingenieria_mrec_analisishdrds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV133Ingenieria_mrec_analisishdrds_2_tfemprcod), 3, "%") ;
      lV139Ingenieria_mrec_analisishdrds_8_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV139Ingenieria_mrec_analisishdrds_8_tfbarcodpar), 1, "%") ;
      lV141Ingenieria_mrec_analisishdrds_10_tfmrprhdr = GXutil.padr( GXutil.rtrim( AV141Ingenieria_mrec_analisishdrds_10_tfmrprhdr), 10, "%") ;
      lV143Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = GXutil.concat( GXutil.rtrim( AV143Ingenieria_mrec_analisishdrds_12_tfmrprhdr2), "%", "") ;
      lV149Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = GXutil.padr( GXutil.rtrim( AV149Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod), 6, "%") ;
      lV151Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = GXutil.concat( GXutil.rtrim( AV151Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc), "%", "") ;
      lV153Ingenieria_mrec_analisishdrds_22_tfmrprfascod = GXutil.padr( GXutil.rtrim( AV153Ingenieria_mrec_analisishdrds_22_tfmrprfascod), 8, "%") ;
      lV155Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = GXutil.concat( GXutil.rtrim( AV155Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc), "%", "") ;
      lV161Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = GXutil.concat( GXutil.rtrim( AV161Ingenieria_mrec_analisishdrds_30_tfmrprpardsc), "%", "") ;
      lV163Ingenieria_mrec_analisishdrds_32_tfmrprplc = GXutil.concat( GXutil.rtrim( AV163Ingenieria_mrec_analisishdrds_32_tfmrprplc), "%", "") ;
      lV166Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = GXutil.padr( GXutil.rtrim( AV166Ingenieria_mrec_analisishdrds_35_tfmrprvalmin), 12, "%") ;
      lV168Ingenieria_mrec_analisishdrds_37_tfmrprval = GXutil.padr( GXutil.rtrim( AV168Ingenieria_mrec_analisishdrds_37_tfmrprval), 12, "%") ;
      lV170Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = GXutil.padr( GXutil.rtrim( AV170Ingenieria_mrec_analisishdrds_39_tfmrprvalmax), 12, "%") ;
      /* Using cursor H02DX3 */
      pr_default.execute(1, new Object[] {AV29EmprCod, AV45Desde, AV46Hasta, AV31UsurCod, AV36Ip, AV47Now, AV37MTkn, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV132Ingenieria_mrec_analisishdrds_1_filterfulltext, lV133Ingenieria_mrec_analisishdrds_2_tfemprcod, AV134Ingenieria_mrec_analisishdrds_3_tfemprcod_sel, Integer.valueOf(AV135Ingenieria_mrec_analisishdrds_4_tfbarcod), Integer.valueOf(AV136Ingenieria_mrec_analisishdrds_5_tfbarcod_to), Byte.valueOf(AV137Ingenieria_mrec_analisishdrds_6_tfbarcodreo), Byte.valueOf(AV138Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to), lV139Ingenieria_mrec_analisishdrds_8_tfbarcodpar, AV140Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel, lV141Ingenieria_mrec_analisishdrds_10_tfmrprhdr, AV142Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel, lV143Ingenieria_mrec_analisishdrds_12_tfmrprhdr2, AV144Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel, Short.valueOf(AV145Ingenieria_mrec_analisishdrds_14_tfmrprord), Short.valueOf(AV146Ingenieria_mrec_analisishdrds_15_tfmrprord_to), Long.valueOf(AV147Ingenieria_mrec_analisishdrds_16_tfmrprlin), Long.valueOf(AV148Ingenieria_mrec_analisishdrds_17_tfmrprlin_to), lV149Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod, AV150Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel, lV151Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc, AV152Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel, lV153Ingenieria_mrec_analisishdrds_22_tfmrprfascod, AV154Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel, lV155Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc, AV156Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel, Long.valueOf(AV157Ingenieria_mrec_analisishdrds_26_tfmrprparid), Long.valueOf(AV158Ingenieria_mrec_analisishdrds_27_tfmrprparid_to), Short.valueOf(AV159Ingenieria_mrec_analisishdrds_28_tfmrprparcod), Short.valueOf(AV160Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to), lV161Ingenieria_mrec_analisishdrds_30_tfmrprpardsc, AV162Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel, lV163Ingenieria_mrec_analisishdrds_32_tfmrprplc, AV164Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel, AV165Ingenieria_mrec_analisishdrds_34_tfmrprfec, lV166Ingenieria_mrec_analisishdrds_35_tfmrprvalmin, AV167Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel, lV168Ingenieria_mrec_analisishdrds_37_tfmrprval, AV169Ingenieria_mrec_analisishdrds_38_tfmrprval_sel, lV170Ingenieria_mrec_analisishdrds_39_tfmrprvalmax, AV171Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel, AV173Ingenieria_mrec_analisishdrds_42_tfmrprfecev});
      GRID_nRecordCount = H02DX3_AGRID_nRecordCount[0] ;
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
      AV132Ingenieria_mrec_analisishdrds_1_filterfulltext = AV12FilterFullText ;
      AV133Ingenieria_mrec_analisishdrds_2_tfemprcod = AV53TFEmprCod ;
      AV134Ingenieria_mrec_analisishdrds_3_tfemprcod_sel = AV54TFEmprCod_Sel ;
      AV135Ingenieria_mrec_analisishdrds_4_tfbarcod = AV55TFBarCod ;
      AV136Ingenieria_mrec_analisishdrds_5_tfbarcod_to = AV56TFBarCod_To ;
      AV137Ingenieria_mrec_analisishdrds_6_tfbarcodreo = AV57TFBarCodReo ;
      AV138Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to = AV58TFBarCodReo_To ;
      AV139Ingenieria_mrec_analisishdrds_8_tfbarcodpar = AV59TFBarCodPar ;
      AV140Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel = AV60TFBarCodPar_Sel ;
      AV141Ingenieria_mrec_analisishdrds_10_tfmrprhdr = AV73TFMRPrHdr ;
      AV142Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel = AV74TFMRPrHdr_Sel ;
      AV143Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = AV75TFMRPrHdr2 ;
      AV144Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel = AV76TFMRPrHdr2_Sel ;
      AV145Ingenieria_mrec_analisishdrds_14_tfmrprord = AV61TFMRPrOrd ;
      AV146Ingenieria_mrec_analisishdrds_15_tfmrprord_to = AV62TFMRPrOrd_To ;
      AV147Ingenieria_mrec_analisishdrds_16_tfmrprlin = AV63TFMRPrLin ;
      AV148Ingenieria_mrec_analisishdrds_17_tfmrprlin_to = AV64TFMRPrLin_To ;
      AV149Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = AV69TFMRPrMaqCod ;
      AV150Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel = AV70TFMRPrMaqCod_Sel ;
      AV151Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = AV71TFMRPrMaqDsc ;
      AV152Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel = AV72TFMRPrMaqDsc_Sel ;
      AV153Ingenieria_mrec_analisishdrds_22_tfmrprfascod = AV65TFMRPrFasCod ;
      AV154Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel = AV66TFMRPrFasCod_Sel ;
      AV155Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = AV67TFMRPrFasDsc ;
      AV156Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel = AV68TFMRPrFasDsc_Sel ;
      AV157Ingenieria_mrec_analisishdrds_26_tfmrprparid = AV92TFMRPrParId ;
      AV158Ingenieria_mrec_analisishdrds_27_tfmrprparid_to = AV93TFMRPrParId_To ;
      AV159Ingenieria_mrec_analisishdrds_28_tfmrprparcod = AV88TFMRPrParCod ;
      AV160Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to = AV89TFMRPrParCod_To ;
      AV161Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = AV90TFMRPrParDsc ;
      AV162Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel = AV91TFMRPrParDsc_Sel ;
      AV163Ingenieria_mrec_analisishdrds_32_tfmrprplc = AV86TFMRPrPLC ;
      AV164Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel = AV87TFMRPrPLC_Sel ;
      AV165Ingenieria_mrec_analisishdrds_34_tfmrprfec = AV78TFMRPrFec ;
      AV166Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = AV82TFMRPrValMin ;
      AV167Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel = AV83TFMRPrValMin_Sel ;
      AV168Ingenieria_mrec_analisishdrds_37_tfmrprval = AV80TFMRPrVal ;
      AV169Ingenieria_mrec_analisishdrds_38_tfmrprval_sel = AV81TFMRPrVal_Sel ;
      AV170Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = AV84TFMRPrValMax ;
      AV171Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel = AV85TFMRPrValMax_Sel ;
      AV172Ingenieria_mrec_analisishdrds_41_tfmrprer_sel = AV77TFMRPrEr_Sel ;
      AV173Ingenieria_mrec_analisishdrds_42_tfmrprfecev = AV94TFMRPrFecEv ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, AV29EmprCod, AV31UsurCod, AV45Desde, AV46Hasta, AV36Ip, AV47Now, AV37MTkn, AV32MaqCod, AV33FasCod, AV34Hdr, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV53TFEmprCod, AV54TFEmprCod_Sel, AV55TFBarCod, AV56TFBarCod_To, AV57TFBarCodReo, AV58TFBarCodReo_To, AV59TFBarCodPar, AV60TFBarCodPar_Sel, AV73TFMRPrHdr, AV74TFMRPrHdr_Sel, AV75TFMRPrHdr2, AV76TFMRPrHdr2_Sel, AV61TFMRPrOrd, AV62TFMRPrOrd_To, AV63TFMRPrLin, AV64TFMRPrLin_To, AV69TFMRPrMaqCod, AV70TFMRPrMaqCod_Sel, AV71TFMRPrMaqDsc, AV72TFMRPrMaqDsc_Sel, AV65TFMRPrFasCod, AV66TFMRPrFasCod_Sel, AV67TFMRPrFasDsc, AV68TFMRPrFasDsc_Sel, AV92TFMRPrParId, AV93TFMRPrParId_To, AV88TFMRPrParCod, AV89TFMRPrParCod_To, AV90TFMRPrParDsc, AV91TFMRPrParDsc_Sel, AV86TFMRPrPLC, AV87TFMRPrPLC_Sel, AV78TFMRPrFec, AV82TFMRPrValMin, AV83TFMRPrValMin_Sel, AV80TFMRPrVal, AV81TFMRPrVal_Sel, AV84TFMRPrValMax, AV85TFMRPrValMax_Sel, AV77TFMRPrEr_Sel, AV94TFMRPrFecEv, AV131Pgmname, AV48OrderedBy, AV49OrderedDsc, AV107inEmprCod, AV40MaqCodJSON, AV41FasCodJSON, AV42HdrJSON, AV108inUsurCod, AV126AntMrPrHdr2, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV132Ingenieria_mrec_analisishdrds_1_filterfulltext = AV12FilterFullText ;
      AV133Ingenieria_mrec_analisishdrds_2_tfemprcod = AV53TFEmprCod ;
      AV134Ingenieria_mrec_analisishdrds_3_tfemprcod_sel = AV54TFEmprCod_Sel ;
      AV135Ingenieria_mrec_analisishdrds_4_tfbarcod = AV55TFBarCod ;
      AV136Ingenieria_mrec_analisishdrds_5_tfbarcod_to = AV56TFBarCod_To ;
      AV137Ingenieria_mrec_analisishdrds_6_tfbarcodreo = AV57TFBarCodReo ;
      AV138Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to = AV58TFBarCodReo_To ;
      AV139Ingenieria_mrec_analisishdrds_8_tfbarcodpar = AV59TFBarCodPar ;
      AV140Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel = AV60TFBarCodPar_Sel ;
      AV141Ingenieria_mrec_analisishdrds_10_tfmrprhdr = AV73TFMRPrHdr ;
      AV142Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel = AV74TFMRPrHdr_Sel ;
      AV143Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = AV75TFMRPrHdr2 ;
      AV144Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel = AV76TFMRPrHdr2_Sel ;
      AV145Ingenieria_mrec_analisishdrds_14_tfmrprord = AV61TFMRPrOrd ;
      AV146Ingenieria_mrec_analisishdrds_15_tfmrprord_to = AV62TFMRPrOrd_To ;
      AV147Ingenieria_mrec_analisishdrds_16_tfmrprlin = AV63TFMRPrLin ;
      AV148Ingenieria_mrec_analisishdrds_17_tfmrprlin_to = AV64TFMRPrLin_To ;
      AV149Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = AV69TFMRPrMaqCod ;
      AV150Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel = AV70TFMRPrMaqCod_Sel ;
      AV151Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = AV71TFMRPrMaqDsc ;
      AV152Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel = AV72TFMRPrMaqDsc_Sel ;
      AV153Ingenieria_mrec_analisishdrds_22_tfmrprfascod = AV65TFMRPrFasCod ;
      AV154Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel = AV66TFMRPrFasCod_Sel ;
      AV155Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = AV67TFMRPrFasDsc ;
      AV156Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel = AV68TFMRPrFasDsc_Sel ;
      AV157Ingenieria_mrec_analisishdrds_26_tfmrprparid = AV92TFMRPrParId ;
      AV158Ingenieria_mrec_analisishdrds_27_tfmrprparid_to = AV93TFMRPrParId_To ;
      AV159Ingenieria_mrec_analisishdrds_28_tfmrprparcod = AV88TFMRPrParCod ;
      AV160Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to = AV89TFMRPrParCod_To ;
      AV161Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = AV90TFMRPrParDsc ;
      AV162Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel = AV91TFMRPrParDsc_Sel ;
      AV163Ingenieria_mrec_analisishdrds_32_tfmrprplc = AV86TFMRPrPLC ;
      AV164Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel = AV87TFMRPrPLC_Sel ;
      AV165Ingenieria_mrec_analisishdrds_34_tfmrprfec = AV78TFMRPrFec ;
      AV166Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = AV82TFMRPrValMin ;
      AV167Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel = AV83TFMRPrValMin_Sel ;
      AV168Ingenieria_mrec_analisishdrds_37_tfmrprval = AV80TFMRPrVal ;
      AV169Ingenieria_mrec_analisishdrds_38_tfmrprval_sel = AV81TFMRPrVal_Sel ;
      AV170Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = AV84TFMRPrValMax ;
      AV171Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel = AV85TFMRPrValMax_Sel ;
      AV172Ingenieria_mrec_analisishdrds_41_tfmrprer_sel = AV77TFMRPrEr_Sel ;
      AV173Ingenieria_mrec_analisishdrds_42_tfmrprfecev = AV94TFMRPrFecEv ;
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
         gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, AV29EmprCod, AV31UsurCod, AV45Desde, AV46Hasta, AV36Ip, AV47Now, AV37MTkn, AV32MaqCod, AV33FasCod, AV34Hdr, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV53TFEmprCod, AV54TFEmprCod_Sel, AV55TFBarCod, AV56TFBarCod_To, AV57TFBarCodReo, AV58TFBarCodReo_To, AV59TFBarCodPar, AV60TFBarCodPar_Sel, AV73TFMRPrHdr, AV74TFMRPrHdr_Sel, AV75TFMRPrHdr2, AV76TFMRPrHdr2_Sel, AV61TFMRPrOrd, AV62TFMRPrOrd_To, AV63TFMRPrLin, AV64TFMRPrLin_To, AV69TFMRPrMaqCod, AV70TFMRPrMaqCod_Sel, AV71TFMRPrMaqDsc, AV72TFMRPrMaqDsc_Sel, AV65TFMRPrFasCod, AV66TFMRPrFasCod_Sel, AV67TFMRPrFasDsc, AV68TFMRPrFasDsc_Sel, AV92TFMRPrParId, AV93TFMRPrParId_To, AV88TFMRPrParCod, AV89TFMRPrParCod_To, AV90TFMRPrParDsc, AV91TFMRPrParDsc_Sel, AV86TFMRPrPLC, AV87TFMRPrPLC_Sel, AV78TFMRPrFec, AV82TFMRPrValMin, AV83TFMRPrValMin_Sel, AV80TFMRPrVal, AV81TFMRPrVal_Sel, AV84TFMRPrValMax, AV85TFMRPrValMax_Sel, AV77TFMRPrEr_Sel, AV94TFMRPrFecEv, AV131Pgmname, AV48OrderedBy, AV49OrderedDsc, AV107inEmprCod, AV40MaqCodJSON, AV41FasCodJSON, AV42HdrJSON, AV108inUsurCod, AV126AntMrPrHdr2, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV132Ingenieria_mrec_analisishdrds_1_filterfulltext = AV12FilterFullText ;
      AV133Ingenieria_mrec_analisishdrds_2_tfemprcod = AV53TFEmprCod ;
      AV134Ingenieria_mrec_analisishdrds_3_tfemprcod_sel = AV54TFEmprCod_Sel ;
      AV135Ingenieria_mrec_analisishdrds_4_tfbarcod = AV55TFBarCod ;
      AV136Ingenieria_mrec_analisishdrds_5_tfbarcod_to = AV56TFBarCod_To ;
      AV137Ingenieria_mrec_analisishdrds_6_tfbarcodreo = AV57TFBarCodReo ;
      AV138Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to = AV58TFBarCodReo_To ;
      AV139Ingenieria_mrec_analisishdrds_8_tfbarcodpar = AV59TFBarCodPar ;
      AV140Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel = AV60TFBarCodPar_Sel ;
      AV141Ingenieria_mrec_analisishdrds_10_tfmrprhdr = AV73TFMRPrHdr ;
      AV142Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel = AV74TFMRPrHdr_Sel ;
      AV143Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = AV75TFMRPrHdr2 ;
      AV144Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel = AV76TFMRPrHdr2_Sel ;
      AV145Ingenieria_mrec_analisishdrds_14_tfmrprord = AV61TFMRPrOrd ;
      AV146Ingenieria_mrec_analisishdrds_15_tfmrprord_to = AV62TFMRPrOrd_To ;
      AV147Ingenieria_mrec_analisishdrds_16_tfmrprlin = AV63TFMRPrLin ;
      AV148Ingenieria_mrec_analisishdrds_17_tfmrprlin_to = AV64TFMRPrLin_To ;
      AV149Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = AV69TFMRPrMaqCod ;
      AV150Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel = AV70TFMRPrMaqCod_Sel ;
      AV151Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = AV71TFMRPrMaqDsc ;
      AV152Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel = AV72TFMRPrMaqDsc_Sel ;
      AV153Ingenieria_mrec_analisishdrds_22_tfmrprfascod = AV65TFMRPrFasCod ;
      AV154Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel = AV66TFMRPrFasCod_Sel ;
      AV155Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = AV67TFMRPrFasDsc ;
      AV156Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel = AV68TFMRPrFasDsc_Sel ;
      AV157Ingenieria_mrec_analisishdrds_26_tfmrprparid = AV92TFMRPrParId ;
      AV158Ingenieria_mrec_analisishdrds_27_tfmrprparid_to = AV93TFMRPrParId_To ;
      AV159Ingenieria_mrec_analisishdrds_28_tfmrprparcod = AV88TFMRPrParCod ;
      AV160Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to = AV89TFMRPrParCod_To ;
      AV161Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = AV90TFMRPrParDsc ;
      AV162Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel = AV91TFMRPrParDsc_Sel ;
      AV163Ingenieria_mrec_analisishdrds_32_tfmrprplc = AV86TFMRPrPLC ;
      AV164Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel = AV87TFMRPrPLC_Sel ;
      AV165Ingenieria_mrec_analisishdrds_34_tfmrprfec = AV78TFMRPrFec ;
      AV166Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = AV82TFMRPrValMin ;
      AV167Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel = AV83TFMRPrValMin_Sel ;
      AV168Ingenieria_mrec_analisishdrds_37_tfmrprval = AV80TFMRPrVal ;
      AV169Ingenieria_mrec_analisishdrds_38_tfmrprval_sel = AV81TFMRPrVal_Sel ;
      AV170Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = AV84TFMRPrValMax ;
      AV171Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel = AV85TFMRPrValMax_Sel ;
      AV172Ingenieria_mrec_analisishdrds_41_tfmrprer_sel = AV77TFMRPrEr_Sel ;
      AV173Ingenieria_mrec_analisishdrds_42_tfmrprfecev = AV94TFMRPrFecEv ;
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
         gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, AV29EmprCod, AV31UsurCod, AV45Desde, AV46Hasta, AV36Ip, AV47Now, AV37MTkn, AV32MaqCod, AV33FasCod, AV34Hdr, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV53TFEmprCod, AV54TFEmprCod_Sel, AV55TFBarCod, AV56TFBarCod_To, AV57TFBarCodReo, AV58TFBarCodReo_To, AV59TFBarCodPar, AV60TFBarCodPar_Sel, AV73TFMRPrHdr, AV74TFMRPrHdr_Sel, AV75TFMRPrHdr2, AV76TFMRPrHdr2_Sel, AV61TFMRPrOrd, AV62TFMRPrOrd_To, AV63TFMRPrLin, AV64TFMRPrLin_To, AV69TFMRPrMaqCod, AV70TFMRPrMaqCod_Sel, AV71TFMRPrMaqDsc, AV72TFMRPrMaqDsc_Sel, AV65TFMRPrFasCod, AV66TFMRPrFasCod_Sel, AV67TFMRPrFasDsc, AV68TFMRPrFasDsc_Sel, AV92TFMRPrParId, AV93TFMRPrParId_To, AV88TFMRPrParCod, AV89TFMRPrParCod_To, AV90TFMRPrParDsc, AV91TFMRPrParDsc_Sel, AV86TFMRPrPLC, AV87TFMRPrPLC_Sel, AV78TFMRPrFec, AV82TFMRPrValMin, AV83TFMRPrValMin_Sel, AV80TFMRPrVal, AV81TFMRPrVal_Sel, AV84TFMRPrValMax, AV85TFMRPrValMax_Sel, AV77TFMRPrEr_Sel, AV94TFMRPrFecEv, AV131Pgmname, AV48OrderedBy, AV49OrderedDsc, AV107inEmprCod, AV40MaqCodJSON, AV41FasCodJSON, AV42HdrJSON, AV108inUsurCod, AV126AntMrPrHdr2, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV132Ingenieria_mrec_analisishdrds_1_filterfulltext = AV12FilterFullText ;
      AV133Ingenieria_mrec_analisishdrds_2_tfemprcod = AV53TFEmprCod ;
      AV134Ingenieria_mrec_analisishdrds_3_tfemprcod_sel = AV54TFEmprCod_Sel ;
      AV135Ingenieria_mrec_analisishdrds_4_tfbarcod = AV55TFBarCod ;
      AV136Ingenieria_mrec_analisishdrds_5_tfbarcod_to = AV56TFBarCod_To ;
      AV137Ingenieria_mrec_analisishdrds_6_tfbarcodreo = AV57TFBarCodReo ;
      AV138Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to = AV58TFBarCodReo_To ;
      AV139Ingenieria_mrec_analisishdrds_8_tfbarcodpar = AV59TFBarCodPar ;
      AV140Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel = AV60TFBarCodPar_Sel ;
      AV141Ingenieria_mrec_analisishdrds_10_tfmrprhdr = AV73TFMRPrHdr ;
      AV142Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel = AV74TFMRPrHdr_Sel ;
      AV143Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = AV75TFMRPrHdr2 ;
      AV144Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel = AV76TFMRPrHdr2_Sel ;
      AV145Ingenieria_mrec_analisishdrds_14_tfmrprord = AV61TFMRPrOrd ;
      AV146Ingenieria_mrec_analisishdrds_15_tfmrprord_to = AV62TFMRPrOrd_To ;
      AV147Ingenieria_mrec_analisishdrds_16_tfmrprlin = AV63TFMRPrLin ;
      AV148Ingenieria_mrec_analisishdrds_17_tfmrprlin_to = AV64TFMRPrLin_To ;
      AV149Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = AV69TFMRPrMaqCod ;
      AV150Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel = AV70TFMRPrMaqCod_Sel ;
      AV151Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = AV71TFMRPrMaqDsc ;
      AV152Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel = AV72TFMRPrMaqDsc_Sel ;
      AV153Ingenieria_mrec_analisishdrds_22_tfmrprfascod = AV65TFMRPrFasCod ;
      AV154Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel = AV66TFMRPrFasCod_Sel ;
      AV155Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = AV67TFMRPrFasDsc ;
      AV156Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel = AV68TFMRPrFasDsc_Sel ;
      AV157Ingenieria_mrec_analisishdrds_26_tfmrprparid = AV92TFMRPrParId ;
      AV158Ingenieria_mrec_analisishdrds_27_tfmrprparid_to = AV93TFMRPrParId_To ;
      AV159Ingenieria_mrec_analisishdrds_28_tfmrprparcod = AV88TFMRPrParCod ;
      AV160Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to = AV89TFMRPrParCod_To ;
      AV161Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = AV90TFMRPrParDsc ;
      AV162Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel = AV91TFMRPrParDsc_Sel ;
      AV163Ingenieria_mrec_analisishdrds_32_tfmrprplc = AV86TFMRPrPLC ;
      AV164Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel = AV87TFMRPrPLC_Sel ;
      AV165Ingenieria_mrec_analisishdrds_34_tfmrprfec = AV78TFMRPrFec ;
      AV166Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = AV82TFMRPrValMin ;
      AV167Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel = AV83TFMRPrValMin_Sel ;
      AV168Ingenieria_mrec_analisishdrds_37_tfmrprval = AV80TFMRPrVal ;
      AV169Ingenieria_mrec_analisishdrds_38_tfmrprval_sel = AV81TFMRPrVal_Sel ;
      AV170Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = AV84TFMRPrValMax ;
      AV171Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel = AV85TFMRPrValMax_Sel ;
      AV172Ingenieria_mrec_analisishdrds_41_tfmrprer_sel = AV77TFMRPrEr_Sel ;
      AV173Ingenieria_mrec_analisishdrds_42_tfmrprfecev = AV94TFMRPrFecEv ;
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
         gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, AV29EmprCod, AV31UsurCod, AV45Desde, AV46Hasta, AV36Ip, AV47Now, AV37MTkn, AV32MaqCod, AV33FasCod, AV34Hdr, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV53TFEmprCod, AV54TFEmprCod_Sel, AV55TFBarCod, AV56TFBarCod_To, AV57TFBarCodReo, AV58TFBarCodReo_To, AV59TFBarCodPar, AV60TFBarCodPar_Sel, AV73TFMRPrHdr, AV74TFMRPrHdr_Sel, AV75TFMRPrHdr2, AV76TFMRPrHdr2_Sel, AV61TFMRPrOrd, AV62TFMRPrOrd_To, AV63TFMRPrLin, AV64TFMRPrLin_To, AV69TFMRPrMaqCod, AV70TFMRPrMaqCod_Sel, AV71TFMRPrMaqDsc, AV72TFMRPrMaqDsc_Sel, AV65TFMRPrFasCod, AV66TFMRPrFasCod_Sel, AV67TFMRPrFasDsc, AV68TFMRPrFasDsc_Sel, AV92TFMRPrParId, AV93TFMRPrParId_To, AV88TFMRPrParCod, AV89TFMRPrParCod_To, AV90TFMRPrParDsc, AV91TFMRPrParDsc_Sel, AV86TFMRPrPLC, AV87TFMRPrPLC_Sel, AV78TFMRPrFec, AV82TFMRPrValMin, AV83TFMRPrValMin_Sel, AV80TFMRPrVal, AV81TFMRPrVal_Sel, AV84TFMRPrValMax, AV85TFMRPrValMax_Sel, AV77TFMRPrEr_Sel, AV94TFMRPrFecEv, AV131Pgmname, AV48OrderedBy, AV49OrderedDsc, AV107inEmprCod, AV40MaqCodJSON, AV41FasCodJSON, AV42HdrJSON, AV108inUsurCod, AV126AntMrPrHdr2, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV132Ingenieria_mrec_analisishdrds_1_filterfulltext = AV12FilterFullText ;
      AV133Ingenieria_mrec_analisishdrds_2_tfemprcod = AV53TFEmprCod ;
      AV134Ingenieria_mrec_analisishdrds_3_tfemprcod_sel = AV54TFEmprCod_Sel ;
      AV135Ingenieria_mrec_analisishdrds_4_tfbarcod = AV55TFBarCod ;
      AV136Ingenieria_mrec_analisishdrds_5_tfbarcod_to = AV56TFBarCod_To ;
      AV137Ingenieria_mrec_analisishdrds_6_tfbarcodreo = AV57TFBarCodReo ;
      AV138Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to = AV58TFBarCodReo_To ;
      AV139Ingenieria_mrec_analisishdrds_8_tfbarcodpar = AV59TFBarCodPar ;
      AV140Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel = AV60TFBarCodPar_Sel ;
      AV141Ingenieria_mrec_analisishdrds_10_tfmrprhdr = AV73TFMRPrHdr ;
      AV142Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel = AV74TFMRPrHdr_Sel ;
      AV143Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = AV75TFMRPrHdr2 ;
      AV144Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel = AV76TFMRPrHdr2_Sel ;
      AV145Ingenieria_mrec_analisishdrds_14_tfmrprord = AV61TFMRPrOrd ;
      AV146Ingenieria_mrec_analisishdrds_15_tfmrprord_to = AV62TFMRPrOrd_To ;
      AV147Ingenieria_mrec_analisishdrds_16_tfmrprlin = AV63TFMRPrLin ;
      AV148Ingenieria_mrec_analisishdrds_17_tfmrprlin_to = AV64TFMRPrLin_To ;
      AV149Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = AV69TFMRPrMaqCod ;
      AV150Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel = AV70TFMRPrMaqCod_Sel ;
      AV151Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = AV71TFMRPrMaqDsc ;
      AV152Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel = AV72TFMRPrMaqDsc_Sel ;
      AV153Ingenieria_mrec_analisishdrds_22_tfmrprfascod = AV65TFMRPrFasCod ;
      AV154Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel = AV66TFMRPrFasCod_Sel ;
      AV155Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = AV67TFMRPrFasDsc ;
      AV156Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel = AV68TFMRPrFasDsc_Sel ;
      AV157Ingenieria_mrec_analisishdrds_26_tfmrprparid = AV92TFMRPrParId ;
      AV158Ingenieria_mrec_analisishdrds_27_tfmrprparid_to = AV93TFMRPrParId_To ;
      AV159Ingenieria_mrec_analisishdrds_28_tfmrprparcod = AV88TFMRPrParCod ;
      AV160Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to = AV89TFMRPrParCod_To ;
      AV161Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = AV90TFMRPrParDsc ;
      AV162Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel = AV91TFMRPrParDsc_Sel ;
      AV163Ingenieria_mrec_analisishdrds_32_tfmrprplc = AV86TFMRPrPLC ;
      AV164Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel = AV87TFMRPrPLC_Sel ;
      AV165Ingenieria_mrec_analisishdrds_34_tfmrprfec = AV78TFMRPrFec ;
      AV166Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = AV82TFMRPrValMin ;
      AV167Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel = AV83TFMRPrValMin_Sel ;
      AV168Ingenieria_mrec_analisishdrds_37_tfmrprval = AV80TFMRPrVal ;
      AV169Ingenieria_mrec_analisishdrds_38_tfmrprval_sel = AV81TFMRPrVal_Sel ;
      AV170Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = AV84TFMRPrValMax ;
      AV171Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel = AV85TFMRPrValMax_Sel ;
      AV172Ingenieria_mrec_analisishdrds_41_tfmrprer_sel = AV77TFMRPrEr_Sel ;
      AV173Ingenieria_mrec_analisishdrds_42_tfmrprfecev = AV94TFMRPrFecEv ;
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
         gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, AV29EmprCod, AV31UsurCod, AV45Desde, AV46Hasta, AV36Ip, AV47Now, AV37MTkn, AV32MaqCod, AV33FasCod, AV34Hdr, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV53TFEmprCod, AV54TFEmprCod_Sel, AV55TFBarCod, AV56TFBarCod_To, AV57TFBarCodReo, AV58TFBarCodReo_To, AV59TFBarCodPar, AV60TFBarCodPar_Sel, AV73TFMRPrHdr, AV74TFMRPrHdr_Sel, AV75TFMRPrHdr2, AV76TFMRPrHdr2_Sel, AV61TFMRPrOrd, AV62TFMRPrOrd_To, AV63TFMRPrLin, AV64TFMRPrLin_To, AV69TFMRPrMaqCod, AV70TFMRPrMaqCod_Sel, AV71TFMRPrMaqDsc, AV72TFMRPrMaqDsc_Sel, AV65TFMRPrFasCod, AV66TFMRPrFasCod_Sel, AV67TFMRPrFasDsc, AV68TFMRPrFasDsc_Sel, AV92TFMRPrParId, AV93TFMRPrParId_To, AV88TFMRPrParCod, AV89TFMRPrParCod_To, AV90TFMRPrParDsc, AV91TFMRPrParDsc_Sel, AV86TFMRPrPLC, AV87TFMRPrPLC_Sel, AV78TFMRPrFec, AV82TFMRPrValMin, AV83TFMRPrValMin_Sel, AV80TFMRPrVal, AV81TFMRPrVal_Sel, AV84TFMRPrValMax, AV85TFMRPrValMax_Sel, AV77TFMRPrEr_Sel, AV94TFMRPrFecEv, AV131Pgmname, AV48OrderedBy, AV49OrderedDsc, AV107inEmprCod, AV40MaqCodJSON, AV41FasCodJSON, AV42HdrJSON, AV108inUsurCod, AV126AntMrPrHdr2, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV131Pgmname = "Ingenieria.MRec_AnalisisHdr" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131Pgmname", AV131Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavBartipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBartipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipcol_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavTotvaluemrprhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemrprhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemrprhdr_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2DX0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e172DX2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV21ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV24DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV18ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_39 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_39"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV26GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV27GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV107inEmprCod = httpContext.cgiGet( sPrefix+"wcpOAV107inEmprCod") ;
         wcpOAV40MaqCodJSON = httpContext.cgiGet( sPrefix+"wcpOAV40MaqCodJSON") ;
         wcpOAV41FasCodJSON = httpContext.cgiGet( sPrefix+"wcpOAV41FasCodJSON") ;
         wcpOAV42HdrJSON = httpContext.cgiGet( sPrefix+"wcpOAV42HdrJSON") ;
         wcpOAV45Desde = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV45Desde"), 0) ;
         wcpOAV46Hasta = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV46Hasta"), 0) ;
         wcpOAV108inUsurCod = httpContext.cgiGet( sPrefix+"wcpOAV108inUsurCod") ;
         wcpOAV36Ip = httpContext.cgiGet( sPrefix+"wcpOAV36Ip") ;
         wcpOAV47Now = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV47Now"), 0) ;
         wcpOAV37MTkn = httpContext.cgiGet( sPrefix+"wcpOAV37MTkn") ;
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
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
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
         AV12FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
         AV106TotValueMRPrHdr = httpContext.cgiGet( edtavTotvaluemrprhdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106TotValueMRPrHdr", AV106TotValueMRPrHdr);
         AV131Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131Pgmname", AV131Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_mrprfecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_MRPRFECAUXDATE");
            GX_FocusControl = edtavDdo_mrprfecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV79DDO_MRPrFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79DDO_MRPrFecAuxDate", localUtil.format(AV79DDO_MRPrFecAuxDate, "99/99/99"));
         }
         else
         {
            AV79DDO_MRPrFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_mrprfecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79DDO_MRPrFecAuxDate", localUtil.format(AV79DDO_MRPrFecAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_mrprfecevauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_MRPRFECEVAUXDATE");
            GX_FocusControl = edtavDdo_mrprfecevauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV95DDO_MRPrFecEvAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95DDO_MRPrFecEvAuxDate", localUtil.format(AV95DDO_MRPrFecEvAuxDate, "99/99/99"));
         }
         else
         {
            AV95DDO_MRPrFecEvAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_mrprfecevauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95DDO_MRPrFecEvAuxDate", localUtil.format(AV95DDO_MRPrFecEvAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MRec_AnalisisHdr");
         AV131Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131Pgmname", AV131Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV131Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("ingenieria\\mrec_analisishdr:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV12FilterFullText) != 0 )
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
      e172DX2 ();
      if (returnInSub) return;
   }

   public void e172DX2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV32MaqCod.fromJSonString(AV40MaqCodJSON, null);
      AV33FasCod.fromJSonString(AV41FasCodJSON, null);
      AV34Hdr.fromJSonString(AV42HdrJSON, null);
      AV126AntMrPrHdr2 = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126AntMrPrHdr2", AV126AntMrPrHdr2);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vANTMRPRHDR2", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV126AntMrPrHdr2, ""))));
      GXt_char1 = AV28Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      mrec_analisishdr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28Station = GXt_char1 ;
      GXv_char2[0] = AV29EmprCod ;
      GXv_char3[0] = AV30EmprNom ;
      GXv_char4[0] = AV31UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV28Station, GXv_char2, GXv_char3, GXv_char4) ;
      mrec_analisishdr_impl.this.AV29EmprCod = GXv_char2[0] ;
      mrec_analisishdr_impl.this.AV30EmprNom = GXv_char3[0] ;
      mrec_analisishdr_impl.this.AV31UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29EmprCod", AV29EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31UsurCod", AV31UsurCod);
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
      if ( AV48OrderedBy < 1 )
      {
         AV48OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV24DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV24DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      AV31UsurCod = AV108inUsurCod ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31UsurCod", AV31UsurCod);
      AV29EmprCod = AV107inEmprCod ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29EmprCod", AV29EmprCod);
      AV35ParFasCod.clear();
   }

   public void e182DX2( )
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
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV20Session.getValue("Ingenieria.MRec_AnalisisHdrColumnsSelector"), "") != 0 )
      {
         AV16ColumnsSelectorXML = AV20Session.getValue("Ingenieria.MRec_AnalisisHdrColumnsSelector") ;
         AV18ColumnsSelector.fromxml(AV16ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtEmprCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtBarCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtBarCodReo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCodReo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtBarCodPar_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCodPar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMRPrHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMRPrHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrHdr_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMRPrHdr2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMRPrHdr2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrHdr2_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMRPrOrd_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMRPrOrd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrOrd_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMRPrLin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMRPrLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrLin_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMRPrMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMRPrMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrMaqCod_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMRPrMaqDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMRPrMaqDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrMaqDsc_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMRPrFasCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMRPrFasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrFasCod_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMRPrFasDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMRPrFasDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrFasDsc_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMRPrParId_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMRPrParId_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrParId_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMRPrParCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMRPrParCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrParCod_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMRPrParDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMRPrParDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrParDsc_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMRPrPLC_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMRPrPLC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrPLC_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMRPrFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMRPrFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrFec_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMRPrValMin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMRPrValMin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrValMin_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMRPrVal_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMRPrVal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrVal_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMRPrValMax_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMRPrValMax_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrValMax_Visible), 5, 0), !bGXsfl_39_Refreshing);
      chkMRPrEr.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkMRPrEr.getInternalname(), "Visible", GXutil.ltrimstr( chkMRPrEr.getVisible(), 5, 0), !bGXsfl_39_Refreshing);
      edtMRPrFecEv_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMRPrFecEv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPrFecEv_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtavClicod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtavClinom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtavBarser_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarser_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtavBarserdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarserdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtavBarcolnum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcolnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtavBarcolnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcolnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtavBartipcol_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBartipcol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipcol_Visible), 5, 0), !bGXsfl_39_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      AV26GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridCurrentPage), 10, 0));
      AV27GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S182 ();
      if (returnInSub) return;
      AV126AntMrPrHdr2 = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126AntMrPrHdr2", AV126AntMrPrHdr2);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vANTMRPRHDR2", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV126AntMrPrHdr2, ""))));
      AV132Ingenieria_mrec_analisishdrds_1_filterfulltext = AV12FilterFullText ;
      AV133Ingenieria_mrec_analisishdrds_2_tfemprcod = AV53TFEmprCod ;
      AV134Ingenieria_mrec_analisishdrds_3_tfemprcod_sel = AV54TFEmprCod_Sel ;
      AV135Ingenieria_mrec_analisishdrds_4_tfbarcod = AV55TFBarCod ;
      AV136Ingenieria_mrec_analisishdrds_5_tfbarcod_to = AV56TFBarCod_To ;
      AV137Ingenieria_mrec_analisishdrds_6_tfbarcodreo = AV57TFBarCodReo ;
      AV138Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to = AV58TFBarCodReo_To ;
      AV139Ingenieria_mrec_analisishdrds_8_tfbarcodpar = AV59TFBarCodPar ;
      AV140Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel = AV60TFBarCodPar_Sel ;
      AV141Ingenieria_mrec_analisishdrds_10_tfmrprhdr = AV73TFMRPrHdr ;
      AV142Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel = AV74TFMRPrHdr_Sel ;
      AV143Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = AV75TFMRPrHdr2 ;
      AV144Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel = AV76TFMRPrHdr2_Sel ;
      AV145Ingenieria_mrec_analisishdrds_14_tfmrprord = AV61TFMRPrOrd ;
      AV146Ingenieria_mrec_analisishdrds_15_tfmrprord_to = AV62TFMRPrOrd_To ;
      AV147Ingenieria_mrec_analisishdrds_16_tfmrprlin = AV63TFMRPrLin ;
      AV148Ingenieria_mrec_analisishdrds_17_tfmrprlin_to = AV64TFMRPrLin_To ;
      AV149Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = AV69TFMRPrMaqCod ;
      AV150Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel = AV70TFMRPrMaqCod_Sel ;
      AV151Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = AV71TFMRPrMaqDsc ;
      AV152Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel = AV72TFMRPrMaqDsc_Sel ;
      AV153Ingenieria_mrec_analisishdrds_22_tfmrprfascod = AV65TFMRPrFasCod ;
      AV154Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel = AV66TFMRPrFasCod_Sel ;
      AV155Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = AV67TFMRPrFasDsc ;
      AV156Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel = AV68TFMRPrFasDsc_Sel ;
      AV157Ingenieria_mrec_analisishdrds_26_tfmrprparid = AV92TFMRPrParId ;
      AV158Ingenieria_mrec_analisishdrds_27_tfmrprparid_to = AV93TFMRPrParId_To ;
      AV159Ingenieria_mrec_analisishdrds_28_tfmrprparcod = AV88TFMRPrParCod ;
      AV160Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to = AV89TFMRPrParCod_To ;
      AV161Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = AV90TFMRPrParDsc ;
      AV162Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel = AV91TFMRPrParDsc_Sel ;
      AV163Ingenieria_mrec_analisishdrds_32_tfmrprplc = AV86TFMRPrPLC ;
      AV164Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel = AV87TFMRPrPLC_Sel ;
      AV165Ingenieria_mrec_analisishdrds_34_tfmrprfec = AV78TFMRPrFec ;
      AV166Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = AV82TFMRPrValMin ;
      AV167Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel = AV83TFMRPrValMin_Sel ;
      AV168Ingenieria_mrec_analisishdrds_37_tfmrprval = AV80TFMRPrVal ;
      AV169Ingenieria_mrec_analisishdrds_38_tfmrprval_sel = AV81TFMRPrVal_Sel ;
      AV170Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = AV84TFMRPrValMax ;
      AV171Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel = AV85TFMRPrValMax_Sel ;
      AV172Ingenieria_mrec_analisishdrds_41_tfmrprer_sel = AV77TFMRPrEr_Sel ;
      AV173Ingenieria_mrec_analisishdrds_42_tfmrprfecev = AV94TFMRPrFecEv ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e122DX2( )
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

   public void e132DX2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e142DX2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV48OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48OrderedBy), 4, 0));
         AV49OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49OrderedDsc", AV49OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EmprCod") == 0 )
         {
            AV53TFEmprCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFEmprCod", AV53TFEmprCod);
            AV54TFEmprCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFEmprCod_Sel", AV54TFEmprCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCod") == 0 )
         {
            AV55TFBarCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFBarCod), 8, 0));
            AV56TFBarCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFBarCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCodReo") == 0 )
         {
            AV57TFBarCodReo = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFBarCodReo", GXutil.str( AV57TFBarCodReo, 1, 0));
            AV58TFBarCodReo_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFBarCodReo_To", GXutil.str( AV58TFBarCodReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCodPar") == 0 )
         {
            AV59TFBarCodPar = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFBarCodPar", AV59TFBarCodPar);
            AV60TFBarCodPar_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFBarCodPar_Sel", AV60TFBarCodPar_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRPrHdr") == 0 )
         {
            AV73TFMRPrHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFMRPrHdr", AV73TFMRPrHdr);
            AV74TFMRPrHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFMRPrHdr_Sel", AV74TFMRPrHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRPrHdr2") == 0 )
         {
            AV75TFMRPrHdr2 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFMRPrHdr2", AV75TFMRPrHdr2);
            AV76TFMRPrHdr2_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFMRPrHdr2_Sel", AV76TFMRPrHdr2_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRPrOrd") == 0 )
         {
            AV61TFMRPrOrd = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFMRPrOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFMRPrOrd), 4, 0));
            AV62TFMRPrOrd_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFMRPrOrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFMRPrOrd_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRPrLin") == 0 )
         {
            AV63TFMRPrLin = GXutil.lval( Ddo_grid_Filteredtext_get) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFMRPrLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFMRPrLin), 12, 0));
            AV64TFMRPrLin_To = GXutil.lval( Ddo_grid_Filteredtextto_get) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFMRPrLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFMRPrLin_To), 12, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRPrMaqCod") == 0 )
         {
            AV69TFMRPrMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFMRPrMaqCod", AV69TFMRPrMaqCod);
            AV70TFMRPrMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFMRPrMaqCod_Sel", AV70TFMRPrMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRPrMaqDsc") == 0 )
         {
            AV71TFMRPrMaqDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFMRPrMaqDsc", AV71TFMRPrMaqDsc);
            AV72TFMRPrMaqDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFMRPrMaqDsc_Sel", AV72TFMRPrMaqDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRPrFasCod") == 0 )
         {
            AV65TFMRPrFasCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFMRPrFasCod", AV65TFMRPrFasCod);
            AV66TFMRPrFasCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFMRPrFasCod_Sel", AV66TFMRPrFasCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRPrFasDsc") == 0 )
         {
            AV67TFMRPrFasDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFMRPrFasDsc", AV67TFMRPrFasDsc);
            AV68TFMRPrFasDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFMRPrFasDsc_Sel", AV68TFMRPrFasDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRPrParId") == 0 )
         {
            AV92TFMRPrParId = GXutil.lval( Ddo_grid_Filteredtext_get) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TFMRPrParId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92TFMRPrParId), 10, 0));
            AV93TFMRPrParId_To = GXutil.lval( Ddo_grid_Filteredtextto_get) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFMRPrParId_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93TFMRPrParId_To), 10, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRPrParCod") == 0 )
         {
            AV88TFMRPrParCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFMRPrParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88TFMRPrParCod), 4, 0));
            AV89TFMRPrParCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFMRPrParCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89TFMRPrParCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRPrParDsc") == 0 )
         {
            AV90TFMRPrParDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFMRPrParDsc", AV90TFMRPrParDsc);
            AV91TFMRPrParDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFMRPrParDsc_Sel", AV91TFMRPrParDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRPrPLC") == 0 )
         {
            AV86TFMRPrPLC = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFMRPrPLC", AV86TFMRPrPLC);
            AV87TFMRPrPLC_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TFMRPrPLC_Sel", AV87TFMRPrPLC_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRPrFec") == 0 )
         {
            AV78TFMRPrFec = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFMRPrFec", localUtil.ttoc( AV78TFMRPrFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRPrValMin") == 0 )
         {
            AV82TFMRPrValMin = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFMRPrValMin", AV82TFMRPrValMin);
            AV83TFMRPrValMin_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFMRPrValMin_Sel", AV83TFMRPrValMin_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRPrVal") == 0 )
         {
            AV80TFMRPrVal = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFMRPrVal", AV80TFMRPrVal);
            AV81TFMRPrVal_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFMRPrVal_Sel", AV81TFMRPrVal_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRPrValMax") == 0 )
         {
            AV84TFMRPrValMax = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFMRPrValMax", AV84TFMRPrValMax);
            AV85TFMRPrValMax_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFMRPrValMax_Sel", AV85TFMRPrValMax_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRPrEr") == 0 )
         {
            AV77TFMRPrEr_Sel = (byte)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFMRPrEr_Sel", GXutil.str( AV77TFMRPrEr_Sel, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRPrFecEv") == 0 )
         {
            AV94TFMRPrFecEv = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TFMRPrFecEv", localUtil.ttoc( AV94TFMRPrFecEv, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e192DX2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV126AntMrPrHdr2, A14754MRPrHdr2) != 0 )
      {
         GXt_boolean8 = AV116Existe ;
         GXv_int9[0] = AV111CliCod ;
         GXv_char4[0] = AV112CliNom ;
         GXv_char3[0] = AV117BarSer ;
         GXv_char2[0] = AV118BarSerDsc ;
         GXv_int10[0] = AV120BarColNum ;
         GXv_char11[0] = AV121BarColNom ;
         GXv_int12[0] = AV119BarTipCol ;
         GXv_boolean13[0] = GXt_boolean8 ;
         new app.ingenieria.barcadaget(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int9, GXv_char4, GXv_char3, GXv_char2, GXv_int10, GXv_char11, GXv_int12, GXv_boolean13) ;
         mrec_analisishdr_impl.this.AV111CliCod = GXv_int9[0] ;
         mrec_analisishdr_impl.this.AV112CliNom = GXv_char4[0] ;
         mrec_analisishdr_impl.this.AV117BarSer = GXv_char3[0] ;
         mrec_analisishdr_impl.this.AV118BarSerDsc = GXv_char2[0] ;
         mrec_analisishdr_impl.this.AV120BarColNum = GXv_int10[0] ;
         mrec_analisishdr_impl.this.AV121BarColNom = GXv_char11[0] ;
         mrec_analisishdr_impl.this.AV119BarTipCol = GXv_int12[0] ;
         mrec_analisishdr_impl.this.GXt_boolean8 = GXv_boolean13[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavClinom_Internalname, AV112CliNom);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarser_Internalname, AV117BarSer);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarserdsc_Internalname, AV118BarSerDsc);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcolnum_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV120BarColNum), 6, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcolnom_Internalname, AV121BarColNom);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBartipcol_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV119BarTipCol), 2, 0));
         AV116Existe = GXt_boolean8 ;
         AV126AntMrPrHdr2 = A14754MRPrHdr2 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126AntMrPrHdr2", AV126AntMrPrHdr2);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vANTMRPRHDR2", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV126AntMrPrHdr2, ""))));
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(39) ;
      }
      sendrow_392( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_39_Refreshing )
      {
         httpContext.doAjaxLoad(39, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e152DX2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV16ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV18ColumnsSelector.fromJSonString(AV16ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Ingenieria.MRec_AnalisisHdrColumnsSelector", ((GXutil.strcmp("", AV16ColumnsSelectorXML)==0) ? "" : AV18ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e112DX2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S192 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("Ingenieria.MRec_AnalisisHdrFilters")),GXutil.URLEncode(GXutil.rtrim(AV131Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("Ingenieria.MRec_AnalisisHdrFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV22ManageFiltersXml ;
         GXv_char11[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "Ingenieria.MRec_AnalisisHdrFilters", Ddo_managefilters_Activeeventkey, GXv_char11) ;
         mrec_analisishdr_impl.this.GXt_char1 = GXv_char11[0] ;
         AV22ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV22ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S192 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV131Pgmname+"GridState", AV22ManageFiltersXml) ;
            AV10GridState.fromxml(AV22ManageFiltersXml, null, null);
            AV48OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48OrderedBy), 4, 0));
            AV49OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49OrderedDsc", AV49OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S202 ();
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

   public void e162DX2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char11[0] = AV14ExcelFilename ;
      GXv_char4[0] = AV15ErrorMessage ;
      new app.ingenieria.mrec_analisishdrexport(remoteHandle, context).execute( AV107inEmprCod, AV40MaqCodJSON, AV41FasCodJSON, AV42HdrJSON, AV45Desde, AV46Hasta, AV108inUsurCod, AV36Ip, AV47Now, AV37MTkn, GXv_char11, GXv_char4) ;
      mrec_analisishdr_impl.this.AV14ExcelFilename = GXv_char11[0] ;
      mrec_analisishdr_impl.this.AV15ErrorMessage = GXv_char4[0] ;
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

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV48OrderedBy, 4, 0))+":"+(AV49OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV18ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "EmprCod", "", "Empresa", false, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarCod", "", "Codigo Barcada", false, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarCodReo", "", "Codigo Reoperado Barcada", false, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarCodPar", "", "Codigo Particion Barcada", false, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrHdr", "", "Hdr", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrHdr2", "", "Hdr", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrOrd", "", "Orden", false, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrLin", "", "Lìnea", false, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrMaqCod", "", "Cod. Máquina", false, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrMaqDsc", "", "Máquina", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrFasCod", "", "Cód. Fase", false, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrFasDsc", "", "Fase", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrParId", "", "Parametro Id", false, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrParCod", "", "Cód Parametro", false, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrParDsc", "", "Parametro", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrPLC", "", "c/PLC", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrFec", "", "Registrado", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrValMin", "", "Val Min", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrVal", "", "Valor", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrValMax", "", "Val Max", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrEr", "", "Error", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MRPrFecEv", "", "Evaluado", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&CliCod", "", "Cod. Cliente", false, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&CliNom", "", "Cliente", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&BarSer", "", "Cod. Articulo", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&BarSerDsc", "", "Articulo", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&BarColNum", "", "Nro Color", false, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&BarColNom", "", "Color", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&BarTipCol", "", "Cod Tipo Color", false, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXt_char1 = AV17UserCustomValue ;
      GXv_char11[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Ingenieria.MRec_AnalisisHdrColumnsSelector", GXv_char11) ;
      mrec_analisishdr_impl.this.GXt_char1 = GXv_char11[0] ;
      AV17UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV17UserCustomValue)==0) ) )
      {
         AV19ColumnsSelectorAux.fromxml(AV17UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector14[0] = AV19ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector15[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, GXv_SdtWWPColumnsSelector15) ;
         AV19ColumnsSelectorAux = GXv_SdtWWPColumnsSelector14[0] ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = AV21ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "Ingenieria.MRec_AnalisisHdrFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[0] ;
      AV21ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
   }

   public void S192( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV12FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
      AV53TFEmprCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFEmprCod", AV53TFEmprCod);
      AV54TFEmprCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFEmprCod_Sel", AV54TFEmprCod_Sel);
      AV55TFBarCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFBarCod), 8, 0));
      AV56TFBarCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFBarCod_To), 8, 0));
      AV57TFBarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFBarCodReo", GXutil.str( AV57TFBarCodReo, 1, 0));
      AV58TFBarCodReo_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFBarCodReo_To", GXutil.str( AV58TFBarCodReo_To, 1, 0));
      AV59TFBarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFBarCodPar", AV59TFBarCodPar);
      AV60TFBarCodPar_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFBarCodPar_Sel", AV60TFBarCodPar_Sel);
      AV73TFMRPrHdr = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFMRPrHdr", AV73TFMRPrHdr);
      AV74TFMRPrHdr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFMRPrHdr_Sel", AV74TFMRPrHdr_Sel);
      AV75TFMRPrHdr2 = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFMRPrHdr2", AV75TFMRPrHdr2);
      AV76TFMRPrHdr2_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFMRPrHdr2_Sel", AV76TFMRPrHdr2_Sel);
      AV61TFMRPrOrd = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFMRPrOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFMRPrOrd), 4, 0));
      AV62TFMRPrOrd_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFMRPrOrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFMRPrOrd_To), 4, 0));
      AV63TFMRPrLin = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFMRPrLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFMRPrLin), 12, 0));
      AV64TFMRPrLin_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFMRPrLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFMRPrLin_To), 12, 0));
      AV69TFMRPrMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFMRPrMaqCod", AV69TFMRPrMaqCod);
      AV70TFMRPrMaqCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFMRPrMaqCod_Sel", AV70TFMRPrMaqCod_Sel);
      AV71TFMRPrMaqDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFMRPrMaqDsc", AV71TFMRPrMaqDsc);
      AV72TFMRPrMaqDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFMRPrMaqDsc_Sel", AV72TFMRPrMaqDsc_Sel);
      AV65TFMRPrFasCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFMRPrFasCod", AV65TFMRPrFasCod);
      AV66TFMRPrFasCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFMRPrFasCod_Sel", AV66TFMRPrFasCod_Sel);
      AV67TFMRPrFasDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFMRPrFasDsc", AV67TFMRPrFasDsc);
      AV68TFMRPrFasDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFMRPrFasDsc_Sel", AV68TFMRPrFasDsc_Sel);
      AV92TFMRPrParId = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TFMRPrParId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92TFMRPrParId), 10, 0));
      AV93TFMRPrParId_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFMRPrParId_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93TFMRPrParId_To), 10, 0));
      AV88TFMRPrParCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFMRPrParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88TFMRPrParCod), 4, 0));
      AV89TFMRPrParCod_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFMRPrParCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89TFMRPrParCod_To), 4, 0));
      AV90TFMRPrParDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFMRPrParDsc", AV90TFMRPrParDsc);
      AV91TFMRPrParDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFMRPrParDsc_Sel", AV91TFMRPrParDsc_Sel);
      AV86TFMRPrPLC = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFMRPrPLC", AV86TFMRPrPLC);
      AV87TFMRPrPLC_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TFMRPrPLC_Sel", AV87TFMRPrPLC_Sel);
      AV78TFMRPrFec = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFMRPrFec", localUtil.ttoc( AV78TFMRPrFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV82TFMRPrValMin = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFMRPrValMin", AV82TFMRPrValMin);
      AV83TFMRPrValMin_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFMRPrValMin_Sel", AV83TFMRPrValMin_Sel);
      AV80TFMRPrVal = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFMRPrVal", AV80TFMRPrVal);
      AV81TFMRPrVal_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFMRPrVal_Sel", AV81TFMRPrVal_Sel);
      AV84TFMRPrValMax = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFMRPrValMax", AV84TFMRPrValMax);
      AV85TFMRPrValMax_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFMRPrValMax_Sel", AV85TFMRPrValMax_Sel);
      AV77TFMRPrEr_Sel = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFMRPrEr_Sel", GXutil.str( AV77TFMRPrEr_Sel, 1, 0));
      AV94TFMRPrFecEv = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TFMRPrFecEv", localUtil.ttoc( AV94TFMRPrFecEv, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      if ( GXutil.strcmp(AV20Session.getValue(AV131Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV131Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV20Session.getValue(AV131Pgmname+"GridState"), null, null);
      }
      AV48OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48OrderedBy), 4, 0));
      AV49OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49OrderedDsc", AV49OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S202 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S202( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV174GXV1 = 1 ;
      while ( AV174GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV174GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV53TFEmprCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFEmprCod", AV53TFEmprCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV54TFEmprCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFEmprCod_Sel", AV54TFEmprCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV55TFBarCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFBarCod), 8, 0));
            AV56TFBarCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFBarCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV57TFBarCodReo = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFBarCodReo", GXutil.str( AV57TFBarCodReo, 1, 0));
            AV58TFBarCodReo_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFBarCodReo_To", GXutil.str( AV58TFBarCodReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV59TFBarCodPar = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFBarCodPar", AV59TFBarCodPar);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV60TFBarCodPar_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFBarCodPar_Sel", AV60TFBarCodPar_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRHDR") == 0 )
         {
            AV73TFMRPrHdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFMRPrHdr", AV73TFMRPrHdr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRHDR_SEL") == 0 )
         {
            AV74TFMRPrHdr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFMRPrHdr_Sel", AV74TFMRPrHdr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRHDR2") == 0 )
         {
            AV75TFMRPrHdr2 = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFMRPrHdr2", AV75TFMRPrHdr2);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRHDR2_SEL") == 0 )
         {
            AV76TFMRPrHdr2_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFMRPrHdr2_Sel", AV76TFMRPrHdr2_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRORD") == 0 )
         {
            AV61TFMRPrOrd = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFMRPrOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFMRPrOrd), 4, 0));
            AV62TFMRPrOrd_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFMRPrOrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFMRPrOrd_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRLIN") == 0 )
         {
            AV63TFMRPrLin = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFMRPrLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFMRPrLin), 12, 0));
            AV64TFMRPrLin_To = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFMRPrLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFMRPrLin_To), 12, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRMAQCOD") == 0 )
         {
            AV69TFMRPrMaqCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFMRPrMaqCod", AV69TFMRPrMaqCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRMAQCOD_SEL") == 0 )
         {
            AV70TFMRPrMaqCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFMRPrMaqCod_Sel", AV70TFMRPrMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRMAQDSC") == 0 )
         {
            AV71TFMRPrMaqDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFMRPrMaqDsc", AV71TFMRPrMaqDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRMAQDSC_SEL") == 0 )
         {
            AV72TFMRPrMaqDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFMRPrMaqDsc_Sel", AV72TFMRPrMaqDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRFASCOD") == 0 )
         {
            AV65TFMRPrFasCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFMRPrFasCod", AV65TFMRPrFasCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRFASCOD_SEL") == 0 )
         {
            AV66TFMRPrFasCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFMRPrFasCod_Sel", AV66TFMRPrFasCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRFASDSC") == 0 )
         {
            AV67TFMRPrFasDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFMRPrFasDsc", AV67TFMRPrFasDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRFASDSC_SEL") == 0 )
         {
            AV68TFMRPrFasDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFMRPrFasDsc_Sel", AV68TFMRPrFasDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRPARID") == 0 )
         {
            AV92TFMRPrParId = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TFMRPrParId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92TFMRPrParId), 10, 0));
            AV93TFMRPrParId_To = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFMRPrParId_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93TFMRPrParId_To), 10, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRPARCOD") == 0 )
         {
            AV88TFMRPrParCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFMRPrParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88TFMRPrParCod), 4, 0));
            AV89TFMRPrParCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFMRPrParCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89TFMRPrParCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRPARDSC") == 0 )
         {
            AV90TFMRPrParDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFMRPrParDsc", AV90TFMRPrParDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRPARDSC_SEL") == 0 )
         {
            AV91TFMRPrParDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFMRPrParDsc_Sel", AV91TFMRPrParDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRPLC") == 0 )
         {
            AV86TFMRPrPLC = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFMRPrPLC", AV86TFMRPrPLC);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRPLC_SEL") == 0 )
         {
            AV87TFMRPrPLC_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TFMRPrPLC_Sel", AV87TFMRPrPLC_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRFEC") == 0 )
         {
            AV78TFMRPrFec = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFMRPrFec", localUtil.ttoc( AV78TFMRPrFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV79DDO_MRPrFecAuxDate = GXutil.resetTime(AV78TFMRPrFec) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79DDO_MRPrFecAuxDate", localUtil.format(AV79DDO_MRPrFecAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRVALMIN") == 0 )
         {
            AV82TFMRPrValMin = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFMRPrValMin", AV82TFMRPrValMin);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRVALMIN_SEL") == 0 )
         {
            AV83TFMRPrValMin_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFMRPrValMin_Sel", AV83TFMRPrValMin_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRVAL") == 0 )
         {
            AV80TFMRPrVal = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFMRPrVal", AV80TFMRPrVal);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRVAL_SEL") == 0 )
         {
            AV81TFMRPrVal_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFMRPrVal_Sel", AV81TFMRPrVal_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRVALMAX") == 0 )
         {
            AV84TFMRPrValMax = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFMRPrValMax", AV84TFMRPrValMax);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRVALMAX_SEL") == 0 )
         {
            AV85TFMRPrValMax_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFMRPrValMax_Sel", AV85TFMRPrValMax_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRER_SEL") == 0 )
         {
            AV77TFMRPrEr_Sel = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFMRPrEr_Sel", GXutil.str( AV77TFMRPrEr_Sel, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRFECEV") == 0 )
         {
            AV94TFMRPrFecEv = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TFMRPrFecEv", localUtil.ttoc( AV94TFMRPrFecEv, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV95DDO_MRPrFecEvAuxDate = GXutil.resetTime(AV94TFMRPrFecEv) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95DDO_MRPrFecEvAuxDate", localUtil.format(AV95DDO_MRPrFecEvAuxDate, "99/99/99"));
         }
         AV174GXV1 = (int)(AV174GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char11[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFEmprCod_Sel)==0), AV54TFEmprCod_Sel, GXv_char11) ;
      mrec_analisishdr_impl.this.GXt_char1 = GXv_char11[0] ;
      GXt_char18 = "" ;
      GXv_char4[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFBarCodPar_Sel)==0), AV60TFBarCodPar_Sel, GXv_char4) ;
      mrec_analisishdr_impl.this.GXt_char18 = GXv_char4[0] ;
      GXt_char19 = "" ;
      GXv_char3[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV74TFMRPrHdr_Sel)==0), AV74TFMRPrHdr_Sel, GXv_char3) ;
      mrec_analisishdr_impl.this.GXt_char19 = GXv_char3[0] ;
      GXt_char20 = "" ;
      GXv_char2[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV76TFMRPrHdr2_Sel)==0), AV76TFMRPrHdr2_Sel, GXv_char2) ;
      mrec_analisishdr_impl.this.GXt_char20 = GXv_char2[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV70TFMRPrMaqCod_Sel)==0), AV70TFMRPrMaqCod_Sel, GXv_char22) ;
      mrec_analisishdr_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV72TFMRPrMaqDsc_Sel)==0), AV72TFMRPrMaqDsc_Sel, GXv_char24) ;
      mrec_analisishdr_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV66TFMRPrFasCod_Sel)==0), AV66TFMRPrFasCod_Sel, GXv_char26) ;
      mrec_analisishdr_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFMRPrFasDsc_Sel)==0), AV68TFMRPrFasDsc_Sel, GXv_char28) ;
      mrec_analisishdr_impl.this.GXt_char27 = GXv_char28[0] ;
      GXt_char29 = "" ;
      GXv_char30[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV91TFMRPrParDsc_Sel)==0), AV91TFMRPrParDsc_Sel, GXv_char30) ;
      mrec_analisishdr_impl.this.GXt_char29 = GXv_char30[0] ;
      GXt_char31 = "" ;
      GXv_char32[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV87TFMRPrPLC_Sel)==0), AV87TFMRPrPLC_Sel, GXv_char32) ;
      mrec_analisishdr_impl.this.GXt_char31 = GXv_char32[0] ;
      GXt_char33 = "" ;
      GXv_char34[0] = GXt_char33 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV83TFMRPrValMin_Sel)==0), AV83TFMRPrValMin_Sel, GXv_char34) ;
      mrec_analisishdr_impl.this.GXt_char33 = GXv_char34[0] ;
      GXt_char35 = "" ;
      GXv_char36[0] = GXt_char35 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV81TFMRPrVal_Sel)==0), AV81TFMRPrVal_Sel, GXv_char36) ;
      mrec_analisishdr_impl.this.GXt_char35 = GXv_char36[0] ;
      GXt_char37 = "" ;
      GXv_char38[0] = GXt_char37 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV85TFMRPrValMax_Sel)==0), AV85TFMRPrValMax_Sel, GXv_char38) ;
      mrec_analisishdr_impl.this.GXt_char37 = GXv_char38[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|||"+GXt_char18+"|"+GXt_char19+"|"+GXt_char20+"|||"+GXt_char21+"|"+GXt_char23+"|"+GXt_char25+"|"+GXt_char27+"|||"+GXt_char29+"|"+GXt_char31+"||"+GXt_char33+"|"+GXt_char35+"|"+GXt_char37+"|"+((0==AV77TFMRPrEr_Sel) ? "" : GXutil.str( AV77TFMRPrEr_Sel, 1, 0))+"||||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char37 = "" ;
      GXv_char38[0] = GXt_char37 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFEmprCod)==0), AV53TFEmprCod, GXv_char38) ;
      mrec_analisishdr_impl.this.GXt_char37 = GXv_char38[0] ;
      GXt_char35 = "" ;
      GXv_char36[0] = GXt_char35 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFBarCodPar)==0), AV59TFBarCodPar, GXv_char36) ;
      mrec_analisishdr_impl.this.GXt_char35 = GXv_char36[0] ;
      GXt_char33 = "" ;
      GXv_char34[0] = GXt_char33 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV73TFMRPrHdr)==0), AV73TFMRPrHdr, GXv_char34) ;
      mrec_analisishdr_impl.this.GXt_char33 = GXv_char34[0] ;
      GXt_char31 = "" ;
      GXv_char32[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV75TFMRPrHdr2)==0), AV75TFMRPrHdr2, GXv_char32) ;
      mrec_analisishdr_impl.this.GXt_char31 = GXv_char32[0] ;
      GXt_char29 = "" ;
      GXv_char30[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV69TFMRPrMaqCod)==0), AV69TFMRPrMaqCod, GXv_char30) ;
      mrec_analisishdr_impl.this.GXt_char29 = GXv_char30[0] ;
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV71TFMRPrMaqDsc)==0), AV71TFMRPrMaqDsc, GXv_char28) ;
      mrec_analisishdr_impl.this.GXt_char27 = GXv_char28[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFMRPrFasCod)==0), AV65TFMRPrFasCod, GXv_char26) ;
      mrec_analisishdr_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV67TFMRPrFasDsc)==0), AV67TFMRPrFasDsc, GXv_char24) ;
      mrec_analisishdr_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV90TFMRPrParDsc)==0), AV90TFMRPrParDsc, GXv_char22) ;
      mrec_analisishdr_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char20 = "" ;
      GXv_char11[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV86TFMRPrPLC)==0), AV86TFMRPrPLC, GXv_char11) ;
      mrec_analisishdr_impl.this.GXt_char20 = GXv_char11[0] ;
      GXt_char19 = "" ;
      GXv_char4[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV82TFMRPrValMin)==0), AV82TFMRPrValMin, GXv_char4) ;
      mrec_analisishdr_impl.this.GXt_char19 = GXv_char4[0] ;
      GXt_char18 = "" ;
      GXv_char3[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV80TFMRPrVal)==0), AV80TFMRPrVal, GXv_char3) ;
      mrec_analisishdr_impl.this.GXt_char18 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV84TFMRPrValMax)==0), AV84TFMRPrValMax, GXv_char2) ;
      mrec_analisishdr_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char37+"|"+((0==AV55TFBarCod) ? "" : GXutil.str( AV55TFBarCod, 8, 0))+"|"+((0==AV57TFBarCodReo) ? "" : GXutil.str( AV57TFBarCodReo, 1, 0))+"|"+GXt_char35+"|"+GXt_char33+"|"+GXt_char31+"|"+((0==AV61TFMRPrOrd) ? "" : GXutil.str( AV61TFMRPrOrd, 4, 0))+"|"+((0==AV63TFMRPrLin) ? "" : GXutil.str( AV63TFMRPrLin, 12, 0))+"|"+GXt_char29+"|"+GXt_char27+"|"+GXt_char25+"|"+GXt_char23+"|"+((0==AV92TFMRPrParId) ? "" : GXutil.str( AV92TFMRPrParId, 10, 0))+"|"+((0==AV88TFMRPrParCod) ? "" : GXutil.str( AV88TFMRPrParCod, 4, 0))+"|"+GXt_char21+"|"+GXt_char20+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV78TFMRPrFec) ? "" : localUtil.dtoc( AV79DDO_MRPrFecAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char19+"|"+GXt_char18+"|"+GXt_char1+"||"+(GXutil.dateCompare(GXutil.nullDate(), AV94TFMRPrFecEv) ? "" : localUtil.dtoc( AV95DDO_MRPrFecEvAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV56TFBarCod_To) ? "" : GXutil.str( AV56TFBarCod_To, 8, 0))+"|"+((0==AV58TFBarCodReo_To) ? "" : GXutil.str( AV58TFBarCodReo_To, 1, 0))+"||||"+((0==AV62TFMRPrOrd_To) ? "" : GXutil.str( AV62TFMRPrOrd_To, 4, 0))+"|"+((0==AV64TFMRPrLin_To) ? "" : GXutil.str( AV64TFMRPrLin_To, 12, 0))+"|||||"+((0==AV93TFMRPrParId_To) ? "" : GXutil.str( AV93TFMRPrParId_To, 10, 0))+"|"+((0==AV89TFMRPrParCod_To) ? "" : GXutil.str( AV89TFMRPrParCod_To, 4, 0))+"|||||||||||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV20Session.getValue(AV131Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV48OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV49OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState39[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV12FilterFullText)==0), (short)(0), AV12FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFEMPRCOD", "", !(GXutil.strcmp("", AV53TFEmprCod)==0), (short)(0), AV53TFEmprCod, "", !(GXutil.strcmp("", AV54TFEmprCod_Sel)==0), AV54TFEmprCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFBARCOD", "", !((0==AV55TFBarCod)&&(0==AV56TFBarCod_To)), (short)(0), GXutil.trim( GXutil.str( AV55TFBarCod, 8, 0)), GXutil.trim( GXutil.str( AV56TFBarCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFBARCODREO", "", !((0==AV57TFBarCodReo)&&(0==AV58TFBarCodReo_To)), (short)(0), GXutil.trim( GXutil.str( AV57TFBarCodReo, 1, 0)), GXutil.trim( GXutil.str( AV58TFBarCodReo_To, 1, 0))) ;
      AV10GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFBARCODPAR", "", !(GXutil.strcmp("", AV59TFBarCodPar)==0), (short)(0), AV59TFBarCodPar, "", !(GXutil.strcmp("", AV60TFBarCodPar_Sel)==0), AV60TFBarCodPar_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFMRPRHDR", "", !(GXutil.strcmp("", AV73TFMRPrHdr)==0), (short)(0), AV73TFMRPrHdr, "", !(GXutil.strcmp("", AV74TFMRPrHdr_Sel)==0), AV74TFMRPrHdr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFMRPRHDR2", "", !(GXutil.strcmp("", AV75TFMRPrHdr2)==0), (short)(0), AV75TFMRPrHdr2, "", !(GXutil.strcmp("", AV76TFMRPrHdr2_Sel)==0), AV76TFMRPrHdr2_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFMRPRORD", "", !((0==AV61TFMRPrOrd)&&(0==AV62TFMRPrOrd_To)), (short)(0), GXutil.trim( GXutil.str( AV61TFMRPrOrd, 4, 0)), GXutil.trim( GXutil.str( AV62TFMRPrOrd_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFMRPRLIN", "", !((0==AV63TFMRPrLin)&&(0==AV64TFMRPrLin_To)), (short)(0), GXutil.trim( GXutil.str( AV63TFMRPrLin, 12, 0)), GXutil.trim( GXutil.str( AV64TFMRPrLin_To, 12, 0))) ;
      AV10GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFMRPRMAQCOD", "", !(GXutil.strcmp("", AV69TFMRPrMaqCod)==0), (short)(0), AV69TFMRPrMaqCod, "", !(GXutil.strcmp("", AV70TFMRPrMaqCod_Sel)==0), AV70TFMRPrMaqCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFMRPRMAQDSC", "", !(GXutil.strcmp("", AV71TFMRPrMaqDsc)==0), (short)(0), AV71TFMRPrMaqDsc, "", !(GXutil.strcmp("", AV72TFMRPrMaqDsc_Sel)==0), AV72TFMRPrMaqDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFMRPRFASCOD", "", !(GXutil.strcmp("", AV65TFMRPrFasCod)==0), (short)(0), AV65TFMRPrFasCod, "", !(GXutil.strcmp("", AV66TFMRPrFasCod_Sel)==0), AV66TFMRPrFasCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFMRPRFASDSC", "", !(GXutil.strcmp("", AV67TFMRPrFasDsc)==0), (short)(0), AV67TFMRPrFasDsc, "", !(GXutil.strcmp("", AV68TFMRPrFasDsc_Sel)==0), AV68TFMRPrFasDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFMRPRPARID", "", !((0==AV92TFMRPrParId)&&(0==AV93TFMRPrParId_To)), (short)(0), GXutil.trim( GXutil.str( AV92TFMRPrParId, 10, 0)), GXutil.trim( GXutil.str( AV93TFMRPrParId_To, 10, 0))) ;
      AV10GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFMRPRPARCOD", "", !((0==AV88TFMRPrParCod)&&(0==AV89TFMRPrParCod_To)), (short)(0), GXutil.trim( GXutil.str( AV88TFMRPrParCod, 4, 0)), GXutil.trim( GXutil.str( AV89TFMRPrParCod_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFMRPRPARDSC", "", !(GXutil.strcmp("", AV90TFMRPrParDsc)==0), (short)(0), AV90TFMRPrParDsc, "", !(GXutil.strcmp("", AV91TFMRPrParDsc_Sel)==0), AV91TFMRPrParDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFMRPRPLC", "", !(GXutil.strcmp("", AV86TFMRPrPLC)==0), (short)(0), AV86TFMRPrPLC, "", !(GXutil.strcmp("", AV87TFMRPrPLC_Sel)==0), AV87TFMRPrPLC_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFMRPRFEC", "", !GXutil.dateCompare(GXutil.nullDate(), AV78TFMRPrFec), (short)(0), GXutil.trim( localUtil.ttoc( AV78TFMRPrFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFMRPRVALMIN", "", !(GXutil.strcmp("", AV82TFMRPrValMin)==0), (short)(0), AV82TFMRPrValMin, "", !(GXutil.strcmp("", AV83TFMRPrValMin_Sel)==0), AV83TFMRPrValMin_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFMRPRVAL", "", !(GXutil.strcmp("", AV80TFMRPrVal)==0), (short)(0), AV80TFMRPrVal, "", !(GXutil.strcmp("", AV81TFMRPrVal_Sel)==0), AV81TFMRPrVal_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFMRPRVALMAX", "", !(GXutil.strcmp("", AV84TFMRPrValMax)==0), (short)(0), AV84TFMRPrValMax, "", !(GXutil.strcmp("", AV85TFMRPrValMax_Sel)==0), AV85TFMRPrValMax_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFMRPRER_SEL", "", !(0==AV77TFMRPrEr_Sel), (short)(0), GXutil.trim( GXutil.str( AV77TFMRPrEr_Sel, 1, 0)), "") ;
      AV10GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFMRPRFECEV", "", !GXutil.dateCompare(GXutil.nullDate(), AV94TFMRPrFecEv), (short)(0), GXutil.trim( localUtil.ttoc( AV94TFMRPrFecEv, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState39[0] ;
      if ( ! (GXutil.strcmp("", AV107inEmprCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INEMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV107inEmprCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV40MaqCodJSON)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MAQCODJSON" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV40MaqCodJSON );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV41FasCodJSON)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FASCODJSON" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV41FasCodJSON );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV42HdrJSON)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HDRJSON" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV42HdrJSON );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV45Desde) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&DESDE" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.ttoc( AV45Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV46Hasta) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HASTA" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.ttoc( AV46Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV108inUsurCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INUSURCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV108inUsurCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV36Ip)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&IP" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV36Ip );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV47Now) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&NOW" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.ttoc( AV47Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV37MTkn)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MTKN" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV37MTkn );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV131Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV131Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Ingenieria.MRPr" );
      AV20Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S172( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV105TotMRPrHdr = 0 ;
   }

   public void S182( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV105TotMRPrHdr = subgrid_fnc_recordcount( ) ;
      AV106TotValueMRPrHdr = httpContext.getMessage( "WWP_TotalizerCount", "") + localUtil.format( DecimalUtil.doubleToDec(AV105TotMRPrHdr), "ZZZ,ZZZ,ZZZ,ZZZ,ZZZ,ZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106TotValueMRPrHdr", AV106TotValueMRPrHdr);
   }

   public void wb_table2_76_2DX2( boolean wbgen )
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
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluemrprhdr_Internalname, httpContext.getMessage( "Tot Value MRPr Hdr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluemrprhdr_Internalname, AV106TotValueMRPrHdr, GXutil.rtrim( localUtil.format( AV106TotValueMRPrHdr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluemrprhdr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluemrprhdr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRec_AnalisisHdr.htm");
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
         wb_table2_76_2DX2e( true) ;
      }
      else
      {
         wb_table2_76_2DX2e( false) ;
      }
   }

   public void wb_table1_21_2DX2( boolean wbgen )
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
         wb_table3_26_2DX2( true) ;
      }
      else
      {
         wb_table3_26_2DX2( false) ;
      }
      return  ;
   }

   public void wb_table3_26_2DX2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_21_2DX2e( true) ;
      }
      else
      {
         wb_table1_21_2DX2e( false) ;
      }
   }

   public void wb_table3_26_2DX2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV12FilterFullText, GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_Ingenieria\\MRec_AnalisisHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_26_2DX2e( true) ;
      }
      else
      {
         wb_table3_26_2DX2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV107inEmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107inEmprCod", AV107inEmprCod);
      AV40MaqCodJSON = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40MaqCodJSON", AV40MaqCodJSON);
      AV41FasCodJSON = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41FasCodJSON", AV41FasCodJSON);
      AV42HdrJSON = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42HdrJSON", AV42HdrJSON);
      AV45Desde = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Desde", localUtil.ttoc( AV45Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV46Hasta = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46Hasta", localUtil.ttoc( AV46Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV108inUsurCod = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108inUsurCod", AV108inUsurCod);
      AV36Ip = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Ip", AV36Ip);
      AV47Now = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Now", localUtil.ttoc( AV47Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV37MTkn = (String)getParm(obj,9,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37MTkn", AV37MTkn);
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
      pa2DX2( ) ;
      ws2DX2( ) ;
      we2DX2( ) ;
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
      sCtrlAV107inEmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV40MaqCodJSON = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV41FasCodJSON = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV42HdrJSON = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV45Desde = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV46Hasta = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV108inUsurCod = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV36Ip = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV47Now = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV37MTkn = (String)getParm(obj,9,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2DX2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "ingenieria\\mrec_analisishdr", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2DX2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV107inEmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107inEmprCod", AV107inEmprCod);
         AV40MaqCodJSON = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40MaqCodJSON", AV40MaqCodJSON);
         AV41FasCodJSON = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41FasCodJSON", AV41FasCodJSON);
         AV42HdrJSON = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42HdrJSON", AV42HdrJSON);
         AV45Desde = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Desde", localUtil.ttoc( AV45Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV46Hasta = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46Hasta", localUtil.ttoc( AV46Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV108inUsurCod = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108inUsurCod", AV108inUsurCod);
         AV36Ip = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Ip", AV36Ip);
         AV47Now = (java.util.Date)getParm(obj,10,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Now", localUtil.ttoc( AV47Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV37MTkn = (String)getParm(obj,11,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37MTkn", AV37MTkn);
      }
      wcpOAV107inEmprCod = httpContext.cgiGet( sPrefix+"wcpOAV107inEmprCod") ;
      wcpOAV40MaqCodJSON = httpContext.cgiGet( sPrefix+"wcpOAV40MaqCodJSON") ;
      wcpOAV41FasCodJSON = httpContext.cgiGet( sPrefix+"wcpOAV41FasCodJSON") ;
      wcpOAV42HdrJSON = httpContext.cgiGet( sPrefix+"wcpOAV42HdrJSON") ;
      wcpOAV45Desde = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV45Desde"), 0) ;
      wcpOAV46Hasta = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV46Hasta"), 0) ;
      wcpOAV108inUsurCod = httpContext.cgiGet( sPrefix+"wcpOAV108inUsurCod") ;
      wcpOAV36Ip = httpContext.cgiGet( sPrefix+"wcpOAV36Ip") ;
      wcpOAV47Now = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV47Now"), 0) ;
      wcpOAV37MTkn = httpContext.cgiGet( sPrefix+"wcpOAV37MTkn") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV107inEmprCod, wcpOAV107inEmprCod) != 0 ) || ( GXutil.strcmp(AV40MaqCodJSON, wcpOAV40MaqCodJSON) != 0 ) || ( GXutil.strcmp(AV41FasCodJSON, wcpOAV41FasCodJSON) != 0 ) || ( GXutil.strcmp(AV42HdrJSON, wcpOAV42HdrJSON) != 0 ) || !( GXutil.dateCompare(AV45Desde, wcpOAV45Desde) ) || !( GXutil.dateCompare(AV46Hasta, wcpOAV46Hasta) ) || ( GXutil.strcmp(AV108inUsurCod, wcpOAV108inUsurCod) != 0 ) || ( GXutil.strcmp(AV36Ip, wcpOAV36Ip) != 0 ) || !( GXutil.dateCompare(AV47Now, wcpOAV47Now) ) || ( GXutil.strcmp(AV37MTkn, wcpOAV37MTkn) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV107inEmprCod = AV107inEmprCod ;
      wcpOAV40MaqCodJSON = AV40MaqCodJSON ;
      wcpOAV41FasCodJSON = AV41FasCodJSON ;
      wcpOAV42HdrJSON = AV42HdrJSON ;
      wcpOAV45Desde = AV45Desde ;
      wcpOAV46Hasta = AV46Hasta ;
      wcpOAV108inUsurCod = AV108inUsurCod ;
      wcpOAV36Ip = AV36Ip ;
      wcpOAV47Now = AV47Now ;
      wcpOAV37MTkn = AV37MTkn ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV107inEmprCod = httpContext.cgiGet( sPrefix+"AV107inEmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV107inEmprCod) > 0 )
      {
         AV107inEmprCod = httpContext.cgiGet( sCtrlAV107inEmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107inEmprCod", AV107inEmprCod);
      }
      else
      {
         AV107inEmprCod = httpContext.cgiGet( sPrefix+"AV107inEmprCod_PARM") ;
      }
      sCtrlAV40MaqCodJSON = httpContext.cgiGet( sPrefix+"AV40MaqCodJSON_CTRL") ;
      if ( GXutil.len( sCtrlAV40MaqCodJSON) > 0 )
      {
         AV40MaqCodJSON = httpContext.cgiGet( sCtrlAV40MaqCodJSON) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40MaqCodJSON", AV40MaqCodJSON);
      }
      else
      {
         AV40MaqCodJSON = httpContext.cgiGet( sPrefix+"AV40MaqCodJSON_PARM") ;
      }
      sCtrlAV41FasCodJSON = httpContext.cgiGet( sPrefix+"AV41FasCodJSON_CTRL") ;
      if ( GXutil.len( sCtrlAV41FasCodJSON) > 0 )
      {
         AV41FasCodJSON = httpContext.cgiGet( sCtrlAV41FasCodJSON) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41FasCodJSON", AV41FasCodJSON);
      }
      else
      {
         AV41FasCodJSON = httpContext.cgiGet( sPrefix+"AV41FasCodJSON_PARM") ;
      }
      sCtrlAV42HdrJSON = httpContext.cgiGet( sPrefix+"AV42HdrJSON_CTRL") ;
      if ( GXutil.len( sCtrlAV42HdrJSON) > 0 )
      {
         AV42HdrJSON = httpContext.cgiGet( sCtrlAV42HdrJSON) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42HdrJSON", AV42HdrJSON);
      }
      else
      {
         AV42HdrJSON = httpContext.cgiGet( sPrefix+"AV42HdrJSON_PARM") ;
      }
      sCtrlAV45Desde = httpContext.cgiGet( sPrefix+"AV45Desde_CTRL") ;
      if ( GXutil.len( sCtrlAV45Desde) > 0 )
      {
         AV45Desde = localUtil.ctot( httpContext.cgiGet( sCtrlAV45Desde), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Desde", localUtil.ttoc( AV45Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV45Desde = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV45Desde_PARM"), 0) ;
      }
      sCtrlAV46Hasta = httpContext.cgiGet( sPrefix+"AV46Hasta_CTRL") ;
      if ( GXutil.len( sCtrlAV46Hasta) > 0 )
      {
         AV46Hasta = localUtil.ctot( httpContext.cgiGet( sCtrlAV46Hasta), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46Hasta", localUtil.ttoc( AV46Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV46Hasta = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV46Hasta_PARM"), 0) ;
      }
      sCtrlAV108inUsurCod = httpContext.cgiGet( sPrefix+"AV108inUsurCod_CTRL") ;
      if ( GXutil.len( sCtrlAV108inUsurCod) > 0 )
      {
         AV108inUsurCod = httpContext.cgiGet( sCtrlAV108inUsurCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108inUsurCod", AV108inUsurCod);
      }
      else
      {
         AV108inUsurCod = httpContext.cgiGet( sPrefix+"AV108inUsurCod_PARM") ;
      }
      sCtrlAV36Ip = httpContext.cgiGet( sPrefix+"AV36Ip_CTRL") ;
      if ( GXutil.len( sCtrlAV36Ip) > 0 )
      {
         AV36Ip = httpContext.cgiGet( sCtrlAV36Ip) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Ip", AV36Ip);
      }
      else
      {
         AV36Ip = httpContext.cgiGet( sPrefix+"AV36Ip_PARM") ;
      }
      sCtrlAV47Now = httpContext.cgiGet( sPrefix+"AV47Now_CTRL") ;
      if ( GXutil.len( sCtrlAV47Now) > 0 )
      {
         AV47Now = localUtil.ctot( httpContext.cgiGet( sCtrlAV47Now), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Now", localUtil.ttoc( AV47Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV47Now = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV47Now_PARM"), 0) ;
      }
      sCtrlAV37MTkn = httpContext.cgiGet( sPrefix+"AV37MTkn_CTRL") ;
      if ( GXutil.len( sCtrlAV37MTkn) > 0 )
      {
         AV37MTkn = httpContext.cgiGet( sCtrlAV37MTkn) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37MTkn", AV37MTkn);
      }
      else
      {
         AV37MTkn = httpContext.cgiGet( sPrefix+"AV37MTkn_PARM") ;
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
      pa2DX2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2DX2( ) ;
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
      ws2DX2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV107inEmprCod_PARM", GXutil.rtrim( AV107inEmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV107inEmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV107inEmprCod_CTRL", GXutil.rtrim( sCtrlAV107inEmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40MaqCodJSON_PARM", AV40MaqCodJSON);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV40MaqCodJSON)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40MaqCodJSON_CTRL", GXutil.rtrim( sCtrlAV40MaqCodJSON));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41FasCodJSON_PARM", AV41FasCodJSON);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV41FasCodJSON)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41FasCodJSON_CTRL", GXutil.rtrim( sCtrlAV41FasCodJSON));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42HdrJSON_PARM", AV42HdrJSON);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV42HdrJSON)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42HdrJSON_CTRL", GXutil.rtrim( sCtrlAV42HdrJSON));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45Desde_PARM", localUtil.ttoc( AV45Desde, 10, 12, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV45Desde)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45Desde_CTRL", GXutil.rtrim( sCtrlAV45Desde));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46Hasta_PARM", localUtil.ttoc( AV46Hasta, 10, 12, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV46Hasta)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46Hasta_CTRL", GXutil.rtrim( sCtrlAV46Hasta));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV108inUsurCod_PARM", GXutil.rtrim( AV108inUsurCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV108inUsurCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV108inUsurCod_CTRL", GXutil.rtrim( sCtrlAV108inUsurCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36Ip_PARM", AV36Ip);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV36Ip)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36Ip_CTRL", GXutil.rtrim( sCtrlAV36Ip));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47Now_PARM", localUtil.ttoc( AV47Now, 10, 12, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV47Now)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47Now_CTRL", GXutil.rtrim( sCtrlAV47Now));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37MTkn_PARM", AV37MTkn);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV37MTkn)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37MTkn_CTRL", GXutil.rtrim( sCtrlAV37MTkn));
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
      we2DX2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115552280", true, true);
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
      httpContext.AddJavascriptSource("ingenieria/mrec_analisishdr.js", "?202682115552281", false, true);
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

   public void subsflControlProps_392( )
   {
      edtMRPrId_Internalname = sPrefix+"MRPRID_"+sGXsfl_39_idx ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_39_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_39_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_39_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_39_idx ;
      edtMRPrHdr_Internalname = sPrefix+"MRPRHDR_"+sGXsfl_39_idx ;
      edtMRPrHdr2_Internalname = sPrefix+"MRPRHDR2_"+sGXsfl_39_idx ;
      edtMRPrOrd_Internalname = sPrefix+"MRPRORD_"+sGXsfl_39_idx ;
      edtMRPrLin_Internalname = sPrefix+"MRPRLIN_"+sGXsfl_39_idx ;
      edtMRPrMaqCod_Internalname = sPrefix+"MRPRMAQCOD_"+sGXsfl_39_idx ;
      edtMRPrMaqDsc_Internalname = sPrefix+"MRPRMAQDSC_"+sGXsfl_39_idx ;
      edtMRPrFasCod_Internalname = sPrefix+"MRPRFASCOD_"+sGXsfl_39_idx ;
      edtMRPrFasDsc_Internalname = sPrefix+"MRPRFASDSC_"+sGXsfl_39_idx ;
      edtMRPrParId_Internalname = sPrefix+"MRPRPARID_"+sGXsfl_39_idx ;
      edtMRPrParCod_Internalname = sPrefix+"MRPRPARCOD_"+sGXsfl_39_idx ;
      edtMRPrParDsc_Internalname = sPrefix+"MRPRPARDSC_"+sGXsfl_39_idx ;
      edtMRPrPLC_Internalname = sPrefix+"MRPRPLC_"+sGXsfl_39_idx ;
      edtMRPrFec_Internalname = sPrefix+"MRPRFEC_"+sGXsfl_39_idx ;
      edtMRPrValMin_Internalname = sPrefix+"MRPRVALMIN_"+sGXsfl_39_idx ;
      edtMRPrVal_Internalname = sPrefix+"MRPRVAL_"+sGXsfl_39_idx ;
      edtMRPrValMax_Internalname = sPrefix+"MRPRVALMAX_"+sGXsfl_39_idx ;
      chkMRPrEr.setInternalname( sPrefix+"MRPRER_"+sGXsfl_39_idx );
      edtMRPrFecEv_Internalname = sPrefix+"MRPRFECEV_"+sGXsfl_39_idx ;
      edtMRPrUsu_Internalname = sPrefix+"MRPRUSU_"+sGXsfl_39_idx ;
      edtMRPrIp_Internalname = sPrefix+"MRPRIP_"+sGXsfl_39_idx ;
      edtMRPrReg_Internalname = sPrefix+"MRPRREG_"+sGXsfl_39_idx ;
      edtMRPrTkn_Internalname = sPrefix+"MRPRTKN_"+sGXsfl_39_idx ;
      edtavClicod_Internalname = sPrefix+"vCLICOD_"+sGXsfl_39_idx ;
      edtavClinom_Internalname = sPrefix+"vCLINOM_"+sGXsfl_39_idx ;
      edtavBarser_Internalname = sPrefix+"vBARSER_"+sGXsfl_39_idx ;
      edtavBarserdsc_Internalname = sPrefix+"vBARSERDSC_"+sGXsfl_39_idx ;
      edtavBarcolnum_Internalname = sPrefix+"vBARCOLNUM_"+sGXsfl_39_idx ;
      edtavBarcolnom_Internalname = sPrefix+"vBARCOLNOM_"+sGXsfl_39_idx ;
      edtavBartipcol_Internalname = sPrefix+"vBARTIPCOL_"+sGXsfl_39_idx ;
   }

   public void subsflControlProps_fel_392( )
   {
      edtMRPrId_Internalname = sPrefix+"MRPRID_"+sGXsfl_39_fel_idx ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_39_fel_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_39_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_39_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_39_fel_idx ;
      edtMRPrHdr_Internalname = sPrefix+"MRPRHDR_"+sGXsfl_39_fel_idx ;
      edtMRPrHdr2_Internalname = sPrefix+"MRPRHDR2_"+sGXsfl_39_fel_idx ;
      edtMRPrOrd_Internalname = sPrefix+"MRPRORD_"+sGXsfl_39_fel_idx ;
      edtMRPrLin_Internalname = sPrefix+"MRPRLIN_"+sGXsfl_39_fel_idx ;
      edtMRPrMaqCod_Internalname = sPrefix+"MRPRMAQCOD_"+sGXsfl_39_fel_idx ;
      edtMRPrMaqDsc_Internalname = sPrefix+"MRPRMAQDSC_"+sGXsfl_39_fel_idx ;
      edtMRPrFasCod_Internalname = sPrefix+"MRPRFASCOD_"+sGXsfl_39_fel_idx ;
      edtMRPrFasDsc_Internalname = sPrefix+"MRPRFASDSC_"+sGXsfl_39_fel_idx ;
      edtMRPrParId_Internalname = sPrefix+"MRPRPARID_"+sGXsfl_39_fel_idx ;
      edtMRPrParCod_Internalname = sPrefix+"MRPRPARCOD_"+sGXsfl_39_fel_idx ;
      edtMRPrParDsc_Internalname = sPrefix+"MRPRPARDSC_"+sGXsfl_39_fel_idx ;
      edtMRPrPLC_Internalname = sPrefix+"MRPRPLC_"+sGXsfl_39_fel_idx ;
      edtMRPrFec_Internalname = sPrefix+"MRPRFEC_"+sGXsfl_39_fel_idx ;
      edtMRPrValMin_Internalname = sPrefix+"MRPRVALMIN_"+sGXsfl_39_fel_idx ;
      edtMRPrVal_Internalname = sPrefix+"MRPRVAL_"+sGXsfl_39_fel_idx ;
      edtMRPrValMax_Internalname = sPrefix+"MRPRVALMAX_"+sGXsfl_39_fel_idx ;
      chkMRPrEr.setInternalname( sPrefix+"MRPRER_"+sGXsfl_39_fel_idx );
      edtMRPrFecEv_Internalname = sPrefix+"MRPRFECEV_"+sGXsfl_39_fel_idx ;
      edtMRPrUsu_Internalname = sPrefix+"MRPRUSU_"+sGXsfl_39_fel_idx ;
      edtMRPrIp_Internalname = sPrefix+"MRPRIP_"+sGXsfl_39_fel_idx ;
      edtMRPrReg_Internalname = sPrefix+"MRPRREG_"+sGXsfl_39_fel_idx ;
      edtMRPrTkn_Internalname = sPrefix+"MRPRTKN_"+sGXsfl_39_fel_idx ;
      edtavClicod_Internalname = sPrefix+"vCLICOD_"+sGXsfl_39_fel_idx ;
      edtavClinom_Internalname = sPrefix+"vCLINOM_"+sGXsfl_39_fel_idx ;
      edtavBarser_Internalname = sPrefix+"vBARSER_"+sGXsfl_39_fel_idx ;
      edtavBarserdsc_Internalname = sPrefix+"vBARSERDSC_"+sGXsfl_39_fel_idx ;
      edtavBarcolnum_Internalname = sPrefix+"vBARCOLNUM_"+sGXsfl_39_fel_idx ;
      edtavBarcolnom_Internalname = sPrefix+"vBARCOLNOM_"+sGXsfl_39_fel_idx ;
      edtavBartipcol_Internalname = sPrefix+"vBARTIPCOL_"+sGXsfl_39_fel_idx ;
   }

   public void sendrow_392( )
   {
      subsflControlProps_392( ) ;
      wb2DX0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_39_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_39_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_39_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRPrId_Internalname,GXutil.ltrim( localUtil.ntoc( A14681MRPrId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14681MRPrId), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRPrId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"AnticipacionErrores\\Id","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtEmprCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtEmprCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarCodReo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarCodReo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarCodPar_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarCodPar_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMRPrHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRPrHdr_Internalname,GXutil.rtrim( A14755MRPrHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRPrHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMRPrHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"Ingenieria\\Hdr","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMRPrHdr2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRPrHdr2_Internalname,A14754MRPrHdr2,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRPrHdr2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMRPrHdr2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMRPrOrd_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRPrOrd_Internalname,GXutil.ltrim( localUtil.ntoc( A14761MRPrOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14761MRPrOrd), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRPrOrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMRPrOrd_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMRPrLin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRPrLin_Internalname,GXutil.ltrim( localUtil.ntoc( A14762MRPrLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14762MRPrLin), "ZZZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRPrLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMRPrLin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMRPrMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRPrMaqCod_Internalname,GXutil.rtrim( A14720MRPrMaqCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRPrMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMRPrMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMRPrMaqDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRPrMaqDsc_Internalname,A14760MRPrMaqDsc,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRPrMaqDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMRPrMaqDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"Ingenieria\\Descripcion","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMRPrFasCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRPrFasCod_Internalname,GXutil.rtrim( A14719MRPrFasCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRPrFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMRPrFasCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMRPrFasDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRPrFasDsc_Internalname,A14759MRPrFasDsc,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRPrFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMRPrFasDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"Ingenieria\\Descripcion","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMRPrParId_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRPrParId_Internalname,GXutil.ltrim( localUtil.ntoc( A14723MRPrParId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14723MRPrParId), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRPrParId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMRPrParId_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"AnticipacionErrores\\Id","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMRPrParCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRPrParCod_Internalname,GXutil.ltrim( localUtil.ntoc( A14750MRPrParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14750MRPrParCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRPrParCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMRPrParCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMRPrParDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRPrParDsc_Internalname,A14758MRPrParDsc,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRPrParDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMRPrParDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"Ingenieria\\Descripcion","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMRPrPLC_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRPrPLC_Internalname,A14757MRPrPLC,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRPrPLC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMRPrPLC_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"Ingenieria\\Descripcion","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMRPrFec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRPrFec_Internalname,localUtil.ttoc( A14682MRPrFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A14682MRPrFec, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRPrFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMRPrFec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMRPrValMin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRPrValMin_Internalname,GXutil.rtrim( A14764MRPrValMin),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRPrValMin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMRPrValMin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMRPrVal_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRPrVal_Internalname,GXutil.rtrim( A14721MRPrVal),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRPrVal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMRPrVal_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMRPrValMax_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRPrValMax_Internalname,GXutil.rtrim( A14765MRPrValMax),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRPrValMax_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMRPrValMax_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkMRPrEr.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "MRPRER_" + sGXsfl_39_idx ;
         chkMRPrEr.setName( GXCCtl );
         chkMRPrEr.setWebtags( "" );
         chkMRPrEr.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkMRPrEr.getInternalname(), "TitleCaption", chkMRPrEr.getCaption(), !bGXsfl_39_Refreshing);
         chkMRPrEr.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkMRPrEr.getInternalname(),GXutil.booltostr( A14722MRPrEr),"","",Integer.valueOf(chkMRPrEr.getVisible()),Integer.valueOf(0),"true","",StyleString,ClassString,"WWColumn","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMRPrFecEv_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRPrFecEv_Internalname,localUtil.ttoc( A14763MRPrFecEv, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A14763MRPrFecEv, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRPrFecEv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMRPrFecEv_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRPrUsu_Internalname,GXutil.rtrim( A14751MRPrUsu),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRPrUsu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRPrIp_Internalname,A14752MRPrIp,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRPrIp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRPrReg_Internalname,localUtil.ttoc( A14753MRPrReg, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A14753MRPrReg, "99/99/99 99:99:99.999"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRPrReg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(21),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRPrTkn_Internalname,A14756MRPrTkn,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMRPrTkn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(256),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavClicod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavClicod_Internalname,GXutil.ltrim( localUtil.ntoc( AV111CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV111CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV111CliCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavClicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavClicod_Visible),Integer.valueOf(edtavClicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavClinom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavClinom_Internalname,GXutil.rtrim( AV112CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavClinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavClinom_Visible),Integer.valueOf(edtavClinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavBarser_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarser_Internalname,GXutil.rtrim( AV117BarSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarser_Visible),Integer.valueOf(edtavBarser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavBarserdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarserdsc_Internalname,GXutil.rtrim( AV118BarSerDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarserdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarserdsc_Visible),Integer.valueOf(edtavBarserdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavBarcolnum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcolnum_Internalname,GXutil.ltrim( localUtil.ntoc( AV120BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV120BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV120BarColNum), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarcolnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarcolnum_Visible),Integer.valueOf(edtavBarcolnum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavBarcolnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcolnom_Internalname,GXutil.rtrim( AV121BarColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarcolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarcolnom_Visible),Integer.valueOf(edtavBarcolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavBartipcol_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBartipcol_Internalname,GXutil.ltrim( localUtil.ntoc( AV119BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBartipcol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV119BarTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV119BarTipCol), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBartipcol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBartipcol_Visible),Integer.valueOf(edtavBartipcol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2DX2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_39_idx = ((subGrid_Islastpage==1)&&(nGXsfl_39_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_39_idx+1) ;
         sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_392( ) ;
      }
      /* End function sendrow_392 */
   }

   public void startgridcontrol39( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"39\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEmprCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarCodReo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Reoperado Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarCodPar_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Particion Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRPrHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRPrHdr2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRPrOrd_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRPrLin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lìnea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRPrMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cod. Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRPrMaqDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRPrFasCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cód. Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRPrFasDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRPrParId_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Parametro Id", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRPrParCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cód Parametro", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRPrParDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Parametro", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRPrPLC_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "c/PLC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRPrFec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Registrado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRPrValMin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Val Min", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRPrVal_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRPrValMax_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Val Max", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkMRPrEr.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Error", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRPrFecEv_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Evaluado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavClicod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cod. Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavClinom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarser_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cod. Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarserdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarcolnum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nro Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarcolnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBartipcol_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cod Tipo Color", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14681MRPrId, (byte)(10), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEmprCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14755MRPrHdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRPrHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14754MRPrHdr2);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRPrHdr2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14761MRPrOrd, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRPrOrd_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14762MRPrLin, (byte)(12), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRPrLin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14720MRPrMaqCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRPrMaqCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14760MRPrMaqDsc);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRPrMaqDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14719MRPrFasCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRPrFasCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14759MRPrFasDsc);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRPrFasDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14723MRPrParId, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRPrParId_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14750MRPrParCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRPrParCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14758MRPrParDsc);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRPrParDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14757MRPrPLC);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRPrPLC_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A14682MRPrFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRPrFec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14764MRPrValMin));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRPrValMin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14721MRPrVal));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRPrVal_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14765MRPrValMax));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRPrValMax_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.booltostr( A14722MRPrEr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkMRPrEr.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A14763MRPrFecEv, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRPrFecEv_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14751MRPrUsu));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14752MRPrIp);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A14753MRPrReg, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14756MRPrTkn);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV111CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavClicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavClicod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV112CliNom));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavClinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavClinom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV117BarSer));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarser_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV118BarSerDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarserdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarserdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV120BarColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcolnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarcolnum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV121BarColNom));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarcolnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV119BarTipCol, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBartipcol_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBartipcol_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtMRPrId_Internalname = sPrefix+"MRPRID" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      edtMRPrHdr_Internalname = sPrefix+"MRPRHDR" ;
      edtMRPrHdr2_Internalname = sPrefix+"MRPRHDR2" ;
      edtMRPrOrd_Internalname = sPrefix+"MRPRORD" ;
      edtMRPrLin_Internalname = sPrefix+"MRPRLIN" ;
      edtMRPrMaqCod_Internalname = sPrefix+"MRPRMAQCOD" ;
      edtMRPrMaqDsc_Internalname = sPrefix+"MRPRMAQDSC" ;
      edtMRPrFasCod_Internalname = sPrefix+"MRPRFASCOD" ;
      edtMRPrFasDsc_Internalname = sPrefix+"MRPRFASDSC" ;
      edtMRPrParId_Internalname = sPrefix+"MRPRPARID" ;
      edtMRPrParCod_Internalname = sPrefix+"MRPRPARCOD" ;
      edtMRPrParDsc_Internalname = sPrefix+"MRPRPARDSC" ;
      edtMRPrPLC_Internalname = sPrefix+"MRPRPLC" ;
      edtMRPrFec_Internalname = sPrefix+"MRPRFEC" ;
      edtMRPrValMin_Internalname = sPrefix+"MRPRVALMIN" ;
      edtMRPrVal_Internalname = sPrefix+"MRPRVAL" ;
      edtMRPrValMax_Internalname = sPrefix+"MRPRVALMAX" ;
      chkMRPrEr.setInternalname( sPrefix+"MRPRER" );
      edtMRPrFecEv_Internalname = sPrefix+"MRPRFECEV" ;
      edtMRPrUsu_Internalname = sPrefix+"MRPRUSU" ;
      edtMRPrIp_Internalname = sPrefix+"MRPRIP" ;
      edtMRPrReg_Internalname = sPrefix+"MRPRREG" ;
      edtMRPrTkn_Internalname = sPrefix+"MRPRTKN" ;
      edtavClicod_Internalname = sPrefix+"vCLICOD" ;
      edtavClinom_Internalname = sPrefix+"vCLINOM" ;
      edtavBarser_Internalname = sPrefix+"vBARSER" ;
      edtavBarserdsc_Internalname = sPrefix+"vBARSERDSC" ;
      edtavBarcolnum_Internalname = sPrefix+"vBARCOLNUM" ;
      edtavBarcolnom_Internalname = sPrefix+"vBARCOLNOM" ;
      edtavBartipcol_Internalname = sPrefix+"vBARTIPCOL" ;
      edtavTotvaluemrprhdr_Internalname = sPrefix+"vTOTVALUEMRPRHDR" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_mrprfecauxdate_Internalname = sPrefix+"vDDO_MRPRFECAUXDATE" ;
      divDdo_mrprfecauxdates_Internalname = sPrefix+"DDO_MRPRFECAUXDATES" ;
      edtavDdo_mrprfecevauxdate_Internalname = sPrefix+"vDDO_MRPRFECEVAUXDATE" ;
      divDdo_mrprfecevauxdates_Internalname = sPrefix+"DDO_MRPRFECEVAUXDATES" ;
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
      edtavBartipcol_Jsonclick = "" ;
      edtavBartipcol_Enabled = 0 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarcolnum_Jsonclick = "" ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBarserdsc_Jsonclick = "" ;
      edtavBarserdsc_Enabled = 0 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Enabled = 0 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
      edtMRPrTkn_Jsonclick = "" ;
      edtMRPrReg_Jsonclick = "" ;
      edtMRPrIp_Jsonclick = "" ;
      edtMRPrUsu_Jsonclick = "" ;
      edtMRPrFecEv_Jsonclick = "" ;
      chkMRPrEr.setCaption( "" );
      edtMRPrValMax_Jsonclick = "" ;
      edtMRPrVal_Jsonclick = "" ;
      edtMRPrValMin_Jsonclick = "" ;
      edtMRPrFec_Jsonclick = "" ;
      edtMRPrPLC_Jsonclick = "" ;
      edtMRPrParDsc_Jsonclick = "" ;
      edtMRPrParCod_Jsonclick = "" ;
      edtMRPrParId_Jsonclick = "" ;
      edtMRPrFasDsc_Jsonclick = "" ;
      edtMRPrFasCod_Jsonclick = "" ;
      edtMRPrMaqDsc_Jsonclick = "" ;
      edtMRPrMaqCod_Jsonclick = "" ;
      edtMRPrLin_Jsonclick = "" ;
      edtMRPrOrd_Jsonclick = "" ;
      edtMRPrHdr2_Jsonclick = "" ;
      edtMRPrHdr_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      edtMRPrId_Jsonclick = "" ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotvaluemrprhdr_Jsonclick = "" ;
      edtavTotvaluemrprhdr_Enabled = 1 ;
      edtavBartipcol_Visible = -1 ;
      edtavBarcolnom_Visible = -1 ;
      edtavBarcolnum_Visible = -1 ;
      edtavBarserdsc_Visible = -1 ;
      edtavBarser_Visible = -1 ;
      edtavClinom_Visible = -1 ;
      edtavClicod_Visible = -1 ;
      edtMRPrFecEv_Visible = -1 ;
      chkMRPrEr.setVisible( -1 );
      edtMRPrValMax_Visible = -1 ;
      edtMRPrVal_Visible = -1 ;
      edtMRPrValMin_Visible = -1 ;
      edtMRPrFec_Visible = -1 ;
      edtMRPrPLC_Visible = -1 ;
      edtMRPrParDsc_Visible = -1 ;
      edtMRPrParCod_Visible = -1 ;
      edtMRPrParId_Visible = -1 ;
      edtMRPrFasDsc_Visible = -1 ;
      edtMRPrFasCod_Visible = -1 ;
      edtMRPrMaqDsc_Visible = -1 ;
      edtMRPrMaqCod_Visible = -1 ;
      edtMRPrLin_Visible = -1 ;
      edtMRPrOrd_Visible = -1 ;
      edtMRPrHdr2_Visible = -1 ;
      edtMRPrHdr_Visible = -1 ;
      edtBarCodPar_Visible = -1 ;
      edtBarCodReo_Visible = -1 ;
      edtBarCod_Visible = -1 ;
      edtEmprCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_mrprfecevauxdate_Jsonclick = "" ;
      edtavDdo_mrprfecauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "Ingenieria.MRec_AnalisisHdrGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||||||||||||||||||||1:WWP_TSChecked,2:WWP_TSUnChecked||||||||" ;
      Ddo_grid_Datalisttype = "Dynamic|||Dynamic|Dynamic|Dynamic|||Dynamic|Dynamic|Dynamic|Dynamic|||Dynamic|Dynamic||Dynamic|Dynamic|Dynamic|FixedValues||||||||" ;
      Ddo_grid_Includedatalist = "T|||T|T|T|||T|T|T|T|||T|T||T|T|T|T||||||||" ;
      Ddo_grid_Filterisrange = "|T|T||||T|T|||||T|T|||||||||||||||" ;
      Ddo_grid_Filtertype = "Character|Numeric|Numeric|Character|Character|Character|Numeric|Numeric|Character|Character|Character|Character|Numeric|Numeric|Character|Character|Date|Character|Character|Character||Date|||||||" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T||T|||||||" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|||||||" ;
      Ddo_grid_Columnssortvalues = "3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|1|18|19|20|21|22|23|||||||" ;
      Ddo_grid_Columnids = "1:EmprCod|2:BarCod|3:BarCodReo|4:BarCodPar|5:MRPrHdr|6:MRPrHdr2|7:MRPrOrd|8:MRPrLin|9:MRPrMaqCod|10:MRPrMaqDsc|11:MRPrFasCod|12:MRPrFasDsc|13:MRPrParId|14:MRPrParCod|15:MRPrParDsc|16:MRPrPLC|17:MRPrFec|18:MRPrValMin|19:MRPrVal|20:MRPrValMax|21:MRPrEr|22:MRPrFecEv|27:CliCod|28:CliNom|29:BarSer|30:BarSerDsc|31:BarColNum|32:BarColNom|33:BarTipCol" ;
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
      GXCCtl = "MRPRER_" + sGXsfl_39_idx ;
      chkMRPrEr.setName( GXCCtl );
      chkMRPrEr.setWebtags( "" );
      chkMRPrEr.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkMRPrEr.getInternalname(), "TitleCaption", chkMRPrEr.getCaption(), !bGXsfl_39_Refreshing);
      chkMRPrEr.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV31UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV32MaqCod',fld:'vMAQCOD',pic:''},{av:'AV33FasCod',fld:'vFASCOD',pic:''},{av:'AV34Hdr',fld:'vHDR',pic:''},{av:'sPrefix'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV45Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999'},{av:'AV46Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999'},{av:'AV36Ip',fld:'vIP',pic:''},{av:'AV47Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV37MTkn',fld:'vMTKN',pic:''},{av:'AV53TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV54TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV55TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV56TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV57TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV58TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV59TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV60TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV73TFMRPrHdr',fld:'vTFMRPRHDR',pic:''},{av:'AV74TFMRPrHdr_Sel',fld:'vTFMRPRHDR_SEL',pic:''},{av:'AV75TFMRPrHdr2',fld:'vTFMRPRHDR2',pic:''},{av:'AV76TFMRPrHdr2_Sel',fld:'vTFMRPRHDR2_SEL',pic:''},{av:'AV61TFMRPrOrd',fld:'vTFMRPRORD',pic:'ZZZ9'},{av:'AV62TFMRPrOrd_To',fld:'vTFMRPRORD_TO',pic:'ZZZ9'},{av:'AV63TFMRPrLin',fld:'vTFMRPRLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV64TFMRPrLin_To',fld:'vTFMRPRLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV69TFMRPrMaqCod',fld:'vTFMRPRMAQCOD',pic:''},{av:'AV70TFMRPrMaqCod_Sel',fld:'vTFMRPRMAQCOD_SEL',pic:''},{av:'AV71TFMRPrMaqDsc',fld:'vTFMRPRMAQDSC',pic:''},{av:'AV72TFMRPrMaqDsc_Sel',fld:'vTFMRPRMAQDSC_SEL',pic:''},{av:'AV65TFMRPrFasCod',fld:'vTFMRPRFASCOD',pic:''},{av:'AV66TFMRPrFasCod_Sel',fld:'vTFMRPRFASCOD_SEL',pic:''},{av:'AV67TFMRPrFasDsc',fld:'vTFMRPRFASDSC',pic:''},{av:'AV68TFMRPrFasDsc_Sel',fld:'vTFMRPRFASDSC_SEL',pic:''},{av:'AV92TFMRPrParId',fld:'vTFMRPRPARID',pic:'ZZZZZZZZZ9'},{av:'AV93TFMRPrParId_To',fld:'vTFMRPRPARID_TO',pic:'ZZZZZZZZZ9'},{av:'AV88TFMRPrParCod',fld:'vTFMRPRPARCOD',pic:'ZZZ9'},{av:'AV89TFMRPrParCod_To',fld:'vTFMRPRPARCOD_TO',pic:'ZZZ9'},{av:'AV90TFMRPrParDsc',fld:'vTFMRPRPARDSC',pic:''},{av:'AV91TFMRPrParDsc_Sel',fld:'vTFMRPRPARDSC_SEL',pic:''},{av:'AV86TFMRPrPLC',fld:'vTFMRPRPLC',pic:''},{av:'AV87TFMRPrPLC_Sel',fld:'vTFMRPRPLC_SEL',pic:''},{av:'AV78TFMRPrFec',fld:'vTFMRPRFEC',pic:'99/99/99 99:99'},{av:'AV82TFMRPrValMin',fld:'vTFMRPRVALMIN',pic:''},{av:'AV83TFMRPrValMin_Sel',fld:'vTFMRPRVALMIN_SEL',pic:''},{av:'AV80TFMRPrVal',fld:'vTFMRPRVAL',pic:''},{av:'AV81TFMRPrVal_Sel',fld:'vTFMRPRVAL_SEL',pic:''},{av:'AV84TFMRPrValMax',fld:'vTFMRPRVALMAX',pic:''},{av:'AV85TFMRPrValMax_Sel',fld:'vTFMRPRVALMAX_SEL',pic:''},{av:'AV77TFMRPrEr_Sel',fld:'vTFMRPRER_SEL',pic:'9'},{av:'AV94TFMRPrFecEv',fld:'vTFMRPRFECEV',pic:'99/99/99 99:99'},{av:'AV131Pgmname',fld:'vPGMNAME',pic:''},{av:'AV48OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV49OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV107inEmprCod',fld:'vINEMPRCOD',pic:'@!'},{av:'AV40MaqCodJSON',fld:'vMAQCODJSON',pic:''},{av:'AV41FasCodJSON',fld:'vFASCODJSON',pic:''},{av:'AV42HdrJSON',fld:'vHDRJSON',pic:''},{av:'AV108inUsurCod',fld:'vINUSURCOD',pic:'@!'},{av:'AV126AntMrPrHdr2',fld:'vANTMRPRHDR2',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'edtBarCod_Visible',ctrl:'BARCOD',prop:'Visible'},{av:'edtBarCodReo_Visible',ctrl:'BARCODREO',prop:'Visible'},{av:'edtBarCodPar_Visible',ctrl:'BARCODPAR',prop:'Visible'},{av:'edtMRPrHdr_Visible',ctrl:'MRPRHDR',prop:'Visible'},{av:'edtMRPrHdr2_Visible',ctrl:'MRPRHDR2',prop:'Visible'},{av:'edtMRPrOrd_Visible',ctrl:'MRPRORD',prop:'Visible'},{av:'edtMRPrLin_Visible',ctrl:'MRPRLIN',prop:'Visible'},{av:'edtMRPrMaqCod_Visible',ctrl:'MRPRMAQCOD',prop:'Visible'},{av:'edtMRPrMaqDsc_Visible',ctrl:'MRPRMAQDSC',prop:'Visible'},{av:'edtMRPrFasCod_Visible',ctrl:'MRPRFASCOD',prop:'Visible'},{av:'edtMRPrFasDsc_Visible',ctrl:'MRPRFASDSC',prop:'Visible'},{av:'edtMRPrParId_Visible',ctrl:'MRPRPARID',prop:'Visible'},{av:'edtMRPrParCod_Visible',ctrl:'MRPRPARCOD',prop:'Visible'},{av:'edtMRPrParDsc_Visible',ctrl:'MRPRPARDSC',prop:'Visible'},{av:'edtMRPrPLC_Visible',ctrl:'MRPRPLC',prop:'Visible'},{av:'edtMRPrFec_Visible',ctrl:'MRPRFEC',prop:'Visible'},{av:'edtMRPrValMin_Visible',ctrl:'MRPRVALMIN',prop:'Visible'},{av:'edtMRPrVal_Visible',ctrl:'MRPRVAL',prop:'Visible'},{av:'edtMRPrValMax_Visible',ctrl:'MRPRVALMAX',prop:'Visible'},{av:'chkMRPrEr.getVisible()',ctrl:'MRPRER',prop:'Visible'},{av:'edtMRPrFecEv_Visible',ctrl:'MRPRFECEV',prop:'Visible'},{av:'edtavClicod_Visible',ctrl:'vCLICOD',prop:'Visible'},{av:'edtavClinom_Visible',ctrl:'vCLINOM',prop:'Visible'},{av:'edtavBarser_Visible',ctrl:'vBARSER',prop:'Visible'},{av:'edtavBarserdsc_Visible',ctrl:'vBARSERDSC',prop:'Visible'},{av:'edtavBarcolnum_Visible',ctrl:'vBARCOLNUM',prop:'Visible'},{av:'edtavBarcolnom_Visible',ctrl:'vBARCOLNOM',prop:'Visible'},{av:'edtavBartipcol_Visible',ctrl:'vBARTIPCOL',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV126AntMrPrHdr2',fld:'vANTMRPRHDR2',pic:'',hsh:true},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV106TotValueMRPrHdr',fld:'vTOTVALUEMRPRHDR',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e122DX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV31UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV45Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999'},{av:'AV46Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999'},{av:'AV36Ip',fld:'vIP',pic:''},{av:'AV47Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV37MTkn',fld:'vMTKN',pic:''},{av:'AV32MaqCod',fld:'vMAQCOD',pic:''},{av:'AV33FasCod',fld:'vFASCOD',pic:''},{av:'AV34Hdr',fld:'vHDR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV53TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV54TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV55TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV56TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV57TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV58TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV59TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV60TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV73TFMRPrHdr',fld:'vTFMRPRHDR',pic:''},{av:'AV74TFMRPrHdr_Sel',fld:'vTFMRPRHDR_SEL',pic:''},{av:'AV75TFMRPrHdr2',fld:'vTFMRPRHDR2',pic:''},{av:'AV76TFMRPrHdr2_Sel',fld:'vTFMRPRHDR2_SEL',pic:''},{av:'AV61TFMRPrOrd',fld:'vTFMRPRORD',pic:'ZZZ9'},{av:'AV62TFMRPrOrd_To',fld:'vTFMRPRORD_TO',pic:'ZZZ9'},{av:'AV63TFMRPrLin',fld:'vTFMRPRLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV64TFMRPrLin_To',fld:'vTFMRPRLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV69TFMRPrMaqCod',fld:'vTFMRPRMAQCOD',pic:''},{av:'AV70TFMRPrMaqCod_Sel',fld:'vTFMRPRMAQCOD_SEL',pic:''},{av:'AV71TFMRPrMaqDsc',fld:'vTFMRPRMAQDSC',pic:''},{av:'AV72TFMRPrMaqDsc_Sel',fld:'vTFMRPRMAQDSC_SEL',pic:''},{av:'AV65TFMRPrFasCod',fld:'vTFMRPRFASCOD',pic:''},{av:'AV66TFMRPrFasCod_Sel',fld:'vTFMRPRFASCOD_SEL',pic:''},{av:'AV67TFMRPrFasDsc',fld:'vTFMRPRFASDSC',pic:''},{av:'AV68TFMRPrFasDsc_Sel',fld:'vTFMRPRFASDSC_SEL',pic:''},{av:'AV92TFMRPrParId',fld:'vTFMRPRPARID',pic:'ZZZZZZZZZ9'},{av:'AV93TFMRPrParId_To',fld:'vTFMRPRPARID_TO',pic:'ZZZZZZZZZ9'},{av:'AV88TFMRPrParCod',fld:'vTFMRPRPARCOD',pic:'ZZZ9'},{av:'AV89TFMRPrParCod_To',fld:'vTFMRPRPARCOD_TO',pic:'ZZZ9'},{av:'AV90TFMRPrParDsc',fld:'vTFMRPRPARDSC',pic:''},{av:'AV91TFMRPrParDsc_Sel',fld:'vTFMRPRPARDSC_SEL',pic:''},{av:'AV86TFMRPrPLC',fld:'vTFMRPRPLC',pic:''},{av:'AV87TFMRPrPLC_Sel',fld:'vTFMRPRPLC_SEL',pic:''},{av:'AV78TFMRPrFec',fld:'vTFMRPRFEC',pic:'99/99/99 99:99'},{av:'AV82TFMRPrValMin',fld:'vTFMRPRVALMIN',pic:''},{av:'AV83TFMRPrValMin_Sel',fld:'vTFMRPRVALMIN_SEL',pic:''},{av:'AV80TFMRPrVal',fld:'vTFMRPRVAL',pic:''},{av:'AV81TFMRPrVal_Sel',fld:'vTFMRPRVAL_SEL',pic:''},{av:'AV84TFMRPrValMax',fld:'vTFMRPRVALMAX',pic:''},{av:'AV85TFMRPrValMax_Sel',fld:'vTFMRPRVALMAX_SEL',pic:''},{av:'AV77TFMRPrEr_Sel',fld:'vTFMRPRER_SEL',pic:'9'},{av:'AV94TFMRPrFecEv',fld:'vTFMRPRFECEV',pic:'99/99/99 99:99'},{av:'AV131Pgmname',fld:'vPGMNAME',pic:''},{av:'AV48OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV49OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV107inEmprCod',fld:'vINEMPRCOD',pic:'@!'},{av:'AV40MaqCodJSON',fld:'vMAQCODJSON',pic:''},{av:'AV41FasCodJSON',fld:'vFASCODJSON',pic:''},{av:'AV42HdrJSON',fld:'vHDRJSON',pic:''},{av:'AV108inUsurCod',fld:'vINUSURCOD',pic:'@!'},{av:'AV126AntMrPrHdr2',fld:'vANTMRPRHDR2',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e132DX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV31UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV45Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999'},{av:'AV46Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999'},{av:'AV36Ip',fld:'vIP',pic:''},{av:'AV47Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV37MTkn',fld:'vMTKN',pic:''},{av:'AV32MaqCod',fld:'vMAQCOD',pic:''},{av:'AV33FasCod',fld:'vFASCOD',pic:''},{av:'AV34Hdr',fld:'vHDR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV53TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV54TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV55TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV56TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV57TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV58TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV59TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV60TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV73TFMRPrHdr',fld:'vTFMRPRHDR',pic:''},{av:'AV74TFMRPrHdr_Sel',fld:'vTFMRPRHDR_SEL',pic:''},{av:'AV75TFMRPrHdr2',fld:'vTFMRPRHDR2',pic:''},{av:'AV76TFMRPrHdr2_Sel',fld:'vTFMRPRHDR2_SEL',pic:''},{av:'AV61TFMRPrOrd',fld:'vTFMRPRORD',pic:'ZZZ9'},{av:'AV62TFMRPrOrd_To',fld:'vTFMRPRORD_TO',pic:'ZZZ9'},{av:'AV63TFMRPrLin',fld:'vTFMRPRLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV64TFMRPrLin_To',fld:'vTFMRPRLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV69TFMRPrMaqCod',fld:'vTFMRPRMAQCOD',pic:''},{av:'AV70TFMRPrMaqCod_Sel',fld:'vTFMRPRMAQCOD_SEL',pic:''},{av:'AV71TFMRPrMaqDsc',fld:'vTFMRPRMAQDSC',pic:''},{av:'AV72TFMRPrMaqDsc_Sel',fld:'vTFMRPRMAQDSC_SEL',pic:''},{av:'AV65TFMRPrFasCod',fld:'vTFMRPRFASCOD',pic:''},{av:'AV66TFMRPrFasCod_Sel',fld:'vTFMRPRFASCOD_SEL',pic:''},{av:'AV67TFMRPrFasDsc',fld:'vTFMRPRFASDSC',pic:''},{av:'AV68TFMRPrFasDsc_Sel',fld:'vTFMRPRFASDSC_SEL',pic:''},{av:'AV92TFMRPrParId',fld:'vTFMRPRPARID',pic:'ZZZZZZZZZ9'},{av:'AV93TFMRPrParId_To',fld:'vTFMRPRPARID_TO',pic:'ZZZZZZZZZ9'},{av:'AV88TFMRPrParCod',fld:'vTFMRPRPARCOD',pic:'ZZZ9'},{av:'AV89TFMRPrParCod_To',fld:'vTFMRPRPARCOD_TO',pic:'ZZZ9'},{av:'AV90TFMRPrParDsc',fld:'vTFMRPRPARDSC',pic:''},{av:'AV91TFMRPrParDsc_Sel',fld:'vTFMRPRPARDSC_SEL',pic:''},{av:'AV86TFMRPrPLC',fld:'vTFMRPRPLC',pic:''},{av:'AV87TFMRPrPLC_Sel',fld:'vTFMRPRPLC_SEL',pic:''},{av:'AV78TFMRPrFec',fld:'vTFMRPRFEC',pic:'99/99/99 99:99'},{av:'AV82TFMRPrValMin',fld:'vTFMRPRVALMIN',pic:''},{av:'AV83TFMRPrValMin_Sel',fld:'vTFMRPRVALMIN_SEL',pic:''},{av:'AV80TFMRPrVal',fld:'vTFMRPRVAL',pic:''},{av:'AV81TFMRPrVal_Sel',fld:'vTFMRPRVAL_SEL',pic:''},{av:'AV84TFMRPrValMax',fld:'vTFMRPRVALMAX',pic:''},{av:'AV85TFMRPrValMax_Sel',fld:'vTFMRPRVALMAX_SEL',pic:''},{av:'AV77TFMRPrEr_Sel',fld:'vTFMRPRER_SEL',pic:'9'},{av:'AV94TFMRPrFecEv',fld:'vTFMRPRFECEV',pic:'99/99/99 99:99'},{av:'AV131Pgmname',fld:'vPGMNAME',pic:''},{av:'AV48OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV49OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV107inEmprCod',fld:'vINEMPRCOD',pic:'@!'},{av:'AV40MaqCodJSON',fld:'vMAQCODJSON',pic:''},{av:'AV41FasCodJSON',fld:'vFASCODJSON',pic:''},{av:'AV42HdrJSON',fld:'vHDRJSON',pic:''},{av:'AV108inUsurCod',fld:'vINUSURCOD',pic:'@!'},{av:'AV126AntMrPrHdr2',fld:'vANTMRPRHDR2',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e142DX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV31UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV45Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999'},{av:'AV46Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999'},{av:'AV36Ip',fld:'vIP',pic:''},{av:'AV47Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV37MTkn',fld:'vMTKN',pic:''},{av:'AV32MaqCod',fld:'vMAQCOD',pic:''},{av:'AV33FasCod',fld:'vFASCOD',pic:''},{av:'AV34Hdr',fld:'vHDR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV53TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV54TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV55TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV56TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV57TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV58TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV59TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV60TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV73TFMRPrHdr',fld:'vTFMRPRHDR',pic:''},{av:'AV74TFMRPrHdr_Sel',fld:'vTFMRPRHDR_SEL',pic:''},{av:'AV75TFMRPrHdr2',fld:'vTFMRPRHDR2',pic:''},{av:'AV76TFMRPrHdr2_Sel',fld:'vTFMRPRHDR2_SEL',pic:''},{av:'AV61TFMRPrOrd',fld:'vTFMRPRORD',pic:'ZZZ9'},{av:'AV62TFMRPrOrd_To',fld:'vTFMRPRORD_TO',pic:'ZZZ9'},{av:'AV63TFMRPrLin',fld:'vTFMRPRLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV64TFMRPrLin_To',fld:'vTFMRPRLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV69TFMRPrMaqCod',fld:'vTFMRPRMAQCOD',pic:''},{av:'AV70TFMRPrMaqCod_Sel',fld:'vTFMRPRMAQCOD_SEL',pic:''},{av:'AV71TFMRPrMaqDsc',fld:'vTFMRPRMAQDSC',pic:''},{av:'AV72TFMRPrMaqDsc_Sel',fld:'vTFMRPRMAQDSC_SEL',pic:''},{av:'AV65TFMRPrFasCod',fld:'vTFMRPRFASCOD',pic:''},{av:'AV66TFMRPrFasCod_Sel',fld:'vTFMRPRFASCOD_SEL',pic:''},{av:'AV67TFMRPrFasDsc',fld:'vTFMRPRFASDSC',pic:''},{av:'AV68TFMRPrFasDsc_Sel',fld:'vTFMRPRFASDSC_SEL',pic:''},{av:'AV92TFMRPrParId',fld:'vTFMRPRPARID',pic:'ZZZZZZZZZ9'},{av:'AV93TFMRPrParId_To',fld:'vTFMRPRPARID_TO',pic:'ZZZZZZZZZ9'},{av:'AV88TFMRPrParCod',fld:'vTFMRPRPARCOD',pic:'ZZZ9'},{av:'AV89TFMRPrParCod_To',fld:'vTFMRPRPARCOD_TO',pic:'ZZZ9'},{av:'AV90TFMRPrParDsc',fld:'vTFMRPRPARDSC',pic:''},{av:'AV91TFMRPrParDsc_Sel',fld:'vTFMRPRPARDSC_SEL',pic:''},{av:'AV86TFMRPrPLC',fld:'vTFMRPRPLC',pic:''},{av:'AV87TFMRPrPLC_Sel',fld:'vTFMRPRPLC_SEL',pic:''},{av:'AV78TFMRPrFec',fld:'vTFMRPRFEC',pic:'99/99/99 99:99'},{av:'AV82TFMRPrValMin',fld:'vTFMRPRVALMIN',pic:''},{av:'AV83TFMRPrValMin_Sel',fld:'vTFMRPRVALMIN_SEL',pic:''},{av:'AV80TFMRPrVal',fld:'vTFMRPRVAL',pic:''},{av:'AV81TFMRPrVal_Sel',fld:'vTFMRPRVAL_SEL',pic:''},{av:'AV84TFMRPrValMax',fld:'vTFMRPRVALMAX',pic:''},{av:'AV85TFMRPrValMax_Sel',fld:'vTFMRPRVALMAX_SEL',pic:''},{av:'AV77TFMRPrEr_Sel',fld:'vTFMRPRER_SEL',pic:'9'},{av:'AV94TFMRPrFecEv',fld:'vTFMRPRFECEV',pic:'99/99/99 99:99'},{av:'AV131Pgmname',fld:'vPGMNAME',pic:''},{av:'AV48OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV49OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV107inEmprCod',fld:'vINEMPRCOD',pic:'@!'},{av:'AV40MaqCodJSON',fld:'vMAQCODJSON',pic:''},{av:'AV41FasCodJSON',fld:'vFASCODJSON',pic:''},{av:'AV42HdrJSON',fld:'vHDRJSON',pic:''},{av:'AV108inUsurCod',fld:'vINUSURCOD',pic:'@!'},{av:'AV126AntMrPrHdr2',fld:'vANTMRPRHDR2',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV48OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV49OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV94TFMRPrFecEv',fld:'vTFMRPRFECEV',pic:'99/99/99 99:99'},{av:'AV77TFMRPrEr_Sel',fld:'vTFMRPRER_SEL',pic:'9'},{av:'AV84TFMRPrValMax',fld:'vTFMRPRVALMAX',pic:''},{av:'AV85TFMRPrValMax_Sel',fld:'vTFMRPRVALMAX_SEL',pic:''},{av:'AV80TFMRPrVal',fld:'vTFMRPRVAL',pic:''},{av:'AV81TFMRPrVal_Sel',fld:'vTFMRPRVAL_SEL',pic:''},{av:'AV82TFMRPrValMin',fld:'vTFMRPRVALMIN',pic:''},{av:'AV83TFMRPrValMin_Sel',fld:'vTFMRPRVALMIN_SEL',pic:''},{av:'AV78TFMRPrFec',fld:'vTFMRPRFEC',pic:'99/99/99 99:99'},{av:'AV86TFMRPrPLC',fld:'vTFMRPRPLC',pic:''},{av:'AV87TFMRPrPLC_Sel',fld:'vTFMRPRPLC_SEL',pic:''},{av:'AV90TFMRPrParDsc',fld:'vTFMRPRPARDSC',pic:''},{av:'AV91TFMRPrParDsc_Sel',fld:'vTFMRPRPARDSC_SEL',pic:''},{av:'AV88TFMRPrParCod',fld:'vTFMRPRPARCOD',pic:'ZZZ9'},{av:'AV89TFMRPrParCod_To',fld:'vTFMRPRPARCOD_TO',pic:'ZZZ9'},{av:'AV92TFMRPrParId',fld:'vTFMRPRPARID',pic:'ZZZZZZZZZ9'},{av:'AV93TFMRPrParId_To',fld:'vTFMRPRPARID_TO',pic:'ZZZZZZZZZ9'},{av:'AV67TFMRPrFasDsc',fld:'vTFMRPRFASDSC',pic:''},{av:'AV68TFMRPrFasDsc_Sel',fld:'vTFMRPRFASDSC_SEL',pic:''},{av:'AV65TFMRPrFasCod',fld:'vTFMRPRFASCOD',pic:''},{av:'AV66TFMRPrFasCod_Sel',fld:'vTFMRPRFASCOD_SEL',pic:''},{av:'AV71TFMRPrMaqDsc',fld:'vTFMRPRMAQDSC',pic:''},{av:'AV72TFMRPrMaqDsc_Sel',fld:'vTFMRPRMAQDSC_SEL',pic:''},{av:'AV69TFMRPrMaqCod',fld:'vTFMRPRMAQCOD',pic:''},{av:'AV70TFMRPrMaqCod_Sel',fld:'vTFMRPRMAQCOD_SEL',pic:''},{av:'AV63TFMRPrLin',fld:'vTFMRPRLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV64TFMRPrLin_To',fld:'vTFMRPRLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV61TFMRPrOrd',fld:'vTFMRPRORD',pic:'ZZZ9'},{av:'AV62TFMRPrOrd_To',fld:'vTFMRPRORD_TO',pic:'ZZZ9'},{av:'AV75TFMRPrHdr2',fld:'vTFMRPRHDR2',pic:''},{av:'AV76TFMRPrHdr2_Sel',fld:'vTFMRPRHDR2_SEL',pic:''},{av:'AV73TFMRPrHdr',fld:'vTFMRPRHDR',pic:''},{av:'AV74TFMRPrHdr_Sel',fld:'vTFMRPRHDR_SEL',pic:''},{av:'AV59TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV60TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV57TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV58TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV55TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV56TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV53TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV54TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e192DX2',iparms:[{av:'AV126AntMrPrHdr2',fld:'vANTMRPRHDR2',pic:'',hsh:true},{av:'A14754MRPrHdr2',fld:'MRPRHDR2',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV119BarTipCol',fld:'vBARTIPCOL',pic:'Z9'},{av:'AV121BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV120BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV118BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV117BarSer',fld:'vBARSER',pic:''},{av:'AV112CliNom',fld:'vCLINOM',pic:''},{av:'AV111CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV126AntMrPrHdr2',fld:'vANTMRPRHDR2',pic:'',hsh:true}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e152DX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV31UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV45Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999'},{av:'AV46Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999'},{av:'AV36Ip',fld:'vIP',pic:''},{av:'AV47Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV37MTkn',fld:'vMTKN',pic:''},{av:'AV32MaqCod',fld:'vMAQCOD',pic:''},{av:'AV33FasCod',fld:'vFASCOD',pic:''},{av:'AV34Hdr',fld:'vHDR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV53TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV54TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV55TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV56TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV57TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV58TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV59TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV60TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV73TFMRPrHdr',fld:'vTFMRPRHDR',pic:''},{av:'AV74TFMRPrHdr_Sel',fld:'vTFMRPRHDR_SEL',pic:''},{av:'AV75TFMRPrHdr2',fld:'vTFMRPRHDR2',pic:''},{av:'AV76TFMRPrHdr2_Sel',fld:'vTFMRPRHDR2_SEL',pic:''},{av:'AV61TFMRPrOrd',fld:'vTFMRPRORD',pic:'ZZZ9'},{av:'AV62TFMRPrOrd_To',fld:'vTFMRPRORD_TO',pic:'ZZZ9'},{av:'AV63TFMRPrLin',fld:'vTFMRPRLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV64TFMRPrLin_To',fld:'vTFMRPRLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV69TFMRPrMaqCod',fld:'vTFMRPRMAQCOD',pic:''},{av:'AV70TFMRPrMaqCod_Sel',fld:'vTFMRPRMAQCOD_SEL',pic:''},{av:'AV71TFMRPrMaqDsc',fld:'vTFMRPRMAQDSC',pic:''},{av:'AV72TFMRPrMaqDsc_Sel',fld:'vTFMRPRMAQDSC_SEL',pic:''},{av:'AV65TFMRPrFasCod',fld:'vTFMRPRFASCOD',pic:''},{av:'AV66TFMRPrFasCod_Sel',fld:'vTFMRPRFASCOD_SEL',pic:''},{av:'AV67TFMRPrFasDsc',fld:'vTFMRPRFASDSC',pic:''},{av:'AV68TFMRPrFasDsc_Sel',fld:'vTFMRPRFASDSC_SEL',pic:''},{av:'AV92TFMRPrParId',fld:'vTFMRPRPARID',pic:'ZZZZZZZZZ9'},{av:'AV93TFMRPrParId_To',fld:'vTFMRPRPARID_TO',pic:'ZZZZZZZZZ9'},{av:'AV88TFMRPrParCod',fld:'vTFMRPRPARCOD',pic:'ZZZ9'},{av:'AV89TFMRPrParCod_To',fld:'vTFMRPRPARCOD_TO',pic:'ZZZ9'},{av:'AV90TFMRPrParDsc',fld:'vTFMRPRPARDSC',pic:''},{av:'AV91TFMRPrParDsc_Sel',fld:'vTFMRPRPARDSC_SEL',pic:''},{av:'AV86TFMRPrPLC',fld:'vTFMRPRPLC',pic:''},{av:'AV87TFMRPrPLC_Sel',fld:'vTFMRPRPLC_SEL',pic:''},{av:'AV78TFMRPrFec',fld:'vTFMRPRFEC',pic:'99/99/99 99:99'},{av:'AV82TFMRPrValMin',fld:'vTFMRPRVALMIN',pic:''},{av:'AV83TFMRPrValMin_Sel',fld:'vTFMRPRVALMIN_SEL',pic:''},{av:'AV80TFMRPrVal',fld:'vTFMRPRVAL',pic:''},{av:'AV81TFMRPrVal_Sel',fld:'vTFMRPRVAL_SEL',pic:''},{av:'AV84TFMRPrValMax',fld:'vTFMRPRVALMAX',pic:''},{av:'AV85TFMRPrValMax_Sel',fld:'vTFMRPRVALMAX_SEL',pic:''},{av:'AV77TFMRPrEr_Sel',fld:'vTFMRPRER_SEL',pic:'9'},{av:'AV94TFMRPrFecEv',fld:'vTFMRPRFECEV',pic:'99/99/99 99:99'},{av:'AV131Pgmname',fld:'vPGMNAME',pic:''},{av:'AV48OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV49OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV107inEmprCod',fld:'vINEMPRCOD',pic:'@!'},{av:'AV40MaqCodJSON',fld:'vMAQCODJSON',pic:''},{av:'AV41FasCodJSON',fld:'vFASCODJSON',pic:''},{av:'AV42HdrJSON',fld:'vHDRJSON',pic:''},{av:'AV108inUsurCod',fld:'vINUSURCOD',pic:'@!'},{av:'AV126AntMrPrHdr2',fld:'vANTMRPRHDR2',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'edtBarCod_Visible',ctrl:'BARCOD',prop:'Visible'},{av:'edtBarCodReo_Visible',ctrl:'BARCODREO',prop:'Visible'},{av:'edtBarCodPar_Visible',ctrl:'BARCODPAR',prop:'Visible'},{av:'edtMRPrHdr_Visible',ctrl:'MRPRHDR',prop:'Visible'},{av:'edtMRPrHdr2_Visible',ctrl:'MRPRHDR2',prop:'Visible'},{av:'edtMRPrOrd_Visible',ctrl:'MRPRORD',prop:'Visible'},{av:'edtMRPrLin_Visible',ctrl:'MRPRLIN',prop:'Visible'},{av:'edtMRPrMaqCod_Visible',ctrl:'MRPRMAQCOD',prop:'Visible'},{av:'edtMRPrMaqDsc_Visible',ctrl:'MRPRMAQDSC',prop:'Visible'},{av:'edtMRPrFasCod_Visible',ctrl:'MRPRFASCOD',prop:'Visible'},{av:'edtMRPrFasDsc_Visible',ctrl:'MRPRFASDSC',prop:'Visible'},{av:'edtMRPrParId_Visible',ctrl:'MRPRPARID',prop:'Visible'},{av:'edtMRPrParCod_Visible',ctrl:'MRPRPARCOD',prop:'Visible'},{av:'edtMRPrParDsc_Visible',ctrl:'MRPRPARDSC',prop:'Visible'},{av:'edtMRPrPLC_Visible',ctrl:'MRPRPLC',prop:'Visible'},{av:'edtMRPrFec_Visible',ctrl:'MRPRFEC',prop:'Visible'},{av:'edtMRPrValMin_Visible',ctrl:'MRPRVALMIN',prop:'Visible'},{av:'edtMRPrVal_Visible',ctrl:'MRPRVAL',prop:'Visible'},{av:'edtMRPrValMax_Visible',ctrl:'MRPRVALMAX',prop:'Visible'},{av:'chkMRPrEr.getVisible()',ctrl:'MRPRER',prop:'Visible'},{av:'edtMRPrFecEv_Visible',ctrl:'MRPRFECEV',prop:'Visible'},{av:'edtavClicod_Visible',ctrl:'vCLICOD',prop:'Visible'},{av:'edtavClinom_Visible',ctrl:'vCLINOM',prop:'Visible'},{av:'edtavBarser_Visible',ctrl:'vBARSER',prop:'Visible'},{av:'edtavBarserdsc_Visible',ctrl:'vBARSERDSC',prop:'Visible'},{av:'edtavBarcolnum_Visible',ctrl:'vBARCOLNUM',prop:'Visible'},{av:'edtavBarcolnom_Visible',ctrl:'vBARCOLNOM',prop:'Visible'},{av:'edtavBartipcol_Visible',ctrl:'vBARTIPCOL',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV126AntMrPrHdr2',fld:'vANTMRPRHDR2',pic:'',hsh:true},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV106TotValueMRPrHdr',fld:'vTOTVALUEMRPRHDR',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e112DX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV31UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV45Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999'},{av:'AV46Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999'},{av:'AV36Ip',fld:'vIP',pic:''},{av:'AV47Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV37MTkn',fld:'vMTKN',pic:''},{av:'AV32MaqCod',fld:'vMAQCOD',pic:''},{av:'AV33FasCod',fld:'vFASCOD',pic:''},{av:'AV34Hdr',fld:'vHDR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV53TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV54TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV55TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV56TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV57TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV58TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV59TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV60TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV73TFMRPrHdr',fld:'vTFMRPRHDR',pic:''},{av:'AV74TFMRPrHdr_Sel',fld:'vTFMRPRHDR_SEL',pic:''},{av:'AV75TFMRPrHdr2',fld:'vTFMRPRHDR2',pic:''},{av:'AV76TFMRPrHdr2_Sel',fld:'vTFMRPRHDR2_SEL',pic:''},{av:'AV61TFMRPrOrd',fld:'vTFMRPRORD',pic:'ZZZ9'},{av:'AV62TFMRPrOrd_To',fld:'vTFMRPRORD_TO',pic:'ZZZ9'},{av:'AV63TFMRPrLin',fld:'vTFMRPRLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV64TFMRPrLin_To',fld:'vTFMRPRLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV69TFMRPrMaqCod',fld:'vTFMRPRMAQCOD',pic:''},{av:'AV70TFMRPrMaqCod_Sel',fld:'vTFMRPRMAQCOD_SEL',pic:''},{av:'AV71TFMRPrMaqDsc',fld:'vTFMRPRMAQDSC',pic:''},{av:'AV72TFMRPrMaqDsc_Sel',fld:'vTFMRPRMAQDSC_SEL',pic:''},{av:'AV65TFMRPrFasCod',fld:'vTFMRPRFASCOD',pic:''},{av:'AV66TFMRPrFasCod_Sel',fld:'vTFMRPRFASCOD_SEL',pic:''},{av:'AV67TFMRPrFasDsc',fld:'vTFMRPRFASDSC',pic:''},{av:'AV68TFMRPrFasDsc_Sel',fld:'vTFMRPRFASDSC_SEL',pic:''},{av:'AV92TFMRPrParId',fld:'vTFMRPRPARID',pic:'ZZZZZZZZZ9'},{av:'AV93TFMRPrParId_To',fld:'vTFMRPRPARID_TO',pic:'ZZZZZZZZZ9'},{av:'AV88TFMRPrParCod',fld:'vTFMRPRPARCOD',pic:'ZZZ9'},{av:'AV89TFMRPrParCod_To',fld:'vTFMRPRPARCOD_TO',pic:'ZZZ9'},{av:'AV90TFMRPrParDsc',fld:'vTFMRPRPARDSC',pic:''},{av:'AV91TFMRPrParDsc_Sel',fld:'vTFMRPRPARDSC_SEL',pic:''},{av:'AV86TFMRPrPLC',fld:'vTFMRPRPLC',pic:''},{av:'AV87TFMRPrPLC_Sel',fld:'vTFMRPRPLC_SEL',pic:''},{av:'AV78TFMRPrFec',fld:'vTFMRPRFEC',pic:'99/99/99 99:99'},{av:'AV82TFMRPrValMin',fld:'vTFMRPRVALMIN',pic:''},{av:'AV83TFMRPrValMin_Sel',fld:'vTFMRPRVALMIN_SEL',pic:''},{av:'AV80TFMRPrVal',fld:'vTFMRPRVAL',pic:''},{av:'AV81TFMRPrVal_Sel',fld:'vTFMRPRVAL_SEL',pic:''},{av:'AV84TFMRPrValMax',fld:'vTFMRPRVALMAX',pic:''},{av:'AV85TFMRPrValMax_Sel',fld:'vTFMRPRVALMAX_SEL',pic:''},{av:'AV77TFMRPrEr_Sel',fld:'vTFMRPRER_SEL',pic:'9'},{av:'AV94TFMRPrFecEv',fld:'vTFMRPRFECEV',pic:'99/99/99 99:99'},{av:'AV131Pgmname',fld:'vPGMNAME',pic:''},{av:'AV48OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV49OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV107inEmprCod',fld:'vINEMPRCOD',pic:'@!'},{av:'AV40MaqCodJSON',fld:'vMAQCODJSON',pic:''},{av:'AV41FasCodJSON',fld:'vFASCODJSON',pic:''},{av:'AV42HdrJSON',fld:'vHDRJSON',pic:''},{av:'AV108inUsurCod',fld:'vINUSURCOD',pic:'@!'},{av:'AV126AntMrPrHdr2',fld:'vANTMRPRHDR2',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV79DDO_MRPrFecAuxDate',fld:'vDDO_MRPRFECAUXDATE',pic:''},{av:'AV95DDO_MRPrFecEvAuxDate',fld:'vDDO_MRPRFECEVAUXDATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV48OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV49OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV53TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV54TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV55TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV56TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV57TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV58TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV59TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV60TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV73TFMRPrHdr',fld:'vTFMRPRHDR',pic:''},{av:'AV74TFMRPrHdr_Sel',fld:'vTFMRPRHDR_SEL',pic:''},{av:'AV75TFMRPrHdr2',fld:'vTFMRPRHDR2',pic:''},{av:'AV76TFMRPrHdr2_Sel',fld:'vTFMRPRHDR2_SEL',pic:''},{av:'AV61TFMRPrOrd',fld:'vTFMRPRORD',pic:'ZZZ9'},{av:'AV62TFMRPrOrd_To',fld:'vTFMRPRORD_TO',pic:'ZZZ9'},{av:'AV63TFMRPrLin',fld:'vTFMRPRLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV64TFMRPrLin_To',fld:'vTFMRPRLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV69TFMRPrMaqCod',fld:'vTFMRPRMAQCOD',pic:''},{av:'AV70TFMRPrMaqCod_Sel',fld:'vTFMRPRMAQCOD_SEL',pic:''},{av:'AV71TFMRPrMaqDsc',fld:'vTFMRPRMAQDSC',pic:''},{av:'AV72TFMRPrMaqDsc_Sel',fld:'vTFMRPRMAQDSC_SEL',pic:''},{av:'AV65TFMRPrFasCod',fld:'vTFMRPRFASCOD',pic:''},{av:'AV66TFMRPrFasCod_Sel',fld:'vTFMRPRFASCOD_SEL',pic:''},{av:'AV67TFMRPrFasDsc',fld:'vTFMRPRFASDSC',pic:''},{av:'AV68TFMRPrFasDsc_Sel',fld:'vTFMRPRFASDSC_SEL',pic:''},{av:'AV92TFMRPrParId',fld:'vTFMRPRPARID',pic:'ZZZZZZZZZ9'},{av:'AV93TFMRPrParId_To',fld:'vTFMRPRPARID_TO',pic:'ZZZZZZZZZ9'},{av:'AV88TFMRPrParCod',fld:'vTFMRPRPARCOD',pic:'ZZZ9'},{av:'AV89TFMRPrParCod_To',fld:'vTFMRPRPARCOD_TO',pic:'ZZZ9'},{av:'AV90TFMRPrParDsc',fld:'vTFMRPRPARDSC',pic:''},{av:'AV91TFMRPrParDsc_Sel',fld:'vTFMRPRPARDSC_SEL',pic:''},{av:'AV86TFMRPrPLC',fld:'vTFMRPRPLC',pic:''},{av:'AV87TFMRPrPLC_Sel',fld:'vTFMRPRPLC_SEL',pic:''},{av:'AV78TFMRPrFec',fld:'vTFMRPRFEC',pic:'99/99/99 99:99'},{av:'AV82TFMRPrValMin',fld:'vTFMRPRVALMIN',pic:''},{av:'AV83TFMRPrValMin_Sel',fld:'vTFMRPRVALMIN_SEL',pic:''},{av:'AV80TFMRPrVal',fld:'vTFMRPRVAL',pic:''},{av:'AV81TFMRPrVal_Sel',fld:'vTFMRPRVAL_SEL',pic:''},{av:'AV84TFMRPrValMax',fld:'vTFMRPRVALMAX',pic:''},{av:'AV85TFMRPrValMax_Sel',fld:'vTFMRPRVALMAX_SEL',pic:''},{av:'AV77TFMRPrEr_Sel',fld:'vTFMRPRER_SEL',pic:'9'},{av:'AV94TFMRPrFecEv',fld:'vTFMRPRFECEV',pic:'99/99/99 99:99'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV95DDO_MRPrFecEvAuxDate',fld:'vDDO_MRPRFECEVAUXDATE',pic:''},{av:'AV79DDO_MRPrFecAuxDate',fld:'vDDO_MRPRFECAUXDATE',pic:''},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'edtBarCod_Visible',ctrl:'BARCOD',prop:'Visible'},{av:'edtBarCodReo_Visible',ctrl:'BARCODREO',prop:'Visible'},{av:'edtBarCodPar_Visible',ctrl:'BARCODPAR',prop:'Visible'},{av:'edtMRPrHdr_Visible',ctrl:'MRPRHDR',prop:'Visible'},{av:'edtMRPrHdr2_Visible',ctrl:'MRPRHDR2',prop:'Visible'},{av:'edtMRPrOrd_Visible',ctrl:'MRPRORD',prop:'Visible'},{av:'edtMRPrLin_Visible',ctrl:'MRPRLIN',prop:'Visible'},{av:'edtMRPrMaqCod_Visible',ctrl:'MRPRMAQCOD',prop:'Visible'},{av:'edtMRPrMaqDsc_Visible',ctrl:'MRPRMAQDSC',prop:'Visible'},{av:'edtMRPrFasCod_Visible',ctrl:'MRPRFASCOD',prop:'Visible'},{av:'edtMRPrFasDsc_Visible',ctrl:'MRPRFASDSC',prop:'Visible'},{av:'edtMRPrParId_Visible',ctrl:'MRPRPARID',prop:'Visible'},{av:'edtMRPrParCod_Visible',ctrl:'MRPRPARCOD',prop:'Visible'},{av:'edtMRPrParDsc_Visible',ctrl:'MRPRPARDSC',prop:'Visible'},{av:'edtMRPrPLC_Visible',ctrl:'MRPRPLC',prop:'Visible'},{av:'edtMRPrFec_Visible',ctrl:'MRPRFEC',prop:'Visible'},{av:'edtMRPrValMin_Visible',ctrl:'MRPRVALMIN',prop:'Visible'},{av:'edtMRPrVal_Visible',ctrl:'MRPRVAL',prop:'Visible'},{av:'edtMRPrValMax_Visible',ctrl:'MRPRVALMAX',prop:'Visible'},{av:'chkMRPrEr.getVisible()',ctrl:'MRPRER',prop:'Visible'},{av:'edtMRPrFecEv_Visible',ctrl:'MRPRFECEV',prop:'Visible'},{av:'edtavClicod_Visible',ctrl:'vCLICOD',prop:'Visible'},{av:'edtavClinom_Visible',ctrl:'vCLINOM',prop:'Visible'},{av:'edtavBarser_Visible',ctrl:'vBARSER',prop:'Visible'},{av:'edtavBarserdsc_Visible',ctrl:'vBARSERDSC',prop:'Visible'},{av:'edtavBarcolnum_Visible',ctrl:'vBARCOLNUM',prop:'Visible'},{av:'edtavBarcolnom_Visible',ctrl:'vBARCOLNOM',prop:'Visible'},{av:'edtavBartipcol_Visible',ctrl:'vBARTIPCOL',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV126AntMrPrHdr2',fld:'vANTMRPRHDR2',pic:'',hsh:true},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV106TotValueMRPrHdr',fld:'vTOTVALUEMRPRHDR',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e162DX2',iparms:[{av:'AV107inEmprCod',fld:'vINEMPRCOD',pic:'@!'},{av:'AV40MaqCodJSON',fld:'vMAQCODJSON',pic:''},{av:'AV41FasCodJSON',fld:'vFASCODJSON',pic:''},{av:'AV42HdrJSON',fld:'vHDRJSON',pic:''},{av:'AV45Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999'},{av:'AV46Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999'},{av:'AV108inUsurCod',fld:'vINUSURCOD',pic:'@!'},{av:'AV36Ip',fld:'vIP',pic:''},{av:'AV47Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV37MTkn',fld:'vMTKN',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Bartipcol',iparms:[]");
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
      wcpOAV107inEmprCod = "" ;
      wcpOAV40MaqCodJSON = "" ;
      wcpOAV41FasCodJSON = "" ;
      wcpOAV42HdrJSON = "" ;
      wcpOAV45Desde = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV46Hasta = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV108inUsurCod = "" ;
      wcpOAV36Ip = "" ;
      wcpOAV47Now = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV37MTkn = "" ;
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
      AV107inEmprCod = "" ;
      AV40MaqCodJSON = "" ;
      AV41FasCodJSON = "" ;
      AV42HdrJSON = "" ;
      AV45Desde = GXutil.resetTime( GXutil.nullDate() );
      AV46Hasta = GXutil.resetTime( GXutil.nullDate() );
      AV108inUsurCod = "" ;
      AV36Ip = "" ;
      AV47Now = GXutil.resetTime( GXutil.nullDate() );
      AV37MTkn = "" ;
      AV12FilterFullText = "" ;
      AV29EmprCod = "" ;
      AV31UsurCod = "" ;
      AV32MaqCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV33FasCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34Hdr = new GXSimpleCollection<String>(String.class, "internal", "");
      AV18ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV53TFEmprCod = "" ;
      AV54TFEmprCod_Sel = "" ;
      AV59TFBarCodPar = "" ;
      AV60TFBarCodPar_Sel = "" ;
      AV73TFMRPrHdr = "" ;
      AV74TFMRPrHdr_Sel = "" ;
      AV75TFMRPrHdr2 = "" ;
      AV76TFMRPrHdr2_Sel = "" ;
      AV69TFMRPrMaqCod = "" ;
      AV70TFMRPrMaqCod_Sel = "" ;
      AV71TFMRPrMaqDsc = "" ;
      AV72TFMRPrMaqDsc_Sel = "" ;
      AV65TFMRPrFasCod = "" ;
      AV66TFMRPrFasCod_Sel = "" ;
      AV67TFMRPrFasDsc = "" ;
      AV68TFMRPrFasDsc_Sel = "" ;
      AV90TFMRPrParDsc = "" ;
      AV91TFMRPrParDsc_Sel = "" ;
      AV86TFMRPrPLC = "" ;
      AV87TFMRPrPLC_Sel = "" ;
      AV78TFMRPrFec = GXutil.resetTime( GXutil.nullDate() );
      AV82TFMRPrValMin = "" ;
      AV83TFMRPrValMin_Sel = "" ;
      AV80TFMRPrVal = "" ;
      AV81TFMRPrVal_Sel = "" ;
      AV84TFMRPrValMax = "" ;
      AV85TFMRPrValMax_Sel = "" ;
      AV94TFMRPrFecEv = GXutil.resetTime( GXutil.nullDate() );
      AV131Pgmname = "" ;
      AV126AntMrPrHdr2 = "" ;
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
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV79DDO_MRPrFecAuxDate = GXutil.nullDate() ;
      AV95DDO_MRPrFecEvAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A14755MRPrHdr = "" ;
      A14754MRPrHdr2 = "" ;
      A14720MRPrMaqCod = "" ;
      A14760MRPrMaqDsc = "" ;
      A14719MRPrFasCod = "" ;
      A14759MRPrFasDsc = "" ;
      A14758MRPrParDsc = "" ;
      A14757MRPrPLC = "" ;
      A14682MRPrFec = GXutil.resetTime( GXutil.nullDate() );
      A14764MRPrValMin = "" ;
      A14721MRPrVal = "" ;
      A14765MRPrValMax = "" ;
      A14763MRPrFecEv = GXutil.resetTime( GXutil.nullDate() );
      A14751MRPrUsu = "" ;
      A14752MRPrIp = "" ;
      A14753MRPrReg = GXutil.resetTime( GXutil.nullDate() );
      A14756MRPrTkn = "" ;
      AV112CliNom = "" ;
      AV117BarSer = "" ;
      AV118BarSerDsc = "" ;
      AV121BarColNom = "" ;
      scmdbuf = "" ;
      lV132Ingenieria_mrec_analisishdrds_1_filterfulltext = "" ;
      lV133Ingenieria_mrec_analisishdrds_2_tfemprcod = "" ;
      lV139Ingenieria_mrec_analisishdrds_8_tfbarcodpar = "" ;
      lV141Ingenieria_mrec_analisishdrds_10_tfmrprhdr = "" ;
      lV143Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = "" ;
      lV149Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = "" ;
      lV151Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = "" ;
      lV153Ingenieria_mrec_analisishdrds_22_tfmrprfascod = "" ;
      lV155Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = "" ;
      lV161Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = "" ;
      lV163Ingenieria_mrec_analisishdrds_32_tfmrprplc = "" ;
      lV166Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = "" ;
      lV168Ingenieria_mrec_analisishdrds_37_tfmrprval = "" ;
      lV170Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = "" ;
      AV132Ingenieria_mrec_analisishdrds_1_filterfulltext = "" ;
      AV134Ingenieria_mrec_analisishdrds_3_tfemprcod_sel = "" ;
      AV133Ingenieria_mrec_analisishdrds_2_tfemprcod = "" ;
      AV140Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel = "" ;
      AV139Ingenieria_mrec_analisishdrds_8_tfbarcodpar = "" ;
      AV142Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel = "" ;
      AV141Ingenieria_mrec_analisishdrds_10_tfmrprhdr = "" ;
      AV144Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel = "" ;
      AV143Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = "" ;
      AV150Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel = "" ;
      AV149Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = "" ;
      AV152Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel = "" ;
      AV151Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = "" ;
      AV154Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel = "" ;
      AV153Ingenieria_mrec_analisishdrds_22_tfmrprfascod = "" ;
      AV156Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel = "" ;
      AV155Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = "" ;
      AV162Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel = "" ;
      AV161Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = "" ;
      AV164Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel = "" ;
      AV163Ingenieria_mrec_analisishdrds_32_tfmrprplc = "" ;
      AV165Ingenieria_mrec_analisishdrds_34_tfmrprfec = GXutil.resetTime( GXutil.nullDate() );
      AV167Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel = "" ;
      AV166Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = "" ;
      AV169Ingenieria_mrec_analisishdrds_38_tfmrprval_sel = "" ;
      AV168Ingenieria_mrec_analisishdrds_37_tfmrprval = "" ;
      AV171Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel = "" ;
      AV170Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = "" ;
      AV173Ingenieria_mrec_analisishdrds_42_tfmrprfecev = GXutil.resetTime( GXutil.nullDate() );
      H02DX2_A14756MRPrTkn = new String[] {""} ;
      H02DX2_A14753MRPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      H02DX2_A14752MRPrIp = new String[] {""} ;
      H02DX2_A14751MRPrUsu = new String[] {""} ;
      H02DX2_A14763MRPrFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      H02DX2_A14722MRPrEr = new boolean[] {false} ;
      H02DX2_A14765MRPrValMax = new String[] {""} ;
      H02DX2_A14721MRPrVal = new String[] {""} ;
      H02DX2_A14764MRPrValMin = new String[] {""} ;
      H02DX2_A14682MRPrFec = new java.util.Date[] {GXutil.nullDate()} ;
      H02DX2_A14757MRPrPLC = new String[] {""} ;
      H02DX2_A14758MRPrParDsc = new String[] {""} ;
      H02DX2_A14750MRPrParCod = new short[1] ;
      H02DX2_A14723MRPrParId = new long[1] ;
      H02DX2_A14759MRPrFasDsc = new String[] {""} ;
      H02DX2_A14719MRPrFasCod = new String[] {""} ;
      H02DX2_A14760MRPrMaqDsc = new String[] {""} ;
      H02DX2_A14720MRPrMaqCod = new String[] {""} ;
      H02DX2_A14762MRPrLin = new long[1] ;
      H02DX2_A14761MRPrOrd = new short[1] ;
      H02DX2_A14754MRPrHdr2 = new String[] {""} ;
      H02DX2_A14755MRPrHdr = new String[] {""} ;
      H02DX2_A130BarCodPar = new String[] {""} ;
      H02DX2_A132BarCodReo = new byte[1] ;
      H02DX2_A129BarCod = new int[1] ;
      H02DX2_A396EmprCod = new String[] {""} ;
      H02DX2_A14681MRPrId = new long[1] ;
      H02DX3_AGRID_nRecordCount = new long[1] ;
      AV106TotValueMRPrHdr = "" ;
      hsh = "" ;
      AV28Station = "" ;
      AV30EmprNom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV35ParFasCod = new GXSimpleCollection<Short>(Short.class, "internal", "");
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV20Session = httpContext.getWebSession();
      AV16ColumnsSelectorXML = "" ;
      GXv_int9 = new int[1] ;
      GXv_int10 = new int[1] ;
      GXv_int12 = new byte[1] ;
      GXv_boolean13 = new boolean[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV22ManageFiltersXml = "" ;
      AV14ExcelFilename = "" ;
      AV15ErrorMessage = "" ;
      AV17UserCustomValue = "" ;
      AV19ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector15 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char37 = "" ;
      GXv_char38 = new String[1] ;
      GXt_char35 = "" ;
      GXv_char36 = new String[1] ;
      GXt_char33 = "" ;
      GXv_char34 = new String[1] ;
      GXt_char31 = "" ;
      GXv_char32 = new String[1] ;
      GXt_char29 = "" ;
      GXv_char30 = new String[1] ;
      GXt_char27 = "" ;
      GXv_char28 = new String[1] ;
      GXt_char25 = "" ;
      GXv_char26 = new String[1] ;
      GXt_char23 = "" ;
      GXv_char24 = new String[1] ;
      GXt_char21 = "" ;
      GXv_char22 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char11 = new String[1] ;
      GXt_char19 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState39 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV107inEmprCod = "" ;
      sCtrlAV40MaqCodJSON = "" ;
      sCtrlAV41FasCodJSON = "" ;
      sCtrlAV42HdrJSON = "" ;
      sCtrlAV45Desde = "" ;
      sCtrlAV46Hasta = "" ;
      sCtrlAV108inUsurCod = "" ;
      sCtrlAV36Ip = "" ;
      sCtrlAV47Now = "" ;
      sCtrlAV37MTkn = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_analisishdr__default(),
         new Object[] {
             new Object[] {
            H02DX2_A14756MRPrTkn, H02DX2_A14753MRPrReg, H02DX2_A14752MRPrIp, H02DX2_A14751MRPrUsu, H02DX2_A14763MRPrFecEv, H02DX2_A14722MRPrEr, H02DX2_A14765MRPrValMax, H02DX2_A14721MRPrVal, H02DX2_A14764MRPrValMin, H02DX2_A14682MRPrFec,
            H02DX2_A14757MRPrPLC, H02DX2_A14758MRPrParDsc, H02DX2_A14750MRPrParCod, H02DX2_A14723MRPrParId, H02DX2_A14759MRPrFasDsc, H02DX2_A14719MRPrFasCod, H02DX2_A14760MRPrMaqDsc, H02DX2_A14720MRPrMaqCod, H02DX2_A14762MRPrLin, H02DX2_A14761MRPrOrd,
            H02DX2_A14754MRPrHdr2, H02DX2_A14755MRPrHdr, H02DX2_A130BarCodPar, H02DX2_A132BarCodReo, H02DX2_A129BarCod, H02DX2_A396EmprCod, H02DX2_A14681MRPrId
            }
            , new Object[] {
            H02DX3_AGRID_nRecordCount
            }
         }
      );
      AV131Pgmname = "Ingenieria.MRec_AnalisisHdr" ;
      /* GeneXus formulas. */
      AV131Pgmname = "Ingenieria.MRec_AnalisisHdr" ;
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavBarser_Enabled = 0 ;
      edtavBarserdsc_Enabled = 0 ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBartipcol_Enabled = 0 ;
      edtavTotvaluemrprhdr_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV23ManageFiltersExecutionStep ;
   private byte AV57TFBarCodReo ;
   private byte AV58TFBarCodReo_To ;
   private byte AV77TFMRPrEr_Sel ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A132BarCodReo ;
   private byte AV119BarTipCol ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV137Ingenieria_mrec_analisishdrds_6_tfbarcodreo ;
   private byte AV138Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to ;
   private byte AV172Ingenieria_mrec_analisishdrds_41_tfmrprer_sel ;
   private byte GXv_int12[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV61TFMRPrOrd ;
   private short AV62TFMRPrOrd_To ;
   private short AV88TFMRPrParCod ;
   private short AV89TFMRPrParCod_To ;
   private short AV48OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short A14761MRPrOrd ;
   private short A14750MRPrParCod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV145Ingenieria_mrec_analisishdrds_14_tfmrprord ;
   private short AV146Ingenieria_mrec_analisishdrds_15_tfmrprord_to ;
   private short AV159Ingenieria_mrec_analisishdrds_28_tfmrprparcod ;
   private short AV160Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_39 ;
   private int nGXsfl_39_idx=1 ;
   private int AV55TFBarCod ;
   private int AV56TFBarCod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A129BarCod ;
   private int AV111CliCod ;
   private int AV120BarColNum ;
   private int subGrid_Islastpage ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarserdsc_Enabled ;
   private int edtavBarcolnum_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int edtavBartipcol_Enabled ;
   private int edtavTotvaluemrprhdr_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV32MaqCod_size ;
   private int AV33FasCod_size ;
   private int AV34Hdr_size ;
   private int AV135Ingenieria_mrec_analisishdrds_4_tfbarcod ;
   private int AV136Ingenieria_mrec_analisishdrds_5_tfbarcod_to ;
   private int edtEmprCod_Visible ;
   private int edtBarCod_Visible ;
   private int edtBarCodReo_Visible ;
   private int edtBarCodPar_Visible ;
   private int edtMRPrHdr_Visible ;
   private int edtMRPrHdr2_Visible ;
   private int edtMRPrOrd_Visible ;
   private int edtMRPrLin_Visible ;
   private int edtMRPrMaqCod_Visible ;
   private int edtMRPrMaqDsc_Visible ;
   private int edtMRPrFasCod_Visible ;
   private int edtMRPrFasDsc_Visible ;
   private int edtMRPrParId_Visible ;
   private int edtMRPrParCod_Visible ;
   private int edtMRPrParDsc_Visible ;
   private int edtMRPrPLC_Visible ;
   private int edtMRPrFec_Visible ;
   private int edtMRPrValMin_Visible ;
   private int edtMRPrVal_Visible ;
   private int edtMRPrValMax_Visible ;
   private int edtMRPrFecEv_Visible ;
   private int edtavClicod_Visible ;
   private int edtavClinom_Visible ;
   private int edtavBarser_Visible ;
   private int edtavBarserdsc_Visible ;
   private int edtavBarcolnum_Visible ;
   private int edtavBarcolnom_Visible ;
   private int edtavBartipcol_Visible ;
   private int AV25PageToGo ;
   private int GXv_int9[] ;
   private int GXv_int10[] ;
   private int AV174GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV63TFMRPrLin ;
   private long AV64TFMRPrLin_To ;
   private long AV92TFMRPrParId ;
   private long AV93TFMRPrParId_To ;
   private long AV26GridCurrentPage ;
   private long AV27GridPageCount ;
   private long A14681MRPrId ;
   private long A14762MRPrLin ;
   private long A14723MRPrParId ;
   private long GRID_nCurrentRecord ;
   private long AV147Ingenieria_mrec_analisishdrds_16_tfmrprlin ;
   private long AV148Ingenieria_mrec_analisishdrds_17_tfmrprlin_to ;
   private long AV157Ingenieria_mrec_analisishdrds_26_tfmrprparid ;
   private long AV158Ingenieria_mrec_analisishdrds_27_tfmrprparid_to ;
   private long GRID_nRecordCount ;
   private long AV105TotMRPrHdr ;
   private String wcpOAV107inEmprCod ;
   private String wcpOAV108inUsurCod ;
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
   private String AV107inEmprCod ;
   private String AV108inUsurCod ;
   private String sGXsfl_39_idx="0001" ;
   private String AV29EmprCod ;
   private String AV31UsurCod ;
   private String AV53TFEmprCod ;
   private String AV54TFEmprCod_Sel ;
   private String AV59TFBarCodPar ;
   private String AV60TFBarCodPar_Sel ;
   private String AV73TFMRPrHdr ;
   private String AV74TFMRPrHdr_Sel ;
   private String AV69TFMRPrMaqCod ;
   private String AV70TFMRPrMaqCod_Sel ;
   private String AV65TFMRPrFasCod ;
   private String AV66TFMRPrFasCod_Sel ;
   private String AV82TFMRPrValMin ;
   private String AV83TFMRPrValMin_Sel ;
   private String AV80TFMRPrVal ;
   private String AV81TFMRPrVal_Sel ;
   private String AV84TFMRPrValMax ;
   private String AV85TFMRPrValMax_Sel ;
   private String AV131Pgmname ;
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
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
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
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_mrprfecauxdates_Internalname ;
   private String edtavDdo_mrprfecauxdate_Internalname ;
   private String edtavDdo_mrprfecauxdate_Jsonclick ;
   private String divDdo_mrprfecevauxdates_Internalname ;
   private String edtavDdo_mrprfecevauxdate_Internalname ;
   private String edtavDdo_mrprfecevauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String edtMRPrId_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String A14755MRPrHdr ;
   private String edtMRPrHdr_Internalname ;
   private String edtMRPrHdr2_Internalname ;
   private String edtMRPrOrd_Internalname ;
   private String edtMRPrLin_Internalname ;
   private String A14720MRPrMaqCod ;
   private String edtMRPrMaqCod_Internalname ;
   private String edtMRPrMaqDsc_Internalname ;
   private String A14719MRPrFasCod ;
   private String edtMRPrFasCod_Internalname ;
   private String edtMRPrFasDsc_Internalname ;
   private String edtMRPrParId_Internalname ;
   private String edtMRPrParCod_Internalname ;
   private String edtMRPrParDsc_Internalname ;
   private String edtMRPrPLC_Internalname ;
   private String edtMRPrFec_Internalname ;
   private String A14764MRPrValMin ;
   private String edtMRPrValMin_Internalname ;
   private String A14721MRPrVal ;
   private String edtMRPrVal_Internalname ;
   private String A14765MRPrValMax ;
   private String edtMRPrValMax_Internalname ;
   private String edtMRPrFecEv_Internalname ;
   private String A14751MRPrUsu ;
   private String edtMRPrUsu_Internalname ;
   private String edtMRPrIp_Internalname ;
   private String edtMRPrReg_Internalname ;
   private String edtMRPrTkn_Internalname ;
   private String edtavClicod_Internalname ;
   private String AV112CliNom ;
   private String edtavClinom_Internalname ;
   private String AV117BarSer ;
   private String edtavBarser_Internalname ;
   private String AV118BarSerDsc ;
   private String edtavBarserdsc_Internalname ;
   private String edtavBarcolnum_Internalname ;
   private String AV121BarColNom ;
   private String edtavBarcolnom_Internalname ;
   private String edtavBartipcol_Internalname ;
   private String edtavTotvaluemrprhdr_Internalname ;
   private String scmdbuf ;
   private String lV133Ingenieria_mrec_analisishdrds_2_tfemprcod ;
   private String lV139Ingenieria_mrec_analisishdrds_8_tfbarcodpar ;
   private String lV141Ingenieria_mrec_analisishdrds_10_tfmrprhdr ;
   private String lV149Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ;
   private String lV153Ingenieria_mrec_analisishdrds_22_tfmrprfascod ;
   private String lV166Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ;
   private String lV168Ingenieria_mrec_analisishdrds_37_tfmrprval ;
   private String lV170Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ;
   private String AV134Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ;
   private String AV133Ingenieria_mrec_analisishdrds_2_tfemprcod ;
   private String AV140Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ;
   private String AV139Ingenieria_mrec_analisishdrds_8_tfbarcodpar ;
   private String AV142Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ;
   private String AV141Ingenieria_mrec_analisishdrds_10_tfmrprhdr ;
   private String AV150Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ;
   private String AV149Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ;
   private String AV154Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ;
   private String AV153Ingenieria_mrec_analisishdrds_22_tfmrprfascod ;
   private String AV167Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ;
   private String AV166Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ;
   private String AV169Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ;
   private String AV168Ingenieria_mrec_analisishdrds_37_tfmrprval ;
   private String AV171Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ;
   private String AV170Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ;
   private String hsh ;
   private String AV28Station ;
   private String AV30EmprNom ;
   private String GXt_char37 ;
   private String GXv_char38[] ;
   private String GXt_char35 ;
   private String GXv_char36[] ;
   private String GXt_char33 ;
   private String GXv_char34[] ;
   private String GXt_char31 ;
   private String GXv_char32[] ;
   private String GXt_char29 ;
   private String GXv_char30[] ;
   private String GXt_char27 ;
   private String GXv_char28[] ;
   private String GXt_char25 ;
   private String GXv_char26[] ;
   private String GXt_char23 ;
   private String GXv_char24[] ;
   private String GXt_char21 ;
   private String GXv_char22[] ;
   private String GXt_char20 ;
   private String GXv_char11[] ;
   private String GXt_char19 ;
   private String GXv_char4[] ;
   private String GXt_char18 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluemrprhdr_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV107inEmprCod ;
   private String sCtrlAV40MaqCodJSON ;
   private String sCtrlAV41FasCodJSON ;
   private String sCtrlAV42HdrJSON ;
   private String sCtrlAV45Desde ;
   private String sCtrlAV46Hasta ;
   private String sCtrlAV108inUsurCod ;
   private String sCtrlAV36Ip ;
   private String sCtrlAV47Now ;
   private String sCtrlAV37MTkn ;
   private String sGXsfl_39_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtMRPrId_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtMRPrHdr_Jsonclick ;
   private String edtMRPrHdr2_Jsonclick ;
   private String edtMRPrOrd_Jsonclick ;
   private String edtMRPrLin_Jsonclick ;
   private String edtMRPrMaqCod_Jsonclick ;
   private String edtMRPrMaqDsc_Jsonclick ;
   private String edtMRPrFasCod_Jsonclick ;
   private String edtMRPrFasDsc_Jsonclick ;
   private String edtMRPrParId_Jsonclick ;
   private String edtMRPrParCod_Jsonclick ;
   private String edtMRPrParDsc_Jsonclick ;
   private String edtMRPrPLC_Jsonclick ;
   private String edtMRPrFec_Jsonclick ;
   private String edtMRPrValMin_Jsonclick ;
   private String edtMRPrVal_Jsonclick ;
   private String edtMRPrValMax_Jsonclick ;
   private String GXCCtl ;
   private String edtMRPrFecEv_Jsonclick ;
   private String edtMRPrUsu_Jsonclick ;
   private String edtMRPrIp_Jsonclick ;
   private String edtMRPrReg_Jsonclick ;
   private String edtMRPrTkn_Jsonclick ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Jsonclick ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarserdsc_Jsonclick ;
   private String edtavBarcolnum_Jsonclick ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBartipcol_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV45Desde ;
   private java.util.Date wcpOAV46Hasta ;
   private java.util.Date wcpOAV47Now ;
   private java.util.Date AV45Desde ;
   private java.util.Date AV46Hasta ;
   private java.util.Date AV47Now ;
   private java.util.Date AV78TFMRPrFec ;
   private java.util.Date AV94TFMRPrFecEv ;
   private java.util.Date A14682MRPrFec ;
   private java.util.Date A14763MRPrFecEv ;
   private java.util.Date A14753MRPrReg ;
   private java.util.Date AV165Ingenieria_mrec_analisishdrds_34_tfmrprfec ;
   private java.util.Date AV173Ingenieria_mrec_analisishdrds_42_tfmrprfecev ;
   private java.util.Date AV79DDO_MRPrFecAuxDate ;
   private java.util.Date AV95DDO_MRPrFecEvAuxDate ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV49OrderedDsc ;
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
   private boolean A14722MRPrEr ;
   private boolean bGXsfl_39_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV116Existe ;
   private boolean GXt_boolean8 ;
   private boolean GXv_boolean13[] ;
   private String AV16ColumnsSelectorXML ;
   private String AV22ManageFiltersXml ;
   private String AV17UserCustomValue ;
   private String wcpOAV40MaqCodJSON ;
   private String wcpOAV41FasCodJSON ;
   private String wcpOAV42HdrJSON ;
   private String wcpOAV36Ip ;
   private String wcpOAV37MTkn ;
   private String AV40MaqCodJSON ;
   private String AV41FasCodJSON ;
   private String AV42HdrJSON ;
   private String AV36Ip ;
   private String AV37MTkn ;
   private String AV12FilterFullText ;
   private String AV75TFMRPrHdr2 ;
   private String AV76TFMRPrHdr2_Sel ;
   private String AV71TFMRPrMaqDsc ;
   private String AV72TFMRPrMaqDsc_Sel ;
   private String AV67TFMRPrFasDsc ;
   private String AV68TFMRPrFasDsc_Sel ;
   private String AV90TFMRPrParDsc ;
   private String AV91TFMRPrParDsc_Sel ;
   private String AV86TFMRPrPLC ;
   private String AV87TFMRPrPLC_Sel ;
   private String AV126AntMrPrHdr2 ;
   private String A14754MRPrHdr2 ;
   private String A14760MRPrMaqDsc ;
   private String A14759MRPrFasDsc ;
   private String A14758MRPrParDsc ;
   private String A14757MRPrPLC ;
   private String A14752MRPrIp ;
   private String A14756MRPrTkn ;
   private String lV132Ingenieria_mrec_analisishdrds_1_filterfulltext ;
   private String lV143Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ;
   private String lV151Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ;
   private String lV155Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ;
   private String lV161Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ;
   private String lV163Ingenieria_mrec_analisishdrds_32_tfmrprplc ;
   private String AV132Ingenieria_mrec_analisishdrds_1_filterfulltext ;
   private String AV144Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ;
   private String AV143Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ;
   private String AV152Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ;
   private String AV151Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ;
   private String AV156Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ;
   private String AV155Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ;
   private String AV162Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ;
   private String AV161Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ;
   private String AV164Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ;
   private String AV163Ingenieria_mrec_analisishdrds_32_tfmrprplc ;
   private String AV106TotValueMRPrHdr ;
   private String AV14ExcelFilename ;
   private String AV15ErrorMessage ;
   private GXSimpleCollection<Short> AV35ParFasCod ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkMRPrEr ;
   private IDataStoreProvider pr_default ;
   private String[] H02DX2_A14756MRPrTkn ;
   private java.util.Date[] H02DX2_A14753MRPrReg ;
   private String[] H02DX2_A14752MRPrIp ;
   private String[] H02DX2_A14751MRPrUsu ;
   private java.util.Date[] H02DX2_A14763MRPrFecEv ;
   private boolean[] H02DX2_A14722MRPrEr ;
   private String[] H02DX2_A14765MRPrValMax ;
   private String[] H02DX2_A14721MRPrVal ;
   private String[] H02DX2_A14764MRPrValMin ;
   private java.util.Date[] H02DX2_A14682MRPrFec ;
   private String[] H02DX2_A14757MRPrPLC ;
   private String[] H02DX2_A14758MRPrParDsc ;
   private short[] H02DX2_A14750MRPrParCod ;
   private long[] H02DX2_A14723MRPrParId ;
   private String[] H02DX2_A14759MRPrFasDsc ;
   private String[] H02DX2_A14719MRPrFasCod ;
   private String[] H02DX2_A14760MRPrMaqDsc ;
   private String[] H02DX2_A14720MRPrMaqCod ;
   private long[] H02DX2_A14762MRPrLin ;
   private short[] H02DX2_A14761MRPrOrd ;
   private String[] H02DX2_A14754MRPrHdr2 ;
   private String[] H02DX2_A14755MRPrHdr ;
   private String[] H02DX2_A130BarCodPar ;
   private byte[] H02DX2_A132BarCodReo ;
   private int[] H02DX2_A129BarCod ;
   private String[] H02DX2_A396EmprCod ;
   private long[] H02DX2_A14681MRPrId ;
   private long[] H02DX3_AGRID_nRecordCount ;
   private GXSimpleCollection<String> AV32MaqCod ;
   private GXSimpleCollection<String> AV33FasCod ;
   private GXSimpleCollection<String> AV34Hdr ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV21ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState39[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector14[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector15[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV24DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class mrec_analisishdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02DX2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14720MRPrMaqCod ,
                                          GXSimpleCollection<String> AV32MaqCod ,
                                          String A14719MRPrFasCod ,
                                          GXSimpleCollection<String> AV33FasCod ,
                                          String A14755MRPrHdr ,
                                          GXSimpleCollection<String> AV34Hdr ,
                                          String AV132Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                          String AV134Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                          String AV133Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                          int AV135Ingenieria_mrec_analisishdrds_4_tfbarcod ,
                                          int AV136Ingenieria_mrec_analisishdrds_5_tfbarcod_to ,
                                          byte AV137Ingenieria_mrec_analisishdrds_6_tfbarcodreo ,
                                          byte AV138Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to ,
                                          String AV140Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                          String AV139Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                          String AV142Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                          String AV141Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                          String AV144Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                          String AV143Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                          short AV145Ingenieria_mrec_analisishdrds_14_tfmrprord ,
                                          short AV146Ingenieria_mrec_analisishdrds_15_tfmrprord_to ,
                                          long AV147Ingenieria_mrec_analisishdrds_16_tfmrprlin ,
                                          long AV148Ingenieria_mrec_analisishdrds_17_tfmrprlin_to ,
                                          String AV150Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                          String AV149Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                          String AV152Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                          String AV151Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                          String AV154Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                          String AV153Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                          String AV156Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                          String AV155Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                          long AV157Ingenieria_mrec_analisishdrds_26_tfmrprparid ,
                                          long AV158Ingenieria_mrec_analisishdrds_27_tfmrprparid_to ,
                                          short AV159Ingenieria_mrec_analisishdrds_28_tfmrprparcod ,
                                          short AV160Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to ,
                                          String AV162Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                          String AV161Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                          String AV164Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                          String AV163Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                          java.util.Date AV165Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                          String AV167Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                          String AV166Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                          String AV169Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                          String AV168Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                          String AV171Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                          String AV170Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                          byte AV172Ingenieria_mrec_analisishdrds_41_tfmrprer_sel ,
                                          java.util.Date AV173Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                          int AV32MaqCod_size ,
                                          int AV33FasCod_size ,
                                          int AV34Hdr_size ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A14754MRPrHdr2 ,
                                          short A14761MRPrOrd ,
                                          long A14762MRPrLin ,
                                          String A14760MRPrMaqDsc ,
                                          String A14759MRPrFasDsc ,
                                          long A14723MRPrParId ,
                                          short A14750MRPrParCod ,
                                          String A14758MRPrParDsc ,
                                          String A14757MRPrPLC ,
                                          String A14764MRPrValMin ,
                                          String A14721MRPrVal ,
                                          String A14765MRPrValMax ,
                                          java.util.Date A14682MRPrFec ,
                                          boolean A14722MRPrEr ,
                                          java.util.Date A14763MRPrFecEv ,
                                          short AV48OrderedBy ,
                                          boolean AV49OrderedDsc ,
                                          java.util.Date AV45Desde ,
                                          java.util.Date AV46Hasta ,
                                          String A14751MRPrUsu ,
                                          String AV31UsurCod ,
                                          String A14752MRPrIp ,
                                          String AV36Ip ,
                                          java.util.Date A14753MRPrReg ,
                                          java.util.Date AV47Now ,
                                          String A14756MRPrTkn ,
                                          String AV37MTkn ,
                                          String AV29EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int40 = new byte[71];
      Object[] GXv_Object41 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " MRPrTkn, MRPrReg, MRPrIp, MRPrUsu, MRPrFecEv, MRPrEr, MRPrValMax, MRPrVal, MRPrValMin, MRPrFec, MRPrPLC, MRPrParDsc, MRPrParCod, MRPrParId, MRPrFasDsc, MRPrFasCod," ;
      sSelectString += " MRPrMaqDsc, MRPrMaqCod, MRPrLin, MRPrOrd, MRPrHdr2, MRPrHdr, BarCodPar, BarCodReo, BarCod, EmprCod, MRPrId" ;
      sFromString = " FROM MRPr" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(MRPrFec >= ?)");
      addWhere(sWhereString, "(MRPrFec <= ?)");
      addWhere(sWhereString, "(MRPrUsu = ?)");
      addWhere(sWhereString, "(MRPrIp = ?)");
      addWhere(sWhereString, "(MRPrReg >= ?)");
      addWhere(sWhereString, "(MRPrTkn = ?)");
      if ( ! (GXutil.strcmp("", AV132Ingenieria_mrec_analisishdrds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(BarCodPar) like '%' || UPPER(?)) or ( UPPER(MRPrHdr) like '%' || UPPER(?)) or ( UPPER(MRPrHdr2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrOrd,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrLin,'999999999990'), 2) like '%' || ?) or ( UPPER(MRPrMaqCod) like '%' || UPPER(?)) or ( UPPER(MRPrMaqDsc) like '%' || UPPER(?)) or ( UPPER(MRPrFasCod) like '%' || UPPER(?)) or ( UPPER(MRPrFasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrParId,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrParCod,'9990'), 2) like '%' || ?) or ( UPPER(MRPrParDsc) like '%' || UPPER(?)) or ( UPPER(MRPrPLC) like '%' || UPPER(?)) or ( UPPER(MRPrValMin) like '%' || UPPER(?)) or ( UPPER(MRPrVal) like '%' || UPPER(?)) or ( UPPER(MRPrValMax) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int40[7] = (byte)(1) ;
         GXv_int40[8] = (byte)(1) ;
         GXv_int40[9] = (byte)(1) ;
         GXv_int40[10] = (byte)(1) ;
         GXv_int40[11] = (byte)(1) ;
         GXv_int40[12] = (byte)(1) ;
         GXv_int40[13] = (byte)(1) ;
         GXv_int40[14] = (byte)(1) ;
         GXv_int40[15] = (byte)(1) ;
         GXv_int40[16] = (byte)(1) ;
         GXv_int40[17] = (byte)(1) ;
         GXv_int40[18] = (byte)(1) ;
         GXv_int40[19] = (byte)(1) ;
         GXv_int40[20] = (byte)(1) ;
         GXv_int40[21] = (byte)(1) ;
         GXv_int40[22] = (byte)(1) ;
         GXv_int40[23] = (byte)(1) ;
         GXv_int40[24] = (byte)(1) ;
         GXv_int40[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV133Ingenieria_mrec_analisishdrds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int40[27] = (byte)(1) ;
      }
      if ( ! (0==AV135Ingenieria_mrec_analisishdrds_4_tfbarcod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int40[28] = (byte)(1) ;
      }
      if ( ! (0==AV136Ingenieria_mrec_analisishdrds_5_tfbarcod_to) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int40[29] = (byte)(1) ;
      }
      if ( ! (0==AV137Ingenieria_mrec_analisishdrds_6_tfbarcodreo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int40[30] = (byte)(1) ;
      }
      if ( ! (0==AV138Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int40[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV139Ingenieria_mrec_analisishdrds_8_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int40[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) && ( ! (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_10_tfmrprhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr = ?)");
      }
      else
      {
         GXv_int40[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) && ( ! (GXutil.strcmp("", AV143Ingenieria_mrec_analisishdrds_12_tfmrprhdr2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr2 = ?)");
      }
      else
      {
         GXv_int40[37] = (byte)(1) ;
      }
      if ( ! (0==AV145Ingenieria_mrec_analisishdrds_14_tfmrprord) )
      {
         addWhere(sWhereString, "(MRPrOrd >= ?)");
      }
      else
      {
         GXv_int40[38] = (byte)(1) ;
      }
      if ( ! (0==AV146Ingenieria_mrec_analisishdrds_15_tfmrprord_to) )
      {
         addWhere(sWhereString, "(MRPrOrd <= ?)");
      }
      else
      {
         GXv_int40[39] = (byte)(1) ;
      }
      if ( ! (0==AV147Ingenieria_mrec_analisishdrds_16_tfmrprlin) )
      {
         addWhere(sWhereString, "(MRPrLin >= ?)");
      }
      else
      {
         GXv_int40[40] = (byte)(1) ;
      }
      if ( ! (0==AV148Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) )
      {
         addWhere(sWhereString, "(MRPrLin <= ?)");
      }
      else
      {
         GXv_int40[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV150Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV149Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV150Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqCod = ?)");
      }
      else
      {
         GXv_int40[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV151Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqDsc = ?)");
      }
      else
      {
         GXv_int40[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV154Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) && ( ! (GXutil.strcmp("", AV153Ingenieria_mrec_analisishdrds_22_tfmrprfascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV154Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasCod = ?)");
      }
      else
      {
         GXv_int40[47] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV156Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV155Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasDsc = ?)");
      }
      else
      {
         GXv_int40[49] = (byte)(1) ;
      }
      if ( ! (0==AV157Ingenieria_mrec_analisishdrds_26_tfmrprparid) )
      {
         addWhere(sWhereString, "(MRPrParId >= ?)");
      }
      else
      {
         GXv_int40[50] = (byte)(1) ;
      }
      if ( ! (0==AV158Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) )
      {
         addWhere(sWhereString, "(MRPrParId <= ?)");
      }
      else
      {
         GXv_int40[51] = (byte)(1) ;
      }
      if ( ! (0==AV159Ingenieria_mrec_analisishdrds_28_tfmrprparcod) )
      {
         addWhere(sWhereString, "(MRPrParCod >= ?)");
      }
      else
      {
         GXv_int40[52] = (byte)(1) ;
      }
      if ( ! (0==AV160Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) )
      {
         addWhere(sWhereString, "(MRPrParCod <= ?)");
      }
      else
      {
         GXv_int40[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV162Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) && ( ! (GXutil.strcmp("", AV161Ingenieria_mrec_analisishdrds_30_tfmrprpardsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrParDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV162Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrParDsc = ?)");
      }
      else
      {
         GXv_int40[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV164Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) && ( ! (GXutil.strcmp("", AV163Ingenieria_mrec_analisishdrds_32_tfmrprplc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrPLC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV164Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrPLC = ?)");
      }
      else
      {
         GXv_int40[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV165Ingenieria_mrec_analisishdrds_34_tfmrprfec) )
      {
         addWhere(sWhereString, "(MRPrFec >= ?)");
      }
      else
      {
         GXv_int40[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV167Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) && ( ! (GXutil.strcmp("", AV166Ingenieria_mrec_analisishdrds_35_tfmrprvalmin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV167Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMin = ?)");
      }
      else
      {
         GXv_int40[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV169Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) && ( ! (GXutil.strcmp("", AV168Ingenieria_mrec_analisishdrds_37_tfmrprval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV169Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrVal = ?)");
      }
      else
      {
         GXv_int40[62] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV171Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) && ( ! (GXutil.strcmp("", AV170Ingenieria_mrec_analisishdrds_39_tfmrprvalmax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[63] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV171Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMax = ?)");
      }
      else
      {
         GXv_int40[64] = (byte)(1) ;
      }
      if ( AV172Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 1 )
      {
         addWhere(sWhereString, "(MRPrEr = 1)");
      }
      if ( AV172Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 2 )
      {
         addWhere(sWhereString, "(MRPrEr = 0)");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV173Ingenieria_mrec_analisishdrds_42_tfmrprfecev) )
      {
         addWhere(sWhereString, "(MRPrFecEv >= ?)");
      }
      else
      {
         GXv_int40[65] = (byte)(1) ;
      }
      if ( AV32MaqCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV32MaqCod, "MRPrMaqCod IN (", ")")+")");
      }
      if ( AV33FasCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV33FasCod, "MRPrFasCod IN (", ")")+")");
      }
      if ( AV34Hdr_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV34Hdr, "MRPrHdr IN (", ")")+")");
      }
      if ( ( AV48OrderedBy == 1 ) && ! AV49OrderedDsc )
      {
         sOrderString += " ORDER BY MRPrPLC" ;
      }
      else if ( ( AV48OrderedBy == 1 ) && ( AV49OrderedDsc ) )
      {
         sOrderString += " ORDER BY MRPrPLC DESC" ;
      }
      else if ( AV48OrderedBy == 2 )
      {
         sOrderString += " ORDER BY MRPrHdr, MRPrMaqDsc" ;
      }
      else if ( ( AV48OrderedBy == 3 ) && ! AV49OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod" ;
      }
      else if ( ( AV48OrderedBy == 3 ) && ( AV49OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV48OrderedBy == 4 ) && ! AV49OrderedDsc )
      {
         sOrderString += " ORDER BY BarCod" ;
      }
      else if ( ( AV48OrderedBy == 4 ) && ( AV49OrderedDsc ) )
      {
         sOrderString += " ORDER BY BarCod DESC" ;
      }
      else if ( ( AV48OrderedBy == 5 ) && ! AV49OrderedDsc )
      {
         sOrderString += " ORDER BY BarCodReo" ;
      }
      else if ( ( AV48OrderedBy == 5 ) && ( AV49OrderedDsc ) )
      {
         sOrderString += " ORDER BY BarCodReo DESC" ;
      }
      else if ( ( AV48OrderedBy == 6 ) && ! AV49OrderedDsc )
      {
         sOrderString += " ORDER BY BarCodPar" ;
      }
      else if ( ( AV48OrderedBy == 6 ) && ( AV49OrderedDsc ) )
      {
         sOrderString += " ORDER BY BarCodPar DESC" ;
      }
      else if ( ( AV48OrderedBy == 7 ) && ! AV49OrderedDsc )
      {
         sOrderString += " ORDER BY MRPrHdr" ;
      }
      else if ( ( AV48OrderedBy == 7 ) && ( AV49OrderedDsc ) )
      {
         sOrderString += " ORDER BY MRPrHdr DESC" ;
      }
      else if ( ( AV48OrderedBy == 8 ) && ! AV49OrderedDsc )
      {
         sOrderString += " ORDER BY MRPrHdr2" ;
      }
      else if ( ( AV48OrderedBy == 8 ) && ( AV49OrderedDsc ) )
      {
         sOrderString += " ORDER BY MRPrHdr2 DESC" ;
      }
      else if ( ( AV48OrderedBy == 9 ) && ! AV49OrderedDsc )
      {
         sOrderString += " ORDER BY MRPrOrd" ;
      }
      else if ( ( AV48OrderedBy == 9 ) && ( AV49OrderedDsc ) )
      {
         sOrderString += " ORDER BY MRPrOrd DESC" ;
      }
      else if ( ( AV48OrderedBy == 10 ) && ! AV49OrderedDsc )
      {
         sOrderString += " ORDER BY MRPrLin" ;
      }
      else if ( ( AV48OrderedBy == 10 ) && ( AV49OrderedDsc ) )
      {
         sOrderString += " ORDER BY MRPrLin DESC" ;
      }
      else if ( ( AV48OrderedBy == 11 ) && ! AV49OrderedDsc )
      {
         sOrderString += " ORDER BY MRPrMaqCod" ;
      }
      else if ( ( AV48OrderedBy == 11 ) && ( AV49OrderedDsc ) )
      {
         sOrderString += " ORDER BY MRPrMaqCod DESC" ;
      }
      else if ( ( AV48OrderedBy == 12 ) && ! AV49OrderedDsc )
      {
         sOrderString += " ORDER BY MRPrMaqDsc" ;
      }
      else if ( ( AV48OrderedBy == 12 ) && ( AV49OrderedDsc ) )
      {
         sOrderString += " ORDER BY MRPrMaqDsc DESC" ;
      }
      else if ( ( AV48OrderedBy == 13 ) && ! AV49OrderedDsc )
      {
         sOrderString += " ORDER BY MRPrFasCod" ;
      }
      else if ( ( AV48OrderedBy == 13 ) && ( AV49OrderedDsc ) )
      {
         sOrderString += " ORDER BY MRPrFasCod DESC" ;
      }
      else if ( ( AV48OrderedBy == 14 ) && ! AV49OrderedDsc )
      {
         sOrderString += " ORDER BY MRPrFasDsc" ;
      }
      else if ( ( AV48OrderedBy == 14 ) && ( AV49OrderedDsc ) )
      {
         sOrderString += " ORDER BY MRPrFasDsc DESC" ;
      }
      else if ( ( AV48OrderedBy == 15 ) && ! AV49OrderedDsc )
      {
         sOrderString += " ORDER BY MRPrParId" ;
      }
      else if ( ( AV48OrderedBy == 15 ) && ( AV49OrderedDsc ) )
      {
         sOrderString += " ORDER BY MRPrParId DESC" ;
      }
      else if ( ( AV48OrderedBy == 16 ) && ! AV49OrderedDsc )
      {
         sOrderString += " ORDER BY MRPrParCod" ;
      }
      else if ( ( AV48OrderedBy == 16 ) && ( AV49OrderedDsc ) )
      {
         sOrderString += " ORDER BY MRPrParCod DESC" ;
      }
      else if ( ( AV48OrderedBy == 17 ) && ! AV49OrderedDsc )
      {
         sOrderString += " ORDER BY MRPrParDsc" ;
      }
      else if ( ( AV48OrderedBy == 17 ) && ( AV49OrderedDsc ) )
      {
         sOrderString += " ORDER BY MRPrParDsc DESC" ;
      }
      else if ( ( AV48OrderedBy == 18 ) && ! AV49OrderedDsc )
      {
         sOrderString += " ORDER BY MRPrFec" ;
      }
      else if ( ( AV48OrderedBy == 18 ) && ( AV49OrderedDsc ) )
      {
         sOrderString += " ORDER BY MRPrFec DESC" ;
      }
      else if ( ( AV48OrderedBy == 19 ) && ! AV49OrderedDsc )
      {
         sOrderString += " ORDER BY MRPrValMin" ;
      }
      else if ( ( AV48OrderedBy == 19 ) && ( AV49OrderedDsc ) )
      {
         sOrderString += " ORDER BY MRPrValMin DESC" ;
      }
      else if ( ( AV48OrderedBy == 20 ) && ! AV49OrderedDsc )
      {
         sOrderString += " ORDER BY MRPrVal" ;
      }
      else if ( ( AV48OrderedBy == 20 ) && ( AV49OrderedDsc ) )
      {
         sOrderString += " ORDER BY MRPrVal DESC" ;
      }
      else if ( ( AV48OrderedBy == 21 ) && ! AV49OrderedDsc )
      {
         sOrderString += " ORDER BY MRPrValMax" ;
      }
      else if ( ( AV48OrderedBy == 21 ) && ( AV49OrderedDsc ) )
      {
         sOrderString += " ORDER BY MRPrValMax DESC" ;
      }
      else if ( ( AV48OrderedBy == 22 ) && ! AV49OrderedDsc )
      {
         sOrderString += " ORDER BY MRPrEr" ;
      }
      else if ( ( AV48OrderedBy == 22 ) && ( AV49OrderedDsc ) )
      {
         sOrderString += " ORDER BY MRPrEr DESC" ;
      }
      else if ( ( AV48OrderedBy == 23 ) && ! AV49OrderedDsc )
      {
         sOrderString += " ORDER BY MRPrFecEv" ;
      }
      else if ( ( AV48OrderedBy == 23 ) && ( AV49OrderedDsc ) )
      {
         sOrderString += " ORDER BY MRPrFecEv DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY MRPrId" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object41[0] = scmdbuf ;
      GXv_Object41[1] = GXv_int40 ;
      return GXv_Object41 ;
   }

   protected Object[] conditional_H02DX3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14720MRPrMaqCod ,
                                          GXSimpleCollection<String> AV32MaqCod ,
                                          String A14719MRPrFasCod ,
                                          GXSimpleCollection<String> AV33FasCod ,
                                          String A14755MRPrHdr ,
                                          GXSimpleCollection<String> AV34Hdr ,
                                          String AV132Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                          String AV134Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                          String AV133Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                          int AV135Ingenieria_mrec_analisishdrds_4_tfbarcod ,
                                          int AV136Ingenieria_mrec_analisishdrds_5_tfbarcod_to ,
                                          byte AV137Ingenieria_mrec_analisishdrds_6_tfbarcodreo ,
                                          byte AV138Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to ,
                                          String AV140Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                          String AV139Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                          String AV142Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                          String AV141Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                          String AV144Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                          String AV143Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                          short AV145Ingenieria_mrec_analisishdrds_14_tfmrprord ,
                                          short AV146Ingenieria_mrec_analisishdrds_15_tfmrprord_to ,
                                          long AV147Ingenieria_mrec_analisishdrds_16_tfmrprlin ,
                                          long AV148Ingenieria_mrec_analisishdrds_17_tfmrprlin_to ,
                                          String AV150Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                          String AV149Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                          String AV152Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                          String AV151Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                          String AV154Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                          String AV153Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                          String AV156Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                          String AV155Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                          long AV157Ingenieria_mrec_analisishdrds_26_tfmrprparid ,
                                          long AV158Ingenieria_mrec_analisishdrds_27_tfmrprparid_to ,
                                          short AV159Ingenieria_mrec_analisishdrds_28_tfmrprparcod ,
                                          short AV160Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to ,
                                          String AV162Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                          String AV161Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                          String AV164Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                          String AV163Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                          java.util.Date AV165Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                          String AV167Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                          String AV166Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                          String AV169Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                          String AV168Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                          String AV171Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                          String AV170Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                          byte AV172Ingenieria_mrec_analisishdrds_41_tfmrprer_sel ,
                                          java.util.Date AV173Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                          int AV32MaqCod_size ,
                                          int AV33FasCod_size ,
                                          int AV34Hdr_size ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A14754MRPrHdr2 ,
                                          short A14761MRPrOrd ,
                                          long A14762MRPrLin ,
                                          String A14760MRPrMaqDsc ,
                                          String A14759MRPrFasDsc ,
                                          long A14723MRPrParId ,
                                          short A14750MRPrParCod ,
                                          String A14758MRPrParDsc ,
                                          String A14757MRPrPLC ,
                                          String A14764MRPrValMin ,
                                          String A14721MRPrVal ,
                                          String A14765MRPrValMax ,
                                          java.util.Date A14682MRPrFec ,
                                          boolean A14722MRPrEr ,
                                          java.util.Date A14763MRPrFecEv ,
                                          short AV48OrderedBy ,
                                          boolean AV49OrderedDsc ,
                                          java.util.Date AV45Desde ,
                                          java.util.Date AV46Hasta ,
                                          String A14751MRPrUsu ,
                                          String AV31UsurCod ,
                                          String A14752MRPrIp ,
                                          String AV36Ip ,
                                          java.util.Date A14753MRPrReg ,
                                          java.util.Date AV47Now ,
                                          String A14756MRPrTkn ,
                                          String AV37MTkn ,
                                          String AV29EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int43 = new byte[66];
      Object[] GXv_Object44 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM MRPr" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(MRPrFec >= ?)");
      addWhere(sWhereString, "(MRPrFec <= ?)");
      addWhere(sWhereString, "(MRPrUsu = ?)");
      addWhere(sWhereString, "(MRPrIp = ?)");
      addWhere(sWhereString, "(MRPrReg >= ?)");
      addWhere(sWhereString, "(MRPrTkn = ?)");
      if ( ! (GXutil.strcmp("", AV132Ingenieria_mrec_analisishdrds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(BarCodPar) like '%' || UPPER(?)) or ( UPPER(MRPrHdr) like '%' || UPPER(?)) or ( UPPER(MRPrHdr2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrOrd,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrLin,'999999999990'), 2) like '%' || ?) or ( UPPER(MRPrMaqCod) like '%' || UPPER(?)) or ( UPPER(MRPrMaqDsc) like '%' || UPPER(?)) or ( UPPER(MRPrFasCod) like '%' || UPPER(?)) or ( UPPER(MRPrFasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrParId,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrParCod,'9990'), 2) like '%' || ?) or ( UPPER(MRPrParDsc) like '%' || UPPER(?)) or ( UPPER(MRPrPLC) like '%' || UPPER(?)) or ( UPPER(MRPrValMin) like '%' || UPPER(?)) or ( UPPER(MRPrVal) like '%' || UPPER(?)) or ( UPPER(MRPrValMax) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int43[7] = (byte)(1) ;
         GXv_int43[8] = (byte)(1) ;
         GXv_int43[9] = (byte)(1) ;
         GXv_int43[10] = (byte)(1) ;
         GXv_int43[11] = (byte)(1) ;
         GXv_int43[12] = (byte)(1) ;
         GXv_int43[13] = (byte)(1) ;
         GXv_int43[14] = (byte)(1) ;
         GXv_int43[15] = (byte)(1) ;
         GXv_int43[16] = (byte)(1) ;
         GXv_int43[17] = (byte)(1) ;
         GXv_int43[18] = (byte)(1) ;
         GXv_int43[19] = (byte)(1) ;
         GXv_int43[20] = (byte)(1) ;
         GXv_int43[21] = (byte)(1) ;
         GXv_int43[22] = (byte)(1) ;
         GXv_int43[23] = (byte)(1) ;
         GXv_int43[24] = (byte)(1) ;
         GXv_int43[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV133Ingenieria_mrec_analisishdrds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int43[27] = (byte)(1) ;
      }
      if ( ! (0==AV135Ingenieria_mrec_analisishdrds_4_tfbarcod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int43[28] = (byte)(1) ;
      }
      if ( ! (0==AV136Ingenieria_mrec_analisishdrds_5_tfbarcod_to) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int43[29] = (byte)(1) ;
      }
      if ( ! (0==AV137Ingenieria_mrec_analisishdrds_6_tfbarcodreo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int43[30] = (byte)(1) ;
      }
      if ( ! (0==AV138Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int43[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV139Ingenieria_mrec_analisishdrds_8_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int43[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) && ( ! (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_10_tfmrprhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr = ?)");
      }
      else
      {
         GXv_int43[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) && ( ! (GXutil.strcmp("", AV143Ingenieria_mrec_analisishdrds_12_tfmrprhdr2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr2 = ?)");
      }
      else
      {
         GXv_int43[37] = (byte)(1) ;
      }
      if ( ! (0==AV145Ingenieria_mrec_analisishdrds_14_tfmrprord) )
      {
         addWhere(sWhereString, "(MRPrOrd >= ?)");
      }
      else
      {
         GXv_int43[38] = (byte)(1) ;
      }
      if ( ! (0==AV146Ingenieria_mrec_analisishdrds_15_tfmrprord_to) )
      {
         addWhere(sWhereString, "(MRPrOrd <= ?)");
      }
      else
      {
         GXv_int43[39] = (byte)(1) ;
      }
      if ( ! (0==AV147Ingenieria_mrec_analisishdrds_16_tfmrprlin) )
      {
         addWhere(sWhereString, "(MRPrLin >= ?)");
      }
      else
      {
         GXv_int43[40] = (byte)(1) ;
      }
      if ( ! (0==AV148Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) )
      {
         addWhere(sWhereString, "(MRPrLin <= ?)");
      }
      else
      {
         GXv_int43[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV150Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV149Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV150Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqCod = ?)");
      }
      else
      {
         GXv_int43[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV151Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqDsc = ?)");
      }
      else
      {
         GXv_int43[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV154Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) && ( ! (GXutil.strcmp("", AV153Ingenieria_mrec_analisishdrds_22_tfmrprfascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV154Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasCod = ?)");
      }
      else
      {
         GXv_int43[47] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV156Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV155Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasDsc = ?)");
      }
      else
      {
         GXv_int43[49] = (byte)(1) ;
      }
      if ( ! (0==AV157Ingenieria_mrec_analisishdrds_26_tfmrprparid) )
      {
         addWhere(sWhereString, "(MRPrParId >= ?)");
      }
      else
      {
         GXv_int43[50] = (byte)(1) ;
      }
      if ( ! (0==AV158Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) )
      {
         addWhere(sWhereString, "(MRPrParId <= ?)");
      }
      else
      {
         GXv_int43[51] = (byte)(1) ;
      }
      if ( ! (0==AV159Ingenieria_mrec_analisishdrds_28_tfmrprparcod) )
      {
         addWhere(sWhereString, "(MRPrParCod >= ?)");
      }
      else
      {
         GXv_int43[52] = (byte)(1) ;
      }
      if ( ! (0==AV160Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) )
      {
         addWhere(sWhereString, "(MRPrParCod <= ?)");
      }
      else
      {
         GXv_int43[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV162Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) && ( ! (GXutil.strcmp("", AV161Ingenieria_mrec_analisishdrds_30_tfmrprpardsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrParDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV162Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrParDsc = ?)");
      }
      else
      {
         GXv_int43[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV164Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) && ( ! (GXutil.strcmp("", AV163Ingenieria_mrec_analisishdrds_32_tfmrprplc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrPLC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV164Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrPLC = ?)");
      }
      else
      {
         GXv_int43[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV165Ingenieria_mrec_analisishdrds_34_tfmrprfec) )
      {
         addWhere(sWhereString, "(MRPrFec >= ?)");
      }
      else
      {
         GXv_int43[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV167Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) && ( ! (GXutil.strcmp("", AV166Ingenieria_mrec_analisishdrds_35_tfmrprvalmin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV167Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMin = ?)");
      }
      else
      {
         GXv_int43[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV169Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) && ( ! (GXutil.strcmp("", AV168Ingenieria_mrec_analisishdrds_37_tfmrprval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV169Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrVal = ?)");
      }
      else
      {
         GXv_int43[62] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV171Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) && ( ! (GXutil.strcmp("", AV170Ingenieria_mrec_analisishdrds_39_tfmrprvalmax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[63] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV171Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMax = ?)");
      }
      else
      {
         GXv_int43[64] = (byte)(1) ;
      }
      if ( AV172Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 1 )
      {
         addWhere(sWhereString, "(MRPrEr = 1)");
      }
      if ( AV172Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 2 )
      {
         addWhere(sWhereString, "(MRPrEr = 0)");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV173Ingenieria_mrec_analisishdrds_42_tfmrprfecev) )
      {
         addWhere(sWhereString, "(MRPrFecEv >= ?)");
      }
      else
      {
         GXv_int43[65] = (byte)(1) ;
      }
      if ( AV32MaqCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV32MaqCod, "MRPrMaqCod IN (", ")")+")");
      }
      if ( AV33FasCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV33FasCod, "MRPrFasCod IN (", ")")+")");
      }
      if ( AV34Hdr_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV34Hdr, "MRPrHdr IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV48OrderedBy == 1 ) && ! AV49OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 1 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( AV48OrderedBy == 2 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 3 ) && ! AV49OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 3 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 4 ) && ! AV49OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 4 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 5 ) && ! AV49OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 5 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 6 ) && ! AV49OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 6 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 7 ) && ! AV49OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 7 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 8 ) && ! AV49OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 8 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 9 ) && ! AV49OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 9 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 10 ) && ! AV49OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 10 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 11 ) && ! AV49OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 11 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 12 ) && ! AV49OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 12 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 13 ) && ! AV49OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 13 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 14 ) && ! AV49OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 14 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 15 ) && ! AV49OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 15 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 16 ) && ! AV49OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 16 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 17 ) && ! AV49OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 17 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 18 ) && ! AV49OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 18 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 19 ) && ! AV49OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 19 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 20 ) && ! AV49OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 20 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 21 ) && ! AV49OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 21 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 22 ) && ! AV49OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 22 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 23 ) && ! AV49OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV48OrderedBy == 23 ) && ( AV49OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object44[0] = scmdbuf ;
      GXv_Object44[1] = GXv_int43 ;
      return GXv_Object44 ;
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
                  return conditional_H02DX2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).longValue() , ((Number) dynConstraints[22]).longValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).longValue() , ((Number) dynConstraints[32]).longValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).longValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).longValue() , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (java.util.Date)dynConstraints[67] , ((Boolean) dynConstraints[68]).booleanValue() , (java.util.Date)dynConstraints[69] , ((Number) dynConstraints[70]).shortValue() , ((Boolean) dynConstraints[71]).booleanValue() , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (java.util.Date)dynConstraints[78] , (java.util.Date)dynConstraints[79] , (String)dynConstraints[80] , (String)dynConstraints[81] , (String)dynConstraints[82] );
            case 1 :
                  return conditional_H02DX3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).longValue() , ((Number) dynConstraints[22]).longValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).longValue() , ((Number) dynConstraints[32]).longValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).longValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).longValue() , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (java.util.Date)dynConstraints[67] , ((Boolean) dynConstraints[68]).booleanValue() , (java.util.Date)dynConstraints[69] , ((Number) dynConstraints[70]).shortValue() , ((Boolean) dynConstraints[71]).booleanValue() , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (java.util.Date)dynConstraints[78] , (java.util.Date)dynConstraints[79] , (String)dynConstraints[80] , (String)dynConstraints[81] , (String)dynConstraints[82] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02DX2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02DX3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2, true);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[5])[0] = rslt.getBoolean(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((long[]) buf[13])[0] = rslt.getLong(14);
               ((String[]) buf[14])[0] = rslt.getVarchar(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 8);
               ((String[]) buf[16])[0] = rslt.getVarchar(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 6);
               ((long[]) buf[18])[0] = rslt.getLong(19);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((String[]) buf[20])[0] = rslt.getVarchar(21);
               ((String[]) buf[21])[0] = rslt.getString(22, 10);
               ((String[]) buf[22])[0] = rslt.getString(23, 1);
               ((byte[]) buf[23])[0] = rslt.getByte(24);
               ((int[]) buf[24])[0] = rslt.getInt(25);
               ((String[]) buf[25])[0] = rslt.getString(26, 3);
               ((long[]) buf[26])[0] = rslt.getLong(27);
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
                  stmt.setString(sIdx, (String)parms[71], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[72], false, true);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[73], false, true);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[76], false, true);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 256);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 3);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[101]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[102]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[107], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[108], 10);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[109]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[110]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[111]).longValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[112]).longValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[116], 100);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 8);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[119], 100);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[120], 100);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[121]).longValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[122]).longValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[123]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[124]).shortValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[125], 100);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[126], 100);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[127], 100);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[128], 100);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[129], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 12);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 12);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 12);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 12);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 12);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 12);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[136], false);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[139]).intValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[140]).intValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[141]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false, true);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[68], false, true);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[71], false, true);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 256);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 3);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[97]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 10);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[104]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[105]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[106]).longValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[107]).longValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[111], 100);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 100);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[117]).longValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[118]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[119]).shortValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[120], 100);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[121], 100);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[122], 100);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[123], 100);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[124], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 12);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 12);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 12);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 12);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 12);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 12);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[131], false);
               }
               return;
      }
   }

}

