package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class analisiscostesbasicos_wc_impl extends GXWebComponent
{
   public analisiscostesbasicos_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public analisiscostesbasicos_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( analisiscostesbasicos_wc_impl.class ));
   }

   public analisiscostesbasicos_wc_impl( int remoteHandle ,
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
               AV45Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Emprcod", AV45Emprcod);
               AV13CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13CliCod), 6, 0));
               AV49Clicod_to = (int)(GXutil.lval( httpContext.GetPar( "Clicod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49Clicod_to), 6, 0));
               AV8BarFecGen = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarFecGen", localUtil.format(AV8BarFecGen, "99/99/99"));
               AV9BarFecGen_to = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarFecGen_to", localUtil.format(AV9BarFecGen_to, "99/99/99"));
               AV10BarFecSal = localUtil.parseDateParm( httpContext.GetPar( "BarFecSal")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarFecSal", localUtil.format(AV10BarFecSal, "99/99/99"));
               AV11BarFecSal_to = localUtil.parseDateParm( httpContext.GetPar( "BarFecSal_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarFecSal_to", localUtil.format(AV11BarFecSal_to, "99/99/99"));
               AV12BarSer = httpContext.GetPar( "BarSer") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12BarSer", AV12BarSer);
               AV46InBarcod = (int)(GXutil.lval( httpContext.GetPar( "InBarcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46InBarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46InBarcod), 8, 0));
               AV47InBarcodreo = (byte)(GXutil.lval( httpContext.GetPar( "InBarcodreo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47InBarcodreo", GXutil.str( AV47InBarcodreo, 1, 0));
               AV48InBarcodpar = httpContext.GetPar( "InBarcodpar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48InBarcodpar", AV48InBarcodpar);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV45Emprcod,Integer.valueOf(AV13CliCod),Integer.valueOf(AV49Clicod_to),AV8BarFecGen,AV9BarFecGen_to,AV10BarFecSal,AV11BarFecSal_to,AV12BarSer,Integer.valueOf(AV46InBarcod),Byte.valueOf(AV47InBarcodreo),AV48InBarcodpar});
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
      AV45Emprcod = httpContext.GetPar( "Emprcod") ;
      AV13CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV49Clicod_to = (int)(GXutil.lval( httpContext.GetPar( "Clicod_to"))) ;
      AV8BarFecGen = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen")) ;
      AV9BarFecGen_to = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen_to")) ;
      AV10BarFecSal = localUtil.parseDateParm( httpContext.GetPar( "BarFecSal")) ;
      AV11BarFecSal_to = localUtil.parseDateParm( httpContext.GetPar( "BarFecSal_to")) ;
      AV12BarSer = httpContext.GetPar( "BarSer") ;
      AV46InBarcod = (int)(GXutil.lval( httpContext.GetPar( "InBarcod"))) ;
      AV47InBarcodreo = (byte)(GXutil.lval( httpContext.GetPar( "InBarcodreo"))) ;
      AV48InBarcodpar = httpContext.GetPar( "InBarcodpar") ;
      AV34ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV29ColumnsSelector);
      AV24FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV35TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV36TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV37TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV38TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV39TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV40TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV55TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV56TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV57TFBarSerDsc = httpContext.GetPar( "TFBarSerDsc") ;
      AV58TFBarSerDsc_Sel = httpContext.GetPar( "TFBarSerDsc_Sel") ;
      AV59TFBarColNom = httpContext.GetPar( "TFBarColNom") ;
      AV60TFBarColNom_Sel = httpContext.GetPar( "TFBarColNom_Sel") ;
      AV61TFBarColNum = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum"))) ;
      AV62TFBarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum_To"))) ;
      AV65TFBarNomCli = httpContext.GetPar( "TFBarNomCli") ;
      AV66TFBarNomCli_Sel = httpContext.GetPar( "TFBarNomCli_Sel") ;
      AV67TFBarKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKgm"), ".") ;
      AV68TFBarKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKgm_To"), ".") ;
      AV69TFBarMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMtr"), ".") ;
      AV70TFBarMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMtr_To"), ".") ;
      AV71TFBarFecGen = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecGen")) ;
      AV75TFBarFecSal = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecSal")) ;
      AV119Pgmname = httpContext.GetPar( "Pgmname") ;
      AV21OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV22OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV51CosteFab = CommonUtil.decimalVal( httpContext.GetPar( "CosteFab"), ".") ;
      AV88CosteTeo = CommonUtil.decimalVal( httpContext.GetPar( "CosteTeo"), ".") ;
      AV81mAgua = CommonUtil.decimalVal( httpContext.GetPar( "mAgua"), ".") ;
      AV82menergia = CommonUtil.decimalVal( httpContext.GetPar( "menergia"), ".") ;
      AV83mgas = CommonUtil.decimalVal( httpContext.GetPar( "mgas"), ".") ;
      AV84mmod = CommonUtil.decimalVal( httpContext.GetPar( "mmod"), ".") ;
      AV85mmoi = CommonUtil.decimalVal( httpContext.GetPar( "mmoi"), ".") ;
      AV86Traza = (byte)(GXutil.lval( httpContext.GetPar( "Traza"))) ;
      AV118Costest = CommonUtil.decimalVal( httpContext.GetPar( "Costest"), ".") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV45Emprcod, AV13CliCod, AV49Clicod_to, AV8BarFecGen, AV9BarFecGen_to, AV10BarFecSal, AV11BarFecSal_to, AV12BarSer, AV46InBarcod, AV47InBarcodreo, AV48InBarcodpar, AV34ManageFiltersExecutionStep, AV29ColumnsSelector, AV24FilterFullText, AV35TFCliCod, AV36TFCliCod_To, AV37TFCliNom, AV38TFCliNom_Sel, AV39TFBarNHdr, AV40TFBarNHdr_Sel, AV55TFBarSer, AV56TFBarSer_Sel, AV57TFBarSerDsc, AV58TFBarSerDsc_Sel, AV59TFBarColNom, AV60TFBarColNom_Sel, AV61TFBarColNum, AV62TFBarColNum_To, AV65TFBarNomCli, AV66TFBarNomCli_Sel, AV67TFBarKgm, AV68TFBarKgm_To, AV69TFBarMtr, AV70TFBarMtr_To, AV71TFBarFecGen, AV75TFBarFecSal, AV119Pgmname, AV21OrderedBy, AV22OrderedDsc, AV51CosteFab, AV88CosteTeo, AV81mAgua, AV82menergia, AV83mgas, AV84mmod, AV85mmoi, AV86Traza, AV118Costest, A396EmprCod, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa19Y2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Mantenimiento HDRs", "")) ;
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
         FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"true\"" ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.analisiscostesbasicos_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV45Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV13CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV49Clicod_to,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV8BarFecGen)),GXutil.URLEncode(GXutil.formatDateParm(AV9BarFecGen_to)),GXutil.URLEncode(GXutil.formatDateParm(AV10BarFecSal)),GXutil.URLEncode(GXutil.formatDateParm(AV11BarFecSal_to)),GXutil.URLEncode(GXutil.rtrim(AV12BarSer)),GXutil.URLEncode(GXutil.ltrimstr(AV46InBarcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV47InBarcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV48InBarcodpar))}, new String[] {"Emprcod","CliCod","Clicod_to","BarFecGen","BarFecGen_to","BarFecSal","BarFecSal_to","BarSer","InBarcod","InBarcodreo","InBarcodpar"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV119Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTETEO", getSecureSignedToken( sPrefix, localUtil.format( AV88CosteTeo, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMAGUA", getSecureSignedToken( sPrefix, localUtil.format( AV81mAgua, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMENERGIA", getSecureSignedToken( sPrefix, localUtil.format( AV82menergia, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMGAS", getSecureSignedToken( sPrefix, localUtil.format( AV83mgas, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMMOD", getSecureSignedToken( sPrefix, localUtil.format( AV84mmod, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMMOI", getSecureSignedToken( sPrefix, localUtil.format( AV85mmoi, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTRAZA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV86Traza), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTEST", getSecureSignedToken( sPrefix, localUtil.format( AV118Costest, "9999999.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_41", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_41, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV32ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV32ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV43GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV44GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV41DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV41DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV29ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV29ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV45Emprcod", GXutil.rtrim( wcpOAV45Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV13CliCod", GXutil.ltrim( localUtil.ntoc( wcpOAV13CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV49Clicod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV49Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8BarFecGen", localUtil.dtoc( wcpOAV8BarFecGen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9BarFecGen_to", localUtil.dtoc( wcpOAV9BarFecGen_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10BarFecSal", localUtil.dtoc( wcpOAV10BarFecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11BarFecSal_to", localUtil.dtoc( wcpOAV11BarFecSal_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV12BarSer", GXutil.rtrim( wcpOAV12BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV46InBarcod", GXutil.ltrim( localUtil.ntoc( wcpOAV46InBarcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV47InBarcodreo", GXutil.ltrim( localUtil.ntoc( wcpOAV47InBarcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV48InBarcodpar", GXutil.rtrim( wcpOAV48InBarcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV34ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV35TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV36TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV37TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV38TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR", GXutil.rtrim( AV39TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR_SEL", GXutil.rtrim( AV40TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER", GXutil.rtrim( AV55TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER_SEL", GXutil.rtrim( AV56TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC", GXutil.rtrim( AV57TFBarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC_SEL", GXutil.rtrim( AV58TFBarSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM", GXutil.rtrim( AV59TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM_SEL", GXutil.rtrim( AV60TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV61TFBarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV62TFBarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNOMCLI", GXutil.rtrim( AV65TFBarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNOMCLI_SEL", GXutil.rtrim( AV66TFBarNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGM", GXutil.ltrim( localUtil.ntoc( AV67TFBarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGM_TO", GXutil.ltrim( localUtil.ntoc( AV68TFBarKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMTR", GXutil.ltrim( localUtil.ntoc( AV69TFBarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMTR_TO", GXutil.ltrim( localUtil.ntoc( AV70TFBarMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECGEN", localUtil.dtoc( AV71TFBarFecGen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECSAL", localUtil.dtoc( AV75TFBarFecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV119Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV119Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV21OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV22OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV45Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV13CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV49Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECGEN", localUtil.dtoc( AV8BarFecGen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECGEN_TO", localUtil.dtoc( AV9BarFecGen_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECSAL", localUtil.dtoc( AV10BarFecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECSAL_TO", localUtil.dtoc( AV11BarFecSal_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSER", GXutil.rtrim( AV12BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINBARCOD", GXutil.ltrim( localUtil.ntoc( AV46InBarcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINBARCODREO", GXutil.ltrim( localUtil.ntoc( AV47InBarcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINBARCODPAR", GXutil.rtrim( AV48InBarcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARUNIMED", GXutil.rtrim( A228BarUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOSTETEO", GXutil.ltrim( localUtil.ntoc( AV88CosteTeo, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTETEO", getSecureSignedToken( sPrefix, localUtil.format( AV88CosteTeo, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAGUA", GXutil.ltrim( localUtil.ntoc( AV81mAgua, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMAGUA", getSecureSignedToken( sPrefix, localUtil.format( AV81mAgua, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMENERGIA", GXutil.ltrim( localUtil.ntoc( AV82menergia, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMENERGIA", getSecureSignedToken( sPrefix, localUtil.format( AV82menergia, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMGAS", GXutil.ltrim( localUtil.ntoc( AV83mgas, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMGAS", getSecureSignedToken( sPrefix, localUtil.format( AV83mgas, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMMOD", GXutil.ltrim( localUtil.ntoc( AV84mmod, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMMOD", getSecureSignedToken( sPrefix, localUtil.format( AV84mmod, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMMOI", GXutil.ltrim( localUtil.ntoc( AV85mmoi, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMMOI", getSecureSignedToken( sPrefix, localUtil.format( AV85mmoi, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTRAZA", GXutil.ltrim( localUtil.ntoc( AV86Traza, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTRAZA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV86Traza), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOSPRO", GXutil.ltrim( localUtil.ntoc( A141BarCosPro, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOSANY", GXutil.ltrim( localUtil.ntoc( A140BarCosAny, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOSTEST", GXutil.ltrim( localUtil.ntoc( AV118Costest, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTEST", getSecureSignedToken( sPrefix, localUtil.format( AV118Costest, "9999999.99")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV19GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV19GridState);
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

   public void renderHtmlCloseForm19Y2( )
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
      return "AnalisisCostesBasicos_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mantenimiento HDRs", "") ;
   }

   public void wb19Y0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.analisiscostesbasicos_wc");
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
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnalisisCostesBasicos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnalisisCostesBasicos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnalisisCostesBasicos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_19Y2( true) ;
      }
      else
      {
         wb_table1_23_19Y2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_19Y2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV43GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV44GridPageCount);
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0070"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0070"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_41_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0070"+"");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV41DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV41DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV29ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfecgenauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfecgenauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfecgenauxdate_Internalname, localUtil.format(AV73DDO_BarFecGenAuxDate, "99/99/99"), localUtil.format( AV73DDO_BarFecGenAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,78);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfecgenauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnalisisCostesBasicos_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfecgenauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AnalisisCostesBasicos_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfecsalauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfecsalauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfecsalauxdate_Internalname, localUtil.format(AV77DDO_BarFecSalAuxDate, "99/99/99"), localUtil.format( AV77DDO_BarFecSalAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,80);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfecsalauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnalisisCostesBasicos_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfecsalauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AnalisisCostesBasicos_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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

   public void start19Y2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Mantenimiento HDRs", ""), (short)(0)) ;
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
            strup19Y0( ) ;
         }
      }
   }

   public void ws19Y2( )
   {
      start19Y2( ) ;
      evt19Y2( ) ;
   }

   public void evt19Y2( )
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
                              strup19Y0( ) ;
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
                              strup19Y0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1119Y2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19Y0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1219Y2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19Y0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1319Y2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19Y0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1419Y2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19Y0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1519Y2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19Y0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e1619Y2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19Y0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e1719Y2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19Y0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavDetailwebcomponent_Internalname ;
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
                              strup19Y0( ) ;
                           }
                           nGXsfl_41_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_412( ) ;
                           AV89DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV89DetailWebComponent);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavVariables_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavVariables_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVARIABLES");
                              GX_FocusControl = edtavVariables_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV87Variables = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavVariables_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87Variables), 4, 0));
                           }
                           else
                           {
                              AV87Variables = (short)(localUtil.ctol( httpContext.cgiGet( edtavVariables_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavVariables_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87Variables), 4, 0));
                           }
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n252CliCod = false ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
                           A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
                           A184BarMtr = localUtil.ctond( httpContext.cgiGet( edtBarMtr_Internalname)) ;
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCoste_p_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCoste_p_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOSTE_P");
                              GX_FocusControl = edtavCoste_p_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV50Coste_p = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCoste_p_Internalname, GXutil.ltrimstr( AV50Coste_p, 10, 2));
                           }
                           else
                           {
                              AV50Coste_p = localUtil.ctond( httpContext.cgiGet( edtavCoste_p_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCoste_p_Internalname, GXutil.ltrimstr( AV50Coste_p, 10, 2));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCostefab_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCostefab_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOSTEFAB");
                              GX_FocusControl = edtavCostefab_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV51CosteFab = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostefab_Internalname, GXutil.ltrimstr( AV51CosteFab, 10, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTEFAB"+"_"+sGXsfl_41_idx, getSecureSignedToken( sPrefix+sGXsfl_41_idx, localUtil.format( AV51CosteFab, "ZZZZZZ9.99")));
                           }
                           else
                           {
                              AV51CosteFab = localUtil.ctond( httpContext.cgiGet( edtavCostefab_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostefab_Internalname, GXutil.ltrimstr( AV51CosteFab, 10, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTEFAB"+"_"+sGXsfl_41_idx, getSecureSignedToken( sPrefix+sGXsfl_41_idx, localUtil.format( AV51CosteFab, "ZZZZZZ9.99")));
                           }
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)), DecimalUtil.stringToDec("-9999999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)), DecimalUtil.stringToDec("99999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALOR");
                              GX_FocusControl = edtavValor_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV52Valor = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValor_Internalname, GXutil.ltrimstr( AV52Valor, 11, 2));
                           }
                           else
                           {
                              AV52Valor = localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValor_Internalname, GXutil.ltrimstr( AV52Valor, 11, 2));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMargen_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMargen_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMARGEN");
                              GX_FocusControl = edtavMargen_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV53Margen = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMargen_Internalname, GXutil.ltrimstr( AV53Margen, 9, 2));
                           }
                           else
                           {
                              AV53Margen = localUtil.ctond( httpContext.cgiGet( edtavMargen_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMargen_Internalname, GXutil.ltrimstr( AV53Margen, 9, 2));
                           }
                           AV54TxtAlb = httpContext.cgiGet( edtavTxtalb_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTxtalb_Internalname, AV54TxtAlb);
                           A159BarFecGen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecGen_Internalname), 0)) ;
                           A161BarFecSal = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecSal_Internalname), 0)) ;
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
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1819Y2 ();
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
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e1919Y2 ();
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
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e2019Y2 ();
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
                                    strup19Y0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
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
                     if ( nCmpId == 70 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( sPrefix+"W0070") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess(sPrefix+"W0070", "", sEvt);
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

   public void we19Y2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm19Y2( ) ;
         }
      }
   }

   public void pa19Y2( )
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
                                 String AV45Emprcod ,
                                 int AV13CliCod ,
                                 int AV49Clicod_to ,
                                 java.util.Date AV8BarFecGen ,
                                 java.util.Date AV9BarFecGen_to ,
                                 java.util.Date AV10BarFecSal ,
                                 java.util.Date AV11BarFecSal_to ,
                                 String AV12BarSer ,
                                 int AV46InBarcod ,
                                 byte AV47InBarcodreo ,
                                 String AV48InBarcodpar ,
                                 byte AV34ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV29ColumnsSelector ,
                                 String AV24FilterFullText ,
                                 int AV35TFCliCod ,
                                 int AV36TFCliCod_To ,
                                 String AV37TFCliNom ,
                                 String AV38TFCliNom_Sel ,
                                 String AV39TFBarNHdr ,
                                 String AV40TFBarNHdr_Sel ,
                                 String AV55TFBarSer ,
                                 String AV56TFBarSer_Sel ,
                                 String AV57TFBarSerDsc ,
                                 String AV58TFBarSerDsc_Sel ,
                                 String AV59TFBarColNom ,
                                 String AV60TFBarColNom_Sel ,
                                 int AV61TFBarColNum ,
                                 int AV62TFBarColNum_To ,
                                 String AV65TFBarNomCli ,
                                 String AV66TFBarNomCli_Sel ,
                                 java.math.BigDecimal AV67TFBarKgm ,
                                 java.math.BigDecimal AV68TFBarKgm_To ,
                                 java.math.BigDecimal AV69TFBarMtr ,
                                 java.math.BigDecimal AV70TFBarMtr_To ,
                                 java.util.Date AV71TFBarFecGen ,
                                 java.util.Date AV75TFBarFecSal ,
                                 String AV119Pgmname ,
                                 short AV21OrderedBy ,
                                 boolean AV22OrderedDsc ,
                                 java.math.BigDecimal AV51CosteFab ,
                                 java.math.BigDecimal AV88CosteTeo ,
                                 java.math.BigDecimal AV81mAgua ,
                                 java.math.BigDecimal AV82menergia ,
                                 java.math.BigDecimal AV83mgas ,
                                 java.math.BigDecimal AV84mmod ,
                                 java.math.BigDecimal AV85mmoi ,
                                 byte AV86Traza ,
                                 java.math.BigDecimal AV118Costest ,
                                 String A396EmprCod ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1919Y2 ();
      GRID_nCurrentRecord = 0 ;
      rf19Y2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTEFAB", getSecureSignedToken( sPrefix, localUtil.format( AV51CosteFab, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOSTEFAB", GXutil.ltrim( localUtil.ntoc( AV51CosteFab, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODREO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODPAR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODPAR", GXutil.rtrim( A130BarCodPar));
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
      rf19Y2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV119Pgmname = "AnalisisCostesBasicos_WC" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavVariables_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavVariables_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVariables_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCoste_p_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCoste_p_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCoste_p_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostefab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostefab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostefab_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavValor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavValor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValor_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavMargen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMargen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMargen_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavTxtalb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTxtalb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTxtalb_Enabled), 5, 0), !bGXsfl_41_Refreshing);
   }

   public void rf19Y2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e1919Y2 ();
      nGXsfl_41_idx = 1 ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_412( ) ;
      bGXsfl_41_Refreshing = true ;
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
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 0 : GRID_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((subGrid_Rows==0) ? 10000 : subgrid_fnc_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Integer.valueOf(AV96Analisiscostesbasicos_wcds_2_tfclicod) ,
                                              Integer.valueOf(AV97Analisiscostesbasicos_wcds_3_tfclicod_to) ,
                                              AV99Analisiscostesbasicos_wcds_5_tfclinom_sel ,
                                              AV98Analisiscostesbasicos_wcds_4_tfclinom ,
                                              AV101Analisiscostesbasicos_wcds_7_tfbarnhdr_sel ,
                                              AV100Analisiscostesbasicos_wcds_6_tfbarnhdr ,
                                              AV103Analisiscostesbasicos_wcds_9_tfbarser_sel ,
                                              AV102Analisiscostesbasicos_wcds_8_tfbarser ,
                                              AV105Analisiscostesbasicos_wcds_11_tfbarserdsc_sel ,
                                              AV104Analisiscostesbasicos_wcds_10_tfbarserdsc ,
                                              AV107Analisiscostesbasicos_wcds_13_tfbarcolnom_sel ,
                                              AV106Analisiscostesbasicos_wcds_12_tfbarcolnom ,
                                              Integer.valueOf(AV108Analisiscostesbasicos_wcds_14_tfbarcolnum) ,
                                              Integer.valueOf(AV109Analisiscostesbasicos_wcds_15_tfbarcolnum_to) ,
                                              AV111Analisiscostesbasicos_wcds_17_tfbarnomcli_sel ,
                                              AV110Analisiscostesbasicos_wcds_16_tfbarnomcli ,
                                              AV112Analisiscostesbasicos_wcds_18_tfbarkgm ,
                                              AV113Analisiscostesbasicos_wcds_19_tfbarkgm_to ,
                                              AV114Analisiscostesbasicos_wcds_20_tfbarmtr ,
                                              AV115Analisiscostesbasicos_wcds_21_tfbarmtr_to ,
                                              AV116Analisiscostesbasicos_wcds_22_tfbarfecgen ,
                                              AV117Analisiscostesbasicos_wcds_23_tfbarfecsal ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              A212BarSer ,
                                              A1652BarSerDsc ,
                                              A135BarColNom ,
                                              Integer.valueOf(A136BarColNum) ,
                                              A1234BarNomCli ,
                                              A166BarKgm ,
                                              A184BarMtr ,
                                              A159BarFecGen ,
                                              A161BarFecSal ,
                                              Short.valueOf(AV21OrderedBy) ,
                                              Boolean.valueOf(AV22OrderedDsc) ,
                                              AV95Analisiscostesbasicos_wcds_1_filterfulltext ,
                                              A13696BarNHdr ,
                                              Integer.valueOf(AV13CliCod) ,
                                              Integer.valueOf(AV49Clicod_to) ,
                                              AV8BarFecGen ,
                                              AV9BarFecGen_to ,
                                              AV12BarSer ,
                                              AV10BarFecSal ,
                                              AV11BarFecSal_to ,
                                              Integer.valueOf(AV46InBarcod) ,
                                              Byte.valueOf(AV47InBarcodreo) ,
                                              AV48InBarcodpar ,
                                              AV45Emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV95Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
         lV95Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
         lV95Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
         lV95Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
         lV95Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
         lV95Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
         lV95Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
         lV95Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
         lV95Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
         lV95Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
         lV12BarSer = GXutil.padr( GXutil.rtrim( AV12BarSer), 16, "%") ;
         lV98Analisiscostesbasicos_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV98Analisiscostesbasicos_wcds_4_tfclinom), 30, "%") ;
         lV100Analisiscostesbasicos_wcds_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV100Analisiscostesbasicos_wcds_6_tfbarnhdr), 11, "%") ;
         lV102Analisiscostesbasicos_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV102Analisiscostesbasicos_wcds_8_tfbarser), 16, "%") ;
         lV104Analisiscostesbasicos_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV104Analisiscostesbasicos_wcds_10_tfbarserdsc), 26, "%") ;
         lV106Analisiscostesbasicos_wcds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV106Analisiscostesbasicos_wcds_12_tfbarcolnom), 13, "%") ;
         lV110Analisiscostesbasicos_wcds_16_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV110Analisiscostesbasicos_wcds_16_tfbarnomcli), 13, "%") ;
         /* Using cursor H019Y3 */
         pr_default.execute(0, new Object[] {AV45Emprcod, AV95Analisiscostesbasicos_wcds_1_filterfulltext, lV95Analisiscostesbasicos_wcds_1_filterfulltext, lV95Analisiscostesbasicos_wcds_1_filterfulltext, lV95Analisiscostesbasicos_wcds_1_filterfulltext, lV95Analisiscostesbasicos_wcds_1_filterfulltext, lV95Analisiscostesbasicos_wcds_1_filterfulltext, lV95Analisiscostesbasicos_wcds_1_filterfulltext, lV95Analisiscostesbasicos_wcds_1_filterfulltext, lV95Analisiscostesbasicos_wcds_1_filterfulltext, lV95Analisiscostesbasicos_wcds_1_filterfulltext, lV95Analisiscostesbasicos_wcds_1_filterfulltext, Integer.valueOf(AV13CliCod), Integer.valueOf(AV49Clicod_to), AV8BarFecGen, AV9BarFecGen_to, lV12BarSer, AV12BarSer, AV10BarFecSal, AV10BarFecSal, AV11BarFecSal_to, AV11BarFecSal_to, Integer.valueOf(AV46InBarcod), Integer.valueOf(AV46InBarcod), Byte.valueOf(AV47InBarcodreo), Byte.valueOf(AV47InBarcodreo), AV48InBarcodpar, AV48InBarcodpar, Integer.valueOf(AV96Analisiscostesbasicos_wcds_2_tfclicod), Integer.valueOf(AV97Analisiscostesbasicos_wcds_3_tfclicod_to), lV98Analisiscostesbasicos_wcds_4_tfclinom, AV99Analisiscostesbasicos_wcds_5_tfclinom_sel, lV100Analisiscostesbasicos_wcds_6_tfbarnhdr, AV101Analisiscostesbasicos_wcds_7_tfbarnhdr_sel, lV102Analisiscostesbasicos_wcds_8_tfbarser, AV103Analisiscostesbasicos_wcds_9_tfbarser_sel, lV104Analisiscostesbasicos_wcds_10_tfbarserdsc, AV105Analisiscostesbasicos_wcds_11_tfbarserdsc_sel, lV106Analisiscostesbasicos_wcds_12_tfbarcolnom, AV107Analisiscostesbasicos_wcds_13_tfbarcolnom_sel, Integer.valueOf(AV108Analisiscostesbasicos_wcds_14_tfbarcolnum), Integer.valueOf(AV109Analisiscostesbasicos_wcds_15_tfbarcolnum_to), lV110Analisiscostesbasicos_wcds_16_tfbarnomcli, AV111Analisiscostesbasicos_wcds_17_tfbarnomcli_sel, AV112Analisiscostesbasicos_wcds_18_tfbarkgm, AV113Analisiscostesbasicos_wcds_19_tfbarkgm_to, AV114Analisiscostesbasicos_wcds_20_tfbarmtr, AV115Analisiscostesbasicos_wcds_21_tfbarmtr_to, AV116Analisiscostesbasicos_wcds_22_tfbarfecgen, AV117Analisiscostesbasicos_wcds_23_tfbarfecsal, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2)});
         nGXsfl_41_idx = 1 ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H019Y3_A396EmprCod[0] ;
            A228BarUniMed = H019Y3_A228BarUniMed[0] ;
            A140BarCosAny = H019Y3_A140BarCosAny[0] ;
            A141BarCosPro = H019Y3_A141BarCosPro[0] ;
            A161BarFecSal = H019Y3_A161BarFecSal[0] ;
            A159BarFecGen = H019Y3_A159BarFecGen[0] ;
            A1234BarNomCli = H019Y3_A1234BarNomCli[0] ;
            A218BarTipCol = H019Y3_A218BarTipCol[0] ;
            A136BarColNum = H019Y3_A136BarColNum[0] ;
            A135BarColNom = H019Y3_A135BarColNom[0] ;
            A1652BarSerDsc = H019Y3_A1652BarSerDsc[0] ;
            A212BarSer = H019Y3_A212BarSer[0] ;
            A13696BarNHdr = H019Y3_A13696BarNHdr[0] ;
            A279CliNom = H019Y3_A279CliNom[0] ;
            A252CliCod = H019Y3_A252CliCod[0] ;
            n252CliCod = H019Y3_n252CliCod[0] ;
            A184BarMtr = H019Y3_A184BarMtr[0] ;
            A166BarKgm = H019Y3_A166BarKgm[0] ;
            A129BarCod = H019Y3_A129BarCod[0] ;
            A132BarCodReo = H019Y3_A132BarCodReo[0] ;
            A130BarCodPar = H019Y3_A130BarCodPar[0] ;
            A279CliNom = H019Y3_A279CliNom[0] ;
            A184BarMtr = H019Y3_A184BarMtr[0] ;
            A166BarKgm = H019Y3_A166BarKgm[0] ;
            e2019Y2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(41) ;
         wb19Y0( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes19Y2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV119Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV119Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTEFAB"+"_"+sGXsfl_41_idx, getSecureSignedToken( sPrefix+sGXsfl_41_idx, localUtil.format( AV51CosteFab, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOSTETEO", GXutil.ltrim( localUtil.ntoc( AV88CosteTeo, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTETEO", getSecureSignedToken( sPrefix, localUtil.format( AV88CosteTeo, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAGUA", GXutil.ltrim( localUtil.ntoc( AV81mAgua, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMAGUA", getSecureSignedToken( sPrefix, localUtil.format( AV81mAgua, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMENERGIA", GXutil.ltrim( localUtil.ntoc( AV82menergia, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMENERGIA", getSecureSignedToken( sPrefix, localUtil.format( AV82menergia, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMGAS", GXutil.ltrim( localUtil.ntoc( AV83mgas, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMGAS", getSecureSignedToken( sPrefix, localUtil.format( AV83mgas, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMMOD", GXutil.ltrim( localUtil.ntoc( AV84mmod, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMMOD", getSecureSignedToken( sPrefix, localUtil.format( AV84mmod, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMMOI", GXutil.ltrim( localUtil.ntoc( AV85mmoi, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMMOI", getSecureSignedToken( sPrefix, localUtil.format( AV85mmoi, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTRAZA", GXutil.ltrim( localUtil.ntoc( AV86Traza, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTRAZA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV86Traza), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOSTEST", GXutil.ltrim( localUtil.ntoc( AV118Costest, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTEST", getSecureSignedToken( sPrefix, localUtil.format( AV118Costest, "9999999.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCOD"+"_"+sGXsfl_41_idx, getSecureSignedToken( sPrefix+sGXsfl_41_idx, localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODREO"+"_"+sGXsfl_41_idx, getSecureSignedToken( sPrefix+sGXsfl_41_idx, localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODPAR"+"_"+sGXsfl_41_idx, getSecureSignedToken( sPrefix+sGXsfl_41_idx, GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
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
      AV95Analisiscostesbasicos_wcds_1_filterfulltext = AV24FilterFullText ;
      AV96Analisiscostesbasicos_wcds_2_tfclicod = AV35TFCliCod ;
      AV97Analisiscostesbasicos_wcds_3_tfclicod_to = AV36TFCliCod_To ;
      AV98Analisiscostesbasicos_wcds_4_tfclinom = AV37TFCliNom ;
      AV99Analisiscostesbasicos_wcds_5_tfclinom_sel = AV38TFCliNom_Sel ;
      AV100Analisiscostesbasicos_wcds_6_tfbarnhdr = AV39TFBarNHdr ;
      AV101Analisiscostesbasicos_wcds_7_tfbarnhdr_sel = AV40TFBarNHdr_Sel ;
      AV102Analisiscostesbasicos_wcds_8_tfbarser = AV55TFBarSer ;
      AV103Analisiscostesbasicos_wcds_9_tfbarser_sel = AV56TFBarSer_Sel ;
      AV104Analisiscostesbasicos_wcds_10_tfbarserdsc = AV57TFBarSerDsc ;
      AV105Analisiscostesbasicos_wcds_11_tfbarserdsc_sel = AV58TFBarSerDsc_Sel ;
      AV106Analisiscostesbasicos_wcds_12_tfbarcolnom = AV59TFBarColNom ;
      AV107Analisiscostesbasicos_wcds_13_tfbarcolnom_sel = AV60TFBarColNom_Sel ;
      AV108Analisiscostesbasicos_wcds_14_tfbarcolnum = AV61TFBarColNum ;
      AV109Analisiscostesbasicos_wcds_15_tfbarcolnum_to = AV62TFBarColNum_To ;
      AV110Analisiscostesbasicos_wcds_16_tfbarnomcli = AV65TFBarNomCli ;
      AV111Analisiscostesbasicos_wcds_17_tfbarnomcli_sel = AV66TFBarNomCli_Sel ;
      AV112Analisiscostesbasicos_wcds_18_tfbarkgm = AV67TFBarKgm ;
      AV113Analisiscostesbasicos_wcds_19_tfbarkgm_to = AV68TFBarKgm_To ;
      AV114Analisiscostesbasicos_wcds_20_tfbarmtr = AV69TFBarMtr ;
      AV115Analisiscostesbasicos_wcds_21_tfbarmtr_to = AV70TFBarMtr_To ;
      AV116Analisiscostesbasicos_wcds_22_tfbarfecgen = AV71TFBarFecGen ;
      AV117Analisiscostesbasicos_wcds_23_tfbarfecsal = AV75TFBarFecSal ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV96Analisiscostesbasicos_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV97Analisiscostesbasicos_wcds_3_tfclicod_to) ,
                                           AV99Analisiscostesbasicos_wcds_5_tfclinom_sel ,
                                           AV98Analisiscostesbasicos_wcds_4_tfclinom ,
                                           AV101Analisiscostesbasicos_wcds_7_tfbarnhdr_sel ,
                                           AV100Analisiscostesbasicos_wcds_6_tfbarnhdr ,
                                           AV103Analisiscostesbasicos_wcds_9_tfbarser_sel ,
                                           AV102Analisiscostesbasicos_wcds_8_tfbarser ,
                                           AV105Analisiscostesbasicos_wcds_11_tfbarserdsc_sel ,
                                           AV104Analisiscostesbasicos_wcds_10_tfbarserdsc ,
                                           AV107Analisiscostesbasicos_wcds_13_tfbarcolnom_sel ,
                                           AV106Analisiscostesbasicos_wcds_12_tfbarcolnom ,
                                           Integer.valueOf(AV108Analisiscostesbasicos_wcds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV109Analisiscostesbasicos_wcds_15_tfbarcolnum_to) ,
                                           AV111Analisiscostesbasicos_wcds_17_tfbarnomcli_sel ,
                                           AV110Analisiscostesbasicos_wcds_16_tfbarnomcli ,
                                           AV112Analisiscostesbasicos_wcds_18_tfbarkgm ,
                                           AV113Analisiscostesbasicos_wcds_19_tfbarkgm_to ,
                                           AV114Analisiscostesbasicos_wcds_20_tfbarmtr ,
                                           AV115Analisiscostesbasicos_wcds_21_tfbarmtr_to ,
                                           AV116Analisiscostesbasicos_wcds_22_tfbarfecgen ,
                                           AV117Analisiscostesbasicos_wcds_23_tfbarfecsal ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A159BarFecGen ,
                                           A161BarFecSal ,
                                           Short.valueOf(AV21OrderedBy) ,
                                           Boolean.valueOf(AV22OrderedDsc) ,
                                           AV95Analisiscostesbasicos_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(AV13CliCod) ,
                                           Integer.valueOf(AV49Clicod_to) ,
                                           AV8BarFecGen ,
                                           AV9BarFecGen_to ,
                                           AV12BarSer ,
                                           AV10BarFecSal ,
                                           AV11BarFecSal_to ,
                                           Integer.valueOf(AV46InBarcod) ,
                                           Byte.valueOf(AV47InBarcodreo) ,
                                           AV48InBarcodpar ,
                                           AV45Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV95Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV95Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV95Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV95Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV95Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV95Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV95Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV95Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV95Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV95Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV95Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV12BarSer = GXutil.padr( GXutil.rtrim( AV12BarSer), 16, "%") ;
      lV98Analisiscostesbasicos_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV98Analisiscostesbasicos_wcds_4_tfclinom), 30, "%") ;
      lV100Analisiscostesbasicos_wcds_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV100Analisiscostesbasicos_wcds_6_tfbarnhdr), 11, "%") ;
      lV102Analisiscostesbasicos_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV102Analisiscostesbasicos_wcds_8_tfbarser), 16, "%") ;
      lV104Analisiscostesbasicos_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV104Analisiscostesbasicos_wcds_10_tfbarserdsc), 26, "%") ;
      lV106Analisiscostesbasicos_wcds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV106Analisiscostesbasicos_wcds_12_tfbarcolnom), 13, "%") ;
      lV110Analisiscostesbasicos_wcds_16_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV110Analisiscostesbasicos_wcds_16_tfbarnomcli), 13, "%") ;
      /* Using cursor H019Y5 */
      pr_default.execute(1, new Object[] {AV45Emprcod, AV95Analisiscostesbasicos_wcds_1_filterfulltext, lV95Analisiscostesbasicos_wcds_1_filterfulltext, lV95Analisiscostesbasicos_wcds_1_filterfulltext, lV95Analisiscostesbasicos_wcds_1_filterfulltext, lV95Analisiscostesbasicos_wcds_1_filterfulltext, lV95Analisiscostesbasicos_wcds_1_filterfulltext, lV95Analisiscostesbasicos_wcds_1_filterfulltext, lV95Analisiscostesbasicos_wcds_1_filterfulltext, lV95Analisiscostesbasicos_wcds_1_filterfulltext, lV95Analisiscostesbasicos_wcds_1_filterfulltext, lV95Analisiscostesbasicos_wcds_1_filterfulltext, Integer.valueOf(AV13CliCod), Integer.valueOf(AV49Clicod_to), AV8BarFecGen, AV9BarFecGen_to, lV12BarSer, AV12BarSer, AV10BarFecSal, AV10BarFecSal, AV11BarFecSal_to, AV11BarFecSal_to, Integer.valueOf(AV46InBarcod), Integer.valueOf(AV46InBarcod), Byte.valueOf(AV47InBarcodreo), Byte.valueOf(AV47InBarcodreo), AV48InBarcodpar, AV48InBarcodpar, Integer.valueOf(AV96Analisiscostesbasicos_wcds_2_tfclicod), Integer.valueOf(AV97Analisiscostesbasicos_wcds_3_tfclicod_to), lV98Analisiscostesbasicos_wcds_4_tfclinom, AV99Analisiscostesbasicos_wcds_5_tfclinom_sel, lV100Analisiscostesbasicos_wcds_6_tfbarnhdr, AV101Analisiscostesbasicos_wcds_7_tfbarnhdr_sel, lV102Analisiscostesbasicos_wcds_8_tfbarser, AV103Analisiscostesbasicos_wcds_9_tfbarser_sel, lV104Analisiscostesbasicos_wcds_10_tfbarserdsc, AV105Analisiscostesbasicos_wcds_11_tfbarserdsc_sel, lV106Analisiscostesbasicos_wcds_12_tfbarcolnom, AV107Analisiscostesbasicos_wcds_13_tfbarcolnom_sel, Integer.valueOf(AV108Analisiscostesbasicos_wcds_14_tfbarcolnum), Integer.valueOf(AV109Analisiscostesbasicos_wcds_15_tfbarcolnum_to), lV110Analisiscostesbasicos_wcds_16_tfbarnomcli, AV111Analisiscostesbasicos_wcds_17_tfbarnomcli_sel, AV112Analisiscostesbasicos_wcds_18_tfbarkgm, AV113Analisiscostesbasicos_wcds_19_tfbarkgm_to, AV114Analisiscostesbasicos_wcds_20_tfbarmtr, AV115Analisiscostesbasicos_wcds_21_tfbarmtr_to, AV116Analisiscostesbasicos_wcds_22_tfbarfecgen, AV117Analisiscostesbasicos_wcds_23_tfbarfecsal});
      GRID_nRecordCount = H019Y5_AGRID_nRecordCount[0] ;
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
      AV95Analisiscostesbasicos_wcds_1_filterfulltext = AV24FilterFullText ;
      AV96Analisiscostesbasicos_wcds_2_tfclicod = AV35TFCliCod ;
      AV97Analisiscostesbasicos_wcds_3_tfclicod_to = AV36TFCliCod_To ;
      AV98Analisiscostesbasicos_wcds_4_tfclinom = AV37TFCliNom ;
      AV99Analisiscostesbasicos_wcds_5_tfclinom_sel = AV38TFCliNom_Sel ;
      AV100Analisiscostesbasicos_wcds_6_tfbarnhdr = AV39TFBarNHdr ;
      AV101Analisiscostesbasicos_wcds_7_tfbarnhdr_sel = AV40TFBarNHdr_Sel ;
      AV102Analisiscostesbasicos_wcds_8_tfbarser = AV55TFBarSer ;
      AV103Analisiscostesbasicos_wcds_9_tfbarser_sel = AV56TFBarSer_Sel ;
      AV104Analisiscostesbasicos_wcds_10_tfbarserdsc = AV57TFBarSerDsc ;
      AV105Analisiscostesbasicos_wcds_11_tfbarserdsc_sel = AV58TFBarSerDsc_Sel ;
      AV106Analisiscostesbasicos_wcds_12_tfbarcolnom = AV59TFBarColNom ;
      AV107Analisiscostesbasicos_wcds_13_tfbarcolnom_sel = AV60TFBarColNom_Sel ;
      AV108Analisiscostesbasicos_wcds_14_tfbarcolnum = AV61TFBarColNum ;
      AV109Analisiscostesbasicos_wcds_15_tfbarcolnum_to = AV62TFBarColNum_To ;
      AV110Analisiscostesbasicos_wcds_16_tfbarnomcli = AV65TFBarNomCli ;
      AV111Analisiscostesbasicos_wcds_17_tfbarnomcli_sel = AV66TFBarNomCli_Sel ;
      AV112Analisiscostesbasicos_wcds_18_tfbarkgm = AV67TFBarKgm ;
      AV113Analisiscostesbasicos_wcds_19_tfbarkgm_to = AV68TFBarKgm_To ;
      AV114Analisiscostesbasicos_wcds_20_tfbarmtr = AV69TFBarMtr ;
      AV115Analisiscostesbasicos_wcds_21_tfbarmtr_to = AV70TFBarMtr_To ;
      AV116Analisiscostesbasicos_wcds_22_tfbarfecgen = AV71TFBarFecGen ;
      AV117Analisiscostesbasicos_wcds_23_tfbarfecsal = AV75TFBarFecSal ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV45Emprcod, AV13CliCod, AV49Clicod_to, AV8BarFecGen, AV9BarFecGen_to, AV10BarFecSal, AV11BarFecSal_to, AV12BarSer, AV46InBarcod, AV47InBarcodreo, AV48InBarcodpar, AV34ManageFiltersExecutionStep, AV29ColumnsSelector, AV24FilterFullText, AV35TFCliCod, AV36TFCliCod_To, AV37TFCliNom, AV38TFCliNom_Sel, AV39TFBarNHdr, AV40TFBarNHdr_Sel, AV55TFBarSer, AV56TFBarSer_Sel, AV57TFBarSerDsc, AV58TFBarSerDsc_Sel, AV59TFBarColNom, AV60TFBarColNom_Sel, AV61TFBarColNum, AV62TFBarColNum_To, AV65TFBarNomCli, AV66TFBarNomCli_Sel, AV67TFBarKgm, AV68TFBarKgm_To, AV69TFBarMtr, AV70TFBarMtr_To, AV71TFBarFecGen, AV75TFBarFecSal, AV119Pgmname, AV21OrderedBy, AV22OrderedDsc, AV51CosteFab, AV88CosteTeo, AV81mAgua, AV82menergia, AV83mgas, AV84mmod, AV85mmoi, AV86Traza, AV118Costest, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV95Analisiscostesbasicos_wcds_1_filterfulltext = AV24FilterFullText ;
      AV96Analisiscostesbasicos_wcds_2_tfclicod = AV35TFCliCod ;
      AV97Analisiscostesbasicos_wcds_3_tfclicod_to = AV36TFCliCod_To ;
      AV98Analisiscostesbasicos_wcds_4_tfclinom = AV37TFCliNom ;
      AV99Analisiscostesbasicos_wcds_5_tfclinom_sel = AV38TFCliNom_Sel ;
      AV100Analisiscostesbasicos_wcds_6_tfbarnhdr = AV39TFBarNHdr ;
      AV101Analisiscostesbasicos_wcds_7_tfbarnhdr_sel = AV40TFBarNHdr_Sel ;
      AV102Analisiscostesbasicos_wcds_8_tfbarser = AV55TFBarSer ;
      AV103Analisiscostesbasicos_wcds_9_tfbarser_sel = AV56TFBarSer_Sel ;
      AV104Analisiscostesbasicos_wcds_10_tfbarserdsc = AV57TFBarSerDsc ;
      AV105Analisiscostesbasicos_wcds_11_tfbarserdsc_sel = AV58TFBarSerDsc_Sel ;
      AV106Analisiscostesbasicos_wcds_12_tfbarcolnom = AV59TFBarColNom ;
      AV107Analisiscostesbasicos_wcds_13_tfbarcolnom_sel = AV60TFBarColNom_Sel ;
      AV108Analisiscostesbasicos_wcds_14_tfbarcolnum = AV61TFBarColNum ;
      AV109Analisiscostesbasicos_wcds_15_tfbarcolnum_to = AV62TFBarColNum_To ;
      AV110Analisiscostesbasicos_wcds_16_tfbarnomcli = AV65TFBarNomCli ;
      AV111Analisiscostesbasicos_wcds_17_tfbarnomcli_sel = AV66TFBarNomCli_Sel ;
      AV112Analisiscostesbasicos_wcds_18_tfbarkgm = AV67TFBarKgm ;
      AV113Analisiscostesbasicos_wcds_19_tfbarkgm_to = AV68TFBarKgm_To ;
      AV114Analisiscostesbasicos_wcds_20_tfbarmtr = AV69TFBarMtr ;
      AV115Analisiscostesbasicos_wcds_21_tfbarmtr_to = AV70TFBarMtr_To ;
      AV116Analisiscostesbasicos_wcds_22_tfbarfecgen = AV71TFBarFecGen ;
      AV117Analisiscostesbasicos_wcds_23_tfbarfecsal = AV75TFBarFecSal ;
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
         gxgrgrid_refresh( subGrid_Rows, AV45Emprcod, AV13CliCod, AV49Clicod_to, AV8BarFecGen, AV9BarFecGen_to, AV10BarFecSal, AV11BarFecSal_to, AV12BarSer, AV46InBarcod, AV47InBarcodreo, AV48InBarcodpar, AV34ManageFiltersExecutionStep, AV29ColumnsSelector, AV24FilterFullText, AV35TFCliCod, AV36TFCliCod_To, AV37TFCliNom, AV38TFCliNom_Sel, AV39TFBarNHdr, AV40TFBarNHdr_Sel, AV55TFBarSer, AV56TFBarSer_Sel, AV57TFBarSerDsc, AV58TFBarSerDsc_Sel, AV59TFBarColNom, AV60TFBarColNom_Sel, AV61TFBarColNum, AV62TFBarColNum_To, AV65TFBarNomCli, AV66TFBarNomCli_Sel, AV67TFBarKgm, AV68TFBarKgm_To, AV69TFBarMtr, AV70TFBarMtr_To, AV71TFBarFecGen, AV75TFBarFecSal, AV119Pgmname, AV21OrderedBy, AV22OrderedDsc, AV51CosteFab, AV88CosteTeo, AV81mAgua, AV82menergia, AV83mgas, AV84mmod, AV85mmoi, AV86Traza, AV118Costest, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV95Analisiscostesbasicos_wcds_1_filterfulltext = AV24FilterFullText ;
      AV96Analisiscostesbasicos_wcds_2_tfclicod = AV35TFCliCod ;
      AV97Analisiscostesbasicos_wcds_3_tfclicod_to = AV36TFCliCod_To ;
      AV98Analisiscostesbasicos_wcds_4_tfclinom = AV37TFCliNom ;
      AV99Analisiscostesbasicos_wcds_5_tfclinom_sel = AV38TFCliNom_Sel ;
      AV100Analisiscostesbasicos_wcds_6_tfbarnhdr = AV39TFBarNHdr ;
      AV101Analisiscostesbasicos_wcds_7_tfbarnhdr_sel = AV40TFBarNHdr_Sel ;
      AV102Analisiscostesbasicos_wcds_8_tfbarser = AV55TFBarSer ;
      AV103Analisiscostesbasicos_wcds_9_tfbarser_sel = AV56TFBarSer_Sel ;
      AV104Analisiscostesbasicos_wcds_10_tfbarserdsc = AV57TFBarSerDsc ;
      AV105Analisiscostesbasicos_wcds_11_tfbarserdsc_sel = AV58TFBarSerDsc_Sel ;
      AV106Analisiscostesbasicos_wcds_12_tfbarcolnom = AV59TFBarColNom ;
      AV107Analisiscostesbasicos_wcds_13_tfbarcolnom_sel = AV60TFBarColNom_Sel ;
      AV108Analisiscostesbasicos_wcds_14_tfbarcolnum = AV61TFBarColNum ;
      AV109Analisiscostesbasicos_wcds_15_tfbarcolnum_to = AV62TFBarColNum_To ;
      AV110Analisiscostesbasicos_wcds_16_tfbarnomcli = AV65TFBarNomCli ;
      AV111Analisiscostesbasicos_wcds_17_tfbarnomcli_sel = AV66TFBarNomCli_Sel ;
      AV112Analisiscostesbasicos_wcds_18_tfbarkgm = AV67TFBarKgm ;
      AV113Analisiscostesbasicos_wcds_19_tfbarkgm_to = AV68TFBarKgm_To ;
      AV114Analisiscostesbasicos_wcds_20_tfbarmtr = AV69TFBarMtr ;
      AV115Analisiscostesbasicos_wcds_21_tfbarmtr_to = AV70TFBarMtr_To ;
      AV116Analisiscostesbasicos_wcds_22_tfbarfecgen = AV71TFBarFecGen ;
      AV117Analisiscostesbasicos_wcds_23_tfbarfecsal = AV75TFBarFecSal ;
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
         gxgrgrid_refresh( subGrid_Rows, AV45Emprcod, AV13CliCod, AV49Clicod_to, AV8BarFecGen, AV9BarFecGen_to, AV10BarFecSal, AV11BarFecSal_to, AV12BarSer, AV46InBarcod, AV47InBarcodreo, AV48InBarcodpar, AV34ManageFiltersExecutionStep, AV29ColumnsSelector, AV24FilterFullText, AV35TFCliCod, AV36TFCliCod_To, AV37TFCliNom, AV38TFCliNom_Sel, AV39TFBarNHdr, AV40TFBarNHdr_Sel, AV55TFBarSer, AV56TFBarSer_Sel, AV57TFBarSerDsc, AV58TFBarSerDsc_Sel, AV59TFBarColNom, AV60TFBarColNom_Sel, AV61TFBarColNum, AV62TFBarColNum_To, AV65TFBarNomCli, AV66TFBarNomCli_Sel, AV67TFBarKgm, AV68TFBarKgm_To, AV69TFBarMtr, AV70TFBarMtr_To, AV71TFBarFecGen, AV75TFBarFecSal, AV119Pgmname, AV21OrderedBy, AV22OrderedDsc, AV51CosteFab, AV88CosteTeo, AV81mAgua, AV82menergia, AV83mgas, AV84mmod, AV85mmoi, AV86Traza, AV118Costest, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV95Analisiscostesbasicos_wcds_1_filterfulltext = AV24FilterFullText ;
      AV96Analisiscostesbasicos_wcds_2_tfclicod = AV35TFCliCod ;
      AV97Analisiscostesbasicos_wcds_3_tfclicod_to = AV36TFCliCod_To ;
      AV98Analisiscostesbasicos_wcds_4_tfclinom = AV37TFCliNom ;
      AV99Analisiscostesbasicos_wcds_5_tfclinom_sel = AV38TFCliNom_Sel ;
      AV100Analisiscostesbasicos_wcds_6_tfbarnhdr = AV39TFBarNHdr ;
      AV101Analisiscostesbasicos_wcds_7_tfbarnhdr_sel = AV40TFBarNHdr_Sel ;
      AV102Analisiscostesbasicos_wcds_8_tfbarser = AV55TFBarSer ;
      AV103Analisiscostesbasicos_wcds_9_tfbarser_sel = AV56TFBarSer_Sel ;
      AV104Analisiscostesbasicos_wcds_10_tfbarserdsc = AV57TFBarSerDsc ;
      AV105Analisiscostesbasicos_wcds_11_tfbarserdsc_sel = AV58TFBarSerDsc_Sel ;
      AV106Analisiscostesbasicos_wcds_12_tfbarcolnom = AV59TFBarColNom ;
      AV107Analisiscostesbasicos_wcds_13_tfbarcolnom_sel = AV60TFBarColNom_Sel ;
      AV108Analisiscostesbasicos_wcds_14_tfbarcolnum = AV61TFBarColNum ;
      AV109Analisiscostesbasicos_wcds_15_tfbarcolnum_to = AV62TFBarColNum_To ;
      AV110Analisiscostesbasicos_wcds_16_tfbarnomcli = AV65TFBarNomCli ;
      AV111Analisiscostesbasicos_wcds_17_tfbarnomcli_sel = AV66TFBarNomCli_Sel ;
      AV112Analisiscostesbasicos_wcds_18_tfbarkgm = AV67TFBarKgm ;
      AV113Analisiscostesbasicos_wcds_19_tfbarkgm_to = AV68TFBarKgm_To ;
      AV114Analisiscostesbasicos_wcds_20_tfbarmtr = AV69TFBarMtr ;
      AV115Analisiscostesbasicos_wcds_21_tfbarmtr_to = AV70TFBarMtr_To ;
      AV116Analisiscostesbasicos_wcds_22_tfbarfecgen = AV71TFBarFecGen ;
      AV117Analisiscostesbasicos_wcds_23_tfbarfecsal = AV75TFBarFecSal ;
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
         gxgrgrid_refresh( subGrid_Rows, AV45Emprcod, AV13CliCod, AV49Clicod_to, AV8BarFecGen, AV9BarFecGen_to, AV10BarFecSal, AV11BarFecSal_to, AV12BarSer, AV46InBarcod, AV47InBarcodreo, AV48InBarcodpar, AV34ManageFiltersExecutionStep, AV29ColumnsSelector, AV24FilterFullText, AV35TFCliCod, AV36TFCliCod_To, AV37TFCliNom, AV38TFCliNom_Sel, AV39TFBarNHdr, AV40TFBarNHdr_Sel, AV55TFBarSer, AV56TFBarSer_Sel, AV57TFBarSerDsc, AV58TFBarSerDsc_Sel, AV59TFBarColNom, AV60TFBarColNom_Sel, AV61TFBarColNum, AV62TFBarColNum_To, AV65TFBarNomCli, AV66TFBarNomCli_Sel, AV67TFBarKgm, AV68TFBarKgm_To, AV69TFBarMtr, AV70TFBarMtr_To, AV71TFBarFecGen, AV75TFBarFecSal, AV119Pgmname, AV21OrderedBy, AV22OrderedDsc, AV51CosteFab, AV88CosteTeo, AV81mAgua, AV82menergia, AV83mgas, AV84mmod, AV85mmoi, AV86Traza, AV118Costest, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV95Analisiscostesbasicos_wcds_1_filterfulltext = AV24FilterFullText ;
      AV96Analisiscostesbasicos_wcds_2_tfclicod = AV35TFCliCod ;
      AV97Analisiscostesbasicos_wcds_3_tfclicod_to = AV36TFCliCod_To ;
      AV98Analisiscostesbasicos_wcds_4_tfclinom = AV37TFCliNom ;
      AV99Analisiscostesbasicos_wcds_5_tfclinom_sel = AV38TFCliNom_Sel ;
      AV100Analisiscostesbasicos_wcds_6_tfbarnhdr = AV39TFBarNHdr ;
      AV101Analisiscostesbasicos_wcds_7_tfbarnhdr_sel = AV40TFBarNHdr_Sel ;
      AV102Analisiscostesbasicos_wcds_8_tfbarser = AV55TFBarSer ;
      AV103Analisiscostesbasicos_wcds_9_tfbarser_sel = AV56TFBarSer_Sel ;
      AV104Analisiscostesbasicos_wcds_10_tfbarserdsc = AV57TFBarSerDsc ;
      AV105Analisiscostesbasicos_wcds_11_tfbarserdsc_sel = AV58TFBarSerDsc_Sel ;
      AV106Analisiscostesbasicos_wcds_12_tfbarcolnom = AV59TFBarColNom ;
      AV107Analisiscostesbasicos_wcds_13_tfbarcolnom_sel = AV60TFBarColNom_Sel ;
      AV108Analisiscostesbasicos_wcds_14_tfbarcolnum = AV61TFBarColNum ;
      AV109Analisiscostesbasicos_wcds_15_tfbarcolnum_to = AV62TFBarColNum_To ;
      AV110Analisiscostesbasicos_wcds_16_tfbarnomcli = AV65TFBarNomCli ;
      AV111Analisiscostesbasicos_wcds_17_tfbarnomcli_sel = AV66TFBarNomCli_Sel ;
      AV112Analisiscostesbasicos_wcds_18_tfbarkgm = AV67TFBarKgm ;
      AV113Analisiscostesbasicos_wcds_19_tfbarkgm_to = AV68TFBarKgm_To ;
      AV114Analisiscostesbasicos_wcds_20_tfbarmtr = AV69TFBarMtr ;
      AV115Analisiscostesbasicos_wcds_21_tfbarmtr_to = AV70TFBarMtr_To ;
      AV116Analisiscostesbasicos_wcds_22_tfbarfecgen = AV71TFBarFecGen ;
      AV117Analisiscostesbasicos_wcds_23_tfbarfecsal = AV75TFBarFecSal ;
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
         gxgrgrid_refresh( subGrid_Rows, AV45Emprcod, AV13CliCod, AV49Clicod_to, AV8BarFecGen, AV9BarFecGen_to, AV10BarFecSal, AV11BarFecSal_to, AV12BarSer, AV46InBarcod, AV47InBarcodreo, AV48InBarcodpar, AV34ManageFiltersExecutionStep, AV29ColumnsSelector, AV24FilterFullText, AV35TFCliCod, AV36TFCliCod_To, AV37TFCliNom, AV38TFCliNom_Sel, AV39TFBarNHdr, AV40TFBarNHdr_Sel, AV55TFBarSer, AV56TFBarSer_Sel, AV57TFBarSerDsc, AV58TFBarSerDsc_Sel, AV59TFBarColNom, AV60TFBarColNom_Sel, AV61TFBarColNum, AV62TFBarColNum_To, AV65TFBarNomCli, AV66TFBarNomCli_Sel, AV67TFBarKgm, AV68TFBarKgm_To, AV69TFBarMtr, AV70TFBarMtr_To, AV71TFBarFecGen, AV75TFBarFecSal, AV119Pgmname, AV21OrderedBy, AV22OrderedDsc, AV51CosteFab, AV88CosteTeo, AV81mAgua, AV82menergia, AV83mgas, AV84mmod, AV85mmoi, AV86Traza, AV118Costest, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV119Pgmname = "AnalisisCostesBasicos_WC" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavVariables_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavVariables_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVariables_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCoste_p_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCoste_p_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCoste_p_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostefab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostefab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostefab_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavValor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavValor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValor_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavMargen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMargen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMargen_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavTxtalb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTxtalb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTxtalb_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup19Y0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1819Y2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV32ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV41DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV29ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV43GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV44GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV45Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV45Emprcod") ;
         wcpOAV13CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV13CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV49Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV49Clicod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV8BarFecGen = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV8BarFecGen"), 0) ;
         wcpOAV9BarFecGen_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV9BarFecGen_to"), 0) ;
         wcpOAV10BarFecSal = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV10BarFecSal"), 0) ;
         wcpOAV11BarFecSal_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV11BarFecSal_to"), 0) ;
         wcpOAV12BarSer = httpContext.cgiGet( sPrefix+"wcpOAV12BarSer") ;
         wcpOAV46InBarcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV46InBarcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV47InBarcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV47InBarcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV48InBarcodpar = httpContext.cgiGet( sPrefix+"wcpOAV48InBarcodpar") ;
         A396EmprCod = httpContext.cgiGet( sPrefix+"EMPRCOD") ;
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
         AV24FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24FilterFullText", AV24FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfecgenauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECGENAUXDATE");
            GX_FocusControl = edtavDdo_barfecgenauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV73DDO_BarFecGenAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73DDO_BarFecGenAuxDate", localUtil.format(AV73DDO_BarFecGenAuxDate, "99/99/99"));
         }
         else
         {
            AV73DDO_BarFecGenAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfecgenauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73DDO_BarFecGenAuxDate", localUtil.format(AV73DDO_BarFecGenAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfecsalauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECSALAUXDATE");
            GX_FocusControl = edtavDdo_barfecsalauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV77DDO_BarFecSalAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77DDO_BarFecSalAuxDate", localUtil.format(AV77DDO_BarFecSalAuxDate, "99/99/99"));
         }
         else
         {
            AV77DDO_BarFecSalAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfecsalauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77DDO_BarFecSalAuxDate", localUtil.format(AV77DDO_BarFecSalAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_41_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
         if ( nGXsfl_41_idx > 0 )
         {
            AV89DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV89DetailWebComponent);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavVariables_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavVariables_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVARIABLES");
               GX_FocusControl = edtavVariables_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV87Variables = (short)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavVariables_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87Variables), 4, 0));
            }
            else
            {
               AV87Variables = (short)(localUtil.ctol( httpContext.cgiGet( edtavVariables_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavVariables_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87Variables), 4, 0));
            }
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
            A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
            A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
            A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
            A184BarMtr = localUtil.ctond( httpContext.cgiGet( edtBarMtr_Internalname)) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCoste_p_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCoste_p_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOSTE_P");
               GX_FocusControl = edtavCoste_p_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV50Coste_p = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCoste_p_Internalname, GXutil.ltrimstr( AV50Coste_p, 10, 2));
            }
            else
            {
               AV50Coste_p = localUtil.ctond( httpContext.cgiGet( edtavCoste_p_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCoste_p_Internalname, GXutil.ltrimstr( AV50Coste_p, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCostefab_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCostefab_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOSTEFAB");
               GX_FocusControl = edtavCostefab_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV51CosteFab = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostefab_Internalname, GXutil.ltrimstr( AV51CosteFab, 10, 2));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTEFAB"+"_"+sGXsfl_41_idx, getSecureSignedToken( sPrefix+sGXsfl_41_idx, localUtil.format( AV51CosteFab, "ZZZZZZ9.99")));
            }
            else
            {
               AV51CosteFab = localUtil.ctond( httpContext.cgiGet( edtavCostefab_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostefab_Internalname, GXutil.ltrimstr( AV51CosteFab, 10, 2));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTEFAB"+"_"+sGXsfl_41_idx, getSecureSignedToken( sPrefix+sGXsfl_41_idx, localUtil.format( AV51CosteFab, "ZZZZZZ9.99")));
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)), DecimalUtil.stringToDec("-9999999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)), DecimalUtil.stringToDec("99999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALOR");
               GX_FocusControl = edtavValor_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV52Valor = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValor_Internalname, GXutil.ltrimstr( AV52Valor, 11, 2));
            }
            else
            {
               AV52Valor = localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValor_Internalname, GXutil.ltrimstr( AV52Valor, 11, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMargen_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMargen_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMARGEN");
               GX_FocusControl = edtavMargen_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV53Margen = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMargen_Internalname, GXutil.ltrimstr( AV53Margen, 9, 2));
            }
            else
            {
               AV53Margen = localUtil.ctond( httpContext.cgiGet( edtavMargen_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMargen_Internalname, GXutil.ltrimstr( AV53Margen, 9, 2));
            }
            AV54TxtAlb = httpContext.cgiGet( edtavTxtalb_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTxtalb_Internalname, AV54TxtAlb);
            A159BarFecGen = localUtil.ctod( httpContext.cgiGet( edtBarFecGen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A161BarFecSal = localUtil.ctod( httpContext.cgiGet( edtBarFecSal_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         }
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
      e1819Y2 ();
      if (returnInSub) return;
   }

   public void e1819Y2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV92Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      analisiscostesbasicos_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV92Station = GXt_char1 ;
      GXv_char2[0] = AV45Emprcod ;
      GXv_char3[0] = AV93Emprnom ;
      GXv_char4[0] = AV94Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV92Station, GXv_char2, GXv_char3, GXv_char4) ;
      analisiscostesbasicos_wc_impl.this.AV45Emprcod = GXv_char2[0] ;
      analisiscostesbasicos_wc_impl.this.AV93Emprnom = GXv_char3[0] ;
      analisiscostesbasicos_wc_impl.this.AV94Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Emprcod", AV45Emprcod);
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
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV21OrderedBy < 1 )
      {
         AV21OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV41DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV41DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e1919Y2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV15WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV15WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV34ManageFiltersExecutionStep == 1 )
      {
         AV34ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34ManageFiltersExecutionStep", GXutil.str( AV34ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV34ManageFiltersExecutionStep == 2 )
      {
         AV34ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34ManageFiltersExecutionStep", GXutil.str( AV34ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV31Session.getValue("AnalisisCostesBasicos_WCColumnsSelector"), "") != 0 )
      {
         AV27ColumnsSelectorXML = AV31Session.getValue("AnalisisCostesBasicos_WCColumnsSelector") ;
         AV29ColumnsSelector.fromxml(AV27ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarNomCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNomCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarKgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgm_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarMtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMtr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCoste_p_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCoste_p_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCoste_p_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostefab_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostefab_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostefab_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavValor_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavValor_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValor_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavMargen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMargen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMargen_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavTxtalb_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTxtalb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTxtalb_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarFecGen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFecGen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecGen_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarFecSal_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFecSal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecSal_Visible), 5, 0), !bGXsfl_41_Refreshing);
      AV43GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43GridCurrentPage), 10, 0));
      AV44GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44GridPageCount), 10, 0));
      AV95Analisiscostesbasicos_wcds_1_filterfulltext = AV24FilterFullText ;
      AV96Analisiscostesbasicos_wcds_2_tfclicod = AV35TFCliCod ;
      AV97Analisiscostesbasicos_wcds_3_tfclicod_to = AV36TFCliCod_To ;
      AV98Analisiscostesbasicos_wcds_4_tfclinom = AV37TFCliNom ;
      AV99Analisiscostesbasicos_wcds_5_tfclinom_sel = AV38TFCliNom_Sel ;
      AV100Analisiscostesbasicos_wcds_6_tfbarnhdr = AV39TFBarNHdr ;
      AV101Analisiscostesbasicos_wcds_7_tfbarnhdr_sel = AV40TFBarNHdr_Sel ;
      AV102Analisiscostesbasicos_wcds_8_tfbarser = AV55TFBarSer ;
      AV103Analisiscostesbasicos_wcds_9_tfbarser_sel = AV56TFBarSer_Sel ;
      AV104Analisiscostesbasicos_wcds_10_tfbarserdsc = AV57TFBarSerDsc ;
      AV105Analisiscostesbasicos_wcds_11_tfbarserdsc_sel = AV58TFBarSerDsc_Sel ;
      AV106Analisiscostesbasicos_wcds_12_tfbarcolnom = AV59TFBarColNom ;
      AV107Analisiscostesbasicos_wcds_13_tfbarcolnom_sel = AV60TFBarColNom_Sel ;
      AV108Analisiscostesbasicos_wcds_14_tfbarcolnum = AV61TFBarColNum ;
      AV109Analisiscostesbasicos_wcds_15_tfbarcolnum_to = AV62TFBarColNum_To ;
      AV110Analisiscostesbasicos_wcds_16_tfbarnomcli = AV65TFBarNomCli ;
      AV111Analisiscostesbasicos_wcds_17_tfbarnomcli_sel = AV66TFBarNomCli_Sel ;
      AV112Analisiscostesbasicos_wcds_18_tfbarkgm = AV67TFBarKgm ;
      AV113Analisiscostesbasicos_wcds_19_tfbarkgm_to = AV68TFBarKgm_To ;
      AV114Analisiscostesbasicos_wcds_20_tfbarmtr = AV69TFBarMtr ;
      AV115Analisiscostesbasicos_wcds_21_tfbarmtr_to = AV70TFBarMtr_To ;
      AV116Analisiscostesbasicos_wcds_22_tfbarfecgen = AV71TFBarFecGen ;
      AV117Analisiscostesbasicos_wcds_23_tfbarfecsal = AV75TFBarFecSal ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV29ColumnsSelector", AV29ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV32ManageFiltersData", AV32ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19GridState", AV19GridState);
   }

   public void e1219Y2( )
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
         AV42PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV42PageToGo) ;
      }
   }

   public void e1319Y2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1419Y2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV21OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21OrderedBy), 4, 0));
         AV22OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22OrderedDsc", AV22OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV35TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFCliCod), 6, 0));
            AV36TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV37TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFCliNom", AV37TFCliNom);
            AV38TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFCliNom_Sel", AV38TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV39TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFBarNHdr", AV39TFBarNHdr);
            AV40TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarNHdr_Sel", AV40TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV55TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFBarSer", AV55TFBarSer);
            AV56TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarSer_Sel", AV56TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSerDsc") == 0 )
         {
            AV57TFBarSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFBarSerDsc", AV57TFBarSerDsc);
            AV58TFBarSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFBarSerDsc_Sel", AV58TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNom") == 0 )
         {
            AV59TFBarColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFBarColNom", AV59TFBarColNom);
            AV60TFBarColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFBarColNom_Sel", AV60TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNum") == 0 )
         {
            AV61TFBarColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFBarColNum), 6, 0));
            AV62TFBarColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNomCli") == 0 )
         {
            AV65TFBarNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFBarNomCli", AV65TFBarNomCli);
            AV66TFBarNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFBarNomCli_Sel", AV66TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarKgm") == 0 )
         {
            AV67TFBarKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFBarKgm", GXutil.ltrimstr( AV67TFBarKgm, 9, 2));
            AV68TFBarKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFBarKgm_To", GXutil.ltrimstr( AV68TFBarKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarMtr") == 0 )
         {
            AV69TFBarMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFBarMtr", GXutil.ltrimstr( AV69TFBarMtr, 9, 2));
            AV70TFBarMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFBarMtr_To", GXutil.ltrimstr( AV70TFBarMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecGen") == 0 )
         {
            AV71TFBarFecGen = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFBarFecGen", localUtil.format(AV71TFBarFecGen, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecSal") == 0 )
         {
            AV75TFBarFecSal = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFBarFecSal", localUtil.format(AV75TFBarFecSal, "99/99/99"));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e2019Y2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV89DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV89DetailWebComponent);
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A129BarCod ;
      GXv_int9[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      GXv_char2[0] = A228BarUniMed ;
      GXv_decimal10[0] = A166BarKgm ;
      GXv_decimal11[0] = A184BarMtr ;
      GXv_decimal12[0] = AV51CosteFab ;
      GXv_decimal13[0] = AV88CosteTeo ;
      GXv_decimal14[0] = AV81mAgua ;
      GXv_decimal15[0] = AV82menergia ;
      GXv_decimal16[0] = AV83mgas ;
      GXv_decimal17[0] = AV84mmod ;
      GXv_decimal18[0] = AV85mmoi ;
      GXv_int19[0] = AV86Traza ;
      new app.puti006(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int9, GXv_char3, GXv_char2, GXv_decimal10, GXv_decimal11, GXv_decimal12, GXv_decimal13, GXv_decimal14, GXv_decimal15, GXv_decimal16, GXv_decimal17, GXv_decimal18, GXv_int19) ;
      analisiscostesbasicos_wc_impl.this.A396EmprCod = GXv_char4[0] ;
      analisiscostesbasicos_wc_impl.this.A129BarCod = GXv_int8[0] ;
      analisiscostesbasicos_wc_impl.this.A132BarCodReo = GXv_int9[0] ;
      analisiscostesbasicos_wc_impl.this.A130BarCodPar = GXv_char3[0] ;
      analisiscostesbasicos_wc_impl.this.A228BarUniMed = GXv_char2[0] ;
      analisiscostesbasicos_wc_impl.this.A166BarKgm = GXv_decimal10[0] ;
      analisiscostesbasicos_wc_impl.this.A184BarMtr = GXv_decimal11[0] ;
      analisiscostesbasicos_wc_impl.this.AV51CosteFab = GXv_decimal12[0] ;
      analisiscostesbasicos_wc_impl.this.AV88CosteTeo = GXv_decimal13[0] ;
      analisiscostesbasicos_wc_impl.this.AV81mAgua = GXv_decimal14[0] ;
      analisiscostesbasicos_wc_impl.this.AV82menergia = GXv_decimal15[0] ;
      analisiscostesbasicos_wc_impl.this.AV83mgas = GXv_decimal16[0] ;
      analisiscostesbasicos_wc_impl.this.AV84mmod = GXv_decimal17[0] ;
      analisiscostesbasicos_wc_impl.this.AV85mmoi = GXv_decimal18[0] ;
      analisiscostesbasicos_wc_impl.this.AV86Traza = GXv_int19[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A228BarUniMed", A228BarUniMed);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostefab_Internalname, GXutil.ltrimstr( AV51CosteFab, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTEFAB"+"_"+sGXsfl_41_idx, getSecureSignedToken( sPrefix+sGXsfl_41_idx, localUtil.format( AV51CosteFab, "ZZZZZZ9.99")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88CosteTeo", GXutil.ltrimstr( AV88CosteTeo, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTETEO", getSecureSignedToken( sPrefix, localUtil.format( AV88CosteTeo, "ZZZZZZ9.99")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81mAgua", GXutil.ltrimstr( AV81mAgua, 12, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMAGUA", getSecureSignedToken( sPrefix, localUtil.format( AV81mAgua, "ZZZZZZZZ9.99")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82menergia", GXutil.ltrimstr( AV82menergia, 12, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMENERGIA", getSecureSignedToken( sPrefix, localUtil.format( AV82menergia, "ZZZZZZZZ9.99")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83mgas", GXutil.ltrimstr( AV83mgas, 12, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMGAS", getSecureSignedToken( sPrefix, localUtil.format( AV83mgas, "ZZZZZZZZ9.99")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84mmod", GXutil.ltrimstr( AV84mmod, 12, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMMOD", getSecureSignedToken( sPrefix, localUtil.format( AV84mmod, "ZZZZZZZZ9.99")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85mmoi", GXutil.ltrimstr( AV85mmoi, 12, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMMOI", getSecureSignedToken( sPrefix, localUtil.format( AV85mmoi, "ZZZZZZZZ9.99")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86Traza", GXutil.str( AV86Traza, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTRAZA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV86Traza), "9")));
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A129BarCod ;
      GXv_int19[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      GXv_char2[0] = AV54TxtAlb ;
      GXv_decimal18[0] = AV52Valor ;
      new app.recuperodatosalbbar(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int19, GXv_char3, GXv_char2, GXv_decimal18) ;
      analisiscostesbasicos_wc_impl.this.A396EmprCod = GXv_char4[0] ;
      analisiscostesbasicos_wc_impl.this.A129BarCod = GXv_int8[0] ;
      analisiscostesbasicos_wc_impl.this.A132BarCodReo = GXv_int19[0] ;
      analisiscostesbasicos_wc_impl.this.A130BarCodPar = GXv_char3[0] ;
      analisiscostesbasicos_wc_impl.this.AV54TxtAlb = GXv_char2[0] ;
      analisiscostesbasicos_wc_impl.this.AV52Valor = GXv_decimal18[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTxtalb_Internalname, AV54TxtAlb);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValor_Internalname, GXutil.ltrimstr( AV52Valor, 11, 2));
      AV50Coste_p = (A141BarCosPro.add(A140BarCosAny)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCoste_p_Internalname, GXutil.ltrimstr( AV50Coste_p, 10, 2));
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A129BarCod ;
      GXv_int19[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      GXv_char2[0] = AV54TxtAlb ;
      GXv_decimal18[0] = AV52Valor ;
      new app.recuperodatosalbbar(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int19, GXv_char3, GXv_char2, GXv_decimal18) ;
      analisiscostesbasicos_wc_impl.this.A396EmprCod = GXv_char4[0] ;
      analisiscostesbasicos_wc_impl.this.A129BarCod = GXv_int8[0] ;
      analisiscostesbasicos_wc_impl.this.A132BarCodReo = GXv_int19[0] ;
      analisiscostesbasicos_wc_impl.this.A130BarCodPar = GXv_char3[0] ;
      analisiscostesbasicos_wc_impl.this.AV54TxtAlb = GXv_char2[0] ;
      analisiscostesbasicos_wc_impl.this.AV52Valor = GXv_decimal18[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTxtalb_Internalname, AV54TxtAlb);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValor_Internalname, GXutil.ltrimstr( AV52Valor, 11, 2));
      AV53Margen = AV52Valor.subtract((AV51CosteFab.add(AV50Coste_p).add(AV118Costest))) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMargen_Internalname, GXutil.ltrimstr( AV53Margen, 9, 2));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(41) ;
      }
      sendrow_412( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_41_Refreshing )
      {
         httpContext.doAjaxLoad(41, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e1519Y2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV27ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV29ColumnsSelector.fromJSonString(AV27ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "AnalisisCostesBasicos_WCColumnsSelector", ((GXutil.strcmp("", AV27ColumnsSelectorXML)==0) ? "" : AV29ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV29ColumnsSelector", AV29ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV32ManageFiltersData", AV32ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19GridState", AV19GridState);
   }

   public void e1119Y2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("AnalisisCostesBasicos_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV119Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV34ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34ManageFiltersExecutionStep", GXutil.str( AV34ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("AnalisisCostesBasicos_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV34ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34ManageFiltersExecutionStep", GXutil.str( AV34ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV33ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "AnalisisCostesBasicos_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         analisiscostesbasicos_wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV33ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV33ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV119Pgmname+"GridState", AV33ManageFiltersXml) ;
            AV19GridState.fromxml(AV33ManageFiltersXml, null, null);
            AV21OrderedBy = AV19GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21OrderedBy), 4, 0));
            AV22OrderedDsc = AV19GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22OrderedDsc", AV22OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19GridState", AV19GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV29ColumnsSelector", AV29ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV32ManageFiltersData", AV32ManageFiltersData);
   }

   public void e1619Y2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV25ExcelFilename ;
      GXv_char3[0] = AV26ErrorMessage ;
      new app.analisiscostesbasicos_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      analisiscostesbasicos_wc_impl.this.AV25ExcelFilename = GXv_char4[0] ;
      analisiscostesbasicos_wc_impl.this.AV26ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV25ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV25ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV26ErrorMessage);
      }
   }

   public void e1719Y2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.analisiscostesbasicos_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV21OrderedBy, 4, 0))+":"+(AV22OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV29ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "CliCod", "", "Cliente", false, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "CliNom", "", "Nombre Cliente", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "BarNHdr", "", "N° Hdr", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "BarSer", "", "Serie", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "BarColNom", "", "Nombre Color", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "BarColNum", "", "Numero del Color", false, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "BarNomCli", "", "Nombre Color Cliente", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "BarKgm", "", "Kilogramos", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "BarMtr", "", "Metros", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "&Coste_p", "", "Coste Qui", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "&CosteFab", "", "Coste Fab", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "&Valor", "", "Valor", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "&Margen", "", "Margen", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "&TxtAlb", "", "Documentos", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "BarFecGen", "", "Fecha Generacion Barcada", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "BarFecSal", "", "Fecha Salida en Albaran", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXt_char1 = AV28UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "AnalisisCostesBasicos_WCColumnsSelector", GXv_char4) ;
      analisiscostesbasicos_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV28UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV28UserCustomValue)==0) ) )
      {
         AV30ColumnsSelectorAux.fromxml(AV28UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector20[0] = AV30ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector21[0] = AV29ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, GXv_SdtWWPColumnsSelector21) ;
         AV30ColumnsSelectorAux = GXv_SdtWWPColumnsSelector20[0] ;
         AV29ColumnsSelector = GXv_SdtWWPColumnsSelector21[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 = AV32ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item23[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "AnalisisCostesBasicos_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item23) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item23[0] ;
      AV32ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV24FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24FilterFullText", AV24FilterFullText);
      AV35TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFCliCod), 6, 0));
      AV36TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFCliCod_To), 6, 0));
      AV37TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFCliNom", AV37TFCliNom);
      AV38TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFCliNom_Sel", AV38TFCliNom_Sel);
      AV39TFBarNHdr = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFBarNHdr", AV39TFBarNHdr);
      AV40TFBarNHdr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarNHdr_Sel", AV40TFBarNHdr_Sel);
      AV55TFBarSer = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFBarSer", AV55TFBarSer);
      AV56TFBarSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarSer_Sel", AV56TFBarSer_Sel);
      AV57TFBarSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFBarSerDsc", AV57TFBarSerDsc);
      AV58TFBarSerDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFBarSerDsc_Sel", AV58TFBarSerDsc_Sel);
      AV59TFBarColNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFBarColNom", AV59TFBarColNom);
      AV60TFBarColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFBarColNom_Sel", AV60TFBarColNom_Sel);
      AV61TFBarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFBarColNum), 6, 0));
      AV62TFBarColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFBarColNum_To), 6, 0));
      AV65TFBarNomCli = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFBarNomCli", AV65TFBarNomCli);
      AV66TFBarNomCli_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFBarNomCli_Sel", AV66TFBarNomCli_Sel);
      AV67TFBarKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFBarKgm", GXutil.ltrimstr( AV67TFBarKgm, 9, 2));
      AV68TFBarKgm_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFBarKgm_To", GXutil.ltrimstr( AV68TFBarKgm_To, 9, 2));
      AV69TFBarMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFBarMtr", GXutil.ltrimstr( AV69TFBarMtr, 9, 2));
      AV70TFBarMtr_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFBarMtr_To", GXutil.ltrimstr( AV70TFBarMtr_To, 9, 2));
      AV71TFBarFecGen = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFBarFecGen", localUtil.format(AV71TFBarFecGen, "99/99/99"));
      AV75TFBarFecSal = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFBarFecSal", localUtil.format(AV75TFBarFecSal, "99/99/99"));
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
      if ( GXutil.strcmp(AV31Session.getValue(AV119Pgmname+"GridState"), "") == 0 )
      {
         AV19GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV119Pgmname+"GridState"), null, null);
      }
      else
      {
         AV19GridState.fromxml(AV31Session.getValue(AV119Pgmname+"GridState"), null, null);
      }
      AV21OrderedBy = AV19GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21OrderedBy), 4, 0));
      AV22OrderedDsc = AV19GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22OrderedDsc", AV22OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV19GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV19GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV19GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV120GXV1 = 1 ;
      while ( AV120GXV1 <= AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV120GXV1));
         if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV24FilterFullText = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24FilterFullText", AV24FilterFullText);
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV35TFCliCod = (int)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFCliCod), 6, 0));
            AV36TFCliCod_To = (int)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV37TFCliNom = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFCliNom", AV37TFCliNom);
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV38TFCliNom_Sel = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFCliNom_Sel", AV38TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV39TFBarNHdr = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFBarNHdr", AV39TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV40TFBarNHdr_Sel = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarNHdr_Sel", AV40TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV55TFBarSer = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFBarSer", AV55TFBarSer);
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV56TFBarSer_Sel = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarSer_Sel", AV56TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV57TFBarSerDsc = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFBarSerDsc", AV57TFBarSerDsc);
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV58TFBarSerDsc_Sel = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFBarSerDsc_Sel", AV58TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV59TFBarColNom = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFBarColNom", AV59TFBarColNom);
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV60TFBarColNom_Sel = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFBarColNom_Sel", AV60TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV61TFBarColNum = (int)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFBarColNum), 6, 0));
            AV62TFBarColNum_To = (int)(GXutil.lval( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV65TFBarNomCli = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFBarNomCli", AV65TFBarNomCli);
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV66TFBarNomCli_Sel = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFBarNomCli_Sel", AV66TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV67TFBarKgm = CommonUtil.decimalVal( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFBarKgm", GXutil.ltrimstr( AV67TFBarKgm, 9, 2));
            AV68TFBarKgm_To = CommonUtil.decimalVal( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFBarKgm_To", GXutil.ltrimstr( AV68TFBarKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV69TFBarMtr = CommonUtil.decimalVal( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFBarMtr", GXutil.ltrimstr( AV69TFBarMtr, 9, 2));
            AV70TFBarMtr_To = CommonUtil.decimalVal( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFBarMtr_To", GXutil.ltrimstr( AV70TFBarMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV71TFBarFecGen = localUtil.ctod( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFBarFecGen", localUtil.format(AV71TFBarFecGen, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECSAL") == 0 )
         {
            AV75TFBarFecSal = localUtil.ctod( AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFBarFecSal", localUtil.format(AV75TFBarFecSal, "99/99/99"));
         }
         AV120GXV1 = (int)(AV120GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFCliNom_Sel)==0), AV38TFCliNom_Sel, GXv_char4) ;
      analisiscostesbasicos_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char24 = "" ;
      GXv_char3[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFBarNHdr_Sel)==0), AV40TFBarNHdr_Sel, GXv_char3) ;
      analisiscostesbasicos_wc_impl.this.GXt_char24 = GXv_char3[0] ;
      GXt_char25 = "" ;
      GXv_char2[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFBarSer_Sel)==0), AV56TFBarSer_Sel, GXv_char2) ;
      analisiscostesbasicos_wc_impl.this.GXt_char25 = GXv_char2[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFBarSerDsc_Sel)==0), AV58TFBarSerDsc_Sel, GXv_char27) ;
      analisiscostesbasicos_wc_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFBarColNom_Sel)==0), AV60TFBarColNom_Sel, GXv_char29) ;
      analisiscostesbasicos_wc_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV66TFBarNomCli_Sel)==0), AV66TFBarNomCli_Sel, GXv_char31) ;
      analisiscostesbasicos_wc_impl.this.GXt_char30 = GXv_char31[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char24+"|"+GXt_char25+"|"+GXt_char26+"|"+GXt_char28+"||"+GXt_char30+"|||||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFCliNom)==0), AV37TFCliNom, GXv_char31) ;
      analisiscostesbasicos_wc_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFBarNHdr)==0), AV39TFBarNHdr, GXv_char29) ;
      analisiscostesbasicos_wc_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFBarSer)==0), AV55TFBarSer, GXv_char27) ;
      analisiscostesbasicos_wc_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char25 = "" ;
      GXv_char4[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFBarSerDsc)==0), AV57TFBarSerDsc, GXv_char4) ;
      analisiscostesbasicos_wc_impl.this.GXt_char25 = GXv_char4[0] ;
      GXt_char24 = "" ;
      GXv_char3[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFBarColNom)==0), AV59TFBarColNom, GXv_char3) ;
      analisiscostesbasicos_wc_impl.this.GXt_char24 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFBarNomCli)==0), AV65TFBarNomCli, GXv_char2) ;
      analisiscostesbasicos_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV35TFCliCod) ? "" : GXutil.str( AV35TFCliCod, 6, 0))+"|"+GXt_char30+"|"+GXt_char28+"|"+GXt_char26+"|"+GXt_char25+"|"+GXt_char24+"|"+((0==AV61TFBarColNum) ? "" : GXutil.str( AV61TFBarColNum, 6, 0))+"|"+GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFBarKgm)==0) ? "" : GXutil.str( AV67TFBarKgm, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFBarMtr)==0) ? "" : GXutil.str( AV69TFBarMtr, 9, 2))+"||||||"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV71TFBarFecGen)) ? "" : localUtil.dtoc( AV71TFBarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV75TFBarFecSal)) ? "" : localUtil.dtoc( AV75TFBarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV36TFCliCod_To) ? "" : GXutil.str( AV36TFCliCod_To, 6, 0))+"||||||"+((0==AV62TFBarColNum_To) ? "" : GXutil.str( AV62TFBarColNum_To, 6, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV68TFBarKgm_To)==0) ? "" : GXutil.str( AV68TFBarKgm_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFBarMtr_To)==0) ? "" : GXutil.str( AV70TFBarMtr_To, 9, 2))+"|||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV19GridState.fromxml(AV31Session.getValue(AV119Pgmname+"GridState"), null, null);
      AV19GridState.setgxTv_SdtWWPGridState_Orderedby( AV21OrderedBy );
      AV19GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV22OrderedDsc );
      AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState32[0] = AV19GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV24FilterFullText)==0), (short)(0), AV24FilterFullText, "") ;
      AV19GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV19GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFCLICOD", "", !((0==AV35TFCliCod)&&(0==AV36TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV35TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV36TFCliCod_To, 6, 0))) ;
      AV19GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV19GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFCLINOM", "", !(GXutil.strcmp("", AV37TFCliNom)==0), (short)(0), AV37TFCliNom, "", !(GXutil.strcmp("", AV38TFCliNom_Sel)==0), AV38TFCliNom_Sel, "") ;
      AV19GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV19GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFBARNHDR", "", !(GXutil.strcmp("", AV39TFBarNHdr)==0), (short)(0), AV39TFBarNHdr, "", !(GXutil.strcmp("", AV40TFBarNHdr_Sel)==0), AV40TFBarNHdr_Sel, "") ;
      AV19GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV19GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFBARSER", "", !(GXutil.strcmp("", AV55TFBarSer)==0), (short)(0), AV55TFBarSer, "", !(GXutil.strcmp("", AV56TFBarSer_Sel)==0), AV56TFBarSer_Sel, "") ;
      AV19GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV19GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFBARSERDSC", "", !(GXutil.strcmp("", AV57TFBarSerDsc)==0), (short)(0), AV57TFBarSerDsc, "", !(GXutil.strcmp("", AV58TFBarSerDsc_Sel)==0), AV58TFBarSerDsc_Sel, "") ;
      AV19GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV19GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFBARCOLNOM", "", !(GXutil.strcmp("", AV59TFBarColNom)==0), (short)(0), AV59TFBarColNom, "", !(GXutil.strcmp("", AV60TFBarColNom_Sel)==0), AV60TFBarColNom_Sel, "") ;
      AV19GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV19GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFBARCOLNUM", "", !((0==AV61TFBarColNum)&&(0==AV62TFBarColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV61TFBarColNum, 6, 0)), GXutil.trim( GXutil.str( AV62TFBarColNum_To, 6, 0))) ;
      AV19GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV19GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFBARNOMCLI", "", !(GXutil.strcmp("", AV65TFBarNomCli)==0), (short)(0), AV65TFBarNomCli, "", !(GXutil.strcmp("", AV66TFBarNomCli_Sel)==0), AV66TFBarNomCli_Sel, "") ;
      AV19GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV19GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFBARKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFBarKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV68TFBarKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV67TFBarKgm, 9, 2)), GXutil.trim( GXutil.str( AV68TFBarKgm_To, 9, 2))) ;
      AV19GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV19GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFBARMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFBarMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFBarMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV69TFBarMtr, 9, 2)), GXutil.trim( GXutil.str( AV70TFBarMtr_To, 9, 2))) ;
      AV19GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV19GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFBARFECGEN", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV71TFBarFecGen)), (short)(0), GXutil.trim( localUtil.dtoc( AV71TFBarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV19GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV19GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFBARFECSAL", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV75TFBarFecSal)), (short)(0), GXutil.trim( localUtil.dtoc( AV75TFBarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV19GridState = GXv_SdtWWPGridState32[0] ;
      if ( ! (GXutil.strcmp("", AV45Emprcod)==0) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV45Emprcod );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! (0==AV13CliCod) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV13CliCod, 6, 0) );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! (0==AV49Clicod_to) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD_TO" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV49Clicod_to, 6, 0) );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV8BarFecGen)) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFECGEN" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV8BarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV9BarFecGen_to)) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFECGEN_TO" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV9BarFecGen_to, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10BarFecSal)) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFECSAL" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV10BarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV11BarFecSal_to)) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFECSAL_TO" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV11BarFecSal_to, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV12BarSer)==0) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSER" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV12BarSer );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! (0==AV46InBarcod) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INBARCOD" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV46InBarcod, 8, 0) );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! (0==AV47InBarcodreo) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INBARCODREO" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV47InBarcodreo, 1, 0) );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV48InBarcodpar)==0) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INBARCODPAR" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV48InBarcodpar );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      AV19GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV19GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV119Pgmname+"GridState", AV19GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV17TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV17TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV119Pgmname );
      AV17TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV17TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV16HTTPRequest.getScriptName()+"?"+AV16HTTPRequest.getQuerystring() );
      AV17TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TTrn04" );
      AV31Session.setValue("TrnContext", AV17TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_23_19Y2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV32ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_28_19Y2( true) ;
      }
      else
      {
         wb_table2_28_19Y2( false) ;
      }
      return  ;
   }

   public void wb_table2_28_19Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_19Y2e( true) ;
      }
      else
      {
         wb_table1_23_19Y2e( false) ;
      }
   }

   public void wb_table2_28_19Y2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV24FilterFullText, GXutil.rtrim( localUtil.format( AV24FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_AnalisisCostesBasicos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_28_19Y2e( true) ;
      }
      else
      {
         wb_table2_28_19Y2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV45Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Emprcod", AV45Emprcod);
      AV13CliCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13CliCod), 6, 0));
      AV49Clicod_to = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49Clicod_to), 6, 0));
      AV8BarFecGen = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarFecGen", localUtil.format(AV8BarFecGen, "99/99/99"));
      AV9BarFecGen_to = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarFecGen_to", localUtil.format(AV9BarFecGen_to, "99/99/99"));
      AV10BarFecSal = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarFecSal", localUtil.format(AV10BarFecSal, "99/99/99"));
      AV11BarFecSal_to = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarFecSal_to", localUtil.format(AV11BarFecSal_to, "99/99/99"));
      AV12BarSer = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12BarSer", AV12BarSer);
      AV46InBarcod = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46InBarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46InBarcod), 8, 0));
      AV47InBarcodreo = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47InBarcodreo", GXutil.str( AV47InBarcodreo, 1, 0));
      AV48InBarcodpar = (String)getParm(obj,10,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48InBarcodpar", AV48InBarcodpar);
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
      pa19Y2( ) ;
      ws19Y2( ) ;
      we19Y2( ) ;
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
      sCtrlAV45Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV13CliCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV49Clicod_to = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV8BarFecGen = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV9BarFecGen_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV10BarFecSal = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV11BarFecSal_to = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV12BarSer = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV46InBarcod = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV47InBarcodreo = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV48InBarcodpar = (String)getParm(obj,10,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa19Y2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "analisiscostesbasicos_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa19Y2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV45Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Emprcod", AV45Emprcod);
         AV13CliCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13CliCod), 6, 0));
         AV49Clicod_to = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49Clicod_to), 6, 0));
         AV8BarFecGen = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarFecGen", localUtil.format(AV8BarFecGen, "99/99/99"));
         AV9BarFecGen_to = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarFecGen_to", localUtil.format(AV9BarFecGen_to, "99/99/99"));
         AV10BarFecSal = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarFecSal", localUtil.format(AV10BarFecSal, "99/99/99"));
         AV11BarFecSal_to = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarFecSal_to", localUtil.format(AV11BarFecSal_to, "99/99/99"));
         AV12BarSer = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12BarSer", AV12BarSer);
         AV46InBarcod = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46InBarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46InBarcod), 8, 0));
         AV47InBarcodreo = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47InBarcodreo", GXutil.str( AV47InBarcodreo, 1, 0));
         AV48InBarcodpar = (String)getParm(obj,12,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48InBarcodpar", AV48InBarcodpar);
      }
      wcpOAV45Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV45Emprcod") ;
      wcpOAV13CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV13CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV49Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV49Clicod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV8BarFecGen = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV8BarFecGen"), 0) ;
      wcpOAV9BarFecGen_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV9BarFecGen_to"), 0) ;
      wcpOAV10BarFecSal = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV10BarFecSal"), 0) ;
      wcpOAV11BarFecSal_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV11BarFecSal_to"), 0) ;
      wcpOAV12BarSer = httpContext.cgiGet( sPrefix+"wcpOAV12BarSer") ;
      wcpOAV46InBarcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV46InBarcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV47InBarcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV47InBarcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV48InBarcodpar = httpContext.cgiGet( sPrefix+"wcpOAV48InBarcodpar") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV45Emprcod, wcpOAV45Emprcod) != 0 ) || ( AV13CliCod != wcpOAV13CliCod ) || ( AV49Clicod_to != wcpOAV49Clicod_to ) || !( GXutil.dateCompare(GXutil.resetTime(AV8BarFecGen), GXutil.resetTime(wcpOAV8BarFecGen)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV9BarFecGen_to), GXutil.resetTime(wcpOAV9BarFecGen_to)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV10BarFecSal), GXutil.resetTime(wcpOAV10BarFecSal)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV11BarFecSal_to), GXutil.resetTime(wcpOAV11BarFecSal_to)) ) || ( GXutil.strcmp(AV12BarSer, wcpOAV12BarSer) != 0 ) || ( AV46InBarcod != wcpOAV46InBarcod ) || ( AV47InBarcodreo != wcpOAV47InBarcodreo ) || ( GXutil.strcmp(AV48InBarcodpar, wcpOAV48InBarcodpar) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV45Emprcod = AV45Emprcod ;
      wcpOAV13CliCod = AV13CliCod ;
      wcpOAV49Clicod_to = AV49Clicod_to ;
      wcpOAV8BarFecGen = AV8BarFecGen ;
      wcpOAV9BarFecGen_to = AV9BarFecGen_to ;
      wcpOAV10BarFecSal = AV10BarFecSal ;
      wcpOAV11BarFecSal_to = AV11BarFecSal_to ;
      wcpOAV12BarSer = AV12BarSer ;
      wcpOAV46InBarcod = AV46InBarcod ;
      wcpOAV47InBarcodreo = AV47InBarcodreo ;
      wcpOAV48InBarcodpar = AV48InBarcodpar ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV45Emprcod = httpContext.cgiGet( sPrefix+"AV45Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV45Emprcod) > 0 )
      {
         AV45Emprcod = httpContext.cgiGet( sCtrlAV45Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Emprcod", AV45Emprcod);
      }
      else
      {
         AV45Emprcod = httpContext.cgiGet( sPrefix+"AV45Emprcod_PARM") ;
      }
      sCtrlAV13CliCod = httpContext.cgiGet( sPrefix+"AV13CliCod_CTRL") ;
      if ( GXutil.len( sCtrlAV13CliCod) > 0 )
      {
         AV13CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV13CliCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13CliCod), 6, 0));
      }
      else
      {
         AV13CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV13CliCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV49Clicod_to = httpContext.cgiGet( sPrefix+"AV49Clicod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV49Clicod_to) > 0 )
      {
         AV49Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV49Clicod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49Clicod_to), 6, 0));
      }
      else
      {
         AV49Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV49Clicod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV8BarFecGen = httpContext.cgiGet( sPrefix+"AV8BarFecGen_CTRL") ;
      if ( GXutil.len( sCtrlAV8BarFecGen) > 0 )
      {
         AV8BarFecGen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV8BarFecGen), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarFecGen", localUtil.format(AV8BarFecGen, "99/99/99"));
      }
      else
      {
         AV8BarFecGen = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV8BarFecGen_PARM"), 0) ;
      }
      sCtrlAV9BarFecGen_to = httpContext.cgiGet( sPrefix+"AV9BarFecGen_to_CTRL") ;
      if ( GXutil.len( sCtrlAV9BarFecGen_to) > 0 )
      {
         AV9BarFecGen_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV9BarFecGen_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarFecGen_to", localUtil.format(AV9BarFecGen_to, "99/99/99"));
      }
      else
      {
         AV9BarFecGen_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV9BarFecGen_to_PARM"), 0) ;
      }
      sCtrlAV10BarFecSal = httpContext.cgiGet( sPrefix+"AV10BarFecSal_CTRL") ;
      if ( GXutil.len( sCtrlAV10BarFecSal) > 0 )
      {
         AV10BarFecSal = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV10BarFecSal), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarFecSal", localUtil.format(AV10BarFecSal, "99/99/99"));
      }
      else
      {
         AV10BarFecSal = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV10BarFecSal_PARM"), 0) ;
      }
      sCtrlAV11BarFecSal_to = httpContext.cgiGet( sPrefix+"AV11BarFecSal_to_CTRL") ;
      if ( GXutil.len( sCtrlAV11BarFecSal_to) > 0 )
      {
         AV11BarFecSal_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV11BarFecSal_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarFecSal_to", localUtil.format(AV11BarFecSal_to, "99/99/99"));
      }
      else
      {
         AV11BarFecSal_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV11BarFecSal_to_PARM"), 0) ;
      }
      sCtrlAV12BarSer = httpContext.cgiGet( sPrefix+"AV12BarSer_CTRL") ;
      if ( GXutil.len( sCtrlAV12BarSer) > 0 )
      {
         AV12BarSer = httpContext.cgiGet( sCtrlAV12BarSer) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12BarSer", AV12BarSer);
      }
      else
      {
         AV12BarSer = httpContext.cgiGet( sPrefix+"AV12BarSer_PARM") ;
      }
      sCtrlAV46InBarcod = httpContext.cgiGet( sPrefix+"AV46InBarcod_CTRL") ;
      if ( GXutil.len( sCtrlAV46InBarcod) > 0 )
      {
         AV46InBarcod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV46InBarcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46InBarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46InBarcod), 8, 0));
      }
      else
      {
         AV46InBarcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV46InBarcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV47InBarcodreo = httpContext.cgiGet( sPrefix+"AV47InBarcodreo_CTRL") ;
      if ( GXutil.len( sCtrlAV47InBarcodreo) > 0 )
      {
         AV47InBarcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV47InBarcodreo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47InBarcodreo", GXutil.str( AV47InBarcodreo, 1, 0));
      }
      else
      {
         AV47InBarcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV47InBarcodreo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV48InBarcodpar = httpContext.cgiGet( sPrefix+"AV48InBarcodpar_CTRL") ;
      if ( GXutil.len( sCtrlAV48InBarcodpar) > 0 )
      {
         AV48InBarcodpar = httpContext.cgiGet( sCtrlAV48InBarcodpar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48InBarcodpar", AV48InBarcodpar);
      }
      else
      {
         AV48InBarcodpar = httpContext.cgiGet( sPrefix+"AV48InBarcodpar_PARM") ;
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
      pa19Y2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws19Y2( ) ;
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
      ws19Y2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45Emprcod_PARM", GXutil.rtrim( AV45Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV45Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45Emprcod_CTRL", GXutil.rtrim( sCtrlAV45Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13CliCod_PARM", GXutil.ltrim( localUtil.ntoc( AV13CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV13CliCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13CliCod_CTRL", GXutil.rtrim( sCtrlAV13CliCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV49Clicod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV49Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV49Clicod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV49Clicod_to_CTRL", GXutil.rtrim( sCtrlAV49Clicod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8BarFecGen_PARM", localUtil.dtoc( AV8BarFecGen, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8BarFecGen)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8BarFecGen_CTRL", GXutil.rtrim( sCtrlAV8BarFecGen));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9BarFecGen_to_PARM", localUtil.dtoc( AV9BarFecGen_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9BarFecGen_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9BarFecGen_to_CTRL", GXutil.rtrim( sCtrlAV9BarFecGen_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10BarFecSal_PARM", localUtil.dtoc( AV10BarFecSal, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10BarFecSal)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10BarFecSal_CTRL", GXutil.rtrim( sCtrlAV10BarFecSal));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11BarFecSal_to_PARM", localUtil.dtoc( AV11BarFecSal_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11BarFecSal_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11BarFecSal_to_CTRL", GXutil.rtrim( sCtrlAV11BarFecSal_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12BarSer_PARM", GXutil.rtrim( AV12BarSer));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV12BarSer)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12BarSer_CTRL", GXutil.rtrim( sCtrlAV12BarSer));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46InBarcod_PARM", GXutil.ltrim( localUtil.ntoc( AV46InBarcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV46InBarcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46InBarcod_CTRL", GXutil.rtrim( sCtrlAV46InBarcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47InBarcodreo_PARM", GXutil.ltrim( localUtil.ntoc( AV47InBarcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV47InBarcodreo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47InBarcodreo_CTRL", GXutil.rtrim( sCtrlAV47InBarcodreo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV48InBarcodpar_PARM", GXutil.rtrim( AV48InBarcodpar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV48InBarcodpar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV48InBarcodpar_CTRL", GXutil.rtrim( sCtrlAV48InBarcodpar));
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
      we19Y2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202641319594613", true, true);
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
      httpContext.AddJavascriptSource("analisiscostesbasicos_wc.js", "?202641319594613", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_412( )
   {
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_41_idx ;
      edtavVariables_Internalname = sPrefix+"vVARIABLES_"+sGXsfl_41_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_41_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_41_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_41_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_41_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_41_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_41_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_41_idx ;
      edtBarTipCol_Internalname = sPrefix+"BARTIPCOL_"+sGXsfl_41_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_41_idx ;
      edtBarKgm_Internalname = sPrefix+"BARKGM_"+sGXsfl_41_idx ;
      edtBarMtr_Internalname = sPrefix+"BARMTR_"+sGXsfl_41_idx ;
      edtavCoste_p_Internalname = sPrefix+"vCOSTE_P_"+sGXsfl_41_idx ;
      edtavCostefab_Internalname = sPrefix+"vCOSTEFAB_"+sGXsfl_41_idx ;
      edtavValor_Internalname = sPrefix+"vVALOR_"+sGXsfl_41_idx ;
      edtavMargen_Internalname = sPrefix+"vMARGEN_"+sGXsfl_41_idx ;
      edtavTxtalb_Internalname = sPrefix+"vTXTALB_"+sGXsfl_41_idx ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN_"+sGXsfl_41_idx ;
      edtBarFecSal_Internalname = sPrefix+"BARFECSAL_"+sGXsfl_41_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_41_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_41_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_41_fel_idx ;
      edtavVariables_Internalname = sPrefix+"vVARIABLES_"+sGXsfl_41_fel_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_41_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_41_fel_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_41_fel_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_41_fel_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_41_fel_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_41_fel_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_41_fel_idx ;
      edtBarTipCol_Internalname = sPrefix+"BARTIPCOL_"+sGXsfl_41_fel_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_41_fel_idx ;
      edtBarKgm_Internalname = sPrefix+"BARKGM_"+sGXsfl_41_fel_idx ;
      edtBarMtr_Internalname = sPrefix+"BARMTR_"+sGXsfl_41_fel_idx ;
      edtavCoste_p_Internalname = sPrefix+"vCOSTE_P_"+sGXsfl_41_fel_idx ;
      edtavCostefab_Internalname = sPrefix+"vCOSTEFAB_"+sGXsfl_41_fel_idx ;
      edtavValor_Internalname = sPrefix+"vVALOR_"+sGXsfl_41_fel_idx ;
      edtavMargen_Internalname = sPrefix+"vMARGEN_"+sGXsfl_41_fel_idx ;
      edtavTxtalb_Internalname = sPrefix+"vTXTALB_"+sGXsfl_41_fel_idx ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN_"+sGXsfl_41_fel_idx ;
      edtBarFecSal_Internalname = sPrefix+"BARFECSAL_"+sGXsfl_41_fel_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_41_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_41_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wb19Y0( ) ;
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_41_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 42,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV89DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,42);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+"e2119y2_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavVariables_Enabled!=0)&&(edtavVariables_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 43,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavVariables_Internalname,GXutil.ltrim( localUtil.ntoc( AV87Variables, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavVariables_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV87Variables), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV87Variables), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavVariables_Enabled!=0)&&(edtavVariables_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,43);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavVariables_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavVariables_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipCol_Internalname,GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTipCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNomCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNomCli_Internalname,GXutil.rtrim( A1234BarNomCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarNomCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarKgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarKgm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarMtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A184BarMtr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarMtr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCoste_p_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCoste_p_Enabled!=0)&&(edtavCoste_p_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 55,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCoste_p_Internalname,GXutil.ltrim( localUtil.ntoc( AV50Coste_p, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCoste_p_Enabled!=0) ? localUtil.format( AV50Coste_p, "ZZZZZZ9.99") : localUtil.format( AV50Coste_p, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavCoste_p_Enabled!=0)&&(edtavCoste_p_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,55);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCoste_p_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCoste_p_Visible),Integer.valueOf(edtavCoste_p_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostefab_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCostefab_Enabled!=0)&&(edtavCostefab_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 56,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostefab_Internalname,GXutil.ltrim( localUtil.ntoc( AV51CosteFab, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostefab_Enabled!=0) ? localUtil.format( AV51CosteFab, "ZZZZZZ9.99") : localUtil.format( AV51CosteFab, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavCostefab_Enabled!=0)&&(edtavCostefab_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostefab_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostefab_Visible),Integer.valueOf(edtavCostefab_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavValor_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavValor_Enabled!=0)&&(edtavValor_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 57,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavValor_Internalname,GXutil.ltrim( localUtil.ntoc( AV52Valor, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavValor_Enabled!=0) ? localUtil.format( AV52Valor, "ZZZZZZZ9.99") : localUtil.format( AV52Valor, "ZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavValor_Enabled!=0)&&(edtavValor_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,57);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavValor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavValor_Visible),Integer.valueOf(edtavValor_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavMargen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMargen_Enabled!=0)&&(edtavMargen_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 58,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMargen_Internalname,GXutil.ltrim( localUtil.ntoc( AV53Margen, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavMargen_Enabled!=0) ? localUtil.format( AV53Margen, "ZZZZZ9.99") : localUtil.format( AV53Margen, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavMargen_Enabled!=0)&&(edtavMargen_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,58);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMargen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavMargen_Visible),Integer.valueOf(edtavMargen_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavTxtalb_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTxtalb_Enabled!=0)&&(edtavTxtalb_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 59,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTxtalb_Internalname,AV54TxtAlb,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavTxtalb_Enabled!=0)&&(edtavTxtalb_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,59);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTxtalb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavTxtalb_Visible),Integer.valueOf(edtavTxtalb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecGen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecGen_Internalname,localUtil.format(A159BarFecGen, "99/99/99"),localUtil.format( A159BarFecGen, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecGen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFecGen_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecSal_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecSal_Internalname,localUtil.format(A161BarFecSal, "99/99/99"),localUtil.format( A161BarFecSal, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFecSal_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes19Y2( ) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N° Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Serie", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción Serie", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero del Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNomCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarKgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilogramos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarMtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCoste_p_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Qui", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostefab_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Fab", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavValor_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavMargen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Margen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavTxtalb_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Documentos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecGen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Generacion Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecSal_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Salida en Albaran", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV89DetailWebComponent));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV87Variables, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavVariables_Enabled, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNHdr_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A135BarColNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1234BarNomCli));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNomCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarKgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarMtr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV50Coste_p, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCoste_p_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCoste_p_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV51CosteFab, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostefab_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostefab_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV52Valor, (byte)(11), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavValor_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavValor_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV53Margen, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMargen_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavMargen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV54TxtAlb);
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTxtalb_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavTxtalb_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A159BarFecGen, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecGen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A161BarFecSal, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecSal_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT" ;
      edtavVariables_Internalname = sPrefix+"vVARIABLES" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR" ;
      edtBarSer_Internalname = sPrefix+"BARSER" ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC" ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM" ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM" ;
      edtBarTipCol_Internalname = sPrefix+"BARTIPCOL" ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI" ;
      edtBarKgm_Internalname = sPrefix+"BARKGM" ;
      edtBarMtr_Internalname = sPrefix+"BARMTR" ;
      edtavCoste_p_Internalname = sPrefix+"vCOSTE_P" ;
      edtavCostefab_Internalname = sPrefix+"vCOSTEFAB" ;
      edtavValor_Internalname = sPrefix+"vVALOR" ;
      edtavMargen_Internalname = sPrefix+"vMARGEN" ;
      edtavTxtalb_Internalname = sPrefix+"vTXTALB" ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN" ;
      edtBarFecSal_Internalname = sPrefix+"BARFECSAL" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divCell_grid_dwc_Internalname = sPrefix+"CELL_GRID_DWC" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_barfecgenauxdate_Internalname = sPrefix+"vDDO_BARFECGENAUXDATE" ;
      divDdo_barfecgenauxdates_Internalname = sPrefix+"DDO_BARFECGENAUXDATES" ;
      edtavDdo_barfecsalauxdate_Internalname = sPrefix+"vDDO_BARFECSALAUXDATE" ;
      divDdo_barfecsalauxdates_Internalname = sPrefix+"DDO_BARFECSALAUXDATES" ;
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
      edtBarFecSal_Jsonclick = "" ;
      edtBarFecGen_Jsonclick = "" ;
      edtavTxtalb_Jsonclick = "" ;
      edtavTxtalb_Enabled = 1 ;
      edtavMargen_Jsonclick = "" ;
      edtavMargen_Enabled = 1 ;
      edtavValor_Jsonclick = "" ;
      edtavValor_Enabled = 1 ;
      edtavCostefab_Jsonclick = "" ;
      edtavCostefab_Enabled = 1 ;
      edtavCoste_p_Jsonclick = "" ;
      edtavCoste_p_Enabled = 1 ;
      edtBarMtr_Jsonclick = "" ;
      edtBarKgm_Jsonclick = "" ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarTipCol_Jsonclick = "" ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtBarNHdr_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtavVariables_Jsonclick = "" ;
      edtavVariables_Visible = 0 ;
      edtavVariables_Enabled = 1 ;
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtBarFecSal_Visible = -1 ;
      edtBarFecGen_Visible = -1 ;
      edtavTxtalb_Visible = -1 ;
      edtavMargen_Visible = -1 ;
      edtavValor_Visible = -1 ;
      edtavCostefab_Visible = -1 ;
      edtavCoste_p_Visible = -1 ;
      edtBarMtr_Visible = -1 ;
      edtBarKgm_Visible = -1 ;
      edtBarNomCli_Visible = -1 ;
      edtBarColNum_Visible = -1 ;
      edtBarColNom_Visible = -1 ;
      edtBarSerDsc_Visible = -1 ;
      edtBarSer_Visible = -1 ;
      edtBarNHdr_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_barfecsalauxdate_Jsonclick = "" ;
      edtavDdo_barfecgenauxdate_Jsonclick = "" ;
      divCell_grid_dwc_Class = "col-xs-12" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "AnalisisCostesBasicos_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic||Dynamic|||||||||" ;
      Ddo_grid_Includedatalist = "|T|T|T|T|T||T|||||||||" ;
      Ddo_grid_Filterisrange = "T||||||T||T|T|||||||" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Character|Character|Character|Numeric|Character|Numeric|Numeric||||||Date|Date" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T||||||T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T||T|T|T|T|T||||||||T|T" ;
      Ddo_grid_Columnssortvalues = "1|2||3|4|5|6|7||||||||8|9" ;
      Ddo_grid_Columnids = "2:CliCod|3:CliNom|4:BarNHdr|5:BarSer|6:BarSerDsc|7:BarColNom|8:BarColNum|10:BarNomCli|11:BarKgm|12:BarMtr|13:Coste_p|14:CosteFab|15:Valor|16:Margen|17:TxtAlb|18:BarFecGen|19:BarFecSal" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV51CosteFab',fld:'vCOSTEFAB',pic:'ZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV29ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV45Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV13CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV49Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV8BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV9BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV10BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV11BarFecSal_to',fld:'vBARFECSAL_TO',pic:''},{av:'AV12BarSer',fld:'vBARSER',pic:''},{av:'AV46InBarcod',fld:'vINBARCOD',pic:'ZZZZZZZ9'},{av:'AV47InBarcodreo',fld:'vINBARCODREO',pic:'9'},{av:'AV48InBarcodpar',fld:'vINBARCODPAR',pic:''},{av:'AV24FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV37TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV38TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV39TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV40TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV55TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV56TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV57TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV58TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV59TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV60TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV61TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV62TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV66TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV67TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV68TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV69TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV70TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV71TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV75TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV119Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV21OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV22OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV88CosteTeo',fld:'vCOSTETEO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV81mAgua',fld:'vMAGUA',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV82menergia',fld:'vMENERGIA',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV83mgas',fld:'vMGAS',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV84mmod',fld:'vMMOD',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV85mmoi',fld:'vMMOI',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV86Traza',fld:'vTRAZA',pic:'9',hsh:true},{av:'AV118Costest',fld:'vCOSTEST',pic:'9999999.99',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV29ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtavCoste_p_Visible',ctrl:'vCOSTE_P',prop:'Visible'},{av:'edtavCostefab_Visible',ctrl:'vCOSTEFAB',prop:'Visible'},{av:'edtavValor_Visible',ctrl:'vVALOR',prop:'Visible'},{av:'edtavMargen_Visible',ctrl:'vMARGEN',prop:'Visible'},{av:'edtavTxtalb_Visible',ctrl:'vTXTALB',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV32ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV19GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1219Y2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV45Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV13CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV49Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV8BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV9BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV10BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV11BarFecSal_to',fld:'vBARFECSAL_TO',pic:''},{av:'AV12BarSer',fld:'vBARSER',pic:''},{av:'AV46InBarcod',fld:'vINBARCOD',pic:'ZZZZZZZ9'},{av:'AV47InBarcodreo',fld:'vINBARCODREO',pic:'9'},{av:'AV48InBarcodpar',fld:'vINBARCODPAR',pic:''},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV29ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV37TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV38TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV39TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV40TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV55TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV56TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV57TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV58TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV59TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV60TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV61TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV62TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV66TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV67TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV68TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV69TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV70TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV71TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV75TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV119Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV21OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV22OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV51CosteFab',fld:'vCOSTEFAB',pic:'ZZZZZZ9.99',hsh:true},{av:'AV88CosteTeo',fld:'vCOSTETEO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV81mAgua',fld:'vMAGUA',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV82menergia',fld:'vMENERGIA',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV83mgas',fld:'vMGAS',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV84mmod',fld:'vMMOD',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV85mmoi',fld:'vMMOI',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV86Traza',fld:'vTRAZA',pic:'9',hsh:true},{av:'AV118Costest',fld:'vCOSTEST',pic:'9999999.99',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1319Y2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV45Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV13CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV49Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV8BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV9BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV10BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV11BarFecSal_to',fld:'vBARFECSAL_TO',pic:''},{av:'AV12BarSer',fld:'vBARSER',pic:''},{av:'AV46InBarcod',fld:'vINBARCOD',pic:'ZZZZZZZ9'},{av:'AV47InBarcodreo',fld:'vINBARCODREO',pic:'9'},{av:'AV48InBarcodpar',fld:'vINBARCODPAR',pic:''},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV29ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV37TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV38TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV39TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV40TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV55TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV56TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV57TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV58TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV59TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV60TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV61TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV62TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV66TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV67TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV68TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV69TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV70TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV71TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV75TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV119Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV21OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV22OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV51CosteFab',fld:'vCOSTEFAB',pic:'ZZZZZZ9.99',hsh:true},{av:'AV88CosteTeo',fld:'vCOSTETEO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV81mAgua',fld:'vMAGUA',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV82menergia',fld:'vMENERGIA',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV83mgas',fld:'vMGAS',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV84mmod',fld:'vMMOD',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV85mmoi',fld:'vMMOI',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV86Traza',fld:'vTRAZA',pic:'9',hsh:true},{av:'AV118Costest',fld:'vCOSTEST',pic:'9999999.99',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1419Y2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV45Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV13CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV49Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV8BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV9BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV10BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV11BarFecSal_to',fld:'vBARFECSAL_TO',pic:''},{av:'AV12BarSer',fld:'vBARSER',pic:''},{av:'AV46InBarcod',fld:'vINBARCOD',pic:'ZZZZZZZ9'},{av:'AV47InBarcodreo',fld:'vINBARCODREO',pic:'9'},{av:'AV48InBarcodpar',fld:'vINBARCODPAR',pic:''},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV29ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV37TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV38TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV39TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV40TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV55TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV56TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV57TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV58TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV59TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV60TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV61TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV62TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV66TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV67TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV68TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV69TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV70TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV71TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV75TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV119Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV21OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV22OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV51CosteFab',fld:'vCOSTEFAB',pic:'ZZZZZZ9.99',hsh:true},{av:'AV88CosteTeo',fld:'vCOSTETEO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV81mAgua',fld:'vMAGUA',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV82menergia',fld:'vMENERGIA',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV83mgas',fld:'vMGAS',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV84mmod',fld:'vMMOD',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV85mmoi',fld:'vMMOI',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV86Traza',fld:'vTRAZA',pic:'9',hsh:true},{av:'AV118Costest',fld:'vCOSTEST',pic:'9999999.99',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV21OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV22OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV75TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV71TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV69TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV70TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV67TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV68TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV65TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV66TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV61TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV62TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV59TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV60TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV57TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV58TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV55TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV56TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV39TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV40TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV37TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV38TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2019Y2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!'},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'AV51CosteFab',fld:'vCOSTEFAB',pic:'ZZZZZZ9.99',hsh:true},{av:'AV88CosteTeo',fld:'vCOSTETEO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV81mAgua',fld:'vMAGUA',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV82menergia',fld:'vMENERGIA',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV83mgas',fld:'vMGAS',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV84mmod',fld:'vMMOD',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV85mmoi',fld:'vMMOI',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV86Traza',fld:'vTRAZA',pic:'9',hsh:true},{av:'A141BarCosPro',fld:'BARCOSPRO',pic:'ZZZZZZ9.99'},{av:'A140BarCosAny',fld:'BARCOSANY',pic:'ZZZZZZ9.99'},{av:'AV118Costest',fld:'vCOSTEST',pic:'9999999.99',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV89DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{av:'AV86Traza',fld:'vTRAZA',pic:'9',hsh:true},{av:'AV85mmoi',fld:'vMMOI',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV84mmod',fld:'vMMOD',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV83mgas',fld:'vMGAS',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV82menergia',fld:'vMENERGIA',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV81mAgua',fld:'vMAGUA',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV88CosteTeo',fld:'vCOSTETEO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV51CosteFab',fld:'vCOSTEFAB',pic:'ZZZZZZ9.99',hsh:true},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV52Valor',fld:'vVALOR',pic:'ZZZZZZZ9.99'},{av:'AV54TxtAlb',fld:'vTXTALB',pic:''},{av:'AV50Coste_p',fld:'vCOSTE_P',pic:'ZZZZZZ9.99'},{av:'AV53Margen',fld:'vMARGEN',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1519Y2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV45Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV13CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV49Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV8BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV9BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV10BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV11BarFecSal_to',fld:'vBARFECSAL_TO',pic:''},{av:'AV12BarSer',fld:'vBARSER',pic:''},{av:'AV46InBarcod',fld:'vINBARCOD',pic:'ZZZZZZZ9'},{av:'AV47InBarcodreo',fld:'vINBARCODREO',pic:'9'},{av:'AV48InBarcodpar',fld:'vINBARCODPAR',pic:''},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV29ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV37TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV38TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV39TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV40TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV55TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV56TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV57TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV58TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV59TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV60TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV61TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV62TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV66TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV67TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV68TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV69TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV70TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV71TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV75TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV119Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV21OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV22OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV51CosteFab',fld:'vCOSTEFAB',pic:'ZZZZZZ9.99',hsh:true},{av:'AV88CosteTeo',fld:'vCOSTETEO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV81mAgua',fld:'vMAGUA',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV82menergia',fld:'vMENERGIA',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV83mgas',fld:'vMGAS',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV84mmod',fld:'vMMOD',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV85mmoi',fld:'vMMOI',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV86Traza',fld:'vTRAZA',pic:'9',hsh:true},{av:'AV118Costest',fld:'vCOSTEST',pic:'9999999.99',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV29ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtavCoste_p_Visible',ctrl:'vCOSTE_P',prop:'Visible'},{av:'edtavCostefab_Visible',ctrl:'vCOSTEFAB',prop:'Visible'},{av:'edtavValor_Visible',ctrl:'vVALOR',prop:'Visible'},{av:'edtavMargen_Visible',ctrl:'vMARGEN',prop:'Visible'},{av:'edtavTxtalb_Visible',ctrl:'vTXTALB',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV32ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV19GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1119Y2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV45Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV13CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV49Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV8BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV9BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV10BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV11BarFecSal_to',fld:'vBARFECSAL_TO',pic:''},{av:'AV12BarSer',fld:'vBARSER',pic:''},{av:'AV46InBarcod',fld:'vINBARCOD',pic:'ZZZZZZZ9'},{av:'AV47InBarcodreo',fld:'vINBARCODREO',pic:'9'},{av:'AV48InBarcodpar',fld:'vINBARCODPAR',pic:''},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV29ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV37TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV38TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV39TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV40TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV55TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV56TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV57TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV58TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV59TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV60TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV61TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV62TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV66TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV67TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV68TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV69TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV70TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV71TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV75TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV119Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV21OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV22OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV51CosteFab',fld:'vCOSTEFAB',pic:'ZZZZZZ9.99',hsh:true},{av:'AV88CosteTeo',fld:'vCOSTETEO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV81mAgua',fld:'vMAGUA',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV82menergia',fld:'vMENERGIA',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV83mgas',fld:'vMGAS',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV84mmod',fld:'vMMOD',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV85mmoi',fld:'vMMOI',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV86Traza',fld:'vTRAZA',pic:'9',hsh:true},{av:'AV118Costest',fld:'vCOSTEST',pic:'9999999.99',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV19GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19GridState',fld:'vGRIDSTATE',pic:''},{av:'AV21OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV22OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV24FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV37TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV38TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV39TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV40TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV55TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV56TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV57TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV58TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV59TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV60TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV61TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV62TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV66TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV67TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV68TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV69TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV70TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV71TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV75TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV29ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtavCoste_p_Visible',ctrl:'vCOSTE_P',prop:'Visible'},{av:'edtavCostefab_Visible',ctrl:'vCOSTEFAB',prop:'Visible'},{av:'edtavValor_Visible',ctrl:'vVALOR',prop:'Visible'},{av:'edtavMargen_Visible',ctrl:'vMARGEN',prop:'Visible'},{av:'edtavTxtalb_Visible',ctrl:'vTXTALB',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV32ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1619Y2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e1719Y2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e2119Y2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
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
      wcpOAV45Emprcod = "" ;
      wcpOAV8BarFecGen = GXutil.nullDate() ;
      wcpOAV9BarFecGen_to = GXutil.nullDate() ;
      wcpOAV10BarFecSal = GXutil.nullDate() ;
      wcpOAV11BarFecSal_to = GXutil.nullDate() ;
      wcpOAV12BarSer = "" ;
      wcpOAV48InBarcodpar = "" ;
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
      AV45Emprcod = "" ;
      AV8BarFecGen = GXutil.nullDate() ;
      AV9BarFecGen_to = GXutil.nullDate() ;
      AV10BarFecSal = GXutil.nullDate() ;
      AV11BarFecSal_to = GXutil.nullDate() ;
      AV12BarSer = "" ;
      AV48InBarcodpar = "" ;
      AV29ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV24FilterFullText = "" ;
      AV37TFCliNom = "" ;
      AV38TFCliNom_Sel = "" ;
      AV39TFBarNHdr = "" ;
      AV40TFBarNHdr_Sel = "" ;
      AV55TFBarSer = "" ;
      AV56TFBarSer_Sel = "" ;
      AV57TFBarSerDsc = "" ;
      AV58TFBarSerDsc_Sel = "" ;
      AV59TFBarColNom = "" ;
      AV60TFBarColNom_Sel = "" ;
      AV65TFBarNomCli = "" ;
      AV66TFBarNomCli_Sel = "" ;
      AV67TFBarKgm = DecimalUtil.ZERO ;
      AV68TFBarKgm_To = DecimalUtil.ZERO ;
      AV69TFBarMtr = DecimalUtil.ZERO ;
      AV70TFBarMtr_To = DecimalUtil.ZERO ;
      AV71TFBarFecGen = GXutil.nullDate() ;
      AV75TFBarFecSal = GXutil.nullDate() ;
      AV119Pgmname = "" ;
      AV51CosteFab = DecimalUtil.ZERO ;
      AV88CosteTeo = DecimalUtil.ZERO ;
      AV81mAgua = DecimalUtil.ZERO ;
      AV82menergia = DecimalUtil.ZERO ;
      AV83mgas = DecimalUtil.ZERO ;
      AV84mmod = DecimalUtil.ZERO ;
      AV85mmoi = DecimalUtil.ZERO ;
      AV118Costest = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV32ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV41DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A228BarUniMed = "" ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A140BarCosAny = DecimalUtil.ZERO ;
      AV19GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
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
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      WebComp_Grid_dwc_Component = "" ;
      OldGrid_dwc = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV73DDO_BarFecGenAuxDate = GXutil.nullDate() ;
      AV77DDO_BarFecSalAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV89DetailWebComponent = "" ;
      A279CliNom = "" ;
      A13696BarNHdr = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      AV50Coste_p = DecimalUtil.ZERO ;
      AV52Valor = DecimalUtil.ZERO ;
      AV53Margen = DecimalUtil.ZERO ;
      AV54TxtAlb = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A161BarFecSal = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      scmdbuf = "" ;
      lV95Analisiscostesbasicos_wcds_1_filterfulltext = "" ;
      lV12BarSer = "" ;
      lV98Analisiscostesbasicos_wcds_4_tfclinom = "" ;
      lV100Analisiscostesbasicos_wcds_6_tfbarnhdr = "" ;
      lV102Analisiscostesbasicos_wcds_8_tfbarser = "" ;
      lV104Analisiscostesbasicos_wcds_10_tfbarserdsc = "" ;
      lV106Analisiscostesbasicos_wcds_12_tfbarcolnom = "" ;
      lV110Analisiscostesbasicos_wcds_16_tfbarnomcli = "" ;
      AV99Analisiscostesbasicos_wcds_5_tfclinom_sel = "" ;
      AV98Analisiscostesbasicos_wcds_4_tfclinom = "" ;
      AV101Analisiscostesbasicos_wcds_7_tfbarnhdr_sel = "" ;
      AV100Analisiscostesbasicos_wcds_6_tfbarnhdr = "" ;
      AV103Analisiscostesbasicos_wcds_9_tfbarser_sel = "" ;
      AV102Analisiscostesbasicos_wcds_8_tfbarser = "" ;
      AV105Analisiscostesbasicos_wcds_11_tfbarserdsc_sel = "" ;
      AV104Analisiscostesbasicos_wcds_10_tfbarserdsc = "" ;
      AV107Analisiscostesbasicos_wcds_13_tfbarcolnom_sel = "" ;
      AV106Analisiscostesbasicos_wcds_12_tfbarcolnom = "" ;
      AV111Analisiscostesbasicos_wcds_17_tfbarnomcli_sel = "" ;
      AV110Analisiscostesbasicos_wcds_16_tfbarnomcli = "" ;
      AV112Analisiscostesbasicos_wcds_18_tfbarkgm = DecimalUtil.ZERO ;
      AV113Analisiscostesbasicos_wcds_19_tfbarkgm_to = DecimalUtil.ZERO ;
      AV114Analisiscostesbasicos_wcds_20_tfbarmtr = DecimalUtil.ZERO ;
      AV115Analisiscostesbasicos_wcds_21_tfbarmtr_to = DecimalUtil.ZERO ;
      AV116Analisiscostesbasicos_wcds_22_tfbarfecgen = GXutil.nullDate() ;
      AV117Analisiscostesbasicos_wcds_23_tfbarfecsal = GXutil.nullDate() ;
      AV95Analisiscostesbasicos_wcds_1_filterfulltext = "" ;
      H019Y3_A396EmprCod = new String[] {""} ;
      H019Y3_A228BarUniMed = new String[] {""} ;
      H019Y3_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H019Y3_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H019Y3_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H019Y3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H019Y3_A1234BarNomCli = new String[] {""} ;
      H019Y3_A218BarTipCol = new byte[1] ;
      H019Y3_A136BarColNum = new int[1] ;
      H019Y3_A135BarColNom = new String[] {""} ;
      H019Y3_A1652BarSerDsc = new String[] {""} ;
      H019Y3_A212BarSer = new String[] {""} ;
      H019Y3_A13696BarNHdr = new String[] {""} ;
      H019Y3_A279CliNom = new String[] {""} ;
      H019Y3_A252CliCod = new int[1] ;
      H019Y3_n252CliCod = new boolean[] {false} ;
      H019Y3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H019Y3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H019Y3_A129BarCod = new int[1] ;
      H019Y3_A132BarCodReo = new byte[1] ;
      H019Y3_A130BarCodPar = new String[] {""} ;
      H019Y5_AGRID_nRecordCount = new long[1] ;
      AV92Station = "" ;
      AV93Emprnom = "" ;
      AV94Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV15WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV31Session = httpContext.getWebSession();
      AV27ColumnsSelectorXML = "" ;
      GXv_int9 = new byte[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_int8 = new int[1] ;
      GXv_int19 = new byte[1] ;
      GXv_decimal18 = new java.math.BigDecimal[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV33ManageFiltersXml = "" ;
      AV25ExcelFilename = "" ;
      AV26ErrorMessage = "" ;
      AV28UserCustomValue = "" ;
      AV30ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector20 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector21 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item23 = new GXBaseCollection[1] ;
      AV20GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char30 = "" ;
      GXv_char31 = new String[1] ;
      GXt_char28 = "" ;
      GXv_char29 = new String[1] ;
      GXt_char26 = "" ;
      GXv_char27 = new String[1] ;
      GXt_char25 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char24 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState32 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV17TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV16HTTPRequest = httpContext.getHttpRequest();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV45Emprcod = "" ;
      sCtrlAV13CliCod = "" ;
      sCtrlAV49Clicod_to = "" ;
      sCtrlAV8BarFecGen = "" ;
      sCtrlAV9BarFecGen_to = "" ;
      sCtrlAV10BarFecSal = "" ;
      sCtrlAV11BarFecSal_to = "" ;
      sCtrlAV12BarSer = "" ;
      sCtrlAV46InBarcod = "" ;
      sCtrlAV47InBarcodreo = "" ;
      sCtrlAV48InBarcodpar = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.analisiscostesbasicos_wc__default(),
         new Object[] {
             new Object[] {
            H019Y3_A396EmprCod, H019Y3_A228BarUniMed, H019Y3_A140BarCosAny, H019Y3_A141BarCosPro, H019Y3_A161BarFecSal, H019Y3_A159BarFecGen, H019Y3_A1234BarNomCli, H019Y3_A218BarTipCol, H019Y3_A136BarColNum, H019Y3_A135BarColNom,
            H019Y3_A1652BarSerDsc, H019Y3_A212BarSer, H019Y3_A13696BarNHdr, H019Y3_A279CliNom, H019Y3_A252CliCod, H019Y3_n252CliCod, H019Y3_A184BarMtr, H019Y3_A166BarKgm, H019Y3_A129BarCod, H019Y3_A132BarCodReo,
            H019Y3_A130BarCodPar
            }
            , new Object[] {
            H019Y5_AGRID_nRecordCount
            }
         }
      );
      AV119Pgmname = "AnalisisCostesBasicos_WC" ;
      /* GeneXus formulas. */
      AV119Pgmname = "AnalisisCostesBasicos_WC" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavVariables_Enabled = 0 ;
      edtavCoste_p_Enabled = 0 ;
      edtavCostefab_Enabled = 0 ;
      edtavValor_Enabled = 0 ;
      edtavMargen_Enabled = 0 ;
      edtavTxtalb_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV47InBarcodreo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV47InBarcodreo ;
   private byte AV34ManageFiltersExecutionStep ;
   private byte AV86Traza ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXv_int9[] ;
   private byte GXv_int19[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV21OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV87Variables ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV13CliCod ;
   private int wcpOAV49Clicod_to ;
   private int wcpOAV46InBarcod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_41 ;
   private int AV13CliCod ;
   private int AV49Clicod_to ;
   private int AV46InBarcod ;
   private int nGXsfl_41_idx=1 ;
   private int AV35TFCliCod ;
   private int AV36TFCliCod_To ;
   private int AV61TFBarColNum ;
   private int AV62TFBarColNum_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int edtavDetailwebcomponent_Enabled ;
   private int edtavVariables_Enabled ;
   private int edtavCoste_p_Enabled ;
   private int edtavCostefab_Enabled ;
   private int edtavValor_Enabled ;
   private int edtavMargen_Enabled ;
   private int edtavTxtalb_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV96Analisiscostesbasicos_wcds_2_tfclicod ;
   private int AV97Analisiscostesbasicos_wcds_3_tfclicod_to ;
   private int AV108Analisiscostesbasicos_wcds_14_tfbarcolnum ;
   private int AV109Analisiscostesbasicos_wcds_15_tfbarcolnum_to ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtBarNHdr_Visible ;
   private int edtBarSer_Visible ;
   private int edtBarSerDsc_Visible ;
   private int edtBarColNom_Visible ;
   private int edtBarColNum_Visible ;
   private int edtBarNomCli_Visible ;
   private int edtBarKgm_Visible ;
   private int edtBarMtr_Visible ;
   private int edtavCoste_p_Visible ;
   private int edtavCostefab_Visible ;
   private int edtavValor_Visible ;
   private int edtavMargen_Visible ;
   private int edtavTxtalb_Visible ;
   private int edtBarFecGen_Visible ;
   private int edtBarFecSal_Visible ;
   private int AV42PageToGo ;
   private int GXv_int8[] ;
   private int AV120GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavDetailwebcomponent_Visible ;
   private int edtavVariables_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV43GridCurrentPage ;
   private long AV44GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV67TFBarKgm ;
   private java.math.BigDecimal AV68TFBarKgm_To ;
   private java.math.BigDecimal AV69TFBarMtr ;
   private java.math.BigDecimal AV70TFBarMtr_To ;
   private java.math.BigDecimal AV51CosteFab ;
   private java.math.BigDecimal AV88CosteTeo ;
   private java.math.BigDecimal AV81mAgua ;
   private java.math.BigDecimal AV82menergia ;
   private java.math.BigDecimal AV83mgas ;
   private java.math.BigDecimal AV84mmod ;
   private java.math.BigDecimal AV85mmoi ;
   private java.math.BigDecimal AV118Costest ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV50Coste_p ;
   private java.math.BigDecimal AV52Valor ;
   private java.math.BigDecimal AV53Margen ;
   private java.math.BigDecimal AV112Analisiscostesbasicos_wcds_18_tfbarkgm ;
   private java.math.BigDecimal AV113Analisiscostesbasicos_wcds_19_tfbarkgm_to ;
   private java.math.BigDecimal AV114Analisiscostesbasicos_wcds_20_tfbarmtr ;
   private java.math.BigDecimal AV115Analisiscostesbasicos_wcds_21_tfbarmtr_to ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal GXv_decimal18[] ;
   private String wcpOAV45Emprcod ;
   private String wcpOAV12BarSer ;
   private String wcpOAV48InBarcodpar ;
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
   private String AV45Emprcod ;
   private String AV12BarSer ;
   private String AV48InBarcodpar ;
   private String sGXsfl_41_idx="0001" ;
   private String AV37TFCliNom ;
   private String AV38TFCliNom_Sel ;
   private String AV39TFBarNHdr ;
   private String AV40TFBarNHdr_Sel ;
   private String AV55TFBarSer ;
   private String AV56TFBarSer_Sel ;
   private String AV57TFBarSerDsc ;
   private String AV58TFBarSerDsc_Sel ;
   private String AV59TFBarColNom ;
   private String AV60TFBarColNom_Sel ;
   private String AV65TFBarNomCli ;
   private String AV66TFBarNomCli_Sel ;
   private String AV119Pgmname ;
   private String A396EmprCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A228BarUniMed ;
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
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_barfecgenauxdates_Internalname ;
   private String edtavDdo_barfecgenauxdate_Internalname ;
   private String edtavDdo_barfecgenauxdate_Jsonclick ;
   private String divDdo_barfecsalauxdates_Internalname ;
   private String edtavDdo_barfecsalauxdate_Internalname ;
   private String edtavDdo_barfecsalauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavDetailwebcomponent_Internalname ;
   private String AV89DetailWebComponent ;
   private String edtavVariables_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Internalname ;
   private String edtBarColNum_Internalname ;
   private String edtBarTipCol_Internalname ;
   private String A1234BarNomCli ;
   private String edtBarNomCli_Internalname ;
   private String edtBarKgm_Internalname ;
   private String edtBarMtr_Internalname ;
   private String edtavCoste_p_Internalname ;
   private String edtavCostefab_Internalname ;
   private String edtavValor_Internalname ;
   private String edtavMargen_Internalname ;
   private String edtavTxtalb_Internalname ;
   private String edtBarFecGen_Internalname ;
   private String edtBarFecSal_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV12BarSer ;
   private String lV98Analisiscostesbasicos_wcds_4_tfclinom ;
   private String lV100Analisiscostesbasicos_wcds_6_tfbarnhdr ;
   private String lV102Analisiscostesbasicos_wcds_8_tfbarser ;
   private String lV104Analisiscostesbasicos_wcds_10_tfbarserdsc ;
   private String lV106Analisiscostesbasicos_wcds_12_tfbarcolnom ;
   private String lV110Analisiscostesbasicos_wcds_16_tfbarnomcli ;
   private String AV99Analisiscostesbasicos_wcds_5_tfclinom_sel ;
   private String AV98Analisiscostesbasicos_wcds_4_tfclinom ;
   private String AV101Analisiscostesbasicos_wcds_7_tfbarnhdr_sel ;
   private String AV100Analisiscostesbasicos_wcds_6_tfbarnhdr ;
   private String AV103Analisiscostesbasicos_wcds_9_tfbarser_sel ;
   private String AV102Analisiscostesbasicos_wcds_8_tfbarser ;
   private String AV105Analisiscostesbasicos_wcds_11_tfbarserdsc_sel ;
   private String AV104Analisiscostesbasicos_wcds_10_tfbarserdsc ;
   private String AV107Analisiscostesbasicos_wcds_13_tfbarcolnom_sel ;
   private String AV106Analisiscostesbasicos_wcds_12_tfbarcolnom ;
   private String AV111Analisiscostesbasicos_wcds_17_tfbarnomcli_sel ;
   private String AV110Analisiscostesbasicos_wcds_16_tfbarnomcli ;
   private String AV92Station ;
   private String AV93Emprnom ;
   private String AV94Usurcod ;
   private String GXt_char30 ;
   private String GXv_char31[] ;
   private String GXt_char28 ;
   private String GXv_char29[] ;
   private String GXt_char26 ;
   private String GXv_char27[] ;
   private String GXt_char25 ;
   private String GXv_char4[] ;
   private String GXt_char24 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV45Emprcod ;
   private String sCtrlAV13CliCod ;
   private String sCtrlAV49Clicod_to ;
   private String sCtrlAV8BarFecGen ;
   private String sCtrlAV9BarFecGen_to ;
   private String sCtrlAV10BarFecSal ;
   private String sCtrlAV11BarFecSal_to ;
   private String sCtrlAV12BarSer ;
   private String sCtrlAV46InBarcod ;
   private String sCtrlAV47InBarcodreo ;
   private String sCtrlAV48InBarcodpar ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String edtavVariables_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtBarNHdr_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarTipCol_Jsonclick ;
   private String edtBarNomCli_Jsonclick ;
   private String edtBarKgm_Jsonclick ;
   private String edtBarMtr_Jsonclick ;
   private String edtavCoste_p_Jsonclick ;
   private String edtavCostefab_Jsonclick ;
   private String edtavValor_Jsonclick ;
   private String edtavMargen_Jsonclick ;
   private String edtavTxtalb_Jsonclick ;
   private String edtBarFecGen_Jsonclick ;
   private String edtBarFecSal_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV8BarFecGen ;
   private java.util.Date wcpOAV9BarFecGen_to ;
   private java.util.Date wcpOAV10BarFecSal ;
   private java.util.Date wcpOAV11BarFecSal_to ;
   private java.util.Date AV8BarFecGen ;
   private java.util.Date AV9BarFecGen_to ;
   private java.util.Date AV10BarFecSal ;
   private java.util.Date AV11BarFecSal_to ;
   private java.util.Date AV71TFBarFecGen ;
   private java.util.Date AV75TFBarFecSal ;
   private java.util.Date AV73DDO_BarFecGenAuxDate ;
   private java.util.Date AV77DDO_BarFecSalAuxDate ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date AV116Analisiscostesbasicos_wcds_22_tfbarfecgen ;
   private java.util.Date AV117Analisiscostesbasicos_wcds_23_tfbarfecsal ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV22OrderedDsc ;
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
   private boolean n252CliCod ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV27ColumnsSelectorXML ;
   private String AV33ManageFiltersXml ;
   private String AV28UserCustomValue ;
   private String AV24FilterFullText ;
   private String AV54TxtAlb ;
   private String lV95Analisiscostesbasicos_wcds_1_filterfulltext ;
   private String AV95Analisiscostesbasicos_wcds_1_filterfulltext ;
   private String AV25ExcelFilename ;
   private String AV26ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private com.genexus.internet.HttpRequest AV16HTTPRequest ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private IDataStoreProvider pr_default ;
   private String[] H019Y3_A396EmprCod ;
   private String[] H019Y3_A228BarUniMed ;
   private java.math.BigDecimal[] H019Y3_A140BarCosAny ;
   private java.math.BigDecimal[] H019Y3_A141BarCosPro ;
   private java.util.Date[] H019Y3_A161BarFecSal ;
   private java.util.Date[] H019Y3_A159BarFecGen ;
   private String[] H019Y3_A1234BarNomCli ;
   private byte[] H019Y3_A218BarTipCol ;
   private int[] H019Y3_A136BarColNum ;
   private String[] H019Y3_A135BarColNom ;
   private String[] H019Y3_A1652BarSerDsc ;
   private String[] H019Y3_A212BarSer ;
   private String[] H019Y3_A13696BarNHdr ;
   private String[] H019Y3_A279CliNom ;
   private int[] H019Y3_A252CliCod ;
   private boolean[] H019Y3_n252CliCod ;
   private java.math.BigDecimal[] H019Y3_A184BarMtr ;
   private java.math.BigDecimal[] H019Y3_A166BarKgm ;
   private int[] H019Y3_A129BarCod ;
   private byte[] H019Y3_A132BarCodReo ;
   private String[] H019Y3_A130BarCodPar ;
   private long[] H019Y5_AGRID_nRecordCount ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV32ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item23[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV29ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV30ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector20[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector21[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV41DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV19GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState32[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV20GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV17TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV15WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class analisiscostesbasicos_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H019Y3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV96Analisiscostesbasicos_wcds_2_tfclicod ,
                                          int AV97Analisiscostesbasicos_wcds_3_tfclicod_to ,
                                          String AV99Analisiscostesbasicos_wcds_5_tfclinom_sel ,
                                          String AV98Analisiscostesbasicos_wcds_4_tfclinom ,
                                          String AV101Analisiscostesbasicos_wcds_7_tfbarnhdr_sel ,
                                          String AV100Analisiscostesbasicos_wcds_6_tfbarnhdr ,
                                          String AV103Analisiscostesbasicos_wcds_9_tfbarser_sel ,
                                          String AV102Analisiscostesbasicos_wcds_8_tfbarser ,
                                          String AV105Analisiscostesbasicos_wcds_11_tfbarserdsc_sel ,
                                          String AV104Analisiscostesbasicos_wcds_10_tfbarserdsc ,
                                          String AV107Analisiscostesbasicos_wcds_13_tfbarcolnom_sel ,
                                          String AV106Analisiscostesbasicos_wcds_12_tfbarcolnom ,
                                          int AV108Analisiscostesbasicos_wcds_14_tfbarcolnum ,
                                          int AV109Analisiscostesbasicos_wcds_15_tfbarcolnum_to ,
                                          String AV111Analisiscostesbasicos_wcds_17_tfbarnomcli_sel ,
                                          String AV110Analisiscostesbasicos_wcds_16_tfbarnomcli ,
                                          java.math.BigDecimal AV112Analisiscostesbasicos_wcds_18_tfbarkgm ,
                                          java.math.BigDecimal AV113Analisiscostesbasicos_wcds_19_tfbarkgm_to ,
                                          java.math.BigDecimal AV114Analisiscostesbasicos_wcds_20_tfbarmtr ,
                                          java.math.BigDecimal AV115Analisiscostesbasicos_wcds_21_tfbarmtr_to ,
                                          java.util.Date AV116Analisiscostesbasicos_wcds_22_tfbarfecgen ,
                                          java.util.Date AV117Analisiscostesbasicos_wcds_23_tfbarfecsal ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A161BarFecSal ,
                                          short AV21OrderedBy ,
                                          boolean AV22OrderedDsc ,
                                          String AV95Analisiscostesbasicos_wcds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          int AV13CliCod ,
                                          int AV49Clicod_to ,
                                          java.util.Date AV8BarFecGen ,
                                          java.util.Date AV9BarFecGen_to ,
                                          String AV12BarSer ,
                                          java.util.Date AV10BarFecSal ,
                                          java.util.Date AV11BarFecSal_to ,
                                          int AV46InBarcod ,
                                          byte AV47InBarcodreo ,
                                          String AV48InBarcodpar ,
                                          String AV45Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int33 = new byte[53];
      Object[] GXv_Object34 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.BarUniMed, T1.BarCosAny, T1.BarCosPro, T1.BarFecSal, T1.BarFecGen, T1.BarNomCli, T1.BarTipCol, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer," ;
      sSelectString += " RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, T1.CliCod," ;
      sSelectString += " COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      sFromString = " FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo," ;
      sFromString += " BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND" ;
      sFromString += " T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T3.BarMtr, 0),'999990.99'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarSer like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarFecSal >= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.BarFecSal <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      if ( ! (0==AV96Analisiscostesbasicos_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int33[28] = (byte)(1) ;
      }
      if ( ! (0==AV97Analisiscostesbasicos_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int33[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Analisiscostesbasicos_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV98Analisiscostesbasicos_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Analisiscostesbasicos_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int33[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Analisiscostesbasicos_wcds_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV100Analisiscostesbasicos_wcds_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Analisiscostesbasicos_wcds_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int33[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Analisiscostesbasicos_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV102Analisiscostesbasicos_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Analisiscostesbasicos_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int33[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Analisiscostesbasicos_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV104Analisiscostesbasicos_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Analisiscostesbasicos_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int33[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Analisiscostesbasicos_wcds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV106Analisiscostesbasicos_wcds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Analisiscostesbasicos_wcds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int33[39] = (byte)(1) ;
      }
      if ( ! (0==AV108Analisiscostesbasicos_wcds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int33[40] = (byte)(1) ;
      }
      if ( ! (0==AV109Analisiscostesbasicos_wcds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int33[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Analisiscostesbasicos_wcds_17_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV110Analisiscostesbasicos_wcds_16_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Analisiscostesbasicos_wcds_17_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int33[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Analisiscostesbasicos_wcds_18_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int33[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Analisiscostesbasicos_wcds_19_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int33[45] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Analisiscostesbasicos_wcds_20_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int33[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Analisiscostesbasicos_wcds_21_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int33[47] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV116Analisiscostesbasicos_wcds_22_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int33[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV117Analisiscostesbasicos_wcds_23_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int33[49] = (byte)(1) ;
      }
      if ( ( AV21OrderedBy == 1 ) && ! AV22OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV21OrderedBy == 1 ) && ( AV22OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV21OrderedBy == 2 ) && ! AV22OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV21OrderedBy == 2 ) && ( AV22OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV21OrderedBy == 3 ) && ! AV22OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV21OrderedBy == 3 ) && ( AV22OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV21OrderedBy == 4 ) && ! AV22OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV21OrderedBy == 4 ) && ( AV22OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV21OrderedBy == 5 ) && ! AV22OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV21OrderedBy == 5 ) && ( AV22OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV21OrderedBy == 6 ) && ! AV22OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV21OrderedBy == 6 ) && ( AV22OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV21OrderedBy == 7 ) && ! AV22OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV21OrderedBy == 7 ) && ( AV22OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV21OrderedBy == 8 ) && ! AV22OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV21OrderedBy == 8 ) && ( AV22OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV21OrderedBy == 9 ) && ! AV22OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarFecSal" ;
      }
      else if ( ( AV21OrderedBy == 9 ) && ( AV22OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarFecSal DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      }
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object34[0] = scmdbuf ;
      GXv_Object34[1] = GXv_int33 ;
      return GXv_Object34 ;
   }

   protected Object[] conditional_H019Y5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV96Analisiscostesbasicos_wcds_2_tfclicod ,
                                          int AV97Analisiscostesbasicos_wcds_3_tfclicod_to ,
                                          String AV99Analisiscostesbasicos_wcds_5_tfclinom_sel ,
                                          String AV98Analisiscostesbasicos_wcds_4_tfclinom ,
                                          String AV101Analisiscostesbasicos_wcds_7_tfbarnhdr_sel ,
                                          String AV100Analisiscostesbasicos_wcds_6_tfbarnhdr ,
                                          String AV103Analisiscostesbasicos_wcds_9_tfbarser_sel ,
                                          String AV102Analisiscostesbasicos_wcds_8_tfbarser ,
                                          String AV105Analisiscostesbasicos_wcds_11_tfbarserdsc_sel ,
                                          String AV104Analisiscostesbasicos_wcds_10_tfbarserdsc ,
                                          String AV107Analisiscostesbasicos_wcds_13_tfbarcolnom_sel ,
                                          String AV106Analisiscostesbasicos_wcds_12_tfbarcolnom ,
                                          int AV108Analisiscostesbasicos_wcds_14_tfbarcolnum ,
                                          int AV109Analisiscostesbasicos_wcds_15_tfbarcolnum_to ,
                                          String AV111Analisiscostesbasicos_wcds_17_tfbarnomcli_sel ,
                                          String AV110Analisiscostesbasicos_wcds_16_tfbarnomcli ,
                                          java.math.BigDecimal AV112Analisiscostesbasicos_wcds_18_tfbarkgm ,
                                          java.math.BigDecimal AV113Analisiscostesbasicos_wcds_19_tfbarkgm_to ,
                                          java.math.BigDecimal AV114Analisiscostesbasicos_wcds_20_tfbarmtr ,
                                          java.math.BigDecimal AV115Analisiscostesbasicos_wcds_21_tfbarmtr_to ,
                                          java.util.Date AV116Analisiscostesbasicos_wcds_22_tfbarfecgen ,
                                          java.util.Date AV117Analisiscostesbasicos_wcds_23_tfbarfecsal ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A161BarFecSal ,
                                          short AV21OrderedBy ,
                                          boolean AV22OrderedDsc ,
                                          String AV95Analisiscostesbasicos_wcds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          int AV13CliCod ,
                                          int AV49Clicod_to ,
                                          java.util.Date AV8BarFecGen ,
                                          java.util.Date AV9BarFecGen_to ,
                                          String AV12BarSer ,
                                          java.util.Date AV10BarFecSal ,
                                          java.util.Date AV11BarFecSal_to ,
                                          int AV46InBarcod ,
                                          byte AV47InBarcodreo ,
                                          String AV48InBarcodpar ,
                                          String AV45Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int35 = new byte[50];
      Object[] GXv_Object36 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod" ;
      scmdbuf += " = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T3.BarMtr, 0),'999990.99'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarSer like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarFecSal >= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.BarFecSal <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      if ( ! (0==AV96Analisiscostesbasicos_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int35[28] = (byte)(1) ;
      }
      if ( ! (0==AV97Analisiscostesbasicos_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int35[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Analisiscostesbasicos_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV98Analisiscostesbasicos_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Analisiscostesbasicos_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int35[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Analisiscostesbasicos_wcds_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV100Analisiscostesbasicos_wcds_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Analisiscostesbasicos_wcds_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int35[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Analisiscostesbasicos_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV102Analisiscostesbasicos_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Analisiscostesbasicos_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int35[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Analisiscostesbasicos_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV104Analisiscostesbasicos_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Analisiscostesbasicos_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int35[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Analisiscostesbasicos_wcds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV106Analisiscostesbasicos_wcds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Analisiscostesbasicos_wcds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int35[39] = (byte)(1) ;
      }
      if ( ! (0==AV108Analisiscostesbasicos_wcds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int35[40] = (byte)(1) ;
      }
      if ( ! (0==AV109Analisiscostesbasicos_wcds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int35[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Analisiscostesbasicos_wcds_17_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV110Analisiscostesbasicos_wcds_16_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Analisiscostesbasicos_wcds_17_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int35[43] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV116Analisiscostesbasicos_wcds_22_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int35[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV117Analisiscostesbasicos_wcds_23_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int35[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV21OrderedBy == 1 ) && ! AV22OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 1 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 2 ) && ! AV22OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 2 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 3 ) && ! AV22OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 3 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 4 ) && ! AV22OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 4 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 5 ) && ! AV22OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 5 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 6 ) && ! AV22OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 6 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 7 ) && ! AV22OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 7 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 8 ) && ! AV22OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 8 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 9 ) && ! AV22OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 9 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object36[0] = scmdbuf ;
      GXv_Object36[1] = GXv_int35 ;
      return GXv_Object36 ;
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
                  return conditional_H019Y3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).intValue() , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (java.util.Date)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).byteValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] );
            case 1 :
                  return conditional_H019Y5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).intValue() , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (java.util.Date)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).byteValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H019Y3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H019Y5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((String[]) buf[12])[0] = rslt.getString(13, 11);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((byte[]) buf[19])[0] = rslt.getByte(19);
               ((String[]) buf[20])[0] = rslt.getString(20, 1);
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
                  stmt.setString(sIdx, (String)parms[53], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[72]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 26);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[102]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[104]).intValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[105]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 16);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 26);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 26);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               return;
      }
   }

}

