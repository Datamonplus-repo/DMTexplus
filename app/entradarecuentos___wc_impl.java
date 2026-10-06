package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class entradarecuentos___wc_impl extends GXWebComponent
{
   public entradarecuentos___wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public entradarecuentos___wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradarecuentos___wc_impl.class ));
   }

   public entradarecuentos___wc_impl( int remoteHandle ,
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
      cmbavEntradarecuentos_sdt__recestinv = new HTMLChoice();
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
               AV19Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Emprcod", AV19Emprcod);
               AV47RecFec = localUtil.parseDateParm( httpContext.GetPar( "RecFec")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47RecFec", localUtil.format(AV47RecFec, "99/99/99"));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV19Emprcod,AV47RecFec});
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
      nRC_GXsfl_63 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_63"))) ;
      nGXsfl_63_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_63_idx"))) ;
      sGXsfl_63_idx = httpContext.GetPar( "sGXsfl_63_idx") ;
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
      AV40ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      AV78Pgmname = httpContext.GetPar( "Pgmname") ;
      AV26FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV19Emprcod = httpContext.GetPar( "Emprcod") ;
      AV47RecFec = localUtil.parseDateParm( httpContext.GetPar( "RecFec")) ;
      AV53Station = httpContext.GetPar( "Station") ;
      AV29FlagPreMed = (short)(GXutil.lval( httpContext.GetPar( "FlagPreMed"))) ;
      AV27FlagCColor = GXutil.lval( httpContext.GetPar( "FlagCColor")) ;
      AV42Nalmcc = (short)(GXutil.lval( httpContext.GetPar( "Nalmcc"))) ;
      AV60Val_stk = (short)(GXutil.lval( httpContext.GetPar( "Val_stk"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV40ManageFiltersExecutionStep, AV78Pgmname, AV26FilterFullText, AV19Emprcod, AV47RecFec, AV53Station, AV29FlagPreMed, AV27FlagCColor, AV42Nalmcc, AV60Val_stk, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa28G2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Entrada Recuentos v.03", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.entradarecuentos___wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV19Emprcod)),GXutil.URLEncode(GXutil.formatDateParm(AV47RecFec))}, new String[] {"Emprcod","RecFec"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV53Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGPREMED", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV29FlagPreMed), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGCCOLOR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV27FlagCColor), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNALMCC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV42Nalmcc), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vVAL_STK", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV60Val_stk), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"EntradaRecuentos___WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV78Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("entradarecuentos___wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Entradarecuentos_sdt", AV21EntradaRecuentos_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Entradarecuentos_sdt", AV21EntradaRecuentos_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_63", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_63, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV39ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV39ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV30GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV31GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV19Emprcod", GXutil.rtrim( wcpOAV19Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV47RecFec", localUtil.dtoc( wcpOAV47RecFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV40ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV19Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECFEC", localUtil.dtoc( AV47RecFec, 0, "/"));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV32GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV32GridState);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vENTRADARECUENTOS_SDT", AV21EntradaRecuentos_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vENTRADARECUENTOS_SDT", AV21EntradaRecuentos_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECFECHR", localUtil.ttoc( AV49Recfechr, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV59UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV53Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV53Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGPREMED", GXutil.ltrim( localUtil.ntoc( AV29FlagPreMed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGPREMED", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV29FlagPreMed), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECUBIC", GXutil.rtrim( AV51RecUbic));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCSTKHOR", GXutil.rtrim( AV11CCStkHor));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGCCOLOR", GXutil.ltrim( localUtil.ntoc( AV27FlagCColor, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGCCOLOR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV27FlagCColor), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNALMCC", GXutil.ltrim( localUtil.ntoc( AV42Nalmcc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNALMCC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV42Nalmcc), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vVAL_STK", GXutil.ltrim( localUtil.ntoc( AV60Val_stk, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vVAL_STK", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV60Val_stk), "ZZZ9")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Width", GXutil.rtrim( Innewwindow1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Height", GXutil.rtrim( Innewwindow1_Height));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Target", GXutil.rtrim( Innewwindow1_Target));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_MEMORIZAR_Title", GXutil.rtrim( Dvelop_confirmpanel_memorizar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_MEMORIZAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_memorizar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_MEMORIZAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_memorizar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_MEMORIZAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_memorizar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_MEMORIZAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_memorizar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_MEMORIZAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_memorizar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_MEMORIZAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_memorizar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR2_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmar2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR2_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmar2_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR2_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar2_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR2_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar2_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR2_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar2_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR2_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmar2_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR2_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmar2_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_MEMORIZAR_Result", GXutil.rtrim( Dvelop_confirmpanel_memorizar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR2_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar2_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_MEMORIZAR_Result", GXutil.rtrim( Dvelop_confirmpanel_memorizar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR2_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar2_Result));
   }

   public void renderHtmlCloseForm28G2( )
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
      return "EntradaRecuentos___WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Entrada Recuentos v.03", "") ;
   }

   public void wb28G0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.entradarecuentos___wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
            httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
            httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 63, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntradaRecuentos___WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 63, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntradaRecuentos___WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 63, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntradaRecuentos___WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_28G2( true) ;
      }
      else
      {
         wb_table1_23_28G2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_28G2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnmemorizar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 63, 2, 0)+","+"null"+");", httpContext.getMessage( "Memorizar Cant Real?", ""), bttBtnmemorizar_Jsonclick, 7, httpContext.getMessage( "Memorizar Cant Real?", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1128g1_client"+"'", TempTags, "", 2, "HLP_EntradaRecuentos___WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 63, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1228g1_client"+"'", TempTags, "", 2, "HLP_EntradaRecuentos___WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button hidden-xs hidden-sm hidden-md hidden-lg" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar2_Internalname, "gx.evt.setGridEvt("+GXutil.str( 63, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar2", ""), bttBtnconfirmar2_Jsonclick, 7, httpContext.getMessage( "Confirmar2", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1328g1_client"+"'", TempTags, "", 2, "HLP_EntradaRecuentos___WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 63, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntradaRecuentos___WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucBarradeprogreso.render(context, "gxprogressindicator", Barradeprogreso_Internalname, sPrefix+"BARRADEPROGRESOContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol63( ) ;
      }
      if ( wbEnd == 63 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_63 = (int)(nGXsfl_63_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV67GXV1 = nGXsfl_63_idx ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV30GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV31GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV78Pgmname), GXutil.rtrim( localUtil.format( AV78Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EntradaRecuentos___WC.htm");
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
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, sPrefix+"INNEWWINDOW1Container");
         wb_table2_88_28G2( true) ;
      }
      else
      {
         wb_table2_88_28G2( false) ;
      }
      return  ;
   }

   public void wb_table2_88_28G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_93_28G2( true) ;
      }
      else
      {
         wb_table3_93_28G2( false) ;
      }
      return  ;
   }

   public void wb_table3_93_28G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_98_28G2( true) ;
      }
      else
      {
         wb_table4_98_28G2( false) ;
      }
      return  ;
   }

   public void wb_table4_98_28G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 63 )
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
               AV67GXV1 = nGXsfl_63_idx ;
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

   public void start28G2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Entrada Recuentos v.03", ""), (short)(0)) ;
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
            strup28G0( ) ;
         }
      }
   }

   public void ws28G2( )
   {
      start28G2( ) ;
      evt28G2( ) ;
   }

   public void evt28G2( )
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
                              strup28G0( ) ;
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
                              strup28G0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1428G2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28G0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1528G2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28G0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1628G2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_MEMORIZAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28G0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1728G2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR2.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28G0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1828G2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28G0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoCerrar' */
                                 e1928G2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28G0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e2028G2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28G0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportReport' */
                                 e2128G2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28G0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e2228G2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28G0( ) ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 51), "ENTRADARECUENTOS_SDT__RECEXIREA.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28G0( ) ;
                           }
                           nGXsfl_63_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_632( ) ;
                           AV67GXV1 = (int)(nGXsfl_63_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV21EntradaRecuentos_SDT.size() >= AV67GXV1 ) && ( AV67GXV1 > 0 ) )
                           {
                              AV21EntradaRecuentos_SDT.currentItem( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)) );
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e2328G2 ();
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
                                       e2428G2 ();
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
                                       e2528G2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTRADARECUENTOS_SDT__RECEXIREA.CONTROLVALUECHANGED") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e2628G2 ();
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
                                    strup28G0( ) ;
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

   public void we28G2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm28G2( ) ;
         }
      }
   }

   public void pa28G2( )
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
      subsflControlProps_632( ) ;
      while ( nGXsfl_63_idx <= nRC_GXsfl_63 )
      {
         sendrow_632( ) ;
         nGXsfl_63_idx = ((subGrid_Islastpage==1)&&(nGXsfl_63_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_63_idx+1) ;
         sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_632( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 byte AV40ManageFiltersExecutionStep ,
                                 String AV78Pgmname ,
                                 String AV26FilterFullText ,
                                 String AV19Emprcod ,
                                 java.util.Date AV47RecFec ,
                                 String AV53Station ,
                                 short AV29FlagPreMed ,
                                 long AV27FlagCColor ,
                                 short AV42Nalmcc ,
                                 short AV60Val_stk ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2428G2 ();
      GRID_nCurrentRecord = 0 ;
      rf28G2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"EntradaRecuentos___WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV78Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("entradarecuentos___wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf28G2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV78Pgmname = "EntradaRecuentos___WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Pgmname", AV78Pgmname);
      Gx_err = (short)(0) ;
      edtavEntradarecuentos_sdt__prdnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntradarecuentos_sdt__prdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntradarecuentos_sdt__prdnum_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavEntradarecuentos_sdt__prdnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntradarecuentos_sdt__prdnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntradarecuentos_sdt__prdnom_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavEntradarecuentos_sdt__recexiteo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntradarecuentos_sdt__recexiteo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntradarecuentos_sdt__recexiteo_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavEntradarecuentos_sdt__difer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntradarecuentos_sdt__difer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntradarecuentos_sdt__difer_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavEntradarecuentos_sdt__prdrec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntradarecuentos_sdt__prdrec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntradarecuentos_sdt__prdrec_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      cmbavEntradarecuentos_sdt__recestinv.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavEntradarecuentos_sdt__recestinv.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavEntradarecuentos_sdt__recestinv.getEnabled(), 5, 0), !bGXsfl_63_Refreshing);
      edtavEntradarecuentos_sdt__prdpremed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntradarecuentos_sdt__prdpremed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntradarecuentos_sdt__prdpremed_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavEntradarecuentos_sdt__prdpreact_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntradarecuentos_sdt__prdpreact_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntradarecuentos_sdt__prdpreact_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf28G2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(63) ;
      /* Execute user event: Refresh */
      e2428G2 ();
      nGXsfl_63_idx = 1 ;
      sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_632( ) ;
      bGXsfl_63_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_632( ) ;
         e2528G2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_63_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e2528G2 ();
         }
         wbEnd = (short)(63) ;
         wb28G0( ) ;
      }
      bGXsfl_63_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes28G2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV53Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV53Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGPREMED", GXutil.ltrim( localUtil.ntoc( AV29FlagPreMed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGPREMED", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV29FlagPreMed), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGCCOLOR", GXutil.ltrim( localUtil.ntoc( AV27FlagCColor, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGCCOLOR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV27FlagCColor), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNALMCC", GXutil.ltrim( localUtil.ntoc( AV42Nalmcc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNALMCC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV42Nalmcc), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vVAL_STK", GXutil.ltrim( localUtil.ntoc( AV60Val_stk, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vVAL_STK", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV60Val_stk), "ZZZ9")));
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
      return AV21EntradaRecuentos_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV40ManageFiltersExecutionStep, AV78Pgmname, AV26FilterFullText, AV19Emprcod, AV47RecFec, AV53Station, AV29FlagPreMed, AV27FlagCColor, AV42Nalmcc, AV60Val_stk, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV40ManageFiltersExecutionStep, AV78Pgmname, AV26FilterFullText, AV19Emprcod, AV47RecFec, AV53Station, AV29FlagPreMed, AV27FlagCColor, AV42Nalmcc, AV60Val_stk, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV40ManageFiltersExecutionStep, AV78Pgmname, AV26FilterFullText, AV19Emprcod, AV47RecFec, AV53Station, AV29FlagPreMed, AV27FlagCColor, AV42Nalmcc, AV60Val_stk, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV40ManageFiltersExecutionStep, AV78Pgmname, AV26FilterFullText, AV19Emprcod, AV47RecFec, AV53Station, AV29FlagPreMed, AV27FlagCColor, AV42Nalmcc, AV60Val_stk, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV40ManageFiltersExecutionStep, AV78Pgmname, AV26FilterFullText, AV19Emprcod, AV47RecFec, AV53Station, AV29FlagPreMed, AV27FlagCColor, AV42Nalmcc, AV60Val_stk, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV78Pgmname = "EntradaRecuentos___WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Pgmname", AV78Pgmname);
      Gx_err = (short)(0) ;
      edtavEntradarecuentos_sdt__prdnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntradarecuentos_sdt__prdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntradarecuentos_sdt__prdnum_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavEntradarecuentos_sdt__prdnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntradarecuentos_sdt__prdnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntradarecuentos_sdt__prdnom_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavEntradarecuentos_sdt__recexiteo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntradarecuentos_sdt__recexiteo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntradarecuentos_sdt__recexiteo_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavEntradarecuentos_sdt__difer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntradarecuentos_sdt__difer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntradarecuentos_sdt__difer_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavEntradarecuentos_sdt__prdrec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntradarecuentos_sdt__prdrec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntradarecuentos_sdt__prdrec_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      cmbavEntradarecuentos_sdt__recestinv.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavEntradarecuentos_sdt__recestinv.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavEntradarecuentos_sdt__recestinv.getEnabled(), 5, 0), !bGXsfl_63_Refreshing);
      edtavEntradarecuentos_sdt__prdpremed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntradarecuentos_sdt__prdpremed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntradarecuentos_sdt__prdpremed_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavEntradarecuentos_sdt__prdpreact_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntradarecuentos_sdt__prdpreact_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntradarecuentos_sdt__prdpreact_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup28G0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2328G2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Entradarecuentos_sdt"), AV21EntradaRecuentos_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV39ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vENTRADARECUENTOS_SDT"), AV21EntradaRecuentos_SDT);
         /* Read saved values. */
         nRC_GXsfl_63 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_63"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV30GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV31GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV19Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV19Emprcod") ;
         wcpOAV47RecFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV47RecFec"), 0) ;
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
         Innewwindow1_Width = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Width") ;
         Innewwindow1_Height = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Height") ;
         Innewwindow1_Target = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Target") ;
         Dvelop_confirmpanel_memorizar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_MEMORIZAR_Title") ;
         Dvelop_confirmpanel_memorizar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_MEMORIZAR_Confirmationtext") ;
         Dvelop_confirmpanel_memorizar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_MEMORIZAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_memorizar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_MEMORIZAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_memorizar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_MEMORIZAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_memorizar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_MEMORIZAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_memorizar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_MEMORIZAR_Confirmtype") ;
         Dvelop_confirmpanel_confirmar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Title") ;
         Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_confirmar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype") ;
         Dvelop_confirmpanel_confirmar2_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR2_Title") ;
         Dvelop_confirmpanel_confirmar2_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR2_Confirmationtext") ;
         Dvelop_confirmpanel_confirmar2_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR2_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmar2_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR2_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmar2_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR2_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmar2_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR2_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmar2_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR2_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvelop_confirmpanel_memorizar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_MEMORIZAR_Result") ;
         Dvelop_confirmpanel_confirmar2_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR2_Result") ;
         nRC_GXsfl_63 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_63"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_63_fel_idx = 0 ;
         while ( nGXsfl_63_fel_idx < nRC_GXsfl_63 )
         {
            nGXsfl_63_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_63_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_63_fel_idx+1) ;
            sGXsfl_63_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_632( ) ;
            AV67GXV1 = (int)(nGXsfl_63_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV21EntradaRecuentos_SDT.size() >= AV67GXV1 ) && ( AV67GXV1 > 0 ) )
            {
               AV21EntradaRecuentos_SDT.currentItem( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)) );
            }
         }
         if ( nGXsfl_63_fel_idx == 0 )
         {
            nGXsfl_63_idx = 1 ;
            sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_632( ) ;
         }
         nGXsfl_63_fel_idx = 1 ;
         /* Read variables values. */
         AV26FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26FilterFullText", AV26FilterFullText);
         AV78Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Pgmname", AV78Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"EntradaRecuentos___WC");
         AV78Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Pgmname", AV78Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV78Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("entradarecuentos___wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e2328G2 ();
      if (returnInSub) return;
   }

   public void e2328G2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV53Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      entradarecuentos___wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV53Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Station", AV53Station);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV53Station, ""))));
      GXv_char2[0] = AV19Emprcod ;
      GXv_char3[0] = AV20EmprNom ;
      GXv_char4[0] = AV59UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV53Station, GXv_char2, GXv_char3, GXv_char4) ;
      entradarecuentos___wc_impl.this.AV19Emprcod = GXv_char2[0] ;
      entradarecuentos___wc_impl.this.AV20EmprNom = GXv_char3[0] ;
      entradarecuentos___wc_impl.this.AV59UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Emprcod", AV19Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59UsurCod", AV59UsurCod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      /* Execute user subroutine: 'LOADSAVEDFILTERS' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int5 = (byte)(AV60Val_stk) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV19Emprcod, httpContext.getMessage( "VALSTK", ""), GXv_int6) ;
      entradarecuentos___wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV60Val_stk = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60Val_stk", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60Val_stk), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vVAL_STK", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV60Val_stk), "ZZZ9")));
      GXt_int7 = AV46Precio_stk ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( AV19Emprcod, httpContext.getMessage( "VALSTK", ""), GXv_int8) ;
      entradarecuentos___wc_impl.this.GXt_int7 = GXv_int8[0] ;
      AV46Precio_stk = (short)(GXt_int7) ;
      GXt_int5 = (byte)(AV8Artextil) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV19Emprcod, httpContext.getMessage( "ARTEXT", ""), GXv_int6) ;
      entradarecuentos___wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV8Artextil = GXt_int5 ;
      GXt_int5 = (byte)(AV36Intexco) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV19Emprcod, httpContext.getMessage( "INTEXC", ""), GXv_int6) ;
      entradarecuentos___wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV36Intexco = GXt_int5 ;
      GXt_int5 = (byte)(AV42Nalmcc) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV19Emprcod, httpContext.getMessage( "NALMCC", ""), GXv_int6) ;
      entradarecuentos___wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV42Nalmcc = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Nalmcc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Nalmcc), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNALMCC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV42Nalmcc), "ZZZ9")));
      GXt_int5 = (byte)(AV57Ubicacion) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV19Emprcod, httpContext.getMessage( "LOCPRD", ""), GXv_int6) ;
      entradarecuentos___wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV57Ubicacion = GXt_int5 ;
      GXv_int6[0] = (byte)(AV28FlagCcs) ;
      new app.pexicon(remoteHandle, context).execute( AV19Emprcod, httpContext.getMessage( "CCSTKS", ""), GXv_int6) ;
      entradarecuentos___wc_impl.this.AV28FlagCcs = GXv_int6[0] ;
      GXt_int5 = (byte)(AV29FlagPreMed) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV19Emprcod, httpContext.getMessage( "PREMED", ""), GXv_int6) ;
      entradarecuentos___wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV29FlagPreMed = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29FlagPreMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29FlagPreMed), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGPREMED", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV29FlagPreMed), "ZZZ9")));
      GXt_int5 = (byte)(AV27FlagCColor) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV19Emprcod, httpContext.getMessage( "10002E", ""), GXv_int6) ;
      entradarecuentos___wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV27FlagCColor = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27FlagCColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27FlagCColor), 10, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGCCOLOR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV27FlagCColor), "ZZZZZZZZZ9")));
      /* Execute user subroutine: 'LASTRECUEN' */
      S132 ();
      if (returnInSub) return;
      GXt_objcol_SdtEntradaRecuentos_SDT_Item9 = AV21EntradaRecuentos_SDT ;
      GXv_objcol_SdtEntradaRecuentos_SDT_Item10[0] = GXt_objcol_SdtEntradaRecuentos_SDT_Item9 ;
      new app.entradarecuentos_dp(remoteHandle, context).execute( AV19Emprcod, AV47RecFec, GXv_objcol_SdtEntradaRecuentos_SDT_Item10) ;
      GXt_objcol_SdtEntradaRecuentos_SDT_Item9 = GXv_objcol_SdtEntradaRecuentos_SDT_Item10[0] ;
      AV21EntradaRecuentos_SDT = GXt_objcol_SdtEntradaRecuentos_SDT_Item9 ;
      gx_BV63 = true ;
   }

   public void e2428G2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV61WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV61WWPContext = GXv_SdtWWPContext11[0] ;
      if ( AV40ManageFiltersExecutionStep == 1 )
      {
         AV40ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40ManageFiltersExecutionStep", GXutil.str( AV40ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV40ManageFiltersExecutionStep == 2 )
      {
         AV40ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40ManageFiltersExecutionStep", GXutil.str( AV40ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S152 ();
      if (returnInSub) return;
      AV30GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30GridCurrentPage), 10, 0));
      AV31GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31GridPageCount), 10, 0));
      edtavEntradarecuentos_sdt__recexirea_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntradarecuentos_sdt__recexirea_Internalname, "Columnheaderclass", edtavEntradarecuentos_sdt__recexirea_Columnheaderclass, !bGXsfl_63_Refreshing);
      edtavEntradarecuentos_sdt__difer_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntradarecuentos_sdt__difer_Internalname, "Columnheaderclass", edtavEntradarecuentos_sdt__difer_Columnheaderclass, !bGXsfl_63_Refreshing);
      edtavEntradarecuentos_sdt__reclot_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntradarecuentos_sdt__reclot_Internalname, "Columnheaderclass", edtavEntradarecuentos_sdt__reclot_Columnheaderclass, !bGXsfl_63_Refreshing);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV39ManageFiltersData", AV39ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV32GridState", AV32GridState);
   }

   public void e1528G2( )
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
         AV43PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV43PageToGo) ;
      }
   }

   public void e1628G2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e2528G2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV67GXV1 = 1 ;
      while ( AV67GXV1 <= AV21EntradaRecuentos_SDT.size() )
      {
         AV21EntradaRecuentos_SDT.currentItem( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)) );
         edtavEntradarecuentos_sdt__recexirea_Columnclass = "WWColumn WWColumnDanger WWColumnDangerSingleCell" ;
         edtavEntradarecuentos_sdt__difer_Columnclass = "WWColumn WWColumnBold WWColumnBoldSingleCell" ;
         edtavEntradarecuentos_sdt__reclot_Columnclass = "WWColumn WWColumnDanger WWColumnDangerSingleCell" ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(63) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_632( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_63_Refreshing )
         {
            httpContext.doAjaxLoad(63, GridRow);
         }
         AV67GXV1 = (int)(AV67GXV1+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e1428G2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S162 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S142 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("EntradaRecuentos___WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV78Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV40ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40ManageFiltersExecutionStep", GXutil.str( AV40ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("EntradaRecuentos___WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV40ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40ManageFiltersExecutionStep", GXutil.str( AV40ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV41ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "EntradaRecuentos___WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         entradarecuentos___wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV41ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV41ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S162 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV78Pgmname+"GridState", AV41ManageFiltersXml) ;
            AV32GridState.fromxml(AV41ManageFiltersXml, null, null);
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S172 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV32GridState", AV32GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV39ManageFiltersData", AV39ManageFiltersData);
   }

   public void e1728G2( )
   {
      AV67GXV1 = (int)(nGXsfl_63_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV67GXV1 > 0 ) && ( AV21EntradaRecuentos_SDT.size() >= AV67GXV1 ) )
      {
         AV21EntradaRecuentos_SDT.currentItem( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)) );
      }
      /* Dvelop_confirmpanel_memorizar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_memorizar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION MEMORIZAR' */
         S182 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21EntradaRecuentos_SDT", AV21EntradaRecuentos_SDT);
      nGXsfl_63_bak_idx = nGXsfl_63_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV40ManageFiltersExecutionStep, AV78Pgmname, AV26FilterFullText, AV19Emprcod, AV47RecFec, AV53Station, AV29FlagPreMed, AV27FlagCColor, AV42Nalmcc, AV60Val_stk, sPrefix) ;
      nGXsfl_63_idx = nGXsfl_63_bak_idx ;
      sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_632( ) ;
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV39ManageFiltersData", AV39ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV32GridState", AV32GridState);
   }

   public void e1828G2( )
   {
      AV67GXV1 = (int)(nGXsfl_63_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV67GXV1 > 0 ) && ( AV21EntradaRecuentos_SDT.size() >= AV67GXV1 ) )
      {
         AV21EntradaRecuentos_SDT.currentItem( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)) );
      }
      /* Dvelop_confirmpanel_confirmar2_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar2_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR2' */
         S202 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV62ProgressIndicator", AV62ProgressIndicator);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21EntradaRecuentos_SDT", AV21EntradaRecuentos_SDT);
      nGXsfl_63_bak_idx = nGXsfl_63_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV40ManageFiltersExecutionStep, AV78Pgmname, AV26FilterFullText, AV19Emprcod, AV47RecFec, AV53Station, AV29FlagPreMed, AV27FlagCColor, AV42Nalmcc, AV60Val_stk, sPrefix) ;
      nGXsfl_63_idx = nGXsfl_63_bak_idx ;
      sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_632( ) ;
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV39ManageFiltersData", AV39ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV32GridState", AV32GridState);
   }

   public void e1928G2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e2028G2( )
   {
      AV67GXV1 = (int)(nGXsfl_63_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV67GXV1 > 0 ) && ( AV21EntradaRecuentos_SDT.size() >= AV67GXV1 ) )
      {
         AV21EntradaRecuentos_SDT.currentItem( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)) );
      }
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV24ExcelFilename ;
      GXv_char3[0] = AV23ErrorMessage ;
      new app.entradarecuentos___wcexport(remoteHandle, context).execute( AV21EntradaRecuentos_SDT, GXv_char4, GXv_char3) ;
      entradarecuentos___wc_impl.this.AV24ExcelFilename = GXv_char4[0] ;
      entradarecuentos___wc_impl.this.AV23ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV24ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV24ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV23ErrorMessage);
      }
   }

   public void e2128G2( )
   {
      AV67GXV1 = (int)(nGXsfl_63_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV67GXV1 > 0 ) && ( AV21EntradaRecuentos_SDT.size() >= AV67GXV1 ) )
      {
         AV21EntradaRecuentos_SDT.currentItem( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)) );
      }
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      AV63EntradaRecuentos_SDT_json = AV21EntradaRecuentos_SDT.toJSonString(false) ;
      AV64WebSession.setValue(httpContext.getMessage( "&EntradaRecuentos_SDT_json", ""), AV63EntradaRecuentos_SDT_json);
      Innewwindow1_Target = formatLink("app.entradarecuentos___wcexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod(sPrefix, false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
   }

   public void e2228G2( )
   {
      AV67GXV1 = (int)(nGXsfl_63_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV67GXV1 > 0 ) && ( AV21EntradaRecuentos_SDT.size() >= AV67GXV1 ) )
      {
         AV21EntradaRecuentos_SDT.currentItem( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)) );
      }
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV63EntradaRecuentos_SDT_json = AV21EntradaRecuentos_SDT.toJSonString(false) ;
      AV64WebSession.setValue(httpContext.getMessage( "&EntradaRecuentos_SDT_json", ""), AV63EntradaRecuentos_SDT_json);
      callWebObject(formatLink("app.entradarecuentos___wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S152( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = AV39ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "EntradaRecuentos___WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] ;
      AV39ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   }

   public void S162( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV26FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26FilterFullText", AV26FilterFullText);
   }

   public void S182( )
   {
      /* 'DO ACTION MEMORIZAR' Routine */
      returnInSub = false ;
      AV79GXV12 = 1 ;
      while ( AV79GXV12 <= AV21EntradaRecuentos_SDT.size() )
      {
         AV22EntradaRecuentos_SDT_item = (app.SdtEntradaRecuentos_SDT_Item)((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV79GXV12));
         AV6RecExiRea = AV22EntradaRecuentos_SDT_item.getgxTv_SdtEntradaRecuentos_SDT_Item_Recexirea() ;
         AV5RecExiRcc = DecimalUtil.doubleToDec(0) ;
         AV44Prdnum = AV22EntradaRecuentos_SDT_item.getgxTv_SdtEntradaRecuentos_SDT_Item_Prdnum() ;
         GXv_char4[0] = AV19Emprcod ;
         GXv_char3[0] = AV44Prdnum ;
         GXv_date14[0] = AV47RecFec ;
         GXv_decimal15[0] = AV6RecExiRea ;
         GXv_decimal16[0] = AV5RecExiRcc ;
         GXv_decimal17[0] = DecimalUtil.doubleToDec(0) ;
         GXv_dtime18[0] = AV49Recfechr ;
         GXv_char2[0] = " " ;
         new app.pmemocant(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date14, GXv_decimal15, GXv_decimal16, GXv_decimal17, GXv_dtime18, GXv_char2) ;
         entradarecuentos___wc_impl.this.AV19Emprcod = GXv_char4[0] ;
         entradarecuentos___wc_impl.this.AV44Prdnum = GXv_char3[0] ;
         entradarecuentos___wc_impl.this.AV47RecFec = GXv_date14[0] ;
         entradarecuentos___wc_impl.this.AV6RecExiRea = GXv_decimal15[0] ;
         entradarecuentos___wc_impl.this.AV5RecExiRcc = GXv_decimal16[0] ;
         entradarecuentos___wc_impl.this.AV49Recfechr = GXv_dtime18[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Emprcod", AV19Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47RecFec", localUtil.format(AV47RecFec, "99/99/99"));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Recfechr", localUtil.ttoc( AV49Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV79GXV12 = (int)(AV79GXV12+1) ;
      }
      GXt_objcol_SdtEntradaRecuentos_SDT_Item9 = AV21EntradaRecuentos_SDT ;
      GXv_objcol_SdtEntradaRecuentos_SDT_Item10[0] = GXt_objcol_SdtEntradaRecuentos_SDT_Item9 ;
      new app.entradarecuentos_dp(remoteHandle, context).execute( AV19Emprcod, AV47RecFec, GXv_objcol_SdtEntradaRecuentos_SDT_Item10) ;
      GXt_objcol_SdtEntradaRecuentos_SDT_Item9 = GXv_objcol_SdtEntradaRecuentos_SDT_Item10[0] ;
      AV21EntradaRecuentos_SDT = GXt_objcol_SdtEntradaRecuentos_SDT_Item9 ;
      gx_BV63 = true ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S192( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
   }

   public void S202( )
   {
      /* 'DO ACTION CONFIRMAR2' Routine */
      returnInSub = false ;
      AV62ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(0) );
      AV62ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV62ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV62ProgressIndicator.show();
      AV35Inc_obs = httpContext.getMessage( "Inicio Actualizacion RECUENTO", "") ;
      new app.pctrinc(remoteHandle, context).execute( AV19Emprcod, GXutil.substring( AV78Pgmname, 1, 10), AV59UsurCod, AV53Station, AV35Inc_obs, 99999999, (byte)(0), " ") ;
      AV80GXV13 = 1 ;
      while ( AV80GXV13 <= AV21EntradaRecuentos_SDT.size() )
      {
         AV22EntradaRecuentos_SDT_item = (app.SdtEntradaRecuentos_SDT_Item)((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV80GXV13));
         AV45Precio_mov = ((AV29FlagPreMed==1) ? AV22EntradaRecuentos_SDT_item.getgxTv_SdtEntradaRecuentos_SDT_Item_Prdpremed() : AV22EntradaRecuentos_SDT_item.getgxTv_SdtEntradaRecuentos_SDT_Item_Prdpreact()) ;
         AV54TotDet = (short)(0) ;
         AV17Difer = AV22EntradaRecuentos_SDT_item.getgxTv_SdtEntradaRecuentos_SDT_Item_Difer() ;
         AV18DiferCC = DecimalUtil.doubleToDec(0) ;
         AV44Prdnum = AV22EntradaRecuentos_SDT_item.getgxTv_SdtEntradaRecuentos_SDT_Item_Prdnum() ;
         AV6RecExiRea = AV22EntradaRecuentos_SDT_item.getgxTv_SdtEntradaRecuentos_SDT_Item_Recexirea() ;
         AV5RecExiRcc = DecimalUtil.doubleToDec(0) ;
         AV7Reclot = AV22EntradaRecuentos_SDT_item.getgxTv_SdtEntradaRecuentos_SDT_Item_Reclot() ;
         if ( AV17Difer.doubleValue() != 0 )
         {
            GXv_char4[0] = AV19Emprcod ;
            GXv_char3[0] = AV44Prdnum ;
            GXv_decimal17[0] = AV17Difer ;
            GXv_date14[0] = AV47RecFec ;
            new app.pmodrem(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal17, GXv_date14) ;
            entradarecuentos___wc_impl.this.AV19Emprcod = GXv_char4[0] ;
            entradarecuentos___wc_impl.this.AV44Prdnum = GXv_char3[0] ;
            entradarecuentos___wc_impl.this.AV17Difer = GXv_decimal17[0] ;
            entradarecuentos___wc_impl.this.AV47RecFec = GXv_date14[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Emprcod", AV19Emprcod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47RecFec", localUtil.format(AV47RecFec, "99/99/99"));
         }
         GXv_char4[0] = AV19Emprcod ;
         GXv_char3[0] = AV44Prdnum ;
         GXv_date14[0] = AV47RecFec ;
         GXv_decimal17[0] = AV6RecExiRea ;
         GXv_decimal16[0] = AV5RecExiRcc ;
         GXv_decimal15[0] = AV45Precio_mov ;
         GXv_dtime18[0] = AV49Recfechr ;
         GXv_char2[0] = " " ;
         GXv_char19[0] = AV7Reclot ;
         GXv_char20[0] = AV51RecUbic ;
         new app.pmodexi2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date14, GXv_decimal17, GXv_decimal16, GXv_decimal15, GXv_dtime18, GXv_char2, GXv_char19, GXv_char20) ;
         entradarecuentos___wc_impl.this.AV19Emprcod = GXv_char4[0] ;
         entradarecuentos___wc_impl.this.AV44Prdnum = GXv_char3[0] ;
         entradarecuentos___wc_impl.this.AV47RecFec = GXv_date14[0] ;
         entradarecuentos___wc_impl.this.AV6RecExiRea = GXv_decimal17[0] ;
         entradarecuentos___wc_impl.this.AV5RecExiRcc = GXv_decimal16[0] ;
         entradarecuentos___wc_impl.this.AV45Precio_mov = GXv_decimal15[0] ;
         entradarecuentos___wc_impl.this.AV49Recfechr = GXv_dtime18[0] ;
         entradarecuentos___wc_impl.this.AV7Reclot = GXv_char19[0] ;
         entradarecuentos___wc_impl.this.AV51RecUbic = GXv_char20[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Emprcod", AV19Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47RecFec", localUtil.format(AV47RecFec, "99/99/99"));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Recfechr", localUtil.ttoc( AV49Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51RecUbic", AV51RecUbic);
         AV25Fecha = GXutil.today( ) ;
         if ( AV17Difer.doubleValue() < 0 )
         {
            AV9CCStkCanE = AV17Difer.negate() ;
            AV10CCStkCanS = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            AV9CCStkCanE = DecimalUtil.doubleToDec(0) ;
            AV10CCStkCanS = AV17Difer ;
         }
         GXv_char20[0] = AV19Emprcod ;
         GXv_char19[0] = AV44Prdnum ;
         GXv_decimal17[0] = AV9CCStkCanE ;
         GXv_decimal16[0] = AV10CCStkCanS ;
         GXv_char4[0] = httpContext.getMessage( "SR", "") ;
         GXv_char3[0] = "1" ;
         GXv_decimal15[0] = AV45Precio_mov ;
         GXv_int8[0] = 0 ;
         GXv_int6[0] = (byte)(0) ;
         GXv_char2[0] = " " ;
         GXv_int21[0] = 0 ;
         GXv_char22[0] = " " ;
         GXv_char23[0] = AV59UsurCod ;
         GXv_char24[0] = httpContext.getMessage( "Recuento de Almacen", "") ;
         GXv_int25[0] = (short)(0) ;
         GXv_decimal26[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal27[0] = DecimalUtil.doubleToDec(0) ;
         GXv_date14[0] = AV47RecFec ;
         GXv_char28[0] = AV7Reclot ;
         GXv_char29[0] = AV11CCStkHor ;
         new app.precccstks(remoteHandle, context).execute( GXv_char20, GXv_char19, GXv_decimal17, GXv_decimal16, GXv_char4, GXv_char3, GXv_decimal15, GXv_int8, GXv_int6, GXv_char2, GXv_int21, GXv_char22, GXv_char23, GXv_char24, GXv_int25, GXv_decimal26, GXv_decimal27, GXv_date14, GXv_char28, GXv_char29) ;
         entradarecuentos___wc_impl.this.AV19Emprcod = GXv_char20[0] ;
         entradarecuentos___wc_impl.this.AV44Prdnum = GXv_char19[0] ;
         entradarecuentos___wc_impl.this.AV9CCStkCanE = GXv_decimal17[0] ;
         entradarecuentos___wc_impl.this.AV10CCStkCanS = GXv_decimal16[0] ;
         entradarecuentos___wc_impl.this.AV45Precio_mov = GXv_decimal15[0] ;
         entradarecuentos___wc_impl.this.AV59UsurCod = GXv_char23[0] ;
         entradarecuentos___wc_impl.this.AV47RecFec = GXv_date14[0] ;
         entradarecuentos___wc_impl.this.AV7Reclot = GXv_char28[0] ;
         entradarecuentos___wc_impl.this.AV11CCStkHor = GXv_char29[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Emprcod", AV19Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59UsurCod", AV59UsurCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47RecFec", localUtil.format(AV47RecFec, "99/99/99"));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11CCStkHor", AV11CCStkHor);
         if ( AV27FlagCColor == 1 )
         {
            if ( AV18DiferCC.doubleValue() < 0 )
            {
               AV9CCStkCanE = AV18DiferCC.negate() ;
               AV10CCStkCanS = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               AV9CCStkCanE = DecimalUtil.doubleToDec(0) ;
               AV10CCStkCanS = AV18DiferCC ;
            }
            GXv_char29[0] = AV19Emprcod ;
            GXv_char28[0] = AV44Prdnum ;
            GXv_decimal27[0] = AV9CCStkCanE ;
            GXv_decimal26[0] = AV10CCStkCanS ;
            GXv_char24[0] = httpContext.getMessage( "SR", "") ;
            GXv_char23[0] = "1" ;
            GXv_decimal17[0] = AV45Precio_mov ;
            GXv_int21[0] = 0 ;
            GXv_int6[0] = (byte)(0) ;
            GXv_char22[0] = " " ;
            GXv_int8[0] = 0 ;
            GXv_char20[0] = " " ;
            GXv_char19[0] = AV59UsurCod ;
            GXv_char4[0] = httpContext.getMessage( "Recuento de CC", "") ;
            GXv_int25[0] = (short)(0) ;
            GXv_decimal16[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal15[0] = DecimalUtil.doubleToDec(0) ;
            GXv_date14[0] = AV47RecFec ;
            GXv_char3[0] = AV7Reclot ;
            GXv_char2[0] = AV11CCStkHor ;
            new app.precccstks(remoteHandle, context).execute( GXv_char29, GXv_char28, GXv_decimal27, GXv_decimal26, GXv_char24, GXv_char23, GXv_decimal17, GXv_int21, GXv_int6, GXv_char22, GXv_int8, GXv_char20, GXv_char19, GXv_char4, GXv_int25, GXv_decimal16, GXv_decimal15, GXv_date14, GXv_char3, GXv_char2) ;
            entradarecuentos___wc_impl.this.AV19Emprcod = GXv_char29[0] ;
            entradarecuentos___wc_impl.this.AV44Prdnum = GXv_char28[0] ;
            entradarecuentos___wc_impl.this.AV9CCStkCanE = GXv_decimal27[0] ;
            entradarecuentos___wc_impl.this.AV10CCStkCanS = GXv_decimal26[0] ;
            entradarecuentos___wc_impl.this.AV45Precio_mov = GXv_decimal17[0] ;
            entradarecuentos___wc_impl.this.AV59UsurCod = GXv_char19[0] ;
            entradarecuentos___wc_impl.this.AV47RecFec = GXv_date14[0] ;
            entradarecuentos___wc_impl.this.AV7Reclot = GXv_char3[0] ;
            entradarecuentos___wc_impl.this.AV11CCStkHor = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Emprcod", AV19Emprcod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59UsurCod", AV59UsurCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47RecFec", localUtil.format(AV47RecFec, "99/99/99"));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11CCStkHor", AV11CCStkHor);
            if ( AV42Nalmcc == 1 )
            {
               GXv_char29[0] = AV19Emprcod ;
               GXv_char28[0] = AV44Prdnum ;
               GXv_decimal27[0] = AV5RecExiRcc ;
               GXv_char24[0] = httpContext.getMessage( "SR", "") ;
               GXv_decimal26[0] = AV45Precio_mov ;
               GXv_char23[0] = AV59UsurCod ;
               GXv_char22[0] = httpContext.getMessage( "Recuento de CC p/Almacenes", "") ;
               GXv_date14[0] = AV47RecFec ;
               GXv_dtime18[0] = AV49Recfechr ;
               new app.pccalm1(remoteHandle, context).execute( GXv_char29, GXv_char28, GXv_decimal27, GXv_char24, GXv_decimal26, GXv_char23, GXv_char22, GXv_date14, GXv_dtime18) ;
               entradarecuentos___wc_impl.this.AV19Emprcod = GXv_char29[0] ;
               entradarecuentos___wc_impl.this.AV44Prdnum = GXv_char28[0] ;
               entradarecuentos___wc_impl.this.AV5RecExiRcc = GXv_decimal27[0] ;
               entradarecuentos___wc_impl.this.AV45Precio_mov = GXv_decimal26[0] ;
               entradarecuentos___wc_impl.this.AV59UsurCod = GXv_char23[0] ;
               entradarecuentos___wc_impl.this.AV47RecFec = GXv_date14[0] ;
               entradarecuentos___wc_impl.this.AV49Recfechr = GXv_dtime18[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Emprcod", AV19Emprcod);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59UsurCod", AV59UsurCod);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47RecFec", localUtil.format(AV47RecFec, "99/99/99"));
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Recfechr", localUtil.ttoc( AV49Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
         }
         if ( AV60Val_stk == 0 )
         {
            GXv_char29[0] = AV19Emprcod ;
            GXv_char28[0] = AV44Prdnum ;
            new app.pstm017(remoteHandle, context).execute( GXv_char29, GXv_char28) ;
            entradarecuentos___wc_impl.this.AV19Emprcod = GXv_char29[0] ;
            entradarecuentos___wc_impl.this.AV44Prdnum = GXv_char28[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Emprcod", AV19Emprcod);
         }
         else
         {
            GXv_char29[0] = AV19Emprcod ;
            GXv_char28[0] = AV44Prdnum ;
            GXv_decimal27[0] = AV6RecExiRea ;
            GXv_decimal26[0] = AV45Precio_mov ;
            new app.pvalstksr(remoteHandle, context).execute( GXv_char29, GXv_char28, GXv_decimal27, GXv_decimal26) ;
            entradarecuentos___wc_impl.this.AV19Emprcod = GXv_char29[0] ;
            entradarecuentos___wc_impl.this.AV44Prdnum = GXv_char28[0] ;
            entradarecuentos___wc_impl.this.AV6RecExiRea = GXv_decimal27[0] ;
            entradarecuentos___wc_impl.this.AV45Precio_mov = GXv_decimal26[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Emprcod", AV19Emprcod);
         }
         AV80GXV13 = (int)(AV80GXV13+1) ;
      }
      AV35Inc_obs = httpContext.getMessage( "Fin Actualizacion RECUENTO", "") ;
      new app.pctrinc(remoteHandle, context).execute( AV19Emprcod, GXutil.substring( AV78Pgmname, 1, 10), AV59UsurCod, AV53Station, AV35Inc_obs, 99999999, (byte)(0), " ") ;
      GXv_char29[0] = AV19Emprcod ;
      new app.pinvprd(remoteHandle, context).execute( GXv_char29) ;
      entradarecuentos___wc_impl.this.AV19Emprcod = GXv_char29[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Emprcod", AV19Emprcod);
      AV62ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
      AV62ProgressIndicator.hide();
      GXt_objcol_SdtEntradaRecuentos_SDT_Item9 = AV21EntradaRecuentos_SDT ;
      GXv_objcol_SdtEntradaRecuentos_SDT_Item10[0] = GXt_objcol_SdtEntradaRecuentos_SDT_Item9 ;
      new app.entradarecuentos_dp(remoteHandle, context).execute( AV19Emprcod, AV47RecFec, GXv_objcol_SdtEntradaRecuentos_SDT_Item10) ;
      GXt_objcol_SdtEntradaRecuentos_SDT_Item9 = GXv_objcol_SdtEntradaRecuentos_SDT_Item10[0] ;
      AV21EntradaRecuentos_SDT = GXt_objcol_SdtEntradaRecuentos_SDT_Item9 ;
      gx_BV63 = true ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV52Session.getValue(AV78Pgmname+"GridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV78Pgmname+"GridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV52Session.getValue(AV78Pgmname+"GridState"), null, null);
      }
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S172 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV32GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV32GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV32GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S172( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV81GXV14 = 1 ;
      while ( AV81GXV14 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV81GXV14));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV26FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26FilterFullText", AV26FilterFullText);
         }
         AV81GXV14 = (int)(AV81GXV14+1) ;
      }
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV32GridState.fromxml(AV52Session.getValue(AV78Pgmname+"GridState"), null, null);
      AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState30[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV26FilterFullText)==0), (short)(0), AV26FilterFullText, "") ;
      AV32GridState = GXv_SdtWWPGridState30[0] ;
      if ( ! (GXutil.strcmp("", AV19Emprcod)==0) )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV19Emprcod );
         AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV33GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV47RecFec)) )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&RECFEC" );
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV47RecFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV33GridStateFilterValue, 0);
      }
      AV32GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV32GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV78Pgmname+"GridState", AV32GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void e2628G2( )
   {
      AV67GXV1 = (int)(nGXsfl_63_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV67GXV1 > 0 ) && ( AV21EntradaRecuentos_SDT.size() >= AV67GXV1 ) )
      {
         AV21EntradaRecuentos_SDT.currentItem( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)) );
      }
      /* Entradarecuentos_sdt__recexirea_Controlvaluechanged Routine */
      returnInSub = false ;
      ((app.SdtEntradaRecuentos_SDT_Item)(AV21EntradaRecuentos_SDT.currentItem())).setgxTv_SdtEntradaRecuentos_SDT_Item_Difer( ((app.SdtEntradaRecuentos_SDT_Item)(AV21EntradaRecuentos_SDT.currentItem())).getgxTv_SdtEntradaRecuentos_SDT_Item_Recexiteo().subtract(((app.SdtEntradaRecuentos_SDT_Item)(AV21EntradaRecuentos_SDT.currentItem())).getgxTv_SdtEntradaRecuentos_SDT_Item_Recexirea()) );
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21EntradaRecuentos_SDT", AV21EntradaRecuentos_SDT);
      nGXsfl_63_bak_idx = nGXsfl_63_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV40ManageFiltersExecutionStep, AV78Pgmname, AV26FilterFullText, AV19Emprcod, AV47RecFec, AV53Station, AV29FlagPreMed, AV27FlagCColor, AV42Nalmcc, AV60Val_stk, sPrefix) ;
      nGXsfl_63_idx = nGXsfl_63_bak_idx ;
      sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_632( ) ;
   }

   public void S132( )
   {
      /* 'LASTRECUEN' Routine */
      returnInSub = false ;
      AV48Recfec_last = GXutil.nullDate() ;
      AV50RecHora = GXutil.resetTime( GXutil.nullDate() );
      AV16Diahora = GXutil.serverNow( context, remoteHandle, pr_default) ;
      /* Using cursor H028G2 */
      pr_default.execute(0, new Object[] {AV19Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = H028G2_A396EmprCod[0] ;
         A13455Rechora = H028G2_A13455Rechora[0] ;
         A810RecFec = H028G2_A810RecFec[0] ;
         AV48Recfec_last = A810RecFec ;
         AV50RecHora = A13455Rechora ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV37Invprd = (short)(0) ;
      /* Using cursor H028G3 */
      pr_default.execute(1, new Object[] {AV19Emprcod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = H028G3_A396EmprCod[0] ;
         A8577RecFecHr = H028G3_A8577RecFecHr[0] ;
         AV49Recfechr = A8577RecFecHr ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Recfechr", localUtil.ttoc( AV49Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV37Invprd = (short)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV11CCStkHor = (GXutil.dateCompare(GXutil.nullDate(), AV50RecHora) ? localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") : localUtil.ttoc( AV50RecHora, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11CCStkHor", AV11CCStkHor);
   }

   public void wb_table4_98_28G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_confirmar2_Internalname, tblTabledvelop_confirmpanel_confirmar2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_confirmar2.setProperty("Title", Dvelop_confirmpanel_confirmar2_Title);
         ucDvelop_confirmpanel_confirmar2.setProperty("ConfirmationText", Dvelop_confirmpanel_confirmar2_Confirmationtext);
         ucDvelop_confirmpanel_confirmar2.setProperty("YesButtonCaption", Dvelop_confirmpanel_confirmar2_Yesbuttoncaption);
         ucDvelop_confirmpanel_confirmar2.setProperty("NoButtonCaption", Dvelop_confirmpanel_confirmar2_Nobuttoncaption);
         ucDvelop_confirmpanel_confirmar2.setProperty("CancelButtonCaption", Dvelop_confirmpanel_confirmar2_Cancelbuttoncaption);
         ucDvelop_confirmpanel_confirmar2.setProperty("YesButtonPosition", Dvelop_confirmpanel_confirmar2_Yesbuttonposition);
         ucDvelop_confirmpanel_confirmar2.setProperty("ConfirmType", Dvelop_confirmpanel_confirmar2_Confirmtype);
         ucDvelop_confirmpanel_confirmar2.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_confirmar2_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR2Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR2Container"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_98_28G2e( true) ;
      }
      else
      {
         wb_table4_98_28G2e( false) ;
      }
   }

   public void wb_table3_93_28G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_confirmar_Internalname, tblTabledvelop_confirmpanel_confirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_confirmar.setProperty("Title", Dvelop_confirmpanel_confirmar_Title);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_confirmar_Confirmationtext);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_confirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_confirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_confirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_confirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmType", Dvelop_confirmpanel_confirmar_Confirmtype);
         ucDvelop_confirmpanel_confirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_confirmar_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_93_28G2e( true) ;
      }
      else
      {
         wb_table3_93_28G2e( false) ;
      }
   }

   public void wb_table2_88_28G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_memorizar_Internalname, tblTabledvelop_confirmpanel_memorizar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_memorizar.setProperty("Title", Dvelop_confirmpanel_memorizar_Title);
         ucDvelop_confirmpanel_memorizar.setProperty("ConfirmationText", Dvelop_confirmpanel_memorizar_Confirmationtext);
         ucDvelop_confirmpanel_memorizar.setProperty("YesButtonCaption", Dvelop_confirmpanel_memorizar_Yesbuttoncaption);
         ucDvelop_confirmpanel_memorizar.setProperty("NoButtonCaption", Dvelop_confirmpanel_memorizar_Nobuttoncaption);
         ucDvelop_confirmpanel_memorizar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_memorizar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_memorizar.setProperty("YesButtonPosition", Dvelop_confirmpanel_memorizar_Yesbuttonposition);
         ucDvelop_confirmpanel_memorizar.setProperty("ConfirmType", Dvelop_confirmpanel_memorizar_Confirmtype);
         ucDvelop_confirmpanel_memorizar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_memorizar_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_MEMORIZARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_MEMORIZARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_88_28G2e( true) ;
      }
      else
      {
         wb_table2_88_28G2e( false) ;
      }
   }

   public void wb_table1_23_28G2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV39ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_28_28G2( true) ;
      }
      else
      {
         wb_table5_28_28G2( false) ;
      }
      return  ;
   }

   public void wb_table5_28_28G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_28G2e( true) ;
      }
      else
      {
         wb_table1_23_28G2e( false) ;
      }
   }

   public void wb_table5_28_28G2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'" + sGXsfl_63_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV26FilterFullText, GXutil.rtrim( localUtil.format( AV26FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_EntradaRecuentos___WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_28_28G2e( true) ;
      }
      else
      {
         wb_table5_28_28G2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV19Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Emprcod", AV19Emprcod);
      AV47RecFec = (java.util.Date)getParm(obj,1,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47RecFec", localUtil.format(AV47RecFec, "99/99/99"));
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
      pa28G2( ) ;
      ws28G2( ) ;
      we28G2( ) ;
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
      sCtrlAV19Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV47RecFec = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa28G2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "entradarecuentos___wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa28G2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV19Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Emprcod", AV19Emprcod);
         AV47RecFec = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47RecFec", localUtil.format(AV47RecFec, "99/99/99"));
      }
      wcpOAV19Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV19Emprcod") ;
      wcpOAV47RecFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV47RecFec"), 0) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV19Emprcod, wcpOAV19Emprcod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV47RecFec), GXutil.resetTime(wcpOAV47RecFec)) ) ) )
      {
         setjustcreated();
      }
      wcpOAV19Emprcod = AV19Emprcod ;
      wcpOAV47RecFec = AV47RecFec ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV19Emprcod = httpContext.cgiGet( sPrefix+"AV19Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV19Emprcod) > 0 )
      {
         AV19Emprcod = httpContext.cgiGet( sCtrlAV19Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Emprcod", AV19Emprcod);
      }
      else
      {
         AV19Emprcod = httpContext.cgiGet( sPrefix+"AV19Emprcod_PARM") ;
      }
      sCtrlAV47RecFec = httpContext.cgiGet( sPrefix+"AV47RecFec_CTRL") ;
      if ( GXutil.len( sCtrlAV47RecFec) > 0 )
      {
         AV47RecFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV47RecFec), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47RecFec", localUtil.format(AV47RecFec, "99/99/99"));
      }
      else
      {
         AV47RecFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV47RecFec_PARM"), 0) ;
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
      pa28G2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws28G2( ) ;
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
      ws28G2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19Emprcod_PARM", GXutil.rtrim( AV19Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV19Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19Emprcod_CTRL", GXutil.rtrim( sCtrlAV19Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47RecFec_PARM", localUtil.dtoc( AV47RecFec, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV47RecFec)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47RecFec_CTRL", GXutil.rtrim( sCtrlAV47RecFec));
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
      we28G2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115552557", true, true);
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
      httpContext.AddJavascriptSource("entradarecuentos___wc.js", "?202682115552558", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_632( )
   {
      edtavEntradarecuentos_sdt__prdnum_Internalname = sPrefix+"ENTRADARECUENTOS_SDT__PRDNUM_"+sGXsfl_63_idx ;
      edtavEntradarecuentos_sdt__prdnom_Internalname = sPrefix+"ENTRADARECUENTOS_SDT__PRDNOM_"+sGXsfl_63_idx ;
      edtavEntradarecuentos_sdt__recexiteo_Internalname = sPrefix+"ENTRADARECUENTOS_SDT__RECEXITEO_"+sGXsfl_63_idx ;
      edtavEntradarecuentos_sdt__recexirea_Internalname = sPrefix+"ENTRADARECUENTOS_SDT__RECEXIREA_"+sGXsfl_63_idx ;
      edtavEntradarecuentos_sdt__difer_Internalname = sPrefix+"ENTRADARECUENTOS_SDT__DIFER_"+sGXsfl_63_idx ;
      edtavEntradarecuentos_sdt__reclot_Internalname = sPrefix+"ENTRADARECUENTOS_SDT__RECLOT_"+sGXsfl_63_idx ;
      edtavEntradarecuentos_sdt__prdrec_Internalname = sPrefix+"ENTRADARECUENTOS_SDT__PRDREC_"+sGXsfl_63_idx ;
      cmbavEntradarecuentos_sdt__recestinv.setInternalname( sPrefix+"ENTRADARECUENTOS_SDT__RECESTINV_"+sGXsfl_63_idx );
      edtavEntradarecuentos_sdt__prdpremed_Internalname = sPrefix+"ENTRADARECUENTOS_SDT__PRDPREMED_"+sGXsfl_63_idx ;
      edtavEntradarecuentos_sdt__prdpreact_Internalname = sPrefix+"ENTRADARECUENTOS_SDT__PRDPREACT_"+sGXsfl_63_idx ;
   }

   public void subsflControlProps_fel_632( )
   {
      edtavEntradarecuentos_sdt__prdnum_Internalname = sPrefix+"ENTRADARECUENTOS_SDT__PRDNUM_"+sGXsfl_63_fel_idx ;
      edtavEntradarecuentos_sdt__prdnom_Internalname = sPrefix+"ENTRADARECUENTOS_SDT__PRDNOM_"+sGXsfl_63_fel_idx ;
      edtavEntradarecuentos_sdt__recexiteo_Internalname = sPrefix+"ENTRADARECUENTOS_SDT__RECEXITEO_"+sGXsfl_63_fel_idx ;
      edtavEntradarecuentos_sdt__recexirea_Internalname = sPrefix+"ENTRADARECUENTOS_SDT__RECEXIREA_"+sGXsfl_63_fel_idx ;
      edtavEntradarecuentos_sdt__difer_Internalname = sPrefix+"ENTRADARECUENTOS_SDT__DIFER_"+sGXsfl_63_fel_idx ;
      edtavEntradarecuentos_sdt__reclot_Internalname = sPrefix+"ENTRADARECUENTOS_SDT__RECLOT_"+sGXsfl_63_fel_idx ;
      edtavEntradarecuentos_sdt__prdrec_Internalname = sPrefix+"ENTRADARECUENTOS_SDT__PRDREC_"+sGXsfl_63_fel_idx ;
      cmbavEntradarecuentos_sdt__recestinv.setInternalname( sPrefix+"ENTRADARECUENTOS_SDT__RECESTINV_"+sGXsfl_63_fel_idx );
      edtavEntradarecuentos_sdt__prdpremed_Internalname = sPrefix+"ENTRADARECUENTOS_SDT__PRDPREMED_"+sGXsfl_63_fel_idx ;
      edtavEntradarecuentos_sdt__prdpreact_Internalname = sPrefix+"ENTRADARECUENTOS_SDT__PRDPREACT_"+sGXsfl_63_fel_idx ;
   }

   public void sendrow_632( )
   {
      subsflControlProps_632( ) ;
      wb28G0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_63_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_63_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_63_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEntradarecuentos_sdt__prdnum_Internalname,GXutil.rtrim( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtEntradaRecuentos_SDT_Item_Prdnum()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEntradarecuentos_sdt__prdnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavEntradarecuentos_sdt__prdnum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEntradarecuentos_sdt__prdnom_Internalname,GXutil.rtrim( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtEntradaRecuentos_SDT_Item_Prdnom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEntradarecuentos_sdt__prdnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavEntradarecuentos_sdt__prdnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEntradarecuentos_sdt__recexiteo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtEntradaRecuentos_SDT_Item_Recexiteo(), (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavEntradarecuentos_sdt__recexiteo_Enabled!=0) ? localUtil.format( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtEntradaRecuentos_SDT_Item_Recexiteo(), "ZZZZZZ9.9999") : localUtil.format( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtEntradaRecuentos_SDT_Item_Recexiteo(), "ZZZZZZ9.9999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEntradarecuentos_sdt__recexiteo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavEntradarecuentos_sdt__recexiteo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavEntradarecuentos_sdt__recexirea_Enabled!=0)&&(edtavEntradarecuentos_sdt__recexirea_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 67,'"+sPrefix+"',false,'"+sGXsfl_63_idx+"',63)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEntradarecuentos_sdt__recexirea_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtEntradaRecuentos_SDT_Item_Recexirea(), (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtEntradaRecuentos_SDT_Item_Recexirea(), "ZZZZZZ9.9999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavEntradarecuentos_sdt__recexirea_Enabled!=0)&&(edtavEntradarecuentos_sdt__recexirea_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,67);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEntradarecuentos_sdt__recexirea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavEntradarecuentos_sdt__recexirea_Columnclass,edtavEntradarecuentos_sdt__recexirea_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEntradarecuentos_sdt__difer_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtEntradaRecuentos_SDT_Item_Difer(), (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavEntradarecuentos_sdt__difer_Enabled!=0) ? localUtil.format( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtEntradaRecuentos_SDT_Item_Difer(), "ZZZZZZ9.9999") : localUtil.format( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtEntradaRecuentos_SDT_Item_Difer(), "ZZZZZZ9.9999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEntradarecuentos_sdt__difer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavEntradarecuentos_sdt__difer_Columnclass,edtavEntradarecuentos_sdt__difer_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavEntradarecuentos_sdt__difer_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavEntradarecuentos_sdt__reclot_Enabled!=0)&&(edtavEntradarecuentos_sdt__reclot_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 69,'"+sPrefix+"',false,'"+sGXsfl_63_idx+"',63)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEntradarecuentos_sdt__reclot_Internalname,GXutil.rtrim( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtEntradaRecuentos_SDT_Item_Reclot()),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavEntradarecuentos_sdt__reclot_Enabled!=0)&&(edtavEntradarecuentos_sdt__reclot_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,69);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEntradarecuentos_sdt__reclot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavEntradarecuentos_sdt__reclot_Columnclass,edtavEntradarecuentos_sdt__reclot_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEntradarecuentos_sdt__prdrec_Internalname,GXutil.rtrim( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtEntradaRecuentos_SDT_Item_Prdrec()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEntradarecuentos_sdt__prdrec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavEntradarecuentos_sdt__prdrec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( cmbavEntradarecuentos_sdt__recestinv.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ENTRADARECUENTOS_SDT__RECESTINV_" + sGXsfl_63_idx ;
            cmbavEntradarecuentos_sdt__recestinv.setName( GXCCtl );
            cmbavEntradarecuentos_sdt__recestinv.setWebtags( "" );
            cmbavEntradarecuentos_sdt__recestinv.addItem("0", httpContext.getMessage( "En Recuento", ""), (short)(0));
            cmbavEntradarecuentos_sdt__recestinv.addItem("1", httpContext.getMessage( "Finalizado", ""), (short)(0));
            if ( cmbavEntradarecuentos_sdt__recestinv.getItemCount() > 0 )
            {
               if ( ( AV67GXV1 > 0 ) && ( AV21EntradaRecuentos_SDT.size() >= AV67GXV1 ) && (0==((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtEntradaRecuentos_SDT_Item_Recestinv()) )
               {
                  ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)).setgxTv_SdtEntradaRecuentos_SDT_Item_Recestinv( (byte)(GXutil.lval( cmbavEntradarecuentos_sdt__recestinv.getValidValue(GXutil.trim( GXutil.str( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtEntradaRecuentos_SDT_Item_Recestinv(), 1, 0))))) );
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavEntradarecuentos_sdt__recestinv,cmbavEntradarecuentos_sdt__recestinv.getInternalname(),GXutil.trim( GXutil.str( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtEntradaRecuentos_SDT_Item_Recestinv(), 1, 0)),Integer.valueOf(1),cmbavEntradarecuentos_sdt__recestinv.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(0),Integer.valueOf(cmbavEntradarecuentos_sdt__recestinv.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavEntradarecuentos_sdt__recestinv.setValue( GXutil.trim( GXutil.str( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtEntradaRecuentos_SDT_Item_Recestinv(), 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavEntradarecuentos_sdt__recestinv.getInternalname(), "Values", cmbavEntradarecuentos_sdt__recestinv.ToJavascriptSource(), !bGXsfl_63_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEntradarecuentos_sdt__prdpremed_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtEntradaRecuentos_SDT_Item_Prdpremed(), (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavEntradarecuentos_sdt__prdpremed_Enabled!=0) ? localUtil.format( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtEntradaRecuentos_SDT_Item_Prdpremed(), "ZZZZZZZ9.999") : localUtil.format( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtEntradaRecuentos_SDT_Item_Prdpremed(), "ZZZZZZZ9.999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEntradarecuentos_sdt__prdpremed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavEntradarecuentos_sdt__prdpremed_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEntradarecuentos_sdt__prdpreact_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtEntradaRecuentos_SDT_Item_Prdpreact(), (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavEntradarecuentos_sdt__prdpreact_Enabled!=0) ? localUtil.format( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtEntradaRecuentos_SDT_Item_Prdpreact(), "ZZZZZZZ9.999") : localUtil.format( ((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtEntradaRecuentos_SDT_Item_Prdpreact(), "ZZZZZZZ9.999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEntradarecuentos_sdt__prdpreact_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavEntradarecuentos_sdt__prdpreact_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes28G2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_63_idx = ((subGrid_Islastpage==1)&&(nGXsfl_63_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_63_idx+1) ;
         sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_632( ) ;
      }
      /* End function sendrow_632 */
   }

   public void startgridcontrol63( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"63\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Exis. Teo. Alm.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Exis. Real Alm.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Diferencia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rec.?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Est. Inv.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio Medio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio actual", "")) ;
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
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEntradarecuentos_sdt__prdnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEntradarecuentos_sdt__prdnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEntradarecuentos_sdt__recexiteo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavEntradarecuentos_sdt__recexirea_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavEntradarecuentos_sdt__recexirea_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavEntradarecuentos_sdt__difer_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavEntradarecuentos_sdt__difer_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEntradarecuentos_sdt__difer_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavEntradarecuentos_sdt__reclot_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavEntradarecuentos_sdt__reclot_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEntradarecuentos_sdt__prdrec_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbavEntradarecuentos_sdt__recestinv.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEntradarecuentos_sdt__prdpremed_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEntradarecuentos_sdt__prdpreact_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      bttBtnmemorizar_Internalname = sPrefix+"BTNMEMORIZAR" ;
      bttBtnconfirmar_Internalname = sPrefix+"BTNCONFIRMAR" ;
      bttBtnconfirmar2_Internalname = sPrefix+"BTNCONFIRMAR2" ;
      bttBtncerrar_Internalname = sPrefix+"BTNCERRAR" ;
      Barradeprogreso_Internalname = sPrefix+"BARRADEPROGRESO" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      edtavEntradarecuentos_sdt__prdnum_Internalname = sPrefix+"ENTRADARECUENTOS_SDT__PRDNUM" ;
      edtavEntradarecuentos_sdt__prdnom_Internalname = sPrefix+"ENTRADARECUENTOS_SDT__PRDNOM" ;
      edtavEntradarecuentos_sdt__recexiteo_Internalname = sPrefix+"ENTRADARECUENTOS_SDT__RECEXITEO" ;
      edtavEntradarecuentos_sdt__recexirea_Internalname = sPrefix+"ENTRADARECUENTOS_SDT__RECEXIREA" ;
      edtavEntradarecuentos_sdt__difer_Internalname = sPrefix+"ENTRADARECUENTOS_SDT__DIFER" ;
      edtavEntradarecuentos_sdt__reclot_Internalname = sPrefix+"ENTRADARECUENTOS_SDT__RECLOT" ;
      edtavEntradarecuentos_sdt__prdrec_Internalname = sPrefix+"ENTRADARECUENTOS_SDT__PRDREC" ;
      cmbavEntradarecuentos_sdt__recestinv.setInternalname( sPrefix+"ENTRADARECUENTOS_SDT__RECESTINV" );
      edtavEntradarecuentos_sdt__prdpremed_Internalname = sPrefix+"ENTRADARECUENTOS_SDT__PRDPREMED" ;
      edtavEntradarecuentos_sdt__prdpreact_Internalname = sPrefix+"ENTRADARECUENTOS_SDT__PRDPREACT" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Innewwindow1_Internalname = sPrefix+"INNEWWINDOW1" ;
      Dvelop_confirmpanel_memorizar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_MEMORIZAR" ;
      tblTabledvelop_confirmpanel_memorizar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_MEMORIZAR" ;
      Dvelop_confirmpanel_confirmar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR" ;
      tblTabledvelop_confirmpanel_confirmar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_CONFIRMAR" ;
      Dvelop_confirmpanel_confirmar2_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR2" ;
      tblTabledvelop_confirmpanel_confirmar2_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_CONFIRMAR2" ;
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
      edtavEntradarecuentos_sdt__prdpreact_Jsonclick = "" ;
      edtavEntradarecuentos_sdt__prdpreact_Enabled = 0 ;
      edtavEntradarecuentos_sdt__prdpremed_Jsonclick = "" ;
      edtavEntradarecuentos_sdt__prdpremed_Enabled = 0 ;
      cmbavEntradarecuentos_sdt__recestinv.setJsonclick( "" );
      cmbavEntradarecuentos_sdt__recestinv.setEnabled( 0 );
      edtavEntradarecuentos_sdt__prdrec_Jsonclick = "" ;
      edtavEntradarecuentos_sdt__prdrec_Enabled = 0 ;
      edtavEntradarecuentos_sdt__reclot_Jsonclick = "" ;
      edtavEntradarecuentos_sdt__reclot_Columnheaderclass = "" ;
      edtavEntradarecuentos_sdt__reclot_Columnclass = "WWColumn" ;
      edtavEntradarecuentos_sdt__reclot_Visible = -1 ;
      edtavEntradarecuentos_sdt__reclot_Enabled = 1 ;
      edtavEntradarecuentos_sdt__difer_Jsonclick = "" ;
      edtavEntradarecuentos_sdt__difer_Columnheaderclass = "" ;
      edtavEntradarecuentos_sdt__difer_Columnclass = "WWColumn" ;
      edtavEntradarecuentos_sdt__difer_Enabled = 0 ;
      edtavEntradarecuentos_sdt__recexirea_Jsonclick = "" ;
      edtavEntradarecuentos_sdt__recexirea_Columnheaderclass = "" ;
      edtavEntradarecuentos_sdt__recexirea_Columnclass = "WWColumn" ;
      edtavEntradarecuentos_sdt__recexirea_Visible = -1 ;
      edtavEntradarecuentos_sdt__recexirea_Enabled = 1 ;
      edtavEntradarecuentos_sdt__recexiteo_Jsonclick = "" ;
      edtavEntradarecuentos_sdt__recexiteo_Enabled = 0 ;
      edtavEntradarecuentos_sdt__prdnom_Jsonclick = "" ;
      edtavEntradarecuentos_sdt__prdnom_Enabled = 0 ;
      edtavEntradarecuentos_sdt__prdnum_Jsonclick = "" ;
      edtavEntradarecuentos_sdt__prdnum_Enabled = 0 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavEntradarecuentos_sdt__prdpreact_Enabled = -1 ;
      edtavEntradarecuentos_sdt__prdpremed_Enabled = -1 ;
      cmbavEntradarecuentos_sdt__recestinv.setEnabled( -1 );
      edtavEntradarecuentos_sdt__prdrec_Enabled = -1 ;
      edtavEntradarecuentos_sdt__difer_Enabled = -1 ;
      edtavEntradarecuentos_sdt__recexiteo_Enabled = -1 ;
      edtavEntradarecuentos_sdt__prdnom_Enabled = -1 ;
      edtavEntradarecuentos_sdt__prdnum_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Dvelop_confirmpanel_confirmar2_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar2_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar2_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar2_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar2_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar2_Confirmationtext = "¿Confirmar 2 vez?" ;
      Dvelop_confirmpanel_confirmar2_Title = "" ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "¿Confirma?" ;
      Dvelop_confirmpanel_confirmar_Title = "" ;
      Dvelop_confirmpanel_memorizar_Confirmtype = "1" ;
      Dvelop_confirmpanel_memorizar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_memorizar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_memorizar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_memorizar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_memorizar_Confirmationtext = "¿Desea Memorizar Cant. Real?" ;
      Dvelop_confirmpanel_memorizar_Title = "" ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
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
      Dvpanel_unnamedtable1_Title = "" ;
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
      GXCCtl = "ENTRADARECUENTOS_SDT__RECESTINV_" + sGXsfl_63_idx ;
      cmbavEntradarecuentos_sdt__recestinv.setName( GXCCtl );
      cmbavEntradarecuentos_sdt__recestinv.setWebtags( "" );
      cmbavEntradarecuentos_sdt__recestinv.addItem("0", httpContext.getMessage( "En Recuento", ""), (short)(0));
      cmbavEntradarecuentos_sdt__recestinv.addItem("1", httpContext.getMessage( "Finalizado", ""), (short)(0));
      if ( cmbavEntradarecuentos_sdt__recestinv.getItemCount() > 0 )
      {
         if ( ( AV67GXV1 > 0 ) && ( AV21EntradaRecuentos_SDT.size() >= AV67GXV1 ) && (0==((app.SdtEntradaRecuentos_SDT_Item)AV21EntradaRecuentos_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtEntradaRecuentos_SDT_Item_Recestinv()) )
         {
         }
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV21EntradaRecuentos_SDT',fld:'vENTRADARECUENTOS_SDT',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63},{av:'sPrefix'},{av:'AV40ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV19Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV47RecFec',fld:'vRECFEC',pic:''},{av:'AV53Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV29FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV27FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV42Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV60Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV40ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV30GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV31GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'ENTRADARECUENTOS_SDT__RECEXIREA',prop:'Columnheaderclass'},{ctrl:'ENTRADARECUENTOS_SDT__DIFER',prop:'Columnheaderclass'},{ctrl:'ENTRADARECUENTOS_SDT__RECLOT',prop:'Columnheaderclass'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV32GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1528G2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV21EntradaRecuentos_SDT',fld:'vENTRADARECUENTOS_SDT',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV40ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV19Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV47RecFec',fld:'vRECFEC',pic:''},{av:'AV53Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV29FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV27FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV42Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV60Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1628G2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV21EntradaRecuentos_SDT',fld:'vENTRADARECUENTOS_SDT',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV40ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV19Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV47RecFec',fld:'vRECFEC',pic:''},{av:'AV53Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV29FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV27FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV42Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV60Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2528G2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{ctrl:'ENTRADARECUENTOS_SDT__RECEXIREA',prop:'Columnclass'},{ctrl:'ENTRADARECUENTOS_SDT__DIFER',prop:'Columnclass'},{ctrl:'ENTRADARECUENTOS_SDT__RECLOT',prop:'Columnclass'}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1428G2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV21EntradaRecuentos_SDT',fld:'vENTRADARECUENTOS_SDT',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV40ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV19Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV47RecFec',fld:'vRECFEC',pic:''},{av:'AV53Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV29FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV27FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV42Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV60Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV32GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV40ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV32GridState',fld:'vGRIDSTATE',pic:''},{av:'AV26FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV31GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'ENTRADARECUENTOS_SDT__RECEXIREA',prop:'Columnheaderclass'},{ctrl:'ENTRADARECUENTOS_SDT__DIFER',prop:'Columnheaderclass'},{ctrl:'ENTRADARECUENTOS_SDT__RECLOT',prop:'Columnheaderclass'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOMEMORIZAR'","{handler:'e1128G1',iparms:[{av:'AV21EntradaRecuentos_SDT',fld:'vENTRADARECUENTOS_SDT',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63}]");
      setEventMetadata("'DOMEMORIZAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_MEMORIZAR.CLOSE","{handler:'e1728G2',iparms:[{av:'Dvelop_confirmpanel_memorizar_Result',ctrl:'DVELOP_CONFIRMPANEL_MEMORIZAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV21EntradaRecuentos_SDT',fld:'vENTRADARECUENTOS_SDT',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV40ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV19Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV47RecFec',fld:'vRECFEC',pic:''},{av:'AV53Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV29FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV27FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV42Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV60Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'AV49Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_MEMORIZAR.CLOSE",",oparms:[{av:'AV49Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'},{av:'AV47RecFec',fld:'vRECFEC',pic:''},{av:'AV19Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV21EntradaRecuentos_SDT',fld:'vENTRADARECUENTOS_SDT',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63},{av:'AV40ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV30GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV31GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'ENTRADARECUENTOS_SDT__RECEXIREA',prop:'Columnheaderclass'},{ctrl:'ENTRADARECUENTOS_SDT__DIFER',prop:'Columnheaderclass'},{ctrl:'ENTRADARECUENTOS_SDT__RECLOT',prop:'Columnheaderclass'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV32GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e1228G1',iparms:[{av:'AV21EntradaRecuentos_SDT',fld:'vENTRADARECUENTOS_SDT',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'Dvelop_confirmpanel_confirmar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'ConfirmationText'}]}");
      setEventMetadata("'DOCONFIRMAR2'","{handler:'e1328G1',iparms:[]");
      setEventMetadata("'DOCONFIRMAR2'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR2.CLOSE","{handler:'e1828G2',iparms:[{av:'Dvelop_confirmpanel_confirmar2_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR2',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV21EntradaRecuentos_SDT',fld:'vENTRADARECUENTOS_SDT',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV40ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV19Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV47RecFec',fld:'vRECFEC',pic:''},{av:'AV53Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV29FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV27FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV42Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV60Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'AV59UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV49Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'},{av:'AV51RecUbic',fld:'vRECUBIC',pic:''},{av:'AV11CCStkHor',fld:'vCCSTKHOR',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR2.CLOSE",",oparms:[{av:'AV47RecFec',fld:'vRECFEC',pic:''},{av:'AV19Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV51RecUbic',fld:'vRECUBIC',pic:''},{av:'AV49Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'},{av:'AV11CCStkHor',fld:'vCCSTKHOR',pic:''},{av:'AV59UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV21EntradaRecuentos_SDT',fld:'vENTRADARECUENTOS_SDT',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63},{av:'AV40ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV30GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV31GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'ENTRADARECUENTOS_SDT__RECEXIREA',prop:'Columnheaderclass'},{ctrl:'ENTRADARECUENTOS_SDT__DIFER',prop:'Columnheaderclass'},{ctrl:'ENTRADARECUENTOS_SDT__RECLOT',prop:'Columnheaderclass'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV32GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1928G2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e2028G2',iparms:[{av:'AV21EntradaRecuentos_SDT',fld:'vENTRADARECUENTOS_SDT',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e2128G2',iparms:[{av:'AV21EntradaRecuentos_SDT',fld:'vENTRADARECUENTOS_SDT',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e2228G2',iparms:[{av:'AV21EntradaRecuentos_SDT',fld:'vENTRADARECUENTOS_SDT',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("ENTRADARECUENTOS_SDT__RECEXIREA.CONTROLVALUECHANGED","{handler:'e2628G2',iparms:[{av:'AV21EntradaRecuentos_SDT',fld:'vENTRADARECUENTOS_SDT',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV40ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV19Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV47RecFec',fld:'vRECFEC',pic:''},{av:'AV53Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV29FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV27FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV42Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV60Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTRADARECUENTOS_SDT__RECEXIREA.CONTROLVALUECHANGED",",oparms:[{av:'AV21EntradaRecuentos_SDT',fld:'vENTRADARECUENTOS_SDT',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63}]}");
      setEventMetadata("VALIDV_GXV8","{handler:'validv_Gxv8',iparms:[]");
      setEventMetadata("VALIDV_GXV8",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv11',iparms:[]");
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
      wcpOAV19Emprcod = "" ;
      wcpOAV47RecFec = GXutil.nullDate() ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_memorizar_Result = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      Dvelop_confirmpanel_confirmar2_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV19Emprcod = "" ;
      AV47RecFec = GXutil.nullDate() ;
      AV78Pgmname = "" ;
      AV26FilterFullText = "" ;
      AV53Station = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV21EntradaRecuentos_SDT = new GXBaseCollection<app.SdtEntradaRecuentos_SDT_Item>(app.SdtEntradaRecuentos_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV39ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV49Recfechr = GXutil.resetTime( GXutil.nullDate() );
      AV59UsurCod = "" ;
      AV51RecUbic = "" ;
      AV11CCStkHor = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportreport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      bttBtnmemorizar_Jsonclick = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtnconfirmar2_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      AV20EmprNom = "" ;
      AV61WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV41ManageFiltersXml = "" ;
      GXt_char1 = "" ;
      AV62ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      AV24ExcelFilename = "" ;
      AV23ErrorMessage = "" ;
      AV63EntradaRecuentos_SDT_json = "" ;
      AV64WebSession = httpContext.getWebSession();
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection[1] ;
      AV22EntradaRecuentos_SDT_item = new app.SdtEntradaRecuentos_SDT_Item(remoteHandle, context);
      AV6RecExiRea = DecimalUtil.ZERO ;
      AV5RecExiRcc = DecimalUtil.ZERO ;
      AV44Prdnum = "" ;
      AV35Inc_obs = "" ;
      AV45Precio_mov = DecimalUtil.ZERO ;
      AV17Difer = DecimalUtil.ZERO ;
      AV18DiferCC = DecimalUtil.ZERO ;
      AV7Reclot = "" ;
      AV25Fecha = GXutil.nullDate() ;
      AV9CCStkCanE = DecimalUtil.ZERO ;
      AV10CCStkCanS = DecimalUtil.ZERO ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_int21 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int8 = new int[1] ;
      GXv_char20 = new String[1] ;
      GXv_char19 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int25 = new short[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char24 = new String[1] ;
      GXv_char23 = new String[1] ;
      GXv_char22 = new String[1] ;
      GXv_date14 = new java.util.Date[1] ;
      GXv_dtime18 = new java.util.Date[1] ;
      GXv_char28 = new String[1] ;
      GXv_decimal27 = new java.math.BigDecimal[1] ;
      GXv_decimal26 = new java.math.BigDecimal[1] ;
      GXv_char29 = new String[1] ;
      GXt_objcol_SdtEntradaRecuentos_SDT_Item9 = new GXBaseCollection<app.SdtEntradaRecuentos_SDT_Item>(app.SdtEntradaRecuentos_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_objcol_SdtEntradaRecuentos_SDT_Item10 = new GXBaseCollection[1] ;
      AV52Session = httpContext.getWebSession();
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState30 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV48Recfec_last = GXutil.nullDate() ;
      AV50RecHora = GXutil.resetTime( GXutil.nullDate() );
      AV16Diahora = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      H028G2_A719PrdNum = new String[] {""} ;
      H028G2_A396EmprCod = new String[] {""} ;
      H028G2_A13455Rechora = new java.util.Date[] {GXutil.nullDate()} ;
      H028G2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      A396EmprCod = "" ;
      A13455Rechora = GXutil.resetTime( GXutil.nullDate() );
      A810RecFec = GXutil.nullDate() ;
      H028G3_A719PrdNum = new String[] {""} ;
      H028G3_A396EmprCod = new String[] {""} ;
      H028G3_A8577RecFecHr = new java.util.Date[] {GXutil.nullDate()} ;
      A8577RecFecHr = GXutil.resetTime( GXutil.nullDate() );
      ucDvelop_confirmpanel_confirmar2 = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_memorizar = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV19Emprcod = "" ;
      sCtrlAV47RecFec = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.entradarecuentos___wc__default(),
         new Object[] {
             new Object[] {
            H028G2_A719PrdNum, H028G2_A396EmprCod, H028G2_A13455Rechora, H028G2_A810RecFec
            }
            , new Object[] {
            H028G3_A719PrdNum, H028G3_A396EmprCod, H028G3_A8577RecFecHr
            }
         }
      );
      AV78Pgmname = "EntradaRecuentos___WC" ;
      /* GeneXus formulas. */
      AV78Pgmname = "EntradaRecuentos___WC" ;
      Gx_err = (short)(0) ;
      edtavEntradarecuentos_sdt__prdnum_Enabled = 0 ;
      edtavEntradarecuentos_sdt__prdnom_Enabled = 0 ;
      edtavEntradarecuentos_sdt__recexiteo_Enabled = 0 ;
      edtavEntradarecuentos_sdt__difer_Enabled = 0 ;
      edtavEntradarecuentos_sdt__prdrec_Enabled = 0 ;
      cmbavEntradarecuentos_sdt__recestinv.setEnabled( 0 );
      edtavEntradarecuentos_sdt__prdpremed_Enabled = 0 ;
      edtavEntradarecuentos_sdt__prdpreact_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV40ManageFiltersExecutionStep ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
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
   private short AV29FlagPreMed ;
   private short AV42Nalmcc ;
   private short AV60Val_stk ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV46Precio_stk ;
   private short AV8Artextil ;
   private short AV36Intexco ;
   private short AV57Ubicacion ;
   private short AV28FlagCcs ;
   private short AV54TotDet ;
   private short GXv_int25[] ;
   private short AV37Invprd ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_63 ;
   private int nGXsfl_63_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV67GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavEntradarecuentos_sdt__prdnum_Enabled ;
   private int edtavEntradarecuentos_sdt__prdnom_Enabled ;
   private int edtavEntradarecuentos_sdt__recexiteo_Enabled ;
   private int edtavEntradarecuentos_sdt__difer_Enabled ;
   private int edtavEntradarecuentos_sdt__prdrec_Enabled ;
   private int edtavEntradarecuentos_sdt__prdpremed_Enabled ;
   private int edtavEntradarecuentos_sdt__prdpreact_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_63_fel_idx=1 ;
   private int GXt_int7 ;
   private int AV43PageToGo ;
   private int nGXsfl_63_bak_idx=1 ;
   private int AV79GXV12 ;
   private int AV80GXV13 ;
   private int GXv_int21[] ;
   private int GXv_int8[] ;
   private int AV81GXV14 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavEntradarecuentos_sdt__recexirea_Enabled ;
   private int edtavEntradarecuentos_sdt__recexirea_Visible ;
   private int edtavEntradarecuentos_sdt__reclot_Enabled ;
   private int edtavEntradarecuentos_sdt__reclot_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV27FlagCColor ;
   private long AV30GridCurrentPage ;
   private long AV31GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV6RecExiRea ;
   private java.math.BigDecimal AV5RecExiRcc ;
   private java.math.BigDecimal AV45Precio_mov ;
   private java.math.BigDecimal AV17Difer ;
   private java.math.BigDecimal AV18DiferCC ;
   private java.math.BigDecimal AV9CCStkCanE ;
   private java.math.BigDecimal AV10CCStkCanS ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal27[] ;
   private java.math.BigDecimal GXv_decimal26[] ;
   private String wcpOAV19Emprcod ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_memorizar_Result ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String Dvelop_confirmpanel_confirmar2_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV19Emprcod ;
   private String sGXsfl_63_idx="0001" ;
   private String AV78Pgmname ;
   private String AV53Station ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV59UsurCod ;
   private String AV51RecUbic ;
   private String AV11CCStkHor ;
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
   private String Innewwindow1_Width ;
   private String Innewwindow1_Height ;
   private String Innewwindow1_Target ;
   private String Dvelop_confirmpanel_memorizar_Title ;
   private String Dvelop_confirmpanel_memorizar_Confirmationtext ;
   private String Dvelop_confirmpanel_memorizar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_memorizar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_memorizar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_memorizar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_memorizar_Confirmtype ;
   private String Dvelop_confirmpanel_confirmar_Title ;
   private String Dvelop_confirmpanel_confirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_confirmar_Confirmtype ;
   private String Dvelop_confirmpanel_confirmar2_Title ;
   private String Dvelop_confirmpanel_confirmar2_Confirmationtext ;
   private String Dvelop_confirmpanel_confirmar2_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar2_Nobuttoncaption ;
   private String Dvelop_confirmpanel_confirmar2_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar2_Yesbuttonposition ;
   private String Dvelop_confirmpanel_confirmar2_Confirmtype ;
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
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtnmemorizar_Internalname ;
   private String bttBtnmemorizar_Jsonclick ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtnconfirmar2_Internalname ;
   private String bttBtnconfirmar2_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String Barradeprogreso_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String edtavEntradarecuentos_sdt__prdnum_Internalname ;
   private String edtavEntradarecuentos_sdt__prdnom_Internalname ;
   private String edtavEntradarecuentos_sdt__recexiteo_Internalname ;
   private String edtavEntradarecuentos_sdt__difer_Internalname ;
   private String edtavEntradarecuentos_sdt__prdrec_Internalname ;
   private String edtavEntradarecuentos_sdt__prdpremed_Internalname ;
   private String edtavEntradarecuentos_sdt__prdpreact_Internalname ;
   private String sGXsfl_63_fel_idx="0001" ;
   private String hsh ;
   private String AV20EmprNom ;
   private String edtavEntradarecuentos_sdt__recexirea_Columnheaderclass ;
   private String edtavEntradarecuentos_sdt__recexirea_Internalname ;
   private String edtavEntradarecuentos_sdt__difer_Columnheaderclass ;
   private String edtavEntradarecuentos_sdt__reclot_Columnheaderclass ;
   private String edtavEntradarecuentos_sdt__reclot_Internalname ;
   private String edtavEntradarecuentos_sdt__recexirea_Columnclass ;
   private String edtavEntradarecuentos_sdt__difer_Columnclass ;
   private String edtavEntradarecuentos_sdt__reclot_Columnclass ;
   private String GXt_char1 ;
   private String AV44Prdnum ;
   private String AV7Reclot ;
   private String GXv_char20[] ;
   private String GXv_char19[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char24[] ;
   private String GXv_char23[] ;
   private String GXv_char22[] ;
   private String GXv_char28[] ;
   private String GXv_char29[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String tblTabledvelop_confirmpanel_confirmar2_Internalname ;
   private String Dvelop_confirmpanel_confirmar2_Internalname ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String tblTabledvelop_confirmpanel_memorizar_Internalname ;
   private String Dvelop_confirmpanel_memorizar_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV19Emprcod ;
   private String sCtrlAV47RecFec ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavEntradarecuentos_sdt__prdnum_Jsonclick ;
   private String edtavEntradarecuentos_sdt__prdnom_Jsonclick ;
   private String edtavEntradarecuentos_sdt__recexiteo_Jsonclick ;
   private String edtavEntradarecuentos_sdt__recexirea_Jsonclick ;
   private String edtavEntradarecuentos_sdt__difer_Jsonclick ;
   private String edtavEntradarecuentos_sdt__reclot_Jsonclick ;
   private String edtavEntradarecuentos_sdt__prdrec_Jsonclick ;
   private String GXCCtl ;
   private String edtavEntradarecuentos_sdt__prdpremed_Jsonclick ;
   private String edtavEntradarecuentos_sdt__prdpreact_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV49Recfechr ;
   private java.util.Date GXv_dtime18[] ;
   private java.util.Date AV50RecHora ;
   private java.util.Date AV16Diahora ;
   private java.util.Date A13455Rechora ;
   private java.util.Date A8577RecFecHr ;
   private java.util.Date wcpOAV47RecFec ;
   private java.util.Date AV47RecFec ;
   private java.util.Date AV25Fecha ;
   private java.util.Date GXv_date14[] ;
   private java.util.Date AV48Recfec_last ;
   private java.util.Date A810RecFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_63_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV63 ;
   private boolean gx_refresh_fired ;
   private String AV41ManageFiltersXml ;
   private String AV63EntradaRecuentos_SDT_json ;
   private String AV26FilterFullText ;
   private String AV24ExcelFilename ;
   private String AV23ErrorMessage ;
   private String AV35Inc_obs ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV52Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar2 ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_memorizar ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavEntradarecuentos_sdt__recestinv ;
   private IDataStoreProvider pr_default ;
   private String[] H028G2_A719PrdNum ;
   private String[] H028G2_A396EmprCod ;
   private java.util.Date[] H028G2_A13455Rechora ;
   private java.util.Date[] H028G2_A810RecFec ;
   private String[] H028G3_A719PrdNum ;
   private String[] H028G3_A396EmprCod ;
   private java.util.Date[] H028G3_A8577RecFecHr ;
   private com.genexus.webpanels.WebSession AV64WebSession ;
   private GXBaseCollection<app.SdtEntradaRecuentos_SDT_Item> AV21EntradaRecuentos_SDT ;
   private GXBaseCollection<app.SdtEntradaRecuentos_SDT_Item> GXt_objcol_SdtEntradaRecuentos_SDT_Item9 ;
   private GXBaseCollection<app.SdtEntradaRecuentos_SDT_Item> GXv_objcol_SdtEntradaRecuentos_SDT_Item10[] ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV39ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[] ;
   private app.SdtEntradaRecuentos_SDT_Item AV22EntradaRecuentos_SDT_item ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState30[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV61WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV62ProgressIndicator ;
}

final  class entradarecuentos___wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H028G2", "SELECT * FROM (SELECT PrdNum, EmprCod, Rechora, RecFec FROM TXPRECUEN WHERE EmprCod = ? ORDER BY EmprCod, RecFec DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H028G3", "SELECT * FROM (SELECT PrdNum, EmprCod, RecFecHr FROM TXPINVPRD WHERE EmprCod = ? ORDER BY EmprCod, RecFecHr DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

