package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informemermasdetallado_wc_impl extends GXWebComponent
{
   public informemermasdetallado_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public informemermasdetallado_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informemermasdetallado_wc_impl.class ));
   }

   public informemermasdetallado_wc_impl( int remoteHandle ,
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
      chkBarAccesor = UIFactory.getCheckbox(this);
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
               AV131EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131EmprCod", AV131EmprCod);
               AV41BarFecSal = localUtil.parseDateParm( httpContext.GetPar( "BarFecSal")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41BarFecSal", localUtil.format(AV41BarFecSal, "99/99/99"));
               AV42BarFecSal_To = localUtil.parseDateParm( httpContext.GetPar( "BarFecSal_To")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42BarFecSal_To", localUtil.format(AV42BarFecSal_To, "99/99/99"));
               AV100BarColNom = httpContext.GetPar( "BarColNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100BarColNom", AV100BarColNom);
               AV101BarColNom_To = httpContext.GetPar( "BarColNom_To") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101BarColNom_To", AV101BarColNom_To);
               AV139BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV139BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV139BarColNum), 6, 0));
               AV140BarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "BarColNum_To"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV140BarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV140BarColNum_To), 6, 0));
               AV98BarSer = httpContext.GetPar( "BarSer") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98BarSer", AV98BarSer);
               AV99BarSer_To = httpContext.GetPar( "BarSer_To") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99BarSer_To", AV99BarSer_To);
               AV96CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV96CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV96CliCod), 6, 0));
               AV97CliCod_To = (int)(GXutil.lval( httpContext.GetPar( "CliCod_To"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97CliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97CliCod_To), 6, 0));
               AV44BarEncCli = httpContext.GetPar( "BarEncCli") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44BarEncCli", AV44BarEncCli);
               AV134BarEncCli_to = httpContext.GetPar( "BarEncCli_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV134BarEncCli_to", AV134BarEncCli_to);
               AV136BarTipArt = (short)(GXutil.lval( httpContext.GetPar( "BarTipArt"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV136BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV136BarTipArt), 4, 0));
               AV138BarTipArt_to = (short)(GXutil.lval( httpContext.GetPar( "BarTipArt_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV138BarTipArt_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV138BarTipArt_to), 4, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV131EmprCod,AV41BarFecSal,AV42BarFecSal_To,AV100BarColNom,AV101BarColNom_To,Integer.valueOf(AV139BarColNum),Integer.valueOf(AV140BarColNum_To),AV98BarSer,AV99BarSer_To,Integer.valueOf(AV96CliCod),Integer.valueOf(AV97CliCod_To),AV44BarEncCli,AV134BarEncCli_to,Short.valueOf(AV136BarTipArt),Short.valueOf(AV138BarTipArt_to)});
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
      AV41BarFecSal = localUtil.parseDateParm( httpContext.GetPar( "BarFecSal")) ;
      AV42BarFecSal_To = localUtil.parseDateParm( httpContext.GetPar( "BarFecSal_To")) ;
      AV100BarColNom = httpContext.GetPar( "BarColNom") ;
      AV101BarColNom_To = httpContext.GetPar( "BarColNom_To") ;
      AV139BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
      AV140BarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "BarColNum_To"))) ;
      AV98BarSer = httpContext.GetPar( "BarSer") ;
      AV99BarSer_To = httpContext.GetPar( "BarSer_To") ;
      AV96CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV97CliCod_To = (int)(GXutil.lval( httpContext.GetPar( "CliCod_To"))) ;
      AV44BarEncCli = httpContext.GetPar( "BarEncCli") ;
      AV134BarEncCli_to = httpContext.GetPar( "BarEncCli_to") ;
      AV136BarTipArt = (short)(GXutil.lval( httpContext.GetPar( "BarTipArt"))) ;
      AV138BarTipArt_to = (short)(GXutil.lval( httpContext.GetPar( "BarTipArt_to"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV19ColumnsSelector);
      AV185Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV46TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV47TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV26TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV27TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV29TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV30TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV49TFBarTipArt = (short)(GXutil.lval( httpContext.GetPar( "TFBarTipArt"))) ;
      AV50TFBarTipArt_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarTipArt_To"))) ;
      AV150TFPedidoCliente = httpContext.GetPar( "TFPedidoCliente") ;
      AV151TFPedidoCliente_Sel = httpContext.GetPar( "TFPedidoCliente_Sel") ;
      AV52TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV53TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV58TFBarColNom = httpContext.GetPar( "TFBarColNom") ;
      AV59TFBarColNom_Sel = httpContext.GetPar( "TFBarColNom_Sel") ;
      AV61TFBarNomCli = httpContext.GetPar( "TFBarNomCli") ;
      AV62TFBarNomCli_Sel = httpContext.GetPar( "TFBarNomCli_Sel") ;
      AV64TFBarColNum = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum"))) ;
      AV65TFBarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum_To"))) ;
      AV67TFBarFecCli = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecCli")) ;
      AV72TFBarKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKgm"), ".") ;
      AV73TFBarKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKgm_To"), ".") ;
      AV81TFBarMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMtr"), ".") ;
      AV82TFBarMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMtr_To"), ".") ;
      AV131EmprCod = httpContext.GetPar( "EmprCod") ;
      AV153TotBarKgm = CommonUtil.decimalVal( httpContext.GetPar( "TotBarKgm"), ".") ;
      A1261BarAlbKgmE = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbKgmE"), ".") ;
      A1263BarAlbMtrE = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbMtrE"), ".") ;
      AV155TotKgsExp = CommonUtil.decimalVal( httpContext.GetPar( "TotKgsExp"), ".") ;
      AV157TotDifKilos = CommonUtil.decimalVal( httpContext.GetPar( "TotDifKilos"), ".") ;
      AV167TotBarMtr = CommonUtil.decimalVal( httpContext.GetPar( "TotBarMtr"), ".") ;
      AV161TotMtsexp = CommonUtil.decimalVal( httpContext.GetPar( "TotMtsexp"), ".") ;
      AV163TotDifMetros = CommonUtil.decimalVal( httpContext.GetPar( "TotDifMetros"), ".") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV41BarFecSal, AV42BarFecSal_To, AV100BarColNom, AV101BarColNom_To, AV139BarColNum, AV140BarColNum_To, AV98BarSer, AV99BarSer_To, AV96CliCod, AV97CliCod_To, AV44BarEncCli, AV134BarEncCli_to, AV136BarTipArt, AV138BarTipArt_to, A396EmprCod, AV19ColumnsSelector, AV185Pgmname, AV12OrderedBy, AV13OrderedDsc, AV46TFCliCod, AV47TFCliCod_To, AV26TFCliNom, AV27TFCliNom_Sel, AV29TFBarNHdr, AV30TFBarNHdr_Sel, AV49TFBarTipArt, AV50TFBarTipArt_To, AV150TFPedidoCliente, AV151TFPedidoCliente_Sel, AV52TFBarSer, AV53TFBarSer_Sel, AV58TFBarColNom, AV59TFBarColNom_Sel, AV61TFBarNomCli, AV62TFBarNomCli_Sel, AV64TFBarColNum, AV65TFBarColNum_To, AV67TFBarFecCli, AV72TFBarKgm, AV73TFBarKgm_To, AV81TFBarMtr, AV82TFBarMtr_To, AV131EmprCod, AV153TotBarKgm, A1261BarAlbKgmE, A1263BarAlbMtrE, AV155TotKgsExp, AV157TotDifKilos, AV167TotBarMtr, AV161TotMtsexp, AV163TotDifMetros, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paMV2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Informe de Mermas", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.informemermasdetallado_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV131EmprCod)),GXutil.URLEncode(GXutil.formatDateParm(AV41BarFecSal)),GXutil.URLEncode(GXutil.formatDateParm(AV42BarFecSal_To)),GXutil.URLEncode(GXutil.rtrim(AV100BarColNom)),GXutil.URLEncode(GXutil.rtrim(AV101BarColNom_To)),GXutil.URLEncode(GXutil.ltrimstr(AV139BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV140BarColNum_To,6,0)),GXutil.URLEncode(GXutil.rtrim(AV98BarSer)),GXutil.URLEncode(GXutil.rtrim(AV99BarSer_To)),GXutil.URLEncode(GXutil.ltrimstr(AV96CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV97CliCod_To,6,0)),GXutil.URLEncode(GXutil.rtrim(AV44BarEncCli)),GXutil.URLEncode(GXutil.rtrim(AV134BarEncCli_to)),GXutil.URLEncode(GXutil.ltrimstr(AV136BarTipArt,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV138BarTipArt_to,4,0))}, new String[] {"EmprCod","BarFecSal","BarFecSal_To","BarColNom","BarColNom_To","BarColNum","BarColNum_To","BarSer","BarSer_To","CliCod","CliCod_To","BarEncCli","BarEncCli_to","BarTipArt","BarTipArt_to"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV153TotBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKGSEXP", getSecureSignedToken( sPrefix, localUtil.format( AV155TotKgsExp, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDIFKILOS", getSecureSignedToken( sPrefix, localUtil.format( AV157TotDifKilos, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV167TotBarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMTSEXP", getSecureSignedToken( sPrefix, localUtil.format( AV161TotMtsexp, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDIFMETROS", getSecureSignedToken( sPrefix, localUtil.format( AV163TotDifMetros, "ZZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_39", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_39, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV39GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV40GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV37DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV37DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV19ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV19ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV131EmprCod", GXutil.rtrim( wcpOAV131EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV41BarFecSal", localUtil.dtoc( wcpOAV41BarFecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV42BarFecSal_To", localUtil.dtoc( wcpOAV42BarFecSal_To, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV100BarColNom", GXutil.rtrim( wcpOAV100BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV101BarColNom_To", GXutil.rtrim( wcpOAV101BarColNom_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV139BarColNum", GXutil.ltrim( localUtil.ntoc( wcpOAV139BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV140BarColNum_To", GXutil.ltrim( localUtil.ntoc( wcpOAV140BarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV98BarSer", GXutil.rtrim( wcpOAV98BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV99BarSer_To", GXutil.rtrim( wcpOAV99BarSer_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV96CliCod", GXutil.ltrim( localUtil.ntoc( wcpOAV96CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV97CliCod_To", GXutil.ltrim( localUtil.ntoc( wcpOAV97CliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV44BarEncCli", GXutil.rtrim( wcpOAV44BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV134BarEncCli_to", GXutil.rtrim( wcpOAV134BarEncCli_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV136BarTipArt", GXutil.ltrim( localUtil.ntoc( wcpOAV136BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV138BarTipArt_to", GXutil.ltrim( localUtil.ntoc( wcpOAV138BarTipArt_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV46TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV47TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV26TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV27TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR", GXutil.rtrim( AV29TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR_SEL", GXutil.rtrim( AV30TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPART", GXutil.ltrim( localUtil.ntoc( AV49TFBarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPART_TO", GXutil.ltrim( localUtil.ntoc( AV50TFBarTipArt_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDIDOCLIENTE", GXutil.rtrim( AV150TFPedidoCliente));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDIDOCLIENTE_SEL", GXutil.rtrim( AV151TFPedidoCliente_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER", GXutil.rtrim( AV52TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER_SEL", GXutil.rtrim( AV53TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM", GXutil.rtrim( AV58TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM_SEL", GXutil.rtrim( AV59TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNOMCLI", GXutil.rtrim( AV61TFBarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNOMCLI_SEL", GXutil.rtrim( AV62TFBarNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV64TFBarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV65TFBarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECCLI", localUtil.dtoc( AV67TFBarFecCli, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGM", GXutil.ltrim( localUtil.ntoc( AV72TFBarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGM_TO", GXutil.ltrim( localUtil.ntoc( AV73TFBarKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMTR", GXutil.ltrim( localUtil.ntoc( AV81TFBarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMTR_TO", GXutil.ltrim( localUtil.ntoc( AV82TFBarMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV131EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECSAL", localUtil.dtoc( AV41BarFecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECSAL_TO", localUtil.dtoc( AV42BarFecSal_To, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOM", GXutil.rtrim( AV100BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOM_TO", GXutil.rtrim( AV101BarColNom_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV139BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV140BarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSER", GXutil.rtrim( AV98BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSER_TO", GXutil.rtrim( AV99BarSer_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV96CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV97CliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARENCCLI", GXutil.rtrim( AV44BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARENCCLI_TO", GXutil.rtrim( AV134BarEncCli_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARTIPART", GXutil.ltrim( localUtil.ntoc( AV136BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARTIPART_TO", GXutil.ltrim( localUtil.ntoc( AV138BarTipArt_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARSIT", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARKGM", GXutil.ltrim( localUtil.ntoc( AV153TotBarKgm, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV153TotBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARALBKGME", GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARALBMTRE", GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTKGSEXP", GXutil.ltrim( localUtil.ntoc( AV155TotKgsExp, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKGSEXP", getSecureSignedToken( sPrefix, localUtil.format( AV155TotKgsExp, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTDIFKILOS", GXutil.ltrim( localUtil.ntoc( AV157TotDifKilos, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDIFKILOS", getSecureSignedToken( sPrefix, localUtil.format( AV157TotDifKilos, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARMTR", GXutil.ltrim( localUtil.ntoc( AV167TotBarMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV167TotBarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMTSEXP", GXutil.ltrim( localUtil.ntoc( AV161TotMtsexp, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMTSEXP", getSecureSignedToken( sPrefix, localUtil.format( AV161TotMtsexp, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTDIFMETROS", GXutil.ltrim( localUtil.ntoc( AV163TotDifMetros, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDIFMETROS", getSecureSignedToken( sPrefix, localUtil.format( AV163TotDifMetros, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIMPCOD", GXutil.rtrim( AV135ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPDISCLI", GXutil.rtrim( AV142PDisCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUDISCLI", GXutil.rtrim( AV152UDisCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSOLOTOTAL", GXutil.ltrim( localUtil.ntoc( AV144SoloTotal, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARITEM1", GXutil.rtrim( AV145BarItem1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARITEM3", GXutil.rtrim( AV146BarItem3));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARMDLCOD1", GXutil.rtrim( AV147Barmdlcod1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARITEM5", GXutil.rtrim( AV148BarItem5));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARTIPCOL", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARENCCLI", GXutil.rtrim( A4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARDISNUM", GXutil.rtrim( A143BarDisNum));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
   }

   public void renderHtmlCloseFormMV2( )
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
      return "InformeMermasDetallado_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informe de Mermas", "") ;
   }

   public void wbMV0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.informemermasdetallado_wc");
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
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 39, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 7, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e11mv1_client"+"'", TempTags, "", 2, "HLP_InformeMermasDetallado_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 39, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_InformeMermasDetallado_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 39, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_InformeMermasDetallado_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 39, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_InformeMermasDetallado_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         wb_table1_31_MV2( true) ;
      }
      else
      {
         wb_table1_31_MV2( false) ;
      }
      return  ;
   }

   public void wb_table1_31_MV2e( boolean wbgen )
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
         wb_table2_88_MV2( true) ;
      }
      else
      {
         wb_table2_88_MV2( false) ;
      }
      return  ;
   }

   public void wb_table2_88_MV2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV39GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV40GridPageCount);
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
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV37DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, sPrefix+"INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV37DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV19ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV185Pgmname), GXutil.rtrim( localUtil.format( AV185Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", edtavPgmname_Visible, 0, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_InformeMermasDetallado_WC.htm");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfeccliauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 160,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfeccliauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfeccliauxdate_Internalname, localUtil.format(AV69DDO_BarFecCliAuxDate, "99/99/99"), localUtil.format( AV69DDO_BarFecCliAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,160);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfeccliauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_InformeMermasDetallado_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfeccliauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_InformeMermasDetallado_WC.htm");
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

   public void startMV2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Informe de Mermas", ""), (short)(0)) ;
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
            strupMV0( ) ;
         }
      }
   }

   public void wsMV2( )
   {
      startMV2( ) ;
      evtMV2( ) ;
   }

   public void evtMV2( )
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
                              strupMV0( ) ;
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
                              strupMV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e12MV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e13MV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e14MV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e15MV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e16MV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e17MV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavTotvaluebarkgm_Internalname ;
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
                              strupMV0( ) ;
                           }
                           nGXsfl_39_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_392( ) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n252CliCod = false ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A217BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n217BarTipArt = false ;
                           AV43TipArtDsc = httpContext.cgiGet( edtavTipartdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipartdsc_Internalname, AV43TipArtDsc);
                           A13878PedidoClie = httpContext.cgiGet( edtPedidoClie_Internalname) ;
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
                           A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A159BarFecGen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecGen_Internalname), 0)) ;
                           A161BarFecSal = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecSal_Internalname), 0)) ;
                           A158BarFecFpr = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecFpr_Internalname), 0)) ;
                           A155BarFecCli = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecCli_Internalname), 0)) ;
                           A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
                           AV74KgsExp = localUtil.ctond( httpContext.cgiGet( edtavKgsexp_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavKgsexp_Internalname, GXutil.ltrimstr( AV74KgsExp, 9, 2));
                           AV76DifKilos = localUtil.ctond( httpContext.cgiGet( edtavDifkilos_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifkilos_Internalname, GXutil.ltrimstr( AV76DifKilos, 9, 2));
                           AV77PorKgs = localUtil.ctond( httpContext.cgiGet( edtavPorkgs_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPorkgs_Internalname, GXutil.ltrimstr( AV77PorKgs, 6, 2));
                           A13932BarAlbKgs = localUtil.ctond( httpContext.cgiGet( edtBarAlbKgs_Internalname)) ;
                           A13860BarAccesor = ((GXutil.strcmp(httpContext.cgiGet( chkBarAccesor.getInternalname()), "S")==0) ? "S" : "N") ;
                           n13860BarAccesor = false ;
                           A184BarMtr = localUtil.ctond( httpContext.cgiGet( edtBarMtr_Internalname)) ;
                           AV75Mtsexp = localUtil.ctond( httpContext.cgiGet( edtavMtsexp_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMtsexp_Internalname, GXutil.ltrimstr( AV75Mtsexp, 9, 2));
                           AV78DifMetros = localUtil.ctond( httpContext.cgiGet( edtavDifmetros_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifmetros_Internalname, GXutil.ltrimstr( AV78DifMetros, 9, 2));
                           AV79PorMts = localUtil.ctond( httpContext.cgiGet( edtavPormts_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPormts_Internalname, GXutil.ltrimstr( AV79PorMts, 6, 2));
                           A13931BarAlbMts = localUtil.ctond( httpContext.cgiGet( edtBarAlbMts_Internalname)) ;
                           A13868BarTipColD = httpContext.cgiGet( edtBarTipColD_Internalname) ;
                           A13887KilosEntre = localUtil.ctond( httpContext.cgiGet( edtKilosEntre_Internalname)) ;
                           A13888MetrosEntr = (short)(localUtil.ctol( httpContext.cgiGet( edtMetrosEntr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13885KilosPendi = localUtil.ctond( httpContext.cgiGet( edtKilosPendi_Internalname)) ;
                           A13886MetrosPend = localUtil.ctond( httpContext.cgiGet( edtMetrosPend_Internalname)) ;
                           A13890BarHDSusp = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarHDSusp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n13890BarHDSusp = false ;
                           A13902BarNorma = httpContext.cgiGet( edtBarNorma_Internalname) ;
                           n13902BarNorma = false ;
                           A13903BarMatColo = (short)(localUtil.ctol( httpContext.cgiGet( edtBarMatColo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n13903BarMatColo = false ;
                           A12881BarOEKOTEX = httpContext.cgiGet( edtBarOEKOTEX_Internalname) ;
                           n12881BarOEKOTEX = false ;
                           A2447BarFecEnE = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecEnE_Internalname), 0)) ;
                           A13904BarIntColo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarIntColo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n13904BarIntColo = false ;
                           A12809BarLocTel = httpContext.cgiGet( edtBarLocTel_Internalname) ;
                           A13907BarSerDsc2 = httpContext.cgiGet( edtBarSerDsc2_Internalname) ;
                           n13907BarSerDsc2 = false ;
                           A13908BarIdtx2 = httpContext.cgiGet( edtBarIdtx2_Internalname) ;
                           n13908BarIdtx2 = false ;
                           A13909BarIdtxDc = httpContext.cgiGet( edtBarIdtxDc_Internalname) ;
                           n13909BarIdtxDc = false ;
                           A13910BarColCv = httpContext.cgiGet( edtBarColCv_Internalname) ;
                           A13930BarAlbUlti = localUtil.ctol( httpContext.cgiGet( edtBarAlbUlti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A13933BarCuadern = httpContext.cgiGet( edtBarCuadern_Internalname) ;
                           n13933BarCuadern = false ;
                           A13934BarNormas = httpContext.cgiGet( edtBarNormas_Internalname) ;
                           A13935BarAlbFact = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbFact_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
                                       GX_FocusControl = edtavTotvaluebarkgm_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e18MV2 ();
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
                                       GX_FocusControl = edtavTotvaluebarkgm_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e19MV2 ();
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
                                       GX_FocusControl = edtavTotvaluebarkgm_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e20MV2 ();
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
                                    strupMV0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavTotvaluebarkgm_Internalname ;
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

   public void weMV2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormMV2( ) ;
         }
      }
   }

   public void paMV2( )
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
            GX_FocusControl = edtavTotvaluebarkgm_Internalname ;
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
                                 java.util.Date AV41BarFecSal ,
                                 java.util.Date AV42BarFecSal_To ,
                                 String AV100BarColNom ,
                                 String AV101BarColNom_To ,
                                 int AV139BarColNum ,
                                 int AV140BarColNum_To ,
                                 String AV98BarSer ,
                                 String AV99BarSer_To ,
                                 int AV96CliCod ,
                                 int AV97CliCod_To ,
                                 String AV44BarEncCli ,
                                 String AV134BarEncCli_to ,
                                 short AV136BarTipArt ,
                                 short AV138BarTipArt_to ,
                                 String A396EmprCod ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelector ,
                                 String AV185Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 int AV46TFCliCod ,
                                 int AV47TFCliCod_To ,
                                 String AV26TFCliNom ,
                                 String AV27TFCliNom_Sel ,
                                 String AV29TFBarNHdr ,
                                 String AV30TFBarNHdr_Sel ,
                                 short AV49TFBarTipArt ,
                                 short AV50TFBarTipArt_To ,
                                 String AV150TFPedidoCliente ,
                                 String AV151TFPedidoCliente_Sel ,
                                 String AV52TFBarSer ,
                                 String AV53TFBarSer_Sel ,
                                 String AV58TFBarColNom ,
                                 String AV59TFBarColNom_Sel ,
                                 String AV61TFBarNomCli ,
                                 String AV62TFBarNomCli_Sel ,
                                 int AV64TFBarColNum ,
                                 int AV65TFBarColNum_To ,
                                 java.util.Date AV67TFBarFecCli ,
                                 java.math.BigDecimal AV72TFBarKgm ,
                                 java.math.BigDecimal AV73TFBarKgm_To ,
                                 java.math.BigDecimal AV81TFBarMtr ,
                                 java.math.BigDecimal AV82TFBarMtr_To ,
                                 String AV131EmprCod ,
                                 java.math.BigDecimal AV153TotBarKgm ,
                                 java.math.BigDecimal A1261BarAlbKgmE ,
                                 java.math.BigDecimal A1263BarAlbMtrE ,
                                 java.math.BigDecimal AV155TotKgsExp ,
                                 java.math.BigDecimal AV157TotDifKilos ,
                                 java.math.BigDecimal AV167TotBarMtr ,
                                 java.math.BigDecimal AV161TotMtsexp ,
                                 java.math.BigDecimal AV163TotDifMetros ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e19MV2 ();
      GRID_nCurrentRecord = 0 ;
      rfMV2( ) ;
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
      rfMV2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV185Pgmname = "InformeMermasDetallado_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV185Pgmname", AV185Pgmname);
      Gx_err = (short)(0) ;
      edtavTipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipartdsc_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavKgsexp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavKgsexp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKgsexp_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavDifkilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDifkilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifkilos_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavPorkgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPorkgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPorkgs_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavMtsexp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMtsexp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMtsexp_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavDifmetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDifmetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifmetros_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavPormts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPormts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPormts_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavTotvaluebarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarkgm_Enabled), 5, 0), true);
      edtavTotvaluekgsexp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluekgsexp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluekgsexp_Enabled), 5, 0), true);
      edtavTotvaluedifkilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluedifkilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluedifkilos_Enabled), 5, 0), true);
      edtavTotvaluebarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarmtr_Enabled), 5, 0), true);
      edtavTotvaluemtsexp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemtsexp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemtsexp_Enabled), 5, 0), true);
      edtavTotvaluedifmetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluedifmetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluedifmetros_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV46TFCliCod) ,
                                           Integer.valueOf(AV47TFCliCod_To) ,
                                           AV27TFCliNom_Sel ,
                                           AV26TFCliNom ,
                                           AV30TFBarNHdr_Sel ,
                                           AV29TFBarNHdr ,
                                           Short.valueOf(AV49TFBarTipArt) ,
                                           Short.valueOf(AV50TFBarTipArt_To) ,
                                           AV53TFBarSer_Sel ,
                                           AV52TFBarSer ,
                                           AV59TFBarColNom_Sel ,
                                           AV58TFBarColNom ,
                                           AV62TFBarNomCli_Sel ,
                                           AV61TFBarNomCli ,
                                           Integer.valueOf(AV64TFBarColNum) ,
                                           Integer.valueOf(AV65TFBarColNum_To) ,
                                           AV67TFBarFecCli ,
                                           AV72TFBarKgm ,
                                           AV73TFBarKgm_To ,
                                           AV81TFBarMtr ,
                                           AV82TFBarMtr_To ,
                                           AV41BarFecSal ,
                                           AV42BarFecSal_To ,
                                           Integer.valueOf(AV96CliCod) ,
                                           Integer.valueOf(AV97CliCod_To) ,
                                           AV98BarSer ,
                                           AV99BarSer_To ,
                                           AV100BarColNom ,
                                           AV101BarColNom_To ,
                                           Integer.valueOf(AV139BarColNum) ,
                                           Integer.valueOf(AV140BarColNum_To) ,
                                           Short.valueOf(AV136BarTipArt) ,
                                           Short.valueOf(AV138BarTipArt_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A155BarFecCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A161BarFecSal ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV151TFPedidoCliente_Sel ,
                                           AV150TFPedidoCliente ,
                                           A13878PedidoClie ,
                                           AV44BarEncCli ,
                                           AV134BarEncCli_to ,
                                           Byte.valueOf(A213BarSit) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV26TFCliNom = GXutil.padr( GXutil.rtrim( AV26TFCliNom), 30, "%") ;
      lV29TFBarNHdr = GXutil.padr( GXutil.rtrim( AV29TFBarNHdr), 11, "%") ;
      lV52TFBarSer = GXutil.padr( GXutil.rtrim( AV52TFBarSer), 16, "%") ;
      lV58TFBarColNom = GXutil.padr( GXutil.rtrim( AV58TFBarColNom), 13, "%") ;
      lV61TFBarNomCli = GXutil.padr( GXutil.rtrim( AV61TFBarNomCli), 13, "%") ;
      /* Using cursor H00MV9 */
      pr_default.execute(0, new Object[] {A396EmprCod, A396EmprCod, A396EmprCod, Integer.valueOf(A361DisCod), A396EmprCod, Integer.valueOf(AV46TFCliCod), Integer.valueOf(AV47TFCliCod_To), lV26TFCliNom, AV27TFCliNom_Sel, lV29TFBarNHdr, AV30TFBarNHdr_Sel, Short.valueOf(AV49TFBarTipArt), Short.valueOf(AV50TFBarTipArt_To), lV52TFBarSer, AV53TFBarSer_Sel, lV58TFBarColNom, AV59TFBarColNom_Sel, lV61TFBarNomCli, AV62TFBarNomCli_Sel, Integer.valueOf(AV64TFBarColNum), Integer.valueOf(AV65TFBarColNum_To), AV67TFBarFecCli, AV72TFBarKgm, AV73TFBarKgm_To, AV81TFBarMtr, AV82TFBarMtr_To, AV41BarFecSal, AV42BarFecSal_To, Integer.valueOf(AV96CliCod), Integer.valueOf(AV97CliCod_To), AV98BarSer, AV99BarSer_To, AV100BarColNom, AV101BarColNom_To, Integer.valueOf(AV139BarColNum), Integer.valueOf(AV140BarColNum_To), Short.valueOf(AV136BarTipArt), Short.valueOf(AV138BarTipArt_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4466BarAcaAnh = H00MV9_A4466BarAcaAnh[0] ;
         A279CliNom = H00MV9_A279CliNom[0] ;
         A213BarSit = H00MV9_A213BarSit[0] ;
         A13909BarIdtxDc = H00MV9_A13909BarIdtxDc[0] ;
         n13909BarIdtxDc = H00MV9_n13909BarIdtxDc[0] ;
         A13908BarIdtx2 = H00MV9_A13908BarIdtx2[0] ;
         n13908BarIdtx2 = H00MV9_n13908BarIdtx2[0] ;
         A13907BarSerDsc2 = H00MV9_A13907BarSerDsc2[0] ;
         n13907BarSerDsc2 = H00MV9_n13907BarSerDsc2[0] ;
         A12809BarLocTel = H00MV9_A12809BarLocTel[0] ;
         A2447BarFecEnE = H00MV9_A2447BarFecEnE[0] ;
         A12881BarOEKOTEX = H00MV9_A12881BarOEKOTEX[0] ;
         n12881BarOEKOTEX = H00MV9_n12881BarOEKOTEX[0] ;
         A155BarFecCli = H00MV9_A155BarFecCli[0] ;
         A158BarFecFpr = H00MV9_A158BarFecFpr[0] ;
         A161BarFecSal = H00MV9_A161BarFecSal[0] ;
         A159BarFecGen = H00MV9_A159BarFecGen[0] ;
         A136BarColNum = H00MV9_A136BarColNum[0] ;
         A1234BarNomCli = H00MV9_A1234BarNomCli[0] ;
         A135BarColNom = H00MV9_A135BarColNom[0] ;
         A1652BarSerDsc = H00MV9_A1652BarSerDsc[0] ;
         A212BarSer = H00MV9_A212BarSer[0] ;
         A217BarTipArt = H00MV9_A217BarTipArt[0] ;
         n217BarTipArt = H00MV9_n217BarTipArt[0] ;
         A252CliCod = H00MV9_A252CliCod[0] ;
         n252CliCod = H00MV9_n252CliCod[0] ;
         A13933BarCuadern = H00MV9_A13933BarCuadern[0] ;
         n13933BarCuadern = H00MV9_n13933BarCuadern[0] ;
         A13904BarIntColo = H00MV9_A13904BarIntColo[0] ;
         n13904BarIntColo = H00MV9_n13904BarIntColo[0] ;
         A13903BarMatColo = H00MV9_A13903BarMatColo[0] ;
         n13903BarMatColo = H00MV9_n13903BarMatColo[0] ;
         A13902BarNorma = H00MV9_A13902BarNorma[0] ;
         n13902BarNorma = H00MV9_n13902BarNorma[0] ;
         A13890BarHDSusp = H00MV9_A13890BarHDSusp[0] ;
         n13890BarHDSusp = H00MV9_n13890BarHDSusp[0] ;
         A13931BarAlbMts = H00MV9_A13931BarAlbMts[0] ;
         A13860BarAccesor = H00MV9_A13860BarAccesor[0] ;
         n13860BarAccesor = H00MV9_n13860BarAccesor[0] ;
         A13932BarAlbKgs = H00MV9_A13932BarAlbKgs[0] ;
         A218BarTipCol = H00MV9_A218BarTipCol[0] ;
         A13887KilosEntre = H00MV9_A13887KilosEntre[0] ;
         A166BarKgm = H00MV9_A166BarKgm[0] ;
         A13888MetrosEntr = H00MV9_A13888MetrosEntr[0] ;
         A184BarMtr = H00MV9_A184BarMtr[0] ;
         A361DisCod = H00MV9_A361DisCod[0] ;
         A130BarCodPar = H00MV9_A130BarCodPar[0] ;
         A132BarCodReo = H00MV9_A132BarCodReo[0] ;
         A129BarCod = H00MV9_A129BarCod[0] ;
         A143BarDisNum = H00MV9_A143BarDisNum[0] ;
         A4812BarEncCli = H00MV9_A4812BarEncCli[0] ;
         A13890BarHDSusp = H00MV9_A13890BarHDSusp[0] ;
         n13890BarHDSusp = H00MV9_n13890BarHDSusp[0] ;
         A13909BarIdtxDc = H00MV9_A13909BarIdtxDc[0] ;
         n13909BarIdtxDc = H00MV9_n13909BarIdtxDc[0] ;
         A279CliNom = H00MV9_A279CliNom[0] ;
         A166BarKgm = H00MV9_A166BarKgm[0] ;
         A184BarMtr = H00MV9_A184BarMtr[0] ;
         A13933BarCuadern = H00MV9_A13933BarCuadern[0] ;
         n13933BarCuadern = H00MV9_n13933BarCuadern[0] ;
         A13904BarIntColo = H00MV9_A13904BarIntColo[0] ;
         n13904BarIntColo = H00MV9_n13904BarIntColo[0] ;
         A13903BarMatColo = H00MV9_A13903BarMatColo[0] ;
         n13903BarMatColo = H00MV9_n13903BarMatColo[0] ;
         A13887KilosEntre = H00MV9_A13887KilosEntre[0] ;
         A13888MetrosEntr = H00MV9_A13888MetrosEntr[0] ;
         A13931BarAlbMts = H00MV9_A13931BarAlbMts[0] ;
         A13932BarAlbKgs = H00MV9_A13932BarAlbKgs[0] ;
         A13860BarAccesor = H00MV9_A13860BarAccesor[0] ;
         n13860BarAccesor = H00MV9_n13860BarAccesor[0] ;
         A13902BarNorma = H00MV9_A13902BarNorma[0] ;
         n13902BarNorma = H00MV9_n13902BarNorma[0] ;
         GXt_char1 = A13868BarTipColD ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A218BarTipCol ;
         GXv_char4[0] = GXt_char1 ;
         new app.pfcoldsc(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4) ;
         informemermasdetallado_wc_impl.this.A396EmprCod = GXv_char2[0] ;
         informemermasdetallado_wc_impl.this.A218BarTipCol = GXv_int3[0] ;
         informemermasdetallado_wc_impl.this.GXt_char1 = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A13868BarTipColD = GXt_char1 ;
         GXt_char1 = A13910BarColCv ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A129BarCod ;
         GXv_int3[0] = A132BarCodReo ;
         GXv_char2[0] = A130BarCodPar ;
         GXv_char6[0] = GXt_char1 ;
         new app.pnortt(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int3, GXv_char2, GXv_char6) ;
         informemermasdetallado_wc_impl.this.A396EmprCod = GXv_char4[0] ;
         informemermasdetallado_wc_impl.this.A129BarCod = GXv_int5[0] ;
         informemermasdetallado_wc_impl.this.A132BarCodReo = GXv_int3[0] ;
         informemermasdetallado_wc_impl.this.A130BarCodPar = GXv_char2[0] ;
         informemermasdetallado_wc_impl.this.GXt_char1 = GXv_char6[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
         A13910BarColCv = GXt_char1 ;
         GXt_int7 = A13930BarAlbUlti ;
         GXv_int8[0] = GXt_int7 ;
         new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
         informemermasdetallado_wc_impl.this.GXt_int7 = GXv_int8[0] ;
         A13930BarAlbUlti = GXt_int7 ;
         GXt_char1 = A13934BarNormas ;
         GXv_char6[0] = GXt_char1 ;
         new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char6) ;
         informemermasdetallado_wc_impl.this.GXt_char1 = GXv_char6[0] ;
         A13934BarNormas = GXt_char1 ;
         GXt_int9 = A13935BarAlbFact ;
         GXv_int5[0] = GXt_int9 ;
         new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int5) ;
         informemermasdetallado_wc_impl.this.GXt_int9 = GXv_int5[0] ;
         A13935BarAlbFact = GXt_int9 ;
         GXt_char1 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char4[0] = A4812BarEncCli ;
         GXv_char2[0] = A143BarDisNum ;
         GXv_char10[0] = GXt_char1 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_char2, GXv_char10) ;
         informemermasdetallado_wc_impl.this.A396EmprCod = GXv_char6[0] ;
         informemermasdetallado_wc_impl.this.A4812BarEncCli = GXv_char4[0] ;
         informemermasdetallado_wc_impl.this.A143BarDisNum = GXv_char2[0] ;
         informemermasdetallado_wc_impl.this.GXt_char1 = GXv_char10[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4812BarEncCli", A4812BarEncCli);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143BarDisNum", A143BarDisNum);
         A13878PedidoClie = GXt_char1 ;
         if ( ! ( (GXutil.strcmp("", AV151TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV150TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV150TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV151TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV151TFPedidoCliente_Sel) == 0 ) ) )
            {
               if ( (GXutil.strcmp("", AV44BarEncCli)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV44BarEncCli) >= 0 ) ) )
               {
                  if ( (GXutil.strcmp("", AV134BarEncCli_to)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV134BarEncCli_to) <= 0 ) ) )
                  {
                     A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                     A13885KilosPendi = (A166BarKgm.subtract(A13887KilosEntre)) ;
                     A13886MetrosPend = (A184BarMtr.subtract(DecimalUtil.doubleToDec(A13888MetrosEntr))) ;
                     GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
                  }
               }
            }
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rfMV2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(39) ;
      /* Execute user event: Refresh */
      e19MV2 ();
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
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Integer.valueOf(AV46TFCliCod) ,
                                              Integer.valueOf(AV47TFCliCod_To) ,
                                              AV27TFCliNom_Sel ,
                                              AV26TFCliNom ,
                                              AV30TFBarNHdr_Sel ,
                                              AV29TFBarNHdr ,
                                              Short.valueOf(AV49TFBarTipArt) ,
                                              Short.valueOf(AV50TFBarTipArt_To) ,
                                              AV53TFBarSer_Sel ,
                                              AV52TFBarSer ,
                                              AV59TFBarColNom_Sel ,
                                              AV58TFBarColNom ,
                                              AV62TFBarNomCli_Sel ,
                                              AV61TFBarNomCli ,
                                              Integer.valueOf(AV64TFBarColNum) ,
                                              Integer.valueOf(AV65TFBarColNum_To) ,
                                              AV67TFBarFecCli ,
                                              AV72TFBarKgm ,
                                              AV73TFBarKgm_To ,
                                              AV81TFBarMtr ,
                                              AV82TFBarMtr_To ,
                                              AV41BarFecSal ,
                                              AV42BarFecSal_To ,
                                              Integer.valueOf(AV96CliCod) ,
                                              Integer.valueOf(AV97CliCod_To) ,
                                              AV98BarSer ,
                                              AV99BarSer_To ,
                                              AV100BarColNom ,
                                              AV101BarColNom_To ,
                                              Integer.valueOf(AV139BarColNum) ,
                                              Integer.valueOf(AV140BarColNum_To) ,
                                              Short.valueOf(AV136BarTipArt) ,
                                              Short.valueOf(AV138BarTipArt_to) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              Short.valueOf(A217BarTipArt) ,
                                              A212BarSer ,
                                              A135BarColNom ,
                                              A1234BarNomCli ,
                                              Integer.valueOf(A136BarColNum) ,
                                              A155BarFecCli ,
                                              A166BarKgm ,
                                              A184BarMtr ,
                                              A161BarFecSal ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV151TFPedidoCliente_Sel ,
                                              AV150TFPedidoCliente ,
                                              A13878PedidoClie ,
                                              AV44BarEncCli ,
                                              AV134BarEncCli_to ,
                                              Byte.valueOf(A213BarSit) ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV26TFCliNom = GXutil.padr( GXutil.rtrim( AV26TFCliNom), 30, "%") ;
         lV29TFBarNHdr = GXutil.padr( GXutil.rtrim( AV29TFBarNHdr), 11, "%") ;
         lV52TFBarSer = GXutil.padr( GXutil.rtrim( AV52TFBarSer), 16, "%") ;
         lV58TFBarColNom = GXutil.padr( GXutil.rtrim( AV58TFBarColNom), 13, "%") ;
         lV61TFBarNomCli = GXutil.padr( GXutil.rtrim( AV61TFBarNomCli), 13, "%") ;
         /* Using cursor H00MV17 */
         pr_default.execute(1, new Object[] {A396EmprCod, A396EmprCod, A396EmprCod, Integer.valueOf(A361DisCod), A396EmprCod, Integer.valueOf(AV46TFCliCod), Integer.valueOf(AV47TFCliCod_To), lV26TFCliNom, AV27TFCliNom_Sel, lV29TFBarNHdr, AV30TFBarNHdr_Sel, Short.valueOf(AV49TFBarTipArt), Short.valueOf(AV50TFBarTipArt_To), lV52TFBarSer, AV53TFBarSer_Sel, lV58TFBarColNom, AV59TFBarColNom_Sel, lV61TFBarNomCli, AV62TFBarNomCli_Sel, Integer.valueOf(AV64TFBarColNum), Integer.valueOf(AV65TFBarColNum_To), AV67TFBarFecCli, AV72TFBarKgm, AV73TFBarKgm_To, AV81TFBarMtr, AV82TFBarMtr_To, AV41BarFecSal, AV42BarFecSal_To, Integer.valueOf(AV96CliCod), Integer.valueOf(AV97CliCod_To), AV98BarSer, AV99BarSer_To, AV100BarColNom, AV101BarColNom_To, Integer.valueOf(AV139BarColNum), Integer.valueOf(AV140BarColNum_To), Short.valueOf(AV136BarTipArt), Short.valueOf(AV138BarTipArt_to)});
         nGXsfl_39_idx = 1 ;
         sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_392( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A4466BarAcaAnh = H00MV17_A4466BarAcaAnh[0] ;
            A279CliNom = H00MV17_A279CliNom[0] ;
            A213BarSit = H00MV17_A213BarSit[0] ;
            A13909BarIdtxDc = H00MV17_A13909BarIdtxDc[0] ;
            n13909BarIdtxDc = H00MV17_n13909BarIdtxDc[0] ;
            A13908BarIdtx2 = H00MV17_A13908BarIdtx2[0] ;
            n13908BarIdtx2 = H00MV17_n13908BarIdtx2[0] ;
            A13907BarSerDsc2 = H00MV17_A13907BarSerDsc2[0] ;
            n13907BarSerDsc2 = H00MV17_n13907BarSerDsc2[0] ;
            A12809BarLocTel = H00MV17_A12809BarLocTel[0] ;
            A2447BarFecEnE = H00MV17_A2447BarFecEnE[0] ;
            A12881BarOEKOTEX = H00MV17_A12881BarOEKOTEX[0] ;
            n12881BarOEKOTEX = H00MV17_n12881BarOEKOTEX[0] ;
            A155BarFecCli = H00MV17_A155BarFecCli[0] ;
            A158BarFecFpr = H00MV17_A158BarFecFpr[0] ;
            A161BarFecSal = H00MV17_A161BarFecSal[0] ;
            A159BarFecGen = H00MV17_A159BarFecGen[0] ;
            A136BarColNum = H00MV17_A136BarColNum[0] ;
            A1234BarNomCli = H00MV17_A1234BarNomCli[0] ;
            A135BarColNom = H00MV17_A135BarColNom[0] ;
            A1652BarSerDsc = H00MV17_A1652BarSerDsc[0] ;
            A212BarSer = H00MV17_A212BarSer[0] ;
            A217BarTipArt = H00MV17_A217BarTipArt[0] ;
            n217BarTipArt = H00MV17_n217BarTipArt[0] ;
            A252CliCod = H00MV17_A252CliCod[0] ;
            n252CliCod = H00MV17_n252CliCod[0] ;
            A13933BarCuadern = H00MV17_A13933BarCuadern[0] ;
            n13933BarCuadern = H00MV17_n13933BarCuadern[0] ;
            A13904BarIntColo = H00MV17_A13904BarIntColo[0] ;
            n13904BarIntColo = H00MV17_n13904BarIntColo[0] ;
            A13903BarMatColo = H00MV17_A13903BarMatColo[0] ;
            n13903BarMatColo = H00MV17_n13903BarMatColo[0] ;
            A13902BarNorma = H00MV17_A13902BarNorma[0] ;
            n13902BarNorma = H00MV17_n13902BarNorma[0] ;
            A13890BarHDSusp = H00MV17_A13890BarHDSusp[0] ;
            n13890BarHDSusp = H00MV17_n13890BarHDSusp[0] ;
            A13931BarAlbMts = H00MV17_A13931BarAlbMts[0] ;
            A13860BarAccesor = H00MV17_A13860BarAccesor[0] ;
            n13860BarAccesor = H00MV17_n13860BarAccesor[0] ;
            A13932BarAlbKgs = H00MV17_A13932BarAlbKgs[0] ;
            A218BarTipCol = H00MV17_A218BarTipCol[0] ;
            A13887KilosEntre = H00MV17_A13887KilosEntre[0] ;
            A166BarKgm = H00MV17_A166BarKgm[0] ;
            A13888MetrosEntr = H00MV17_A13888MetrosEntr[0] ;
            A184BarMtr = H00MV17_A184BarMtr[0] ;
            A361DisCod = H00MV17_A361DisCod[0] ;
            A130BarCodPar = H00MV17_A130BarCodPar[0] ;
            A132BarCodReo = H00MV17_A132BarCodReo[0] ;
            A129BarCod = H00MV17_A129BarCod[0] ;
            A143BarDisNum = H00MV17_A143BarDisNum[0] ;
            A4812BarEncCli = H00MV17_A4812BarEncCli[0] ;
            A13890BarHDSusp = H00MV17_A13890BarHDSusp[0] ;
            n13890BarHDSusp = H00MV17_n13890BarHDSusp[0] ;
            A13909BarIdtxDc = H00MV17_A13909BarIdtxDc[0] ;
            n13909BarIdtxDc = H00MV17_n13909BarIdtxDc[0] ;
            A279CliNom = H00MV17_A279CliNom[0] ;
            A166BarKgm = H00MV17_A166BarKgm[0] ;
            A184BarMtr = H00MV17_A184BarMtr[0] ;
            A13933BarCuadern = H00MV17_A13933BarCuadern[0] ;
            n13933BarCuadern = H00MV17_n13933BarCuadern[0] ;
            A13904BarIntColo = H00MV17_A13904BarIntColo[0] ;
            n13904BarIntColo = H00MV17_n13904BarIntColo[0] ;
            A13903BarMatColo = H00MV17_A13903BarMatColo[0] ;
            n13903BarMatColo = H00MV17_n13903BarMatColo[0] ;
            A13887KilosEntre = H00MV17_A13887KilosEntre[0] ;
            A13888MetrosEntr = H00MV17_A13888MetrosEntr[0] ;
            A13931BarAlbMts = H00MV17_A13931BarAlbMts[0] ;
            A13932BarAlbKgs = H00MV17_A13932BarAlbKgs[0] ;
            A13860BarAccesor = H00MV17_A13860BarAccesor[0] ;
            n13860BarAccesor = H00MV17_n13860BarAccesor[0] ;
            A13902BarNorma = H00MV17_A13902BarNorma[0] ;
            n13902BarNorma = H00MV17_n13902BarNorma[0] ;
            GXt_char1 = A13868BarTipColD ;
            GXv_char10[0] = A396EmprCod ;
            GXv_int3[0] = A218BarTipCol ;
            GXv_char6[0] = GXt_char1 ;
            new app.pfcoldsc(remoteHandle, context).execute( GXv_char10, GXv_int3, GXv_char6) ;
            informemermasdetallado_wc_impl.this.A396EmprCod = GXv_char10[0] ;
            informemermasdetallado_wc_impl.this.A218BarTipCol = GXv_int3[0] ;
            informemermasdetallado_wc_impl.this.GXt_char1 = GXv_char6[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
            A13868BarTipColD = GXt_char1 ;
            GXt_char1 = A13910BarColCv ;
            GXv_char10[0] = A396EmprCod ;
            GXv_int5[0] = A129BarCod ;
            GXv_int3[0] = A132BarCodReo ;
            GXv_char6[0] = A130BarCodPar ;
            GXv_char4[0] = GXt_char1 ;
            new app.pnortt(remoteHandle, context).execute( GXv_char10, GXv_int5, GXv_int3, GXv_char6, GXv_char4) ;
            informemermasdetallado_wc_impl.this.A396EmprCod = GXv_char10[0] ;
            informemermasdetallado_wc_impl.this.A129BarCod = GXv_int5[0] ;
            informemermasdetallado_wc_impl.this.A132BarCodReo = GXv_int3[0] ;
            informemermasdetallado_wc_impl.this.A130BarCodPar = GXv_char6[0] ;
            informemermasdetallado_wc_impl.this.GXt_char1 = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
            A13910BarColCv = GXt_char1 ;
            GXt_int7 = A13930BarAlbUlti ;
            GXv_int8[0] = GXt_int7 ;
            new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
            informemermasdetallado_wc_impl.this.GXt_int7 = GXv_int8[0] ;
            A13930BarAlbUlti = GXt_int7 ;
            GXt_char1 = A13934BarNormas ;
            GXv_char10[0] = GXt_char1 ;
            new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char10) ;
            informemermasdetallado_wc_impl.this.GXt_char1 = GXv_char10[0] ;
            A13934BarNormas = GXt_char1 ;
            GXt_int9 = A13935BarAlbFact ;
            GXv_int5[0] = GXt_int9 ;
            new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int5) ;
            informemermasdetallado_wc_impl.this.GXt_int9 = GXv_int5[0] ;
            A13935BarAlbFact = GXt_int9 ;
            GXt_char1 = A13878PedidoClie ;
            GXv_char10[0] = A396EmprCod ;
            GXv_char6[0] = A4812BarEncCli ;
            GXv_char4[0] = A143BarDisNum ;
            GXv_char2[0] = GXt_char1 ;
            new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char10, GXv_char6, GXv_char4, GXv_char2) ;
            informemermasdetallado_wc_impl.this.A396EmprCod = GXv_char10[0] ;
            informemermasdetallado_wc_impl.this.A4812BarEncCli = GXv_char6[0] ;
            informemermasdetallado_wc_impl.this.A143BarDisNum = GXv_char4[0] ;
            informemermasdetallado_wc_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4812BarEncCli", A4812BarEncCli);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143BarDisNum", A143BarDisNum);
            A13878PedidoClie = GXt_char1 ;
            if ( ! ( (GXutil.strcmp("", AV151TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV150TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV150TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV151TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV151TFPedidoCliente_Sel) == 0 ) ) )
               {
                  if ( (GXutil.strcmp("", AV44BarEncCli)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV44BarEncCli) >= 0 ) ) )
                  {
                     if ( (GXutil.strcmp("", AV134BarEncCli_to)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV134BarEncCli_to) <= 0 ) ) )
                     {
                        A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                        A13885KilosPendi = (A166BarKgm.subtract(A13887KilosEntre)) ;
                        A13886MetrosPend = (A184BarMtr.subtract(DecimalUtil.doubleToDec(A13888MetrosEntr))) ;
                        e20MV2 ();
                     }
                  }
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(39) ;
         wbMV0( ) ;
      }
      bGXsfl_39_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesMV2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARKGM", GXutil.ltrim( localUtil.ntoc( AV153TotBarKgm, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV153TotBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTKGSEXP", GXutil.ltrim( localUtil.ntoc( AV155TotKgsExp, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKGSEXP", getSecureSignedToken( sPrefix, localUtil.format( AV155TotKgsExp, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTDIFKILOS", GXutil.ltrim( localUtil.ntoc( AV157TotDifKilos, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDIFKILOS", getSecureSignedToken( sPrefix, localUtil.format( AV157TotDifKilos, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARMTR", GXutil.ltrim( localUtil.ntoc( AV167TotBarMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV167TotBarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMTSEXP", GXutil.ltrim( localUtil.ntoc( AV161TotMtsexp, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMTSEXP", getSecureSignedToken( sPrefix, localUtil.format( AV161TotMtsexp, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTDIFMETROS", GXutil.ltrim( localUtil.ntoc( AV163TotDifMetros, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDIFMETROS", getSecureSignedToken( sPrefix, localUtil.format( AV163TotDifMetros, "ZZZZZ9.99")));
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
      return (int)(subgridclient_rec_count_fnc()) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV41BarFecSal, AV42BarFecSal_To, AV100BarColNom, AV101BarColNom_To, AV139BarColNum, AV140BarColNum_To, AV98BarSer, AV99BarSer_To, AV96CliCod, AV97CliCod_To, AV44BarEncCli, AV134BarEncCli_to, AV136BarTipArt, AV138BarTipArt_to, A396EmprCod, AV19ColumnsSelector, AV185Pgmname, AV12OrderedBy, AV13OrderedDsc, AV46TFCliCod, AV47TFCliCod_To, AV26TFCliNom, AV27TFCliNom_Sel, AV29TFBarNHdr, AV30TFBarNHdr_Sel, AV49TFBarTipArt, AV50TFBarTipArt_To, AV150TFPedidoCliente, AV151TFPedidoCliente_Sel, AV52TFBarSer, AV53TFBarSer_Sel, AV58TFBarColNom, AV59TFBarColNom_Sel, AV61TFBarNomCli, AV62TFBarNomCli_Sel, AV64TFBarColNum, AV65TFBarColNum_To, AV67TFBarFecCli, AV72TFBarKgm, AV73TFBarKgm_To, AV81TFBarMtr, AV82TFBarMtr_To, AV131EmprCod, AV153TotBarKgm, A1261BarAlbKgmE, A1263BarAlbMtrE, AV155TotKgsExp, AV157TotDifKilos, AV167TotBarMtr, AV161TotMtsexp, AV163TotDifMetros, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV41BarFecSal, AV42BarFecSal_To, AV100BarColNom, AV101BarColNom_To, AV139BarColNum, AV140BarColNum_To, AV98BarSer, AV99BarSer_To, AV96CliCod, AV97CliCod_To, AV44BarEncCli, AV134BarEncCli_to, AV136BarTipArt, AV138BarTipArt_to, A396EmprCod, AV19ColumnsSelector, AV185Pgmname, AV12OrderedBy, AV13OrderedDsc, AV46TFCliCod, AV47TFCliCod_To, AV26TFCliNom, AV27TFCliNom_Sel, AV29TFBarNHdr, AV30TFBarNHdr_Sel, AV49TFBarTipArt, AV50TFBarTipArt_To, AV150TFPedidoCliente, AV151TFPedidoCliente_Sel, AV52TFBarSer, AV53TFBarSer_Sel, AV58TFBarColNom, AV59TFBarColNom_Sel, AV61TFBarNomCli, AV62TFBarNomCli_Sel, AV64TFBarColNum, AV65TFBarColNum_To, AV67TFBarFecCli, AV72TFBarKgm, AV73TFBarKgm_To, AV81TFBarMtr, AV82TFBarMtr_To, AV131EmprCod, AV153TotBarKgm, A1261BarAlbKgmE, A1263BarAlbMtrE, AV155TotKgsExp, AV157TotDifKilos, AV167TotBarMtr, AV161TotMtsexp, AV163TotDifMetros, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV41BarFecSal, AV42BarFecSal_To, AV100BarColNom, AV101BarColNom_To, AV139BarColNum, AV140BarColNum_To, AV98BarSer, AV99BarSer_To, AV96CliCod, AV97CliCod_To, AV44BarEncCli, AV134BarEncCli_to, AV136BarTipArt, AV138BarTipArt_to, A396EmprCod, AV19ColumnsSelector, AV185Pgmname, AV12OrderedBy, AV13OrderedDsc, AV46TFCliCod, AV47TFCliCod_To, AV26TFCliNom, AV27TFCliNom_Sel, AV29TFBarNHdr, AV30TFBarNHdr_Sel, AV49TFBarTipArt, AV50TFBarTipArt_To, AV150TFPedidoCliente, AV151TFPedidoCliente_Sel, AV52TFBarSer, AV53TFBarSer_Sel, AV58TFBarColNom, AV59TFBarColNom_Sel, AV61TFBarNomCli, AV62TFBarNomCli_Sel, AV64TFBarColNum, AV65TFBarColNum_To, AV67TFBarFecCli, AV72TFBarKgm, AV73TFBarKgm_To, AV81TFBarMtr, AV82TFBarMtr_To, AV131EmprCod, AV153TotBarKgm, A1261BarAlbKgmE, A1263BarAlbMtrE, AV155TotKgsExp, AV157TotDifKilos, AV167TotBarMtr, AV161TotMtsexp, AV163TotDifMetros, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV41BarFecSal, AV42BarFecSal_To, AV100BarColNom, AV101BarColNom_To, AV139BarColNum, AV140BarColNum_To, AV98BarSer, AV99BarSer_To, AV96CliCod, AV97CliCod_To, AV44BarEncCli, AV134BarEncCli_to, AV136BarTipArt, AV138BarTipArt_to, A396EmprCod, AV19ColumnsSelector, AV185Pgmname, AV12OrderedBy, AV13OrderedDsc, AV46TFCliCod, AV47TFCliCod_To, AV26TFCliNom, AV27TFCliNom_Sel, AV29TFBarNHdr, AV30TFBarNHdr_Sel, AV49TFBarTipArt, AV50TFBarTipArt_To, AV150TFPedidoCliente, AV151TFPedidoCliente_Sel, AV52TFBarSer, AV53TFBarSer_Sel, AV58TFBarColNom, AV59TFBarColNom_Sel, AV61TFBarNomCli, AV62TFBarNomCli_Sel, AV64TFBarColNum, AV65TFBarColNum_To, AV67TFBarFecCli, AV72TFBarKgm, AV73TFBarKgm_To, AV81TFBarMtr, AV82TFBarMtr_To, AV131EmprCod, AV153TotBarKgm, A1261BarAlbKgmE, A1263BarAlbMtrE, AV155TotKgsExp, AV157TotDifKilos, AV167TotBarMtr, AV161TotMtsexp, AV163TotDifMetros, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV41BarFecSal, AV42BarFecSal_To, AV100BarColNom, AV101BarColNom_To, AV139BarColNum, AV140BarColNum_To, AV98BarSer, AV99BarSer_To, AV96CliCod, AV97CliCod_To, AV44BarEncCli, AV134BarEncCli_to, AV136BarTipArt, AV138BarTipArt_to, A396EmprCod, AV19ColumnsSelector, AV185Pgmname, AV12OrderedBy, AV13OrderedDsc, AV46TFCliCod, AV47TFCliCod_To, AV26TFCliNom, AV27TFCliNom_Sel, AV29TFBarNHdr, AV30TFBarNHdr_Sel, AV49TFBarTipArt, AV50TFBarTipArt_To, AV150TFPedidoCliente, AV151TFPedidoCliente_Sel, AV52TFBarSer, AV53TFBarSer_Sel, AV58TFBarColNom, AV59TFBarColNom_Sel, AV61TFBarNomCli, AV62TFBarNomCli_Sel, AV64TFBarColNum, AV65TFBarColNum_To, AV67TFBarFecCli, AV72TFBarKgm, AV73TFBarKgm_To, AV81TFBarMtr, AV82TFBarMtr_To, AV131EmprCod, AV153TotBarKgm, A1261BarAlbKgmE, A1263BarAlbMtrE, AV155TotKgsExp, AV157TotDifKilos, AV167TotBarMtr, AV161TotMtsexp, AV163TotDifMetros, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV185Pgmname = "InformeMermasDetallado_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV185Pgmname", AV185Pgmname);
      Gx_err = (short)(0) ;
      edtavTipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipartdsc_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavKgsexp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavKgsexp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKgsexp_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavDifkilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDifkilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifkilos_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavPorkgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPorkgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPorkgs_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavMtsexp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMtsexp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMtsexp_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavDifmetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDifmetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifmetros_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavPormts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPormts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPormts_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavTotvaluebarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarkgm_Enabled), 5, 0), true);
      edtavTotvaluekgsexp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluekgsexp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluekgsexp_Enabled), 5, 0), true);
      edtavTotvaluedifkilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluedifkilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluedifkilos_Enabled), 5, 0), true);
      edtavTotvaluebarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarmtr_Enabled), 5, 0), true);
      edtavTotvaluemtsexp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemtsexp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemtsexp_Enabled), 5, 0), true);
      edtavTotvaluedifmetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluedifmetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluedifmetros_Enabled), 5, 0), true);
      /* Using cursor H00MV19 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A13902BarNorma = H00MV19_A13902BarNorma[0] ;
         n13902BarNorma = H00MV19_n13902BarNorma[0] ;
      }
      else
      {
         A13902BarNorma = " " ;
         n13902BarNorma = false ;
      }
      pr_default.close(2);
      pr_default.close(2);
      fix_multi_value_controls( ) ;
   }

   public void strupMV0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e18MV2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV37DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV19ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_39 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_39"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV39GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV40GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV131EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV131EmprCod") ;
         wcpOAV41BarFecSal = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV41BarFecSal"), 0) ;
         wcpOAV42BarFecSal_To = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV42BarFecSal_To"), 0) ;
         wcpOAV100BarColNom = httpContext.cgiGet( sPrefix+"wcpOAV100BarColNom") ;
         wcpOAV101BarColNom_To = httpContext.cgiGet( sPrefix+"wcpOAV101BarColNom_To") ;
         wcpOAV139BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV139BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV140BarColNum_To = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV140BarColNum_To"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV98BarSer = httpContext.cgiGet( sPrefix+"wcpOAV98BarSer") ;
         wcpOAV99BarSer_To = httpContext.cgiGet( sPrefix+"wcpOAV99BarSer_To") ;
         wcpOAV96CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV96CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV97CliCod_To = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV97CliCod_To"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV44BarEncCli = httpContext.cgiGet( sPrefix+"wcpOAV44BarEncCli") ;
         wcpOAV134BarEncCli_to = httpContext.cgiGet( sPrefix+"wcpOAV134BarEncCli_to") ;
         wcpOAV136BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV136BarTipArt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV138BarTipArt_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV138BarTipArt_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV134BarEncCli_to = httpContext.cgiGet( sPrefix+"vBARENCCLI_TO") ;
         AV44BarEncCli = httpContext.cgiGet( sPrefix+"vBARENCCLI") ;
         AV42BarFecSal_To = localUtil.ctod( httpContext.cgiGet( sPrefix+"vBARFECSAL_TO"), 0) ;
         AV41BarFecSal = localUtil.ctod( httpContext.cgiGet( sPrefix+"vBARFECSAL"), 0) ;
         AV140BarColNum_To = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARCOLNUM_TO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV139BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARCOLNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV101BarColNom_To = httpContext.cgiGet( sPrefix+"vBARCOLNOM_TO") ;
         AV100BarColNom = httpContext.cgiGet( sPrefix+"vBARCOLNOM") ;
         AV99BarSer_To = httpContext.cgiGet( sPrefix+"vBARSER_TO") ;
         AV98BarSer = httpContext.cgiGet( sPrefix+"vBARSER") ;
         AV97CliCod_To = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vCLICOD_TO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV96CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV138BarTipArt_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARTIPART_TO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV136BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARTIPART"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV131EmprCod = httpContext.cgiGet( sPrefix+"vEMPRCOD") ;
         AV135ImpCod = httpContext.cgiGet( sPrefix+"vIMPCOD") ;
         AV142PDisCli = httpContext.cgiGet( sPrefix+"vPDISCLI") ;
         AV152UDisCli = httpContext.cgiGet( sPrefix+"vUDISCLI") ;
         AV144SoloTotal = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vSOLOTOTAL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV145BarItem1 = httpContext.cgiGet( sPrefix+"vBARITEM1") ;
         AV146BarItem3 = httpContext.cgiGet( sPrefix+"vBARITEM3") ;
         AV147Barmdlcod1 = httpContext.cgiGet( sPrefix+"vBARMDLCOD1") ;
         AV148BarItem5 = httpContext.cgiGet( sPrefix+"vBARITEM5") ;
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
         /* Read variables values. */
         AV154TotValueBarKgm = httpContext.cgiGet( edtavTotvaluebarkgm_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV154TotValueBarKgm", AV154TotValueBarKgm);
         AV156TotValueKgsExp = httpContext.cgiGet( edtavTotvaluekgsexp_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV156TotValueKgsExp", AV156TotValueKgsExp);
         AV158TotValueDifKilos = httpContext.cgiGet( edtavTotvaluedifkilos_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV158TotValueDifKilos", AV158TotValueDifKilos);
         AV168TotValueBarMtr = httpContext.cgiGet( edtavTotvaluebarmtr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV168TotValueBarMtr", AV168TotValueBarMtr);
         AV162TotValueMtsexp = httpContext.cgiGet( edtavTotvaluemtsexp_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV162TotValueMtsexp", AV162TotValueMtsexp);
         AV164TotValueDifMetros = httpContext.cgiGet( edtavTotvaluedifmetros_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV164TotValueDifMetros", AV164TotValueDifMetros);
         AV185Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV185Pgmname", AV185Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfeccliauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECCLIAUXDATE");
            GX_FocusControl = edtavDdo_barfeccliauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV69DDO_BarFecCliAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69DDO_BarFecCliAuxDate", localUtil.format(AV69DDO_BarFecCliAuxDate, "99/99/99"));
         }
         else
         {
            AV69DDO_BarFecCliAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfeccliauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69DDO_BarFecCliAuxDate", localUtil.format(AV69DDO_BarFecCliAuxDate, "99/99/99"));
         }
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
      e18MV2 ();
      if (returnInSub) return;
   }

   public void e18MV2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV83Station ;
      GXv_char10[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char10) ;
      informemermasdetallado_wc_impl.this.GXt_char1 = GXv_char10[0] ;
      AV83Station = GXt_char1 ;
      GXv_char10[0] = A396EmprCod ;
      GXv_char6[0] = AV84EmprNom ;
      GXv_char4[0] = AV85UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV83Station, GXv_char10, GXv_char6, GXv_char4) ;
      informemermasdetallado_wc_impl.this.A396EmprCod = GXv_char10[0] ;
      informemermasdetallado_wc_impl.this.AV84EmprNom = GXv_char6[0] ;
      informemermasdetallado_wc_impl.this.AV85UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      GXt_char1 = AV83Station ;
      GXv_char10[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char10) ;
      informemermasdetallado_wc_impl.this.GXt_char1 = GXv_char10[0] ;
      AV83Station = GXt_char1 ;
      GXv_char10[0] = AV131EmprCod ;
      GXv_char6[0] = AV84EmprNom ;
      GXv_char4[0] = AV85UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV83Station, GXv_char10, GXv_char6, GXv_char4) ;
      informemermasdetallado_wc_impl.this.AV131EmprCod = GXv_char10[0] ;
      informemermasdetallado_wc_impl.this.AV84EmprNom = GXv_char6[0] ;
      informemermasdetallado_wc_impl.this.AV85UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131EmprCod", AV131EmprCod);
      edtavPgmname_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Visible), 5, 0), true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11 = AV37DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12[0] ;
      AV37DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e19MV2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext13[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext13) ;
      AV6WWPContext = GXv_SdtWWPContext13[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV21Session.getValue("InformeMermasDetallado_WCColumnsSelector"), "") != 0 )
      {
         AV17ColumnsSelectorXML = AV21Session.getValue("InformeMermasDetallado_WCColumnsSelector") ;
         AV19ColumnsSelector.fromxml(AV17ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S152 ();
         if (returnInSub) return;
      }
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtBarNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtBarTipArt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarTipArt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipArt_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtavTipartdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipartdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipartdsc_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtPedidoClie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPedidoClie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedidoClie_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtBarSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtBarColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtBarNomCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNomCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtBarColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtBarFecCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFecCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecCli_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtBarKgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgm_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtavKgsexp_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavKgsexp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKgsexp_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtavDifkilos_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDifkilos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifkilos_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtavPorkgs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPorkgs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPorkgs_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtBarMtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMtr_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtavMtsexp_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMtsexp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMtsexp_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtavDifmetros_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDifmetros_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifmetros_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtavPormts_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPormts_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPormts_Visible), 5, 0), !bGXsfl_39_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S162 ();
      if (returnInSub) return;
      AV39GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39GridCurrentPage), 10, 0));
      AV40GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV133WebSession.getValue("InformeMermasDetallado"))), httpContext.getMessage( "FINALIZADO", "")) == 0 )
      {
         AV133WebSession.remove("InformeMermasDetallado");
         AV132ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
         AV132ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
         AV132ProgressIndicator.hide();
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ColumnsSelector", AV19ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV132ProgressIndicator", AV132ProgressIndicator);
   }

   public void e12MV2( )
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
         AV38PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV38PageToGo) ;
      }
   }

   public void e13MV2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e14MV2( )
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
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV46TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFCliCod), 6, 0));
            AV47TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV26TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFCliNom", AV26TFCliNom);
            AV27TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFCliNom_Sel", AV27TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV29TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFBarNHdr", AV29TFBarNHdr);
            AV30TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFBarNHdr_Sel", AV30TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarTipArt") == 0 )
         {
            AV49TFBarTipArt = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFBarTipArt), 4, 0));
            AV50TFBarTipArt_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarTipArt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFBarTipArt_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PedidoCliente") == 0 )
         {
            AV150TFPedidoCliente = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV150TFPedidoCliente", AV150TFPedidoCliente);
            AV151TFPedidoCliente_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV151TFPedidoCliente_Sel", AV151TFPedidoCliente_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV52TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarSer", AV52TFBarSer);
            AV53TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarSer_Sel", AV53TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNom") == 0 )
         {
            AV58TFBarColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFBarColNom", AV58TFBarColNom);
            AV59TFBarColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFBarColNom_Sel", AV59TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNomCli") == 0 )
         {
            AV61TFBarNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFBarNomCli", AV61TFBarNomCli);
            AV62TFBarNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFBarNomCli_Sel", AV62TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNum") == 0 )
         {
            AV64TFBarColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFBarColNum), 6, 0));
            AV65TFBarColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecCli") == 0 )
         {
            AV67TFBarFecCli = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFBarFecCli", localUtil.format(AV67TFBarFecCli, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarKgm") == 0 )
         {
            AV72TFBarKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFBarKgm", GXutil.ltrimstr( AV72TFBarKgm, 9, 2));
            AV73TFBarKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFBarKgm_To", GXutil.ltrimstr( AV73TFBarKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarMtr") == 0 )
         {
            AV81TFBarMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFBarMtr", GXutil.ltrimstr( AV81TFBarMtr, 9, 2));
            AV82TFBarMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFBarMtr_To", GXutil.ltrimstr( AV82TFBarMtr_To, 9, 2));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e20MV2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         GXt_char1 = AV43TipArtDsc ;
         GXv_char10[0] = GXt_char1 ;
         new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A217BarTipArt, GXv_char10) ;
         informemermasdetallado_wc_impl.this.GXt_char1 = GXv_char10[0] ;
         AV43TipArtDsc = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipartdsc_Internalname, AV43TipArtDsc);
         AV74KgsExp = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavKgsexp_Internalname, GXutil.ltrimstr( AV74KgsExp, 9, 2));
         AV75Mtsexp = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMtsexp_Internalname, GXutil.ltrimstr( AV75Mtsexp, 9, 2));
         /* Optimized group. */
         pr_default.dynParam(3, new Object[]{ new Object[]{
                                              AV27TFCliNom_Sel ,
                                              AV26TFCliNom ,
                                              AV72TFBarKgm ,
                                              AV73TFBarKgm_To ,
                                              AV81TFBarMtr ,
                                              AV82TFBarMtr_To ,
                                              A279CliNom ,
                                              A166BarKgm ,
                                              A184BarMtr } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                              }
         });
         lV150TFPedidoCliente = GXutil.padr( GXutil.rtrim( AV150TFPedidoCliente), 20, "%") ;
         /* Using cursor H00MV20 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, AV151TFPedidoCliente_Sel, AV150TFPedidoCliente, A13878PedidoClie, lV150TFPedidoCliente, AV151TFPedidoCliente_Sel, A13878PedidoClie, AV151TFPedidoCliente_Sel, AV44BarEncCli, A13878PedidoClie, AV44BarEncCli, AV134BarEncCli_to, A13878PedidoClie, AV134BarEncCli_to});
         c1261BarAlbKgmE = H00MV20_A1261BarAlbKgmE[0] ;
         c1263BarAlbMtrE = H00MV20_A1263BarAlbMtrE[0] ;
         pr_default.close(3);
         AV74KgsExp = AV74KgsExp.add(c1261BarAlbKgmE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavKgsexp_Internalname, GXutil.ltrimstr( AV74KgsExp, 9, 2));
         AV75Mtsexp = AV75Mtsexp.add(c1263BarAlbMtrE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMtsexp_Internalname, GXutil.ltrimstr( AV75Mtsexp, 9, 2));
         /* End optimized group. */
         AV76DifKilos = ((AV74KgsExp.doubleValue()==0) ? DecimalUtil.doubleToDec(0) : (AV74KgsExp.subtract(A166BarKgm))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifkilos_Internalname, GXutil.ltrimstr( AV76DifKilos, 9, 2));
         AV77PorKgs = ((A166BarKgm.doubleValue()>0) ? (AV76DifKilos.divide(A166BarKgm, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPorkgs_Internalname, GXutil.ltrimstr( AV77PorKgs, 6, 2));
         AV78DifMetros = ((AV75Mtsexp.doubleValue()==0) ? DecimalUtil.doubleToDec(0) : (AV75Mtsexp.subtract(A184BarMtr))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifmetros_Internalname, GXutil.ltrimstr( AV78DifMetros, 9, 2));
         AV79PorMts = ((A184BarMtr.doubleValue()>0) ? (AV78DifMetros.divide(A184BarMtr, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPormts_Internalname, GXutil.ltrimstr( AV79PorMts, 6, 2));
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(39) ;
         }
         sendrow_392( ) ;
         GRID_nEOF = (byte)(1) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
         {
            GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
         }
      }
      if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
      {
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      }
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_39_Refreshing )
      {
         httpContext.doAjaxLoad(39, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e15MV2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV17ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV19ColumnsSelector.fromJSonString(AV17ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "InformeMermasDetallado_WCColumnsSelector", ((GXutil.strcmp("", AV17ColumnsSelectorXML)==0) ? "" : AV19ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ColumnsSelector", AV19ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV132ProgressIndicator", AV132ProgressIndicator);
   }

   public void e16MV2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV133WebSession.setValue("InformeMermasDetallado_WC_BarFecSal", localUtil.dtoc( AV41BarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"));
      AV133WebSession.setValue("InformeMermasDetallado_WC_BarFecSal_to", localUtil.dtoc( AV42BarFecSal_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"));
      GXv_char10[0] = AV15ExcelFilename ;
      GXv_char6[0] = AV16ErrorMessage ;
      new app.informemermasdetallado_wcexport(remoteHandle, context).execute( GXv_char10, GXv_char6) ;
      informemermasdetallado_wc_impl.this.AV15ExcelFilename = GXv_char10[0] ;
      informemermasdetallado_wc_impl.this.AV16ErrorMessage = GXv_char6[0] ;
      if ( GXutil.strcmp(AV15ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV15ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV16ErrorMessage);
      }
      /*  Sending Event outputs  */
   }

   public void e17MV2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV133WebSession.setValue("InformeMermasDetallado_WC_BarFecSal", localUtil.dtoc( AV41BarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"));
      AV133WebSession.setValue("InformeMermasDetallado_WC_BarFecSal_to", localUtil.dtoc( AV42BarFecSal_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"));
      callWebObject(formatLink("app.informemermasdetallado_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV19ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CliCod", "", "Cod. Cliente", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CliNom", "", "Nom. Cliente", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarNHdr", "", "O.S. - R", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarTipArt", "", "Codigo", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&TipArtDsc", "", "Descripcion", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "PedidoCliente", "", "Enc Cli", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarSer", "", "Artigo", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarColNom", "", "Cod. Cor", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarNomCli", "", "Cor Cliente", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarColNum", "", "Numero", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarFecCli", "", "Data", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarKgm", "", "Qgs. Entrado", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&KgsExp", "", "Qgs. Saidos", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&DifKilos", "", "Qgs. Difer", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&PorKgs", "", "Qgs. %", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarMtr", "", "Mts. Entrado", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&Mtsexp", "", "Mts. Saidos", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&DifMetros", "", "Mts. Difer", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&PorMts", "", "Mts. %", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXt_char1 = AV18UserCustomValue ;
      GXv_char10[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "InformeMermasDetallado_WCColumnsSelector", GXv_char10) ;
      informemermasdetallado_wc_impl.this.GXt_char1 = GXv_char10[0] ;
      AV18UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV18UserCustomValue)==0) ) )
      {
         AV20ColumnsSelectorAux.fromxml(AV18UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector15[0] = AV19ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, GXv_SdtWWPColumnsSelector15) ;
         AV20ColumnsSelectorAux = GXv_SdtWWPColumnsSelector14[0] ;
         AV19ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      }
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV21Session.getValue(AV185Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV185Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV21Session.getValue(AV185Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV187GXV1 = 1 ;
      while ( AV187GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV187GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV46TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFCliCod), 6, 0));
            AV47TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV26TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFCliNom", AV26TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV27TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFCliNom_Sel", AV27TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV29TFBarNHdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFBarNHdr", AV29TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV30TFBarNHdr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFBarNHdr_Sel", AV30TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPART") == 0 )
         {
            AV49TFBarTipArt = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFBarTipArt), 4, 0));
            AV50TFBarTipArt_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarTipArt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFBarTipArt_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV150TFPedidoCliente = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV150TFPedidoCliente", AV150TFPedidoCliente);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV151TFPedidoCliente_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV151TFPedidoCliente_Sel", AV151TFPedidoCliente_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV52TFBarSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarSer", AV52TFBarSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV53TFBarSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarSer_Sel", AV53TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV58TFBarColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFBarColNom", AV58TFBarColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV59TFBarColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFBarColNom_Sel", AV59TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV61TFBarNomCli = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFBarNomCli", AV61TFBarNomCli);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV62TFBarNomCli_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFBarNomCli_Sel", AV62TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV64TFBarColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFBarColNum), 6, 0));
            AV65TFBarColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV67TFBarFecCli = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFBarFecCli", localUtil.format(AV67TFBarFecCli, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV72TFBarKgm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFBarKgm", GXutil.ltrimstr( AV72TFBarKgm, 9, 2));
            AV73TFBarKgm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFBarKgm_To", GXutil.ltrimstr( AV73TFBarKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV81TFBarMtr = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFBarMtr", GXutil.ltrimstr( AV81TFBarMtr, 9, 2));
            AV82TFBarMtr_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFBarMtr_To", GXutil.ltrimstr( AV82TFBarMtr_To, 9, 2));
         }
         AV187GXV1 = (int)(AV187GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char10[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFCliNom_Sel)==0), AV27TFCliNom_Sel, GXv_char10) ;
      informemermasdetallado_wc_impl.this.GXt_char1 = GXv_char10[0] ;
      GXt_char16 = "" ;
      GXv_char6[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFBarNHdr_Sel)==0), AV30TFBarNHdr_Sel, GXv_char6) ;
      informemermasdetallado_wc_impl.this.GXt_char16 = GXv_char6[0] ;
      GXt_char17 = "" ;
      GXv_char4[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV151TFPedidoCliente_Sel)==0), AV151TFPedidoCliente_Sel, GXv_char4) ;
      informemermasdetallado_wc_impl.this.GXt_char17 = GXv_char4[0] ;
      GXt_char18 = "" ;
      GXv_char2[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFBarSer_Sel)==0), AV53TFBarSer_Sel, GXv_char2) ;
      informemermasdetallado_wc_impl.this.GXt_char18 = GXv_char2[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFBarColNom_Sel)==0), AV59TFBarColNom_Sel, GXv_char20) ;
      informemermasdetallado_wc_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFBarNomCli_Sel)==0), AV62TFBarNomCli_Sel, GXv_char22) ;
      informemermasdetallado_wc_impl.this.GXt_char21 = GXv_char22[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char16+"|||"+GXt_char17+"|"+GXt_char18+"|"+GXt_char19+"|"+GXt_char21+"||||||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFCliNom)==0), AV26TFCliNom, GXv_char22) ;
      informemermasdetallado_wc_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFBarNHdr)==0), AV29TFBarNHdr, GXv_char20) ;
      informemermasdetallado_wc_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char18 = "" ;
      GXv_char10[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV150TFPedidoCliente)==0), AV150TFPedidoCliente, GXv_char10) ;
      informemermasdetallado_wc_impl.this.GXt_char18 = GXv_char10[0] ;
      GXt_char17 = "" ;
      GXv_char6[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFBarSer)==0), AV52TFBarSer, GXv_char6) ;
      informemermasdetallado_wc_impl.this.GXt_char17 = GXv_char6[0] ;
      GXt_char16 = "" ;
      GXv_char4[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFBarColNom)==0), AV58TFBarColNom, GXv_char4) ;
      informemermasdetallado_wc_impl.this.GXt_char16 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFBarNomCli)==0), AV61TFBarNomCli, GXv_char2) ;
      informemermasdetallado_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV46TFCliCod) ? "" : GXutil.str( AV46TFCliCod, 6, 0))+"|"+GXt_char21+"|"+GXt_char19+"|"+((0==AV49TFBarTipArt) ? "" : GXutil.str( AV49TFBarTipArt, 4, 0))+"||"+GXt_char18+"|"+GXt_char17+"|"+GXt_char16+"|"+GXt_char1+"|"+((0==AV64TFBarColNum) ? "" : GXutil.str( AV64TFBarColNum, 6, 0))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67TFBarFecCli)) ? "" : localUtil.dtoc( AV67TFBarFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFBarKgm)==0) ? "" : GXutil.str( AV72TFBarKgm, 9, 2))+"||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV81TFBarMtr)==0) ? "" : GXutil.str( AV81TFBarMtr, 9, 2))+"|||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV47TFCliCod_To) ? "" : GXutil.str( AV47TFCliCod_To, 6, 0))+"|||"+((0==AV50TFBarTipArt_To) ? "" : GXutil.str( AV50TFBarTipArt_To, 4, 0))+"||||||"+((0==AV65TFBarColNum_To) ? "" : GXutil.str( AV65TFBarColNum_To, 6, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFBarKgm_To)==0) ? "" : GXutil.str( AV73TFBarKgm_To, 9, 2))+"||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV82TFBarMtr_To)==0) ? "" : GXutil.str( AV82TFBarMtr_To, 9, 2))+"|||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV21Session.getValue(AV185Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState23[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFCLICOD", "", !((0==AV46TFCliCod)&&(0==AV47TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV46TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV47TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFCLINOM", "", !(GXutil.strcmp("", AV26TFCliNom)==0), (short)(0), AV26TFCliNom, "", !(GXutil.strcmp("", AV27TFCliNom_Sel)==0), AV27TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFBARNHDR", "", !(GXutil.strcmp("", AV29TFBarNHdr)==0), (short)(0), AV29TFBarNHdr, "", !(GXutil.strcmp("", AV30TFBarNHdr_Sel)==0), AV30TFBarNHdr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFBARTIPART", "", !((0==AV49TFBarTipArt)&&(0==AV50TFBarTipArt_To)), (short)(0), GXutil.trim( GXutil.str( AV49TFBarTipArt, 4, 0)), GXutil.trim( GXutil.str( AV50TFBarTipArt_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFPEDIDOCLIENTE", "", !(GXutil.strcmp("", AV150TFPedidoCliente)==0), (short)(0), AV150TFPedidoCliente, "", !(GXutil.strcmp("", AV151TFPedidoCliente_Sel)==0), AV151TFPedidoCliente_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFBARSER", "", !(GXutil.strcmp("", AV52TFBarSer)==0), (short)(0), AV52TFBarSer, "", !(GXutil.strcmp("", AV53TFBarSer_Sel)==0), AV53TFBarSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFBARCOLNOM", "", !(GXutil.strcmp("", AV58TFBarColNom)==0), (short)(0), AV58TFBarColNom, "", !(GXutil.strcmp("", AV59TFBarColNom_Sel)==0), AV59TFBarColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFBARNOMCLI", "", !(GXutil.strcmp("", AV61TFBarNomCli)==0), (short)(0), AV61TFBarNomCli, "", !(GXutil.strcmp("", AV62TFBarNomCli_Sel)==0), AV62TFBarNomCli_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFBARCOLNUM", "", !((0==AV64TFBarColNum)&&(0==AV65TFBarColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV64TFBarColNum, 6, 0)), GXutil.trim( GXutil.str( AV65TFBarColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFBARFECCLI", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67TFBarFecCli)), (short)(0), GXutil.trim( localUtil.dtoc( AV67TFBarFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFBARKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFBarKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFBarKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV72TFBarKgm, 9, 2)), GXutil.trim( GXutil.str( AV73TFBarKgm_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFBARMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV81TFBarMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV82TFBarMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV81TFBarMtr, 9, 2)), GXutil.trim( GXutil.str( AV82TFBarMtr_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState23[0] ;
      if ( ! (GXutil.strcmp("", AV131EmprCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV131EmprCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV41BarFecSal)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFECSAL" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV41BarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42BarFecSal_To)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFECSAL_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV42BarFecSal_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV100BarColNom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNOM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV100BarColNom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV101BarColNom_To)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNOM_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV101BarColNom_To );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV139BarColNum) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNUM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV139BarColNum, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV140BarColNum_To) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNUM_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV140BarColNum_To, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV98BarSer)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSER" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV98BarSer );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV99BarSer_To)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSER_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV99BarSer_To );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV96CliCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV96CliCod, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV97CliCod_To) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV97CliCod_To, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV44BarEncCli)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARENCCLI" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV44BarEncCli );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV134BarEncCli_to)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARENCCLI_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV134BarEncCli_to );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV136BarTipArt) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARTIPART" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV136BarTipArt, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV138BarTipArt_to) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARTIPART_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV138BarTipArt_to, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV185Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV185Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TTrn04" );
      AV21Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S162( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV153TotBarKgm = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV153TotBarKgm", GXutil.ltrimstr( AV153TotBarKgm, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV153TotBarKgm, "ZZZZZ9.99")));
      AV155TotKgsExp = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV155TotKgsExp", GXutil.ltrimstr( AV155TotKgsExp, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKGSEXP", getSecureSignedToken( sPrefix, localUtil.format( AV155TotKgsExp, "ZZZZZ9.99")));
      AV157TotDifKilos = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV157TotDifKilos", GXutil.ltrimstr( AV157TotDifKilos, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDIFKILOS", getSecureSignedToken( sPrefix, localUtil.format( AV157TotDifKilos, "ZZZZZ9.99")));
      AV167TotBarMtr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV167TotBarMtr", GXutil.ltrimstr( AV167TotBarMtr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV167TotBarMtr, "ZZZZZ9.99")));
      AV161TotMtsexp = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV161TotMtsexp", GXutil.ltrimstr( AV161TotMtsexp, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMTSEXP", getSecureSignedToken( sPrefix, localUtil.format( AV161TotMtsexp, "ZZZZZ9.99")));
      AV163TotDifMetros = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV163TotDifMetros", GXutil.ltrimstr( AV163TotDifMetros, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDIFMETROS", getSecureSignedToken( sPrefix, localUtil.format( AV163TotDifMetros, "ZZZZZ9.99")));
   }

   public void S172( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Integer.valueOf(AV46TFCliCod) ,
                                           Integer.valueOf(AV47TFCliCod_To) ,
                                           AV27TFCliNom_Sel ,
                                           AV26TFCliNom ,
                                           AV30TFBarNHdr_Sel ,
                                           AV29TFBarNHdr ,
                                           Short.valueOf(AV49TFBarTipArt) ,
                                           Short.valueOf(AV50TFBarTipArt_To) ,
                                           AV53TFBarSer_Sel ,
                                           AV52TFBarSer ,
                                           AV59TFBarColNom_Sel ,
                                           AV58TFBarColNom ,
                                           AV62TFBarNomCli_Sel ,
                                           AV61TFBarNomCli ,
                                           Integer.valueOf(AV64TFBarColNum) ,
                                           Integer.valueOf(AV65TFBarColNum_To) ,
                                           AV67TFBarFecCli ,
                                           AV72TFBarKgm ,
                                           AV73TFBarKgm_To ,
                                           AV81TFBarMtr ,
                                           AV82TFBarMtr_To ,
                                           AV41BarFecSal ,
                                           AV42BarFecSal_To ,
                                           Integer.valueOf(AV96CliCod) ,
                                           Integer.valueOf(AV97CliCod_To) ,
                                           AV98BarSer ,
                                           AV99BarSer_To ,
                                           AV100BarColNom ,
                                           AV101BarColNom_To ,
                                           Integer.valueOf(AV139BarColNum) ,
                                           Integer.valueOf(AV140BarColNum_To) ,
                                           Short.valueOf(AV136BarTipArt) ,
                                           Short.valueOf(AV138BarTipArt_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A155BarFecCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A161BarFecSal ,
                                           AV151TFPedidoCliente_Sel ,
                                           AV150TFPedidoCliente ,
                                           A13878PedidoClie ,
                                           AV44BarEncCli ,
                                           AV134BarEncCli_to ,
                                           Byte.valueOf(A213BarSit) ,
                                           AV131EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV26TFCliNom = GXutil.padr( GXutil.rtrim( AV26TFCliNom), 30, "%") ;
      lV29TFBarNHdr = GXutil.padr( GXutil.rtrim( AV29TFBarNHdr), 11, "%") ;
      lV52TFBarSer = GXutil.padr( GXutil.rtrim( AV52TFBarSer), 16, "%") ;
      lV58TFBarColNom = GXutil.padr( GXutil.rtrim( AV58TFBarColNom), 13, "%") ;
      lV61TFBarNomCli = GXutil.padr( GXutil.rtrim( AV61TFBarNomCli), 13, "%") ;
      /* Using cursor H00MV22 */
      pr_default.execute(4, new Object[] {AV131EmprCod, Integer.valueOf(AV46TFCliCod), Integer.valueOf(AV47TFCliCod_To), lV26TFCliNom, AV27TFCliNom_Sel, lV29TFBarNHdr, AV30TFBarNHdr_Sel, Short.valueOf(AV49TFBarTipArt), Short.valueOf(AV50TFBarTipArt_To), lV52TFBarSer, AV53TFBarSer_Sel, lV58TFBarColNom, AV59TFBarColNom_Sel, lV61TFBarNomCli, AV62TFBarNomCli_Sel, Integer.valueOf(AV64TFBarColNum), Integer.valueOf(AV65TFBarColNum_To), AV67TFBarFecCli, AV72TFBarKgm, AV73TFBarKgm_To, AV81TFBarMtr, AV82TFBarMtr_To, AV41BarFecSal, AV42BarFecSal_To, Integer.valueOf(AV96CliCod), Integer.valueOf(AV97CliCod_To), AV98BarSer, AV99BarSer_To, AV100BarColNom, AV101BarColNom_To, Integer.valueOf(AV139BarColNum), Integer.valueOf(AV140BarColNum_To), Short.valueOf(AV136BarTipArt), Short.valueOf(AV138BarTipArt_to)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A213BarSit = H00MV22_A213BarSit[0] ;
         A161BarFecSal = H00MV22_A161BarFecSal[0] ;
         A155BarFecCli = H00MV22_A155BarFecCli[0] ;
         A136BarColNum = H00MV22_A136BarColNum[0] ;
         A1234BarNomCli = H00MV22_A1234BarNomCli[0] ;
         A135BarColNom = H00MV22_A135BarColNom[0] ;
         A212BarSer = H00MV22_A212BarSer[0] ;
         A217BarTipArt = H00MV22_A217BarTipArt[0] ;
         n217BarTipArt = H00MV22_n217BarTipArt[0] ;
         A279CliNom = H00MV22_A279CliNom[0] ;
         A252CliCod = H00MV22_A252CliCod[0] ;
         n252CliCod = H00MV22_n252CliCod[0] ;
         A184BarMtr = H00MV22_A184BarMtr[0] ;
         A166BarKgm = H00MV22_A166BarKgm[0] ;
         A130BarCodPar = H00MV22_A130BarCodPar[0] ;
         A132BarCodReo = H00MV22_A132BarCodReo[0] ;
         A129BarCod = H00MV22_A129BarCod[0] ;
         A143BarDisNum = H00MV22_A143BarDisNum[0] ;
         A4812BarEncCli = H00MV22_A4812BarEncCli[0] ;
         A279CliNom = H00MV22_A279CliNom[0] ;
         A184BarMtr = H00MV22_A184BarMtr[0] ;
         A166BarKgm = H00MV22_A166BarKgm[0] ;
         GXt_char21 = A13878PedidoClie ;
         GXv_char22[0] = A396EmprCod ;
         GXv_char20[0] = A4812BarEncCli ;
         GXv_char10[0] = A143BarDisNum ;
         GXv_char6[0] = GXt_char21 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char22, GXv_char20, GXv_char10, GXv_char6) ;
         informemermasdetallado_wc_impl.this.A396EmprCod = GXv_char22[0] ;
         informemermasdetallado_wc_impl.this.A4812BarEncCli = GXv_char20[0] ;
         informemermasdetallado_wc_impl.this.A143BarDisNum = GXv_char10[0] ;
         informemermasdetallado_wc_impl.this.GXt_char21 = GXv_char6[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4812BarEncCli", A4812BarEncCli);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143BarDisNum", A143BarDisNum);
         A13878PedidoClie = GXt_char21 ;
         if ( ! ( (GXutil.strcmp("", AV151TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV150TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV150TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV151TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV151TFPedidoCliente_Sel) == 0 ) ) )
            {
               if ( (GXutil.strcmp("", AV44BarEncCli)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV44BarEncCli) >= 0 ) ) )
               {
                  if ( (GXutil.strcmp("", AV134BarEncCli_to)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV134BarEncCli_to) <= 0 ) ) )
                  {
                     A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                     AV153TotBarKgm = A166BarKgm.add(AV153TotBarKgm) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV153TotBarKgm", GXutil.ltrimstr( AV153TotBarKgm, 18, 2));
                     app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV153TotBarKgm, "ZZZZZ9.99")));
                     AV74KgsExp = DecimalUtil.doubleToDec(0) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavKgsexp_Internalname, GXutil.ltrimstr( AV74KgsExp, 9, 2));
                     AV75Mtsexp = DecimalUtil.doubleToDec(0) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMtsexp_Internalname, GXutil.ltrimstr( AV75Mtsexp, 9, 2));
                     /* Optimized group. */
                     /* Using cursor H00MV23 */
                     pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                     c1261BarAlbKgmE = H00MV23_A1261BarAlbKgmE[0] ;
                     c1263BarAlbMtrE = H00MV23_A1263BarAlbMtrE[0] ;
                     pr_default.close(5);
                     AV74KgsExp = AV74KgsExp.add(c1261BarAlbKgmE) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavKgsexp_Internalname, GXutil.ltrimstr( AV74KgsExp, 9, 2));
                     AV75Mtsexp = AV75Mtsexp.add(c1263BarAlbMtrE) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMtsexp_Internalname, GXutil.ltrimstr( AV75Mtsexp, 9, 2));
                     /* End optimized group. */
                     AV155TotKgsExp = AV74KgsExp.add(AV155TotKgsExp) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV155TotKgsExp", GXutil.ltrimstr( AV155TotKgsExp, 18, 2));
                     app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKGSEXP", getSecureSignedToken( sPrefix, localUtil.format( AV155TotKgsExp, "ZZZZZ9.99")));
                     AV76DifKilos = ((AV74KgsExp.doubleValue()==0) ? DecimalUtil.doubleToDec(0) : (AV74KgsExp.subtract(A166BarKgm))) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifkilos_Internalname, GXutil.ltrimstr( AV76DifKilos, 9, 2));
                     AV157TotDifKilos = AV76DifKilos.add(AV157TotDifKilos) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV157TotDifKilos", GXutil.ltrimstr( AV157TotDifKilos, 18, 2));
                     app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDIFKILOS", getSecureSignedToken( sPrefix, localUtil.format( AV157TotDifKilos, "ZZZZZ9.99")));
                     AV167TotBarMtr = A184BarMtr.add(AV167TotBarMtr) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV167TotBarMtr", GXutil.ltrimstr( AV167TotBarMtr, 18, 2));
                     app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV167TotBarMtr, "ZZZZZ9.99")));
                     AV161TotMtsexp = AV75Mtsexp.add(AV161TotMtsexp) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV161TotMtsexp", GXutil.ltrimstr( AV161TotMtsexp, 18, 2));
                     app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMTSEXP", getSecureSignedToken( sPrefix, localUtil.format( AV161TotMtsexp, "ZZZZZ9.99")));
                     AV78DifMetros = ((AV75Mtsexp.doubleValue()==0) ? DecimalUtil.doubleToDec(0) : (AV75Mtsexp.subtract(A184BarMtr))) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifmetros_Internalname, GXutil.ltrimstr( AV78DifMetros, 9, 2));
                     AV163TotDifMetros = AV78DifMetros.add(AV163TotDifMetros) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV163TotDifMetros", GXutil.ltrimstr( AV163TotDifMetros, 18, 2));
                     app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDIFMETROS", getSecureSignedToken( sPrefix, localUtil.format( AV163TotDifMetros, "ZZZZZ9.99")));
                  }
               }
            }
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
      AV154TotValueBarKgm = localUtil.format( AV153TotBarKgm, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV154TotValueBarKgm", AV154TotValueBarKgm);
      AV156TotValueKgsExp = localUtil.format( AV155TotKgsExp, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV156TotValueKgsExp", AV156TotValueKgsExp);
      AV158TotValueDifKilos = localUtil.format( AV157TotDifKilos, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV158TotValueDifKilos", AV158TotValueDifKilos);
      AV168TotValueBarMtr = localUtil.format( AV167TotBarMtr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV168TotValueBarMtr", AV168TotValueBarMtr);
      AV162TotValueMtsexp = localUtil.format( AV161TotMtsexp, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV162TotValueMtsexp", AV162TotValueMtsexp);
      AV164TotValueDifMetros = localUtil.format( AV163TotDifMetros, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV164TotValueDifMetros", AV164TotValueDifMetros);
   }

   public void S182( )
   {
      /* 'INICIALIZAVARIABLESPARAMETRO' Routine */
      returnInSub = false ;
      AV135ImpCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV135ImpCod", AV135ImpCod);
      AV142PDisCli = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV142PDisCli", AV142PDisCli);
      AV152UDisCli = httpContext.getMessage( "zzzzzzzz", "") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV152UDisCli", AV152UDisCli);
      AV144SoloTotal = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV144SoloTotal", GXutil.str( AV144SoloTotal, 1, 0));
      AV145BarItem1 = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV145BarItem1", AV145BarItem1);
      AV146BarItem3 = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV146BarItem3", AV146BarItem3);
      AV147Barmdlcod1 = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV147Barmdlcod1", AV147Barmdlcod1);
      AV148BarItem5 = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV148BarItem5", AV148BarItem5);
   }

   public void wb_table2_88_MV2( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarkgm_Internalname, httpContext.getMessage( "Tot Value Bar Kgm", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarkgm_Internalname, AV154TotValueBarKgm, GXutil.rtrim( localUtil.format( AV154TotValueBarKgm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,107);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarkgm_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarkgm_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_InformeMermasDetallado_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluekgsexp_Internalname, httpContext.getMessage( "Tot Value Kgs Exp", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluekgsexp_Internalname, AV156TotValueKgsExp, GXutil.rtrim( localUtil.format( AV156TotValueKgsExp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,110);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluekgsexp_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluekgsexp_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_InformeMermasDetallado_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluedifkilos_Internalname, httpContext.getMessage( "Tot Value Dif Kilos", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluedifkilos_Internalname, AV158TotValueDifKilos, GXutil.rtrim( localUtil.format( AV158TotValueDifKilos, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,113);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluedifkilos_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluedifkilos_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_InformeMermasDetallado_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarmtr_Internalname, httpContext.getMessage( "Tot Value Bar Mtr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarmtr_Internalname, AV168TotValueBarMtr, GXutil.rtrim( localUtil.format( AV168TotValueBarMtr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,119);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarmtr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarmtr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_InformeMermasDetallado_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluemtsexp_Internalname, httpContext.getMessage( "Tot Value Mtsexp", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluemtsexp_Internalname, AV162TotValueMtsexp, GXutil.rtrim( localUtil.format( AV162TotValueMtsexp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,122);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluemtsexp_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluemtsexp_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_InformeMermasDetallado_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluedifmetros_Internalname, httpContext.getMessage( "Tot Value Dif Metros", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluedifmetros_Internalname, AV164TotValueDifMetros, GXutil.rtrim( localUtil.format( AV164TotValueDifMetros, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,125);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluedifmetros_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluedifmetros_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_InformeMermasDetallado_WC.htm");
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
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_88_MV2e( true) ;
      }
      else
      {
         wb_table2_88_MV2e( false) ;
      }
   }

   public void wb_table1_31_MV2( boolean wbgen )
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
         wb_table1_31_MV2e( true) ;
      }
      else
      {
         wb_table1_31_MV2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV131EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131EmprCod", AV131EmprCod);
      AV41BarFecSal = (java.util.Date)getParm(obj,1,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41BarFecSal", localUtil.format(AV41BarFecSal, "99/99/99"));
      AV42BarFecSal_To = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42BarFecSal_To", localUtil.format(AV42BarFecSal_To, "99/99/99"));
      AV100BarColNom = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100BarColNom", AV100BarColNom);
      AV101BarColNom_To = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101BarColNom_To", AV101BarColNom_To);
      AV139BarColNum = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV139BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV139BarColNum), 6, 0));
      AV140BarColNum_To = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV140BarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV140BarColNum_To), 6, 0));
      AV98BarSer = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98BarSer", AV98BarSer);
      AV99BarSer_To = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99BarSer_To", AV99BarSer_To);
      AV96CliCod = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV96CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV96CliCod), 6, 0));
      AV97CliCod_To = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97CliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97CliCod_To), 6, 0));
      AV44BarEncCli = (String)getParm(obj,11,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44BarEncCli", AV44BarEncCli);
      AV134BarEncCli_to = (String)getParm(obj,12,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV134BarEncCli_to", AV134BarEncCli_to);
      AV136BarTipArt = ((Number) GXutil.testNumericType( getParm(obj,13,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV136BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV136BarTipArt), 4, 0));
      AV138BarTipArt_to = ((Number) GXutil.testNumericType( getParm(obj,14,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV138BarTipArt_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV138BarTipArt_to), 4, 0));
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
      paMV2( ) ;
      wsMV2( ) ;
      weMV2( ) ;
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
      sCtrlAV131EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV41BarFecSal = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV42BarFecSal_To = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV100BarColNom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV101BarColNom_To = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV139BarColNum = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV140BarColNum_To = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV98BarSer = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV99BarSer_To = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV96CliCod = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV97CliCod_To = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV44BarEncCli = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV134BarEncCli_to = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV136BarTipArt = (String)getParm(obj,13,TypeConstants.STRING) ;
      sCtrlAV138BarTipArt_to = (String)getParm(obj,14,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paMV2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "informemermasdetallado_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paMV2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV131EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131EmprCod", AV131EmprCod);
         AV41BarFecSal = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41BarFecSal", localUtil.format(AV41BarFecSal, "99/99/99"));
         AV42BarFecSal_To = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42BarFecSal_To", localUtil.format(AV42BarFecSal_To, "99/99/99"));
         AV100BarColNom = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100BarColNom", AV100BarColNom);
         AV101BarColNom_To = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101BarColNom_To", AV101BarColNom_To);
         AV139BarColNum = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV139BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV139BarColNum), 6, 0));
         AV140BarColNum_To = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV140BarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV140BarColNum_To), 6, 0));
         AV98BarSer = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98BarSer", AV98BarSer);
         AV99BarSer_To = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99BarSer_To", AV99BarSer_To);
         AV96CliCod = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV96CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV96CliCod), 6, 0));
         AV97CliCod_To = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97CliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97CliCod_To), 6, 0));
         AV44BarEncCli = (String)getParm(obj,13,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44BarEncCli", AV44BarEncCli);
         AV134BarEncCli_to = (String)getParm(obj,14,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV134BarEncCli_to", AV134BarEncCli_to);
         AV136BarTipArt = ((Number) GXutil.testNumericType( getParm(obj,15,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV136BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV136BarTipArt), 4, 0));
         AV138BarTipArt_to = ((Number) GXutil.testNumericType( getParm(obj,16,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV138BarTipArt_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV138BarTipArt_to), 4, 0));
      }
      wcpOAV131EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV131EmprCod") ;
      wcpOAV41BarFecSal = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV41BarFecSal"), 0) ;
      wcpOAV42BarFecSal_To = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV42BarFecSal_To"), 0) ;
      wcpOAV100BarColNom = httpContext.cgiGet( sPrefix+"wcpOAV100BarColNom") ;
      wcpOAV101BarColNom_To = httpContext.cgiGet( sPrefix+"wcpOAV101BarColNom_To") ;
      wcpOAV139BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV139BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV140BarColNum_To = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV140BarColNum_To"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV98BarSer = httpContext.cgiGet( sPrefix+"wcpOAV98BarSer") ;
      wcpOAV99BarSer_To = httpContext.cgiGet( sPrefix+"wcpOAV99BarSer_To") ;
      wcpOAV96CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV96CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV97CliCod_To = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV97CliCod_To"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV44BarEncCli = httpContext.cgiGet( sPrefix+"wcpOAV44BarEncCli") ;
      wcpOAV134BarEncCli_to = httpContext.cgiGet( sPrefix+"wcpOAV134BarEncCli_to") ;
      wcpOAV136BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV136BarTipArt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV138BarTipArt_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV138BarTipArt_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV131EmprCod, wcpOAV131EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV41BarFecSal), GXutil.resetTime(wcpOAV41BarFecSal)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV42BarFecSal_To), GXutil.resetTime(wcpOAV42BarFecSal_To)) ) || ( GXutil.strcmp(AV100BarColNom, wcpOAV100BarColNom) != 0 ) || ( GXutil.strcmp(AV101BarColNom_To, wcpOAV101BarColNom_To) != 0 ) || ( AV139BarColNum != wcpOAV139BarColNum ) || ( AV140BarColNum_To != wcpOAV140BarColNum_To ) || ( GXutil.strcmp(AV98BarSer, wcpOAV98BarSer) != 0 ) || ( GXutil.strcmp(AV99BarSer_To, wcpOAV99BarSer_To) != 0 ) || ( AV96CliCod != wcpOAV96CliCod ) || ( AV97CliCod_To != wcpOAV97CliCod_To ) || ( GXutil.strcmp(AV44BarEncCli, wcpOAV44BarEncCli) != 0 ) || ( GXutil.strcmp(AV134BarEncCli_to, wcpOAV134BarEncCli_to) != 0 ) || ( AV136BarTipArt != wcpOAV136BarTipArt ) || ( AV138BarTipArt_to != wcpOAV138BarTipArt_to ) ) )
      {
         setjustcreated();
      }
      wcpOAV131EmprCod = AV131EmprCod ;
      wcpOAV41BarFecSal = AV41BarFecSal ;
      wcpOAV42BarFecSal_To = AV42BarFecSal_To ;
      wcpOAV100BarColNom = AV100BarColNom ;
      wcpOAV101BarColNom_To = AV101BarColNom_To ;
      wcpOAV139BarColNum = AV139BarColNum ;
      wcpOAV140BarColNum_To = AV140BarColNum_To ;
      wcpOAV98BarSer = AV98BarSer ;
      wcpOAV99BarSer_To = AV99BarSer_To ;
      wcpOAV96CliCod = AV96CliCod ;
      wcpOAV97CliCod_To = AV97CliCod_To ;
      wcpOAV44BarEncCli = AV44BarEncCli ;
      wcpOAV134BarEncCli_to = AV134BarEncCli_to ;
      wcpOAV136BarTipArt = AV136BarTipArt ;
      wcpOAV138BarTipArt_to = AV138BarTipArt_to ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV131EmprCod = httpContext.cgiGet( sPrefix+"AV131EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV131EmprCod) > 0 )
      {
         AV131EmprCod = httpContext.cgiGet( sCtrlAV131EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131EmprCod", AV131EmprCod);
      }
      else
      {
         AV131EmprCod = httpContext.cgiGet( sPrefix+"AV131EmprCod_PARM") ;
      }
      sCtrlAV41BarFecSal = httpContext.cgiGet( sPrefix+"AV41BarFecSal_CTRL") ;
      if ( GXutil.len( sCtrlAV41BarFecSal) > 0 )
      {
         AV41BarFecSal = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV41BarFecSal), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41BarFecSal", localUtil.format(AV41BarFecSal, "99/99/99"));
      }
      else
      {
         AV41BarFecSal = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV41BarFecSal_PARM"), 0) ;
      }
      sCtrlAV42BarFecSal_To = httpContext.cgiGet( sPrefix+"AV42BarFecSal_To_CTRL") ;
      if ( GXutil.len( sCtrlAV42BarFecSal_To) > 0 )
      {
         AV42BarFecSal_To = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV42BarFecSal_To), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42BarFecSal_To", localUtil.format(AV42BarFecSal_To, "99/99/99"));
      }
      else
      {
         AV42BarFecSal_To = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV42BarFecSal_To_PARM"), 0) ;
      }
      sCtrlAV100BarColNom = httpContext.cgiGet( sPrefix+"AV100BarColNom_CTRL") ;
      if ( GXutil.len( sCtrlAV100BarColNom) > 0 )
      {
         AV100BarColNom = httpContext.cgiGet( sCtrlAV100BarColNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100BarColNom", AV100BarColNom);
      }
      else
      {
         AV100BarColNom = httpContext.cgiGet( sPrefix+"AV100BarColNom_PARM") ;
      }
      sCtrlAV101BarColNom_To = httpContext.cgiGet( sPrefix+"AV101BarColNom_To_CTRL") ;
      if ( GXutil.len( sCtrlAV101BarColNom_To) > 0 )
      {
         AV101BarColNom_To = httpContext.cgiGet( sCtrlAV101BarColNom_To) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101BarColNom_To", AV101BarColNom_To);
      }
      else
      {
         AV101BarColNom_To = httpContext.cgiGet( sPrefix+"AV101BarColNom_To_PARM") ;
      }
      sCtrlAV139BarColNum = httpContext.cgiGet( sPrefix+"AV139BarColNum_CTRL") ;
      if ( GXutil.len( sCtrlAV139BarColNum) > 0 )
      {
         AV139BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV139BarColNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV139BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV139BarColNum), 6, 0));
      }
      else
      {
         AV139BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV139BarColNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV140BarColNum_To = httpContext.cgiGet( sPrefix+"AV140BarColNum_To_CTRL") ;
      if ( GXutil.len( sCtrlAV140BarColNum_To) > 0 )
      {
         AV140BarColNum_To = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV140BarColNum_To), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV140BarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV140BarColNum_To), 6, 0));
      }
      else
      {
         AV140BarColNum_To = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV140BarColNum_To_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV98BarSer = httpContext.cgiGet( sPrefix+"AV98BarSer_CTRL") ;
      if ( GXutil.len( sCtrlAV98BarSer) > 0 )
      {
         AV98BarSer = httpContext.cgiGet( sCtrlAV98BarSer) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98BarSer", AV98BarSer);
      }
      else
      {
         AV98BarSer = httpContext.cgiGet( sPrefix+"AV98BarSer_PARM") ;
      }
      sCtrlAV99BarSer_To = httpContext.cgiGet( sPrefix+"AV99BarSer_To_CTRL") ;
      if ( GXutil.len( sCtrlAV99BarSer_To) > 0 )
      {
         AV99BarSer_To = httpContext.cgiGet( sCtrlAV99BarSer_To) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99BarSer_To", AV99BarSer_To);
      }
      else
      {
         AV99BarSer_To = httpContext.cgiGet( sPrefix+"AV99BarSer_To_PARM") ;
      }
      sCtrlAV96CliCod = httpContext.cgiGet( sPrefix+"AV96CliCod_CTRL") ;
      if ( GXutil.len( sCtrlAV96CliCod) > 0 )
      {
         AV96CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV96CliCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV96CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV96CliCod), 6, 0));
      }
      else
      {
         AV96CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV96CliCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV97CliCod_To = httpContext.cgiGet( sPrefix+"AV97CliCod_To_CTRL") ;
      if ( GXutil.len( sCtrlAV97CliCod_To) > 0 )
      {
         AV97CliCod_To = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV97CliCod_To), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97CliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97CliCod_To), 6, 0));
      }
      else
      {
         AV97CliCod_To = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV97CliCod_To_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV44BarEncCli = httpContext.cgiGet( sPrefix+"AV44BarEncCli_CTRL") ;
      if ( GXutil.len( sCtrlAV44BarEncCli) > 0 )
      {
         AV44BarEncCli = httpContext.cgiGet( sCtrlAV44BarEncCli) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44BarEncCli", AV44BarEncCli);
      }
      else
      {
         AV44BarEncCli = httpContext.cgiGet( sPrefix+"AV44BarEncCli_PARM") ;
      }
      sCtrlAV134BarEncCli_to = httpContext.cgiGet( sPrefix+"AV134BarEncCli_to_CTRL") ;
      if ( GXutil.len( sCtrlAV134BarEncCli_to) > 0 )
      {
         AV134BarEncCli_to = httpContext.cgiGet( sCtrlAV134BarEncCli_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV134BarEncCli_to", AV134BarEncCli_to);
      }
      else
      {
         AV134BarEncCli_to = httpContext.cgiGet( sPrefix+"AV134BarEncCli_to_PARM") ;
      }
      sCtrlAV136BarTipArt = httpContext.cgiGet( sPrefix+"AV136BarTipArt_CTRL") ;
      if ( GXutil.len( sCtrlAV136BarTipArt) > 0 )
      {
         AV136BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV136BarTipArt), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV136BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV136BarTipArt), 4, 0));
      }
      else
      {
         AV136BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV136BarTipArt_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV138BarTipArt_to = httpContext.cgiGet( sPrefix+"AV138BarTipArt_to_CTRL") ;
      if ( GXutil.len( sCtrlAV138BarTipArt_to) > 0 )
      {
         AV138BarTipArt_to = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV138BarTipArt_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV138BarTipArt_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV138BarTipArt_to), 4, 0));
      }
      else
      {
         AV138BarTipArt_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV138BarTipArt_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      paMV2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsMV2( ) ;
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
      wsMV2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV131EmprCod_PARM", GXutil.rtrim( AV131EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV131EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV131EmprCod_CTRL", GXutil.rtrim( sCtrlAV131EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41BarFecSal_PARM", localUtil.dtoc( AV41BarFecSal, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV41BarFecSal)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41BarFecSal_CTRL", GXutil.rtrim( sCtrlAV41BarFecSal));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42BarFecSal_To_PARM", localUtil.dtoc( AV42BarFecSal_To, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV42BarFecSal_To)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42BarFecSal_To_CTRL", GXutil.rtrim( sCtrlAV42BarFecSal_To));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV100BarColNom_PARM", GXutil.rtrim( AV100BarColNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV100BarColNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV100BarColNom_CTRL", GXutil.rtrim( sCtrlAV100BarColNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV101BarColNom_To_PARM", GXutil.rtrim( AV101BarColNom_To));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV101BarColNom_To)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV101BarColNom_To_CTRL", GXutil.rtrim( sCtrlAV101BarColNom_To));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV139BarColNum_PARM", GXutil.ltrim( localUtil.ntoc( AV139BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV139BarColNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV139BarColNum_CTRL", GXutil.rtrim( sCtrlAV139BarColNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV140BarColNum_To_PARM", GXutil.ltrim( localUtil.ntoc( AV140BarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV140BarColNum_To)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV140BarColNum_To_CTRL", GXutil.rtrim( sCtrlAV140BarColNum_To));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV98BarSer_PARM", GXutil.rtrim( AV98BarSer));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV98BarSer)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV98BarSer_CTRL", GXutil.rtrim( sCtrlAV98BarSer));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV99BarSer_To_PARM", GXutil.rtrim( AV99BarSer_To));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV99BarSer_To)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV99BarSer_To_CTRL", GXutil.rtrim( sCtrlAV99BarSer_To));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV96CliCod_PARM", GXutil.ltrim( localUtil.ntoc( AV96CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV96CliCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV96CliCod_CTRL", GXutil.rtrim( sCtrlAV96CliCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV97CliCod_To_PARM", GXutil.ltrim( localUtil.ntoc( AV97CliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV97CliCod_To)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV97CliCod_To_CTRL", GXutil.rtrim( sCtrlAV97CliCod_To));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44BarEncCli_PARM", GXutil.rtrim( AV44BarEncCli));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV44BarEncCli)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44BarEncCli_CTRL", GXutil.rtrim( sCtrlAV44BarEncCli));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV134BarEncCli_to_PARM", GXutil.rtrim( AV134BarEncCli_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV134BarEncCli_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV134BarEncCli_to_CTRL", GXutil.rtrim( sCtrlAV134BarEncCli_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV136BarTipArt_PARM", GXutil.ltrim( localUtil.ntoc( AV136BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV136BarTipArt)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV136BarTipArt_CTRL", GXutil.rtrim( sCtrlAV136BarTipArt));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV138BarTipArt_to_PARM", GXutil.ltrim( localUtil.ntoc( AV138BarTipArt_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV138BarTipArt_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV138BarTipArt_to_CTRL", GXutil.rtrim( sCtrlAV138BarTipArt_to));
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
      weMV2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821167041", true, true);
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
      httpContext.AddJavascriptSource("informemermasdetallado_wc.js", "?2026821167042", false, true);
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
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_39_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_39_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_39_idx ;
      edtBarTipArt_Internalname = sPrefix+"BARTIPART_"+sGXsfl_39_idx ;
      edtavTipartdsc_Internalname = sPrefix+"vTIPARTDSC_"+sGXsfl_39_idx ;
      edtPedidoClie_Internalname = sPrefix+"PEDIDOCLIE_"+sGXsfl_39_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_39_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_39_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_39_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_39_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_39_idx ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN_"+sGXsfl_39_idx ;
      edtBarFecSal_Internalname = sPrefix+"BARFECSAL_"+sGXsfl_39_idx ;
      edtBarFecFpr_Internalname = sPrefix+"BARFECFPR_"+sGXsfl_39_idx ;
      edtBarFecCli_Internalname = sPrefix+"BARFECCLI_"+sGXsfl_39_idx ;
      edtBarKgm_Internalname = sPrefix+"BARKGM_"+sGXsfl_39_idx ;
      edtavKgsexp_Internalname = sPrefix+"vKGSEXP_"+sGXsfl_39_idx ;
      edtavDifkilos_Internalname = sPrefix+"vDIFKILOS_"+sGXsfl_39_idx ;
      edtavPorkgs_Internalname = sPrefix+"vPORKGS_"+sGXsfl_39_idx ;
      edtBarAlbKgs_Internalname = sPrefix+"BARALBKGS_"+sGXsfl_39_idx ;
      chkBarAccesor.setInternalname( sPrefix+"BARACCESOR_"+sGXsfl_39_idx );
      edtBarMtr_Internalname = sPrefix+"BARMTR_"+sGXsfl_39_idx ;
      edtavMtsexp_Internalname = sPrefix+"vMTSEXP_"+sGXsfl_39_idx ;
      edtavDifmetros_Internalname = sPrefix+"vDIFMETROS_"+sGXsfl_39_idx ;
      edtavPormts_Internalname = sPrefix+"vPORMTS_"+sGXsfl_39_idx ;
      edtBarAlbMts_Internalname = sPrefix+"BARALBMTS_"+sGXsfl_39_idx ;
      edtBarTipColD_Internalname = sPrefix+"BARTIPCOLD_"+sGXsfl_39_idx ;
      edtKilosEntre_Internalname = sPrefix+"KILOSENTRE_"+sGXsfl_39_idx ;
      edtMetrosEntr_Internalname = sPrefix+"METROSENTR_"+sGXsfl_39_idx ;
      edtKilosPendi_Internalname = sPrefix+"KILOSPENDI_"+sGXsfl_39_idx ;
      edtMetrosPend_Internalname = sPrefix+"METROSPEND_"+sGXsfl_39_idx ;
      edtBarHDSusp_Internalname = sPrefix+"BARHDSUSP_"+sGXsfl_39_idx ;
      edtBarNorma_Internalname = sPrefix+"BARNORMA_"+sGXsfl_39_idx ;
      edtBarMatColo_Internalname = sPrefix+"BARMATCOLO_"+sGXsfl_39_idx ;
      edtBarOEKOTEX_Internalname = sPrefix+"BAROEKOTEX_"+sGXsfl_39_idx ;
      edtBarFecEnE_Internalname = sPrefix+"BARFECENE_"+sGXsfl_39_idx ;
      edtBarIntColo_Internalname = sPrefix+"BARINTCOLO_"+sGXsfl_39_idx ;
      edtBarLocTel_Internalname = sPrefix+"BARLOCTEL_"+sGXsfl_39_idx ;
      edtBarSerDsc2_Internalname = sPrefix+"BARSERDSC2_"+sGXsfl_39_idx ;
      edtBarIdtx2_Internalname = sPrefix+"BARIDTX2_"+sGXsfl_39_idx ;
      edtBarIdtxDc_Internalname = sPrefix+"BARIDTXDC_"+sGXsfl_39_idx ;
      edtBarColCv_Internalname = sPrefix+"BARCOLCV_"+sGXsfl_39_idx ;
      edtBarAlbUlti_Internalname = sPrefix+"BARALBULTI_"+sGXsfl_39_idx ;
      edtBarCuadern_Internalname = sPrefix+"BARCUADERN_"+sGXsfl_39_idx ;
      edtBarNormas_Internalname = sPrefix+"BARNORMAS_"+sGXsfl_39_idx ;
      edtBarAlbFact_Internalname = sPrefix+"BARALBFACT_"+sGXsfl_39_idx ;
   }

   public void subsflControlProps_fel_392( )
   {
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_39_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_39_fel_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_39_fel_idx ;
      edtBarTipArt_Internalname = sPrefix+"BARTIPART_"+sGXsfl_39_fel_idx ;
      edtavTipartdsc_Internalname = sPrefix+"vTIPARTDSC_"+sGXsfl_39_fel_idx ;
      edtPedidoClie_Internalname = sPrefix+"PEDIDOCLIE_"+sGXsfl_39_fel_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_39_fel_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_39_fel_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_39_fel_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_39_fel_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_39_fel_idx ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN_"+sGXsfl_39_fel_idx ;
      edtBarFecSal_Internalname = sPrefix+"BARFECSAL_"+sGXsfl_39_fel_idx ;
      edtBarFecFpr_Internalname = sPrefix+"BARFECFPR_"+sGXsfl_39_fel_idx ;
      edtBarFecCli_Internalname = sPrefix+"BARFECCLI_"+sGXsfl_39_fel_idx ;
      edtBarKgm_Internalname = sPrefix+"BARKGM_"+sGXsfl_39_fel_idx ;
      edtavKgsexp_Internalname = sPrefix+"vKGSEXP_"+sGXsfl_39_fel_idx ;
      edtavDifkilos_Internalname = sPrefix+"vDIFKILOS_"+sGXsfl_39_fel_idx ;
      edtavPorkgs_Internalname = sPrefix+"vPORKGS_"+sGXsfl_39_fel_idx ;
      edtBarAlbKgs_Internalname = sPrefix+"BARALBKGS_"+sGXsfl_39_fel_idx ;
      chkBarAccesor.setInternalname( sPrefix+"BARACCESOR_"+sGXsfl_39_fel_idx );
      edtBarMtr_Internalname = sPrefix+"BARMTR_"+sGXsfl_39_fel_idx ;
      edtavMtsexp_Internalname = sPrefix+"vMTSEXP_"+sGXsfl_39_fel_idx ;
      edtavDifmetros_Internalname = sPrefix+"vDIFMETROS_"+sGXsfl_39_fel_idx ;
      edtavPormts_Internalname = sPrefix+"vPORMTS_"+sGXsfl_39_fel_idx ;
      edtBarAlbMts_Internalname = sPrefix+"BARALBMTS_"+sGXsfl_39_fel_idx ;
      edtBarTipColD_Internalname = sPrefix+"BARTIPCOLD_"+sGXsfl_39_fel_idx ;
      edtKilosEntre_Internalname = sPrefix+"KILOSENTRE_"+sGXsfl_39_fel_idx ;
      edtMetrosEntr_Internalname = sPrefix+"METROSENTR_"+sGXsfl_39_fel_idx ;
      edtKilosPendi_Internalname = sPrefix+"KILOSPENDI_"+sGXsfl_39_fel_idx ;
      edtMetrosPend_Internalname = sPrefix+"METROSPEND_"+sGXsfl_39_fel_idx ;
      edtBarHDSusp_Internalname = sPrefix+"BARHDSUSP_"+sGXsfl_39_fel_idx ;
      edtBarNorma_Internalname = sPrefix+"BARNORMA_"+sGXsfl_39_fel_idx ;
      edtBarMatColo_Internalname = sPrefix+"BARMATCOLO_"+sGXsfl_39_fel_idx ;
      edtBarOEKOTEX_Internalname = sPrefix+"BAROEKOTEX_"+sGXsfl_39_fel_idx ;
      edtBarFecEnE_Internalname = sPrefix+"BARFECENE_"+sGXsfl_39_fel_idx ;
      edtBarIntColo_Internalname = sPrefix+"BARINTCOLO_"+sGXsfl_39_fel_idx ;
      edtBarLocTel_Internalname = sPrefix+"BARLOCTEL_"+sGXsfl_39_fel_idx ;
      edtBarSerDsc2_Internalname = sPrefix+"BARSERDSC2_"+sGXsfl_39_fel_idx ;
      edtBarIdtx2_Internalname = sPrefix+"BARIDTX2_"+sGXsfl_39_fel_idx ;
      edtBarIdtxDc_Internalname = sPrefix+"BARIDTXDC_"+sGXsfl_39_fel_idx ;
      edtBarColCv_Internalname = sPrefix+"BARCOLCV_"+sGXsfl_39_fel_idx ;
      edtBarAlbUlti_Internalname = sPrefix+"BARALBULTI_"+sGXsfl_39_fel_idx ;
      edtBarCuadern_Internalname = sPrefix+"BARCUADERN_"+sGXsfl_39_fel_idx ;
      edtBarNormas_Internalname = sPrefix+"BARNORMAS_"+sGXsfl_39_fel_idx ;
      edtBarAlbFact_Internalname = sPrefix+"BARALBFACT_"+sGXsfl_39_fel_idx ;
   }

   public void sendrow_392( )
   {
      subsflControlProps_392( ) ;
      wbMV0( ) ;
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarTipArt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipArt_Internalname,GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A217BarTipArt), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTipArt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarTipArt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavTipartdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTipartdsc_Internalname,GXutil.rtrim( AV43TipArtDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTipartdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavTipartdsc_Visible),Integer.valueOf(edtavTipartdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPedidoClie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedidoClie_Internalname,GXutil.rtrim( A13878PedidoClie),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPedidoClie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPedidoClie_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNomCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNomCli_Internalname,GXutil.rtrim( A1234BarNomCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarNomCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecGen_Internalname,localUtil.format(A159BarFecGen, "99/99/99"),localUtil.format( A159BarFecGen, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecGen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecSal_Internalname,localUtil.format(A161BarFecSal, "99/99/99"),localUtil.format( A161BarFecSal, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecFpr_Internalname,localUtil.format(A158BarFecFpr, "99/99/99"),localUtil.format( A158BarFecFpr, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecFpr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecCli_Internalname,localUtil.format(A155BarFecCli, "99/99/99"),localUtil.format( A155BarFecCli, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFecCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarKgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarKgm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavKgsexp_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavKgsexp_Internalname,GXutil.ltrim( localUtil.ntoc( AV74KgsExp, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavKgsexp_Enabled!=0) ? localUtil.format( AV74KgsExp, "ZZZZZ9.99") : localUtil.format( AV74KgsExp, "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavKgsexp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavKgsexp_Visible),Integer.valueOf(edtavKgsexp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDifkilos_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDifkilos_Internalname,GXutil.ltrim( localUtil.ntoc( AV76DifKilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDifkilos_Enabled!=0) ? localUtil.format( AV76DifKilos, "ZZZZZ9.99") : localUtil.format( AV76DifKilos, "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDifkilos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDifkilos_Visible),Integer.valueOf(edtavDifkilos_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPorkgs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPorkgs_Internalname,GXutil.ltrim( localUtil.ntoc( AV77PorKgs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPorkgs_Enabled!=0) ? localUtil.format( AV77PorKgs, "ZZ9.99") : localUtil.format( AV77PorKgs, "ZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPorkgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPorkgs_Visible),Integer.valueOf(edtavPorkgs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbKgs_Internalname,GXutil.ltrim( localUtil.ntoc( A13932BarAlbKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13932BarAlbKgs, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbKgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "BARACCESOR_" + sGXsfl_39_idx ;
         chkBarAccesor.setName( GXCCtl );
         chkBarAccesor.setWebtags( "" );
         chkBarAccesor.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkBarAccesor.getInternalname(), "TitleCaption", chkBarAccesor.getCaption(), !bGXsfl_39_Refreshing);
         chkBarAccesor.setCheckedValue( "N" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkBarAccesor.getInternalname(),A13860BarAccesor,"","",Integer.valueOf(0),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn hidden-xs","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarMtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A184BarMtr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarMtr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavMtsexp_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMtsexp_Internalname,GXutil.ltrim( localUtil.ntoc( AV75Mtsexp, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavMtsexp_Enabled!=0) ? localUtil.format( AV75Mtsexp, "ZZZZZ9.99") : localUtil.format( AV75Mtsexp, "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMtsexp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavMtsexp_Visible),Integer.valueOf(edtavMtsexp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDifmetros_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDifmetros_Internalname,GXutil.ltrim( localUtil.ntoc( AV78DifMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDifmetros_Enabled!=0) ? localUtil.format( AV78DifMetros, "ZZZZZ9.99") : localUtil.format( AV78DifMetros, "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDifmetros_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDifmetros_Visible),Integer.valueOf(edtavDifmetros_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPormts_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPormts_Internalname,GXutil.ltrim( localUtil.ntoc( AV79PorMts, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPormts_Enabled!=0) ? localUtil.format( AV79PorMts, "ZZ9.99") : localUtil.format( AV79PorMts, "ZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPormts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPormts_Visible),Integer.valueOf(edtavPormts_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbMts_Internalname,GXutil.ltrim( localUtil.ntoc( A13931BarAlbMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13931BarAlbMts, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbMts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipColD_Internalname,GXutil.rtrim( A13868BarTipColD),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTipColD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtKilosEntre_Internalname,GXutil.ltrim( localUtil.ntoc( A13887KilosEntre, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13887KilosEntre, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtKilosEntre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetrosEntr_Internalname,GXutil.ltrim( localUtil.ntoc( A13888MetrosEntr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13888MetrosEntr), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetrosEntr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtKilosPendi_Internalname,GXutil.ltrim( localUtil.ntoc( A13885KilosPendi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13885KilosPendi, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtKilosPendi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetrosPend_Internalname,GXutil.ltrim( localUtil.ntoc( A13886MetrosPend, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13886MetrosPend, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetrosPend_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarHDSusp_Internalname,GXutil.ltrim( localUtil.ntoc( A13890BarHDSusp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13890BarHDSusp), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarHDSusp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNorma_Internalname,GXutil.rtrim( A13902BarNorma),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNorma_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMatColo_Internalname,GXutil.ltrim( localUtil.ntoc( A13903BarMatColo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13903BarMatColo), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarMatColo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarOEKOTEX_Internalname,GXutil.rtrim( A12881BarOEKOTEX),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarOEKOTEX_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecEnE_Internalname,localUtil.format(A2447BarFecEnE, "99/99/99"),localUtil.format( A2447BarFecEnE, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecEnE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarIntColo_Internalname,GXutil.ltrim( localUtil.ntoc( A13904BarIntColo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13904BarIntColo), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarIntColo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarLocTel_Internalname,GXutil.rtrim( A12809BarLocTel),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarLocTel_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc2_Internalname,A13907BarSerDsc2,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarIdtx2_Internalname,GXutil.rtrim( A13908BarIdtx2),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarIdtx2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarIdtxDc_Internalname,GXutil.rtrim( A13909BarIdtxDc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarIdtxDc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColCv_Internalname,GXutil.rtrim( A13910BarColCv),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColCv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbUlti_Internalname,GXutil.ltrim( localUtil.ntoc( A13930BarAlbUlti, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13930BarAlbUlti), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbUlti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCuadern_Internalname,GXutil.rtrim( A13933BarCuadern),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCuadern_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNormas_Internalname,A13934BarNormas,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNormas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbFact_Internalname,GXutil.ltrim( localUtil.ntoc( A13935BarAlbFact, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13935BarAlbFact), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbFact_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesMV2( ) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cod. Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nom. Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "O.S. - R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarTipArt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavTipartdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPedidoClie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Enc Cli", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cod. Cor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNomCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cor Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Data", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarKgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Qgs. Entrado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavKgsexp_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Qgs. Saidos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDifkilos_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Qgs. Difer", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPorkgs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Qgs. %", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarMtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts. Entrado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavMtsexp_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts. Saidos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDifmetros_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts. Difer", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPormts_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts. %", "")) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarTipArt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV43TipArtDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTipartdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavTipartdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13878PedidoClie));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPedidoClie_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1652BarSerDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A135BarColNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1234BarNomCli));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNomCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A159BarFecGen, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A161BarFecSal, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A158BarFecFpr, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A155BarFecCli, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarKgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV74KgsExp, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavKgsexp_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavKgsexp_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV76DifKilos, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDifkilos_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDifkilos_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV77PorKgs, (byte)(6), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPorkgs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPorkgs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13932BarAlbKgs, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13860BarAccesor));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarMtr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV75Mtsexp, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMtsexp_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavMtsexp_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV78DifMetros, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDifmetros_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDifmetros_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV79PorMts, (byte)(6), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPormts_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPormts_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13931BarAlbMts, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13868BarTipColD));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13887KilosEntre, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13888MetrosEntr, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13885KilosPendi, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13886MetrosPend, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13890BarHDSusp, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13902BarNorma));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13903BarMatColo, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A12881BarOEKOTEX));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A2447BarFecEnE, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13904BarIntColo, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A12809BarLocTel));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A13907BarSerDsc2);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13908BarIdtx2));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13909BarIdtxDc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13910BarColCv));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13930BarAlbUlti, (byte)(10), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13933BarCuadern));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A13934BarNormas);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13935BarAlbFact, (byte)(8), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR" ;
      edtBarTipArt_Internalname = sPrefix+"BARTIPART" ;
      edtavTipartdsc_Internalname = sPrefix+"vTIPARTDSC" ;
      edtPedidoClie_Internalname = sPrefix+"PEDIDOCLIE" ;
      edtBarSer_Internalname = sPrefix+"BARSER" ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC" ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM" ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI" ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM" ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN" ;
      edtBarFecSal_Internalname = sPrefix+"BARFECSAL" ;
      edtBarFecFpr_Internalname = sPrefix+"BARFECFPR" ;
      edtBarFecCli_Internalname = sPrefix+"BARFECCLI" ;
      edtBarKgm_Internalname = sPrefix+"BARKGM" ;
      edtavKgsexp_Internalname = sPrefix+"vKGSEXP" ;
      edtavDifkilos_Internalname = sPrefix+"vDIFKILOS" ;
      edtavPorkgs_Internalname = sPrefix+"vPORKGS" ;
      edtBarAlbKgs_Internalname = sPrefix+"BARALBKGS" ;
      chkBarAccesor.setInternalname( sPrefix+"BARACCESOR" );
      edtBarMtr_Internalname = sPrefix+"BARMTR" ;
      edtavMtsexp_Internalname = sPrefix+"vMTSEXP" ;
      edtavDifmetros_Internalname = sPrefix+"vDIFMETROS" ;
      edtavPormts_Internalname = sPrefix+"vPORMTS" ;
      edtBarAlbMts_Internalname = sPrefix+"BARALBMTS" ;
      edtBarTipColD_Internalname = sPrefix+"BARTIPCOLD" ;
      edtKilosEntre_Internalname = sPrefix+"KILOSENTRE" ;
      edtMetrosEntr_Internalname = sPrefix+"METROSENTR" ;
      edtKilosPendi_Internalname = sPrefix+"KILOSPENDI" ;
      edtMetrosPend_Internalname = sPrefix+"METROSPEND" ;
      edtBarHDSusp_Internalname = sPrefix+"BARHDSUSP" ;
      edtBarNorma_Internalname = sPrefix+"BARNORMA" ;
      edtBarMatColo_Internalname = sPrefix+"BARMATCOLO" ;
      edtBarOEKOTEX_Internalname = sPrefix+"BAROEKOTEX" ;
      edtBarFecEnE_Internalname = sPrefix+"BARFECENE" ;
      edtBarIntColo_Internalname = sPrefix+"BARINTCOLO" ;
      edtBarLocTel_Internalname = sPrefix+"BARLOCTEL" ;
      edtBarSerDsc2_Internalname = sPrefix+"BARSERDSC2" ;
      edtBarIdtx2_Internalname = sPrefix+"BARIDTX2" ;
      edtBarIdtxDc_Internalname = sPrefix+"BARIDTXDC" ;
      edtBarColCv_Internalname = sPrefix+"BARCOLCV" ;
      edtBarAlbUlti_Internalname = sPrefix+"BARALBULTI" ;
      edtBarCuadern_Internalname = sPrefix+"BARCUADERN" ;
      edtBarNormas_Internalname = sPrefix+"BARNORMAS" ;
      edtBarAlbFact_Internalname = sPrefix+"BARALBFACT" ;
      edtavTotvaluebarkgm_Internalname = sPrefix+"vTOTVALUEBARKGM" ;
      edtavTotvaluekgsexp_Internalname = sPrefix+"vTOTVALUEKGSEXP" ;
      edtavTotvaluedifkilos_Internalname = sPrefix+"vTOTVALUEDIFKILOS" ;
      edtavTotvaluebarmtr_Internalname = sPrefix+"vTOTVALUEBARMTR" ;
      edtavTotvaluemtsexp_Internalname = sPrefix+"vTOTVALUEMTSEXP" ;
      edtavTotvaluedifmetros_Internalname = sPrefix+"vTOTVALUEDIFMETROS" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Innewwindow1_Internalname = sPrefix+"INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_barfeccliauxdate_Internalname = sPrefix+"vDDO_BARFECCLIAUXDATE" ;
      divDdo_barfeccliauxdates_Internalname = sPrefix+"DDO_BARFECCLIAUXDATES" ;
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
      edtBarAlbFact_Jsonclick = "" ;
      edtBarNormas_Jsonclick = "" ;
      edtBarCuadern_Jsonclick = "" ;
      edtBarAlbUlti_Jsonclick = "" ;
      edtBarColCv_Jsonclick = "" ;
      edtBarIdtxDc_Jsonclick = "" ;
      edtBarIdtx2_Jsonclick = "" ;
      edtBarSerDsc2_Jsonclick = "" ;
      edtBarLocTel_Jsonclick = "" ;
      edtBarIntColo_Jsonclick = "" ;
      edtBarFecEnE_Jsonclick = "" ;
      edtBarOEKOTEX_Jsonclick = "" ;
      edtBarMatColo_Jsonclick = "" ;
      edtBarNorma_Jsonclick = "" ;
      edtBarHDSusp_Jsonclick = "" ;
      edtMetrosPend_Jsonclick = "" ;
      edtKilosPendi_Jsonclick = "" ;
      edtMetrosEntr_Jsonclick = "" ;
      edtKilosEntre_Jsonclick = "" ;
      edtBarTipColD_Jsonclick = "" ;
      edtBarAlbMts_Jsonclick = "" ;
      edtavPormts_Jsonclick = "" ;
      edtavPormts_Enabled = 0 ;
      edtavDifmetros_Jsonclick = "" ;
      edtavDifmetros_Enabled = 0 ;
      edtavMtsexp_Jsonclick = "" ;
      edtavMtsexp_Enabled = 0 ;
      edtBarMtr_Jsonclick = "" ;
      chkBarAccesor.setCaption( "" );
      edtBarAlbKgs_Jsonclick = "" ;
      edtavPorkgs_Jsonclick = "" ;
      edtavPorkgs_Enabled = 0 ;
      edtavDifkilos_Jsonclick = "" ;
      edtavDifkilos_Enabled = 0 ;
      edtavKgsexp_Jsonclick = "" ;
      edtavKgsexp_Enabled = 0 ;
      edtBarKgm_Jsonclick = "" ;
      edtBarFecCli_Jsonclick = "" ;
      edtBarFecFpr_Jsonclick = "" ;
      edtBarFecSal_Jsonclick = "" ;
      edtBarFecGen_Jsonclick = "" ;
      edtBarColNum_Jsonclick = "" ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtPedidoClie_Jsonclick = "" ;
      edtavTipartdsc_Jsonclick = "" ;
      edtavTipartdsc_Enabled = 0 ;
      edtBarTipArt_Jsonclick = "" ;
      edtBarNHdr_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvaluedifmetros_Jsonclick = "" ;
      edtavTotvaluedifmetros_Enabled = 1 ;
      edtavTotvaluemtsexp_Jsonclick = "" ;
      edtavTotvaluemtsexp_Enabled = 1 ;
      edtavTotvaluebarmtr_Jsonclick = "" ;
      edtavTotvaluebarmtr_Enabled = 1 ;
      edtavTotvaluedifkilos_Jsonclick = "" ;
      edtavTotvaluedifkilos_Enabled = 1 ;
      edtavTotvaluekgsexp_Jsonclick = "" ;
      edtavTotvaluekgsexp_Enabled = 1 ;
      edtavTotvaluebarkgm_Jsonclick = "" ;
      edtavTotvaluebarkgm_Enabled = 1 ;
      edtavPormts_Visible = -1 ;
      edtavDifmetros_Visible = -1 ;
      edtavMtsexp_Visible = -1 ;
      edtBarMtr_Visible = -1 ;
      edtavPorkgs_Visible = -1 ;
      edtavDifkilos_Visible = -1 ;
      edtavKgsexp_Visible = -1 ;
      edtBarKgm_Visible = -1 ;
      edtBarFecCli_Visible = -1 ;
      edtBarColNum_Visible = -1 ;
      edtBarNomCli_Visible = -1 ;
      edtBarColNom_Visible = -1 ;
      edtBarSer_Visible = -1 ;
      edtPedidoClie_Visible = -1 ;
      edtavTipartdsc_Visible = -1 ;
      edtBarTipArt_Visible = -1 ;
      edtBarNHdr_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_barfeccliauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Visible = 1 ;
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
      Ddo_grid_Datalistproc = "InformeMermasDetallado_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|||Dynamic|Dynamic|Dynamic|Dynamic||||||||||" ;
      Ddo_grid_Includedatalist = "|T|T|||T|T|T|T||||||||||" ;
      Ddo_grid_Filterisrange = "T|||T||||||T||T||||T|||" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Numeric||Character|Character|Character|Character|Numeric|Date|Numeric||||Numeric|||" ;
      Ddo_grid_Includefilter = "T|T|T|T||T|T|T|T|T|T|T||||T|||" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T||T|||T|T|T|T|T||||||||" ;
      Ddo_grid_Columnssortvalues = "1|2||3|||4|5|6|7|8||||||||" ;
      Ddo_grid_Columnids = "0:CliCod|1:CliNom|2:BarNHdr|3:BarTipArt|4:TipArtDsc|5:PedidoCliente|6:BarSer|8:BarColNom|9:BarNomCli|10:BarColNum|14:BarFecCli|15:BarKgm|16:KgsExp|17:DifKilos|18:PorKgs|21:BarMtr|22:Mtsexp|23:DifMetros|24:PorMts" ;
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
      GXCCtl = "BARACCESOR_" + sGXsfl_39_idx ;
      chkBarAccesor.setName( GXCCtl );
      chkBarAccesor.setWebtags( "" );
      chkBarAccesor.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkBarAccesor.getInternalname(), "TitleCaption", chkBarAccesor.getCaption(), !bGXsfl_39_Refreshing);
      chkBarAccesor.setCheckedValue( "N" );
      /* End function init_web_controls */
   }

   public void valid_Clicod( )
   {
      n252CliCod = false ;
      n13904BarIntColo = false ;
      n13903BarMatColo = false ;
      /* Using cursor H00MV24 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_inex", new Object[] {"CLIENT"}), 1, "CLICOD");
      }
      A279CliNom = H00MV24_A279CliNom[0] ;
      pr_default.close(6);
      /* Using cursor H00MV25 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A212BarSer, A135BarColNom, Integer.valueOf(A136BarColNum), Byte.valueOf(A218BarTipCol)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_inex", new Object[] {"CFORMU"}), 1, "BARTIPCOL");
      }
      A13904BarIntColo = H00MV25_A13904BarIntColo[0] ;
      n13904BarIntColo = H00MV25_n13904BarIntColo[0] ;
      A13903BarMatColo = H00MV25_A13903BarMatColo[0] ;
      n13903BarMatColo = H00MV25_n13903BarMatColo[0] ;
      pr_default.close(7);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13904BarIntColo", GXutil.ltrim( localUtil.ntoc( A13904BarIntColo, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13903BarMatColo", GXutil.ltrim( localUtil.ntoc( A13903BarMatColo, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Baridtx2( )
   {
      n13908BarIdtx2 = false ;
      n13909BarIdtxDc = false ;
      /* Using cursor H00MV26 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n13908BarIdtx2), A13908BarIdtx2});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_inex", new Object[] {"INDITEX"}), 1, "BARIDTX2");
      }
      A13909BarIdtxDc = H00MV26_A13909BarIdtxDc[0] ;
      n13909BarIdtxDc = H00MV26_n13909BarIdtxDc[0] ;
      pr_default.close(8);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13909BarIdtxDc", GXutil.rtrim( A13909BarIdtxDc));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV42BarFecSal_To',fld:'vBARFECSAL_TO',pic:''},{av:'AV100BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV101BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV139BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV140BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV98BarSer',fld:'vBARSER',pic:''},{av:'AV99BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV96CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV97CliCod_To',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV44BarEncCli',fld:'vBARENCCLI',pic:''},{av:'AV134BarEncCli_to',fld:'vBARENCCLI_TO',pic:''},{av:'AV136BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV138BarTipArt_to',fld:'vBARTIPART_TO',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV185Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV47TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV26TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV27TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV29TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV30TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV49TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV50TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV150TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV151TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV52TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV53TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV58TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV59TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV61TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV62TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV64TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV65TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV67TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV72TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV73TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV81TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV82TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV131EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV153TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV155TotKgsExp',fld:'vTOTKGSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV157TotDifKilos',fld:'vTOTDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV167TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV161TotMtsexp',fld:'vTOTMTSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV163TotDifMetros',fld:'vTOTDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarTipArt_Visible',ctrl:'BARTIPART',prop:'Visible'},{av:'edtavTipartdsc_Visible',ctrl:'vTIPARTDSC',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtavKgsexp_Visible',ctrl:'vKGSEXP',prop:'Visible'},{av:'edtavDifkilos_Visible',ctrl:'vDIFKILOS',prop:'Visible'},{av:'edtavPorkgs_Visible',ctrl:'vPORKGS',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtavMtsexp_Visible',ctrl:'vMTSEXP',prop:'Visible'},{av:'edtavDifmetros_Visible',ctrl:'vDIFMETROS',prop:'Visible'},{av:'edtavPormts_Visible',ctrl:'vPORMTS',prop:'Visible'},{av:'AV39GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV40GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV153TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV155TotKgsExp',fld:'vTOTKGSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV157TotDifKilos',fld:'vTOTDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV167TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV161TotMtsexp',fld:'vTOTMTSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV163TotDifMetros',fld:'vTOTDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV74KgsExp',fld:'vKGSEXP',pic:'ZZZZZ9.99'},{av:'AV75Mtsexp',fld:'vMTSEXP',pic:'ZZZZZ9.99'},{av:'AV76DifKilos',fld:'vDIFKILOS',pic:'ZZZZZ9.99'},{av:'AV78DifMetros',fld:'vDIFMETROS',pic:'ZZZZZ9.99'},{av:'AV154TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV156TotValueKgsExp',fld:'vTOTVALUEKGSEXP',pic:''},{av:'AV158TotValueDifKilos',fld:'vTOTVALUEDIFKILOS',pic:''},{av:'AV168TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''},{av:'AV162TotValueMtsexp',fld:'vTOTVALUEMTSEXP',pic:''},{av:'AV164TotValueDifMetros',fld:'vTOTVALUEDIFMETROS',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12MV2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV42BarFecSal_To',fld:'vBARFECSAL_TO',pic:''},{av:'AV100BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV101BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV139BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV140BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV98BarSer',fld:'vBARSER',pic:''},{av:'AV99BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV96CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV97CliCod_To',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV44BarEncCli',fld:'vBARENCCLI',pic:''},{av:'AV134BarEncCli_to',fld:'vBARENCCLI_TO',pic:''},{av:'AV136BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV138BarTipArt_to',fld:'vBARTIPART_TO',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV185Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV47TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV26TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV27TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV29TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV30TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV49TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV50TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV150TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV151TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV52TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV53TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV58TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV59TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV61TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV62TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV64TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV65TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV67TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV72TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV73TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV81TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV82TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV131EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV153TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV155TotKgsExp',fld:'vTOTKGSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV157TotDifKilos',fld:'vTOTDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV167TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV161TotMtsexp',fld:'vTOTMTSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV163TotDifMetros',fld:'vTOTDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13MV2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV42BarFecSal_To',fld:'vBARFECSAL_TO',pic:''},{av:'AV100BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV101BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV139BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV140BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV98BarSer',fld:'vBARSER',pic:''},{av:'AV99BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV96CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV97CliCod_To',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV44BarEncCli',fld:'vBARENCCLI',pic:''},{av:'AV134BarEncCli_to',fld:'vBARENCCLI_TO',pic:''},{av:'AV136BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV138BarTipArt_to',fld:'vBARTIPART_TO',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV185Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV47TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV26TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV27TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV29TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV30TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV49TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV50TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV150TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV151TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV52TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV53TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV58TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV59TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV61TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV62TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV64TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV65TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV67TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV72TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV73TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV81TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV82TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV131EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV153TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV155TotKgsExp',fld:'vTOTKGSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV157TotDifKilos',fld:'vTOTDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV167TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV161TotMtsexp',fld:'vTOTMTSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV163TotDifMetros',fld:'vTOTDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14MV2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV42BarFecSal_To',fld:'vBARFECSAL_TO',pic:''},{av:'AV100BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV101BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV139BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV140BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV98BarSer',fld:'vBARSER',pic:''},{av:'AV99BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV96CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV97CliCod_To',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV44BarEncCli',fld:'vBARENCCLI',pic:''},{av:'AV134BarEncCli_to',fld:'vBARENCCLI_TO',pic:''},{av:'AV136BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV138BarTipArt_to',fld:'vBARTIPART_TO',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV185Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV47TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV26TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV27TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV29TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV30TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV49TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV50TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV150TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV151TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV52TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV53TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV58TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV59TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV61TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV62TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV64TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV65TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV67TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV72TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV73TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV81TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV82TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV131EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV153TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV155TotKgsExp',fld:'vTOTKGSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV157TotDifKilos',fld:'vTOTDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV167TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV161TotMtsexp',fld:'vTOTMTSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV163TotDifMetros',fld:'vTOTDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV81TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV82TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV72TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV73TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV67TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV64TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV65TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV61TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV62TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV58TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV59TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV52TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV53TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV150TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV151TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV49TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV50TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV29TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV30TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV26TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV27TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV46TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV47TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e20MV2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'AV151TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV150TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV44BarEncCli',fld:'vBARENCCLI',pic:''},{av:'AV134BarEncCli_to',fld:'vBARENCCLI_TO',pic:''},{av:'AV26TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV27TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV72TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV73TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV81TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV82TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV43TipArtDsc',fld:'vTIPARTDSC',pic:''},{av:'AV74KgsExp',fld:'vKGSEXP',pic:'ZZZZZ9.99'},{av:'AV75Mtsexp',fld:'vMTSEXP',pic:'ZZZZZ9.99'},{av:'AV76DifKilos',fld:'vDIFKILOS',pic:'ZZZZZ9.99'},{av:'AV77PorKgs',fld:'vPORKGS',pic:'ZZ9.99'},{av:'AV78DifMetros',fld:'vDIFMETROS',pic:'ZZZZZ9.99'},{av:'AV79PorMts',fld:'vPORMTS',pic:'ZZ9.99'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e15MV2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV42BarFecSal_To',fld:'vBARFECSAL_TO',pic:''},{av:'AV100BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV101BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV139BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV140BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV98BarSer',fld:'vBARSER',pic:''},{av:'AV99BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV96CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV97CliCod_To',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV44BarEncCli',fld:'vBARENCCLI',pic:''},{av:'AV134BarEncCli_to',fld:'vBARENCCLI_TO',pic:''},{av:'AV136BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV138BarTipArt_to',fld:'vBARTIPART_TO',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV185Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV47TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV26TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV27TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV29TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV30TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV49TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV50TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV150TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV151TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV52TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV53TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV58TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV59TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV61TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV62TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV64TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV65TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV67TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV72TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV73TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV81TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV82TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV131EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV153TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV155TotKgsExp',fld:'vTOTKGSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV157TotDifKilos',fld:'vTOTDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV167TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV161TotMtsexp',fld:'vTOTMTSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV163TotDifMetros',fld:'vTOTDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarTipArt_Visible',ctrl:'BARTIPART',prop:'Visible'},{av:'edtavTipartdsc_Visible',ctrl:'vTIPARTDSC',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtavKgsexp_Visible',ctrl:'vKGSEXP',prop:'Visible'},{av:'edtavDifkilos_Visible',ctrl:'vDIFKILOS',prop:'Visible'},{av:'edtavPorkgs_Visible',ctrl:'vPORKGS',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtavMtsexp_Visible',ctrl:'vMTSEXP',prop:'Visible'},{av:'edtavDifmetros_Visible',ctrl:'vDIFMETROS',prop:'Visible'},{av:'edtavPormts_Visible',ctrl:'vPORMTS',prop:'Visible'},{av:'AV39GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV40GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV153TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV155TotKgsExp',fld:'vTOTKGSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV157TotDifKilos',fld:'vTOTDIFKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV167TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV161TotMtsexp',fld:'vTOTMTSEXP',pic:'ZZZZZ9.99',hsh:true},{av:'AV163TotDifMetros',fld:'vTOTDIFMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV74KgsExp',fld:'vKGSEXP',pic:'ZZZZZ9.99'},{av:'AV75Mtsexp',fld:'vMTSEXP',pic:'ZZZZZ9.99'},{av:'AV76DifKilos',fld:'vDIFKILOS',pic:'ZZZZZ9.99'},{av:'AV78DifMetros',fld:'vDIFMETROS',pic:'ZZZZZ9.99'},{av:'AV154TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV156TotValueKgsExp',fld:'vTOTVALUEKGSEXP',pic:''},{av:'AV158TotValueDifKilos',fld:'vTOTVALUEDIFKILOS',pic:''},{av:'AV168TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''},{av:'AV162TotValueMtsexp',fld:'vTOTVALUEMTSEXP',pic:''},{av:'AV164TotValueDifMetros',fld:'vTOTVALUEDIFMETROS',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e16MV2',iparms:[{av:'AV41BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV42BarFecSal_To',fld:'vBARFECSAL_TO',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e11MV1',iparms:[{av:'AV131EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV135ImpCod',fld:'vIMPCOD',pic:''},{av:'AV136BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV138BarTipArt_to',fld:'vBARTIPART_TO',pic:'ZZZ9'},{av:'AV96CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV97CliCod_To',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV98BarSer',fld:'vBARSER',pic:''},{av:'AV99BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV100BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV101BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV139BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV140BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV142PDisCli',fld:'vPDISCLI',pic:''},{av:'AV152UDisCli',fld:'vUDISCLI',pic:''},{av:'AV41BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV42BarFecSal_To',fld:'vBARFECSAL_TO',pic:''},{av:'AV144SoloTotal',fld:'vSOLOTOTAL',pic:'9'},{av:'AV145BarItem1',fld:'vBARITEM1',pic:''},{av:'AV146BarItem3',fld:'vBARITEM3',pic:''},{av:'AV44BarEncCli',fld:'vBARENCCLI',pic:''},{av:'AV134BarEncCli_to',fld:'vBARENCCLI_TO',pic:''},{av:'AV147Barmdlcod1',fld:'vBARMDLCOD1',pic:''},{av:'AV148BarItem5',fld:'vBARITEM5',pic:''}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV135ImpCod',fld:'vIMPCOD',pic:''},{av:'AV142PDisCli',fld:'vPDISCLI',pic:''},{av:'AV152UDisCli',fld:'vUDISCLI',pic:''},{av:'AV144SoloTotal',fld:'vSOLOTOTAL',pic:'9'},{av:'AV145BarItem1',fld:'vBARITEM1',pic:''},{av:'AV146BarItem3',fld:'vBARITEM3',pic:''},{av:'AV147Barmdlcod1',fld:'vBARMDLCOD1',pic:''},{av:'AV148BarItem5',fld:'vBARITEM5',pic:''}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e17MV2',iparms:[{av:'AV41BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV42BarFecSal_To',fld:'vBARFECSAL_TO',pic:''}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A13904BarIntColo',fld:'BARINTCOLO',pic:'Z9'},{av:'A13903BarMatColo',fld:'BARMATCOLO',pic:'ZZZ9'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A13904BarIntColo',fld:'BARINTCOLO',pic:'Z9'},{av:'A13903BarMatColo',fld:'BARMATCOLO',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_PEDIDOCLIE","{handler:'valid_Pedidoclie',iparms:[]");
      setEventMetadata("VALID_PEDIDOCLIE",",oparms:[]}");
      setEventMetadata("VALID_BARSER","{handler:'valid_Barser',iparms:[]");
      setEventMetadata("VALID_BARSER",",oparms:[]}");
      setEventMetadata("VALID_BARCOLNOM","{handler:'valid_Barcolnom',iparms:[]");
      setEventMetadata("VALID_BARCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_BARCOLNUM","{handler:'valid_Barcolnum',iparms:[]");
      setEventMetadata("VALID_BARCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_BARKGM","{handler:'valid_Barkgm',iparms:[]");
      setEventMetadata("VALID_BARKGM",",oparms:[]}");
      setEventMetadata("VALID_BARMTR","{handler:'valid_Barmtr',iparms:[]");
      setEventMetadata("VALID_BARMTR",",oparms:[]}");
      setEventMetadata("VALID_KILOSENTRE","{handler:'valid_Kilosentre',iparms:[]");
      setEventMetadata("VALID_KILOSENTRE",",oparms:[]}");
      setEventMetadata("VALID_METROSENTR","{handler:'valid_Metrosentr',iparms:[]");
      setEventMetadata("VALID_METROSENTR",",oparms:[]}");
      setEventMetadata("VALID_BARIDTX2","{handler:'valid_Baridtx2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A13908BarIdtx2',fld:'BARIDTX2',pic:''},{av:'A13909BarIdtxDc',fld:'BARIDTXDC',pic:''}]");
      setEventMetadata("VALID_BARIDTX2",",oparms:[{av:'A13909BarIdtxDc',fld:'BARIDTXDC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Baralbfact',iparms:[]");
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
      pr_default.close(8);
      pr_default.close(6);
      pr_default.close(7);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      wcpOAV131EmprCod = "" ;
      wcpOAV41BarFecSal = GXutil.nullDate() ;
      wcpOAV42BarFecSal_To = GXutil.nullDate() ;
      wcpOAV100BarColNom = "" ;
      wcpOAV101BarColNom_To = "" ;
      wcpOAV98BarSer = "" ;
      wcpOAV99BarSer_To = "" ;
      wcpOAV44BarEncCli = "" ;
      wcpOAV134BarEncCli_to = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV131EmprCod = "" ;
      AV41BarFecSal = GXutil.nullDate() ;
      AV42BarFecSal_To = GXutil.nullDate() ;
      AV100BarColNom = "" ;
      AV101BarColNom_To = "" ;
      AV98BarSer = "" ;
      AV99BarSer_To = "" ;
      AV44BarEncCli = "" ;
      AV134BarEncCli_to = "" ;
      A396EmprCod = "" ;
      AV19ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV185Pgmname = "" ;
      AV26TFCliNom = "" ;
      AV27TFCliNom_Sel = "" ;
      AV29TFBarNHdr = "" ;
      AV30TFBarNHdr_Sel = "" ;
      AV150TFPedidoCliente = "" ;
      AV151TFPedidoCliente_Sel = "" ;
      AV52TFBarSer = "" ;
      AV53TFBarSer_Sel = "" ;
      AV58TFBarColNom = "" ;
      AV59TFBarColNom_Sel = "" ;
      AV61TFBarNomCli = "" ;
      AV62TFBarNomCli_Sel = "" ;
      AV67TFBarFecCli = GXutil.nullDate() ;
      AV72TFBarKgm = DecimalUtil.ZERO ;
      AV73TFBarKgm_To = DecimalUtil.ZERO ;
      AV81TFBarMtr = DecimalUtil.ZERO ;
      AV82TFBarMtr_To = DecimalUtil.ZERO ;
      AV153TotBarKgm = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      AV155TotKgsExp = DecimalUtil.ZERO ;
      AV157TotDifKilos = DecimalUtil.ZERO ;
      AV167TotBarMtr = DecimalUtil.ZERO ;
      AV161TotMtsexp = DecimalUtil.ZERO ;
      AV163TotDifMetros = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV37DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV135ImpCod = "" ;
      AV142PDisCli = "" ;
      AV152UDisCli = "" ;
      AV145BarItem1 = "" ;
      AV146BarItem3 = "" ;
      AV147Barmdlcod1 = "" ;
      AV148BarItem5 = "" ;
      A130BarCodPar = "" ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
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
      AV69DDO_BarFecCliAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A279CliNom = "" ;
      A13696BarNHdr = "" ;
      AV43TipArtDsc = "" ;
      A13878PedidoClie = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A161BarFecSal = GXutil.nullDate() ;
      A158BarFecFpr = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A166BarKgm = DecimalUtil.ZERO ;
      AV74KgsExp = DecimalUtil.ZERO ;
      AV76DifKilos = DecimalUtil.ZERO ;
      AV77PorKgs = DecimalUtil.ZERO ;
      A13932BarAlbKgs = DecimalUtil.ZERO ;
      A13860BarAccesor = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      AV75Mtsexp = DecimalUtil.ZERO ;
      AV78DifMetros = DecimalUtil.ZERO ;
      AV79PorMts = DecimalUtil.ZERO ;
      A13931BarAlbMts = DecimalUtil.ZERO ;
      A13868BarTipColD = "" ;
      A13887KilosEntre = DecimalUtil.ZERO ;
      A13885KilosPendi = DecimalUtil.ZERO ;
      A13886MetrosPend = DecimalUtil.ZERO ;
      A13902BarNorma = "" ;
      A12881BarOEKOTEX = "" ;
      A2447BarFecEnE = GXutil.nullDate() ;
      A12809BarLocTel = "" ;
      A13907BarSerDsc2 = "" ;
      A13908BarIdtx2 = "" ;
      A13909BarIdtxDc = "" ;
      A13910BarColCv = "" ;
      A13933BarCuadern = "" ;
      A13934BarNormas = "" ;
      scmdbuf = "" ;
      lV26TFCliNom = "" ;
      lV29TFBarNHdr = "" ;
      lV52TFBarSer = "" ;
      lV58TFBarColNom = "" ;
      lV61TFBarNomCli = "" ;
      H00MV9_A494ForSer = new String[] {""} ;
      H00MV9_A482ForColNom = new String[] {""} ;
      H00MV9_A483ForColNum = new int[1] ;
      H00MV9_A831TipColCod = new byte[1] ;
      H00MV9_A9713Tb1_Cod = new short[1] ;
      H00MV9_A4466BarAcaAnh = new short[1] ;
      H00MV9_A279CliNom = new String[] {""} ;
      H00MV9_A213BarSit = new byte[1] ;
      H00MV9_A13909BarIdtxDc = new String[] {""} ;
      H00MV9_n13909BarIdtxDc = new boolean[] {false} ;
      H00MV9_A13908BarIdtx2 = new String[] {""} ;
      H00MV9_n13908BarIdtx2 = new boolean[] {false} ;
      H00MV9_A13907BarSerDsc2 = new String[] {""} ;
      H00MV9_n13907BarSerDsc2 = new boolean[] {false} ;
      H00MV9_A12809BarLocTel = new String[] {""} ;
      H00MV9_A2447BarFecEnE = new java.util.Date[] {GXutil.nullDate()} ;
      H00MV9_A12881BarOEKOTEX = new String[] {""} ;
      H00MV9_n12881BarOEKOTEX = new boolean[] {false} ;
      H00MV9_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H00MV9_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      H00MV9_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H00MV9_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H00MV9_A136BarColNum = new int[1] ;
      H00MV9_A1234BarNomCli = new String[] {""} ;
      H00MV9_A135BarColNom = new String[] {""} ;
      H00MV9_A1652BarSerDsc = new String[] {""} ;
      H00MV9_A212BarSer = new String[] {""} ;
      H00MV9_A217BarTipArt = new short[1] ;
      H00MV9_n217BarTipArt = new boolean[] {false} ;
      H00MV9_A252CliCod = new int[1] ;
      H00MV9_n252CliCod = new boolean[] {false} ;
      H00MV9_A396EmprCod = new String[] {""} ;
      H00MV9_A13933BarCuadern = new String[] {""} ;
      H00MV9_n13933BarCuadern = new boolean[] {false} ;
      H00MV9_A13904BarIntColo = new byte[1] ;
      H00MV9_n13904BarIntColo = new boolean[] {false} ;
      H00MV9_A13903BarMatColo = new short[1] ;
      H00MV9_n13903BarMatColo = new boolean[] {false} ;
      H00MV9_A13902BarNorma = new String[] {""} ;
      H00MV9_n13902BarNorma = new boolean[] {false} ;
      H00MV9_A13890BarHDSusp = new byte[1] ;
      H00MV9_n13890BarHDSusp = new boolean[] {false} ;
      H00MV9_A13931BarAlbMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00MV9_A13860BarAccesor = new String[] {""} ;
      H00MV9_n13860BarAccesor = new boolean[] {false} ;
      H00MV9_A13932BarAlbKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00MV9_A218BarTipCol = new byte[1] ;
      H00MV9_A13887KilosEntre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00MV9_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00MV9_A13888MetrosEntr = new short[1] ;
      H00MV9_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00MV9_A361DisCod = new int[1] ;
      H00MV9_A130BarCodPar = new String[] {""} ;
      H00MV9_A132BarCodReo = new byte[1] ;
      H00MV9_A129BarCod = new int[1] ;
      H00MV9_A143BarDisNum = new String[] {""} ;
      H00MV9_A4812BarEncCli = new String[] {""} ;
      H00MV17_A494ForSer = new String[] {""} ;
      H00MV17_A482ForColNom = new String[] {""} ;
      H00MV17_A483ForColNum = new int[1] ;
      H00MV17_A831TipColCod = new byte[1] ;
      H00MV17_A9713Tb1_Cod = new short[1] ;
      H00MV17_A4466BarAcaAnh = new short[1] ;
      H00MV17_A279CliNom = new String[] {""} ;
      H00MV17_A213BarSit = new byte[1] ;
      H00MV17_A13909BarIdtxDc = new String[] {""} ;
      H00MV17_n13909BarIdtxDc = new boolean[] {false} ;
      H00MV17_A13908BarIdtx2 = new String[] {""} ;
      H00MV17_n13908BarIdtx2 = new boolean[] {false} ;
      H00MV17_A13907BarSerDsc2 = new String[] {""} ;
      H00MV17_n13907BarSerDsc2 = new boolean[] {false} ;
      H00MV17_A12809BarLocTel = new String[] {""} ;
      H00MV17_A2447BarFecEnE = new java.util.Date[] {GXutil.nullDate()} ;
      H00MV17_A12881BarOEKOTEX = new String[] {""} ;
      H00MV17_n12881BarOEKOTEX = new boolean[] {false} ;
      H00MV17_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H00MV17_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      H00MV17_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H00MV17_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H00MV17_A136BarColNum = new int[1] ;
      H00MV17_A1234BarNomCli = new String[] {""} ;
      H00MV17_A135BarColNom = new String[] {""} ;
      H00MV17_A1652BarSerDsc = new String[] {""} ;
      H00MV17_A212BarSer = new String[] {""} ;
      H00MV17_A217BarTipArt = new short[1] ;
      H00MV17_n217BarTipArt = new boolean[] {false} ;
      H00MV17_A252CliCod = new int[1] ;
      H00MV17_n252CliCod = new boolean[] {false} ;
      H00MV17_A396EmprCod = new String[] {""} ;
      H00MV17_A13933BarCuadern = new String[] {""} ;
      H00MV17_n13933BarCuadern = new boolean[] {false} ;
      H00MV17_A13904BarIntColo = new byte[1] ;
      H00MV17_n13904BarIntColo = new boolean[] {false} ;
      H00MV17_A13903BarMatColo = new short[1] ;
      H00MV17_n13903BarMatColo = new boolean[] {false} ;
      H00MV17_A13902BarNorma = new String[] {""} ;
      H00MV17_n13902BarNorma = new boolean[] {false} ;
      H00MV17_A13890BarHDSusp = new byte[1] ;
      H00MV17_n13890BarHDSusp = new boolean[] {false} ;
      H00MV17_A13931BarAlbMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00MV17_A13860BarAccesor = new String[] {""} ;
      H00MV17_n13860BarAccesor = new boolean[] {false} ;
      H00MV17_A13932BarAlbKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00MV17_A218BarTipCol = new byte[1] ;
      H00MV17_A13887KilosEntre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00MV17_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00MV17_A13888MetrosEntr = new short[1] ;
      H00MV17_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00MV17_A361DisCod = new int[1] ;
      H00MV17_A130BarCodPar = new String[] {""} ;
      H00MV17_A132BarCodReo = new byte[1] ;
      H00MV17_A129BarCod = new int[1] ;
      H00MV17_A143BarDisNum = new String[] {""} ;
      H00MV17_A4812BarEncCli = new String[] {""} ;
      GXv_int3 = new byte[1] ;
      GXv_int8 = new long[1] ;
      GXv_int5 = new int[1] ;
      H00MV19_A13902BarNorma = new String[] {""} ;
      H00MV19_n13902BarNorma = new boolean[] {false} ;
      AV154TotValueBarKgm = "" ;
      AV156TotValueKgsExp = "" ;
      AV158TotValueDifKilos = "" ;
      AV168TotValueBarMtr = "" ;
      AV162TotValueMtsexp = "" ;
      AV164TotValueDifMetros = "" ;
      AV83Station = "" ;
      AV84EmprNom = "" ;
      AV85UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext13 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV21Session = httpContext.getWebSession();
      AV17ColumnsSelectorXML = "" ;
      AV133WebSession = httpContext.getWebSession();
      AV132ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      lV150TFPedidoCliente = "" ;
      c1261BarAlbKgmE = DecimalUtil.ZERO ;
      c1263BarAlbMtrE = DecimalUtil.ZERO ;
      H00MV20_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00MV20_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV15ExcelFilename = "" ;
      AV16ErrorMessage = "" ;
      AV18UserCustomValue = "" ;
      AV20ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector15 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char19 = "" ;
      GXt_char18 = "" ;
      GXt_char17 = "" ;
      GXt_char16 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState23 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      H00MV22_A213BarSit = new byte[1] ;
      H00MV22_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H00MV22_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H00MV22_A136BarColNum = new int[1] ;
      H00MV22_A1234BarNomCli = new String[] {""} ;
      H00MV22_A135BarColNom = new String[] {""} ;
      H00MV22_A212BarSer = new String[] {""} ;
      H00MV22_A217BarTipArt = new short[1] ;
      H00MV22_n217BarTipArt = new boolean[] {false} ;
      H00MV22_A279CliNom = new String[] {""} ;
      H00MV22_A252CliCod = new int[1] ;
      H00MV22_n252CliCod = new boolean[] {false} ;
      H00MV22_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00MV22_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00MV22_A396EmprCod = new String[] {""} ;
      H00MV22_A130BarCodPar = new String[] {""} ;
      H00MV22_A132BarCodReo = new byte[1] ;
      H00MV22_A129BarCod = new int[1] ;
      H00MV22_A143BarDisNum = new String[] {""} ;
      H00MV22_A4812BarEncCli = new String[] {""} ;
      GXt_char21 = "" ;
      GXv_char22 = new String[1] ;
      GXv_char20 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_char6 = new String[1] ;
      H00MV23_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00MV23_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV131EmprCod = "" ;
      sCtrlAV41BarFecSal = "" ;
      sCtrlAV42BarFecSal_To = "" ;
      sCtrlAV100BarColNom = "" ;
      sCtrlAV101BarColNom_To = "" ;
      sCtrlAV139BarColNum = "" ;
      sCtrlAV140BarColNum_To = "" ;
      sCtrlAV98BarSer = "" ;
      sCtrlAV99BarSer_To = "" ;
      sCtrlAV96CliCod = "" ;
      sCtrlAV97CliCod_To = "" ;
      sCtrlAV44BarEncCli = "" ;
      sCtrlAV134BarEncCli_to = "" ;
      sCtrlAV136BarTipArt = "" ;
      sCtrlAV138BarTipArt_to = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      H00MV24_A279CliNom = new String[] {""} ;
      H00MV25_A13904BarIntColo = new byte[1] ;
      H00MV25_n13904BarIntColo = new boolean[] {false} ;
      H00MV25_A13903BarMatColo = new short[1] ;
      H00MV25_n13903BarMatColo = new boolean[] {false} ;
      Z279CliNom = "" ;
      H00MV26_A13909BarIdtxDc = new String[] {""} ;
      H00MV26_n13909BarIdtxDc = new boolean[] {false} ;
      Z13909BarIdtxDc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.informemermasdetallado_wc__default(),
         new Object[] {
             new Object[] {
            H00MV9_A494ForSer, H00MV9_A482ForColNom, H00MV9_A483ForColNum, H00MV9_A831TipColCod, H00MV9_A9713Tb1_Cod, H00MV9_A4466BarAcaAnh, H00MV9_A279CliNom, H00MV9_A213BarSit, H00MV9_A13909BarIdtxDc, H00MV9_n13909BarIdtxDc,
            H00MV9_A13908BarIdtx2, H00MV9_n13908BarIdtx2, H00MV9_A13907BarSerDsc2, H00MV9_n13907BarSerDsc2, H00MV9_A12809BarLocTel, H00MV9_A2447BarFecEnE, H00MV9_A12881BarOEKOTEX, H00MV9_n12881BarOEKOTEX, H00MV9_A155BarFecCli, H00MV9_A158BarFecFpr,
            H00MV9_A161BarFecSal, H00MV9_A159BarFecGen, H00MV9_A136BarColNum, H00MV9_A1234BarNomCli, H00MV9_A135BarColNom, H00MV9_A1652BarSerDsc, H00MV9_A212BarSer, H00MV9_A217BarTipArt, H00MV9_n217BarTipArt, H00MV9_A252CliCod,
            H00MV9_n252CliCod, H00MV9_A396EmprCod, H00MV9_A13933BarCuadern, H00MV9_n13933BarCuadern, H00MV9_A13904BarIntColo, H00MV9_n13904BarIntColo, H00MV9_A13903BarMatColo, H00MV9_n13903BarMatColo, H00MV9_A13902BarNorma, H00MV9_n13902BarNorma,
            H00MV9_A13890BarHDSusp, H00MV9_n13890BarHDSusp, H00MV9_A13931BarAlbMts, H00MV9_A13860BarAccesor, H00MV9_n13860BarAccesor, H00MV9_A13932BarAlbKgs, H00MV9_A218BarTipCol, H00MV9_A13887KilosEntre, H00MV9_A166BarKgm, H00MV9_A13888MetrosEntr,
            H00MV9_A184BarMtr, H00MV9_A361DisCod, H00MV9_A130BarCodPar, H00MV9_A132BarCodReo, H00MV9_A129BarCod, H00MV9_A143BarDisNum, H00MV9_A4812BarEncCli
            }
            , new Object[] {
            H00MV17_A494ForSer, H00MV17_A482ForColNom, H00MV17_A483ForColNum, H00MV17_A831TipColCod, H00MV17_A9713Tb1_Cod, H00MV17_A4466BarAcaAnh, H00MV17_A279CliNom, H00MV17_A213BarSit, H00MV17_A13909BarIdtxDc, H00MV17_n13909BarIdtxDc,
            H00MV17_A13908BarIdtx2, H00MV17_n13908BarIdtx2, H00MV17_A13907BarSerDsc2, H00MV17_n13907BarSerDsc2, H00MV17_A12809BarLocTel, H00MV17_A2447BarFecEnE, H00MV17_A12881BarOEKOTEX, H00MV17_n12881BarOEKOTEX, H00MV17_A155BarFecCli, H00MV17_A158BarFecFpr,
            H00MV17_A161BarFecSal, H00MV17_A159BarFecGen, H00MV17_A136BarColNum, H00MV17_A1234BarNomCli, H00MV17_A135BarColNom, H00MV17_A1652BarSerDsc, H00MV17_A212BarSer, H00MV17_A217BarTipArt, H00MV17_n217BarTipArt, H00MV17_A252CliCod,
            H00MV17_n252CliCod, H00MV17_A396EmprCod, H00MV17_A13933BarCuadern, H00MV17_n13933BarCuadern, H00MV17_A13904BarIntColo, H00MV17_n13904BarIntColo, H00MV17_A13903BarMatColo, H00MV17_n13903BarMatColo, H00MV17_A13902BarNorma, H00MV17_n13902BarNorma,
            H00MV17_A13890BarHDSusp, H00MV17_n13890BarHDSusp, H00MV17_A13931BarAlbMts, H00MV17_A13860BarAccesor, H00MV17_n13860BarAccesor, H00MV17_A13932BarAlbKgs, H00MV17_A218BarTipCol, H00MV17_A13887KilosEntre, H00MV17_A166BarKgm, H00MV17_A13888MetrosEntr,
            H00MV17_A184BarMtr, H00MV17_A361DisCod, H00MV17_A130BarCodPar, H00MV17_A132BarCodReo, H00MV17_A129BarCod, H00MV17_A143BarDisNum, H00MV17_A4812BarEncCli
            }
            , new Object[] {
            H00MV19_A13902BarNorma, H00MV19_n13902BarNorma
            }
            , new Object[] {
            H00MV20_A1261BarAlbKgmE, H00MV20_A1263BarAlbMtrE
            }
            , new Object[] {
            H00MV22_A213BarSit, H00MV22_A161BarFecSal, H00MV22_A155BarFecCli, H00MV22_A136BarColNum, H00MV22_A1234BarNomCli, H00MV22_A135BarColNom, H00MV22_A212BarSer, H00MV22_A217BarTipArt, H00MV22_n217BarTipArt, H00MV22_A279CliNom,
            H00MV22_A252CliCod, H00MV22_n252CliCod, H00MV22_A184BarMtr, H00MV22_A166BarKgm, H00MV22_A396EmprCod, H00MV22_A130BarCodPar, H00MV22_A132BarCodReo, H00MV22_A129BarCod, H00MV22_A143BarDisNum, H00MV22_A4812BarEncCli
            }
            , new Object[] {
            H00MV23_A1261BarAlbKgmE, H00MV23_A1263BarAlbMtrE
            }
            , new Object[] {
            H00MV24_A279CliNom
            }
            , new Object[] {
            H00MV25_A13904BarIntColo, H00MV25_n13904BarIntColo, H00MV25_A13903BarMatColo, H00MV25_n13903BarMatColo
            }
            , new Object[] {
            H00MV26_A13909BarIdtxDc, H00MV26_n13909BarIdtxDc
            }
         }
      );
      AV185Pgmname = "InformeMermasDetallado_WC" ;
      /* GeneXus formulas. */
      AV185Pgmname = "InformeMermasDetallado_WC" ;
      Gx_err = (short)(0) ;
      edtavTipartdsc_Enabled = 0 ;
      edtavKgsexp_Enabled = 0 ;
      edtavDifkilos_Enabled = 0 ;
      edtavPorkgs_Enabled = 0 ;
      edtavMtsexp_Enabled = 0 ;
      edtavDifmetros_Enabled = 0 ;
      edtavPormts_Enabled = 0 ;
      edtavTotvaluebarkgm_Enabled = 0 ;
      edtavTotvaluekgsexp_Enabled = 0 ;
      edtavTotvaluedifkilos_Enabled = 0 ;
      edtavTotvaluebarmtr_Enabled = 0 ;
      edtavTotvaluemtsexp_Enabled = 0 ;
      edtavTotvaluedifmetros_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A213BarSit ;
   private byte AV144SoloTotal ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A13890BarHDSusp ;
   private byte A13904BarIntColo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXv_int3[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private byte Z13904BarIntColo ;
   private short wcpOAV136BarTipArt ;
   private short wcpOAV138BarTipArt_to ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV136BarTipArt ;
   private short AV138BarTipArt_to ;
   private short AV12OrderedBy ;
   private short AV49TFBarTipArt ;
   private short AV50TFBarTipArt_To ;
   private short wbEnd ;
   private short wbStart ;
   private short A217BarTipArt ;
   private short A13888MetrosEntr ;
   private short A13903BarMatColo ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A4466BarAcaAnh ;
   private short Z13903BarMatColo ;
   private int wcpOAV139BarColNum ;
   private int wcpOAV140BarColNum_To ;
   private int wcpOAV96CliCod ;
   private int wcpOAV97CliCod_To ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_39 ;
   private int AV139BarColNum ;
   private int AV140BarColNum_To ;
   private int AV96CliCod ;
   private int AV97CliCod_To ;
   private int nGXsfl_39_idx=1 ;
   private int AV46TFCliCod ;
   private int AV47TFCliCod_To ;
   private int AV64TFBarColNum ;
   private int AV65TFBarColNum_To ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Visible ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A13935BarAlbFact ;
   private int subGrid_Islastpage ;
   private int edtavTipartdsc_Enabled ;
   private int edtavKgsexp_Enabled ;
   private int edtavDifkilos_Enabled ;
   private int edtavPorkgs_Enabled ;
   private int edtavMtsexp_Enabled ;
   private int edtavDifmetros_Enabled ;
   private int edtavPormts_Enabled ;
   private int edtavTotvaluebarkgm_Enabled ;
   private int edtavTotvaluekgsexp_Enabled ;
   private int edtavTotvaluedifkilos_Enabled ;
   private int edtavTotvaluebarmtr_Enabled ;
   private int edtavTotvaluemtsexp_Enabled ;
   private int edtavTotvaluedifmetros_Enabled ;
   private int GXt_int9 ;
   private int GXv_int5[] ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtBarNHdr_Visible ;
   private int edtBarTipArt_Visible ;
   private int edtavTipartdsc_Visible ;
   private int edtPedidoClie_Visible ;
   private int edtBarSer_Visible ;
   private int edtBarColNom_Visible ;
   private int edtBarNomCli_Visible ;
   private int edtBarColNum_Visible ;
   private int edtBarFecCli_Visible ;
   private int edtBarKgm_Visible ;
   private int edtavKgsexp_Visible ;
   private int edtavDifkilos_Visible ;
   private int edtavPorkgs_Visible ;
   private int edtBarMtr_Visible ;
   private int edtavMtsexp_Visible ;
   private int edtavDifmetros_Visible ;
   private int edtavPormts_Visible ;
   private int AV38PageToGo ;
   private int AV187GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV39GridCurrentPage ;
   private long AV40GridPageCount ;
   private long A13930BarAlbUlti ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long GXt_int7 ;
   private long GXv_int8[] ;
   private java.math.BigDecimal AV72TFBarKgm ;
   private java.math.BigDecimal AV73TFBarKgm_To ;
   private java.math.BigDecimal AV81TFBarMtr ;
   private java.math.BigDecimal AV82TFBarMtr_To ;
   private java.math.BigDecimal AV153TotBarKgm ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV155TotKgsExp ;
   private java.math.BigDecimal AV157TotDifKilos ;
   private java.math.BigDecimal AV167TotBarMtr ;
   private java.math.BigDecimal AV161TotMtsexp ;
   private java.math.BigDecimal AV163TotDifMetros ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV74KgsExp ;
   private java.math.BigDecimal AV76DifKilos ;
   private java.math.BigDecimal AV77PorKgs ;
   private java.math.BigDecimal A13932BarAlbKgs ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV75Mtsexp ;
   private java.math.BigDecimal AV78DifMetros ;
   private java.math.BigDecimal AV79PorMts ;
   private java.math.BigDecimal A13931BarAlbMts ;
   private java.math.BigDecimal A13887KilosEntre ;
   private java.math.BigDecimal A13885KilosPendi ;
   private java.math.BigDecimal A13886MetrosPend ;
   private java.math.BigDecimal c1261BarAlbKgmE ;
   private java.math.BigDecimal c1263BarAlbMtrE ;
   private String wcpOAV131EmprCod ;
   private String wcpOAV100BarColNom ;
   private String wcpOAV101BarColNom_To ;
   private String wcpOAV98BarSer ;
   private String wcpOAV99BarSer_To ;
   private String wcpOAV44BarEncCli ;
   private String wcpOAV134BarEncCli_to ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV131EmprCod ;
   private String AV100BarColNom ;
   private String AV101BarColNom_To ;
   private String AV98BarSer ;
   private String AV99BarSer_To ;
   private String AV44BarEncCli ;
   private String AV134BarEncCli_to ;
   private String sGXsfl_39_idx="0001" ;
   private String A396EmprCod ;
   private String AV185Pgmname ;
   private String AV26TFCliNom ;
   private String AV27TFCliNom_Sel ;
   private String AV29TFBarNHdr ;
   private String AV30TFBarNHdr_Sel ;
   private String AV150TFPedidoCliente ;
   private String AV151TFPedidoCliente_Sel ;
   private String AV52TFBarSer ;
   private String AV53TFBarSer_Sel ;
   private String AV58TFBarColNom ;
   private String AV59TFBarColNom_Sel ;
   private String AV61TFBarNomCli ;
   private String AV62TFBarNomCli_Sel ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV135ImpCod ;
   private String AV142PDisCli ;
   private String AV152UDisCli ;
   private String AV145BarItem1 ;
   private String AV146BarItem3 ;
   private String AV147Barmdlcod1 ;
   private String AV148BarItem5 ;
   private String A130BarCodPar ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
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
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String bttBtnexportreport_Internalname ;
   private String bttBtnexportreport_Jsonclick ;
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
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_barfeccliauxdates_Internalname ;
   private String edtavDdo_barfeccliauxdate_Internalname ;
   private String edtavDdo_barfeccliauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavTotvaluebarkgm_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String edtBarTipArt_Internalname ;
   private String AV43TipArtDsc ;
   private String edtavTipartdsc_Internalname ;
   private String A13878PedidoClie ;
   private String edtPedidoClie_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Internalname ;
   private String A1234BarNomCli ;
   private String edtBarNomCli_Internalname ;
   private String edtBarColNum_Internalname ;
   private String edtBarFecGen_Internalname ;
   private String edtBarFecSal_Internalname ;
   private String edtBarFecFpr_Internalname ;
   private String edtBarFecCli_Internalname ;
   private String edtBarKgm_Internalname ;
   private String edtavKgsexp_Internalname ;
   private String edtavDifkilos_Internalname ;
   private String edtavPorkgs_Internalname ;
   private String edtBarAlbKgs_Internalname ;
   private String A13860BarAccesor ;
   private String edtBarMtr_Internalname ;
   private String edtavMtsexp_Internalname ;
   private String edtavDifmetros_Internalname ;
   private String edtavPormts_Internalname ;
   private String edtBarAlbMts_Internalname ;
   private String A13868BarTipColD ;
   private String edtBarTipColD_Internalname ;
   private String edtKilosEntre_Internalname ;
   private String edtMetrosEntr_Internalname ;
   private String edtKilosPendi_Internalname ;
   private String edtMetrosPend_Internalname ;
   private String edtBarHDSusp_Internalname ;
   private String A13902BarNorma ;
   private String edtBarNorma_Internalname ;
   private String edtBarMatColo_Internalname ;
   private String A12881BarOEKOTEX ;
   private String edtBarOEKOTEX_Internalname ;
   private String edtBarFecEnE_Internalname ;
   private String edtBarIntColo_Internalname ;
   private String A12809BarLocTel ;
   private String edtBarLocTel_Internalname ;
   private String edtBarSerDsc2_Internalname ;
   private String A13908BarIdtx2 ;
   private String edtBarIdtx2_Internalname ;
   private String A13909BarIdtxDc ;
   private String edtBarIdtxDc_Internalname ;
   private String A13910BarColCv ;
   private String edtBarColCv_Internalname ;
   private String edtBarAlbUlti_Internalname ;
   private String A13933BarCuadern ;
   private String edtBarCuadern_Internalname ;
   private String edtBarNormas_Internalname ;
   private String edtBarAlbFact_Internalname ;
   private String edtavTotvaluekgsexp_Internalname ;
   private String edtavTotvaluedifkilos_Internalname ;
   private String edtavTotvaluebarmtr_Internalname ;
   private String edtavTotvaluemtsexp_Internalname ;
   private String edtavTotvaluedifmetros_Internalname ;
   private String scmdbuf ;
   private String lV26TFCliNom ;
   private String lV29TFBarNHdr ;
   private String lV52TFBarSer ;
   private String lV58TFBarColNom ;
   private String lV61TFBarNomCli ;
   private String AV83Station ;
   private String AV84EmprNom ;
   private String AV85UsurCod ;
   private String lV150TFPedidoCliente ;
   private String GXt_char19 ;
   private String GXt_char18 ;
   private String GXt_char17 ;
   private String GXt_char16 ;
   private String GXv_char4[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char21 ;
   private String GXv_char22[] ;
   private String GXv_char20[] ;
   private String GXv_char10[] ;
   private String GXv_char6[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluebarkgm_Jsonclick ;
   private String edtavTotvaluekgsexp_Jsonclick ;
   private String edtavTotvaluedifkilos_Jsonclick ;
   private String edtavTotvaluebarmtr_Jsonclick ;
   private String edtavTotvaluemtsexp_Jsonclick ;
   private String edtavTotvaluedifmetros_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV131EmprCod ;
   private String sCtrlAV41BarFecSal ;
   private String sCtrlAV42BarFecSal_To ;
   private String sCtrlAV100BarColNom ;
   private String sCtrlAV101BarColNom_To ;
   private String sCtrlAV139BarColNum ;
   private String sCtrlAV140BarColNum_To ;
   private String sCtrlAV98BarSer ;
   private String sCtrlAV99BarSer_To ;
   private String sCtrlAV96CliCod ;
   private String sCtrlAV97CliCod_To ;
   private String sCtrlAV44BarEncCli ;
   private String sCtrlAV134BarEncCli_to ;
   private String sCtrlAV136BarTipArt ;
   private String sCtrlAV138BarTipArt_to ;
   private String sGXsfl_39_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtBarNHdr_Jsonclick ;
   private String edtBarTipArt_Jsonclick ;
   private String edtavTipartdsc_Jsonclick ;
   private String edtPedidoClie_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarNomCli_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarFecGen_Jsonclick ;
   private String edtBarFecSal_Jsonclick ;
   private String edtBarFecFpr_Jsonclick ;
   private String edtBarFecCli_Jsonclick ;
   private String edtBarKgm_Jsonclick ;
   private String edtavKgsexp_Jsonclick ;
   private String edtavDifkilos_Jsonclick ;
   private String edtavPorkgs_Jsonclick ;
   private String edtBarAlbKgs_Jsonclick ;
   private String GXCCtl ;
   private String edtBarMtr_Jsonclick ;
   private String edtavMtsexp_Jsonclick ;
   private String edtavDifmetros_Jsonclick ;
   private String edtavPormts_Jsonclick ;
   private String edtBarAlbMts_Jsonclick ;
   private String edtBarTipColD_Jsonclick ;
   private String edtKilosEntre_Jsonclick ;
   private String edtMetrosEntr_Jsonclick ;
   private String edtKilosPendi_Jsonclick ;
   private String edtMetrosPend_Jsonclick ;
   private String edtBarHDSusp_Jsonclick ;
   private String edtBarNorma_Jsonclick ;
   private String edtBarMatColo_Jsonclick ;
   private String edtBarOEKOTEX_Jsonclick ;
   private String edtBarFecEnE_Jsonclick ;
   private String edtBarIntColo_Jsonclick ;
   private String edtBarLocTel_Jsonclick ;
   private String edtBarSerDsc2_Jsonclick ;
   private String edtBarIdtx2_Jsonclick ;
   private String edtBarIdtxDc_Jsonclick ;
   private String edtBarColCv_Jsonclick ;
   private String edtBarAlbUlti_Jsonclick ;
   private String edtBarCuadern_Jsonclick ;
   private String edtBarNormas_Jsonclick ;
   private String edtBarAlbFact_Jsonclick ;
   private String subGrid_Header ;
   private String Z279CliNom ;
   private String Z13909BarIdtxDc ;
   private java.util.Date wcpOAV41BarFecSal ;
   private java.util.Date wcpOAV42BarFecSal_To ;
   private java.util.Date AV41BarFecSal ;
   private java.util.Date AV42BarFecSal_To ;
   private java.util.Date AV67TFBarFecCli ;
   private java.util.Date AV69DDO_BarFecCliAuxDate ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A2447BarFecEnE ;
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
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private boolean n13860BarAccesor ;
   private boolean n13890BarHDSusp ;
   private boolean n13902BarNorma ;
   private boolean n13903BarMatColo ;
   private boolean n12881BarOEKOTEX ;
   private boolean n13904BarIntColo ;
   private boolean n13907BarSerDsc2 ;
   private boolean n13908BarIdtx2 ;
   private boolean n13909BarIdtxDc ;
   private boolean n13933BarCuadern ;
   private boolean bGXsfl_39_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV17ColumnsSelectorXML ;
   private String AV18UserCustomValue ;
   private String A13907BarSerDsc2 ;
   private String A13934BarNormas ;
   private String AV154TotValueBarKgm ;
   private String AV156TotValueKgsExp ;
   private String AV158TotValueDifKilos ;
   private String AV168TotValueBarMtr ;
   private String AV162TotValueMtsexp ;
   private String AV164TotValueDifMetros ;
   private String AV15ExcelFilename ;
   private String AV16ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private com.genexus.webpanels.WebSession AV133WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV132ProgressIndicator ;
   private ICheckbox chkBarAccesor ;
   private IDataStoreProvider pr_default ;
   private String[] H00MV9_A494ForSer ;
   private String[] H00MV9_A482ForColNom ;
   private int[] H00MV9_A483ForColNum ;
   private byte[] H00MV9_A831TipColCod ;
   private short[] H00MV9_A9713Tb1_Cod ;
   private short[] H00MV9_A4466BarAcaAnh ;
   private String[] H00MV9_A279CliNom ;
   private byte[] H00MV9_A213BarSit ;
   private String[] H00MV9_A13909BarIdtxDc ;
   private boolean[] H00MV9_n13909BarIdtxDc ;
   private String[] H00MV9_A13908BarIdtx2 ;
   private boolean[] H00MV9_n13908BarIdtx2 ;
   private String[] H00MV9_A13907BarSerDsc2 ;
   private boolean[] H00MV9_n13907BarSerDsc2 ;
   private String[] H00MV9_A12809BarLocTel ;
   private java.util.Date[] H00MV9_A2447BarFecEnE ;
   private String[] H00MV9_A12881BarOEKOTEX ;
   private boolean[] H00MV9_n12881BarOEKOTEX ;
   private java.util.Date[] H00MV9_A155BarFecCli ;
   private java.util.Date[] H00MV9_A158BarFecFpr ;
   private java.util.Date[] H00MV9_A161BarFecSal ;
   private java.util.Date[] H00MV9_A159BarFecGen ;
   private int[] H00MV9_A136BarColNum ;
   private String[] H00MV9_A1234BarNomCli ;
   private String[] H00MV9_A135BarColNom ;
   private String[] H00MV9_A1652BarSerDsc ;
   private String[] H00MV9_A212BarSer ;
   private short[] H00MV9_A217BarTipArt ;
   private boolean[] H00MV9_n217BarTipArt ;
   private int[] H00MV9_A252CliCod ;
   private boolean[] H00MV9_n252CliCod ;
   private String[] H00MV9_A396EmprCod ;
   private String[] H00MV9_A13933BarCuadern ;
   private boolean[] H00MV9_n13933BarCuadern ;
   private byte[] H00MV9_A13904BarIntColo ;
   private boolean[] H00MV9_n13904BarIntColo ;
   private short[] H00MV9_A13903BarMatColo ;
   private boolean[] H00MV9_n13903BarMatColo ;
   private String[] H00MV9_A13902BarNorma ;
   private boolean[] H00MV9_n13902BarNorma ;
   private byte[] H00MV9_A13890BarHDSusp ;
   private boolean[] H00MV9_n13890BarHDSusp ;
   private java.math.BigDecimal[] H00MV9_A13931BarAlbMts ;
   private String[] H00MV9_A13860BarAccesor ;
   private boolean[] H00MV9_n13860BarAccesor ;
   private java.math.BigDecimal[] H00MV9_A13932BarAlbKgs ;
   private byte[] H00MV9_A218BarTipCol ;
   private java.math.BigDecimal[] H00MV9_A13887KilosEntre ;
   private java.math.BigDecimal[] H00MV9_A166BarKgm ;
   private short[] H00MV9_A13888MetrosEntr ;
   private java.math.BigDecimal[] H00MV9_A184BarMtr ;
   private int[] H00MV9_A361DisCod ;
   private String[] H00MV9_A130BarCodPar ;
   private byte[] H00MV9_A132BarCodReo ;
   private int[] H00MV9_A129BarCod ;
   private String[] H00MV9_A143BarDisNum ;
   private String[] H00MV9_A4812BarEncCli ;
   private String[] H00MV17_A494ForSer ;
   private String[] H00MV17_A482ForColNom ;
   private int[] H00MV17_A483ForColNum ;
   private byte[] H00MV17_A831TipColCod ;
   private short[] H00MV17_A9713Tb1_Cod ;
   private short[] H00MV17_A4466BarAcaAnh ;
   private String[] H00MV17_A279CliNom ;
   private byte[] H00MV17_A213BarSit ;
   private String[] H00MV17_A13909BarIdtxDc ;
   private boolean[] H00MV17_n13909BarIdtxDc ;
   private String[] H00MV17_A13908BarIdtx2 ;
   private boolean[] H00MV17_n13908BarIdtx2 ;
   private String[] H00MV17_A13907BarSerDsc2 ;
   private boolean[] H00MV17_n13907BarSerDsc2 ;
   private String[] H00MV17_A12809BarLocTel ;
   private java.util.Date[] H00MV17_A2447BarFecEnE ;
   private String[] H00MV17_A12881BarOEKOTEX ;
   private boolean[] H00MV17_n12881BarOEKOTEX ;
   private java.util.Date[] H00MV17_A155BarFecCli ;
   private java.util.Date[] H00MV17_A158BarFecFpr ;
   private java.util.Date[] H00MV17_A161BarFecSal ;
   private java.util.Date[] H00MV17_A159BarFecGen ;
   private int[] H00MV17_A136BarColNum ;
   private String[] H00MV17_A1234BarNomCli ;
   private String[] H00MV17_A135BarColNom ;
   private String[] H00MV17_A1652BarSerDsc ;
   private String[] H00MV17_A212BarSer ;
   private short[] H00MV17_A217BarTipArt ;
   private boolean[] H00MV17_n217BarTipArt ;
   private int[] H00MV17_A252CliCod ;
   private boolean[] H00MV17_n252CliCod ;
   private String[] H00MV17_A396EmprCod ;
   private String[] H00MV17_A13933BarCuadern ;
   private boolean[] H00MV17_n13933BarCuadern ;
   private byte[] H00MV17_A13904BarIntColo ;
   private boolean[] H00MV17_n13904BarIntColo ;
   private short[] H00MV17_A13903BarMatColo ;
   private boolean[] H00MV17_n13903BarMatColo ;
   private String[] H00MV17_A13902BarNorma ;
   private boolean[] H00MV17_n13902BarNorma ;
   private byte[] H00MV17_A13890BarHDSusp ;
   private boolean[] H00MV17_n13890BarHDSusp ;
   private java.math.BigDecimal[] H00MV17_A13931BarAlbMts ;
   private String[] H00MV17_A13860BarAccesor ;
   private boolean[] H00MV17_n13860BarAccesor ;
   private java.math.BigDecimal[] H00MV17_A13932BarAlbKgs ;
   private byte[] H00MV17_A218BarTipCol ;
   private java.math.BigDecimal[] H00MV17_A13887KilosEntre ;
   private java.math.BigDecimal[] H00MV17_A166BarKgm ;
   private short[] H00MV17_A13888MetrosEntr ;
   private java.math.BigDecimal[] H00MV17_A184BarMtr ;
   private int[] H00MV17_A361DisCod ;
   private String[] H00MV17_A130BarCodPar ;
   private byte[] H00MV17_A132BarCodReo ;
   private int[] H00MV17_A129BarCod ;
   private String[] H00MV17_A143BarDisNum ;
   private String[] H00MV17_A4812BarEncCli ;
   private String[] H00MV19_A13902BarNorma ;
   private boolean[] H00MV19_n13902BarNorma ;
   private java.math.BigDecimal[] H00MV20_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] H00MV20_A1263BarAlbMtrE ;
   private byte[] H00MV22_A213BarSit ;
   private java.util.Date[] H00MV22_A161BarFecSal ;
   private java.util.Date[] H00MV22_A155BarFecCli ;
   private int[] H00MV22_A136BarColNum ;
   private String[] H00MV22_A1234BarNomCli ;
   private String[] H00MV22_A135BarColNom ;
   private String[] H00MV22_A212BarSer ;
   private short[] H00MV22_A217BarTipArt ;
   private boolean[] H00MV22_n217BarTipArt ;
   private String[] H00MV22_A279CliNom ;
   private int[] H00MV22_A252CliCod ;
   private boolean[] H00MV22_n252CliCod ;
   private java.math.BigDecimal[] H00MV22_A184BarMtr ;
   private java.math.BigDecimal[] H00MV22_A166BarKgm ;
   private String[] H00MV22_A396EmprCod ;
   private String[] H00MV22_A130BarCodPar ;
   private byte[] H00MV22_A132BarCodReo ;
   private int[] H00MV22_A129BarCod ;
   private String[] H00MV22_A143BarDisNum ;
   private String[] H00MV22_A4812BarEncCli ;
   private java.math.BigDecimal[] H00MV23_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] H00MV23_A1263BarAlbMtrE ;
   private String[] H00MV24_A279CliNom ;
   private byte[] H00MV25_A13904BarIntColo ;
   private boolean[] H00MV25_n13904BarIntColo ;
   private short[] H00MV25_A13903BarMatColo ;
   private boolean[] H00MV25_n13903BarMatColo ;
   private String[] H00MV26_A13909BarIdtxDc ;
   private boolean[] H00MV26_n13909BarIdtxDc ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector14[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector15[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV37DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState23[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext13[] ;
}

final  class informemermasdetallado_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00MV9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV46TFCliCod ,
                                          int AV47TFCliCod_To ,
                                          String AV27TFCliNom_Sel ,
                                          String AV26TFCliNom ,
                                          String AV30TFBarNHdr_Sel ,
                                          String AV29TFBarNHdr ,
                                          short AV49TFBarTipArt ,
                                          short AV50TFBarTipArt_To ,
                                          String AV53TFBarSer_Sel ,
                                          String AV52TFBarSer ,
                                          String AV59TFBarColNom_Sel ,
                                          String AV58TFBarColNom ,
                                          String AV62TFBarNomCli_Sel ,
                                          String AV61TFBarNomCli ,
                                          int AV64TFBarColNum ,
                                          int AV65TFBarColNum_To ,
                                          java.util.Date AV67TFBarFecCli ,
                                          java.math.BigDecimal AV72TFBarKgm ,
                                          java.math.BigDecimal AV73TFBarKgm_To ,
                                          java.math.BigDecimal AV81TFBarMtr ,
                                          java.math.BigDecimal AV82TFBarMtr_To ,
                                          java.util.Date AV41BarFecSal ,
                                          java.util.Date AV42BarFecSal_To ,
                                          int AV96CliCod ,
                                          int AV97CliCod_To ,
                                          String AV98BarSer ,
                                          String AV99BarSer_To ,
                                          String AV100BarColNom ,
                                          String AV101BarColNom_To ,
                                          int AV139BarColNum ,
                                          int AV140BarColNum_To ,
                                          short AV136BarTipArt ,
                                          short AV138BarTipArt_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A217BarTipArt ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          int A136BarColNum ,
                                          java.util.Date A155BarFecCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          java.util.Date A161BarFecSal ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV151TFPedidoCliente_Sel ,
                                          String AV150TFPedidoCliente ,
                                          String A13878PedidoClie ,
                                          String AV44BarEncCli ,
                                          String AV134BarEncCli_to ,
                                          byte A213BarSit ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int24 = new byte[38];
      Object[] GXv_Object25 = new Object[2];
      scmdbuf = "SELECT T7.ForSer, T7.ForColNom, T7.ForColNum, T7.TipColCod, T6.Tb1_Cod, T1.BarAcaAnh, T4.CliNom, T1.BarSit, T3.Dsc_Idtx AS BarIdtxDc, T1.BarIdtx2 AS BarIdtx2, T1.BarSerDsc2," ;
      scmdbuf += " T1.BarLocTel, T1.BarFecEnE, T1.BarOEKOTEX, T1.BarFecCli, T1.BarFecFpr, T1.BarFecSal, T1.BarFecGen, T1.BarColNum, T1.BarNomCli, T1.BarColNom, T1.BarSerDsc, T1.BarSer," ;
      scmdbuf += " T1.BarTipArt, T1.CliCod, T1.EmprCod, COALESCE( T6.Tb1_Dsc, ' ') AS BarCuadern, COALESCE( T7.IntCod, 0) AS BarIntColo, COALESCE( T7.MatCod, 0) AS BarMatColo, COALESCE(" ;
      scmdbuf += " T11.BarNorma, ' ') AS BarNorma, COALESCE( T2.BarHDSusp, 0) AS BarHDSusp, COALESCE( T9.BarAlbMts, 0) AS BarAlbMts, COALESCE( T10.BarAccesor, '') AS BarAccesor, COALESCE(" ;
      scmdbuf += " T9.BarAlbKgs, 0) AS BarAlbKgs, T1.BarTipCol, COALESCE( T8.KilosEntre, 0) AS KilosEntre, COALESCE( T5.BarKgm, 0) AS BarKgm, COALESCE( T8.MetrosEntr, 0) AS MetrosEntr," ;
      scmdbuf += " COALESCE( T5.BarMtr, 0) AS BarMtr, T1.DisCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarDisNum, T1.BarEncCli FROM (((((((((TXPBARCAD T1 LEFT JOIN (SELECT MIN(T12.Stp_Est)" ;
      scmdbuf += " AS BarHDSusp, T13.BarCod, T13.BarCodReo, T13.BarCodPar FROM (TXPHDSTO1 T12 INNER JOIN TXPBARCAD T13 ON T13.EmprCod = T12.EmprCod) WHERE (T12.EmprCod = ?) AND (T13.BarCod" ;
      scmdbuf += " = T12.Stp_hdr) AND (T13.BarCodReo = T12.Stp_r) AND (T13.BarCodPar = T12.Stp_p) AND (T12.Stp_Est = 1) GROUP BY T13.BarCod, T13.BarCodReo, T13.BarCodPar ) T2 ON T2.BarCod" ;
      scmdbuf += " = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPINDITE T3 ON T3.EmprCod = T1.EmprCod AND T3.Cod_Idtx = T1.BarIdtx2) LEFT" ;
      scmdbuf += " JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTABLE1 T6 ON T6.EmprCod = T1.EmprCod AND T6.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN TXPCFORMU T7 ON T7.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T7.CliCod = T1.CliCod AND T7.ForSer = T1.BarSer AND T7.ForColNom = T1.BarColNom AND T7.ForColNum = T1.BarColNum AND T7.TipColCod = T1.BarTipCol) LEFT JOIN (SELECT" ;
      scmdbuf += " SUM(BarMetLan) AS MetrosEntr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarKilLan) AS KilosEntre FROM TXPBARPIE WHERE BarPieEst = 1 GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T8 ON T8.EmprCod = T1.EmprCod AND T8.BarCod = T1.BarCod AND T8.BarCodReo = T1.BarCodReo AND T8.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarAlbMtrE)" ;
      scmdbuf += " AS BarAlbMts, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarAlbKgmE) AS BarAlbKgs FROM TXPALBBAR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T9.BarCod = T1.BarCod AND T9.BarCodReo = T1.BarCodReo AND T9.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT COALESCE( T13.GXC3, 'N') AS BarAccesor," ;
      scmdbuf += " T12.EmprCod, T12.BarCod, T12.BarCodReo, T12.BarCodPar FROM (TXPBARCAD T12 LEFT JOIN (SELECT MIN('S') AS GXC3, T15.BarCod, T15.BarCodReo, T15.BarCodPar FROM (TXPLMACRO" ;
      scmdbuf += " T14 INNER JOIN TXPBARCAD T15 ON T15.EmprCod = T14.EmprCod) WHERE T14.EmprCod = ? and T14.MacBarCod = T15.BarCod and T14.MacBarReo = T15.BarCodReo and T14.MacBarPar" ;
      scmdbuf += " = T15.BarCodPar GROUP BY T15.BarCod, T15.BarCodReo, T15.BarCodPar ) T13 ON T13.BarCod = T12.BarCod AND T13.BarCodReo = T12.BarCodReo AND T13.BarCodPar = T12.BarCodPar)" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T1.EmprCod AND T10.BarCod = T1.BarCod AND T10.BarCodReo = T1.BarCodReo AND T10.BarCodPar = T1.BarCodPar),  (SELECT MIN(DisNormID) AS BarNorma" ;
      scmdbuf += " FROM TXPDISNOR WHERE EmprCod = ? and DisCod = ? ) T11" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarSit >= 9)");
      if ( ! (0==AV46TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int24[5] = (byte)(1) ;
      }
      if ( ! (0==AV47TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int24[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int24[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV30TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV29TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV30TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int24[10] = (byte)(1) ;
      }
      if ( ! (0==AV49TFBarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int24[11] = (byte)(1) ;
      }
      if ( ! (0==AV50TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int24[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV52TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int24[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV58TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int24[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV61TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int24[18] = (byte)(1) ;
      }
      if ( ! (0==AV64TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int24[19] = (byte)(1) ;
      }
      if ( ! (0==AV65TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int24[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67TFBarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int24[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int24[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int24[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int24[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int24[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV41BarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int24[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42BarFecSal_To)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int24[27] = (byte)(1) ;
      }
      if ( ! (0==AV96CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int24[28] = (byte)(1) ;
      }
      if ( ! (0==AV97CliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int24[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98BarSer)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int24[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99BarSer_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int24[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100BarColNom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int24[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101BarColNom_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int24[33] = (byte)(1) ;
      }
      if ( ! (0==AV139BarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int24[34] = (byte)(1) ;
      }
      if ( ! (0==AV140BarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int24[35] = (byte)(1) ;
      }
      if ( ! (0==AV136BarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int24[36] = (byte)(1) ;
      }
      if ( ! (0==AV138BarTipArt_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int24[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarTipArt" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarTipArt DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecCli" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecCli DESC" ;
      }
      GXv_Object25[0] = scmdbuf ;
      GXv_Object25[1] = GXv_int24 ;
      return GXv_Object25 ;
   }

   protected Object[] conditional_H00MV17( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV46TFCliCod ,
                                           int AV47TFCliCod_To ,
                                           String AV27TFCliNom_Sel ,
                                           String AV26TFCliNom ,
                                           String AV30TFBarNHdr_Sel ,
                                           String AV29TFBarNHdr ,
                                           short AV49TFBarTipArt ,
                                           short AV50TFBarTipArt_To ,
                                           String AV53TFBarSer_Sel ,
                                           String AV52TFBarSer ,
                                           String AV59TFBarColNom_Sel ,
                                           String AV58TFBarColNom ,
                                           String AV62TFBarNomCli_Sel ,
                                           String AV61TFBarNomCli ,
                                           int AV64TFBarColNum ,
                                           int AV65TFBarColNum_To ,
                                           java.util.Date AV67TFBarFecCli ,
                                           java.math.BigDecimal AV72TFBarKgm ,
                                           java.math.BigDecimal AV73TFBarKgm_To ,
                                           java.math.BigDecimal AV81TFBarMtr ,
                                           java.math.BigDecimal AV82TFBarMtr_To ,
                                           java.util.Date AV41BarFecSal ,
                                           java.util.Date AV42BarFecSal_To ,
                                           int AV96CliCod ,
                                           int AV97CliCod_To ,
                                           String AV98BarSer ,
                                           String AV99BarSer_To ,
                                           String AV100BarColNom ,
                                           String AV101BarColNom_To ,
                                           int AV139BarColNum ,
                                           int AV140BarColNum_To ,
                                           short AV136BarTipArt ,
                                           short AV138BarTipArt_to ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A217BarTipArt ,
                                           String A212BarSer ,
                                           String A135BarColNom ,
                                           String A1234BarNomCli ,
                                           int A136BarColNum ,
                                           java.util.Date A155BarFecCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           java.util.Date A161BarFecSal ,
                                           short AV12OrderedBy ,
                                           boolean AV13OrderedDsc ,
                                           String AV151TFPedidoCliente_Sel ,
                                           String AV150TFPedidoCliente ,
                                           String A13878PedidoClie ,
                                           String AV44BarEncCli ,
                                           String AV134BarEncCli_to ,
                                           byte A213BarSit ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[38];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT T7.ForSer, T7.ForColNom, T7.ForColNum, T7.TipColCod, T6.Tb1_Cod, T1.BarAcaAnh, T4.CliNom, T1.BarSit, T3.Dsc_Idtx AS BarIdtxDc, T1.BarIdtx2 AS BarIdtx2, T1.BarSerDsc2," ;
      scmdbuf += " T1.BarLocTel, T1.BarFecEnE, T1.BarOEKOTEX, T1.BarFecCli, T1.BarFecFpr, T1.BarFecSal, T1.BarFecGen, T1.BarColNum, T1.BarNomCli, T1.BarColNom, T1.BarSerDsc, T1.BarSer," ;
      scmdbuf += " T1.BarTipArt, T1.CliCod, T1.EmprCod, COALESCE( T6.Tb1_Dsc, ' ') AS BarCuadern, COALESCE( T7.IntCod, 0) AS BarIntColo, COALESCE( T7.MatCod, 0) AS BarMatColo, COALESCE(" ;
      scmdbuf += " T11.BarNorma, ' ') AS BarNorma, COALESCE( T2.BarHDSusp, 0) AS BarHDSusp, COALESCE( T9.BarAlbMts, 0) AS BarAlbMts, COALESCE( T10.BarAccesor, '') AS BarAccesor, COALESCE(" ;
      scmdbuf += " T9.BarAlbKgs, 0) AS BarAlbKgs, T1.BarTipCol, COALESCE( T8.KilosEntre, 0) AS KilosEntre, COALESCE( T5.BarKgm, 0) AS BarKgm, COALESCE( T8.MetrosEntr, 0) AS MetrosEntr," ;
      scmdbuf += " COALESCE( T5.BarMtr, 0) AS BarMtr, T1.DisCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarDisNum, T1.BarEncCli FROM (((((((((TXPBARCAD T1 LEFT JOIN (SELECT MIN(T12.Stp_Est)" ;
      scmdbuf += " AS BarHDSusp, T13.BarCod, T13.BarCodReo, T13.BarCodPar FROM (TXPHDSTO1 T12 INNER JOIN TXPBARCAD T13 ON T13.EmprCod = T12.EmprCod) WHERE (T12.EmprCod = ?) AND (T13.BarCod" ;
      scmdbuf += " = T12.Stp_hdr) AND (T13.BarCodReo = T12.Stp_r) AND (T13.BarCodPar = T12.Stp_p) AND (T12.Stp_Est = 1) GROUP BY T13.BarCod, T13.BarCodReo, T13.BarCodPar ) T2 ON T2.BarCod" ;
      scmdbuf += " = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPINDITE T3 ON T3.EmprCod = T1.EmprCod AND T3.Cod_Idtx = T1.BarIdtx2) LEFT" ;
      scmdbuf += " JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTABLE1 T6 ON T6.EmprCod = T1.EmprCod AND T6.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN TXPCFORMU T7 ON T7.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T7.CliCod = T1.CliCod AND T7.ForSer = T1.BarSer AND T7.ForColNom = T1.BarColNom AND T7.ForColNum = T1.BarColNum AND T7.TipColCod = T1.BarTipCol) LEFT JOIN (SELECT" ;
      scmdbuf += " SUM(BarMetLan) AS MetrosEntr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarKilLan) AS KilosEntre FROM TXPBARPIE WHERE BarPieEst = 1 GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T8 ON T8.EmprCod = T1.EmprCod AND T8.BarCod = T1.BarCod AND T8.BarCodReo = T1.BarCodReo AND T8.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarAlbMtrE)" ;
      scmdbuf += " AS BarAlbMts, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarAlbKgmE) AS BarAlbKgs FROM TXPALBBAR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T9.BarCod = T1.BarCod AND T9.BarCodReo = T1.BarCodReo AND T9.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT COALESCE( T13.GXC3, 'N') AS BarAccesor," ;
      scmdbuf += " T12.EmprCod, T12.BarCod, T12.BarCodReo, T12.BarCodPar FROM (TXPBARCAD T12 LEFT JOIN (SELECT MIN('S') AS GXC3, T15.BarCod, T15.BarCodReo, T15.BarCodPar FROM (TXPLMACRO" ;
      scmdbuf += " T14 INNER JOIN TXPBARCAD T15 ON T15.EmprCod = T14.EmprCod) WHERE T14.EmprCod = ? and T14.MacBarCod = T15.BarCod and T14.MacBarReo = T15.BarCodReo and T14.MacBarPar" ;
      scmdbuf += " = T15.BarCodPar GROUP BY T15.BarCod, T15.BarCodReo, T15.BarCodPar ) T13 ON T13.BarCod = T12.BarCod AND T13.BarCodReo = T12.BarCodReo AND T13.BarCodPar = T12.BarCodPar)" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T1.EmprCod AND T10.BarCod = T1.BarCod AND T10.BarCodReo = T1.BarCodReo AND T10.BarCodPar = T1.BarCodPar),  (SELECT MIN(DisNormID) AS BarNorma" ;
      scmdbuf += " FROM TXPDISNOR WHERE EmprCod = ? and DisCod = ? ) T11" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarSit >= 9)");
      if ( ! (0==AV46TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int26[5] = (byte)(1) ;
      }
      if ( ! (0==AV47TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int26[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int26[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV30TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV29TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV30TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int26[10] = (byte)(1) ;
      }
      if ( ! (0==AV49TFBarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int26[11] = (byte)(1) ;
      }
      if ( ! (0==AV50TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int26[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV52TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int26[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV58TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int26[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV61TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int26[18] = (byte)(1) ;
      }
      if ( ! (0==AV64TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int26[19] = (byte)(1) ;
      }
      if ( ! (0==AV65TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int26[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67TFBarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int26[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int26[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int26[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int26[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int26[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV41BarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int26[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42BarFecSal_To)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int26[27] = (byte)(1) ;
      }
      if ( ! (0==AV96CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int26[28] = (byte)(1) ;
      }
      if ( ! (0==AV97CliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int26[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98BarSer)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int26[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99BarSer_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int26[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100BarColNom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int26[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101BarColNom_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int26[33] = (byte)(1) ;
      }
      if ( ! (0==AV139BarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int26[34] = (byte)(1) ;
      }
      if ( ! (0==AV140BarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int26[35] = (byte)(1) ;
      }
      if ( ! (0==AV136BarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int26[36] = (byte)(1) ;
      }
      if ( ! (0==AV138BarTipArt_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int26[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarTipArt" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarTipArt DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecCli" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecCli DESC" ;
      }
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
   }

   protected Object[] conditional_H00MV20( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV27TFCliNom_Sel ,
                                           String AV26TFCliNom ,
                                           java.math.BigDecimal AV72TFBarKgm ,
                                           java.math.BigDecimal AV73TFBarKgm_To ,
                                           java.math.BigDecimal AV81TFBarMtr ,
                                           java.math.BigDecimal AV82TFBarMtr_To ,
                                           String A279CliNom ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int28 = new byte[17];
      Object[] GXv_Object29 = new Object[2];
      scmdbuf = "SELECT SUM(BarAlbKgmE) AS BarAlbKgs, SUM(BarAlbMtrE) AS BarAlbMts FROM TXPALBBAR" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(?) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ? = ?))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ? >= ?))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ? <= ?))");
      scmdbuf += sWhereString ;
      GXv_Object29[0] = scmdbuf ;
      GXv_Object29[1] = GXv_int28 ;
      return GXv_Object29 ;
   }

   protected Object[] conditional_H00MV22( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV46TFCliCod ,
                                           int AV47TFCliCod_To ,
                                           String AV27TFCliNom_Sel ,
                                           String AV26TFCliNom ,
                                           String AV30TFBarNHdr_Sel ,
                                           String AV29TFBarNHdr ,
                                           short AV49TFBarTipArt ,
                                           short AV50TFBarTipArt_To ,
                                           String AV53TFBarSer_Sel ,
                                           String AV52TFBarSer ,
                                           String AV59TFBarColNom_Sel ,
                                           String AV58TFBarColNom ,
                                           String AV62TFBarNomCli_Sel ,
                                           String AV61TFBarNomCli ,
                                           int AV64TFBarColNum ,
                                           int AV65TFBarColNum_To ,
                                           java.util.Date AV67TFBarFecCli ,
                                           java.math.BigDecimal AV72TFBarKgm ,
                                           java.math.BigDecimal AV73TFBarKgm_To ,
                                           java.math.BigDecimal AV81TFBarMtr ,
                                           java.math.BigDecimal AV82TFBarMtr_To ,
                                           java.util.Date AV41BarFecSal ,
                                           java.util.Date AV42BarFecSal_To ,
                                           int AV96CliCod ,
                                           int AV97CliCod_To ,
                                           String AV98BarSer ,
                                           String AV99BarSer_To ,
                                           String AV100BarColNom ,
                                           String AV101BarColNom_To ,
                                           int AV139BarColNum ,
                                           int AV140BarColNum_To ,
                                           short AV136BarTipArt ,
                                           short AV138BarTipArt_to ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A217BarTipArt ,
                                           String A212BarSer ,
                                           String A135BarColNom ,
                                           String A1234BarNomCli ,
                                           int A136BarColNum ,
                                           java.util.Date A155BarFecCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           java.util.Date A161BarFecSal ,
                                           String AV151TFPedidoCliente_Sel ,
                                           String AV150TFPedidoCliente ,
                                           String A13878PedidoClie ,
                                           String AV44BarEncCli ,
                                           String AV134BarEncCli_to ,
                                           byte A213BarSit ,
                                           String AV131EmprCod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int30 = new byte[34];
      Object[] GXv_Object31 = new Object[2];
      scmdbuf = "SELECT T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarColNum, T1.BarNomCli, T1.BarColNom, T1.BarSer, T1.BarTipArt, T2.CliNom, T1.CliCod, COALESCE( T3.BarMtr, 0) AS" ;
      scmdbuf += " BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarDisNum, T1.BarEncCli FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm" ;
      scmdbuf += " FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarSit >= 9)");
      if ( ! (0==AV46TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int30[1] = (byte)(1) ;
      }
      if ( ! (0==AV47TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int30[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int30[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV30TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV29TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV30TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int30[6] = (byte)(1) ;
      }
      if ( ! (0==AV49TFBarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int30[7] = (byte)(1) ;
      }
      if ( ! (0==AV50TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int30[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV52TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int30[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV58TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int30[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV61TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int30[14] = (byte)(1) ;
      }
      if ( ! (0==AV64TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int30[15] = (byte)(1) ;
      }
      if ( ! (0==AV65TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int30[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67TFBarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int30[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int30[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int30[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int30[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int30[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV41BarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int30[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42BarFecSal_To)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int30[23] = (byte)(1) ;
      }
      if ( ! (0==AV96CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int30[24] = (byte)(1) ;
      }
      if ( ! (0==AV97CliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int30[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98BarSer)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int30[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99BarSer_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int30[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100BarColNom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int30[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101BarColNom_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int30[29] = (byte)(1) ;
      }
      if ( ! (0==AV139BarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int30[30] = (byte)(1) ;
      }
      if ( ! (0==AV140BarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int30[31] = (byte)(1) ;
      }
      if ( ! (0==AV136BarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int30[32] = (byte)(1) ;
      }
      if ( ! (0==AV138BarTipArt_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int30[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object31[0] = scmdbuf ;
      GXv_Object31[1] = GXv_int30 ;
      return GXv_Object31 ;
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
                  return conditional_H00MV9(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (java.util.Date)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , (java.util.Date)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.util.Date)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Boolean) dynConstraints[48]).booleanValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] );
            case 1 :
                  return conditional_H00MV17(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (java.util.Date)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , (java.util.Date)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.util.Date)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Boolean) dynConstraints[48]).booleanValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] );
            case 3 :
                  return conditional_H00MV20(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] );
            case 4 :
                  return conditional_H00MV22(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (java.util.Date)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , (java.util.Date)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00MV9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00MV17", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00MV19", "SELECT COALESCE( T1.BarNorma, ' ') AS BarNorma FROM (SELECT MIN(DisNormID) AS BarNorma FROM TXPDISNOR WHERE EmprCod = ? and DisCod = ? ) T1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00MV20", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00MV22", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00MV23", "SELECT SUM(BarAlbKgmE) AS BarAlbKgs, SUM(BarAlbMtrE) AS BarAlbMts FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00MV24", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00MV25", "SELECT COALESCE( IntCod, 0) AS BarIntColo, COALESCE( MatCod, 0) AS BarMatColo FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00MV26", "SELECT Dsc_Idtx AS BarIdtxDc FROM TXPINDITE WHERE EmprCod = ? AND Cod_Idtx = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 60);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 4);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 10);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(13);
               ((String[]) buf[16])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(16);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(17);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(18);
               ((int[]) buf[22])[0] = rslt.getInt(19);
               ((String[]) buf[23])[0] = rslt.getString(20, 13);
               ((String[]) buf[24])[0] = rslt.getString(21, 13);
               ((String[]) buf[25])[0] = rslt.getString(22, 26);
               ((String[]) buf[26])[0] = rslt.getString(23, 16);
               ((short[]) buf[27])[0] = rslt.getShort(24);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(25);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(26, 3);
               ((String[]) buf[32])[0] = rslt.getString(27, 20);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((byte[]) buf[34])[0] = rslt.getByte(28);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(29);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(30, 4);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((byte[]) buf[40])[0] = rslt.getByte(31);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(32,2);
               ((String[]) buf[43])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(34,2);
               ((byte[]) buf[46])[0] = rslt.getByte(35);
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(36,2);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(37,2);
               ((short[]) buf[49])[0] = rslt.getShort(38);
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(39,2);
               ((int[]) buf[51])[0] = rslt.getInt(40);
               ((String[]) buf[52])[0] = rslt.getString(41, 1);
               ((byte[]) buf[53])[0] = rslt.getByte(42);
               ((int[]) buf[54])[0] = rslt.getInt(43);
               ((String[]) buf[55])[0] = rslt.getString(44, 8);
               ((String[]) buf[56])[0] = rslt.getString(45, 20);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 60);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 4);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 10);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(13);
               ((String[]) buf[16])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(16);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(17);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(18);
               ((int[]) buf[22])[0] = rslt.getInt(19);
               ((String[]) buf[23])[0] = rslt.getString(20, 13);
               ((String[]) buf[24])[0] = rslt.getString(21, 13);
               ((String[]) buf[25])[0] = rslt.getString(22, 26);
               ((String[]) buf[26])[0] = rslt.getString(23, 16);
               ((short[]) buf[27])[0] = rslt.getShort(24);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(25);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(26, 3);
               ((String[]) buf[32])[0] = rslt.getString(27, 20);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((byte[]) buf[34])[0] = rslt.getByte(28);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(29);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(30, 4);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((byte[]) buf[40])[0] = rslt.getByte(31);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(32,2);
               ((String[]) buf[43])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(34,2);
               ((byte[]) buf[46])[0] = rslt.getByte(35);
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(36,2);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(37,2);
               ((short[]) buf[49])[0] = rslt.getShort(38);
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(39,2);
               ((int[]) buf[51])[0] = rslt.getInt(40);
               ((String[]) buf[52])[0] = rslt.getString(41, 1);
               ((byte[]) buf[53])[0] = rslt.getByte(42);
               ((int[]) buf[54])[0] = rslt.getInt(43);
               ((String[]) buf[55])[0] = rslt.getString(44, 8);
               ((String[]) buf[56])[0] = rslt.getString(45, 20);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[14])[0] = rslt.getString(13, 3);
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 8);
               ((String[]) buf[19])[0] = rslt.getString(18, 20);
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[38], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 11);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 16);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 11);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 16);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 20);
               }
               return;
            case 4 :
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
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
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
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
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
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               stmt.setString(4, (String)parms[4], 13);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
               }
               return;
      }
   }

}

