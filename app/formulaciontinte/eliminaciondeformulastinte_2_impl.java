package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class eliminaciondeformulastinte_2_impl extends GXWebComponent
{
   public eliminaciondeformulastinte_2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public eliminaciondeformulastinte_2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( eliminaciondeformulastinte_2_impl.class ));
   }

   public eliminaciondeformulastinte_2_impl( int remoteHandle ,
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
      chkForPro = UIFactory.getCheckbox(this);
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
               AV62EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62EmprCod", AV62EmprCod);
               AV63CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63CliCod), 6, 0));
               AV64CliCod_to = (int)(GXutil.lval( httpContext.GetPar( "CliCod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64CliCod_to), 6, 0));
               AV65Forser = httpContext.GetPar( "Forser") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Forser", AV65Forser);
               AV66Forser_to = httpContext.GetPar( "Forser_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Forser_to", AV66Forser_to);
               AV67Forcolnom = httpContext.GetPar( "Forcolnom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Forcolnom", AV67Forcolnom);
               AV68Forcolnom_to = httpContext.GetPar( "Forcolnom_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Forcolnom_to", AV68Forcolnom_to);
               AV69Forcolnum = (int)(GXutil.lval( httpContext.GetPar( "Forcolnum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Forcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69Forcolnum), 6, 0));
               AV70Forcolnum_to = (int)(GXutil.lval( httpContext.GetPar( "Forcolnum_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Forcolnum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70Forcolnum_to), 6, 0));
               AV71TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TipColCod), 2, 0));
               AV72TipColCod_to = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TipColCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72TipColCod_to), 2, 0));
               AV73ForUltUti = localUtil.parseDateParm( httpContext.GetPar( "ForUltUti")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73ForUltUti", localUtil.format(AV73ForUltUti, "99/99/99"));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV62EmprCod,Integer.valueOf(AV63CliCod),Integer.valueOf(AV64CliCod_to),AV65Forser,AV66Forser_to,AV67Forcolnom,AV68Forcolnom_to,Integer.valueOf(AV69Forcolnum),Integer.valueOf(AV70Forcolnum_to),Byte.valueOf(AV71TipColCod),Byte.valueOf(AV72TipColCod_to),AV73ForUltUti});
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
      nRC_GXsfl_56 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_56"))) ;
      nGXsfl_56_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_56_idx"))) ;
      sGXsfl_56_idx = httpContext.GetPar( "sGXsfl_56_idx") ;
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
      AV62EmprCod = httpContext.GetPar( "EmprCod") ;
      AV63CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV64CliCod_to = (int)(GXutil.lval( httpContext.GetPar( "CliCod_to"))) ;
      AV65Forser = httpContext.GetPar( "Forser") ;
      AV66Forser_to = httpContext.GetPar( "Forser_to") ;
      AV67Forcolnom = httpContext.GetPar( "Forcolnom") ;
      AV68Forcolnom_to = httpContext.GetPar( "Forcolnom_to") ;
      AV69Forcolnum = (int)(GXutil.lval( httpContext.GetPar( "Forcolnum"))) ;
      AV70Forcolnum_to = (int)(GXutil.lval( httpContext.GetPar( "Forcolnum_to"))) ;
      AV71TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
      AV72TipColCod_to = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod_to"))) ;
      AV73ForUltUti = localUtil.parseDateParm( httpContext.GetPar( "ForUltUti")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV77TFNum_hdrsH = (short)(GXutil.lval( httpContext.GetPar( "TFNum_hdrsH"))) ;
      AV78TFNum_hdrsH_Sel = (short)(GXutil.lval( httpContext.GetPar( "TFNum_hdrsH_Sel"))) ;
      AV88Pgmname = httpContext.GetPar( "Pgmname") ;
      AV82CantidadRegistrosAProcesar = (int)(GXutil.lval( httpContext.GetPar( "CantidadRegistrosAProcesar"))) ;
      AV79Station = httpContext.GetPar( "Station") ;
      AV80usurcod = httpContext.GetPar( "usurcod") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A486ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV62EmprCod, AV63CliCod, AV64CliCod_to, AV65Forser, AV66Forser_to, AV67Forcolnom, AV68Forcolnom_to, AV69Forcolnum, AV70Forcolnum_to, AV71TipColCod, AV72TipColCod_to, AV73ForUltUti, AV20ColumnsSelector, AV77TFNum_hdrsH, AV78TFNum_hdrsH_Sel, AV88Pgmname, AV82CantidadRegistrosAProcesar, AV79Station, AV80usurcod, A396EmprCod, A486ForNumCol, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1Y72( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Mto Formulas Tinte", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.eliminaciondeformulastinte_2", new String[] {GXutil.URLEncode(GXutil.rtrim(AV62EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV63CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV64CliCod_to,6,0)),GXutil.URLEncode(GXutil.rtrim(AV65Forser)),GXutil.URLEncode(GXutil.rtrim(AV66Forser_to)),GXutil.URLEncode(GXutil.rtrim(AV67Forcolnom)),GXutil.URLEncode(GXutil.rtrim(AV68Forcolnom_to)),GXutil.URLEncode(GXutil.ltrimstr(AV69Forcolnum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV70Forcolnum_to,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV71TipColCod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV72TipColCod_to,2,0)),GXutil.URLEncode(GXutil.formatDateParm(AV73ForUltUti))}, new String[] {"EmprCod","CliCod","CliCod_to","Forser","Forser_to","Forcolnom","Forcolnom_to","Forcolnum","Forcolnum_to","TipColCod","TipColCod_to","ForUltUti"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_FORNUMCOL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A486ForNumCol), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV79Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV80usurcod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"EliminaciondeFormulasTinte_2");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV88Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\eliminaciondeformulastinte_2:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_56", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_56, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV60GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV61GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV58DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV58DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV62EmprCod", GXutil.rtrim( wcpOAV62EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV63CliCod", GXutil.ltrim( localUtil.ntoc( wcpOAV63CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV64CliCod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV64CliCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV65Forser", GXutil.rtrim( wcpOAV65Forser));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV66Forser_to", GXutil.rtrim( wcpOAV66Forser_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV67Forcolnom", GXutil.rtrim( wcpOAV67Forcolnom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV68Forcolnom_to", GXutil.rtrim( wcpOAV68Forcolnom_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV69Forcolnum", GXutil.ltrim( localUtil.ntoc( wcpOAV69Forcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV70Forcolnum_to", GXutil.ltrim( localUtil.ntoc( wcpOAV70Forcolnum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV71TipColCod", GXutil.ltrim( localUtil.ntoc( wcpOAV71TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV72TipColCod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV72TipColCod_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV73ForUltUti", localUtil.dtoc( wcpOAV73ForUltUti, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFNUM_HDRSH", GXutil.ltrim( localUtil.ntoc( AV77TFNum_hdrsH, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFNUM_HDRSH_SEL", GXutil.ltrim( localUtil.ntoc( AV78TFNum_hdrsH_Sel, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV62EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV63CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV64CliCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORSER", GXutil.rtrim( AV65Forser));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORSER_TO", GXutil.rtrim( AV66Forser_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNOM", GXutil.rtrim( AV67Forcolnom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNOM_TO", GXutil.rtrim( AV68Forcolnom_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV69Forcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV70Forcolnum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV71TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPCOLCOD_TO", GXutil.ltrim( localUtil.ntoc( AV72TipColCod_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORULTUTI", localUtil.dtoc( AV73ForUltUti, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCANTIDADREGISTROSPROCESADOS", GXutil.ltrim( localUtil.ntoc( AV83CantidadRegistrosProcesados, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FORNUMCOL", GXutil.ltrim( localUtil.ntoc( A486ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_FORNUMCOL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A486ForNumCol), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV79Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV79Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV80usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV80usurcod, "@!"))));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_btneliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btneliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btneliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btneliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btneliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btneliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btneliminar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btneliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btneliminar_Result));
   }

   public void renderHtmlCloseForm1Y72( )
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
      return "FormulacionTinte.EliminaciondeFormulasTinte_2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mto Formulas Tinte", "") ;
   }

   public void wb1Y70( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.formulaciontinte.eliminaciondeformulastinte_2");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent15", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 56, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\EliminaciondeFormulasTinte_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 56, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\EliminaciondeFormulasTinte_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 56, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\EliminaciondeFormulasTinte_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablecantidadregistrosaprocesar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcantidadregistrosaprocesar_Internalname, httpContext.getMessage( "Formulas a Eliminar", ""), "", "", lblTextblockcantidadregistrosaprocesar_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\EliminaciondeFormulasTinte_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCantidadregistrosaprocesar_Internalname, httpContext.getMessage( "Cantidad Registros AProcesar", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'" + sPrefix + "',false,'" + sGXsfl_56_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCantidadregistrosaprocesar_Internalname, GXutil.ltrim( localUtil.ntoc( AV82CantidadRegistrosAProcesar, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCantidadregistrosaprocesar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV82CantidadRegistrosAProcesar), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV82CantidadRegistrosAProcesar), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCantidadregistrosaprocesar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCantidadregistrosaprocesar_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\EliminaciondeFormulasTinte_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_37_1Y72( true) ;
      }
      else
      {
         wb_table1_37_1Y72( false) ;
      }
      return  ;
   }

   public void wb_table1_37_1Y72e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 56, 2, 0)+","+"null"+");", httpContext.getMessage( "Eliminar", ""), bttBtneliminar_Jsonclick, 7, httpContext.getMessage( "Eliminar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111y71_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\EliminaciondeFormulasTinte_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         startgridcontrol56( ) ;
      }
      if ( wbEnd == 56 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_56 = (int)(nGXsfl_56_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV60GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV61GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV88Pgmname), GXutil.rtrim( localUtil.format( AV88Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\EliminaciondeFormulasTinte_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV58DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV58DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_80_1Y72( true) ;
      }
      else
      {
         wb_table2_80_1Y72( false) ;
      }
      return  ;
   }

   public void wb_table2_80_1Y72e( boolean wbgen )
   {
      if ( wbgen )
      {
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
      if ( wbEnd == 56 )
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

   public void start1Y72( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Mto Formulas Tinte", ""), (short)(0)) ;
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
            strup1Y70( ) ;
         }
      }
   }

   public void ws1Y72( )
   {
      start1Y72( ) ;
      evt1Y72( ) ;
   }

   public void evt1Y72( )
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
                              strup1Y70( ) ;
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
                              strup1Y70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121Y72 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1Y70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131Y72 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1Y70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141Y72 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1Y70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151Y72 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNELIMINAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1Y70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e161Y72 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1Y70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e171Y72 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1Y70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e181Y72 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1Y70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavNum_hdrs_Internalname ;
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
                              strup1Y70( ) ;
                           }
                           nGXsfl_56_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_56_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_56_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_562( ) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
                           A5742ForSerDsc = httpContext.cgiGet( edtForSerDsc_Internalname) ;
                           n5742ForSerDsc = false ;
                           A482ForColNom = httpContext.cgiGet( edtForColNom_Internalname) ;
                           A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A496ForUltUti = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtForUltUti_Internalname), 0)) ;
                           n496ForUltUti = false ;
                           A2749ForPro = ((GXutil.strcmp(httpContext.cgiGet( chkForPro.getInternalname()), "S")==0) ? "S" : "N") ;
                           n2749ForPro = false ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNum_hdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNum_hdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNUM_HDRS");
                              GX_FocusControl = edtavNum_hdrs_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV74Num_hdrs = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavNum_hdrs_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74Num_hdrs), 4, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNUM_HDRS"+"_"+sGXsfl_56_idx, getSecureSignedToken( sPrefix+sGXsfl_56_idx, localUtil.format( DecimalUtil.doubleToDec(AV74Num_hdrs), "ZZZ9")));
                           }
                           else
                           {
                              AV74Num_hdrs = (short)(localUtil.ctol( httpContext.cgiGet( edtavNum_hdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavNum_hdrs_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74Num_hdrs), 4, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNUM_HDRS"+"_"+sGXsfl_56_idx, getSecureSignedToken( sPrefix+sGXsfl_56_idx, localUtil.format( DecimalUtil.doubleToDec(AV74Num_hdrs), "ZZZ9")));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNum_hdrsh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNum_hdrsh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNUM_HDRSH");
                              GX_FocusControl = edtavNum_hdrsh_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV76Num_hdrsH = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavNum_hdrsh_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76Num_hdrsH), 4, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNUM_HDRSH"+"_"+sGXsfl_56_idx, getSecureSignedToken( sPrefix+sGXsfl_56_idx, localUtil.format( DecimalUtil.doubleToDec(AV76Num_hdrsH), "ZZZ9")));
                           }
                           else
                           {
                              AV76Num_hdrsH = (short)(localUtil.ctol( httpContext.cgiGet( edtavNum_hdrsh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavNum_hdrsh_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76Num_hdrsH), 4, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNUM_HDRSH"+"_"+sGXsfl_56_idx, getSecureSignedToken( sPrefix+sGXsfl_56_idx, localUtil.format( DecimalUtil.doubleToDec(AV76Num_hdrsH), "ZZZ9")));
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
                                       GX_FocusControl = edtavNum_hdrs_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e191Y72 ();
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
                                       GX_FocusControl = edtavNum_hdrs_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e201Y72 ();
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
                                       GX_FocusControl = edtavNum_hdrs_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e211Y72 ();
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
                                    strup1Y70( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavNum_hdrs_Internalname ;
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

   public void we1Y72( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1Y72( ) ;
         }
      }
   }

   public void pa1Y72( )
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
            GX_FocusControl = edtavCantidadregistrosaprocesar_Internalname ;
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
      subsflControlProps_562( ) ;
      while ( nGXsfl_56_idx <= nRC_GXsfl_56 )
      {
         sendrow_562( ) ;
         nGXsfl_56_idx = ((subGrid_Islastpage==1)&&(nGXsfl_56_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_56_idx+1) ;
         sGXsfl_56_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_56_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_562( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV62EmprCod ,
                                 int AV63CliCod ,
                                 int AV64CliCod_to ,
                                 String AV65Forser ,
                                 String AV66Forser_to ,
                                 String AV67Forcolnom ,
                                 String AV68Forcolnom_to ,
                                 int AV69Forcolnum ,
                                 int AV70Forcolnum_to ,
                                 byte AV71TipColCod ,
                                 byte AV72TipColCod_to ,
                                 java.util.Date AV73ForUltUti ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 short AV77TFNum_hdrsH ,
                                 short AV78TFNum_hdrsH_Sel ,
                                 String AV88Pgmname ,
                                 int AV82CantidadRegistrosAProcesar ,
                                 String AV79Station ,
                                 String AV80usurcod ,
                                 String A396EmprCod ,
                                 int A486ForNumCol ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e201Y72 ();
      GRID_nCurrentRecord = 0 ;
      rf1Y72( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"EliminaciondeFormulasTinte_2");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV88Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\eliminaciondeformulastinte_2:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNUM_HDRS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV74Num_hdrs), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNUM_HDRS", GXutil.ltrim( localUtil.ntoc( AV74Num_hdrs, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNUM_HDRSH", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV76Num_hdrsH), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNUM_HDRSH", GXutil.ltrim( localUtil.ntoc( AV76Num_hdrsH, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CLICOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_FORSER", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A494ForSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FORSER", GXutil.rtrim( A494ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_FORCOLNOM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A482ForColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FORCOLNOM", GXutil.rtrim( A482ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_FORCOLNUM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FORCOLNUM", GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TIPCOLCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TIPCOLCOD", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), ".", "")));
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
      rf1Y72( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV88Pgmname = "FormulacionTinte.EliminaciondeFormulasTinte_2" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88Pgmname", AV88Pgmname);
      Gx_err = (short)(0) ;
      edtavCantidadregistrosaprocesar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantidadregistrosaprocesar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantidadregistrosaprocesar_Enabled), 5, 0), true);
      edtavNum_hdrs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNum_hdrs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNum_hdrs_Enabled), 5, 0), !bGXsfl_56_Refreshing);
      edtavNum_hdrsh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNum_hdrsh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNum_hdrsh_Enabled), 5, 0), !bGXsfl_56_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1Y72( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(56) ;
      /* Execute user event: Refresh */
      e201Y72 ();
      nGXsfl_56_idx = 1 ;
      sGXsfl_56_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_56_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_562( ) ;
      bGXsfl_56_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
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
         subsflControlProps_562( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Integer.valueOf(AV63CliCod) ,
                                              Integer.valueOf(AV64CliCod_to) ,
                                              AV65Forser ,
                                              AV66Forser_to ,
                                              AV67Forcolnom ,
                                              AV68Forcolnom_to ,
                                              Integer.valueOf(AV69Forcolnum) ,
                                              Integer.valueOf(AV70Forcolnum_to) ,
                                              Byte.valueOf(AV71TipColCod) ,
                                              Byte.valueOf(AV72TipColCod_to) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A494ForSer ,
                                              A482ForColNom ,
                                              Integer.valueOf(A483ForColNum) ,
                                              Byte.valueOf(A831TipColCod) ,
                                              A496ForUltUti ,
                                              AV73ForUltUti ,
                                              A2749ForPro ,
                                              AV62EmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor H01Y72 */
         pr_default.execute(0, new Object[] {AV62EmprCod, AV73ForUltUti, Integer.valueOf(AV63CliCod), Integer.valueOf(AV64CliCod_to), AV65Forser, AV66Forser_to, AV67Forcolnom, AV68Forcolnom_to, Integer.valueOf(AV69Forcolnum), Integer.valueOf(AV70Forcolnum_to), Byte.valueOf(AV71TipColCod), Byte.valueOf(AV72TipColCod_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_56_idx = 1 ;
         sGXsfl_56_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_56_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_562( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A486ForNumCol = H01Y72_A486ForNumCol[0] ;
            A396EmprCod = H01Y72_A396EmprCod[0] ;
            A2749ForPro = H01Y72_A2749ForPro[0] ;
            n2749ForPro = H01Y72_n2749ForPro[0] ;
            A496ForUltUti = H01Y72_A496ForUltUti[0] ;
            n496ForUltUti = H01Y72_n496ForUltUti[0] ;
            A831TipColCod = H01Y72_A831TipColCod[0] ;
            A483ForColNum = H01Y72_A483ForColNum[0] ;
            A482ForColNom = H01Y72_A482ForColNom[0] ;
            A5742ForSerDsc = H01Y72_A5742ForSerDsc[0] ;
            n5742ForSerDsc = H01Y72_n5742ForSerDsc[0] ;
            A494ForSer = H01Y72_A494ForSer[0] ;
            A279CliNom = H01Y72_A279CliNom[0] ;
            A252CliCod = H01Y72_A252CliCod[0] ;
            A279CliNom = H01Y72_A279CliNom[0] ;
            e211Y72 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(56) ;
         wb1Y70( ) ;
      }
      bGXsfl_56_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1Y72( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNUM_HDRS"+"_"+sGXsfl_56_idx, getSecureSignedToken( sPrefix+sGXsfl_56_idx, localUtil.format( DecimalUtil.doubleToDec(AV74Num_hdrs), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNUM_HDRSH"+"_"+sGXsfl_56_idx, getSecureSignedToken( sPrefix+sGXsfl_56_idx, localUtil.format( DecimalUtil.doubleToDec(AV76Num_hdrsH), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CLICOD"+"_"+sGXsfl_56_idx, getSecureSignedToken( sPrefix+sGXsfl_56_idx, localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_FORSER"+"_"+sGXsfl_56_idx, getSecureSignedToken( sPrefix+sGXsfl_56_idx, GXutil.rtrim( localUtil.format( A494ForSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_FORCOLNOM"+"_"+sGXsfl_56_idx, getSecureSignedToken( sPrefix+sGXsfl_56_idx, GXutil.rtrim( localUtil.format( A482ForColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_FORCOLNUM"+"_"+sGXsfl_56_idx, getSecureSignedToken( sPrefix+sGXsfl_56_idx, localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TIPCOLCOD"+"_"+sGXsfl_56_idx, getSecureSignedToken( sPrefix+sGXsfl_56_idx, localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FORNUMCOL", GXutil.ltrim( localUtil.ntoc( A486ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_FORNUMCOL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A486ForNumCol), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV79Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV79Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV80usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV80usurcod, "@!"))));
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
      AV90Formulaciontinte_eliminaciondeformulastinte_2ds_1_tfnum_hdrsh = AV77TFNum_hdrsH ;
      AV91Formulaciontinte_eliminaciondeformulastinte_2ds_2_tfnum_hdrsh_sel = AV78TFNum_hdrsH_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV63CliCod) ,
                                           Integer.valueOf(AV64CliCod_to) ,
                                           AV65Forser ,
                                           AV66Forser_to ,
                                           AV67Forcolnom ,
                                           AV68Forcolnom_to ,
                                           Integer.valueOf(AV69Forcolnum) ,
                                           Integer.valueOf(AV70Forcolnum_to) ,
                                           Byte.valueOf(AV71TipColCod) ,
                                           Byte.valueOf(AV72TipColCod_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A494ForSer ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A496ForUltUti ,
                                           AV73ForUltUti ,
                                           A2749ForPro ,
                                           AV62EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor H01Y73 */
      pr_default.execute(1, new Object[] {AV62EmprCod, AV73ForUltUti, Integer.valueOf(AV63CliCod), Integer.valueOf(AV64CliCod_to), AV65Forser, AV66Forser_to, AV67Forcolnom, AV68Forcolnom_to, Integer.valueOf(AV69Forcolnum), Integer.valueOf(AV70Forcolnum_to), Byte.valueOf(AV71TipColCod), Byte.valueOf(AV72TipColCod_to)});
      GRID_nRecordCount = H01Y73_AGRID_nRecordCount[0] ;
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
      AV90Formulaciontinte_eliminaciondeformulastinte_2ds_1_tfnum_hdrsh = AV77TFNum_hdrsH ;
      AV91Formulaciontinte_eliminaciondeformulastinte_2ds_2_tfnum_hdrsh_sel = AV78TFNum_hdrsH_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV62EmprCod, AV63CliCod, AV64CliCod_to, AV65Forser, AV66Forser_to, AV67Forcolnom, AV68Forcolnom_to, AV69Forcolnum, AV70Forcolnum_to, AV71TipColCod, AV72TipColCod_to, AV73ForUltUti, AV20ColumnsSelector, AV77TFNum_hdrsH, AV78TFNum_hdrsH_Sel, AV88Pgmname, AV82CantidadRegistrosAProcesar, AV79Station, AV80usurcod, A396EmprCod, A486ForNumCol, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV90Formulaciontinte_eliminaciondeformulastinte_2ds_1_tfnum_hdrsh = AV77TFNum_hdrsH ;
      AV91Formulaciontinte_eliminaciondeformulastinte_2ds_2_tfnum_hdrsh_sel = AV78TFNum_hdrsH_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV62EmprCod, AV63CliCod, AV64CliCod_to, AV65Forser, AV66Forser_to, AV67Forcolnom, AV68Forcolnom_to, AV69Forcolnum, AV70Forcolnum_to, AV71TipColCod, AV72TipColCod_to, AV73ForUltUti, AV20ColumnsSelector, AV77TFNum_hdrsH, AV78TFNum_hdrsH_Sel, AV88Pgmname, AV82CantidadRegistrosAProcesar, AV79Station, AV80usurcod, A396EmprCod, A486ForNumCol, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV90Formulaciontinte_eliminaciondeformulastinte_2ds_1_tfnum_hdrsh = AV77TFNum_hdrsH ;
      AV91Formulaciontinte_eliminaciondeformulastinte_2ds_2_tfnum_hdrsh_sel = AV78TFNum_hdrsH_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV62EmprCod, AV63CliCod, AV64CliCod_to, AV65Forser, AV66Forser_to, AV67Forcolnom, AV68Forcolnom_to, AV69Forcolnum, AV70Forcolnum_to, AV71TipColCod, AV72TipColCod_to, AV73ForUltUti, AV20ColumnsSelector, AV77TFNum_hdrsH, AV78TFNum_hdrsH_Sel, AV88Pgmname, AV82CantidadRegistrosAProcesar, AV79Station, AV80usurcod, A396EmprCod, A486ForNumCol, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV90Formulaciontinte_eliminaciondeformulastinte_2ds_1_tfnum_hdrsh = AV77TFNum_hdrsH ;
      AV91Formulaciontinte_eliminaciondeformulastinte_2ds_2_tfnum_hdrsh_sel = AV78TFNum_hdrsH_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV62EmprCod, AV63CliCod, AV64CliCod_to, AV65Forser, AV66Forser_to, AV67Forcolnom, AV68Forcolnom_to, AV69Forcolnum, AV70Forcolnum_to, AV71TipColCod, AV72TipColCod_to, AV73ForUltUti, AV20ColumnsSelector, AV77TFNum_hdrsH, AV78TFNum_hdrsH_Sel, AV88Pgmname, AV82CantidadRegistrosAProcesar, AV79Station, AV80usurcod, A396EmprCod, A486ForNumCol, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV90Formulaciontinte_eliminaciondeformulastinte_2ds_1_tfnum_hdrsh = AV77TFNum_hdrsH ;
      AV91Formulaciontinte_eliminaciondeformulastinte_2ds_2_tfnum_hdrsh_sel = AV78TFNum_hdrsH_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV62EmprCod, AV63CliCod, AV64CliCod_to, AV65Forser, AV66Forser_to, AV67Forcolnom, AV68Forcolnom_to, AV69Forcolnum, AV70Forcolnum_to, AV71TipColCod, AV72TipColCod_to, AV73ForUltUti, AV20ColumnsSelector, AV77TFNum_hdrsH, AV78TFNum_hdrsH_Sel, AV88Pgmname, AV82CantidadRegistrosAProcesar, AV79Station, AV80usurcod, A396EmprCod, A486ForNumCol, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV88Pgmname = "FormulacionTinte.EliminaciondeFormulasTinte_2" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88Pgmname", AV88Pgmname);
      Gx_err = (short)(0) ;
      edtavCantidadregistrosaprocesar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantidadregistrosaprocesar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantidadregistrosaprocesar_Enabled), 5, 0), true);
      edtavNum_hdrs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNum_hdrs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNum_hdrs_Enabled), 5, 0), !bGXsfl_56_Refreshing);
      edtavNum_hdrsh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNum_hdrsh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNum_hdrsh_Enabled), 5, 0), !bGXsfl_56_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1Y70( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e191Y72 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV58DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_56 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_56"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV60GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV61GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV62EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV62EmprCod") ;
         wcpOAV63CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV63CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV64CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV64CliCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV65Forser = httpContext.cgiGet( sPrefix+"wcpOAV65Forser") ;
         wcpOAV66Forser_to = httpContext.cgiGet( sPrefix+"wcpOAV66Forser_to") ;
         wcpOAV67Forcolnom = httpContext.cgiGet( sPrefix+"wcpOAV67Forcolnom") ;
         wcpOAV68Forcolnom_to = httpContext.cgiGet( sPrefix+"wcpOAV68Forcolnom_to") ;
         wcpOAV69Forcolnum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV69Forcolnum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV70Forcolnum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV70Forcolnum_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV71TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV71TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV72TipColCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV72TipColCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV73ForUltUti = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV73ForUltUti"), 0) ;
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
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( sPrefix+"DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Dvelop_confirmpanel_btneliminar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINAR_Title") ;
         Dvelop_confirmpanel_btneliminar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_btneliminar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btneliminar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_btneliminar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btneliminar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_btneliminar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Dvelop_confirmpanel_btneliminar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINAR_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCantidadregistrosaprocesar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCantidadregistrosaprocesar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANTIDADREGISTROSAPROCESAR");
            GX_FocusControl = edtavCantidadregistrosaprocesar_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV82CantidadRegistrosAProcesar = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82CantidadRegistrosAProcesar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82CantidadRegistrosAProcesar), 6, 0));
         }
         else
         {
            AV82CantidadRegistrosAProcesar = (int)(localUtil.ctol( httpContext.cgiGet( edtavCantidadregistrosaprocesar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82CantidadRegistrosAProcesar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82CantidadRegistrosAProcesar), 6, 0));
         }
         AV88Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88Pgmname", AV88Pgmname);
         /* Read subfile selected row values. */
         nGXsfl_56_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_56_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_56_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_562( ) ;
         if ( nGXsfl_56_idx > 0 )
         {
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
            A5742ForSerDsc = httpContext.cgiGet( edtForSerDsc_Internalname) ;
            n5742ForSerDsc = false ;
            A482ForColNom = httpContext.cgiGet( edtForColNom_Internalname) ;
            A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A496ForUltUti = localUtil.ctod( httpContext.cgiGet( edtForUltUti_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n496ForUltUti = false ;
            A2749ForPro = ((GXutil.strcmp(httpContext.cgiGet( chkForPro.getInternalname()), "S")==0) ? "S" : "N") ;
            n2749ForPro = false ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNum_hdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNum_hdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNUM_HDRS");
               GX_FocusControl = edtavNum_hdrs_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV74Num_hdrs = (short)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavNum_hdrs_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74Num_hdrs), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNUM_HDRS"+"_"+sGXsfl_56_idx, getSecureSignedToken( sPrefix+sGXsfl_56_idx, localUtil.format( DecimalUtil.doubleToDec(AV74Num_hdrs), "ZZZ9")));
            }
            else
            {
               AV74Num_hdrs = (short)(localUtil.ctol( httpContext.cgiGet( edtavNum_hdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavNum_hdrs_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74Num_hdrs), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNUM_HDRS"+"_"+sGXsfl_56_idx, getSecureSignedToken( sPrefix+sGXsfl_56_idx, localUtil.format( DecimalUtil.doubleToDec(AV74Num_hdrs), "ZZZ9")));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNum_hdrsh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNum_hdrsh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNUM_HDRSH");
               GX_FocusControl = edtavNum_hdrsh_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV76Num_hdrsH = (short)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavNum_hdrsh_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76Num_hdrsH), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNUM_HDRSH"+"_"+sGXsfl_56_idx, getSecureSignedToken( sPrefix+sGXsfl_56_idx, localUtil.format( DecimalUtil.doubleToDec(AV76Num_hdrsH), "ZZZ9")));
            }
            else
            {
               AV76Num_hdrsH = (short)(localUtil.ctol( httpContext.cgiGet( edtavNum_hdrsh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavNum_hdrsh_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76Num_hdrsH), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNUM_HDRSH"+"_"+sGXsfl_56_idx, getSecureSignedToken( sPrefix+sGXsfl_56_idx, localUtil.format( DecimalUtil.doubleToDec(AV76Num_hdrsH), "ZZZ9")));
            }
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"EliminaciondeFormulasTinte_2");
         AV88Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88Pgmname", AV88Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV88Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("formulaciontinte\\eliminaciondeformulastinte_2:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e191Y72 ();
      if (returnInSub) return;
   }

   public void e191Y72( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV79Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      eliminaciondeformulastinte_2_impl.this.GXt_char1 = GXv_char2[0] ;
      AV79Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79Station", AV79Station);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV79Station, ""))));
      GXv_char2[0] = AV62EmprCod ;
      GXv_char3[0] = AV89Emprnom ;
      GXv_char4[0] = AV80usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV79Station, GXv_char2, GXv_char3, GXv_char4) ;
      eliminaciondeformulastinte_2_impl.this.AV62EmprCod = GXv_char2[0] ;
      eliminaciondeformulastinte_2_impl.this.AV89Emprnom = GXv_char3[0] ;
      eliminaciondeformulastinte_2_impl.this.AV80usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62EmprCod", AV62EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80usurcod", AV80usurcod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV80usurcod, "@!"))));
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV58DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV58DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e201Y72( )
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
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV22Session.getValue("FormulacionTinte.EliminaciondeFormulasTinte_2ColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("FormulacionTinte.EliminaciondeFormulasTinte_2ColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S142 ();
         if (returnInSub) return;
      }
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtForSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSer_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtForSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSerDsc_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtForColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNom_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtForColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNum_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtTipColCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTipColCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtForUltUti_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtForUltUti_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForUltUti_Visible), 5, 0), !bGXsfl_56_Refreshing);
      chkForPro.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkForPro.getInternalname(), "Visible", GXutil.ltrimstr( chkForPro.getVisible(), 5, 0), !bGXsfl_56_Refreshing);
      edtavNum_hdrs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNum_hdrs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNum_hdrs_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtavNum_hdrsh_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNum_hdrsh_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNum_hdrsh_Visible), 5, 0), !bGXsfl_56_Refreshing);
      AV60GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60GridCurrentPage), 10, 0));
      AV61GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61GridPageCount), 10, 0));
      AV82CantidadRegistrosAProcesar = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82CantidadRegistrosAProcesar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82CantidadRegistrosAProcesar), 6, 0));
      AV90Formulaciontinte_eliminaciondeformulastinte_2ds_1_tfnum_hdrsh = AV77TFNum_hdrsH ;
      AV91Formulaciontinte_eliminaciondeformulastinte_2ds_2_tfnum_hdrsh_sel = AV78TFNum_hdrsH_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
   }

   public void e121Y72( )
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
         AV59PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV59PageToGo) ;
      }
   }

   public void e131Y72( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141Y72( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Num_hdrsH") == 0 )
         {
            AV77TFNum_hdrsH = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFNum_hdrsH", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77TFNum_hdrsH), 4, 0));
            AV78TFNum_hdrsH_Sel = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFNum_hdrsH_Sel", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78TFNum_hdrsH_Sel), 4, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e211Y72( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      GXt_int8 = AV74Num_hdrs ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int9[0] = A252CliCod ;
      GXv_char3[0] = A494ForSer ;
      GXv_char2[0] = A482ForColNom ;
      GXv_int10[0] = A483ForColNum ;
      GXv_int11[0] = A831TipColCod ;
      GXv_int12[0] = GXt_int8 ;
      new app.formulaciontinte.pkilequi2(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_char3, GXv_char2, GXv_int10, GXv_int11, GXv_int12) ;
      eliminaciondeformulastinte_2_impl.this.A396EmprCod = GXv_char4[0] ;
      eliminaciondeformulastinte_2_impl.this.A252CliCod = GXv_int9[0] ;
      eliminaciondeformulastinte_2_impl.this.A494ForSer = GXv_char3[0] ;
      eliminaciondeformulastinte_2_impl.this.A482ForColNom = GXv_char2[0] ;
      eliminaciondeformulastinte_2_impl.this.A483ForColNum = GXv_int10[0] ;
      eliminaciondeformulastinte_2_impl.this.A831TipColCod = GXv_int11[0] ;
      eliminaciondeformulastinte_2_impl.this.GXt_int8 = GXv_int12[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      AV74Num_hdrs = (short)(GXt_int8) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavNum_hdrs_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74Num_hdrs), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNUM_HDRS"+"_"+sGXsfl_56_idx, getSecureSignedToken( sPrefix+sGXsfl_56_idx, localUtil.format( DecimalUtil.doubleToDec(AV74Num_hdrs), "ZZZ9")));
      GXt_int8 = AV76Num_hdrsH ;
      GXv_int12[0] = GXt_int8 ;
      new app.formulaciontinte.pkilequi2historico(remoteHandle, context).execute( A396EmprCod, A252CliCod, A494ForSer, A482ForColNom, A483ForColNum, A831TipColCod, GXv_int12) ;
      eliminaciondeformulastinte_2_impl.this.GXt_int8 = GXv_int12[0] ;
      AV76Num_hdrsH = (short)(GXt_int8) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavNum_hdrsh_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76Num_hdrsH), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNUM_HDRSH"+"_"+sGXsfl_56_idx, getSecureSignedToken( sPrefix+sGXsfl_56_idx, localUtil.format( DecimalUtil.doubleToDec(AV76Num_hdrsH), "ZZZ9")));
      if ( (0==AV74Num_hdrs) && (0==AV76Num_hdrsH) )
      {
         AV82CantidadRegistrosAProcesar = (int)(AV82CantidadRegistrosAProcesar+1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82CantidadRegistrosAProcesar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82CantidadRegistrosAProcesar), 6, 0));
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(56) ;
      }
      sendrow_562( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_56_Refreshing )
      {
         httpContext.doAjaxLoad(56, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e151Y72( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.EliminaciondeFormulasTinte_2ColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
   }

   public void e161Y72( )
   {
      /* Dvelop_confirmpanel_btneliminar_Close Routine */
      returnInSub = false ;
      if ( AV82CantidadRegistrosAProcesar == 0 )
      {
         AV82CantidadRegistrosAProcesar = 1 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82CantidadRegistrosAProcesar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82CantidadRegistrosAProcesar), 6, 0));
      }
      if ( GXutil.strcmp(Dvelop_confirmpanel_btneliminar_Result, "Yes") == 0 )
      {
         AV81ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
         AV81ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
         AV81ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
         AV81ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
         AV81ProgressIndicator.show();
         /* Start For Each Line */
         nRC_GXsfl_56 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_56"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_56_fel_idx = 0 ;
         while ( nGXsfl_56_fel_idx < nRC_GXsfl_56 )
         {
            nGXsfl_56_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_56_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_56_fel_idx+1) ;
            sGXsfl_56_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_56_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_562( ) ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
            A5742ForSerDsc = httpContext.cgiGet( edtForSerDsc_Internalname) ;
            n5742ForSerDsc = false ;
            A482ForColNom = httpContext.cgiGet( edtForColNom_Internalname) ;
            A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A496ForUltUti = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtForUltUti_Internalname), 0)) ;
            n496ForUltUti = false ;
            A2749ForPro = ((GXutil.strcmp(httpContext.cgiGet( chkForPro.getInternalname()), "S")==0) ? "S" : "N") ;
            n2749ForPro = false ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNum_hdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNum_hdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNUM_HDRS");
               GX_FocusControl = edtavNum_hdrs_Internalname ;
               wbErr = true ;
               AV74Num_hdrs = (short)(0) ;
            }
            else
            {
               AV74Num_hdrs = (short)(localUtil.ctol( httpContext.cgiGet( edtavNum_hdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNum_hdrsh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNum_hdrsh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNUM_HDRSH");
               GX_FocusControl = edtavNum_hdrsh_Internalname ;
               wbErr = true ;
               AV76Num_hdrsH = (short)(0) ;
            }
            else
            {
               AV76Num_hdrsH = (short)(localUtil.ctol( httpContext.cgiGet( edtavNum_hdrsh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            }
            if ( (0==AV74Num_hdrs) && (0==AV76Num_hdrsH) )
            {
               AV84Porcentaje = (short)((AV83CantidadRegistrosProcesados/ (double) (AV82CantidadRegistrosAProcesar))*100) ;
               AV81ProgressIndicator.setgxTv_SdtProgress_Value( AV84Porcentaje );
               AV81ProgressIndicator.showwithtitle(httpContext.getMessage( "Procesando....", ""));
               new app.formulaciontinte.borradodeformulas_3(remoteHandle, context).execute( A396EmprCod, A252CliCod, A494ForSer, A482ForColNom, A483ForColNum, A831TipColCod, A486ForNumCol, AV79Station, AV80usurcod) ;
               new app.formulaciontinte.eliminaciondeformulastinte_3(remoteHandle, context).execute( A396EmprCod, A252CliCod, A494ForSer, A482ForColNom, A483ForColNum, A831TipColCod, A486ForNumCol, AV79Station, AV80usurcod, "") ;
               AV83CantidadRegistrosProcesados = (int)(AV83CantidadRegistrosProcesados+1) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83CantidadRegistrosProcesados", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83CantidadRegistrosProcesados), 6, 0));
            }
            /* End For Each Line */
         }
         if ( nGXsfl_56_fel_idx == 0 )
         {
            nGXsfl_56_idx = 1 ;
            sGXsfl_56_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_56_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_562( ) ;
         }
         nGXsfl_56_fel_idx = 1 ;
         AV81ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
         AV81ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
         AV85i = GXutil.sleep( 1) ;
         AV81ProgressIndicator.hide();
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV81ProgressIndicator", AV81ProgressIndicator);
   }

   public void e171Y72( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.formulaciontinte.eliminaciondeformulastinte_2export(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      eliminaciondeformulastinte_2_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      eliminaciondeformulastinte_2_impl.this.AV17ErrorMessage = GXv_char3[0] ;
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

   public void e181Y72( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.formulaciontinte.eliminaciondeformulastinte_2exportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV20ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector13[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "CliCod", "", "Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "CliNom", "", "Nombre", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "ForSer", "", "Articulo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "ForSerDsc", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "ForColNom", "", "Color", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "ForColNum", "", "Numero", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "TipColCod", "", "Codigo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "ForUltUti", "", "Fecha Ult. Uti.", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "ForPro", "", "Prov.?", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "&Num_hdrs", "", "Producciones?", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "&Num_hdrsH", "", "Historico?", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.EliminaciondeFormulasTinte_2ColumnsSelector", GXv_char4) ;
      eliminaciondeformulastinte_2_impl.this.GXt_char1 = GXv_char4[0] ;
      AV19UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV19UserCustomValue)==0) ) )
      {
         AV21ColumnsSelectorAux.fromxml(AV19UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector13[0] = AV21ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, GXv_SdtWWPColumnsSelector14) ;
         AV21ColumnsSelectorAux = GXv_SdtWWPColumnsSelector13[0] ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      }
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV88Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV88Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV88Pgmname+"GridState"), null, null);
      }
      AV93GXV1 = 1 ;
      while ( AV93GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV93GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNUM_HDRSH") == 0 )
         {
            AV77TFNum_hdrsH = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFNum_hdrsH", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77TFNum_hdrsH), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNUM_HDRSH_SEL") == 0 )
         {
            AV78TFNum_hdrsH_Sel = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFNum_hdrsH_Sel", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78TFNum_hdrsH_Sel), 4, 0));
         }
         AV93GXV1 = (int)(AV93GXV1+1) ;
      }
      Ddo_grid_Selectedvalue_set = ((0==AV78TFNum_hdrsH_Sel) ? "" : GXutil.str( AV78TFNum_hdrsH_Sel, 4, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = ((0==AV77TFNum_hdrsH) ? "" : GXutil.str( AV77TFNum_hdrsH, 4, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV88Pgmname+"GridState"), null, null);
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFNUM_HDRSH", "", !(0==AV77TFNum_hdrsH), (short)(0), GXutil.trim( GXutil.str( AV77TFNum_hdrsH, 4, 0)), "", !(0==AV78TFNum_hdrsH_Sel), GXutil.trim( GXutil.str( AV78TFNum_hdrsH_Sel, 4, 0)), "") ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      if ( ! (GXutil.strcmp("", AV62EmprCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV62EmprCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV63CliCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV63CliCod, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV64CliCod_to) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV64CliCod_to, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV65Forser)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORSER" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV65Forser );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV66Forser_to)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORSER_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV66Forser_to );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV67Forcolnom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNOM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV67Forcolnom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV68Forcolnom_to)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNOM_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV68Forcolnom_to );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV69Forcolnum) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNUM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV69Forcolnum, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV70Forcolnum_to) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNUM_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV70Forcolnum_to, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV71TipColCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPCOLCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV71TipColCod, 2, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV72TipColCod_to) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPCOLCOD_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV72TipColCod_to, 2, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73ForUltUti)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORULTUTI" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV73ForUltUti, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV88Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV88Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "FormulacionTinte.MtoFormulasTinte" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table2_80_1Y72( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btneliminar_Internalname, tblTabledvelop_confirmpanel_btneliminar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btneliminar.setProperty("Title", Dvelop_confirmpanel_btneliminar_Title);
         ucDvelop_confirmpanel_btneliminar.setProperty("ConfirmationText", Dvelop_confirmpanel_btneliminar_Confirmationtext);
         ucDvelop_confirmpanel_btneliminar.setProperty("YesButtonCaption", Dvelop_confirmpanel_btneliminar_Yesbuttoncaption);
         ucDvelop_confirmpanel_btneliminar.setProperty("NoButtonCaption", Dvelop_confirmpanel_btneliminar_Nobuttoncaption);
         ucDvelop_confirmpanel_btneliminar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btneliminar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btneliminar.setProperty("YesButtonPosition", Dvelop_confirmpanel_btneliminar_Yesbuttonposition);
         ucDvelop_confirmpanel_btneliminar.setProperty("ConfirmType", Dvelop_confirmpanel_btneliminar_Confirmtype);
         ucDvelop_confirmpanel_btneliminar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btneliminar_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_80_1Y72e( true) ;
      }
      else
      {
         wb_table2_80_1Y72e( false) ;
      }
   }

   public void wb_table1_37_1Y72( boolean wbgen )
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
         wb_table1_37_1Y72e( true) ;
      }
      else
      {
         wb_table1_37_1Y72e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV62EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62EmprCod", AV62EmprCod);
      AV63CliCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63CliCod), 6, 0));
      AV64CliCod_to = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64CliCod_to), 6, 0));
      AV65Forser = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Forser", AV65Forser);
      AV66Forser_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Forser_to", AV66Forser_to);
      AV67Forcolnom = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Forcolnom", AV67Forcolnom);
      AV68Forcolnom_to = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Forcolnom_to", AV68Forcolnom_to);
      AV69Forcolnum = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Forcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69Forcolnum), 6, 0));
      AV70Forcolnum_to = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Forcolnum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70Forcolnum_to), 6, 0));
      AV71TipColCod = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TipColCod), 2, 0));
      AV72TipColCod_to = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TipColCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72TipColCod_to), 2, 0));
      AV73ForUltUti = (java.util.Date)getParm(obj,11,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73ForUltUti", localUtil.format(AV73ForUltUti, "99/99/99"));
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
      pa1Y72( ) ;
      ws1Y72( ) ;
      we1Y72( ) ;
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
      sCtrlAV62EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV63CliCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV64CliCod_to = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV65Forser = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV66Forser_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV67Forcolnom = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV68Forcolnom_to = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV69Forcolnum = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV70Forcolnum_to = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV71TipColCod = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV72TipColCod_to = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV73ForUltUti = (String)getParm(obj,11,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1Y72( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "formulaciontinte\\eliminaciondeformulastinte_2", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1Y72( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV62EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62EmprCod", AV62EmprCod);
         AV63CliCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63CliCod), 6, 0));
         AV64CliCod_to = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64CliCod_to), 6, 0));
         AV65Forser = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Forser", AV65Forser);
         AV66Forser_to = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Forser_to", AV66Forser_to);
         AV67Forcolnom = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Forcolnom", AV67Forcolnom);
         AV68Forcolnom_to = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Forcolnom_to", AV68Forcolnom_to);
         AV69Forcolnum = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Forcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69Forcolnum), 6, 0));
         AV70Forcolnum_to = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Forcolnum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70Forcolnum_to), 6, 0));
         AV71TipColCod = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TipColCod), 2, 0));
         AV72TipColCod_to = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TipColCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72TipColCod_to), 2, 0));
         AV73ForUltUti = (java.util.Date)getParm(obj,13,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73ForUltUti", localUtil.format(AV73ForUltUti, "99/99/99"));
      }
      wcpOAV62EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV62EmprCod") ;
      wcpOAV63CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV63CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV64CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV64CliCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV65Forser = httpContext.cgiGet( sPrefix+"wcpOAV65Forser") ;
      wcpOAV66Forser_to = httpContext.cgiGet( sPrefix+"wcpOAV66Forser_to") ;
      wcpOAV67Forcolnom = httpContext.cgiGet( sPrefix+"wcpOAV67Forcolnom") ;
      wcpOAV68Forcolnom_to = httpContext.cgiGet( sPrefix+"wcpOAV68Forcolnom_to") ;
      wcpOAV69Forcolnum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV69Forcolnum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV70Forcolnum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV70Forcolnum_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV71TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV71TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV72TipColCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV72TipColCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV73ForUltUti = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV73ForUltUti"), 0) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV62EmprCod, wcpOAV62EmprCod) != 0 ) || ( AV63CliCod != wcpOAV63CliCod ) || ( AV64CliCod_to != wcpOAV64CliCod_to ) || ( GXutil.strcmp(AV65Forser, wcpOAV65Forser) != 0 ) || ( GXutil.strcmp(AV66Forser_to, wcpOAV66Forser_to) != 0 ) || ( GXutil.strcmp(AV67Forcolnom, wcpOAV67Forcolnom) != 0 ) || ( GXutil.strcmp(AV68Forcolnom_to, wcpOAV68Forcolnom_to) != 0 ) || ( AV69Forcolnum != wcpOAV69Forcolnum ) || ( AV70Forcolnum_to != wcpOAV70Forcolnum_to ) || ( AV71TipColCod != wcpOAV71TipColCod ) || ( AV72TipColCod_to != wcpOAV72TipColCod_to ) || !( GXutil.dateCompare(GXutil.resetTime(AV73ForUltUti), GXutil.resetTime(wcpOAV73ForUltUti)) ) ) )
      {
         setjustcreated();
      }
      wcpOAV62EmprCod = AV62EmprCod ;
      wcpOAV63CliCod = AV63CliCod ;
      wcpOAV64CliCod_to = AV64CliCod_to ;
      wcpOAV65Forser = AV65Forser ;
      wcpOAV66Forser_to = AV66Forser_to ;
      wcpOAV67Forcolnom = AV67Forcolnom ;
      wcpOAV68Forcolnom_to = AV68Forcolnom_to ;
      wcpOAV69Forcolnum = AV69Forcolnum ;
      wcpOAV70Forcolnum_to = AV70Forcolnum_to ;
      wcpOAV71TipColCod = AV71TipColCod ;
      wcpOAV72TipColCod_to = AV72TipColCod_to ;
      wcpOAV73ForUltUti = AV73ForUltUti ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV62EmprCod = httpContext.cgiGet( sPrefix+"AV62EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV62EmprCod) > 0 )
      {
         AV62EmprCod = httpContext.cgiGet( sCtrlAV62EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62EmprCod", AV62EmprCod);
      }
      else
      {
         AV62EmprCod = httpContext.cgiGet( sPrefix+"AV62EmprCod_PARM") ;
      }
      sCtrlAV63CliCod = httpContext.cgiGet( sPrefix+"AV63CliCod_CTRL") ;
      if ( GXutil.len( sCtrlAV63CliCod) > 0 )
      {
         AV63CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV63CliCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63CliCod), 6, 0));
      }
      else
      {
         AV63CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV63CliCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV64CliCod_to = httpContext.cgiGet( sPrefix+"AV64CliCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV64CliCod_to) > 0 )
      {
         AV64CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV64CliCod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64CliCod_to), 6, 0));
      }
      else
      {
         AV64CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV64CliCod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV65Forser = httpContext.cgiGet( sPrefix+"AV65Forser_CTRL") ;
      if ( GXutil.len( sCtrlAV65Forser) > 0 )
      {
         AV65Forser = httpContext.cgiGet( sCtrlAV65Forser) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Forser", AV65Forser);
      }
      else
      {
         AV65Forser = httpContext.cgiGet( sPrefix+"AV65Forser_PARM") ;
      }
      sCtrlAV66Forser_to = httpContext.cgiGet( sPrefix+"AV66Forser_to_CTRL") ;
      if ( GXutil.len( sCtrlAV66Forser_to) > 0 )
      {
         AV66Forser_to = httpContext.cgiGet( sCtrlAV66Forser_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Forser_to", AV66Forser_to);
      }
      else
      {
         AV66Forser_to = httpContext.cgiGet( sPrefix+"AV66Forser_to_PARM") ;
      }
      sCtrlAV67Forcolnom = httpContext.cgiGet( sPrefix+"AV67Forcolnom_CTRL") ;
      if ( GXutil.len( sCtrlAV67Forcolnom) > 0 )
      {
         AV67Forcolnom = httpContext.cgiGet( sCtrlAV67Forcolnom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Forcolnom", AV67Forcolnom);
      }
      else
      {
         AV67Forcolnom = httpContext.cgiGet( sPrefix+"AV67Forcolnom_PARM") ;
      }
      sCtrlAV68Forcolnom_to = httpContext.cgiGet( sPrefix+"AV68Forcolnom_to_CTRL") ;
      if ( GXutil.len( sCtrlAV68Forcolnom_to) > 0 )
      {
         AV68Forcolnom_to = httpContext.cgiGet( sCtrlAV68Forcolnom_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Forcolnom_to", AV68Forcolnom_to);
      }
      else
      {
         AV68Forcolnom_to = httpContext.cgiGet( sPrefix+"AV68Forcolnom_to_PARM") ;
      }
      sCtrlAV69Forcolnum = httpContext.cgiGet( sPrefix+"AV69Forcolnum_CTRL") ;
      if ( GXutil.len( sCtrlAV69Forcolnum) > 0 )
      {
         AV69Forcolnum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV69Forcolnum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Forcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69Forcolnum), 6, 0));
      }
      else
      {
         AV69Forcolnum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV69Forcolnum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV70Forcolnum_to = httpContext.cgiGet( sPrefix+"AV70Forcolnum_to_CTRL") ;
      if ( GXutil.len( sCtrlAV70Forcolnum_to) > 0 )
      {
         AV70Forcolnum_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV70Forcolnum_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Forcolnum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70Forcolnum_to), 6, 0));
      }
      else
      {
         AV70Forcolnum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV70Forcolnum_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV71TipColCod = httpContext.cgiGet( sPrefix+"AV71TipColCod_CTRL") ;
      if ( GXutil.len( sCtrlAV71TipColCod) > 0 )
      {
         AV71TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV71TipColCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TipColCod), 2, 0));
      }
      else
      {
         AV71TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV71TipColCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV72TipColCod_to = httpContext.cgiGet( sPrefix+"AV72TipColCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV72TipColCod_to) > 0 )
      {
         AV72TipColCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV72TipColCod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TipColCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72TipColCod_to), 2, 0));
      }
      else
      {
         AV72TipColCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV72TipColCod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV73ForUltUti = httpContext.cgiGet( sPrefix+"AV73ForUltUti_CTRL") ;
      if ( GXutil.len( sCtrlAV73ForUltUti) > 0 )
      {
         AV73ForUltUti = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV73ForUltUti), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73ForUltUti", localUtil.format(AV73ForUltUti, "99/99/99"));
      }
      else
      {
         AV73ForUltUti = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV73ForUltUti_PARM"), 0) ;
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
      pa1Y72( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1Y72( ) ;
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
      ws1Y72( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62EmprCod_PARM", GXutil.rtrim( AV62EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV62EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62EmprCod_CTRL", GXutil.rtrim( sCtrlAV62EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63CliCod_PARM", GXutil.ltrim( localUtil.ntoc( AV63CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV63CliCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63CliCod_CTRL", GXutil.rtrim( sCtrlAV63CliCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64CliCod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV64CliCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV64CliCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64CliCod_to_CTRL", GXutil.rtrim( sCtrlAV64CliCod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65Forser_PARM", GXutil.rtrim( AV65Forser));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV65Forser)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65Forser_CTRL", GXutil.rtrim( sCtrlAV65Forser));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66Forser_to_PARM", GXutil.rtrim( AV66Forser_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV66Forser_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66Forser_to_CTRL", GXutil.rtrim( sCtrlAV66Forser_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV67Forcolnom_PARM", GXutil.rtrim( AV67Forcolnom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV67Forcolnom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV67Forcolnom_CTRL", GXutil.rtrim( sCtrlAV67Forcolnom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68Forcolnom_to_PARM", GXutil.rtrim( AV68Forcolnom_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV68Forcolnom_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68Forcolnom_to_CTRL", GXutil.rtrim( sCtrlAV68Forcolnom_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV69Forcolnum_PARM", GXutil.ltrim( localUtil.ntoc( AV69Forcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV69Forcolnum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV69Forcolnum_CTRL", GXutil.rtrim( sCtrlAV69Forcolnum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70Forcolnum_to_PARM", GXutil.ltrim( localUtil.ntoc( AV70Forcolnum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV70Forcolnum_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70Forcolnum_to_CTRL", GXutil.rtrim( sCtrlAV70Forcolnum_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71TipColCod_PARM", GXutil.ltrim( localUtil.ntoc( AV71TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV71TipColCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71TipColCod_CTRL", GXutil.rtrim( sCtrlAV71TipColCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV72TipColCod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV72TipColCod_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV72TipColCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV72TipColCod_to_CTRL", GXutil.rtrim( sCtrlAV72TipColCod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV73ForUltUti_PARM", localUtil.dtoc( AV73ForUltUti, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV73ForUltUti)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV73ForUltUti_CTRL", GXutil.rtrim( sCtrlAV73ForUltUti));
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
      we1Y72( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116104475", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/eliminaciondeformulastinte_2.js", "?202682116104476", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_562( )
   {
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_56_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_56_idx ;
      edtForSer_Internalname = sPrefix+"FORSER_"+sGXsfl_56_idx ;
      edtForSerDsc_Internalname = sPrefix+"FORSERDSC_"+sGXsfl_56_idx ;
      edtForColNom_Internalname = sPrefix+"FORCOLNOM_"+sGXsfl_56_idx ;
      edtForColNum_Internalname = sPrefix+"FORCOLNUM_"+sGXsfl_56_idx ;
      edtTipColCod_Internalname = sPrefix+"TIPCOLCOD_"+sGXsfl_56_idx ;
      edtForUltUti_Internalname = sPrefix+"FORULTUTI_"+sGXsfl_56_idx ;
      chkForPro.setInternalname( sPrefix+"FORPRO_"+sGXsfl_56_idx );
      edtavNum_hdrs_Internalname = sPrefix+"vNUM_HDRS_"+sGXsfl_56_idx ;
      edtavNum_hdrsh_Internalname = sPrefix+"vNUM_HDRSH_"+sGXsfl_56_idx ;
   }

   public void subsflControlProps_fel_562( )
   {
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_56_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_56_fel_idx ;
      edtForSer_Internalname = sPrefix+"FORSER_"+sGXsfl_56_fel_idx ;
      edtForSerDsc_Internalname = sPrefix+"FORSERDSC_"+sGXsfl_56_fel_idx ;
      edtForColNom_Internalname = sPrefix+"FORCOLNOM_"+sGXsfl_56_fel_idx ;
      edtForColNum_Internalname = sPrefix+"FORCOLNUM_"+sGXsfl_56_fel_idx ;
      edtTipColCod_Internalname = sPrefix+"TIPCOLCOD_"+sGXsfl_56_fel_idx ;
      edtForUltUti_Internalname = sPrefix+"FORULTUTI_"+sGXsfl_56_fel_idx ;
      chkForPro.setInternalname( sPrefix+"FORPRO_"+sGXsfl_56_fel_idx );
      edtavNum_hdrs_Internalname = sPrefix+"vNUM_HDRS_"+sGXsfl_56_fel_idx ;
      edtavNum_hdrsh_Internalname = sPrefix+"vNUM_HDRSH_"+sGXsfl_56_fel_idx ;
   }

   public void sendrow_562( )
   {
      subsflControlProps_562( ) ;
      wb1Y70( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_56_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_56_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_56_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtForSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForSer_Internalname,GXutil.rtrim( A494ForSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtForSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForSerDsc_Internalname,GXutil.rtrim( A5742ForSerDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtForSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtForColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForColNom_Internalname,GXutil.rtrim( A482ForColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtForColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtTipColCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipColCod_Internalname,GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTipColCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTipColCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtForUltUti_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForUltUti_Internalname,localUtil.format(A496ForUltUti, "99/99/99"),localUtil.format( A496ForUltUti, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtForUltUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForUltUti_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkForPro.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "FORPRO_" + sGXsfl_56_idx ;
         chkForPro.setName( GXCCtl );
         chkForPro.setWebtags( "" );
         chkForPro.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkForPro.getInternalname(), "TitleCaption", chkForPro.getCaption(), !bGXsfl_56_Refreshing);
         chkForPro.setCheckedValue( "N" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkForPro.getInternalname(),A2749ForPro,"","",Integer.valueOf(chkForPro.getVisible()),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn hidden-xs","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavNum_hdrs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavNum_hdrs_Enabled!=0)&&(edtavNum_hdrs_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 66,'"+sPrefix+"',false,'"+sGXsfl_56_idx+"',56)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavNum_hdrs_Internalname,GXutil.ltrim( localUtil.ntoc( AV74Num_hdrs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavNum_hdrs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV74Num_hdrs), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV74Num_hdrs), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavNum_hdrs_Enabled!=0)&&(edtavNum_hdrs_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavNum_hdrs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavNum_hdrs_Visible),Integer.valueOf(edtavNum_hdrs_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavNum_hdrsh_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavNum_hdrsh_Enabled!=0)&&(edtavNum_hdrsh_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 67,'"+sPrefix+"',false,'"+sGXsfl_56_idx+"',56)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavNum_hdrsh_Internalname,GXutil.ltrim( localUtil.ntoc( AV76Num_hdrsH, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavNum_hdrsh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV76Num_hdrsH), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV76Num_hdrsH), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavNum_hdrsh_Enabled!=0)&&(edtavNum_hdrsh_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavNum_hdrsh_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavNum_hdrsh_Visible),Integer.valueOf(edtavNum_hdrsh_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1Y72( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_56_idx = ((subGrid_Islastpage==1)&&(nGXsfl_56_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_56_idx+1) ;
         sGXsfl_56_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_56_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_562( ) ;
      }
      /* End function sendrow_562 */
   }

   public void startgridcontrol56( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"56\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForSerDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipColCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForUltUti_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Ult. Uti.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkForPro.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Prov.?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavNum_hdrs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producciones?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavNum_hdrsh_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Historico?", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A494ForSer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5742ForSerDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForSerDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A482ForColNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForColNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForColNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipColCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A496ForUltUti, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForUltUti_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2749ForPro));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkForPro.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV74Num_hdrs, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavNum_hdrs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavNum_hdrs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV76Num_hdrsH, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavNum_hdrsh_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavNum_hdrsh_Visible, (byte)(5), (byte)(0), ".", "")));
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
      lblTextblockcantidadregistrosaprocesar_Internalname = sPrefix+"TEXTBLOCKCANTIDADREGISTROSAPROCESAR" ;
      edtavCantidadregistrosaprocesar_Internalname = sPrefix+"vCANTIDADREGISTROSAPROCESAR" ;
      divUnnamedtablecantidadregistrosaprocesar_Internalname = sPrefix+"UNNAMEDTABLECANTIDADREGISTROSAPROCESAR" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      bttBtneliminar_Internalname = sPrefix+"BTNELIMINAR" ;
      Barradeprogreso_Internalname = sPrefix+"BARRADEPROGRESO" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtForSer_Internalname = sPrefix+"FORSER" ;
      edtForSerDsc_Internalname = sPrefix+"FORSERDSC" ;
      edtForColNom_Internalname = sPrefix+"FORCOLNOM" ;
      edtForColNum_Internalname = sPrefix+"FORCOLNUM" ;
      edtTipColCod_Internalname = sPrefix+"TIPCOLCOD" ;
      edtForUltUti_Internalname = sPrefix+"FORULTUTI" ;
      chkForPro.setInternalname( sPrefix+"FORPRO" );
      edtavNum_hdrs_Internalname = sPrefix+"vNUM_HDRS" ;
      edtavNum_hdrsh_Internalname = sPrefix+"vNUM_HDRSH" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_btneliminar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINAR" ;
      tblTabledvelop_confirmpanel_btneliminar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_BTNELIMINAR" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtavNum_hdrsh_Jsonclick = "" ;
      edtavNum_hdrsh_Enabled = 1 ;
      edtavNum_hdrs_Jsonclick = "" ;
      edtavNum_hdrs_Enabled = 1 ;
      chkForPro.setCaption( "" );
      edtForUltUti_Jsonclick = "" ;
      edtTipColCod_Jsonclick = "" ;
      edtForColNum_Jsonclick = "" ;
      edtForColNom_Jsonclick = "" ;
      edtForSerDsc_Jsonclick = "" ;
      edtForSer_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavNum_hdrsh_Visible = -1 ;
      edtavNum_hdrs_Visible = -1 ;
      chkForPro.setVisible( -1 );
      edtForUltUti_Visible = -1 ;
      edtTipColCod_Visible = -1 ;
      edtForColNum_Visible = -1 ;
      edtForColNom_Visible = -1 ;
      edtForSerDsc_Visible = -1 ;
      edtForSer_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavCantidadregistrosaprocesar_Jsonclick = "" ;
      edtavCantidadregistrosaprocesar_Enabled = 1 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_btneliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_btneliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btneliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btneliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btneliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btneliminar_Confirmationtext = "¿Desea eliminar estos datos?" ;
      Dvelop_confirmpanel_btneliminar_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "FormulacionTinte.EliminaciondeFormulasTinte_2GetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic" ;
      Ddo_grid_Includedatalist = "T" ;
      Ddo_grid_Filtertype = "Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Columnssortvalues = "" ;
      Ddo_grid_Columnids = "10:Num_hdrsH" ;
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
      GXCCtl = "FORPRO_" + sGXsfl_56_idx ;
      chkForPro.setName( GXCCtl );
      chkForPro.setWebtags( "" );
      chkForPro.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkForPro.getInternalname(), "TitleCaption", chkForPro.getCaption(), !bGXsfl_56_Refreshing);
      chkForPro.setCheckedValue( "N" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV82CantidadRegistrosAProcesar',fld:'vCANTIDADREGISTROSAPROCESAR',pic:'ZZZZZ9'},{av:'sPrefix'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV63CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV64CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV65Forser',fld:'vFORSER',pic:''},{av:'AV66Forser_to',fld:'vFORSER_TO',pic:''},{av:'AV67Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV68Forcolnom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV69Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV70Forcolnum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV71TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV72TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV73ForUltUti',fld:'vFORULTUTI',pic:''},{av:'AV77TFNum_hdrsH',fld:'vTFNUM_HDRSH',pic:'ZZZ9'},{av:'AV78TFNum_hdrsH_Sel',fld:'vTFNUM_HDRSH_SEL',pic:'ZZZ9'},{av:'AV88Pgmname',fld:'vPGMNAME',pic:''},{av:'AV79Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV80usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForSerDsc_Visible',ctrl:'FORSERDSC',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtForUltUti_Visible',ctrl:'FORULTUTI',prop:'Visible'},{av:'chkForPro.getVisible()',ctrl:'FORPRO',prop:'Visible'},{av:'edtavNum_hdrs_Visible',ctrl:'vNUM_HDRS',prop:'Visible'},{av:'edtavNum_hdrsh_Visible',ctrl:'vNUM_HDRSH',prop:'Visible'},{av:'AV60GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV61GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV82CantidadRegistrosAProcesar',fld:'vCANTIDADREGISTROSAPROCESAR',pic:'ZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121Y72',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV63CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV64CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV65Forser',fld:'vFORSER',pic:''},{av:'AV66Forser_to',fld:'vFORSER_TO',pic:''},{av:'AV67Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV68Forcolnom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV69Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV70Forcolnum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV71TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV72TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV73ForUltUti',fld:'vFORULTUTI',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV77TFNum_hdrsH',fld:'vTFNUM_HDRSH',pic:'ZZZ9'},{av:'AV78TFNum_hdrsH_Sel',fld:'vTFNUM_HDRSH_SEL',pic:'ZZZ9'},{av:'AV88Pgmname',fld:'vPGMNAME',pic:''},{av:'AV82CantidadRegistrosAProcesar',fld:'vCANTIDADREGISTROSAPROCESAR',pic:'ZZZZZ9'},{av:'AV79Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV80usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131Y72',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV63CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV64CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV65Forser',fld:'vFORSER',pic:''},{av:'AV66Forser_to',fld:'vFORSER_TO',pic:''},{av:'AV67Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV68Forcolnom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV69Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV70Forcolnum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV71TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV72TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV73ForUltUti',fld:'vFORULTUTI',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV77TFNum_hdrsH',fld:'vTFNUM_HDRSH',pic:'ZZZ9'},{av:'AV78TFNum_hdrsH_Sel',fld:'vTFNUM_HDRSH_SEL',pic:'ZZZ9'},{av:'AV88Pgmname',fld:'vPGMNAME',pic:''},{av:'AV82CantidadRegistrosAProcesar',fld:'vCANTIDADREGISTROSAPROCESAR',pic:'ZZZZZ9'},{av:'AV79Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV80usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141Y72',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV63CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV64CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV65Forser',fld:'vFORSER',pic:''},{av:'AV66Forser_to',fld:'vFORSER_TO',pic:''},{av:'AV67Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV68Forcolnom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV69Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV70Forcolnum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV71TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV72TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV73ForUltUti',fld:'vFORULTUTI',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV77TFNum_hdrsH',fld:'vTFNUM_HDRSH',pic:'ZZZ9'},{av:'AV78TFNum_hdrsH_Sel',fld:'vTFNUM_HDRSH_SEL',pic:'ZZZ9'},{av:'AV88Pgmname',fld:'vPGMNAME',pic:''},{av:'AV82CantidadRegistrosAProcesar',fld:'vCANTIDADREGISTROSAPROCESAR',pic:'ZZZZZ9'},{av:'AV79Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV80usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV77TFNum_hdrsH',fld:'vTFNUM_HDRSH',pic:'ZZZ9'},{av:'AV78TFNum_hdrsH_Sel',fld:'vTFNUM_HDRSH_SEL',pic:'ZZZ9'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e211Y72',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A494ForSer',fld:'FORSER',pic:'',hsh:true},{av:'A482ForColNom',fld:'FORCOLNOM',pic:'',hsh:true},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9',hsh:true},{av:'AV82CantidadRegistrosAProcesar',fld:'vCANTIDADREGISTROSAPROCESAR',pic:'ZZZZZ9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV74Num_hdrs',fld:'vNUM_HDRS',pic:'ZZZ9',hsh:true},{av:'AV76Num_hdrsH',fld:'vNUM_HDRSH',pic:'ZZZ9',hsh:true},{av:'AV82CantidadRegistrosAProcesar',fld:'vCANTIDADREGISTROSAPROCESAR',pic:'ZZZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151Y72',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV63CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV64CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV65Forser',fld:'vFORSER',pic:''},{av:'AV66Forser_to',fld:'vFORSER_TO',pic:''},{av:'AV67Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV68Forcolnom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV69Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV70Forcolnum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV71TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV72TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV73ForUltUti',fld:'vFORULTUTI',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV77TFNum_hdrsH',fld:'vTFNUM_HDRSH',pic:'ZZZ9'},{av:'AV78TFNum_hdrsH_Sel',fld:'vTFNUM_HDRSH_SEL',pic:'ZZZ9'},{av:'AV88Pgmname',fld:'vPGMNAME',pic:''},{av:'AV82CantidadRegistrosAProcesar',fld:'vCANTIDADREGISTROSAPROCESAR',pic:'ZZZZZ9'},{av:'AV79Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV80usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForSerDsc_Visible',ctrl:'FORSERDSC',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtForUltUti_Visible',ctrl:'FORULTUTI',prop:'Visible'},{av:'chkForPro.getVisible()',ctrl:'FORPRO',prop:'Visible'},{av:'edtavNum_hdrs_Visible',ctrl:'vNUM_HDRS',prop:'Visible'},{av:'edtavNum_hdrsh_Visible',ctrl:'vNUM_HDRSH',prop:'Visible'},{av:'AV60GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV61GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV82CantidadRegistrosAProcesar',fld:'vCANTIDADREGISTROSAPROCESAR',pic:'ZZZZZ9'}]}");
      setEventMetadata("'DOELIMINAR'","{handler:'e111Y71',iparms:[]");
      setEventMetadata("'DOELIMINAR'",",oparms:[{av:'Dvelop_confirmpanel_btneliminar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_BTNELIMINAR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNELIMINAR.CLOSE","{handler:'e161Y72',iparms:[{av:'AV82CantidadRegistrosAProcesar',fld:'vCANTIDADREGISTROSAPROCESAR',pic:'ZZZZZ9'},{av:'Dvelop_confirmpanel_btneliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNELIMINAR',prop:'Result'},{av:'AV74Num_hdrs',fld:'vNUM_HDRS',grid:56,pic:'ZZZ9',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_56',ctrl:'GRID',grid:56,prop:'GridRC',grid:56},{av:'AV76Num_hdrsH',fld:'vNUM_HDRSH',grid:56,pic:'ZZZ9',hsh:true},{av:'AV83CantidadRegistrosProcesados',fld:'vCANTIDADREGISTROSPROCESADOS',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',grid:56,pic:'ZZZZZ9',hsh:true},{av:'A494ForSer',fld:'FORSER',grid:56,pic:'',hsh:true},{av:'A482ForColNom',fld:'FORCOLNOM',grid:56,pic:'',hsh:true},{av:'A483ForColNum',fld:'FORCOLNUM',grid:56,pic:'ZZZZZ9',hsh:true},{av:'A831TipColCod',fld:'TIPCOLCOD',grid:56,pic:'Z9',hsh:true},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV79Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV80usurcod',fld:'vUSURCOD',pic:'@!',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNELIMINAR.CLOSE",",oparms:[{av:'AV82CantidadRegistrosAProcesar',fld:'vCANTIDADREGISTROSAPROCESAR',pic:'ZZZZZ9'},{av:'AV83CantidadRegistrosProcesados',fld:'vCANTIDADREGISTROSPROCESADOS',pic:'ZZZZZ9'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e171Y72',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e181Y72',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Num_hdrsh',iparms:[]");
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
      wcpOAV62EmprCod = "" ;
      wcpOAV65Forser = "" ;
      wcpOAV66Forser_to = "" ;
      wcpOAV67Forcolnom = "" ;
      wcpOAV68Forcolnom_to = "" ;
      wcpOAV73ForUltUti = GXutil.nullDate() ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Dvelop_confirmpanel_btneliminar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV62EmprCod = "" ;
      AV65Forser = "" ;
      AV66Forser_to = "" ;
      AV67Forcolnom = "" ;
      AV68Forcolnom_to = "" ;
      AV73ForUltUti = GXutil.nullDate() ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV88Pgmname = "" ;
      AV79Station = "" ;
      AV80usurcod = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV58DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      lblTextblockcantidadregistrosaprocesar_Jsonclick = "" ;
      bttBtneliminar_Jsonclick = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A279CliNom = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A482ForColNom = "" ;
      A496ForUltUti = GXutil.nullDate() ;
      A2749ForPro = "" ;
      scmdbuf = "" ;
      H01Y72_A486ForNumCol = new int[1] ;
      H01Y72_A396EmprCod = new String[] {""} ;
      H01Y72_A2749ForPro = new String[] {""} ;
      H01Y72_n2749ForPro = new boolean[] {false} ;
      H01Y72_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      H01Y72_n496ForUltUti = new boolean[] {false} ;
      H01Y72_A831TipColCod = new byte[1] ;
      H01Y72_A483ForColNum = new int[1] ;
      H01Y72_A482ForColNom = new String[] {""} ;
      H01Y72_A5742ForSerDsc = new String[] {""} ;
      H01Y72_n5742ForSerDsc = new boolean[] {false} ;
      H01Y72_A494ForSer = new String[] {""} ;
      H01Y72_A279CliNom = new String[] {""} ;
      H01Y72_A252CliCod = new int[1] ;
      H01Y73_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV89Emprnom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      GXv_int9 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int11 = new byte[1] ;
      GXv_int12 = new int[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV81ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      AV16ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      AV19UserCustomValue = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV21ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector13 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector14 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState15 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      ucDvelop_confirmpanel_btneliminar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV62EmprCod = "" ;
      sCtrlAV63CliCod = "" ;
      sCtrlAV64CliCod_to = "" ;
      sCtrlAV65Forser = "" ;
      sCtrlAV66Forser_to = "" ;
      sCtrlAV67Forcolnom = "" ;
      sCtrlAV68Forcolnom_to = "" ;
      sCtrlAV69Forcolnum = "" ;
      sCtrlAV70Forcolnum_to = "" ;
      sCtrlAV71TipColCod = "" ;
      sCtrlAV72TipColCod_to = "" ;
      sCtrlAV73ForUltUti = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.eliminaciondeformulastinte_2__default(),
         new Object[] {
             new Object[] {
            H01Y72_A486ForNumCol, H01Y72_A396EmprCod, H01Y72_A2749ForPro, H01Y72_n2749ForPro, H01Y72_A496ForUltUti, H01Y72_n496ForUltUti, H01Y72_A831TipColCod, H01Y72_A483ForColNum, H01Y72_A482ForColNom, H01Y72_A5742ForSerDsc,
            H01Y72_n5742ForSerDsc, H01Y72_A494ForSer, H01Y72_A279CliNom, H01Y72_A252CliCod
            }
            , new Object[] {
            H01Y73_AGRID_nRecordCount
            }
         }
      );
      AV88Pgmname = "FormulacionTinte.EliminaciondeFormulasTinte_2" ;
      /* GeneXus formulas. */
      AV88Pgmname = "FormulacionTinte.EliminaciondeFormulasTinte_2" ;
      Gx_err = (short)(0) ;
      edtavCantidadregistrosaprocesar_Enabled = 0 ;
      edtavNum_hdrs_Enabled = 0 ;
      edtavNum_hdrsh_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV71TipColCod ;
   private byte wcpOAV72TipColCod_to ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV71TipColCod ;
   private byte AV72TipColCod_to ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A831TipColCod ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXv_int11[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV77TFNum_hdrsH ;
   private short AV78TFNum_hdrsH_Sel ;
   private short wbEnd ;
   private short wbStart ;
   private short AV74Num_hdrs ;
   private short AV76Num_hdrsH ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV90Formulaciontinte_eliminaciondeformulastinte_2ds_1_tfnum_hdrsh ;
   private short AV91Formulaciontinte_eliminaciondeformulastinte_2ds_2_tfnum_hdrsh_sel ;
   private short AV84Porcentaje ;
   private short AV85i ;
   private int wcpOAV63CliCod ;
   private int wcpOAV64CliCod_to ;
   private int wcpOAV69Forcolnum ;
   private int wcpOAV70Forcolnum_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_56 ;
   private int AV63CliCod ;
   private int AV64CliCod_to ;
   private int AV69Forcolnum ;
   private int AV70Forcolnum_to ;
   private int nGXsfl_56_idx=1 ;
   private int AV82CantidadRegistrosAProcesar ;
   private int A486ForNumCol ;
   private int AV83CantidadRegistrosProcesados ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavCantidadregistrosaprocesar_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int subGrid_Islastpage ;
   private int edtavNum_hdrs_Enabled ;
   private int edtavNum_hdrsh_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtForSer_Visible ;
   private int edtForSerDsc_Visible ;
   private int edtForColNom_Visible ;
   private int edtForColNum_Visible ;
   private int edtTipColCod_Visible ;
   private int edtForUltUti_Visible ;
   private int edtavNum_hdrs_Visible ;
   private int edtavNum_hdrsh_Visible ;
   private int AV59PageToGo ;
   private int GXv_int9[] ;
   private int GXv_int10[] ;
   private int GXt_int8 ;
   private int GXv_int12[] ;
   private int nGXsfl_56_fel_idx=1 ;
   private int AV93GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV60GridCurrentPage ;
   private long AV61GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV62EmprCod ;
   private String wcpOAV65Forser ;
   private String wcpOAV66Forser_to ;
   private String wcpOAV67Forcolnom ;
   private String wcpOAV68Forcolnom_to ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Dvelop_confirmpanel_btneliminar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV62EmprCod ;
   private String AV65Forser ;
   private String AV66Forser_to ;
   private String AV67Forcolnom ;
   private String AV68Forcolnom_to ;
   private String sGXsfl_56_idx="0001" ;
   private String AV88Pgmname ;
   private String AV79Station ;
   private String AV80usurcod ;
   private String A396EmprCod ;
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
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Dvelop_confirmpanel_btneliminar_Title ;
   private String Dvelop_confirmpanel_btneliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_btneliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btneliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btneliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btneliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btneliminar_Confirmtype ;
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
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divUnnamedtablecantidadregistrosaprocesar_Internalname ;
   private String lblTextblockcantidadregistrosaprocesar_Internalname ;
   private String lblTextblockcantidadregistrosaprocesar_Jsonclick ;
   private String edtavCantidadregistrosaprocesar_Internalname ;
   private String edtavCantidadregistrosaprocesar_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtneliminar_Internalname ;
   private String bttBtneliminar_Jsonclick ;
   private String Barradeprogreso_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
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
   private String edtavNum_hdrs_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A494ForSer ;
   private String edtForSer_Internalname ;
   private String A5742ForSerDsc ;
   private String edtForSerDsc_Internalname ;
   private String A482ForColNom ;
   private String edtForColNom_Internalname ;
   private String edtForColNum_Internalname ;
   private String edtTipColCod_Internalname ;
   private String edtForUltUti_Internalname ;
   private String A2749ForPro ;
   private String edtavNum_hdrsh_Internalname ;
   private String scmdbuf ;
   private String hsh ;
   private String AV89Emprnom ;
   private String GXv_char2[] ;
   private String sGXsfl_56_fel_idx="0001" ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_btneliminar_Internalname ;
   private String Dvelop_confirmpanel_btneliminar_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV62EmprCod ;
   private String sCtrlAV63CliCod ;
   private String sCtrlAV64CliCod_to ;
   private String sCtrlAV65Forser ;
   private String sCtrlAV66Forser_to ;
   private String sCtrlAV67Forcolnom ;
   private String sCtrlAV68Forcolnom_to ;
   private String sCtrlAV69Forcolnum ;
   private String sCtrlAV70Forcolnum_to ;
   private String sCtrlAV71TipColCod ;
   private String sCtrlAV72TipColCod_to ;
   private String sCtrlAV73ForUltUti ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtForSer_Jsonclick ;
   private String edtForSerDsc_Jsonclick ;
   private String edtForColNom_Jsonclick ;
   private String edtForColNum_Jsonclick ;
   private String edtTipColCod_Jsonclick ;
   private String edtForUltUti_Jsonclick ;
   private String GXCCtl ;
   private String edtavNum_hdrs_Jsonclick ;
   private String edtavNum_hdrsh_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV73ForUltUti ;
   private java.util.Date AV73ForUltUti ;
   private java.util.Date A496ForUltUti ;
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
   private boolean n5742ForSerDsc ;
   private boolean n496ForUltUti ;
   private boolean n2749ForPro ;
   private boolean bGXsfl_56_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV18ColumnsSelectorXML ;
   private String AV19UserCustomValue ;
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
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btneliminar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV81ProgressIndicator ;
   private ICheckbox chkForPro ;
   private IDataStoreProvider pr_default ;
   private int[] H01Y72_A486ForNumCol ;
   private String[] H01Y72_A396EmprCod ;
   private String[] H01Y72_A2749ForPro ;
   private boolean[] H01Y72_n2749ForPro ;
   private java.util.Date[] H01Y72_A496ForUltUti ;
   private boolean[] H01Y72_n496ForUltUti ;
   private byte[] H01Y72_A831TipColCod ;
   private int[] H01Y72_A483ForColNum ;
   private String[] H01Y72_A482ForColNom ;
   private String[] H01Y72_A5742ForSerDsc ;
   private boolean[] H01Y72_n5742ForSerDsc ;
   private String[] H01Y72_A494ForSer ;
   private String[] H01Y72_A279CliNom ;
   private int[] H01Y72_A252CliCod ;
   private long[] H01Y73_AGRID_nRecordCount ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector13[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector14[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV58DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState15[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class eliminaciondeformulastinte_2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01Y72( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV63CliCod ,
                                          int AV64CliCod_to ,
                                          String AV65Forser ,
                                          String AV66Forser_to ,
                                          String AV67Forcolnom ,
                                          String AV68Forcolnom_to ,
                                          int AV69Forcolnum ,
                                          int AV70Forcolnum_to ,
                                          byte AV71TipColCod ,
                                          byte AV72TipColCod_to ,
                                          int A252CliCod ,
                                          String A494ForSer ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          java.util.Date A496ForUltUti ,
                                          java.util.Date AV73ForUltUti ,
                                          String A2749ForPro ,
                                          String AV62EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[17];
      Object[] GXv_Object17 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.ForNumCol, T1.EmprCod, T1.ForPro, T1.ForUltUti, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T2.CliNom, T1.CliCod" ;
      sFromString = " FROM (TXPCFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ForUltUti <= ?)");
      addWhere(sWhereString, "(Not (T1.ForUltUti = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.ForPro <> 'S')");
      if ( ! (0==AV63CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int16[2] = (byte)(1) ;
      }
      if ( ! (0==AV64CliCod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int16[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Forser)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int16[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Forser_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Forcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int16[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Forcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int16[7] = (byte)(1) ;
      }
      if ( ! (0==AV69Forcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int16[8] = (byte)(1) ;
      }
      if ( ! (0==AV70Forcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int16[9] = (byte)(1) ;
      }
      if ( ! (0==AV71TipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
      }
      if ( ! (0==AV72TipColCod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      sOrderString += " ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod" ;
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_H01Y73( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV63CliCod ,
                                          int AV64CliCod_to ,
                                          String AV65Forser ,
                                          String AV66Forser_to ,
                                          String AV67Forcolnom ,
                                          String AV68Forcolnom_to ,
                                          int AV69Forcolnum ,
                                          int AV70Forcolnum_to ,
                                          byte AV71TipColCod ,
                                          byte AV72TipColCod_to ,
                                          int A252CliCod ,
                                          String A494ForSer ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          java.util.Date A496ForUltUti ,
                                          java.util.Date AV73ForUltUti ,
                                          String A2749ForPro ,
                                          String AV62EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[12];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPCFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ForUltUti <= ?)");
      addWhere(sWhereString, "(Not (T1.ForUltUti = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.ForPro <> 'S')");
      if ( ! (0==AV63CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int18[2] = (byte)(1) ;
      }
      if ( ! (0==AV64CliCod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int18[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Forser)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int18[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Forser_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int18[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Forcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int18[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Forcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int18[7] = (byte)(1) ;
      }
      if ( ! (0==AV69Forcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int18[8] = (byte)(1) ;
      }
      if ( ! (0==AV70Forcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int18[9] = (byte)(1) ;
      }
      if ( ! (0==AV71TipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int18[10] = (byte)(1) ;
      }
      if ( ! (0==AV72TipColCod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int18[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
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
                  return conditional_H01Y72(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] );
            case 1 :
                  return conditional_H01Y73(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01Y72", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01Y73", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 13);
               ((String[]) buf[9])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 16);
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((int[]) buf[13])[0] = rslt.getInt(11);
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
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
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
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               return;
      }
   }

}

