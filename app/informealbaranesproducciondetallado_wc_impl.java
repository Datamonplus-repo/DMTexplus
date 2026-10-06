package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informealbaranesproducciondetallado_wc_impl extends GXWebComponent
{
   public informealbaranesproducciondetallado_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public informealbaranesproducciondetallado_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informealbaranesproducciondetallado_wc_impl.class ));
   }

   public informealbaranesproducciondetallado_wc_impl( int remoteHandle ,
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
               AV80EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80EmprCod", AV80EmprCod);
               AV95Prio = httpContext.GetPar( "Prio") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95Prio", AV95Prio);
               AV81Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81Clicod), 6, 0));
               AV82Clicod_to = (int)(GXutil.lval( httpContext.GetPar( "Clicod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82Clicod_to), 6, 0));
               AV83ALbProfch = localUtil.parseDateParm( httpContext.GetPar( "ALbProfch")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83ALbProfch", localUtil.format(AV83ALbProfch, "99/99/99"));
               AV84ALbProfch_to = localUtil.parseDateParm( httpContext.GetPar( "ALbProfch_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84ALbProfch_to", localUtil.format(AV84ALbProfch_to, "99/99/99"));
               AV85Barser = httpContext.GetPar( "Barser") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85Barser", AV85Barser);
               AV86Barser_to = httpContext.GetPar( "Barser_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86Barser_to", AV86Barser_to);
               AV87AlbEncCli = httpContext.GetPar( "AlbEncCli") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87AlbEncCli", AV87AlbEncCli);
               AV88AlbEncCli_to = httpContext.GetPar( "AlbEncCli_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88AlbEncCli_to", AV88AlbEncCli_to);
               AV120BarColNom = httpContext.GetPar( "BarColNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120BarColNom", AV120BarColNom);
               AV119BarColNom_to = httpContext.GetPar( "BarColNom_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119BarColNom_to", AV119BarColNom_to);
               AV90BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90BarColNum), 6, 0));
               AV91BarColNum_to = (int)(GXutil.lval( httpContext.GetPar( "BarColNum_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91BarColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91BarColNum_to), 6, 0));
               AV100Barestreo = (byte)(GXutil.lval( httpContext.GetPar( "Barestreo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100Barestreo", GXutil.str( AV100Barestreo, 1, 0));
               AV137Barestreoi = (byte)(GXutil.lval( httpContext.GetPar( "Barestreoi"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV137Barestreoi", GXutil.str( AV137Barestreoi, 1, 0));
               AV138Barestreof = (byte)(GXutil.lval( httpContext.GetPar( "Barestreof"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV138Barestreof", GXutil.str( AV138Barestreof, 1, 0));
               AV99Tipdiscod = httpContext.GetPar( "Tipdiscod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99Tipdiscod", AV99Tipdiscod);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV80EmprCod,AV95Prio,Integer.valueOf(AV81Clicod),Integer.valueOf(AV82Clicod_to),AV83ALbProfch,AV84ALbProfch_to,AV85Barser,AV86Barser_to,AV87AlbEncCli,AV88AlbEncCli_to,AV120BarColNom,AV119BarColNom_to,Integer.valueOf(AV90BarColNum),Integer.valueOf(AV91BarColNum_to),Byte.valueOf(AV100Barestreo),Byte.valueOf(AV137Barestreoi),Byte.valueOf(AV138Barestreof),AV99Tipdiscod});
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
      nRC_GXsfl_36 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_36"))) ;
      nGXsfl_36_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_36_idx"))) ;
      sGXsfl_36_idx = httpContext.GetPar( "sGXsfl_36_idx") ;
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
      AV80EmprCod = httpContext.GetPar( "EmprCod") ;
      AV95Prio = httpContext.GetPar( "Prio") ;
      AV81Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
      AV82Clicod_to = (int)(GXutil.lval( httpContext.GetPar( "Clicod_to"))) ;
      AV83ALbProfch = localUtil.parseDateParm( httpContext.GetPar( "ALbProfch")) ;
      AV84ALbProfch_to = localUtil.parseDateParm( httpContext.GetPar( "ALbProfch_to")) ;
      AV85Barser = httpContext.GetPar( "Barser") ;
      AV86Barser_to = httpContext.GetPar( "Barser_to") ;
      AV87AlbEncCli = httpContext.GetPar( "AlbEncCli") ;
      AV88AlbEncCli_to = httpContext.GetPar( "AlbEncCli_to") ;
      AV120BarColNom = httpContext.GetPar( "BarColNom") ;
      AV119BarColNom_to = httpContext.GetPar( "BarColNom_to") ;
      AV90BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
      AV91BarColNum_to = (int)(GXutil.lval( httpContext.GetPar( "BarColNum_to"))) ;
      AV137Barestreoi = (byte)(GXutil.lval( httpContext.GetPar( "Barestreoi"))) ;
      AV138Barestreof = (byte)(GXutil.lval( httpContext.GetPar( "Barestreof"))) ;
      AV99Tipdiscod = httpContext.GetPar( "Tipdiscod") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV26ColumnsSelector);
      AV152Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV131TFIntDsc = httpContext.GetPar( "TFIntDsc") ;
      AV132TFIntDsc_Sel = httpContext.GetPar( "TFIntDsc_Sel") ;
      AV100Barestreo = (byte)(GXutil.lval( httpContext.GetPar( "Barestreo"))) ;
      AV127TotBarKgm = CommonUtil.decimalVal( httpContext.GetPar( "TotBarKgm"), ".") ;
      AV144moda21 = (short)(GXutil.lval( httpContext.GetPar( "moda21"))) ;
      AV121TotBarAlbKgmE = CommonUtil.decimalVal( httpContext.GetPar( "TotBarAlbKgmE"), ".") ;
      AV123TotBarAlbMtrE = CommonUtil.decimalVal( httpContext.GetPar( "TotBarAlbMtrE"), ".") ;
      AV125TotBarAlbPie = GXutil.lval( httpContext.GetPar( "TotBarAlbPie")) ;
      AV18TipColDsc = httpContext.GetPar( "TipColDsc") ;
      AV19IntDsc = httpContext.GetPar( "IntDsc") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV80EmprCod, AV95Prio, AV81Clicod, AV82Clicod_to, AV83ALbProfch, AV84ALbProfch_to, AV85Barser, AV86Barser_to, AV87AlbEncCli, AV88AlbEncCli_to, AV120BarColNom, AV119BarColNom_to, AV90BarColNum, AV91BarColNum_to, AV137Barestreoi, AV138Barestreof, AV99Tipdiscod, AV26ColumnsSelector, AV152Pgmname, AV12OrderedBy, AV13OrderedDsc, AV131TFIntDsc, AV132TFIntDsc_Sel, AV100Barestreo, AV127TotBarKgm, AV144moda21, AV121TotBarAlbKgmE, AV123TotBarAlbMtrE, AV125TotBarAlbPie, AV18TipColDsc, AV19IntDsc, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1BA2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Informe de Albaranes Produccion (Detalle)", "")) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.informealbaranesproducciondetallado_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV80EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV95Prio)),GXutil.URLEncode(GXutil.ltrimstr(AV81Clicod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV82Clicod_to,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV83ALbProfch)),GXutil.URLEncode(GXutil.formatDateParm(AV84ALbProfch_to)),GXutil.URLEncode(GXutil.rtrim(AV85Barser)),GXutil.URLEncode(GXutil.rtrim(AV86Barser_to)),GXutil.URLEncode(GXutil.rtrim(AV87AlbEncCli)),GXutil.URLEncode(GXutil.rtrim(AV88AlbEncCli_to)),GXutil.URLEncode(GXutil.rtrim(AV120BarColNom)),GXutil.URLEncode(GXutil.rtrim(AV119BarColNom_to)),GXutil.URLEncode(GXutil.ltrimstr(AV90BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV91BarColNum_to,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV100Barestreo,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV137Barestreoi,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV138Barestreof,1,0)),GXutil.URLEncode(GXutil.rtrim(AV99Tipdiscod))}, new String[] {"EmprCod","Prio","Clicod","Clicod_to","ALbProfch","ALbProfch_to","Barser","Barser_to","AlbEncCli","AlbEncCli_to","BarColNom","BarColNom_to","BarColNum","BarColNum_to","Barestreo","Barestreoi","Barestreof","Tipdiscod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV127TotBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV144moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBKGME", getSecureSignedToken( sPrefix, localUtil.format( AV121TotBarAlbKgmE, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBMTRE", getSecureSignedToken( sPrefix, localUtil.format( AV123TotBarAlbMtrE, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV125TotBarAlbPie), "ZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"InformeAlbaranesProduccionDetallado_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV152Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("informealbaranesproducciondetallado_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_36", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_36, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV74GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV75GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV72DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV72DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV26ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV26ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV80EmprCod", GXutil.rtrim( wcpOAV80EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV95Prio", GXutil.rtrim( wcpOAV95Prio));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV81Clicod", GXutil.ltrim( localUtil.ntoc( wcpOAV81Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV82Clicod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV82Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV83ALbProfch", localUtil.dtoc( wcpOAV83ALbProfch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV84ALbProfch_to", localUtil.dtoc( wcpOAV84ALbProfch_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV85Barser", GXutil.rtrim( wcpOAV85Barser));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV86Barser_to", GXutil.rtrim( wcpOAV86Barser_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV87AlbEncCli", GXutil.rtrim( wcpOAV87AlbEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV88AlbEncCli_to", GXutil.rtrim( wcpOAV88AlbEncCli_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV120BarColNom", GXutil.rtrim( wcpOAV120BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV119BarColNom_to", GXutil.rtrim( wcpOAV119BarColNom_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV90BarColNum", GXutil.ltrim( localUtil.ntoc( wcpOAV90BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV91BarColNum_to", GXutil.ltrim( localUtil.ntoc( wcpOAV91BarColNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV100Barestreo", GXutil.ltrim( localUtil.ntoc( wcpOAV100Barestreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV137Barestreoi", GXutil.ltrim( localUtil.ntoc( wcpOAV137Barestreoi, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV138Barestreof", GXutil.ltrim( localUtil.ntoc( wcpOAV138Barestreof, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV99Tipdiscod", GXutil.rtrim( wcpOAV99Tipdiscod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFINTDSC", GXutil.rtrim( AV131TFIntDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFINTDSC_SEL", GXutil.rtrim( AV132TFIntDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV80EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRIO", GXutil.rtrim( AV95Prio));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV81Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV82Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBPROFCH", localUtil.dtoc( AV83ALbProfch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBPROFCH_TO", localUtil.dtoc( AV84ALbProfch_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSER", GXutil.rtrim( AV85Barser));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSER_TO", GXutil.rtrim( AV86Barser_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBENCCLI", GXutil.rtrim( AV87AlbEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBENCCLI_TO", GXutil.rtrim( AV88AlbEncCli_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOM", GXutil.rtrim( AV120BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOM_TO", GXutil.rtrim( AV119BarColNom_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV90BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV91BarColNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARESTREO", GXutil.ltrim( localUtil.ntoc( AV100Barestreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARESTREOI", GXutil.ltrim( localUtil.ntoc( AV137Barestreoi, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARESTREOF", GXutil.ltrim( localUtil.ntoc( AV138Barestreof, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPDISCOD", GXutil.rtrim( AV99Tipdiscod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBPROPRI", GXutil.rtrim( A39AlbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARESTREO", GXutil.ltrim( localUtil.ntoc( A148BarEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARTIPDIS", GXutil.rtrim( A2010BarTipDis));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBMARCA", GXutil.rtrim( A5140AlbMarca));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARKGM", GXutil.ltrim( localUtil.ntoc( AV127TotBarKgm, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV127TotBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARALBKGME", GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV144moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV144moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARKGSCLI", GXutil.ltrim( localUtil.ntoc( A2243BarKgsCli, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARALBKGME", GXutil.ltrim( localUtil.ntoc( AV121TotBarAlbKgmE, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBKGME", getSecureSignedToken( sPrefix, localUtil.format( AV121TotBarAlbKgmE, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARALBMTRE", GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARALBPN", GXutil.ltrim( localUtil.ntoc( A1461BarAlbPN, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARALBMTRE", GXutil.ltrim( localUtil.ntoc( AV123TotBarAlbMtrE, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBMTRE", getSecureSignedToken( sPrefix, localUtil.format( AV123TotBarAlbMtrE, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARALBPIE", GXutil.ltrim( localUtil.ntoc( AV125TotBarAlbPie, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV125TotBarAlbPie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIMPCOD", GXutil.rtrim( AV96ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFUENTE", GXutil.ltrim( localUtil.ntoc( AV101Fuente, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODI", GXutil.ltrim( localUtil.ntoc( AV102Barcodi, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREOF", GXutil.ltrim( localUtil.ntoc( AV103Barcodreof, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPARF", GXutil.rtrim( AV104Barcodparf));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARMAQEST1", GXutil.rtrim( AV107BarMaqEst1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARMAQEST2", GXutil.rtrim( AV108BarMaqEst2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSERIE", GXutil.rtrim( AV97Serie));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNFI", GXutil.ltrim( localUtil.ntoc( AV109Nfi, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNFF", GXutil.ltrim( localUtil.ntoc( AV110Nff, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARLAR", GXutil.rtrim( AV98Barlar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDETALLEROLLOS", GXutil.ltrim( localUtil.ntoc( AV111DetalleRollos, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARENCCLI", GXutil.rtrim( A4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARDISNUM", GXutil.rtrim( A143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PEDIDOCLIE", GXutil.rtrim( A13878PedidoClie));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
   }

   public void renderHtmlCloseForm1BA2( )
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
      return "InformeAlbaranesProduccionDetallado_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informe de Albaranes Produccion (Detalle)", "") ;
   }

   public void wb1BA0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.informealbaranesproducciondetallado_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
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
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 36, 2, 0)+","+"null"+");", httpContext.getMessage( "PDF (Win)", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_InformeAlbaranesProduccionDetallado_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 36, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_InformeAlbaranesProduccionDetallado_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 36, 2, 0)+","+"null"+");", httpContext.getMessage( "CSV v02", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_InformeAlbaranesProduccionDetallado_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 36, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_InformeAlbaranesProduccionDetallado_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_1BA2( true) ;
      }
      else
      {
         wb_table1_25_1BA2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_1BA2e( boolean wbgen )
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
         startgridcontrol36( ) ;
      }
      if ( wbEnd == 36 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_36 = (int)(nGXsfl_36_idx-1) ;
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
         wb_table2_59_1BA2( true) ;
      }
      else
      {
         wb_table2_59_1BA2( false) ;
      }
      return  ;
   }

   public void wb_table2_59_1BA2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV74GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV75GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV152Pgmname), GXutil.rtrim( localUtil.format( AV152Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_InformeAlbaranesProduccionDetallado_WC.htm");
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
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV72DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, sPrefix+"INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV72DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV26ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, sPrefix+"GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 36 )
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

   public void start1BA2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Informe de Albaranes Produccion (Detalle)", ""), (short)(0)) ;
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
            strup1BA0( ) ;
         }
      }
   }

   public void ws1BA2( )
   {
      start1BA2( ) ;
      evt1BA2( ) ;
   }

   public void evt1BA2( )
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
                              strup1BA0( ) ;
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
                              strup1BA0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111BA2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1BA0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121BA2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1BA0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131BA2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1BA0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141BA2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1BA0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e151BA2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1BA0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e161BA2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1BA0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportReport' */
                                 e171BA2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1BA0( ) ;
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
                              strup1BA0( ) ;
                           }
                           nGXsfl_36_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_362( ) ;
                           A1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( edtGuiRemCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1244GuiRemCln = httpContext.cgiGet( edtGuiRemCln_Internalname) ;
                           A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A34AlbProfch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtAlbProfch_Internalname), 0)) ;
                           AV16BarEncCli = httpContext.cgiGet( edtavBarenccli_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarenccli_Internalname, AV16BarEncCli);
                           A155BarFecCli = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecCli_Internalname), 0)) ;
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
                           A13711BarTipArtD = httpContext.cgiGet( edtBarTipArtD_Internalname) ;
                           n13711BarTipArtD = false ;
                           A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV18TipColDsc = httpContext.cgiGet( edtavTipcoldsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipcoldsc_Internalname, AV18TipColDsc);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTIPCOLDSC"+"_"+sGXsfl_36_idx, getSecureSignedToken( sPrefix+sGXsfl_36_idx, GXutil.rtrim( localUtil.format( AV18TipColDsc, ""))));
                           AV19IntDsc = httpContext.cgiGet( edtavIntdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavIntdsc_Internalname, AV19IntDsc);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINTDSC"+"_"+sGXsfl_36_idx, getSecureSignedToken( sPrefix+sGXsfl_36_idx, GXutil.rtrim( localUtil.format( AV19IntDsc, ""))));
                           AV149BarKgm = localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarkgm_Internalname, GXutil.ltrimstr( AV149BarKgm, 9, 2));
                           AV142BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( edtavBaralbkgme_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaralbkgme_Internalname, GXutil.ltrimstr( AV142BarAlbKgmE, 9, 2));
                           AV143BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( edtavBaralbmtre_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaralbmtre_Internalname, GXutil.ltrimstr( AV143BarAlbMtrE, 9, 2));
                           A1265BarAlbPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
                                       e181BA2 ();
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
                                       e191BA2 ();
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
                                       e201BA2 ();
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
                                    strup1BA0( ) ;
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

   public void we1BA2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1BA2( ) ;
         }
      }
   }

   public void pa1BA2( )
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
      subsflControlProps_362( ) ;
      while ( nGXsfl_36_idx <= nRC_GXsfl_36 )
      {
         sendrow_362( ) ;
         nGXsfl_36_idx = ((subGrid_Islastpage==1)&&(nGXsfl_36_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_36_idx+1) ;
         sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_362( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV80EmprCod ,
                                 String AV95Prio ,
                                 int AV81Clicod ,
                                 int AV82Clicod_to ,
                                 java.util.Date AV83ALbProfch ,
                                 java.util.Date AV84ALbProfch_to ,
                                 String AV85Barser ,
                                 String AV86Barser_to ,
                                 String AV87AlbEncCli ,
                                 String AV88AlbEncCli_to ,
                                 String AV120BarColNom ,
                                 String AV119BarColNom_to ,
                                 int AV90BarColNum ,
                                 int AV91BarColNum_to ,
                                 byte AV137Barestreoi ,
                                 byte AV138Barestreof ,
                                 String AV99Tipdiscod ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelector ,
                                 String AV152Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV131TFIntDsc ,
                                 String AV132TFIntDsc_Sel ,
                                 byte AV100Barestreo ,
                                 java.math.BigDecimal AV127TotBarKgm ,
                                 short AV144moda21 ,
                                 java.math.BigDecimal AV121TotBarAlbKgmE ,
                                 java.math.BigDecimal AV123TotBarAlbMtrE ,
                                 long AV125TotBarAlbPie ,
                                 String AV18TipColDsc ,
                                 String AV19IntDsc ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e191BA2 ();
      GRID_nCurrentRecord = 0 ;
      rf1BA2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"InformeAlbaranesProduccionDetallado_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV152Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("informealbaranesproducciondetallado_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTIPCOLDSC", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV18TipColDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPCOLDSC", GXutil.rtrim( AV18TipColDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINTDSC", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV19IntDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINTDSC", GXutil.rtrim( AV19IntDsc));
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
      rf1BA2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV152Pgmname = "InformeAlbaranesProduccionDetallado_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV152Pgmname", AV152Pgmname);
      Gx_err = (short)(0) ;
      edtavBarenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavTipcoldsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipcoldsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcoldsc_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavIntdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavIntdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIntdsc_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavBaralbkgme_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaralbkgme_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbkgme_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavBaralbmtre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaralbmtre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbmtre_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavTotvaluebarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarkgm_Enabled), 5, 0), true);
      edtavTotvaluebaralbkgme_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebaralbkgme_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebaralbkgme_Enabled), 5, 0), true);
      edtavTotvaluebaralbmtre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebaralbmtre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebaralbmtre_Enabled), 5, 0), true);
      edtavTotvaluebaralbpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebaralbpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebaralbpie_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV81Clicod) ,
                                           Integer.valueOf(AV82Clicod_to) ,
                                           AV83ALbProfch ,
                                           AV84ALbProfch_to ,
                                           AV85Barser ,
                                           AV86Barser_to ,
                                           AV120BarColNom ,
                                           AV119BarColNom_to ,
                                           Integer.valueOf(AV90BarColNum) ,
                                           Integer.valueOf(AV91BarColNum_to) ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A34AlbProfch ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           A39AlbProPri ,
                                           AV95Prio ,
                                           AV87AlbEncCli ,
                                           A13878PedidoClie ,
                                           AV88AlbEncCli_to ,
                                           Byte.valueOf(A148BarEstReo) ,
                                           Byte.valueOf(AV137Barestreoi) ,
                                           Byte.valueOf(AV138Barestreof) ,
                                           A2010BarTipDis ,
                                           AV99Tipdiscod ,
                                           A5140AlbMarca ,
                                           AV80EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor H01BA2 */
      pr_default.execute(0, new Object[] {AV80EmprCod, AV95Prio, AV95Prio, Byte.valueOf(AV137Barestreoi), Byte.valueOf(AV138Barestreof), AV99Tipdiscod, AV99Tipdiscod, Integer.valueOf(AV81Clicod), Integer.valueOf(AV82Clicod_to), AV83ALbProfch, AV84ALbProfch_to, AV85Barser, AV86Barser_to, AV120BarColNom, AV119BarColNom_to, Integer.valueOf(AV90BarColNum), Integer.valueOf(AV91BarColNum_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A217BarTipArt = H01BA2_A217BarTipArt[0] ;
         n217BarTipArt = H01BA2_n217BarTipArt[0] ;
         A1253EmprGuiRem = H01BA2_A1253EmprGuiRem[0] ;
         A39AlbProPri = H01BA2_A39AlbProPri[0] ;
         A148BarEstReo = H01BA2_A148BarEstReo[0] ;
         A2010BarTipDis = H01BA2_A2010BarTipDis[0] ;
         A5140AlbMarca = H01BA2_A5140AlbMarca[0] ;
         A252CliCod = H01BA2_A252CliCod[0] ;
         n252CliCod = H01BA2_n252CliCod[0] ;
         A1261BarAlbKgmE = H01BA2_A1261BarAlbKgmE[0] ;
         A2243BarKgsCli = H01BA2_A2243BarKgsCli[0] ;
         n2243BarKgsCli = H01BA2_n2243BarKgsCli[0] ;
         A1263BarAlbMtrE = H01BA2_A1263BarAlbMtrE[0] ;
         A1461BarAlbPN = H01BA2_A1461BarAlbPN[0] ;
         A1265BarAlbPie = H01BA2_A1265BarAlbPie[0] ;
         A218BarTipCol = H01BA2_A218BarTipCol[0] ;
         A136BarColNum = H01BA2_A136BarColNum[0] ;
         A135BarColNom = H01BA2_A135BarColNom[0] ;
         A1234BarNomCli = H01BA2_A1234BarNomCli[0] ;
         A13711BarTipArtD = H01BA2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = H01BA2_n13711BarTipArtD[0] ;
         A1652BarSerDsc = H01BA2_A1652BarSerDsc[0] ;
         A212BarSer = H01BA2_A212BarSer[0] ;
         A155BarFecCli = H01BA2_A155BarFecCli[0] ;
         A34AlbProfch = H01BA2_A34AlbProfch[0] ;
         A30AlbProCod = H01BA2_A30AlbProCod[0] ;
         A1244GuiRemCln = H01BA2_A1244GuiRemCln[0] ;
         A1243GuiRemCli = H01BA2_A1243GuiRemCli[0] ;
         A130BarCodPar = H01BA2_A130BarCodPar[0] ;
         A132BarCodReo = H01BA2_A132BarCodReo[0] ;
         A129BarCod = H01BA2_A129BarCod[0] ;
         A143BarDisNum = H01BA2_A143BarDisNum[0] ;
         A4812BarEncCli = H01BA2_A4812BarEncCli[0] ;
         A396EmprCod = H01BA2_A396EmprCod[0] ;
         A217BarTipArt = H01BA2_A217BarTipArt[0] ;
         n217BarTipArt = H01BA2_n217BarTipArt[0] ;
         A148BarEstReo = H01BA2_A148BarEstReo[0] ;
         A2010BarTipDis = H01BA2_A2010BarTipDis[0] ;
         A252CliCod = H01BA2_A252CliCod[0] ;
         n252CliCod = H01BA2_n252CliCod[0] ;
         A218BarTipCol = H01BA2_A218BarTipCol[0] ;
         A136BarColNum = H01BA2_A136BarColNum[0] ;
         A135BarColNom = H01BA2_A135BarColNom[0] ;
         A1234BarNomCli = H01BA2_A1234BarNomCli[0] ;
         A1652BarSerDsc = H01BA2_A1652BarSerDsc[0] ;
         A212BarSer = H01BA2_A212BarSer[0] ;
         A155BarFecCli = H01BA2_A155BarFecCli[0] ;
         A143BarDisNum = H01BA2_A143BarDisNum[0] ;
         A4812BarEncCli = H01BA2_A4812BarEncCli[0] ;
         A1253EmprGuiRem = H01BA2_A1253EmprGuiRem[0] ;
         A39AlbProPri = H01BA2_A39AlbProPri[0] ;
         A5140AlbMarca = H01BA2_A5140AlbMarca[0] ;
         A34AlbProfch = H01BA2_A34AlbProfch[0] ;
         A1243GuiRemCli = H01BA2_A1243GuiRemCli[0] ;
         A1244GuiRemCln = H01BA2_A1244GuiRemCln[0] ;
         A13711BarTipArtD = H01BA2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = H01BA2_n13711BarTipArtD[0] ;
         GXt_char1 = A13878PedidoClie ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char5[0] = GXt_char1 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4, GXv_char5) ;
         informealbaranesproducciondetallado_wc_impl.this.A396EmprCod = GXv_char2[0] ;
         informealbaranesproducciondetallado_wc_impl.this.A4812BarEncCli = GXv_char3[0] ;
         informealbaranesproducciondetallado_wc_impl.this.A143BarDisNum = GXv_char4[0] ;
         informealbaranesproducciondetallado_wc_impl.this.GXt_char1 = GXv_char5[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4812BarEncCli", A4812BarEncCli);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143BarDisNum", A143BarDisNum);
         A13878PedidoClie = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13878PedidoClie", A13878PedidoClie);
         if ( (GXutil.strcmp("", AV87AlbEncCli)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV87AlbEncCli) >= 0 ) ) )
         {
            if ( (GXutil.strcmp("", AV88AlbEncCli_to)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV88AlbEncCli_to) <= 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
            }
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf1BA2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(36) ;
      /* Execute user event: Refresh */
      e191BA2 ();
      nGXsfl_36_idx = 1 ;
      sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_362( ) ;
      bGXsfl_36_Refreshing = true ;
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
         subsflControlProps_362( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Integer.valueOf(AV81Clicod) ,
                                              Integer.valueOf(AV82Clicod_to) ,
                                              AV83ALbProfch ,
                                              AV84ALbProfch_to ,
                                              AV85Barser ,
                                              AV86Barser_to ,
                                              AV120BarColNom ,
                                              AV119BarColNom_to ,
                                              Integer.valueOf(AV90BarColNum) ,
                                              Integer.valueOf(AV91BarColNum_to) ,
                                              Integer.valueOf(A1243GuiRemCli) ,
                                              A34AlbProfch ,
                                              A212BarSer ,
                                              A135BarColNom ,
                                              Integer.valueOf(A136BarColNum) ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              A39AlbProPri ,
                                              AV95Prio ,
                                              AV87AlbEncCli ,
                                              A13878PedidoClie ,
                                              AV88AlbEncCli_to ,
                                              Byte.valueOf(A148BarEstReo) ,
                                              Byte.valueOf(AV137Barestreoi) ,
                                              Byte.valueOf(AV138Barestreof) ,
                                              A2010BarTipDis ,
                                              AV99Tipdiscod ,
                                              A5140AlbMarca ,
                                              AV80EmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor H01BA3 */
         pr_default.execute(1, new Object[] {AV80EmprCod, AV95Prio, AV95Prio, Byte.valueOf(AV137Barestreoi), Byte.valueOf(AV138Barestreof), AV99Tipdiscod, AV99Tipdiscod, Integer.valueOf(AV81Clicod), Integer.valueOf(AV82Clicod_to), AV83ALbProfch, AV84ALbProfch_to, AV85Barser, AV86Barser_to, AV120BarColNom, AV119BarColNom_to, Integer.valueOf(AV90BarColNum), Integer.valueOf(AV91BarColNum_to)});
         nGXsfl_36_idx = 1 ;
         sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_362( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A217BarTipArt = H01BA3_A217BarTipArt[0] ;
            n217BarTipArt = H01BA3_n217BarTipArt[0] ;
            A1253EmprGuiRem = H01BA3_A1253EmprGuiRem[0] ;
            A39AlbProPri = H01BA3_A39AlbProPri[0] ;
            A148BarEstReo = H01BA3_A148BarEstReo[0] ;
            A2010BarTipDis = H01BA3_A2010BarTipDis[0] ;
            A5140AlbMarca = H01BA3_A5140AlbMarca[0] ;
            A252CliCod = H01BA3_A252CliCod[0] ;
            n252CliCod = H01BA3_n252CliCod[0] ;
            A1261BarAlbKgmE = H01BA3_A1261BarAlbKgmE[0] ;
            A2243BarKgsCli = H01BA3_A2243BarKgsCli[0] ;
            n2243BarKgsCli = H01BA3_n2243BarKgsCli[0] ;
            A1263BarAlbMtrE = H01BA3_A1263BarAlbMtrE[0] ;
            A1461BarAlbPN = H01BA3_A1461BarAlbPN[0] ;
            A1265BarAlbPie = H01BA3_A1265BarAlbPie[0] ;
            A218BarTipCol = H01BA3_A218BarTipCol[0] ;
            A136BarColNum = H01BA3_A136BarColNum[0] ;
            A135BarColNom = H01BA3_A135BarColNom[0] ;
            A1234BarNomCli = H01BA3_A1234BarNomCli[0] ;
            A13711BarTipArtD = H01BA3_A13711BarTipArtD[0] ;
            n13711BarTipArtD = H01BA3_n13711BarTipArtD[0] ;
            A1652BarSerDsc = H01BA3_A1652BarSerDsc[0] ;
            A212BarSer = H01BA3_A212BarSer[0] ;
            A155BarFecCli = H01BA3_A155BarFecCli[0] ;
            A34AlbProfch = H01BA3_A34AlbProfch[0] ;
            A30AlbProCod = H01BA3_A30AlbProCod[0] ;
            A1244GuiRemCln = H01BA3_A1244GuiRemCln[0] ;
            A1243GuiRemCli = H01BA3_A1243GuiRemCli[0] ;
            A130BarCodPar = H01BA3_A130BarCodPar[0] ;
            A132BarCodReo = H01BA3_A132BarCodReo[0] ;
            A129BarCod = H01BA3_A129BarCod[0] ;
            A143BarDisNum = H01BA3_A143BarDisNum[0] ;
            A4812BarEncCli = H01BA3_A4812BarEncCli[0] ;
            A396EmprCod = H01BA3_A396EmprCod[0] ;
            A217BarTipArt = H01BA3_A217BarTipArt[0] ;
            n217BarTipArt = H01BA3_n217BarTipArt[0] ;
            A148BarEstReo = H01BA3_A148BarEstReo[0] ;
            A2010BarTipDis = H01BA3_A2010BarTipDis[0] ;
            A252CliCod = H01BA3_A252CliCod[0] ;
            n252CliCod = H01BA3_n252CliCod[0] ;
            A218BarTipCol = H01BA3_A218BarTipCol[0] ;
            A136BarColNum = H01BA3_A136BarColNum[0] ;
            A135BarColNom = H01BA3_A135BarColNom[0] ;
            A1234BarNomCli = H01BA3_A1234BarNomCli[0] ;
            A1652BarSerDsc = H01BA3_A1652BarSerDsc[0] ;
            A212BarSer = H01BA3_A212BarSer[0] ;
            A155BarFecCli = H01BA3_A155BarFecCli[0] ;
            A143BarDisNum = H01BA3_A143BarDisNum[0] ;
            A4812BarEncCli = H01BA3_A4812BarEncCli[0] ;
            A1253EmprGuiRem = H01BA3_A1253EmprGuiRem[0] ;
            A39AlbProPri = H01BA3_A39AlbProPri[0] ;
            A5140AlbMarca = H01BA3_A5140AlbMarca[0] ;
            A34AlbProfch = H01BA3_A34AlbProfch[0] ;
            A1243GuiRemCli = H01BA3_A1243GuiRemCli[0] ;
            A1244GuiRemCln = H01BA3_A1244GuiRemCln[0] ;
            A13711BarTipArtD = H01BA3_A13711BarTipArtD[0] ;
            n13711BarTipArtD = H01BA3_n13711BarTipArtD[0] ;
            GXt_char1 = A13878PedidoClie ;
            GXv_char5[0] = A396EmprCod ;
            GXv_char4[0] = A4812BarEncCli ;
            GXv_char3[0] = A143BarDisNum ;
            GXv_char2[0] = GXt_char1 ;
            new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
            informealbaranesproducciondetallado_wc_impl.this.A396EmprCod = GXv_char5[0] ;
            informealbaranesproducciondetallado_wc_impl.this.A4812BarEncCli = GXv_char4[0] ;
            informealbaranesproducciondetallado_wc_impl.this.A143BarDisNum = GXv_char3[0] ;
            informealbaranesproducciondetallado_wc_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4812BarEncCli", A4812BarEncCli);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143BarDisNum", A143BarDisNum);
            A13878PedidoClie = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13878PedidoClie", A13878PedidoClie);
            if ( (GXutil.strcmp("", AV87AlbEncCli)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV87AlbEncCli) >= 0 ) ) )
            {
               if ( (GXutil.strcmp("", AV88AlbEncCli_to)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV88AlbEncCli_to) <= 0 ) ) )
               {
                  A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                  e201BA2 ();
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(36) ;
         wb1BA0( ) ;
      }
      bGXsfl_36_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1BA2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARKGM", GXutil.ltrim( localUtil.ntoc( AV127TotBarKgm, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV127TotBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV144moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV144moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARALBKGME", GXutil.ltrim( localUtil.ntoc( AV121TotBarAlbKgmE, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBKGME", getSecureSignedToken( sPrefix, localUtil.format( AV121TotBarAlbKgmE, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARALBMTRE", GXutil.ltrim( localUtil.ntoc( AV123TotBarAlbMtrE, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBMTRE", getSecureSignedToken( sPrefix, localUtil.format( AV123TotBarAlbMtrE, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARALBPIE", GXutil.ltrim( localUtil.ntoc( AV125TotBarAlbPie, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV125TotBarAlbPie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTIPCOLDSC"+"_"+sGXsfl_36_idx, getSecureSignedToken( sPrefix+sGXsfl_36_idx, GXutil.rtrim( localUtil.format( AV18TipColDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINTDSC"+"_"+sGXsfl_36_idx, getSecureSignedToken( sPrefix+sGXsfl_36_idx, GXutil.rtrim( localUtil.format( AV19IntDsc, ""))));
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
         gxgrgrid_refresh( subGrid_Rows, AV80EmprCod, AV95Prio, AV81Clicod, AV82Clicod_to, AV83ALbProfch, AV84ALbProfch_to, AV85Barser, AV86Barser_to, AV87AlbEncCli, AV88AlbEncCli_to, AV120BarColNom, AV119BarColNom_to, AV90BarColNum, AV91BarColNum_to, AV137Barestreoi, AV138Barestreof, AV99Tipdiscod, AV26ColumnsSelector, AV152Pgmname, AV12OrderedBy, AV13OrderedDsc, AV131TFIntDsc, AV132TFIntDsc_Sel, AV100Barestreo, AV127TotBarKgm, AV144moda21, AV121TotBarAlbKgmE, AV123TotBarAlbMtrE, AV125TotBarAlbPie, AV18TipColDsc, AV19IntDsc, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV80EmprCod, AV95Prio, AV81Clicod, AV82Clicod_to, AV83ALbProfch, AV84ALbProfch_to, AV85Barser, AV86Barser_to, AV87AlbEncCli, AV88AlbEncCli_to, AV120BarColNom, AV119BarColNom_to, AV90BarColNum, AV91BarColNum_to, AV137Barestreoi, AV138Barestreof, AV99Tipdiscod, AV26ColumnsSelector, AV152Pgmname, AV12OrderedBy, AV13OrderedDsc, AV131TFIntDsc, AV132TFIntDsc_Sel, AV100Barestreo, AV127TotBarKgm, AV144moda21, AV121TotBarAlbKgmE, AV123TotBarAlbMtrE, AV125TotBarAlbPie, AV18TipColDsc, AV19IntDsc, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV80EmprCod, AV95Prio, AV81Clicod, AV82Clicod_to, AV83ALbProfch, AV84ALbProfch_to, AV85Barser, AV86Barser_to, AV87AlbEncCli, AV88AlbEncCli_to, AV120BarColNom, AV119BarColNom_to, AV90BarColNum, AV91BarColNum_to, AV137Barestreoi, AV138Barestreof, AV99Tipdiscod, AV26ColumnsSelector, AV152Pgmname, AV12OrderedBy, AV13OrderedDsc, AV131TFIntDsc, AV132TFIntDsc_Sel, AV100Barestreo, AV127TotBarKgm, AV144moda21, AV121TotBarAlbKgmE, AV123TotBarAlbMtrE, AV125TotBarAlbPie, AV18TipColDsc, AV19IntDsc, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV80EmprCod, AV95Prio, AV81Clicod, AV82Clicod_to, AV83ALbProfch, AV84ALbProfch_to, AV85Barser, AV86Barser_to, AV87AlbEncCli, AV88AlbEncCli_to, AV120BarColNom, AV119BarColNom_to, AV90BarColNum, AV91BarColNum_to, AV137Barestreoi, AV138Barestreof, AV99Tipdiscod, AV26ColumnsSelector, AV152Pgmname, AV12OrderedBy, AV13OrderedDsc, AV131TFIntDsc, AV132TFIntDsc_Sel, AV100Barestreo, AV127TotBarKgm, AV144moda21, AV121TotBarAlbKgmE, AV123TotBarAlbMtrE, AV125TotBarAlbPie, AV18TipColDsc, AV19IntDsc, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV80EmprCod, AV95Prio, AV81Clicod, AV82Clicod_to, AV83ALbProfch, AV84ALbProfch_to, AV85Barser, AV86Barser_to, AV87AlbEncCli, AV88AlbEncCli_to, AV120BarColNom, AV119BarColNom_to, AV90BarColNum, AV91BarColNum_to, AV137Barestreoi, AV138Barestreof, AV99Tipdiscod, AV26ColumnsSelector, AV152Pgmname, AV12OrderedBy, AV13OrderedDsc, AV131TFIntDsc, AV132TFIntDsc_Sel, AV100Barestreo, AV127TotBarKgm, AV144moda21, AV121TotBarAlbKgmE, AV123TotBarAlbMtrE, AV125TotBarAlbPie, AV18TipColDsc, AV19IntDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV152Pgmname = "InformeAlbaranesProduccionDetallado_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV152Pgmname", AV152Pgmname);
      Gx_err = (short)(0) ;
      edtavBarenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavTipcoldsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipcoldsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcoldsc_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavIntdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavIntdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIntdsc_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavBaralbkgme_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaralbkgme_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbkgme_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavBaralbmtre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaralbmtre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbmtre_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavTotvaluebarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarkgm_Enabled), 5, 0), true);
      edtavTotvaluebaralbkgme_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebaralbkgme_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebaralbkgme_Enabled), 5, 0), true);
      edtavTotvaluebaralbmtre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebaralbmtre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebaralbmtre_Enabled), 5, 0), true);
      edtavTotvaluebaralbpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebaralbpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebaralbpie_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1BA0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e181BA2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV72DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV26ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_36 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_36"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV74GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV75GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV80EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV80EmprCod") ;
         wcpOAV95Prio = httpContext.cgiGet( sPrefix+"wcpOAV95Prio") ;
         wcpOAV81Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV81Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV82Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV82Clicod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV83ALbProfch = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV83ALbProfch"), 0) ;
         wcpOAV84ALbProfch_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV84ALbProfch_to"), 0) ;
         wcpOAV85Barser = httpContext.cgiGet( sPrefix+"wcpOAV85Barser") ;
         wcpOAV86Barser_to = httpContext.cgiGet( sPrefix+"wcpOAV86Barser_to") ;
         wcpOAV87AlbEncCli = httpContext.cgiGet( sPrefix+"wcpOAV87AlbEncCli") ;
         wcpOAV88AlbEncCli_to = httpContext.cgiGet( sPrefix+"wcpOAV88AlbEncCli_to") ;
         wcpOAV120BarColNom = httpContext.cgiGet( sPrefix+"wcpOAV120BarColNom") ;
         wcpOAV119BarColNom_to = httpContext.cgiGet( sPrefix+"wcpOAV119BarColNom_to") ;
         wcpOAV90BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV90BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV91BarColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV91BarColNum_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV100Barestreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV100Barestreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV137Barestreoi = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV137Barestreoi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV138Barestreof = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV138Barestreof"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV99Tipdiscod = httpContext.cgiGet( sPrefix+"wcpOAV99Tipdiscod") ;
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
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
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
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         /* Read variables values. */
         AV128TotValueBarKgm = httpContext.cgiGet( edtavTotvaluebarkgm_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV128TotValueBarKgm", AV128TotValueBarKgm);
         AV122TotValueBarAlbKgmE = httpContext.cgiGet( edtavTotvaluebaralbkgme_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122TotValueBarAlbKgmE", AV122TotValueBarAlbKgmE);
         AV124TotValueBarAlbMtrE = httpContext.cgiGet( edtavTotvaluebaralbmtre_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV124TotValueBarAlbMtrE", AV124TotValueBarAlbMtrE);
         AV126TotValueBarAlbPie = httpContext.cgiGet( edtavTotvaluebaralbpie_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126TotValueBarAlbPie", AV126TotValueBarAlbPie);
         AV152Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV152Pgmname", AV152Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"InformeAlbaranesProduccionDetallado_WC");
         AV152Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV152Pgmname", AV152Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV152Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("informealbaranesproducciondetallado_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e181BA2 ();
      if (returnInSub) return;
   }

   public void e181BA2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV139Station ;
      GXv_char5[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      informealbaranesproducciondetallado_wc_impl.this.GXt_char1 = GXv_char5[0] ;
      AV139Station = GXt_char1 ;
      GXv_char5[0] = AV80EmprCod ;
      GXv_char4[0] = AV140EmprNom ;
      GXv_char3[0] = AV141UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV139Station, GXv_char5, GXv_char4, GXv_char3) ;
      informealbaranesproducciondetallado_wc_impl.this.AV80EmprCod = GXv_char5[0] ;
      informealbaranesproducciondetallado_wc_impl.this.AV140EmprNom = GXv_char4[0] ;
      informealbaranesproducciondetallado_wc_impl.this.AV141UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80EmprCod", AV80EmprCod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, sPrefix, false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV72DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV72DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXv_int8[0] = AV135FlagPT ;
      new app.pexicon(remoteHandle, context).execute( AV80EmprCod, httpContext.getMessage( "PIETRZ", ""), GXv_int8) ;
      informealbaranesproducciondetallado_wc_impl.this.AV135FlagPT = GXv_int8[0] ;
      GXt_int9 = (byte)(AV144moda21) ;
      GXv_int8[0] = GXt_int9 ;
      new app.pexicon(remoteHandle, context).execute( AV80EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      informealbaranesproducciondetallado_wc_impl.this.GXt_int9 = GXv_int8[0] ;
      AV144moda21 = GXt_int9 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV144moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV144moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV144moda21), "ZZZ9")));
      subgrid_gotopage( 1) ;
   }

   public void e191BA2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext10[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext10) ;
      AV6WWPContext = GXv_SdtWWPContext10[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV28Session.getValue("InformeAlbaranesProduccionDetallado_WCColumnsSelector"), "") != 0 )
      {
         AV24ColumnsSelectorXML = AV28Session.getValue("InformeAlbaranesProduccionDetallado_WCColumnsSelector") ;
         AV26ColumnsSelector.fromxml(AV24ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S152 ();
         if (returnInSub) return;
      }
      edtGuiRemCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtGuiRemCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtGuiRemCln_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtGuiRemCln_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCln_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtAlbProCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbProCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtAlbProfch_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbProfch_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProfch_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavBarenccli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarenccli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarFecCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFecCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecCli_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarTipArtD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarTipArtD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipArtD_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarNomCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNomCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavTipcoldsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipcoldsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcoldsc_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavIntdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavIntdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIntdsc_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavBarkgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavBaralbkgme_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaralbkgme_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbkgme_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavBaralbmtre_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaralbmtre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbmtre_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarAlbPie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAlbPie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPie_Visible), 5, 0), !bGXsfl_36_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S162 ();
      if (returnInSub) return;
      AV74GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74GridCurrentPage), 10, 0));
      AV75GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV112WebSession.getValue("InformeAlbaranesProduccion"))), httpContext.getMessage( "FINALIZADO", "")) == 0 )
      {
         AV112WebSession.remove("InformeAlbaranesProduccion");
         AV113ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
         AV113ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
         AV113ProgressIndicator.hide();
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ColumnsSelector", AV26ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV113ProgressIndicator", AV113ProgressIndicator);
   }

   public void e111BA2( )
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
         AV73PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV73PageToGo) ;
      }
   }

   public void e121BA2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e131BA2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "IntDsc") == 0 )
         {
            AV131TFIntDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131TFIntDsc", AV131TFIntDsc);
            AV132TFIntDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV132TFIntDsc_Sel", AV132TFIntDsc_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e201BA2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         AV16BarEncCli = ((GXutil.strcmp("", A4812BarEncCli)==0) ? A143BarDisNum : A4812BarEncCli) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarenccli_Internalname, AV16BarEncCli);
         GXv_char5[0] = " " ;
         GXv_char4[0] = " " ;
         GXv_int11[0] = (short)(0) ;
         GXv_int8[0] = (byte)(0) ;
         GXv_char3[0] = AV18TipColDsc ;
         GXv_char2[0] = " " ;
         GXv_int12[0] = 0 ;
         GXv_char13[0] = " " ;
         GXv_char14[0] = " " ;
         GXv_int15[0] = (short)(0) ;
         GXv_char16[0] = " " ;
         GXv_char17[0] = " " ;
         new app.pmasinf(remoteHandle, context).execute( A396EmprCod, A252CliCod, A212BarSer, A135BarColNom, A136BarColNum, A218BarTipCol, GXv_char5, GXv_char4, GXv_int11, GXv_int8, GXv_char3, GXv_char2, GXv_int12, GXv_char13, GXv_char14, GXv_int15, GXv_char16, GXv_char17) ;
         informealbaranesproducciondetallado_wc_impl.this.AV18TipColDsc = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipcoldsc_Internalname, AV18TipColDsc);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTIPCOLDSC"+"_"+sGXsfl_36_idx, getSecureSignedToken( sPrefix+sGXsfl_36_idx, GXutil.rtrim( localUtil.format( AV18TipColDsc, ""))));
         GXv_char17[0] = AV19IntDsc ;
         GXv_char16[0] = " " ;
         GXv_int15[0] = (short)(0) ;
         GXv_int8[0] = (byte)(0) ;
         GXv_char14[0] = "" ;
         GXv_char13[0] = " " ;
         GXv_int12[0] = 0 ;
         GXv_char5[0] = " " ;
         GXv_char4[0] = " " ;
         GXv_int11[0] = (short)(0) ;
         GXv_char3[0] = " " ;
         GXv_char2[0] = " " ;
         new app.pmasinf(remoteHandle, context).execute( A396EmprCod, A252CliCod, A212BarSer, A135BarColNom, A136BarColNum, A218BarTipCol, GXv_char17, GXv_char16, GXv_int15, GXv_int8, GXv_char14, GXv_char13, GXv_int12, GXv_char5, GXv_char4, GXv_int11, GXv_char3, GXv_char2) ;
         informealbaranesproducciondetallado_wc_impl.this.AV19IntDsc = GXv_char17[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavIntdsc_Internalname, AV19IntDsc);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINTDSC"+"_"+sGXsfl_36_idx, getSecureSignedToken( sPrefix+sGXsfl_36_idx, GXutil.rtrim( localUtil.format( AV19IntDsc, ""))));
         GXt_decimal18 = AV149BarKgm ;
         GXv_decimal19[0] = GXt_decimal18 ;
         new app.get_barkgm(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal19) ;
         informealbaranesproducciondetallado_wc_impl.this.GXt_decimal18 = GXv_decimal19[0] ;
         AV149BarKgm = GXt_decimal18 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarkgm_Internalname, GXutil.ltrimstr( AV149BarKgm, 9, 2));
         AV142BarAlbKgmE = A1261BarAlbKgmE ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaralbkgme_Internalname, GXutil.ltrimstr( AV142BarAlbKgmE, 9, 2));
         if ( AV144moda21 == 1 )
         {
            if ( A2243BarKgsCli.doubleValue() != 0 )
            {
               AV142BarAlbKgmE = A2243BarKgsCli ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaralbkgme_Internalname, GXutil.ltrimstr( AV142BarAlbKgmE, 9, 2));
            }
         }
         AV143BarAlbMtrE = A1263BarAlbMtrE ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaralbmtre_Internalname, GXutil.ltrimstr( AV143BarAlbMtrE, 9, 2));
         if ( AV144moda21 == 1 )
         {
            if ( A1461BarAlbPN.doubleValue() != 0 )
            {
               AV143BarAlbMtrE = A1461BarAlbPN ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaralbmtre_Internalname, GXutil.ltrimstr( AV143BarAlbMtrE, 9, 2));
            }
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(36) ;
         }
         sendrow_362( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_36_Refreshing )
      {
         httpContext.doAjaxLoad(36, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e141BA2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV24ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV26ColumnsSelector.fromJSonString(AV24ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "InformeAlbaranesProduccionDetallado_WCColumnsSelector", ((GXutil.strcmp("", AV24ColumnsSelectorXML)==0) ? "" : AV26ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ColumnsSelector", AV26ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV113ProgressIndicator", AV113ProgressIndicator);
   }

   public void e151BA2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV112WebSession.setValue("InformeAlbaranesProduccionWC_ALbProfch", localUtil.dtoc( AV83ALbProfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"));
      AV112WebSession.setValue("InformeAlbaranesProduccionWC_ALbProfch_to", localUtil.dtoc( AV84ALbProfch_to, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"));
      GXv_char17[0] = AV22ExcelFilename ;
      GXv_char16[0] = AV23ErrorMessage ;
      new app.informealbaranesproducciondetallado_wcexport(remoteHandle, context).execute( GXv_char17, GXv_char16) ;
      informealbaranesproducciondetallado_wc_impl.this.AV22ExcelFilename = GXv_char17[0] ;
      informealbaranesproducciondetallado_wc_impl.this.AV23ErrorMessage = GXv_char16[0] ;
      if ( GXutil.strcmp(AV22ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV22ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV23ErrorMessage);
      }
      /*  Sending Event outputs  */
   }

   public void e171BA2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.documentotransporteproduccion.palb003", new String[] {GXutil.URLEncode(GXutil.rtrim(AV80EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV96ImpCod)),GXutil.URLEncode(GXutil.rtrim(AV95Prio)),GXutil.URLEncode(GXutil.ltrimstr(AV81Clicod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV82Clicod_to,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV83ALbProfch)),GXutil.URLEncode(GXutil.formatDateParm(AV84ALbProfch_to)),GXutil.URLEncode(GXutil.rtrim(AV85Barser)),GXutil.URLEncode(GXutil.rtrim(AV86Barser_to)),GXutil.URLEncode(GXutil.rtrim(AV87AlbEncCli)),GXutil.URLEncode(GXutil.rtrim(AV88AlbEncCli_to)),GXutil.URLEncode(GXutil.ltrimstr(AV101Fuente,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV102Barcodi,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV103Barcodreof,1,0)),GXutil.URLEncode(GXutil.rtrim(AV104Barcodparf)),GXutil.URLEncode(GXutil.rtrim(AV120BarColNom)),GXutil.URLEncode(GXutil.rtrim(AV119BarColNom_to)),GXutil.URLEncode(GXutil.ltrimstr(AV90BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV91BarColNum_to,6,0)),GXutil.URLEncode(GXutil.rtrim(AV107BarMaqEst1)),GXutil.URLEncode(GXutil.rtrim(AV108BarMaqEst2)),GXutil.URLEncode(GXutil.rtrim(AV97Serie)),GXutil.URLEncode(GXutil.ltrimstr(AV109Nfi,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV110Nff,6,0)),GXutil.URLEncode(GXutil.rtrim(AV98Barlar)),GXutil.URLEncode(GXutil.rtrim(AV99Tipdiscod)),GXutil.URLEncode(GXutil.ltrimstr(AV100Barestreo,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV111DetalleRollos,1,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(99999999,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(9999,9,0)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "zzzzzz", "")))}, new String[] {"EmprCod","ImpCod","Prio","PCliCod","UCliCod","PFecha","UFecha","PBarSer","UBarSer","PDisNum","UDisNum","Fuente","Barcodi","Barcodreof","Barcodparf","Barcolnomi","Barcolnomf","Barcolnumi","Barcolnumf","BarMaqEst1","BarMaqEst2","Serie","Nfi","Nff","Barlar","Tipdiscod","Barestreo","DetalleRollos","AlbProCod1","Albprocod_to","Bartipart","Bartipart_to","BarAcaQuifrom","BarAcaQuito"}) , new Object[] {"AV80EmprCod","AV96ImpCod","AV95Prio","AV81Clicod","AV82Clicod_to","AV83ALbProfch","AV84ALbProfch_to","AV85Barser","AV86Barser_to","AV87AlbEncCli","AV88AlbEncCli_to","AV101Fuente","AV102Barcodi","AV103Barcodreof","AV104Barcodparf","AV120BarColNom","AV119BarColNom_to","AV90BarColNum","AV91BarColNum_to","AV107BarMaqEst1","AV108BarMaqEst2","AV97Serie","AV109Nfi","AV110Nff","AV98Barlar","AV99Tipdiscod","AV100Barestreo","AV111DetalleRollos","","","","","",""});
      if ( 1 == 0 )
      {
         Innewwindow1_Target = formatLink("app.informealbaranesproducciondetallado_wcexportreport", new String[] {}, new String[] {})  ;
         ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
         Innewwindow1_Height = "600" ;
         ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
         Innewwindow1_Width = "800" ;
         ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
         this.executeUsercontrolMethod(sPrefix, false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      }
      /*  Sending Event outputs  */
   }

   public void e161BA2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.informealbaranesproducciondetallado_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
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
      AV26ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector20[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "GuiRemCli", "", "Cliente", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "GuiRemCln", "", "Nombre", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "AlbProCod", "", "Albaran", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "AlbProfch", "", "Fecha Alb", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "&BarEncCli", "", "Pedido Cli", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "BarFecCli", "", "Fecha Disposicion Cliente", false, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "BarNHdr", "", "Hdr", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "BarSer", "", "Articulo", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "BarSerDsc", "", "Descripcion", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "BarTipArtDsc", "", "Composicion", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "BarNomCli", "", "Color Cli", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "BarColNom", "", "Color", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "BarColNum", "", "Numero", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "&TipColDsc", "", "Tc", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "&IntDsc", "", "Intensidad", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "&BarKgm", "", "Kilos Cru.", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "&BarAlbKgmE", "Entregados", "Kilos", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "&BarAlbMtrE", "Entregados", "Metros", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "BarAlbPie", "", "Piezas", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXt_char1 = AV25UserCustomValue ;
      GXv_char17[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "InformeAlbaranesProduccionDetallado_WCColumnsSelector", GXv_char17) ;
      informealbaranesproducciondetallado_wc_impl.this.GXt_char1 = GXv_char17[0] ;
      AV25UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV25UserCustomValue)==0) ) )
      {
         AV27ColumnsSelectorAux.fromxml(AV25UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector20[0] = AV27ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector21[0] = AV26ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, GXv_SdtWWPColumnsSelector21) ;
         AV27ColumnsSelectorAux = GXv_SdtWWPColumnsSelector20[0] ;
         AV26ColumnsSelector = GXv_SdtWWPColumnsSelector21[0] ;
      }
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV28Session.getValue(AV152Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV152Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV28Session.getValue(AV152Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV153GXV1 = 1 ;
      while ( AV153GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV153GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC") == 0 )
         {
            AV131TFIntDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131TFIntDsc", AV131TFIntDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC_SEL") == 0 )
         {
            AV132TFIntDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV132TFIntDsc_Sel", AV132TFIntDsc_Sel);
         }
         AV153GXV1 = (int)(AV153GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char17[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV132TFIntDsc_Sel)==0), AV132TFIntDsc_Sel, GXv_char17) ;
      informealbaranesproducciondetallado_wc_impl.this.GXt_char1 = GXv_char17[0] ;
      Ddo_grid_Selectedvalue_set = "||||||||||||||"+GXt_char1+"||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char1 = "" ;
      GXv_char17[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV131TFIntDsc)==0), AV131TFIntDsc, GXv_char17) ;
      informealbaranesproducciondetallado_wc_impl.this.GXt_char1 = GXv_char17[0] ;
      Ddo_grid_Filteredtext_set = "||||||||||||||"+GXt_char1+"||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
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
      AV10GridState.fromxml(AV28Session.getValue(AV152Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFINTDSC", "", !(GXutil.strcmp("", AV131TFIntDsc)==0), (short)(0), AV131TFIntDsc, "", !(GXutil.strcmp("", AV132TFIntDsc_Sel)==0), AV132TFIntDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      if ( ! (GXutil.strcmp("", AV80EmprCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV80EmprCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV95Prio)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRIO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV95Prio );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV81Clicod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV81Clicod, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV82Clicod_to) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV82Clicod_to, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83ALbProfch)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBPROFCH" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV83ALbProfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84ALbProfch_to)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBPROFCH_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV84ALbProfch_to, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV85Barser)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSER" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV85Barser );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV86Barser_to)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSER_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV86Barser_to );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV87AlbEncCli)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBENCCLI" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV87AlbEncCli );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV88AlbEncCli_to)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBENCCLI_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV88AlbEncCli_to );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV120BarColNom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNOM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV120BarColNom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV119BarColNom_to)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNOM_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV119BarColNom_to );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV90BarColNum) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNUM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV90BarColNum, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV91BarColNum_to) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNUM_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV91BarColNum_to, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV100Barestreo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARESTREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV100Barestreo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV137Barestreoi) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARESTREOI" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV137Barestreoi, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV138Barestreof) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARESTREOF" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV138Barestreof, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV99Tipdiscod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPDISCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV99Tipdiscod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV152Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV152Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "ALBBAR" );
      AV28Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S162( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV127TotBarKgm = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV127TotBarKgm", GXutil.ltrimstr( AV127TotBarKgm, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV127TotBarKgm, "ZZZZZ9.99")));
      AV121TotBarAlbKgmE = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121TotBarAlbKgmE", GXutil.ltrimstr( AV121TotBarAlbKgmE, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBKGME", getSecureSignedToken( sPrefix, localUtil.format( AV121TotBarAlbKgmE, "ZZZZZ9.99")));
      AV123TotBarAlbMtrE = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123TotBarAlbMtrE", GXutil.ltrimstr( AV123TotBarAlbMtrE, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBMTRE", getSecureSignedToken( sPrefix, localUtil.format( AV123TotBarAlbMtrE, "ZZZZZ9.99")));
      AV125TotBarAlbPie = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125TotBarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125TotBarAlbPie), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV125TotBarAlbPie), "ZZZZZ9")));
   }

   public void S172( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      if ( 1 == 2 )
      {
         pr_default.dynParam(2, new Object[]{ new Object[]{
                                              Integer.valueOf(AV81Clicod) ,
                                              Integer.valueOf(AV82Clicod_to) ,
                                              AV83ALbProfch ,
                                              AV84ALbProfch_to ,
                                              AV85Barser ,
                                              AV86Barser_to ,
                                              AV120BarColNom ,
                                              AV119BarColNom_to ,
                                              Integer.valueOf(AV90BarColNum) ,
                                              Integer.valueOf(AV91BarColNum_to) ,
                                              Integer.valueOf(A1243GuiRemCli) ,
                                              A34AlbProfch ,
                                              A212BarSer ,
                                              A135BarColNom ,
                                              Integer.valueOf(A136BarColNum) ,
                                              A39AlbProPri ,
                                              AV95Prio ,
                                              AV87AlbEncCli ,
                                              A13878PedidoClie ,
                                              AV88AlbEncCli_to ,
                                              Byte.valueOf(A148BarEstReo) ,
                                              Byte.valueOf(AV137Barestreoi) ,
                                              Byte.valueOf(AV138Barestreof) ,
                                              A2010BarTipDis ,
                                              AV99Tipdiscod ,
                                              A5140AlbMarca ,
                                              AV80EmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor H01BA4 */
         pr_default.execute(2, new Object[] {AV80EmprCod, AV95Prio, AV95Prio, Byte.valueOf(AV137Barestreoi), Byte.valueOf(AV138Barestreof), AV99Tipdiscod, AV99Tipdiscod, Integer.valueOf(AV81Clicod), Integer.valueOf(AV82Clicod_to), AV83ALbProfch, AV84ALbProfch_to, AV85Barser, AV86Barser_to, AV120BarColNom, AV119BarColNom_to, Integer.valueOf(AV90BarColNum), Integer.valueOf(AV91BarColNum_to)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A30AlbProCod = H01BA4_A30AlbProCod[0] ;
            A5140AlbMarca = H01BA4_A5140AlbMarca[0] ;
            A2010BarTipDis = H01BA4_A2010BarTipDis[0] ;
            A148BarEstReo = H01BA4_A148BarEstReo[0] ;
            A136BarColNum = H01BA4_A136BarColNum[0] ;
            A135BarColNom = H01BA4_A135BarColNom[0] ;
            A212BarSer = H01BA4_A212BarSer[0] ;
            A34AlbProfch = H01BA4_A34AlbProfch[0] ;
            A1243GuiRemCli = H01BA4_A1243GuiRemCli[0] ;
            A39AlbProPri = H01BA4_A39AlbProPri[0] ;
            A129BarCod = H01BA4_A129BarCod[0] ;
            A132BarCodReo = H01BA4_A132BarCodReo[0] ;
            A130BarCodPar = H01BA4_A130BarCodPar[0] ;
            A1261BarAlbKgmE = H01BA4_A1261BarAlbKgmE[0] ;
            A2243BarKgsCli = H01BA4_A2243BarKgsCli[0] ;
            n2243BarKgsCli = H01BA4_n2243BarKgsCli[0] ;
            A1263BarAlbMtrE = H01BA4_A1263BarAlbMtrE[0] ;
            A1461BarAlbPN = H01BA4_A1461BarAlbPN[0] ;
            A1265BarAlbPie = H01BA4_A1265BarAlbPie[0] ;
            A143BarDisNum = H01BA4_A143BarDisNum[0] ;
            A4812BarEncCli = H01BA4_A4812BarEncCli[0] ;
            A396EmprCod = H01BA4_A396EmprCod[0] ;
            A2010BarTipDis = H01BA4_A2010BarTipDis[0] ;
            A148BarEstReo = H01BA4_A148BarEstReo[0] ;
            A136BarColNum = H01BA4_A136BarColNum[0] ;
            A135BarColNom = H01BA4_A135BarColNom[0] ;
            A212BarSer = H01BA4_A212BarSer[0] ;
            A143BarDisNum = H01BA4_A143BarDisNum[0] ;
            A4812BarEncCli = H01BA4_A4812BarEncCli[0] ;
            A5140AlbMarca = H01BA4_A5140AlbMarca[0] ;
            A34AlbProfch = H01BA4_A34AlbProfch[0] ;
            A1243GuiRemCli = H01BA4_A1243GuiRemCli[0] ;
            A39AlbProPri = H01BA4_A39AlbProPri[0] ;
            GXt_char1 = A13878PedidoClie ;
            GXv_char17[0] = A396EmprCod ;
            GXv_char16[0] = A4812BarEncCli ;
            GXv_char14[0] = A143BarDisNum ;
            GXv_char13[0] = GXt_char1 ;
            new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char17, GXv_char16, GXv_char14, GXv_char13) ;
            informealbaranesproducciondetallado_wc_impl.this.A396EmprCod = GXv_char17[0] ;
            informealbaranesproducciondetallado_wc_impl.this.A4812BarEncCli = GXv_char16[0] ;
            informealbaranesproducciondetallado_wc_impl.this.A143BarDisNum = GXv_char14[0] ;
            informealbaranesproducciondetallado_wc_impl.this.GXt_char1 = GXv_char13[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4812BarEncCli", A4812BarEncCli);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143BarDisNum", A143BarDisNum);
            A13878PedidoClie = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13878PedidoClie", A13878PedidoClie);
            if ( (GXutil.strcmp("", AV87AlbEncCli)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV87AlbEncCli) >= 0 ) ) )
            {
               if ( (GXutil.strcmp("", AV88AlbEncCli_to)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV88AlbEncCli_to) <= 0 ) ) )
               {
                  GXt_decimal18 = AV149BarKgm ;
                  GXv_decimal19[0] = GXt_decimal18 ;
                  new app.get_barkgm(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal19) ;
                  informealbaranesproducciondetallado_wc_impl.this.GXt_decimal18 = GXv_decimal19[0] ;
                  AV149BarKgm = GXt_decimal18 ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarkgm_Internalname, GXutil.ltrimstr( AV149BarKgm, 9, 2));
                  AV127TotBarKgm = AV149BarKgm.add(AV127TotBarKgm) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV127TotBarKgm", GXutil.ltrimstr( AV127TotBarKgm, 18, 2));
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV127TotBarKgm, "ZZZZZ9.99")));
                  AV142BarAlbKgmE = A1261BarAlbKgmE ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaralbkgme_Internalname, GXutil.ltrimstr( AV142BarAlbKgmE, 9, 2));
                  if ( AV144moda21 == 1 )
                  {
                     if ( A2243BarKgsCli.doubleValue() != 0 )
                     {
                        AV142BarAlbKgmE = A2243BarKgsCli ;
                        httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaralbkgme_Internalname, GXutil.ltrimstr( AV142BarAlbKgmE, 9, 2));
                     }
                  }
                  AV121TotBarAlbKgmE = AV142BarAlbKgmE.add(AV121TotBarAlbKgmE) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121TotBarAlbKgmE", GXutil.ltrimstr( AV121TotBarAlbKgmE, 18, 2));
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBKGME", getSecureSignedToken( sPrefix, localUtil.format( AV121TotBarAlbKgmE, "ZZZZZ9.99")));
                  AV143BarAlbMtrE = A1263BarAlbMtrE ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaralbmtre_Internalname, GXutil.ltrimstr( AV143BarAlbMtrE, 9, 2));
                  if ( AV144moda21 == 1 )
                  {
                     if ( A1461BarAlbPN.doubleValue() != 0 )
                     {
                        AV143BarAlbMtrE = A1461BarAlbPN ;
                        httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaralbmtre_Internalname, GXutil.ltrimstr( AV143BarAlbMtrE, 9, 2));
                     }
                  }
                  AV123TotBarAlbMtrE = AV143BarAlbMtrE.add(AV123TotBarAlbMtrE) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123TotBarAlbMtrE", GXutil.ltrimstr( AV123TotBarAlbMtrE, 18, 2));
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBMTRE", getSecureSignedToken( sPrefix, localUtil.format( AV123TotBarAlbMtrE, "ZZZZZ9.99")));
                  AV125TotBarAlbPie = (long)(A1265BarAlbPie+AV125TotBarAlbPie) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125TotBarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125TotBarAlbPie), 18, 0));
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV125TotBarAlbPie), "ZZZZZ9")));
               }
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
         AV128TotValueBarKgm = localUtil.format( AV127TotBarKgm, "ZZZZZ9.99") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV128TotValueBarKgm", AV128TotValueBarKgm);
         AV122TotValueBarAlbKgmE = localUtil.format( AV121TotBarAlbKgmE, "ZZZZZ9.99") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122TotValueBarAlbKgmE", AV122TotValueBarAlbKgmE);
         AV124TotValueBarAlbMtrE = localUtil.format( AV123TotBarAlbMtrE, "ZZZZZ9.99") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV124TotValueBarAlbMtrE", AV124TotValueBarAlbMtrE);
         AV126TotValueBarAlbPie = localUtil.format( DecimalUtil.doubleToDec(AV125TotBarAlbPie), "ZZZZZ9") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126TotValueBarAlbPie", AV126TotValueBarAlbPie);
      }
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Integer.valueOf(AV81Clicod) ,
                                           Integer.valueOf(AV82Clicod_to) ,
                                           AV83ALbProfch ,
                                           AV84ALbProfch_to ,
                                           AV85Barser ,
                                           AV86Barser_to ,
                                           AV120BarColNom ,
                                           AV119BarColNom_to ,
                                           Integer.valueOf(AV90BarColNum) ,
                                           Integer.valueOf(AV91BarColNum_to) ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A34AlbProfch ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A39AlbProPri ,
                                           AV95Prio ,
                                           AV87AlbEncCli ,
                                           A13878PedidoClie ,
                                           AV88AlbEncCli_to ,
                                           Byte.valueOf(A148BarEstReo) ,
                                           Byte.valueOf(AV137Barestreoi) ,
                                           Byte.valueOf(AV138Barestreof) ,
                                           A2010BarTipDis ,
                                           AV99Tipdiscod ,
                                           AV80EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor H01BA5 */
      pr_default.execute(3, new Object[] {AV80EmprCod, AV95Prio, AV95Prio, Byte.valueOf(AV137Barestreoi), Byte.valueOf(AV138Barestreof), AV99Tipdiscod, AV99Tipdiscod, Integer.valueOf(AV81Clicod), Integer.valueOf(AV82Clicod_to), AV83ALbProfch, AV84ALbProfch_to, AV85Barser, AV86Barser_to, AV120BarColNom, AV119BarColNom_to, Integer.valueOf(AV90BarColNum), Integer.valueOf(AV91BarColNum_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A30AlbProCod = H01BA5_A30AlbProCod[0] ;
         A2010BarTipDis = H01BA5_A2010BarTipDis[0] ;
         A148BarEstReo = H01BA5_A148BarEstReo[0] ;
         A136BarColNum = H01BA5_A136BarColNum[0] ;
         A135BarColNom = H01BA5_A135BarColNom[0] ;
         A212BarSer = H01BA5_A212BarSer[0] ;
         A34AlbProfch = H01BA5_A34AlbProfch[0] ;
         A1243GuiRemCli = H01BA5_A1243GuiRemCli[0] ;
         A39AlbProPri = H01BA5_A39AlbProPri[0] ;
         A129BarCod = H01BA5_A129BarCod[0] ;
         A132BarCodReo = H01BA5_A132BarCodReo[0] ;
         A130BarCodPar = H01BA5_A130BarCodPar[0] ;
         A1261BarAlbKgmE = H01BA5_A1261BarAlbKgmE[0] ;
         A2243BarKgsCli = H01BA5_A2243BarKgsCli[0] ;
         n2243BarKgsCli = H01BA5_n2243BarKgsCli[0] ;
         A1263BarAlbMtrE = H01BA5_A1263BarAlbMtrE[0] ;
         A1461BarAlbPN = H01BA5_A1461BarAlbPN[0] ;
         A1265BarAlbPie = H01BA5_A1265BarAlbPie[0] ;
         A143BarDisNum = H01BA5_A143BarDisNum[0] ;
         A4812BarEncCli = H01BA5_A4812BarEncCli[0] ;
         A396EmprCod = H01BA5_A396EmprCod[0] ;
         A2010BarTipDis = H01BA5_A2010BarTipDis[0] ;
         A148BarEstReo = H01BA5_A148BarEstReo[0] ;
         A136BarColNum = H01BA5_A136BarColNum[0] ;
         A135BarColNom = H01BA5_A135BarColNom[0] ;
         A212BarSer = H01BA5_A212BarSer[0] ;
         A143BarDisNum = H01BA5_A143BarDisNum[0] ;
         A4812BarEncCli = H01BA5_A4812BarEncCli[0] ;
         A34AlbProfch = H01BA5_A34AlbProfch[0] ;
         A1243GuiRemCli = H01BA5_A1243GuiRemCli[0] ;
         A39AlbProPri = H01BA5_A39AlbProPri[0] ;
         GXt_char1 = A13878PedidoClie ;
         GXv_char17[0] = A396EmprCod ;
         GXv_char16[0] = A4812BarEncCli ;
         GXv_char14[0] = A143BarDisNum ;
         GXv_char13[0] = GXt_char1 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char17, GXv_char16, GXv_char14, GXv_char13) ;
         informealbaranesproducciondetallado_wc_impl.this.A396EmprCod = GXv_char17[0] ;
         informealbaranesproducciondetallado_wc_impl.this.A4812BarEncCli = GXv_char16[0] ;
         informealbaranesproducciondetallado_wc_impl.this.A143BarDisNum = GXv_char14[0] ;
         informealbaranesproducciondetallado_wc_impl.this.GXt_char1 = GXv_char13[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4812BarEncCli", A4812BarEncCli);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143BarDisNum", A143BarDisNum);
         A13878PedidoClie = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13878PedidoClie", A13878PedidoClie);
         if ( (GXutil.strcmp("", AV87AlbEncCli)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV87AlbEncCli) >= 0 ) ) )
         {
            if ( (GXutil.strcmp("", AV88AlbEncCli_to)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV88AlbEncCli_to) <= 0 ) ) )
            {
               GXt_decimal18 = AV149BarKgm ;
               GXv_decimal19[0] = GXt_decimal18 ;
               new app.get_barkgm(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal19) ;
               informealbaranesproducciondetallado_wc_impl.this.GXt_decimal18 = GXv_decimal19[0] ;
               AV149BarKgm = GXt_decimal18 ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarkgm_Internalname, GXutil.ltrimstr( AV149BarKgm, 9, 2));
               AV127TotBarKgm = AV149BarKgm.add(AV127TotBarKgm) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV127TotBarKgm", GXutil.ltrimstr( AV127TotBarKgm, 18, 2));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV127TotBarKgm, "ZZZZZ9.99")));
               AV142BarAlbKgmE = A1261BarAlbKgmE ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaralbkgme_Internalname, GXutil.ltrimstr( AV142BarAlbKgmE, 9, 2));
               if ( AV144moda21 == 1 )
               {
                  if ( A2243BarKgsCli.doubleValue() != 0 )
                  {
                     AV142BarAlbKgmE = A2243BarKgsCli ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaralbkgme_Internalname, GXutil.ltrimstr( AV142BarAlbKgmE, 9, 2));
                  }
               }
               AV121TotBarAlbKgmE = AV142BarAlbKgmE.add(AV121TotBarAlbKgmE) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121TotBarAlbKgmE", GXutil.ltrimstr( AV121TotBarAlbKgmE, 18, 2));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBKGME", getSecureSignedToken( sPrefix, localUtil.format( AV121TotBarAlbKgmE, "ZZZZZ9.99")));
               AV143BarAlbMtrE = A1263BarAlbMtrE ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaralbmtre_Internalname, GXutil.ltrimstr( AV143BarAlbMtrE, 9, 2));
               if ( AV144moda21 == 1 )
               {
                  if ( A1461BarAlbPN.doubleValue() != 0 )
                  {
                     AV143BarAlbMtrE = A1461BarAlbPN ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaralbmtre_Internalname, GXutil.ltrimstr( AV143BarAlbMtrE, 9, 2));
                  }
               }
               AV123TotBarAlbMtrE = AV143BarAlbMtrE.add(AV123TotBarAlbMtrE) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123TotBarAlbMtrE", GXutil.ltrimstr( AV123TotBarAlbMtrE, 18, 2));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBMTRE", getSecureSignedToken( sPrefix, localUtil.format( AV123TotBarAlbMtrE, "ZZZZZ9.99")));
               AV125TotBarAlbPie = (long)(A1265BarAlbPie+AV125TotBarAlbPie) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125TotBarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125TotBarAlbPie), 18, 0));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV125TotBarAlbPie), "ZZZZZ9")));
            }
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV128TotValueBarKgm = localUtil.format( AV127TotBarKgm, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV128TotValueBarKgm", AV128TotValueBarKgm);
      AV122TotValueBarAlbKgmE = localUtil.format( AV121TotBarAlbKgmE, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122TotValueBarAlbKgmE", AV122TotValueBarAlbKgmE);
      AV124TotValueBarAlbMtrE = localUtil.format( AV123TotBarAlbMtrE, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV124TotValueBarAlbMtrE", AV124TotValueBarAlbMtrE);
      AV126TotValueBarAlbPie = localUtil.format( DecimalUtil.doubleToDec(AV125TotBarAlbPie), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126TotValueBarAlbPie", AV126TotValueBarAlbPie);
   }

   public void wb_table2_59_1BA2( boolean wbgen )
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
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarkgm_Internalname, httpContext.getMessage( "Tot Value Bar Kgm", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarkgm_Internalname, AV128TotValueBarKgm, GXutil.rtrim( localUtil.format( AV128TotValueBarKgm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarkgm_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarkgm_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_InformeAlbaranesProduccionDetallado_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebaralbkgme_Internalname, httpContext.getMessage( "Tot Value Bar Alb Kgm E", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebaralbkgme_Internalname, AV122TotValueBarAlbKgmE, GXutil.rtrim( localUtil.format( AV122TotValueBarAlbKgmE, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,82);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebaralbkgme_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebaralbkgme_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_InformeAlbaranesProduccionDetallado_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebaralbmtre_Internalname, httpContext.getMessage( "Tot Value Bar Alb Mtr E", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebaralbmtre_Internalname, AV124TotValueBarAlbMtrE, GXutil.rtrim( localUtil.format( AV124TotValueBarAlbMtrE, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebaralbmtre_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebaralbmtre_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_InformeAlbaranesProduccionDetallado_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebaralbpie_Internalname, httpContext.getMessage( "Tot Value Bar Alb Pie", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebaralbpie_Internalname, AV126TotValueBarAlbPie, GXutil.rtrim( localUtil.format( AV126TotValueBarAlbPie, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,88);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebaralbpie_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebaralbpie_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_InformeAlbaranesProduccionDetallado_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_59_1BA2e( true) ;
      }
      else
      {
         wb_table2_59_1BA2e( false) ;
      }
   }

   public void wb_table1_25_1BA2( boolean wbgen )
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
         wb_table1_25_1BA2e( true) ;
      }
      else
      {
         wb_table1_25_1BA2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV80EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80EmprCod", AV80EmprCod);
      AV95Prio = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95Prio", AV95Prio);
      AV81Clicod = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81Clicod), 6, 0));
      AV82Clicod_to = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82Clicod_to), 6, 0));
      AV83ALbProfch = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83ALbProfch", localUtil.format(AV83ALbProfch, "99/99/99"));
      AV84ALbProfch_to = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84ALbProfch_to", localUtil.format(AV84ALbProfch_to, "99/99/99"));
      AV85Barser = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85Barser", AV85Barser);
      AV86Barser_to = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86Barser_to", AV86Barser_to);
      AV87AlbEncCli = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87AlbEncCli", AV87AlbEncCli);
      AV88AlbEncCli_to = (String)getParm(obj,9,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88AlbEncCli_to", AV88AlbEncCli_to);
      AV120BarColNom = (String)getParm(obj,10,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120BarColNom", AV120BarColNom);
      AV119BarColNom_to = (String)getParm(obj,11,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119BarColNom_to", AV119BarColNom_to);
      AV90BarColNum = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90BarColNum), 6, 0));
      AV91BarColNum_to = ((Number) GXutil.testNumericType( getParm(obj,13,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91BarColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91BarColNum_to), 6, 0));
      AV100Barestreo = ((Number) GXutil.testNumericType( getParm(obj,14,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100Barestreo", GXutil.str( AV100Barestreo, 1, 0));
      AV137Barestreoi = ((Number) GXutil.testNumericType( getParm(obj,15,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV137Barestreoi", GXutil.str( AV137Barestreoi, 1, 0));
      AV138Barestreof = ((Number) GXutil.testNumericType( getParm(obj,16,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV138Barestreof", GXutil.str( AV138Barestreof, 1, 0));
      AV99Tipdiscod = (String)getParm(obj,17,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99Tipdiscod", AV99Tipdiscod);
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
      pa1BA2( ) ;
      ws1BA2( ) ;
      we1BA2( ) ;
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
      sCtrlAV80EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV95Prio = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV81Clicod = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV82Clicod_to = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV83ALbProfch = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV84ALbProfch_to = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV85Barser = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV86Barser_to = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV87AlbEncCli = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV88AlbEncCli_to = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV120BarColNom = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV119BarColNom_to = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV90BarColNum = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV91BarColNum_to = (String)getParm(obj,13,TypeConstants.STRING) ;
      sCtrlAV100Barestreo = (String)getParm(obj,14,TypeConstants.STRING) ;
      sCtrlAV137Barestreoi = (String)getParm(obj,15,TypeConstants.STRING) ;
      sCtrlAV138Barestreof = (String)getParm(obj,16,TypeConstants.STRING) ;
      sCtrlAV99Tipdiscod = (String)getParm(obj,17,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1BA2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "informealbaranesproducciondetallado_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1BA2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV80EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80EmprCod", AV80EmprCod);
         AV95Prio = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95Prio", AV95Prio);
         AV81Clicod = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81Clicod), 6, 0));
         AV82Clicod_to = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82Clicod_to), 6, 0));
         AV83ALbProfch = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83ALbProfch", localUtil.format(AV83ALbProfch, "99/99/99"));
         AV84ALbProfch_to = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84ALbProfch_to", localUtil.format(AV84ALbProfch_to, "99/99/99"));
         AV85Barser = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85Barser", AV85Barser);
         AV86Barser_to = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86Barser_to", AV86Barser_to);
         AV87AlbEncCli = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87AlbEncCli", AV87AlbEncCli);
         AV88AlbEncCli_to = (String)getParm(obj,11,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88AlbEncCli_to", AV88AlbEncCli_to);
         AV120BarColNom = (String)getParm(obj,12,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120BarColNom", AV120BarColNom);
         AV119BarColNom_to = (String)getParm(obj,13,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119BarColNom_to", AV119BarColNom_to);
         AV90BarColNum = ((Number) GXutil.testNumericType( getParm(obj,14,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90BarColNum), 6, 0));
         AV91BarColNum_to = ((Number) GXutil.testNumericType( getParm(obj,15,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91BarColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91BarColNum_to), 6, 0));
         AV100Barestreo = ((Number) GXutil.testNumericType( getParm(obj,16,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100Barestreo", GXutil.str( AV100Barestreo, 1, 0));
         AV137Barestreoi = ((Number) GXutil.testNumericType( getParm(obj,17,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV137Barestreoi", GXutil.str( AV137Barestreoi, 1, 0));
         AV138Barestreof = ((Number) GXutil.testNumericType( getParm(obj,18,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV138Barestreof", GXutil.str( AV138Barestreof, 1, 0));
         AV99Tipdiscod = (String)getParm(obj,19,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99Tipdiscod", AV99Tipdiscod);
      }
      wcpOAV80EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV80EmprCod") ;
      wcpOAV95Prio = httpContext.cgiGet( sPrefix+"wcpOAV95Prio") ;
      wcpOAV81Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV81Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV82Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV82Clicod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV83ALbProfch = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV83ALbProfch"), 0) ;
      wcpOAV84ALbProfch_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV84ALbProfch_to"), 0) ;
      wcpOAV85Barser = httpContext.cgiGet( sPrefix+"wcpOAV85Barser") ;
      wcpOAV86Barser_to = httpContext.cgiGet( sPrefix+"wcpOAV86Barser_to") ;
      wcpOAV87AlbEncCli = httpContext.cgiGet( sPrefix+"wcpOAV87AlbEncCli") ;
      wcpOAV88AlbEncCli_to = httpContext.cgiGet( sPrefix+"wcpOAV88AlbEncCli_to") ;
      wcpOAV120BarColNom = httpContext.cgiGet( sPrefix+"wcpOAV120BarColNom") ;
      wcpOAV119BarColNom_to = httpContext.cgiGet( sPrefix+"wcpOAV119BarColNom_to") ;
      wcpOAV90BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV90BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV91BarColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV91BarColNum_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV100Barestreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV100Barestreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV137Barestreoi = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV137Barestreoi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV138Barestreof = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV138Barestreof"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV99Tipdiscod = httpContext.cgiGet( sPrefix+"wcpOAV99Tipdiscod") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV80EmprCod, wcpOAV80EmprCod) != 0 ) || ( GXutil.strcmp(AV95Prio, wcpOAV95Prio) != 0 ) || ( AV81Clicod != wcpOAV81Clicod ) || ( AV82Clicod_to != wcpOAV82Clicod_to ) || !( GXutil.dateCompare(GXutil.resetTime(AV83ALbProfch), GXutil.resetTime(wcpOAV83ALbProfch)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV84ALbProfch_to), GXutil.resetTime(wcpOAV84ALbProfch_to)) ) || ( GXutil.strcmp(AV85Barser, wcpOAV85Barser) != 0 ) || ( GXutil.strcmp(AV86Barser_to, wcpOAV86Barser_to) != 0 ) || ( GXutil.strcmp(AV87AlbEncCli, wcpOAV87AlbEncCli) != 0 ) || ( GXutil.strcmp(AV88AlbEncCli_to, wcpOAV88AlbEncCli_to) != 0 ) || ( GXutil.strcmp(AV120BarColNom, wcpOAV120BarColNom) != 0 ) || ( GXutil.strcmp(AV119BarColNom_to, wcpOAV119BarColNom_to) != 0 ) || ( AV90BarColNum != wcpOAV90BarColNum ) || ( AV91BarColNum_to != wcpOAV91BarColNum_to ) || ( AV100Barestreo != wcpOAV100Barestreo ) || ( AV137Barestreoi != wcpOAV137Barestreoi ) || ( AV138Barestreof != wcpOAV138Barestreof ) || ( GXutil.strcmp(AV99Tipdiscod, wcpOAV99Tipdiscod) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV80EmprCod = AV80EmprCod ;
      wcpOAV95Prio = AV95Prio ;
      wcpOAV81Clicod = AV81Clicod ;
      wcpOAV82Clicod_to = AV82Clicod_to ;
      wcpOAV83ALbProfch = AV83ALbProfch ;
      wcpOAV84ALbProfch_to = AV84ALbProfch_to ;
      wcpOAV85Barser = AV85Barser ;
      wcpOAV86Barser_to = AV86Barser_to ;
      wcpOAV87AlbEncCli = AV87AlbEncCli ;
      wcpOAV88AlbEncCli_to = AV88AlbEncCli_to ;
      wcpOAV120BarColNom = AV120BarColNom ;
      wcpOAV119BarColNom_to = AV119BarColNom_to ;
      wcpOAV90BarColNum = AV90BarColNum ;
      wcpOAV91BarColNum_to = AV91BarColNum_to ;
      wcpOAV100Barestreo = AV100Barestreo ;
      wcpOAV137Barestreoi = AV137Barestreoi ;
      wcpOAV138Barestreof = AV138Barestreof ;
      wcpOAV99Tipdiscod = AV99Tipdiscod ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV80EmprCod = httpContext.cgiGet( sPrefix+"AV80EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV80EmprCod) > 0 )
      {
         AV80EmprCod = httpContext.cgiGet( sCtrlAV80EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80EmprCod", AV80EmprCod);
      }
      else
      {
         AV80EmprCod = httpContext.cgiGet( sPrefix+"AV80EmprCod_PARM") ;
      }
      sCtrlAV95Prio = httpContext.cgiGet( sPrefix+"AV95Prio_CTRL") ;
      if ( GXutil.len( sCtrlAV95Prio) > 0 )
      {
         AV95Prio = httpContext.cgiGet( sCtrlAV95Prio) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95Prio", AV95Prio);
      }
      else
      {
         AV95Prio = httpContext.cgiGet( sPrefix+"AV95Prio_PARM") ;
      }
      sCtrlAV81Clicod = httpContext.cgiGet( sPrefix+"AV81Clicod_CTRL") ;
      if ( GXutil.len( sCtrlAV81Clicod) > 0 )
      {
         AV81Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV81Clicod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81Clicod), 6, 0));
      }
      else
      {
         AV81Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV81Clicod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV82Clicod_to = httpContext.cgiGet( sPrefix+"AV82Clicod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV82Clicod_to) > 0 )
      {
         AV82Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV82Clicod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82Clicod_to), 6, 0));
      }
      else
      {
         AV82Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV82Clicod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV83ALbProfch = httpContext.cgiGet( sPrefix+"AV83ALbProfch_CTRL") ;
      if ( GXutil.len( sCtrlAV83ALbProfch) > 0 )
      {
         AV83ALbProfch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV83ALbProfch), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83ALbProfch", localUtil.format(AV83ALbProfch, "99/99/99"));
      }
      else
      {
         AV83ALbProfch = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV83ALbProfch_PARM"), 0) ;
      }
      sCtrlAV84ALbProfch_to = httpContext.cgiGet( sPrefix+"AV84ALbProfch_to_CTRL") ;
      if ( GXutil.len( sCtrlAV84ALbProfch_to) > 0 )
      {
         AV84ALbProfch_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV84ALbProfch_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84ALbProfch_to", localUtil.format(AV84ALbProfch_to, "99/99/99"));
      }
      else
      {
         AV84ALbProfch_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV84ALbProfch_to_PARM"), 0) ;
      }
      sCtrlAV85Barser = httpContext.cgiGet( sPrefix+"AV85Barser_CTRL") ;
      if ( GXutil.len( sCtrlAV85Barser) > 0 )
      {
         AV85Barser = httpContext.cgiGet( sCtrlAV85Barser) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85Barser", AV85Barser);
      }
      else
      {
         AV85Barser = httpContext.cgiGet( sPrefix+"AV85Barser_PARM") ;
      }
      sCtrlAV86Barser_to = httpContext.cgiGet( sPrefix+"AV86Barser_to_CTRL") ;
      if ( GXutil.len( sCtrlAV86Barser_to) > 0 )
      {
         AV86Barser_to = httpContext.cgiGet( sCtrlAV86Barser_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86Barser_to", AV86Barser_to);
      }
      else
      {
         AV86Barser_to = httpContext.cgiGet( sPrefix+"AV86Barser_to_PARM") ;
      }
      sCtrlAV87AlbEncCli = httpContext.cgiGet( sPrefix+"AV87AlbEncCli_CTRL") ;
      if ( GXutil.len( sCtrlAV87AlbEncCli) > 0 )
      {
         AV87AlbEncCli = httpContext.cgiGet( sCtrlAV87AlbEncCli) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87AlbEncCli", AV87AlbEncCli);
      }
      else
      {
         AV87AlbEncCli = httpContext.cgiGet( sPrefix+"AV87AlbEncCli_PARM") ;
      }
      sCtrlAV88AlbEncCli_to = httpContext.cgiGet( sPrefix+"AV88AlbEncCli_to_CTRL") ;
      if ( GXutil.len( sCtrlAV88AlbEncCli_to) > 0 )
      {
         AV88AlbEncCli_to = httpContext.cgiGet( sCtrlAV88AlbEncCli_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88AlbEncCli_to", AV88AlbEncCli_to);
      }
      else
      {
         AV88AlbEncCli_to = httpContext.cgiGet( sPrefix+"AV88AlbEncCli_to_PARM") ;
      }
      sCtrlAV120BarColNom = httpContext.cgiGet( sPrefix+"AV120BarColNom_CTRL") ;
      if ( GXutil.len( sCtrlAV120BarColNom) > 0 )
      {
         AV120BarColNom = httpContext.cgiGet( sCtrlAV120BarColNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120BarColNom", AV120BarColNom);
      }
      else
      {
         AV120BarColNom = httpContext.cgiGet( sPrefix+"AV120BarColNom_PARM") ;
      }
      sCtrlAV119BarColNom_to = httpContext.cgiGet( sPrefix+"AV119BarColNom_to_CTRL") ;
      if ( GXutil.len( sCtrlAV119BarColNom_to) > 0 )
      {
         AV119BarColNom_to = httpContext.cgiGet( sCtrlAV119BarColNom_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119BarColNom_to", AV119BarColNom_to);
      }
      else
      {
         AV119BarColNom_to = httpContext.cgiGet( sPrefix+"AV119BarColNom_to_PARM") ;
      }
      sCtrlAV90BarColNum = httpContext.cgiGet( sPrefix+"AV90BarColNum_CTRL") ;
      if ( GXutil.len( sCtrlAV90BarColNum) > 0 )
      {
         AV90BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV90BarColNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90BarColNum), 6, 0));
      }
      else
      {
         AV90BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV90BarColNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV91BarColNum_to = httpContext.cgiGet( sPrefix+"AV91BarColNum_to_CTRL") ;
      if ( GXutil.len( sCtrlAV91BarColNum_to) > 0 )
      {
         AV91BarColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV91BarColNum_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91BarColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91BarColNum_to), 6, 0));
      }
      else
      {
         AV91BarColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV91BarColNum_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV100Barestreo = httpContext.cgiGet( sPrefix+"AV100Barestreo_CTRL") ;
      if ( GXutil.len( sCtrlAV100Barestreo) > 0 )
      {
         AV100Barestreo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV100Barestreo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100Barestreo", GXutil.str( AV100Barestreo, 1, 0));
      }
      else
      {
         AV100Barestreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV100Barestreo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV137Barestreoi = httpContext.cgiGet( sPrefix+"AV137Barestreoi_CTRL") ;
      if ( GXutil.len( sCtrlAV137Barestreoi) > 0 )
      {
         AV137Barestreoi = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV137Barestreoi), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV137Barestreoi", GXutil.str( AV137Barestreoi, 1, 0));
      }
      else
      {
         AV137Barestreoi = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV137Barestreoi_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV138Barestreof = httpContext.cgiGet( sPrefix+"AV138Barestreof_CTRL") ;
      if ( GXutil.len( sCtrlAV138Barestreof) > 0 )
      {
         AV138Barestreof = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV138Barestreof), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV138Barestreof", GXutil.str( AV138Barestreof, 1, 0));
      }
      else
      {
         AV138Barestreof = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV138Barestreof_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV99Tipdiscod = httpContext.cgiGet( sPrefix+"AV99Tipdiscod_CTRL") ;
      if ( GXutil.len( sCtrlAV99Tipdiscod) > 0 )
      {
         AV99Tipdiscod = httpContext.cgiGet( sCtrlAV99Tipdiscod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99Tipdiscod", AV99Tipdiscod);
      }
      else
      {
         AV99Tipdiscod = httpContext.cgiGet( sPrefix+"AV99Tipdiscod_PARM") ;
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
      pa1BA2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1BA2( ) ;
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
      ws1BA2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV80EmprCod_PARM", GXutil.rtrim( AV80EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV80EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV80EmprCod_CTRL", GXutil.rtrim( sCtrlAV80EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV95Prio_PARM", GXutil.rtrim( AV95Prio));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV95Prio)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV95Prio_CTRL", GXutil.rtrim( sCtrlAV95Prio));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV81Clicod_PARM", GXutil.ltrim( localUtil.ntoc( AV81Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV81Clicod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV81Clicod_CTRL", GXutil.rtrim( sCtrlAV81Clicod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV82Clicod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV82Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV82Clicod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV82Clicod_to_CTRL", GXutil.rtrim( sCtrlAV82Clicod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV83ALbProfch_PARM", localUtil.dtoc( AV83ALbProfch, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV83ALbProfch)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV83ALbProfch_CTRL", GXutil.rtrim( sCtrlAV83ALbProfch));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV84ALbProfch_to_PARM", localUtil.dtoc( AV84ALbProfch_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV84ALbProfch_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV84ALbProfch_to_CTRL", GXutil.rtrim( sCtrlAV84ALbProfch_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV85Barser_PARM", GXutil.rtrim( AV85Barser));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV85Barser)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV85Barser_CTRL", GXutil.rtrim( sCtrlAV85Barser));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV86Barser_to_PARM", GXutil.rtrim( AV86Barser_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV86Barser_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV86Barser_to_CTRL", GXutil.rtrim( sCtrlAV86Barser_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV87AlbEncCli_PARM", GXutil.rtrim( AV87AlbEncCli));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV87AlbEncCli)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV87AlbEncCli_CTRL", GXutil.rtrim( sCtrlAV87AlbEncCli));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV88AlbEncCli_to_PARM", GXutil.rtrim( AV88AlbEncCli_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV88AlbEncCli_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV88AlbEncCli_to_CTRL", GXutil.rtrim( sCtrlAV88AlbEncCli_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV120BarColNom_PARM", GXutil.rtrim( AV120BarColNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV120BarColNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV120BarColNom_CTRL", GXutil.rtrim( sCtrlAV120BarColNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV119BarColNom_to_PARM", GXutil.rtrim( AV119BarColNom_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV119BarColNom_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV119BarColNom_to_CTRL", GXutil.rtrim( sCtrlAV119BarColNom_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV90BarColNum_PARM", GXutil.ltrim( localUtil.ntoc( AV90BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV90BarColNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV90BarColNum_CTRL", GXutil.rtrim( sCtrlAV90BarColNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV91BarColNum_to_PARM", GXutil.ltrim( localUtil.ntoc( AV91BarColNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV91BarColNum_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV91BarColNum_to_CTRL", GXutil.rtrim( sCtrlAV91BarColNum_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV100Barestreo_PARM", GXutil.ltrim( localUtil.ntoc( AV100Barestreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV100Barestreo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV100Barestreo_CTRL", GXutil.rtrim( sCtrlAV100Barestreo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV137Barestreoi_PARM", GXutil.ltrim( localUtil.ntoc( AV137Barestreoi, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV137Barestreoi)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV137Barestreoi_CTRL", GXutil.rtrim( sCtrlAV137Barestreoi));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV138Barestreof_PARM", GXutil.ltrim( localUtil.ntoc( AV138Barestreof, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV138Barestreof)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV138Barestreof_CTRL", GXutil.rtrim( sCtrlAV138Barestreof));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV99Tipdiscod_PARM", GXutil.rtrim( AV99Tipdiscod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV99Tipdiscod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV99Tipdiscod_CTRL", GXutil.rtrim( sCtrlAV99Tipdiscod));
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
      we1BA2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115562982", true, true);
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
      httpContext.AddJavascriptSource("informealbaranesproducciondetallado_wc.js", "?202682115562983", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_362( )
   {
      edtGuiRemCli_Internalname = sPrefix+"GUIREMCLI_"+sGXsfl_36_idx ;
      edtGuiRemCln_Internalname = sPrefix+"GUIREMCLN_"+sGXsfl_36_idx ;
      edtAlbProCod_Internalname = sPrefix+"ALBPROCOD_"+sGXsfl_36_idx ;
      edtAlbProfch_Internalname = sPrefix+"ALBPROFCH_"+sGXsfl_36_idx ;
      edtavBarenccli_Internalname = sPrefix+"vBARENCCLI_"+sGXsfl_36_idx ;
      edtBarFecCli_Internalname = sPrefix+"BARFECCLI_"+sGXsfl_36_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_36_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_36_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_36_idx ;
      edtBarTipArtD_Internalname = sPrefix+"BARTIPARTD_"+sGXsfl_36_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_36_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_36_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_36_idx ;
      edtBarTipCol_Internalname = sPrefix+"BARTIPCOL_"+sGXsfl_36_idx ;
      edtavTipcoldsc_Internalname = sPrefix+"vTIPCOLDSC_"+sGXsfl_36_idx ;
      edtavIntdsc_Internalname = sPrefix+"vINTDSC_"+sGXsfl_36_idx ;
      edtavBarkgm_Internalname = sPrefix+"vBARKGM_"+sGXsfl_36_idx ;
      edtavBaralbkgme_Internalname = sPrefix+"vBARALBKGME_"+sGXsfl_36_idx ;
      edtavBaralbmtre_Internalname = sPrefix+"vBARALBMTRE_"+sGXsfl_36_idx ;
      edtBarAlbPie_Internalname = sPrefix+"BARALBPIE_"+sGXsfl_36_idx ;
   }

   public void subsflControlProps_fel_362( )
   {
      edtGuiRemCli_Internalname = sPrefix+"GUIREMCLI_"+sGXsfl_36_fel_idx ;
      edtGuiRemCln_Internalname = sPrefix+"GUIREMCLN_"+sGXsfl_36_fel_idx ;
      edtAlbProCod_Internalname = sPrefix+"ALBPROCOD_"+sGXsfl_36_fel_idx ;
      edtAlbProfch_Internalname = sPrefix+"ALBPROFCH_"+sGXsfl_36_fel_idx ;
      edtavBarenccli_Internalname = sPrefix+"vBARENCCLI_"+sGXsfl_36_fel_idx ;
      edtBarFecCli_Internalname = sPrefix+"BARFECCLI_"+sGXsfl_36_fel_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_36_fel_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_36_fel_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_36_fel_idx ;
      edtBarTipArtD_Internalname = sPrefix+"BARTIPARTD_"+sGXsfl_36_fel_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_36_fel_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_36_fel_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_36_fel_idx ;
      edtBarTipCol_Internalname = sPrefix+"BARTIPCOL_"+sGXsfl_36_fel_idx ;
      edtavTipcoldsc_Internalname = sPrefix+"vTIPCOLDSC_"+sGXsfl_36_fel_idx ;
      edtavIntdsc_Internalname = sPrefix+"vINTDSC_"+sGXsfl_36_fel_idx ;
      edtavBarkgm_Internalname = sPrefix+"vBARKGM_"+sGXsfl_36_fel_idx ;
      edtavBaralbkgme_Internalname = sPrefix+"vBARALBKGME_"+sGXsfl_36_fel_idx ;
      edtavBaralbmtre_Internalname = sPrefix+"vBARALBMTRE_"+sGXsfl_36_fel_idx ;
      edtBarAlbPie_Internalname = sPrefix+"BARALBPIE_"+sGXsfl_36_fel_idx ;
   }

   public void sendrow_362( )
   {
      subsflControlProps_362( ) ;
      wb1BA0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_36_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_36_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_36_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtGuiRemCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiRemCli_Internalname,GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtGuiRemCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtGuiRemCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtGuiRemCln_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiRemCln_Internalname,GXutil.rtrim( A1244GuiRemCln),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtGuiRemCln_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtGuiRemCln_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbProCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProCod_Internalname,GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbProCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbProfch_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProfch_Internalname,localUtil.format(A34AlbProfch, "99/99/99"),localUtil.format( A34AlbProfch, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbProfch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbProfch_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavBarenccli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarenccli_Internalname,GXutil.rtrim( AV16BarEncCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarenccli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarenccli_Visible),Integer.valueOf(edtavBarenccli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecCli_Internalname,localUtil.format(A155BarFecCli, "99/99/99"),localUtil.format( A155BarFecCli, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarFecCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarTipArtD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipArtD_Internalname,GXutil.rtrim( A13711BarTipArtD),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTipArtD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarTipArtD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNomCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNomCli_Internalname,GXutil.rtrim( A1234BarNomCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarNomCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipCol_Internalname,GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTipCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavTipcoldsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTipcoldsc_Internalname,GXutil.rtrim( AV18TipColDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTipcoldsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavTipcoldsc_Visible),Integer.valueOf(edtavTipcoldsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavIntdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavIntdsc_Internalname,GXutil.rtrim( AV19IntDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavIntdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavIntdsc_Visible),Integer.valueOf(edtavIntdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavBarkgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarkgm_Internalname,GXutil.ltrim( localUtil.ntoc( AV149BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarkgm_Enabled!=0) ? localUtil.format( AV149BarKgm, "ZZZZZ9.99") : localUtil.format( AV149BarKgm, "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarkgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarkgm_Visible),Integer.valueOf(edtavBarkgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavBaralbkgme_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBaralbkgme_Internalname,GXutil.ltrim( localUtil.ntoc( AV142BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBaralbkgme_Enabled!=0) ? localUtil.format( AV142BarAlbKgmE, "ZZZZZ9.99") : localUtil.format( AV142BarAlbKgmE, "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBaralbkgme_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBaralbkgme_Visible),Integer.valueOf(edtavBaralbkgme_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavBaralbmtre_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBaralbmtre_Internalname,GXutil.ltrim( localUtil.ntoc( AV143BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBaralbmtre_Enabled!=0) ? localUtil.format( AV143BarAlbMtrE, "ZZZZZ9.99") : localUtil.format( AV143BarAlbMtrE, "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBaralbmtre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBaralbmtre_Visible),Integer.valueOf(edtavBaralbmtre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAlbPie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbPie_Internalname,GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarAlbPie_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1BA2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_36_idx = ((subGrid_Islastpage==1)&&(nGXsfl_36_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_36_idx+1) ;
         sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_362( ) ;
      }
      /* End function sendrow_362 */
   }

   public void startgridcontrol36( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"36\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtGuiRemCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtGuiRemCln_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbProCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Albaran", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbProfch_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Alb", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarenccli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pedido Cli", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Disposicion Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarTipArtD_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Composicion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNomCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cli", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavTipcoldsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavIntdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Intensidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarkgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos Cru.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBaralbkgme_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBaralbmtre_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAlbPie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtGuiRemCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1244GuiRemCln));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtGuiRemCln_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbProCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A34AlbProfch, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbProfch_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV16BarEncCli));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarenccli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarenccli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A155BarFecCli, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecCli_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13711BarTipArtD));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarTipArtD_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1234BarNomCli));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNomCli_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV18TipColDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTipcoldsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavTipcoldsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV19IntDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavIntdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavIntdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV149BarKgm, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarkgm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarkgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV142BarAlbKgmE, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBaralbkgme_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBaralbkgme_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV143BarAlbMtrE, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBaralbmtre_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBaralbmtre_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbPie_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtGuiRemCli_Internalname = sPrefix+"GUIREMCLI" ;
      edtGuiRemCln_Internalname = sPrefix+"GUIREMCLN" ;
      edtAlbProCod_Internalname = sPrefix+"ALBPROCOD" ;
      edtAlbProfch_Internalname = sPrefix+"ALBPROFCH" ;
      edtavBarenccli_Internalname = sPrefix+"vBARENCCLI" ;
      edtBarFecCli_Internalname = sPrefix+"BARFECCLI" ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR" ;
      edtBarSer_Internalname = sPrefix+"BARSER" ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC" ;
      edtBarTipArtD_Internalname = sPrefix+"BARTIPARTD" ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI" ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM" ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM" ;
      edtBarTipCol_Internalname = sPrefix+"BARTIPCOL" ;
      edtavTipcoldsc_Internalname = sPrefix+"vTIPCOLDSC" ;
      edtavIntdsc_Internalname = sPrefix+"vINTDSC" ;
      edtavBarkgm_Internalname = sPrefix+"vBARKGM" ;
      edtavBaralbkgme_Internalname = sPrefix+"vBARALBKGME" ;
      edtavBaralbmtre_Internalname = sPrefix+"vBARALBMTRE" ;
      edtBarAlbPie_Internalname = sPrefix+"BARALBPIE" ;
      edtavTotvaluebarkgm_Internalname = sPrefix+"vTOTVALUEBARKGM" ;
      edtavTotvaluebaralbkgme_Internalname = sPrefix+"vTOTVALUEBARALBKGME" ;
      edtavTotvaluebaralbmtre_Internalname = sPrefix+"vTOTVALUEBARALBMTRE" ;
      edtavTotvaluebaralbpie_Internalname = sPrefix+"vTOTVALUEBARALBPIE" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Innewwindow1_Internalname = sPrefix+"INNEWWINDOW1" ;
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
      edtBarAlbPie_Jsonclick = "" ;
      edtavBaralbmtre_Jsonclick = "" ;
      edtavBaralbmtre_Enabled = 0 ;
      edtavBaralbkgme_Jsonclick = "" ;
      edtavBaralbkgme_Enabled = 0 ;
      edtavBarkgm_Jsonclick = "" ;
      edtavBarkgm_Enabled = 0 ;
      edtavIntdsc_Jsonclick = "" ;
      edtavIntdsc_Enabled = 0 ;
      edtavTipcoldsc_Jsonclick = "" ;
      edtavTipcoldsc_Enabled = 0 ;
      edtBarTipCol_Jsonclick = "" ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarTipArtD_Jsonclick = "" ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtBarNHdr_Jsonclick = "" ;
      edtBarFecCli_Jsonclick = "" ;
      edtavBarenccli_Jsonclick = "" ;
      edtavBarenccli_Enabled = 0 ;
      edtAlbProfch_Jsonclick = "" ;
      edtAlbProCod_Jsonclick = "" ;
      edtGuiRemCln_Jsonclick = "" ;
      edtGuiRemCli_Jsonclick = "" ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvaluebaralbpie_Jsonclick = "" ;
      edtavTotvaluebaralbpie_Enabled = 1 ;
      edtavTotvaluebaralbmtre_Jsonclick = "" ;
      edtavTotvaluebaralbmtre_Enabled = 1 ;
      edtavTotvaluebaralbkgme_Jsonclick = "" ;
      edtavTotvaluebaralbkgme_Enabled = 1 ;
      edtavTotvaluebarkgm_Jsonclick = "" ;
      edtavTotvaluebarkgm_Enabled = 1 ;
      edtBarAlbPie_Visible = -1 ;
      edtavBaralbmtre_Visible = -1 ;
      edtavBaralbkgme_Visible = -1 ;
      edtavBarkgm_Visible = -1 ;
      edtavIntdsc_Visible = -1 ;
      edtavTipcoldsc_Visible = -1 ;
      edtBarColNum_Visible = -1 ;
      edtBarColNom_Visible = -1 ;
      edtBarNomCli_Visible = -1 ;
      edtBarTipArtD_Visible = -1 ;
      edtBarSerDsc_Visible = -1 ;
      edtBarSer_Visible = -1 ;
      edtBarNHdr_Visible = -1 ;
      edtBarFecCli_Visible = -1 ;
      edtavBarenccli_Visible = -1 ;
      edtAlbProfch_Visible = -1 ;
      edtAlbProCod_Visible = -1 ;
      edtGuiRemCln_Visible = -1 ;
      edtGuiRemCli_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;;;;;;;;;;Entregados;Entregados;" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "InformeAlbaranesProduccionDetallado_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "||||||||||||||Dynamic||||" ;
      Ddo_grid_Includedatalist = "||||||||||||||T||||" ;
      Ddo_grid_Filtertype = "||||||||||||||Character||||" ;
      Ddo_grid_Includefilter = "||||||||||||||T||||" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T||T||T|T|T|T|T|T||||||T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5||6||7|8|9|10|11|12||||||13" ;
      Ddo_grid_Columnids = "0:GuiRemCli|1:GuiRemCln|2:AlbProCod|3:AlbProfch|4:BarEncCli|5:BarFecCli|6:BarNHdr|7:BarSer|8:BarSerDsc|9:BarTipArtDsc|10:BarNomCli|11:BarColNom|12:BarColNum|14:TipColDsc|15:IntDsc|16:BarKgm|17:BarAlbKgmE|18:BarAlbMtrE|19:BarAlbPie" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV18TipColDsc',fld:'vTIPCOLDSC',pic:'',hsh:true},{av:'AV19IntDsc',fld:'vINTDSC',pic:'',hsh:true},{av:'sPrefix'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV80EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV95Prio',fld:'vPRIO',pic:'9'},{av:'AV81Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV82Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV83ALbProfch',fld:'vALBPROFCH',pic:''},{av:'AV84ALbProfch_to',fld:'vALBPROFCH_TO',pic:''},{av:'AV85Barser',fld:'vBARSER',pic:''},{av:'AV86Barser_to',fld:'vBARSER_TO',pic:''},{av:'AV87AlbEncCli',fld:'vALBENCCLI',pic:''},{av:'AV88AlbEncCli_to',fld:'vALBENCCLI_TO',pic:''},{av:'AV120BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV119BarColNom_to',fld:'vBARCOLNOM_TO',pic:''},{av:'AV90BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV91BarColNum_to',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV137Barestreoi',fld:'vBARESTREOI',pic:'9'},{av:'AV138Barestreof',fld:'vBARESTREOF',pic:'9'},{av:'AV99Tipdiscod',fld:'vTIPDISCOD',pic:''},{av:'AV152Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV131TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV132TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV100Barestreo',fld:'vBARESTREO',pic:'9'},{av:'AV127TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV144moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV121TotBarAlbKgmE',fld:'vTOTBARALBKGME',pic:'ZZZZZ9.99',hsh:true},{av:'AV123TotBarAlbMtrE',fld:'vTOTBARALBMTRE',pic:'ZZZZZ9.99',hsh:true},{av:'AV125TotBarAlbPie',fld:'vTOTBARALBPIE',pic:'ZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A39AlbProPri',fld:'ALBPROPRI',pic:'9'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A148BarEstReo',fld:'BARESTREO',pic:'9'},{av:'A2010BarTipDis',fld:'BARTIPDIS',pic:'@!'},{av:'A5140AlbMarca',fld:'ALBMARCA',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A2243BarKgsCli',fld:'BARKGSCLI',pic:'ZZZZZ9.99'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'A1461BarAlbPN',fld:'BARALBPN',pic:'ZZZZZ9.99'},{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtGuiRemCli_Visible',ctrl:'GUIREMCLI',prop:'Visible'},{av:'edtGuiRemCln_Visible',ctrl:'GUIREMCLN',prop:'Visible'},{av:'edtAlbProCod_Visible',ctrl:'ALBPROCOD',prop:'Visible'},{av:'edtAlbProfch_Visible',ctrl:'ALBPROFCH',prop:'Visible'},{av:'edtavBarenccli_Visible',ctrl:'vBARENCCLI',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtavTipcoldsc_Visible',ctrl:'vTIPCOLDSC',prop:'Visible'},{av:'edtavIntdsc_Visible',ctrl:'vINTDSC',prop:'Visible'},{av:'edtavBarkgm_Visible',ctrl:'vBARKGM',prop:'Visible'},{av:'edtavBaralbkgme_Visible',ctrl:'vBARALBKGME',prop:'Visible'},{av:'edtavBaralbmtre_Visible',ctrl:'vBARALBMTRE',prop:'Visible'},{av:'edtBarAlbPie_Visible',ctrl:'BARALBPIE',prop:'Visible'},{av:'AV74GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV75GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV127TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV121TotBarAlbKgmE',fld:'vTOTBARALBKGME',pic:'ZZZZZ9.99',hsh:true},{av:'AV123TotBarAlbMtrE',fld:'vTOTBARALBMTRE',pic:'ZZZZZ9.99',hsh:true},{av:'AV125TotBarAlbPie',fld:'vTOTBARALBPIE',pic:'ZZZZZ9',hsh:true},{av:'AV149BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV142BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV143BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV128TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV122TotValueBarAlbKgmE',fld:'vTOTVALUEBARALBKGME',pic:''},{av:'AV124TotValueBarAlbMtrE',fld:'vTOTVALUEBARALBMTRE',pic:''},{av:'AV126TotValueBarAlbPie',fld:'vTOTVALUEBARALBPIE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111BA2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV80EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV95Prio',fld:'vPRIO',pic:'9'},{av:'AV81Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV82Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV83ALbProfch',fld:'vALBPROFCH',pic:''},{av:'AV84ALbProfch_to',fld:'vALBPROFCH_TO',pic:''},{av:'AV85Barser',fld:'vBARSER',pic:''},{av:'AV86Barser_to',fld:'vBARSER_TO',pic:''},{av:'AV87AlbEncCli',fld:'vALBENCCLI',pic:''},{av:'AV88AlbEncCli_to',fld:'vALBENCCLI_TO',pic:''},{av:'AV120BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV119BarColNom_to',fld:'vBARCOLNOM_TO',pic:''},{av:'AV90BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV91BarColNum_to',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV137Barestreoi',fld:'vBARESTREOI',pic:'9'},{av:'AV138Barestreof',fld:'vBARESTREOF',pic:'9'},{av:'AV99Tipdiscod',fld:'vTIPDISCOD',pic:''},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV152Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV131TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV132TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV100Barestreo',fld:'vBARESTREO',pic:'9'},{av:'AV127TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV144moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV121TotBarAlbKgmE',fld:'vTOTBARALBKGME',pic:'ZZZZZ9.99',hsh:true},{av:'AV123TotBarAlbMtrE',fld:'vTOTBARALBMTRE',pic:'ZZZZZ9.99',hsh:true},{av:'AV125TotBarAlbPie',fld:'vTOTBARALBPIE',pic:'ZZZZZ9',hsh:true},{av:'AV18TipColDsc',fld:'vTIPCOLDSC',pic:'',hsh:true},{av:'AV19IntDsc',fld:'vINTDSC',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121BA2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV80EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV95Prio',fld:'vPRIO',pic:'9'},{av:'AV81Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV82Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV83ALbProfch',fld:'vALBPROFCH',pic:''},{av:'AV84ALbProfch_to',fld:'vALBPROFCH_TO',pic:''},{av:'AV85Barser',fld:'vBARSER',pic:''},{av:'AV86Barser_to',fld:'vBARSER_TO',pic:''},{av:'AV87AlbEncCli',fld:'vALBENCCLI',pic:''},{av:'AV88AlbEncCli_to',fld:'vALBENCCLI_TO',pic:''},{av:'AV120BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV119BarColNom_to',fld:'vBARCOLNOM_TO',pic:''},{av:'AV90BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV91BarColNum_to',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV137Barestreoi',fld:'vBARESTREOI',pic:'9'},{av:'AV138Barestreof',fld:'vBARESTREOF',pic:'9'},{av:'AV99Tipdiscod',fld:'vTIPDISCOD',pic:''},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV152Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV131TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV132TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV100Barestreo',fld:'vBARESTREO',pic:'9'},{av:'AV127TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV144moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV121TotBarAlbKgmE',fld:'vTOTBARALBKGME',pic:'ZZZZZ9.99',hsh:true},{av:'AV123TotBarAlbMtrE',fld:'vTOTBARALBMTRE',pic:'ZZZZZ9.99',hsh:true},{av:'AV125TotBarAlbPie',fld:'vTOTBARALBPIE',pic:'ZZZZZ9',hsh:true},{av:'AV18TipColDsc',fld:'vTIPCOLDSC',pic:'',hsh:true},{av:'AV19IntDsc',fld:'vINTDSC',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e131BA2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV80EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV95Prio',fld:'vPRIO',pic:'9'},{av:'AV81Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV82Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV83ALbProfch',fld:'vALBPROFCH',pic:''},{av:'AV84ALbProfch_to',fld:'vALBPROFCH_TO',pic:''},{av:'AV85Barser',fld:'vBARSER',pic:''},{av:'AV86Barser_to',fld:'vBARSER_TO',pic:''},{av:'AV87AlbEncCli',fld:'vALBENCCLI',pic:''},{av:'AV88AlbEncCli_to',fld:'vALBENCCLI_TO',pic:''},{av:'AV120BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV119BarColNom_to',fld:'vBARCOLNOM_TO',pic:''},{av:'AV90BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV91BarColNum_to',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV137Barestreoi',fld:'vBARESTREOI',pic:'9'},{av:'AV138Barestreof',fld:'vBARESTREOF',pic:'9'},{av:'AV99Tipdiscod',fld:'vTIPDISCOD',pic:''},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV152Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV131TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV132TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV100Barestreo',fld:'vBARESTREO',pic:'9'},{av:'AV127TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV144moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV121TotBarAlbKgmE',fld:'vTOTBARALBKGME',pic:'ZZZZZ9.99',hsh:true},{av:'AV123TotBarAlbMtrE',fld:'vTOTBARALBMTRE',pic:'ZZZZZ9.99',hsh:true},{av:'AV125TotBarAlbPie',fld:'vTOTBARALBPIE',pic:'ZZZZZ9',hsh:true},{av:'AV18TipColDsc',fld:'vTIPCOLDSC',pic:'',hsh:true},{av:'AV19IntDsc',fld:'vINTDSC',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV131TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV132TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e201BA2',iparms:[{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'AV18TipColDsc',fld:'vTIPCOLDSC',pic:'',hsh:true},{av:'AV19IntDsc',fld:'vINTDSC',pic:'',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'AV144moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A2243BarKgsCli',fld:'BARKGSCLI',pic:'ZZZZZ9.99'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'A1461BarAlbPN',fld:'BARALBPN',pic:'ZZZZZ9.99'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV16BarEncCli',fld:'vBARENCCLI',pic:''},{av:'AV18TipColDsc',fld:'vTIPCOLDSC',pic:'',hsh:true},{av:'AV19IntDsc',fld:'vINTDSC',pic:'',hsh:true},{av:'AV149BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV142BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV143BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e141BA2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV80EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV95Prio',fld:'vPRIO',pic:'9'},{av:'AV81Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV82Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV83ALbProfch',fld:'vALBPROFCH',pic:''},{av:'AV84ALbProfch_to',fld:'vALBPROFCH_TO',pic:''},{av:'AV85Barser',fld:'vBARSER',pic:''},{av:'AV86Barser_to',fld:'vBARSER_TO',pic:''},{av:'AV87AlbEncCli',fld:'vALBENCCLI',pic:''},{av:'AV88AlbEncCli_to',fld:'vALBENCCLI_TO',pic:''},{av:'AV120BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV119BarColNom_to',fld:'vBARCOLNOM_TO',pic:''},{av:'AV90BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV91BarColNum_to',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV137Barestreoi',fld:'vBARESTREOI',pic:'9'},{av:'AV138Barestreof',fld:'vBARESTREOF',pic:'9'},{av:'AV99Tipdiscod',fld:'vTIPDISCOD',pic:''},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV152Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV131TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV132TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV100Barestreo',fld:'vBARESTREO',pic:'9'},{av:'AV127TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV144moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV121TotBarAlbKgmE',fld:'vTOTBARALBKGME',pic:'ZZZZZ9.99',hsh:true},{av:'AV123TotBarAlbMtrE',fld:'vTOTBARALBMTRE',pic:'ZZZZZ9.99',hsh:true},{av:'AV125TotBarAlbPie',fld:'vTOTBARALBPIE',pic:'ZZZZZ9',hsh:true},{av:'AV18TipColDsc',fld:'vTIPCOLDSC',pic:'',hsh:true},{av:'AV19IntDsc',fld:'vINTDSC',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A39AlbProPri',fld:'ALBPROPRI',pic:'9'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A148BarEstReo',fld:'BARESTREO',pic:'9'},{av:'A2010BarTipDis',fld:'BARTIPDIS',pic:'@!'},{av:'A5140AlbMarca',fld:'ALBMARCA',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A2243BarKgsCli',fld:'BARKGSCLI',pic:'ZZZZZ9.99'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'A1461BarAlbPN',fld:'BARALBPN',pic:'ZZZZZ9.99'},{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtGuiRemCli_Visible',ctrl:'GUIREMCLI',prop:'Visible'},{av:'edtGuiRemCln_Visible',ctrl:'GUIREMCLN',prop:'Visible'},{av:'edtAlbProCod_Visible',ctrl:'ALBPROCOD',prop:'Visible'},{av:'edtAlbProfch_Visible',ctrl:'ALBPROFCH',prop:'Visible'},{av:'edtavBarenccli_Visible',ctrl:'vBARENCCLI',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtavTipcoldsc_Visible',ctrl:'vTIPCOLDSC',prop:'Visible'},{av:'edtavIntdsc_Visible',ctrl:'vINTDSC',prop:'Visible'},{av:'edtavBarkgm_Visible',ctrl:'vBARKGM',prop:'Visible'},{av:'edtavBaralbkgme_Visible',ctrl:'vBARALBKGME',prop:'Visible'},{av:'edtavBaralbmtre_Visible',ctrl:'vBARALBMTRE',prop:'Visible'},{av:'edtBarAlbPie_Visible',ctrl:'BARALBPIE',prop:'Visible'},{av:'AV74GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV75GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV127TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV121TotBarAlbKgmE',fld:'vTOTBARALBKGME',pic:'ZZZZZ9.99',hsh:true},{av:'AV123TotBarAlbMtrE',fld:'vTOTBARALBMTRE',pic:'ZZZZZ9.99',hsh:true},{av:'AV125TotBarAlbPie',fld:'vTOTBARALBPIE',pic:'ZZZZZ9',hsh:true},{av:'AV149BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV142BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV143BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV128TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV122TotValueBarAlbKgmE',fld:'vTOTVALUEBARALBKGME',pic:''},{av:'AV124TotValueBarAlbMtrE',fld:'vTOTVALUEBARALBMTRE',pic:''},{av:'AV126TotValueBarAlbPie',fld:'vTOTVALUEBARALBPIE',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e151BA2',iparms:[{av:'AV83ALbProfch',fld:'vALBPROFCH',pic:''},{av:'AV84ALbProfch_to',fld:'vALBPROFCH_TO',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e171BA2',iparms:[{av:'AV80EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV96ImpCod',fld:'vIMPCOD',pic:''},{av:'AV95Prio',fld:'vPRIO',pic:'9'},{av:'AV81Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV82Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV83ALbProfch',fld:'vALBPROFCH',pic:''},{av:'AV84ALbProfch_to',fld:'vALBPROFCH_TO',pic:''},{av:'AV85Barser',fld:'vBARSER',pic:''},{av:'AV86Barser_to',fld:'vBARSER_TO',pic:''},{av:'AV87AlbEncCli',fld:'vALBENCCLI',pic:''},{av:'AV88AlbEncCli_to',fld:'vALBENCCLI_TO',pic:''},{av:'AV101Fuente',fld:'vFUENTE',pic:'Z9'},{av:'AV102Barcodi',fld:'vBARCODI',pic:'ZZZZZZZ9'},{av:'AV103Barcodreof',fld:'vBARCODREOF',pic:'9'},{av:'AV104Barcodparf',fld:'vBARCODPARF',pic:''},{av:'AV120BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV119BarColNom_to',fld:'vBARCOLNOM_TO',pic:''},{av:'AV90BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV91BarColNum_to',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV107BarMaqEst1',fld:'vBARMAQEST1',pic:''},{av:'AV108BarMaqEst2',fld:'vBARMAQEST2',pic:''},{av:'AV97Serie',fld:'vSERIE',pic:''},{av:'AV109Nfi',fld:'vNFI',pic:'ZZZZZ9'},{av:'AV110Nff',fld:'vNFF',pic:'ZZZZZ9'},{av:'AV98Barlar',fld:'vBARLAR',pic:''},{av:'AV99Tipdiscod',fld:'vTIPDISCOD',pic:''},{av:'AV100Barestreo',fld:'vBARESTREO',pic:'9'},{av:'AV111DetalleRollos',fld:'vDETALLEROLLOS',pic:'9'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'AV111DetalleRollos',fld:'vDETALLEROLLOS',pic:'9'},{av:'AV100Barestreo',fld:'vBARESTREO',pic:'9'},{av:'AV99Tipdiscod',fld:'vTIPDISCOD',pic:''},{av:'AV98Barlar',fld:'vBARLAR',pic:''},{av:'AV110Nff',fld:'vNFF',pic:'ZZZZZ9'},{av:'AV109Nfi',fld:'vNFI',pic:'ZZZZZ9'},{av:'AV97Serie',fld:'vSERIE',pic:''},{av:'AV108BarMaqEst2',fld:'vBARMAQEST2',pic:''},{av:'AV107BarMaqEst1',fld:'vBARMAQEST1',pic:''},{av:'AV91BarColNum_to',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV90BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV119BarColNom_to',fld:'vBARCOLNOM_TO',pic:''},{av:'AV120BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV104Barcodparf',fld:'vBARCODPARF',pic:''},{av:'AV103Barcodreof',fld:'vBARCODREOF',pic:'9'},{av:'AV102Barcodi',fld:'vBARCODI',pic:'ZZZZZZZ9'},{av:'AV101Fuente',fld:'vFUENTE',pic:'Z9'},{av:'AV88AlbEncCli_to',fld:'vALBENCCLI_TO',pic:''},{av:'AV87AlbEncCli',fld:'vALBENCCLI',pic:''},{av:'AV86Barser_to',fld:'vBARSER_TO',pic:''},{av:'AV85Barser',fld:'vBARSER',pic:''},{av:'AV84ALbProfch_to',fld:'vALBPROFCH_TO',pic:''},{av:'AV83ALbProfch',fld:'vALBPROFCH',pic:''},{av:'AV82Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV81Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV95Prio',fld:'vPRIO',pic:'9'},{av:'AV96ImpCod',fld:'vIMPCOD',pic:''},{av:'AV80EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e161BA2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_GUIREMCLI","{handler:'valid_Guiremcli',iparms:[]");
      setEventMetadata("VALID_GUIREMCLI",",oparms:[]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Baralbpie',iparms:[]");
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
      wcpOAV80EmprCod = "" ;
      wcpOAV95Prio = "" ;
      wcpOAV83ALbProfch = GXutil.nullDate() ;
      wcpOAV84ALbProfch_to = GXutil.nullDate() ;
      wcpOAV85Barser = "" ;
      wcpOAV86Barser_to = "" ;
      wcpOAV87AlbEncCli = "" ;
      wcpOAV88AlbEncCli_to = "" ;
      wcpOAV120BarColNom = "" ;
      wcpOAV119BarColNom_to = "" ;
      wcpOAV99Tipdiscod = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV80EmprCod = "" ;
      AV95Prio = "" ;
      AV83ALbProfch = GXutil.nullDate() ;
      AV84ALbProfch_to = GXutil.nullDate() ;
      AV85Barser = "" ;
      AV86Barser_to = "" ;
      AV87AlbEncCli = "" ;
      AV88AlbEncCli_to = "" ;
      AV120BarColNom = "" ;
      AV119BarColNom_to = "" ;
      AV99Tipdiscod = "" ;
      AV26ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV152Pgmname = "" ;
      AV131TFIntDsc = "" ;
      AV132TFIntDsc_Sel = "" ;
      AV127TotBarKgm = DecimalUtil.ZERO ;
      AV121TotBarAlbKgmE = DecimalUtil.ZERO ;
      AV123TotBarAlbMtrE = DecimalUtil.ZERO ;
      AV18TipColDsc = "" ;
      AV19IntDsc = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV72DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A39AlbProPri = "" ;
      A2010BarTipDis = "" ;
      A5140AlbMarca = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A2243BarKgsCli = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1461BarAlbPN = DecimalUtil.ZERO ;
      AV96ImpCod = "" ;
      AV104Barcodparf = "" ;
      AV107BarMaqEst1 = "" ;
      AV108BarMaqEst2 = "" ;
      AV97Serie = "" ;
      AV98Barlar = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      A13878PedidoClie = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
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
      bttBtnexportreport_Jsonclick = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A1244GuiRemCln = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      AV16BarEncCli = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A13696BarNHdr = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A13711BarTipArtD = "" ;
      A1234BarNomCli = "" ;
      A135BarColNom = "" ;
      AV149BarKgm = DecimalUtil.ZERO ;
      AV142BarAlbKgmE = DecimalUtil.ZERO ;
      AV143BarAlbMtrE = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      H01BA2_A217BarTipArt = new short[1] ;
      H01BA2_n217BarTipArt = new boolean[] {false} ;
      H01BA2_A1253EmprGuiRem = new String[] {""} ;
      H01BA2_A39AlbProPri = new String[] {""} ;
      H01BA2_A148BarEstReo = new byte[1] ;
      H01BA2_A2010BarTipDis = new String[] {""} ;
      H01BA2_A5140AlbMarca = new String[] {""} ;
      H01BA2_A252CliCod = new int[1] ;
      H01BA2_n252CliCod = new boolean[] {false} ;
      H01BA2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01BA2_A2243BarKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01BA2_n2243BarKgsCli = new boolean[] {false} ;
      H01BA2_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01BA2_A1461BarAlbPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01BA2_A1265BarAlbPie = new int[1] ;
      H01BA2_A218BarTipCol = new byte[1] ;
      H01BA2_A136BarColNum = new int[1] ;
      H01BA2_A135BarColNom = new String[] {""} ;
      H01BA2_A1234BarNomCli = new String[] {""} ;
      H01BA2_A13711BarTipArtD = new String[] {""} ;
      H01BA2_n13711BarTipArtD = new boolean[] {false} ;
      H01BA2_A1652BarSerDsc = new String[] {""} ;
      H01BA2_A212BarSer = new String[] {""} ;
      H01BA2_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H01BA2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H01BA2_A30AlbProCod = new long[1] ;
      H01BA2_A1244GuiRemCln = new String[] {""} ;
      H01BA2_A1243GuiRemCli = new int[1] ;
      H01BA2_A130BarCodPar = new String[] {""} ;
      H01BA2_A132BarCodReo = new byte[1] ;
      H01BA2_A129BarCod = new int[1] ;
      H01BA2_A143BarDisNum = new String[] {""} ;
      H01BA2_A4812BarEncCli = new String[] {""} ;
      H01BA2_A396EmprCod = new String[] {""} ;
      A1253EmprGuiRem = "" ;
      H01BA3_A217BarTipArt = new short[1] ;
      H01BA3_n217BarTipArt = new boolean[] {false} ;
      H01BA3_A1253EmprGuiRem = new String[] {""} ;
      H01BA3_A39AlbProPri = new String[] {""} ;
      H01BA3_A148BarEstReo = new byte[1] ;
      H01BA3_A2010BarTipDis = new String[] {""} ;
      H01BA3_A5140AlbMarca = new String[] {""} ;
      H01BA3_A252CliCod = new int[1] ;
      H01BA3_n252CliCod = new boolean[] {false} ;
      H01BA3_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01BA3_A2243BarKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01BA3_n2243BarKgsCli = new boolean[] {false} ;
      H01BA3_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01BA3_A1461BarAlbPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01BA3_A1265BarAlbPie = new int[1] ;
      H01BA3_A218BarTipCol = new byte[1] ;
      H01BA3_A136BarColNum = new int[1] ;
      H01BA3_A135BarColNom = new String[] {""} ;
      H01BA3_A1234BarNomCli = new String[] {""} ;
      H01BA3_A13711BarTipArtD = new String[] {""} ;
      H01BA3_n13711BarTipArtD = new boolean[] {false} ;
      H01BA3_A1652BarSerDsc = new String[] {""} ;
      H01BA3_A212BarSer = new String[] {""} ;
      H01BA3_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H01BA3_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H01BA3_A30AlbProCod = new long[1] ;
      H01BA3_A1244GuiRemCln = new String[] {""} ;
      H01BA3_A1243GuiRemCli = new int[1] ;
      H01BA3_A130BarCodPar = new String[] {""} ;
      H01BA3_A132BarCodReo = new byte[1] ;
      H01BA3_A129BarCod = new int[1] ;
      H01BA3_A143BarDisNum = new String[] {""} ;
      H01BA3_A4812BarEncCli = new String[] {""} ;
      H01BA3_A396EmprCod = new String[] {""} ;
      AV128TotValueBarKgm = "" ;
      AV122TotValueBarAlbKgmE = "" ;
      AV124TotValueBarAlbMtrE = "" ;
      AV126TotValueBarAlbPie = "" ;
      hsh = "" ;
      AV139Station = "" ;
      AV140EmprNom = "" ;
      AV141UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext10 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV28Session = httpContext.getWebSession();
      AV24ColumnsSelectorXML = "" ;
      AV112WebSession = httpContext.getWebSession();
      AV113ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      GXv_int15 = new short[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int12 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int11 = new short[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV22ExcelFilename = "" ;
      AV23ErrorMessage = "" ;
      AV25UserCustomValue = "" ;
      AV27ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector20 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector21 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState22 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      H01BA4_A30AlbProCod = new long[1] ;
      H01BA4_A5140AlbMarca = new String[] {""} ;
      H01BA4_A2010BarTipDis = new String[] {""} ;
      H01BA4_A148BarEstReo = new byte[1] ;
      H01BA4_A136BarColNum = new int[1] ;
      H01BA4_A135BarColNom = new String[] {""} ;
      H01BA4_A212BarSer = new String[] {""} ;
      H01BA4_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H01BA4_A1243GuiRemCli = new int[1] ;
      H01BA4_A39AlbProPri = new String[] {""} ;
      H01BA4_A129BarCod = new int[1] ;
      H01BA4_A132BarCodReo = new byte[1] ;
      H01BA4_A130BarCodPar = new String[] {""} ;
      H01BA4_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01BA4_A2243BarKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01BA4_n2243BarKgsCli = new boolean[] {false} ;
      H01BA4_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01BA4_A1461BarAlbPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01BA4_A1265BarAlbPie = new int[1] ;
      H01BA4_A143BarDisNum = new String[] {""} ;
      H01BA4_A4812BarEncCli = new String[] {""} ;
      H01BA4_A396EmprCod = new String[] {""} ;
      H01BA5_A30AlbProCod = new long[1] ;
      H01BA5_A2010BarTipDis = new String[] {""} ;
      H01BA5_A148BarEstReo = new byte[1] ;
      H01BA5_A136BarColNum = new int[1] ;
      H01BA5_A135BarColNom = new String[] {""} ;
      H01BA5_A212BarSer = new String[] {""} ;
      H01BA5_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H01BA5_A1243GuiRemCli = new int[1] ;
      H01BA5_A39AlbProPri = new String[] {""} ;
      H01BA5_A129BarCod = new int[1] ;
      H01BA5_A132BarCodReo = new byte[1] ;
      H01BA5_A130BarCodPar = new String[] {""} ;
      H01BA5_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01BA5_A2243BarKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01BA5_n2243BarKgsCli = new boolean[] {false} ;
      H01BA5_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01BA5_A1461BarAlbPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01BA5_A1265BarAlbPie = new int[1] ;
      H01BA5_A143BarDisNum = new String[] {""} ;
      H01BA5_A4812BarEncCli = new String[] {""} ;
      H01BA5_A396EmprCod = new String[] {""} ;
      GXt_char1 = "" ;
      GXv_char17 = new String[1] ;
      GXv_char16 = new String[1] ;
      GXv_char14 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXt_decimal18 = DecimalUtil.ZERO ;
      GXv_decimal19 = new java.math.BigDecimal[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV80EmprCod = "" ;
      sCtrlAV95Prio = "" ;
      sCtrlAV81Clicod = "" ;
      sCtrlAV82Clicod_to = "" ;
      sCtrlAV83ALbProfch = "" ;
      sCtrlAV84ALbProfch_to = "" ;
      sCtrlAV85Barser = "" ;
      sCtrlAV86Barser_to = "" ;
      sCtrlAV87AlbEncCli = "" ;
      sCtrlAV88AlbEncCli_to = "" ;
      sCtrlAV120BarColNom = "" ;
      sCtrlAV119BarColNom_to = "" ;
      sCtrlAV90BarColNum = "" ;
      sCtrlAV91BarColNum_to = "" ;
      sCtrlAV100Barestreo = "" ;
      sCtrlAV137Barestreoi = "" ;
      sCtrlAV138Barestreof = "" ;
      sCtrlAV99Tipdiscod = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.informealbaranesproducciondetallado_wc__default(),
         new Object[] {
             new Object[] {
            H01BA2_A217BarTipArt, H01BA2_n217BarTipArt, H01BA2_A1253EmprGuiRem, H01BA2_A39AlbProPri, H01BA2_A148BarEstReo, H01BA2_A2010BarTipDis, H01BA2_A5140AlbMarca, H01BA2_A252CliCod, H01BA2_n252CliCod, H01BA2_A1261BarAlbKgmE,
            H01BA2_A2243BarKgsCli, H01BA2_n2243BarKgsCli, H01BA2_A1263BarAlbMtrE, H01BA2_A1461BarAlbPN, H01BA2_A1265BarAlbPie, H01BA2_A218BarTipCol, H01BA2_A136BarColNum, H01BA2_A135BarColNom, H01BA2_A1234BarNomCli, H01BA2_A13711BarTipArtD,
            H01BA2_n13711BarTipArtD, H01BA2_A1652BarSerDsc, H01BA2_A212BarSer, H01BA2_A155BarFecCli, H01BA2_A34AlbProfch, H01BA2_A30AlbProCod, H01BA2_A1244GuiRemCln, H01BA2_A1243GuiRemCli, H01BA2_A130BarCodPar, H01BA2_A132BarCodReo,
            H01BA2_A129BarCod, H01BA2_A143BarDisNum, H01BA2_A4812BarEncCli, H01BA2_A396EmprCod
            }
            , new Object[] {
            H01BA3_A217BarTipArt, H01BA3_n217BarTipArt, H01BA3_A1253EmprGuiRem, H01BA3_A39AlbProPri, H01BA3_A148BarEstReo, H01BA3_A2010BarTipDis, H01BA3_A5140AlbMarca, H01BA3_A252CliCod, H01BA3_n252CliCod, H01BA3_A1261BarAlbKgmE,
            H01BA3_A2243BarKgsCli, H01BA3_n2243BarKgsCli, H01BA3_A1263BarAlbMtrE, H01BA3_A1461BarAlbPN, H01BA3_A1265BarAlbPie, H01BA3_A218BarTipCol, H01BA3_A136BarColNum, H01BA3_A135BarColNom, H01BA3_A1234BarNomCli, H01BA3_A13711BarTipArtD,
            H01BA3_n13711BarTipArtD, H01BA3_A1652BarSerDsc, H01BA3_A212BarSer, H01BA3_A155BarFecCli, H01BA3_A34AlbProfch, H01BA3_A30AlbProCod, H01BA3_A1244GuiRemCln, H01BA3_A1243GuiRemCli, H01BA3_A130BarCodPar, H01BA3_A132BarCodReo,
            H01BA3_A129BarCod, H01BA3_A143BarDisNum, H01BA3_A4812BarEncCli, H01BA3_A396EmprCod
            }
            , new Object[] {
            H01BA4_A30AlbProCod, H01BA4_A5140AlbMarca, H01BA4_A2010BarTipDis, H01BA4_A148BarEstReo, H01BA4_A136BarColNum, H01BA4_A135BarColNom, H01BA4_A212BarSer, H01BA4_A34AlbProfch, H01BA4_A1243GuiRemCli, H01BA4_A39AlbProPri,
            H01BA4_A129BarCod, H01BA4_A132BarCodReo, H01BA4_A130BarCodPar, H01BA4_A1261BarAlbKgmE, H01BA4_A2243BarKgsCli, H01BA4_n2243BarKgsCli, H01BA4_A1263BarAlbMtrE, H01BA4_A1461BarAlbPN, H01BA4_A1265BarAlbPie, H01BA4_A143BarDisNum,
            H01BA4_A4812BarEncCli, H01BA4_A396EmprCod
            }
            , new Object[] {
            H01BA5_A30AlbProCod, H01BA5_A2010BarTipDis, H01BA5_A148BarEstReo, H01BA5_A136BarColNum, H01BA5_A135BarColNom, H01BA5_A212BarSer, H01BA5_A34AlbProfch, H01BA5_A1243GuiRemCli, H01BA5_A39AlbProPri, H01BA5_A129BarCod,
            H01BA5_A132BarCodReo, H01BA5_A130BarCodPar, H01BA5_A1261BarAlbKgmE, H01BA5_A2243BarKgsCli, H01BA5_n2243BarKgsCli, H01BA5_A1263BarAlbMtrE, H01BA5_A1461BarAlbPN, H01BA5_A1265BarAlbPie, H01BA5_A143BarDisNum, H01BA5_A4812BarEncCli,
            H01BA5_A396EmprCod
            }
         }
      );
      AV152Pgmname = "InformeAlbaranesProduccionDetallado_WC" ;
      /* GeneXus formulas. */
      AV152Pgmname = "InformeAlbaranesProduccionDetallado_WC" ;
      Gx_err = (short)(0) ;
      edtavBarenccli_Enabled = 0 ;
      edtavTipcoldsc_Enabled = 0 ;
      edtavIntdsc_Enabled = 0 ;
      edtavBarkgm_Enabled = 0 ;
      edtavBaralbkgme_Enabled = 0 ;
      edtavBaralbmtre_Enabled = 0 ;
      edtavTotvaluebarkgm_Enabled = 0 ;
      edtavTotvaluebaralbkgme_Enabled = 0 ;
      edtavTotvaluebaralbmtre_Enabled = 0 ;
      edtavTotvaluebaralbpie_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV100Barestreo ;
   private byte wcpOAV137Barestreoi ;
   private byte wcpOAV138Barestreof ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV100Barestreo ;
   private byte AV137Barestreoi ;
   private byte AV138Barestreof ;
   private byte A148BarEstReo ;
   private byte AV101Fuente ;
   private byte AV103Barcodreof ;
   private byte AV111DetalleRollos ;
   private byte A132BarCodReo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A218BarTipCol ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV135FlagPT ;
   private byte GXt_int9 ;
   private byte GXv_int8[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV12OrderedBy ;
   private short AV144moda21 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A217BarTipArt ;
   private short GXv_int15[] ;
   private short GXv_int11[] ;
   private int wcpOAV81Clicod ;
   private int wcpOAV82Clicod_to ;
   private int wcpOAV90BarColNum ;
   private int wcpOAV91BarColNum_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_36 ;
   private int AV81Clicod ;
   private int AV82Clicod_to ;
   private int AV90BarColNum ;
   private int AV91BarColNum_to ;
   private int nGXsfl_36_idx=1 ;
   private int A252CliCod ;
   private int AV102Barcodi ;
   private int AV109Nfi ;
   private int AV110Nff ;
   private int A129BarCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A1243GuiRemCli ;
   private int A136BarColNum ;
   private int A1265BarAlbPie ;
   private int subGrid_Islastpage ;
   private int edtavBarenccli_Enabled ;
   private int edtavTipcoldsc_Enabled ;
   private int edtavIntdsc_Enabled ;
   private int edtavBarkgm_Enabled ;
   private int edtavBaralbkgme_Enabled ;
   private int edtavBaralbmtre_Enabled ;
   private int edtavTotvaluebarkgm_Enabled ;
   private int edtavTotvaluebaralbkgme_Enabled ;
   private int edtavTotvaluebaralbmtre_Enabled ;
   private int edtavTotvaluebaralbpie_Enabled ;
   private int edtGuiRemCli_Visible ;
   private int edtGuiRemCln_Visible ;
   private int edtAlbProCod_Visible ;
   private int edtAlbProfch_Visible ;
   private int edtavBarenccli_Visible ;
   private int edtBarFecCli_Visible ;
   private int edtBarNHdr_Visible ;
   private int edtBarSer_Visible ;
   private int edtBarSerDsc_Visible ;
   private int edtBarTipArtD_Visible ;
   private int edtBarNomCli_Visible ;
   private int edtBarColNom_Visible ;
   private int edtBarColNum_Visible ;
   private int edtavTipcoldsc_Visible ;
   private int edtavIntdsc_Visible ;
   private int edtavBarkgm_Visible ;
   private int edtavBaralbkgme_Visible ;
   private int edtavBaralbmtre_Visible ;
   private int edtBarAlbPie_Visible ;
   private int AV73PageToGo ;
   private int GXv_int12[] ;
   private int AV153GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV125TotBarAlbPie ;
   private long AV74GridCurrentPage ;
   private long AV75GridPageCount ;
   private long A30AlbProCod ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV127TotBarKgm ;
   private java.math.BigDecimal AV121TotBarAlbKgmE ;
   private java.math.BigDecimal AV123TotBarAlbMtrE ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A2243BarKgsCli ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1461BarAlbPN ;
   private java.math.BigDecimal AV149BarKgm ;
   private java.math.BigDecimal AV142BarAlbKgmE ;
   private java.math.BigDecimal AV143BarAlbMtrE ;
   private java.math.BigDecimal GXt_decimal18 ;
   private java.math.BigDecimal GXv_decimal19[] ;
   private String wcpOAV80EmprCod ;
   private String wcpOAV95Prio ;
   private String wcpOAV85Barser ;
   private String wcpOAV86Barser_to ;
   private String wcpOAV87AlbEncCli ;
   private String wcpOAV88AlbEncCli_to ;
   private String wcpOAV120BarColNom ;
   private String wcpOAV119BarColNom_to ;
   private String wcpOAV99Tipdiscod ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV80EmprCod ;
   private String AV95Prio ;
   private String AV85Barser ;
   private String AV86Barser_to ;
   private String AV87AlbEncCli ;
   private String AV88AlbEncCli_to ;
   private String AV120BarColNom ;
   private String AV119BarColNom_to ;
   private String AV99Tipdiscod ;
   private String sGXsfl_36_idx="0001" ;
   private String AV152Pgmname ;
   private String AV131TFIntDsc ;
   private String AV132TFIntDsc_Sel ;
   private String AV18TipColDsc ;
   private String AV19IntDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A39AlbProPri ;
   private String A2010BarTipDis ;
   private String A5140AlbMarca ;
   private String AV96ImpCod ;
   private String AV104Barcodparf ;
   private String AV107BarMaqEst1 ;
   private String AV108BarMaqEst2 ;
   private String AV97Serie ;
   private String AV98Barlar ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String A13878PedidoClie ;
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
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Fixable ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
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
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
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
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavTotvaluebarkgm_Internalname ;
   private String edtGuiRemCli_Internalname ;
   private String A1244GuiRemCln ;
   private String edtGuiRemCln_Internalname ;
   private String edtAlbProCod_Internalname ;
   private String edtAlbProfch_Internalname ;
   private String AV16BarEncCli ;
   private String edtavBarenccli_Internalname ;
   private String edtBarFecCli_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Internalname ;
   private String A13711BarTipArtD ;
   private String edtBarTipArtD_Internalname ;
   private String A1234BarNomCli ;
   private String edtBarNomCli_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Internalname ;
   private String edtBarColNum_Internalname ;
   private String edtBarTipCol_Internalname ;
   private String edtavTipcoldsc_Internalname ;
   private String edtavIntdsc_Internalname ;
   private String edtavBarkgm_Internalname ;
   private String edtavBaralbkgme_Internalname ;
   private String edtavBaralbmtre_Internalname ;
   private String edtBarAlbPie_Internalname ;
   private String edtavTotvaluebaralbkgme_Internalname ;
   private String edtavTotvaluebaralbmtre_Internalname ;
   private String edtavTotvaluebaralbpie_Internalname ;
   private String scmdbuf ;
   private String A1253EmprGuiRem ;
   private String hsh ;
   private String AV139Station ;
   private String AV140EmprNom ;
   private String AV141UsurCod ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private String GXv_char17[] ;
   private String GXv_char16[] ;
   private String GXv_char14[] ;
   private String GXv_char13[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluebarkgm_Jsonclick ;
   private String edtavTotvaluebaralbkgme_Jsonclick ;
   private String edtavTotvaluebaralbmtre_Jsonclick ;
   private String edtavTotvaluebaralbpie_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV80EmprCod ;
   private String sCtrlAV95Prio ;
   private String sCtrlAV81Clicod ;
   private String sCtrlAV82Clicod_to ;
   private String sCtrlAV83ALbProfch ;
   private String sCtrlAV84ALbProfch_to ;
   private String sCtrlAV85Barser ;
   private String sCtrlAV86Barser_to ;
   private String sCtrlAV87AlbEncCli ;
   private String sCtrlAV88AlbEncCli_to ;
   private String sCtrlAV120BarColNom ;
   private String sCtrlAV119BarColNom_to ;
   private String sCtrlAV90BarColNum ;
   private String sCtrlAV91BarColNum_to ;
   private String sCtrlAV100Barestreo ;
   private String sCtrlAV137Barestreoi ;
   private String sCtrlAV138Barestreof ;
   private String sCtrlAV99Tipdiscod ;
   private String sGXsfl_36_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtGuiRemCli_Jsonclick ;
   private String edtGuiRemCln_Jsonclick ;
   private String edtAlbProCod_Jsonclick ;
   private String edtAlbProfch_Jsonclick ;
   private String edtavBarenccli_Jsonclick ;
   private String edtBarFecCli_Jsonclick ;
   private String edtBarNHdr_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarTipArtD_Jsonclick ;
   private String edtBarNomCli_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarTipCol_Jsonclick ;
   private String edtavTipcoldsc_Jsonclick ;
   private String edtavIntdsc_Jsonclick ;
   private String edtavBarkgm_Jsonclick ;
   private String edtavBaralbkgme_Jsonclick ;
   private String edtavBaralbmtre_Jsonclick ;
   private String edtBarAlbPie_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV83ALbProfch ;
   private java.util.Date wcpOAV84ALbProfch_to ;
   private java.util.Date AV83ALbProfch ;
   private java.util.Date AV84ALbProfch_to ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A155BarFecCli ;
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
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n13711BarTipArtD ;
   private boolean bGXsfl_36_Refreshing=false ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n2243BarKgsCli ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV24ColumnsSelectorXML ;
   private String AV25UserCustomValue ;
   private String AV128TotValueBarKgm ;
   private String AV122TotValueBarAlbKgmE ;
   private String AV124TotValueBarAlbMtrE ;
   private String AV126TotValueBarAlbPie ;
   private String AV22ExcelFilename ;
   private String AV23ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV28Session ;
   private com.genexus.webpanels.WebSession AV112WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV113ProgressIndicator ;
   private IDataStoreProvider pr_default ;
   private short[] H01BA2_A217BarTipArt ;
   private boolean[] H01BA2_n217BarTipArt ;
   private String[] H01BA2_A1253EmprGuiRem ;
   private String[] H01BA2_A39AlbProPri ;
   private byte[] H01BA2_A148BarEstReo ;
   private String[] H01BA2_A2010BarTipDis ;
   private String[] H01BA2_A5140AlbMarca ;
   private int[] H01BA2_A252CliCod ;
   private boolean[] H01BA2_n252CliCod ;
   private java.math.BigDecimal[] H01BA2_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] H01BA2_A2243BarKgsCli ;
   private boolean[] H01BA2_n2243BarKgsCli ;
   private java.math.BigDecimal[] H01BA2_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] H01BA2_A1461BarAlbPN ;
   private int[] H01BA2_A1265BarAlbPie ;
   private byte[] H01BA2_A218BarTipCol ;
   private int[] H01BA2_A136BarColNum ;
   private String[] H01BA2_A135BarColNom ;
   private String[] H01BA2_A1234BarNomCli ;
   private String[] H01BA2_A13711BarTipArtD ;
   private boolean[] H01BA2_n13711BarTipArtD ;
   private String[] H01BA2_A1652BarSerDsc ;
   private String[] H01BA2_A212BarSer ;
   private java.util.Date[] H01BA2_A155BarFecCli ;
   private java.util.Date[] H01BA2_A34AlbProfch ;
   private long[] H01BA2_A30AlbProCod ;
   private String[] H01BA2_A1244GuiRemCln ;
   private int[] H01BA2_A1243GuiRemCli ;
   private String[] H01BA2_A130BarCodPar ;
   private byte[] H01BA2_A132BarCodReo ;
   private int[] H01BA2_A129BarCod ;
   private String[] H01BA2_A143BarDisNum ;
   private String[] H01BA2_A4812BarEncCli ;
   private String[] H01BA2_A396EmprCod ;
   private short[] H01BA3_A217BarTipArt ;
   private boolean[] H01BA3_n217BarTipArt ;
   private String[] H01BA3_A1253EmprGuiRem ;
   private String[] H01BA3_A39AlbProPri ;
   private byte[] H01BA3_A148BarEstReo ;
   private String[] H01BA3_A2010BarTipDis ;
   private String[] H01BA3_A5140AlbMarca ;
   private int[] H01BA3_A252CliCod ;
   private boolean[] H01BA3_n252CliCod ;
   private java.math.BigDecimal[] H01BA3_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] H01BA3_A2243BarKgsCli ;
   private boolean[] H01BA3_n2243BarKgsCli ;
   private java.math.BigDecimal[] H01BA3_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] H01BA3_A1461BarAlbPN ;
   private int[] H01BA3_A1265BarAlbPie ;
   private byte[] H01BA3_A218BarTipCol ;
   private int[] H01BA3_A136BarColNum ;
   private String[] H01BA3_A135BarColNom ;
   private String[] H01BA3_A1234BarNomCli ;
   private String[] H01BA3_A13711BarTipArtD ;
   private boolean[] H01BA3_n13711BarTipArtD ;
   private String[] H01BA3_A1652BarSerDsc ;
   private String[] H01BA3_A212BarSer ;
   private java.util.Date[] H01BA3_A155BarFecCli ;
   private java.util.Date[] H01BA3_A34AlbProfch ;
   private long[] H01BA3_A30AlbProCod ;
   private String[] H01BA3_A1244GuiRemCln ;
   private int[] H01BA3_A1243GuiRemCli ;
   private String[] H01BA3_A130BarCodPar ;
   private byte[] H01BA3_A132BarCodReo ;
   private int[] H01BA3_A129BarCod ;
   private String[] H01BA3_A143BarDisNum ;
   private String[] H01BA3_A4812BarEncCli ;
   private String[] H01BA3_A396EmprCod ;
   private long[] H01BA4_A30AlbProCod ;
   private String[] H01BA4_A5140AlbMarca ;
   private String[] H01BA4_A2010BarTipDis ;
   private byte[] H01BA4_A148BarEstReo ;
   private int[] H01BA4_A136BarColNum ;
   private String[] H01BA4_A135BarColNom ;
   private String[] H01BA4_A212BarSer ;
   private java.util.Date[] H01BA4_A34AlbProfch ;
   private int[] H01BA4_A1243GuiRemCli ;
   private String[] H01BA4_A39AlbProPri ;
   private int[] H01BA4_A129BarCod ;
   private byte[] H01BA4_A132BarCodReo ;
   private String[] H01BA4_A130BarCodPar ;
   private java.math.BigDecimal[] H01BA4_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] H01BA4_A2243BarKgsCli ;
   private boolean[] H01BA4_n2243BarKgsCli ;
   private java.math.BigDecimal[] H01BA4_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] H01BA4_A1461BarAlbPN ;
   private int[] H01BA4_A1265BarAlbPie ;
   private String[] H01BA4_A143BarDisNum ;
   private String[] H01BA4_A4812BarEncCli ;
   private String[] H01BA4_A396EmprCod ;
   private long[] H01BA5_A30AlbProCod ;
   private String[] H01BA5_A2010BarTipDis ;
   private byte[] H01BA5_A148BarEstReo ;
   private int[] H01BA5_A136BarColNum ;
   private String[] H01BA5_A135BarColNom ;
   private String[] H01BA5_A212BarSer ;
   private java.util.Date[] H01BA5_A34AlbProfch ;
   private int[] H01BA5_A1243GuiRemCli ;
   private String[] H01BA5_A39AlbProPri ;
   private int[] H01BA5_A129BarCod ;
   private byte[] H01BA5_A132BarCodReo ;
   private String[] H01BA5_A130BarCodPar ;
   private java.math.BigDecimal[] H01BA5_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] H01BA5_A2243BarKgsCli ;
   private boolean[] H01BA5_n2243BarKgsCli ;
   private java.math.BigDecimal[] H01BA5_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] H01BA5_A1461BarAlbPN ;
   private int[] H01BA5_A1265BarAlbPie ;
   private String[] H01BA5_A143BarDisNum ;
   private String[] H01BA5_A4812BarEncCli ;
   private String[] H01BA5_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV27ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector20[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector21[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV72DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState22[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext10[] ;
}

final  class informealbaranesproducciondetallado_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01BA2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV81Clicod ,
                                          int AV82Clicod_to ,
                                          java.util.Date AV83ALbProfch ,
                                          java.util.Date AV84ALbProfch_to ,
                                          String AV85Barser ,
                                          String AV86Barser_to ,
                                          String AV120BarColNom ,
                                          String AV119BarColNom_to ,
                                          int AV90BarColNum ,
                                          int AV91BarColNum_to ,
                                          int A1243GuiRemCli ,
                                          java.util.Date A34AlbProfch ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A39AlbProPri ,
                                          String AV95Prio ,
                                          String AV87AlbEncCli ,
                                          String A13878PedidoClie ,
                                          String AV88AlbEncCli_to ,
                                          byte A148BarEstReo ,
                                          byte AV137Barestreoi ,
                                          byte AV138Barestreof ,
                                          String A2010BarTipDis ,
                                          String AV99Tipdiscod ,
                                          String A5140AlbMarca ,
                                          String AV80EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[17];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT T2.BarTipArt AS BarTipArt, T3.EmprGuiRem AS EmprGuiRem, T3.AlbProPri, T2.BarEstReo, T2.BarTipDis, T3.AlbMarca, T2.CliCod, T1.BarAlbKgmE, T1.BarKgsCli, T1.BarAlbMtrE," ;
      scmdbuf += " T1.BarAlbPN, T1.BarAlbPie, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarNomCli, T5.TipArtDsc AS BarTipArtD, T2.BarSerDsc, T2.BarSer, T2.BarFecCli, T3.AlbProfch," ;
      scmdbuf += " T1.AlbProCod, T4.CliNom AS GuiRemCln, T3.GuiRemCli AS GuiRemCli, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.BarDisNum, T2.BarEncCli, T1.EmprCod FROM ((((TXPALBBAR" ;
      scmdbuf += " T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTIPART" ;
      scmdbuf += " T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T2.BarTipArt) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) INNER JOIN TXPCLIENT" ;
      scmdbuf += " T4 ON T4.EmprCod = T3.EmprGuiRem AND T4.CliCod = T3.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T3.AlbProPri = ? or ? = '2')");
      addWhere(sWhereString, "(T2.BarEstReo >= ?)");
      addWhere(sWhereString, "(T2.BarEstReo <= ?)");
      addWhere(sWhereString, "(T2.BarTipDis = ? or ? = '*')");
      addWhere(sWhereString, "(T3.AlbMarca <> 'A')");
      if ( ! (0==AV81Clicod) )
      {
         addWhere(sWhereString, "(T3.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( ! (0==AV82Clicod_to) )
      {
         addWhere(sWhereString, "(T3.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83ALbProfch)) )
      {
         addWhere(sWhereString, "(T3.AlbProfch >= ?)");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84ALbProfch_to)) )
      {
         addWhere(sWhereString, "(T3.AlbProfch <= ?)");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Barser)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer >= ?)");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Barser_to)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer <= ?)");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120BarColNom)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom >= ?)");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119BarColNom_to)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom <= ?)");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( ! (0==AV90BarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( ! (0==AV91BarColNum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T3.GuiRemCli" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.GuiRemCli" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.GuiRemCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.AlbProfch" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.AlbProfch DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarFecCli" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarFecCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.TipArtDsc" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.TipArtDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarNomCli" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarNomCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNum" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAlbPie" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAlbPie DESC" ;
      }
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_H01BA3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV81Clicod ,
                                          int AV82Clicod_to ,
                                          java.util.Date AV83ALbProfch ,
                                          java.util.Date AV84ALbProfch_to ,
                                          String AV85Barser ,
                                          String AV86Barser_to ,
                                          String AV120BarColNom ,
                                          String AV119BarColNom_to ,
                                          int AV90BarColNum ,
                                          int AV91BarColNum_to ,
                                          int A1243GuiRemCli ,
                                          java.util.Date A34AlbProfch ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A39AlbProPri ,
                                          String AV95Prio ,
                                          String AV87AlbEncCli ,
                                          String A13878PedidoClie ,
                                          String AV88AlbEncCli_to ,
                                          byte A148BarEstReo ,
                                          byte AV137Barestreoi ,
                                          byte AV138Barestreof ,
                                          String A2010BarTipDis ,
                                          String AV99Tipdiscod ,
                                          String A5140AlbMarca ,
                                          String AV80EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[17];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT T2.BarTipArt AS BarTipArt, T3.EmprGuiRem AS EmprGuiRem, T3.AlbProPri, T2.BarEstReo, T2.BarTipDis, T3.AlbMarca, T2.CliCod, T1.BarAlbKgmE, T1.BarKgsCli, T1.BarAlbMtrE," ;
      scmdbuf += " T1.BarAlbPN, T1.BarAlbPie, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarNomCli, T5.TipArtDsc AS BarTipArtD, T2.BarSerDsc, T2.BarSer, T2.BarFecCli, T3.AlbProfch," ;
      scmdbuf += " T1.AlbProCod, T4.CliNom AS GuiRemCln, T3.GuiRemCli AS GuiRemCli, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.BarDisNum, T2.BarEncCli, T1.EmprCod FROM ((((TXPALBBAR" ;
      scmdbuf += " T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTIPART" ;
      scmdbuf += " T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T2.BarTipArt) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) INNER JOIN TXPCLIENT" ;
      scmdbuf += " T4 ON T4.EmprCod = T3.EmprGuiRem AND T4.CliCod = T3.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T3.AlbProPri = ? or ? = '2')");
      addWhere(sWhereString, "(T2.BarEstReo >= ?)");
      addWhere(sWhereString, "(T2.BarEstReo <= ?)");
      addWhere(sWhereString, "(T2.BarTipDis = ? or ? = '*')");
      addWhere(sWhereString, "(T3.AlbMarca <> 'A')");
      if ( ! (0==AV81Clicod) )
      {
         addWhere(sWhereString, "(T3.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int25[7] = (byte)(1) ;
      }
      if ( ! (0==AV82Clicod_to) )
      {
         addWhere(sWhereString, "(T3.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int25[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83ALbProfch)) )
      {
         addWhere(sWhereString, "(T3.AlbProfch >= ?)");
      }
      else
      {
         GXv_int25[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84ALbProfch_to)) )
      {
         addWhere(sWhereString, "(T3.AlbProfch <= ?)");
      }
      else
      {
         GXv_int25[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Barser)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer >= ?)");
      }
      else
      {
         GXv_int25[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Barser_to)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer <= ?)");
      }
      else
      {
         GXv_int25[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120BarColNom)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom >= ?)");
      }
      else
      {
         GXv_int25[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119BarColNom_to)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom <= ?)");
      }
      else
      {
         GXv_int25[14] = (byte)(1) ;
      }
      if ( ! (0==AV90BarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int25[15] = (byte)(1) ;
      }
      if ( ! (0==AV91BarColNum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int25[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T3.GuiRemCli" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.GuiRemCli" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.GuiRemCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.AlbProfch" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.AlbProfch DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarFecCli" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarFecCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.TipArtDsc" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.TipArtDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarNomCli" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarNomCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNum" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAlbPie" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAlbPie DESC" ;
      }
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
   }

   protected Object[] conditional_H01BA4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV81Clicod ,
                                          int AV82Clicod_to ,
                                          java.util.Date AV83ALbProfch ,
                                          java.util.Date AV84ALbProfch_to ,
                                          String AV85Barser ,
                                          String AV86Barser_to ,
                                          String AV120BarColNom ,
                                          String AV119BarColNom_to ,
                                          int AV90BarColNum ,
                                          int AV91BarColNum_to ,
                                          int A1243GuiRemCli ,
                                          java.util.Date A34AlbProfch ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A39AlbProPri ,
                                          String AV95Prio ,
                                          String AV87AlbEncCli ,
                                          String A13878PedidoClie ,
                                          String AV88AlbEncCli_to ,
                                          byte A148BarEstReo ,
                                          byte AV137Barestreoi ,
                                          byte AV138Barestreof ,
                                          String A2010BarTipDis ,
                                          String AV99Tipdiscod ,
                                          String A5140AlbMarca ,
                                          String AV80EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int27 = new byte[17];
      Object[] GXv_Object28 = new Object[2];
      scmdbuf = "SELECT T1.AlbProCod, T3.AlbMarca, T2.BarTipDis, T2.BarEstReo, T2.BarColNum, T2.BarColNom, T2.BarSer, T3.AlbProfch, T3.GuiRemCli AS GuiRemCli, T3.AlbProPri, T1.BarCod," ;
      scmdbuf += " T1.BarCodReo, T1.BarCodPar, T1.BarAlbKgmE, T1.BarKgsCli, T1.BarAlbMtrE, T1.BarAlbPN, T1.BarAlbPie, T2.BarDisNum, T2.BarEncCli, T1.EmprCod FROM ((TXPALBBAR T1 INNER" ;
      scmdbuf += " JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPCALPRD T3" ;
      scmdbuf += " ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T3.AlbProPri = ? or ? = '2')");
      addWhere(sWhereString, "(T2.BarEstReo >= ?)");
      addWhere(sWhereString, "(T2.BarEstReo <= ?)");
      addWhere(sWhereString, "(T2.BarTipDis = ? or ? = '*')");
      addWhere(sWhereString, "(T3.AlbMarca <> 'A')");
      if ( ! (0==AV81Clicod) )
      {
         addWhere(sWhereString, "(T3.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int27[7] = (byte)(1) ;
      }
      if ( ! (0==AV82Clicod_to) )
      {
         addWhere(sWhereString, "(T3.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int27[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83ALbProfch)) )
      {
         addWhere(sWhereString, "(T3.AlbProfch >= ?)");
      }
      else
      {
         GXv_int27[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84ALbProfch_to)) )
      {
         addWhere(sWhereString, "(T3.AlbProfch <= ?)");
      }
      else
      {
         GXv_int27[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Barser)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer >= ?)");
      }
      else
      {
         GXv_int27[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Barser_to)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer <= ?)");
      }
      else
      {
         GXv_int27[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120BarColNom)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom >= ?)");
      }
      else
      {
         GXv_int27[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119BarColNom_to)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom <= ?)");
      }
      else
      {
         GXv_int27[14] = (byte)(1) ;
      }
      if ( ! (0==AV90BarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int27[15] = (byte)(1) ;
      }
      if ( ! (0==AV91BarColNum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int27[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object28[0] = scmdbuf ;
      GXv_Object28[1] = GXv_int27 ;
      return GXv_Object28 ;
   }

   protected Object[] conditional_H01BA5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV81Clicod ,
                                          int AV82Clicod_to ,
                                          java.util.Date AV83ALbProfch ,
                                          java.util.Date AV84ALbProfch_to ,
                                          String AV85Barser ,
                                          String AV86Barser_to ,
                                          String AV120BarColNom ,
                                          String AV119BarColNom_to ,
                                          int AV90BarColNum ,
                                          int AV91BarColNum_to ,
                                          int A1243GuiRemCli ,
                                          java.util.Date A34AlbProfch ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A39AlbProPri ,
                                          String AV95Prio ,
                                          String AV87AlbEncCli ,
                                          String A13878PedidoClie ,
                                          String AV88AlbEncCli_to ,
                                          byte A148BarEstReo ,
                                          byte AV137Barestreoi ,
                                          byte AV138Barestreof ,
                                          String A2010BarTipDis ,
                                          String AV99Tipdiscod ,
                                          String AV80EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[17];
      Object[] GXv_Object30 = new Object[2];
      scmdbuf = "SELECT T1.AlbProCod, T2.BarTipDis, T2.BarEstReo, T2.BarColNum, T2.BarColNom, T2.BarSer, T3.AlbProfch, T3.GuiRemCli AS GuiRemCli, T3.AlbProPri, T1.BarCod, T1.BarCodReo," ;
      scmdbuf += " T1.BarCodPar, T1.BarAlbKgmE, T1.BarKgsCli, T1.BarAlbMtrE, T1.BarAlbPN, T1.BarAlbPie, T2.BarDisNum, T2.BarEncCli, T1.EmprCod FROM ((TXPALBBAR T1 INNER JOIN TXPBARCAD" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPCALPRD T3 ON T3.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T3.AlbProCod = T1.AlbProCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T3.AlbProPri = ? or ? = '2')");
      addWhere(sWhereString, "(T2.BarEstReo >= ?)");
      addWhere(sWhereString, "(T2.BarEstReo <= ?)");
      addWhere(sWhereString, "(T2.BarTipDis = ? or ? = '*')");
      if ( ! (0==AV81Clicod) )
      {
         addWhere(sWhereString, "(T3.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int29[7] = (byte)(1) ;
      }
      if ( ! (0==AV82Clicod_to) )
      {
         addWhere(sWhereString, "(T3.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int29[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83ALbProfch)) )
      {
         addWhere(sWhereString, "(T3.AlbProfch >= ?)");
      }
      else
      {
         GXv_int29[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84ALbProfch_to)) )
      {
         addWhere(sWhereString, "(T3.AlbProfch <= ?)");
      }
      else
      {
         GXv_int29[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Barser)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer >= ?)");
      }
      else
      {
         GXv_int29[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Barser_to)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer <= ?)");
      }
      else
      {
         GXv_int29[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120BarColNom)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom >= ?)");
      }
      else
      {
         GXv_int29[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119BarColNom_to)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom <= ?)");
      }
      else
      {
         GXv_int29[14] = (byte)(1) ;
      }
      if ( ! (0==AV90BarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int29[15] = (byte)(1) ;
      }
      if ( ! (0==AV91BarColNum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int29[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object30[0] = scmdbuf ;
      GXv_Object30[1] = GXv_int29 ;
      return GXv_Object30 ;
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
                  return conditional_H01BA2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).shortValue() , ((Boolean) dynConstraints[16]).booleanValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 1 :
                  return conditional_H01BA3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).shortValue() , ((Boolean) dynConstraints[16]).booleanValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 2 :
                  return conditional_H01BA4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] );
            case 3 :
                  return conditional_H01BA5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01BA2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01BA3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01BA4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01BA5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((byte[]) buf[15])[0] = rslt.getByte(13);
               ((int[]) buf[16])[0] = rslt.getInt(14);
               ((String[]) buf[17])[0] = rslt.getString(15, 13);
               ((String[]) buf[18])[0] = rslt.getString(16, 13);
               ((String[]) buf[19])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(18, 26);
               ((String[]) buf[22])[0] = rslt.getString(19, 16);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(20);
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(21);
               ((long[]) buf[25])[0] = rslt.getLong(22);
               ((String[]) buf[26])[0] = rslt.getString(23, 30);
               ((int[]) buf[27])[0] = rslt.getInt(24);
               ((String[]) buf[28])[0] = rslt.getString(25, 1);
               ((byte[]) buf[29])[0] = rslt.getByte(26);
               ((int[]) buf[30])[0] = rslt.getInt(27);
               ((String[]) buf[31])[0] = rslt.getString(28, 8);
               ((String[]) buf[32])[0] = rslt.getString(29, 20);
               ((String[]) buf[33])[0] = rslt.getString(30, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((byte[]) buf[15])[0] = rslt.getByte(13);
               ((int[]) buf[16])[0] = rslt.getInt(14);
               ((String[]) buf[17])[0] = rslt.getString(15, 13);
               ((String[]) buf[18])[0] = rslt.getString(16, 13);
               ((String[]) buf[19])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(18, 26);
               ((String[]) buf[22])[0] = rslt.getString(19, 16);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(20);
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(21);
               ((long[]) buf[25])[0] = rslt.getLong(22);
               ((String[]) buf[26])[0] = rslt.getString(23, 30);
               ((int[]) buf[27])[0] = rslt.getInt(24);
               ((String[]) buf[28])[0] = rslt.getString(25, 1);
               ((byte[]) buf[29])[0] = rslt.getByte(26);
               ((int[]) buf[30])[0] = rslt.getInt(27);
               ((String[]) buf[31])[0] = rslt.getString(28, 8);
               ((String[]) buf[32])[0] = rslt.getString(29, 20);
               ((String[]) buf[33])[0] = rslt.getString(30, 3);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 8);
               ((String[]) buf[20])[0] = rslt.getString(20, 20);
               ((String[]) buf[21])[0] = rslt.getString(21, 3);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 8);
               ((String[]) buf[19])[0] = rslt.getString(19, 20);
               ((String[]) buf[20])[0] = rslt.getString(20, 3);
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
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
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
                  stmt.setString(sIdx, (String)parms[18], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               return;
      }
   }

}

