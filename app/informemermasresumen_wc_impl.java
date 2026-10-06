package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informemermasresumen_wc_impl extends GXWebComponent
{
   public informemermasresumen_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public informemermasresumen_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informemermasresumen_wc_impl.class ));
   }

   public informemermasresumen_wc_impl( int remoteHandle ,
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
               AV25Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Emprcod", AV25Emprcod);
               AV10BarFecSal = localUtil.parseDateParm( httpContext.GetPar( "BarFecSal")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarFecSal", localUtil.format(AV10BarFecSal, "99/99/99"));
               AV11BarFecSal_To = localUtil.parseDateParm( httpContext.GetPar( "BarFecSal_To")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarFecSal_To", localUtil.format(AV11BarFecSal_To, "99/99/99"));
               AV8BarColNom = httpContext.GetPar( "BarColNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarColNom", AV8BarColNom);
               AV9BarColNom_To = httpContext.GetPar( "BarColNom_To") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarColNom_To", AV9BarColNom_To);
               AV65BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65BarColNum), 6, 0));
               AV66BarColNum_to = (int)(GXutil.lval( httpContext.GetPar( "BarColNum_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66BarColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66BarColNum_to), 6, 0));
               AV12BarSer = httpContext.GetPar( "BarSer") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12BarSer", AV12BarSer);
               AV13BarSer_To = httpContext.GetPar( "BarSer_To") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13BarSer_To", AV13BarSer_To);
               AV14CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CliCod), 6, 0));
               AV15CliCod_To = (int)(GXutil.lval( httpContext.GetPar( "CliCod_To"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15CliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCod_To), 6, 0));
               AV69BarEncCli = httpContext.GetPar( "BarEncCli") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69BarEncCli", AV69BarEncCli);
               AV71BarEncCli_To = httpContext.GetPar( "BarEncCli_To") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71BarEncCli_To", AV71BarEncCli_To);
               AV63BarTipArt = (short)(GXutil.lval( httpContext.GetPar( "BarTipArt"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63BarTipArt), 4, 0));
               AV64BarTipArt_to = (short)(GXutil.lval( httpContext.GetPar( "BarTipArt_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64BarTipArt_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64BarTipArt_to), 4, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV25Emprcod,AV10BarFecSal,AV11BarFecSal_To,AV8BarColNom,AV9BarColNom_To,Integer.valueOf(AV65BarColNum),Integer.valueOf(AV66BarColNum_to),AV12BarSer,AV13BarSer_To,Integer.valueOf(AV14CliCod),Integer.valueOf(AV15CliCod_To),AV69BarEncCli,AV71BarEncCli_To,Short.valueOf(AV63BarTipArt),Short.valueOf(AV64BarTipArt_to)});
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
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV16ColumnsSelector);
      AV25Emprcod = httpContext.GetPar( "Emprcod") ;
      AV60ImpCod = httpContext.GetPar( "ImpCod") ;
      AV63BarTipArt = (short)(GXutil.lval( httpContext.GetPar( "BarTipArt"))) ;
      AV64BarTipArt_to = (short)(GXutil.lval( httpContext.GetPar( "BarTipArt_to"))) ;
      AV14CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV15CliCod_To = (int)(GXutil.lval( httpContext.GetPar( "CliCod_To"))) ;
      AV12BarSer = httpContext.GetPar( "BarSer") ;
      AV13BarSer_To = httpContext.GetPar( "BarSer_To") ;
      AV8BarColNom = httpContext.GetPar( "BarColNom") ;
      AV9BarColNom_To = httpContext.GetPar( "BarColNom_To") ;
      AV65BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
      AV66BarColNum_to = (int)(GXutil.lval( httpContext.GetPar( "BarColNum_to"))) ;
      AV61PDisCli = httpContext.GetPar( "PDisCli") ;
      AV62UDisCli = httpContext.GetPar( "UDisCli") ;
      AV10BarFecSal = localUtil.parseDateParm( httpContext.GetPar( "BarFecSal")) ;
      AV11BarFecSal_To = localUtil.parseDateParm( httpContext.GetPar( "BarFecSal_To")) ;
      AV104Pgmname = httpContext.GetPar( "Pgmname") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV53SDTMermasResumenClientes);
      AV40KilosEnt = CommonUtil.decimalVal( httpContext.GetPar( "KilosEnt"), ".") ;
      AV41KilosExp = CommonUtil.decimalVal( httpContext.GetPar( "KilosExp"), ".") ;
      AV20DifKilos = CommonUtil.decimalVal( httpContext.GetPar( "DifKilos"), ".") ;
      AV45MetrosEnt = CommonUtil.decimalVal( httpContext.GetPar( "MetrosEnt"), ".") ;
      AV46MetrosExp = CommonUtil.decimalVal( httpContext.GetPar( "MetrosExp"), ".") ;
      AV21DifMetros = CommonUtil.decimalVal( httpContext.GetPar( "DifMetros"), ".") ;
      AV81TotKilosEnt = CommonUtil.decimalVal( httpContext.GetPar( "TotKilosEnt"), ".") ;
      AV85TotKilosExp = CommonUtil.decimalVal( httpContext.GetPar( "TotKilosExp"), ".") ;
      AV87TotDifKilos = CommonUtil.decimalVal( httpContext.GetPar( "TotDifKilos"), ".") ;
      AV89TotMetrosEnt = CommonUtil.decimalVal( httpContext.GetPar( "TotMetrosEnt"), ".") ;
      AV91TotMetrosExp = CommonUtil.decimalVal( httpContext.GetPar( "TotMetrosExp"), ".") ;
      AV93TotDifMetros = CommonUtil.decimalVal( httpContext.GetPar( "TotDifMetros"), ".") ;
      AV73TotalKilosEnt = CommonUtil.decimalVal( httpContext.GetPar( "TotalKilosEnt"), ".") ;
      AV74TotalKilosExp = CommonUtil.decimalVal( httpContext.GetPar( "TotalKilosExp"), ".") ;
      AV75TotalDifKilos = CommonUtil.decimalVal( httpContext.GetPar( "TotalDifKilos"), ".") ;
      AV77TotalMetrosEnt = CommonUtil.decimalVal( httpContext.GetPar( "TotalMetrosEnt"), ".") ;
      AV78TotalMetrosExp = CommonUtil.decimalVal( httpContext.GetPar( "TotalMetrosExp"), ".") ;
      AV79TotalDifMetros = CommonUtil.decimalVal( httpContext.GetPar( "TotalDifMetros"), ".") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV16ColumnsSelector, AV25Emprcod, AV60ImpCod, AV63BarTipArt, AV64BarTipArt_to, AV14CliCod, AV15CliCod_To, AV12BarSer, AV13BarSer_To, AV8BarColNom, AV9BarColNom_To, AV65BarColNum, AV66BarColNum_to, AV61PDisCli, AV62UDisCli, AV10BarFecSal, AV11BarFecSal_To, AV104Pgmname, AV53SDTMermasResumenClientes, AV40KilosEnt, AV41KilosExp, AV20DifKilos, AV45MetrosEnt, AV46MetrosExp, AV21DifMetros, AV81TotKilosEnt, AV85TotKilosExp, AV87TotDifKilos, AV89TotMetrosEnt, AV91TotMetrosExp, AV93TotDifMetros, AV73TotalKilosEnt, AV74TotalKilosExp, AV75TotalDifKilos, AV77TotalMetrosEnt, AV78TotalMetrosExp, AV79TotalDifMetros, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1QN2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Informe de Mermas Resumido", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.informemermasresumen_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV25Emprcod)),GXutil.URLEncode(GXutil.formatDateParm(AV10BarFecSal)),GXutil.URLEncode(GXutil.formatDateParm(AV11BarFecSal_To)),GXutil.URLEncode(GXutil.rtrim(AV8BarColNom)),GXutil.URLEncode(GXutil.rtrim(AV9BarColNom_To)),GXutil.URLEncode(GXutil.ltrimstr(AV65BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV66BarColNum_to,6,0)),GXutil.URLEncode(GXutil.rtrim(AV12BarSer)),GXutil.URLEncode(GXutil.rtrim(AV13BarSer_To)),GXutil.URLEncode(GXutil.ltrimstr(AV14CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV15CliCod_To,6,0)),GXutil.URLEncode(GXutil.rtrim(AV69BarEncCli)),GXutil.URLEncode(GXutil.rtrim(AV71BarEncCli_To)),GXutil.URLEncode(GXutil.ltrimstr(AV63BarTipArt,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV64BarTipArt_to,4,0))}, new String[] {"Emprcod","BarFecSal","BarFecSal_To","BarColNom","BarColNom_To","BarColNum","BarColNum_to","BarSer","BarSer_To","CliCod","CliCod_To","BarEncCli","BarEncCli_To","BarTipArt","BarTipArt_to"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPDISCLI", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV61PDisCli, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUDISCLI", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV62UDisCli, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV104Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKILOSENT", getSecureSignedToken( sPrefix, localUtil.format( AV81TotKilosEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKILOSEXP", getSecureSignedToken( sPrefix, localUtil.format( AV85TotKilosExp, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDIFKILOS", getSecureSignedToken( sPrefix, localUtil.format( AV87TotDifKilos, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETROSENT", getSecureSignedToken( sPrefix, localUtil.format( AV89TotMetrosEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETROSEXP", getSecureSignedToken( sPrefix, localUtil.format( AV91TotMetrosExp, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDIFMETROS", getSecureSignedToken( sPrefix, localUtil.format( AV93TotDifMetros, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALKILOSENT", getSecureSignedToken( sPrefix, localUtil.format( AV73TotalKilosEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALKILOSEXP", getSecureSignedToken( sPrefix, localUtil.format( AV74TotalKilosExp, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALDIFKILOS", getSecureSignedToken( sPrefix, localUtil.format( AV75TotalDifKilos, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALMETROSENT", getSecureSignedToken( sPrefix, localUtil.format( AV77TotalMetrosEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALMETROSEXP", getSecureSignedToken( sPrefix, localUtil.format( AV78TotalMetrosExp, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALDIFMETROS", getSecureSignedToken( sPrefix, localUtil.format( AV79TotalDifMetros, "ZZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Sdtmermasresumenclientes", AV53SDTMermasResumenClientes);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Sdtmermasresumenclientes", AV53SDTMermasResumenClientes);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_39", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_39, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV30GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV31GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV19DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV19DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV16ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV16ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV25Emprcod", GXutil.rtrim( wcpOAV25Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10BarFecSal", localUtil.dtoc( wcpOAV10BarFecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11BarFecSal_To", localUtil.dtoc( wcpOAV11BarFecSal_To, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8BarColNom", GXutil.rtrim( wcpOAV8BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9BarColNom_To", GXutil.rtrim( wcpOAV9BarColNom_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV65BarColNum", GXutil.ltrim( localUtil.ntoc( wcpOAV65BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV66BarColNum_to", GXutil.ltrim( localUtil.ntoc( wcpOAV66BarColNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV12BarSer", GXutil.rtrim( wcpOAV12BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV13BarSer_To", GXutil.rtrim( wcpOAV13BarSer_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV14CliCod", GXutil.ltrim( localUtil.ntoc( wcpOAV14CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV15CliCod_To", GXutil.ltrim( localUtil.ntoc( wcpOAV15CliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV69BarEncCli", GXutil.rtrim( wcpOAV69BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV71BarEncCli_To", GXutil.rtrim( wcpOAV71BarEncCli_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV63BarTipArt", GXutil.ltrim( localUtil.ntoc( wcpOAV63BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV64BarTipArt_to", GXutil.ltrim( localUtil.ntoc( wcpOAV64BarTipArt_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV25Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIMPCOD", GXutil.rtrim( AV60ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARTIPART", GXutil.ltrim( localUtil.ntoc( AV63BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARTIPART_TO", GXutil.ltrim( localUtil.ntoc( AV64BarTipArt_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV14CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV15CliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSER", GXutil.rtrim( AV12BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSER_TO", GXutil.rtrim( AV13BarSer_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOM", GXutil.rtrim( AV8BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOM_TO", GXutil.rtrim( AV9BarColNom_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV65BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV66BarColNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPDISCLI", GXutil.rtrim( AV61PDisCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPDISCLI", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV61PDisCli, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUDISCLI", GXutil.rtrim( AV62UDisCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUDISCLI", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV62UDisCli, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECSAL", localUtil.dtoc( AV10BarFecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECSAL_TO", localUtil.dtoc( AV11BarFecSal_To, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV104Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV104Pgmname, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTMERMASRESUMENCLIENTES", AV53SDTMermasResumenClientes);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTMERMASRESUMENCLIENTES", AV53SDTMermasResumenClientes);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTKILOSENT", GXutil.ltrim( localUtil.ntoc( AV81TotKilosEnt, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKILOSENT", getSecureSignedToken( sPrefix, localUtil.format( AV81TotKilosEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTKILOSEXP", GXutil.ltrim( localUtil.ntoc( AV85TotKilosExp, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKILOSEXP", getSecureSignedToken( sPrefix, localUtil.format( AV85TotKilosExp, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTDIFKILOS", GXutil.ltrim( localUtil.ntoc( AV87TotDifKilos, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDIFKILOS", getSecureSignedToken( sPrefix, localUtil.format( AV87TotDifKilos, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMETROSENT", GXutil.ltrim( localUtil.ntoc( AV89TotMetrosEnt, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETROSENT", getSecureSignedToken( sPrefix, localUtil.format( AV89TotMetrosEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMETROSEXP", GXutil.ltrim( localUtil.ntoc( AV91TotMetrosExp, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETROSEXP", getSecureSignedToken( sPrefix, localUtil.format( AV91TotMetrosExp, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTDIFMETROS", GXutil.ltrim( localUtil.ntoc( AV93TotDifMetros, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDIFMETROS", getSecureSignedToken( sPrefix, localUtil.format( AV93TotDifMetros, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALKILOSENT", GXutil.ltrim( localUtil.ntoc( AV73TotalKilosEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALKILOSENT", getSecureSignedToken( sPrefix, localUtil.format( AV73TotalKilosEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALKILOSEXP", GXutil.ltrim( localUtil.ntoc( AV74TotalKilosExp, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALKILOSEXP", getSecureSignedToken( sPrefix, localUtil.format( AV74TotalKilosExp, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALDIFKILOS", GXutil.ltrim( localUtil.ntoc( AV75TotalDifKilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALDIFKILOS", getSecureSignedToken( sPrefix, localUtil.format( AV75TotalDifKilos, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALMETROSENT", GXutil.ltrim( localUtil.ntoc( AV77TotalMetrosEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALMETROSENT", getSecureSignedToken( sPrefix, localUtil.format( AV77TotalMetrosEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALMETROSEXP", GXutil.ltrim( localUtil.ntoc( AV78TotalMetrosExp, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALMETROSEXP", getSecureSignedToken( sPrefix, localUtil.format( AV78TotalMetrosExp, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALDIFMETROS", GXutil.ltrim( localUtil.ntoc( AV79TotalDifMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALDIFMETROS", getSecureSignedToken( sPrefix, localUtil.format( AV79TotalDifMetros, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARENCCLI", GXutil.rtrim( AV69BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARENCCLI_TO", GXutil.rtrim( AV71BarEncCli_To));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
   }

   public void renderHtmlCloseForm1QN2( )
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
      return "InformeMermasResumen_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informe de Mermas Resumido", "") ;
   }

   public void wb1QN0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.informemermasresumen_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 39, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_InformeMermasResumen_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 39, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_InformeMermasResumen_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 39, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_InformeMermasResumen_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 39, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_InformeMermasResumen_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_1QN2( true) ;
      }
      else
      {
         wb_table1_25_1QN2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_1QN2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTbl_gridlineas_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
            AV98GXV1 = nGXsfl_39_idx ;
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
         wb_table2_52_1QN2( true) ;
      }
      else
      {
         wb_table2_52_1QN2( false) ;
      }
      return  ;
   }

   public void wb_table2_52_1QN2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV30GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV31GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV19DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, sPrefix+"INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV19DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV16ColumnsSelector);
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
               AV98GXV1 = nGXsfl_39_idx ;
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

   public void start1QN2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Informe de Mermas Resumido", ""), (short)(0)) ;
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
            strup1QN0( ) ;
         }
      }
   }

   public void ws1QN2( )
   {
      start1QN2( ) ;
      evt1QN2( ) ;
   }

   public void evt1QN2( )
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
                              strup1QN0( ) ;
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
                              strup1QN0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111QN2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1QN0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121QN2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1QN0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131QN2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1QN0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e141QN2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1QN0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportReport' */
                                 e151QN2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1QN0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e161QN2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1QN0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavTotvaluekilosent_Internalname ;
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
                              strup1QN0( ) ;
                           }
                           nGXsfl_39_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_392( ) ;
                           AV98GXV1 = (int)(nGXsfl_39_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV53SDTMermasResumenClientes.size() >= AV98GXV1 ) && ( AV98GXV1 > 0 ) )
                           {
                              AV53SDTMermasResumenClientes.currentItem( ((app.SdtSDTMermasResumenCliente)AV53SDTMermasResumenClientes.elementAt(-1+AV98GXV1)) );
                              AV40KilosEnt = localUtil.ctond( httpContext.cgiGet( edtavKilosent_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavKilosent_Internalname, GXutil.ltrimstr( AV40KilosEnt, 9, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vKILOSENT"+"_"+sGXsfl_39_idx, getSecureSignedToken( sPrefix+sGXsfl_39_idx, localUtil.format( AV40KilosEnt, "ZZZZZ9.99")));
                              AV41KilosExp = localUtil.ctond( httpContext.cgiGet( edtavKilosexp_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavKilosexp_Internalname, GXutil.ltrimstr( AV41KilosExp, 9, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vKILOSEXP"+"_"+sGXsfl_39_idx, getSecureSignedToken( sPrefix+sGXsfl_39_idx, localUtil.format( AV41KilosExp, "ZZZZZ9.99")));
                              AV20DifKilos = localUtil.ctond( httpContext.cgiGet( edtavDifkilos_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifkilos_Internalname, GXutil.ltrimstr( AV20DifKilos, 9, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDIFKILOS"+"_"+sGXsfl_39_idx, getSecureSignedToken( sPrefix+sGXsfl_39_idx, localUtil.format( AV20DifKilos, "ZZZZZ9.99")));
                              AV50PorKilos = localUtil.ctond( httpContext.cgiGet( edtavPorkilos_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPorkilos_Internalname, GXutil.ltrimstr( AV50PorKilos, 6, 2));
                              AV45MetrosEnt = localUtil.ctond( httpContext.cgiGet( edtavMetrosent_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMetrosent_Internalname, GXutil.ltrimstr( AV45MetrosEnt, 9, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMETROSENT"+"_"+sGXsfl_39_idx, getSecureSignedToken( sPrefix+sGXsfl_39_idx, localUtil.format( AV45MetrosEnt, "ZZZZZ9.99")));
                              AV46MetrosExp = localUtil.ctond( httpContext.cgiGet( edtavMetrosexp_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMetrosexp_Internalname, GXutil.ltrimstr( AV46MetrosExp, 9, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMETROSEXP"+"_"+sGXsfl_39_idx, getSecureSignedToken( sPrefix+sGXsfl_39_idx, localUtil.format( AV46MetrosExp, "ZZZZZ9.99")));
                              AV21DifMetros = localUtil.ctond( httpContext.cgiGet( edtavDifmetros_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifmetros_Internalname, GXutil.ltrimstr( AV21DifMetros, 9, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDIFMETROS"+"_"+sGXsfl_39_idx, getSecureSignedToken( sPrefix+sGXsfl_39_idx, localUtil.format( AV21DifMetros, "ZZZZZ9.99")));
                              AV51PorMetros = localUtil.ctond( httpContext.cgiGet( edtavPormetros_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPormetros_Internalname, GXutil.ltrimstr( AV51PorMetros, 6, 2));
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
                                       GX_FocusControl = edtavTotvaluekilosent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e171QN2 ();
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
                                       GX_FocusControl = edtavTotvaluekilosent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e181QN2 ();
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
                                       GX_FocusControl = edtavTotvaluekilosent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e191QN2 ();
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
                                    strup1QN0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavTotvaluekilosent_Internalname ;
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

   public void we1QN2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1QN2( ) ;
         }
      }
   }

   public void pa1QN2( )
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
            GX_FocusControl = edtavTotvaluekilosent_Internalname ;
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
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelector ,
                                 String AV25Emprcod ,
                                 String AV60ImpCod ,
                                 short AV63BarTipArt ,
                                 short AV64BarTipArt_to ,
                                 int AV14CliCod ,
                                 int AV15CliCod_To ,
                                 String AV12BarSer ,
                                 String AV13BarSer_To ,
                                 String AV8BarColNom ,
                                 String AV9BarColNom_To ,
                                 int AV65BarColNum ,
                                 int AV66BarColNum_to ,
                                 String AV61PDisCli ,
                                 String AV62UDisCli ,
                                 java.util.Date AV10BarFecSal ,
                                 java.util.Date AV11BarFecSal_To ,
                                 String AV104Pgmname ,
                                 GXBaseCollection<app.SdtSDTMermasResumenCliente> AV53SDTMermasResumenClientes ,
                                 java.math.BigDecimal AV40KilosEnt ,
                                 java.math.BigDecimal AV41KilosExp ,
                                 java.math.BigDecimal AV20DifKilos ,
                                 java.math.BigDecimal AV45MetrosEnt ,
                                 java.math.BigDecimal AV46MetrosExp ,
                                 java.math.BigDecimal AV21DifMetros ,
                                 java.math.BigDecimal AV81TotKilosEnt ,
                                 java.math.BigDecimal AV85TotKilosExp ,
                                 java.math.BigDecimal AV87TotDifKilos ,
                                 java.math.BigDecimal AV89TotMetrosEnt ,
                                 java.math.BigDecimal AV91TotMetrosExp ,
                                 java.math.BigDecimal AV93TotDifMetros ,
                                 java.math.BigDecimal AV73TotalKilosEnt ,
                                 java.math.BigDecimal AV74TotalKilosExp ,
                                 java.math.BigDecimal AV75TotalDifKilos ,
                                 java.math.BigDecimal AV77TotalMetrosEnt ,
                                 java.math.BigDecimal AV78TotalMetrosExp ,
                                 java.math.BigDecimal AV79TotalDifMetros ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e181QN2 ();
      GRID_nCurrentRecord = 0 ;
      rf1QN2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vKILOSENT", getSecureSignedToken( sPrefix, localUtil.format( AV40KilosEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vKILOSENT", GXutil.ltrim( localUtil.ntoc( AV40KilosEnt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vKILOSEXP", getSecureSignedToken( sPrefix, localUtil.format( AV41KilosExp, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vKILOSEXP", GXutil.ltrim( localUtil.ntoc( AV41KilosExp, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDIFKILOS", getSecureSignedToken( sPrefix, localUtil.format( AV20DifKilos, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDIFKILOS", GXutil.ltrim( localUtil.ntoc( AV20DifKilos, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMETROSENT", getSecureSignedToken( sPrefix, localUtil.format( AV45MetrosEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMETROSENT", GXutil.ltrim( localUtil.ntoc( AV45MetrosEnt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMETROSEXP", getSecureSignedToken( sPrefix, localUtil.format( AV46MetrosExp, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMETROSEXP", GXutil.ltrim( localUtil.ntoc( AV46MetrosExp, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDIFMETROS", getSecureSignedToken( sPrefix, localUtil.format( AV21DifMetros, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDIFMETROS", GXutil.ltrim( localUtil.ntoc( AV21DifMetros, (byte)(9), (byte)(2), ".", "")));
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
      rf1QN2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV104Pgmname = "InformeMermasResumen_WC" ;
      Gx_err = (short)(0) ;
      edtavSdtmermasresumenclientes__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtmermasresumenclientes__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtmermasresumenclientes__clicod_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtmermasresumenclientes__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtmermasresumenclientes__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtmermasresumenclientes__clinom_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavKilosent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavKilosent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKilosent_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavKilosexp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavKilosexp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKilosexp_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavDifkilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDifkilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifkilos_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavPorkilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPorkilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPorkilos_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavMetrosent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMetrosent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMetrosent_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavMetrosexp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMetrosexp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMetrosexp_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavDifmetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDifmetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifmetros_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavPormetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPormetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPormetros_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavTotvaluekilosent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluekilosent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluekilosent_Enabled), 5, 0), true);
      edtavTotvaluekilosexp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluekilosexp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluekilosexp_Enabled), 5, 0), true);
      edtavTotvaluedifkilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluedifkilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluedifkilos_Enabled), 5, 0), true);
      edtavTotvaluemetrosent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemetrosent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetrosent_Enabled), 5, 0), true);
      edtavTotvaluemetrosexp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemetrosexp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetrosexp_Enabled), 5, 0), true);
      edtavTotvaluedifmetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluedifmetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluedifmetros_Enabled), 5, 0), true);
   }

   public void rf1QN2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(39) ;
      /* Execute user event: Refresh */
      e181QN2 ();
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
         e191QN2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_39_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e191QN2 ();
         }
         wbEnd = (short)(39) ;
         wb1QN0( ) ;
      }
      bGXsfl_39_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1QN2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPDISCLI", GXutil.rtrim( AV61PDisCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPDISCLI", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV61PDisCli, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUDISCLI", GXutil.rtrim( AV62UDisCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUDISCLI", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV62UDisCli, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV104Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV104Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vKILOSENT"+"_"+sGXsfl_39_idx, getSecureSignedToken( sPrefix+sGXsfl_39_idx, localUtil.format( AV40KilosEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vKILOSEXP"+"_"+sGXsfl_39_idx, getSecureSignedToken( sPrefix+sGXsfl_39_idx, localUtil.format( AV41KilosExp, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDIFKILOS"+"_"+sGXsfl_39_idx, getSecureSignedToken( sPrefix+sGXsfl_39_idx, localUtil.format( AV20DifKilos, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMETROSENT"+"_"+sGXsfl_39_idx, getSecureSignedToken( sPrefix+sGXsfl_39_idx, localUtil.format( AV45MetrosEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMETROSEXP"+"_"+sGXsfl_39_idx, getSecureSignedToken( sPrefix+sGXsfl_39_idx, localUtil.format( AV46MetrosExp, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDIFMETROS"+"_"+sGXsfl_39_idx, getSecureSignedToken( sPrefix+sGXsfl_39_idx, localUtil.format( AV21DifMetros, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTKILOSENT", GXutil.ltrim( localUtil.ntoc( AV81TotKilosEnt, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKILOSENT", getSecureSignedToken( sPrefix, localUtil.format( AV81TotKilosEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTKILOSEXP", GXutil.ltrim( localUtil.ntoc( AV85TotKilosExp, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKILOSEXP", getSecureSignedToken( sPrefix, localUtil.format( AV85TotKilosExp, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTDIFKILOS", GXutil.ltrim( localUtil.ntoc( AV87TotDifKilos, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDIFKILOS", getSecureSignedToken( sPrefix, localUtil.format( AV87TotDifKilos, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMETROSENT", GXutil.ltrim( localUtil.ntoc( AV89TotMetrosEnt, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETROSENT", getSecureSignedToken( sPrefix, localUtil.format( AV89TotMetrosEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMETROSEXP", GXutil.ltrim( localUtil.ntoc( AV91TotMetrosExp, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETROSEXP", getSecureSignedToken( sPrefix, localUtil.format( AV91TotMetrosExp, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTDIFMETROS", GXutil.ltrim( localUtil.ntoc( AV93TotDifMetros, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDIFMETROS", getSecureSignedToken( sPrefix, localUtil.format( AV93TotDifMetros, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALKILOSENT", GXutil.ltrim( localUtil.ntoc( AV73TotalKilosEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALKILOSENT", getSecureSignedToken( sPrefix, localUtil.format( AV73TotalKilosEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALKILOSEXP", GXutil.ltrim( localUtil.ntoc( AV74TotalKilosExp, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALKILOSEXP", getSecureSignedToken( sPrefix, localUtil.format( AV74TotalKilosExp, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALDIFKILOS", GXutil.ltrim( localUtil.ntoc( AV75TotalDifKilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALDIFKILOS", getSecureSignedToken( sPrefix, localUtil.format( AV75TotalDifKilos, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALMETROSENT", GXutil.ltrim( localUtil.ntoc( AV77TotalMetrosEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALMETROSENT", getSecureSignedToken( sPrefix, localUtil.format( AV77TotalMetrosEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALMETROSEXP", GXutil.ltrim( localUtil.ntoc( AV78TotalMetrosExp, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALMETROSEXP", getSecureSignedToken( sPrefix, localUtil.format( AV78TotalMetrosExp, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALDIFMETROS", GXutil.ltrim( localUtil.ntoc( AV79TotalDifMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALDIFMETROS", getSecureSignedToken( sPrefix, localUtil.format( AV79TotalDifMetros, "ZZZZZ9.99")));
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
      return AV53SDTMermasResumenClientes.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV16ColumnsSelector, AV25Emprcod, AV60ImpCod, AV63BarTipArt, AV64BarTipArt_to, AV14CliCod, AV15CliCod_To, AV12BarSer, AV13BarSer_To, AV8BarColNom, AV9BarColNom_To, AV65BarColNum, AV66BarColNum_to, AV61PDisCli, AV62UDisCli, AV10BarFecSal, AV11BarFecSal_To, AV104Pgmname, AV53SDTMermasResumenClientes, AV40KilosEnt, AV41KilosExp, AV20DifKilos, AV45MetrosEnt, AV46MetrosExp, AV21DifMetros, AV81TotKilosEnt, AV85TotKilosExp, AV87TotDifKilos, AV89TotMetrosEnt, AV91TotMetrosExp, AV93TotDifMetros, AV73TotalKilosEnt, AV74TotalKilosExp, AV75TotalDifKilos, AV77TotalMetrosEnt, AV78TotalMetrosExp, AV79TotalDifMetros, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV16ColumnsSelector, AV25Emprcod, AV60ImpCod, AV63BarTipArt, AV64BarTipArt_to, AV14CliCod, AV15CliCod_To, AV12BarSer, AV13BarSer_To, AV8BarColNom, AV9BarColNom_To, AV65BarColNum, AV66BarColNum_to, AV61PDisCli, AV62UDisCli, AV10BarFecSal, AV11BarFecSal_To, AV104Pgmname, AV53SDTMermasResumenClientes, AV40KilosEnt, AV41KilosExp, AV20DifKilos, AV45MetrosEnt, AV46MetrosExp, AV21DifMetros, AV81TotKilosEnt, AV85TotKilosExp, AV87TotDifKilos, AV89TotMetrosEnt, AV91TotMetrosExp, AV93TotDifMetros, AV73TotalKilosEnt, AV74TotalKilosExp, AV75TotalDifKilos, AV77TotalMetrosEnt, AV78TotalMetrosExp, AV79TotalDifMetros, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV16ColumnsSelector, AV25Emprcod, AV60ImpCod, AV63BarTipArt, AV64BarTipArt_to, AV14CliCod, AV15CliCod_To, AV12BarSer, AV13BarSer_To, AV8BarColNom, AV9BarColNom_To, AV65BarColNum, AV66BarColNum_to, AV61PDisCli, AV62UDisCli, AV10BarFecSal, AV11BarFecSal_To, AV104Pgmname, AV53SDTMermasResumenClientes, AV40KilosEnt, AV41KilosExp, AV20DifKilos, AV45MetrosEnt, AV46MetrosExp, AV21DifMetros, AV81TotKilosEnt, AV85TotKilosExp, AV87TotDifKilos, AV89TotMetrosEnt, AV91TotMetrosExp, AV93TotDifMetros, AV73TotalKilosEnt, AV74TotalKilosExp, AV75TotalDifKilos, AV77TotalMetrosEnt, AV78TotalMetrosExp, AV79TotalDifMetros, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV16ColumnsSelector, AV25Emprcod, AV60ImpCod, AV63BarTipArt, AV64BarTipArt_to, AV14CliCod, AV15CliCod_To, AV12BarSer, AV13BarSer_To, AV8BarColNom, AV9BarColNom_To, AV65BarColNum, AV66BarColNum_to, AV61PDisCli, AV62UDisCli, AV10BarFecSal, AV11BarFecSal_To, AV104Pgmname, AV53SDTMermasResumenClientes, AV40KilosEnt, AV41KilosExp, AV20DifKilos, AV45MetrosEnt, AV46MetrosExp, AV21DifMetros, AV81TotKilosEnt, AV85TotKilosExp, AV87TotDifKilos, AV89TotMetrosEnt, AV91TotMetrosExp, AV93TotDifMetros, AV73TotalKilosEnt, AV74TotalKilosExp, AV75TotalDifKilos, AV77TotalMetrosEnt, AV78TotalMetrosExp, AV79TotalDifMetros, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV16ColumnsSelector, AV25Emprcod, AV60ImpCod, AV63BarTipArt, AV64BarTipArt_to, AV14CliCod, AV15CliCod_To, AV12BarSer, AV13BarSer_To, AV8BarColNom, AV9BarColNom_To, AV65BarColNum, AV66BarColNum_to, AV61PDisCli, AV62UDisCli, AV10BarFecSal, AV11BarFecSal_To, AV104Pgmname, AV53SDTMermasResumenClientes, AV40KilosEnt, AV41KilosExp, AV20DifKilos, AV45MetrosEnt, AV46MetrosExp, AV21DifMetros, AV81TotKilosEnt, AV85TotKilosExp, AV87TotDifKilos, AV89TotMetrosEnt, AV91TotMetrosExp, AV93TotDifMetros, AV73TotalKilosEnt, AV74TotalKilosExp, AV75TotalDifKilos, AV77TotalMetrosEnt, AV78TotalMetrosExp, AV79TotalDifMetros, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV104Pgmname = "InformeMermasResumen_WC" ;
      Gx_err = (short)(0) ;
      edtavSdtmermasresumenclientes__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtmermasresumenclientes__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtmermasresumenclientes__clicod_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtmermasresumenclientes__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtmermasresumenclientes__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtmermasresumenclientes__clinom_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavKilosent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavKilosent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKilosent_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavKilosexp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavKilosexp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKilosexp_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavDifkilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDifkilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifkilos_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavPorkilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPorkilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPorkilos_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavMetrosent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMetrosent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMetrosent_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavMetrosexp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMetrosexp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMetrosexp_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavDifmetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDifmetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifmetros_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavPormetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPormetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPormetros_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavTotvaluekilosent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluekilosent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluekilosent_Enabled), 5, 0), true);
      edtavTotvaluekilosexp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluekilosexp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluekilosexp_Enabled), 5, 0), true);
      edtavTotvaluedifkilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluedifkilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluedifkilos_Enabled), 5, 0), true);
      edtavTotvaluemetrosent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemetrosent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetrosent_Enabled), 5, 0), true);
      edtavTotvaluemetrosexp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemetrosexp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetrosexp_Enabled), 5, 0), true);
      edtavTotvaluedifmetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluedifmetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluedifmetros_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1QN0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e171QN2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Sdtmermasresumenclientes"), AV53SDTMermasResumenClientes);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV19DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV16ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vSDTMERMASRESUMENCLIENTES"), AV53SDTMermasResumenClientes);
         /* Read saved values. */
         nRC_GXsfl_39 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_39"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV30GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV31GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV25Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV25Emprcod") ;
         wcpOAV10BarFecSal = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV10BarFecSal"), 0) ;
         wcpOAV11BarFecSal_To = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV11BarFecSal_To"), 0) ;
         wcpOAV8BarColNom = httpContext.cgiGet( sPrefix+"wcpOAV8BarColNom") ;
         wcpOAV9BarColNom_To = httpContext.cgiGet( sPrefix+"wcpOAV9BarColNom_To") ;
         wcpOAV65BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV65BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV66BarColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV66BarColNum_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV12BarSer = httpContext.cgiGet( sPrefix+"wcpOAV12BarSer") ;
         wcpOAV13BarSer_To = httpContext.cgiGet( sPrefix+"wcpOAV13BarSer_To") ;
         wcpOAV14CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV14CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV15CliCod_To = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV15CliCod_To"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV69BarEncCli = httpContext.cgiGet( sPrefix+"wcpOAV69BarEncCli") ;
         wcpOAV71BarEncCli_To = httpContext.cgiGet( sPrefix+"wcpOAV71BarEncCli_To") ;
         wcpOAV63BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV63BarTipArt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV64BarTipArt_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV64BarTipArt_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
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
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         nRC_GXsfl_39 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_39"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_39_fel_idx = 0 ;
         while ( nGXsfl_39_fel_idx < nRC_GXsfl_39 )
         {
            nGXsfl_39_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_39_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_39_fel_idx+1) ;
            sGXsfl_39_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_392( ) ;
            AV98GXV1 = (int)(nGXsfl_39_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV53SDTMermasResumenClientes.size() >= AV98GXV1 ) && ( AV98GXV1 > 0 ) )
            {
               AV53SDTMermasResumenClientes.currentItem( ((app.SdtSDTMermasResumenCliente)AV53SDTMermasResumenClientes.elementAt(-1+AV98GXV1)) );
               AV40KilosEnt = localUtil.ctond( httpContext.cgiGet( edtavKilosent_Internalname)) ;
               AV41KilosExp = localUtil.ctond( httpContext.cgiGet( edtavKilosexp_Internalname)) ;
               AV20DifKilos = localUtil.ctond( httpContext.cgiGet( edtavDifkilos_Internalname)) ;
               AV50PorKilos = localUtil.ctond( httpContext.cgiGet( edtavPorkilos_Internalname)) ;
               AV45MetrosEnt = localUtil.ctond( httpContext.cgiGet( edtavMetrosent_Internalname)) ;
               AV46MetrosExp = localUtil.ctond( httpContext.cgiGet( edtavMetrosexp_Internalname)) ;
               AV21DifMetros = localUtil.ctond( httpContext.cgiGet( edtavDifmetros_Internalname)) ;
               AV51PorMetros = localUtil.ctond( httpContext.cgiGet( edtavPormetros_Internalname)) ;
            }
         }
         if ( nGXsfl_39_fel_idx == 0 )
         {
            nGXsfl_39_idx = 1 ;
            sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_392( ) ;
         }
         nGXsfl_39_fel_idx = 1 ;
         /* Read variables values. */
         AV82TotValueKilosEnt = httpContext.cgiGet( edtavTotvaluekilosent_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TotValueKilosEnt", AV82TotValueKilosEnt);
         AV86TotValueKilosExp = httpContext.cgiGet( edtavTotvaluekilosexp_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TotValueKilosExp", AV86TotValueKilosExp);
         AV88TotValueDifKilos = httpContext.cgiGet( edtavTotvaluedifkilos_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TotValueDifKilos", AV88TotValueDifKilos);
         AV90TotValueMetrosEnt = httpContext.cgiGet( edtavTotvaluemetrosent_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TotValueMetrosEnt", AV90TotValueMetrosEnt);
         AV92TotValueMetrosExp = httpContext.cgiGet( edtavTotvaluemetrosexp_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TotValueMetrosExp", AV92TotValueMetrosExp);
         AV94TotValueDifMetros = httpContext.cgiGet( edtavTotvaluedifmetros_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TotValueDifMetros", AV94TotValueDifMetros);
         /* Read subfile selected row values. */
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
      e171QN2 ();
      if (returnInSub) return;
   }

   public void e171QN2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV101Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      informemermasresumen_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV101Station = GXt_char1 ;
      GXv_char2[0] = AV25Emprcod ;
      GXv_char3[0] = AV102Emprnom ;
      GXv_char4[0] = AV103Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV101Station, GXv_char2, GXv_char3, GXv_char4) ;
      informemermasresumen_wc_impl.this.AV25Emprcod = GXv_char2[0] ;
      informemermasresumen_wc_impl.this.AV102Emprnom = GXv_char3[0] ;
      informemermasresumen_wc_impl.this.AV103Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Emprcod", AV25Emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV19DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV19DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e181QN2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'INICIALIZAVARIABLESPARAMETRO' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'BUSCARDATOS' */
      S132 ();
      if (returnInSub) return;
      GXv_SdtWWPContext7[0] = AV58WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV58WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV54Session.getValue("InformeMermasResumen_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV54Session.getValue("InformeMermasResumen_WCColumnsSelector") ;
         AV16ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S152 ();
         if (returnInSub) return;
      }
      edtavSdtmermasresumenclientes__clicod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtmermasresumenclientes__clicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtmermasresumenclientes__clicod_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtmermasresumenclientes__clinom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtmermasresumenclientes__clinom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtmermasresumenclientes__clinom_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtavKilosent_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavKilosent_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKilosent_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtavKilosexp_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavKilosexp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKilosexp_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtavDifkilos_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDifkilos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifkilos_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtavPorkilos_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPorkilos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPorkilos_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtavMetrosent_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMetrosent_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMetrosent_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtavMetrosexp_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMetrosexp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMetrosexp_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtavDifmetros_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDifmetros_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifmetros_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtavPormetros_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPormetros_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPormetros_Visible), 5, 0), !bGXsfl_39_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S162 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S172 ();
      if (returnInSub) return;
      AV30GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30GridCurrentPage), 10, 0));
      AV31GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S182 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV5WebSession.getValue("InformeMermasResumen"))), httpContext.getMessage( "FINALIZADO", "")) == 0 )
      {
         AV5WebSession.remove("InformeMermasResumen");
         AV52ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
         AV52ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
         AV52ProgressIndicator.hide();
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16ColumnsSelector", AV16ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV52ProgressIndicator", AV52ProgressIndicator);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV53SDTMermasResumenClientes", AV53SDTMermasResumenClientes);
   }

   public void e111QN2( )
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

   public void e121QN2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e191QN2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV98GXV1 = 1 ;
      while ( AV98GXV1 <= AV53SDTMermasResumenClientes.size() )
      {
         AV53SDTMermasResumenClientes.currentItem( ((app.SdtSDTMermasResumenCliente)AV53SDTMermasResumenClientes.elementAt(-1+AV98GXV1)) );
         AV40KilosEnt = ((app.SdtSDTMermasResumenCliente_ResumenItem)((app.SdtSDTMermasResumenCliente)(AV53SDTMermasResumenClientes.currentItem())).getgxTv_SdtSDTMermasResumenCliente_Resumen().elementAt(-1+1)).getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosent() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavKilosent_Internalname, GXutil.ltrimstr( AV40KilosEnt, 9, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vKILOSENT"+"_"+sGXsfl_39_idx, getSecureSignedToken( sPrefix+sGXsfl_39_idx, localUtil.format( AV40KilosEnt, "ZZZZZ9.99")));
         AV41KilosExp = ((app.SdtSDTMermasResumenCliente_ResumenItem)((app.SdtSDTMermasResumenCliente)(AV53SDTMermasResumenClientes.currentItem())).getgxTv_SdtSDTMermasResumenCliente_Resumen().elementAt(-1+1)).getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosexp() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavKilosexp_Internalname, GXutil.ltrimstr( AV41KilosExp, 9, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vKILOSEXP"+"_"+sGXsfl_39_idx, getSecureSignedToken( sPrefix+sGXsfl_39_idx, localUtil.format( AV41KilosExp, "ZZZZZ9.99")));
         AV20DifKilos = ((app.SdtSDTMermasResumenCliente_ResumenItem)((app.SdtSDTMermasResumenCliente)(AV53SDTMermasResumenClientes.currentItem())).getgxTv_SdtSDTMermasResumenCliente_Resumen().elementAt(-1+1)).getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Difkilos() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifkilos_Internalname, GXutil.ltrimstr( AV20DifKilos, 9, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDIFKILOS"+"_"+sGXsfl_39_idx, getSecureSignedToken( sPrefix+sGXsfl_39_idx, localUtil.format( AV20DifKilos, "ZZZZZ9.99")));
         AV50PorKilos = ((app.SdtSDTMermasResumenCliente_ResumenItem)((app.SdtSDTMermasResumenCliente)(AV53SDTMermasResumenClientes.currentItem())).getgxTv_SdtSDTMermasResumenCliente_Resumen().elementAt(-1+1)).getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Porkilos() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPorkilos_Internalname, GXutil.ltrimstr( AV50PorKilos, 6, 2));
         AV45MetrosEnt = ((app.SdtSDTMermasResumenCliente_ResumenItem)((app.SdtSDTMermasResumenCliente)(AV53SDTMermasResumenClientes.currentItem())).getgxTv_SdtSDTMermasResumenCliente_Resumen().elementAt(-1+1)).getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosent() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMetrosent_Internalname, GXutil.ltrimstr( AV45MetrosEnt, 9, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMETROSENT"+"_"+sGXsfl_39_idx, getSecureSignedToken( sPrefix+sGXsfl_39_idx, localUtil.format( AV45MetrosEnt, "ZZZZZ9.99")));
         AV46MetrosExp = ((app.SdtSDTMermasResumenCliente_ResumenItem)((app.SdtSDTMermasResumenCliente)(AV53SDTMermasResumenClientes.currentItem())).getgxTv_SdtSDTMermasResumenCliente_Resumen().elementAt(-1+1)).getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosexp() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMetrosexp_Internalname, GXutil.ltrimstr( AV46MetrosExp, 9, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMETROSEXP"+"_"+sGXsfl_39_idx, getSecureSignedToken( sPrefix+sGXsfl_39_idx, localUtil.format( AV46MetrosExp, "ZZZZZ9.99")));
         AV21DifMetros = ((app.SdtSDTMermasResumenCliente_ResumenItem)((app.SdtSDTMermasResumenCliente)(AV53SDTMermasResumenClientes.currentItem())).getgxTv_SdtSDTMermasResumenCliente_Resumen().elementAt(-1+1)).getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Difmetros() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifmetros_Internalname, GXutil.ltrimstr( AV21DifMetros, 9, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDIFMETROS"+"_"+sGXsfl_39_idx, getSecureSignedToken( sPrefix+sGXsfl_39_idx, localUtil.format( AV21DifMetros, "ZZZZZ9.99")));
         AV51PorMetros = ((app.SdtSDTMermasResumenCliente_ResumenItem)((app.SdtSDTMermasResumenCliente)(AV53SDTMermasResumenClientes.currentItem())).getgxTv_SdtSDTMermasResumenCliente_Resumen().elementAt(-1+1)).getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Pormetros() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPormetros_Internalname, GXutil.ltrimstr( AV51PorMetros, 6, 2));
         AV73TotalKilosEnt = AV73TotalKilosEnt.add(AV40KilosEnt) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TotalKilosEnt", GXutil.ltrimstr( AV73TotalKilosEnt, 9, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALKILOSENT", getSecureSignedToken( sPrefix, localUtil.format( AV73TotalKilosEnt, "ZZZZZ9.99")));
         AV74TotalKilosExp = AV74TotalKilosExp.add(AV41KilosExp) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TotalKilosExp", GXutil.ltrimstr( AV74TotalKilosExp, 9, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALKILOSEXP", getSecureSignedToken( sPrefix, localUtil.format( AV74TotalKilosExp, "ZZZZZ9.99")));
         AV75TotalDifKilos = AV75TotalDifKilos.add(AV20DifKilos) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TotalDifKilos", GXutil.ltrimstr( AV75TotalDifKilos, 9, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALDIFKILOS", getSecureSignedToken( sPrefix, localUtil.format( AV75TotalDifKilos, "ZZZZZ9.99")));
         AV77TotalMetrosEnt = AV77TotalMetrosEnt.add(AV45MetrosEnt) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TotalMetrosEnt", GXutil.ltrimstr( AV77TotalMetrosEnt, 9, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALMETROSENT", getSecureSignedToken( sPrefix, localUtil.format( AV77TotalMetrosEnt, "ZZZZZ9.99")));
         AV78TotalMetrosExp = AV78TotalMetrosExp.add(AV46MetrosExp) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TotalMetrosExp", GXutil.ltrimstr( AV78TotalMetrosExp, 9, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALMETROSEXP", getSecureSignedToken( sPrefix, localUtil.format( AV78TotalMetrosExp, "ZZZZZ9.99")));
         AV79TotalDifMetros = AV79TotalDifMetros.add(AV21DifMetros) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TotalDifMetros", GXutil.ltrimstr( AV79TotalDifMetros, 9, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALDIFMETROS", getSecureSignedToken( sPrefix, localUtil.format( AV79TotalDifMetros, "ZZZZZ9.99")));
         /* Execute user subroutine: 'CALCULATETOTALIZERS' */
         S182 ();
         if (returnInSub) return;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(39) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_392( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_39_Refreshing )
         {
            httpContext.doAjaxLoad(39, GridRow);
         }
         AV98GXV1 = (int)(AV98GXV1+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e131QN2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV16ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "InformeMermasResumen_WCColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV16ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16ColumnsSelector", AV16ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV52ProgressIndicator", AV52ProgressIndicator);
      if ( gx_BV39 )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV53SDTMermasResumenClientes", AV53SDTMermasResumenClientes);
         nGXsfl_39_bak_idx = nGXsfl_39_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV16ColumnsSelector, AV25Emprcod, AV60ImpCod, AV63BarTipArt, AV64BarTipArt_to, AV14CliCod, AV15CliCod_To, AV12BarSer, AV13BarSer_To, AV8BarColNom, AV9BarColNom_To, AV65BarColNum, AV66BarColNum_to, AV61PDisCli, AV62UDisCli, AV10BarFecSal, AV11BarFecSal_To, AV104Pgmname, AV53SDTMermasResumenClientes, AV40KilosEnt, AV41KilosExp, AV20DifKilos, AV45MetrosEnt, AV46MetrosExp, AV21DifMetros, AV81TotKilosEnt, AV85TotKilosExp, AV87TotDifKilos, AV89TotMetrosEnt, AV91TotMetrosExp, AV93TotDifMetros, AV73TotalKilosEnt, AV74TotalKilosExp, AV75TotalDifKilos, AV77TotalMetrosEnt, AV78TotalMetrosExp, AV79TotalDifMetros, sPrefix) ;
         nGXsfl_39_idx = nGXsfl_39_bak_idx ;
         sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_392( ) ;
      }
   }

   public void e141QN2( )
   {
      AV98GXV1 = (int)(nGXsfl_39_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV98GXV1 > 0 ) && ( AV53SDTMermasResumenClientes.size() >= AV98GXV1 ) )
      {
         AV53SDTMermasResumenClientes.currentItem( ((app.SdtSDTMermasResumenCliente)AV53SDTMermasResumenClientes.elementAt(-1+AV98GXV1)) );
      }
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV5WebSession.setValue("InformeMermasResumen_WC_BarFecSal", localUtil.dtoc( AV10BarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"));
      AV5WebSession.setValue("InformeMermasResumen_WC_BarFecSal_to", localUtil.dtoc( AV11BarFecSal_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"));
      /* Execute user subroutine: 'BUSCARDATOS' */
      S132 ();
      if (returnInSub) return;
      AV5WebSession.setValue(httpContext.getMessage( "SDTMermasResumenClientes", ""), AV53SDTMermasResumenClientes.toJSonString(false));
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      GXv_char4[0] = AV27ExcelFilename ;
      GXv_char3[0] = AV26ErrorMessage ;
      new app.informemermasresumen_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      informemermasresumen_wc_impl.this.AV27ExcelFilename = GXv_char4[0] ;
      informemermasresumen_wc_impl.this.AV26ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV27ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV27ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV26ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV53SDTMermasResumenClientes", AV53SDTMermasResumenClientes);
      nGXsfl_39_bak_idx = nGXsfl_39_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV16ColumnsSelector, AV25Emprcod, AV60ImpCod, AV63BarTipArt, AV64BarTipArt_to, AV14CliCod, AV15CliCod_To, AV12BarSer, AV13BarSer_To, AV8BarColNom, AV9BarColNom_To, AV65BarColNum, AV66BarColNum_to, AV61PDisCli, AV62UDisCli, AV10BarFecSal, AV11BarFecSal_To, AV104Pgmname, AV53SDTMermasResumenClientes, AV40KilosEnt, AV41KilosExp, AV20DifKilos, AV45MetrosEnt, AV46MetrosExp, AV21DifMetros, AV81TotKilosEnt, AV85TotKilosExp, AV87TotDifKilos, AV89TotMetrosEnt, AV91TotMetrosExp, AV93TotDifMetros, AV73TotalKilosEnt, AV74TotalKilosExp, AV75TotalDifKilos, AV77TotalMetrosEnt, AV78TotalMetrosExp, AV79TotalDifMetros, sPrefix) ;
      nGXsfl_39_idx = nGXsfl_39_bak_idx ;
      sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_392( ) ;
   }

   public void e151QN2( )
   {
      AV98GXV1 = (int)(nGXsfl_39_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV98GXV1 > 0 ) && ( AV53SDTMermasResumenClientes.size() >= AV98GXV1 ) )
      {
         AV53SDTMermasResumenClientes.currentItem( ((app.SdtSDTMermasResumenCliente)AV53SDTMermasResumenClientes.elementAt(-1+AV98GXV1)) );
      }
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         /* Execute user subroutine: 'LOADGRIDSTATE' */
         S112 ();
         if (returnInSub) return;
         Innewwindow1_Target = formatLink("app.informemermasresumen_wcexportreport", new String[] {}, new String[] {})  ;
         ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
         Innewwindow1_Height = "600" ;
         ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
         Innewwindow1_Width = "800" ;
         ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
         this.executeUsercontrolMethod(sPrefix, false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      }
      /* Execute user subroutine: 'INICIALIZAVARIABLESPARAMETRO' */
      S122 ();
      if (returnInSub) return;
      httpContext.popup(formatLink("app.ral0002r", new String[] {GXutil.URLEncode(GXutil.rtrim(AV25Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV60ImpCod)),GXutil.URLEncode(GXutil.ltrimstr(AV63BarTipArt,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV64BarTipArt_to,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV15CliCod_To,6,0)),GXutil.URLEncode(GXutil.rtrim(AV12BarSer)),GXutil.URLEncode(GXutil.rtrim(AV13BarSer_To)),GXutil.URLEncode(GXutil.rtrim(AV8BarColNom)),GXutil.URLEncode(GXutil.rtrim(AV9BarColNom_To)),GXutil.URLEncode(GXutil.ltrimstr(AV65BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV66BarColNum_to,6,0)),GXutil.URLEncode(GXutil.rtrim(AV61PDisCli)),GXutil.URLEncode(GXutil.rtrim(AV62UDisCli)),GXutil.URLEncode(GXutil.formatDateParm(AV10BarFecSal)),GXutil.URLEncode(GXutil.formatDateParm(AV11BarFecSal_To))}, new String[] {"EmprCod","ImpCod","PTipArt","UTipArt","PCliCod","UCliCod","PSerCod","USerCod","PColor","UColor","PColNum","UColNum","PDisCli","UDisCli","PFecha","UFecha"}) , new Object[] {});
      /*  Sending Event outputs  */
   }

   public void e161QN2( )
   {
      AV98GXV1 = (int)(nGXsfl_39_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV98GXV1 > 0 ) && ( AV53SDTMermasResumenClientes.size() >= AV98GXV1 ) )
      {
         AV53SDTMermasResumenClientes.currentItem( ((app.SdtSDTMermasResumenCliente)AV53SDTMermasResumenClientes.elementAt(-1+AV98GXV1)) );
      }
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV5WebSession.setValue("InformeMermasResumen_WC_BarFecSal", localUtil.dtoc( AV10BarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"));
      AV5WebSession.setValue("InformeMermasResumen_WC_BarFecSal_to", localUtil.dtoc( AV11BarFecSal_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"));
      /* Execute user subroutine: 'BUSCARDATOS' */
      S132 ();
      if (returnInSub) return;
      AV5WebSession.setValue(httpContext.getMessage( "SDTMermasResumenClientes", ""), AV53SDTMermasResumenClientes.toJSonString(false));
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.informemermasresumen_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV53SDTMermasResumenClientes", AV53SDTMermasResumenClientes);
      nGXsfl_39_bak_idx = nGXsfl_39_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV16ColumnsSelector, AV25Emprcod, AV60ImpCod, AV63BarTipArt, AV64BarTipArt_to, AV14CliCod, AV15CliCod_To, AV12BarSer, AV13BarSer_To, AV8BarColNom, AV9BarColNom_To, AV65BarColNum, AV66BarColNum_to, AV61PDisCli, AV62UDisCli, AV10BarFecSal, AV11BarFecSal_To, AV104Pgmname, AV53SDTMermasResumenClientes, AV40KilosEnt, AV41KilosExp, AV20DifKilos, AV45MetrosEnt, AV46MetrosExp, AV21DifMetros, AV81TotKilosEnt, AV85TotKilosExp, AV87TotDifKilos, AV89TotMetrosEnt, AV91TotMetrosExp, AV93TotDifMetros, AV73TotalKilosEnt, AV74TotalKilosExp, AV75TotalDifKilos, AV77TotalMetrosEnt, AV78TotalMetrosExp, AV79TotalDifMetros, sPrefix) ;
      nGXsfl_39_idx = nGXsfl_39_bak_idx ;
      sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_392( ) ;
   }

   public void S172( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
      AV95i = 1 ;
      while ( AV95i <= ((app.SdtSDTMermasResumenCliente)(AV53SDTMermasResumenClientes.currentItem())).getgxTv_SdtSDTMermasResumenCliente_Resumen().size() )
      {
         AV40KilosEnt = AV40KilosEnt.add((((app.SdtSDTMermasResumenCliente_ResumenItem)((app.SdtSDTMermasResumenCliente)(AV53SDTMermasResumenClientes.currentItem())).getgxTv_SdtSDTMermasResumenCliente_Resumen().elementAt(-1+AV95i)).getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosent())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavKilosent_Internalname, GXutil.ltrimstr( AV40KilosEnt, 9, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vKILOSENT"+"_"+sGXsfl_39_idx, getSecureSignedToken( sPrefix+sGXsfl_39_idx, localUtil.format( AV40KilosEnt, "ZZZZZ9.99")));
         AV41KilosExp = AV41KilosExp.add((((app.SdtSDTMermasResumenCliente_ResumenItem)((app.SdtSDTMermasResumenCliente)(AV53SDTMermasResumenClientes.currentItem())).getgxTv_SdtSDTMermasResumenCliente_Resumen().elementAt(-1+AV95i)).getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosexp())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavKilosexp_Internalname, GXutil.ltrimstr( AV41KilosExp, 9, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vKILOSEXP"+"_"+sGXsfl_39_idx, getSecureSignedToken( sPrefix+sGXsfl_39_idx, localUtil.format( AV41KilosExp, "ZZZZZ9.99")));
         AV20DifKilos = AV20DifKilos.add((((app.SdtSDTMermasResumenCliente_ResumenItem)((app.SdtSDTMermasResumenCliente)(AV53SDTMermasResumenClientes.currentItem())).getgxTv_SdtSDTMermasResumenCliente_Resumen().elementAt(-1+AV95i)).getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Difkilos())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifkilos_Internalname, GXutil.ltrimstr( AV20DifKilos, 9, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDIFKILOS"+"_"+sGXsfl_39_idx, getSecureSignedToken( sPrefix+sGXsfl_39_idx, localUtil.format( AV20DifKilos, "ZZZZZ9.99")));
         AV50PorKilos = ((app.SdtSDTMermasResumenCliente_ResumenItem)((app.SdtSDTMermasResumenCliente)(AV53SDTMermasResumenClientes.currentItem())).getgxTv_SdtSDTMermasResumenCliente_Resumen().elementAt(-1+AV95i)).getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Porkilos() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPorkilos_Internalname, GXutil.ltrimstr( AV50PorKilos, 6, 2));
         AV45MetrosEnt = AV45MetrosEnt.add((((app.SdtSDTMermasResumenCliente_ResumenItem)((app.SdtSDTMermasResumenCliente)(AV53SDTMermasResumenClientes.currentItem())).getgxTv_SdtSDTMermasResumenCliente_Resumen().elementAt(-1+AV95i)).getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosent())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMetrosent_Internalname, GXutil.ltrimstr( AV45MetrosEnt, 9, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMETROSENT"+"_"+sGXsfl_39_idx, getSecureSignedToken( sPrefix+sGXsfl_39_idx, localUtil.format( AV45MetrosEnt, "ZZZZZ9.99")));
         AV46MetrosExp = AV46MetrosExp.add((((app.SdtSDTMermasResumenCliente_ResumenItem)((app.SdtSDTMermasResumenCliente)(AV53SDTMermasResumenClientes.currentItem())).getgxTv_SdtSDTMermasResumenCliente_Resumen().elementAt(-1+AV95i)).getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosexp())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMetrosexp_Internalname, GXutil.ltrimstr( AV46MetrosExp, 9, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMETROSEXP"+"_"+sGXsfl_39_idx, getSecureSignedToken( sPrefix+sGXsfl_39_idx, localUtil.format( AV46MetrosExp, "ZZZZZ9.99")));
         AV21DifMetros = AV21DifMetros.add((((app.SdtSDTMermasResumenCliente_ResumenItem)((app.SdtSDTMermasResumenCliente)(AV53SDTMermasResumenClientes.currentItem())).getgxTv_SdtSDTMermasResumenCliente_Resumen().elementAt(-1+AV95i)).getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Difmetros())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifmetros_Internalname, GXutil.ltrimstr( AV21DifMetros, 9, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDIFMETROS"+"_"+sGXsfl_39_idx, getSecureSignedToken( sPrefix+sGXsfl_39_idx, localUtil.format( AV21DifMetros, "ZZZZZ9.99")));
         AV51PorMetros = ((app.SdtSDTMermasResumenCliente_ResumenItem)((app.SdtSDTMermasResumenCliente)(AV53SDTMermasResumenClientes.currentItem())).getgxTv_SdtSDTMermasResumenCliente_Resumen().elementAt(-1+AV95i)).getgxTv_SdtSDTMermasResumenCliente_ResumenItem_Pormetros() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPormetros_Internalname, GXutil.ltrimstr( AV51PorMetros, 6, 2));
         AV95i = (int)(AV95i+1) ;
      }
   }

   public void S152( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV16ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "SDTMermasResumenClientes__Clicod", "", "Codigo Cliente", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "SDTMermasResumenClientes__CliNom", "", "Nombre Cliente", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&KilosEnt", "", "Qgs. Entrado", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&KilosExp", "", "Qgs. Saidos", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&DifKilos", "", "Qgs. Difer", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&PorKilos", "", "Qgs. %", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&MetrosEnt", "", "Mts. Entrado", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&MetrosExp", "", "Mts. Saidos", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&DifMetros", "", "Mts. Difer", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&PorMetros", "", "Mts. %", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV57UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "InformeMermasResumen_WCColumnsSelector", GXv_char4) ;
      informemermasresumen_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV57UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV57UserCustomValue)==0) ) )
      {
         AV17ColumnsSelectorAux.fromxml(AV57UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV17ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV17ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( AV53SDTMermasResumenClientes.size() > 0 )
      {
         AV5WebSession.setValue("SDTMermasResumenClientes", AV53SDTMermasResumenClientes.toJSonString(false));
      }
      if ( GXutil.strcmp(AV54Session.getValue(AV104Pgmname+"GridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV104Pgmname+"GridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV54Session.getValue(AV104Pgmname+"GridState"), null, null);
      }
      if ( ! (GXutil.strcmp("", GXutil.trim( AV32GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV32GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV32GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV32GridState.fromxml(AV54Session.getValue(AV104Pgmname+"GridState"), null, null);
      AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      AV32GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV32GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV104Pgmname+"GridState", AV32GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S162( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV81TotKilosEnt = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TotKilosEnt", GXutil.ltrimstr( AV81TotKilosEnt, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKILOSENT", getSecureSignedToken( sPrefix, localUtil.format( AV81TotKilosEnt, "ZZZZZ9.99")));
      AV85TotKilosExp = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TotKilosExp", GXutil.ltrimstr( AV85TotKilosExp, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKILOSEXP", getSecureSignedToken( sPrefix, localUtil.format( AV85TotKilosExp, "ZZZZZ9.99")));
      AV87TotDifKilos = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TotDifKilos", GXutil.ltrimstr( AV87TotDifKilos, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDIFKILOS", getSecureSignedToken( sPrefix, localUtil.format( AV87TotDifKilos, "ZZZZZ9.99")));
      AV89TotMetrosEnt = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TotMetrosEnt", GXutil.ltrimstr( AV89TotMetrosEnt, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETROSENT", getSecureSignedToken( sPrefix, localUtil.format( AV89TotMetrosEnt, "ZZZZZ9.99")));
      AV91TotMetrosExp = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TotMetrosExp", GXutil.ltrimstr( AV91TotMetrosExp, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETROSEXP", getSecureSignedToken( sPrefix, localUtil.format( AV91TotMetrosExp, "ZZZZZ9.99")));
      AV93TotDifMetros = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TotDifMetros", GXutil.ltrimstr( AV93TotDifMetros, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDIFMETROS", getSecureSignedToken( sPrefix, localUtil.format( AV93TotDifMetros, "ZZZZZ9.99")));
   }

   public void S182( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         AV82TotValueKilosEnt = localUtil.format( AV81TotKilosEnt, "ZZZZZ9.99") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TotValueKilosEnt", AV82TotValueKilosEnt);
         AV86TotValueKilosExp = localUtil.format( AV85TotKilosExp, "ZZZZZ9.99") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TotValueKilosExp", AV86TotValueKilosExp);
         AV88TotValueDifKilos = localUtil.format( AV87TotDifKilos, "ZZZZZ9.99") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TotValueDifKilos", AV88TotValueDifKilos);
         AV90TotValueMetrosEnt = localUtil.format( AV89TotMetrosEnt, "ZZZZZ9.99") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TotValueMetrosEnt", AV90TotValueMetrosEnt);
         AV92TotValueMetrosExp = localUtil.format( AV91TotMetrosExp, "ZZZZZ9.99") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TotValueMetrosExp", AV92TotValueMetrosExp);
         AV94TotValueDifMetros = localUtil.format( AV93TotDifMetros, "ZZZZZ9.99") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TotValueDifMetros", AV94TotValueDifMetros);
      }
      AV82TotValueKilosEnt = localUtil.format( AV73TotalKilosEnt, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TotValueKilosEnt", AV82TotValueKilosEnt);
      AV86TotValueKilosExp = localUtil.format( AV74TotalKilosExp, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TotValueKilosExp", AV86TotValueKilosExp);
      AV88TotValueDifKilos = localUtil.format( AV75TotalDifKilos, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TotValueDifKilos", AV88TotValueDifKilos);
      AV90TotValueMetrosEnt = localUtil.format( AV77TotalMetrosEnt, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TotValueMetrosEnt", AV90TotValueMetrosEnt);
      AV92TotValueMetrosExp = localUtil.format( AV78TotalMetrosExp, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TotValueMetrosExp", AV92TotValueMetrosExp);
      AV94TotValueDifMetros = localUtil.format( AV79TotalDifMetros, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TotValueDifMetros", AV94TotValueDifMetros);
   }

   public void S122( )
   {
      /* 'INICIALIZAVARIABLESPARAMETRO' Routine */
      returnInSub = false ;
      AV60ImpCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60ImpCod", AV60ImpCod);
   }

   public void S132( )
   {
      /* 'BUSCARDATOS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtSDTMermasResumenCliente10 = AV53SDTMermasResumenClientes ;
      GXv_objcol_SdtSDTMermasResumenCliente11[0] = GXt_objcol_SdtSDTMermasResumenCliente10 ;
      new app.pget_mermasresumencliente(remoteHandle, context).execute( AV25Emprcod, AV60ImpCod, AV63BarTipArt, AV64BarTipArt_to, AV14CliCod, AV15CliCod_To, AV12BarSer, AV13BarSer_To, AV8BarColNom, AV9BarColNom_To, AV65BarColNum, AV66BarColNum_to, AV61PDisCli, AV62UDisCli, AV10BarFecSal, AV11BarFecSal_To, GXv_objcol_SdtSDTMermasResumenCliente11) ;
      GXt_objcol_SdtSDTMermasResumenCliente10 = GXv_objcol_SdtSDTMermasResumenCliente11[0] ;
      AV53SDTMermasResumenClientes = GXt_objcol_SdtSDTMermasResumenCliente10 ;
      gx_BV39 = true ;
      AV5WebSession.setValue(httpContext.getMessage( "SDTMermasResumenClientes", ""), AV53SDTMermasResumenClientes.toJSonString(false));
   }

   public void wb_table2_52_1QN2( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluekilosent_Internalname, httpContext.getMessage( "Tot Value Kilos Ent", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluekilosent_Internalname, AV82TotValueKilosEnt, GXutil.rtrim( localUtil.format( AV82TotValueKilosEnt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluekilosent_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluekilosent_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_InformeMermasResumen_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluekilosexp_Internalname, httpContext.getMessage( "Tot Value Kilos Exp", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluekilosexp_Internalname, AV86TotValueKilosExp, GXutil.rtrim( localUtil.format( AV86TotValueKilosExp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluekilosexp_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluekilosexp_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_InformeMermasResumen_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluedifkilos_Internalname, httpContext.getMessage( "Tot Value Dif Kilos", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluedifkilos_Internalname, AV88TotValueDifKilos, GXutil.rtrim( localUtil.format( AV88TotValueDifKilos, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluedifkilos_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluedifkilos_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_InformeMermasResumen_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluemetrosent_Internalname, httpContext.getMessage( "Tot Value Metros Ent", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluemetrosent_Internalname, AV90TotValueMetrosEnt, GXutil.rtrim( localUtil.format( AV90TotValueMetrosEnt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,68);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluemetrosent_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluemetrosent_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_InformeMermasResumen_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluemetrosexp_Internalname, httpContext.getMessage( "Tot Value Metros Exp", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluemetrosexp_Internalname, AV92TotValueMetrosExp, GXutil.rtrim( localUtil.format( AV92TotValueMetrosExp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluemetrosexp_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluemetrosexp_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_InformeMermasResumen_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluedifmetros_Internalname, httpContext.getMessage( "Tot Value Dif Metros", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluedifmetros_Internalname, AV94TotValueDifMetros, GXutil.rtrim( localUtil.format( AV94TotValueDifMetros, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluedifmetros_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluedifmetros_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_InformeMermasResumen_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_52_1QN2e( true) ;
      }
      else
      {
         wb_table2_52_1QN2e( false) ;
      }
   }

   public void wb_table1_25_1QN2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_1QN2e( true) ;
      }
      else
      {
         wb_table1_25_1QN2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV25Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Emprcod", AV25Emprcod);
      AV10BarFecSal = (java.util.Date)getParm(obj,1,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarFecSal", localUtil.format(AV10BarFecSal, "99/99/99"));
      AV11BarFecSal_To = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarFecSal_To", localUtil.format(AV11BarFecSal_To, "99/99/99"));
      AV8BarColNom = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarColNom", AV8BarColNom);
      AV9BarColNom_To = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarColNom_To", AV9BarColNom_To);
      AV65BarColNum = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65BarColNum), 6, 0));
      AV66BarColNum_to = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66BarColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66BarColNum_to), 6, 0));
      AV12BarSer = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12BarSer", AV12BarSer);
      AV13BarSer_To = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13BarSer_To", AV13BarSer_To);
      AV14CliCod = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CliCod), 6, 0));
      AV15CliCod_To = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15CliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCod_To), 6, 0));
      AV69BarEncCli = (String)getParm(obj,11,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69BarEncCli", AV69BarEncCli);
      AV71BarEncCli_To = (String)getParm(obj,12,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71BarEncCli_To", AV71BarEncCli_To);
      AV63BarTipArt = ((Number) GXutil.testNumericType( getParm(obj,13,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63BarTipArt), 4, 0));
      AV64BarTipArt_to = ((Number) GXutil.testNumericType( getParm(obj,14,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64BarTipArt_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64BarTipArt_to), 4, 0));
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
      pa1QN2( ) ;
      ws1QN2( ) ;
      we1QN2( ) ;
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
      sCtrlAV25Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV10BarFecSal = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV11BarFecSal_To = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV8BarColNom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV9BarColNom_To = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV65BarColNum = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV66BarColNum_to = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV12BarSer = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV13BarSer_To = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV14CliCod = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV15CliCod_To = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV69BarEncCli = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV71BarEncCli_To = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV63BarTipArt = (String)getParm(obj,13,TypeConstants.STRING) ;
      sCtrlAV64BarTipArt_to = (String)getParm(obj,14,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1QN2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "informemermasresumen_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1QN2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV25Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Emprcod", AV25Emprcod);
         AV10BarFecSal = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarFecSal", localUtil.format(AV10BarFecSal, "99/99/99"));
         AV11BarFecSal_To = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarFecSal_To", localUtil.format(AV11BarFecSal_To, "99/99/99"));
         AV8BarColNom = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarColNom", AV8BarColNom);
         AV9BarColNom_To = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarColNom_To", AV9BarColNom_To);
         AV65BarColNum = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65BarColNum), 6, 0));
         AV66BarColNum_to = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66BarColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66BarColNum_to), 6, 0));
         AV12BarSer = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12BarSer", AV12BarSer);
         AV13BarSer_To = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13BarSer_To", AV13BarSer_To);
         AV14CliCod = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CliCod), 6, 0));
         AV15CliCod_To = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15CliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCod_To), 6, 0));
         AV69BarEncCli = (String)getParm(obj,13,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69BarEncCli", AV69BarEncCli);
         AV71BarEncCli_To = (String)getParm(obj,14,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71BarEncCli_To", AV71BarEncCli_To);
         AV63BarTipArt = ((Number) GXutil.testNumericType( getParm(obj,15,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63BarTipArt), 4, 0));
         AV64BarTipArt_to = ((Number) GXutil.testNumericType( getParm(obj,16,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64BarTipArt_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64BarTipArt_to), 4, 0));
      }
      wcpOAV25Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV25Emprcod") ;
      wcpOAV10BarFecSal = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV10BarFecSal"), 0) ;
      wcpOAV11BarFecSal_To = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV11BarFecSal_To"), 0) ;
      wcpOAV8BarColNom = httpContext.cgiGet( sPrefix+"wcpOAV8BarColNom") ;
      wcpOAV9BarColNom_To = httpContext.cgiGet( sPrefix+"wcpOAV9BarColNom_To") ;
      wcpOAV65BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV65BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV66BarColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV66BarColNum_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV12BarSer = httpContext.cgiGet( sPrefix+"wcpOAV12BarSer") ;
      wcpOAV13BarSer_To = httpContext.cgiGet( sPrefix+"wcpOAV13BarSer_To") ;
      wcpOAV14CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV14CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV15CliCod_To = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV15CliCod_To"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV69BarEncCli = httpContext.cgiGet( sPrefix+"wcpOAV69BarEncCli") ;
      wcpOAV71BarEncCli_To = httpContext.cgiGet( sPrefix+"wcpOAV71BarEncCli_To") ;
      wcpOAV63BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV63BarTipArt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV64BarTipArt_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV64BarTipArt_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV25Emprcod, wcpOAV25Emprcod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV10BarFecSal), GXutil.resetTime(wcpOAV10BarFecSal)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV11BarFecSal_To), GXutil.resetTime(wcpOAV11BarFecSal_To)) ) || ( GXutil.strcmp(AV8BarColNom, wcpOAV8BarColNom) != 0 ) || ( GXutil.strcmp(AV9BarColNom_To, wcpOAV9BarColNom_To) != 0 ) || ( AV65BarColNum != wcpOAV65BarColNum ) || ( AV66BarColNum_to != wcpOAV66BarColNum_to ) || ( GXutil.strcmp(AV12BarSer, wcpOAV12BarSer) != 0 ) || ( GXutil.strcmp(AV13BarSer_To, wcpOAV13BarSer_To) != 0 ) || ( AV14CliCod != wcpOAV14CliCod ) || ( AV15CliCod_To != wcpOAV15CliCod_To ) || ( GXutil.strcmp(AV69BarEncCli, wcpOAV69BarEncCli) != 0 ) || ( GXutil.strcmp(AV71BarEncCli_To, wcpOAV71BarEncCli_To) != 0 ) || ( AV63BarTipArt != wcpOAV63BarTipArt ) || ( AV64BarTipArt_to != wcpOAV64BarTipArt_to ) ) )
      {
         setjustcreated();
      }
      wcpOAV25Emprcod = AV25Emprcod ;
      wcpOAV10BarFecSal = AV10BarFecSal ;
      wcpOAV11BarFecSal_To = AV11BarFecSal_To ;
      wcpOAV8BarColNom = AV8BarColNom ;
      wcpOAV9BarColNom_To = AV9BarColNom_To ;
      wcpOAV65BarColNum = AV65BarColNum ;
      wcpOAV66BarColNum_to = AV66BarColNum_to ;
      wcpOAV12BarSer = AV12BarSer ;
      wcpOAV13BarSer_To = AV13BarSer_To ;
      wcpOAV14CliCod = AV14CliCod ;
      wcpOAV15CliCod_To = AV15CliCod_To ;
      wcpOAV69BarEncCli = AV69BarEncCli ;
      wcpOAV71BarEncCli_To = AV71BarEncCli_To ;
      wcpOAV63BarTipArt = AV63BarTipArt ;
      wcpOAV64BarTipArt_to = AV64BarTipArt_to ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV25Emprcod = httpContext.cgiGet( sPrefix+"AV25Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV25Emprcod) > 0 )
      {
         AV25Emprcod = httpContext.cgiGet( sCtrlAV25Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Emprcod", AV25Emprcod);
      }
      else
      {
         AV25Emprcod = httpContext.cgiGet( sPrefix+"AV25Emprcod_PARM") ;
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
      sCtrlAV11BarFecSal_To = httpContext.cgiGet( sPrefix+"AV11BarFecSal_To_CTRL") ;
      if ( GXutil.len( sCtrlAV11BarFecSal_To) > 0 )
      {
         AV11BarFecSal_To = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV11BarFecSal_To), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarFecSal_To", localUtil.format(AV11BarFecSal_To, "99/99/99"));
      }
      else
      {
         AV11BarFecSal_To = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV11BarFecSal_To_PARM"), 0) ;
      }
      sCtrlAV8BarColNom = httpContext.cgiGet( sPrefix+"AV8BarColNom_CTRL") ;
      if ( GXutil.len( sCtrlAV8BarColNom) > 0 )
      {
         AV8BarColNom = httpContext.cgiGet( sCtrlAV8BarColNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarColNom", AV8BarColNom);
      }
      else
      {
         AV8BarColNom = httpContext.cgiGet( sPrefix+"AV8BarColNom_PARM") ;
      }
      sCtrlAV9BarColNom_To = httpContext.cgiGet( sPrefix+"AV9BarColNom_To_CTRL") ;
      if ( GXutil.len( sCtrlAV9BarColNom_To) > 0 )
      {
         AV9BarColNom_To = httpContext.cgiGet( sCtrlAV9BarColNom_To) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarColNom_To", AV9BarColNom_To);
      }
      else
      {
         AV9BarColNom_To = httpContext.cgiGet( sPrefix+"AV9BarColNom_To_PARM") ;
      }
      sCtrlAV65BarColNum = httpContext.cgiGet( sPrefix+"AV65BarColNum_CTRL") ;
      if ( GXutil.len( sCtrlAV65BarColNum) > 0 )
      {
         AV65BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV65BarColNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65BarColNum), 6, 0));
      }
      else
      {
         AV65BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV65BarColNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV66BarColNum_to = httpContext.cgiGet( sPrefix+"AV66BarColNum_to_CTRL") ;
      if ( GXutil.len( sCtrlAV66BarColNum_to) > 0 )
      {
         AV66BarColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV66BarColNum_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66BarColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66BarColNum_to), 6, 0));
      }
      else
      {
         AV66BarColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV66BarColNum_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      sCtrlAV13BarSer_To = httpContext.cgiGet( sPrefix+"AV13BarSer_To_CTRL") ;
      if ( GXutil.len( sCtrlAV13BarSer_To) > 0 )
      {
         AV13BarSer_To = httpContext.cgiGet( sCtrlAV13BarSer_To) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13BarSer_To", AV13BarSer_To);
      }
      else
      {
         AV13BarSer_To = httpContext.cgiGet( sPrefix+"AV13BarSer_To_PARM") ;
      }
      sCtrlAV14CliCod = httpContext.cgiGet( sPrefix+"AV14CliCod_CTRL") ;
      if ( GXutil.len( sCtrlAV14CliCod) > 0 )
      {
         AV14CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV14CliCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CliCod), 6, 0));
      }
      else
      {
         AV14CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV14CliCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV15CliCod_To = httpContext.cgiGet( sPrefix+"AV15CliCod_To_CTRL") ;
      if ( GXutil.len( sCtrlAV15CliCod_To) > 0 )
      {
         AV15CliCod_To = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV15CliCod_To), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15CliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCod_To), 6, 0));
      }
      else
      {
         AV15CliCod_To = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV15CliCod_To_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV69BarEncCli = httpContext.cgiGet( sPrefix+"AV69BarEncCli_CTRL") ;
      if ( GXutil.len( sCtrlAV69BarEncCli) > 0 )
      {
         AV69BarEncCli = httpContext.cgiGet( sCtrlAV69BarEncCli) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69BarEncCli", AV69BarEncCli);
      }
      else
      {
         AV69BarEncCli = httpContext.cgiGet( sPrefix+"AV69BarEncCli_PARM") ;
      }
      sCtrlAV71BarEncCli_To = httpContext.cgiGet( sPrefix+"AV71BarEncCli_To_CTRL") ;
      if ( GXutil.len( sCtrlAV71BarEncCli_To) > 0 )
      {
         AV71BarEncCli_To = httpContext.cgiGet( sCtrlAV71BarEncCli_To) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71BarEncCli_To", AV71BarEncCli_To);
      }
      else
      {
         AV71BarEncCli_To = httpContext.cgiGet( sPrefix+"AV71BarEncCli_To_PARM") ;
      }
      sCtrlAV63BarTipArt = httpContext.cgiGet( sPrefix+"AV63BarTipArt_CTRL") ;
      if ( GXutil.len( sCtrlAV63BarTipArt) > 0 )
      {
         AV63BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV63BarTipArt), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63BarTipArt), 4, 0));
      }
      else
      {
         AV63BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV63BarTipArt_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV64BarTipArt_to = httpContext.cgiGet( sPrefix+"AV64BarTipArt_to_CTRL") ;
      if ( GXutil.len( sCtrlAV64BarTipArt_to) > 0 )
      {
         AV64BarTipArt_to = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV64BarTipArt_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64BarTipArt_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64BarTipArt_to), 4, 0));
      }
      else
      {
         AV64BarTipArt_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV64BarTipArt_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1QN2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1QN2( ) ;
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
      ws1QN2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25Emprcod_PARM", GXutil.rtrim( AV25Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV25Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25Emprcod_CTRL", GXutil.rtrim( sCtrlAV25Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10BarFecSal_PARM", localUtil.dtoc( AV10BarFecSal, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10BarFecSal)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10BarFecSal_CTRL", GXutil.rtrim( sCtrlAV10BarFecSal));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11BarFecSal_To_PARM", localUtil.dtoc( AV11BarFecSal_To, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11BarFecSal_To)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11BarFecSal_To_CTRL", GXutil.rtrim( sCtrlAV11BarFecSal_To));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8BarColNom_PARM", GXutil.rtrim( AV8BarColNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8BarColNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8BarColNom_CTRL", GXutil.rtrim( sCtrlAV8BarColNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9BarColNom_To_PARM", GXutil.rtrim( AV9BarColNom_To));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9BarColNom_To)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9BarColNom_To_CTRL", GXutil.rtrim( sCtrlAV9BarColNom_To));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65BarColNum_PARM", GXutil.ltrim( localUtil.ntoc( AV65BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV65BarColNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65BarColNum_CTRL", GXutil.rtrim( sCtrlAV65BarColNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66BarColNum_to_PARM", GXutil.ltrim( localUtil.ntoc( AV66BarColNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV66BarColNum_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66BarColNum_to_CTRL", GXutil.rtrim( sCtrlAV66BarColNum_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12BarSer_PARM", GXutil.rtrim( AV12BarSer));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV12BarSer)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12BarSer_CTRL", GXutil.rtrim( sCtrlAV12BarSer));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13BarSer_To_PARM", GXutil.rtrim( AV13BarSer_To));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV13BarSer_To)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13BarSer_To_CTRL", GXutil.rtrim( sCtrlAV13BarSer_To));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14CliCod_PARM", GXutil.ltrim( localUtil.ntoc( AV14CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV14CliCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14CliCod_CTRL", GXutil.rtrim( sCtrlAV14CliCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15CliCod_To_PARM", GXutil.ltrim( localUtil.ntoc( AV15CliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV15CliCod_To)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15CliCod_To_CTRL", GXutil.rtrim( sCtrlAV15CliCod_To));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV69BarEncCli_PARM", GXutil.rtrim( AV69BarEncCli));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV69BarEncCli)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV69BarEncCli_CTRL", GXutil.rtrim( sCtrlAV69BarEncCli));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71BarEncCli_To_PARM", GXutil.rtrim( AV71BarEncCli_To));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV71BarEncCli_To)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71BarEncCli_To_CTRL", GXutil.rtrim( sCtrlAV71BarEncCli_To));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63BarTipArt_PARM", GXutil.ltrim( localUtil.ntoc( AV63BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV63BarTipArt)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63BarTipArt_CTRL", GXutil.rtrim( sCtrlAV63BarTipArt));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64BarTipArt_to_PARM", GXutil.ltrim( localUtil.ntoc( AV64BarTipArt_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV64BarTipArt_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64BarTipArt_to_CTRL", GXutil.rtrim( sCtrlAV64BarTipArt_to));
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
      we1QN2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115555733", true, true);
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
      httpContext.AddJavascriptSource("informemermasresumen_wc.js", "?202682115555734", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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

   public void subsflControlProps_392( )
   {
      edtavSdtmermasresumenclientes__clicod_Internalname = sPrefix+"SDTMERMASRESUMENCLIENTES__CLICOD_"+sGXsfl_39_idx ;
      edtavSdtmermasresumenclientes__clinom_Internalname = sPrefix+"SDTMERMASRESUMENCLIENTES__CLINOM_"+sGXsfl_39_idx ;
      edtavKilosent_Internalname = sPrefix+"vKILOSENT_"+sGXsfl_39_idx ;
      edtavKilosexp_Internalname = sPrefix+"vKILOSEXP_"+sGXsfl_39_idx ;
      edtavDifkilos_Internalname = sPrefix+"vDIFKILOS_"+sGXsfl_39_idx ;
      edtavPorkilos_Internalname = sPrefix+"vPORKILOS_"+sGXsfl_39_idx ;
      edtavMetrosent_Internalname = sPrefix+"vMETROSENT_"+sGXsfl_39_idx ;
      edtavMetrosexp_Internalname = sPrefix+"vMETROSEXP_"+sGXsfl_39_idx ;
      edtavDifmetros_Internalname = sPrefix+"vDIFMETROS_"+sGXsfl_39_idx ;
      edtavPormetros_Internalname = sPrefix+"vPORMETROS_"+sGXsfl_39_idx ;
   }

   public void subsflControlProps_fel_392( )
   {
      edtavSdtmermasresumenclientes__clicod_Internalname = sPrefix+"SDTMERMASRESUMENCLIENTES__CLICOD_"+sGXsfl_39_fel_idx ;
      edtavSdtmermasresumenclientes__clinom_Internalname = sPrefix+"SDTMERMASRESUMENCLIENTES__CLINOM_"+sGXsfl_39_fel_idx ;
      edtavKilosent_Internalname = sPrefix+"vKILOSENT_"+sGXsfl_39_fel_idx ;
      edtavKilosexp_Internalname = sPrefix+"vKILOSEXP_"+sGXsfl_39_fel_idx ;
      edtavDifkilos_Internalname = sPrefix+"vDIFKILOS_"+sGXsfl_39_fel_idx ;
      edtavPorkilos_Internalname = sPrefix+"vPORKILOS_"+sGXsfl_39_fel_idx ;
      edtavMetrosent_Internalname = sPrefix+"vMETROSENT_"+sGXsfl_39_fel_idx ;
      edtavMetrosexp_Internalname = sPrefix+"vMETROSEXP_"+sGXsfl_39_fel_idx ;
      edtavDifmetros_Internalname = sPrefix+"vDIFMETROS_"+sGXsfl_39_fel_idx ;
      edtavPormetros_Internalname = sPrefix+"vPORMETROS_"+sGXsfl_39_fel_idx ;
   }

   public void sendrow_392( )
   {
      subsflControlProps_392( ) ;
      wb1QN0( ) ;
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdtmermasresumenclientes__clicod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtmermasresumenclientes__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTMermasResumenCliente)AV53SDTMermasResumenClientes.elementAt(-1+AV98GXV1)).getgxTv_SdtSDTMermasResumenCliente_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtmermasresumenclientes__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTMermasResumenCliente)AV53SDTMermasResumenClientes.elementAt(-1+AV98GXV1)).getgxTv_SdtSDTMermasResumenCliente_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTMermasResumenCliente)AV53SDTMermasResumenClientes.elementAt(-1+AV98GXV1)).getgxTv_SdtSDTMermasResumenCliente_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtmermasresumenclientes__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtmermasresumenclientes__clicod_Visible),Integer.valueOf(edtavSdtmermasresumenclientes__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdtmermasresumenclientes__clinom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtmermasresumenclientes__clinom_Internalname,GXutil.rtrim( ((app.SdtSDTMermasResumenCliente)AV53SDTMermasResumenClientes.elementAt(-1+AV98GXV1)).getgxTv_SdtSDTMermasResumenCliente_Clinom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtmermasresumenclientes__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtmermasresumenclientes__clinom_Visible),Integer.valueOf(edtavSdtmermasresumenclientes__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavKilosent_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavKilosent_Internalname,GXutil.ltrim( localUtil.ntoc( AV40KilosEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavKilosent_Enabled!=0) ? localUtil.format( AV40KilosEnt, "ZZZZZ9.99") : localUtil.format( AV40KilosEnt, "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavKilosent_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavKilosent_Visible),Integer.valueOf(edtavKilosent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavKilosexp_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavKilosexp_Internalname,GXutil.ltrim( localUtil.ntoc( AV41KilosExp, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavKilosexp_Enabled!=0) ? localUtil.format( AV41KilosExp, "ZZZZZ9.99") : localUtil.format( AV41KilosExp, "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavKilosexp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavKilosexp_Visible),Integer.valueOf(edtavKilosexp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDifkilos_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDifkilos_Internalname,GXutil.ltrim( localUtil.ntoc( AV20DifKilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDifkilos_Enabled!=0) ? localUtil.format( AV20DifKilos, "ZZZZZ9.99") : localUtil.format( AV20DifKilos, "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDifkilos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDifkilos_Visible),Integer.valueOf(edtavDifkilos_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPorkilos_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPorkilos_Internalname,GXutil.ltrim( localUtil.ntoc( AV50PorKilos, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPorkilos_Enabled!=0) ? localUtil.format( AV50PorKilos, "ZZ9.99") : localUtil.format( AV50PorKilos, "ZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPorkilos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPorkilos_Visible),Integer.valueOf(edtavPorkilos_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavMetrosent_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMetrosent_Internalname,GXutil.ltrim( localUtil.ntoc( AV45MetrosEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavMetrosent_Enabled!=0) ? localUtil.format( AV45MetrosEnt, "ZZZZZ9.99") : localUtil.format( AV45MetrosEnt, "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMetrosent_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavMetrosent_Visible),Integer.valueOf(edtavMetrosent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavMetrosexp_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMetrosexp_Internalname,GXutil.ltrim( localUtil.ntoc( AV46MetrosExp, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavMetrosexp_Enabled!=0) ? localUtil.format( AV46MetrosExp, "ZZZZZ9.99") : localUtil.format( AV46MetrosExp, "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMetrosexp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavMetrosexp_Visible),Integer.valueOf(edtavMetrosexp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDifmetros_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDifmetros_Internalname,GXutil.ltrim( localUtil.ntoc( AV21DifMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDifmetros_Enabled!=0) ? localUtil.format( AV21DifMetros, "ZZZZZ9.99") : localUtil.format( AV21DifMetros, "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDifmetros_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDifmetros_Visible),Integer.valueOf(edtavDifmetros_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPormetros_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPormetros_Internalname,GXutil.ltrim( localUtil.ntoc( AV51PorMetros, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPormetros_Enabled!=0) ? localUtil.format( AV51PorMetros, "ZZ9.99") : localUtil.format( AV51PorMetros, "ZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPormetros_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPormetros_Visible),Integer.valueOf(edtavPormetros_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1QN2( ) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtmermasresumenclientes__clicod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtmermasresumenclientes__clinom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavKilosent_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Qgs. Entrado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavKilosexp_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Qgs. Saidos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDifkilos_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Qgs. Difer", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPorkilos_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Qgs. %", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavMetrosent_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts. Entrado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavMetrosexp_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts. Saidos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDifmetros_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts. Difer", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPormetros_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts. %", "")) ;
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
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtmermasresumenclientes__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtmermasresumenclientes__clicod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtmermasresumenclientes__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtmermasresumenclientes__clinom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV40KilosEnt, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavKilosent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavKilosent_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV41KilosExp, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavKilosexp_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavKilosexp_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV20DifKilos, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDifkilos_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDifkilos_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV50PorKilos, (byte)(6), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPorkilos_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPorkilos_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV45MetrosEnt, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMetrosent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavMetrosent_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV46MetrosExp, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMetrosexp_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavMetrosexp_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV21DifMetros, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDifmetros_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDifmetros_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV51PorMetros, (byte)(6), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPormetros_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPormetros_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexportreport_Internalname = sPrefix+"BTNEXPORTREPORT" ;
      bttBtnexport_Internalname = sPrefix+"BTNEXPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavSdtmermasresumenclientes__clicod_Internalname = sPrefix+"SDTMERMASRESUMENCLIENTES__CLICOD" ;
      edtavSdtmermasresumenclientes__clinom_Internalname = sPrefix+"SDTMERMASRESUMENCLIENTES__CLINOM" ;
      edtavKilosent_Internalname = sPrefix+"vKILOSENT" ;
      edtavKilosexp_Internalname = sPrefix+"vKILOSEXP" ;
      edtavDifkilos_Internalname = sPrefix+"vDIFKILOS" ;
      edtavPorkilos_Internalname = sPrefix+"vPORKILOS" ;
      edtavMetrosent_Internalname = sPrefix+"vMETROSENT" ;
      edtavMetrosexp_Internalname = sPrefix+"vMETROSEXP" ;
      edtavDifmetros_Internalname = sPrefix+"vDIFMETROS" ;
      edtavPormetros_Internalname = sPrefix+"vPORMETROS" ;
      edtavTotvaluekilosent_Internalname = sPrefix+"vTOTVALUEKILOSENT" ;
      edtavTotvaluekilosexp_Internalname = sPrefix+"vTOTVALUEKILOSEXP" ;
      edtavTotvaluedifkilos_Internalname = sPrefix+"vTOTVALUEDIFKILOS" ;
      edtavTotvaluemetrosent_Internalname = sPrefix+"vTOTVALUEMETROSENT" ;
      edtavTotvaluemetrosexp_Internalname = sPrefix+"vTOTVALUEMETROSEXP" ;
      edtavTotvaluedifmetros_Internalname = sPrefix+"vTOTVALUEDIFMETROS" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTbl_gridlineas_Internalname = sPrefix+"TBL_GRIDLINEAS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Innewwindow1_Internalname = sPrefix+"INNEWWINDOW1" ;
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
      edtavPormetros_Jsonclick = "" ;
      edtavPormetros_Enabled = 0 ;
      edtavDifmetros_Jsonclick = "" ;
      edtavDifmetros_Enabled = 0 ;
      edtavMetrosexp_Jsonclick = "" ;
      edtavMetrosexp_Enabled = 0 ;
      edtavMetrosent_Jsonclick = "" ;
      edtavMetrosent_Enabled = 0 ;
      edtavPorkilos_Jsonclick = "" ;
      edtavPorkilos_Enabled = 0 ;
      edtavDifkilos_Jsonclick = "" ;
      edtavDifkilos_Enabled = 0 ;
      edtavKilosexp_Jsonclick = "" ;
      edtavKilosexp_Enabled = 0 ;
      edtavKilosent_Jsonclick = "" ;
      edtavKilosent_Enabled = 0 ;
      edtavSdtmermasresumenclientes__clinom_Jsonclick = "" ;
      edtavSdtmermasresumenclientes__clinom_Enabled = 0 ;
      edtavSdtmermasresumenclientes__clinom_Visible = -1 ;
      edtavSdtmermasresumenclientes__clicod_Jsonclick = "" ;
      edtavSdtmermasresumenclientes__clicod_Enabled = 0 ;
      edtavSdtmermasresumenclientes__clicod_Visible = -1 ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvaluedifmetros_Jsonclick = "" ;
      edtavTotvaluedifmetros_Enabled = 1 ;
      edtavTotvaluemetrosexp_Jsonclick = "" ;
      edtavTotvaluemetrosexp_Enabled = 1 ;
      edtavTotvaluemetrosent_Jsonclick = "" ;
      edtavTotvaluemetrosent_Enabled = 1 ;
      edtavTotvaluedifkilos_Jsonclick = "" ;
      edtavTotvaluedifkilos_Enabled = 1 ;
      edtavTotvaluekilosexp_Jsonclick = "" ;
      edtavTotvaluekilosexp_Enabled = 1 ;
      edtavTotvaluekilosent_Jsonclick = "" ;
      edtavTotvaluekilosent_Enabled = 1 ;
      edtavPormetros_Visible = -1 ;
      edtavDifmetros_Visible = -1 ;
      edtavMetrosexp_Visible = -1 ;
      edtavMetrosent_Visible = -1 ;
      edtavPorkilos_Visible = -1 ;
      edtavDifkilos_Visible = -1 ;
      edtavKilosexp_Visible = -1 ;
      edtavKilosent_Visible = -1 ;
      edtavSdtmermasresumenclientes__clinom_Visible = -1 ;
      edtavSdtmermasresumenclientes__clicod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavSdtmermasresumenclientes__clinom_Enabled = -1 ;
      edtavSdtmermasresumenclientes__clicod_Enabled = -1 ;
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
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "|||||||||" ;
      Ddo_grid_Columnids = "0:SDTMermasResumenClientes__Clicod|1:SDTMermasResumenClientes__CliNom|2:KilosEnt|3:KilosExp|4:DifKilos|5:PorKilos|6:MetrosEnt|7:MetrosExp|8:DifMetros|9:PorMetros" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60ImpCod',fld:'vIMPCOD',pic:''},{av:'AV63BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV64BarTipArt_to',fld:'vBARTIPART_TO',pic:'ZZZ9'},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV15CliCod_To',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV12BarSer',fld:'vBARSER',pic:''},{av:'AV13BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV8BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV9BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV65BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV66BarColNum_to',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV61PDisCli',fld:'vPDISCLI',pic:'',hsh:true},{av:'AV62UDisCli',fld:'vUDISCLI',pic:'',hsh:true},{av:'AV10BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV11BarFecSal_To',fld:'vBARFECSAL_TO',pic:''},{av:'AV104Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV53SDTMermasResumenClientes',fld:'vSDTMERMASRESUMENCLIENTES',grid:39,pic:''},{av:'nGXsfl_39_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:39},{av:'nRC_GXsfl_39',ctrl:'GRID',prop:'GridRC',grid:39},{av:'AV40KilosEnt',fld:'vKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV41KilosExp',fld:'vKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV20DifKilos',fld:'vDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV45MetrosEnt',fld:'vMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV46MetrosExp',fld:'vMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV21DifMetros',fld:'vDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV81TotKilosEnt',fld:'vTOTKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV85TotKilosExp',fld:'vTOTKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV87TotDifKilos',fld:'vTOTDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotMetrosEnt',fld:'vTOTMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotMetrosExp',fld:'vTOTMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV93TotDifMetros',fld:'vTOTDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV73TotalKilosEnt',fld:'vTOTALKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV74TotalKilosExp',fld:'vTOTALKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV75TotalDifKilos',fld:'vTOTALDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV77TotalMetrosEnt',fld:'vTOTALMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV78TotalMetrosExp',fld:'vTOTALMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV79TotalDifMetros',fld:'vTOTALDIFMETROS',pic:'ZZZZZ9.99',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'SDTMERMASRESUMENCLIENTES__CLICOD',prop:'Visible'},{ctrl:'SDTMERMASRESUMENCLIENTES__CLINOM',prop:'Visible'},{av:'edtavKilosent_Visible',ctrl:'vKILOSENT',prop:'Visible'},{av:'edtavKilosexp_Visible',ctrl:'vKILOSEXP',prop:'Visible'},{av:'edtavDifkilos_Visible',ctrl:'vDIFKILOS',prop:'Visible'},{av:'edtavPorkilos_Visible',ctrl:'vPORKILOS',prop:'Visible'},{av:'edtavMetrosent_Visible',ctrl:'vMETROSENT',prop:'Visible'},{av:'edtavMetrosexp_Visible',ctrl:'vMETROSEXP',prop:'Visible'},{av:'edtavDifmetros_Visible',ctrl:'vDIFMETROS',prop:'Visible'},{av:'edtavPormetros_Visible',ctrl:'vPORMETROS',prop:'Visible'},{av:'AV30GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV31GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV60ImpCod',fld:'vIMPCOD',pic:''},{av:'AV53SDTMermasResumenClientes',fld:'vSDTMERMASRESUMENCLIENTES',grid:39,pic:''},{av:'nGXsfl_39_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:39},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_39',ctrl:'GRID',prop:'GridRC',grid:39},{av:'AV81TotKilosEnt',fld:'vTOTKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV85TotKilosExp',fld:'vTOTKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV87TotDifKilos',fld:'vTOTDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotMetrosEnt',fld:'vTOTMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotMetrosExp',fld:'vTOTMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV93TotDifMetros',fld:'vTOTDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV40KilosEnt',fld:'vKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV41KilosExp',fld:'vKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV20DifKilos',fld:'vDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV50PorKilos',fld:'vPORKILOS',pic:'ZZ9.99'},{av:'AV45MetrosEnt',fld:'vMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV46MetrosExp',fld:'vMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV21DifMetros',fld:'vDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV51PorMetros',fld:'vPORMETROS',pic:'ZZ9.99'},{av:'AV82TotValueKilosEnt',fld:'vTOTVALUEKILOSENT',pic:''},{av:'AV86TotValueKilosExp',fld:'vTOTVALUEKILOSEXP',pic:''},{av:'AV88TotValueDifKilos',fld:'vTOTVALUEDIFKILOS',pic:''},{av:'AV90TotValueMetrosEnt',fld:'vTOTVALUEMETROSENT',pic:''},{av:'AV92TotValueMetrosExp',fld:'vTOTVALUEMETROSEXP',pic:''},{av:'AV94TotValueDifMetros',fld:'vTOTVALUEDIFMETROS',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111QN2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60ImpCod',fld:'vIMPCOD',pic:''},{av:'AV63BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV64BarTipArt_to',fld:'vBARTIPART_TO',pic:'ZZZ9'},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV15CliCod_To',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV12BarSer',fld:'vBARSER',pic:''},{av:'AV13BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV8BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV9BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV65BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV66BarColNum_to',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV61PDisCli',fld:'vPDISCLI',pic:'',hsh:true},{av:'AV62UDisCli',fld:'vUDISCLI',pic:'',hsh:true},{av:'AV10BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV11BarFecSal_To',fld:'vBARFECSAL_TO',pic:''},{av:'AV104Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV53SDTMermasResumenClientes',fld:'vSDTMERMASRESUMENCLIENTES',grid:39,pic:''},{av:'nGXsfl_39_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:39},{av:'nRC_GXsfl_39',ctrl:'GRID',prop:'GridRC',grid:39},{av:'AV40KilosEnt',fld:'vKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV41KilosExp',fld:'vKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV20DifKilos',fld:'vDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV45MetrosEnt',fld:'vMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV46MetrosExp',fld:'vMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV21DifMetros',fld:'vDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV81TotKilosEnt',fld:'vTOTKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV85TotKilosExp',fld:'vTOTKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV87TotDifKilos',fld:'vTOTDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotMetrosEnt',fld:'vTOTMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotMetrosExp',fld:'vTOTMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV93TotDifMetros',fld:'vTOTDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV73TotalKilosEnt',fld:'vTOTALKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV74TotalKilosExp',fld:'vTOTALKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV75TotalDifKilos',fld:'vTOTALDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV77TotalMetrosEnt',fld:'vTOTALMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV78TotalMetrosExp',fld:'vTOTALMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV79TotalDifMetros',fld:'vTOTALDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121QN2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60ImpCod',fld:'vIMPCOD',pic:''},{av:'AV63BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV64BarTipArt_to',fld:'vBARTIPART_TO',pic:'ZZZ9'},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV15CliCod_To',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV12BarSer',fld:'vBARSER',pic:''},{av:'AV13BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV8BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV9BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV65BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV66BarColNum_to',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV61PDisCli',fld:'vPDISCLI',pic:'',hsh:true},{av:'AV62UDisCli',fld:'vUDISCLI',pic:'',hsh:true},{av:'AV10BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV11BarFecSal_To',fld:'vBARFECSAL_TO',pic:''},{av:'AV104Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV53SDTMermasResumenClientes',fld:'vSDTMERMASRESUMENCLIENTES',grid:39,pic:''},{av:'nGXsfl_39_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:39},{av:'nRC_GXsfl_39',ctrl:'GRID',prop:'GridRC',grid:39},{av:'AV40KilosEnt',fld:'vKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV41KilosExp',fld:'vKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV20DifKilos',fld:'vDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV45MetrosEnt',fld:'vMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV46MetrosExp',fld:'vMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV21DifMetros',fld:'vDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV81TotKilosEnt',fld:'vTOTKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV85TotKilosExp',fld:'vTOTKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV87TotDifKilos',fld:'vTOTDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotMetrosEnt',fld:'vTOTMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotMetrosExp',fld:'vTOTMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV93TotDifMetros',fld:'vTOTDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV73TotalKilosEnt',fld:'vTOTALKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV74TotalKilosExp',fld:'vTOTALKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV75TotalDifKilos',fld:'vTOTALDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV77TotalMetrosEnt',fld:'vTOTALMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV78TotalMetrosExp',fld:'vTOTALMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV79TotalDifMetros',fld:'vTOTALDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e191QN2',iparms:[{av:'AV53SDTMermasResumenClientes',fld:'vSDTMERMASRESUMENCLIENTES',grid:39,pic:''},{av:'nGXsfl_39_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:39},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_39',ctrl:'GRID',prop:'GridRC',grid:39},{av:'AV73TotalKilosEnt',fld:'vTOTALKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV74TotalKilosExp',fld:'vTOTALKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV75TotalDifKilos',fld:'vTOTALDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV77TotalMetrosEnt',fld:'vTOTALMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV78TotalMetrosExp',fld:'vTOTALMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV79TotalDifMetros',fld:'vTOTALDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV81TotKilosEnt',fld:'vTOTKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV85TotKilosExp',fld:'vTOTKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV87TotDifKilos',fld:'vTOTDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotMetrosEnt',fld:'vTOTMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotMetrosExp',fld:'vTOTMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV93TotDifMetros',fld:'vTOTDIFMETROS',pic:'ZZZZZ9.99',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV40KilosEnt',fld:'vKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV41KilosExp',fld:'vKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV20DifKilos',fld:'vDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV50PorKilos',fld:'vPORKILOS',pic:'ZZ9.99'},{av:'AV45MetrosEnt',fld:'vMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV46MetrosExp',fld:'vMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV21DifMetros',fld:'vDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV51PorMetros',fld:'vPORMETROS',pic:'ZZ9.99'},{av:'AV73TotalKilosEnt',fld:'vTOTALKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV74TotalKilosExp',fld:'vTOTALKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV75TotalDifKilos',fld:'vTOTALDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV77TotalMetrosEnt',fld:'vTOTALMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV78TotalMetrosExp',fld:'vTOTALMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV79TotalDifMetros',fld:'vTOTALDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV82TotValueKilosEnt',fld:'vTOTVALUEKILOSENT',pic:''},{av:'AV86TotValueKilosExp',fld:'vTOTVALUEKILOSEXP',pic:''},{av:'AV88TotValueDifKilos',fld:'vTOTVALUEDIFKILOS',pic:''},{av:'AV90TotValueMetrosEnt',fld:'vTOTVALUEMETROSENT',pic:''},{av:'AV92TotValueMetrosExp',fld:'vTOTVALUEMETROSEXP',pic:''},{av:'AV94TotValueDifMetros',fld:'vTOTVALUEDIFMETROS',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e131QN2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60ImpCod',fld:'vIMPCOD',pic:''},{av:'AV63BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV64BarTipArt_to',fld:'vBARTIPART_TO',pic:'ZZZ9'},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV15CliCod_To',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV12BarSer',fld:'vBARSER',pic:''},{av:'AV13BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV8BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV9BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV65BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV66BarColNum_to',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV61PDisCli',fld:'vPDISCLI',pic:'',hsh:true},{av:'AV62UDisCli',fld:'vUDISCLI',pic:'',hsh:true},{av:'AV10BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV11BarFecSal_To',fld:'vBARFECSAL_TO',pic:''},{av:'AV104Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV53SDTMermasResumenClientes',fld:'vSDTMERMASRESUMENCLIENTES',grid:39,pic:''},{av:'nGXsfl_39_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:39},{av:'nRC_GXsfl_39',ctrl:'GRID',prop:'GridRC',grid:39},{av:'AV40KilosEnt',fld:'vKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV41KilosExp',fld:'vKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV20DifKilos',fld:'vDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV45MetrosEnt',fld:'vMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV46MetrosExp',fld:'vMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV21DifMetros',fld:'vDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV81TotKilosEnt',fld:'vTOTKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV85TotKilosExp',fld:'vTOTKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV87TotDifKilos',fld:'vTOTDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotMetrosEnt',fld:'vTOTMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotMetrosExp',fld:'vTOTMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV93TotDifMetros',fld:'vTOTDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV73TotalKilosEnt',fld:'vTOTALKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV74TotalKilosExp',fld:'vTOTALKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV75TotalDifKilos',fld:'vTOTALDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV77TotalMetrosEnt',fld:'vTOTALMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV78TotalMetrosExp',fld:'vTOTALMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV79TotalDifMetros',fld:'vTOTALDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'SDTMERMASRESUMENCLIENTES__CLICOD',prop:'Visible'},{ctrl:'SDTMERMASRESUMENCLIENTES__CLINOM',prop:'Visible'},{av:'edtavKilosent_Visible',ctrl:'vKILOSENT',prop:'Visible'},{av:'edtavKilosexp_Visible',ctrl:'vKILOSEXP',prop:'Visible'},{av:'edtavDifkilos_Visible',ctrl:'vDIFKILOS',prop:'Visible'},{av:'edtavPorkilos_Visible',ctrl:'vPORKILOS',prop:'Visible'},{av:'edtavMetrosent_Visible',ctrl:'vMETROSENT',prop:'Visible'},{av:'edtavMetrosexp_Visible',ctrl:'vMETROSEXP',prop:'Visible'},{av:'edtavDifmetros_Visible',ctrl:'vDIFMETROS',prop:'Visible'},{av:'edtavPormetros_Visible',ctrl:'vPORMETROS',prop:'Visible'},{av:'AV30GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV31GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV60ImpCod',fld:'vIMPCOD',pic:''},{av:'AV53SDTMermasResumenClientes',fld:'vSDTMERMASRESUMENCLIENTES',grid:39,pic:''},{av:'nGXsfl_39_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:39},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_39',ctrl:'GRID',prop:'GridRC',grid:39},{av:'AV81TotKilosEnt',fld:'vTOTKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV85TotKilosExp',fld:'vTOTKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV87TotDifKilos',fld:'vTOTDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotMetrosEnt',fld:'vTOTMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotMetrosExp',fld:'vTOTMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV93TotDifMetros',fld:'vTOTDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV40KilosEnt',fld:'vKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV41KilosExp',fld:'vKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV20DifKilos',fld:'vDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV50PorKilos',fld:'vPORKILOS',pic:'ZZ9.99'},{av:'AV45MetrosEnt',fld:'vMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV46MetrosExp',fld:'vMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV21DifMetros',fld:'vDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV51PorMetros',fld:'vPORMETROS',pic:'ZZ9.99'},{av:'AV82TotValueKilosEnt',fld:'vTOTVALUEKILOSENT',pic:''},{av:'AV86TotValueKilosExp',fld:'vTOTVALUEKILOSEXP',pic:''},{av:'AV88TotValueDifKilos',fld:'vTOTVALUEDIFKILOS',pic:''},{av:'AV90TotValueMetrosEnt',fld:'vTOTVALUEMETROSENT',pic:''},{av:'AV92TotValueMetrosExp',fld:'vTOTVALUEMETROSEXP',pic:''},{av:'AV94TotValueDifMetros',fld:'vTOTVALUEDIFMETROS',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e141QN2',iparms:[{av:'AV10BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV11BarFecSal_To',fld:'vBARFECSAL_TO',pic:''},{av:'AV53SDTMermasResumenClientes',fld:'vSDTMERMASRESUMENCLIENTES',grid:39,pic:''},{av:'nGXsfl_39_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:39},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_39',ctrl:'GRID',prop:'GridRC',grid:39},{av:'AV25Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60ImpCod',fld:'vIMPCOD',pic:''},{av:'AV63BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV64BarTipArt_to',fld:'vBARTIPART_TO',pic:'ZZZ9'},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV15CliCod_To',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV12BarSer',fld:'vBARSER',pic:''},{av:'AV13BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV8BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV9BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV65BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV66BarColNum_to',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV61PDisCli',fld:'vPDISCLI',pic:'',hsh:true},{av:'AV62UDisCli',fld:'vUDISCLI',pic:'',hsh:true},{av:'AV104Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV40KilosEnt',fld:'vKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV41KilosExp',fld:'vKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV20DifKilos',fld:'vDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV45MetrosEnt',fld:'vMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV46MetrosExp',fld:'vMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV21DifMetros',fld:'vDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV81TotKilosEnt',fld:'vTOTKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV85TotKilosExp',fld:'vTOTKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV87TotDifKilos',fld:'vTOTDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotMetrosEnt',fld:'vTOTMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotMetrosExp',fld:'vTOTMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV93TotDifMetros',fld:'vTOTDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV73TotalKilosEnt',fld:'vTOTALKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV74TotalKilosExp',fld:'vTOTALKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV75TotalDifKilos',fld:'vTOTALDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV77TotalMetrosEnt',fld:'vTOTALMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV78TotalMetrosExp',fld:'vTOTALMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV79TotalDifMetros',fld:'vTOTALDIFMETROS',pic:'ZZZZZ9.99',hsh:true}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV53SDTMermasResumenClientes',fld:'vSDTMERMASRESUMENCLIENTES',grid:39,pic:''},{av:'nGXsfl_39_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:39},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_39',ctrl:'GRID',prop:'GridRC',grid:39},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nEOF'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60ImpCod',fld:'vIMPCOD',pic:''},{av:'AV63BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV64BarTipArt_to',fld:'vBARTIPART_TO',pic:'ZZZ9'},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV15CliCod_To',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV12BarSer',fld:'vBARSER',pic:''},{av:'AV13BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV8BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV9BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV65BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV66BarColNum_to',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV61PDisCli',fld:'vPDISCLI',pic:'',hsh:true},{av:'AV62UDisCli',fld:'vUDISCLI',pic:'',hsh:true},{av:'AV10BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV11BarFecSal_To',fld:'vBARFECSAL_TO',pic:''},{av:'AV104Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV40KilosEnt',fld:'vKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV41KilosExp',fld:'vKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV20DifKilos',fld:'vDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV45MetrosEnt',fld:'vMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV46MetrosExp',fld:'vMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV21DifMetros',fld:'vDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV81TotKilosEnt',fld:'vTOTKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV85TotKilosExp',fld:'vTOTKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV87TotDifKilos',fld:'vTOTDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotMetrosEnt',fld:'vTOTMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotMetrosExp',fld:'vTOTMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV93TotDifMetros',fld:'vTOTDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV73TotalKilosEnt',fld:'vTOTALKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV74TotalKilosExp',fld:'vTOTALKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV75TotalDifKilos',fld:'vTOTALDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV77TotalMetrosEnt',fld:'vTOTALMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV78TotalMetrosExp',fld:'vTOTALMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV79TotalDifMetros',fld:'vTOTALDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e151QN2',iparms:[{av:'AV25Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60ImpCod',fld:'vIMPCOD',pic:''},{av:'AV63BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV64BarTipArt_to',fld:'vBARTIPART_TO',pic:'ZZZ9'},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV15CliCod_To',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV12BarSer',fld:'vBARSER',pic:''},{av:'AV13BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV8BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV9BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV65BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV66BarColNum_to',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV61PDisCli',fld:'vPDISCLI',pic:'',hsh:true},{av:'AV62UDisCli',fld:'vUDISCLI',pic:'',hsh:true},{av:'AV10BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV11BarFecSal_To',fld:'vBARFECSAL_TO',pic:''},{av:'AV53SDTMermasResumenClientes',fld:'vSDTMERMASRESUMENCLIENTES',grid:39,pic:''},{av:'nGXsfl_39_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:39},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_39',ctrl:'GRID',prop:'GridRC',grid:39},{av:'AV104Pgmname',fld:'vPGMNAME',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60ImpCod',fld:'vIMPCOD',pic:''},{av:'AV63BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV64BarTipArt_to',fld:'vBARTIPART_TO',pic:'ZZZ9'},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV15CliCod_To',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV12BarSer',fld:'vBARSER',pic:''},{av:'AV13BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV8BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV9BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV65BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV66BarColNum_to',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV61PDisCli',fld:'vPDISCLI',pic:'',hsh:true},{av:'AV62UDisCli',fld:'vUDISCLI',pic:'',hsh:true},{av:'AV10BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV11BarFecSal_To',fld:'vBARFECSAL_TO',pic:''},{av:'AV104Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV53SDTMermasResumenClientes',fld:'vSDTMERMASRESUMENCLIENTES',grid:39,pic:''},{av:'nGXsfl_39_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:39},{av:'nRC_GXsfl_39',ctrl:'GRID',prop:'GridRC',grid:39},{av:'AV40KilosEnt',fld:'vKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV41KilosExp',fld:'vKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV20DifKilos',fld:'vDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV45MetrosEnt',fld:'vMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV46MetrosExp',fld:'vMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV21DifMetros',fld:'vDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV81TotKilosEnt',fld:'vTOTKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV85TotKilosExp',fld:'vTOTKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV87TotDifKilos',fld:'vTOTDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotMetrosEnt',fld:'vTOTMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotMetrosExp',fld:'vTOTMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV93TotDifMetros',fld:'vTOTDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV73TotalKilosEnt',fld:'vTOTALKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV74TotalKilosExp',fld:'vTOTALKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV75TotalDifKilos',fld:'vTOTALDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV77TotalMetrosEnt',fld:'vTOTALMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV78TotalMetrosExp',fld:'vTOTALMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV79TotalDifMetros',fld:'vTOTALDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e161QN2',iparms:[{av:'AV10BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV11BarFecSal_To',fld:'vBARFECSAL_TO',pic:''},{av:'AV53SDTMermasResumenClientes',fld:'vSDTMERMASRESUMENCLIENTES',grid:39,pic:''},{av:'nGXsfl_39_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:39},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_39',ctrl:'GRID',prop:'GridRC',grid:39},{av:'AV25Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60ImpCod',fld:'vIMPCOD',pic:''},{av:'AV63BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV64BarTipArt_to',fld:'vBARTIPART_TO',pic:'ZZZ9'},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV15CliCod_To',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV12BarSer',fld:'vBARSER',pic:''},{av:'AV13BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV8BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV9BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV65BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV66BarColNum_to',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV61PDisCli',fld:'vPDISCLI',pic:'',hsh:true},{av:'AV62UDisCli',fld:'vUDISCLI',pic:'',hsh:true},{av:'AV104Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV40KilosEnt',fld:'vKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV41KilosExp',fld:'vKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV20DifKilos',fld:'vDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV45MetrosEnt',fld:'vMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV46MetrosExp',fld:'vMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV21DifMetros',fld:'vDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV81TotKilosEnt',fld:'vTOTKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV85TotKilosExp',fld:'vTOTKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV87TotDifKilos',fld:'vTOTDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotMetrosEnt',fld:'vTOTMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotMetrosExp',fld:'vTOTMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV93TotDifMetros',fld:'vTOTDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV73TotalKilosEnt',fld:'vTOTALKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV74TotalKilosExp',fld:'vTOTALKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV75TotalDifKilos',fld:'vTOTALDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV77TotalMetrosEnt',fld:'vTOTALMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV78TotalMetrosExp',fld:'vTOTALMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV79TotalDifMetros',fld:'vTOTALDIFMETROS',pic:'ZZZZZ9.99',hsh:true}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV53SDTMermasResumenClientes',fld:'vSDTMERMASRESUMENCLIENTES',grid:39,pic:''},{av:'nGXsfl_39_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:39},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_39',ctrl:'GRID',prop:'GridRC',grid:39},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nEOF'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60ImpCod',fld:'vIMPCOD',pic:''},{av:'AV63BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV64BarTipArt_to',fld:'vBARTIPART_TO',pic:'ZZZ9'},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV15CliCod_To',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV12BarSer',fld:'vBARSER',pic:''},{av:'AV13BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV8BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV9BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV65BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV66BarColNum_to',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV61PDisCli',fld:'vPDISCLI',pic:'',hsh:true},{av:'AV62UDisCli',fld:'vUDISCLI',pic:'',hsh:true},{av:'AV10BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV11BarFecSal_To',fld:'vBARFECSAL_TO',pic:''},{av:'AV104Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV40KilosEnt',fld:'vKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV41KilosExp',fld:'vKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV20DifKilos',fld:'vDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV45MetrosEnt',fld:'vMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV46MetrosExp',fld:'vMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV21DifMetros',fld:'vDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV81TotKilosEnt',fld:'vTOTKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV85TotKilosExp',fld:'vTOTKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV87TotDifKilos',fld:'vTOTDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotMetrosEnt',fld:'vTOTMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotMetrosExp',fld:'vTOTMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV93TotDifMetros',fld:'vTOTDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV73TotalKilosEnt',fld:'vTOTALKILOSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV74TotalKilosExp',fld:'vTOTALKILOSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV75TotalDifKilos',fld:'vTOTALDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV77TotalMetrosEnt',fld:'vTOTALMETROSENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV78TotalMetrosExp',fld:'vTOTALMETROSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV79TotalDifMetros',fld:'vTOTALDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'}]}");
      setEventMetadata("NULL","{handler:'validv_Pormetros',iparms:[]");
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
      wcpOAV25Emprcod = "" ;
      wcpOAV10BarFecSal = GXutil.nullDate() ;
      wcpOAV11BarFecSal_To = GXutil.nullDate() ;
      wcpOAV8BarColNom = "" ;
      wcpOAV9BarColNom_To = "" ;
      wcpOAV12BarSer = "" ;
      wcpOAV13BarSer_To = "" ;
      wcpOAV69BarEncCli = "" ;
      wcpOAV71BarEncCli_To = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV25Emprcod = "" ;
      AV10BarFecSal = GXutil.nullDate() ;
      AV11BarFecSal_To = GXutil.nullDate() ;
      AV8BarColNom = "" ;
      AV9BarColNom_To = "" ;
      AV12BarSer = "" ;
      AV13BarSer_To = "" ;
      AV69BarEncCli = "" ;
      AV71BarEncCli_To = "" ;
      AV16ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV60ImpCod = "" ;
      AV61PDisCli = "" ;
      AV62UDisCli = "" ;
      AV104Pgmname = "" ;
      AV53SDTMermasResumenClientes = new GXBaseCollection<app.SdtSDTMermasResumenCliente>(app.SdtSDTMermasResumenCliente.class, "SDTMermasResumenCliente", "TexplusNET", remoteHandle);
      AV40KilosEnt = DecimalUtil.ZERO ;
      AV41KilosExp = DecimalUtil.ZERO ;
      AV20DifKilos = DecimalUtil.ZERO ;
      AV45MetrosEnt = DecimalUtil.ZERO ;
      AV46MetrosExp = DecimalUtil.ZERO ;
      AV21DifMetros = DecimalUtil.ZERO ;
      AV81TotKilosEnt = DecimalUtil.ZERO ;
      AV85TotKilosExp = DecimalUtil.ZERO ;
      AV87TotDifKilos = DecimalUtil.ZERO ;
      AV89TotMetrosEnt = DecimalUtil.ZERO ;
      AV91TotMetrosExp = DecimalUtil.ZERO ;
      AV93TotDifMetros = DecimalUtil.ZERO ;
      AV73TotalKilosEnt = DecimalUtil.ZERO ;
      AV74TotalKilosExp = DecimalUtil.ZERO ;
      AV75TotalDifKilos = DecimalUtil.ZERO ;
      AV77TotalMetrosEnt = DecimalUtil.ZERO ;
      AV78TotalMetrosExp = DecimalUtil.ZERO ;
      AV79TotalDifMetros = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV19DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexportreport_Jsonclick = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV50PorKilos = DecimalUtil.ZERO ;
      AV51PorMetros = DecimalUtil.ZERO ;
      AV82TotValueKilosEnt = "" ;
      AV86TotValueKilosExp = "" ;
      AV88TotValueDifKilos = "" ;
      AV90TotValueMetrosEnt = "" ;
      AV92TotValueMetrosExp = "" ;
      AV94TotValueDifMetros = "" ;
      AV101Station = "" ;
      GXv_char2 = new String[1] ;
      AV102Emprnom = "" ;
      AV103Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV58WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV54Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV5WebSession = httpContext.getWebSession();
      AV52ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV27ExcelFilename = "" ;
      AV26ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      AV57UserCustomValue = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV17ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      GXt_objcol_SdtSDTMermasResumenCliente10 = new GXBaseCollection<app.SdtSDTMermasResumenCliente>(app.SdtSDTMermasResumenCliente.class, "SDTMermasResumenCliente", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTMermasResumenCliente11 = new GXBaseCollection[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV25Emprcod = "" ;
      sCtrlAV10BarFecSal = "" ;
      sCtrlAV11BarFecSal_To = "" ;
      sCtrlAV8BarColNom = "" ;
      sCtrlAV9BarColNom_To = "" ;
      sCtrlAV65BarColNum = "" ;
      sCtrlAV66BarColNum_to = "" ;
      sCtrlAV12BarSer = "" ;
      sCtrlAV13BarSer_To = "" ;
      sCtrlAV14CliCod = "" ;
      sCtrlAV15CliCod_To = "" ;
      sCtrlAV69BarEncCli = "" ;
      sCtrlAV71BarEncCli_To = "" ;
      sCtrlAV63BarTipArt = "" ;
      sCtrlAV64BarTipArt_to = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV104Pgmname = "InformeMermasResumen_WC" ;
      /* GeneXus formulas. */
      AV104Pgmname = "InformeMermasResumen_WC" ;
      Gx_err = (short)(0) ;
      edtavSdtmermasresumenclientes__clicod_Enabled = 0 ;
      edtavSdtmermasresumenclientes__clinom_Enabled = 0 ;
      edtavKilosent_Enabled = 0 ;
      edtavKilosexp_Enabled = 0 ;
      edtavDifkilos_Enabled = 0 ;
      edtavPorkilos_Enabled = 0 ;
      edtavMetrosent_Enabled = 0 ;
      edtavMetrosexp_Enabled = 0 ;
      edtavDifmetros_Enabled = 0 ;
      edtavPormetros_Enabled = 0 ;
      edtavTotvaluekilosent_Enabled = 0 ;
      edtavTotvaluekilosexp_Enabled = 0 ;
      edtavTotvaluedifkilos_Enabled = 0 ;
      edtavTotvaluemetrosent_Enabled = 0 ;
      edtavTotvaluemetrosexp_Enabled = 0 ;
      edtavTotvaluedifmetros_Enabled = 0 ;
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
   private short wcpOAV63BarTipArt ;
   private short wcpOAV64BarTipArt_to ;
   private short AV63BarTipArt ;
   private short AV64BarTipArt_to ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV65BarColNum ;
   private int wcpOAV66BarColNum_to ;
   private int wcpOAV14CliCod ;
   private int wcpOAV15CliCod_To ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_39 ;
   private int AV65BarColNum ;
   private int AV66BarColNum_to ;
   private int AV14CliCod ;
   private int AV15CliCod_To ;
   private int nGXsfl_39_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV98GXV1 ;
   private int subGrid_Islastpage ;
   private int edtavSdtmermasresumenclientes__clicod_Enabled ;
   private int edtavSdtmermasresumenclientes__clinom_Enabled ;
   private int edtavKilosent_Enabled ;
   private int edtavKilosexp_Enabled ;
   private int edtavDifkilos_Enabled ;
   private int edtavPorkilos_Enabled ;
   private int edtavMetrosent_Enabled ;
   private int edtavMetrosexp_Enabled ;
   private int edtavDifmetros_Enabled ;
   private int edtavPormetros_Enabled ;
   private int edtavTotvaluekilosent_Enabled ;
   private int edtavTotvaluekilosexp_Enabled ;
   private int edtavTotvaluedifkilos_Enabled ;
   private int edtavTotvaluemetrosent_Enabled ;
   private int edtavTotvaluemetrosexp_Enabled ;
   private int edtavTotvaluedifmetros_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_39_fel_idx=1 ;
   private int edtavSdtmermasresumenclientes__clicod_Visible ;
   private int edtavSdtmermasresumenclientes__clinom_Visible ;
   private int edtavKilosent_Visible ;
   private int edtavKilosexp_Visible ;
   private int edtavDifkilos_Visible ;
   private int edtavPorkilos_Visible ;
   private int edtavMetrosent_Visible ;
   private int edtavMetrosexp_Visible ;
   private int edtavDifmetros_Visible ;
   private int edtavPormetros_Visible ;
   private int AV47PageToGo ;
   private int nGXsfl_39_bak_idx=1 ;
   private int AV95i ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV30GridCurrentPage ;
   private long AV31GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV40KilosEnt ;
   private java.math.BigDecimal AV41KilosExp ;
   private java.math.BigDecimal AV20DifKilos ;
   private java.math.BigDecimal AV45MetrosEnt ;
   private java.math.BigDecimal AV46MetrosExp ;
   private java.math.BigDecimal AV21DifMetros ;
   private java.math.BigDecimal AV81TotKilosEnt ;
   private java.math.BigDecimal AV85TotKilosExp ;
   private java.math.BigDecimal AV87TotDifKilos ;
   private java.math.BigDecimal AV89TotMetrosEnt ;
   private java.math.BigDecimal AV91TotMetrosExp ;
   private java.math.BigDecimal AV93TotDifMetros ;
   private java.math.BigDecimal AV73TotalKilosEnt ;
   private java.math.BigDecimal AV74TotalKilosExp ;
   private java.math.BigDecimal AV75TotalDifKilos ;
   private java.math.BigDecimal AV77TotalMetrosEnt ;
   private java.math.BigDecimal AV78TotalMetrosExp ;
   private java.math.BigDecimal AV79TotalDifMetros ;
   private java.math.BigDecimal AV50PorKilos ;
   private java.math.BigDecimal AV51PorMetros ;
   private String wcpOAV25Emprcod ;
   private String wcpOAV8BarColNom ;
   private String wcpOAV9BarColNom_To ;
   private String wcpOAV12BarSer ;
   private String wcpOAV13BarSer_To ;
   private String wcpOAV69BarEncCli ;
   private String wcpOAV71BarEncCli_To ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV25Emprcod ;
   private String AV8BarColNom ;
   private String AV9BarColNom_To ;
   private String AV12BarSer ;
   private String AV13BarSer_To ;
   private String AV69BarEncCli ;
   private String AV71BarEncCli_To ;
   private String sGXsfl_39_idx="0001" ;
   private String AV60ImpCod ;
   private String AV61PDisCli ;
   private String AV62UDisCli ;
   private String AV104Pgmname ;
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
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Fixable ;
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
   private String bttBtnexportreport_Internalname ;
   private String bttBtnexportreport_Jsonclick ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divTbl_gridlineas_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavTotvaluekilosent_Internalname ;
   private String edtavKilosent_Internalname ;
   private String edtavKilosexp_Internalname ;
   private String edtavDifkilos_Internalname ;
   private String edtavPorkilos_Internalname ;
   private String edtavMetrosent_Internalname ;
   private String edtavMetrosexp_Internalname ;
   private String edtavDifmetros_Internalname ;
   private String edtavPormetros_Internalname ;
   private String edtavSdtmermasresumenclientes__clicod_Internalname ;
   private String edtavSdtmermasresumenclientes__clinom_Internalname ;
   private String edtavTotvaluekilosexp_Internalname ;
   private String edtavTotvaluedifkilos_Internalname ;
   private String edtavTotvaluemetrosent_Internalname ;
   private String edtavTotvaluemetrosexp_Internalname ;
   private String edtavTotvaluedifmetros_Internalname ;
   private String sGXsfl_39_fel_idx="0001" ;
   private String AV101Station ;
   private String GXv_char2[] ;
   private String AV102Emprnom ;
   private String AV103Usurcod ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluekilosent_Jsonclick ;
   private String edtavTotvaluekilosexp_Jsonclick ;
   private String edtavTotvaluedifkilos_Jsonclick ;
   private String edtavTotvaluemetrosent_Jsonclick ;
   private String edtavTotvaluemetrosexp_Jsonclick ;
   private String edtavTotvaluedifmetros_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV25Emprcod ;
   private String sCtrlAV10BarFecSal ;
   private String sCtrlAV11BarFecSal_To ;
   private String sCtrlAV8BarColNom ;
   private String sCtrlAV9BarColNom_To ;
   private String sCtrlAV65BarColNum ;
   private String sCtrlAV66BarColNum_to ;
   private String sCtrlAV12BarSer ;
   private String sCtrlAV13BarSer_To ;
   private String sCtrlAV14CliCod ;
   private String sCtrlAV15CliCod_To ;
   private String sCtrlAV69BarEncCli ;
   private String sCtrlAV71BarEncCli_To ;
   private String sCtrlAV63BarTipArt ;
   private String sCtrlAV64BarTipArt_to ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavSdtmermasresumenclientes__clicod_Jsonclick ;
   private String edtavSdtmermasresumenclientes__clinom_Jsonclick ;
   private String edtavKilosent_Jsonclick ;
   private String edtavKilosexp_Jsonclick ;
   private String edtavDifkilos_Jsonclick ;
   private String edtavPorkilos_Jsonclick ;
   private String edtavMetrosent_Jsonclick ;
   private String edtavMetrosexp_Jsonclick ;
   private String edtavDifmetros_Jsonclick ;
   private String edtavPormetros_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV10BarFecSal ;
   private java.util.Date wcpOAV11BarFecSal_To ;
   private java.util.Date AV10BarFecSal ;
   private java.util.Date AV11BarFecSal_To ;
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
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_39_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean gx_BV39 ;
   private String AV18ColumnsSelectorXML ;
   private String AV57UserCustomValue ;
   private String AV82TotValueKilosEnt ;
   private String AV86TotValueKilosExp ;
   private String AV88TotValueDifKilos ;
   private String AV90TotValueMetrosEnt ;
   private String AV92TotValueMetrosExp ;
   private String AV94TotValueDifMetros ;
   private String AV27ExcelFilename ;
   private String AV26ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV54Session ;
   private com.genexus.webpanels.WebSession AV5WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV52ProgressIndicator ;
   private GXBaseCollection<app.SdtSDTMermasResumenCliente> AV53SDTMermasResumenClientes ;
   private GXBaseCollection<app.SdtSDTMermasResumenCliente> GXt_objcol_SdtSDTMermasResumenCliente10 ;
   private GXBaseCollection<app.SdtSDTMermasResumenCliente> GXv_objcol_SdtSDTMermasResumenCliente11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV17ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV19DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPContext AV58WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

