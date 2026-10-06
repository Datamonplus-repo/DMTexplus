package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class eliminaciondeformulastinteprovisionales_2_impl extends GXWebComponent
{
   public eliminaciondeformulastinteprovisionales_2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public eliminaciondeformulastinteprovisionales_2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( eliminaciondeformulastinteprovisionales_2_impl.class ));
   }

   public eliminaciondeformulastinteprovisionales_2_impl( int remoteHandle ,
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
      chkavEliminaciondeformulastinte_sdts__forpro = UIFactory.getCheckbox(this);
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
               AV16Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16Emprcod", AV16Emprcod);
               AV8Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Clicod), 6, 0));
               AV9Clicod_to = (int)(GXutil.lval( httpContext.GetPar( "Clicod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Clicod_to), 6, 0));
               AV24Forser = httpContext.GetPar( "Forser") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Forser", AV24Forser);
               AV25Forser_to = httpContext.GetPar( "Forser_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Forser_to", AV25Forser_to);
               AV20Forcolnom = httpContext.GetPar( "Forcolnom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Forcolnom", AV20Forcolnom);
               AV21Forcolnom_to = httpContext.GetPar( "Forcolnom_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Forcolnom_to", AV21Forcolnom_to);
               AV22Forcolnum = (int)(GXutil.lval( httpContext.GetPar( "Forcolnum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22Forcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Forcolnum), 6, 0));
               AV23Forcolnum_to = (int)(GXutil.lval( httpContext.GetPar( "Forcolnum_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Forcolnum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Forcolnum_to), 6, 0));
               AV44TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TipColCod), 2, 0));
               AV45TipColCod_to = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TipColCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TipColCod_to), 2, 0));
               AV26ForUltUti = localUtil.parseDateParm( httpContext.GetPar( "ForUltUti")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26ForUltUti", localUtil.format(AV26ForUltUti, "99/99/99"));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV16Emprcod,Integer.valueOf(AV8Clicod),Integer.valueOf(AV9Clicod_to),AV24Forser,AV25Forser_to,AV20Forcolnom,AV21Forcolnom_to,Integer.valueOf(AV22Forcolnum),Integer.valueOf(AV23Forcolnum_to),Byte.valueOf(AV44TipColCod),Byte.valueOf(AV45TipColCod_to),AV26ForUltUti});
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
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV10ColumnsSelector);
      AV73Pgmname = httpContext.GetPar( "Pgmname") ;
      AV16Emprcod = httpContext.GetPar( "Emprcod") ;
      AV8Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
      AV9Clicod_to = (int)(GXutil.lval( httpContext.GetPar( "Clicod_to"))) ;
      AV24Forser = httpContext.GetPar( "Forser") ;
      AV25Forser_to = httpContext.GetPar( "Forser_to") ;
      AV20Forcolnom = httpContext.GetPar( "Forcolnom") ;
      AV21Forcolnom_to = httpContext.GetPar( "Forcolnom_to") ;
      AV22Forcolnum = (int)(GXutil.lval( httpContext.GetPar( "Forcolnum"))) ;
      AV23Forcolnum_to = (int)(GXutil.lval( httpContext.GetPar( "Forcolnum_to"))) ;
      AV44TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
      AV45TipColCod_to = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod_to"))) ;
      AV26ForUltUti = localUtil.parseDateParm( httpContext.GetPar( "ForUltUti")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV15EliminaciondeFormulasTinte_SDTs);
      AV5Station = httpContext.GetPar( "Station") ;
      AV6usurcod = httpContext.GetPar( "usurcod") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV10ColumnsSelector, AV73Pgmname, AV16Emprcod, AV8Clicod, AV9Clicod_to, AV24Forser, AV25Forser_to, AV20Forcolnom, AV21Forcolnom_to, AV22Forcolnum, AV23Forcolnum_to, AV44TipColCod, AV45TipColCod_to, AV26ForUltUti, AV15EliminaciondeFormulasTinte_SDTs, AV5Station, AV6usurcod, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1YC2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Eliminacion de Formulas Tinte", "")) ;
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
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.eliminaciondeformulastinteprovisionales_2", new String[] {GXutil.URLEncode(GXutil.rtrim(AV16Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV8Clicod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9Clicod_to,6,0)),GXutil.URLEncode(GXutil.rtrim(AV24Forser)),GXutil.URLEncode(GXutil.rtrim(AV25Forser_to)),GXutil.URLEncode(GXutil.rtrim(AV20Forcolnom)),GXutil.URLEncode(GXutil.rtrim(AV21Forcolnom_to)),GXutil.URLEncode(GXutil.ltrimstr(AV22Forcolnum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV23Forcolnum_to,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV44TipColCod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV45TipColCod_to,2,0)),GXutil.URLEncode(GXutil.formatDateParm(AV26ForUltUti))}, new String[] {"Emprcod","Clicod","Clicod_to","Forser","Forser_to","Forcolnom","Forcolnom_to","Forcolnum","Forcolnum_to","TipColCod","TipColCod_to","ForUltUti"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vELIMINACIONDEFORMULASTINTE_SDTS", getSecureSignedToken( sPrefix, AV15EliminaciondeFormulasTinte_SDTs));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV5Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV6usurcod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"EliminaciondeFormulasTinteProvisionales_2");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV73Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\eliminaciondeformulastinteprovisionales_2:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Eliminaciondeformulastinte_sdts", AV15EliminaciondeFormulasTinte_SDTs);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Eliminaciondeformulastinte_sdts", AV15EliminaciondeFormulasTinte_SDTs);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_Eliminaciondeformulastinte_sdts", getSecureSignedToken( sPrefix, AV15EliminaciondeFormulasTinte_SDTs));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_51", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_51, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV56GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV57GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV13DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV13DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV10ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV10ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV16Emprcod", GXutil.rtrim( wcpOAV16Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8Clicod", GXutil.ltrim( localUtil.ntoc( wcpOAV8Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9Clicod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV9Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV24Forser", GXutil.rtrim( wcpOAV24Forser));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV25Forser_to", GXutil.rtrim( wcpOAV25Forser_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV20Forcolnom", GXutil.rtrim( wcpOAV20Forcolnom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV21Forcolnom_to", GXutil.rtrim( wcpOAV21Forcolnom_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV22Forcolnum", GXutil.ltrim( localUtil.ntoc( wcpOAV22Forcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV23Forcolnum_to", GXutil.ltrim( localUtil.ntoc( wcpOAV23Forcolnum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV44TipColCod", GXutil.ltrim( localUtil.ntoc( wcpOAV44TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV45TipColCod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV45TipColCod_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV26ForUltUti", localUtil.dtoc( wcpOAV26ForUltUti, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV16Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV8Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV9Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORSER", GXutil.rtrim( AV24Forser));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORSER_TO", GXutil.rtrim( AV25Forser_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNOM", GXutil.rtrim( AV20Forcolnom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNOM_TO", GXutil.rtrim( AV21Forcolnom_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV22Forcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV23Forcolnum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV44TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPCOLCOD_TO", GXutil.ltrim( localUtil.ntoc( AV45TipColCod_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORULTUTI", localUtil.dtoc( AV26ForUltUti, 0, "/"));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vELIMINACIONDEFORMULASTINTE_SDTS", AV15EliminaciondeFormulasTinte_SDTs);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vELIMINACIONDEFORMULASTINTE_SDTS", AV15EliminaciondeFormulasTinte_SDTs);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vELIMINACIONDEFORMULASTINTE_SDTS", getSecureSignedToken( sPrefix, AV15EliminaciondeFormulasTinte_SDTs));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCANTIDADREGISTROSPROCESADOS", GXutil.ltrim( localUtil.ntoc( AV54CantidadRegistrosProcesados, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV5Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV5Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV6usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV6usurcod, "@!"))));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btneliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btneliminar_Result));
   }

   public void renderHtmlCloseForm1YC2( )
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
      return "FormulacionTinte.EliminaciondeFormulasTinteProvisionales_2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Eliminacion de Formulas Tinte", "") ;
   }

   public void wb1YC0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.formulaciontinte.eliminaciondeformulastinteprovisionales_2");
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
            httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 51, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\EliminaciondeFormulasTinteProvisionales_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 51, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\EliminaciondeFormulasTinteProvisionales_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 51, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\EliminaciondeFormulasTinteProvisionales_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 51, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\EliminaciondeFormulasTinteProvisionales_2.htm");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcantidadregistrosaprocesar_Internalname, httpContext.getMessage( "Formulas a Eliminar", ""), "", "", lblTextblockcantidadregistrosaprocesar_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\EliminaciondeFormulasTinteProvisionales_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCantidadregistrosaprocesar_Internalname, httpContext.getMessage( "Cantidad Registros AProcesar", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'" + sPrefix + "',false,'" + sGXsfl_51_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCantidadregistrosaprocesar_Internalname, GXutil.ltrim( localUtil.ntoc( AV7CantidadRegistrosAProcesar, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCantidadregistrosaprocesar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV7CantidadRegistrosAProcesar), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV7CantidadRegistrosAProcesar), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCantidadregistrosaprocesar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCantidadregistrosaprocesar_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\EliminaciondeFormulasTinteProvisionales_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 51, 2, 0)+","+"null"+");", httpContext.getMessage( "Eliminar", ""), bttBtneliminar_Jsonclick, 7, httpContext.getMessage( "Eliminar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111yc1_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\EliminaciondeFormulasTinteProvisionales_2.htm");
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
            AV60GXV1 = nGXsfl_51_idx ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV56GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV57GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV73Pgmname), GXutil.rtrim( localUtil.format( AV73Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\EliminaciondeFormulasTinteProvisionales_2.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV13DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, sPrefix+"INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV13DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV10ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table1_77_1YC2( true) ;
      }
      else
      {
         wb_table1_77_1YC2( false) ;
      }
      return  ;
   }

   public void wb_table1_77_1YC2e( boolean wbgen )
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
               AV60GXV1 = nGXsfl_51_idx ;
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

   public void start1YC2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Eliminacion de Formulas Tinte", ""), (short)(0)) ;
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
            strup1YC0( ) ;
         }
      }
   }

   public void ws1YC2( )
   {
      start1YC2( ) ;
      evt1YC2( ) ;
   }

   public void evt1YC2( )
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
                              strup1YC0( ) ;
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
                              strup1YC0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121YC2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YC0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131YC2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YC0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141YC2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNELIMINAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YC0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151YC2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YC0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e161YC2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YC0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportReport' */
                                 e171YC2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YC0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e181YC2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YC0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavCantidadregistrosaprocesar_Internalname ;
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
                              strup1YC0( ) ;
                           }
                           nGXsfl_51_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_512( ) ;
                           AV60GXV1 = (int)(nGXsfl_51_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV15EliminaciondeFormulasTinte_SDTs.size() >= AV60GXV1 ) && ( AV60GXV1 > 0 ) )
                           {
                              AV15EliminaciondeFormulasTinte_SDTs.currentItem( ((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)) );
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
                                       GX_FocusControl = edtavCantidadregistrosaprocesar_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e191YC2 ();
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
                                       GX_FocusControl = edtavCantidadregistrosaprocesar_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e201YC2 ();
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
                                       GX_FocusControl = edtavCantidadregistrosaprocesar_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e211YC2 ();
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
                                    strup1YC0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavCantidadregistrosaprocesar_Internalname ;
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

   public void we1YC2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1YC2( ) ;
         }
      }
   }

   public void pa1YC2( )
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
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV10ColumnsSelector ,
                                 String AV73Pgmname ,
                                 String AV16Emprcod ,
                                 int AV8Clicod ,
                                 int AV9Clicod_to ,
                                 String AV24Forser ,
                                 String AV25Forser_to ,
                                 String AV20Forcolnom ,
                                 String AV21Forcolnom_to ,
                                 int AV22Forcolnum ,
                                 int AV23Forcolnum_to ,
                                 byte AV44TipColCod ,
                                 byte AV45TipColCod_to ,
                                 java.util.Date AV26ForUltUti ,
                                 GXBaseCollection<app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT> AV15EliminaciondeFormulasTinte_SDTs ,
                                 String AV5Station ,
                                 String AV6usurcod ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e201YC2 ();
      GRID_nCurrentRecord = 0 ;
      rf1YC2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"EliminaciondeFormulasTinteProvisionales_2");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV73Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\eliminaciondeformulastinteprovisionales_2:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf1YC2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV73Pgmname = "FormulacionTinte.EliminaciondeFormulasTinteProvisionales_2" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73Pgmname", AV73Pgmname);
      Gx_err = (short)(0) ;
      edtavCantidadregistrosaprocesar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantidadregistrosaprocesar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantidadregistrosaprocesar_Enabled), 5, 0), true);
      edtavEliminaciondeformulastinte_sdts__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__clicod_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavEliminaciondeformulastinte_sdts__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__clinom_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavEliminaciondeformulastinte_sdts__forser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__forser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__forser_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavEliminaciondeformulastinte_sdts__forserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__forserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__forserdsc_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavEliminaciondeformulastinte_sdts__forcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__forcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__forcolnom_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavEliminaciondeformulastinte_sdts__forcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__forcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__forcolnum_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavEliminaciondeformulastinte_sdts__tipcolcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__tipcolcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__tipcolcod_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavEliminaciondeformulastinte_sdts__fornumcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__fornumcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__fornumcol_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavEliminaciondeformulastinte_sdts__forultuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__forultuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__forultuti_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      chkavEliminaciondeformulastinte_sdts__forpro.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavEliminaciondeformulastinte_sdts__forpro.getInternalname(), "Enabled", GXutil.ltrimstr( chkavEliminaciondeformulastinte_sdts__forpro.getEnabled(), 5, 0), !bGXsfl_51_Refreshing);
      edtavEliminaciondeformulastinte_sdts__numhdrsprod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__numhdrsprod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__numhdrsprod_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavEliminaciondeformulastinte_sdts__numhdrshist_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__numhdrshist_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__numhdrshist_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1YC2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(51) ;
      /* Execute user event: Refresh */
      e201YC2 ();
      nGXsfl_51_idx = 1 ;
      sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_512( ) ;
      bGXsfl_51_Refreshing = true ;
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
         subsflControlProps_512( ) ;
         e211YC2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_51_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e211YC2 ();
         }
         wbEnd = (short)(51) ;
         wb1YC0( ) ;
      }
      bGXsfl_51_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1YC2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vELIMINACIONDEFORMULASTINTE_SDTS", AV15EliminaciondeFormulasTinte_SDTs);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vELIMINACIONDEFORMULASTINTE_SDTS", AV15EliminaciondeFormulasTinte_SDTs);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vELIMINACIONDEFORMULASTINTE_SDTS", getSecureSignedToken( sPrefix, AV15EliminaciondeFormulasTinte_SDTs));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV5Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV5Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV6usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV6usurcod, "@!"))));
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
      return AV15EliminaciondeFormulasTinte_SDTs.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV10ColumnsSelector, AV73Pgmname, AV16Emprcod, AV8Clicod, AV9Clicod_to, AV24Forser, AV25Forser_to, AV20Forcolnom, AV21Forcolnom_to, AV22Forcolnum, AV23Forcolnum_to, AV44TipColCod, AV45TipColCod_to, AV26ForUltUti, AV15EliminaciondeFormulasTinte_SDTs, AV5Station, AV6usurcod, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV10ColumnsSelector, AV73Pgmname, AV16Emprcod, AV8Clicod, AV9Clicod_to, AV24Forser, AV25Forser_to, AV20Forcolnom, AV21Forcolnom_to, AV22Forcolnum, AV23Forcolnum_to, AV44TipColCod, AV45TipColCod_to, AV26ForUltUti, AV15EliminaciondeFormulasTinte_SDTs, AV5Station, AV6usurcod, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV10ColumnsSelector, AV73Pgmname, AV16Emprcod, AV8Clicod, AV9Clicod_to, AV24Forser, AV25Forser_to, AV20Forcolnom, AV21Forcolnom_to, AV22Forcolnum, AV23Forcolnum_to, AV44TipColCod, AV45TipColCod_to, AV26ForUltUti, AV15EliminaciondeFormulasTinte_SDTs, AV5Station, AV6usurcod, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV10ColumnsSelector, AV73Pgmname, AV16Emprcod, AV8Clicod, AV9Clicod_to, AV24Forser, AV25Forser_to, AV20Forcolnom, AV21Forcolnom_to, AV22Forcolnum, AV23Forcolnum_to, AV44TipColCod, AV45TipColCod_to, AV26ForUltUti, AV15EliminaciondeFormulasTinte_SDTs, AV5Station, AV6usurcod, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV10ColumnsSelector, AV73Pgmname, AV16Emprcod, AV8Clicod, AV9Clicod_to, AV24Forser, AV25Forser_to, AV20Forcolnom, AV21Forcolnom_to, AV22Forcolnum, AV23Forcolnum_to, AV44TipColCod, AV45TipColCod_to, AV26ForUltUti, AV15EliminaciondeFormulasTinte_SDTs, AV5Station, AV6usurcod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV73Pgmname = "FormulacionTinte.EliminaciondeFormulasTinteProvisionales_2" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73Pgmname", AV73Pgmname);
      Gx_err = (short)(0) ;
      edtavCantidadregistrosaprocesar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantidadregistrosaprocesar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantidadregistrosaprocesar_Enabled), 5, 0), true);
      edtavEliminaciondeformulastinte_sdts__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__clicod_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavEliminaciondeformulastinte_sdts__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__clinom_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavEliminaciondeformulastinte_sdts__forser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__forser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__forser_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavEliminaciondeformulastinte_sdts__forserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__forserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__forserdsc_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavEliminaciondeformulastinte_sdts__forcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__forcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__forcolnom_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavEliminaciondeformulastinte_sdts__forcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__forcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__forcolnum_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavEliminaciondeformulastinte_sdts__tipcolcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__tipcolcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__tipcolcod_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavEliminaciondeformulastinte_sdts__fornumcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__fornumcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__fornumcol_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavEliminaciondeformulastinte_sdts__forultuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__forultuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__forultuti_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      chkavEliminaciondeformulastinte_sdts__forpro.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavEliminaciondeformulastinte_sdts__forpro.getInternalname(), "Enabled", GXutil.ltrimstr( chkavEliminaciondeformulastinte_sdts__forpro.getEnabled(), 5, 0), !bGXsfl_51_Refreshing);
      edtavEliminaciondeformulastinte_sdts__numhdrsprod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__numhdrsprod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__numhdrsprod_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavEliminaciondeformulastinte_sdts__numhdrshist_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__numhdrshist_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__numhdrshist_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1YC0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e191YC2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Eliminaciondeformulastinte_sdts"), AV15EliminaciondeFormulasTinte_SDTs);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV13DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV10ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vELIMINACIONDEFORMULASTINTE_SDTS"), AV15EliminaciondeFormulasTinte_SDTs);
         /* Read saved values. */
         nRC_GXsfl_51 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_51"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV56GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV57GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV16Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV16Emprcod") ;
         wcpOAV8Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV9Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9Clicod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV24Forser = httpContext.cgiGet( sPrefix+"wcpOAV24Forser") ;
         wcpOAV25Forser_to = httpContext.cgiGet( sPrefix+"wcpOAV25Forser_to") ;
         wcpOAV20Forcolnom = httpContext.cgiGet( sPrefix+"wcpOAV20Forcolnom") ;
         wcpOAV21Forcolnom_to = httpContext.cgiGet( sPrefix+"wcpOAV21Forcolnom_to") ;
         wcpOAV22Forcolnum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV22Forcolnum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV23Forcolnum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV23Forcolnum_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV44TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV44TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV45TipColCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV45TipColCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV26ForUltUti = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV26ForUltUti"), 0) ;
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
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Dvelop_confirmpanel_btneliminar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINAR_Result") ;
         nRC_GXsfl_51 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_51"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_51_fel_idx = 0 ;
         while ( nGXsfl_51_fel_idx < nRC_GXsfl_51 )
         {
            nGXsfl_51_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_51_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_51_fel_idx+1) ;
            sGXsfl_51_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_512( ) ;
            AV60GXV1 = (int)(nGXsfl_51_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV15EliminaciondeFormulasTinte_SDTs.size() >= AV60GXV1 ) && ( AV60GXV1 > 0 ) )
            {
               AV15EliminaciondeFormulasTinte_SDTs.currentItem( ((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)) );
            }
         }
         if ( nGXsfl_51_fel_idx == 0 )
         {
            nGXsfl_51_idx = 1 ;
            sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_512( ) ;
         }
         nGXsfl_51_fel_idx = 1 ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCantidadregistrosaprocesar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCantidadregistrosaprocesar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANTIDADREGISTROSAPROCESAR");
            GX_FocusControl = edtavCantidadregistrosaprocesar_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7CantidadRegistrosAProcesar = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7CantidadRegistrosAProcesar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CantidadRegistrosAProcesar), 6, 0));
         }
         else
         {
            AV7CantidadRegistrosAProcesar = (int)(localUtil.ctol( httpContext.cgiGet( edtavCantidadregistrosaprocesar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7CantidadRegistrosAProcesar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CantidadRegistrosAProcesar), 6, 0));
         }
         AV73Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73Pgmname", AV73Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"EliminaciondeFormulasTinteProvisionales_2");
         AV73Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73Pgmname", AV73Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV73Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("formulaciontinte\\eliminaciondeformulastinteprovisionales_2:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e191YC2 ();
      if (returnInSub) return;
   }

   public void e191YC2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_objcol_SdtEliminaciondeFormulasTinte_SDT1 = AV15EliminaciondeFormulasTinte_SDTs ;
      GXv_objcol_SdtEliminaciondeFormulasTinte_SDT2[0] = GXt_objcol_SdtEliminaciondeFormulasTinte_SDT1 ;
      new app.formulaciontinte.eliminaciondeformulastinteprovisionales_dp(remoteHandle, context).execute( AV16Emprcod, AV8Clicod, AV9Clicod_to, AV24Forser, AV25Forser_to, AV20Forcolnom, AV21Forcolnom_to, AV22Forcolnum, AV23Forcolnum_to, AV44TipColCod, AV45TipColCod_to, AV26ForUltUti, GXv_objcol_SdtEliminaciondeFormulasTinte_SDT2) ;
      GXt_objcol_SdtEliminaciondeFormulasTinte_SDT1 = GXv_objcol_SdtEliminaciondeFormulasTinte_SDT2[0] ;
      AV15EliminaciondeFormulasTinte_SDTs = GXt_objcol_SdtEliminaciondeFormulasTinte_SDT1 ;
      gx_BV51 = true ;
      AV7CantidadRegistrosAProcesar = AV15EliminaciondeFormulasTinte_SDTs.size() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7CantidadRegistrosAProcesar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CantidadRegistrosAProcesar), 6, 0));
      GXt_char3 = AV5Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      eliminaciondeformulastinteprovisionales_2_impl.this.GXt_char3 = GXv_char4[0] ;
      AV5Station = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Station", AV5Station);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV5Station, ""))));
      GXv_char4[0] = AV16Emprcod ;
      GXv_char5[0] = AV74Emprnom ;
      GXv_char6[0] = AV6usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV5Station, GXv_char4, GXv_char5, GXv_char6) ;
      eliminaciondeformulastinteprovisionales_2_impl.this.AV16Emprcod = GXv_char4[0] ;
      eliminaciondeformulastinteprovisionales_2_impl.this.AV74Emprnom = GXv_char5[0] ;
      eliminaciondeformulastinteprovisionales_2_impl.this.AV6usurcod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16Emprcod", AV16Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6usurcod", AV6usurcod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV6usurcod, "@!"))));
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV13DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV13DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e201YC2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV49WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV49WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV43Session.getValue("FormulacionTinte.EliminaciondeFormulasTinteProvisionales_2ColumnsSelector"), "") != 0 )
      {
         AV12ColumnsSelectorXML = AV43Session.getValue("FormulacionTinte.EliminaciondeFormulasTinteProvisionales_2ColumnsSelector") ;
         AV10ColumnsSelector.fromxml(AV12ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S132 ();
         if (returnInSub) return;
      }
      edtavEliminaciondeformulastinte_sdts__clicod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__clicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__clicod_Visible), 5, 0), !bGXsfl_51_Refreshing);
      edtavEliminaciondeformulastinte_sdts__clinom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__clinom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__clinom_Visible), 5, 0), !bGXsfl_51_Refreshing);
      edtavEliminaciondeformulastinte_sdts__forser_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__forser_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__forser_Visible), 5, 0), !bGXsfl_51_Refreshing);
      edtavEliminaciondeformulastinte_sdts__forserdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__forserdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__forserdsc_Visible), 5, 0), !bGXsfl_51_Refreshing);
      edtavEliminaciondeformulastinte_sdts__forcolnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__forcolnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__forcolnom_Visible), 5, 0), !bGXsfl_51_Refreshing);
      edtavEliminaciondeformulastinte_sdts__forcolnum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__forcolnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__forcolnum_Visible), 5, 0), !bGXsfl_51_Refreshing);
      edtavEliminaciondeformulastinte_sdts__tipcolcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__tipcolcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__tipcolcod_Visible), 5, 0), !bGXsfl_51_Refreshing);
      edtavEliminaciondeformulastinte_sdts__fornumcol_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__fornumcol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__fornumcol_Visible), 5, 0), !bGXsfl_51_Refreshing);
      edtavEliminaciondeformulastinte_sdts__forultuti_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminaciondeformulastinte_sdts__forultuti_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminaciondeformulastinte_sdts__forultuti_Visible), 5, 0), !bGXsfl_51_Refreshing);
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S142 ();
      if (returnInSub) return;
      AV56GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GridCurrentPage), 10, 0));
      AV57GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57GridPageCount), 10, 0));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10ColumnsSelector", AV10ColumnsSelector);
   }

   public void e121YC2( )
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
         AV55PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV55PageToGo) ;
      }
   }

   public void e131YC2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e211YC2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV60GXV1 = 1 ;
      while ( AV60GXV1 <= AV15EliminaciondeFormulasTinte_SDTs.size() )
      {
         AV15EliminaciondeFormulasTinte_SDTs.currentItem( ((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(51) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_512( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_51_Refreshing )
         {
            httpContext.doAjaxLoad(51, GridRow);
         }
         AV60GXV1 = (int)(AV60GXV1+1) ;
      }
   }

   public void e141YC2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV12ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV10ColumnsSelector.fromJSonString(AV12ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.EliminaciondeFormulasTinteProvisionales_2ColumnsSelector", ((GXutil.strcmp("", AV12ColumnsSelectorXML)==0) ? "" : AV10ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10ColumnsSelector", AV10ColumnsSelector);
   }

   public void e151YC2( )
   {
      AV60GXV1 = (int)(nGXsfl_51_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV60GXV1 > 0 ) && ( AV15EliminaciondeFormulasTinte_SDTs.size() >= AV60GXV1 ) )
      {
         AV15EliminaciondeFormulasTinte_SDTs.currentItem( ((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)) );
      }
      /* Dvelop_confirmpanel_btneliminar_Close Routine */
      returnInSub = false ;
      if ( AV7CantidadRegistrosAProcesar == 0 )
      {
         AV7CantidadRegistrosAProcesar = 1 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7CantidadRegistrosAProcesar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CantidadRegistrosAProcesar), 6, 0));
      }
      if ( GXutil.strcmp(Dvelop_confirmpanel_btneliminar_Result, "Yes") == 0 )
      {
         AV37ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
         AV37ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
         AV37ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
         AV37ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
         AV37ProgressIndicator.show();
         AV75GXV14 = 1 ;
         while ( AV75GXV14 <= AV15EliminaciondeFormulasTinte_SDTs.size() )
         {
            AV14EliminaciondeFormulasTinte_SDT = (app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV75GXV14));
            AV38sdt_Clicod = AV14EliminaciondeFormulasTinte_SDT.getgxTv_SdtEliminaciondeFormulasTinte_SDT_Clicod() ;
            AV41sdt_Forser = AV14EliminaciondeFormulasTinte_SDT.getgxTv_SdtEliminaciondeFormulasTinte_SDT_Forser() ;
            AV39sdt_Forcolnom = AV14EliminaciondeFormulasTinte_SDT.getgxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnom() ;
            AV40sdt_Forcolnum = AV14EliminaciondeFormulasTinte_SDT.getgxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnum() ;
            AV42sdt_TipColCod = AV14EliminaciondeFormulasTinte_SDT.getgxTv_SdtEliminaciondeFormulasTinte_SDT_Tipcolcod() ;
            AV50sdt_ForNumCol = AV14EliminaciondeFormulasTinte_SDT.getgxTv_SdtEliminaciondeFormulasTinte_SDT_Fornumcol() ;
            AV53Porcentaje = (short)((AV54CantidadRegistrosProcesados/ (double) (AV7CantidadRegistrosAProcesar))*100) ;
            AV37ProgressIndicator.setgxTv_SdtProgress_Value( AV53Porcentaje );
            AV37ProgressIndicator.showwithtitle(httpContext.getMessage( "Procesando....", ""));
            new app.formulaciontinte.borradodeformulas_3(remoteHandle, context).execute( AV16Emprcod, AV38sdt_Clicod, AV41sdt_Forser, AV39sdt_Forcolnom, AV40sdt_Forcolnum, AV42sdt_TipColCod, AV50sdt_ForNumCol, AV5Station, AV6usurcod) ;
            new app.formulaciontinte.eliminaciondeformulastinte_3(remoteHandle, context).execute( AV16Emprcod, AV38sdt_Clicod, AV41sdt_Forser, AV39sdt_Forcolnom, AV40sdt_Forcolnum, AV42sdt_TipColCod, AV50sdt_ForNumCol, AV5Station, AV6usurcod, httpContext.getMessage( "S", "")) ;
            AV54CantidadRegistrosProcesados = (int)(AV54CantidadRegistrosProcesados+1) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54CantidadRegistrosProcesados", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54CantidadRegistrosProcesados), 6, 0));
            AV75GXV14 = (int)(AV75GXV14+1) ;
         }
         AV37ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
         AV37ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
         AV30i = GXutil.sleep( 1) ;
         AV37ProgressIndicator.hide();
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV37ProgressIndicator", AV37ProgressIndicator);
   }

   public void e161YC2( )
   {
      AV60GXV1 = (int)(nGXsfl_51_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV60GXV1 > 0 ) && ( AV15EliminaciondeFormulasTinte_SDTs.size() >= AV60GXV1 ) )
      {
         AV15EliminaciondeFormulasTinte_SDTs.currentItem( ((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)) );
      }
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV51EliminaciondeFormulasTinte_json = AV15EliminaciondeFormulasTinte_SDTs.toJSonString(false) ;
      AV52WebSession.setValue("&EliminaciondeFormulasTinte_json", AV51EliminaciondeFormulasTinte_json);
      GXv_char6[0] = AV18ExcelFilename ;
      GXv_char5[0] = AV17ErrorMessage ;
      new app.formulaciontinte.eliminaciondeformulastinteprovisionales_2export(remoteHandle, context).execute( GXv_char6, GXv_char5) ;
      eliminaciondeformulastinteprovisionales_2_impl.this.AV18ExcelFilename = GXv_char6[0] ;
      eliminaciondeformulastinteprovisionales_2_impl.this.AV17ErrorMessage = GXv_char5[0] ;
      if ( GXutil.strcmp(AV18ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV18ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV17ErrorMessage);
      }
   }

   public void e171YC2( )
   {
      AV60GXV1 = (int)(nGXsfl_51_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV60GXV1 > 0 ) && ( AV15EliminaciondeFormulasTinte_SDTs.size() >= AV60GXV1 ) )
      {
         AV15EliminaciondeFormulasTinte_SDTs.currentItem( ((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)) );
      }
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      AV51EliminaciondeFormulasTinte_json = AV15EliminaciondeFormulasTinte_SDTs.toJSonString(false) ;
      AV52WebSession.setValue("&EliminaciondeFormulasTinte_json", AV51EliminaciondeFormulasTinte_json);
      Innewwindow1_Target = formatLink("app.formulaciontinte.eliminaciondeformulastinteprovisionales_2exportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod(sPrefix, false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
   }

   public void e181YC2( )
   {
      AV60GXV1 = (int)(nGXsfl_51_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV60GXV1 > 0 ) && ( AV15EliminaciondeFormulasTinte_SDTs.size() >= AV60GXV1 ) )
      {
         AV15EliminaciondeFormulasTinte_SDTs.currentItem( ((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)) );
      }
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV51EliminaciondeFormulasTinte_json = AV15EliminaciondeFormulasTinte_SDTs.toJSonString(false) ;
      AV52WebSession.setValue("&EliminaciondeFormulasTinte_json", AV51EliminaciondeFormulasTinte_json);
      callWebObject(formatLink("app.formulaciontinte.eliminaciondeformulastinteprovisionales_2exportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
   }

   public void S132( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV10ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "EliminaciondeFormulasTinte_SDTs__Clicod", "", "Cliente", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "EliminaciondeFormulasTinte_SDTs__CliNom", "", "Nombre", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "EliminaciondeFormulasTinte_SDTs__Forser", "", "Articulo", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "EliminaciondeFormulasTinte_SDTs__Forserdsc", "", "Descripcion", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "EliminaciondeFormulasTinte_SDTs__Forcolnom", "", "Color", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "EliminaciondeFormulasTinte_SDTs__Forcolnum", "", "Numero", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "EliminaciondeFormulasTinte_SDTs__Tipcolcod", "", "TC", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "EliminaciondeFormulasTinte_SDTs__ForNumcol", "", "Nº Form.", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "EliminaciondeFormulasTinte_SDTs__ForUltUti", "", "Fec. Ult. Uti.", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char3 = AV48UserCustomValue ;
      GXv_char6[0] = GXt_char3 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.EliminaciondeFormulasTinteProvisionales_2ColumnsSelector", GXv_char6) ;
      eliminaciondeformulastinteprovisionales_2_impl.this.GXt_char3 = GXv_char6[0] ;
      AV48UserCustomValue = GXt_char3 ;
      if ( ! ( (GXutil.strcmp("", AV48UserCustomValue)==0) ) )
      {
         AV11ColumnsSelectorAux.fromxml(AV48UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV11ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV10ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV11ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV10ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV43Session.getValue(AV73Pgmname+"GridState"), "") == 0 )
      {
         AV27GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV73Pgmname+"GridState"), null, null);
      }
      else
      {
         AV27GridState.fromxml(AV43Session.getValue(AV73Pgmname+"GridState"), null, null);
      }
      if ( ! (GXutil.strcmp("", GXutil.trim( AV27GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV27GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV27GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S122( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV27GridState.fromxml(AV43Session.getValue(AV73Pgmname+"GridState"), null, null);
      AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      if ( ! (GXutil.strcmp("", AV16Emprcod)==0) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV16Emprcod );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      if ( ! (0==AV8Clicod) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV8Clicod, 6, 0) );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      if ( ! (0==AV9Clicod_to) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD_TO" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV9Clicod_to, 6, 0) );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV24Forser)==0) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORSER" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV24Forser );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV25Forser_to)==0) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORSER_TO" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV25Forser_to );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV20Forcolnom)==0) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNOM" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV20Forcolnom );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV21Forcolnom_to)==0) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNOM_TO" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV21Forcolnom_to );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      if ( ! (0==AV22Forcolnum) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNUM" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV22Forcolnum, 6, 0) );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      if ( ! (0==AV23Forcolnum_to) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNUM_TO" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV23Forcolnum_to, 6, 0) );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      if ( ! (0==AV44TipColCod) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPCOLCOD" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV44TipColCod, 2, 0) );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      if ( ! (0==AV45TipColCod_to) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPCOLCOD_TO" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV45TipColCod_to, 2, 0) );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV26ForUltUti)) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORULTUTI" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV26ForUltUti, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      AV27GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV27GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV73Pgmname+"GridState", AV27GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void wb_table1_77_1YC2( boolean wbgen )
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
         wb_table1_77_1YC2e( true) ;
      }
      else
      {
         wb_table1_77_1YC2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV16Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16Emprcod", AV16Emprcod);
      AV8Clicod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Clicod), 6, 0));
      AV9Clicod_to = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Clicod_to), 6, 0));
      AV24Forser = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Forser", AV24Forser);
      AV25Forser_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Forser_to", AV25Forser_to);
      AV20Forcolnom = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Forcolnom", AV20Forcolnom);
      AV21Forcolnom_to = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Forcolnom_to", AV21Forcolnom_to);
      AV22Forcolnum = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22Forcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Forcolnum), 6, 0));
      AV23Forcolnum_to = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Forcolnum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Forcolnum_to), 6, 0));
      AV44TipColCod = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TipColCod), 2, 0));
      AV45TipColCod_to = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TipColCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TipColCod_to), 2, 0));
      AV26ForUltUti = (java.util.Date)getParm(obj,11,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26ForUltUti", localUtil.format(AV26ForUltUti, "99/99/99"));
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
      pa1YC2( ) ;
      ws1YC2( ) ;
      we1YC2( ) ;
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
      sCtrlAV16Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV8Clicod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV9Clicod_to = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV24Forser = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV25Forser_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV20Forcolnom = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV21Forcolnom_to = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV22Forcolnum = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV23Forcolnum_to = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV44TipColCod = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV45TipColCod_to = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV26ForUltUti = (String)getParm(obj,11,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1YC2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "formulaciontinte\\eliminaciondeformulastinteprovisionales_2", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1YC2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV16Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16Emprcod", AV16Emprcod);
         AV8Clicod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Clicod), 6, 0));
         AV9Clicod_to = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Clicod_to), 6, 0));
         AV24Forser = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Forser", AV24Forser);
         AV25Forser_to = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Forser_to", AV25Forser_to);
         AV20Forcolnom = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Forcolnom", AV20Forcolnom);
         AV21Forcolnom_to = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Forcolnom_to", AV21Forcolnom_to);
         AV22Forcolnum = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22Forcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Forcolnum), 6, 0));
         AV23Forcolnum_to = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Forcolnum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Forcolnum_to), 6, 0));
         AV44TipColCod = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TipColCod), 2, 0));
         AV45TipColCod_to = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TipColCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TipColCod_to), 2, 0));
         AV26ForUltUti = (java.util.Date)getParm(obj,13,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26ForUltUti", localUtil.format(AV26ForUltUti, "99/99/99"));
      }
      wcpOAV16Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV16Emprcod") ;
      wcpOAV8Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV9Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9Clicod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV24Forser = httpContext.cgiGet( sPrefix+"wcpOAV24Forser") ;
      wcpOAV25Forser_to = httpContext.cgiGet( sPrefix+"wcpOAV25Forser_to") ;
      wcpOAV20Forcolnom = httpContext.cgiGet( sPrefix+"wcpOAV20Forcolnom") ;
      wcpOAV21Forcolnom_to = httpContext.cgiGet( sPrefix+"wcpOAV21Forcolnom_to") ;
      wcpOAV22Forcolnum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV22Forcolnum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV23Forcolnum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV23Forcolnum_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV44TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV44TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV45TipColCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV45TipColCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV26ForUltUti = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV26ForUltUti"), 0) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV16Emprcod, wcpOAV16Emprcod) != 0 ) || ( AV8Clicod != wcpOAV8Clicod ) || ( AV9Clicod_to != wcpOAV9Clicod_to ) || ( GXutil.strcmp(AV24Forser, wcpOAV24Forser) != 0 ) || ( GXutil.strcmp(AV25Forser_to, wcpOAV25Forser_to) != 0 ) || ( GXutil.strcmp(AV20Forcolnom, wcpOAV20Forcolnom) != 0 ) || ( GXutil.strcmp(AV21Forcolnom_to, wcpOAV21Forcolnom_to) != 0 ) || ( AV22Forcolnum != wcpOAV22Forcolnum ) || ( AV23Forcolnum_to != wcpOAV23Forcolnum_to ) || ( AV44TipColCod != wcpOAV44TipColCod ) || ( AV45TipColCod_to != wcpOAV45TipColCod_to ) || !( GXutil.dateCompare(GXutil.resetTime(AV26ForUltUti), GXutil.resetTime(wcpOAV26ForUltUti)) ) ) )
      {
         setjustcreated();
      }
      wcpOAV16Emprcod = AV16Emprcod ;
      wcpOAV8Clicod = AV8Clicod ;
      wcpOAV9Clicod_to = AV9Clicod_to ;
      wcpOAV24Forser = AV24Forser ;
      wcpOAV25Forser_to = AV25Forser_to ;
      wcpOAV20Forcolnom = AV20Forcolnom ;
      wcpOAV21Forcolnom_to = AV21Forcolnom_to ;
      wcpOAV22Forcolnum = AV22Forcolnum ;
      wcpOAV23Forcolnum_to = AV23Forcolnum_to ;
      wcpOAV44TipColCod = AV44TipColCod ;
      wcpOAV45TipColCod_to = AV45TipColCod_to ;
      wcpOAV26ForUltUti = AV26ForUltUti ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV16Emprcod = httpContext.cgiGet( sPrefix+"AV16Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV16Emprcod) > 0 )
      {
         AV16Emprcod = httpContext.cgiGet( sCtrlAV16Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16Emprcod", AV16Emprcod);
      }
      else
      {
         AV16Emprcod = httpContext.cgiGet( sPrefix+"AV16Emprcod_PARM") ;
      }
      sCtrlAV8Clicod = httpContext.cgiGet( sPrefix+"AV8Clicod_CTRL") ;
      if ( GXutil.len( sCtrlAV8Clicod) > 0 )
      {
         AV8Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV8Clicod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Clicod), 6, 0));
      }
      else
      {
         AV8Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV8Clicod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV9Clicod_to = httpContext.cgiGet( sPrefix+"AV9Clicod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV9Clicod_to) > 0 )
      {
         AV9Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV9Clicod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Clicod_to), 6, 0));
      }
      else
      {
         AV9Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV9Clicod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV24Forser = httpContext.cgiGet( sPrefix+"AV24Forser_CTRL") ;
      if ( GXutil.len( sCtrlAV24Forser) > 0 )
      {
         AV24Forser = httpContext.cgiGet( sCtrlAV24Forser) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Forser", AV24Forser);
      }
      else
      {
         AV24Forser = httpContext.cgiGet( sPrefix+"AV24Forser_PARM") ;
      }
      sCtrlAV25Forser_to = httpContext.cgiGet( sPrefix+"AV25Forser_to_CTRL") ;
      if ( GXutil.len( sCtrlAV25Forser_to) > 0 )
      {
         AV25Forser_to = httpContext.cgiGet( sCtrlAV25Forser_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Forser_to", AV25Forser_to);
      }
      else
      {
         AV25Forser_to = httpContext.cgiGet( sPrefix+"AV25Forser_to_PARM") ;
      }
      sCtrlAV20Forcolnom = httpContext.cgiGet( sPrefix+"AV20Forcolnom_CTRL") ;
      if ( GXutil.len( sCtrlAV20Forcolnom) > 0 )
      {
         AV20Forcolnom = httpContext.cgiGet( sCtrlAV20Forcolnom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Forcolnom", AV20Forcolnom);
      }
      else
      {
         AV20Forcolnom = httpContext.cgiGet( sPrefix+"AV20Forcolnom_PARM") ;
      }
      sCtrlAV21Forcolnom_to = httpContext.cgiGet( sPrefix+"AV21Forcolnom_to_CTRL") ;
      if ( GXutil.len( sCtrlAV21Forcolnom_to) > 0 )
      {
         AV21Forcolnom_to = httpContext.cgiGet( sCtrlAV21Forcolnom_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Forcolnom_to", AV21Forcolnom_to);
      }
      else
      {
         AV21Forcolnom_to = httpContext.cgiGet( sPrefix+"AV21Forcolnom_to_PARM") ;
      }
      sCtrlAV22Forcolnum = httpContext.cgiGet( sPrefix+"AV22Forcolnum_CTRL") ;
      if ( GXutil.len( sCtrlAV22Forcolnum) > 0 )
      {
         AV22Forcolnum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV22Forcolnum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22Forcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Forcolnum), 6, 0));
      }
      else
      {
         AV22Forcolnum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV22Forcolnum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV23Forcolnum_to = httpContext.cgiGet( sPrefix+"AV23Forcolnum_to_CTRL") ;
      if ( GXutil.len( sCtrlAV23Forcolnum_to) > 0 )
      {
         AV23Forcolnum_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV23Forcolnum_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Forcolnum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Forcolnum_to), 6, 0));
      }
      else
      {
         AV23Forcolnum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV23Forcolnum_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV44TipColCod = httpContext.cgiGet( sPrefix+"AV44TipColCod_CTRL") ;
      if ( GXutil.len( sCtrlAV44TipColCod) > 0 )
      {
         AV44TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV44TipColCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TipColCod), 2, 0));
      }
      else
      {
         AV44TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV44TipColCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV45TipColCod_to = httpContext.cgiGet( sPrefix+"AV45TipColCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV45TipColCod_to) > 0 )
      {
         AV45TipColCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV45TipColCod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TipColCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TipColCod_to), 2, 0));
      }
      else
      {
         AV45TipColCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV45TipColCod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV26ForUltUti = httpContext.cgiGet( sPrefix+"AV26ForUltUti_CTRL") ;
      if ( GXutil.len( sCtrlAV26ForUltUti) > 0 )
      {
         AV26ForUltUti = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV26ForUltUti), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26ForUltUti", localUtil.format(AV26ForUltUti, "99/99/99"));
      }
      else
      {
         AV26ForUltUti = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV26ForUltUti_PARM"), 0) ;
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
      pa1YC2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1YC2( ) ;
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
      ws1YC2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16Emprcod_PARM", GXutil.rtrim( AV16Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV16Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16Emprcod_CTRL", GXutil.rtrim( sCtrlAV16Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Clicod_PARM", GXutil.ltrim( localUtil.ntoc( AV8Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8Clicod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Clicod_CTRL", GXutil.rtrim( sCtrlAV8Clicod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9Clicod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV9Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9Clicod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9Clicod_to_CTRL", GXutil.rtrim( sCtrlAV9Clicod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24Forser_PARM", GXutil.rtrim( AV24Forser));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV24Forser)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24Forser_CTRL", GXutil.rtrim( sCtrlAV24Forser));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25Forser_to_PARM", GXutil.rtrim( AV25Forser_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV25Forser_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25Forser_to_CTRL", GXutil.rtrim( sCtrlAV25Forser_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20Forcolnom_PARM", GXutil.rtrim( AV20Forcolnom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV20Forcolnom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20Forcolnom_CTRL", GXutil.rtrim( sCtrlAV20Forcolnom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21Forcolnom_to_PARM", GXutil.rtrim( AV21Forcolnom_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV21Forcolnom_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21Forcolnom_to_CTRL", GXutil.rtrim( sCtrlAV21Forcolnom_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22Forcolnum_PARM", GXutil.ltrim( localUtil.ntoc( AV22Forcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV22Forcolnum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22Forcolnum_CTRL", GXutil.rtrim( sCtrlAV22Forcolnum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23Forcolnum_to_PARM", GXutil.ltrim( localUtil.ntoc( AV23Forcolnum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV23Forcolnum_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23Forcolnum_to_CTRL", GXutil.rtrim( sCtrlAV23Forcolnum_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44TipColCod_PARM", GXutil.ltrim( localUtil.ntoc( AV44TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV44TipColCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44TipColCod_CTRL", GXutil.rtrim( sCtrlAV44TipColCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45TipColCod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV45TipColCod_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV45TipColCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45TipColCod_to_CTRL", GXutil.rtrim( sCtrlAV45TipColCod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26ForUltUti_PARM", localUtil.dtoc( AV26ForUltUti, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV26ForUltUti)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26ForUltUti_CTRL", GXutil.rtrim( sCtrlAV26ForUltUti));
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
      we1YC2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115554011", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/eliminaciondeformulastinteprovisionales_2.js", "?202682115554011", false, true);
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
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
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

   public void subsflControlProps_512( )
   {
      edtavEliminaciondeformulastinte_sdts__clicod_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__CLICOD_"+sGXsfl_51_idx ;
      edtavEliminaciondeformulastinte_sdts__clinom_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__CLINOM_"+sGXsfl_51_idx ;
      edtavEliminaciondeformulastinte_sdts__forser_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__FORSER_"+sGXsfl_51_idx ;
      edtavEliminaciondeformulastinte_sdts__forserdsc_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__FORSERDSC_"+sGXsfl_51_idx ;
      edtavEliminaciondeformulastinte_sdts__forcolnom_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__FORCOLNOM_"+sGXsfl_51_idx ;
      edtavEliminaciondeformulastinte_sdts__forcolnum_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__FORCOLNUM_"+sGXsfl_51_idx ;
      edtavEliminaciondeformulastinte_sdts__tipcolcod_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__TIPCOLCOD_"+sGXsfl_51_idx ;
      edtavEliminaciondeformulastinte_sdts__fornumcol_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__FORNUMCOL_"+sGXsfl_51_idx ;
      edtavEliminaciondeformulastinte_sdts__forultuti_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__FORULTUTI_"+sGXsfl_51_idx ;
      chkavEliminaciondeformulastinte_sdts__forpro.setInternalname( sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__FORPRO_"+sGXsfl_51_idx );
      edtavEliminaciondeformulastinte_sdts__numhdrsprod_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__NUMHDRSPROD_"+sGXsfl_51_idx ;
      edtavEliminaciondeformulastinte_sdts__numhdrshist_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__NUMHDRSHIST_"+sGXsfl_51_idx ;
   }

   public void subsflControlProps_fel_512( )
   {
      edtavEliminaciondeformulastinte_sdts__clicod_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__CLICOD_"+sGXsfl_51_fel_idx ;
      edtavEliminaciondeformulastinte_sdts__clinom_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__CLINOM_"+sGXsfl_51_fel_idx ;
      edtavEliminaciondeformulastinte_sdts__forser_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__FORSER_"+sGXsfl_51_fel_idx ;
      edtavEliminaciondeformulastinte_sdts__forserdsc_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__FORSERDSC_"+sGXsfl_51_fel_idx ;
      edtavEliminaciondeformulastinte_sdts__forcolnom_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__FORCOLNOM_"+sGXsfl_51_fel_idx ;
      edtavEliminaciondeformulastinte_sdts__forcolnum_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__FORCOLNUM_"+sGXsfl_51_fel_idx ;
      edtavEliminaciondeformulastinte_sdts__tipcolcod_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__TIPCOLCOD_"+sGXsfl_51_fel_idx ;
      edtavEliminaciondeformulastinte_sdts__fornumcol_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__FORNUMCOL_"+sGXsfl_51_fel_idx ;
      edtavEliminaciondeformulastinte_sdts__forultuti_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__FORULTUTI_"+sGXsfl_51_fel_idx ;
      chkavEliminaciondeformulastinte_sdts__forpro.setInternalname( sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__FORPRO_"+sGXsfl_51_fel_idx );
      edtavEliminaciondeformulastinte_sdts__numhdrsprod_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__NUMHDRSPROD_"+sGXsfl_51_fel_idx ;
      edtavEliminaciondeformulastinte_sdts__numhdrshist_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__NUMHDRSHIST_"+sGXsfl_51_fel_idx ;
   }

   public void sendrow_512( )
   {
      subsflControlProps_512( ) ;
      wb1YC0( ) ;
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_51_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavEliminaciondeformulastinte_sdts__clicod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEliminaciondeformulastinte_sdts__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)).getgxTv_SdtEliminaciondeFormulasTinte_SDT_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavEliminaciondeformulastinte_sdts__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)).getgxTv_SdtEliminaciondeFormulasTinte_SDT_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)).getgxTv_SdtEliminaciondeFormulasTinte_SDT_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEliminaciondeformulastinte_sdts__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavEliminaciondeformulastinte_sdts__clicod_Visible),Integer.valueOf(edtavEliminaciondeformulastinte_sdts__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavEliminaciondeformulastinte_sdts__clinom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEliminaciondeformulastinte_sdts__clinom_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)).getgxTv_SdtEliminaciondeFormulasTinte_SDT_Clinom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEliminaciondeformulastinte_sdts__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavEliminaciondeformulastinte_sdts__clinom_Visible),Integer.valueOf(edtavEliminaciondeformulastinte_sdts__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavEliminaciondeformulastinte_sdts__forser_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEliminaciondeformulastinte_sdts__forser_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)).getgxTv_SdtEliminaciondeFormulasTinte_SDT_Forser()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEliminaciondeformulastinte_sdts__forser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavEliminaciondeformulastinte_sdts__forser_Visible),Integer.valueOf(edtavEliminaciondeformulastinte_sdts__forser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavEliminaciondeformulastinte_sdts__forserdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEliminaciondeformulastinte_sdts__forserdsc_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)).getgxTv_SdtEliminaciondeFormulasTinte_SDT_Forserdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEliminaciondeformulastinte_sdts__forserdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavEliminaciondeformulastinte_sdts__forserdsc_Visible),Integer.valueOf(edtavEliminaciondeformulastinte_sdts__forserdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavEliminaciondeformulastinte_sdts__forcolnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEliminaciondeformulastinte_sdts__forcolnom_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)).getgxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEliminaciondeformulastinte_sdts__forcolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavEliminaciondeformulastinte_sdts__forcolnom_Visible),Integer.valueOf(edtavEliminaciondeformulastinte_sdts__forcolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavEliminaciondeformulastinte_sdts__forcolnum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEliminaciondeformulastinte_sdts__forcolnum_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)).getgxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnum(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavEliminaciondeformulastinte_sdts__forcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)).getgxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnum()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)).getgxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnum()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEliminaciondeformulastinte_sdts__forcolnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavEliminaciondeformulastinte_sdts__forcolnum_Visible),Integer.valueOf(edtavEliminaciondeformulastinte_sdts__forcolnum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavEliminaciondeformulastinte_sdts__tipcolcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEliminaciondeformulastinte_sdts__tipcolcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)).getgxTv_SdtEliminaciondeFormulasTinte_SDT_Tipcolcod(), (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavEliminaciondeformulastinte_sdts__tipcolcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)).getgxTv_SdtEliminaciondeFormulasTinte_SDT_Tipcolcod()), "Z9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)).getgxTv_SdtEliminaciondeFormulasTinte_SDT_Tipcolcod()), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEliminaciondeformulastinte_sdts__tipcolcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavEliminaciondeformulastinte_sdts__tipcolcod_Visible),Integer.valueOf(edtavEliminaciondeformulastinte_sdts__tipcolcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavEliminaciondeformulastinte_sdts__fornumcol_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEliminaciondeformulastinte_sdts__fornumcol_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)).getgxTv_SdtEliminaciondeFormulasTinte_SDT_Fornumcol(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavEliminaciondeformulastinte_sdts__fornumcol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)).getgxTv_SdtEliminaciondeFormulasTinte_SDT_Fornumcol()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)).getgxTv_SdtEliminaciondeFormulasTinte_SDT_Fornumcol()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEliminaciondeformulastinte_sdts__fornumcol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavEliminaciondeformulastinte_sdts__fornumcol_Visible),Integer.valueOf(edtavEliminaciondeformulastinte_sdts__fornumcol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavEliminaciondeformulastinte_sdts__forultuti_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEliminaciondeformulastinte_sdts__forultuti_Internalname,localUtil.format(((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)).getgxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti(), "99/99/99"),localUtil.format( ((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)).getgxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEliminaciondeformulastinte_sdts__forultuti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavEliminaciondeformulastinte_sdts__forultuti_Visible),Integer.valueOf(edtavEliminaciondeformulastinte_sdts__forultuti_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "ELIMINACIONDEFORMULASTINTE_SDTS__FORPRO_" + sGXsfl_51_idx ;
         chkavEliminaciondeformulastinte_sdts__forpro.setName( GXCCtl );
         chkavEliminaciondeformulastinte_sdts__forpro.setWebtags( "" );
         chkavEliminaciondeformulastinte_sdts__forpro.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavEliminaciondeformulastinte_sdts__forpro.getInternalname(), "TitleCaption", chkavEliminaciondeformulastinte_sdts__forpro.getCaption(), !bGXsfl_51_Refreshing);
         chkavEliminaciondeformulastinte_sdts__forpro.setCheckedValue( "N" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavEliminaciondeformulastinte_sdts__forpro.getInternalname(),((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)).getgxTv_SdtEliminaciondeFormulasTinte_SDT_Forpro(),"","",Integer.valueOf(0),Integer.valueOf(chkavEliminaciondeformulastinte_sdts__forpro.getEnabled()),"S","",StyleString,ClassString,"WWColumn","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEliminaciondeformulastinte_sdts__numhdrsprod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)).getgxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrsprod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavEliminaciondeformulastinte_sdts__numhdrsprod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)).getgxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrsprod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)).getgxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrsprod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEliminaciondeformulastinte_sdts__numhdrsprod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavEliminaciondeformulastinte_sdts__numhdrsprod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEliminaciondeformulastinte_sdts__numhdrshist_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)).getgxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrshist(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavEliminaciondeformulastinte_sdts__numhdrshist_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)).getgxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrshist()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)AV15EliminaciondeFormulasTinte_SDTs.elementAt(-1+AV60GXV1)).getgxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrshist()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEliminaciondeformulastinte_sdts__numhdrshist_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavEliminaciondeformulastinte_sdts__numhdrshist_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1YC2( ) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavEliminaciondeformulastinte_sdts__clicod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavEliminaciondeformulastinte_sdts__clinom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavEliminaciondeformulastinte_sdts__forser_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavEliminaciondeformulastinte_sdts__forserdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavEliminaciondeformulastinte_sdts__forcolnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavEliminaciondeformulastinte_sdts__forcolnum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavEliminaciondeformulastinte_sdts__tipcolcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavEliminaciondeformulastinte_sdts__fornumcol_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Form.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavEliminaciondeformulastinte_sdts__forultuti_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fec. Ult. Uti.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEliminaciondeformulastinte_sdts__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavEliminaciondeformulastinte_sdts__clicod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEliminaciondeformulastinte_sdts__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavEliminaciondeformulastinte_sdts__clinom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEliminaciondeformulastinte_sdts__forser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavEliminaciondeformulastinte_sdts__forser_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEliminaciondeformulastinte_sdts__forserdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavEliminaciondeformulastinte_sdts__forserdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEliminaciondeformulastinte_sdts__forcolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavEliminaciondeformulastinte_sdts__forcolnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEliminaciondeformulastinte_sdts__forcolnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavEliminaciondeformulastinte_sdts__forcolnum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEliminaciondeformulastinte_sdts__tipcolcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavEliminaciondeformulastinte_sdts__tipcolcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEliminaciondeformulastinte_sdts__fornumcol_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavEliminaciondeformulastinte_sdts__fornumcol_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEliminaciondeformulastinte_sdts__forultuti_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavEliminaciondeformulastinte_sdts__forultuti_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavEliminaciondeformulastinte_sdts__forpro.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEliminaciondeformulastinte_sdts__numhdrsprod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEliminaciondeformulastinte_sdts__numhdrshist_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      lblTextblockcantidadregistrosaprocesar_Internalname = sPrefix+"TEXTBLOCKCANTIDADREGISTROSAPROCESAR" ;
      edtavCantidadregistrosaprocesar_Internalname = sPrefix+"vCANTIDADREGISTROSAPROCESAR" ;
      divUnnamedtablecantidadregistrosaprocesar_Internalname = sPrefix+"UNNAMEDTABLECANTIDADREGISTROSAPROCESAR" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      bttBtneliminar_Internalname = sPrefix+"BTNELIMINAR" ;
      Barradeprogreso_Internalname = sPrefix+"BARRADEPROGRESO" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      edtavEliminaciondeformulastinte_sdts__clicod_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__CLICOD" ;
      edtavEliminaciondeformulastinte_sdts__clinom_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__CLINOM" ;
      edtavEliminaciondeformulastinte_sdts__forser_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__FORSER" ;
      edtavEliminaciondeformulastinte_sdts__forserdsc_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__FORSERDSC" ;
      edtavEliminaciondeformulastinte_sdts__forcolnom_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__FORCOLNOM" ;
      edtavEliminaciondeformulastinte_sdts__forcolnum_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__FORCOLNUM" ;
      edtavEliminaciondeformulastinte_sdts__tipcolcod_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__TIPCOLCOD" ;
      edtavEliminaciondeformulastinte_sdts__fornumcol_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__FORNUMCOL" ;
      edtavEliminaciondeformulastinte_sdts__forultuti_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__FORULTUTI" ;
      chkavEliminaciondeformulastinte_sdts__forpro.setInternalname( sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__FORPRO" );
      edtavEliminaciondeformulastinte_sdts__numhdrsprod_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__NUMHDRSPROD" ;
      edtavEliminaciondeformulastinte_sdts__numhdrshist_Internalname = sPrefix+"ELIMINACIONDEFORMULASTINTE_SDTS__NUMHDRSHIST" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Innewwindow1_Internalname = sPrefix+"INNEWWINDOW1" ;
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
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtavEliminaciondeformulastinte_sdts__numhdrshist_Jsonclick = "" ;
      edtavEliminaciondeformulastinte_sdts__numhdrshist_Enabled = 0 ;
      edtavEliminaciondeformulastinte_sdts__numhdrsprod_Jsonclick = "" ;
      edtavEliminaciondeformulastinte_sdts__numhdrsprod_Enabled = 0 ;
      chkavEliminaciondeformulastinte_sdts__forpro.setCaption( "" );
      chkavEliminaciondeformulastinte_sdts__forpro.setEnabled( 0 );
      edtavEliminaciondeformulastinte_sdts__forultuti_Jsonclick = "" ;
      edtavEliminaciondeformulastinte_sdts__forultuti_Enabled = 0 ;
      edtavEliminaciondeformulastinte_sdts__forultuti_Visible = -1 ;
      edtavEliminaciondeformulastinte_sdts__fornumcol_Jsonclick = "" ;
      edtavEliminaciondeformulastinte_sdts__fornumcol_Enabled = 0 ;
      edtavEliminaciondeformulastinte_sdts__fornumcol_Visible = -1 ;
      edtavEliminaciondeformulastinte_sdts__tipcolcod_Jsonclick = "" ;
      edtavEliminaciondeformulastinte_sdts__tipcolcod_Enabled = 0 ;
      edtavEliminaciondeformulastinte_sdts__tipcolcod_Visible = -1 ;
      edtavEliminaciondeformulastinte_sdts__forcolnum_Jsonclick = "" ;
      edtavEliminaciondeformulastinte_sdts__forcolnum_Enabled = 0 ;
      edtavEliminaciondeformulastinte_sdts__forcolnum_Visible = -1 ;
      edtavEliminaciondeformulastinte_sdts__forcolnom_Jsonclick = "" ;
      edtavEliminaciondeformulastinte_sdts__forcolnom_Enabled = 0 ;
      edtavEliminaciondeformulastinte_sdts__forcolnom_Visible = -1 ;
      edtavEliminaciondeformulastinte_sdts__forserdsc_Jsonclick = "" ;
      edtavEliminaciondeformulastinte_sdts__forserdsc_Enabled = 0 ;
      edtavEliminaciondeformulastinte_sdts__forserdsc_Visible = -1 ;
      edtavEliminaciondeformulastinte_sdts__forser_Jsonclick = "" ;
      edtavEliminaciondeformulastinte_sdts__forser_Enabled = 0 ;
      edtavEliminaciondeformulastinte_sdts__forser_Visible = -1 ;
      edtavEliminaciondeformulastinte_sdts__clinom_Jsonclick = "" ;
      edtavEliminaciondeformulastinte_sdts__clinom_Enabled = 0 ;
      edtavEliminaciondeformulastinte_sdts__clinom_Visible = -1 ;
      edtavEliminaciondeformulastinte_sdts__clicod_Jsonclick = "" ;
      edtavEliminaciondeformulastinte_sdts__clicod_Enabled = 0 ;
      edtavEliminaciondeformulastinte_sdts__clicod_Visible = -1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavEliminaciondeformulastinte_sdts__forultuti_Visible = -1 ;
      edtavEliminaciondeformulastinte_sdts__fornumcol_Visible = -1 ;
      edtavEliminaciondeformulastinte_sdts__tipcolcod_Visible = -1 ;
      edtavEliminaciondeformulastinte_sdts__forcolnum_Visible = -1 ;
      edtavEliminaciondeformulastinte_sdts__forcolnom_Visible = -1 ;
      edtavEliminaciondeformulastinte_sdts__forserdsc_Visible = -1 ;
      edtavEliminaciondeformulastinte_sdts__forser_Visible = -1 ;
      edtavEliminaciondeformulastinte_sdts__clinom_Visible = -1 ;
      edtavEliminaciondeformulastinte_sdts__clicod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavEliminaciondeformulastinte_sdts__numhdrshist_Enabled = -1 ;
      edtavEliminaciondeformulastinte_sdts__numhdrsprod_Enabled = -1 ;
      chkavEliminaciondeformulastinte_sdts__forpro.setEnabled( -1 );
      edtavEliminaciondeformulastinte_sdts__forultuti_Enabled = -1 ;
      edtavEliminaciondeformulastinte_sdts__fornumcol_Enabled = -1 ;
      edtavEliminaciondeformulastinte_sdts__tipcolcod_Enabled = -1 ;
      edtavEliminaciondeformulastinte_sdts__forcolnum_Enabled = -1 ;
      edtavEliminaciondeformulastinte_sdts__forcolnom_Enabled = -1 ;
      edtavEliminaciondeformulastinte_sdts__forserdsc_Enabled = -1 ;
      edtavEliminaciondeformulastinte_sdts__forser_Enabled = -1 ;
      edtavEliminaciondeformulastinte_sdts__clinom_Enabled = -1 ;
      edtavEliminaciondeformulastinte_sdts__clicod_Enabled = -1 ;
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
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "||||||||" ;
      Ddo_grid_Columnids = "0:EliminaciondeFormulasTinte_SDTs__Clicod|1:EliminaciondeFormulasTinte_SDTs__CliNom|2:EliminaciondeFormulasTinte_SDTs__Forser|3:EliminaciondeFormulasTinte_SDTs__Forserdsc|4:EliminaciondeFormulasTinte_SDTs__Forcolnom|5:EliminaciondeFormulasTinte_SDTs__Forcolnum|6:EliminaciondeFormulasTinte_SDTs__Tipcolcod|7:EliminaciondeFormulasTinte_SDTs__ForNumcol|8:EliminaciondeFormulasTinte_SDTs__ForUltUti" ;
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
      GXCCtl = "ELIMINACIONDEFORMULASTINTE_SDTS__FORPRO_" + sGXsfl_51_idx ;
      chkavEliminaciondeformulastinte_sdts__forpro.setName( GXCCtl );
      chkavEliminaciondeformulastinte_sdts__forpro.setWebtags( "" );
      chkavEliminaciondeformulastinte_sdts__forpro.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavEliminaciondeformulastinte_sdts__forpro.getInternalname(), "TitleCaption", chkavEliminaciondeformulastinte_sdts__forpro.getCaption(), !bGXsfl_51_Refreshing);
      chkavEliminaciondeformulastinte_sdts__forpro.setCheckedValue( "N" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV9Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV24Forser',fld:'vFORSER',pic:''},{av:'AV25Forser_to',fld:'vFORSER_TO',pic:''},{av:'AV20Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV21Forcolnom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV22Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV23Forcolnum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV45TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV26ForUltUti',fld:'vFORULTUTI',pic:''},{av:'AV15EliminaciondeFormulasTinte_SDTs',fld:'vELIMINACIONDEFORMULASTINTE_SDTS',grid:51,pic:'',hsh:true},{av:'nGXsfl_51_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:51},{av:'nRC_GXsfl_51',ctrl:'GRID',prop:'GridRC',grid:51},{av:'AV5Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV6usurcod',fld:'vUSURCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'ELIMINACIONDEFORMULASTINTE_SDTS__CLICOD',prop:'Visible'},{ctrl:'ELIMINACIONDEFORMULASTINTE_SDTS__CLINOM',prop:'Visible'},{ctrl:'ELIMINACIONDEFORMULASTINTE_SDTS__FORSER',prop:'Visible'},{ctrl:'ELIMINACIONDEFORMULASTINTE_SDTS__FORSERDSC',prop:'Visible'},{ctrl:'ELIMINACIONDEFORMULASTINTE_SDTS__FORCOLNOM',prop:'Visible'},{ctrl:'ELIMINACIONDEFORMULASTINTE_SDTS__FORCOLNUM',prop:'Visible'},{ctrl:'ELIMINACIONDEFORMULASTINTE_SDTS__TIPCOLCOD',prop:'Visible'},{ctrl:'ELIMINACIONDEFORMULASTINTE_SDTS__FORNUMCOL',prop:'Visible'},{ctrl:'ELIMINACIONDEFORMULASTINTE_SDTS__FORULTUTI',prop:'Visible'},{av:'AV56GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV57GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121YC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV9Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV24Forser',fld:'vFORSER',pic:''},{av:'AV25Forser_to',fld:'vFORSER_TO',pic:''},{av:'AV20Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV21Forcolnom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV22Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV23Forcolnum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV45TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV26ForUltUti',fld:'vFORULTUTI',pic:''},{av:'AV15EliminaciondeFormulasTinte_SDTs',fld:'vELIMINACIONDEFORMULASTINTE_SDTS',grid:51,pic:'',hsh:true},{av:'nGXsfl_51_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:51},{av:'nRC_GXsfl_51',ctrl:'GRID',prop:'GridRC',grid:51},{av:'AV5Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV6usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131YC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV9Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV24Forser',fld:'vFORSER',pic:''},{av:'AV25Forser_to',fld:'vFORSER_TO',pic:''},{av:'AV20Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV21Forcolnom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV22Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV23Forcolnum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV45TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV26ForUltUti',fld:'vFORULTUTI',pic:''},{av:'AV15EliminaciondeFormulasTinte_SDTs',fld:'vELIMINACIONDEFORMULASTINTE_SDTS',grid:51,pic:'',hsh:true},{av:'nGXsfl_51_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:51},{av:'nRC_GXsfl_51',ctrl:'GRID',prop:'GridRC',grid:51},{av:'AV5Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV6usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e211YC2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e141YC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV9Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV24Forser',fld:'vFORSER',pic:''},{av:'AV25Forser_to',fld:'vFORSER_TO',pic:''},{av:'AV20Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV21Forcolnom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV22Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV23Forcolnum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV45TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV26ForUltUti',fld:'vFORULTUTI',pic:''},{av:'AV15EliminaciondeFormulasTinte_SDTs',fld:'vELIMINACIONDEFORMULASTINTE_SDTS',grid:51,pic:'',hsh:true},{av:'nGXsfl_51_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:51},{av:'nRC_GXsfl_51',ctrl:'GRID',prop:'GridRC',grid:51},{av:'AV5Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV6usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'ELIMINACIONDEFORMULASTINTE_SDTS__CLICOD',prop:'Visible'},{ctrl:'ELIMINACIONDEFORMULASTINTE_SDTS__CLINOM',prop:'Visible'},{ctrl:'ELIMINACIONDEFORMULASTINTE_SDTS__FORSER',prop:'Visible'},{ctrl:'ELIMINACIONDEFORMULASTINTE_SDTS__FORSERDSC',prop:'Visible'},{ctrl:'ELIMINACIONDEFORMULASTINTE_SDTS__FORCOLNOM',prop:'Visible'},{ctrl:'ELIMINACIONDEFORMULASTINTE_SDTS__FORCOLNUM',prop:'Visible'},{ctrl:'ELIMINACIONDEFORMULASTINTE_SDTS__TIPCOLCOD',prop:'Visible'},{ctrl:'ELIMINACIONDEFORMULASTINTE_SDTS__FORNUMCOL',prop:'Visible'},{ctrl:'ELIMINACIONDEFORMULASTINTE_SDTS__FORULTUTI',prop:'Visible'},{av:'AV56GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV57GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOELIMINAR'","{handler:'e111YC1',iparms:[{av:'AV7CantidadRegistrosAProcesar',fld:'vCANTIDADREGISTROSAPROCESAR',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOELIMINAR'",",oparms:[{av:'Dvelop_confirmpanel_btneliminar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_BTNELIMINAR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNELIMINAR.CLOSE","{handler:'e151YC2',iparms:[{av:'AV7CantidadRegistrosAProcesar',fld:'vCANTIDADREGISTROSAPROCESAR',pic:'ZZZZZ9'},{av:'Dvelop_confirmpanel_btneliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNELIMINAR',prop:'Result'},{av:'AV15EliminaciondeFormulasTinte_SDTs',fld:'vELIMINACIONDEFORMULASTINTE_SDTS',grid:51,pic:'',hsh:true},{av:'nGXsfl_51_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:51},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_51',ctrl:'GRID',prop:'GridRC',grid:51},{av:'AV54CantidadRegistrosProcesados',fld:'vCANTIDADREGISTROSPROCESADOS',pic:'ZZZZZ9'},{av:'AV16Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV6usurcod',fld:'vUSURCOD',pic:'@!',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNELIMINAR.CLOSE",",oparms:[{av:'AV7CantidadRegistrosAProcesar',fld:'vCANTIDADREGISTROSAPROCESAR',pic:'ZZZZZ9'},{av:'AV54CantidadRegistrosProcesados',fld:'vCANTIDADREGISTROSPROCESADOS',pic:'ZZZZZ9'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e161YC2',iparms:[{av:'AV15EliminaciondeFormulasTinte_SDTs',fld:'vELIMINACIONDEFORMULASTINTE_SDTS',grid:51,pic:'',hsh:true},{av:'nGXsfl_51_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:51},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_51',ctrl:'GRID',prop:'GridRC',grid:51}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e171YC2',iparms:[{av:'AV15EliminaciondeFormulasTinte_SDTs',fld:'vELIMINACIONDEFORMULASTINTE_SDTS',grid:51,pic:'',hsh:true},{av:'nGXsfl_51_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:51},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_51',ctrl:'GRID',prop:'GridRC',grid:51}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e181YC2',iparms:[{av:'AV15EliminaciondeFormulasTinte_SDTs',fld:'vELIMINACIONDEFORMULASTINTE_SDTS',grid:51,pic:'',hsh:true},{av:'nGXsfl_51_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:51},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_51',ctrl:'GRID',prop:'GridRC',grid:51}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv13',iparms:[]");
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
      wcpOAV16Emprcod = "" ;
      wcpOAV24Forser = "" ;
      wcpOAV25Forser_to = "" ;
      wcpOAV20Forcolnom = "" ;
      wcpOAV21Forcolnom_to = "" ;
      wcpOAV26ForUltUti = GXutil.nullDate() ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Dvelop_confirmpanel_btneliminar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV16Emprcod = "" ;
      AV24Forser = "" ;
      AV25Forser_to = "" ;
      AV20Forcolnom = "" ;
      AV21Forcolnom_to = "" ;
      AV26ForUltUti = GXutil.nullDate() ;
      AV10ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV73Pgmname = "" ;
      AV15EliminaciondeFormulasTinte_SDTs = new GXBaseCollection<app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT>(app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT.class, "EliminaciondeFormulasTinte_SDT", "TexplusNET", remoteHandle);
      AV5Station = "" ;
      AV6usurcod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV13DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportreport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      lblTextblockcantidadregistrosaprocesar_Jsonclick = "" ;
      bttBtneliminar_Jsonclick = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
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
      hsh = "" ;
      GXt_objcol_SdtEliminaciondeFormulasTinte_SDT1 = new GXBaseCollection<app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT>(app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT.class, "EliminaciondeFormulasTinte_SDT", "TexplusNET", remoteHandle);
      GXv_objcol_SdtEliminaciondeFormulasTinte_SDT2 = new GXBaseCollection[1] ;
      GXv_char4 = new String[1] ;
      AV74Emprnom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV49WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV43Session = httpContext.getWebSession();
      AV12ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV37ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      AV14EliminaciondeFormulasTinte_SDT = new app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT(remoteHandle, context);
      AV41sdt_Forser = "" ;
      AV39sdt_Forcolnom = "" ;
      AV51EliminaciondeFormulasTinte_json = "" ;
      AV52WebSession = httpContext.getWebSession();
      AV18ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      GXv_char5 = new String[1] ;
      AV48UserCustomValue = "" ;
      GXt_char3 = "" ;
      GXv_char6 = new String[1] ;
      AV11ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV27GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV28GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      ucDvelop_confirmpanel_btneliminar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV16Emprcod = "" ;
      sCtrlAV8Clicod = "" ;
      sCtrlAV9Clicod_to = "" ;
      sCtrlAV24Forser = "" ;
      sCtrlAV25Forser_to = "" ;
      sCtrlAV20Forcolnom = "" ;
      sCtrlAV21Forcolnom_to = "" ;
      sCtrlAV22Forcolnum = "" ;
      sCtrlAV23Forcolnum_to = "" ;
      sCtrlAV44TipColCod = "" ;
      sCtrlAV45TipColCod_to = "" ;
      sCtrlAV26ForUltUti = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV73Pgmname = "FormulacionTinte.EliminaciondeFormulasTinteProvisionales_2" ;
      /* GeneXus formulas. */
      AV73Pgmname = "FormulacionTinte.EliminaciondeFormulasTinteProvisionales_2" ;
      Gx_err = (short)(0) ;
      edtavCantidadregistrosaprocesar_Enabled = 0 ;
      edtavEliminaciondeformulastinte_sdts__clicod_Enabled = 0 ;
      edtavEliminaciondeformulastinte_sdts__clinom_Enabled = 0 ;
      edtavEliminaciondeformulastinte_sdts__forser_Enabled = 0 ;
      edtavEliminaciondeformulastinte_sdts__forserdsc_Enabled = 0 ;
      edtavEliminaciondeformulastinte_sdts__forcolnom_Enabled = 0 ;
      edtavEliminaciondeformulastinte_sdts__forcolnum_Enabled = 0 ;
      edtavEliminaciondeformulastinte_sdts__tipcolcod_Enabled = 0 ;
      edtavEliminaciondeformulastinte_sdts__fornumcol_Enabled = 0 ;
      edtavEliminaciondeformulastinte_sdts__forultuti_Enabled = 0 ;
      chkavEliminaciondeformulastinte_sdts__forpro.setEnabled( 0 );
      edtavEliminaciondeformulastinte_sdts__numhdrsprod_Enabled = 0 ;
      edtavEliminaciondeformulastinte_sdts__numhdrshist_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV44TipColCod ;
   private byte wcpOAV45TipColCod_to ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV44TipColCod ;
   private byte AV45TipColCod_to ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV42sdt_TipColCod ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV53Porcentaje ;
   private short AV30i ;
   private int wcpOAV8Clicod ;
   private int wcpOAV9Clicod_to ;
   private int wcpOAV22Forcolnum ;
   private int wcpOAV23Forcolnum_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_51 ;
   private int AV8Clicod ;
   private int AV9Clicod_to ;
   private int AV22Forcolnum ;
   private int AV23Forcolnum_to ;
   private int nGXsfl_51_idx=1 ;
   private int AV54CantidadRegistrosProcesados ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV7CantidadRegistrosAProcesar ;
   private int edtavCantidadregistrosaprocesar_Enabled ;
   private int AV60GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavEliminaciondeformulastinte_sdts__clicod_Enabled ;
   private int edtavEliminaciondeformulastinte_sdts__clinom_Enabled ;
   private int edtavEliminaciondeformulastinte_sdts__forser_Enabled ;
   private int edtavEliminaciondeformulastinte_sdts__forserdsc_Enabled ;
   private int edtavEliminaciondeformulastinte_sdts__forcolnom_Enabled ;
   private int edtavEliminaciondeformulastinte_sdts__forcolnum_Enabled ;
   private int edtavEliminaciondeformulastinte_sdts__tipcolcod_Enabled ;
   private int edtavEliminaciondeformulastinte_sdts__fornumcol_Enabled ;
   private int edtavEliminaciondeformulastinte_sdts__forultuti_Enabled ;
   private int edtavEliminaciondeformulastinte_sdts__numhdrsprod_Enabled ;
   private int edtavEliminaciondeformulastinte_sdts__numhdrshist_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_51_fel_idx=1 ;
   private int edtavEliminaciondeformulastinte_sdts__clicod_Visible ;
   private int edtavEliminaciondeformulastinte_sdts__clinom_Visible ;
   private int edtavEliminaciondeformulastinte_sdts__forser_Visible ;
   private int edtavEliminaciondeformulastinte_sdts__forserdsc_Visible ;
   private int edtavEliminaciondeformulastinte_sdts__forcolnom_Visible ;
   private int edtavEliminaciondeformulastinte_sdts__forcolnum_Visible ;
   private int edtavEliminaciondeformulastinte_sdts__tipcolcod_Visible ;
   private int edtavEliminaciondeformulastinte_sdts__fornumcol_Visible ;
   private int edtavEliminaciondeformulastinte_sdts__forultuti_Visible ;
   private int AV55PageToGo ;
   private int AV75GXV14 ;
   private int AV38sdt_Clicod ;
   private int AV40sdt_Forcolnum ;
   private int AV50sdt_ForNumCol ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV56GridCurrentPage ;
   private long AV57GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV16Emprcod ;
   private String wcpOAV24Forser ;
   private String wcpOAV25Forser_to ;
   private String wcpOAV20Forcolnom ;
   private String wcpOAV21Forcolnom_to ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Dvelop_confirmpanel_btneliminar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV16Emprcod ;
   private String AV24Forser ;
   private String AV25Forser_to ;
   private String AV20Forcolnom ;
   private String AV21Forcolnom_to ;
   private String sGXsfl_51_idx="0001" ;
   private String AV73Pgmname ;
   private String AV5Station ;
   private String AV6usurcod ;
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
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportreport_Internalname ;
   private String bttBtnexportreport_Jsonclick ;
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
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavEliminaciondeformulastinte_sdts__clicod_Internalname ;
   private String edtavEliminaciondeformulastinte_sdts__clinom_Internalname ;
   private String edtavEliminaciondeformulastinte_sdts__forser_Internalname ;
   private String edtavEliminaciondeformulastinte_sdts__forserdsc_Internalname ;
   private String edtavEliminaciondeformulastinte_sdts__forcolnom_Internalname ;
   private String edtavEliminaciondeformulastinte_sdts__forcolnum_Internalname ;
   private String edtavEliminaciondeformulastinte_sdts__tipcolcod_Internalname ;
   private String edtavEliminaciondeformulastinte_sdts__fornumcol_Internalname ;
   private String edtavEliminaciondeformulastinte_sdts__forultuti_Internalname ;
   private String edtavEliminaciondeformulastinte_sdts__numhdrsprod_Internalname ;
   private String edtavEliminaciondeformulastinte_sdts__numhdrshist_Internalname ;
   private String sGXsfl_51_fel_idx="0001" ;
   private String hsh ;
   private String GXv_char4[] ;
   private String AV74Emprnom ;
   private String AV41sdt_Forser ;
   private String AV39sdt_Forcolnom ;
   private String GXv_char5[] ;
   private String GXt_char3 ;
   private String GXv_char6[] ;
   private String tblTabledvelop_confirmpanel_btneliminar_Internalname ;
   private String Dvelop_confirmpanel_btneliminar_Internalname ;
   private String sCtrlAV16Emprcod ;
   private String sCtrlAV8Clicod ;
   private String sCtrlAV9Clicod_to ;
   private String sCtrlAV24Forser ;
   private String sCtrlAV25Forser_to ;
   private String sCtrlAV20Forcolnom ;
   private String sCtrlAV21Forcolnom_to ;
   private String sCtrlAV22Forcolnum ;
   private String sCtrlAV23Forcolnum_to ;
   private String sCtrlAV44TipColCod ;
   private String sCtrlAV45TipColCod_to ;
   private String sCtrlAV26ForUltUti ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavEliminaciondeformulastinte_sdts__clicod_Jsonclick ;
   private String edtavEliminaciondeformulastinte_sdts__clinom_Jsonclick ;
   private String edtavEliminaciondeformulastinte_sdts__forser_Jsonclick ;
   private String edtavEliminaciondeformulastinte_sdts__forserdsc_Jsonclick ;
   private String edtavEliminaciondeformulastinte_sdts__forcolnom_Jsonclick ;
   private String edtavEliminaciondeformulastinte_sdts__forcolnum_Jsonclick ;
   private String edtavEliminaciondeformulastinte_sdts__tipcolcod_Jsonclick ;
   private String edtavEliminaciondeformulastinte_sdts__fornumcol_Jsonclick ;
   private String edtavEliminaciondeformulastinte_sdts__forultuti_Jsonclick ;
   private String GXCCtl ;
   private String edtavEliminaciondeformulastinte_sdts__numhdrsprod_Jsonclick ;
   private String edtavEliminaciondeformulastinte_sdts__numhdrshist_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV26ForUltUti ;
   private java.util.Date AV26ForUltUti ;
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
   private boolean bGXsfl_51_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV51 ;
   private boolean gx_refresh_fired ;
   private String AV12ColumnsSelectorXML ;
   private String AV51EliminaciondeFormulasTinte_json ;
   private String AV48UserCustomValue ;
   private String AV18ExcelFilename ;
   private String AV17ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV43Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btneliminar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV37ProgressIndicator ;
   private ICheckbox chkavEliminaciondeformulastinte_sdts__forpro ;
   private com.genexus.webpanels.WebSession AV52WebSession ;
   private GXBaseCollection<app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT> AV15EliminaciondeFormulasTinte_SDTs ;
   private GXBaseCollection<app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT> GXt_objcol_SdtEliminaciondeFormulasTinte_SDT1 ;
   private GXBaseCollection<app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT> GXv_objcol_SdtEliminaciondeFormulasTinte_SDT2[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV10ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV11ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV13DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
   private app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT AV14EliminaciondeFormulasTinte_SDT ;
   private app.wwpbaseobjects.SdtWWPGridState AV27GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV28GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV49WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

