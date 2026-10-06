package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcenviodeensayoacliente_impl extends GXWebComponent
{
   public wcenviodeensayoacliente_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcenviodeensayoacliente_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcenviodeensayoacliente_impl.class ));
   }

   public wcenviodeensayoacliente_impl( int remoteHandle ,
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
      chkavEnviodeensayoacliente_sdt__selected = UIFactory.getCheckbox(this);
      chkavEnviodeensayoacliente_sdt__eliminar = UIFactory.getCheckbox(this);
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
               AV24Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Emprcod", AV24Emprcod);
               AV15Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Clicod), 6, 0));
               AV47Lb_Cartaz = httpContext.GetPar( "Lb_Cartaz") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Lb_Cartaz", AV47Lb_Cartaz);
               AV48Lb_ColNom = httpContext.GetPar( "Lb_ColNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48Lb_ColNom", AV48Lb_ColNom);
               AV55Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55Lb_numero), 8, 0));
               AV51Lb_FechaEfrom = localUtil.parseDateParm( httpContext.GetPar( "Lb_FechaEfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Lb_FechaEfrom", localUtil.format(AV51Lb_FechaEfrom, "99/99/99"));
               AV54Lb_FechaEto = localUtil.parseDateParm( httpContext.GetPar( "Lb_FechaEto")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54Lb_FechaEto", localUtil.format(AV54Lb_FechaEto, "99/99/99"));
               AV52Lb_FechaEn = localUtil.parseDateParm( httpContext.GetPar( "Lb_FechaEn")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52Lb_FechaEn", localUtil.format(AV52Lb_FechaEn, "99/99/99"));
               AV50Lb_estado = (byte)(GXutil.lval( httpContext.GetPar( "Lb_estado"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50Lb_estado", GXutil.str( AV50Lb_estado, 1, 0));
               AV14Carvema = (short)(GXutil.lval( httpContext.GetPar( "Carvema"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Carvema", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Carvema), 4, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV24Emprcod,Integer.valueOf(AV15Clicod),AV47Lb_Cartaz,AV48Lb_ColNom,Integer.valueOf(AV55Lb_numero),AV51Lb_FechaEfrom,AV54Lb_FechaEto,AV52Lb_FechaEn,Byte.valueOf(AV50Lb_estado),Short.valueOf(AV14Carvema)});
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
      nRC_GXsfl_79 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_79"))) ;
      nGXsfl_79_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_79_idx"))) ;
      sGXsfl_79_idx = httpContext.GetPar( "sGXsfl_79_idx") ;
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
      AV59ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV18ColumnsSelector);
      AV24Emprcod = httpContext.GetPar( "Emprcod") ;
      AV101Pgmname = httpContext.GetPar( "Pgmname") ;
      AV31FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV15Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
      AV47Lb_Cartaz = httpContext.GetPar( "Lb_Cartaz") ;
      AV48Lb_ColNom = httpContext.GetPar( "Lb_ColNom") ;
      AV55Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
      AV51Lb_FechaEfrom = localUtil.parseDateParm( httpContext.GetPar( "Lb_FechaEfrom")) ;
      AV54Lb_FechaEto = localUtil.parseDateParm( httpContext.GetPar( "Lb_FechaEto")) ;
      AV52Lb_FechaEn = localUtil.parseDateParm( httpContext.GetPar( "Lb_FechaEn")) ;
      AV50Lb_estado = (byte)(GXutil.lval( httpContext.GetPar( "Lb_estado"))) ;
      AV14Carvema = (short)(GXutil.lval( httpContext.GetPar( "Carvema"))) ;
      AV53Lb_fechaEn2 = localUtil.parseDateParm( httpContext.GetPar( "Lb_fechaEn2")) ;
      AV61Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV59ManageFiltersExecutionStep, AV18ColumnsSelector, AV24Emprcod, AV101Pgmname, AV31FilterFullText, AV15Clicod, AV47Lb_Cartaz, AV48Lb_ColNom, AV55Lb_numero, AV51Lb_FechaEfrom, AV54Lb_FechaEto, AV52Lb_FechaEn, AV50Lb_estado, AV14Carvema, AV53Lb_fechaEn2, AV61Moda21, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa2822( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Enviode Ensayo a Cliente", "")) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcenviodeensayoacliente", new String[] {GXutil.URLEncode(GXutil.rtrim(AV24Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV15Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV47Lb_Cartaz)),GXutil.URLEncode(GXutil.rtrim(AV48Lb_ColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV55Lb_numero,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV51Lb_FechaEfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV54Lb_FechaEto)),GXutil.URLEncode(GXutil.formatDateParm(AV52Lb_FechaEn)),GXutil.URLEncode(GXutil.ltrimstr(AV50Lb_estado,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14Carvema,4,0))}, new String[] {"Emprcod","Clicod","Lb_Cartaz","Lb_ColNom","Lb_numero","Lb_FechaEfrom","Lb_FechaEto","Lb_FechaEn","Lb_estado","Carvema"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLB_FECHAEN2", getSecureSignedToken( sPrefix, AV53Lb_fechaEn2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV61Moda21), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCEnviodeEnsayoaCliente");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV101Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wcenviodeensayoacliente:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Enviodeensayoacliente_sdt", AV25EnviodeEnsayoaCliente_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Enviodeensayoacliente_sdt", AV25EnviodeEnsayoaCliente_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_79", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_79, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV58ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV58ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV33GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV34GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV21DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV21DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV18ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV18ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV24Emprcod", GXutil.rtrim( wcpOAV24Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV15Clicod", GXutil.ltrim( localUtil.ntoc( wcpOAV15Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV47Lb_Cartaz", GXutil.rtrim( wcpOAV47Lb_Cartaz));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV48Lb_ColNom", GXutil.rtrim( wcpOAV48Lb_ColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV55Lb_numero", GXutil.ltrim( localUtil.ntoc( wcpOAV55Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV51Lb_FechaEfrom", localUtil.dtoc( wcpOAV51Lb_FechaEfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV54Lb_FechaEto", localUtil.dtoc( wcpOAV54Lb_FechaEto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV52Lb_FechaEn", localUtil.dtoc( wcpOAV52Lb_FechaEn, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV50Lb_estado", GXutil.ltrim( localUtil.ntoc( wcpOAV50Lb_estado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV14Carvema", GXutil.ltrim( localUtil.ntoc( wcpOAV14Carvema, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV59ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV24Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV15Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_CARTAZ", GXutil.rtrim( AV47Lb_Cartaz));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_COLNOM", GXutil.rtrim( AV48Lb_ColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_NUMERO", GXutil.ltrim( localUtil.ntoc( AV55Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_FECHAEFROM", localUtil.dtoc( AV51Lb_FechaEfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_FECHAETO", localUtil.dtoc( AV54Lb_FechaEto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_ESTADO", GXutil.ltrim( localUtil.ntoc( AV50Lb_estado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCARVEMA", GXutil.ltrim( localUtil.ntoc( AV14Carvema, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_FECHAEN2", localUtil.dtoc( AV53Lb_fechaEn2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLB_FECHAEN2", getSecureSignedToken( sPrefix, AV53Lb_fechaEn2));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV35GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV35GridState);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSELECTEDROWS", AV73SelectedRows);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSELECTEDROWS", AV73SelectedRows);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV61Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV61Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIN_LB_NUMEROL", GXutil.ltrim( localUtil.ntoc( AV41IN_Lb_numerol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vENVIODEENSAYOACLIENTE_SDT", AV25EnviodeEnsayoaCliente_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vENVIODEENSAYOACLIENTE_SDT", AV25EnviodeEnsayoaCliente_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIN_LB_FECHAEN", localUtil.dtoc( AV39IN_lb_fechaen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLINOM", GXutil.rtrim( AV5CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_COLNOMC", GXutil.rtrim( AV8Lb_colnomc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_COLNUM", GXutil.ltrim( localUtil.ntoc( AV9lb_colNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV68TipColcod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNUMFORM", GXutil.ltrim( localUtil.ntoc( AV62Numform, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSELECTEDROWSITEM", AV64SelectedRowsItem);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSELECTEDROWSITEM", AV64SelectedRowsItem);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGXV27", GXutil.ltrim( localUtil.ntoc( AV105GXV27, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vELIMINAR", GXutil.ltrim( localUtil.ntoc( AV22eliminar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGXV26", GXutil.ltrim( localUtil.ntoc( AV104GXV26, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vAENVIAR", GXutil.ltrim( localUtil.ntoc( AV13aenviar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMSG", GXutil.rtrim( Gx_msg));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Title", GXutil.rtrim( Dvelop_confirmpanel_enviar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_enviar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enviar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enviar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enviar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_enviar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_enviar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Title", GXutil.rtrim( Dvelop_confirmpanel_envioopciona_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_envioopciona_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_envioopciona_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_envioopciona_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_envioopciona_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_envioopciona_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_envioopciona_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Result", GXutil.rtrim( Dvelop_confirmpanel_enviar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Result", GXutil.rtrim( Dvelop_confirmpanel_envioopciona_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Result", GXutil.rtrim( Dvelop_confirmpanel_enviar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Result", GXutil.rtrim( Dvelop_confirmpanel_envioopciona_Result));
   }

   public void renderHtmlCloseForm2822( )
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
      return "WCEnviodeEnsayoaCliente" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Enviode Ensayo a Cliente", "") ;
   }

   public void wb2820( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcenviodeensayoacliente");
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
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavLb_fechaen_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLb_fechaen_Internalname, httpContext.getMessage( "Fecha Envio", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavLb_fechaen_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLb_fechaen_Internalname, localUtil.format(AV52Lb_FechaEn, "99/99/99"), localUtil.format( AV52Lb_FechaEn, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLb_fechaen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLb_fechaen_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCEnviodeEnsayoaCliente.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavLb_fechaen_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavLb_fechaen_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCEnviodeEnsayoaCliente.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 79, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCEnviodeEnsayoaCliente.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 79, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCEnviodeEnsayoaCliente.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 79, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCEnviodeEnsayoaCliente.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_2822( true) ;
      }
      else
      {
         wb_table1_27_2822( false) ;
      }
      return  ;
   }

   public void wb_table1_27_2822e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenviar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 79, 2, 0)+","+"null"+");", httpContext.getMessage( "Enviar", ""), bttBtnenviar_Jsonclick, 7, httpContext.getMessage( "Enviar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e112821_client"+"'", TempTags, "", 2, "HLP_WCEnviodeEnsayoaCliente.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 79, 2, 0)+","+"null"+");", httpContext.getMessage( "Eliminar Envio", ""), bttBtneliminar_Jsonclick, 7, httpContext.getMessage( "Eliminar Envio", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e122821_client"+"'", TempTags, "", 2, "HLP_WCEnviodeEnsayoaCliente.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnlabdip_Internalname, "gx.evt.setGridEvt("+GXutil.str( 79, 2, 0)+","+"null"+");", httpContext.getMessage( "Lab DIP para Aprovaçao", ""), bttBtnlabdip_Jsonclick, 5, httpContext.getMessage( "Lab DIP para Aprovaçao", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOLABDIP\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCEnviodeEnsayoaCliente.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenvioopciona_Internalname, "gx.evt.setGridEvt("+GXutil.str( 79, 2, 0)+","+"null"+");", httpContext.getMessage( "Envio Opcion Texplus Provisional", ""), bttBtnenvioopciona_Jsonclick, 5, httpContext.getMessage( "Envio Opcion Texplus Provisional", ""), "", StyleString, ClassString, bttBtnenvioopciona_Visible, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOENVIOOPCIONA\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCEnviodeEnsayoaCliente.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancelar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 79, 2, 0)+","+"null"+");", httpContext.getMessage( "Cancelar", ""), bttBtncancelar_Jsonclick, 5, httpContext.getMessage( "Cancelar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCANCELAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCEnviodeEnsayoaCliente.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button WWPBtnNeedMultiRowWOPagingSelection" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnmarcartodos_Internalname, "gx.evt.setGridEvt("+GXutil.str( 79, 2, 0)+","+"null"+");", "++ | --", bttBtnmarcartodos_Jsonclick, 5, "++ | --", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOMARCARTODOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCEnviodeEnsayoaCliente.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable2.setProperty("Width", Dvpanel_unnamedtable2_Width);
         ucDvpanel_unnamedtable2.setProperty("AutoWidth", Dvpanel_unnamedtable2_Autowidth);
         ucDvpanel_unnamedtable2.setProperty("AutoHeight", Dvpanel_unnamedtable2_Autoheight);
         ucDvpanel_unnamedtable2.setProperty("Cls", Dvpanel_unnamedtable2_Cls);
         ucDvpanel_unnamedtable2.setProperty("Title", Dvpanel_unnamedtable2_Title);
         ucDvpanel_unnamedtable2.setProperty("Collapsible", Dvpanel_unnamedtable2_Collapsible);
         ucDvpanel_unnamedtable2.setProperty("Collapsed", Dvpanel_unnamedtable2_Collapsed);
         ucDvpanel_unnamedtable2.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable2_Showcollapseicon);
         ucDvpanel_unnamedtable2.setProperty("IconPosition", Dvpanel_unnamedtable2_Iconposition);
         ucDvpanel_unnamedtable2.setProperty("AutoScroll", Dvpanel_unnamedtable2_Autoscroll);
         ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE2Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnlabdipcoste_Internalname, "gx.evt.setGridEvt("+GXutil.str( 79, 2, 0)+","+"null"+");", httpContext.getMessage( "Lab DIP con Coste", ""), bttBtnlabdipcoste_Jsonclick, 5, httpContext.getMessage( "Lab DIP con Coste", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOLABDIPCOSTE\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCEnviodeEnsayoaCliente.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablelb_rb_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 MergeLabelCell CellWidth_12_5", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocklb_rb_Internalname, httpContext.getMessage( "Rb", ""), "", "", lblTextblocklb_rb_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WCEnviodeEnsayoaCliente.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellWidth_87_5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLb_rb_Internalname, httpContext.getMessage( "Lb_Rb", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'" + sPrefix + "',false,'" + sGXsfl_79_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLb_rb_Internalname, GXutil.ltrim( localUtil.ntoc( AV57Lb_Rb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLb_rb_Enabled!=0) ? localUtil.format( AV57Lb_Rb, "ZZZ9.99") : localUtil.format( AV57Lb_Rb, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,73);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLb_rb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLb_rb_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCEnviodeEnsayoaCliente.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol79( ) ;
      }
      if ( wbEnd == 79 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_79 = (int)(nGXsfl_79_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV77GXV1 = nGXsfl_79_idx ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV33GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV34GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV101Pgmname), GXutil.rtrim( localUtil.format( AV101Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCEnviodeEnsayoaCliente.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableinvisible_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV21DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV21DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV18ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_121_2822( true) ;
      }
      else
      {
         wb_table2_121_2822( false) ;
      }
      return  ;
   }

   public void wb_table2_121_2822e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_126_2822( true) ;
      }
      else
      {
         wb_table3_126_2822( false) ;
      }
      return  ;
   }

   public void wb_table3_126_2822e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_131_2822( true) ;
      }
      else
      {
         wb_table4_131_2822( false) ;
      }
      return  ;
   }

   public void wb_table4_131_2822e( boolean wbgen )
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
      if ( wbEnd == 79 )
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
               AV77GXV1 = nGXsfl_79_idx ;
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

   public void start2822( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Enviode Ensayo a Cliente", ""), (short)(0)) ;
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
            strup2820( ) ;
         }
      }
   }

   public void ws2822( )
   {
      start2822( ) ;
      evt2822( ) ;
   }

   public void evt2822( )
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
                              strup2820( ) ;
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
                              strup2820( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e132822 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2820( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e142822 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2820( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e152822 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2820( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e162822 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENVIAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2820( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e172822 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2820( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e182822 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENVIOOPCIONA.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2820( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e192822 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOLABDIPCOSTE'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2820( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'Dolabdipcoste' */
                                 e202822 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOLABDIP'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2820( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'Dolabdip' */
                                 e212822 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOENVIOOPCIONA'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2820( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoEnvioOpcionA' */
                                 e222822 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCANCELAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2820( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoCancelar' */
                                 e232822 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOMARCARTODOS'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2820( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoMarcarTodos' */
                                 e242822 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2820( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e252822 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2820( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e262822 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2820( ) ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "'DODESMARCARTODOS'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2820( ) ;
                           }
                           nGXsfl_79_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_792( ) ;
                           AV77GXV1 = (int)(nGXsfl_79_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV25EnviodeEnsayoaCliente_SDT.size() >= AV77GXV1 ) && ( AV77GXV1 > 0 ) )
                           {
                              AV25EnviodeEnsayoaCliente_SDT.currentItem( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)) );
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
                                       e272822 ();
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
                                       e282822 ();
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
                                       e292822 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "'DODESMARCARTODOS'") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: 'DoDesmarcarTodos' */
                                       e302822 ();
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
                                    strup2820( ) ;
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

   public void we2822( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2822( ) ;
         }
      }
   }

   public void pa2822( )
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
      subsflControlProps_792( ) ;
      while ( nGXsfl_79_idx <= nRC_GXsfl_79 )
      {
         sendrow_792( ) ;
         nGXsfl_79_idx = ((subGrid_Islastpage==1)&&(nGXsfl_79_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_79_idx+1) ;
         sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_792( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 byte AV59ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ,
                                 String AV24Emprcod ,
                                 String AV101Pgmname ,
                                 String AV31FilterFullText ,
                                 int AV15Clicod ,
                                 String AV47Lb_Cartaz ,
                                 String AV48Lb_ColNom ,
                                 int AV55Lb_numero ,
                                 java.util.Date AV51Lb_FechaEfrom ,
                                 java.util.Date AV54Lb_FechaEto ,
                                 java.util.Date AV52Lb_FechaEn ,
                                 byte AV50Lb_estado ,
                                 short AV14Carvema ,
                                 java.util.Date AV53Lb_fechaEn2 ,
                                 short AV61Moda21 ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e282822 ();
      GRID_nCurrentRecord = 0 ;
      rf2822( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCEnviodeEnsayoaCliente");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV101Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wcenviodeensayoacliente:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf2822( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV101Pgmname = "WCEnviodeEnsayoaCliente" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101Pgmname", AV101Pgmname);
      Gx_err = (short)(0) ;
      edtavLb_fechaen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLb_fechaen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_fechaen_Enabled), 5, 0), true);
      edtavEnviodeensayoacliente_sdt__lb_numero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_numero_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__clicod_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__clinom_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_artcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_artcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_artcod_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_colnomc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_colnomc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_colnomc_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_rb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_rb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_rb_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_opcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_opcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_opcion_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_numop_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_numop_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_numop_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_cartaz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_cartaz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_cartaz_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_fechae_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_fechae_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_fechae_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_fechaen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_fechaen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_fechaen_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_estado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_estado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_estado_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__obs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__obs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__obs_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__f_cformu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__f_cformu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__f_cformu_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_costee_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_costee_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_costee_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_rgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_rgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_rgb_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__tipcolcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__tipcolcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__tipcolcod_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_colnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_colnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_colnom_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_colnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_colnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_colnum_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__fornumcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__fornumcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__fornumcol_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__forultuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__forultuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__forultuti_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2822( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(79) ;
      /* Execute user event: Refresh */
      e282822 ();
      nGXsfl_79_idx = 1 ;
      sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_792( ) ;
      bGXsfl_79_Refreshing = true ;
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
         subsflControlProps_792( ) ;
         e292822 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_79_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e292822 ();
         }
         wbEnd = (short)(79) ;
         wb2820( ) ;
      }
      bGXsfl_79_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2822( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_FECHAEN2", localUtil.dtoc( AV53Lb_fechaEn2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLB_FECHAEN2", getSecureSignedToken( sPrefix, AV53Lb_fechaEn2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV61Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV61Moda21), "ZZZ9")));
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
      return AV25EnviodeEnsayoaCliente_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV59ManageFiltersExecutionStep, AV18ColumnsSelector, AV24Emprcod, AV101Pgmname, AV31FilterFullText, AV15Clicod, AV47Lb_Cartaz, AV48Lb_ColNom, AV55Lb_numero, AV51Lb_FechaEfrom, AV54Lb_FechaEto, AV52Lb_FechaEn, AV50Lb_estado, AV14Carvema, AV53Lb_fechaEn2, AV61Moda21, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV59ManageFiltersExecutionStep, AV18ColumnsSelector, AV24Emprcod, AV101Pgmname, AV31FilterFullText, AV15Clicod, AV47Lb_Cartaz, AV48Lb_ColNom, AV55Lb_numero, AV51Lb_FechaEfrom, AV54Lb_FechaEto, AV52Lb_FechaEn, AV50Lb_estado, AV14Carvema, AV53Lb_fechaEn2, AV61Moda21, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV59ManageFiltersExecutionStep, AV18ColumnsSelector, AV24Emprcod, AV101Pgmname, AV31FilterFullText, AV15Clicod, AV47Lb_Cartaz, AV48Lb_ColNom, AV55Lb_numero, AV51Lb_FechaEfrom, AV54Lb_FechaEto, AV52Lb_FechaEn, AV50Lb_estado, AV14Carvema, AV53Lb_fechaEn2, AV61Moda21, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV59ManageFiltersExecutionStep, AV18ColumnsSelector, AV24Emprcod, AV101Pgmname, AV31FilterFullText, AV15Clicod, AV47Lb_Cartaz, AV48Lb_ColNom, AV55Lb_numero, AV51Lb_FechaEfrom, AV54Lb_FechaEto, AV52Lb_FechaEn, AV50Lb_estado, AV14Carvema, AV53Lb_fechaEn2, AV61Moda21, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV59ManageFiltersExecutionStep, AV18ColumnsSelector, AV24Emprcod, AV101Pgmname, AV31FilterFullText, AV15Clicod, AV47Lb_Cartaz, AV48Lb_ColNom, AV55Lb_numero, AV51Lb_FechaEfrom, AV54Lb_FechaEto, AV52Lb_FechaEn, AV50Lb_estado, AV14Carvema, AV53Lb_fechaEn2, AV61Moda21, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV101Pgmname = "WCEnviodeEnsayoaCliente" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101Pgmname", AV101Pgmname);
      Gx_err = (short)(0) ;
      edtavLb_fechaen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLb_fechaen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_fechaen_Enabled), 5, 0), true);
      edtavEnviodeensayoacliente_sdt__lb_numero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_numero_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__clicod_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__clinom_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_artcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_artcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_artcod_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_colnomc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_colnomc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_colnomc_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_rb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_rb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_rb_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_opcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_opcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_opcion_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_numop_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_numop_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_numop_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_cartaz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_cartaz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_cartaz_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_fechae_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_fechae_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_fechae_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_fechaen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_fechaen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_fechaen_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_estado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_estado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_estado_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__obs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__obs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__obs_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__f_cformu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__f_cformu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__f_cformu_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_costee_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_costee_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_costee_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_rgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_rgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_rgb_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__tipcolcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__tipcolcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__tipcolcod_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_colnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_colnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_colnom_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_colnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_colnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_colnum_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__fornumcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__fornumcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__fornumcol_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__forultuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__forultuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__forultuti_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2820( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e272822 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Enviodeensayoacliente_sdt"), AV25EnviodeEnsayoaCliente_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV58ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV21DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV18ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vENVIODEENSAYOACLIENTE_SDT"), AV25EnviodeEnsayoaCliente_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vSELECTEDROWSITEM"), AV64SelectedRowsItem);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vSELECTEDROWS"), AV73SelectedRows);
         /* Read saved values. */
         nRC_GXsfl_79 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_79"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV33GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV34GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV24Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV24Emprcod") ;
         wcpOAV15Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV15Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV47Lb_Cartaz = httpContext.cgiGet( sPrefix+"wcpOAV47Lb_Cartaz") ;
         wcpOAV48Lb_ColNom = httpContext.cgiGet( sPrefix+"wcpOAV48Lb_ColNom") ;
         wcpOAV55Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV55Lb_numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV51Lb_FechaEfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV51Lb_FechaEfrom"), 0) ;
         wcpOAV54Lb_FechaEto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV54Lb_FechaEto"), 0) ;
         wcpOAV52Lb_FechaEn = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV52Lb_FechaEn"), 0) ;
         wcpOAV50Lb_estado = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV50Lb_estado"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV14Carvema = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV14Carvema"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV105GXV27 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vGXV27"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV22eliminar = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vELIMINAR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV104GXV26 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vGXV26"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV13aenviar = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vAENVIAR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_msg = httpContext.cgiGet( sPrefix+"vMSG") ;
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
         Dvpanel_unnamedtable2_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Width") ;
         Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
         Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
         Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Cls") ;
         Dvpanel_unnamedtable2_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Title") ;
         Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
         Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
         Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
         Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Iconposition") ;
         Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
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
         Dvelop_confirmpanel_enviar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Title") ;
         Dvelop_confirmpanel_enviar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Confirmationtext") ;
         Dvelop_confirmpanel_enviar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_enviar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_enviar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_enviar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_enviar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Confirmtype") ;
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
         Dvelop_confirmpanel_envioopciona_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Title") ;
         Dvelop_confirmpanel_envioopciona_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Confirmationtext") ;
         Dvelop_confirmpanel_envioopciona_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Yesbuttoncaption") ;
         Dvelop_confirmpanel_envioopciona_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Nobuttoncaption") ;
         Dvelop_confirmpanel_envioopciona_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_envioopciona_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Yesbuttonposition") ;
         Dvelop_confirmpanel_envioopciona_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Confirmtype") ;
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
         Dvelop_confirmpanel_enviar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR_Result") ;
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         Dvelop_confirmpanel_envioopciona_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA_Result") ;
         nRC_GXsfl_79 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_79"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_79_fel_idx = 0 ;
         while ( nGXsfl_79_fel_idx < nRC_GXsfl_79 )
         {
            nGXsfl_79_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_79_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_79_fel_idx+1) ;
            sGXsfl_79_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_792( ) ;
            AV77GXV1 = (int)(nGXsfl_79_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV25EnviodeEnsayoaCliente_SDT.size() >= AV77GXV1 ) && ( AV77GXV1 > 0 ) )
            {
               AV25EnviodeEnsayoaCliente_SDT.currentItem( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)) );
            }
         }
         if ( nGXsfl_79_fel_idx == 0 )
         {
            nGXsfl_79_idx = 1 ;
            sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_792( ) ;
         }
         nGXsfl_79_fel_idx = 1 ;
         /* Read variables values. */
         AV31FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31FilterFullText", AV31FilterFullText);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavLb_rb_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavLb_rb_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLB_RB");
            GX_FocusControl = edtavLb_rb_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV57Lb_Rb = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57Lb_Rb", GXutil.ltrimstr( AV57Lb_Rb, 7, 2));
         }
         else
         {
            AV57Lb_Rb = localUtil.ctond( httpContext.cgiGet( edtavLb_rb_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57Lb_Rb", GXutil.ltrimstr( AV57Lb_Rb, 7, 2));
         }
         AV101Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101Pgmname", AV101Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCEnviodeEnsayoaCliente");
         AV101Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101Pgmname", AV101Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV101Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("wcenviodeensayoacliente:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e272822 ();
      if (returnInSub) return;
   }

   public void e272822( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV11Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcenviodeensayoacliente_impl.this.GXt_char1 = GXv_char2[0] ;
      AV11Station = GXt_char1 ;
      GXv_char2[0] = AV24Emprcod ;
      GXv_char3[0] = AV6EmprNom ;
      GXv_char4[0] = AV12UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV11Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcenviodeensayoacliente_impl.this.AV24Emprcod = GXv_char2[0] ;
      wcenviodeensayoacliente_impl.this.AV6EmprNom = GXv_char3[0] ;
      wcenviodeensayoacliente_impl.this.AV12UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Emprcod", AV24Emprcod);
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      /* Execute user subroutine: 'LOADSAVEDFILTERS' */
      S122 ();
      if (returnInSub) return;
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      chkavEnviodeensayoacliente_sdt__selected.setTitleFormat( (short)(1) );
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV21DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV21DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int7 = (byte)(AV61Moda21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV24Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      wcenviodeensayoacliente_impl.this.GXt_int7 = GXv_int8[0] ;
      AV61Moda21 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV61Moda21), "ZZZ9")));
      AV57Lb_Rb = DecimalUtil.doubleToDec(15) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57Lb_Rb", GXutil.ltrimstr( AV57Lb_Rb, 7, 2));
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S142 ();
      if (returnInSub) return;
   }

   public void e282822( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV72WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV72WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'CHECKSECURITYFORACTIONS' */
      S152 ();
      if (returnInSub) return;
      if ( AV59ManageFiltersExecutionStep == 1 )
      {
         AV59ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59ManageFiltersExecutionStep", GXutil.str( AV59ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV59ManageFiltersExecutionStep == 2 )
      {
         AV59ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59ManageFiltersExecutionStep", GXutil.str( AV59ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S122 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV65Session.getValue("WCEnviodeEnsayoaClienteColumnsSelector"), "") != 0 )
      {
         AV20ColumnsSelectorXML = AV65Session.getValue("WCEnviodeEnsayoaClienteColumnsSelector") ;
         AV18ColumnsSelector.fromxml(AV20ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S172 ();
         if (returnInSub) return;
      }
      edtavEnviodeensayoacliente_sdt__lb_numero_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_numero_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_numero_Visible), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__clicod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__clicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__clicod_Visible), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__clinom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__clinom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__clinom_Visible), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_artcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_artcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_artcod_Visible), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_colnomc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_colnomc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_colnomc_Visible), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_rb_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_rb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_rb_Visible), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_opcion_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_opcion_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_opcion_Visible), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_numop_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_numop_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_numop_Visible), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_cartaz_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_cartaz_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_cartaz_Visible), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_fechae_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_fechae_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_fechae_Visible), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_fechaen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_fechaen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_fechaen_Visible), 5, 0), !bGXsfl_79_Refreshing);
      edtavEnviodeensayoacliente_sdt__lb_estado_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnviodeensayoacliente_sdt__lb_estado_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnviodeensayoacliente_sdt__lb_estado_Visible), 5, 0), !bGXsfl_79_Refreshing);
      chkavEnviodeensayoacliente_sdt__eliminar.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavEnviodeensayoacliente_sdt__eliminar.getInternalname(), "Visible", GXutil.ltrimstr( chkavEnviodeensayoacliente_sdt__eliminar.getVisible(), 5, 0), !bGXsfl_79_Refreshing);
      chkavEnviodeensayoacliente_sdt__selected.setTitle( GXutil.format( "<input name=\"selectAllCheckbox\" type=\"checkbox\" value=\"Select All\" onClick=\"WWPSelectAll(this, %1);\" onMouseOver=\"WWPSelectAllRemoveParentOnClick(this)\" class=\"AttributeCheckBox\" >", "'SELECTED'", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavEnviodeensayoacliente_sdt__selected.getInternalname(), "Title", chkavEnviodeensayoacliente_sdt__selected.getTitle(), !bGXsfl_79_Refreshing);
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S142 ();
      if (returnInSub) return;
      AV33GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33GridCurrentPage), 10, 0));
      AV34GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34GridPageCount), 10, 0));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV58ManageFiltersData", AV58ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV35GridState", AV35GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25EnviodeEnsayoaCliente_SDT", AV25EnviodeEnsayoaCliente_SDT);
   }

   public void e142822( )
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
         AV63PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV63PageToGo) ;
      }
   }

   public void e152822( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e292822( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV77GXV1 = 1 ;
      while ( AV77GXV1 <= AV25EnviodeEnsayoaCliente_SDT.size() )
      {
         AV25EnviodeEnsayoaCliente_SDT.currentItem( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(79) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_792( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_79_Refreshing )
         {
            httpContext.doAjaxLoad(79, GridRow);
         }
         AV77GXV1 = (int)(AV77GXV1+1) ;
      }
   }

   public void e162822( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV20ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV18ColumnsSelector.fromJSonString(AV20ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WCEnviodeEnsayoaClienteColumnsSelector", ((GXutil.strcmp("", AV20ColumnsSelectorXML)==0) ? "" : AV18ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV58ManageFiltersData", AV58ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV35GridState", AV35GridState);
      if ( gx_BV79 )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25EnviodeEnsayoaCliente_SDT", AV25EnviodeEnsayoaCliente_SDT);
         nGXsfl_79_bak_idx = nGXsfl_79_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV59ManageFiltersExecutionStep, AV18ColumnsSelector, AV24Emprcod, AV101Pgmname, AV31FilterFullText, AV15Clicod, AV47Lb_Cartaz, AV48Lb_ColNom, AV55Lb_numero, AV51Lb_FechaEfrom, AV54Lb_FechaEto, AV52Lb_FechaEn, AV50Lb_estado, AV14Carvema, AV53Lb_fechaEn2, AV61Moda21, sPrefix) ;
         nGXsfl_79_idx = nGXsfl_79_bak_idx ;
         sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_792( ) ;
      }
   }

   public void e132822( )
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
         S162 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WCEnviodeEnsayoaClienteFilters")),GXutil.URLEncode(GXutil.rtrim(AV101Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV59ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59ManageFiltersExecutionStep", GXutil.str( AV59ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WCEnviodeEnsayoaClienteFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV59ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59ManageFiltersExecutionStep", GXutil.str( AV59ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV60ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WCEnviodeEnsayoaClienteFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         wcenviodeensayoacliente_impl.this.GXt_char1 = GXv_char4[0] ;
         AV60ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV60ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S182 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV101Pgmname+"GridState", AV60ManageFiltersXml) ;
            AV35GridState.fromxml(AV60ManageFiltersXml, null, null);
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S192 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV35GridState", AV35GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV58ManageFiltersData", AV58ManageFiltersData);
      if ( gx_BV79 )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25EnviodeEnsayoaCliente_SDT", AV25EnviodeEnsayoaCliente_SDT);
         nGXsfl_79_bak_idx = nGXsfl_79_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV59ManageFiltersExecutionStep, AV18ColumnsSelector, AV24Emprcod, AV101Pgmname, AV31FilterFullText, AV15Clicod, AV47Lb_Cartaz, AV48Lb_ColNom, AV55Lb_numero, AV51Lb_FechaEfrom, AV54Lb_FechaEto, AV52Lb_FechaEn, AV50Lb_estado, AV14Carvema, AV53Lb_fechaEn2, AV61Moda21, sPrefix) ;
         nGXsfl_79_idx = nGXsfl_79_bak_idx ;
         sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_792( ) ;
      }
   }

   public void e202822( )
   {
      /* 'Dolabdipcoste' Routine */
      returnInSub = false ;
      AV17Col_EnvioEnsayo.clear();
      AV102GXV25 = 1 ;
      while ( AV102GXV25 <= AV73SelectedRows.size() )
      {
         AV64SelectedRowsItem = (app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV73SelectedRows.elementAt(-1+AV102GXV25));
         AV40IN_Lb_numero = AV64SelectedRowsItem.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_numero() ;
         AV42IN_Lb_opcion = AV64SelectedRowsItem.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_opcion() ;
         AV45Item_EnvioEnsayo = (app.gestionlaboratorio.SdtEnviodeEnsayo_SDT)new app.gestionlaboratorio.SdtEnviodeEnsayo_SDT(remoteHandle, context);
         AV45Item_EnvioEnsayo.setgxTv_SdtEnviodeEnsayo_SDT_Lb_numero( AV40IN_Lb_numero );
         AV45Item_EnvioEnsayo.setgxTv_SdtEnviodeEnsayo_SDT_Lb_opcion( AV42IN_Lb_opcion );
         AV45Item_EnvioEnsayo.setgxTv_SdtEnviodeEnsayo_SDT_Lb_cartaz( AV64SelectedRowsItem.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_cartaz() );
         AV45Item_EnvioEnsayo.setgxTv_SdtEnviodeEnsayo_SDT_Coste( AV64SelectedRowsItem.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_costee() );
         AV17Col_EnvioEnsayo.add(AV45Item_EnvioEnsayo, 0);
         AV102GXV25 = (int)(AV102GXV25+1) ;
      }
      AV46Json_EnvioEnsayo = AV17Col_EnvioEnsayo.toJSonString(false) ;
      httpContext.popup(formatLink("app.gestionlaboratorio.rens023", new String[] {GXutil.URLEncode(GXutil.rtrim(AV24Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV15Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV47Lb_Cartaz)),GXutil.URLEncode(GXutil.formatDateParm(AV52Lb_FechaEn)),GXutil.URLEncode(DecimalUtil.decToString(AV57Lb_Rb)),GXutil.URLEncode(GXutil.rtrim(AV46Json_EnvioEnsayo))}, new String[] {"EmprCod","CliCod","Lb_cartaz","Lb_fechaen","Lb_rb","Json_EnvioEnsayo"}) , new Object[] {"AV24Emprcod","AV15Clicod","AV47Lb_Cartaz","AV52Lb_FechaEn","AV57Lb_Rb","AV46Json_EnvioEnsayo"});
      /*  Sending Event outputs  */
   }

   public void e172822( )
   {
      AV77GXV1 = (int)(nGXsfl_79_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV77GXV1 > 0 ) && ( AV25EnviodeEnsayoaCliente_SDT.size() >= AV77GXV1 ) )
      {
         AV25EnviodeEnsayoaCliente_SDT.currentItem( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)) );
      }
      /* Dvelop_confirmpanel_enviar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_enviar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENVIAR' */
         S202 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      if ( gx_BV79 )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25EnviodeEnsayoaCliente_SDT", AV25EnviodeEnsayoaCliente_SDT);
         nGXsfl_79_bak_idx = nGXsfl_79_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV59ManageFiltersExecutionStep, AV18ColumnsSelector, AV24Emprcod, AV101Pgmname, AV31FilterFullText, AV15Clicod, AV47Lb_Cartaz, AV48Lb_ColNom, AV55Lb_numero, AV51Lb_FechaEfrom, AV54Lb_FechaEto, AV52Lb_FechaEn, AV50Lb_estado, AV14Carvema, AV53Lb_fechaEn2, AV61Moda21, sPrefix) ;
         nGXsfl_79_idx = nGXsfl_79_bak_idx ;
         sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_792( ) ;
      }
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV58ManageFiltersData", AV58ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV35GridState", AV35GridState);
   }

   public void e182822( )
   {
      AV77GXV1 = (int)(nGXsfl_79_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV77GXV1 > 0 ) && ( AV25EnviodeEnsayoaCliente_SDT.size() >= AV77GXV1 ) )
      {
         AV25EnviodeEnsayoaCliente_SDT.currentItem( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)) );
      }
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S212 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25EnviodeEnsayoaCliente_SDT", AV25EnviodeEnsayoaCliente_SDT);
      nGXsfl_79_bak_idx = nGXsfl_79_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV59ManageFiltersExecutionStep, AV18ColumnsSelector, AV24Emprcod, AV101Pgmname, AV31FilterFullText, AV15Clicod, AV47Lb_Cartaz, AV48Lb_ColNom, AV55Lb_numero, AV51Lb_FechaEfrom, AV54Lb_FechaEto, AV52Lb_FechaEn, AV50Lb_estado, AV14Carvema, AV53Lb_fechaEn2, AV61Moda21, sPrefix) ;
      nGXsfl_79_idx = nGXsfl_79_bak_idx ;
      sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_792( ) ;
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV58ManageFiltersData", AV58ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV35GridState", AV35GridState);
   }

   public void e212822( )
   {
      /* 'Dolabdip' Routine */
      returnInSub = false ;
      AV17Col_EnvioEnsayo.clear();
      AV106GXV28 = 1 ;
      while ( AV106GXV28 <= AV73SelectedRows.size() )
      {
         AV64SelectedRowsItem = (app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV73SelectedRows.elementAt(-1+AV106GXV28));
         AV40IN_Lb_numero = AV64SelectedRowsItem.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_numero() ;
         AV42IN_Lb_opcion = AV64SelectedRowsItem.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_opcion() ;
         AV45Item_EnvioEnsayo = (app.gestionlaboratorio.SdtEnviodeEnsayo_SDT)new app.gestionlaboratorio.SdtEnviodeEnsayo_SDT(remoteHandle, context);
         AV45Item_EnvioEnsayo.setgxTv_SdtEnviodeEnsayo_SDT_Lb_numero( AV40IN_Lb_numero );
         AV45Item_EnvioEnsayo.setgxTv_SdtEnviodeEnsayo_SDT_Lb_opcion( AV42IN_Lb_opcion );
         AV45Item_EnvioEnsayo.setgxTv_SdtEnviodeEnsayo_SDT_Lb_cartaz( AV64SelectedRowsItem.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_cartaz() );
         AV45Item_EnvioEnsayo.setgxTv_SdtEnviodeEnsayo_SDT_Coste( AV64SelectedRowsItem.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_costee() );
         AV17Col_EnvioEnsayo.add(AV45Item_EnvioEnsayo, 0);
         AV106GXV28 = (int)(AV106GXV28+1) ;
      }
      AV46Json_EnvioEnsayo = AV17Col_EnvioEnsayo.toJSonString(false) ;
      httpContext.popup(formatLink("app.gestionlaboratorio.rensm016", new String[] {GXutil.URLEncode(GXutil.rtrim(AV24Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV15Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV47Lb_Cartaz)),GXutil.URLEncode(GXutil.formatDateParm(AV52Lb_FechaEn)),GXutil.URLEncode(GXutil.rtrim(AV46Json_EnvioEnsayo))}, new String[] {"EmprCod","CliCod","Lb_cartaz","Lb_fechaen","Json_EnvioEnsayo"}) , new Object[] {"AV24Emprcod","AV15Clicod","AV47Lb_Cartaz","AV52Lb_FechaEn","AV46Json_EnvioEnsayo"});
      AV73SelectedRows.clear();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV73SelectedRows", AV73SelectedRows);
   }

   public void e222822( )
   {
      AV77GXV1 = (int)(nGXsfl_79_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV77GXV1 > 0 ) && ( AV25EnviodeEnsayoaCliente_SDT.size() >= AV77GXV1 ) )
      {
         AV25EnviodeEnsayoaCliente_SDT.currentItem( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)) );
      }
      /* 'DoEnvioOpcionA' Routine */
      returnInSub = false ;
      AV66t = (short)(0) ;
      AV107GXV29 = 1 ;
      while ( AV107GXV29 <= AV73SelectedRows.size() )
      {
         AV64SelectedRowsItem = (app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV73SelectedRows.elementAt(-1+AV107GXV29));
         if ( GXutil.strcmp(AV64SelectedRowsItem.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_opcion(), "A") == 0 )
         {
            AV66t = (short)(AV66t+1) ;
            if (true) break;
         }
         AV107GXV29 = (int)(AV107GXV29+1) ;
      }
      if ( (0==AV55Lb_numero) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção. Esta opção só é ativada se apenas um número de ensaio tiver sido filtrado na tela de filtros.", ""));
      }
      else
      {
         if ( AV66t == 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Eu procurei Opção A, e não foi encontrado.", ""));
         }
         else
         {
            if ( (0==((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)(AV25EnviodeEnsayoaCliente_SDT.currentItem())).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_F_cformu()) )
            {
               AV108GXV30 = 1 ;
               while ( AV108GXV30 <= AV25EnviodeEnsayoaCliente_SDT.size() )
               {
                  AV26EnviodeEnsayoaCliente_SDT_item = (app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV108GXV30));
                  if ( GXutil.strcmp(AV26EnviodeEnsayoaCliente_SDT_item.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_opcion(), "A") == 0 )
                  {
                     AV15Clicod = AV26EnviodeEnsayoaCliente_SDT_item.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Clicod() ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Clicod), 6, 0));
                     AV5CliNom = AV26EnviodeEnsayoaCliente_SDT_item.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Clinom() ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5CliNom", AV5CliNom);
                     AV7lb_artcod = AV26EnviodeEnsayoaCliente_SDT_item.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_artcod() ;
                     AV49Lb_colnom2 = AV26EnviodeEnsayoaCliente_SDT_item.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_colnom() ;
                     AV9lb_colNum = AV26EnviodeEnsayoaCliente_SDT_item.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_colnum() ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9lb_colNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9lb_colNum), 6, 0));
                     AV68TipColcod = AV26EnviodeEnsayoaCliente_SDT_item.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Tipcolcod() ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TipColcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TipColcod), 2, 0));
                     AV8Lb_colnomc = AV26EnviodeEnsayoaCliente_SDT_item.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_colnomc() ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Lb_colnomc", AV8Lb_colnomc);
                  }
                  AV108GXV30 = (int)(AV108GXV30+1) ;
               }
               Dvelop_confirmpanel_envioopciona_Confirmationtext = httpContext.getMessage( "Ha seleccionado Actualizar en Produccion", "")+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_envioopciona.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_envioopciona_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciona_Confirmationtext);
               Dvelop_confirmpanel_envioopciona_Confirmationtext = Dvelop_confirmpanel_envioopciona_Confirmationtext+httpContext.getMessage( "Este Nº Ensayo, NO existe en Colorteca.", "")+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_envioopciona.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_envioopciona_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciona_Confirmationtext);
               Dvelop_confirmpanel_envioopciona_Confirmationtext = Dvelop_confirmpanel_envioopciona_Confirmationtext+httpContext.getMessage( "Creara el COLOR:", "")+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_envioopciona.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_envioopciona_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciona_Confirmationtext);
               Dvelop_confirmpanel_envioopciona_Confirmationtext = Dvelop_confirmpanel_envioopciona_Confirmationtext+httpContext.getMessage( "Cliente ", "")+GXutil.trim( AV5CliNom)+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_envioopciona.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_envioopciona_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciona_Confirmationtext);
               Dvelop_confirmpanel_envioopciona_Confirmationtext = Dvelop_confirmpanel_envioopciona_Confirmationtext+httpContext.getMessage( "Color ", "")+GXutil.trim( AV8Lb_colnomc)+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_envioopciona.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_envioopciona_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciona_Confirmationtext);
               Dvelop_confirmpanel_envioopciona_Confirmationtext = Dvelop_confirmpanel_envioopciona_Confirmationtext+httpContext.getMessage( "Numero ", "")+GXutil.trim( GXutil.str( AV9lb_colNum, 6, 0))+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_envioopciona.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_envioopciona_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciona_Confirmationtext);
               Dvelop_confirmpanel_envioopciona_Confirmationtext = Dvelop_confirmpanel_envioopciona_Confirmationtext+httpContext.getMessage( "Numero ", "")+GXutil.trim( GXutil.str( AV68TipColcod, 2, 0))+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_envioopciona.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_envioopciona_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciona_Confirmationtext);
               Dvelop_confirmpanel_envioopciona_Confirmationtext = Dvelop_confirmpanel_envioopciona_Confirmationtext+httpContext.getMessage( "Desea continuar?", "") ;
               ucDvelop_confirmpanel_envioopciona.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_envioopciona_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciona_Confirmationtext);
            }
            else
            {
               GXv_char4[0] = AV24Emprcod ;
               GXv_int10[0] = ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)(AV25EnviodeEnsayoaCliente_SDT.currentItem())).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Fornumcol() ;
               GXv_int11[0] = AV62Numform ;
               new app.pfornumcol(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int11) ;
               wcenviodeensayoacliente_impl.this.AV24Emprcod = GXv_char4[0] ;
               ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)(AV25EnviodeEnsayoaCliente_SDT.currentItem())).setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Fornumcol( GXv_int10[0] );
               wcenviodeensayoacliente_impl.this.AV62Numform = (short)((short)(GXv_int11[0])) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Emprcod", AV24Emprcod);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Numform", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62Numform), 4, 0));
               Dvelop_confirmpanel_envioopciona_Confirmationtext = httpContext.getMessage( "Ha seleccionado Actualizar en Produccion", "")+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_envioopciona.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_envioopciona_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciona_Confirmationtext);
               Dvelop_confirmpanel_envioopciona_Confirmationtext = Dvelop_confirmpanel_envioopciona_Confirmationtext+httpContext.getMessage( "Este Nº Ensayo, EXISTE en Colorteca.", "")+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_envioopciona.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_envioopciona_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciona_Confirmationtext);
               Dvelop_confirmpanel_envioopciona_Confirmationtext = Dvelop_confirmpanel_envioopciona_Confirmationtext+httpContext.getMessage( "Se eliminaran: COLORANTES y PRODUCTOS(#)", "")+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_envioopciona.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_envioopciona_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciona_Confirmationtext);
               Dvelop_confirmpanel_envioopciona_Confirmationtext = Dvelop_confirmpanel_envioopciona_Confirmationtext+httpContext.getMessage( "Desea continuar?", "") ;
               ucDvelop_confirmpanel_envioopciona.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_envioopciona_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciona_Confirmationtext);
            }
            this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_ENVIOOPCIONAContainer", "Confirm", "", new Object[] {});
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25EnviodeEnsayoaCliente_SDT", AV25EnviodeEnsayoaCliente_SDT);
      nGXsfl_79_bak_idx = nGXsfl_79_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV59ManageFiltersExecutionStep, AV18ColumnsSelector, AV24Emprcod, AV101Pgmname, AV31FilterFullText, AV15Clicod, AV47Lb_Cartaz, AV48Lb_ColNom, AV55Lb_numero, AV51Lb_FechaEfrom, AV54Lb_FechaEto, AV52Lb_FechaEn, AV50Lb_estado, AV14Carvema, AV53Lb_fechaEn2, AV61Moda21, sPrefix) ;
      nGXsfl_79_idx = nGXsfl_79_bak_idx ;
      sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_792( ) ;
   }

   public void e192822( )
   {
      AV77GXV1 = (int)(nGXsfl_79_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV77GXV1 > 0 ) && ( AV25EnviodeEnsayoaCliente_SDT.size() >= AV77GXV1 ) )
      {
         AV25EnviodeEnsayoaCliente_SDT.currentItem( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)) );
      }
      /* Dvelop_confirmpanel_envioopciona_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_envioopciona_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENVIOOPCIONA' */
         S222 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25EnviodeEnsayoaCliente_SDT", AV25EnviodeEnsayoaCliente_SDT);
      nGXsfl_79_bak_idx = nGXsfl_79_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV59ManageFiltersExecutionStep, AV18ColumnsSelector, AV24Emprcod, AV101Pgmname, AV31FilterFullText, AV15Clicod, AV47Lb_Cartaz, AV48Lb_ColNom, AV55Lb_numero, AV51Lb_FechaEfrom, AV54Lb_FechaEto, AV52Lb_FechaEn, AV50Lb_estado, AV14Carvema, AV53Lb_fechaEn2, AV61Moda21, sPrefix) ;
      nGXsfl_79_idx = nGXsfl_79_bak_idx ;
      sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_792( ) ;
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV58ManageFiltersData", AV58ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV35GridState", AV35GridState);
   }

   public void e232822( )
   {
      /* 'DoCancelar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e242822( )
   {
      AV77GXV1 = (int)(nGXsfl_79_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV77GXV1 > 0 ) && ( AV25EnviodeEnsayoaCliente_SDT.size() >= AV77GXV1 ) )
      {
         AV25EnviodeEnsayoaCliente_SDT.currentItem( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)) );
      }
      /* 'DoMarcarTodos' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADSELECTEDROWS' */
      S232 ();
      if (returnInSub) return;
      if ( AV73SelectedRows.size() == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_NoRecordSelected", ""));
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV73SelectedRows", AV73SelectedRows);
   }

   public void e252822( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV29ExcelFilename ;
      GXv_char3[0] = AV28ErrorMessage ;
      new app.wcenviodeensayoaclienteexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      wcenviodeensayoacliente_impl.this.AV29ExcelFilename = GXv_char4[0] ;
      wcenviodeensayoacliente_impl.this.AV28ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV29ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV29ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV28ErrorMessage);
      }
   }

   public void e262822( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.wcenviodeensayoaclienteexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
      GXt_objcol_SdtEnviodeEnsayoaCliente_SDT_Item12 = AV25EnviodeEnsayoaCliente_SDT ;
      GXv_objcol_SdtEnviodeEnsayoaCliente_SDT_Item13[0] = GXt_objcol_SdtEnviodeEnsayoaCliente_SDT_Item12 ;
      new app.gestionlaboratorio.enviodeensayoacliente_dp(remoteHandle, context).execute( AV24Emprcod, AV15Clicod, AV47Lb_Cartaz, AV48Lb_ColNom, AV55Lb_numero, AV51Lb_FechaEfrom, AV54Lb_FechaEto, AV53Lb_fechaEn2, AV50Lb_estado, AV14Carvema, GXv_objcol_SdtEnviodeEnsayoaCliente_SDT_Item13) ;
      GXt_objcol_SdtEnviodeEnsayoaCliente_SDT_Item12 = GXv_objcol_SdtEnviodeEnsayoaCliente_SDT_Item13[0] ;
      AV25EnviodeEnsayoaCliente_SDT = GXt_objcol_SdtEnviodeEnsayoaCliente_SDT_Item12 ;
      gx_BV79 = true ;
   }

   public void S172( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV18ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "EnviodeEnsayoaCliente_SDT__Lb_numero", "", "Nº de Ensayo", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "EnviodeEnsayoaCliente_SDT__Clicod", "", "Cliente", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "EnviodeEnsayoaCliente_SDT__CliNom", "", "Nombre", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "EnviodeEnsayoaCliente_SDT__Lb_ArtCod", "", "Articulo", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "EnviodeEnsayoaCliente_SDT__Lb_ColNomC", "", "Color Cliente", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "EnviodeEnsayoaCliente_SDT__Lb_Rb", "", "Rb", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "EnviodeEnsayoaCliente_SDT__Lb_opcion", "", "Opcion", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "EnviodeEnsayoaCliente_SDT__Lb_numop", "", "Nº", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "EnviodeEnsayoaCliente_SDT__Lb_Cartaz", "", "Coleccion", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "EnviodeEnsayoaCliente_SDT__Lb_FechaE", "", "Fecha Entrada", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "EnviodeEnsayoaCliente_SDT__Lb_FechaEn", "", "Fecha Envio", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "EnviodeEnsayoaCliente_SDT__Lb_Estado", "", "St", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "EnviodeEnsayoaCliente_SDT__Eliminar", "", "E", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXt_char1 = AV71UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCEnviodeEnsayoaClienteColumnsSelector", GXv_char4) ;
      wcenviodeensayoacliente_impl.this.GXt_char1 = GXv_char4[0] ;
      AV71UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV71UserCustomValue)==0) ) )
      {
         AV19ColumnsSelectorAux.fromxml(AV71UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector14[0] = AV19ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector15[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, GXv_SdtWWPColumnsSelector15) ;
         AV19ColumnsSelectorAux = GXv_SdtWWPColumnsSelector14[0] ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      }
   }

   public void S152( )
   {
      /* 'CHECKSECURITYFORACTIONS' Routine */
      returnInSub = false ;
      GXt_int7 = (byte)(0) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV24Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      wcenviodeensayoacliente_impl.this.GXt_int7 = GXv_int8[0] ;
      AV67TempBoolean = (boolean)((GXt_int7==1)) ;
      if ( ! ( AV67TempBoolean ) )
      {
         bttBtnenvioopciona_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtnenvioopciona_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnenvioopciona_Visible), 5, 0), true);
      }
   }

   public void S122( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = AV58ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WCEnviodeEnsayoaClienteFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[0] ;
      AV58ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
   }

   public void S182( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV31FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31FilterFullText", AV31FilterFullText);
   }

   public void S202( )
   {
      /* 'DO ACTION ENVIAR' Routine */
      returnInSub = false ;
      AV10Lb_HoraEn = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
      AV56Lb_opcions = "" ;
      AV109GXV31 = 1 ;
      while ( AV109GXV31 <= AV73SelectedRows.size() )
      {
         AV64SelectedRowsItem = (app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV73SelectedRows.elementAt(-1+AV109GXV31));
         AV40IN_Lb_numero = AV64SelectedRowsItem.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_numero() ;
         AV42IN_Lb_opcion = AV64SelectedRowsItem.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_opcion() ;
         GXv_char4[0] = AV24Emprcod ;
         GXv_int11[0] = AV40IN_Lb_numero ;
         GXv_char3[0] = AV42IN_Lb_opcion ;
         GXv_date18[0] = AV52Lb_FechaEn ;
         GXv_dtime19[0] = AV10Lb_HoraEn ;
         GXv_int8[0] = (byte)(1) ;
         new app.gestionlaboratorio.pens006(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_char3, GXv_date18, GXv_dtime19, GXv_int8) ;
         wcenviodeensayoacliente_impl.this.AV24Emprcod = GXv_char4[0] ;
         wcenviodeensayoacliente_impl.this.AV40IN_Lb_numero = GXv_int11[0] ;
         wcenviodeensayoacliente_impl.this.AV42IN_Lb_opcion = GXv_char3[0] ;
         wcenviodeensayoacliente_impl.this.AV52Lb_FechaEn = GXv_date18[0] ;
         wcenviodeensayoacliente_impl.this.AV10Lb_HoraEn = GXv_dtime19[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Emprcod", AV24Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52Lb_FechaEn", localUtil.format(AV52Lb_FechaEn, "99/99/99"));
         AV16Clicodgrid = AV64SelectedRowsItem.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Clicod() ;
         if ( ( AV61Moda21 == 1 ) && ( AV40IN_Lb_numero != AV41IN_Lb_numerol ) && ( AV41IN_Lb_numerol > 0 ) )
         {
            GXv_char4[0] = AV24Emprcod ;
            GXv_int11[0] = AV41IN_Lb_numerol ;
            GXv_char3[0] = AV56Lb_opcions ;
            GXv_date18[0] = AV52Lb_FechaEn ;
            GXv_int10[0] = AV64SelectedRowsItem.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Clicod() ;
            new app.gestionlaboratorio.pregcor8(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_char3, GXv_date18, GXv_int10) ;
            wcenviodeensayoacliente_impl.this.AV24Emprcod = GXv_char4[0] ;
            wcenviodeensayoacliente_impl.this.AV41IN_Lb_numerol = GXv_int11[0] ;
            wcenviodeensayoacliente_impl.this.AV56Lb_opcions = GXv_char3[0] ;
            wcenviodeensayoacliente_impl.this.AV52Lb_FechaEn = GXv_date18[0] ;
            AV64SelectedRowsItem.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Clicod( GXv_int10[0] );
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Emprcod", AV24Emprcod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41IN_Lb_numerol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41IN_Lb_numerol), 8, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52Lb_FechaEn", localUtil.format(AV52Lb_FechaEn, "99/99/99"));
            AV56Lb_opcions = " " ;
         }
         GXv_char4[0] = AV24Emprcod ;
         GXv_int11[0] = AV40IN_Lb_numero ;
         new app.gestionlaboratorio.pdbgl00(remoteHandle, context).execute( GXv_char4, GXv_int11) ;
         wcenviodeensayoacliente_impl.this.AV24Emprcod = GXv_char4[0] ;
         wcenviodeensayoacliente_impl.this.AV40IN_Lb_numero = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Emprcod", AV24Emprcod);
         if ( GXutil.strcmp(AV56Lb_opcions, " ") == 0 )
         {
            AV56Lb_opcions = GXutil.trim( AV42IN_Lb_opcion) + "+" ;
         }
         else
         {
            AV56Lb_opcions += GXutil.concat( GXutil.trim( AV42IN_Lb_opcion), "+", "") ;
         }
         AV41IN_Lb_numerol = AV40IN_Lb_numero ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41IN_Lb_numerol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41IN_Lb_numerol), 8, 0));
         if ( AV61Moda21 == 1 )
         {
            GXv_char4[0] = AV24Emprcod ;
            GXv_int11[0] = AV41IN_Lb_numerol ;
            GXv_char3[0] = AV56Lb_opcions ;
            GXv_date18[0] = AV52Lb_FechaEn ;
            GXv_int10[0] = AV16Clicodgrid ;
            new app.gestionlaboratorio.pregcor8(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_char3, GXv_date18, GXv_int10) ;
            wcenviodeensayoacliente_impl.this.AV24Emprcod = GXv_char4[0] ;
            wcenviodeensayoacliente_impl.this.AV41IN_Lb_numerol = GXv_int11[0] ;
            wcenviodeensayoacliente_impl.this.AV56Lb_opcions = GXv_char3[0] ;
            wcenviodeensayoacliente_impl.this.AV52Lb_FechaEn = GXv_date18[0] ;
            wcenviodeensayoacliente_impl.this.AV16Clicodgrid = GXv_int10[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Emprcod", AV24Emprcod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41IN_Lb_numerol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41IN_Lb_numerol), 8, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52Lb_FechaEn", localUtil.format(AV52Lb_FechaEn, "99/99/99"));
         }
         AV109GXV31 = (int)(AV109GXV31+1) ;
      }
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S142 ();
      if (returnInSub) return;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S212( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      AV110GXV32 = 1 ;
      while ( AV110GXV32 <= AV25EnviodeEnsayoaCliente_SDT.size() )
      {
         AV26EnviodeEnsayoaCliente_SDT_item = (app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV110GXV32));
         if ( ( AV26EnviodeEnsayoaCliente_SDT_item.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Eliminar() ) && ( AV26EnviodeEnsayoaCliente_SDT_item.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_estado() == 1 ) )
         {
            AV40IN_Lb_numero = AV26EnviodeEnsayoaCliente_SDT_item.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_numero() ;
            AV42IN_Lb_opcion = AV26EnviodeEnsayoaCliente_SDT_item.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_opcion() ;
            AV30Fec_null = GXutil.nullDate() ;
            AV37Hora_null = GXutil.resetTime( GXutil.nullDate() );
            AV23Elimino_e = (short)(1) ;
            GXv_char4[0] = AV24Emprcod ;
            GXv_int11[0] = AV40IN_Lb_numero ;
            GXv_char3[0] = AV42IN_Lb_opcion ;
            GXv_date18[0] = AV30Fec_null ;
            GXv_dtime19[0] = GXutil.resetDate(AV37Hora_null) ;
            GXv_int8[0] = (byte)(0) ;
            new app.gestionlaboratorio.pens006(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_char3, GXv_date18, GXv_dtime19, GXv_int8) ;
            wcenviodeensayoacliente_impl.this.AV24Emprcod = GXv_char4[0] ;
            wcenviodeensayoacliente_impl.this.AV40IN_Lb_numero = GXv_int11[0] ;
            wcenviodeensayoacliente_impl.this.AV42IN_Lb_opcion = GXv_char3[0] ;
            wcenviodeensayoacliente_impl.this.AV30Fec_null = GXv_date18[0] ;
            wcenviodeensayoacliente_impl.this.AV37Hora_null = GXv_dtime19[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Emprcod", AV24Emprcod);
            GXv_char4[0] = AV24Emprcod ;
            GXv_int11[0] = AV40IN_Lb_numero ;
            new app.gestionlaboratorio.pdbgl00(remoteHandle, context).execute( GXv_char4, GXv_int11) ;
            wcenviodeensayoacliente_impl.this.AV24Emprcod = GXv_char4[0] ;
            wcenviodeensayoacliente_impl.this.AV40IN_Lb_numero = GXv_int11[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Emprcod", AV24Emprcod);
         }
         AV110GXV32 = (int)(AV110GXV32+1) ;
      }
      AV23Elimino_e = (short)(0) ;
      AV111GXV33 = 1 ;
      while ( AV111GXV33 <= AV25EnviodeEnsayoaCliente_SDT.size() )
      {
         AV26EnviodeEnsayoaCliente_SDT_item = (app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV111GXV33));
         if ( AV26EnviodeEnsayoaCliente_SDT_item.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_estado() == 1 )
         {
            AV23Elimino_e = (short)(1) ;
         }
         AV111GXV33 = (int)(AV111GXV33+1) ;
      }
      if ( AV61Moda21 == 1 )
      {
         AV56Lb_opcions = "" ;
         AV41IN_Lb_numerol = 0 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41IN_Lb_numerol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41IN_Lb_numerol), 8, 0));
         AV23Elimino_e = (short)(0) ;
         AV112GXV34 = 1 ;
         while ( AV112GXV34 <= AV25EnviodeEnsayoaCliente_SDT.size() )
         {
            AV26EnviodeEnsayoaCliente_SDT_item = (app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV112GXV34));
            AV40IN_Lb_numero = AV26EnviodeEnsayoaCliente_SDT_item.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_numero() ;
            AV42IN_Lb_opcion = AV26EnviodeEnsayoaCliente_SDT_item.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_opcion() ;
            if ( AV26EnviodeEnsayoaCliente_SDT_item.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_estado() == 1 )
            {
               AV23Elimino_e = (short)(1) ;
               if ( ( AV40IN_Lb_numero != AV41IN_Lb_numerol ) && ( AV41IN_Lb_numerol > 0 ) )
               {
                  GXv_char4[0] = AV24Emprcod ;
                  GXv_int11[0] = AV41IN_Lb_numerol ;
                  GXv_char3[0] = AV56Lb_opcions ;
                  GXv_date18[0] = AV39IN_lb_fechaen ;
                  GXv_int10[0] = AV26EnviodeEnsayoaCliente_SDT_item.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Clicod() ;
                  new app.gestionlaboratorio.pregcor8(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_char3, GXv_date18, GXv_int10) ;
                  wcenviodeensayoacliente_impl.this.AV24Emprcod = GXv_char4[0] ;
                  wcenviodeensayoacliente_impl.this.AV41IN_Lb_numerol = GXv_int11[0] ;
                  wcenviodeensayoacliente_impl.this.AV56Lb_opcions = GXv_char3[0] ;
                  wcenviodeensayoacliente_impl.this.AV39IN_lb_fechaen = GXv_date18[0] ;
                  AV26EnviodeEnsayoaCliente_SDT_item.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Clicod( GXv_int10[0] );
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Emprcod", AV24Emprcod);
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41IN_Lb_numerol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41IN_Lb_numerol), 8, 0));
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39IN_lb_fechaen", localUtil.format(AV39IN_lb_fechaen, "99/99/99"));
                  AV56Lb_opcions = " " ;
               }
               if ( GXutil.strcmp(AV56Lb_opcions, " ") == 0 )
               {
                  AV56Lb_opcions = GXutil.trim( AV42IN_Lb_opcion) + "+" ;
               }
               else
               {
                  AV56Lb_opcions += GXutil.concat( GXutil.trim( AV42IN_Lb_opcion), "+", "") ;
               }
               AV39IN_lb_fechaen = AV52Lb_FechaEn ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39IN_lb_fechaen", localUtil.format(AV39IN_lb_fechaen, "99/99/99"));
               ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)(AV25EnviodeEnsayoaCliente_SDT.currentItem())).setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_estado( (byte)(0) );
            }
            else
            {
               if ( ( AV40IN_Lb_numero != AV41IN_Lb_numerol ) && ( AV41IN_Lb_numerol > 0 ) )
               {
                  if ( GXutil.strcmp(AV56Lb_opcions, " ") == 0 )
                  {
                     AV39IN_lb_fechaen = GXutil.nullDate() ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39IN_lb_fechaen", localUtil.format(AV39IN_lb_fechaen, "99/99/99"));
                  }
                  GXv_char4[0] = AV24Emprcod ;
                  GXv_int11[0] = AV41IN_Lb_numerol ;
                  GXv_char3[0] = AV56Lb_opcions ;
                  GXv_date18[0] = AV39IN_lb_fechaen ;
                  GXv_int10[0] = AV26EnviodeEnsayoaCliente_SDT_item.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Clicod() ;
                  new app.gestionlaboratorio.pregcor8(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_char3, GXv_date18, GXv_int10) ;
                  wcenviodeensayoacliente_impl.this.AV24Emprcod = GXv_char4[0] ;
                  wcenviodeensayoacliente_impl.this.AV41IN_Lb_numerol = GXv_int11[0] ;
                  wcenviodeensayoacliente_impl.this.AV56Lb_opcions = GXv_char3[0] ;
                  wcenviodeensayoacliente_impl.this.AV39IN_lb_fechaen = GXv_date18[0] ;
                  AV26EnviodeEnsayoaCliente_SDT_item.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Clicod( GXv_int10[0] );
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Emprcod", AV24Emprcod);
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41IN_Lb_numerol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41IN_Lb_numerol), 8, 0));
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39IN_lb_fechaen", localUtil.format(AV39IN_lb_fechaen, "99/99/99"));
                  AV56Lb_opcions = " " ;
               }
            }
            AV16Clicodgrid = AV26EnviodeEnsayoaCliente_SDT_item.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Clicod() ;
            AV41IN_Lb_numerol = AV40IN_Lb_numero ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41IN_Lb_numerol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41IN_Lb_numerol), 8, 0));
            AV112GXV34 = (int)(AV112GXV34+1) ;
         }
         if ( AV23Elimino_e == 1 )
         {
            if ( GXutil.strcmp(AV56Lb_opcions, " ") == 0 )
            {
               AV39IN_lb_fechaen = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39IN_lb_fechaen", localUtil.format(AV39IN_lb_fechaen, "99/99/99"));
            }
            GXv_char4[0] = AV24Emprcod ;
            GXv_int11[0] = AV41IN_Lb_numerol ;
            GXv_char3[0] = AV56Lb_opcions ;
            GXv_date18[0] = AV39IN_lb_fechaen ;
            GXv_int10[0] = AV16Clicodgrid ;
            new app.gestionlaboratorio.pregcor8(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_char3, GXv_date18, GXv_int10) ;
            wcenviodeensayoacliente_impl.this.AV24Emprcod = GXv_char4[0] ;
            wcenviodeensayoacliente_impl.this.AV41IN_Lb_numerol = GXv_int11[0] ;
            wcenviodeensayoacliente_impl.this.AV56Lb_opcions = GXv_char3[0] ;
            wcenviodeensayoacliente_impl.this.AV39IN_lb_fechaen = GXv_date18[0] ;
            wcenviodeensayoacliente_impl.this.AV16Clicodgrid = GXv_int10[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Emprcod", AV24Emprcod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41IN_Lb_numerol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41IN_Lb_numerol), 8, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39IN_lb_fechaen", localUtil.format(AV39IN_lb_fechaen, "99/99/99"));
         }
         if ( AV23Elimino_e == 0 )
         {
            AV113GXV35 = 1 ;
            while ( AV113GXV35 <= AV25EnviodeEnsayoaCliente_SDT.size() )
            {
               AV26EnviodeEnsayoaCliente_SDT_item = (app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV113GXV35));
               AV30Fec_null = GXutil.nullDate() ;
               GXv_char4[0] = AV24Emprcod ;
               GXv_int11[0] = AV26EnviodeEnsayoaCliente_SDT_item.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_numero() ;
               GXv_char3[0] = " " ;
               GXv_date18[0] = AV30Fec_null ;
               GXv_int10[0] = AV26EnviodeEnsayoaCliente_SDT_item.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Clicod() ;
               new app.gestionlaboratorio.pregcor8(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_char3, GXv_date18, GXv_int10) ;
               wcenviodeensayoacliente_impl.this.AV24Emprcod = GXv_char4[0] ;
               AV26EnviodeEnsayoaCliente_SDT_item.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_numero( GXv_int11[0] );
               wcenviodeensayoacliente_impl.this.AV30Fec_null = GXv_date18[0] ;
               AV26EnviodeEnsayoaCliente_SDT_item.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Clicod( GXv_int10[0] );
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Emprcod", AV24Emprcod);
               AV113GXV35 = (int)(AV113GXV35+1) ;
            }
         }
      }
      GXt_objcol_SdtEnviodeEnsayoaCliente_SDT_Item12 = AV25EnviodeEnsayoaCliente_SDT ;
      GXv_objcol_SdtEnviodeEnsayoaCliente_SDT_Item13[0] = GXt_objcol_SdtEnviodeEnsayoaCliente_SDT_Item12 ;
      new app.gestionlaboratorio.enviodeensayoacliente_dp(remoteHandle, context).execute( AV24Emprcod, AV15Clicod, AV47Lb_Cartaz, AV48Lb_ColNom, AV55Lb_numero, AV51Lb_FechaEfrom, AV54Lb_FechaEto, AV52Lb_FechaEn, AV50Lb_estado, AV14Carvema, GXv_objcol_SdtEnviodeEnsayoaCliente_SDT_Item13) ;
      GXt_objcol_SdtEnviodeEnsayoaCliente_SDT_Item12 = GXv_objcol_SdtEnviodeEnsayoaCliente_SDT_Item13[0] ;
      AV25EnviodeEnsayoaCliente_SDT = GXt_objcol_SdtEnviodeEnsayoaCliente_SDT_Item12 ;
      gx_BV79 = true ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S222( )
   {
      /* 'DO ACTION ENVIOOPCIONA' Routine */
      returnInSub = false ;
      AV114GXV36 = 1 ;
      while ( AV114GXV36 <= AV25EnviodeEnsayoaCliente_SDT.size() )
      {
         AV26EnviodeEnsayoaCliente_SDT_item = (app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV114GXV36));
         if ( GXutil.strcmp(AV26EnviodeEnsayoaCliente_SDT_item.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_opcion(), httpContext.getMessage( "A", "")) == 0 )
         {
            GXv_char4[0] = AV24Emprcod ;
            GXv_int11[0] = AV26EnviodeEnsayoaCliente_SDT_item.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_numero() ;
            GXv_char3[0] = AV26EnviodeEnsayoaCliente_SDT_item.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_opcion() ;
            GXv_date18[0] = AV52Lb_FechaEn ;
            GXv_decimal20[0] = AV26EnviodeEnsayoaCliente_SDT_item.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_costee() ;
            GXv_int21[0] = AV26EnviodeEnsayoaCliente_SDT_item.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_rgb() ;
            GXv_int8[0] = AV26EnviodeEnsayoaCliente_SDT_item.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_F_cformu() ;
            GXv_int22[0] = (byte)(0) ;
            GXv_int23[0] = (byte)(0) ;
            GXv_int10[0] = AV26EnviodeEnsayoaCliente_SDT_item.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_colnum() ;
            GXv_char2[0] = httpContext.getMessage( "N", "") ;
            new app.gestionlaboratorio.pens009(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_char3, GXv_date18, GXv_decimal20, GXv_int21, GXv_int8, GXv_int22, GXv_int23, GXv_int10, GXv_char2) ;
            wcenviodeensayoacliente_impl.this.AV24Emprcod = GXv_char4[0] ;
            AV26EnviodeEnsayoaCliente_SDT_item.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_numero( GXv_int11[0] );
            AV26EnviodeEnsayoaCliente_SDT_item.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_opcion( GXv_char3[0] );
            wcenviodeensayoacliente_impl.this.AV52Lb_FechaEn = GXv_date18[0] ;
            AV26EnviodeEnsayoaCliente_SDT_item.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_costee( GXv_decimal20[0] );
            AV26EnviodeEnsayoaCliente_SDT_item.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_rgb( GXv_int21[0] );
            AV26EnviodeEnsayoaCliente_SDT_item.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_F_cformu( GXv_int8[0] );
            AV26EnviodeEnsayoaCliente_SDT_item.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_colnum( GXv_int10[0] );
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Emprcod", AV24Emprcod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52Lb_FechaEn", localUtil.format(AV52Lb_FechaEn, "99/99/99"));
         }
         AV114GXV36 = (int)(AV114GXV36+1) ;
      }
      GXt_objcol_SdtEnviodeEnsayoaCliente_SDT_Item12 = AV25EnviodeEnsayoaCliente_SDT ;
      GXv_objcol_SdtEnviodeEnsayoaCliente_SDT_Item13[0] = GXt_objcol_SdtEnviodeEnsayoaCliente_SDT_Item12 ;
      new app.gestionlaboratorio.enviodeensayoacliente_dp(remoteHandle, context).execute( AV24Emprcod, AV15Clicod, AV47Lb_Cartaz, AV48Lb_ColNom, AV55Lb_numero, AV51Lb_FechaEfrom, AV54Lb_FechaEto, AV52Lb_FechaEn, AV50Lb_estado, AV14Carvema, GXv_objcol_SdtEnviodeEnsayoaCliente_SDT_Item13) ;
      GXt_objcol_SdtEnviodeEnsayoaCliente_SDT_Item12 = GXv_objcol_SdtEnviodeEnsayoaCliente_SDT_Item13[0] ;
      AV25EnviodeEnsayoaCliente_SDT = GXt_objcol_SdtEnviodeEnsayoaCliente_SDT_Item12 ;
      gx_BV79 = true ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S232( )
   {
      /* 'LOADSELECTEDROWS' Routine */
      returnInSub = false ;
      AV73SelectedRows = new GXBaseCollection<app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item>(app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item.class, "Item", "TexplusNET", remoteHandle) ;
      AV115GXV37 = 1 ;
      while ( AV115GXV37 <= AV25EnviodeEnsayoaCliente_SDT.size() )
      {
         AV27EnviodeEnsayoaCliente_SDTItem = (app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV115GXV37));
         if ( AV27EnviodeEnsayoaCliente_SDTItem.getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Selected() )
         {
            AV74SelectedRow = AV27EnviodeEnsayoaCliente_SDTItem.Clone();
            AV73SelectedRows.add(AV74SelectedRow, 0);
         }
         AV115GXV37 = (int)(AV115GXV37+1) ;
      }
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV65Session.getValue(AV101Pgmname+"GridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV101Pgmname+"GridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV65Session.getValue(AV101Pgmname+"GridState"), null, null);
      }
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S192 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV35GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV35GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV35GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S192( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV116GXV38 = 1 ;
      while ( AV116GXV38 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV116GXV38));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV31FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31FilterFullText", AV31FilterFullText);
         }
         AV116GXV38 = (int)(AV116GXV38+1) ;
      }
   }

   public void S162( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV35GridState.fromxml(AV65Session.getValue(AV101Pgmname+"GridState"), null, null);
      AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState24[0] = AV35GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV31FilterFullText)==0), (short)(0), AV31FilterFullText, "") ;
      AV35GridState = GXv_SdtWWPGridState24[0] ;
      if ( ! (GXutil.strcmp("", AV24Emprcod)==0) )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV36GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV36GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV24Emprcod );
         AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV36GridStateFilterValue, 0);
      }
      if ( ! (0==AV15Clicod) )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV36GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV36GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV15Clicod, 6, 0) );
         AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV36GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV47Lb_Cartaz)==0) )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV36GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_CARTAZ" );
         AV36GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV47Lb_Cartaz );
         AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV36GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV48Lb_ColNom)==0) )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV36GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_COLNOM" );
         AV36GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV48Lb_ColNom );
         AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV36GridStateFilterValue, 0);
      }
      if ( ! (0==AV55Lb_numero) )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV36GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_NUMERO" );
         AV36GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV55Lb_numero, 8, 0) );
         AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV36GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV51Lb_FechaEfrom)) )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV36GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_FECHAEFROM" );
         AV36GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV51Lb_FechaEfrom, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV36GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV54Lb_FechaEto)) )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV36GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_FECHAETO" );
         AV36GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV54Lb_FechaEto, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV36GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52Lb_FechaEn)) )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV36GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_FECHAEN" );
         AV36GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV52Lb_FechaEn, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV36GridStateFilterValue, 0);
      }
      if ( ! (0==AV50Lb_estado) )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV36GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_ESTADO" );
         AV36GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV50Lb_estado, 1, 0) );
         AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV36GridStateFilterValue, 0);
      }
      if ( ! (0==AV14Carvema) )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV36GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CARVEMA" );
         AV36GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV14Carvema, 4, 0) );
         AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV36GridStateFilterValue, 0);
      }
      AV35GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV35GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV101Pgmname+"GridState", AV35GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
   }

   public void e302822( )
   {
      AV77GXV1 = (int)(nGXsfl_79_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV77GXV1 > 0 ) && ( AV25EnviodeEnsayoaCliente_SDT.size() >= AV77GXV1 ) )
      {
         AV25EnviodeEnsayoaCliente_SDT.currentItem( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)) );
      }
      /* 'DoDesmarcarTodos' Routine */
      returnInSub = false ;
      GXt_objcol_SdtEnviodeEnsayoaCliente_SDT_Item12 = AV25EnviodeEnsayoaCliente_SDT ;
      GXv_objcol_SdtEnviodeEnsayoaCliente_SDT_Item13[0] = GXt_objcol_SdtEnviodeEnsayoaCliente_SDT_Item12 ;
      new app.gestionlaboratorio.enviodeensayoacliente_dp(remoteHandle, context).execute( AV24Emprcod, AV15Clicod, AV47Lb_Cartaz, AV48Lb_ColNom, AV55Lb_numero, AV51Lb_FechaEfrom, AV54Lb_FechaEto, AV53Lb_fechaEn2, AV50Lb_estado, AV14Carvema, GXv_objcol_SdtEnviodeEnsayoaCliente_SDT_Item13) ;
      GXt_objcol_SdtEnviodeEnsayoaCliente_SDT_Item12 = GXv_objcol_SdtEnviodeEnsayoaCliente_SDT_Item13[0] ;
      AV25EnviodeEnsayoaCliente_SDT = GXt_objcol_SdtEnviodeEnsayoaCliente_SDT_Item12 ;
      gx_BV79 = true ;
      /*  Sending Event outputs  */
      if ( gx_BV79 )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25EnviodeEnsayoaCliente_SDT", AV25EnviodeEnsayoaCliente_SDT);
         nGXsfl_79_bak_idx = nGXsfl_79_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV59ManageFiltersExecutionStep, AV18ColumnsSelector, AV24Emprcod, AV101Pgmname, AV31FilterFullText, AV15Clicod, AV47Lb_Cartaz, AV48Lb_ColNom, AV55Lb_numero, AV51Lb_FechaEfrom, AV54Lb_FechaEto, AV52Lb_FechaEn, AV50Lb_estado, AV14Carvema, AV53Lb_fechaEn2, AV61Moda21, sPrefix) ;
         nGXsfl_79_idx = nGXsfl_79_bak_idx ;
         sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_792( ) ;
      }
   }

   public void wb_table4_131_2822( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_envioopciona_Internalname, tblTabledvelop_confirmpanel_envioopciona_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_envioopciona.setProperty("Title", Dvelop_confirmpanel_envioopciona_Title);
         ucDvelop_confirmpanel_envioopciona.setProperty("ConfirmationText", Dvelop_confirmpanel_envioopciona_Confirmationtext);
         ucDvelop_confirmpanel_envioopciona.setProperty("YesButtonCaption", Dvelop_confirmpanel_envioopciona_Yesbuttoncaption);
         ucDvelop_confirmpanel_envioopciona.setProperty("NoButtonCaption", Dvelop_confirmpanel_envioopciona_Nobuttoncaption);
         ucDvelop_confirmpanel_envioopciona.setProperty("CancelButtonCaption", Dvelop_confirmpanel_envioopciona_Cancelbuttoncaption);
         ucDvelop_confirmpanel_envioopciona.setProperty("YesButtonPosition", Dvelop_confirmpanel_envioopciona_Yesbuttonposition);
         ucDvelop_confirmpanel_envioopciona.setProperty("ConfirmType", Dvelop_confirmpanel_envioopciona_Confirmtype);
         ucDvelop_confirmpanel_envioopciona.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_envioopciona_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONAContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_131_2822e( true) ;
      }
      else
      {
         wb_table4_131_2822e( false) ;
      }
   }

   public void wb_table3_126_2822( boolean wbgen )
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
         wb_table3_126_2822e( true) ;
      }
      else
      {
         wb_table3_126_2822e( false) ;
      }
   }

   public void wb_table2_121_2822( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_enviar_Internalname, tblTabledvelop_confirmpanel_enviar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_enviar.setProperty("Title", Dvelop_confirmpanel_enviar_Title);
         ucDvelop_confirmpanel_enviar.setProperty("ConfirmationText", Dvelop_confirmpanel_enviar_Confirmationtext);
         ucDvelop_confirmpanel_enviar.setProperty("YesButtonCaption", Dvelop_confirmpanel_enviar_Yesbuttoncaption);
         ucDvelop_confirmpanel_enviar.setProperty("NoButtonCaption", Dvelop_confirmpanel_enviar_Nobuttoncaption);
         ucDvelop_confirmpanel_enviar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_enviar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_enviar.setProperty("YesButtonPosition", Dvelop_confirmpanel_enviar_Yesbuttonposition);
         ucDvelop_confirmpanel_enviar.setProperty("ConfirmType", Dvelop_confirmpanel_enviar_Confirmtype);
         ucDvelop_confirmpanel_enviar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_enviar_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_ENVIARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_ENVIARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_121_2822e( true) ;
      }
      else
      {
         wb_table2_121_2822e( false) ;
      }
   }

   public void wb_table1_27_2822( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV58ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_32_2822( true) ;
      }
      else
      {
         wb_table5_32_2822( false) ;
      }
      return  ;
   }

   public void wb_table5_32_2822e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_2822e( true) ;
      }
      else
      {
         wb_table1_27_2822e( false) ;
      }
   }

   public void wb_table5_32_2822( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'" + sPrefix + "',false,'" + sGXsfl_79_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV31FilterFullText, GXutil.rtrim( localUtil.format( AV31FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WCEnviodeEnsayoaCliente.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_32_2822e( true) ;
      }
      else
      {
         wb_table5_32_2822e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV24Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Emprcod", AV24Emprcod);
      AV15Clicod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Clicod), 6, 0));
      AV47Lb_Cartaz = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Lb_Cartaz", AV47Lb_Cartaz);
      AV48Lb_ColNom = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48Lb_ColNom", AV48Lb_ColNom);
      AV55Lb_numero = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55Lb_numero), 8, 0));
      AV51Lb_FechaEfrom = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Lb_FechaEfrom", localUtil.format(AV51Lb_FechaEfrom, "99/99/99"));
      AV54Lb_FechaEto = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54Lb_FechaEto", localUtil.format(AV54Lb_FechaEto, "99/99/99"));
      AV52Lb_FechaEn = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52Lb_FechaEn", localUtil.format(AV52Lb_FechaEn, "99/99/99"));
      AV50Lb_estado = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50Lb_estado", GXutil.str( AV50Lb_estado, 1, 0));
      AV14Carvema = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Carvema", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Carvema), 4, 0));
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
      pa2822( ) ;
      ws2822( ) ;
      we2822( ) ;
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
      sCtrlAV24Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV15Clicod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV47Lb_Cartaz = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV48Lb_ColNom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV55Lb_numero = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV51Lb_FechaEfrom = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV54Lb_FechaEto = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV52Lb_FechaEn = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV50Lb_estado = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV14Carvema = (String)getParm(obj,9,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2822( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcenviodeensayoacliente", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2822( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV24Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Emprcod", AV24Emprcod);
         AV15Clicod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Clicod), 6, 0));
         AV47Lb_Cartaz = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Lb_Cartaz", AV47Lb_Cartaz);
         AV48Lb_ColNom = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48Lb_ColNom", AV48Lb_ColNom);
         AV55Lb_numero = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55Lb_numero), 8, 0));
         AV51Lb_FechaEfrom = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Lb_FechaEfrom", localUtil.format(AV51Lb_FechaEfrom, "99/99/99"));
         AV54Lb_FechaEto = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54Lb_FechaEto", localUtil.format(AV54Lb_FechaEto, "99/99/99"));
         AV52Lb_FechaEn = (java.util.Date)getParm(obj,9,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52Lb_FechaEn", localUtil.format(AV52Lb_FechaEn, "99/99/99"));
         AV50Lb_estado = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50Lb_estado", GXutil.str( AV50Lb_estado, 1, 0));
         AV14Carvema = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Carvema", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Carvema), 4, 0));
      }
      wcpOAV24Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV24Emprcod") ;
      wcpOAV15Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV15Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV47Lb_Cartaz = httpContext.cgiGet( sPrefix+"wcpOAV47Lb_Cartaz") ;
      wcpOAV48Lb_ColNom = httpContext.cgiGet( sPrefix+"wcpOAV48Lb_ColNom") ;
      wcpOAV55Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV55Lb_numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV51Lb_FechaEfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV51Lb_FechaEfrom"), 0) ;
      wcpOAV54Lb_FechaEto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV54Lb_FechaEto"), 0) ;
      wcpOAV52Lb_FechaEn = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV52Lb_FechaEn"), 0) ;
      wcpOAV50Lb_estado = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV50Lb_estado"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV14Carvema = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV14Carvema"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV24Emprcod, wcpOAV24Emprcod) != 0 ) || ( AV15Clicod != wcpOAV15Clicod ) || ( GXutil.strcmp(AV47Lb_Cartaz, wcpOAV47Lb_Cartaz) != 0 ) || ( GXutil.strcmp(AV48Lb_ColNom, wcpOAV48Lb_ColNom) != 0 ) || ( AV55Lb_numero != wcpOAV55Lb_numero ) || !( GXutil.dateCompare(GXutil.resetTime(AV51Lb_FechaEfrom), GXutil.resetTime(wcpOAV51Lb_FechaEfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV54Lb_FechaEto), GXutil.resetTime(wcpOAV54Lb_FechaEto)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV52Lb_FechaEn), GXutil.resetTime(wcpOAV52Lb_FechaEn)) ) || ( AV50Lb_estado != wcpOAV50Lb_estado ) || ( AV14Carvema != wcpOAV14Carvema ) ) )
      {
         setjustcreated();
      }
      wcpOAV24Emprcod = AV24Emprcod ;
      wcpOAV15Clicod = AV15Clicod ;
      wcpOAV47Lb_Cartaz = AV47Lb_Cartaz ;
      wcpOAV48Lb_ColNom = AV48Lb_ColNom ;
      wcpOAV55Lb_numero = AV55Lb_numero ;
      wcpOAV51Lb_FechaEfrom = AV51Lb_FechaEfrom ;
      wcpOAV54Lb_FechaEto = AV54Lb_FechaEto ;
      wcpOAV52Lb_FechaEn = AV52Lb_FechaEn ;
      wcpOAV50Lb_estado = AV50Lb_estado ;
      wcpOAV14Carvema = AV14Carvema ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV24Emprcod = httpContext.cgiGet( sPrefix+"AV24Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV24Emprcod) > 0 )
      {
         AV24Emprcod = httpContext.cgiGet( sCtrlAV24Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Emprcod", AV24Emprcod);
      }
      else
      {
         AV24Emprcod = httpContext.cgiGet( sPrefix+"AV24Emprcod_PARM") ;
      }
      sCtrlAV15Clicod = httpContext.cgiGet( sPrefix+"AV15Clicod_CTRL") ;
      if ( GXutil.len( sCtrlAV15Clicod) > 0 )
      {
         AV15Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV15Clicod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Clicod), 6, 0));
      }
      else
      {
         AV15Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV15Clicod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV47Lb_Cartaz = httpContext.cgiGet( sPrefix+"AV47Lb_Cartaz_CTRL") ;
      if ( GXutil.len( sCtrlAV47Lb_Cartaz) > 0 )
      {
         AV47Lb_Cartaz = httpContext.cgiGet( sCtrlAV47Lb_Cartaz) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Lb_Cartaz", AV47Lb_Cartaz);
      }
      else
      {
         AV47Lb_Cartaz = httpContext.cgiGet( sPrefix+"AV47Lb_Cartaz_PARM") ;
      }
      sCtrlAV48Lb_ColNom = httpContext.cgiGet( sPrefix+"AV48Lb_ColNom_CTRL") ;
      if ( GXutil.len( sCtrlAV48Lb_ColNom) > 0 )
      {
         AV48Lb_ColNom = httpContext.cgiGet( sCtrlAV48Lb_ColNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48Lb_ColNom", AV48Lb_ColNom);
      }
      else
      {
         AV48Lb_ColNom = httpContext.cgiGet( sPrefix+"AV48Lb_ColNom_PARM") ;
      }
      sCtrlAV55Lb_numero = httpContext.cgiGet( sPrefix+"AV55Lb_numero_CTRL") ;
      if ( GXutil.len( sCtrlAV55Lb_numero) > 0 )
      {
         AV55Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV55Lb_numero), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55Lb_numero), 8, 0));
      }
      else
      {
         AV55Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV55Lb_numero_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV51Lb_FechaEfrom = httpContext.cgiGet( sPrefix+"AV51Lb_FechaEfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV51Lb_FechaEfrom) > 0 )
      {
         AV51Lb_FechaEfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV51Lb_FechaEfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Lb_FechaEfrom", localUtil.format(AV51Lb_FechaEfrom, "99/99/99"));
      }
      else
      {
         AV51Lb_FechaEfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV51Lb_FechaEfrom_PARM"), 0) ;
      }
      sCtrlAV54Lb_FechaEto = httpContext.cgiGet( sPrefix+"AV54Lb_FechaEto_CTRL") ;
      if ( GXutil.len( sCtrlAV54Lb_FechaEto) > 0 )
      {
         AV54Lb_FechaEto = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV54Lb_FechaEto), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54Lb_FechaEto", localUtil.format(AV54Lb_FechaEto, "99/99/99"));
      }
      else
      {
         AV54Lb_FechaEto = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV54Lb_FechaEto_PARM"), 0) ;
      }
      sCtrlAV52Lb_FechaEn = httpContext.cgiGet( sPrefix+"AV52Lb_FechaEn_CTRL") ;
      if ( GXutil.len( sCtrlAV52Lb_FechaEn) > 0 )
      {
         AV52Lb_FechaEn = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV52Lb_FechaEn), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52Lb_FechaEn", localUtil.format(AV52Lb_FechaEn, "99/99/99"));
      }
      else
      {
         AV52Lb_FechaEn = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV52Lb_FechaEn_PARM"), 0) ;
      }
      sCtrlAV50Lb_estado = httpContext.cgiGet( sPrefix+"AV50Lb_estado_CTRL") ;
      if ( GXutil.len( sCtrlAV50Lb_estado) > 0 )
      {
         AV50Lb_estado = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV50Lb_estado), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50Lb_estado", GXutil.str( AV50Lb_estado, 1, 0));
      }
      else
      {
         AV50Lb_estado = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV50Lb_estado_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV14Carvema = httpContext.cgiGet( sPrefix+"AV14Carvema_CTRL") ;
      if ( GXutil.len( sCtrlAV14Carvema) > 0 )
      {
         AV14Carvema = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV14Carvema), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Carvema", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Carvema), 4, 0));
      }
      else
      {
         AV14Carvema = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV14Carvema_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa2822( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2822( ) ;
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
      ws2822( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24Emprcod_PARM", GXutil.rtrim( AV24Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV24Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24Emprcod_CTRL", GXutil.rtrim( sCtrlAV24Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15Clicod_PARM", GXutil.ltrim( localUtil.ntoc( AV15Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV15Clicod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15Clicod_CTRL", GXutil.rtrim( sCtrlAV15Clicod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47Lb_Cartaz_PARM", GXutil.rtrim( AV47Lb_Cartaz));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV47Lb_Cartaz)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47Lb_Cartaz_CTRL", GXutil.rtrim( sCtrlAV47Lb_Cartaz));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV48Lb_ColNom_PARM", GXutil.rtrim( AV48Lb_ColNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV48Lb_ColNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV48Lb_ColNom_CTRL", GXutil.rtrim( sCtrlAV48Lb_ColNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV55Lb_numero_PARM", GXutil.ltrim( localUtil.ntoc( AV55Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV55Lb_numero)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV55Lb_numero_CTRL", GXutil.rtrim( sCtrlAV55Lb_numero));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV51Lb_FechaEfrom_PARM", localUtil.dtoc( AV51Lb_FechaEfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV51Lb_FechaEfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV51Lb_FechaEfrom_CTRL", GXutil.rtrim( sCtrlAV51Lb_FechaEfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54Lb_FechaEto_PARM", localUtil.dtoc( AV54Lb_FechaEto, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV54Lb_FechaEto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54Lb_FechaEto_CTRL", GXutil.rtrim( sCtrlAV54Lb_FechaEto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV52Lb_FechaEn_PARM", localUtil.dtoc( AV52Lb_FechaEn, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV52Lb_FechaEn)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV52Lb_FechaEn_CTRL", GXutil.rtrim( sCtrlAV52Lb_FechaEn));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV50Lb_estado_PARM", GXutil.ltrim( localUtil.ntoc( AV50Lb_estado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV50Lb_estado)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV50Lb_estado_CTRL", GXutil.rtrim( sCtrlAV50Lb_estado));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14Carvema_PARM", GXutil.ltrim( localUtil.ntoc( AV14Carvema, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV14Carvema)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14Carvema_CTRL", GXutil.rtrim( sCtrlAV14Carvema));
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
      we2822( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115552743", true, true);
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
      httpContext.AddJavascriptSource("wcenviodeensayoacliente.js", "?202682115552743", false, true);
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_792( )
   {
      chkavEnviodeensayoacliente_sdt__selected.setInternalname( sPrefix+"ENVIODEENSAYOACLIENTE_SDT__SELECTED_"+sGXsfl_79_idx );
      edtavEnviodeensayoacliente_sdt__lb_numero_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_NUMERO_"+sGXsfl_79_idx ;
      edtavEnviodeensayoacliente_sdt__clicod_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__CLICOD_"+sGXsfl_79_idx ;
      edtavEnviodeensayoacliente_sdt__clinom_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__CLINOM_"+sGXsfl_79_idx ;
      edtavEnviodeensayoacliente_sdt__lb_artcod_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_ARTCOD_"+sGXsfl_79_idx ;
      edtavEnviodeensayoacliente_sdt__lb_colnomc_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_COLNOMC_"+sGXsfl_79_idx ;
      edtavEnviodeensayoacliente_sdt__lb_rb_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_RB_"+sGXsfl_79_idx ;
      edtavEnviodeensayoacliente_sdt__lb_opcion_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_OPCION_"+sGXsfl_79_idx ;
      edtavEnviodeensayoacliente_sdt__lb_numop_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_NUMOP_"+sGXsfl_79_idx ;
      edtavEnviodeensayoacliente_sdt__lb_cartaz_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_CARTAZ_"+sGXsfl_79_idx ;
      edtavEnviodeensayoacliente_sdt__lb_fechae_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_FECHAE_"+sGXsfl_79_idx ;
      edtavEnviodeensayoacliente_sdt__lb_fechaen_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_FECHAEN_"+sGXsfl_79_idx ;
      edtavEnviodeensayoacliente_sdt__lb_estado_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_ESTADO_"+sGXsfl_79_idx ;
      edtavEnviodeensayoacliente_sdt__obs_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__OBS_"+sGXsfl_79_idx ;
      chkavEnviodeensayoacliente_sdt__eliminar.setInternalname( sPrefix+"ENVIODEENSAYOACLIENTE_SDT__ELIMINAR_"+sGXsfl_79_idx );
      edtavEnviodeensayoacliente_sdt__f_cformu_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__F_CFORMU_"+sGXsfl_79_idx ;
      edtavEnviodeensayoacliente_sdt__lb_costee_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_COSTEE_"+sGXsfl_79_idx ;
      edtavEnviodeensayoacliente_sdt__lb_rgb_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_RGB_"+sGXsfl_79_idx ;
      edtavEnviodeensayoacliente_sdt__tipcolcod_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__TIPCOLCOD_"+sGXsfl_79_idx ;
      edtavEnviodeensayoacliente_sdt__lb_colnom_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_COLNOM_"+sGXsfl_79_idx ;
      edtavEnviodeensayoacliente_sdt__lb_colnum_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_COLNUM_"+sGXsfl_79_idx ;
      edtavEnviodeensayoacliente_sdt__fornumcol_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__FORNUMCOL_"+sGXsfl_79_idx ;
      edtavEnviodeensayoacliente_sdt__forultuti_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__FORULTUTI_"+sGXsfl_79_idx ;
   }

   public void subsflControlProps_fel_792( )
   {
      chkavEnviodeensayoacliente_sdt__selected.setInternalname( sPrefix+"ENVIODEENSAYOACLIENTE_SDT__SELECTED_"+sGXsfl_79_fel_idx );
      edtavEnviodeensayoacliente_sdt__lb_numero_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_NUMERO_"+sGXsfl_79_fel_idx ;
      edtavEnviodeensayoacliente_sdt__clicod_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__CLICOD_"+sGXsfl_79_fel_idx ;
      edtavEnviodeensayoacliente_sdt__clinom_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__CLINOM_"+sGXsfl_79_fel_idx ;
      edtavEnviodeensayoacliente_sdt__lb_artcod_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_ARTCOD_"+sGXsfl_79_fel_idx ;
      edtavEnviodeensayoacliente_sdt__lb_colnomc_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_COLNOMC_"+sGXsfl_79_fel_idx ;
      edtavEnviodeensayoacliente_sdt__lb_rb_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_RB_"+sGXsfl_79_fel_idx ;
      edtavEnviodeensayoacliente_sdt__lb_opcion_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_OPCION_"+sGXsfl_79_fel_idx ;
      edtavEnviodeensayoacliente_sdt__lb_numop_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_NUMOP_"+sGXsfl_79_fel_idx ;
      edtavEnviodeensayoacliente_sdt__lb_cartaz_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_CARTAZ_"+sGXsfl_79_fel_idx ;
      edtavEnviodeensayoacliente_sdt__lb_fechae_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_FECHAE_"+sGXsfl_79_fel_idx ;
      edtavEnviodeensayoacliente_sdt__lb_fechaen_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_FECHAEN_"+sGXsfl_79_fel_idx ;
      edtavEnviodeensayoacliente_sdt__lb_estado_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_ESTADO_"+sGXsfl_79_fel_idx ;
      edtavEnviodeensayoacliente_sdt__obs_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__OBS_"+sGXsfl_79_fel_idx ;
      chkavEnviodeensayoacliente_sdt__eliminar.setInternalname( sPrefix+"ENVIODEENSAYOACLIENTE_SDT__ELIMINAR_"+sGXsfl_79_fel_idx );
      edtavEnviodeensayoacliente_sdt__f_cformu_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__F_CFORMU_"+sGXsfl_79_fel_idx ;
      edtavEnviodeensayoacliente_sdt__lb_costee_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_COSTEE_"+sGXsfl_79_fel_idx ;
      edtavEnviodeensayoacliente_sdt__lb_rgb_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_RGB_"+sGXsfl_79_fel_idx ;
      edtavEnviodeensayoacliente_sdt__tipcolcod_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__TIPCOLCOD_"+sGXsfl_79_fel_idx ;
      edtavEnviodeensayoacliente_sdt__lb_colnom_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_COLNOM_"+sGXsfl_79_fel_idx ;
      edtavEnviodeensayoacliente_sdt__lb_colnum_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_COLNUM_"+sGXsfl_79_fel_idx ;
      edtavEnviodeensayoacliente_sdt__fornumcol_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__FORNUMCOL_"+sGXsfl_79_fel_idx ;
      edtavEnviodeensayoacliente_sdt__forultuti_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__FORULTUTI_"+sGXsfl_79_fel_idx ;
   }

   public void sendrow_792( )
   {
      subsflControlProps_792( ) ;
      wb2820( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_79_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_79_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_79_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavEnviodeensayoacliente_sdt__selected.getEnabled()!=0)&&(chkavEnviodeensayoacliente_sdt__selected.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 80,'"+sPrefix+"',false,'"+sGXsfl_79_idx+"',79)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "ENVIODEENSAYOACLIENTE_SDT__SELECTED_" + sGXsfl_79_idx ;
         chkavEnviodeensayoacliente_sdt__selected.setName( GXCCtl );
         chkavEnviodeensayoacliente_sdt__selected.setWebtags( "" );
         chkavEnviodeensayoacliente_sdt__selected.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavEnviodeensayoacliente_sdt__selected.getInternalname(), "TitleCaption", chkavEnviodeensayoacliente_sdt__selected.getCaption(), !bGXsfl_79_Refreshing);
         chkavEnviodeensayoacliente_sdt__selected.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavEnviodeensayoacliente_sdt__selected.getInternalname(),GXutil.booltostr( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Selected()),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(80, this, 'true', 'false',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+((chkavEnviodeensayoacliente_sdt__selected.getEnabled()!=0)&&(chkavEnviodeensayoacliente_sdt__selected.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,80);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavEnviodeensayoacliente_sdt__lb_numero_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEnviodeensayoacliente_sdt__lb_numero_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_numero(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavEnviodeensayoacliente_sdt__lb_numero_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_numero()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_numero()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEnviodeensayoacliente_sdt__lb_numero_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavEnviodeensayoacliente_sdt__lb_numero_Visible),Integer.valueOf(edtavEnviodeensayoacliente_sdt__lb_numero_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavEnviodeensayoacliente_sdt__clicod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEnviodeensayoacliente_sdt__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavEnviodeensayoacliente_sdt__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEnviodeensayoacliente_sdt__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavEnviodeensayoacliente_sdt__clicod_Visible),Integer.valueOf(edtavEnviodeensayoacliente_sdt__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavEnviodeensayoacliente_sdt__clinom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEnviodeensayoacliente_sdt__clinom_Internalname,GXutil.rtrim( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Clinom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEnviodeensayoacliente_sdt__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavEnviodeensayoacliente_sdt__clinom_Visible),Integer.valueOf(edtavEnviodeensayoacliente_sdt__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavEnviodeensayoacliente_sdt__lb_artcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEnviodeensayoacliente_sdt__lb_artcod_Internalname,GXutil.rtrim( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_artcod()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEnviodeensayoacliente_sdt__lb_artcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavEnviodeensayoacliente_sdt__lb_artcod_Visible),Integer.valueOf(edtavEnviodeensayoacliente_sdt__lb_artcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavEnviodeensayoacliente_sdt__lb_colnomc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEnviodeensayoacliente_sdt__lb_colnomc_Internalname,GXutil.rtrim( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_colnomc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEnviodeensayoacliente_sdt__lb_colnomc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavEnviodeensayoacliente_sdt__lb_colnomc_Visible),Integer.valueOf(edtavEnviodeensayoacliente_sdt__lb_colnomc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavEnviodeensayoacliente_sdt__lb_rb_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEnviodeensayoacliente_sdt__lb_rb_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_rb(), (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavEnviodeensayoacliente_sdt__lb_rb_Enabled!=0) ? localUtil.format( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_rb(), "ZZZ9.99") : localUtil.format( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_rb(), "ZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEnviodeensayoacliente_sdt__lb_rb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavEnviodeensayoacliente_sdt__lb_rb_Visible),Integer.valueOf(edtavEnviodeensayoacliente_sdt__lb_rb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavEnviodeensayoacliente_sdt__lb_opcion_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEnviodeensayoacliente_sdt__lb_opcion_Internalname,GXutil.rtrim( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_opcion()),GXutil.rtrim( localUtil.format( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_opcion(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEnviodeensayoacliente_sdt__lb_opcion_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavEnviodeensayoacliente_sdt__lb_opcion_Visible),Integer.valueOf(edtavEnviodeensayoacliente_sdt__lb_opcion_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavEnviodeensayoacliente_sdt__lb_numop_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEnviodeensayoacliente_sdt__lb_numop_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_numop(), (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavEnviodeensayoacliente_sdt__lb_numop_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_numop()), "Z9") : localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_numop()), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEnviodeensayoacliente_sdt__lb_numop_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavEnviodeensayoacliente_sdt__lb_numop_Visible),Integer.valueOf(edtavEnviodeensayoacliente_sdt__lb_numop_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavEnviodeensayoacliente_sdt__lb_cartaz_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEnviodeensayoacliente_sdt__lb_cartaz_Internalname,GXutil.rtrim( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_cartaz()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEnviodeensayoacliente_sdt__lb_cartaz_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavEnviodeensayoacliente_sdt__lb_cartaz_Visible),Integer.valueOf(edtavEnviodeensayoacliente_sdt__lb_cartaz_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavEnviodeensayoacliente_sdt__lb_fechae_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEnviodeensayoacliente_sdt__lb_fechae_Internalname,localUtil.format(((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_fechae(), "99/99/99"),localUtil.format( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_fechae(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEnviodeensayoacliente_sdt__lb_fechae_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavEnviodeensayoacliente_sdt__lb_fechae_Visible),Integer.valueOf(edtavEnviodeensayoacliente_sdt__lb_fechae_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavEnviodeensayoacliente_sdt__lb_fechaen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEnviodeensayoacliente_sdt__lb_fechaen_Internalname,localUtil.format(((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_fechaen(), "99/99/99"),localUtil.format( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_fechaen(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEnviodeensayoacliente_sdt__lb_fechaen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavEnviodeensayoacliente_sdt__lb_fechaen_Visible),Integer.valueOf(edtavEnviodeensayoacliente_sdt__lb_fechaen_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavEnviodeensayoacliente_sdt__lb_estado_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEnviodeensayoacliente_sdt__lb_estado_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_estado(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavEnviodeensayoacliente_sdt__lb_estado_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_estado()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_estado()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEnviodeensayoacliente_sdt__lb_estado_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavEnviodeensayoacliente_sdt__lb_estado_Visible),Integer.valueOf(edtavEnviodeensayoacliente_sdt__lb_estado_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEnviodeensayoacliente_sdt__obs_Internalname,((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Obs(),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEnviodeensayoacliente_sdt__obs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavEnviodeensayoacliente_sdt__obs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavEnviodeensayoacliente_sdt__eliminar.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavEnviodeensayoacliente_sdt__eliminar.getEnabled()!=0)&&(chkavEnviodeensayoacliente_sdt__eliminar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 94,'"+sPrefix+"',false,'"+sGXsfl_79_idx+"',79)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "ENVIODEENSAYOACLIENTE_SDT__ELIMINAR_" + sGXsfl_79_idx ;
         chkavEnviodeensayoacliente_sdt__eliminar.setName( GXCCtl );
         chkavEnviodeensayoacliente_sdt__eliminar.setWebtags( "" );
         chkavEnviodeensayoacliente_sdt__eliminar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavEnviodeensayoacliente_sdt__eliminar.getInternalname(), "TitleCaption", chkavEnviodeensayoacliente_sdt__eliminar.getCaption(), !bGXsfl_79_Refreshing);
         chkavEnviodeensayoacliente_sdt__eliminar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavEnviodeensayoacliente_sdt__eliminar.getInternalname(),GXutil.booltostr( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Eliminar()),"","",Integer.valueOf(chkavEnviodeensayoacliente_sdt__eliminar.getVisible()),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(94, this, 'true', 'false',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+((chkavEnviodeensayoacliente_sdt__eliminar.getEnabled()!=0)&&(chkavEnviodeensayoacliente_sdt__eliminar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,94);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEnviodeensayoacliente_sdt__f_cformu_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_F_cformu(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavEnviodeensayoacliente_sdt__f_cformu_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_F_cformu()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_F_cformu()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEnviodeensayoacliente_sdt__f_cformu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavEnviodeensayoacliente_sdt__f_cformu_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEnviodeensayoacliente_sdt__lb_costee_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_costee(), (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavEnviodeensayoacliente_sdt__lb_costee_Enabled!=0) ? localUtil.format( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_costee(), "ZZZZ9.99999") : localUtil.format( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_costee(), "ZZZZ9.99999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEnviodeensayoacliente_sdt__lb_costee_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavEnviodeensayoacliente_sdt__lb_costee_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEnviodeensayoacliente_sdt__lb_rgb_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_rgb(), (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavEnviodeensayoacliente_sdt__lb_rgb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_rgb()), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_rgb()), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEnviodeensayoacliente_sdt__lb_rgb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavEnviodeensayoacliente_sdt__lb_rgb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEnviodeensayoacliente_sdt__tipcolcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Tipcolcod(), (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavEnviodeensayoacliente_sdt__tipcolcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Tipcolcod()), "Z9") : localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Tipcolcod()), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEnviodeensayoacliente_sdt__tipcolcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavEnviodeensayoacliente_sdt__tipcolcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEnviodeensayoacliente_sdt__lb_colnom_Internalname,GXutil.rtrim( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_colnom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEnviodeensayoacliente_sdt__lb_colnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavEnviodeensayoacliente_sdt__lb_colnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEnviodeensayoacliente_sdt__lb_colnum_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_colnum(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavEnviodeensayoacliente_sdt__lb_colnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_colnum()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_colnum()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEnviodeensayoacliente_sdt__lb_colnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavEnviodeensayoacliente_sdt__lb_colnum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEnviodeensayoacliente_sdt__fornumcol_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Fornumcol(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavEnviodeensayoacliente_sdt__fornumcol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Fornumcol()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Fornumcol()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEnviodeensayoacliente_sdt__fornumcol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavEnviodeensayoacliente_sdt__fornumcol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEnviodeensayoacliente_sdt__forultuti_Internalname,localUtil.format(((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Forultuti(), "99/99/99"),localUtil.format( ((app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)AV25EnviodeEnsayoaCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Forultuti(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEnviodeensayoacliente_sdt__forultuti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavEnviodeensayoacliente_sdt__forultuti_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2822( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_79_idx = ((subGrid_Islastpage==1)&&(nGXsfl_79_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_79_idx+1) ;
         sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_792( ) ;
      }
      /* End function sendrow_792 */
   }

   public void startgridcontrol79( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"79\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         if ( chkavEnviodeensayoacliente_sdt__selected.getTitleFormat() == 0 )
         {
            httpContext.writeValue( chkavEnviodeensayoacliente_sdt__selected.getTitle()) ;
         }
         else
         {
            httpContext.writeText( chkavEnviodeensayoacliente_sdt__selected.getTitle()) ;
         }
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavEnviodeensayoacliente_sdt__lb_numero_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº de Ensayo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavEnviodeensayoacliente_sdt__clicod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavEnviodeensayoacliente_sdt__clinom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavEnviodeensayoacliente_sdt__lb_artcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavEnviodeensayoacliente_sdt__lb_colnomc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavEnviodeensayoacliente_sdt__lb_rb_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rb", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavEnviodeensayoacliente_sdt__lb_opcion_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Opcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavEnviodeensayoacliente_sdt__lb_numop_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavEnviodeensayoacliente_sdt__lb_cartaz_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coleccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavEnviodeensayoacliente_sdt__lb_fechae_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavEnviodeensayoacliente_sdt__lb_fechaen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Envio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavEnviodeensayoacliente_sdt__lb_estado_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "St", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavEnviodeensayoacliente_sdt__eliminar.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
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
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( chkavEnviodeensayoacliente_sdt__selected.getTitle()));
         GridColumn.AddObjectProperty("Titleformat", GXutil.ltrim( localUtil.ntoc( chkavEnviodeensayoacliente_sdt__selected.getTitleFormat(), (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__lb_numero_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__lb_numero_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__clicod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__clinom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__lb_artcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__lb_artcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__lb_colnomc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__lb_colnomc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__lb_rb_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__lb_rb_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__lb_opcion_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__lb_opcion_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__lb_numop_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__lb_numop_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__lb_cartaz_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__lb_cartaz_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__lb_fechae_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__lb_fechae_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__lb_fechaen_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__lb_fechaen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__lb_estado_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__lb_estado_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__obs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavEnviodeensayoacliente_sdt__eliminar.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__f_cformu_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__lb_costee_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__lb_rgb_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__tipcolcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__lb_colnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__lb_colnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__fornumcol_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEnviodeensayoacliente_sdt__forultuti_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavLb_fechaen_Internalname = sPrefix+"vLB_FECHAEN" ;
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
      bttBtnenviar_Internalname = sPrefix+"BTNENVIAR" ;
      bttBtneliminar_Internalname = sPrefix+"BTNELIMINAR" ;
      bttBtnlabdip_Internalname = sPrefix+"BTNLABDIP" ;
      bttBtnenvioopciona_Internalname = sPrefix+"BTNENVIOOPCIONA" ;
      bttBtncancelar_Internalname = sPrefix+"BTNCANCELAR" ;
      bttBtnmarcartodos_Internalname = sPrefix+"BTNMARCARTODOS" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      bttBtnlabdipcoste_Internalname = sPrefix+"BTNLABDIPCOSTE" ;
      lblTextblocklb_rb_Internalname = sPrefix+"TEXTBLOCKLB_RB" ;
      edtavLb_rb_Internalname = sPrefix+"vLB_RB" ;
      divUnnamedtablelb_rb_Internalname = sPrefix+"UNNAMEDTABLELB_RB" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE2" ;
      chkavEnviodeensayoacliente_sdt__selected.setInternalname( sPrefix+"ENVIODEENSAYOACLIENTE_SDT__SELECTED" );
      edtavEnviodeensayoacliente_sdt__lb_numero_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_NUMERO" ;
      edtavEnviodeensayoacliente_sdt__clicod_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__CLICOD" ;
      edtavEnviodeensayoacliente_sdt__clinom_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__CLINOM" ;
      edtavEnviodeensayoacliente_sdt__lb_artcod_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_ARTCOD" ;
      edtavEnviodeensayoacliente_sdt__lb_colnomc_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_COLNOMC" ;
      edtavEnviodeensayoacliente_sdt__lb_rb_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_RB" ;
      edtavEnviodeensayoacliente_sdt__lb_opcion_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_OPCION" ;
      edtavEnviodeensayoacliente_sdt__lb_numop_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_NUMOP" ;
      edtavEnviodeensayoacliente_sdt__lb_cartaz_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_CARTAZ" ;
      edtavEnviodeensayoacliente_sdt__lb_fechae_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_FECHAE" ;
      edtavEnviodeensayoacliente_sdt__lb_fechaen_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_FECHAEN" ;
      edtavEnviodeensayoacliente_sdt__lb_estado_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_ESTADO" ;
      edtavEnviodeensayoacliente_sdt__obs_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__OBS" ;
      chkavEnviodeensayoacliente_sdt__eliminar.setInternalname( sPrefix+"ENVIODEENSAYOACLIENTE_SDT__ELIMINAR" );
      edtavEnviodeensayoacliente_sdt__f_cformu_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__F_CFORMU" ;
      edtavEnviodeensayoacliente_sdt__lb_costee_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_COSTEE" ;
      edtavEnviodeensayoacliente_sdt__lb_rgb_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_RGB" ;
      edtavEnviodeensayoacliente_sdt__tipcolcod_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__TIPCOLCOD" ;
      edtavEnviodeensayoacliente_sdt__lb_colnom_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_COLNOM" ;
      edtavEnviodeensayoacliente_sdt__lb_colnum_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__LB_COLNUM" ;
      edtavEnviodeensayoacliente_sdt__fornumcol_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__FORNUMCOL" ;
      edtavEnviodeensayoacliente_sdt__forultuti_Internalname = sPrefix+"ENVIODEENSAYOACLIENTE_SDT__FORULTUTI" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTableinvisible_Internalname = sPrefix+"TABLEINVISIBLE" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_enviar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_ENVIAR" ;
      tblTabledvelop_confirmpanel_enviar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_ENVIAR" ;
      Dvelop_confirmpanel_eliminar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Dvelop_confirmpanel_envioopciona_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_ENVIOOPCIONA" ;
      tblTabledvelop_confirmpanel_envioopciona_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_ENVIOOPCIONA" ;
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
      chkavEnviodeensayoacliente_sdt__selected.setTitleFormat( (short)(0) );
      chkavEnviodeensayoacliente_sdt__selected.setTitle( httpContext.getMessage( "Op", "") );
      edtavEnviodeensayoacliente_sdt__forultuti_Jsonclick = "" ;
      edtavEnviodeensayoacliente_sdt__forultuti_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__fornumcol_Jsonclick = "" ;
      edtavEnviodeensayoacliente_sdt__fornumcol_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__lb_colnum_Jsonclick = "" ;
      edtavEnviodeensayoacliente_sdt__lb_colnum_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__lb_colnom_Jsonclick = "" ;
      edtavEnviodeensayoacliente_sdt__lb_colnom_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__tipcolcod_Jsonclick = "" ;
      edtavEnviodeensayoacliente_sdt__tipcolcod_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__lb_rgb_Jsonclick = "" ;
      edtavEnviodeensayoacliente_sdt__lb_rgb_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__lb_costee_Jsonclick = "" ;
      edtavEnviodeensayoacliente_sdt__lb_costee_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__f_cformu_Jsonclick = "" ;
      edtavEnviodeensayoacliente_sdt__f_cformu_Enabled = 0 ;
      chkavEnviodeensayoacliente_sdt__eliminar.setCaption( "" );
      chkavEnviodeensayoacliente_sdt__eliminar.setEnabled( 1 );
      chkavEnviodeensayoacliente_sdt__eliminar.setVisible( -1 );
      edtavEnviodeensayoacliente_sdt__obs_Jsonclick = "" ;
      edtavEnviodeensayoacliente_sdt__obs_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__lb_estado_Jsonclick = "" ;
      edtavEnviodeensayoacliente_sdt__lb_estado_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__lb_estado_Visible = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_fechaen_Jsonclick = "" ;
      edtavEnviodeensayoacliente_sdt__lb_fechaen_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__lb_fechaen_Visible = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_fechae_Jsonclick = "" ;
      edtavEnviodeensayoacliente_sdt__lb_fechae_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__lb_fechae_Visible = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_cartaz_Jsonclick = "" ;
      edtavEnviodeensayoacliente_sdt__lb_cartaz_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__lb_cartaz_Visible = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_numop_Jsonclick = "" ;
      edtavEnviodeensayoacliente_sdt__lb_numop_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__lb_numop_Visible = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_opcion_Jsonclick = "" ;
      edtavEnviodeensayoacliente_sdt__lb_opcion_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__lb_opcion_Visible = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_rb_Jsonclick = "" ;
      edtavEnviodeensayoacliente_sdt__lb_rb_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__lb_rb_Visible = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_colnomc_Jsonclick = "" ;
      edtavEnviodeensayoacliente_sdt__lb_colnomc_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__lb_colnomc_Visible = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_artcod_Jsonclick = "" ;
      edtavEnviodeensayoacliente_sdt__lb_artcod_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__lb_artcod_Visible = -1 ;
      edtavEnviodeensayoacliente_sdt__clinom_Jsonclick = "" ;
      edtavEnviodeensayoacliente_sdt__clinom_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__clinom_Visible = -1 ;
      edtavEnviodeensayoacliente_sdt__clicod_Jsonclick = "" ;
      edtavEnviodeensayoacliente_sdt__clicod_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__clicod_Visible = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_numero_Jsonclick = "" ;
      edtavEnviodeensayoacliente_sdt__lb_numero_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__lb_numero_Visible = -1 ;
      chkavEnviodeensayoacliente_sdt__selected.setCaption( "" );
      chkavEnviodeensayoacliente_sdt__selected.setVisible( -1 );
      chkavEnviodeensayoacliente_sdt__selected.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      chkavEnviodeensayoacliente_sdt__selected.setTitle( httpContext.getMessage( "Op", "") );
      chkavEnviodeensayoacliente_sdt__eliminar.setVisible( -1 );
      edtavEnviodeensayoacliente_sdt__lb_estado_Visible = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_fechaen_Visible = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_fechae_Visible = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_cartaz_Visible = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_numop_Visible = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_opcion_Visible = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_rb_Visible = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_colnomc_Visible = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_artcod_Visible = -1 ;
      edtavEnviodeensayoacliente_sdt__clinom_Visible = -1 ;
      edtavEnviodeensayoacliente_sdt__clicod_Visible = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_numero_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavEnviodeensayoacliente_sdt__forultuti_Enabled = -1 ;
      edtavEnviodeensayoacliente_sdt__fornumcol_Enabled = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_colnum_Enabled = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_colnom_Enabled = -1 ;
      edtavEnviodeensayoacliente_sdt__tipcolcod_Enabled = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_rgb_Enabled = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_costee_Enabled = -1 ;
      edtavEnviodeensayoacliente_sdt__f_cformu_Enabled = -1 ;
      edtavEnviodeensayoacliente_sdt__obs_Enabled = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_estado_Enabled = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_fechaen_Enabled = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_fechae_Enabled = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_cartaz_Enabled = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_numop_Enabled = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_opcion_Enabled = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_rb_Enabled = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_colnomc_Enabled = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_artcod_Enabled = -1 ;
      edtavEnviodeensayoacliente_sdt__clinom_Enabled = -1 ;
      edtavEnviodeensayoacliente_sdt__clicod_Enabled = -1 ;
      edtavEnviodeensayoacliente_sdt__lb_numero_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavLb_rb_Jsonclick = "" ;
      edtavLb_rb_Enabled = 1 ;
      bttBtnenvioopciona_Visible = 1 ;
      edtavLb_fechaen_Jsonclick = "" ;
      edtavLb_fechaen_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_envioopciona_Confirmtype = "1" ;
      Dvelop_confirmpanel_envioopciona_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_envioopciona_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_envioopciona_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_envioopciona_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_envioopciona_Confirmationtext = "¿Enviamos?" ;
      Dvelop_confirmpanel_envioopciona_Title = "" ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea Eliminar Envio?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Dvelop_confirmpanel_enviar_Confirmtype = "1" ;
      Dvelop_confirmpanel_enviar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enviar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enviar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enviar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enviar_Confirmationtext = "¿Confirma Envio?" ;
      Dvelop_confirmpanel_enviar_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "||||||||||||" ;
      Ddo_grid_Columnids = "1:EnviodeEnsayoaCliente_SDT__Lb_numero|2:EnviodeEnsayoaCliente_SDT__Clicod|3:EnviodeEnsayoaCliente_SDT__CliNom|4:EnviodeEnsayoaCliente_SDT__Lb_ArtCod|5:EnviodeEnsayoaCliente_SDT__Lb_ColNomC|6:EnviodeEnsayoaCliente_SDT__Lb_Rb|7:EnviodeEnsayoaCliente_SDT__Lb_opcion|8:EnviodeEnsayoaCliente_SDT__Lb_numop|9:EnviodeEnsayoaCliente_SDT__Lb_Cartaz|10:EnviodeEnsayoaCliente_SDT__Lb_FechaE|11:EnviodeEnsayoaCliente_SDT__Lb_FechaEn|12:EnviodeEnsayoaCliente_SDT__Lb_Estado|14:EnviodeEnsayoaCliente_SDT__Eliminar" ;
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
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Lab Dip con Coste", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
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
      GXCCtl = "ENVIODEENSAYOACLIENTE_SDT__SELECTED_" + sGXsfl_79_idx ;
      chkavEnviodeensayoacliente_sdt__selected.setName( GXCCtl );
      chkavEnviodeensayoacliente_sdt__selected.setWebtags( "" );
      chkavEnviodeensayoacliente_sdt__selected.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavEnviodeensayoacliente_sdt__selected.getInternalname(), "TitleCaption", chkavEnviodeensayoacliente_sdt__selected.getCaption(), !bGXsfl_79_Refreshing);
      chkavEnviodeensayoacliente_sdt__selected.setCheckedValue( "false" );
      GXCCtl = "ENVIODEENSAYOACLIENTE_SDT__ELIMINAR_" + sGXsfl_79_idx ;
      chkavEnviodeensayoacliente_sdt__eliminar.setName( GXCCtl );
      chkavEnviodeensayoacliente_sdt__eliminar.setWebtags( "" );
      chkavEnviodeensayoacliente_sdt__eliminar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavEnviodeensayoacliente_sdt__eliminar.getInternalname(), "TitleCaption", chkavEnviodeensayoacliente_sdt__eliminar.getCaption(), !bGXsfl_79_Refreshing);
      chkavEnviodeensayoacliente_sdt__eliminar.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25EnviodeEnsayoaCliente_SDT',fld:'vENVIODEENSAYOACLIENTE_SDT',grid:79,pic:''},{av:'nGXsfl_79_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:79},{av:'nRC_GXsfl_79',ctrl:'GRID',prop:'GridRC',grid:79},{av:'sPrefix'},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV24Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV101Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV15Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV47Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV48Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV55Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV51Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV54Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV52Lb_FechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV50Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV14Carvema',fld:'vCARVEMA',pic:'ZZZ9'},{av:'AV53Lb_fechaEn2',fld:'vLB_FECHAEN2',pic:'',hsh:true},{av:'AV61Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_NUMERO',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__CLICOD',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__CLINOM',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_ARTCOD',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_COLNOMC',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_RB',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_OPCION',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_NUMOP',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_CARTAZ',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_FECHAE',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_FECHAEN',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_ESTADO',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__ELIMINAR',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__SELECTED',prop:'Title'},{av:'AV33GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV34GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTNENVIOOPCIONA',prop:'Visible'},{av:'AV58ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV35GridState',fld:'vGRIDSTATE',pic:''},{av:'AV25EnviodeEnsayoaCliente_SDT',fld:'vENVIODEENSAYOACLIENTE_SDT',grid:79,pic:''},{av:'nGXsfl_79_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:79},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_79',ctrl:'GRID',prop:'GridRC',grid:79}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e142822',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25EnviodeEnsayoaCliente_SDT',fld:'vENVIODEENSAYOACLIENTE_SDT',grid:79,pic:''},{av:'nGXsfl_79_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:79},{av:'nRC_GXsfl_79',ctrl:'GRID',prop:'GridRC',grid:79},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV101Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV15Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV47Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV48Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV55Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV51Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV54Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV52Lb_FechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV50Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV14Carvema',fld:'vCARVEMA',pic:'ZZZ9'},{av:'AV53Lb_fechaEn2',fld:'vLB_FECHAEN2',pic:'',hsh:true},{av:'AV61Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e152822',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25EnviodeEnsayoaCliente_SDT',fld:'vENVIODEENSAYOACLIENTE_SDT',grid:79,pic:''},{av:'nGXsfl_79_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:79},{av:'nRC_GXsfl_79',ctrl:'GRID',prop:'GridRC',grid:79},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV101Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV15Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV47Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV48Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV55Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV51Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV54Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV52Lb_FechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV50Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV14Carvema',fld:'vCARVEMA',pic:'ZZZ9'},{av:'AV53Lb_fechaEn2',fld:'vLB_FECHAEN2',pic:'',hsh:true},{av:'AV61Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e292822',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e162822',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25EnviodeEnsayoaCliente_SDT',fld:'vENVIODEENSAYOACLIENTE_SDT',grid:79,pic:''},{av:'nGXsfl_79_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:79},{av:'nRC_GXsfl_79',ctrl:'GRID',prop:'GridRC',grid:79},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV101Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV15Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV47Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV48Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV55Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV51Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV54Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV52Lb_FechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV50Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV14Carvema',fld:'vCARVEMA',pic:'ZZZ9'},{av:'AV53Lb_fechaEn2',fld:'vLB_FECHAEN2',pic:'',hsh:true},{av:'AV61Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_NUMERO',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__CLICOD',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__CLINOM',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_ARTCOD',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_COLNOMC',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_RB',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_OPCION',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_NUMOP',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_CARTAZ',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_FECHAE',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_FECHAEN',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_ESTADO',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__ELIMINAR',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__SELECTED',prop:'Title'},{av:'AV33GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV34GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTNENVIOOPCIONA',prop:'Visible'},{av:'AV58ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV35GridState',fld:'vGRIDSTATE',pic:''},{av:'AV25EnviodeEnsayoaCliente_SDT',fld:'vENVIODEENSAYOACLIENTE_SDT',grid:79,pic:''},{av:'nGXsfl_79_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:79},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_79',ctrl:'GRID',prop:'GridRC',grid:79}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e132822',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25EnviodeEnsayoaCliente_SDT',fld:'vENVIODEENSAYOACLIENTE_SDT',grid:79,pic:''},{av:'nGXsfl_79_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:79},{av:'nRC_GXsfl_79',ctrl:'GRID',prop:'GridRC',grid:79},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV101Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV15Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV47Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV48Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV55Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV51Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV54Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV52Lb_FechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV50Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV14Carvema',fld:'vCARVEMA',pic:'ZZZ9'},{av:'AV53Lb_fechaEn2',fld:'vLB_FECHAEN2',pic:'',hsh:true},{av:'AV61Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV35GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV35GridState',fld:'vGRIDSTATE',pic:''},{av:'AV31FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_NUMERO',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__CLICOD',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__CLINOM',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_ARTCOD',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_COLNOMC',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_RB',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_OPCION',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_NUMOP',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_CARTAZ',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_FECHAE',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_FECHAEN',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_ESTADO',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__ELIMINAR',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__SELECTED',prop:'Title'},{av:'AV33GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV34GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTNENVIOOPCIONA',prop:'Visible'},{av:'AV58ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV25EnviodeEnsayoaCliente_SDT',fld:'vENVIODEENSAYOACLIENTE_SDT',grid:79,pic:''},{av:'nGXsfl_79_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:79},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_79',ctrl:'GRID',prop:'GridRC',grid:79}]}");
      setEventMetadata("'DOLABDIPCOSTE'","{handler:'e202822',iparms:[{av:'AV73SelectedRows',fld:'vSELECTEDROWS',pic:''},{av:'AV24Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV15Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV47Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV52Lb_FechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV57Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'}]");
      setEventMetadata("'DOLABDIPCOSTE'",",oparms:[{av:'AV57Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'},{av:'AV52Lb_FechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV47Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV15Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV24Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOENVIAR'","{handler:'e112821',iparms:[{av:'AV73SelectedRows',fld:'vSELECTEDROWS',pic:''},{av:'AV52Lb_FechaEn',fld:'vLB_FECHAEN',pic:''}]");
      setEventMetadata("'DOENVIAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENVIAR.CLOSE","{handler:'e172822',iparms:[{av:'Dvelop_confirmpanel_enviar_Result',ctrl:'DVELOP_CONFIRMPANEL_ENVIAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25EnviodeEnsayoaCliente_SDT',fld:'vENVIODEENSAYOACLIENTE_SDT',grid:79,pic:''},{av:'nGXsfl_79_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:79},{av:'nRC_GXsfl_79',ctrl:'GRID',prop:'GridRC',grid:79},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV101Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV15Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV47Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV48Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV55Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV51Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV54Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV52Lb_FechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV50Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV14Carvema',fld:'vCARVEMA',pic:'ZZZ9'},{av:'AV53Lb_fechaEn2',fld:'vLB_FECHAEN2',pic:'',hsh:true},{av:'AV61Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'AV73SelectedRows',fld:'vSELECTEDROWS',pic:''},{av:'AV41IN_Lb_numerol',fld:'vIN_LB_NUMEROL',pic:'ZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENVIAR.CLOSE",",oparms:[{av:'AV52Lb_FechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV24Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV41IN_Lb_numerol',fld:'vIN_LB_NUMEROL',pic:'ZZZZZZZ9'},{av:'AV25EnviodeEnsayoaCliente_SDT',fld:'vENVIODEENSAYOACLIENTE_SDT',grid:79,pic:''},{av:'nGXsfl_79_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:79},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_79',ctrl:'GRID',prop:'GridRC',grid:79},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_NUMERO',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__CLICOD',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__CLINOM',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_ARTCOD',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_COLNOMC',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_RB',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_OPCION',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_NUMOP',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_CARTAZ',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_FECHAE',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_FECHAEN',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_ESTADO',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__ELIMINAR',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__SELECTED',prop:'Title'},{av:'AV33GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV34GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTNENVIOOPCIONA',prop:'Visible'},{av:'AV58ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV35GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOELIMINAR'","{handler:'e122821',iparms:[{av:'AV73SelectedRows',fld:'vSELECTEDROWS',pic:''}]");
      setEventMetadata("'DOELIMINAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e182822',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25EnviodeEnsayoaCliente_SDT',fld:'vENVIODEENSAYOACLIENTE_SDT',grid:79,pic:''},{av:'nGXsfl_79_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:79},{av:'nRC_GXsfl_79',ctrl:'GRID',prop:'GridRC',grid:79},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV101Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV15Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV47Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV48Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV55Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV51Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV54Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV52Lb_FechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV50Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV14Carvema',fld:'vCARVEMA',pic:'ZZZ9'},{av:'AV53Lb_fechaEn2',fld:'vLB_FECHAEN2',pic:'',hsh:true},{av:'AV61Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'AV39IN_lb_fechaen',fld:'vIN_LB_FECHAEN',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'AV24Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV41IN_Lb_numerol',fld:'vIN_LB_NUMEROL',pic:'ZZZZZZZ9'},{av:'AV39IN_lb_fechaen',fld:'vIN_LB_FECHAEN',pic:''},{av:'AV25EnviodeEnsayoaCliente_SDT',fld:'vENVIODEENSAYOACLIENTE_SDT',grid:79,pic:''},{av:'nGXsfl_79_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:79},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_79',ctrl:'GRID',prop:'GridRC',grid:79},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_NUMERO',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__CLICOD',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__CLINOM',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_ARTCOD',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_COLNOMC',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_RB',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_OPCION',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_NUMOP',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_CARTAZ',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_FECHAE',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_FECHAEN',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_ESTADO',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__ELIMINAR',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__SELECTED',prop:'Title'},{av:'AV33GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV34GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTNENVIOOPCIONA',prop:'Visible'},{av:'AV58ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV35GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOLABDIP'","{handler:'e212822',iparms:[{av:'AV73SelectedRows',fld:'vSELECTEDROWS',pic:''},{av:'AV24Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV15Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV47Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV52Lb_FechaEn',fld:'vLB_FECHAEN',pic:''}]");
      setEventMetadata("'DOLABDIP'",",oparms:[{av:'AV52Lb_FechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV47Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV15Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV24Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV73SelectedRows',fld:'vSELECTEDROWS',pic:''}]}");
      setEventMetadata("'DOENVIOOPCIONA'","{handler:'e222822',iparms:[{av:'AV73SelectedRows',fld:'vSELECTEDROWS',pic:''},{av:'AV55Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV25EnviodeEnsayoaCliente_SDT',fld:'vENVIODEENSAYOACLIENTE_SDT',grid:79,pic:''},{av:'nGXsfl_79_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:79},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_79',ctrl:'GRID',prop:'GridRC',grid:79},{av:'AV5CliNom',fld:'vCLINOM',pic:''},{av:'AV8Lb_colnomc',fld:'vLB_COLNOMC',pic:''},{av:'AV9lb_colNum',fld:'vLB_COLNUM',pic:'ZZZZZ9'},{av:'AV68TipColcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV24Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV62Numform',fld:'vNUMFORM',pic:'ZZZ9'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV101Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV15Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV47Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV48Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV51Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV54Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV52Lb_FechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV50Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV14Carvema',fld:'vCARVEMA',pic:'ZZZ9'},{av:'AV53Lb_fechaEn2',fld:'vLB_FECHAEN2',pic:'',hsh:true},{av:'AV61Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("'DOENVIOOPCIONA'",",oparms:[{av:'AV15Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5CliNom',fld:'vCLINOM',pic:''},{av:'AV9lb_colNum',fld:'vLB_COLNUM',pic:'ZZZZZ9'},{av:'AV68TipColcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV8Lb_colnomc',fld:'vLB_COLNOMC',pic:''},{av:'AV62Numform',fld:'vNUMFORM',pic:'ZZZ9'},{av:'AV25EnviodeEnsayoaCliente_SDT',fld:'vENVIODEENSAYOACLIENTE_SDT',grid:79,pic:''},{av:'nGXsfl_79_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:79},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_79',ctrl:'GRID',prop:'GridRC',grid:79},{av:'AV24Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'Dvelop_confirmpanel_envioopciona_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ENVIOOPCIONA',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENVIOOPCIONA.CLOSE","{handler:'e192822',iparms:[{av:'Dvelop_confirmpanel_envioopciona_Result',ctrl:'DVELOP_CONFIRMPANEL_ENVIOOPCIONA',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25EnviodeEnsayoaCliente_SDT',fld:'vENVIODEENSAYOACLIENTE_SDT',grid:79,pic:''},{av:'nGXsfl_79_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:79},{av:'nRC_GXsfl_79',ctrl:'GRID',prop:'GridRC',grid:79},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV101Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV15Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV47Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV48Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV55Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV51Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV54Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV52Lb_FechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV50Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV14Carvema',fld:'vCARVEMA',pic:'ZZZ9'},{av:'AV53Lb_fechaEn2',fld:'vLB_FECHAEN2',pic:'',hsh:true},{av:'AV61Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENVIOOPCIONA.CLOSE",",oparms:[{av:'AV52Lb_FechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV24Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25EnviodeEnsayoaCliente_SDT',fld:'vENVIODEENSAYOACLIENTE_SDT',grid:79,pic:''},{av:'nGXsfl_79_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:79},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_79',ctrl:'GRID',prop:'GridRC',grid:79},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_NUMERO',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__CLICOD',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__CLINOM',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_ARTCOD',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_COLNOMC',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_RB',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_OPCION',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_NUMOP',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_CARTAZ',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_FECHAE',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_FECHAEN',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__LB_ESTADO',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__ELIMINAR',prop:'Visible'},{ctrl:'ENVIODEENSAYOACLIENTE_SDT__SELECTED',prop:'Title'},{av:'AV33GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV34GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTNENVIOOPCIONA',prop:'Visible'},{av:'AV58ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV35GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOCANCELAR'","{handler:'e232822',iparms:[]");
      setEventMetadata("'DOCANCELAR'",",oparms:[]}");
      setEventMetadata("'DOMARCARTODOS'","{handler:'e242822',iparms:[{av:'AV73SelectedRows',fld:'vSELECTEDROWS',pic:''},{av:'AV25EnviodeEnsayoaCliente_SDT',fld:'vENVIODEENSAYOACLIENTE_SDT',grid:79,pic:''},{av:'nGXsfl_79_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:79},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_79',ctrl:'GRID',prop:'GridRC',grid:79}]");
      setEventMetadata("'DOMARCARTODOS'",",oparms:[{av:'AV73SelectedRows',fld:'vSELECTEDROWS',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e252822',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e262822',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("'DODESMARCARTODOS'","{handler:'e302822',iparms:[{av:'AV24Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV15Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV47Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV48Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV55Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV51Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV54Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV53Lb_fechaEn2',fld:'vLB_FECHAEN2',pic:'',hsh:true},{av:'AV50Lb_estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV14Carvema',fld:'vCARVEMA',pic:'ZZZ9'},{av:'AV25EnviodeEnsayoaCliente_SDT',fld:'vENVIODEENSAYOACLIENTE_SDT',grid:79,pic:''},{av:'nGXsfl_79_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:79},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_79',ctrl:'GRID',prop:'GridRC',grid:79},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV101Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV52Lb_FechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV61Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("'DODESMARCARTODOS'",",oparms:[{av:'AV25EnviodeEnsayoaCliente_SDT',fld:'vENVIODEENSAYOACLIENTE_SDT',grid:79,pic:''},{av:'nGXsfl_79_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:79},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_79',ctrl:'GRID',prop:'GridRC',grid:79}]}");
      setEventMetadata("NULL","{handler:'validv_Gxv24',iparms:[]");
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
      wcpOAV24Emprcod = "" ;
      wcpOAV47Lb_Cartaz = "" ;
      wcpOAV48Lb_ColNom = "" ;
      wcpOAV51Lb_FechaEfrom = GXutil.nullDate() ;
      wcpOAV54Lb_FechaEto = GXutil.nullDate() ;
      wcpOAV52Lb_FechaEn = GXutil.nullDate() ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_enviar_Result = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      Dvelop_confirmpanel_envioopciona_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV24Emprcod = "" ;
      AV47Lb_Cartaz = "" ;
      AV48Lb_ColNom = "" ;
      AV51Lb_FechaEfrom = GXutil.nullDate() ;
      AV54Lb_FechaEto = GXutil.nullDate() ;
      AV52Lb_FechaEn = GXutil.nullDate() ;
      AV18ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV101Pgmname = "" ;
      AV31FilterFullText = "" ;
      AV53Lb_fechaEn2 = GXutil.nullDate() ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV25EnviodeEnsayoaCliente_SDT = new GXBaseCollection<app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item>(app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV58ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV21DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV73SelectedRows = new GXBaseCollection<app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item>(app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV39IN_lb_fechaen = GXutil.nullDate() ;
      AV5CliNom = "" ;
      AV8Lb_colnomc = "" ;
      AV64SelectedRowsItem = new app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item(remoteHandle, context);
      Gx_msg = "" ;
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
      bttBtneditcolumns_Jsonclick = "" ;
      bttBtnenviar_Jsonclick = "" ;
      bttBtneliminar_Jsonclick = "" ;
      bttBtnlabdip_Jsonclick = "" ;
      bttBtnenvioopciona_Jsonclick = "" ;
      bttBtncancelar_Jsonclick = "" ;
      bttBtnmarcartodos_Jsonclick = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      bttBtnlabdipcoste_Jsonclick = "" ;
      lblTextblocklb_rb_Jsonclick = "" ;
      AV57Lb_Rb = DecimalUtil.ZERO ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      AV11Station = "" ;
      AV6EmprNom = "" ;
      AV12UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV72WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV65Session = httpContext.getWebSession();
      AV20ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV60ManageFiltersXml = "" ;
      AV17Col_EnvioEnsayo = new GXBaseCollection<app.gestionlaboratorio.SdtEnviodeEnsayo_SDT>(app.gestionlaboratorio.SdtEnviodeEnsayo_SDT.class, "EnviodeEnsayo_SDT", "TexplusNET", remoteHandle);
      AV42IN_Lb_opcion = "" ;
      AV45Item_EnvioEnsayo = new app.gestionlaboratorio.SdtEnviodeEnsayo_SDT(remoteHandle, context);
      AV46Json_EnvioEnsayo = "" ;
      AV26EnviodeEnsayoaCliente_SDT_item = new app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item(remoteHandle, context);
      AV7lb_artcod = "" ;
      AV49Lb_colnom2 = "" ;
      ucDvelop_confirmpanel_envioopciona = new com.genexus.webpanels.GXUserControl();
      AV29ExcelFilename = "" ;
      AV28ErrorMessage = "" ;
      AV71UserCustomValue = "" ;
      GXt_char1 = "" ;
      AV19ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector15 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17 = new GXBaseCollection[1] ;
      AV10Lb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
      AV56Lb_opcions = "" ;
      AV30Fec_null = GXutil.nullDate() ;
      AV37Hora_null = GXutil.resetTime( GXutil.nullDate() );
      GXv_dtime19 = new java.util.Date[1] ;
      GXv_char4 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_date18 = new java.util.Date[1] ;
      GXv_decimal20 = new java.math.BigDecimal[1] ;
      GXv_int21 = new long[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int22 = new byte[1] ;
      GXv_int23 = new byte[1] ;
      GXv_int10 = new int[1] ;
      GXv_char2 = new String[1] ;
      AV27EnviodeEnsayoaCliente_SDTItem = new app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item(remoteHandle, context);
      AV74SelectedRow = new app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState24 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      GXt_objcol_SdtEnviodeEnsayoaCliente_SDT_Item12 = new GXBaseCollection<app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item>(app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_objcol_SdtEnviodeEnsayoaCliente_SDT_Item13 = new GXBaseCollection[1] ;
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_enviar = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV24Emprcod = "" ;
      sCtrlAV15Clicod = "" ;
      sCtrlAV47Lb_Cartaz = "" ;
      sCtrlAV48Lb_ColNom = "" ;
      sCtrlAV55Lb_numero = "" ;
      sCtrlAV51Lb_FechaEfrom = "" ;
      sCtrlAV54Lb_FechaEto = "" ;
      sCtrlAV52Lb_FechaEn = "" ;
      sCtrlAV50Lb_estado = "" ;
      sCtrlAV14Carvema = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcenviodeensayoacliente__default(),
         new Object[] {
         }
      );
      AV101Pgmname = "WCEnviodeEnsayoaCliente" ;
      /* GeneXus formulas. */
      AV101Pgmname = "WCEnviodeEnsayoaCliente" ;
      Gx_err = (short)(0) ;
      edtavLb_fechaen_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__lb_numero_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__clicod_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__clinom_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__lb_artcod_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__lb_colnomc_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__lb_rb_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__lb_opcion_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__lb_numop_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__lb_cartaz_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__lb_fechae_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__lb_fechaen_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__lb_estado_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__obs_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__f_cformu_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__lb_costee_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__lb_rgb_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__tipcolcod_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__lb_colnom_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__lb_colnum_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__fornumcol_Enabled = 0 ;
      edtavEnviodeensayoacliente_sdt__forultuti_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV50Lb_estado ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV50Lb_estado ;
   private byte AV59ManageFiltersExecutionStep ;
   private byte AV68TipColcod ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte GXv_int22[] ;
   private byte GXv_int23[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV14Carvema ;
   private short AV14Carvema ;
   private short AV61Moda21 ;
   private short AV62Numform ;
   private short AV22eliminar ;
   private short AV13aenviar ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV66t ;
   private short AV23Elimino_e ;
   private int wcpOAV15Clicod ;
   private int wcpOAV55Lb_numero ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_79 ;
   private int AV15Clicod ;
   private int AV55Lb_numero ;
   private int nGXsfl_79_idx=1 ;
   private int AV41IN_Lb_numerol ;
   private int AV9lb_colNum ;
   private int AV105GXV27 ;
   private int AV104GXV26 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavLb_fechaen_Enabled ;
   private int bttBtnenvioopciona_Visible ;
   private int edtavLb_rb_Enabled ;
   private int AV77GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavEnviodeensayoacliente_sdt__lb_numero_Enabled ;
   private int edtavEnviodeensayoacliente_sdt__clicod_Enabled ;
   private int edtavEnviodeensayoacliente_sdt__clinom_Enabled ;
   private int edtavEnviodeensayoacliente_sdt__lb_artcod_Enabled ;
   private int edtavEnviodeensayoacliente_sdt__lb_colnomc_Enabled ;
   private int edtavEnviodeensayoacliente_sdt__lb_rb_Enabled ;
   private int edtavEnviodeensayoacliente_sdt__lb_opcion_Enabled ;
   private int edtavEnviodeensayoacliente_sdt__lb_numop_Enabled ;
   private int edtavEnviodeensayoacliente_sdt__lb_cartaz_Enabled ;
   private int edtavEnviodeensayoacliente_sdt__lb_fechae_Enabled ;
   private int edtavEnviodeensayoacliente_sdt__lb_fechaen_Enabled ;
   private int edtavEnviodeensayoacliente_sdt__lb_estado_Enabled ;
   private int edtavEnviodeensayoacliente_sdt__obs_Enabled ;
   private int edtavEnviodeensayoacliente_sdt__f_cformu_Enabled ;
   private int edtavEnviodeensayoacliente_sdt__lb_costee_Enabled ;
   private int edtavEnviodeensayoacliente_sdt__lb_rgb_Enabled ;
   private int edtavEnviodeensayoacliente_sdt__tipcolcod_Enabled ;
   private int edtavEnviodeensayoacliente_sdt__lb_colnom_Enabled ;
   private int edtavEnviodeensayoacliente_sdt__lb_colnum_Enabled ;
   private int edtavEnviodeensayoacliente_sdt__fornumcol_Enabled ;
   private int edtavEnviodeensayoacliente_sdt__forultuti_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_79_fel_idx=1 ;
   private int edtavEnviodeensayoacliente_sdt__lb_numero_Visible ;
   private int edtavEnviodeensayoacliente_sdt__clicod_Visible ;
   private int edtavEnviodeensayoacliente_sdt__clinom_Visible ;
   private int edtavEnviodeensayoacliente_sdt__lb_artcod_Visible ;
   private int edtavEnviodeensayoacliente_sdt__lb_colnomc_Visible ;
   private int edtavEnviodeensayoacliente_sdt__lb_rb_Visible ;
   private int edtavEnviodeensayoacliente_sdt__lb_opcion_Visible ;
   private int edtavEnviodeensayoacliente_sdt__lb_numop_Visible ;
   private int edtavEnviodeensayoacliente_sdt__lb_cartaz_Visible ;
   private int edtavEnviodeensayoacliente_sdt__lb_fechae_Visible ;
   private int edtavEnviodeensayoacliente_sdt__lb_fechaen_Visible ;
   private int edtavEnviodeensayoacliente_sdt__lb_estado_Visible ;
   private int AV63PageToGo ;
   private int nGXsfl_79_bak_idx=1 ;
   private int AV102GXV25 ;
   private int AV40IN_Lb_numero ;
   private int AV106GXV28 ;
   private int AV107GXV29 ;
   private int AV108GXV30 ;
   private int AV109GXV31 ;
   private int AV16Clicodgrid ;
   private int AV110GXV32 ;
   private int AV111GXV33 ;
   private int AV112GXV34 ;
   private int AV113GXV35 ;
   private int AV114GXV36 ;
   private int GXv_int11[] ;
   private int GXv_int10[] ;
   private int AV115GXV37 ;
   private int AV116GXV38 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV33GridCurrentPage ;
   private long AV34GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long GXv_int21[] ;
   private java.math.BigDecimal AV57Lb_Rb ;
   private java.math.BigDecimal GXv_decimal20[] ;
   private String wcpOAV24Emprcod ;
   private String wcpOAV47Lb_Cartaz ;
   private String wcpOAV48Lb_ColNom ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_enviar_Result ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String Dvelop_confirmpanel_envioopciona_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV24Emprcod ;
   private String AV47Lb_Cartaz ;
   private String AV48Lb_ColNom ;
   private String sGXsfl_79_idx="0001" ;
   private String AV101Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV5CliNom ;
   private String AV8Lb_colnomc ;
   private String Gx_msg ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
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
   private String Dvelop_confirmpanel_enviar_Title ;
   private String Dvelop_confirmpanel_enviar_Confirmationtext ;
   private String Dvelop_confirmpanel_enviar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_enviar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_enviar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_enviar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_enviar_Confirmtype ;
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
   private String Dvelop_confirmpanel_envioopciona_Title ;
   private String Dvelop_confirmpanel_envioopciona_Confirmationtext ;
   private String Dvelop_confirmpanel_envioopciona_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_envioopciona_Nobuttoncaption ;
   private String Dvelop_confirmpanel_envioopciona_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_envioopciona_Yesbuttonposition ;
   private String Dvelop_confirmpanel_envioopciona_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String edtavLb_fechaen_Internalname ;
   private String edtavLb_fechaen_Jsonclick ;
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
   private String divUnnamedtable1_Internalname ;
   private String bttBtnenviar_Internalname ;
   private String bttBtnenviar_Jsonclick ;
   private String bttBtneliminar_Internalname ;
   private String bttBtneliminar_Jsonclick ;
   private String bttBtnlabdip_Internalname ;
   private String bttBtnlabdip_Jsonclick ;
   private String bttBtnenvioopciona_Internalname ;
   private String bttBtnenvioopciona_Jsonclick ;
   private String bttBtncancelar_Internalname ;
   private String bttBtncancelar_Jsonclick ;
   private String bttBtnmarcartodos_Internalname ;
   private String bttBtnmarcartodos_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtnlabdipcoste_Internalname ;
   private String bttBtnlabdipcoste_Jsonclick ;
   private String divUnnamedtablelb_rb_Internalname ;
   private String lblTextblocklb_rb_Internalname ;
   private String lblTextblocklb_rb_Jsonclick ;
   private String edtavLb_rb_Internalname ;
   private String edtavLb_rb_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divTableinvisible_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String edtavEnviodeensayoacliente_sdt__lb_numero_Internalname ;
   private String edtavEnviodeensayoacliente_sdt__clicod_Internalname ;
   private String edtavEnviodeensayoacliente_sdt__clinom_Internalname ;
   private String edtavEnviodeensayoacliente_sdt__lb_artcod_Internalname ;
   private String edtavEnviodeensayoacliente_sdt__lb_colnomc_Internalname ;
   private String edtavEnviodeensayoacliente_sdt__lb_rb_Internalname ;
   private String edtavEnviodeensayoacliente_sdt__lb_opcion_Internalname ;
   private String edtavEnviodeensayoacliente_sdt__lb_numop_Internalname ;
   private String edtavEnviodeensayoacliente_sdt__lb_cartaz_Internalname ;
   private String edtavEnviodeensayoacliente_sdt__lb_fechae_Internalname ;
   private String edtavEnviodeensayoacliente_sdt__lb_fechaen_Internalname ;
   private String edtavEnviodeensayoacliente_sdt__lb_estado_Internalname ;
   private String edtavEnviodeensayoacliente_sdt__obs_Internalname ;
   private String edtavEnviodeensayoacliente_sdt__f_cformu_Internalname ;
   private String edtavEnviodeensayoacliente_sdt__lb_costee_Internalname ;
   private String edtavEnviodeensayoacliente_sdt__lb_rgb_Internalname ;
   private String edtavEnviodeensayoacliente_sdt__tipcolcod_Internalname ;
   private String edtavEnviodeensayoacliente_sdt__lb_colnom_Internalname ;
   private String edtavEnviodeensayoacliente_sdt__lb_colnum_Internalname ;
   private String edtavEnviodeensayoacliente_sdt__fornumcol_Internalname ;
   private String edtavEnviodeensayoacliente_sdt__forultuti_Internalname ;
   private String sGXsfl_79_fel_idx="0001" ;
   private String hsh ;
   private String AV11Station ;
   private String AV6EmprNom ;
   private String AV12UsurCod ;
   private String AV42IN_Lb_opcion ;
   private String AV7lb_artcod ;
   private String AV49Lb_colnom2 ;
   private String Dvelop_confirmpanel_envioopciona_Internalname ;
   private String GXt_char1 ;
   private String AV56Lb_opcions ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String tblTabledvelop_confirmpanel_envioopciona_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String tblTabledvelop_confirmpanel_enviar_Internalname ;
   private String Dvelop_confirmpanel_enviar_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV24Emprcod ;
   private String sCtrlAV15Clicod ;
   private String sCtrlAV47Lb_Cartaz ;
   private String sCtrlAV48Lb_ColNom ;
   private String sCtrlAV55Lb_numero ;
   private String sCtrlAV51Lb_FechaEfrom ;
   private String sCtrlAV54Lb_FechaEto ;
   private String sCtrlAV52Lb_FechaEn ;
   private String sCtrlAV50Lb_estado ;
   private String sCtrlAV14Carvema ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavEnviodeensayoacliente_sdt__lb_numero_Jsonclick ;
   private String edtavEnviodeensayoacliente_sdt__clicod_Jsonclick ;
   private String edtavEnviodeensayoacliente_sdt__clinom_Jsonclick ;
   private String edtavEnviodeensayoacliente_sdt__lb_artcod_Jsonclick ;
   private String edtavEnviodeensayoacliente_sdt__lb_colnomc_Jsonclick ;
   private String edtavEnviodeensayoacliente_sdt__lb_rb_Jsonclick ;
   private String edtavEnviodeensayoacliente_sdt__lb_opcion_Jsonclick ;
   private String edtavEnviodeensayoacliente_sdt__lb_numop_Jsonclick ;
   private String edtavEnviodeensayoacliente_sdt__lb_cartaz_Jsonclick ;
   private String edtavEnviodeensayoacliente_sdt__lb_fechae_Jsonclick ;
   private String edtavEnviodeensayoacliente_sdt__lb_fechaen_Jsonclick ;
   private String edtavEnviodeensayoacliente_sdt__lb_estado_Jsonclick ;
   private String edtavEnviodeensayoacliente_sdt__obs_Jsonclick ;
   private String edtavEnviodeensayoacliente_sdt__f_cformu_Jsonclick ;
   private String edtavEnviodeensayoacliente_sdt__lb_costee_Jsonclick ;
   private String edtavEnviodeensayoacliente_sdt__lb_rgb_Jsonclick ;
   private String edtavEnviodeensayoacliente_sdt__tipcolcod_Jsonclick ;
   private String edtavEnviodeensayoacliente_sdt__lb_colnom_Jsonclick ;
   private String edtavEnviodeensayoacliente_sdt__lb_colnum_Jsonclick ;
   private String edtavEnviodeensayoacliente_sdt__fornumcol_Jsonclick ;
   private String edtavEnviodeensayoacliente_sdt__forultuti_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV10Lb_HoraEn ;
   private java.util.Date AV37Hora_null ;
   private java.util.Date GXv_dtime19[] ;
   private java.util.Date wcpOAV51Lb_FechaEfrom ;
   private java.util.Date wcpOAV54Lb_FechaEto ;
   private java.util.Date wcpOAV52Lb_FechaEn ;
   private java.util.Date AV51Lb_FechaEfrom ;
   private java.util.Date AV54Lb_FechaEto ;
   private java.util.Date AV52Lb_FechaEn ;
   private java.util.Date AV53Lb_fechaEn2 ;
   private java.util.Date AV39IN_lb_fechaen ;
   private java.util.Date AV30Fec_null ;
   private java.util.Date GXv_date18[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
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
   private boolean bGXsfl_79_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean gx_BV79 ;
   private boolean AV67TempBoolean ;
   private String AV20ColumnsSelectorXML ;
   private String AV60ManageFiltersXml ;
   private String AV71UserCustomValue ;
   private String AV31FilterFullText ;
   private String AV46Json_EnvioEnsayo ;
   private String AV29ExcelFilename ;
   private String AV28ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV65Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_envioopciona ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enviar ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavEnviodeensayoacliente_sdt__selected ;
   private ICheckbox chkavEnviodeensayoacliente_sdt__eliminar ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<app.gestionlaboratorio.SdtEnviodeEnsayo_SDT> AV17Col_EnvioEnsayo ;
   private GXBaseCollection<app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item> AV25EnviodeEnsayoaCliente_SDT ;
   private GXBaseCollection<app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item> AV73SelectedRows ;
   private GXBaseCollection<app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item> GXt_objcol_SdtEnviodeEnsayoaCliente_SDT_Item12 ;
   private GXBaseCollection<app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item> GXv_objcol_SdtEnviodeEnsayoaCliente_SDT_Item13[] ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV58ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[] ;
   private app.gestionlaboratorio.SdtEnviodeEnsayo_SDT AV45Item_EnvioEnsayo ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector14[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector15[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV21DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item AV64SelectedRowsItem ;
   private app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item AV26EnviodeEnsayoaCliente_SDT_item ;
   private app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item AV27EnviodeEnsayoaCliente_SDTItem ;
   private app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item AV74SelectedRow ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState24[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV72WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class wcenviodeensayoacliente__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

