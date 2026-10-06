package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class analisiscosteshistoricosrecetas_sdt_wc_impl extends GXWebComponent
{
   public analisiscosteshistoricosrecetas_sdt_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public analisiscosteshistoricosrecetas_sdt_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( analisiscosteshistoricosrecetas_sdt_wc_impl.class ));
   }

   public analisiscosteshistoricosrecetas_sdt_wc_impl( int remoteHandle ,
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
               AV29HreRacab = httpContext.GetPar( "HreRacab") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29HreRacab", AV29HreRacab);
               AV44Fec1 = localUtil.parseDateParm( httpContext.GetPar( "Fec1")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Fec1", localUtil.format(AV44Fec1, "99/99/99"));
               AV45Fec2 = localUtil.parseDateParm( httpContext.GetPar( "Fec2")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Fec2", localUtil.format(AV45Fec2, "99/99/99"));
               AV41Calculo = (byte)(GXutil.lval( httpContext.GetPar( "Calculo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Calculo", GXutil.str( AV41Calculo, 1, 0));
               AV30barcod = (int)(GXutil.lval( httpContext.GetPar( "barcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30barcod), 8, 0));
               AV31barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31barcodreo", GXutil.str( AV31barcodreo, 1, 0));
               AV32barcodpar = httpContext.GetPar( "barcodpar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32barcodpar", AV32barcodpar);
               AV33ARtcod1 = httpContext.GetPar( "ARtcod1") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33ARtcod1", AV33ARtcod1);
               AV34ARtcod3 = httpContext.GetPar( "ARtcod3") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34ARtcod3", AV34ARtcod3);
               AV37Barcolnom1 = httpContext.GetPar( "Barcolnom1") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Barcolnom1", AV37Barcolnom1);
               AV38Barcolnom3 = httpContext.GetPar( "Barcolnom3") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Barcolnom3", AV38Barcolnom3);
               AV39Barcolnum1 = (int)(GXutil.lval( httpContext.GetPar( "Barcolnum1"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Barcolnum1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39Barcolnum1), 6, 0));
               AV40Barcolnum3 = (int)(GXutil.lval( httpContext.GetPar( "Barcolnum3"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Barcolnum3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Barcolnum3), 6, 0));
               AV42Clicod1 = (int)(GXutil.lval( httpContext.GetPar( "Clicod1"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Clicod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Clicod1), 6, 0));
               AV43Clicod3 = (int)(GXutil.lval( httpContext.GetPar( "Clicod3"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Clicod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43Clicod3), 6, 0));
               AV46Intcod1 = (byte)(GXutil.lval( httpContext.GetPar( "Intcod1"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46Intcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46Intcod1), 2, 0));
               AV47Intcod3 = (byte)(GXutil.lval( httpContext.GetPar( "Intcod3"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Intcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Intcod3), 2, 0));
               AV48TipArtCod1 = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod1"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TipArtCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TipArtCod1), 4, 0));
               AV49TipArtCod3 = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod3"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TipArtCod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TipArtCod3), 4, 0));
               AV50Tipcolcod1 = (byte)(GXutil.lval( httpContext.GetPar( "Tipcolcod1"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50Tipcolcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Tipcolcod1), 2, 0));
               AV51Tipcolcod3 = (byte)(GXutil.lval( httpContext.GetPar( "Tipcolcod3"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Tipcolcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51Tipcolcod3), 2, 0));
               AV65ConsManuales = (byte)(GXutil.lval( httpContext.GetPar( "ConsManuales"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65ConsManuales", GXutil.str( AV65ConsManuales, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV28Emprcod,AV29HreRacab,AV44Fec1,AV45Fec2,Byte.valueOf(AV41Calculo),Integer.valueOf(AV30barcod),Byte.valueOf(AV31barcodreo),AV32barcodpar,AV33ARtcod1,AV34ARtcod3,AV37Barcolnom1,AV38Barcolnom3,Integer.valueOf(AV39Barcolnum1),Integer.valueOf(AV40Barcolnum3),Integer.valueOf(AV42Clicod1),Integer.valueOf(AV43Clicod3),Byte.valueOf(AV46Intcod1),Byte.valueOf(AV47Intcod3),Short.valueOf(AV48TipArtCod1),Short.valueOf(AV49TipArtCod3),Byte.valueOf(AV50Tipcolcod1),Byte.valueOf(AV51Tipcolcod3),Byte.valueOf(AV65ConsManuales)});
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
      nRC_GXsfl_45 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_45"))) ;
      nGXsfl_45_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_45_idx"))) ;
      sGXsfl_45_idx = httpContext.GetPar( "sGXsfl_45_idx") ;
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
      AV104Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV28Emprcod = httpContext.GetPar( "Emprcod") ;
      AV29HreRacab = httpContext.GetPar( "HreRacab") ;
      AV44Fec1 = localUtil.parseDateParm( httpContext.GetPar( "Fec1")) ;
      AV45Fec2 = localUtil.parseDateParm( httpContext.GetPar( "Fec2")) ;
      AV41Calculo = (byte)(GXutil.lval( httpContext.GetPar( "Calculo"))) ;
      AV30barcod = (int)(GXutil.lval( httpContext.GetPar( "barcod"))) ;
      AV31barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "barcodreo"))) ;
      AV32barcodpar = httpContext.GetPar( "barcodpar") ;
      AV33ARtcod1 = httpContext.GetPar( "ARtcod1") ;
      AV34ARtcod3 = httpContext.GetPar( "ARtcod3") ;
      AV37Barcolnom1 = httpContext.GetPar( "Barcolnom1") ;
      AV38Barcolnom3 = httpContext.GetPar( "Barcolnom3") ;
      AV39Barcolnum1 = (int)(GXutil.lval( httpContext.GetPar( "Barcolnum1"))) ;
      AV40Barcolnum3 = (int)(GXutil.lval( httpContext.GetPar( "Barcolnum3"))) ;
      AV42Clicod1 = (int)(GXutil.lval( httpContext.GetPar( "Clicod1"))) ;
      AV43Clicod3 = (int)(GXutil.lval( httpContext.GetPar( "Clicod3"))) ;
      AV46Intcod1 = (byte)(GXutil.lval( httpContext.GetPar( "Intcod1"))) ;
      AV47Intcod3 = (byte)(GXutil.lval( httpContext.GetPar( "Intcod3"))) ;
      AV48TipArtCod1 = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod1"))) ;
      AV49TipArtCod3 = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod3"))) ;
      AV50Tipcolcod1 = (byte)(GXutil.lval( httpContext.GetPar( "Tipcolcod1"))) ;
      AV51Tipcolcod3 = (byte)(GXutil.lval( httpContext.GetPar( "Tipcolcod3"))) ;
      AV65ConsManuales = (byte)(GXutil.lval( httpContext.GetPar( "ConsManuales"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV13AnalisisCostesHistoricosRecetas_SDTs);
      AV54Tot_HreBarKgm = CommonUtil.decimalVal( httpContext.GetPar( "Tot_HreBarKgm"), ".") ;
      AV56Tot_Costei = CommonUtil.decimalVal( httpContext.GetPar( "Tot_Costei"), ".") ;
      AV58Tot_CosteT = CommonUtil.decimalVal( httpContext.GetPar( "Tot_CosteT"), ".") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV104Pgmname, AV12FilterFullText, AV28Emprcod, AV29HreRacab, AV44Fec1, AV45Fec2, AV41Calculo, AV30barcod, AV31barcodreo, AV32barcodpar, AV33ARtcod1, AV34ARtcod3, AV37Barcolnom1, AV38Barcolnom3, AV39Barcolnum1, AV40Barcolnum3, AV42Clicod1, AV43Clicod3, AV46Intcod1, AV47Intcod3, AV48TipArtCod1, AV49TipArtCod3, AV50Tipcolcod1, AV51Tipcolcod3, AV65ConsManuales, AV13AnalisisCostesHistoricosRecetas_SDTs, AV54Tot_HreBarKgm, AV56Tot_Costei, AV58Tot_CosteT, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1MJ2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Analisis Costes Historicos Recetas_SDT_WC", "")) ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.analisiscosteshistoricosrecetas_sdt_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV28Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV29HreRacab)),GXutil.URLEncode(GXutil.formatDateParm(AV44Fec1)),GXutil.URLEncode(GXutil.formatDateParm(AV45Fec2)),GXutil.URLEncode(GXutil.ltrimstr(AV41Calculo,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV30barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV31barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV32barcodpar)),GXutil.URLEncode(GXutil.rtrim(AV33ARtcod1)),GXutil.URLEncode(GXutil.rtrim(AV34ARtcod3)),GXutil.URLEncode(GXutil.rtrim(AV37Barcolnom1)),GXutil.URLEncode(GXutil.rtrim(AV38Barcolnom3)),GXutil.URLEncode(GXutil.ltrimstr(AV39Barcolnum1,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV40Barcolnum3,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV42Clicod1,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV43Clicod3,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV46Intcod1,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV47Intcod3,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV48TipArtCod1,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV49TipArtCod3,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV50Tipcolcod1,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV51Tipcolcod3,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV65ConsManuales,1,0))}, new String[] {"Emprcod","HreRacab","Fec1","Fec2","Calculo","barcod","barcodreo","barcodpar","ARtcod1","ARtcod3","Barcolnom1","Barcolnom3","Barcolnum1","Barcolnum3","Clicod1","Clicod3","Intcod1","Intcod3","TipArtCod1","TipArtCod3","Tipcolcod1","Tipcolcod3","ConsManuales"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vANALISISCOSTESHISTORICOSRECETAS_SDTS", getSecureSignedToken( sPrefix, AV13AnalisisCostesHistoricosRecetas_SDTs));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HREBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV54Tot_HreBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_COSTEI", getSecureSignedToken( sPrefix, localUtil.format( AV56Tot_Costei, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_COSTET", getSecureSignedToken( sPrefix, localUtil.format( AV58Tot_CosteT, "ZZZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"AnalisisCostesHistoricosRecetas_SDT_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV104Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\analisiscosteshistoricosrecetas_sdt_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Analisiscosteshistoricosrecetas_sdts", AV13AnalisisCostesHistoricosRecetas_SDTs);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Analisiscosteshistoricosrecetas_sdts", AV13AnalisisCostesHistoricosRecetas_SDTs);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_Analisiscosteshistoricosrecetas_sdts", getSecureSignedToken( sPrefix, AV13AnalisisCostesHistoricosRecetas_SDTs));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_45, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV29HreRacab", GXutil.rtrim( wcpOAV29HreRacab));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV44Fec1", localUtil.dtoc( wcpOAV44Fec1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV45Fec2", localUtil.dtoc( wcpOAV45Fec2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV41Calculo", GXutil.ltrim( localUtil.ntoc( wcpOAV41Calculo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30barcod", GXutil.ltrim( localUtil.ntoc( wcpOAV30barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV31barcodreo", GXutil.ltrim( localUtil.ntoc( wcpOAV31barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV32barcodpar", GXutil.rtrim( wcpOAV32barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33ARtcod1", GXutil.rtrim( wcpOAV33ARtcod1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34ARtcod3", GXutil.rtrim( wcpOAV34ARtcod3));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV37Barcolnom1", GXutil.rtrim( wcpOAV37Barcolnom1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV38Barcolnom3", GXutil.rtrim( wcpOAV38Barcolnom3));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV39Barcolnum1", GXutil.ltrim( localUtil.ntoc( wcpOAV39Barcolnum1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV40Barcolnum3", GXutil.ltrim( localUtil.ntoc( wcpOAV40Barcolnum3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV42Clicod1", GXutil.ltrim( localUtil.ntoc( wcpOAV42Clicod1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV43Clicod3", GXutil.ltrim( localUtil.ntoc( wcpOAV43Clicod3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV46Intcod1", GXutil.ltrim( localUtil.ntoc( wcpOAV46Intcod1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV47Intcod3", GXutil.ltrim( localUtil.ntoc( wcpOAV47Intcod3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV48TipArtCod1", GXutil.ltrim( localUtil.ntoc( wcpOAV48TipArtCod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV49TipArtCod3", GXutil.ltrim( localUtil.ntoc( wcpOAV49TipArtCod3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV50Tipcolcod1", GXutil.ltrim( localUtil.ntoc( wcpOAV50Tipcolcod1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV51Tipcolcod3", GXutil.ltrim( localUtil.ntoc( wcpOAV51Tipcolcod3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV65ConsManuales", GXutil.ltrim( localUtil.ntoc( wcpOAV65ConsManuales, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV23ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV28Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHRERACAB", GXutil.rtrim( AV29HreRacab));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFEC1", localUtil.dtoc( AV44Fec1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFEC2", localUtil.dtoc( AV45Fec2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCALCULO", GXutil.ltrim( localUtil.ntoc( AV41Calculo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD", GXutil.ltrim( localUtil.ntoc( AV30barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV31barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR", GXutil.rtrim( AV32barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vARTCOD1", GXutil.rtrim( AV33ARtcod1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vARTCOD3", GXutil.rtrim( AV34ARtcod3));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOM1", GXutil.rtrim( AV37Barcolnom1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOM3", GXutil.rtrim( AV38Barcolnom3));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUM1", GXutil.ltrim( localUtil.ntoc( AV39Barcolnum1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUM3", GXutil.ltrim( localUtil.ntoc( AV40Barcolnum3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD1", GXutil.ltrim( localUtil.ntoc( AV42Clicod1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD3", GXutil.ltrim( localUtil.ntoc( AV43Clicod3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINTCOD1", GXutil.ltrim( localUtil.ntoc( AV46Intcod1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINTCOD3", GXutil.ltrim( localUtil.ntoc( AV47Intcod3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPARTCOD1", GXutil.ltrim( localUtil.ntoc( AV48TipArtCod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPARTCOD3", GXutil.ltrim( localUtil.ntoc( AV49TipArtCod3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPCOLCOD1", GXutil.ltrim( localUtil.ntoc( AV50Tipcolcod1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPCOLCOD3", GXutil.ltrim( localUtil.ntoc( AV51Tipcolcod3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONSMANUALES", GXutil.ltrim( localUtil.ntoc( AV65ConsManuales, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vANALISISCOSTESHISTORICOSRECETAS_SDTS", AV13AnalisisCostesHistoricosRecetas_SDTs);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vANALISISCOSTESHISTORICOSRECETAS_SDTS", AV13AnalisisCostesHistoricosRecetas_SDTs);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vANALISISCOSTESHISTORICOSRECETAS_SDTS", getSecureSignedToken( sPrefix, AV13AnalisisCostesHistoricosRecetas_SDTs));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_HREBARKGM", GXutil.ltrim( localUtil.ntoc( AV54Tot_HreBarKgm, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HREBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV54Tot_HreBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_COSTEI", GXutil.ltrim( localUtil.ntoc( AV56Tot_Costei, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_COSTEI", getSecureSignedToken( sPrefix, localUtil.format( AV56Tot_Costei, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_COSTET", GXutil.ltrim( localUtil.ntoc( AV58Tot_CosteT, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_COSTET", getSecureSignedToken( sPrefix, localUtil.format( AV58Tot_CosteT, "ZZZZZZ9.99")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
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

   public void renderHtmlCloseForm1MJ2( )
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
      return "FormulacionTinte.AnalisisCostesHistoricosRecetas_SDT_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Analisis Costes Historicos Recetas_SDT_WC", "") ;
   }

   public void wb1MJ0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.formulaciontinte.analisiscosteshistoricosrecetas_sdt_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
            httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\AnalisisCostesHistoricosRecetas_SDT_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\AnalisisCostesHistoricosRecetas_SDT_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninformeproductos_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "Informe Productos", ""), bttBtninformeproductos_Jsonclick, 5, httpContext.getMessage( "Informe Productos", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOINFORMEPRODUCTOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\AnalisisCostesHistoricosRecetas_SDT_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\AnalisisCostesHistoricosRecetas_SDT_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_1MJ2( true) ;
      }
      else
      {
         wb_table1_25_1MJ2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_1MJ2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* User Defined Control */
         ucBarradeprogreso.render(context, "gxprogressindicator", Barradeprogreso_Internalname, sPrefix+"BARRADEPROGRESOContainer");
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
         startgridcontrol45( ) ;
      }
      if ( wbEnd == 45 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_45 = (int)(nGXsfl_45_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV70GXV1 = nGXsfl_45_idx ;
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
         wb_table2_82_1MJ2( true) ;
      }
      else
      {
         wb_table2_82_1MJ2( false) ;
      }
      return  ;
   }

   public void wb_table2_82_1MJ2e( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divCell_grid_dwc_Internalname, 1, 0, "px", 0, "px", divCell_grid_dwc_Class, "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0129"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0129"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_45_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0129"+"");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV104Pgmname), GXutil.rtrim( localUtil.format( AV104Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\AnalisisCostesHistoricosRecetas_SDT_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
      if ( wbEnd == 45 )
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
               AV70GXV1 = nGXsfl_45_idx ;
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

   public void start1MJ2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Analisis Costes Historicos Recetas_SDT_WC", ""), (short)(0)) ;
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
            strup1MJ0( ) ;
         }
      }
   }

   public void ws1MJ2( )
   {
      start1MJ2( ) ;
      evt1MJ2( ) ;
   }

   public void evt1MJ2( )
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
                              strup1MJ0( ) ;
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
                              strup1MJ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111MJ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1MJ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121MJ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1MJ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131MJ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1MJ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141MJ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINFORMEPRODUCTOS'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1MJ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoInformeProductos' */
                                 e151MJ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1MJ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e161MJ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1MJ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e171MJ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1MJ0( ) ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 25), "VDETAILWEBCOMPONENT.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 25), "VDETAILWEBCOMPONENT.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1MJ0( ) ;
                           }
                           nGXsfl_45_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_452( ) ;
                           AV70GXV1 = (int)(nGXsfl_45_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV13AnalisisCostesHistoricosRecetas_SDTs.size() >= AV70GXV1 ) && ( AV70GXV1 > 0 ) )
                           {
                              AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)) );
                              AV60DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV60DetailWebComponent);
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
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e181MJ2 ();
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
                                       e191MJ2 ();
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
                                       e201MJ2 ();
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
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e211MJ2 ();
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
                                    strup1MJ0( ) ;
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
                     if ( nCmpId == 129 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( sPrefix+"W0129") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess(sPrefix+"W0129", "", sEvt);
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

   public void we1MJ2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1MJ2( ) ;
         }
      }
   }

   public void pa1MJ2( )
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
      subsflControlProps_452( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         sendrow_452( ) ;
         nGXsfl_45_idx = ((subGrid_Islastpage==1)&&(nGXsfl_45_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 byte AV23ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ,
                                 String AV104Pgmname ,
                                 String AV12FilterFullText ,
                                 String AV28Emprcod ,
                                 String AV29HreRacab ,
                                 java.util.Date AV44Fec1 ,
                                 java.util.Date AV45Fec2 ,
                                 byte AV41Calculo ,
                                 int AV30barcod ,
                                 byte AV31barcodreo ,
                                 String AV32barcodpar ,
                                 String AV33ARtcod1 ,
                                 String AV34ARtcod3 ,
                                 String AV37Barcolnom1 ,
                                 String AV38Barcolnom3 ,
                                 int AV39Barcolnum1 ,
                                 int AV40Barcolnum3 ,
                                 int AV42Clicod1 ,
                                 int AV43Clicod3 ,
                                 byte AV46Intcod1 ,
                                 byte AV47Intcod3 ,
                                 short AV48TipArtCod1 ,
                                 short AV49TipArtCod3 ,
                                 byte AV50Tipcolcod1 ,
                                 byte AV51Tipcolcod3 ,
                                 byte AV65ConsManuales ,
                                 GXBaseCollection<app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT> AV13AnalisisCostesHistoricosRecetas_SDTs ,
                                 java.math.BigDecimal AV54Tot_HreBarKgm ,
                                 java.math.BigDecimal AV56Tot_Costei ,
                                 java.math.BigDecimal AV58Tot_CosteT ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e191MJ2 ();
      GRID_nCurrentRecord = 0 ;
      rf1MJ2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"AnalisisCostesHistoricosRecetas_SDT_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV104Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\analisiscosteshistoricosrecetas_sdt_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf1MJ2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV104Pgmname = "FormulacionTinte.AnalisisCostesHistoricosRecetas_SDT_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104Pgmname", AV104Pgmname);
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__toa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__toa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__toa_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__marca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__marca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__marca_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__rb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__rb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__rb_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__costei_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__costei_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__costei_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__costet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__costet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__costet_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__dif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__dif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__dif_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__porc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__porc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__porc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__costek_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__costek_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__costek_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavTotvalue_hrebarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_hrebarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_hrebarkgm_Enabled), 5, 0), true);
      edtavTotvalue_costei_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_costei_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_costei_Enabled), 5, 0), true);
      edtavTotvalue_costet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_costet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_costet_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1MJ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e191MJ2 ();
      nGXsfl_45_idx = 1 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_452( ) ;
      bGXsfl_45_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
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
         subsflControlProps_452( ) ;
         e201MJ2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_45_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e201MJ2 ();
         }
         wbEnd = (short)(45) ;
         wb1MJ0( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1MJ2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vANALISISCOSTESHISTORICOSRECETAS_SDTS", AV13AnalisisCostesHistoricosRecetas_SDTs);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vANALISISCOSTESHISTORICOSRECETAS_SDTS", AV13AnalisisCostesHistoricosRecetas_SDTs);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vANALISISCOSTESHISTORICOSRECETAS_SDTS", getSecureSignedToken( sPrefix, AV13AnalisisCostesHistoricosRecetas_SDTs));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_HREBARKGM", GXutil.ltrim( localUtil.ntoc( AV54Tot_HreBarKgm, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HREBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV54Tot_HreBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_COSTEI", GXutil.ltrim( localUtil.ntoc( AV56Tot_Costei, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_COSTEI", getSecureSignedToken( sPrefix, localUtil.format( AV56Tot_Costei, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_COSTET", GXutil.ltrim( localUtil.ntoc( AV58Tot_CosteT, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_COSTET", getSecureSignedToken( sPrefix, localUtil.format( AV58Tot_CosteT, "ZZZZZZ9.99")));
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
      return AV13AnalisisCostesHistoricosRecetas_SDTs.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV104Pgmname, AV12FilterFullText, AV28Emprcod, AV29HreRacab, AV44Fec1, AV45Fec2, AV41Calculo, AV30barcod, AV31barcodreo, AV32barcodpar, AV33ARtcod1, AV34ARtcod3, AV37Barcolnom1, AV38Barcolnom3, AV39Barcolnum1, AV40Barcolnum3, AV42Clicod1, AV43Clicod3, AV46Intcod1, AV47Intcod3, AV48TipArtCod1, AV49TipArtCod3, AV50Tipcolcod1, AV51Tipcolcod3, AV65ConsManuales, AV13AnalisisCostesHistoricosRecetas_SDTs, AV54Tot_HreBarKgm, AV56Tot_Costei, AV58Tot_CosteT, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV104Pgmname, AV12FilterFullText, AV28Emprcod, AV29HreRacab, AV44Fec1, AV45Fec2, AV41Calculo, AV30barcod, AV31barcodreo, AV32barcodpar, AV33ARtcod1, AV34ARtcod3, AV37Barcolnom1, AV38Barcolnom3, AV39Barcolnum1, AV40Barcolnum3, AV42Clicod1, AV43Clicod3, AV46Intcod1, AV47Intcod3, AV48TipArtCod1, AV49TipArtCod3, AV50Tipcolcod1, AV51Tipcolcod3, AV65ConsManuales, AV13AnalisisCostesHistoricosRecetas_SDTs, AV54Tot_HreBarKgm, AV56Tot_Costei, AV58Tot_CosteT, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV104Pgmname, AV12FilterFullText, AV28Emprcod, AV29HreRacab, AV44Fec1, AV45Fec2, AV41Calculo, AV30barcod, AV31barcodreo, AV32barcodpar, AV33ARtcod1, AV34ARtcod3, AV37Barcolnom1, AV38Barcolnom3, AV39Barcolnum1, AV40Barcolnum3, AV42Clicod1, AV43Clicod3, AV46Intcod1, AV47Intcod3, AV48TipArtCod1, AV49TipArtCod3, AV50Tipcolcod1, AV51Tipcolcod3, AV65ConsManuales, AV13AnalisisCostesHistoricosRecetas_SDTs, AV54Tot_HreBarKgm, AV56Tot_Costei, AV58Tot_CosteT, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV104Pgmname, AV12FilterFullText, AV28Emprcod, AV29HreRacab, AV44Fec1, AV45Fec2, AV41Calculo, AV30barcod, AV31barcodreo, AV32barcodpar, AV33ARtcod1, AV34ARtcod3, AV37Barcolnom1, AV38Barcolnom3, AV39Barcolnum1, AV40Barcolnum3, AV42Clicod1, AV43Clicod3, AV46Intcod1, AV47Intcod3, AV48TipArtCod1, AV49TipArtCod3, AV50Tipcolcod1, AV51Tipcolcod3, AV65ConsManuales, AV13AnalisisCostesHistoricosRecetas_SDTs, AV54Tot_HreBarKgm, AV56Tot_Costei, AV58Tot_CosteT, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV104Pgmname, AV12FilterFullText, AV28Emprcod, AV29HreRacab, AV44Fec1, AV45Fec2, AV41Calculo, AV30barcod, AV31barcodreo, AV32barcodpar, AV33ARtcod1, AV34ARtcod3, AV37Barcolnom1, AV38Barcolnom3, AV39Barcolnum1, AV40Barcolnum3, AV42Clicod1, AV43Clicod3, AV46Intcod1, AV47Intcod3, AV48TipArtCod1, AV49TipArtCod3, AV50Tipcolcod1, AV51Tipcolcod3, AV65ConsManuales, AV13AnalisisCostesHistoricosRecetas_SDTs, AV54Tot_HreBarKgm, AV56Tot_Costei, AV58Tot_CosteT, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV104Pgmname = "FormulacionTinte.AnalisisCostesHistoricosRecetas_SDT_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104Pgmname", AV104Pgmname);
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__toa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__toa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__toa_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__marca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__marca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__marca_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__rb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__rb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__rb_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__costei_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__costei_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__costei_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__costet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__costet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__costet_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__dif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__dif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__dif_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__porc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__porc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__porc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__costek_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__costek_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__costek_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavTotvalue_hrebarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_hrebarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_hrebarkgm_Enabled), 5, 0), true);
      edtavTotvalue_costei_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_costei_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_costei_Enabled), 5, 0), true);
      edtavTotvalue_costet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_costet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_costet_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1MJ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e181MJ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Analisiscosteshistoricosrecetas_sdts"), AV13AnalisisCostesHistoricosRecetas_SDTs);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV21ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV24DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV18ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vANALISISCOSTESHISTORICOSRECETAS_SDTS"), AV13AnalisisCostesHistoricosRecetas_SDTs);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV26GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV27GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV28Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV28Emprcod") ;
         wcpOAV29HreRacab = httpContext.cgiGet( sPrefix+"wcpOAV29HreRacab") ;
         wcpOAV44Fec1 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV44Fec1"), 0) ;
         wcpOAV45Fec2 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV45Fec2"), 0) ;
         wcpOAV41Calculo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV41Calculo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV30barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV30barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV31barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV31barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV32barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV32barcodpar") ;
         wcpOAV33ARtcod1 = httpContext.cgiGet( sPrefix+"wcpOAV33ARtcod1") ;
         wcpOAV34ARtcod3 = httpContext.cgiGet( sPrefix+"wcpOAV34ARtcod3") ;
         wcpOAV37Barcolnom1 = httpContext.cgiGet( sPrefix+"wcpOAV37Barcolnom1") ;
         wcpOAV38Barcolnom3 = httpContext.cgiGet( sPrefix+"wcpOAV38Barcolnom3") ;
         wcpOAV39Barcolnum1 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV39Barcolnum1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV40Barcolnum3 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV40Barcolnum3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV42Clicod1 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV42Clicod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV43Clicod3 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV43Clicod3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV46Intcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV46Intcod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV47Intcod3 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV47Intcod3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV48TipArtCod1 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV48TipArtCod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV49TipArtCod3 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV49TipArtCod3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV50Tipcolcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV50Tipcolcod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV51Tipcolcod3 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV51Tipcolcod3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV65ConsManuales = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV65ConsManuales"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_45_fel_idx = 0 ;
         while ( nGXsfl_45_fel_idx < nRC_GXsfl_45 )
         {
            nGXsfl_45_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_45_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_45_fel_idx+1) ;
            sGXsfl_45_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_452( ) ;
            AV70GXV1 = (int)(nGXsfl_45_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV13AnalisisCostesHistoricosRecetas_SDTs.size() >= AV70GXV1 ) && ( AV70GXV1 > 0 ) )
            {
               AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)) );
               AV60DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
            }
         }
         if ( nGXsfl_45_fel_idx == 0 )
         {
            nGXsfl_45_idx = 1 ;
            sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_452( ) ;
         }
         nGXsfl_45_fel_idx = 1 ;
         /* Read variables values. */
         AV12FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
         AV55TotValue_HreBarKgm = httpContext.cgiGet( edtavTotvalue_hrebarkgm_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TotValue_HreBarKgm", AV55TotValue_HreBarKgm);
         AV57TotValue_Costei = httpContext.cgiGet( edtavTotvalue_costei_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TotValue_Costei", AV57TotValue_Costei);
         AV59TotValue_CosteT = httpContext.cgiGet( edtavTotvalue_costet_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TotValue_CosteT", AV59TotValue_CosteT);
         AV104Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104Pgmname", AV104Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"AnalisisCostesHistoricosRecetas_SDT_WC");
         AV104Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104Pgmname", AV104Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV104Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("formulaciontinte\\analisiscosteshistoricosrecetas_sdt_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e181MJ2 ();
      if (returnInSub) return;
   }

   public void e181MJ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV105Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV105Station = GXt_char1 ;
      GXv_char2[0] = AV28Emprcod ;
      GXv_char3[0] = AV106Emprnom ;
      GXv_char4[0] = AV107Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV105Station, GXv_char2, GXv_char3, GXv_char4) ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.AV28Emprcod = GXv_char2[0] ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.AV106Emprnom = GXv_char3[0] ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.AV107Usurcod = GXv_char4[0] ;
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
      GXt_objcol_SdtAnalisisCostesHistoricosRecetas_SDT7 = AV13AnalisisCostesHistoricosRecetas_SDTs ;
      GXv_objcol_SdtAnalisisCostesHistoricosRecetas_SDT8[0] = GXt_objcol_SdtAnalisisCostesHistoricosRecetas_SDT7 ;
      new app.formulaciontinte.analisiscosteshistoricosrecetas_dp(remoteHandle, context).execute( AV28Emprcod, AV29HreRacab, AV44Fec1, AV45Fec2, AV41Calculo, AV30barcod, AV31barcodreo, AV32barcodpar, AV33ARtcod1, AV34ARtcod3, AV37Barcolnom1, AV38Barcolnom3, AV39Barcolnum1, AV40Barcolnum3, AV42Clicod1, AV43Clicod3, AV46Intcod1, AV47Intcod3, AV48TipArtCod1, AV49TipArtCod3, AV50Tipcolcod1, AV51Tipcolcod3, GXv_objcol_SdtAnalisisCostesHistoricosRecetas_SDT8) ;
      GXt_objcol_SdtAnalisisCostesHistoricosRecetas_SDT7 = GXv_objcol_SdtAnalisisCostesHistoricosRecetas_SDT8[0] ;
      AV13AnalisisCostesHistoricosRecetas_SDTs = GXt_objcol_SdtAnalisisCostesHistoricosRecetas_SDT7 ;
      gx_BV45 = true ;
      AV13AnalisisCostesHistoricosRecetas_SDTs.sort(httpContext.getMessage( "ItemOrderSDT,TablaA", ""));
      gx_BV45 = true ;
   }

   public void e191MJ2( )
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
      if ( GXutil.strcmp(AV20Session.getValue("FormulacionTinte.AnalisisCostesHistoricosRecetas_SDT_WCColumnsSelector"), "") != 0 )
      {
         AV16ColumnsSelectorXML = AV20Session.getValue("FormulacionTinte.AnalisisCostesHistoricosRecetas_SDT_WCColumnsSelector") ;
         AV18ColumnsSelector.fromxml(AV16ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S142 ();
         if (returnInSub) return;
      }
      edtavAnalisiscosteshistoricosrecetas_sdts__toa_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__toa_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__toa_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__marca_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__marca_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__marca_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__rb_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__rb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__rb_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__costei_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__costei_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__costei_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__costet_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__costet_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__costet_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__dif_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__dif_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__dif_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__porc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__porc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__porc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__costek_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__costek_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__costek_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S162 ();
      if (returnInSub) return;
      AV26GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridCurrentPage), 10, 0));
      AV27GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      edtavDetailwebcomponent_Columnheaderclass = "WWIconActionColumn WCD_ActionColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Columnheaderclass", edtavDetailwebcomponent_Columnheaderclass, !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__toa_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__toa_Internalname, "Columnheaderclass", edtavAnalisiscosteshistoricosrecetas_sdts__toa_Columnheaderclass, !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Internalname, "Columnheaderclass", edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Columnheaderclass, !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__marca_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__marca_Internalname, "Columnheaderclass", edtavAnalisiscosteshistoricosrecetas_sdts__marca_Columnheaderclass, !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Internalname, "Columnheaderclass", edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Columnheaderclass, !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Internalname, "Columnheaderclass", edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Columnheaderclass, !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Internalname, "Columnheaderclass", edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Columnheaderclass, !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Internalname, "Columnheaderclass", edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Columnheaderclass, !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Internalname, "Columnheaderclass", edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Columnheaderclass, !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Internalname, "Columnheaderclass", edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Columnheaderclass, !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__rb_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__rb_Internalname, "Columnheaderclass", edtavAnalisiscosteshistoricosrecetas_sdts__rb_Columnheaderclass, !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__costei_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__costei_Internalname, "Columnheaderclass", edtavAnalisiscosteshistoricosrecetas_sdts__costei_Columnheaderclass, !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__costet_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__costet_Internalname, "Columnheaderclass", edtavAnalisiscosteshistoricosrecetas_sdts__costet_Columnheaderclass, !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__dif_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__dif_Internalname, "Columnheaderclass", edtavAnalisiscosteshistoricosrecetas_sdts__dif_Columnheaderclass, !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__porc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__porc_Internalname, "Columnheaderclass", edtavAnalisiscosteshistoricosrecetas_sdts__porc_Columnheaderclass, !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__costek_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__costek_Internalname, "Columnheaderclass", edtavAnalisiscosteshistoricosrecetas_sdts__costek_Columnheaderclass, !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Internalname, "Columnheaderclass", edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Columnheaderclass, !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Internalname, "Columnheaderclass", edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Columnheaderclass, !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Internalname, "Columnheaderclass", edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Columnheaderclass, !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Internalname, "Columnheaderclass", edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Columnheaderclass, !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Internalname, "Columnheaderclass", edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Columnheaderclass, !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Internalname, "Columnheaderclass", edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Columnheaderclass, !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Internalname, "Columnheaderclass", edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Columnheaderclass, !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Internalname, "Columnheaderclass", edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Columnheaderclass, !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Internalname, "Columnheaderclass", edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Columnheaderclass, !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Internalname, "Columnheaderclass", edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Columnheaderclass, !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Internalname, "Columnheaderclass", edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Columnheaderclass, !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Internalname, "Columnheaderclass", edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Columnheaderclass, !bGXsfl_45_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Internalname, "Columnheaderclass", edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Columnheaderclass, !bGXsfl_45_Refreshing);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e121MJ2( )
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

   public void e131MJ2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e201MJ2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV70GXV1 = 1 ;
      while ( AV70GXV1 <= AV13AnalisisCostesHistoricosRecetas_SDTs.size() )
      {
         AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)) );
         AV60DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV60DetailWebComponent);
         edtavDetailwebcomponent_Columnclass = ((((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()==1) ? "WWIconActionColumn WCD_ActionColumn WWColumnSuccess WWColumnSuccessFirstColumn" : "WWIconActionColumn WCD_ActionColumn") ;
         edtavAnalisiscosteshistoricosrecetas_sdts__toa_Columnclass = ((((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Columnclass = ((((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavAnalisiscosteshistoricosrecetas_sdts__marca_Columnclass = ((((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Columnclass = ((((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Columnclass = ((((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Columnclass = ((((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Columnclass = ((((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Columnclass = ((((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Columnclass = ((((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavAnalisiscosteshistoricosrecetas_sdts__rb_Columnclass = ((((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavAnalisiscosteshistoricosrecetas_sdts__costei_Columnclass = ((((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavAnalisiscosteshistoricosrecetas_sdts__costet_Columnclass = ((((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavAnalisiscosteshistoricosrecetas_sdts__dif_Columnclass = ((((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavAnalisiscosteshistoricosrecetas_sdts__porc_Columnclass = ((((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavAnalisiscosteshistoricosrecetas_sdts__costek_Columnclass = ((((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Columnclass = ((((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Columnclass = ((((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Columnclass = ((((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Columnclass = ((((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Columnclass = ((((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Columnclass = ((((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Columnclass = ((((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Columnclass = ((((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Columnclass = ((((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Columnclass = ((((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Columnclass = ((((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Columnclass = ((((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Columnclass = ((((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(45) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_452( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_45_Refreshing )
         {
            httpContext.doAjaxLoad(45, GridRow);
         }
         AV70GXV1 = (int)(AV70GXV1+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e141MJ2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV16ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV18ColumnsSelector.fromJSonString(AV16ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.AnalisisCostesHistoricosRecetas_SDT_WCColumnsSelector", ((GXutil.strcmp("", AV16ColumnsSelectorXML)==0) ? "" : AV18ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e111MJ2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S182 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S132 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.AnalisisCostesHistoricosRecetas_SDT_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV104Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.AnalisisCostesHistoricosRecetas_SDT_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV22ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "FormulacionTinte.AnalisisCostesHistoricosRecetas_SDT_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         analisiscosteshistoricosrecetas_sdt_wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV22ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV22ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S182 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV104Pgmname+"GridState", AV22ManageFiltersXml) ;
            AV10GridState.fromxml(AV22ManageFiltersXml, null, null);
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S192 ();
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

   public void e151MJ2( )
   {
      /* 'DoInformeProductos' Routine */
      returnInSub = false ;
      AV66ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV66ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV66ProgressIndicator.setgxTv_SdtProgress_Value( 55 );
      AV66ProgressIndicator.showwithtitle(httpContext.getMessage( "Validando Operacion", ""));
      AV66ProgressIndicator.show();
      AV66ProgressIndicator.setgxTv_SdtProgress_Value( 85 );
      GXv_char4[0] = AV28Emprcod ;
      GXv_char3[0] = AV29HreRacab ;
      GXv_date10[0] = AV44Fec1 ;
      GXv_date11[0] = AV45Fec2 ;
      GXv_char2[0] = AV33ARtcod1 ;
      GXv_char12[0] = AV34ARtcod3 ;
      GXv_char13[0] = AV37Barcolnom1 ;
      GXv_char14[0] = AV38Barcolnom3 ;
      GXv_int15[0] = AV39Barcolnum1 ;
      GXv_int16[0] = AV40Barcolnum3 ;
      GXv_int17[0] = AV42Clicod1 ;
      GXv_int18[0] = AV43Clicod3 ;
      GXv_int19[0] = AV46Intcod1 ;
      GXv_int20[0] = AV47Intcod3 ;
      GXv_int21[0] = AV48TipArtCod1 ;
      GXv_int22[0] = AV49TipArtCod3 ;
      GXv_int23[0] = AV50Tipcolcod1 ;
      GXv_int24[0] = AV51Tipcolcod3 ;
      GXv_int25[0] = AV30barcod ;
      GXv_int26[0] = AV31barcodreo ;
      GXv_char27[0] = AV32barcodpar ;
      GXv_int28[0] = AV65ConsManuales ;
      GXv_char29[0] = AV14ExcelFilename ;
      GXv_char30[0] = AV15ErrorMessage ;
      new app.informeproductosconsumos(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date10, GXv_date11, GXv_char2, GXv_char12, GXv_char13, GXv_char14, GXv_int15, GXv_int16, GXv_int17, GXv_int18, GXv_int19, GXv_int20, GXv_int21, GXv_int22, GXv_int23, GXv_int24, GXv_int25, GXv_int26, GXv_char27, GXv_int28, GXv_char29, GXv_char30) ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.AV28Emprcod = GXv_char4[0] ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.AV29HreRacab = GXv_char3[0] ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.AV44Fec1 = GXv_date10[0] ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.AV45Fec2 = GXv_date11[0] ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.AV33ARtcod1 = GXv_char2[0] ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.AV34ARtcod3 = GXv_char12[0] ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.AV37Barcolnom1 = GXv_char13[0] ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.AV38Barcolnom3 = GXv_char14[0] ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.AV39Barcolnum1 = GXv_int15[0] ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.AV40Barcolnum3 = GXv_int16[0] ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.AV42Clicod1 = GXv_int17[0] ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.AV43Clicod3 = GXv_int18[0] ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.AV46Intcod1 = GXv_int19[0] ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.AV47Intcod3 = GXv_int20[0] ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.AV48TipArtCod1 = GXv_int21[0] ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.AV49TipArtCod3 = GXv_int22[0] ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.AV50Tipcolcod1 = GXv_int23[0] ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.AV51Tipcolcod3 = GXv_int24[0] ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.AV30barcod = GXv_int25[0] ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.AV31barcodreo = GXv_int26[0] ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.AV32barcodpar = GXv_char27[0] ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.AV65ConsManuales = GXv_int28[0] ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.AV14ExcelFilename = GXv_char29[0] ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.AV15ErrorMessage = GXv_char30[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29HreRacab", AV29HreRacab);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Fec1", localUtil.format(AV44Fec1, "99/99/99"));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Fec2", localUtil.format(AV45Fec2, "99/99/99"));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33ARtcod1", AV33ARtcod1);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34ARtcod3", AV34ARtcod3);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Barcolnom1", AV37Barcolnom1);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Barcolnom3", AV38Barcolnom3);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Barcolnum1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39Barcolnum1), 6, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Barcolnum3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Barcolnum3), 6, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Clicod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Clicod1), 6, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Clicod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43Clicod3), 6, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46Intcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46Intcod1), 2, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Intcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Intcod3), 2, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TipArtCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TipArtCod1), 4, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TipArtCod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TipArtCod3), 4, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50Tipcolcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Tipcolcod1), 2, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Tipcolcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51Tipcolcod3), 2, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30barcod), 8, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31barcodreo", GXutil.str( AV31barcodreo, 1, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32barcodpar", AV32barcodpar);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65ConsManuales", GXutil.str( AV65ConsManuales, 1, 0));
      AV66ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV66ProgressIndicator.hide();
      if ( GXutil.strcmp(AV14ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV14ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV15ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV66ProgressIndicator", AV66ProgressIndicator);
   }

   public void e161MJ2( )
   {
      AV70GXV1 = (int)(nGXsfl_45_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV70GXV1 > 0 ) && ( AV13AnalisisCostesHistoricosRecetas_SDTs.size() >= AV70GXV1 ) )
      {
         AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)) );
      }
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV52AnalisisCostesHistoricosRecetas_ToJson = AV13AnalisisCostesHistoricosRecetas_SDTs.toJSonString(false) ;
      AV67websession.setValue("&AnalisisCostesHistoricosRecetas_ToJson", AV52AnalisisCostesHistoricosRecetas_ToJson);
      GXv_char30[0] = AV14ExcelFilename ;
      GXv_char29[0] = AV15ErrorMessage ;
      new app.formulaciontinte.analisiscosteshistoricosrecetas_sdt_wcexport(remoteHandle, context).execute( GXv_char30, GXv_char29) ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.AV14ExcelFilename = GXv_char30[0] ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.AV15ErrorMessage = GXv_char29[0] ;
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

   public void e171MJ2( )
   {
      AV70GXV1 = (int)(nGXsfl_45_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV70GXV1 > 0 ) && ( AV13AnalisisCostesHistoricosRecetas_SDTs.size() >= AV70GXV1 ) )
      {
         AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)) );
      }
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV52AnalisisCostesHistoricosRecetas_ToJson = AV13AnalisisCostesHistoricosRecetas_SDTs.toJSonString(false) ;
      AV67websession.setValue("&AnalisisCostesHistoricosRecetas_ToJson", AV52AnalisisCostesHistoricosRecetas_ToJson);
      callWebObject(formatLink("app.formulaciontinte.analisiscosteshistoricosrecetas_sdt_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void e211MJ2( )
   {
      AV70GXV1 = (int)(nGXsfl_45_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV70GXV1 > 0 ) && ( AV13AnalisisCostesHistoricosRecetas_SDTs.size() >= AV70GXV1 ) )
      {
         AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)) );
      }
      /* Detailwebcomponent_Click Routine */
      returnInSub = false ;
      AV61Hrebarcod = ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarcod() ;
      AV62Hrebarreo = ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarreo() ;
      AV64Hrebarpar = ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarpar() ;
      AV63Hremaqcod = ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem())).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hremaqcod() ;
      /* Object Property */
      if ( GXutil.len( sPrefix) == 0 )
      {
         bDynCreated_Grid_dwc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Grid_dwc_Component), GXutil.lower( "FormulacionTinte.WCHistoricoRecetas")) != 0 )
      {
         WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app.formulaciontinte.wchistoricorecetas_impl", remoteHandle, context);
         WebComp_Grid_dwc_Component = "FormulacionTinte.WCHistoricoRecetas" ;
      }
      if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
      {
         WebComp_Grid_dwc.setjustcreated();
         WebComp_Grid_dwc.componentprepare(new Object[] {sPrefix+"W0129","",AV28Emprcod,Integer.valueOf(AV61Hrebarcod),Byte.valueOf(AV62Hrebarreo),AV64Hrebarpar,AV63Hremaqcod});
         WebComp_Grid_dwc.componentbind(new Object[] {"","","","",""});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Grid_dwc )
      {
         httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0129"+"");
         WebComp_Grid_dwc.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /*  Sending Event outputs  */
   }

   public void S162( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
   }

   public void S142( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV18ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector31[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector31, "AnalisisCostesHistoricosRecetas_SDTs__ToA", "", "Tipo", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector31[0] ;
      GXv_SdtWWPColumnsSelector31[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector31, "AnalisisCostesHistoricosRecetas_SDTs__HreFectin", "", "Fecha Cierre", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector31[0] ;
      GXv_SdtWWPColumnsSelector31[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector31, "AnalisisCostesHistoricosRecetas_SDTs__Marca", "", "", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector31[0] ;
      GXv_SdtWWPColumnsSelector31[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector31, "AnalisisCostesHistoricosRecetas_SDTs__Hdr", "", "Hdr", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector31[0] ;
      GXv_SdtWWPColumnsSelector31[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector31, "AnalisisCostesHistoricosRecetas_SDTs__BarAgrest", "", "A?", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector31[0] ;
      GXv_SdtWWPColumnsSelector31[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector31, "AnalisisCostesHistoricosRecetas_SDTs__HreBarKgm", "", "Kilos", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector31[0] ;
      GXv_SdtWWPColumnsSelector31[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector31, "AnalisisCostesHistoricosRecetas_SDTs__HreTotKgm", "", "Kilos Tot.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector31[0] ;
      GXv_SdtWWPColumnsSelector31[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector31, "AnalisisCostesHistoricosRecetas_SDTs__HreMaqcod", "", "Maquina", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector31[0] ;
      GXv_SdtWWPColumnsSelector31[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector31, "AnalisisCostesHistoricosRecetas_SDTs__HreVolPrd", "", "Volumen", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector31[0] ;
      GXv_SdtWWPColumnsSelector31[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector31, "AnalisisCostesHistoricosRecetas_SDTs__Rb", "", "Rb", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector31[0] ;
      GXv_SdtWWPColumnsSelector31[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector31, "AnalisisCostesHistoricosRecetas_SDTs__Costei", "", "Coste Ini.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector31[0] ;
      GXv_SdtWWPColumnsSelector31[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector31, "AnalisisCostesHistoricosRecetas_SDTs__CosteT", "", "Coste Tot.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector31[0] ;
      GXv_SdtWWPColumnsSelector31[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector31, "AnalisisCostesHistoricosRecetas_SDTs__Dif", "", "Dif", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector31[0] ;
      GXv_SdtWWPColumnsSelector31[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector31, "AnalisisCostesHistoricosRecetas_SDTs__Porc", "", "%", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector31[0] ;
      GXv_SdtWWPColumnsSelector31[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector31, "AnalisisCostesHistoricosRecetas_SDTs__Costek", "", "Coste kg", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector31[0] ;
      GXv_SdtWWPColumnsSelector31[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector31, "AnalisisCostesHistoricosRecetas_SDTs__Clicod", "", "Cliente", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector31[0] ;
      GXv_SdtWWPColumnsSelector31[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector31, "AnalisisCostesHistoricosRecetas_SDTs__CliNom", "", "Nombre", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector31[0] ;
      GXv_SdtWWPColumnsSelector31[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector31, "AnalisisCostesHistoricosRecetas_SDTs__Hrebarser", "", "Articulo", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector31[0] ;
      GXv_SdtWWPColumnsSelector31[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector31, "AnalisisCostesHistoricosRecetas_SDTs__HreBarDsc", "", "Descripcion", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector31[0] ;
      GXv_SdtWWPColumnsSelector31[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector31, "AnalisisCostesHistoricosRecetas_SDTs__HreTipArtd", "", "Tipo de Articulo", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector31[0] ;
      GXv_SdtWWPColumnsSelector31[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector31, "AnalisisCostesHistoricosRecetas_SDTs__HreColnom", "", "Color", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector31[0] ;
      GXv_SdtWWPColumnsSelector31[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector31, "AnalisisCostesHistoricosRecetas_SDTs__HreColNum", "", "Numero", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector31[0] ;
      GXv_SdtWWPColumnsSelector31[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector31, "AnalisisCostesHistoricosRecetas_SDTs__HreTipColN", "", "Tc", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector31[0] ;
      GXv_SdtWWPColumnsSelector31[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector31, "AnalisisCostesHistoricosRecetas_SDTs__HreIntDsc", "", "Intensidad", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector31[0] ;
      GXv_SdtWWPColumnsSelector31[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector31, "AnalisisCostesHistoricosRecetas_SDTs__EncCli", "", "Pedido Cliente", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector31[0] ;
      GXv_SdtWWPColumnsSelector31[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector31, "AnalisisCostesHistoricosRecetas_SDTs__HreProCod", "", "Proceso", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector31[0] ;
      GXv_SdtWWPColumnsSelector31[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector31, "AnalisisCostesHistoricosRecetas_SDTs__HreProDsc", "", "Descripcion", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector31[0] ;
      GXv_SdtWWPColumnsSelector31[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector31, "AnalisisCostesHistoricosRecetas_SDTs__PrvDsc", "", "Tipo", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector31[0] ;
      GXt_char1 = AV17UserCustomValue ;
      GXv_char30[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.AnalisisCostesHistoricosRecetas_SDT_WCColumnsSelector", GXv_char30) ;
      analisiscosteshistoricosrecetas_sdt_wc_impl.this.GXt_char1 = GXv_char30[0] ;
      AV17UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV17UserCustomValue)==0) ) )
      {
         AV19ColumnsSelectorAux.fromxml(AV17UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector31[0] = AV19ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector32[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector31, GXv_SdtWWPColumnsSelector32) ;
         AV19ColumnsSelectorAux = GXv_SdtWWPColumnsSelector31[0] ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector32[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item33 = AV21ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item34[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item33 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "FormulacionTinte.AnalisisCostesHistoricosRecetas_SDT_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item34) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item33 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item34[0] ;
      AV21ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item33 ;
   }

   public void S182( )
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
      if ( GXutil.strcmp(AV20Session.getValue(AV104Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV104Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV20Session.getValue(AV104Pgmname+"GridState"), null, null);
      }
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S192 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S192( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV108GXV35 = 1 ;
      while ( AV108GXV35 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV108GXV35));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
         }
         AV108GXV35 = (int)(AV108GXV35+1) ;
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV20Session.getValue(AV104Pgmname+"GridState"), null, null);
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV12FilterFullText)==0), (short)(0), AV12FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      if ( ! (GXutil.strcmp("", AV28Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV28Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV29HreRacab)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HRERACAB" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV29HreRacab );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV44Fec1)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FEC1" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV44Fec1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV45Fec2)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FEC2" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV45Fec2, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV41Calculo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CALCULO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV41Calculo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV30barcod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV30barcod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV31barcodreo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV31barcodreo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV32barcodpar)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV32barcodpar );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV33ARtcod1)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ARTCOD1" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV33ARtcod1 );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV34ARtcod3)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ARTCOD3" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV34ARtcod3 );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV37Barcolnom1)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNOM1" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV37Barcolnom1 );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV38Barcolnom3)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNOM3" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV38Barcolnom3 );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV39Barcolnum1) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNUM1" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV39Barcolnum1, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV40Barcolnum3) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNUM3" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV40Barcolnum3, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV42Clicod1) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD1" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV42Clicod1, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV43Clicod3) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD3" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV43Clicod3, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV46Intcod1) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INTCOD1" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV46Intcod1, 2, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV47Intcod3) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INTCOD3" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV47Intcod3, 2, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV48TipArtCod1) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPARTCOD1" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV48TipArtCod1, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV49TipArtCod3) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPARTCOD3" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV49TipArtCod3, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV50Tipcolcod1) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPCOLCOD1" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV50Tipcolcod1, 2, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV51Tipcolcod3) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPCOLCOD3" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV51Tipcolcod3, 2, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV65ConsManuales) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CONSMANUALES" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV65ConsManuales, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV104Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S152( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV54Tot_HreBarKgm = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54Tot_HreBarKgm", GXutil.ltrimstr( AV54Tot_HreBarKgm, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HREBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV54Tot_HreBarKgm, "ZZZZZ9.99")));
      AV56Tot_Costei = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56Tot_Costei", GXutil.ltrimstr( AV56Tot_Costei, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_COSTEI", getSecureSignedToken( sPrefix, localUtil.format( AV56Tot_Costei, "ZZZZZZ9.99")));
      AV58Tot_CosteT = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58Tot_CosteT", GXutil.ltrimstr( AV58Tot_CosteT, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_COSTET", getSecureSignedToken( sPrefix, localUtil.format( AV58Tot_CosteT, "ZZZZZZ9.99")));
   }

   public void S172( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV109GXV36 = 1 ;
      while ( AV109GXV36 <= AV13AnalisisCostesHistoricosRecetas_SDTs.size() )
      {
         AV53AnalisisCostesHistoricosRecetas_SDTsItem = (app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV109GXV36));
         AV54Tot_HreBarKgm = AV54Tot_HreBarKgm.add((AV53AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarkgm())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54Tot_HreBarKgm", GXutil.ltrimstr( AV54Tot_HreBarKgm, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HREBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV54Tot_HreBarKgm, "ZZZZZ9.99")));
         AV56Tot_Costei = AV56Tot_Costei.add((AV53AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costei())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56Tot_Costei", GXutil.ltrimstr( AV56Tot_Costei, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_COSTEI", getSecureSignedToken( sPrefix, localUtil.format( AV56Tot_Costei, "ZZZZZZ9.99")));
         AV58Tot_CosteT = AV58Tot_CosteT.add((AV53AnalisisCostesHistoricosRecetas_SDTsItem.getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costet())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58Tot_CosteT", GXutil.ltrimstr( AV58Tot_CosteT, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_COSTET", getSecureSignedToken( sPrefix, localUtil.format( AV58Tot_CosteT, "ZZZZZZ9.99")));
         AV109GXV36 = (int)(AV109GXV36+1) ;
      }
      AV55TotValue_HreBarKgm = localUtil.format( AV54Tot_HreBarKgm, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TotValue_HreBarKgm", AV55TotValue_HreBarKgm);
      AV57TotValue_Costei = localUtil.format( AV56Tot_Costei, "ZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TotValue_Costei", AV57TotValue_Costei);
      AV59TotValue_CosteT = localUtil.format( AV58Tot_CosteT, "ZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TotValue_CosteT", AV59TotValue_CosteT);
   }

   public void wb_table2_82_1MJ2( boolean wbgen )
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
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_hrebarkgm_Internalname, httpContext.getMessage( "Tot Value_Hre Bar Kgm", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'" + sPrefix + "',false,'" + sGXsfl_45_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_hrebarkgm_Internalname, AV55TotValue_HreBarKgm, GXutil.rtrim( localUtil.format( AV55TotValue_HreBarKgm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,92);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_hrebarkgm_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_hrebarkgm_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\AnalisisCostesHistoricosRecetas_SDT_WC.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_costei_Internalname, httpContext.getMessage( "Tot Value_Costei", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'" + sPrefix + "',false,'" + sGXsfl_45_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_costei_Internalname, AV57TotValue_Costei, GXutil.rtrim( localUtil.format( AV57TotValue_Costei, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_costei_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_costei_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\AnalisisCostesHistoricosRecetas_SDT_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_costet_Internalname, httpContext.getMessage( "Tot Value_Coste T", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'" + sPrefix + "',false,'" + sGXsfl_45_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_costet_Internalname, AV59TotValue_CosteT, GXutil.rtrim( localUtil.format( AV59TotValue_CosteT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,102);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_costet_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_costet_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\AnalisisCostesHistoricosRecetas_SDT_WC.htm");
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
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_82_1MJ2e( true) ;
      }
      else
      {
         wb_table2_82_1MJ2e( false) ;
      }
   }

   public void wb_table1_25_1MJ2( boolean wbgen )
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
         wb_table3_30_1MJ2( true) ;
      }
      else
      {
         wb_table3_30_1MJ2( false) ;
      }
      return  ;
   }

   public void wb_table3_30_1MJ2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_1MJ2e( true) ;
      }
      else
      {
         wb_table1_25_1MJ2e( false) ;
      }
   }

   public void wb_table3_30_1MJ2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'" + sPrefix + "',false,'" + sGXsfl_45_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV12FilterFullText, GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_FormulacionTinte\\AnalisisCostesHistoricosRecetas_SDT_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_30_1MJ2e( true) ;
      }
      else
      {
         wb_table3_30_1MJ2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV28Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
      AV29HreRacab = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29HreRacab", AV29HreRacab);
      AV44Fec1 = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Fec1", localUtil.format(AV44Fec1, "99/99/99"));
      AV45Fec2 = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Fec2", localUtil.format(AV45Fec2, "99/99/99"));
      AV41Calculo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Calculo", GXutil.str( AV41Calculo, 1, 0));
      AV30barcod = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30barcod), 8, 0));
      AV31barcodreo = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31barcodreo", GXutil.str( AV31barcodreo, 1, 0));
      AV32barcodpar = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32barcodpar", AV32barcodpar);
      AV33ARtcod1 = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33ARtcod1", AV33ARtcod1);
      AV34ARtcod3 = (String)getParm(obj,9,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34ARtcod3", AV34ARtcod3);
      AV37Barcolnom1 = (String)getParm(obj,10,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Barcolnom1", AV37Barcolnom1);
      AV38Barcolnom3 = (String)getParm(obj,11,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Barcolnom3", AV38Barcolnom3);
      AV39Barcolnum1 = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Barcolnum1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39Barcolnum1), 6, 0));
      AV40Barcolnum3 = ((Number) GXutil.testNumericType( getParm(obj,13,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Barcolnum3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Barcolnum3), 6, 0));
      AV42Clicod1 = ((Number) GXutil.testNumericType( getParm(obj,14,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Clicod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Clicod1), 6, 0));
      AV43Clicod3 = ((Number) GXutil.testNumericType( getParm(obj,15,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Clicod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43Clicod3), 6, 0));
      AV46Intcod1 = ((Number) GXutil.testNumericType( getParm(obj,16,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46Intcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46Intcod1), 2, 0));
      AV47Intcod3 = ((Number) GXutil.testNumericType( getParm(obj,17,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Intcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Intcod3), 2, 0));
      AV48TipArtCod1 = ((Number) GXutil.testNumericType( getParm(obj,18,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TipArtCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TipArtCod1), 4, 0));
      AV49TipArtCod3 = ((Number) GXutil.testNumericType( getParm(obj,19,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TipArtCod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TipArtCod3), 4, 0));
      AV50Tipcolcod1 = ((Number) GXutil.testNumericType( getParm(obj,20,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50Tipcolcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Tipcolcod1), 2, 0));
      AV51Tipcolcod3 = ((Number) GXutil.testNumericType( getParm(obj,21,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Tipcolcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51Tipcolcod3), 2, 0));
      AV65ConsManuales = ((Number) GXutil.testNumericType( getParm(obj,22,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65ConsManuales", GXutil.str( AV65ConsManuales, 1, 0));
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
      pa1MJ2( ) ;
      ws1MJ2( ) ;
      we1MJ2( ) ;
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
      sCtrlAV29HreRacab = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV44Fec1 = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV45Fec2 = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV41Calculo = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV30barcod = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV31barcodreo = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV32barcodpar = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV33ARtcod1 = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV34ARtcod3 = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV37Barcolnom1 = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV38Barcolnom3 = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV39Barcolnum1 = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV40Barcolnum3 = (String)getParm(obj,13,TypeConstants.STRING) ;
      sCtrlAV42Clicod1 = (String)getParm(obj,14,TypeConstants.STRING) ;
      sCtrlAV43Clicod3 = (String)getParm(obj,15,TypeConstants.STRING) ;
      sCtrlAV46Intcod1 = (String)getParm(obj,16,TypeConstants.STRING) ;
      sCtrlAV47Intcod3 = (String)getParm(obj,17,TypeConstants.STRING) ;
      sCtrlAV48TipArtCod1 = (String)getParm(obj,18,TypeConstants.STRING) ;
      sCtrlAV49TipArtCod3 = (String)getParm(obj,19,TypeConstants.STRING) ;
      sCtrlAV50Tipcolcod1 = (String)getParm(obj,20,TypeConstants.STRING) ;
      sCtrlAV51Tipcolcod3 = (String)getParm(obj,21,TypeConstants.STRING) ;
      sCtrlAV65ConsManuales = (String)getParm(obj,22,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1MJ2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "formulaciontinte\\analisiscosteshistoricosrecetas_sdt_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1MJ2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV28Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
         AV29HreRacab = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29HreRacab", AV29HreRacab);
         AV44Fec1 = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Fec1", localUtil.format(AV44Fec1, "99/99/99"));
         AV45Fec2 = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Fec2", localUtil.format(AV45Fec2, "99/99/99"));
         AV41Calculo = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Calculo", GXutil.str( AV41Calculo, 1, 0));
         AV30barcod = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30barcod), 8, 0));
         AV31barcodreo = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31barcodreo", GXutil.str( AV31barcodreo, 1, 0));
         AV32barcodpar = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32barcodpar", AV32barcodpar);
         AV33ARtcod1 = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33ARtcod1", AV33ARtcod1);
         AV34ARtcod3 = (String)getParm(obj,11,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34ARtcod3", AV34ARtcod3);
         AV37Barcolnom1 = (String)getParm(obj,12,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Barcolnom1", AV37Barcolnom1);
         AV38Barcolnom3 = (String)getParm(obj,13,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Barcolnom3", AV38Barcolnom3);
         AV39Barcolnum1 = ((Number) GXutil.testNumericType( getParm(obj,14,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Barcolnum1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39Barcolnum1), 6, 0));
         AV40Barcolnum3 = ((Number) GXutil.testNumericType( getParm(obj,15,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Barcolnum3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Barcolnum3), 6, 0));
         AV42Clicod1 = ((Number) GXutil.testNumericType( getParm(obj,16,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Clicod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Clicod1), 6, 0));
         AV43Clicod3 = ((Number) GXutil.testNumericType( getParm(obj,17,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Clicod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43Clicod3), 6, 0));
         AV46Intcod1 = ((Number) GXutil.testNumericType( getParm(obj,18,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46Intcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46Intcod1), 2, 0));
         AV47Intcod3 = ((Number) GXutil.testNumericType( getParm(obj,19,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Intcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Intcod3), 2, 0));
         AV48TipArtCod1 = ((Number) GXutil.testNumericType( getParm(obj,20,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TipArtCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TipArtCod1), 4, 0));
         AV49TipArtCod3 = ((Number) GXutil.testNumericType( getParm(obj,21,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TipArtCod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TipArtCod3), 4, 0));
         AV50Tipcolcod1 = ((Number) GXutil.testNumericType( getParm(obj,22,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50Tipcolcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Tipcolcod1), 2, 0));
         AV51Tipcolcod3 = ((Number) GXutil.testNumericType( getParm(obj,23,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Tipcolcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51Tipcolcod3), 2, 0));
         AV65ConsManuales = ((Number) GXutil.testNumericType( getParm(obj,24,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65ConsManuales", GXutil.str( AV65ConsManuales, 1, 0));
      }
      wcpOAV28Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV28Emprcod") ;
      wcpOAV29HreRacab = httpContext.cgiGet( sPrefix+"wcpOAV29HreRacab") ;
      wcpOAV44Fec1 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV44Fec1"), 0) ;
      wcpOAV45Fec2 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV45Fec2"), 0) ;
      wcpOAV41Calculo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV41Calculo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV30barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV30barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV31barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV31barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV32barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV32barcodpar") ;
      wcpOAV33ARtcod1 = httpContext.cgiGet( sPrefix+"wcpOAV33ARtcod1") ;
      wcpOAV34ARtcod3 = httpContext.cgiGet( sPrefix+"wcpOAV34ARtcod3") ;
      wcpOAV37Barcolnom1 = httpContext.cgiGet( sPrefix+"wcpOAV37Barcolnom1") ;
      wcpOAV38Barcolnom3 = httpContext.cgiGet( sPrefix+"wcpOAV38Barcolnom3") ;
      wcpOAV39Barcolnum1 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV39Barcolnum1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV40Barcolnum3 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV40Barcolnum3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV42Clicod1 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV42Clicod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV43Clicod3 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV43Clicod3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV46Intcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV46Intcod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV47Intcod3 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV47Intcod3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV48TipArtCod1 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV48TipArtCod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV49TipArtCod3 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV49TipArtCod3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV50Tipcolcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV50Tipcolcod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV51Tipcolcod3 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV51Tipcolcod3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV65ConsManuales = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV65ConsManuales"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV28Emprcod, wcpOAV28Emprcod) != 0 ) || ( GXutil.strcmp(AV29HreRacab, wcpOAV29HreRacab) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV44Fec1), GXutil.resetTime(wcpOAV44Fec1)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV45Fec2), GXutil.resetTime(wcpOAV45Fec2)) ) || ( AV41Calculo != wcpOAV41Calculo ) || ( AV30barcod != wcpOAV30barcod ) || ( AV31barcodreo != wcpOAV31barcodreo ) || ( GXutil.strcmp(AV32barcodpar, wcpOAV32barcodpar) != 0 ) || ( GXutil.strcmp(AV33ARtcod1, wcpOAV33ARtcod1) != 0 ) || ( GXutil.strcmp(AV34ARtcod3, wcpOAV34ARtcod3) != 0 ) || ( GXutil.strcmp(AV37Barcolnom1, wcpOAV37Barcolnom1) != 0 ) || ( GXutil.strcmp(AV38Barcolnom3, wcpOAV38Barcolnom3) != 0 ) || ( AV39Barcolnum1 != wcpOAV39Barcolnum1 ) || ( AV40Barcolnum3 != wcpOAV40Barcolnum3 ) || ( AV42Clicod1 != wcpOAV42Clicod1 ) || ( AV43Clicod3 != wcpOAV43Clicod3 ) || ( AV46Intcod1 != wcpOAV46Intcod1 ) || ( AV47Intcod3 != wcpOAV47Intcod3 ) || ( AV48TipArtCod1 != wcpOAV48TipArtCod1 ) || ( AV49TipArtCod3 != wcpOAV49TipArtCod3 ) || ( AV50Tipcolcod1 != wcpOAV50Tipcolcod1 ) || ( AV51Tipcolcod3 != wcpOAV51Tipcolcod3 ) || ( AV65ConsManuales != wcpOAV65ConsManuales ) ) )
      {
         setjustcreated();
      }
      wcpOAV28Emprcod = AV28Emprcod ;
      wcpOAV29HreRacab = AV29HreRacab ;
      wcpOAV44Fec1 = AV44Fec1 ;
      wcpOAV45Fec2 = AV45Fec2 ;
      wcpOAV41Calculo = AV41Calculo ;
      wcpOAV30barcod = AV30barcod ;
      wcpOAV31barcodreo = AV31barcodreo ;
      wcpOAV32barcodpar = AV32barcodpar ;
      wcpOAV33ARtcod1 = AV33ARtcod1 ;
      wcpOAV34ARtcod3 = AV34ARtcod3 ;
      wcpOAV37Barcolnom1 = AV37Barcolnom1 ;
      wcpOAV38Barcolnom3 = AV38Barcolnom3 ;
      wcpOAV39Barcolnum1 = AV39Barcolnum1 ;
      wcpOAV40Barcolnum3 = AV40Barcolnum3 ;
      wcpOAV42Clicod1 = AV42Clicod1 ;
      wcpOAV43Clicod3 = AV43Clicod3 ;
      wcpOAV46Intcod1 = AV46Intcod1 ;
      wcpOAV47Intcod3 = AV47Intcod3 ;
      wcpOAV48TipArtCod1 = AV48TipArtCod1 ;
      wcpOAV49TipArtCod3 = AV49TipArtCod3 ;
      wcpOAV50Tipcolcod1 = AV50Tipcolcod1 ;
      wcpOAV51Tipcolcod3 = AV51Tipcolcod3 ;
      wcpOAV65ConsManuales = AV65ConsManuales ;
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
      sCtrlAV29HreRacab = httpContext.cgiGet( sPrefix+"AV29HreRacab_CTRL") ;
      if ( GXutil.len( sCtrlAV29HreRacab) > 0 )
      {
         AV29HreRacab = httpContext.cgiGet( sCtrlAV29HreRacab) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29HreRacab", AV29HreRacab);
      }
      else
      {
         AV29HreRacab = httpContext.cgiGet( sPrefix+"AV29HreRacab_PARM") ;
      }
      sCtrlAV44Fec1 = httpContext.cgiGet( sPrefix+"AV44Fec1_CTRL") ;
      if ( GXutil.len( sCtrlAV44Fec1) > 0 )
      {
         AV44Fec1 = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV44Fec1), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Fec1", localUtil.format(AV44Fec1, "99/99/99"));
      }
      else
      {
         AV44Fec1 = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV44Fec1_PARM"), 0) ;
      }
      sCtrlAV45Fec2 = httpContext.cgiGet( sPrefix+"AV45Fec2_CTRL") ;
      if ( GXutil.len( sCtrlAV45Fec2) > 0 )
      {
         AV45Fec2 = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV45Fec2), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Fec2", localUtil.format(AV45Fec2, "99/99/99"));
      }
      else
      {
         AV45Fec2 = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV45Fec2_PARM"), 0) ;
      }
      sCtrlAV41Calculo = httpContext.cgiGet( sPrefix+"AV41Calculo_CTRL") ;
      if ( GXutil.len( sCtrlAV41Calculo) > 0 )
      {
         AV41Calculo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV41Calculo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Calculo", GXutil.str( AV41Calculo, 1, 0));
      }
      else
      {
         AV41Calculo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV41Calculo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV30barcod = httpContext.cgiGet( sPrefix+"AV30barcod_CTRL") ;
      if ( GXutil.len( sCtrlAV30barcod) > 0 )
      {
         AV30barcod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV30barcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30barcod), 8, 0));
      }
      else
      {
         AV30barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV30barcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV31barcodreo = httpContext.cgiGet( sPrefix+"AV31barcodreo_CTRL") ;
      if ( GXutil.len( sCtrlAV31barcodreo) > 0 )
      {
         AV31barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV31barcodreo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31barcodreo", GXutil.str( AV31barcodreo, 1, 0));
      }
      else
      {
         AV31barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV31barcodreo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV32barcodpar = httpContext.cgiGet( sPrefix+"AV32barcodpar_CTRL") ;
      if ( GXutil.len( sCtrlAV32barcodpar) > 0 )
      {
         AV32barcodpar = httpContext.cgiGet( sCtrlAV32barcodpar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32barcodpar", AV32barcodpar);
      }
      else
      {
         AV32barcodpar = httpContext.cgiGet( sPrefix+"AV32barcodpar_PARM") ;
      }
      sCtrlAV33ARtcod1 = httpContext.cgiGet( sPrefix+"AV33ARtcod1_CTRL") ;
      if ( GXutil.len( sCtrlAV33ARtcod1) > 0 )
      {
         AV33ARtcod1 = httpContext.cgiGet( sCtrlAV33ARtcod1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33ARtcod1", AV33ARtcod1);
      }
      else
      {
         AV33ARtcod1 = httpContext.cgiGet( sPrefix+"AV33ARtcod1_PARM") ;
      }
      sCtrlAV34ARtcod3 = httpContext.cgiGet( sPrefix+"AV34ARtcod3_CTRL") ;
      if ( GXutil.len( sCtrlAV34ARtcod3) > 0 )
      {
         AV34ARtcod3 = httpContext.cgiGet( sCtrlAV34ARtcod3) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34ARtcod3", AV34ARtcod3);
      }
      else
      {
         AV34ARtcod3 = httpContext.cgiGet( sPrefix+"AV34ARtcod3_PARM") ;
      }
      sCtrlAV37Barcolnom1 = httpContext.cgiGet( sPrefix+"AV37Barcolnom1_CTRL") ;
      if ( GXutil.len( sCtrlAV37Barcolnom1) > 0 )
      {
         AV37Barcolnom1 = httpContext.cgiGet( sCtrlAV37Barcolnom1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Barcolnom1", AV37Barcolnom1);
      }
      else
      {
         AV37Barcolnom1 = httpContext.cgiGet( sPrefix+"AV37Barcolnom1_PARM") ;
      }
      sCtrlAV38Barcolnom3 = httpContext.cgiGet( sPrefix+"AV38Barcolnom3_CTRL") ;
      if ( GXutil.len( sCtrlAV38Barcolnom3) > 0 )
      {
         AV38Barcolnom3 = httpContext.cgiGet( sCtrlAV38Barcolnom3) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Barcolnom3", AV38Barcolnom3);
      }
      else
      {
         AV38Barcolnom3 = httpContext.cgiGet( sPrefix+"AV38Barcolnom3_PARM") ;
      }
      sCtrlAV39Barcolnum1 = httpContext.cgiGet( sPrefix+"AV39Barcolnum1_CTRL") ;
      if ( GXutil.len( sCtrlAV39Barcolnum1) > 0 )
      {
         AV39Barcolnum1 = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV39Barcolnum1), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Barcolnum1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39Barcolnum1), 6, 0));
      }
      else
      {
         AV39Barcolnum1 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV39Barcolnum1_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV40Barcolnum3 = httpContext.cgiGet( sPrefix+"AV40Barcolnum3_CTRL") ;
      if ( GXutil.len( sCtrlAV40Barcolnum3) > 0 )
      {
         AV40Barcolnum3 = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV40Barcolnum3), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Barcolnum3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Barcolnum3), 6, 0));
      }
      else
      {
         AV40Barcolnum3 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV40Barcolnum3_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV42Clicod1 = httpContext.cgiGet( sPrefix+"AV42Clicod1_CTRL") ;
      if ( GXutil.len( sCtrlAV42Clicod1) > 0 )
      {
         AV42Clicod1 = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV42Clicod1), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Clicod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Clicod1), 6, 0));
      }
      else
      {
         AV42Clicod1 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV42Clicod1_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV43Clicod3 = httpContext.cgiGet( sPrefix+"AV43Clicod3_CTRL") ;
      if ( GXutil.len( sCtrlAV43Clicod3) > 0 )
      {
         AV43Clicod3 = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV43Clicod3), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Clicod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43Clicod3), 6, 0));
      }
      else
      {
         AV43Clicod3 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV43Clicod3_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV46Intcod1 = httpContext.cgiGet( sPrefix+"AV46Intcod1_CTRL") ;
      if ( GXutil.len( sCtrlAV46Intcod1) > 0 )
      {
         AV46Intcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV46Intcod1), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46Intcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46Intcod1), 2, 0));
      }
      else
      {
         AV46Intcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV46Intcod1_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV47Intcod3 = httpContext.cgiGet( sPrefix+"AV47Intcod3_CTRL") ;
      if ( GXutil.len( sCtrlAV47Intcod3) > 0 )
      {
         AV47Intcod3 = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV47Intcod3), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Intcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Intcod3), 2, 0));
      }
      else
      {
         AV47Intcod3 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV47Intcod3_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV48TipArtCod1 = httpContext.cgiGet( sPrefix+"AV48TipArtCod1_CTRL") ;
      if ( GXutil.len( sCtrlAV48TipArtCod1) > 0 )
      {
         AV48TipArtCod1 = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV48TipArtCod1), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TipArtCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TipArtCod1), 4, 0));
      }
      else
      {
         AV48TipArtCod1 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV48TipArtCod1_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV49TipArtCod3 = httpContext.cgiGet( sPrefix+"AV49TipArtCod3_CTRL") ;
      if ( GXutil.len( sCtrlAV49TipArtCod3) > 0 )
      {
         AV49TipArtCod3 = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV49TipArtCod3), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TipArtCod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TipArtCod3), 4, 0));
      }
      else
      {
         AV49TipArtCod3 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV49TipArtCod3_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV50Tipcolcod1 = httpContext.cgiGet( sPrefix+"AV50Tipcolcod1_CTRL") ;
      if ( GXutil.len( sCtrlAV50Tipcolcod1) > 0 )
      {
         AV50Tipcolcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV50Tipcolcod1), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50Tipcolcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Tipcolcod1), 2, 0));
      }
      else
      {
         AV50Tipcolcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV50Tipcolcod1_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV51Tipcolcod3 = httpContext.cgiGet( sPrefix+"AV51Tipcolcod3_CTRL") ;
      if ( GXutil.len( sCtrlAV51Tipcolcod3) > 0 )
      {
         AV51Tipcolcod3 = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV51Tipcolcod3), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Tipcolcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51Tipcolcod3), 2, 0));
      }
      else
      {
         AV51Tipcolcod3 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV51Tipcolcod3_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV65ConsManuales = httpContext.cgiGet( sPrefix+"AV65ConsManuales_CTRL") ;
      if ( GXutil.len( sCtrlAV65ConsManuales) > 0 )
      {
         AV65ConsManuales = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV65ConsManuales), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65ConsManuales", GXutil.str( AV65ConsManuales, 1, 0));
      }
      else
      {
         AV65ConsManuales = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV65ConsManuales_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1MJ2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1MJ2( ) ;
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
      ws1MJ2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29HreRacab_PARM", GXutil.rtrim( AV29HreRacab));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV29HreRacab)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29HreRacab_CTRL", GXutil.rtrim( sCtrlAV29HreRacab));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44Fec1_PARM", localUtil.dtoc( AV44Fec1, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV44Fec1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44Fec1_CTRL", GXutil.rtrim( sCtrlAV44Fec1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45Fec2_PARM", localUtil.dtoc( AV45Fec2, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV45Fec2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45Fec2_CTRL", GXutil.rtrim( sCtrlAV45Fec2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41Calculo_PARM", GXutil.ltrim( localUtil.ntoc( AV41Calculo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV41Calculo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41Calculo_CTRL", GXutil.rtrim( sCtrlAV41Calculo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30barcod_PARM", GXutil.ltrim( localUtil.ntoc( AV30barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30barcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30barcod_CTRL", GXutil.rtrim( sCtrlAV30barcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31barcodreo_PARM", GXutil.ltrim( localUtil.ntoc( AV31barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV31barcodreo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31barcodreo_CTRL", GXutil.rtrim( sCtrlAV31barcodreo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32barcodpar_PARM", GXutil.rtrim( AV32barcodpar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV32barcodpar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32barcodpar_CTRL", GXutil.rtrim( sCtrlAV32barcodpar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33ARtcod1_PARM", GXutil.rtrim( AV33ARtcod1));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33ARtcod1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33ARtcod1_CTRL", GXutil.rtrim( sCtrlAV33ARtcod1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34ARtcod3_PARM", GXutil.rtrim( AV34ARtcod3));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV34ARtcod3)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34ARtcod3_CTRL", GXutil.rtrim( sCtrlAV34ARtcod3));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37Barcolnom1_PARM", GXutil.rtrim( AV37Barcolnom1));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV37Barcolnom1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37Barcolnom1_CTRL", GXutil.rtrim( sCtrlAV37Barcolnom1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV38Barcolnom3_PARM", GXutil.rtrim( AV38Barcolnom3));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV38Barcolnom3)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV38Barcolnom3_CTRL", GXutil.rtrim( sCtrlAV38Barcolnom3));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39Barcolnum1_PARM", GXutil.ltrim( localUtil.ntoc( AV39Barcolnum1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV39Barcolnum1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39Barcolnum1_CTRL", GXutil.rtrim( sCtrlAV39Barcolnum1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40Barcolnum3_PARM", GXutil.ltrim( localUtil.ntoc( AV40Barcolnum3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV40Barcolnum3)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40Barcolnum3_CTRL", GXutil.rtrim( sCtrlAV40Barcolnum3));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42Clicod1_PARM", GXutil.ltrim( localUtil.ntoc( AV42Clicod1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV42Clicod1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42Clicod1_CTRL", GXutil.rtrim( sCtrlAV42Clicod1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43Clicod3_PARM", GXutil.ltrim( localUtil.ntoc( AV43Clicod3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV43Clicod3)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43Clicod3_CTRL", GXutil.rtrim( sCtrlAV43Clicod3));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46Intcod1_PARM", GXutil.ltrim( localUtil.ntoc( AV46Intcod1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV46Intcod1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46Intcod1_CTRL", GXutil.rtrim( sCtrlAV46Intcod1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47Intcod3_PARM", GXutil.ltrim( localUtil.ntoc( AV47Intcod3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV47Intcod3)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47Intcod3_CTRL", GXutil.rtrim( sCtrlAV47Intcod3));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV48TipArtCod1_PARM", GXutil.ltrim( localUtil.ntoc( AV48TipArtCod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV48TipArtCod1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV48TipArtCod1_CTRL", GXutil.rtrim( sCtrlAV48TipArtCod1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV49TipArtCod3_PARM", GXutil.ltrim( localUtil.ntoc( AV49TipArtCod3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV49TipArtCod3)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV49TipArtCod3_CTRL", GXutil.rtrim( sCtrlAV49TipArtCod3));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV50Tipcolcod1_PARM", GXutil.ltrim( localUtil.ntoc( AV50Tipcolcod1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV50Tipcolcod1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV50Tipcolcod1_CTRL", GXutil.rtrim( sCtrlAV50Tipcolcod1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV51Tipcolcod3_PARM", GXutil.ltrim( localUtil.ntoc( AV51Tipcolcod3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV51Tipcolcod3)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV51Tipcolcod3_CTRL", GXutil.rtrim( sCtrlAV51Tipcolcod3));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65ConsManuales_PARM", GXutil.ltrim( localUtil.ntoc( AV65ConsManuales, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV65ConsManuales)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65ConsManuales_CTRL", GXutil.rtrim( sCtrlAV65ConsManuales));
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
      we1MJ2( ) ;
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
      httpContext.AddStyleSheetFile("GXProgressIndicator/css/bootstrap-progressbar-3.0.1.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211556815", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/analisiscosteshistoricosrecetas_sdt_wc.js", "?20268211556815", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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

   public void subsflControlProps_452( )
   {
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__toa_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__TOA_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREFECTIN_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__marca_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__MARCA_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HDR_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__BARAGREST_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARKGM_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETOTKGM_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREMAQCOD_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREVOLPRD_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__rb_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__RB_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costei_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTEI_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costet_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTET_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__dif_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__DIF_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__porc_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__PORC_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costek_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTEK_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__CLICOD_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__CLINOM_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARSER_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARDSC_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETIPARTD_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRECOLNOM_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRECOLNUM_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETIPCOLN_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREINTDSC_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__ENCCLI_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREPROCOD_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREPRODSC_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__PRVDSC_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__BARAGRLOT_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTESQUIMICOSI_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTESQUIMICOSA_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__ITEMORDERSDT_"+sGXsfl_45_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__TABLAA_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_452( )
   {
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__toa_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__TOA_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREFECTIN_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__marca_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__MARCA_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HDR_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__BARAGREST_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARKGM_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETOTKGM_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREMAQCOD_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREVOLPRD_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__rb_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__RB_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costei_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTEI_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costet_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTET_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__dif_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__DIF_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__porc_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__PORC_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costek_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTEK_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__CLICOD_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__CLINOM_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARSER_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARDSC_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETIPARTD_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRECOLNOM_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRECOLNUM_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETIPCOLN_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREINTDSC_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__ENCCLI_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREPROCOD_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREPRODSC_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__PRVDSC_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__BARAGRLOT_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTESQUIMICOSI_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTESQUIMICOSA_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__ITEMORDERSDT_"+sGXsfl_45_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__TABLAA_"+sGXsfl_45_fel_idx ;
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wb1MJ0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_45_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_45_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_45_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 46,'"+sPrefix+"',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV60DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVDETAILWEBCOMPONENT.CLICK."+sGXsfl_45_idx+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,edtavDetailwebcomponent_Columnclass,edtavDetailwebcomponent_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__toa_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__toa_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Toa()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__toa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavAnalisiscosteshistoricosrecetas_sdts__toa_Columnclass,edtavAnalisiscosteshistoricosrecetas_sdts__toa_Columnheaderclass,Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__toa_Visible),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__toa_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Internalname,localUtil.format(((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin(), "99/99/99"),localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Columnclass,edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Columnheaderclass,Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Visible),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__marca_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__marca_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Marca()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__marca_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavAnalisiscosteshistoricosrecetas_sdts__marca_Columnclass,edtavAnalisiscosteshistoricosrecetas_sdts__marca_Columnheaderclass,Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__marca_Visible),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__marca_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hdr()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Columnclass,edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Columnheaderclass,Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Visible),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrest()),GXutil.rtrim( localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrest(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Columnclass,edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Columnheaderclass,Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Visible),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarkgm(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Enabled!=0) ? localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarkgm(), "ZZZZZ9.99") : localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarkgm(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Columnclass,edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Columnheaderclass,Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Visible),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretotkgm(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Enabled!=0) ? localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretotkgm(), "ZZZZZ9.99") : localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretotkgm(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Columnclass,edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Columnheaderclass,Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Visible),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hremaqcod()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Columnclass,edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Columnheaderclass,Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Visible),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrevolprd(), (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrevolprd()), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrevolprd()), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Columnclass,edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Columnheaderclass,Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Visible),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__rb_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__rb_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Rb(), (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAnalisiscosteshistoricosrecetas_sdts__rb_Enabled!=0) ? localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Rb(), "ZZ9.99") : localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Rb(), "ZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__rb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavAnalisiscosteshistoricosrecetas_sdts__rb_Columnclass,edtavAnalisiscosteshistoricosrecetas_sdts__rb_Columnheaderclass,Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__rb_Visible),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__rb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__costei_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__costei_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costei(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAnalisiscosteshistoricosrecetas_sdts__costei_Enabled!=0) ? localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costei(), "ZZZZZZ9.99") : localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costei(), "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__costei_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavAnalisiscosteshistoricosrecetas_sdts__costei_Columnclass,edtavAnalisiscosteshistoricosrecetas_sdts__costei_Columnheaderclass,Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__costei_Visible),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__costei_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__costet_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__costet_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costet(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAnalisiscosteshistoricosrecetas_sdts__costet_Enabled!=0) ? localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costet(), "ZZZZZZ9.99") : localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costet(), "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__costet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavAnalisiscosteshistoricosrecetas_sdts__costet_Columnclass,edtavAnalisiscosteshistoricosrecetas_sdts__costet_Columnheaderclass,Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__costet_Visible),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__costet_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__dif_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__dif_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Dif(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAnalisiscosteshistoricosrecetas_sdts__dif_Enabled!=0) ? localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Dif(), "ZZZZZZ9.99") : localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Dif(), "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__dif_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavAnalisiscosteshistoricosrecetas_sdts__dif_Columnclass,edtavAnalisiscosteshistoricosrecetas_sdts__dif_Columnheaderclass,Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__dif_Visible),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__dif_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__porc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__porc_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Porc(), (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAnalisiscosteshistoricosrecetas_sdts__porc_Enabled!=0) ? localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Porc(), "ZZ9.99") : localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Porc(), "ZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__porc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavAnalisiscosteshistoricosrecetas_sdts__porc_Columnclass,edtavAnalisiscosteshistoricosrecetas_sdts__porc_Columnheaderclass,Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__porc_Visible),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__porc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__costek_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__costek_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costek(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAnalisiscosteshistoricosrecetas_sdts__costek_Enabled!=0) ? localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costek(), "ZZZZZZ9.99") : localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costek(), "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__costek_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavAnalisiscosteshistoricosrecetas_sdts__costek_Columnclass,edtavAnalisiscosteshistoricosrecetas_sdts__costek_Columnheaderclass,Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__costek_Visible),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__costek_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Columnclass,edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Columnheaderclass,Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Visible),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clinom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Columnclass,edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Columnheaderclass,Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Visible),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarser()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Columnclass,edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Columnheaderclass,Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Visible),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebardsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Columnclass,edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Columnheaderclass,Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Visible),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipartd()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Columnclass,edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Columnheaderclass,Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Visible),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Columnclass,edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Columnheaderclass,Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Visible),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnum(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnum()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnum()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Columnclass,edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Columnheaderclass,Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Visible),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipcoln()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Columnclass,edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Columnheaderclass,Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Visible),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreintdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Columnclass,edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Columnheaderclass,Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Visible),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Enccli()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Columnclass,edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Columnheaderclass,Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Visible),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprocod()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Columnclass,edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Columnheaderclass,Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Visible),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprodsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Columnclass,edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Columnheaderclass,Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Visible),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Prvdsc()),GXutil.rtrim( localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Prvdsc(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Columnclass,edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Columnheaderclass,Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Visible),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrlot()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosi(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Enabled!=0) ? localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosi(), "ZZZZZZ9.99") : localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosi(), "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosa(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Enabled!=0) ? localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosa(), "ZZZZZZ9.99") : localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosa(), "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Itemordersdt()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV70GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1MJ2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_45_idx = ((subGrid_Islastpage==1)&&(nGXsfl_45_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
      }
      /* End function sendrow_452 */
   }

   public void startgridcontrol45( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"45\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__toa_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Cierre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__marca_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "A?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos Tot.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Volumen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__rb_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rb", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__costei_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Ini.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__costet_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Tot.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__dif_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dif", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__porc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "%") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__costek_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste kg", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo de Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Intensidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pedido Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proceso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
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
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV60DetailWebComponent));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDetailwebcomponent_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDetailwebcomponent_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__toa_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__toa_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__toa_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__toa_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__marca_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__marca_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__marca_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__marca_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__rb_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__rb_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__rb_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__rb_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__costei_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__costei_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__costei_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__costei_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__costet_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__costet_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__costet_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__costet_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__dif_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__dif_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__dif_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__dif_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__porc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__porc_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__porc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__porc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__costek_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__costek_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__costek_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__costek_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtninformeproductos_Internalname = sPrefix+"BTNINFORMEPRODUCTOS" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      Barradeprogreso_Internalname = sPrefix+"BARRADEPROGRESO" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__toa_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__TOA" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREFECTIN" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__marca_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__MARCA" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HDR" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__BARAGREST" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARKGM" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETOTKGM" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREMAQCOD" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREVOLPRD" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__rb_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__RB" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costei_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTEI" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costet_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTET" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__dif_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__DIF" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__porc_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__PORC" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costek_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTEK" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__CLICOD" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__CLINOM" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARSER" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARDSC" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETIPARTD" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRECOLNOM" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRECOLNUM" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETIPCOLN" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREINTDSC" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__ENCCLI" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREPROCOD" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREPRODSC" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__PRVDSC" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__BARAGRLOT" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTESQUIMICOSI" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTESQUIMICOSA" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__ITEMORDERSDT" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Internalname = sPrefix+"ANALISISCOSTESHISTORICOSRECETAS_SDTS__TABLAA" ;
      edtavTotvalue_hrebarkgm_Internalname = sPrefix+"vTOTVALUE_HREBARKGM" ;
      edtavTotvalue_costei_Internalname = sPrefix+"vTOTVALUE_COSTEI" ;
      edtavTotvalue_costet_Internalname = sPrefix+"vTOTVALUE_COSTET" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divCell_grid_dwc_Internalname = sPrefix+"CELL_GRID_DWC" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
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
      edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Columnheaderclass = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Columnclass = "WWColumn" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Columnheaderclass = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Columnclass = "WWColumn" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Columnheaderclass = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Columnclass = "WWColumn" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Columnheaderclass = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Columnclass = "WWColumn" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Columnheaderclass = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Columnclass = "WWColumn" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Columnheaderclass = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Columnclass = "WWColumn" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Columnheaderclass = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Columnclass = "WWColumn" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Columnheaderclass = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Columnclass = "WWColumn" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Columnheaderclass = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Columnclass = "WWColumn" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Columnheaderclass = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Columnclass = "WWColumn" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Columnheaderclass = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Columnclass = "WWColumn" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Columnheaderclass = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Columnclass = "WWColumn" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Columnheaderclass = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Columnclass = "WWColumn" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costek_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costek_Columnheaderclass = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costek_Columnclass = "WWColumn" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costek_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costek_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__porc_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__porc_Columnheaderclass = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__porc_Columnclass = "WWColumn" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__porc_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__porc_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__dif_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__dif_Columnheaderclass = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__dif_Columnclass = "WWColumn" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__dif_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__dif_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costet_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costet_Columnheaderclass = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costet_Columnclass = "WWColumn" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costet_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costet_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costei_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costei_Columnheaderclass = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costei_Columnclass = "WWColumn" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costei_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costei_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__rb_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__rb_Columnheaderclass = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__rb_Columnclass = "WWColumn" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__rb_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__rb_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Columnheaderclass = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Columnclass = "WWColumn" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Columnheaderclass = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Columnclass = "WWColumn" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Columnheaderclass = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Columnclass = "WWColumn" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Columnheaderclass = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Columnclass = "WWColumn" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Columnheaderclass = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Columnclass = "WWColumn" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Columnheaderclass = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Columnclass = "WWColumn" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__marca_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__marca_Columnheaderclass = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__marca_Columnclass = "WWColumn" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__marca_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__marca_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Columnheaderclass = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Columnclass = "WWColumn" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__toa_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__toa_Columnheaderclass = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__toa_Columnclass = "WWColumn" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__toa_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__toa_Visible = -1 ;
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Columnclass = "WWIconActionColumn WCD_ActionColumn" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotvalue_costet_Jsonclick = "" ;
      edtavTotvalue_costet_Enabled = 1 ;
      edtavTotvalue_costei_Jsonclick = "" ;
      edtavTotvalue_costei_Enabled = 1 ;
      edtavTotvalue_hrebarkgm_Jsonclick = "" ;
      edtavTotvalue_hrebarkgm_Enabled = 1 ;
      edtavDetailwebcomponent_Columnheaderclass = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costek_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__porc_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__dif_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costet_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costei_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__rb_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__marca_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Visible = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__toa_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costek_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__porc_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__dif_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costet_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costei_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__rb_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__marca_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__toa_Enabled = -1 ;
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
      Ddo_grid_Columnssortvalues = "|||||||||||||||||||||||||||" ;
      Ddo_grid_Columnids = "1:AnalisisCostesHistoricosRecetas_SDTs__ToA|2:AnalisisCostesHistoricosRecetas_SDTs__HreFectin|3:AnalisisCostesHistoricosRecetas_SDTs__Marca|4:AnalisisCostesHistoricosRecetas_SDTs__Hdr|5:AnalisisCostesHistoricosRecetas_SDTs__BarAgrest|6:AnalisisCostesHistoricosRecetas_SDTs__HreBarKgm|7:AnalisisCostesHistoricosRecetas_SDTs__HreTotKgm|8:AnalisisCostesHistoricosRecetas_SDTs__HreMaqcod|9:AnalisisCostesHistoricosRecetas_SDTs__HreVolPrd|10:AnalisisCostesHistoricosRecetas_SDTs__Rb|11:AnalisisCostesHistoricosRecetas_SDTs__Costei|12:AnalisisCostesHistoricosRecetas_SDTs__CosteT|13:AnalisisCostesHistoricosRecetas_SDTs__Dif|14:AnalisisCostesHistoricosRecetas_SDTs__Porc|15:AnalisisCostesHistoricosRecetas_SDTs__Costek|16:AnalisisCostesHistoricosRecetas_SDTs__Clicod|17:AnalisisCostesHistoricosRecetas_SDTs__CliNom|18:AnalisisCostesHistoricosRecetas_SDTs__Hrebarser|19:AnalisisCostesHistoricosRecetas_SDTs__HreBarDsc|20:AnalisisCostesHistoricosRecetas_SDTs__HreTipArtd|21:AnalisisCostesHistoricosRecetas_SDTs__HreColnom|22:AnalisisCostesHistoricosRecetas_SDTs__HreColNum|23:AnalisisCostesHistoricosRecetas_SDTs__HreTipColN|24:AnalisisCostesHistoricosRecetas_SDTs__HreIntDsc|25:AnalisisCostesHistoricosRecetas_SDTs__EncCli|26:AnalisisCostesHistoricosRecetas_SDTs__HreProCod|27:AnalisisCostesHistoricosRecetas_SDTs__HreProDsc|28:AnalisisCostesHistoricosRecetas_SDTs__PrvDsc" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV104Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29HreRacab',fld:'vHRERACAB',pic:''},{av:'AV44Fec1',fld:'vFEC1',pic:''},{av:'AV45Fec2',fld:'vFEC2',pic:''},{av:'AV41Calculo',fld:'vCALCULO',pic:'9'},{av:'AV30barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV31barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV32barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV33ARtcod1',fld:'vARTCOD1',pic:''},{av:'AV34ARtcod3',fld:'vARTCOD3',pic:''},{av:'AV37Barcolnom1',fld:'vBARCOLNOM1',pic:''},{av:'AV38Barcolnom3',fld:'vBARCOLNOM3',pic:''},{av:'AV39Barcolnum1',fld:'vBARCOLNUM1',pic:'ZZZZZ9'},{av:'AV40Barcolnum3',fld:'vBARCOLNUM3',pic:'ZZZZZ9'},{av:'AV42Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV43Clicod3',fld:'vCLICOD3',pic:'ZZZZZ9'},{av:'AV46Intcod1',fld:'vINTCOD1',pic:'Z9'},{av:'AV47Intcod3',fld:'vINTCOD3',pic:'Z9'},{av:'AV48TipArtCod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV49TipArtCod3',fld:'vTIPARTCOD3',pic:'ZZZ9'},{av:'AV50Tipcolcod1',fld:'vTIPCOLCOD1',pic:'Z9'},{av:'AV51Tipcolcod3',fld:'vTIPCOLCOD3',pic:'Z9'},{av:'AV65ConsManuales',fld:'vCONSMANUALES',pic:'9'},{av:'AV13AnalisisCostesHistoricosRecetas_SDTs',fld:'vANALISISCOSTESHISTORICOSRECETAS_SDTS',grid:45,pic:'',hsh:true},{av:'nGXsfl_45_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:45},{av:'nRC_GXsfl_45',ctrl:'GRID',prop:'GridRC',grid:45},{av:'AV54Tot_HreBarKgm',fld:'vTOT_HREBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV56Tot_Costei',fld:'vTOT_COSTEI',pic:'ZZZZZZ9.99',hsh:true},{av:'AV58Tot_CosteT',fld:'vTOT_COSTET',pic:'ZZZZZZ9.99',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__TOA',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREFECTIN',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__MARCA',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HDR',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__BARAGREST',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARKGM',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETOTKGM',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREMAQCOD',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREVOLPRD',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__RB',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTEI',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTET',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__DIF',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__PORC',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTEK',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__CLICOD',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__CLINOM',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARSER',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARDSC',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETIPARTD',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRECOLNOM',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRECOLNUM',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETIPCOLN',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREINTDSC',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__ENCCLI',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREPROCOD',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREPRODSC',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__PRVDSC',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtavDetailwebcomponent_Columnheaderclass',ctrl:'vDETAILWEBCOMPONENT',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__TOA',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREFECTIN',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__MARCA',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HDR',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__BARAGREST',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARKGM',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETOTKGM',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREMAQCOD',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREVOLPRD',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__RB',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTEI',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTET',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__DIF',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__PORC',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTEK',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__CLICOD',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__CLINOM',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARSER',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARDSC',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETIPARTD',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRECOLNOM',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRECOLNUM',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETIPCOLN',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREINTDSC',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__ENCCLI',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREPROCOD',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREPRODSC',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__PRVDSC',prop:'Columnheaderclass'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV54Tot_HreBarKgm',fld:'vTOT_HREBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV56Tot_Costei',fld:'vTOT_COSTEI',pic:'ZZZZZZ9.99',hsh:true},{av:'AV58Tot_CosteT',fld:'vTOT_COSTET',pic:'ZZZZZZ9.99',hsh:true},{av:'AV55TotValue_HreBarKgm',fld:'vTOTVALUE_HREBARKGM',pic:''},{av:'AV57TotValue_Costei',fld:'vTOTVALUE_COSTEI',pic:''},{av:'AV59TotValue_CosteT',fld:'vTOTVALUE_COSTET',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121MJ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV104Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29HreRacab',fld:'vHRERACAB',pic:''},{av:'AV44Fec1',fld:'vFEC1',pic:''},{av:'AV45Fec2',fld:'vFEC2',pic:''},{av:'AV41Calculo',fld:'vCALCULO',pic:'9'},{av:'AV30barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV31barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV32barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV33ARtcod1',fld:'vARTCOD1',pic:''},{av:'AV34ARtcod3',fld:'vARTCOD3',pic:''},{av:'AV37Barcolnom1',fld:'vBARCOLNOM1',pic:''},{av:'AV38Barcolnom3',fld:'vBARCOLNOM3',pic:''},{av:'AV39Barcolnum1',fld:'vBARCOLNUM1',pic:'ZZZZZ9'},{av:'AV40Barcolnum3',fld:'vBARCOLNUM3',pic:'ZZZZZ9'},{av:'AV42Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV43Clicod3',fld:'vCLICOD3',pic:'ZZZZZ9'},{av:'AV46Intcod1',fld:'vINTCOD1',pic:'Z9'},{av:'AV47Intcod3',fld:'vINTCOD3',pic:'Z9'},{av:'AV48TipArtCod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV49TipArtCod3',fld:'vTIPARTCOD3',pic:'ZZZ9'},{av:'AV50Tipcolcod1',fld:'vTIPCOLCOD1',pic:'Z9'},{av:'AV51Tipcolcod3',fld:'vTIPCOLCOD3',pic:'Z9'},{av:'AV65ConsManuales',fld:'vCONSMANUALES',pic:'9'},{av:'AV13AnalisisCostesHistoricosRecetas_SDTs',fld:'vANALISISCOSTESHISTORICOSRECETAS_SDTS',grid:45,pic:'',hsh:true},{av:'nGXsfl_45_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:45},{av:'nRC_GXsfl_45',ctrl:'GRID',prop:'GridRC',grid:45},{av:'AV54Tot_HreBarKgm',fld:'vTOT_HREBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV56Tot_Costei',fld:'vTOT_COSTEI',pic:'ZZZZZZ9.99',hsh:true},{av:'AV58Tot_CosteT',fld:'vTOT_COSTET',pic:'ZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131MJ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV104Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29HreRacab',fld:'vHRERACAB',pic:''},{av:'AV44Fec1',fld:'vFEC1',pic:''},{av:'AV45Fec2',fld:'vFEC2',pic:''},{av:'AV41Calculo',fld:'vCALCULO',pic:'9'},{av:'AV30barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV31barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV32barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV33ARtcod1',fld:'vARTCOD1',pic:''},{av:'AV34ARtcod3',fld:'vARTCOD3',pic:''},{av:'AV37Barcolnom1',fld:'vBARCOLNOM1',pic:''},{av:'AV38Barcolnom3',fld:'vBARCOLNOM3',pic:''},{av:'AV39Barcolnum1',fld:'vBARCOLNUM1',pic:'ZZZZZ9'},{av:'AV40Barcolnum3',fld:'vBARCOLNUM3',pic:'ZZZZZ9'},{av:'AV42Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV43Clicod3',fld:'vCLICOD3',pic:'ZZZZZ9'},{av:'AV46Intcod1',fld:'vINTCOD1',pic:'Z9'},{av:'AV47Intcod3',fld:'vINTCOD3',pic:'Z9'},{av:'AV48TipArtCod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV49TipArtCod3',fld:'vTIPARTCOD3',pic:'ZZZ9'},{av:'AV50Tipcolcod1',fld:'vTIPCOLCOD1',pic:'Z9'},{av:'AV51Tipcolcod3',fld:'vTIPCOLCOD3',pic:'Z9'},{av:'AV65ConsManuales',fld:'vCONSMANUALES',pic:'9'},{av:'AV13AnalisisCostesHistoricosRecetas_SDTs',fld:'vANALISISCOSTESHISTORICOSRECETAS_SDTS',grid:45,pic:'',hsh:true},{av:'nGXsfl_45_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:45},{av:'nRC_GXsfl_45',ctrl:'GRID',prop:'GridRC',grid:45},{av:'AV54Tot_HreBarKgm',fld:'vTOT_HREBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV56Tot_Costei',fld:'vTOT_COSTEI',pic:'ZZZZZZ9.99',hsh:true},{av:'AV58Tot_CosteT',fld:'vTOT_COSTET',pic:'ZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e201MJ2',iparms:[{av:'AV13AnalisisCostesHistoricosRecetas_SDTs',fld:'vANALISISCOSTESHISTORICOSRECETAS_SDTS',grid:45,pic:'',hsh:true},{av:'nGXsfl_45_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:45},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_45',ctrl:'GRID',prop:'GridRC',grid:45}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV60DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{av:'edtavDetailwebcomponent_Columnclass',ctrl:'vDETAILWEBCOMPONENT',prop:'Columnclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__TOA',prop:'Columnclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREFECTIN',prop:'Columnclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__MARCA',prop:'Columnclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HDR',prop:'Columnclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__BARAGREST',prop:'Columnclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARKGM',prop:'Columnclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETOTKGM',prop:'Columnclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREMAQCOD',prop:'Columnclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREVOLPRD',prop:'Columnclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__RB',prop:'Columnclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTEI',prop:'Columnclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTET',prop:'Columnclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__DIF',prop:'Columnclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__PORC',prop:'Columnclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTEK',prop:'Columnclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__CLICOD',prop:'Columnclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__CLINOM',prop:'Columnclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARSER',prop:'Columnclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARDSC',prop:'Columnclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETIPARTD',prop:'Columnclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRECOLNOM',prop:'Columnclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRECOLNUM',prop:'Columnclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETIPCOLN',prop:'Columnclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREINTDSC',prop:'Columnclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__ENCCLI',prop:'Columnclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREPROCOD',prop:'Columnclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREPRODSC',prop:'Columnclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__PRVDSC',prop:'Columnclass'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e141MJ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV104Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29HreRacab',fld:'vHRERACAB',pic:''},{av:'AV44Fec1',fld:'vFEC1',pic:''},{av:'AV45Fec2',fld:'vFEC2',pic:''},{av:'AV41Calculo',fld:'vCALCULO',pic:'9'},{av:'AV30barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV31barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV32barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV33ARtcod1',fld:'vARTCOD1',pic:''},{av:'AV34ARtcod3',fld:'vARTCOD3',pic:''},{av:'AV37Barcolnom1',fld:'vBARCOLNOM1',pic:''},{av:'AV38Barcolnom3',fld:'vBARCOLNOM3',pic:''},{av:'AV39Barcolnum1',fld:'vBARCOLNUM1',pic:'ZZZZZ9'},{av:'AV40Barcolnum3',fld:'vBARCOLNUM3',pic:'ZZZZZ9'},{av:'AV42Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV43Clicod3',fld:'vCLICOD3',pic:'ZZZZZ9'},{av:'AV46Intcod1',fld:'vINTCOD1',pic:'Z9'},{av:'AV47Intcod3',fld:'vINTCOD3',pic:'Z9'},{av:'AV48TipArtCod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV49TipArtCod3',fld:'vTIPARTCOD3',pic:'ZZZ9'},{av:'AV50Tipcolcod1',fld:'vTIPCOLCOD1',pic:'Z9'},{av:'AV51Tipcolcod3',fld:'vTIPCOLCOD3',pic:'Z9'},{av:'AV65ConsManuales',fld:'vCONSMANUALES',pic:'9'},{av:'AV13AnalisisCostesHistoricosRecetas_SDTs',fld:'vANALISISCOSTESHISTORICOSRECETAS_SDTS',grid:45,pic:'',hsh:true},{av:'nGXsfl_45_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:45},{av:'nRC_GXsfl_45',ctrl:'GRID',prop:'GridRC',grid:45},{av:'AV54Tot_HreBarKgm',fld:'vTOT_HREBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV56Tot_Costei',fld:'vTOT_COSTEI',pic:'ZZZZZZ9.99',hsh:true},{av:'AV58Tot_CosteT',fld:'vTOT_COSTET',pic:'ZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__TOA',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREFECTIN',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__MARCA',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HDR',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__BARAGREST',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARKGM',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETOTKGM',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREMAQCOD',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREVOLPRD',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__RB',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTEI',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTET',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__DIF',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__PORC',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTEK',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__CLICOD',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__CLINOM',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARSER',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARDSC',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETIPARTD',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRECOLNOM',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRECOLNUM',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETIPCOLN',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREINTDSC',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__ENCCLI',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREPROCOD',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREPRODSC',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__PRVDSC',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtavDetailwebcomponent_Columnheaderclass',ctrl:'vDETAILWEBCOMPONENT',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__TOA',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREFECTIN',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__MARCA',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HDR',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__BARAGREST',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARKGM',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETOTKGM',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREMAQCOD',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREVOLPRD',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__RB',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTEI',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTET',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__DIF',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__PORC',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTEK',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__CLICOD',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__CLINOM',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARSER',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARDSC',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETIPARTD',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRECOLNOM',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRECOLNUM',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETIPCOLN',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREINTDSC',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__ENCCLI',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREPROCOD',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREPRODSC',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__PRVDSC',prop:'Columnheaderclass'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV54Tot_HreBarKgm',fld:'vTOT_HREBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV56Tot_Costei',fld:'vTOT_COSTEI',pic:'ZZZZZZ9.99',hsh:true},{av:'AV58Tot_CosteT',fld:'vTOT_COSTET',pic:'ZZZZZZ9.99',hsh:true},{av:'AV55TotValue_HreBarKgm',fld:'vTOTVALUE_HREBARKGM',pic:''},{av:'AV57TotValue_Costei',fld:'vTOTVALUE_COSTEI',pic:''},{av:'AV59TotValue_CosteT',fld:'vTOTVALUE_COSTET',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111MJ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV104Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29HreRacab',fld:'vHRERACAB',pic:''},{av:'AV44Fec1',fld:'vFEC1',pic:''},{av:'AV45Fec2',fld:'vFEC2',pic:''},{av:'AV41Calculo',fld:'vCALCULO',pic:'9'},{av:'AV30barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV31barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV32barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV33ARtcod1',fld:'vARTCOD1',pic:''},{av:'AV34ARtcod3',fld:'vARTCOD3',pic:''},{av:'AV37Barcolnom1',fld:'vBARCOLNOM1',pic:''},{av:'AV38Barcolnom3',fld:'vBARCOLNOM3',pic:''},{av:'AV39Barcolnum1',fld:'vBARCOLNUM1',pic:'ZZZZZ9'},{av:'AV40Barcolnum3',fld:'vBARCOLNUM3',pic:'ZZZZZ9'},{av:'AV42Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV43Clicod3',fld:'vCLICOD3',pic:'ZZZZZ9'},{av:'AV46Intcod1',fld:'vINTCOD1',pic:'Z9'},{av:'AV47Intcod3',fld:'vINTCOD3',pic:'Z9'},{av:'AV48TipArtCod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV49TipArtCod3',fld:'vTIPARTCOD3',pic:'ZZZ9'},{av:'AV50Tipcolcod1',fld:'vTIPCOLCOD1',pic:'Z9'},{av:'AV51Tipcolcod3',fld:'vTIPCOLCOD3',pic:'Z9'},{av:'AV65ConsManuales',fld:'vCONSMANUALES',pic:'9'},{av:'AV13AnalisisCostesHistoricosRecetas_SDTs',fld:'vANALISISCOSTESHISTORICOSRECETAS_SDTS',grid:45,pic:'',hsh:true},{av:'nGXsfl_45_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:45},{av:'nRC_GXsfl_45',ctrl:'GRID',prop:'GridRC',grid:45},{av:'AV54Tot_HreBarKgm',fld:'vTOT_HREBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV56Tot_Costei',fld:'vTOT_COSTEI',pic:'ZZZZZZ9.99',hsh:true},{av:'AV58Tot_CosteT',fld:'vTOT_COSTET',pic:'ZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__TOA',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREFECTIN',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__MARCA',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HDR',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__BARAGREST',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARKGM',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETOTKGM',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREMAQCOD',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREVOLPRD',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__RB',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTEI',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTET',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__DIF',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__PORC',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTEK',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__CLICOD',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__CLINOM',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARSER',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARDSC',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETIPARTD',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRECOLNOM',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRECOLNUM',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETIPCOLN',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREINTDSC',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__ENCCLI',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREPROCOD',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREPRODSC',prop:'Visible'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__PRVDSC',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtavDetailwebcomponent_Columnheaderclass',ctrl:'vDETAILWEBCOMPONENT',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__TOA',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREFECTIN',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__MARCA',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HDR',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__BARAGREST',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARKGM',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETOTKGM',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREMAQCOD',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREVOLPRD',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__RB',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTEI',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTET',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__DIF',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__PORC',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTEK',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__CLICOD',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__CLINOM',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARSER',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARDSC',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETIPARTD',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRECOLNOM',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRECOLNUM',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETIPCOLN',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREINTDSC',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__ENCCLI',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREPROCOD',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREPRODSC',prop:'Columnheaderclass'},{ctrl:'ANALISISCOSTESHISTORICOSRECETAS_SDTS__PRVDSC',prop:'Columnheaderclass'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV54Tot_HreBarKgm',fld:'vTOT_HREBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV56Tot_Costei',fld:'vTOT_COSTEI',pic:'ZZZZZZ9.99',hsh:true},{av:'AV58Tot_CosteT',fld:'vTOT_COSTET',pic:'ZZZZZZ9.99',hsh:true},{av:'AV55TotValue_HreBarKgm',fld:'vTOTVALUE_HREBARKGM',pic:''},{av:'AV57TotValue_Costei',fld:'vTOTVALUE_COSTEI',pic:''},{av:'AV59TotValue_CosteT',fld:'vTOTVALUE_COSTET',pic:''}]}");
      setEventMetadata("'DOINFORMEPRODUCTOS'","{handler:'e151MJ2',iparms:[{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29HreRacab',fld:'vHRERACAB',pic:''},{av:'AV44Fec1',fld:'vFEC1',pic:''},{av:'AV45Fec2',fld:'vFEC2',pic:''},{av:'AV33ARtcod1',fld:'vARTCOD1',pic:''},{av:'AV34ARtcod3',fld:'vARTCOD3',pic:''},{av:'AV37Barcolnom1',fld:'vBARCOLNOM1',pic:''},{av:'AV38Barcolnom3',fld:'vBARCOLNOM3',pic:''},{av:'AV39Barcolnum1',fld:'vBARCOLNUM1',pic:'ZZZZZ9'},{av:'AV40Barcolnum3',fld:'vBARCOLNUM3',pic:'ZZZZZ9'},{av:'AV42Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV43Clicod3',fld:'vCLICOD3',pic:'ZZZZZ9'},{av:'AV46Intcod1',fld:'vINTCOD1',pic:'Z9'},{av:'AV47Intcod3',fld:'vINTCOD3',pic:'Z9'},{av:'AV48TipArtCod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV49TipArtCod3',fld:'vTIPARTCOD3',pic:'ZZZ9'},{av:'AV50Tipcolcod1',fld:'vTIPCOLCOD1',pic:'Z9'},{av:'AV51Tipcolcod3',fld:'vTIPCOLCOD3',pic:'Z9'},{av:'AV30barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV31barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV32barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV65ConsManuales',fld:'vCONSMANUALES',pic:'9'}]");
      setEventMetadata("'DOINFORMEPRODUCTOS'",",oparms:[{av:'AV65ConsManuales',fld:'vCONSMANUALES',pic:'9'},{av:'AV32barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV31barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV30barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV51Tipcolcod3',fld:'vTIPCOLCOD3',pic:'Z9'},{av:'AV50Tipcolcod1',fld:'vTIPCOLCOD1',pic:'Z9'},{av:'AV49TipArtCod3',fld:'vTIPARTCOD3',pic:'ZZZ9'},{av:'AV48TipArtCod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV47Intcod3',fld:'vINTCOD3',pic:'Z9'},{av:'AV46Intcod1',fld:'vINTCOD1',pic:'Z9'},{av:'AV43Clicod3',fld:'vCLICOD3',pic:'ZZZZZ9'},{av:'AV42Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV40Barcolnum3',fld:'vBARCOLNUM3',pic:'ZZZZZ9'},{av:'AV39Barcolnum1',fld:'vBARCOLNUM1',pic:'ZZZZZ9'},{av:'AV38Barcolnom3',fld:'vBARCOLNOM3',pic:''},{av:'AV37Barcolnom1',fld:'vBARCOLNOM1',pic:''},{av:'AV34ARtcod3',fld:'vARTCOD3',pic:''},{av:'AV33ARtcod1',fld:'vARTCOD1',pic:''},{av:'AV45Fec2',fld:'vFEC2',pic:''},{av:'AV44Fec1',fld:'vFEC1',pic:''},{av:'AV29HreRacab',fld:'vHRERACAB',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e161MJ2',iparms:[{av:'AV13AnalisisCostesHistoricosRecetas_SDTs',fld:'vANALISISCOSTESHISTORICOSRECETAS_SDTS',grid:45,pic:'',hsh:true},{av:'nGXsfl_45_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:45},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_45',ctrl:'GRID',prop:'GridRC',grid:45}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e171MJ2',iparms:[{av:'AV13AnalisisCostesHistoricosRecetas_SDTs',fld:'vANALISISCOSTESHISTORICOSRECETAS_SDTS',grid:45,pic:'',hsh:true},{av:'nGXsfl_45_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:45},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_45',ctrl:'GRID',prop:'GridRC',grid:45}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e211MJ2',iparms:[{av:'AV13AnalisisCostesHistoricosRecetas_SDTs',fld:'vANALISISCOSTESHISTORICOSRECETAS_SDTS',grid:45,pic:'',hsh:true},{av:'nGXsfl_45_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:45},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_45',ctrl:'GRID',prop:'GridRC',grid:45},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("NULL","{handler:'validv_Gxv34',iparms:[]");
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
      wcpOAV29HreRacab = "" ;
      wcpOAV44Fec1 = GXutil.nullDate() ;
      wcpOAV45Fec2 = GXutil.nullDate() ;
      wcpOAV32barcodpar = "" ;
      wcpOAV33ARtcod1 = "" ;
      wcpOAV34ARtcod3 = "" ;
      wcpOAV37Barcolnom1 = "" ;
      wcpOAV38Barcolnom3 = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV28Emprcod = "" ;
      AV29HreRacab = "" ;
      AV44Fec1 = GXutil.nullDate() ;
      AV45Fec2 = GXutil.nullDate() ;
      AV32barcodpar = "" ;
      AV33ARtcod1 = "" ;
      AV34ARtcod3 = "" ;
      AV37Barcolnom1 = "" ;
      AV38Barcolnom3 = "" ;
      AV18ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV104Pgmname = "" ;
      AV12FilterFullText = "" ;
      AV13AnalisisCostesHistoricosRecetas_SDTs = new GXBaseCollection<app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT>(app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT.class, "AnalisisCostesHistoricosRecetas_SDT", "TexplusNET", remoteHandle);
      AV54Tot_HreBarKgm = DecimalUtil.ZERO ;
      AV56Tot_Costei = DecimalUtil.ZERO ;
      AV58Tot_CosteT = DecimalUtil.ZERO ;
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
      bttBtninformeproductos_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      WebComp_Grid_dwc_Component = "" ;
      OldGrid_dwc = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV60DetailWebComponent = "" ;
      AV55TotValue_HreBarKgm = "" ;
      AV57TotValue_Costei = "" ;
      AV59TotValue_CosteT = "" ;
      hsh = "" ;
      AV105Station = "" ;
      AV106Emprnom = "" ;
      AV107Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXt_objcol_SdtAnalisisCostesHistoricosRecetas_SDT7 = new GXBaseCollection<app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT>(app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT.class, "AnalisisCostesHistoricosRecetas_SDT", "TexplusNET", remoteHandle);
      GXv_objcol_SdtAnalisisCostesHistoricosRecetas_SDT8 = new GXBaseCollection[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV20Session = httpContext.getWebSession();
      AV16ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV22ManageFiltersXml = "" ;
      AV66ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_date10 = new java.util.Date[1] ;
      GXv_date11 = new java.util.Date[1] ;
      GXv_char2 = new String[1] ;
      GXv_char12 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_char14 = new String[1] ;
      GXv_int15 = new int[1] ;
      GXv_int16 = new int[1] ;
      GXv_int17 = new int[1] ;
      GXv_int18 = new int[1] ;
      GXv_int19 = new byte[1] ;
      GXv_int20 = new byte[1] ;
      GXv_int21 = new short[1] ;
      GXv_int22 = new short[1] ;
      GXv_int23 = new byte[1] ;
      GXv_int24 = new byte[1] ;
      GXv_int25 = new int[1] ;
      GXv_int26 = new byte[1] ;
      GXv_char27 = new String[1] ;
      GXv_int28 = new byte[1] ;
      AV14ExcelFilename = "" ;
      AV15ErrorMessage = "" ;
      AV52AnalisisCostesHistoricosRecetas_ToJson = "" ;
      AV67websession = httpContext.getWebSession();
      GXv_char29 = new String[1] ;
      AV64Hrebarpar = "" ;
      AV63Hremaqcod = "" ;
      AV17UserCustomValue = "" ;
      GXt_char1 = "" ;
      GXv_char30 = new String[1] ;
      AV19ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector31 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector32 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item33 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item34 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState35 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV53AnalisisCostesHistoricosRecetas_SDTsItem = new app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV28Emprcod = "" ;
      sCtrlAV29HreRacab = "" ;
      sCtrlAV44Fec1 = "" ;
      sCtrlAV45Fec2 = "" ;
      sCtrlAV41Calculo = "" ;
      sCtrlAV30barcod = "" ;
      sCtrlAV31barcodreo = "" ;
      sCtrlAV32barcodpar = "" ;
      sCtrlAV33ARtcod1 = "" ;
      sCtrlAV34ARtcod3 = "" ;
      sCtrlAV37Barcolnom1 = "" ;
      sCtrlAV38Barcolnom3 = "" ;
      sCtrlAV39Barcolnum1 = "" ;
      sCtrlAV40Barcolnum3 = "" ;
      sCtrlAV42Clicod1 = "" ;
      sCtrlAV43Clicod3 = "" ;
      sCtrlAV46Intcod1 = "" ;
      sCtrlAV47Intcod3 = "" ;
      sCtrlAV48TipArtCod1 = "" ;
      sCtrlAV49TipArtCod3 = "" ;
      sCtrlAV50Tipcolcod1 = "" ;
      sCtrlAV51Tipcolcod3 = "" ;
      sCtrlAV65ConsManuales = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV104Pgmname = "FormulacionTinte.AnalisisCostesHistoricosRecetas_SDT_WC" ;
      /* GeneXus formulas. */
      AV104Pgmname = "FormulacionTinte.AnalisisCostesHistoricosRecetas_SDT_WC" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__toa_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__marca_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__rb_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costei_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costet_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__dif_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__porc_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costek_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Enabled = 0 ;
      edtavTotvalue_hrebarkgm_Enabled = 0 ;
      edtavTotvalue_costei_Enabled = 0 ;
      edtavTotvalue_costet_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV41Calculo ;
   private byte wcpOAV31barcodreo ;
   private byte wcpOAV46Intcod1 ;
   private byte wcpOAV47Intcod3 ;
   private byte wcpOAV50Tipcolcod1 ;
   private byte wcpOAV51Tipcolcod3 ;
   private byte wcpOAV65ConsManuales ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV41Calculo ;
   private byte AV31barcodreo ;
   private byte AV46Intcod1 ;
   private byte AV47Intcod3 ;
   private byte AV50Tipcolcod1 ;
   private byte AV51Tipcolcod3 ;
   private byte AV65ConsManuales ;
   private byte AV23ManageFiltersExecutionStep ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXv_int19[] ;
   private byte GXv_int20[] ;
   private byte GXv_int23[] ;
   private byte GXv_int24[] ;
   private byte GXv_int26[] ;
   private byte GXv_int28[] ;
   private byte AV62Hrebarreo ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV48TipArtCod1 ;
   private short wcpOAV49TipArtCod3 ;
   private short AV48TipArtCod1 ;
   private short AV49TipArtCod3 ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int21[] ;
   private short GXv_int22[] ;
   private int wcpOAV30barcod ;
   private int wcpOAV39Barcolnum1 ;
   private int wcpOAV40Barcolnum3 ;
   private int wcpOAV42Clicod1 ;
   private int wcpOAV43Clicod3 ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int AV30barcod ;
   private int AV39Barcolnum1 ;
   private int AV40Barcolnum3 ;
   private int AV42Clicod1 ;
   private int AV43Clicod3 ;
   private int nGXsfl_45_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV70GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavDetailwebcomponent_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__toa_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__marca_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__rb_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__costei_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__costet_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__dif_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__porc_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__costek_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Enabled ;
   private int edtavTotvalue_hrebarkgm_Enabled ;
   private int edtavTotvalue_costei_Enabled ;
   private int edtavTotvalue_costet_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_45_fel_idx=1 ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__toa_Visible ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Visible ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__marca_Visible ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Visible ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Visible ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Visible ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Visible ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Visible ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Visible ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__rb_Visible ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__costei_Visible ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__costet_Visible ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__dif_Visible ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__porc_Visible ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__costek_Visible ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Visible ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Visible ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Visible ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Visible ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Visible ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Visible ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Visible ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Visible ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Visible ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Visible ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Visible ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Visible ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Visible ;
   private int AV25PageToGo ;
   private int GXv_int15[] ;
   private int GXv_int16[] ;
   private int GXv_int17[] ;
   private int GXv_int18[] ;
   private int GXv_int25[] ;
   private int AV61Hrebarcod ;
   private int AV108GXV35 ;
   private int AV109GXV36 ;
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
   private java.math.BigDecimal AV54Tot_HreBarKgm ;
   private java.math.BigDecimal AV56Tot_Costei ;
   private java.math.BigDecimal AV58Tot_CosteT ;
   private String wcpOAV28Emprcod ;
   private String wcpOAV29HreRacab ;
   private String wcpOAV32barcodpar ;
   private String wcpOAV33ARtcod1 ;
   private String wcpOAV34ARtcod3 ;
   private String wcpOAV37Barcolnom1 ;
   private String wcpOAV38Barcolnom3 ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV28Emprcod ;
   private String AV29HreRacab ;
   private String AV32barcodpar ;
   private String AV33ARtcod1 ;
   private String AV34ARtcod3 ;
   private String AV37Barcolnom1 ;
   private String AV38Barcolnom3 ;
   private String sGXsfl_45_idx="0001" ;
   private String AV104Pgmname ;
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
   private String bttBtninformeproductos_Internalname ;
   private String bttBtninformeproductos_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String Barradeprogreso_Internalname ;
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
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavDetailwebcomponent_Internalname ;
   private String AV60DetailWebComponent ;
   private String edtavFilterfulltext_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__toa_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__marca_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__rb_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__costei_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__costet_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__dif_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__porc_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__costek_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Internalname ;
   private String edtavTotvalue_hrebarkgm_Internalname ;
   private String edtavTotvalue_costei_Internalname ;
   private String edtavTotvalue_costet_Internalname ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String hsh ;
   private String AV105Station ;
   private String AV106Emprnom ;
   private String AV107Usurcod ;
   private String edtavDetailwebcomponent_Columnheaderclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__toa_Columnheaderclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Columnheaderclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__marca_Columnheaderclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Columnheaderclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Columnheaderclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Columnheaderclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Columnheaderclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Columnheaderclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Columnheaderclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__rb_Columnheaderclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__costei_Columnheaderclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__costet_Columnheaderclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__dif_Columnheaderclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__porc_Columnheaderclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__costek_Columnheaderclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Columnheaderclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Columnheaderclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Columnheaderclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Columnheaderclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Columnheaderclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Columnheaderclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Columnheaderclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Columnheaderclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Columnheaderclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Columnheaderclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Columnheaderclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Columnheaderclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Columnheaderclass ;
   private String edtavDetailwebcomponent_Columnclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__toa_Columnclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Columnclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__marca_Columnclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Columnclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Columnclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Columnclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Columnclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Columnclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Columnclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__rb_Columnclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__costei_Columnclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__costet_Columnclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__dif_Columnclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__porc_Columnclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__costek_Columnclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Columnclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Columnclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Columnclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Columnclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Columnclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Columnclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Columnclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Columnclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Columnclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Columnclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Columnclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Columnclass ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Columnclass ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private String GXv_char14[] ;
   private String GXv_char27[] ;
   private String GXv_char29[] ;
   private String AV64Hrebarpar ;
   private String AV63Hremaqcod ;
   private String GXt_char1 ;
   private String GXv_char30[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvalue_hrebarkgm_Jsonclick ;
   private String edtavTotvalue_costei_Jsonclick ;
   private String edtavTotvalue_costet_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV28Emprcod ;
   private String sCtrlAV29HreRacab ;
   private String sCtrlAV44Fec1 ;
   private String sCtrlAV45Fec2 ;
   private String sCtrlAV41Calculo ;
   private String sCtrlAV30barcod ;
   private String sCtrlAV31barcodreo ;
   private String sCtrlAV32barcodpar ;
   private String sCtrlAV33ARtcod1 ;
   private String sCtrlAV34ARtcod3 ;
   private String sCtrlAV37Barcolnom1 ;
   private String sCtrlAV38Barcolnom3 ;
   private String sCtrlAV39Barcolnum1 ;
   private String sCtrlAV40Barcolnum3 ;
   private String sCtrlAV42Clicod1 ;
   private String sCtrlAV43Clicod3 ;
   private String sCtrlAV46Intcod1 ;
   private String sCtrlAV47Intcod3 ;
   private String sCtrlAV48TipArtCod1 ;
   private String sCtrlAV49TipArtCod3 ;
   private String sCtrlAV50Tipcolcod1 ;
   private String sCtrlAV51Tipcolcod3 ;
   private String sCtrlAV65ConsManuales ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__toa_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__marca_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__rb_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__costei_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__costet_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__dif_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__porc_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__costek_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hreprocod_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hreprodsc_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__prvdsc_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV44Fec1 ;
   private java.util.Date wcpOAV45Fec2 ;
   private java.util.Date AV44Fec1 ;
   private java.util.Date AV45Fec2 ;
   private java.util.Date GXv_date10[] ;
   private java.util.Date GXv_date11[] ;
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
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV45 ;
   private boolean gx_refresh_fired ;
   private boolean bDynCreated_Grid_dwc ;
   private String AV16ColumnsSelectorXML ;
   private String AV22ManageFiltersXml ;
   private String AV52AnalisisCostesHistoricosRecetas_ToJson ;
   private String AV17UserCustomValue ;
   private String AV12FilterFullText ;
   private String AV55TotValue_HreBarKgm ;
   private String AV57TotValue_Costei ;
   private String AV59TotValue_CosteT ;
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
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV66ProgressIndicator ;
   private com.genexus.webpanels.WebSession AV67websession ;
   private GXBaseCollection<app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT> AV13AnalisisCostesHistoricosRecetas_SDTs ;
   private GXBaseCollection<app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT> GXt_objcol_SdtAnalisisCostesHistoricosRecetas_SDT7 ;
   private GXBaseCollection<app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT> GXv_objcol_SdtAnalisisCostesHistoricosRecetas_SDT8[] ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV21ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item33 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item34[] ;
   private app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT AV53AnalisisCostesHistoricosRecetas_SDTsItem ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector31[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector32[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV24DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState35[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

