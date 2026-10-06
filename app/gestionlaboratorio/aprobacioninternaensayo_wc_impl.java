package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class aprobacioninternaensayo_wc_impl extends GXWebComponent
{
   public aprobacioninternaensayo_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public aprobacioninternaensayo_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aprobacioninternaensayo_wc_impl.class ));
   }

   public aprobacioninternaensayo_wc_impl( int remoteHandle ,
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
      chkavSeleccionar = UIFactory.getCheckbox(this);
      cmbLb_Estado = new HTMLChoice();
      chkavSeleccionareliminar = UIFactory.getCheckbox(this);
      chkavHayprocesos = UIFactory.getCheckbox(this);
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
               AV23EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23EmprCod", AV23EmprCod);
               AV44Lb_Numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_Numero"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Lb_Numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44Lb_Numero), 8, 0));
               AV42Lb_fechaR = localUtil.parseDateParm( httpContext.GetPar( "Lb_fechaR")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Lb_fechaR", localUtil.format(AV42Lb_fechaR, "99/99/99"));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV23EmprCod,Integer.valueOf(AV44Lb_Numero),AV42Lb_fechaR});
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
            if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
            {
               AV23EmprCod = gxfirstwebparm ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23EmprCod", AV23EmprCod);
               if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
               {
                  AV44Lb_Numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_Numero"))) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Lb_Numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44Lb_Numero), 8, 0));
                  AV42Lb_fechaR = localUtil.parseDateParm( httpContext.GetPar( "Lb_fechaR")) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Lb_fechaR", localUtil.format(AV42Lb_fechaR, "99/99/99"));
               }
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
      AV27FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV23EmprCod = httpContext.GetPar( "EmprCod") ;
      AV44Lb_Numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_Numero"))) ;
      AV48ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV13ColumnsSelector);
      AV78TFLb_numero = (int)(GXutil.lval( httpContext.GetPar( "TFLb_numero"))) ;
      AV79TFLb_numero_To = (int)(GXutil.lval( httpContext.GetPar( "TFLb_numero_To"))) ;
      AV82TFLb_opcion = httpContext.GetPar( "TFLb_opcion") ;
      AV83TFLb_opcion_Sel = httpContext.GetPar( "TFLb_opcion_Sel") ;
      AV68TFLb_ColNom = httpContext.GetPar( "TFLb_ColNom") ;
      AV69TFLb_ColNom_Sel = httpContext.GetPar( "TFLb_ColNom_Sel") ;
      AV70TFLb_ColNum = (int)(GXutil.lval( httpContext.GetPar( "TFLb_ColNum"))) ;
      AV71TFLb_ColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFLb_ColNum_To"))) ;
      AV84TFLb_TipRec = (byte)(GXutil.lval( httpContext.GetPar( "TFLb_TipRec"))) ;
      AV85TFLb_TipRec_To = (byte)(GXutil.lval( httpContext.GetPar( "TFLb_TipRec_To"))) ;
      AV60TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV61TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV62TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV63TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV64TFLb_Cartaz = httpContext.GetPar( "TFLb_Cartaz") ;
      AV65TFLb_Cartaz_Sel = httpContext.GetPar( "TFLb_Cartaz_Sel") ;
      AV66TFLb_cartazf = localUtil.parseDateParm( httpContext.GetPar( "TFLb_cartazf")) ;
      AV74TFLb_FechaEn = localUtil.parseDateParm( httpContext.GetPar( "TFLb_FechaEn")) ;
      AV76TFLb_FechaR = localUtil.parseDateParm( httpContext.GetPar( "TFLb_FechaR")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV92TFLb_Estado_Sels);
      AV80TFLb_ObsCR = httpContext.GetPar( "TFLb_ObsCR") ;
      AV81TFLb_ObsCR_Sel = httpContext.GetPar( "TFLb_ObsCR_Sel") ;
      AV95Pgmname = httpContext.GetPar( "Pgmname") ;
      AV52OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV54OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV42Lb_fechaR = localUtil.parseDateParm( httpContext.GetPar( "Lb_fechaR")) ;
      A5551Lb_lineaPq = (short)(GXutil.lval( httpContext.GetPar( "Lb_lineaPq"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV9Col_Lb_numero);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV11Col_Lb_opcion);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV10Col_Lb_numeroE);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV12Col_Lb_opcionE);
      AV6Usurcod = httpContext.GetPar( "Usurcod") ;
      AV5Station = httpContext.GetPar( "Station") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV27FilterFullText, AV23EmprCod, AV44Lb_Numero, AV48ManageFiltersExecutionStep, AV13ColumnsSelector, AV78TFLb_numero, AV79TFLb_numero_To, AV82TFLb_opcion, AV83TFLb_opcion_Sel, AV68TFLb_ColNom, AV69TFLb_ColNom_Sel, AV70TFLb_ColNum, AV71TFLb_ColNum_To, AV84TFLb_TipRec, AV85TFLb_TipRec_To, AV60TFCliCod, AV61TFCliCod_To, AV62TFCliNom, AV63TFCliNom_Sel, AV64TFLb_Cartaz, AV65TFLb_Cartaz_Sel, AV66TFLb_cartazf, AV74TFLb_FechaEn, AV76TFLb_FechaR, AV92TFLb_Estado_Sels, AV80TFLb_ObsCR, AV81TFLb_ObsCR_Sel, AV95Pgmname, AV52OrderedBy, AV54OrderedDsc, AV42Lb_fechaR, A5551Lb_lineaPq, AV9Col_Lb_numero, AV11Col_Lb_opcion, AV10Col_Lb_numeroE, AV12Col_Lb_opcionE, AV6Usurcod, AV5Station, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1U32( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            validateSpaRequest();
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ! isAjaxCallMode( ) )
            {
            }
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws1U32( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               if ( nDynComponent == 0 )
               {
                  we1U32( ) ;
               }
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
         httpContext.writeValue( httpContext.getMessage( "Aprobacion Interna Ensayo", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.gestionlaboratorio.aprobacioninternaensayo_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV23EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV44Lb_Numero,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV42Lb_fechaR))}, new String[] {"EmprCod","Lb_Numero","Lb_fechaR"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV6Usurcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV5Station, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"AprobacionInternaEnsayo_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV95Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\aprobacioninternaensayo_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV27FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_56", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_56, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV47ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV47ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV28GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV29GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV22DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV22DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV13ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV13ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV23EmprCod", GXutil.rtrim( wcpOAV23EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV44Lb_Numero", GXutil.ltrim( localUtil.ntoc( wcpOAV44Lb_Numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV42Lb_fechaR", localUtil.dtoc( wcpOAV42Lb_fechaR, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV48ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_NUMERO", GXutil.ltrim( localUtil.ntoc( AV78TFLb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_NUMERO_TO", GXutil.ltrim( localUtil.ntoc( AV79TFLb_numero_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_OPCION", GXutil.rtrim( AV82TFLb_opcion));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_OPCION_SEL", GXutil.rtrim( AV83TFLb_opcion_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNOM", GXutil.rtrim( AV68TFLb_ColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNOM_SEL", GXutil.rtrim( AV69TFLb_ColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNUM", GXutil.ltrim( localUtil.ntoc( AV70TFLb_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV71TFLb_ColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_TIPREC", GXutil.ltrim( localUtil.ntoc( AV84TFLb_TipRec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_TIPREC_TO", GXutil.ltrim( localUtil.ntoc( AV85TFLb_TipRec_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV60TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV61TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV62TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV63TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_CARTAZ", GXutil.rtrim( AV64TFLb_Cartaz));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_CARTAZ_SEL", GXutil.rtrim( AV65TFLb_Cartaz_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_CARTAZF", localUtil.dtoc( AV66TFLb_cartazf, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_FECHAEN", localUtil.dtoc( AV74TFLb_FechaEn, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_FECHAR", localUtil.dtoc( AV76TFLb_FechaR, 0, "/"));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTFLB_ESTADO_SELS", AV92TFLb_Estado_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTFLB_ESTADO_SELS", AV92TFLb_Estado_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_OBSCR", AV80TFLb_ObsCR);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_OBSCR_SEL", AV81TFLb_ObsCR_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV52OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV54OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV23EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_NUMERO", GXutil.ltrim( localUtil.ntoc( AV44Lb_Numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_FECHAR", localUtil.dtoc( AV42Lb_fechaR, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LB_LINEAPQ", GXutil.ltrim( localUtil.ntoc( A5551Lb_lineaPq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_LB_NUMERO", AV9Col_Lb_numero);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_LB_NUMERO", AV9Col_Lb_numero);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_LB_OPCION", AV11Col_Lb_opcion);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_LB_OPCION", AV11Col_Lb_opcion);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_LB_NUMEROE", AV10Col_Lb_numeroE);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_LB_NUMEROE", AV10Col_Lb_numeroE);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_LB_OPCIONE", AV12Col_Lb_opcionE);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_LB_OPCIONE", AV12Col_Lb_opcionE);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV30GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV30GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_ESTADO_SELSJSON", AV91TFLb_Estado_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIN_LB_NUMERO", GXutil.ltrim( localUtil.ntoc( AV36IN_Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LB_ARTCOD", GXutil.rtrim( A5533Lb_ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV6Usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV6Usurcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV5Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV5Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vI", GXutil.ltrim( localUtil.ntoc( AV35i, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vT", GXutil.ltrim( localUtil.ntoc( AV90t, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIN_LB_NUMEROT", GXutil.ltrim( localUtil.ntoc( AV123In_lb_numerot, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMSG", GXutil.rtrim( Gx_msg));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNUM_V", GXutil.ltrim( localUtil.ntoc( AV50Num_v, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Allowmultipleselection", GXutil.rtrim( Ddo_grid_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_APROBACION_Title", GXutil.rtrim( Dvelop_confirmpanel_aprobacion_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_APROBACION_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_aprobacion_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_APROBACION_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_aprobacion_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_APROBACION_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_aprobacion_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_APROBACION_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_aprobacion_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_APROBACION_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_aprobacion_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_APROBACION_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_aprobacion_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARAPROBACION_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminaraprobacion_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARAPROBACION_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminaraprobacion_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARAPROBACION_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminaraprobacion_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARAPROBACION_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminaraprobacion_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARAPROBACION_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminaraprobacion_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARAPROBACION_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminaraprobacion_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARAPROBACION_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminaraprobacion_Confirmtype));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_APROBACION_Result", GXutil.rtrim( Dvelop_confirmpanel_aprobacion_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARAPROBACION_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminaraprobacion_Result));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_APROBACION_Result", GXutil.rtrim( Dvelop_confirmpanel_aprobacion_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARAPROBACION_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminaraprobacion_Result));
   }

   public void renderHtmlCloseForm1U32( )
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
         httpContext.writeText( "<script type=\"text/javascript\">") ;
         httpContext.writeText( "gx.setLanguageCode(\""+httpContext.getLanguageProperty( "code")+"\");") ;
         if ( ! httpContext.isSpaRequest( ) )
         {
            httpContext.writeText( "gx.setDateFormat(\""+httpContext.getLanguageProperty( "date_fmt")+"\");") ;
            httpContext.writeText( "gx.setTimeFormat("+httpContext.getLanguageProperty( "time_fmt")+");") ;
            httpContext.writeText( "gx.setCenturyFirstYear("+40+");") ;
            httpContext.writeText( "gx.setDecimalPoint(\""+httpContext.getLanguageProperty( "decimal_point")+"\");") ;
            httpContext.writeText( "gx.setThousandSeparator(\""+httpContext.getLanguageProperty( "thousand_sep")+"\");") ;
            httpContext.writeText( "gx.StorageTimeZone = "+2+";") ;
         }
         httpContext.writeText( "</script>") ;
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
      return "GestionLaboratorio.AprobacionInternaEnsayo_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Aprobacion Interna Ensayo", "") ;
   }

   public void wb1U30( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.gestionlaboratorio.aprobacioninternaensayo_wc");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 56, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\AprobacionInternaEnsayo_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 56, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\AprobacionInternaEnsayo_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 56, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\AprobacionInternaEnsayo_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_1U32( true) ;
      }
      else
      {
         wb_table1_23_1U32( false) ;
      }
      return  ;
   }

   public void wb_table1_23_1U32e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnaprobacion_Internalname, "gx.evt.setGridEvt("+GXutil.str( 56, 2, 0)+","+"null"+");", httpContext.getMessage( "Aprobacion", ""), bttBtnaprobacion_Jsonclick, 7, httpContext.getMessage( "Aprobacion", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111u31_client"+"'", TempTags, "", 2, "HLP_GestionLaboratorio\\AprobacionInternaEnsayo_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminaraprobacion_Internalname, "gx.evt.setGridEvt("+GXutil.str( 56, 2, 0)+","+"null"+");", httpContext.getMessage( "Eliminar Aprobacion", ""), bttBtneliminaraprobacion_Jsonclick, 7, httpContext.getMessage( "Eliminar Aprobacion", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e121u31_client"+"'", TempTags, "", 2, "HLP_GestionLaboratorio\\AprobacionInternaEnsayo_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancelar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 56, 2, 0)+","+"null"+");", httpContext.getMessage( "Cancelar", ""), bttBtncancelar_Jsonclick, 5, httpContext.getMessage( "Cancelar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCANCELAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\AprobacionInternaEnsayo_WC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", divUnnamedtable2_Height, "px", "", "left", "top", "", "", "div");
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
         ucGridpaginationbar.setProperty("CurrentPage", AV28GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV29GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV95Pgmname), GXutil.rtrim( localUtil.format( AV95Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\AprobacionInternaEnsayo_WC.htm");
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
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV22DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV22DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV13ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_86_1U32( true) ;
      }
      else
      {
         wb_table2_86_1U32( false) ;
      }
      return  ;
   }

   public void wb_table2_86_1U32e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_91_1U32( true) ;
      }
      else
      {
         wb_table3_91_1U32( false) ;
      }
      return  ;
   }

   public void wb_table3_91_1U32e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_cartazfauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'" + sPrefix + "',false,'" + sGXsfl_56_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_cartazfauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_cartazfauxdate_Internalname, localUtil.format(AV16DDO_Lb_cartazfAuxDate, "99/99/99"), localUtil.format( AV16DDO_Lb_cartazfAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,98);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_cartazfauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\AprobacionInternaEnsayo_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_cartazfauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\AprobacionInternaEnsayo_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_fechaenauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'" + sPrefix + "',false,'" + sGXsfl_56_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_fechaenauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_fechaenauxdate_Internalname, localUtil.format(AV18DDO_Lb_FechaEnAuxDate, "99/99/99"), localUtil.format( AV18DDO_Lb_FechaEnAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,100);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_fechaenauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\AprobacionInternaEnsayo_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_fechaenauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\AprobacionInternaEnsayo_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_fecharauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'" + sPrefix + "',false,'" + sGXsfl_56_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_fecharauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_fecharauxdate_Internalname, localUtil.format(AV20DDO_Lb_FechaRAuxDate, "99/99/99"), localUtil.format( AV20DDO_Lb_FechaRAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,102);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_fecharauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\AprobacionInternaEnsayo_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_fecharauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\AprobacionInternaEnsayo_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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

   public void start1U32( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Aprobacion Interna Ensayo", ""), (short)(0)) ;
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
            strup1U30( ) ;
         }
      }
   }

   public void ws1U32( )
   {
      start1U32( ) ;
      evt1U32( ) ;
   }

   public void evt1U32( )
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
                              strup1U30( ) ;
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
                              strup1U30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131U32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141U32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151U32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e161U32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e171U32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_APROBACION.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e181U32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARAPROBACION.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e191U32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCANCELAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoCancelar' */
                                 e201U32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e211U32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e221U32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = chkavSeleccionar.getInternalname() ;
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
                              strup1U30( ) ;
                           }
                           nGXsfl_56_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_56_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_56_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_562( ) ;
                           AV56Seleccionar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionar.getInternalname())) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV56Seleccionar);
                           A5532Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5555Lb_opcion = GXutil.upper( httpContext.cgiGet( edtLb_opcion_Internalname)) ;
                           A5536Lb_ColNom = httpContext.cgiGet( edtLb_ColNom_Internalname) ;
                           A5537Lb_ColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_ColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5597Lb_TipRec = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_TipRec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A5540Lb_Cartaz = httpContext.cgiGet( edtLb_Cartaz_Internalname) ;
                           A5594Lb_cartazf = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_cartazf_Internalname), 0)) ;
                           A5567Lb_FechaEn = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FechaEn_Internalname), 0)) ;
                           A5563Lb_FechaR = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FechaR_Internalname), 0)) ;
                           cmbLb_Estado.setName( cmbLb_Estado.getInternalname() );
                           cmbLb_Estado.setValue( httpContext.cgiGet( cmbLb_Estado.getInternalname()) );
                           A5566Lb_Estado = (byte)(GXutil.lval( httpContext.cgiGet( cmbLb_Estado.getInternalname()))) ;
                           A10822Lb_ObsCR = httpContext.cgiGet( edtLb_ObsCR_Internalname) ;
                           AV57SeleccionarEliminar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionareliminar.getInternalname())) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionareliminar.getInternalname(), AV57SeleccionarEliminar);
                           A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n831TipColCod = false ;
                           AV32HayProcesos = ((GXutil.strcmp(httpContext.cgiGet( chkavHayprocesos.getInternalname()), "S")==0) ? "S" : "N") ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavHayprocesos.getInternalname(), AV32HayProcesos);
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
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e231U32 ();
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
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e241U32 ();
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
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e251U32 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV27FilterFullText) != 0 )
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
                                    strup1U30( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
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

   public void we1U32( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1U32( ) ;
         }
      }
   }

   public void pa1U32( )
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
                                 String AV27FilterFullText ,
                                 String AV23EmprCod ,
                                 int AV44Lb_Numero ,
                                 byte AV48ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV13ColumnsSelector ,
                                 int AV78TFLb_numero ,
                                 int AV79TFLb_numero_To ,
                                 String AV82TFLb_opcion ,
                                 String AV83TFLb_opcion_Sel ,
                                 String AV68TFLb_ColNom ,
                                 String AV69TFLb_ColNom_Sel ,
                                 int AV70TFLb_ColNum ,
                                 int AV71TFLb_ColNum_To ,
                                 byte AV84TFLb_TipRec ,
                                 byte AV85TFLb_TipRec_To ,
                                 int AV60TFCliCod ,
                                 int AV61TFCliCod_To ,
                                 String AV62TFCliNom ,
                                 String AV63TFCliNom_Sel ,
                                 String AV64TFLb_Cartaz ,
                                 String AV65TFLb_Cartaz_Sel ,
                                 java.util.Date AV66TFLb_cartazf ,
                                 java.util.Date AV74TFLb_FechaEn ,
                                 java.util.Date AV76TFLb_FechaR ,
                                 GXSimpleCollection<Byte> AV92TFLb_Estado_Sels ,
                                 String AV80TFLb_ObsCR ,
                                 String AV81TFLb_ObsCR_Sel ,
                                 String AV95Pgmname ,
                                 short AV52OrderedBy ,
                                 boolean AV54OrderedDsc ,
                                 java.util.Date AV42Lb_fechaR ,
                                 short A5551Lb_lineaPq ,
                                 GXSimpleCollection<Integer> AV9Col_Lb_numero ,
                                 GXSimpleCollection<String> AV11Col_Lb_opcion ,
                                 GXSimpleCollection<Integer> AV10Col_Lb_numeroE ,
                                 GXSimpleCollection<String> AV12Col_Lb_opcionE ,
                                 String AV6Usurcod ,
                                 String AV5Station ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e241U32 ();
      GRID_nCurrentRecord = 0 ;
      rf1U32( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"AprobacionInternaEnsayo_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV95Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\aprobacioninternaensayo_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_FECHAEN", getSecureSignedToken( sPrefix, A5567Lb_FechaEn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LB_FECHAEN", localUtil.format(A5567Lb_FechaEn, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_NUMERO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LB_NUMERO", GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_OPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A5555Lb_opcion, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LB_OPCION", GXutil.rtrim( A5555Lb_opcion));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_ESTADO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A5566Lb_Estado), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LB_ESTADO", GXutil.ltrim( localUtil.ntoc( A5566Lb_Estado, (byte)(1), (byte)(0), ".", "")));
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
      rf1U32( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV95Pgmname = "GestionLaboratorio.AprobacionInternaEnsayo_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95Pgmname", AV95Pgmname);
      Gx_err = (short)(0) ;
      chkavHayprocesos.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavHayprocesos.getInternalname(), "Enabled", GXutil.ltrimstr( chkavHayprocesos.getEnabled(), 5, 0), !bGXsfl_56_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1U32( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(56) ;
      /* Execute user event: Refresh */
      e241U32 ();
      nGXsfl_56_idx = 1 ;
      sGXsfl_56_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_56_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_562( ) ;
      bGXsfl_56_Refreshing = true ;
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
         subsflControlProps_562( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(A5566Lb_Estado) ,
                                              AV117Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels ,
                                              AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext ,
                                              Integer.valueOf(AV98Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero) ,
                                              Integer.valueOf(AV99Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to) ,
                                              AV101Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel ,
                                              AV100Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion ,
                                              AV103Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel ,
                                              AV102Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom ,
                                              Integer.valueOf(AV104Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum) ,
                                              Integer.valueOf(AV105Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to) ,
                                              Byte.valueOf(AV106Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec) ,
                                              Byte.valueOf(AV107Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to) ,
                                              Integer.valueOf(AV108Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod) ,
                                              Integer.valueOf(AV109Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to) ,
                                              AV111Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel ,
                                              AV110Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom ,
                                              AV113Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel ,
                                              AV112Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz ,
                                              AV114Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf ,
                                              AV115Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen ,
                                              AV116Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar ,
                                              Integer.valueOf(AV117Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels.size()) ,
                                              AV119Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel ,
                                              AV118Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr ,
                                              Integer.valueOf(A5532Lb_numero) ,
                                              A5555Lb_opcion ,
                                              A5536Lb_ColNom ,
                                              Integer.valueOf(A5537Lb_ColNum) ,
                                              Byte.valueOf(A5597Lb_TipRec) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A5540Lb_Cartaz ,
                                              A10822Lb_ObsCR ,
                                              A5594Lb_cartazf ,
                                              A5567Lb_FechaEn ,
                                              A5563Lb_FechaR ,
                                              Short.valueOf(AV52OrderedBy) ,
                                              Boolean.valueOf(AV54OrderedDsc) ,
                                              AV23EmprCod ,
                                              Integer.valueOf(AV44Lb_Numero) ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.STRING
                                              }
         });
         lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
         lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
         lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
         lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
         lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
         lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
         lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
         lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
         lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
         lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
         lV100Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = GXutil.padr( GXutil.rtrim( AV100Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion), 1, "%") ;
         lV102Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = GXutil.padr( GXutil.rtrim( AV102Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom), 13, "%") ;
         lV110Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = GXutil.padr( GXutil.rtrim( AV110Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom), 30, "%") ;
         lV112Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV112Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz), 20, "%") ;
         lV118Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = GXutil.concat( GXutil.rtrim( AV118Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr), "%", "") ;
         /* Using cursor H01U32 */
         pr_default.execute(0, new Object[] {AV23EmprCod, Integer.valueOf(AV44Lb_Numero), lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, Integer.valueOf(AV98Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero), Integer.valueOf(AV99Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to), lV100Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion, AV101Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel, lV102Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom, AV103Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel, Integer.valueOf(AV104Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum), Integer.valueOf(AV105Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to), Byte.valueOf(AV106Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec), Byte.valueOf(AV107Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to), Integer.valueOf(AV108Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod), Integer.valueOf(AV109Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to), lV110Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom, AV111Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel, lV112Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz, AV113Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel, AV114Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf, AV115Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen, AV116Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar, lV118Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr, AV119Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_56_idx = 1 ;
         sGXsfl_56_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_56_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_562( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A5532Lb_numero = H01U32_A5532Lb_numero[0] ;
            A396EmprCod = H01U32_A396EmprCod[0] ;
            A5533Lb_ArtCod = H01U32_A5533Lb_ArtCod[0] ;
            A831TipColCod = H01U32_A831TipColCod[0] ;
            n831TipColCod = H01U32_n831TipColCod[0] ;
            A10822Lb_ObsCR = H01U32_A10822Lb_ObsCR[0] ;
            A5566Lb_Estado = H01U32_A5566Lb_Estado[0] ;
            A5563Lb_FechaR = H01U32_A5563Lb_FechaR[0] ;
            A5567Lb_FechaEn = H01U32_A5567Lb_FechaEn[0] ;
            A5594Lb_cartazf = H01U32_A5594Lb_cartazf[0] ;
            A5540Lb_Cartaz = H01U32_A5540Lb_Cartaz[0] ;
            A279CliNom = H01U32_A279CliNom[0] ;
            A252CliCod = H01U32_A252CliCod[0] ;
            A5597Lb_TipRec = H01U32_A5597Lb_TipRec[0] ;
            A5537Lb_ColNum = H01U32_A5537Lb_ColNum[0] ;
            A5536Lb_ColNom = H01U32_A5536Lb_ColNom[0] ;
            A5555Lb_opcion = H01U32_A5555Lb_opcion[0] ;
            A5533Lb_ArtCod = H01U32_A5533Lb_ArtCod[0] ;
            A831TipColCod = H01U32_A831TipColCod[0] ;
            n831TipColCod = H01U32_n831TipColCod[0] ;
            A5594Lb_cartazf = H01U32_A5594Lb_cartazf[0] ;
            A5540Lb_Cartaz = H01U32_A5540Lb_Cartaz[0] ;
            A252CliCod = H01U32_A252CliCod[0] ;
            A5597Lb_TipRec = H01U32_A5597Lb_TipRec[0] ;
            A5537Lb_ColNum = H01U32_A5537Lb_ColNum[0] ;
            A5536Lb_ColNom = H01U32_A5536Lb_ColNom[0] ;
            A279CliNom = H01U32_A279CliNom[0] ;
            e251U32 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(56) ;
         wb1U30( ) ;
      }
      bGXsfl_56_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1U32( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_FECHAEN"+"_"+sGXsfl_56_idx, getSecureSignedToken( sPrefix+sGXsfl_56_idx, A5567Lb_FechaEn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_NUMERO"+"_"+sGXsfl_56_idx, getSecureSignedToken( sPrefix+sGXsfl_56_idx, localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_OPCION"+"_"+sGXsfl_56_idx, getSecureSignedToken( sPrefix+sGXsfl_56_idx, GXutil.rtrim( localUtil.format( A5555Lb_opcion, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV6Usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV6Usurcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV5Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV5Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_ESTADO"+"_"+sGXsfl_56_idx, getSecureSignedToken( sPrefix+sGXsfl_56_idx, localUtil.format( DecimalUtil.doubleToDec(A5566Lb_Estado), "9")));
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
      AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = AV27FilterFullText ;
      AV98Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero = AV78TFLb_numero ;
      AV99Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to = AV79TFLb_numero_To ;
      AV100Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = AV82TFLb_opcion ;
      AV101Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel = AV83TFLb_opcion_Sel ;
      AV102Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = AV68TFLb_ColNom ;
      AV103Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel = AV69TFLb_ColNom_Sel ;
      AV104Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum = AV70TFLb_ColNum ;
      AV105Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to = AV71TFLb_ColNum_To ;
      AV106Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec = AV84TFLb_TipRec ;
      AV107Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to = AV85TFLb_TipRec_To ;
      AV108Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod = AV60TFCliCod ;
      AV109Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to = AV61TFCliCod_To ;
      AV110Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = AV62TFCliNom ;
      AV111Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel = AV63TFCliNom_Sel ;
      AV112Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = AV64TFLb_Cartaz ;
      AV113Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel = AV65TFLb_Cartaz_Sel ;
      AV114Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf = AV66TFLb_cartazf ;
      AV115Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen = AV74TFLb_FechaEn ;
      AV116Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar = AV76TFLb_FechaR ;
      AV117Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels = AV92TFLb_Estado_Sels ;
      AV118Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = AV80TFLb_ObsCR ;
      AV119Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel = AV81TFLb_ObsCR_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV117Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels ,
                                           AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV98Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV99Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to) ,
                                           AV101Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel ,
                                           AV100Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion ,
                                           AV103Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel ,
                                           AV102Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom ,
                                           Integer.valueOf(AV104Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum) ,
                                           Integer.valueOf(AV105Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to) ,
                                           Byte.valueOf(AV106Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec) ,
                                           Byte.valueOf(AV107Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to) ,
                                           Integer.valueOf(AV108Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod) ,
                                           Integer.valueOf(AV109Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to) ,
                                           AV111Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel ,
                                           AV110Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom ,
                                           AV113Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel ,
                                           AV112Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz ,
                                           AV114Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf ,
                                           AV115Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen ,
                                           AV116Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar ,
                                           Integer.valueOf(AV117Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels.size()) ,
                                           AV119Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel ,
                                           AV118Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5555Lb_opcion ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A5597Lb_TipRec) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A10822Lb_ObsCR ,
                                           A5594Lb_cartazf ,
                                           A5567Lb_FechaEn ,
                                           A5563Lb_FechaR ,
                                           Short.valueOf(AV52OrderedBy) ,
                                           Boolean.valueOf(AV54OrderedDsc) ,
                                           AV23EmprCod ,
                                           Integer.valueOf(AV44Lb_Numero) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING
                                           }
      });
      lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV100Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = GXutil.padr( GXutil.rtrim( AV100Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion), 1, "%") ;
      lV102Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = GXutil.padr( GXutil.rtrim( AV102Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom), 13, "%") ;
      lV110Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = GXutil.padr( GXutil.rtrim( AV110Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom), 30, "%") ;
      lV112Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV112Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz), 20, "%") ;
      lV118Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = GXutil.concat( GXutil.rtrim( AV118Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr), "%", "") ;
      /* Using cursor H01U33 */
      pr_default.execute(1, new Object[] {AV23EmprCod, Integer.valueOf(AV44Lb_Numero), lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, Integer.valueOf(AV98Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero), Integer.valueOf(AV99Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to), lV100Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion, AV101Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel, lV102Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom, AV103Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel, Integer.valueOf(AV104Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum), Integer.valueOf(AV105Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to), Byte.valueOf(AV106Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec), Byte.valueOf(AV107Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to), Integer.valueOf(AV108Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod), Integer.valueOf(AV109Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to), lV110Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom, AV111Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel, lV112Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz, AV113Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel, AV114Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf, AV115Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen, AV116Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar, lV118Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr, AV119Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel});
      GRID_nRecordCount = H01U33_AGRID_nRecordCount[0] ;
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
      AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = AV27FilterFullText ;
      AV98Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero = AV78TFLb_numero ;
      AV99Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to = AV79TFLb_numero_To ;
      AV100Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = AV82TFLb_opcion ;
      AV101Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel = AV83TFLb_opcion_Sel ;
      AV102Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = AV68TFLb_ColNom ;
      AV103Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel = AV69TFLb_ColNom_Sel ;
      AV104Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum = AV70TFLb_ColNum ;
      AV105Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to = AV71TFLb_ColNum_To ;
      AV106Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec = AV84TFLb_TipRec ;
      AV107Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to = AV85TFLb_TipRec_To ;
      AV108Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod = AV60TFCliCod ;
      AV109Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to = AV61TFCliCod_To ;
      AV110Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = AV62TFCliNom ;
      AV111Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel = AV63TFCliNom_Sel ;
      AV112Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = AV64TFLb_Cartaz ;
      AV113Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel = AV65TFLb_Cartaz_Sel ;
      AV114Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf = AV66TFLb_cartazf ;
      AV115Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen = AV74TFLb_FechaEn ;
      AV116Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar = AV76TFLb_FechaR ;
      AV117Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels = AV92TFLb_Estado_Sels ;
      AV118Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = AV80TFLb_ObsCR ;
      AV119Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel = AV81TFLb_ObsCR_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV27FilterFullText, AV23EmprCod, AV44Lb_Numero, AV48ManageFiltersExecutionStep, AV13ColumnsSelector, AV78TFLb_numero, AV79TFLb_numero_To, AV82TFLb_opcion, AV83TFLb_opcion_Sel, AV68TFLb_ColNom, AV69TFLb_ColNom_Sel, AV70TFLb_ColNum, AV71TFLb_ColNum_To, AV84TFLb_TipRec, AV85TFLb_TipRec_To, AV60TFCliCod, AV61TFCliCod_To, AV62TFCliNom, AV63TFCliNom_Sel, AV64TFLb_Cartaz, AV65TFLb_Cartaz_Sel, AV66TFLb_cartazf, AV74TFLb_FechaEn, AV76TFLb_FechaR, AV92TFLb_Estado_Sels, AV80TFLb_ObsCR, AV81TFLb_ObsCR_Sel, AV95Pgmname, AV52OrderedBy, AV54OrderedDsc, AV42Lb_fechaR, A5551Lb_lineaPq, AV9Col_Lb_numero, AV11Col_Lb_opcion, AV10Col_Lb_numeroE, AV12Col_Lb_opcionE, AV6Usurcod, AV5Station, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = AV27FilterFullText ;
      AV98Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero = AV78TFLb_numero ;
      AV99Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to = AV79TFLb_numero_To ;
      AV100Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = AV82TFLb_opcion ;
      AV101Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel = AV83TFLb_opcion_Sel ;
      AV102Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = AV68TFLb_ColNom ;
      AV103Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel = AV69TFLb_ColNom_Sel ;
      AV104Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum = AV70TFLb_ColNum ;
      AV105Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to = AV71TFLb_ColNum_To ;
      AV106Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec = AV84TFLb_TipRec ;
      AV107Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to = AV85TFLb_TipRec_To ;
      AV108Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod = AV60TFCliCod ;
      AV109Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to = AV61TFCliCod_To ;
      AV110Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = AV62TFCliNom ;
      AV111Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel = AV63TFCliNom_Sel ;
      AV112Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = AV64TFLb_Cartaz ;
      AV113Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel = AV65TFLb_Cartaz_Sel ;
      AV114Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf = AV66TFLb_cartazf ;
      AV115Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen = AV74TFLb_FechaEn ;
      AV116Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar = AV76TFLb_FechaR ;
      AV117Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels = AV92TFLb_Estado_Sels ;
      AV118Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = AV80TFLb_ObsCR ;
      AV119Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel = AV81TFLb_ObsCR_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27FilterFullText, AV23EmprCod, AV44Lb_Numero, AV48ManageFiltersExecutionStep, AV13ColumnsSelector, AV78TFLb_numero, AV79TFLb_numero_To, AV82TFLb_opcion, AV83TFLb_opcion_Sel, AV68TFLb_ColNom, AV69TFLb_ColNom_Sel, AV70TFLb_ColNum, AV71TFLb_ColNum_To, AV84TFLb_TipRec, AV85TFLb_TipRec_To, AV60TFCliCod, AV61TFCliCod_To, AV62TFCliNom, AV63TFCliNom_Sel, AV64TFLb_Cartaz, AV65TFLb_Cartaz_Sel, AV66TFLb_cartazf, AV74TFLb_FechaEn, AV76TFLb_FechaR, AV92TFLb_Estado_Sels, AV80TFLb_ObsCR, AV81TFLb_ObsCR_Sel, AV95Pgmname, AV52OrderedBy, AV54OrderedDsc, AV42Lb_fechaR, A5551Lb_lineaPq, AV9Col_Lb_numero, AV11Col_Lb_opcion, AV10Col_Lb_numeroE, AV12Col_Lb_opcionE, AV6Usurcod, AV5Station, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = AV27FilterFullText ;
      AV98Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero = AV78TFLb_numero ;
      AV99Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to = AV79TFLb_numero_To ;
      AV100Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = AV82TFLb_opcion ;
      AV101Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel = AV83TFLb_opcion_Sel ;
      AV102Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = AV68TFLb_ColNom ;
      AV103Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel = AV69TFLb_ColNom_Sel ;
      AV104Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum = AV70TFLb_ColNum ;
      AV105Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to = AV71TFLb_ColNum_To ;
      AV106Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec = AV84TFLb_TipRec ;
      AV107Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to = AV85TFLb_TipRec_To ;
      AV108Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod = AV60TFCliCod ;
      AV109Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to = AV61TFCliCod_To ;
      AV110Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = AV62TFCliNom ;
      AV111Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel = AV63TFCliNom_Sel ;
      AV112Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = AV64TFLb_Cartaz ;
      AV113Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel = AV65TFLb_Cartaz_Sel ;
      AV114Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf = AV66TFLb_cartazf ;
      AV115Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen = AV74TFLb_FechaEn ;
      AV116Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar = AV76TFLb_FechaR ;
      AV117Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels = AV92TFLb_Estado_Sels ;
      AV118Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = AV80TFLb_ObsCR ;
      AV119Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel = AV81TFLb_ObsCR_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27FilterFullText, AV23EmprCod, AV44Lb_Numero, AV48ManageFiltersExecutionStep, AV13ColumnsSelector, AV78TFLb_numero, AV79TFLb_numero_To, AV82TFLb_opcion, AV83TFLb_opcion_Sel, AV68TFLb_ColNom, AV69TFLb_ColNom_Sel, AV70TFLb_ColNum, AV71TFLb_ColNum_To, AV84TFLb_TipRec, AV85TFLb_TipRec_To, AV60TFCliCod, AV61TFCliCod_To, AV62TFCliNom, AV63TFCliNom_Sel, AV64TFLb_Cartaz, AV65TFLb_Cartaz_Sel, AV66TFLb_cartazf, AV74TFLb_FechaEn, AV76TFLb_FechaR, AV92TFLb_Estado_Sels, AV80TFLb_ObsCR, AV81TFLb_ObsCR_Sel, AV95Pgmname, AV52OrderedBy, AV54OrderedDsc, AV42Lb_fechaR, A5551Lb_lineaPq, AV9Col_Lb_numero, AV11Col_Lb_opcion, AV10Col_Lb_numeroE, AV12Col_Lb_opcionE, AV6Usurcod, AV5Station, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = AV27FilterFullText ;
      AV98Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero = AV78TFLb_numero ;
      AV99Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to = AV79TFLb_numero_To ;
      AV100Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = AV82TFLb_opcion ;
      AV101Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel = AV83TFLb_opcion_Sel ;
      AV102Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = AV68TFLb_ColNom ;
      AV103Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel = AV69TFLb_ColNom_Sel ;
      AV104Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum = AV70TFLb_ColNum ;
      AV105Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to = AV71TFLb_ColNum_To ;
      AV106Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec = AV84TFLb_TipRec ;
      AV107Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to = AV85TFLb_TipRec_To ;
      AV108Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod = AV60TFCliCod ;
      AV109Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to = AV61TFCliCod_To ;
      AV110Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = AV62TFCliNom ;
      AV111Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel = AV63TFCliNom_Sel ;
      AV112Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = AV64TFLb_Cartaz ;
      AV113Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel = AV65TFLb_Cartaz_Sel ;
      AV114Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf = AV66TFLb_cartazf ;
      AV115Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen = AV74TFLb_FechaEn ;
      AV116Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar = AV76TFLb_FechaR ;
      AV117Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels = AV92TFLb_Estado_Sels ;
      AV118Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = AV80TFLb_ObsCR ;
      AV119Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel = AV81TFLb_ObsCR_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27FilterFullText, AV23EmprCod, AV44Lb_Numero, AV48ManageFiltersExecutionStep, AV13ColumnsSelector, AV78TFLb_numero, AV79TFLb_numero_To, AV82TFLb_opcion, AV83TFLb_opcion_Sel, AV68TFLb_ColNom, AV69TFLb_ColNom_Sel, AV70TFLb_ColNum, AV71TFLb_ColNum_To, AV84TFLb_TipRec, AV85TFLb_TipRec_To, AV60TFCliCod, AV61TFCliCod_To, AV62TFCliNom, AV63TFCliNom_Sel, AV64TFLb_Cartaz, AV65TFLb_Cartaz_Sel, AV66TFLb_cartazf, AV74TFLb_FechaEn, AV76TFLb_FechaR, AV92TFLb_Estado_Sels, AV80TFLb_ObsCR, AV81TFLb_ObsCR_Sel, AV95Pgmname, AV52OrderedBy, AV54OrderedDsc, AV42Lb_fechaR, A5551Lb_lineaPq, AV9Col_Lb_numero, AV11Col_Lb_opcion, AV10Col_Lb_numeroE, AV12Col_Lb_opcionE, AV6Usurcod, AV5Station, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = AV27FilterFullText ;
      AV98Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero = AV78TFLb_numero ;
      AV99Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to = AV79TFLb_numero_To ;
      AV100Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = AV82TFLb_opcion ;
      AV101Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel = AV83TFLb_opcion_Sel ;
      AV102Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = AV68TFLb_ColNom ;
      AV103Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel = AV69TFLb_ColNom_Sel ;
      AV104Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum = AV70TFLb_ColNum ;
      AV105Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to = AV71TFLb_ColNum_To ;
      AV106Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec = AV84TFLb_TipRec ;
      AV107Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to = AV85TFLb_TipRec_To ;
      AV108Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod = AV60TFCliCod ;
      AV109Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to = AV61TFCliCod_To ;
      AV110Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = AV62TFCliNom ;
      AV111Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel = AV63TFCliNom_Sel ;
      AV112Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = AV64TFLb_Cartaz ;
      AV113Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel = AV65TFLb_Cartaz_Sel ;
      AV114Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf = AV66TFLb_cartazf ;
      AV115Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen = AV74TFLb_FechaEn ;
      AV116Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar = AV76TFLb_FechaR ;
      AV117Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels = AV92TFLb_Estado_Sels ;
      AV118Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = AV80TFLb_ObsCR ;
      AV119Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel = AV81TFLb_ObsCR_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27FilterFullText, AV23EmprCod, AV44Lb_Numero, AV48ManageFiltersExecutionStep, AV13ColumnsSelector, AV78TFLb_numero, AV79TFLb_numero_To, AV82TFLb_opcion, AV83TFLb_opcion_Sel, AV68TFLb_ColNom, AV69TFLb_ColNom_Sel, AV70TFLb_ColNum, AV71TFLb_ColNum_To, AV84TFLb_TipRec, AV85TFLb_TipRec_To, AV60TFCliCod, AV61TFCliCod_To, AV62TFCliNom, AV63TFCliNom_Sel, AV64TFLb_Cartaz, AV65TFLb_Cartaz_Sel, AV66TFLb_cartazf, AV74TFLb_FechaEn, AV76TFLb_FechaR, AV92TFLb_Estado_Sels, AV80TFLb_ObsCR, AV81TFLb_ObsCR_Sel, AV95Pgmname, AV52OrderedBy, AV54OrderedDsc, AV42Lb_fechaR, A5551Lb_lineaPq, AV9Col_Lb_numero, AV11Col_Lb_opcion, AV10Col_Lb_numeroE, AV12Col_Lb_opcionE, AV6Usurcod, AV5Station, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV95Pgmname = "GestionLaboratorio.AprobacionInternaEnsayo_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95Pgmname", AV95Pgmname);
      Gx_err = (short)(0) ;
      chkavHayprocesos.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavHayprocesos.getInternalname(), "Enabled", GXutil.ltrimstr( chkavHayprocesos.getEnabled(), 5, 0), !bGXsfl_56_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1U30( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e231U32 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV47ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV22DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV13ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOL_LB_OPCIONE"), AV12Col_Lb_opcionE);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOL_LB_NUMEROE"), AV10Col_Lb_numeroE);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOL_LB_OPCION"), AV11Col_Lb_opcion);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOL_LB_NUMERO"), AV9Col_Lb_numero);
         /* Read saved values. */
         nRC_GXsfl_56 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_56"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV28GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV29GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV23EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV23EmprCod") ;
         wcpOAV44Lb_Numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV44Lb_Numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV42Lb_fechaR = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV42Lb_fechaR"), 0) ;
         AV35i = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV90t = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV123In_lb_numerot = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vIN_LB_NUMEROT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV42Lb_fechaR = localUtil.ctod( httpContext.cgiGet( sPrefix+"vLB_FECHAR"), 0) ;
         AV36IN_Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vIN_LB_NUMERO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_msg = httpContext.cgiGet( sPrefix+"vMSG") ;
         AV50Num_v = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vNUM_V"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Ddo_grid_Allowmultipleselection = httpContext.cgiGet( sPrefix+"DDO_GRID_Allowmultipleselection") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Dvelop_confirmpanel_aprobacion_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_APROBACION_Title") ;
         Dvelop_confirmpanel_aprobacion_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_APROBACION_Confirmationtext") ;
         Dvelop_confirmpanel_aprobacion_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_APROBACION_Yesbuttoncaption") ;
         Dvelop_confirmpanel_aprobacion_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_APROBACION_Nobuttoncaption") ;
         Dvelop_confirmpanel_aprobacion_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_APROBACION_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_aprobacion_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_APROBACION_Yesbuttonposition") ;
         Dvelop_confirmpanel_aprobacion_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_APROBACION_Confirmtype") ;
         Dvelop_confirmpanel_eliminaraprobacion_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARAPROBACION_Title") ;
         Dvelop_confirmpanel_eliminaraprobacion_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARAPROBACION_Confirmationtext") ;
         Dvelop_confirmpanel_eliminaraprobacion_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARAPROBACION_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminaraprobacion_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARAPROBACION_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminaraprobacion_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARAPROBACION_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminaraprobacion_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARAPROBACION_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminaraprobacion_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARAPROBACION_Confirmtype") ;
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
         Dvelop_confirmpanel_aprobacion_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_APROBACION_Result") ;
         Dvelop_confirmpanel_eliminaraprobacion_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARAPROBACION_Result") ;
         /* Read variables values. */
         AV27FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27FilterFullText", AV27FilterFullText);
         AV95Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95Pgmname", AV95Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_cartazfauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_CARTAZFAUXDATE");
            GX_FocusControl = edtavDdo_lb_cartazfauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16DDO_Lb_cartazfAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16DDO_Lb_cartazfAuxDate", localUtil.format(AV16DDO_Lb_cartazfAuxDate, "99/99/99"));
         }
         else
         {
            AV16DDO_Lb_cartazfAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_cartazfauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16DDO_Lb_cartazfAuxDate", localUtil.format(AV16DDO_Lb_cartazfAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_fechaenauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_FECHAENAUXDATE");
            GX_FocusControl = edtavDdo_lb_fechaenauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18DDO_Lb_FechaEnAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18DDO_Lb_FechaEnAuxDate", localUtil.format(AV18DDO_Lb_FechaEnAuxDate, "99/99/99"));
         }
         else
         {
            AV18DDO_Lb_FechaEnAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_fechaenauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18DDO_Lb_FechaEnAuxDate", localUtil.format(AV18DDO_Lb_FechaEnAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_fecharauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_FECHARAUXDATE");
            GX_FocusControl = edtavDdo_lb_fecharauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20DDO_Lb_FechaRAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20DDO_Lb_FechaRAuxDate", localUtil.format(AV20DDO_Lb_FechaRAuxDate, "99/99/99"));
         }
         else
         {
            AV20DDO_Lb_FechaRAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_fecharauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20DDO_Lb_FechaRAuxDate", localUtil.format(AV20DDO_Lb_FechaRAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"AprobacionInternaEnsayo_WC");
         AV95Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95Pgmname", AV95Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV95Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("gestionlaboratorio\\aprobacioninternaensayo_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV27FilterFullText) != 0 )
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
      e231U32 ();
      if (returnInSub) return;
   }

   public void e231U32( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV5Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      aprobacioninternaensayo_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV5Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Station", AV5Station);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV5Station, ""))));
      GXv_char2[0] = AV23EmprCod ;
      GXv_char3[0] = AV96Emprnom ;
      GXv_char4[0] = AV6Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV5Station, GXv_char2, GXv_char3, GXv_char4) ;
      aprobacioninternaensayo_wc_impl.this.AV23EmprCod = GXv_char2[0] ;
      aprobacioninternaensayo_wc_impl.this.AV96Emprnom = GXv_char3[0] ;
      aprobacioninternaensayo_wc_impl.this.AV6Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23EmprCod", AV23EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Usurcod", AV6Usurcod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV6Usurcod, "@!"))));
      divUnnamedtable2_Height = 10 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divUnnamedtable2_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable2_Height), 9, 0), true);
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
      if ( AV52OrderedBy < 1 )
      {
         AV52OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV22DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV22DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e241U32( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV89WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV89WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV48ManageFiltersExecutionStep == 1 )
      {
         AV48ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48ManageFiltersExecutionStep", GXutil.str( AV48ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV48ManageFiltersExecutionStep == 2 )
      {
         AV48ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48ManageFiltersExecutionStep", GXutil.str( AV48ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV58Session.getValue("GestionLaboratorio.AprobacionInternaEnsayo_WCColumnsSelector"), "") != 0 )
      {
         AV15ColumnsSelectorXML = AV58Session.getValue("GestionLaboratorio.AprobacionInternaEnsayo_WCColumnsSelector") ;
         AV13ColumnsSelector.fromxml(AV15ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      chkavSeleccionar.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "Visible", GXutil.ltrimstr( chkavSeleccionar.getVisible(), 5, 0), !bGXsfl_56_Refreshing);
      edtLb_numero_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_numero_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_numero_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtLb_opcion_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_opcion_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_opcion_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtLb_ColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_ColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ColNom_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtLb_ColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_ColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ColNum_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtLb_TipRec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_TipRec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TipRec_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtLb_Cartaz_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_Cartaz_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Cartaz_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtLb_cartazf_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_cartazf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_cartazf_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtLb_FechaEn_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_FechaEn_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FechaEn_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtLb_FechaR_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_FechaR_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FechaR_Visible), 5, 0), !bGXsfl_56_Refreshing);
      cmbLb_Estado.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbLb_Estado.getInternalname(), "Visible", GXutil.ltrimstr( cmbLb_Estado.getVisible(), 5, 0), !bGXsfl_56_Refreshing);
      edtLb_ObsCR_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_ObsCR_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ObsCR_Visible), 5, 0), !bGXsfl_56_Refreshing);
      chkavSeleccionareliminar.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionareliminar.getInternalname(), "Visible", GXutil.ltrimstr( chkavSeleccionareliminar.getVisible(), 5, 0), !bGXsfl_56_Refreshing);
      chkavHayprocesos.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavHayprocesos.getInternalname(), "Visible", GXutil.ltrimstr( chkavHayprocesos.getVisible(), 5, 0), !bGXsfl_56_Refreshing);
      AV28GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28GridCurrentPage), 10, 0));
      AV29GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29GridPageCount), 10, 0));
      AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = AV27FilterFullText ;
      AV98Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero = AV78TFLb_numero ;
      AV99Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to = AV79TFLb_numero_To ;
      AV100Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = AV82TFLb_opcion ;
      AV101Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel = AV83TFLb_opcion_Sel ;
      AV102Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = AV68TFLb_ColNom ;
      AV103Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel = AV69TFLb_ColNom_Sel ;
      AV104Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum = AV70TFLb_ColNum ;
      AV105Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to = AV71TFLb_ColNum_To ;
      AV106Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec = AV84TFLb_TipRec ;
      AV107Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to = AV85TFLb_TipRec_To ;
      AV108Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod = AV60TFCliCod ;
      AV109Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to = AV61TFCliCod_To ;
      AV110Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = AV62TFCliNom ;
      AV111Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel = AV63TFCliNom_Sel ;
      AV112Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = AV64TFLb_Cartaz ;
      AV113Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel = AV65TFLb_Cartaz_Sel ;
      AV114Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf = AV66TFLb_cartazf ;
      AV115Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen = AV74TFLb_FechaEn ;
      AV116Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar = AV76TFLb_FechaR ;
      AV117Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels = AV92TFLb_Estado_Sels ;
      AV118Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = AV80TFLb_ObsCR ;
      AV119Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel = AV81TFLb_ObsCR_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13ColumnsSelector", AV13ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV47ManageFiltersData", AV47ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV30GridState", AV30GridState);
   }

   public void e141U32( )
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

   public void e151U32( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e161U32( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV52OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52OrderedBy), 4, 0));
         AV54OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54OrderedDsc", AV54OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_numero") == 0 )
         {
            AV78TFLb_numero = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFLb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78TFLb_numero), 8, 0));
            AV79TFLb_numero_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TFLb_numero_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79TFLb_numero_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_opcion") == 0 )
         {
            AV82TFLb_opcion = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFLb_opcion", AV82TFLb_opcion);
            AV83TFLb_opcion_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFLb_opcion_Sel", AV83TFLb_opcion_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ColNom") == 0 )
         {
            AV68TFLb_ColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFLb_ColNom", AV68TFLb_ColNom);
            AV69TFLb_ColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFLb_ColNom_Sel", AV69TFLb_ColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ColNum") == 0 )
         {
            AV70TFLb_ColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFLb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70TFLb_ColNum), 6, 0));
            AV71TFLb_ColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFLb_ColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TFLb_ColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_TipRec") == 0 )
         {
            AV84TFLb_TipRec = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFLb_TipRec", GXutil.str( AV84TFLb_TipRec, 1, 0));
            AV85TFLb_TipRec_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFLb_TipRec_To", GXutil.str( AV85TFLb_TipRec_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV60TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFCliCod), 6, 0));
            AV61TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV62TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFCliNom", AV62TFCliNom);
            AV63TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFCliNom_Sel", AV63TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_Cartaz") == 0 )
         {
            AV64TFLb_Cartaz = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFLb_Cartaz", AV64TFLb_Cartaz);
            AV65TFLb_Cartaz_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFLb_Cartaz_Sel", AV65TFLb_Cartaz_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_cartazf") == 0 )
         {
            AV66TFLb_cartazf = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFLb_cartazf", localUtil.format(AV66TFLb_cartazf, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_FechaEn") == 0 )
         {
            AV74TFLb_FechaEn = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFLb_FechaEn", localUtil.format(AV74TFLb_FechaEn, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_FechaR") == 0 )
         {
            AV76TFLb_FechaR = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFLb_FechaR", localUtil.format(AV76TFLb_FechaR, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_Estado") == 0 )
         {
            AV91TFLb_Estado_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFLb_Estado_SelsJson", AV91TFLb_Estado_SelsJson);
            AV92TFLb_Estado_Sels.fromJSonString(GXutil.strReplace( AV91TFLb_Estado_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ObsCR") == 0 )
         {
            AV80TFLb_ObsCR = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFLb_ObsCR", AV80TFLb_ObsCR);
            AV81TFLb_ObsCR_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFLb_ObsCR_Sel", AV81TFLb_ObsCR_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV92TFLb_Estado_Sels", AV92TFLb_Estado_Sels);
   }

   private void e251U32( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV32HayProcesos = "N" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavHayprocesos.getInternalname(), AV32HayProcesos);
      /* Using cursor H01U34 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A5551Lb_lineaPq = H01U34_A5551Lb_lineaPq[0] ;
         AV32HayProcesos = "S" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavHayprocesos.getInternalname(), AV32HayProcesos);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      chkavSeleccionar.setVisible( 1 );
      if ( A5566Lb_Estado != 0 )
      {
         chkavSeleccionar.setVisible( 0 );
      }
      chkavSeleccionareliminar.setVisible( 1 );
      if ( A5566Lb_Estado != 3 )
      {
         chkavSeleccionareliminar.setVisible( 0 );
      }
      AV56Seleccionar = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV56Seleccionar);
      AV35i = (short)(1) ;
      while ( AV35i <= AV9Col_Lb_numero.size() )
      {
         if ( ( ((Number) AV9Col_Lb_numero.elementAt(-1+AV35i)).intValue() == A5532Lb_numero ) && ( GXutil.strcmp((String)AV11Col_Lb_opcion.elementAt(-1+AV35i), A5555Lb_opcion) == 0 ) )
         {
            AV56Seleccionar = true ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV56Seleccionar);
            if (true) break;
         }
         AV35i = (short)(AV35i+1) ;
      }
      AV57SeleccionarEliminar = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionareliminar.getInternalname(), AV57SeleccionarEliminar);
      AV35i = (short)(1) ;
      while ( AV35i <= AV10Col_Lb_numeroE.size() )
      {
         if ( ( ((Number) AV10Col_Lb_numeroE.elementAt(-1+AV35i)).intValue() == A5532Lb_numero ) && ( GXutil.strcmp((String)AV12Col_Lb_opcionE.elementAt(-1+AV35i), A5555Lb_opcion) == 0 ) )
         {
            AV57SeleccionarEliminar = true ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionareliminar.getInternalname(), AV57SeleccionarEliminar);
            if (true) break;
         }
         AV35i = (short)(AV35i+1) ;
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

   public void e171U32( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV15ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV13ColumnsSelector.fromJSonString(AV15ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.AprobacionInternaEnsayo_WCColumnsSelector", ((GXutil.strcmp("", AV15ColumnsSelectorXML)==0) ? "" : AV13ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13ColumnsSelector", AV13ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV47ManageFiltersData", AV47ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV30GridState", AV30GridState);
   }

   public void e131U32( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("GestionLaboratorio.AprobacionInternaEnsayo_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV95Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV48ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48ManageFiltersExecutionStep", GXutil.str( AV48ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("GestionLaboratorio.AprobacionInternaEnsayo_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV48ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48ManageFiltersExecutionStep", GXutil.str( AV48ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV49ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "GestionLaboratorio.AprobacionInternaEnsayo_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         aprobacioninternaensayo_wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV49ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV49ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV95Pgmname+"GridState", AV49ManageFiltersXml) ;
            AV30GridState.fromxml(AV49ManageFiltersXml, null, null);
            AV52OrderedBy = AV30GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52OrderedBy), 4, 0));
            AV54OrderedDsc = AV30GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54OrderedDsc", AV54OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV30GridState", AV30GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV92TFLb_Estado_Sels", AV92TFLb_Estado_Sels);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13ColumnsSelector", AV13ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV47ManageFiltersData", AV47ManageFiltersData);
   }

   public void e181U32( )
   {
      /* Dvelop_confirmpanel_aprobacion_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_aprobacion_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION APROBACION' */
         S202 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV9Col_Lb_numero", AV9Col_Lb_numero);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV11Col_Lb_opcion", AV11Col_Lb_opcion);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13ColumnsSelector", AV13ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV47ManageFiltersData", AV47ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV30GridState", AV30GridState);
   }

   public void e191U32( )
   {
      /* Dvelop_confirmpanel_eliminaraprobacion_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminaraprobacion_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARAPROBACION' */
         S212 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10Col_Lb_numeroE", AV10Col_Lb_numeroE);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV12Col_Lb_opcionE", AV12Col_Lb_opcionE);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13ColumnsSelector", AV13ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV47ManageFiltersData", AV47ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV30GridState", AV30GridState);
   }

   public void e201U32( )
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

   public void e211U32( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV25ExcelFilename ;
      GXv_char3[0] = AV24ErrorMessage ;
      new app.gestionlaboratorio.aprobacioninternaensayo_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      aprobacioninternaensayo_wc_impl.this.AV25ExcelFilename = GXv_char4[0] ;
      aprobacioninternaensayo_wc_impl.this.AV24ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV25ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV25ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV24ErrorMessage);
      }
   }

   public void e221U32( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.gestionlaboratorio.aprobacioninternaensayo_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV52OrderedBy, 4, 0))+":"+(AV54OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV13ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&Seleccionar", "", "Op", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_numero", "", "Nº de Ensayo", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_opcion", "", "Opcion", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_ColNom", "", "Color", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_ColNum", "", "Numero", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_TipRec", "", "Tipo", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliCod", "", "Cliente", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliNom", "", "Nombre", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_Cartaz", "", "Coleccion", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_cartazf", "", "Fecha Cole.", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_FechaEn", "", "Fecha Env.", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_FechaR", "", "Fecha Recep.", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_Estado", "", "E", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_ObsCR", "", "Observaciones", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&SeleccionarEliminar", "", "E", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&HayProcesos", "", "Procesos?", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV88UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.AprobacionInternaEnsayo_WCColumnsSelector", GXv_char4) ;
      aprobacioninternaensayo_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV88UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV88UserCustomValue)==0) ) )
      {
         AV14ColumnsSelectorAux.fromxml(AV88UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV14ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV13ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV14ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV13ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV47ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "GestionLaboratorio.AprobacionInternaEnsayo_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV47ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV27FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27FilterFullText", AV27FilterFullText);
      AV78TFLb_numero = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFLb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78TFLb_numero), 8, 0));
      AV79TFLb_numero_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TFLb_numero_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79TFLb_numero_To), 8, 0));
      AV82TFLb_opcion = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFLb_opcion", AV82TFLb_opcion);
      AV83TFLb_opcion_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFLb_opcion_Sel", AV83TFLb_opcion_Sel);
      AV68TFLb_ColNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFLb_ColNom", AV68TFLb_ColNom);
      AV69TFLb_ColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFLb_ColNom_Sel", AV69TFLb_ColNom_Sel);
      AV70TFLb_ColNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFLb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70TFLb_ColNum), 6, 0));
      AV71TFLb_ColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFLb_ColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TFLb_ColNum_To), 6, 0));
      AV84TFLb_TipRec = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFLb_TipRec", GXutil.str( AV84TFLb_TipRec, 1, 0));
      AV85TFLb_TipRec_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFLb_TipRec_To", GXutil.str( AV85TFLb_TipRec_To, 1, 0));
      AV60TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFCliCod), 6, 0));
      AV61TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFCliCod_To), 6, 0));
      AV62TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFCliNom", AV62TFCliNom);
      AV63TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFCliNom_Sel", AV63TFCliNom_Sel);
      AV64TFLb_Cartaz = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFLb_Cartaz", AV64TFLb_Cartaz);
      AV65TFLb_Cartaz_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFLb_Cartaz_Sel", AV65TFLb_Cartaz_Sel);
      AV66TFLb_cartazf = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFLb_cartazf", localUtil.format(AV66TFLb_cartazf, "99/99/99"));
      AV74TFLb_FechaEn = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFLb_FechaEn", localUtil.format(AV74TFLb_FechaEn, "99/99/99"));
      AV76TFLb_FechaR = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFLb_FechaR", localUtil.format(AV76TFLb_FechaR, "99/99/99"));
      AV92TFLb_Estado_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "") ;
      AV80TFLb_ObsCR = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFLb_ObsCR", AV80TFLb_ObsCR);
      AV81TFLb_ObsCR_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFLb_ObsCR_Sel", AV81TFLb_ObsCR_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S202( )
   {
      /* 'DO ACTION APROBACION' Routine */
      returnInSub = false ;
      AV7Act_op = (short)(0) ;
      AV43Lb_HoraR = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
      AV45Lb_opcioni = "" ;
      AV41Lb_colnumi = 0 ;
      AV46Lb_tipreci = (byte)(0) ;
      AV35i = (short)(1) ;
      while ( AV35i <= AV9Col_Lb_numero.size() )
      {
         AV51Opcion = "" ;
         AV39Lb_ArtCod = "" ;
         AV40Lb_ColNom = "" ;
         AV36IN_Lb_numero = ((Number) AV9Col_Lb_numero.elementAt(-1+AV35i)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36IN_Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36IN_Lb_numero), 8, 0));
         AV37IN_Lb_opcion = (String)AV11Col_Lb_opcion.elementAt(-1+AV35i) ;
         GXv_char4[0] = AV23EmprCod ;
         GXv_int12[0] = AV36IN_Lb_numero ;
         GXv_char3[0] = AV37IN_Lb_opcion ;
         GXv_char2[0] = A5533Lb_ArtCod ;
         GXv_char13[0] = A5536Lb_ColNom ;
         GXv_int14[0] = A5537Lb_ColNum ;
         GXv_int15[0] = A831TipColCod ;
         GXv_int16[0] = A5597Lb_TipRec ;
         GXv_date17[0] = AV42Lb_fechaR ;
         GXv_char18[0] = AV51Opcion ;
         new app.gestionlaboratorio.pens019(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_char2, GXv_char13, GXv_int14, GXv_int15, GXv_int16, GXv_date17, GXv_char18) ;
         aprobacioninternaensayo_wc_impl.this.AV23EmprCod = GXv_char4[0] ;
         aprobacioninternaensayo_wc_impl.this.AV36IN_Lb_numero = GXv_int12[0] ;
         aprobacioninternaensayo_wc_impl.this.AV37IN_Lb_opcion = GXv_char3[0] ;
         aprobacioninternaensayo_wc_impl.this.A5533Lb_ArtCod = GXv_char2[0] ;
         aprobacioninternaensayo_wc_impl.this.A5536Lb_ColNom = GXv_char13[0] ;
         aprobacioninternaensayo_wc_impl.this.A5537Lb_ColNum = GXv_int14[0] ;
         aprobacioninternaensayo_wc_impl.this.A831TipColCod = GXv_int15[0] ;
         aprobacioninternaensayo_wc_impl.this.A5597Lb_TipRec = GXv_int16[0] ;
         aprobacioninternaensayo_wc_impl.this.AV42Lb_fechaR = GXv_date17[0] ;
         aprobacioninternaensayo_wc_impl.this.AV51Opcion = GXv_char18[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23EmprCod", AV23EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36IN_Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36IN_Lb_numero), 8, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5533Lb_ArtCod", A5533Lb_ArtCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Lb_fechaR", localUtil.format(AV42Lb_fechaR, "99/99/99"));
         AV7Act_op = (short)(1) ;
         AV45Lb_opcioni = AV37IN_Lb_opcion ;
         AV41Lb_colnumi = A5537Lb_ColNum ;
         AV46Lb_tipreci = A5597Lb_TipRec ;
         AV35i = (short)(AV35i+1) ;
      }
      if ( AV7Act_op == 1 )
      {
         GXv_char18[0] = AV23EmprCod ;
         GXv_int14[0] = AV44Lb_Numero ;
         GXv_char13[0] = AV45Lb_opcioni ;
         GXv_int12[0] = AV41Lb_colnumi ;
         GXv_int16[0] = AV46Lb_tipreci ;
         GXv_date17[0] = AV42Lb_fechaR ;
         new app.gestionlaboratorio.pens019r(remoteHandle, context).execute( GXv_char18, GXv_int14, GXv_char13, GXv_int12, GXv_int16, GXv_date17) ;
         aprobacioninternaensayo_wc_impl.this.AV23EmprCod = GXv_char18[0] ;
         aprobacioninternaensayo_wc_impl.this.AV44Lb_Numero = GXv_int14[0] ;
         aprobacioninternaensayo_wc_impl.this.AV45Lb_opcioni = GXv_char13[0] ;
         aprobacioninternaensayo_wc_impl.this.AV41Lb_colnumi = GXv_int12[0] ;
         aprobacioninternaensayo_wc_impl.this.AV46Lb_tipreci = GXv_int16[0] ;
         aprobacioninternaensayo_wc_impl.this.AV42Lb_fechaR = GXv_date17[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23EmprCod", AV23EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Lb_Numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44Lb_Numero), 8, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Lb_fechaR", localUtil.format(AV42Lb_fechaR, "99/99/99"));
      }
      AV9Col_Lb_numero.clear();
      AV11Col_Lb_opcion.clear();
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S212( )
   {
      /* 'DO ACTION ELIMINARAPROBACION' Routine */
      returnInSub = false ;
      AV35i = (short)(1) ;
      while ( AV35i <= AV10Col_Lb_numeroE.size() )
      {
         AV36IN_Lb_numero = ((Number) AV10Col_Lb_numeroE.elementAt(-1+AV35i)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36IN_Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36IN_Lb_numero), 8, 0));
         AV37IN_Lb_opcion = (String)AV12Col_Lb_opcionE.elementAt(-1+AV35i) ;
         AV26Fec_null = GXutil.nullDate() ;
         AV33Hora_null = GXutil.resetTime( GXutil.nullDate() );
         GXv_char18[0] = AV23EmprCod ;
         GXv_int14[0] = AV36IN_Lb_numero ;
         GXv_char13[0] = AV37IN_Lb_opcion ;
         GXv_int12[0] = A5537Lb_ColNum ;
         GXv_int16[0] = A5597Lb_TipRec ;
         new app.gestionlaboratorio.pens019a(remoteHandle, context).execute( GXv_char18, GXv_int14, GXv_char13, GXv_int12, GXv_int16) ;
         aprobacioninternaensayo_wc_impl.this.AV23EmprCod = GXv_char18[0] ;
         aprobacioninternaensayo_wc_impl.this.AV36IN_Lb_numero = GXv_int14[0] ;
         aprobacioninternaensayo_wc_impl.this.AV37IN_Lb_opcion = GXv_char13[0] ;
         aprobacioninternaensayo_wc_impl.this.A5537Lb_ColNum = GXv_int12[0] ;
         aprobacioninternaensayo_wc_impl.this.A5597Lb_TipRec = GXv_int16[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23EmprCod", AV23EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36IN_Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36IN_Lb_numero), 8, 0));
         AV59Texto_i = httpContext.getMessage( "Eliminacion Aprobacion Interna ", "") + " " + httpContext.getMessage( "Ensayo=", "") + GXutil.trim( GXutil.str( A5532Lb_numero, 8, 0)) + " " + httpContext.getMessage( "Opcion=", "") + A5555Lb_opcion + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( AV23EmprCod, AV95Pgmname, AV6Usurcod, AV5Station, AV59Texto_i, 99999999, (byte)(0), "@") ;
         AV35i = (short)(AV35i+1) ;
      }
      AV10Col_Lb_numeroE.clear();
      AV12Col_Lb_opcionE.clear();
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV58Session.getValue(AV95Pgmname+"GridState"), "") == 0 )
      {
         AV30GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV95Pgmname+"GridState"), null, null);
      }
      else
      {
         AV30GridState.fromxml(AV58Session.getValue(AV95Pgmname+"GridState"), null, null);
      }
      AV52OrderedBy = AV30GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52OrderedBy), 4, 0));
      AV54OrderedDsc = AV30GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54OrderedDsc", AV54OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV30GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV30GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV30GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV122GXV1 = 1 ;
      while ( AV122GXV1 <= AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV122GXV1));
         if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV27FilterFullText = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27FilterFullText", AV27FilterFullText);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV78TFLb_numero = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFLb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78TFLb_numero), 8, 0));
            AV79TFLb_numero_To = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TFLb_numero_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79TFLb_numero_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION") == 0 )
         {
            AV82TFLb_opcion = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFLb_opcion", AV82TFLb_opcion);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION_SEL") == 0 )
         {
            AV83TFLb_opcion_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFLb_opcion_Sel", AV83TFLb_opcion_Sel);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM") == 0 )
         {
            AV68TFLb_ColNom = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFLb_ColNom", AV68TFLb_ColNom);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM_SEL") == 0 )
         {
            AV69TFLb_ColNom_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFLb_ColNom_Sel", AV69TFLb_ColNom_Sel);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV70TFLb_ColNum = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFLb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70TFLb_ColNum), 6, 0));
            AV71TFLb_ColNum_To = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFLb_ColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TFLb_ColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPREC") == 0 )
         {
            AV84TFLb_TipRec = (byte)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFLb_TipRec", GXutil.str( AV84TFLb_TipRec, 1, 0));
            AV85TFLb_TipRec_To = (byte)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFLb_TipRec_To", GXutil.str( AV85TFLb_TipRec_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV60TFCliCod = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFCliCod), 6, 0));
            AV61TFCliCod_To = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV62TFCliNom = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFCliNom", AV62TFCliNom);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV63TFCliNom_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFCliNom_Sel", AV63TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV64TFLb_Cartaz = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFLb_Cartaz", AV64TFLb_Cartaz);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV65TFLb_Cartaz_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFLb_Cartaz_Sel", AV65TFLb_Cartaz_Sel);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZF") == 0 )
         {
            AV66TFLb_cartazf = localUtil.ctod( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFLb_cartazf", localUtil.format(AV66TFLb_cartazf, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAEN") == 0 )
         {
            AV74TFLb_FechaEn = localUtil.ctod( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFLb_FechaEn", localUtil.format(AV74TFLb_FechaEn, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAR") == 0 )
         {
            AV76TFLb_FechaR = localUtil.ctod( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFLb_FechaR", localUtil.format(AV76TFLb_FechaR, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTADO_SEL") == 0 )
         {
            AV91TFLb_Estado_SelsJson = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFLb_Estado_SelsJson", AV91TFLb_Estado_SelsJson);
            AV92TFLb_Estado_Sels.fromJSonString(AV91TFLb_Estado_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OBSCR") == 0 )
         {
            AV80TFLb_ObsCR = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFLb_ObsCR", AV80TFLb_ObsCR);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OBSCR_SEL") == 0 )
         {
            AV81TFLb_ObsCR_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFLb_ObsCR_Sel", AV81TFLb_ObsCR_Sel);
         }
         AV122GXV1 = (int)(AV122GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char18[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV83TFLb_opcion_Sel)==0), AV83TFLb_opcion_Sel, GXv_char18) ;
      aprobacioninternaensayo_wc_impl.this.GXt_char1 = GXv_char18[0] ;
      GXt_char19 = "" ;
      GXv_char13[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV69TFLb_ColNom_Sel)==0), AV69TFLb_ColNom_Sel, GXv_char13) ;
      aprobacioninternaensayo_wc_impl.this.GXt_char19 = GXv_char13[0] ;
      GXt_char20 = "" ;
      GXv_char4[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFCliNom_Sel)==0), AV63TFCliNom_Sel, GXv_char4) ;
      aprobacioninternaensayo_wc_impl.this.GXt_char20 = GXv_char4[0] ;
      GXt_char21 = "" ;
      GXv_char3[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFLb_Cartaz_Sel)==0), AV65TFLb_Cartaz_Sel, GXv_char3) ;
      aprobacioninternaensayo_wc_impl.this.GXt_char21 = GXv_char3[0] ;
      GXt_char22 = "" ;
      GXv_char2[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV81TFLb_ObsCR_Sel)==0), AV81TFLb_ObsCR_Sel, GXv_char2) ;
      aprobacioninternaensayo_wc_impl.this.GXt_char22 = GXv_char2[0] ;
      Ddo_grid_Selectedvalue_set = "||"+GXt_char1+"|"+GXt_char19+"||||"+GXt_char20+"|"+GXt_char21+"||||"+((AV92TFLb_Estado_Sels.size()==0) ? "" : AV91TFLb_Estado_SelsJson)+"|"+GXt_char22+"||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char22 = "" ;
      GXv_char18[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV82TFLb_opcion)==0), AV82TFLb_opcion, GXv_char18) ;
      aprobacioninternaensayo_wc_impl.this.GXt_char22 = GXv_char18[0] ;
      GXt_char21 = "" ;
      GXv_char13[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFLb_ColNom)==0), AV68TFLb_ColNom, GXv_char13) ;
      aprobacioninternaensayo_wc_impl.this.GXt_char21 = GXv_char13[0] ;
      GXt_char20 = "" ;
      GXv_char4[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFCliNom)==0), AV62TFCliNom, GXv_char4) ;
      aprobacioninternaensayo_wc_impl.this.GXt_char20 = GXv_char4[0] ;
      GXt_char19 = "" ;
      GXv_char3[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFLb_Cartaz)==0), AV64TFLb_Cartaz, GXv_char3) ;
      aprobacioninternaensayo_wc_impl.this.GXt_char19 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV80TFLb_ObsCR)==0), AV80TFLb_ObsCR, GXv_char2) ;
      aprobacioninternaensayo_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = "|"+((0==AV78TFLb_numero) ? "" : GXutil.str( AV78TFLb_numero, 8, 0))+"|"+GXt_char22+"|"+GXt_char21+"|"+((0==AV70TFLb_ColNum) ? "" : GXutil.str( AV70TFLb_ColNum, 6, 0))+"|"+((0==AV84TFLb_TipRec) ? "" : GXutil.str( AV84TFLb_TipRec, 1, 0))+"|"+((0==AV60TFCliCod) ? "" : GXutil.str( AV60TFCliCod, 6, 0))+"|"+GXt_char20+"|"+GXt_char19+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66TFLb_cartazf)) ? "" : localUtil.dtoc( AV66TFLb_cartazf, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74TFLb_FechaEn)) ? "" : localUtil.dtoc( AV74TFLb_FechaEn, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76TFLb_FechaR)) ? "" : localUtil.dtoc( AV76TFLb_FechaR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"||"+GXt_char1+"||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV79TFLb_numero_To) ? "" : GXutil.str( AV79TFLb_numero_To, 8, 0))+"|||"+((0==AV71TFLb_ColNum_To) ? "" : GXutil.str( AV71TFLb_ColNum_To, 6, 0))+"|"+((0==AV85TFLb_TipRec_To) ? "" : GXutil.str( AV85TFLb_TipRec_To, 1, 0))+"|"+((0==AV61TFCliCod_To) ? "" : GXutil.str( AV61TFCliCod_To, 6, 0))+"|||||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV30GridState.fromxml(AV58Session.getValue(AV95Pgmname+"GridState"), null, null);
      AV30GridState.setgxTv_SdtWWPGridState_Orderedby( AV52OrderedBy );
      AV30GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV54OrderedDsc );
      AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState23[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV27FilterFullText)==0), (short)(0), AV27FilterFullText, "") ;
      AV30GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFLB_NUMERO", "", !((0==AV78TFLb_numero)&&(0==AV79TFLb_numero_To)), (short)(0), GXutil.trim( GXutil.str( AV78TFLb_numero, 8, 0)), GXutil.trim( GXutil.str( AV79TFLb_numero_To, 8, 0))) ;
      AV30GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFLB_OPCION", "", !(GXutil.strcmp("", AV82TFLb_opcion)==0), (short)(0), AV82TFLb_opcion, "", !(GXutil.strcmp("", AV83TFLb_opcion_Sel)==0), AV83TFLb_opcion_Sel, "") ;
      AV30GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFLB_COLNOM", "", !(GXutil.strcmp("", AV68TFLb_ColNom)==0), (short)(0), AV68TFLb_ColNom, "", !(GXutil.strcmp("", AV69TFLb_ColNom_Sel)==0), AV69TFLb_ColNom_Sel, "") ;
      AV30GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFLB_COLNUM", "", !((0==AV70TFLb_ColNum)&&(0==AV71TFLb_ColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV70TFLb_ColNum, 6, 0)), GXutil.trim( GXutil.str( AV71TFLb_ColNum_To, 6, 0))) ;
      AV30GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFLB_TIPREC", "", !((0==AV84TFLb_TipRec)&&(0==AV85TFLb_TipRec_To)), (short)(0), GXutil.trim( GXutil.str( AV84TFLb_TipRec, 1, 0)), GXutil.trim( GXutil.str( AV85TFLb_TipRec_To, 1, 0))) ;
      AV30GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFCLICOD", "", !((0==AV60TFCliCod)&&(0==AV61TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV60TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV61TFCliCod_To, 6, 0))) ;
      AV30GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFCLINOM", "", !(GXutil.strcmp("", AV62TFCliNom)==0), (short)(0), AV62TFCliNom, "", !(GXutil.strcmp("", AV63TFCliNom_Sel)==0), AV63TFCliNom_Sel, "") ;
      AV30GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFLB_CARTAZ", "", !(GXutil.strcmp("", AV64TFLb_Cartaz)==0), (short)(0), AV64TFLb_Cartaz, "", !(GXutil.strcmp("", AV65TFLb_Cartaz_Sel)==0), AV65TFLb_Cartaz_Sel, "") ;
      AV30GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFLB_CARTAZF", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66TFLb_cartazf)), (short)(0), GXutil.trim( localUtil.dtoc( AV66TFLb_cartazf, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV30GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFLB_FECHAEN", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74TFLb_FechaEn)), (short)(0), GXutil.trim( localUtil.dtoc( AV74TFLb_FechaEn, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV30GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFLB_FECHAR", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76TFLb_FechaR)), (short)(0), GXutil.trim( localUtil.dtoc( AV76TFLb_FechaR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV30GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFLB_ESTADO_SEL", "", !(AV92TFLb_Estado_Sels.size()==0), (short)(0), AV92TFLb_Estado_Sels.toJSonString(false), "") ;
      AV30GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFLB_OBSCR", "", !(GXutil.strcmp("", AV80TFLb_ObsCR)==0), (short)(0), AV80TFLb_ObsCR, "", !(GXutil.strcmp("", AV81TFLb_ObsCR_Sel)==0), AV81TFLb_ObsCR_Sel, "") ;
      AV30GridState = GXv_SdtWWPGridState23[0] ;
      if ( ! (GXutil.strcmp("", AV23EmprCod)==0) )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV23EmprCod );
         AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV31GridStateFilterValue, 0);
      }
      if ( ! (0==AV44Lb_Numero) )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_NUMERO" );
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV44Lb_Numero, 8, 0) );
         AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV31GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42Lb_fechaR)) )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_FECHAR" );
         AV31GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV42Lb_fechaR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV31GridStateFilterValue, 0);
      }
      AV30GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV30GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV95Pgmname+"GridState", AV30GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV86TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV86TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV95Pgmname );
      AV86TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV86TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV34HTTPRequest.getScriptName()+"?"+AV34HTTPRequest.getQuerystring() );
      AV86TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "GestionLaboratorio.TENS003" );
      AV58Session.setValue("TrnContext", AV86TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S192( )
   {
      /* 'NVECES' Routine */
      returnInSub = false ;
      AV50Num_v = (short)(0) ;
      AV90t = (short)(1) ;
      while ( AV90t <= AV9Col_Lb_numero.size() )
      {
         AV123In_lb_numerot = ((Number) AV9Col_Lb_numero.elementAt(-1+AV90t)).intValue() ;
         if ( AV123In_lb_numerot == AV36IN_Lb_numero )
         {
            AV50Num_v = (short)(AV50Num_v+1) ;
         }
         AV90t = (short)(AV90t+1) ;
      }
   }

   public void wb_table3_91_1U32( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminaraprobacion_Internalname, tblTabledvelop_confirmpanel_eliminaraprobacion_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminaraprobacion.setProperty("Title", Dvelop_confirmpanel_eliminaraprobacion_Title);
         ucDvelop_confirmpanel_eliminaraprobacion.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminaraprobacion_Confirmationtext);
         ucDvelop_confirmpanel_eliminaraprobacion.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminaraprobacion_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminaraprobacion.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminaraprobacion_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminaraprobacion.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminaraprobacion_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminaraprobacion.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminaraprobacion_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminaraprobacion.setProperty("ConfirmType", Dvelop_confirmpanel_eliminaraprobacion_Confirmtype);
         ucDvelop_confirmpanel_eliminaraprobacion.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminaraprobacion_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARAPROBACIONContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARAPROBACIONContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_91_1U32e( true) ;
      }
      else
      {
         wb_table3_91_1U32e( false) ;
      }
   }

   public void wb_table2_86_1U32( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_aprobacion_Internalname, tblTabledvelop_confirmpanel_aprobacion_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_aprobacion.setProperty("Title", Dvelop_confirmpanel_aprobacion_Title);
         ucDvelop_confirmpanel_aprobacion.setProperty("ConfirmationText", Dvelop_confirmpanel_aprobacion_Confirmationtext);
         ucDvelop_confirmpanel_aprobacion.setProperty("YesButtonCaption", Dvelop_confirmpanel_aprobacion_Yesbuttoncaption);
         ucDvelop_confirmpanel_aprobacion.setProperty("NoButtonCaption", Dvelop_confirmpanel_aprobacion_Nobuttoncaption);
         ucDvelop_confirmpanel_aprobacion.setProperty("CancelButtonCaption", Dvelop_confirmpanel_aprobacion_Cancelbuttoncaption);
         ucDvelop_confirmpanel_aprobacion.setProperty("YesButtonPosition", Dvelop_confirmpanel_aprobacion_Yesbuttonposition);
         ucDvelop_confirmpanel_aprobacion.setProperty("ConfirmType", Dvelop_confirmpanel_aprobacion_Confirmtype);
         ucDvelop_confirmpanel_aprobacion.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_aprobacion_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_86_1U32e( true) ;
      }
      else
      {
         wb_table2_86_1U32e( false) ;
      }
   }

   public void wb_table1_23_1U32( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV47ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table4_28_1U32( true) ;
      }
      else
      {
         wb_table4_28_1U32( false) ;
      }
      return  ;
   }

   public void wb_table4_28_1U32e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_1U32e( true) ;
      }
      else
      {
         wb_table1_23_1U32e( false) ;
      }
   }

   public void wb_table4_28_1U32( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'" + sGXsfl_56_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV27FilterFullText, GXutil.rtrim( localUtil.format( AV27FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_GestionLaboratorio\\AprobacionInternaEnsayo_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_28_1U32e( true) ;
      }
      else
      {
         wb_table4_28_1U32e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV23EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23EmprCod", AV23EmprCod);
      AV44Lb_Numero = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Lb_Numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44Lb_Numero), 8, 0));
      AV42Lb_fechaR = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Lb_fechaR", localUtil.format(AV42Lb_fechaR, "99/99/99"));
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
      pa1U32( ) ;
      ws1U32( ) ;
      we1U32( ) ;
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
      sCtrlAV23EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV44Lb_Numero = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV42Lb_fechaR = (String)getParm(obj,2,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1U32( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "gestionlaboratorio\\aprobacioninternaensayo_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1U32( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV23EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23EmprCod", AV23EmprCod);
         AV44Lb_Numero = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Lb_Numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44Lb_Numero), 8, 0));
         AV42Lb_fechaR = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Lb_fechaR", localUtil.format(AV42Lb_fechaR, "99/99/99"));
      }
      wcpOAV23EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV23EmprCod") ;
      wcpOAV44Lb_Numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV44Lb_Numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV42Lb_fechaR = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV42Lb_fechaR"), 0) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV23EmprCod, wcpOAV23EmprCod) != 0 ) || ( AV44Lb_Numero != wcpOAV44Lb_Numero ) || !( GXutil.dateCompare(GXutil.resetTime(AV42Lb_fechaR), GXutil.resetTime(wcpOAV42Lb_fechaR)) ) ) )
      {
         setjustcreated();
      }
      wcpOAV23EmprCod = AV23EmprCod ;
      wcpOAV44Lb_Numero = AV44Lb_Numero ;
      wcpOAV42Lb_fechaR = AV42Lb_fechaR ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV23EmprCod = httpContext.cgiGet( sPrefix+"AV23EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV23EmprCod) > 0 )
      {
         AV23EmprCod = httpContext.cgiGet( sCtrlAV23EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23EmprCod", AV23EmprCod);
      }
      else
      {
         AV23EmprCod = httpContext.cgiGet( sPrefix+"AV23EmprCod_PARM") ;
      }
      sCtrlAV44Lb_Numero = httpContext.cgiGet( sPrefix+"AV44Lb_Numero_CTRL") ;
      if ( GXutil.len( sCtrlAV44Lb_Numero) > 0 )
      {
         AV44Lb_Numero = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV44Lb_Numero), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Lb_Numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44Lb_Numero), 8, 0));
      }
      else
      {
         AV44Lb_Numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV44Lb_Numero_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV42Lb_fechaR = httpContext.cgiGet( sPrefix+"AV42Lb_fechaR_CTRL") ;
      if ( GXutil.len( sCtrlAV42Lb_fechaR) > 0 )
      {
         AV42Lb_fechaR = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV42Lb_fechaR), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Lb_fechaR", localUtil.format(AV42Lb_fechaR, "99/99/99"));
      }
      else
      {
         AV42Lb_fechaR = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV42Lb_fechaR_PARM"), 0) ;
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
      pa1U32( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1U32( ) ;
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
      ws1U32( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23EmprCod_PARM", GXutil.rtrim( AV23EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV23EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23EmprCod_CTRL", GXutil.rtrim( sCtrlAV23EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44Lb_Numero_PARM", GXutil.ltrim( localUtil.ntoc( AV44Lb_Numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV44Lb_Numero)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44Lb_Numero_CTRL", GXutil.rtrim( sCtrlAV44Lb_Numero));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42Lb_fechaR_PARM", localUtil.dtoc( AV42Lb_fechaR, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV42Lb_fechaR)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42Lb_fechaR_CTRL", GXutil.rtrim( sCtrlAV42Lb_fechaR));
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
      we1U32( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821166050", true, true);
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
      httpContext.AddJavascriptSource("messages."+httpContext.getLanguageProperty( "code")+".js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
      httpContext.AddJavascriptSource("gestionlaboratorio/aprobacioninternaensayo_wc.js", "?2026821166051", false, true);
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

   public void subsflControlProps_562( )
   {
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_56_idx );
      edtLb_numero_Internalname = sPrefix+"LB_NUMERO_"+sGXsfl_56_idx ;
      edtLb_opcion_Internalname = sPrefix+"LB_OPCION_"+sGXsfl_56_idx ;
      edtLb_ColNom_Internalname = sPrefix+"LB_COLNOM_"+sGXsfl_56_idx ;
      edtLb_ColNum_Internalname = sPrefix+"LB_COLNUM_"+sGXsfl_56_idx ;
      edtLb_TipRec_Internalname = sPrefix+"LB_TIPREC_"+sGXsfl_56_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_56_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_56_idx ;
      edtLb_Cartaz_Internalname = sPrefix+"LB_CARTAZ_"+sGXsfl_56_idx ;
      edtLb_cartazf_Internalname = sPrefix+"LB_CARTAZF_"+sGXsfl_56_idx ;
      edtLb_FechaEn_Internalname = sPrefix+"LB_FECHAEN_"+sGXsfl_56_idx ;
      edtLb_FechaR_Internalname = sPrefix+"LB_FECHAR_"+sGXsfl_56_idx ;
      cmbLb_Estado.setInternalname( sPrefix+"LB_ESTADO_"+sGXsfl_56_idx );
      edtLb_ObsCR_Internalname = sPrefix+"LB_OBSCR_"+sGXsfl_56_idx ;
      chkavSeleccionareliminar.setInternalname( sPrefix+"vSELECCIONARELIMINAR_"+sGXsfl_56_idx );
      edtTipColCod_Internalname = sPrefix+"TIPCOLCOD_"+sGXsfl_56_idx ;
      chkavHayprocesos.setInternalname( sPrefix+"vHAYPROCESOS_"+sGXsfl_56_idx );
   }

   public void subsflControlProps_fel_562( )
   {
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_56_fel_idx );
      edtLb_numero_Internalname = sPrefix+"LB_NUMERO_"+sGXsfl_56_fel_idx ;
      edtLb_opcion_Internalname = sPrefix+"LB_OPCION_"+sGXsfl_56_fel_idx ;
      edtLb_ColNom_Internalname = sPrefix+"LB_COLNOM_"+sGXsfl_56_fel_idx ;
      edtLb_ColNum_Internalname = sPrefix+"LB_COLNUM_"+sGXsfl_56_fel_idx ;
      edtLb_TipRec_Internalname = sPrefix+"LB_TIPREC_"+sGXsfl_56_fel_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_56_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_56_fel_idx ;
      edtLb_Cartaz_Internalname = sPrefix+"LB_CARTAZ_"+sGXsfl_56_fel_idx ;
      edtLb_cartazf_Internalname = sPrefix+"LB_CARTAZF_"+sGXsfl_56_fel_idx ;
      edtLb_FechaEn_Internalname = sPrefix+"LB_FECHAEN_"+sGXsfl_56_fel_idx ;
      edtLb_FechaR_Internalname = sPrefix+"LB_FECHAR_"+sGXsfl_56_fel_idx ;
      cmbLb_Estado.setInternalname( sPrefix+"LB_ESTADO_"+sGXsfl_56_fel_idx );
      edtLb_ObsCR_Internalname = sPrefix+"LB_OBSCR_"+sGXsfl_56_fel_idx ;
      chkavSeleccionareliminar.setInternalname( sPrefix+"vSELECCIONARELIMINAR_"+sGXsfl_56_fel_idx );
      edtTipColCod_Internalname = sPrefix+"TIPCOLCOD_"+sGXsfl_56_fel_idx ;
      chkavHayprocesos.setInternalname( sPrefix+"vHAYPROCESOS_"+sGXsfl_56_fel_idx );
   }

   public void sendrow_562( )
   {
      subsflControlProps_562( ) ;
      wb1U30( ) ;
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_56_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavSeleccionar.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 57,'"+sPrefix+"',false,'"+sGXsfl_56_idx+"',56)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCIONAR_" + sGXsfl_56_idx ;
         chkavSeleccionar.setName( GXCCtl );
         chkavSeleccionar.setWebtags( "" );
         chkavSeleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_56_Refreshing);
         chkavSeleccionar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccionar.getInternalname(),GXutil.booltostr( AV56Seleccionar),"","",Integer.valueOf(chkavSeleccionar.getVisible()),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,57);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_numero_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_numero_Internalname,GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_numero_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_numero_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_opcion_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_opcion_Internalname,GXutil.rtrim( A5555Lb_opcion),GXutil.rtrim( localUtil.format( A5555Lb_opcion, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_opcion_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_opcion_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_ColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ColNom_Internalname,GXutil.rtrim( A5536Lb_ColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_ColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_ColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_ColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A5537Lb_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5537Lb_ColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_ColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_ColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_TipRec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_TipRec_Internalname,GXutil.ltrim( localUtil.ntoc( A5597Lb_TipRec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5597Lb_TipRec), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_TipRec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_TipRec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_Cartaz_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_Cartaz_Internalname,GXutil.rtrim( A5540Lb_Cartaz),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_Cartaz_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_Cartaz_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_cartazf_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_cartazf_Internalname,localUtil.format(A5594Lb_cartazf, "99/99/99"),localUtil.format( A5594Lb_cartazf, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_cartazf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_cartazf_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_FechaEn_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_FechaEn_Internalname,localUtil.format(A5567Lb_FechaEn, "99/99/99"),localUtil.format( A5567Lb_FechaEn, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_FechaEn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_FechaEn_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_FechaR_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_FechaR_Internalname,localUtil.format(A5563Lb_FechaR, "99/99/99"),localUtil.format( A5563Lb_FechaR, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_FechaR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_FechaR_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbLb_Estado.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbLb_Estado.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "LB_ESTADO_" + sGXsfl_56_idx ;
            cmbLb_Estado.setName( GXCCtl );
            cmbLb_Estado.setWebtags( "" );
            cmbLb_Estado.addItem("3", httpContext.getMessage( "Aprob. INterna", ""), (short)(0));
            cmbLb_Estado.addItem("2", httpContext.getMessage( "Recepcionado", ""), (short)(0));
            cmbLb_Estado.addItem("1", httpContext.getMessage( "Enviado", ""), (short)(0));
            if ( cmbLb_Estado.getItemCount() > 0 )
            {
               A5566Lb_Estado = (byte)(GXutil.lval( cmbLb_Estado.getValidValue(GXutil.trim( GXutil.str( A5566Lb_Estado, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbLb_Estado,cmbLb_Estado.getInternalname(),GXutil.trim( GXutil.str( A5566Lb_Estado, 1, 0)),Integer.valueOf(1),cmbLb_Estado.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbLb_Estado.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbLb_Estado.setValue( GXutil.trim( GXutil.str( A5566Lb_Estado, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbLb_Estado.getInternalname(), "Values", cmbLb_Estado.ToJavascriptSource(), !bGXsfl_56_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_ObsCR_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ObsCR_Internalname,A10822Lb_ObsCR,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_ObsCR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_ObsCR_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(300),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavSeleccionareliminar.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccionareliminar.getEnabled()!=0)&&(chkavSeleccionareliminar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 71,'"+sPrefix+"',false,'"+sGXsfl_56_idx+"',56)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCIONARELIMINAR_" + sGXsfl_56_idx ;
         chkavSeleccionareliminar.setName( GXCCtl );
         chkavSeleccionareliminar.setWebtags( "" );
         chkavSeleccionareliminar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionareliminar.getInternalname(), "TitleCaption", chkavSeleccionareliminar.getCaption(), !bGXsfl_56_Refreshing);
         chkavSeleccionareliminar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccionareliminar.getInternalname(),GXutil.booltostr( AV57SeleccionarEliminar),"","",Integer.valueOf(chkavSeleccionareliminar.getVisible()),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+((chkavSeleccionareliminar.getEnabled()!=0)&&(chkavSeleccionareliminar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,71);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipColCod_Internalname,GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTipColCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavHayprocesos.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavHayprocesos.getEnabled()!=0)&&(chkavHayprocesos.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 73,'"+sPrefix+"',false,'"+sGXsfl_56_idx+"',56)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vHAYPROCESOS_" + sGXsfl_56_idx ;
         chkavHayprocesos.setName( GXCCtl );
         chkavHayprocesos.setWebtags( "" );
         chkavHayprocesos.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavHayprocesos.getInternalname(), "TitleCaption", chkavHayprocesos.getCaption(), !bGXsfl_56_Refreshing);
         chkavHayprocesos.setCheckedValue( "N" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavHayprocesos.getInternalname(),AV32HayProcesos,"","",Integer.valueOf(chkavHayprocesos.getVisible()),Integer.valueOf(chkavHayprocesos.getEnabled()),"S","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(73, this, 'S', 'N',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+((chkavHayprocesos.getEnabled()!=0)&&(chkavHayprocesos.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,73);\"" : " ")});
         send_integrity_lvl_hashes1U32( ) ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavSeleccionar.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_numero_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº de Ensayo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_opcion_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Opcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_ColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_ColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_TipRec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_Cartaz_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coleccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_cartazf_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Cole.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_FechaEn_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Env.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_FechaR_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Recep.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbLb_Estado.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_ObsCR_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Observaciones", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavSeleccionareliminar.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavHayprocesos.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Procesos?", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.booltostr( AV56Seleccionar));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavSeleccionar.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_numero_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5555Lb_opcion));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_opcion_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5536Lb_ColNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_ColNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5537Lb_ColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_ColNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5597Lb_TipRec, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_TipRec_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5540Lb_Cartaz));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_Cartaz_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A5594Lb_cartazf, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_cartazf_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A5567Lb_FechaEn, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_FechaEn_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A5563Lb_FechaR, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_FechaR_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5566Lb_Estado, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbLb_Estado.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A10822Lb_ObsCR);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_ObsCR_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.booltostr( AV57SeleccionarEliminar));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavSeleccionareliminar.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV32HayProcesos));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavHayprocesos.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavHayprocesos.getVisible(), (byte)(5), (byte)(0), ".", "")));
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
      bttBtnaprobacion_Internalname = sPrefix+"BTNAPROBACION" ;
      bttBtneliminaraprobacion_Internalname = sPrefix+"BTNELIMINARAPROBACION" ;
      bttBtncancelar_Internalname = sPrefix+"BTNCANCELAR" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR" );
      edtLb_numero_Internalname = sPrefix+"LB_NUMERO" ;
      edtLb_opcion_Internalname = sPrefix+"LB_OPCION" ;
      edtLb_ColNom_Internalname = sPrefix+"LB_COLNOM" ;
      edtLb_ColNum_Internalname = sPrefix+"LB_COLNUM" ;
      edtLb_TipRec_Internalname = sPrefix+"LB_TIPREC" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtLb_Cartaz_Internalname = sPrefix+"LB_CARTAZ" ;
      edtLb_cartazf_Internalname = sPrefix+"LB_CARTAZF" ;
      edtLb_FechaEn_Internalname = sPrefix+"LB_FECHAEN" ;
      edtLb_FechaR_Internalname = sPrefix+"LB_FECHAR" ;
      cmbLb_Estado.setInternalname( sPrefix+"LB_ESTADO" );
      edtLb_ObsCR_Internalname = sPrefix+"LB_OBSCR" ;
      chkavSeleccionareliminar.setInternalname( sPrefix+"vSELECCIONARELIMINAR" );
      edtTipColCod_Internalname = sPrefix+"TIPCOLCOD" ;
      chkavHayprocesos.setInternalname( sPrefix+"vHAYPROCESOS" );
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_aprobacion_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_APROBACION" ;
      tblTabledvelop_confirmpanel_aprobacion_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_APROBACION" ;
      Dvelop_confirmpanel_eliminaraprobacion_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARAPROBACION" ;
      tblTabledvelop_confirmpanel_eliminaraprobacion_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_ELIMINARAPROBACION" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_lb_cartazfauxdate_Internalname = sPrefix+"vDDO_LB_CARTAZFAUXDATE" ;
      divDdo_lb_cartazfauxdates_Internalname = sPrefix+"DDO_LB_CARTAZFAUXDATES" ;
      edtavDdo_lb_fechaenauxdate_Internalname = sPrefix+"vDDO_LB_FECHAENAUXDATE" ;
      divDdo_lb_fechaenauxdates_Internalname = sPrefix+"DDO_LB_FECHAENAUXDATES" ;
      edtavDdo_lb_fecharauxdate_Internalname = sPrefix+"vDDO_LB_FECHARAUXDATE" ;
      divDdo_lb_fecharauxdates_Internalname = sPrefix+"DDO_LB_FECHARAUXDATES" ;
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
      chkavHayprocesos.setCaption( "" );
      chkavHayprocesos.setEnabled( 1 );
      edtTipColCod_Jsonclick = "" ;
      chkavSeleccionareliminar.setCaption( "" );
      chkavSeleccionareliminar.setEnabled( 1 );
      edtLb_ObsCR_Jsonclick = "" ;
      cmbLb_Estado.setJsonclick( "" );
      edtLb_FechaR_Jsonclick = "" ;
      edtLb_FechaEn_Jsonclick = "" ;
      edtLb_cartazf_Jsonclick = "" ;
      edtLb_Cartaz_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtLb_TipRec_Jsonclick = "" ;
      edtLb_ColNum_Jsonclick = "" ;
      edtLb_ColNom_Jsonclick = "" ;
      edtLb_opcion_Jsonclick = "" ;
      edtLb_numero_Jsonclick = "" ;
      chkavSeleccionar.setCaption( "" );
      chkavSeleccionar.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      chkavHayprocesos.setVisible( -1 );
      chkavSeleccionareliminar.setVisible( -1 );
      edtLb_ObsCR_Visible = -1 ;
      cmbLb_Estado.setVisible( -1 );
      edtLb_FechaR_Visible = -1 ;
      edtLb_FechaEn_Visible = -1 ;
      edtLb_cartazf_Visible = -1 ;
      edtLb_Cartaz_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      edtLb_TipRec_Visible = -1 ;
      edtLb_ColNum_Visible = -1 ;
      edtLb_ColNom_Visible = -1 ;
      edtLb_opcion_Visible = -1 ;
      edtLb_numero_Visible = -1 ;
      chkavSeleccionar.setVisible( -1 );
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_lb_fecharauxdate_Jsonclick = "" ;
      edtavDdo_lb_fechaenauxdate_Jsonclick = "" ;
      edtavDdo_lb_cartazfauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divUnnamedtable2_Height = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_eliminaraprobacion_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminaraprobacion_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminaraprobacion_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminaraprobacion_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminaraprobacion_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminaraprobacion_Confirmationtext = "¿Desea eliminar la Aprobacion?" ;
      Dvelop_confirmpanel_eliminaraprobacion_Title = "" ;
      Dvelop_confirmpanel_aprobacion_Confirmtype = "1" ;
      Dvelop_confirmpanel_aprobacion_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_aprobacion_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_aprobacion_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_aprobacion_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_aprobacion_Confirmationtext = "¿Confirma la Aprobacion?" ;
      Dvelop_confirmpanel_aprobacion_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "GestionLaboratorio.AprobacionInternaEnsayo_WCGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||||||||||||3:Aprob. INterna,2:Recepcionado,1:Enviado|||" ;
      Ddo_grid_Allowmultipleselection = "||||||||||||T|||" ;
      Ddo_grid_Datalisttype = "||Dynamic|Dynamic||||Dynamic|Dynamic||||FixedValues|Dynamic||" ;
      Ddo_grid_Includedatalist = "||T|T||||T|T||||T|T||" ;
      Ddo_grid_Filterisrange = "|T|||T|T|T|||||||||" ;
      Ddo_grid_Filtertype = "|Numeric|Character|Character|Numeric|Numeric|Numeric|Character|Character|Date|Date|Date||Character||" ;
      Ddo_grid_Includefilter = "|T|T|T|T|T|T|T|T|T|T|T||T||" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "|T|T|T|T|T|T|T|T|T|T|T|T|T||" ;
      Ddo_grid_Columnssortvalues = "|1|2|3|4|5|6|7|8|9|10|11|12|13||" ;
      Ddo_grid_Columnids = "0:Seleccionar|1:Lb_numero|2:Lb_opcion|3:Lb_ColNom|4:Lb_ColNum|5:Lb_TipRec|6:CliCod|7:CliNom|8:Lb_Cartaz|9:Lb_cartazf|10:Lb_FechaEn|11:Lb_FechaR|12:Lb_Estado|13:Lb_ObsCR|14:SeleccionarEliminar|16:HayProcesos" ;
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
      GXCCtl = "vSELECCIONAR_" + sGXsfl_56_idx ;
      chkavSeleccionar.setName( GXCCtl );
      chkavSeleccionar.setWebtags( "" );
      chkavSeleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_56_Refreshing);
      chkavSeleccionar.setCheckedValue( "false" );
      GXCCtl = "LB_ESTADO_" + sGXsfl_56_idx ;
      cmbLb_Estado.setName( GXCCtl );
      cmbLb_Estado.setWebtags( "" );
      cmbLb_Estado.addItem("3", httpContext.getMessage( "Aprob. INterna", ""), (short)(0));
      cmbLb_Estado.addItem("2", httpContext.getMessage( "Recepcionado", ""), (short)(0));
      cmbLb_Estado.addItem("1", httpContext.getMessage( "Enviado", ""), (short)(0));
      if ( cmbLb_Estado.getItemCount() > 0 )
      {
      }
      GXCCtl = "vSELECCIONARELIMINAR_" + sGXsfl_56_idx ;
      chkavSeleccionareliminar.setName( GXCCtl );
      chkavSeleccionareliminar.setWebtags( "" );
      chkavSeleccionareliminar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionareliminar.getInternalname(), "TitleCaption", chkavSeleccionareliminar.getCaption(), !bGXsfl_56_Refreshing);
      chkavSeleccionareliminar.setCheckedValue( "false" );
      GXCCtl = "vHAYPROCESOS_" + sGXsfl_56_idx ;
      chkavHayprocesos.setName( GXCCtl );
      chkavHayprocesos.setWebtags( "" );
      chkavHayprocesos.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavHayprocesos.getInternalname(), "TitleCaption", chkavHayprocesos.getCaption(), !bGXsfl_56_Refreshing);
      chkavHayprocesos.setCheckedValue( "N" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A5551Lb_lineaPq',fld:'LB_LINEAPQ',pic:'ZZZ9'},{av:'AV9Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV11Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV10Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV12Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'sPrefix'},{av:'AV48ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV23EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV44Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV78TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV79TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV82TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV83TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV68TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV69TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV70TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV71TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV84TFLb_TipRec',fld:'vTFLB_TIPREC',pic:'9'},{av:'AV85TFLb_TipRec_To',fld:'vTFLB_TIPREC_TO',pic:'9'},{av:'AV60TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV61TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV62TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV63TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV64TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV65TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV66TFLb_cartazf',fld:'vTFLB_CARTAZF',pic:''},{av:'AV74TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV76TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV92TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV80TFLb_ObsCR',fld:'vTFLB_OBSCR',pic:''},{av:'AV81TFLb_ObsCR_Sel',fld:'vTFLB_OBSCR_SEL',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV52OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV54OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV42Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'AV6Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV5Station',fld:'vSTATION',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV48ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtLb_opcion_Visible',ctrl:'LB_OPCION',prop:'Visible'},{av:'edtLb_ColNom_Visible',ctrl:'LB_COLNOM',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtLb_TipRec_Visible',ctrl:'LB_TIPREC',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_cartazf_Visible',ctrl:'LB_CARTAZF',prop:'Visible'},{av:'edtLb_FechaEn_Visible',ctrl:'LB_FECHAEN',prop:'Visible'},{av:'edtLb_FechaR_Visible',ctrl:'LB_FECHAR',prop:'Visible'},{av:'cmbLb_Estado'},{av:'edtLb_ObsCR_Visible',ctrl:'LB_OBSCR',prop:'Visible'},{av:'chkavSeleccionareliminar.getVisible()',ctrl:'vSELECCIONARELIMINAR',prop:'Visible'},{av:'chkavHayprocesos.getVisible()',ctrl:'vHAYPROCESOS',prop:'Visible'},{av:'AV28GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV29GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV47ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV30GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e141U32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV23EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV44Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV48ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV78TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV79TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV82TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV83TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV68TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV69TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV70TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV71TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV84TFLb_TipRec',fld:'vTFLB_TIPREC',pic:'9'},{av:'AV85TFLb_TipRec_To',fld:'vTFLB_TIPREC_TO',pic:'9'},{av:'AV60TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV61TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV62TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV63TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV64TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV65TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV66TFLb_cartazf',fld:'vTFLB_CARTAZF',pic:''},{av:'AV74TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV76TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV92TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV80TFLb_ObsCR',fld:'vTFLB_OBSCR',pic:''},{av:'AV81TFLb_ObsCR_Sel',fld:'vTFLB_OBSCR_SEL',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV52OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV54OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV42Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'A5551Lb_lineaPq',fld:'LB_LINEAPQ',pic:'ZZZ9'},{av:'AV9Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV11Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV10Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV12Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'AV6Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV5Station',fld:'vSTATION',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e151U32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV23EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV44Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV48ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV78TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV79TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV82TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV83TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV68TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV69TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV70TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV71TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV84TFLb_TipRec',fld:'vTFLB_TIPREC',pic:'9'},{av:'AV85TFLb_TipRec_To',fld:'vTFLB_TIPREC_TO',pic:'9'},{av:'AV60TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV61TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV62TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV63TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV64TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV65TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV66TFLb_cartazf',fld:'vTFLB_CARTAZF',pic:''},{av:'AV74TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV76TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV92TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV80TFLb_ObsCR',fld:'vTFLB_OBSCR',pic:''},{av:'AV81TFLb_ObsCR_Sel',fld:'vTFLB_OBSCR_SEL',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV52OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV54OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV42Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'A5551Lb_lineaPq',fld:'LB_LINEAPQ',pic:'ZZZ9'},{av:'AV9Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV11Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV10Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV12Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'AV6Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV5Station',fld:'vSTATION',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e161U32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV23EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV44Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV48ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV78TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV79TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV82TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV83TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV68TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV69TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV70TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV71TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV84TFLb_TipRec',fld:'vTFLB_TIPREC',pic:'9'},{av:'AV85TFLb_TipRec_To',fld:'vTFLB_TIPREC_TO',pic:'9'},{av:'AV60TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV61TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV62TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV63TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV64TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV65TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV66TFLb_cartazf',fld:'vTFLB_CARTAZF',pic:''},{av:'AV74TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV76TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV92TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV80TFLb_ObsCR',fld:'vTFLB_OBSCR',pic:''},{av:'AV81TFLb_ObsCR_Sel',fld:'vTFLB_OBSCR_SEL',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV52OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV54OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV42Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'A5551Lb_lineaPq',fld:'LB_LINEAPQ',pic:'ZZZ9'},{av:'AV9Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV11Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV10Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV12Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'AV6Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV5Station',fld:'vSTATION',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV52OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV54OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV80TFLb_ObsCR',fld:'vTFLB_OBSCR',pic:''},{av:'AV81TFLb_ObsCR_Sel',fld:'vTFLB_OBSCR_SEL',pic:''},{av:'AV91TFLb_Estado_SelsJson',fld:'vTFLB_ESTADO_SELSJSON',pic:''},{av:'AV92TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV76TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV74TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV66TFLb_cartazf',fld:'vTFLB_CARTAZF',pic:''},{av:'AV64TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV65TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV62TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV63TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV60TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV61TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV84TFLb_TipRec',fld:'vTFLB_TIPREC',pic:'9'},{av:'AV85TFLb_TipRec_To',fld:'vTFLB_TIPREC_TO',pic:'9'},{av:'AV70TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV71TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV68TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV69TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV82TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV83TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV78TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV79TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e251U32',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9',hsh:true},{av:'A5551Lb_lineaPq',fld:'LB_LINEAPQ',pic:'ZZZ9'},{av:'cmbLb_Estado'},{av:'A5566Lb_Estado',fld:'LB_ESTADO',pic:'9',hsh:true},{av:'AV9Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV11Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!',hsh:true},{av:'AV10Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV12Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV32HayProcesos',fld:'vHAYPROCESOS',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'chkavSeleccionareliminar.getVisible()',ctrl:'vSELECCIONARELIMINAR',prop:'Visible'},{av:'AV56Seleccionar',fld:'vSELECCIONAR',pic:''},{av:'AV57SeleccionarEliminar',fld:'vSELECCIONARELIMINAR',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e171U32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV23EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV44Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV48ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV78TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV79TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV82TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV83TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV68TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV69TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV70TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV71TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV84TFLb_TipRec',fld:'vTFLB_TIPREC',pic:'9'},{av:'AV85TFLb_TipRec_To',fld:'vTFLB_TIPREC_TO',pic:'9'},{av:'AV60TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV61TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV62TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV63TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV64TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV65TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV66TFLb_cartazf',fld:'vTFLB_CARTAZF',pic:''},{av:'AV74TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV76TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV92TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV80TFLb_ObsCR',fld:'vTFLB_OBSCR',pic:''},{av:'AV81TFLb_ObsCR_Sel',fld:'vTFLB_OBSCR_SEL',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV52OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV54OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV42Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'A5551Lb_lineaPq',fld:'LB_LINEAPQ',pic:'ZZZ9'},{av:'AV9Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV11Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV10Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV12Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'AV6Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV5Station',fld:'vSTATION',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV48ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtLb_opcion_Visible',ctrl:'LB_OPCION',prop:'Visible'},{av:'edtLb_ColNom_Visible',ctrl:'LB_COLNOM',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtLb_TipRec_Visible',ctrl:'LB_TIPREC',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_cartazf_Visible',ctrl:'LB_CARTAZF',prop:'Visible'},{av:'edtLb_FechaEn_Visible',ctrl:'LB_FECHAEN',prop:'Visible'},{av:'edtLb_FechaR_Visible',ctrl:'LB_FECHAR',prop:'Visible'},{av:'cmbLb_Estado'},{av:'edtLb_ObsCR_Visible',ctrl:'LB_OBSCR',prop:'Visible'},{av:'chkavSeleccionareliminar.getVisible()',ctrl:'vSELECCIONARELIMINAR',prop:'Visible'},{av:'chkavHayprocesos.getVisible()',ctrl:'vHAYPROCESOS',prop:'Visible'},{av:'AV28GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV29GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV47ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV30GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e131U32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV23EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV44Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV48ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV78TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV79TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV82TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV83TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV68TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV69TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV70TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV71TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV84TFLb_TipRec',fld:'vTFLB_TIPREC',pic:'9'},{av:'AV85TFLb_TipRec_To',fld:'vTFLB_TIPREC_TO',pic:'9'},{av:'AV60TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV61TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV62TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV63TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV64TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV65TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV66TFLb_cartazf',fld:'vTFLB_CARTAZF',pic:''},{av:'AV74TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV76TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV92TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV80TFLb_ObsCR',fld:'vTFLB_OBSCR',pic:''},{av:'AV81TFLb_ObsCR_Sel',fld:'vTFLB_OBSCR_SEL',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV52OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV54OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV42Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'A5551Lb_lineaPq',fld:'LB_LINEAPQ',pic:'ZZZ9'},{av:'AV9Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV11Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV10Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV12Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'AV6Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV5Station',fld:'vSTATION',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV30GridState',fld:'vGRIDSTATE',pic:''},{av:'AV91TFLb_Estado_SelsJson',fld:'vTFLB_ESTADO_SELSJSON',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV48ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV30GridState',fld:'vGRIDSTATE',pic:''},{av:'AV52OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV54OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV78TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV79TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV82TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV83TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV68TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV69TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV70TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV71TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV84TFLb_TipRec',fld:'vTFLB_TIPREC',pic:'9'},{av:'AV85TFLb_TipRec_To',fld:'vTFLB_TIPREC_TO',pic:'9'},{av:'AV60TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV61TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV62TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV63TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV64TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV65TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV66TFLb_cartazf',fld:'vTFLB_CARTAZF',pic:''},{av:'AV74TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV76TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV92TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV80TFLb_ObsCR',fld:'vTFLB_OBSCR',pic:''},{av:'AV81TFLb_ObsCR_Sel',fld:'vTFLB_OBSCR_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV91TFLb_Estado_SelsJson',fld:'vTFLB_ESTADO_SELSJSON',pic:''},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtLb_opcion_Visible',ctrl:'LB_OPCION',prop:'Visible'},{av:'edtLb_ColNom_Visible',ctrl:'LB_COLNOM',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtLb_TipRec_Visible',ctrl:'LB_TIPREC',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_cartazf_Visible',ctrl:'LB_CARTAZF',prop:'Visible'},{av:'edtLb_FechaEn_Visible',ctrl:'LB_FECHAEN',prop:'Visible'},{av:'edtLb_FechaR_Visible',ctrl:'LB_FECHAR',prop:'Visible'},{av:'cmbLb_Estado'},{av:'edtLb_ObsCR_Visible',ctrl:'LB_OBSCR',prop:'Visible'},{av:'chkavSeleccionareliminar.getVisible()',ctrl:'vSELECCIONARELIMINAR',prop:'Visible'},{av:'chkavHayprocesos.getVisible()',ctrl:'vHAYPROCESOS',prop:'Visible'},{av:'AV28GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV29GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV47ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOAPROBACION'","{handler:'e111U31',iparms:[{av:'AV9Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV42Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'A5567Lb_FechaEn',fld:'LB_FECHAEN',pic:'',hsh:true},{av:'AV36IN_Lb_numero',fld:'vIN_LB_NUMERO',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOAPROBACION'",",oparms:[{av:'AV36IN_Lb_numero',fld:'vIN_LB_NUMERO',pic:'ZZZZZZZ9'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_APROBACION.CLOSE","{handler:'e181U32',iparms:[{av:'Dvelop_confirmpanel_aprobacion_Result',ctrl:'DVELOP_CONFIRMPANEL_APROBACION',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV23EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV44Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV48ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV78TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV79TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV82TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV83TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV68TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV69TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV70TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV71TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV84TFLb_TipRec',fld:'vTFLB_TIPREC',pic:'9'},{av:'AV85TFLb_TipRec_To',fld:'vTFLB_TIPREC_TO',pic:'9'},{av:'AV60TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV61TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV62TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV63TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV64TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV65TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV66TFLb_cartazf',fld:'vTFLB_CARTAZF',pic:''},{av:'AV74TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV76TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV92TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV80TFLb_ObsCR',fld:'vTFLB_OBSCR',pic:''},{av:'AV81TFLb_ObsCR_Sel',fld:'vTFLB_OBSCR_SEL',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV52OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV54OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV42Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'A5551Lb_lineaPq',fld:'LB_LINEAPQ',pic:'ZZZ9'},{av:'AV9Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV11Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV10Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV12Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'AV6Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV5Station',fld:'vSTATION',pic:'',hsh:true},{av:'sPrefix'},{av:'A5533Lb_ArtCod',fld:'LB_ARTCOD',pic:''},{av:'A5536Lb_ColNom',fld:'LB_COLNOM',pic:''},{av:'A5537Lb_ColNum',fld:'LB_COLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A5597Lb_TipRec',fld:'LB_TIPREC',pic:'9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_APROBACION.CLOSE",",oparms:[{av:'AV36IN_Lb_numero',fld:'vIN_LB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV42Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'A5597Lb_TipRec',fld:'LB_TIPREC',pic:'9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A5537Lb_ColNum',fld:'LB_COLNUM',pic:'ZZZZZ9'},{av:'A5536Lb_ColNom',fld:'LB_COLNOM',pic:''},{av:'A5533Lb_ArtCod',fld:'LB_ARTCOD',pic:''},{av:'AV23EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV44Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV9Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV11Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV48ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtLb_opcion_Visible',ctrl:'LB_OPCION',prop:'Visible'},{av:'edtLb_ColNom_Visible',ctrl:'LB_COLNOM',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtLb_TipRec_Visible',ctrl:'LB_TIPREC',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_cartazf_Visible',ctrl:'LB_CARTAZF',prop:'Visible'},{av:'edtLb_FechaEn_Visible',ctrl:'LB_FECHAEN',prop:'Visible'},{av:'edtLb_FechaR_Visible',ctrl:'LB_FECHAR',prop:'Visible'},{av:'cmbLb_Estado'},{av:'edtLb_ObsCR_Visible',ctrl:'LB_OBSCR',prop:'Visible'},{av:'chkavSeleccionareliminar.getVisible()',ctrl:'vSELECCIONARELIMINAR',prop:'Visible'},{av:'chkavHayprocesos.getVisible()',ctrl:'vHAYPROCESOS',prop:'Visible'},{av:'AV28GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV29GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV47ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV30GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOELIMINARAPROBACION'","{handler:'e121U31',iparms:[{av:'AV10Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''}]");
      setEventMetadata("'DOELIMINARAPROBACION'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARAPROBACION.CLOSE","{handler:'e191U32',iparms:[{av:'Dvelop_confirmpanel_eliminaraprobacion_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARAPROBACION',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV23EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV44Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV48ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV78TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV79TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV82TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV83TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV68TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV69TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV70TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV71TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV84TFLb_TipRec',fld:'vTFLB_TIPREC',pic:'9'},{av:'AV85TFLb_TipRec_To',fld:'vTFLB_TIPREC_TO',pic:'9'},{av:'AV60TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV61TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV62TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV63TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV64TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV65TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV66TFLb_cartazf',fld:'vTFLB_CARTAZF',pic:''},{av:'AV74TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV76TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV92TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV80TFLb_ObsCR',fld:'vTFLB_OBSCR',pic:''},{av:'AV81TFLb_ObsCR_Sel',fld:'vTFLB_OBSCR_SEL',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV52OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV54OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV42Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'A5551Lb_lineaPq',fld:'LB_LINEAPQ',pic:'ZZZ9'},{av:'AV9Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV11Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV10Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV12Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'AV6Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV5Station',fld:'vSTATION',pic:'',hsh:true},{av:'sPrefix'},{av:'A5537Lb_ColNum',fld:'LB_COLNUM',pic:'ZZZZZ9'},{av:'A5597Lb_TipRec',fld:'LB_TIPREC',pic:'9'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9',hsh:true},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARAPROBACION.CLOSE",",oparms:[{av:'AV36IN_Lb_numero',fld:'vIN_LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A5597Lb_TipRec',fld:'LB_TIPREC',pic:'9'},{av:'A5537Lb_ColNum',fld:'LB_COLNUM',pic:'ZZZZZ9'},{av:'AV23EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV10Col_Lb_numeroE',fld:'vCOL_LB_NUMEROE',pic:''},{av:'AV12Col_Lb_opcionE',fld:'vCOL_LB_OPCIONE',pic:''},{av:'AV48ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtLb_opcion_Visible',ctrl:'LB_OPCION',prop:'Visible'},{av:'edtLb_ColNom_Visible',ctrl:'LB_COLNOM',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtLb_TipRec_Visible',ctrl:'LB_TIPREC',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_cartazf_Visible',ctrl:'LB_CARTAZF',prop:'Visible'},{av:'edtLb_FechaEn_Visible',ctrl:'LB_FECHAEN',prop:'Visible'},{av:'edtLb_FechaR_Visible',ctrl:'LB_FECHAR',prop:'Visible'},{av:'cmbLb_Estado'},{av:'edtLb_ObsCR_Visible',ctrl:'LB_OBSCR',prop:'Visible'},{av:'chkavSeleccionareliminar.getVisible()',ctrl:'vSELECCIONARELIMINAR',prop:'Visible'},{av:'chkavHayprocesos.getVisible()',ctrl:'vHAYPROCESOS',prop:'Visible'},{av:'AV28GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV29GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV47ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV30GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOCANCELAR'","{handler:'e201U32',iparms:[]");
      setEventMetadata("'DOCANCELAR'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e211U32',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e221U32',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_LB_NUMERO","{handler:'valid_Lb_numero',iparms:[]");
      setEventMetadata("VALID_LB_NUMERO",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Hayprocesos',iparms:[]");
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
      wcpOAV23EmprCod = "" ;
      wcpOAV42Lb_fechaR = GXutil.nullDate() ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_aprobacion_Result = "" ;
      Dvelop_confirmpanel_eliminaraprobacion_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV23EmprCod = "" ;
      AV42Lb_fechaR = GXutil.nullDate() ;
      AV27FilterFullText = "" ;
      AV13ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV82TFLb_opcion = "" ;
      AV83TFLb_opcion_Sel = "" ;
      AV68TFLb_ColNom = "" ;
      AV69TFLb_ColNom_Sel = "" ;
      AV62TFCliNom = "" ;
      AV63TFCliNom_Sel = "" ;
      AV64TFLb_Cartaz = "" ;
      AV65TFLb_Cartaz_Sel = "" ;
      AV66TFLb_cartazf = GXutil.nullDate() ;
      AV74TFLb_FechaEn = GXutil.nullDate() ;
      AV76TFLb_FechaR = GXutil.nullDate() ;
      AV92TFLb_Estado_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV80TFLb_ObsCR = "" ;
      AV81TFLb_ObsCR_Sel = "" ;
      AV95Pgmname = "" ;
      AV9Col_Lb_numero = new GXSimpleCollection<Integer>(Integer.class, "internal", "");
      AV11Col_Lb_opcion = new GXSimpleCollection<String>(String.class, "internal", "");
      AV10Col_Lb_numeroE = new GXSimpleCollection<Integer>(Integer.class, "internal", "");
      AV12Col_Lb_opcionE = new GXSimpleCollection<String>(String.class, "internal", "");
      AV6Usurcod = "" ;
      AV5Station = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV47ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV22DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      AV30GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV91TFLb_Estado_SelsJson = "" ;
      A5533Lb_ArtCod = "" ;
      Gx_msg = "" ;
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
      bttBtnaprobacion_Jsonclick = "" ;
      bttBtneliminaraprobacion_Jsonclick = "" ;
      bttBtncancelar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV16DDO_Lb_cartazfAuxDate = GXutil.nullDate() ;
      AV18DDO_Lb_FechaEnAuxDate = GXutil.nullDate() ;
      AV20DDO_Lb_FechaRAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A5555Lb_opcion = "" ;
      A5536Lb_ColNom = "" ;
      A279CliNom = "" ;
      A5540Lb_Cartaz = "" ;
      A5594Lb_cartazf = GXutil.nullDate() ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5563Lb_FechaR = GXutil.nullDate() ;
      A10822Lb_ObsCR = "" ;
      AV32HayProcesos = "" ;
      AV117Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      scmdbuf = "" ;
      lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = "" ;
      lV100Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = "" ;
      lV102Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = "" ;
      lV110Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = "" ;
      lV112Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = "" ;
      lV118Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = "" ;
      AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = "" ;
      AV101Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel = "" ;
      AV100Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = "" ;
      AV103Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel = "" ;
      AV102Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = "" ;
      AV111Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel = "" ;
      AV110Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = "" ;
      AV113Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel = "" ;
      AV112Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = "" ;
      AV114Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf = GXutil.nullDate() ;
      AV115Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen = GXutil.nullDate() ;
      AV116Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar = GXutil.nullDate() ;
      AV119Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel = "" ;
      AV118Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = "" ;
      H01U32_A5532Lb_numero = new int[1] ;
      H01U32_A396EmprCod = new String[] {""} ;
      H01U32_A5533Lb_ArtCod = new String[] {""} ;
      H01U32_A831TipColCod = new byte[1] ;
      H01U32_n831TipColCod = new boolean[] {false} ;
      H01U32_A10822Lb_ObsCR = new String[] {""} ;
      H01U32_A5566Lb_Estado = new byte[1] ;
      H01U32_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      H01U32_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      H01U32_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      H01U32_A5540Lb_Cartaz = new String[] {""} ;
      H01U32_A279CliNom = new String[] {""} ;
      H01U32_A252CliCod = new int[1] ;
      H01U32_A5597Lb_TipRec = new byte[1] ;
      H01U32_A5537Lb_ColNum = new int[1] ;
      H01U32_A5536Lb_ColNom = new String[] {""} ;
      H01U32_A5555Lb_opcion = new String[] {""} ;
      H01U33_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV96Emprnom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV89WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV58Session = httpContext.getWebSession();
      AV15ColumnsSelectorXML = "" ;
      H01U34_A396EmprCod = new String[] {""} ;
      H01U34_A5532Lb_numero = new int[1] ;
      H01U34_A5551Lb_lineaPq = new short[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV49ManageFiltersXml = "" ;
      AV25ExcelFilename = "" ;
      AV24ErrorMessage = "" ;
      AV88UserCustomValue = "" ;
      AV14ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV43Lb_HoraR = GXutil.resetTime( GXutil.nullDate() );
      AV45Lb_opcioni = "" ;
      AV51Opcion = "" ;
      AV39Lb_ArtCod = "" ;
      AV40Lb_ColNom = "" ;
      AV37IN_Lb_opcion = "" ;
      GXv_int15 = new byte[1] ;
      GXv_date17 = new java.util.Date[1] ;
      AV26Fec_null = GXutil.nullDate() ;
      AV33Hora_null = GXutil.resetTime( GXutil.nullDate() );
      GXv_int14 = new int[1] ;
      GXv_int12 = new int[1] ;
      GXv_int16 = new byte[1] ;
      AV59Texto_i = "" ;
      AV31GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char22 = "" ;
      GXv_char18 = new String[1] ;
      GXt_char21 = "" ;
      GXv_char13 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char19 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState23 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV86TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV34HTTPRequest = httpContext.getHttpRequest();
      ucDvelop_confirmpanel_eliminaraprobacion = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_aprobacion = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV23EmprCod = "" ;
      sCtrlAV44Lb_Numero = "" ;
      sCtrlAV42Lb_fechaR = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.aprobacioninternaensayo_wc__default(),
         new Object[] {
             new Object[] {
            H01U32_A5532Lb_numero, H01U32_A396EmprCod, H01U32_A5533Lb_ArtCod, H01U32_A831TipColCod, H01U32_n831TipColCod, H01U32_A10822Lb_ObsCR, H01U32_A5566Lb_Estado, H01U32_A5563Lb_FechaR, H01U32_A5567Lb_FechaEn, H01U32_A5594Lb_cartazf,
            H01U32_A5540Lb_Cartaz, H01U32_A279CliNom, H01U32_A252CliCod, H01U32_A5597Lb_TipRec, H01U32_A5537Lb_ColNum, H01U32_A5536Lb_ColNom, H01U32_A5555Lb_opcion
            }
            , new Object[] {
            H01U33_AGRID_nRecordCount
            }
            , new Object[] {
            H01U34_A396EmprCod, H01U34_A5532Lb_numero, H01U34_A5551Lb_lineaPq
            }
         }
      );
      AV95Pgmname = "GestionLaboratorio.AprobacionInternaEnsayo_WC" ;
      /* GeneXus formulas. */
      AV95Pgmname = "GestionLaboratorio.AprobacionInternaEnsayo_WC" ;
      Gx_err = (short)(0) ;
      chkavHayprocesos.setEnabled( 0 );
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV48ManageFiltersExecutionStep ;
   private byte AV84TFLb_TipRec ;
   private byte AV85TFLb_TipRec_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A5597Lb_TipRec ;
   private byte A5566Lb_Estado ;
   private byte A831TipColCod ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV106Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec ;
   private byte AV107Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to ;
   private byte AV46Lb_tipreci ;
   private byte GXv_int15[] ;
   private byte GXv_int16[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV52OrderedBy ;
   private short A5551Lb_lineaPq ;
   private short AV35i ;
   private short AV90t ;
   private short AV50Num_v ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV7Act_op ;
   private int wcpOAV44Lb_Numero ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_56 ;
   private int AV44Lb_Numero ;
   private int nGXsfl_56_idx=1 ;
   private int AV78TFLb_numero ;
   private int AV79TFLb_numero_To ;
   private int AV70TFLb_ColNum ;
   private int AV71TFLb_ColNum_To ;
   private int AV60TFCliCod ;
   private int AV61TFCliCod_To ;
   private int AV36IN_Lb_numero ;
   private int AV123In_lb_numerot ;
   private int Gridpaginationbar_Pagestoshow ;
   private int divUnnamedtable2_Height ;
   private int edtavPgmname_Enabled ;
   private int A5532Lb_numero ;
   private int A5537Lb_ColNum ;
   private int A252CliCod ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV117Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels_size ;
   private int AV98Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero ;
   private int AV99Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to ;
   private int AV104Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum ;
   private int AV105Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to ;
   private int AV108Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod ;
   private int AV109Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to ;
   private int edtLb_numero_Visible ;
   private int edtLb_opcion_Visible ;
   private int edtLb_ColNom_Visible ;
   private int edtLb_ColNum_Visible ;
   private int edtLb_TipRec_Visible ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtLb_Cartaz_Visible ;
   private int edtLb_cartazf_Visible ;
   private int edtLb_FechaEn_Visible ;
   private int edtLb_FechaR_Visible ;
   private int edtLb_ObsCR_Visible ;
   private int AV55PageToGo ;
   private int AV41Lb_colnumi ;
   private int GXv_int14[] ;
   private int GXv_int12[] ;
   private int AV122GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV28GridCurrentPage ;
   private long AV29GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV23EmprCod ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_aprobacion_Result ;
   private String Dvelop_confirmpanel_eliminaraprobacion_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV23EmprCod ;
   private String sGXsfl_56_idx="0001" ;
   private String AV82TFLb_opcion ;
   private String AV83TFLb_opcion_Sel ;
   private String AV68TFLb_ColNom ;
   private String AV69TFLb_ColNom_Sel ;
   private String AV62TFCliNom ;
   private String AV63TFCliNom_Sel ;
   private String AV64TFLb_Cartaz ;
   private String AV65TFLb_Cartaz_Sel ;
   private String AV95Pgmname ;
   private String AV6Usurcod ;
   private String AV5Station ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A5533Lb_ArtCod ;
   private String Gx_msg ;
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
   private String Ddo_grid_Allowmultipleselection ;
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Dvelop_confirmpanel_aprobacion_Title ;
   private String Dvelop_confirmpanel_aprobacion_Confirmationtext ;
   private String Dvelop_confirmpanel_aprobacion_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_aprobacion_Nobuttoncaption ;
   private String Dvelop_confirmpanel_aprobacion_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_aprobacion_Yesbuttonposition ;
   private String Dvelop_confirmpanel_aprobacion_Confirmtype ;
   private String Dvelop_confirmpanel_eliminaraprobacion_Title ;
   private String Dvelop_confirmpanel_eliminaraprobacion_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminaraprobacion_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminaraprobacion_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminaraprobacion_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminaraprobacion_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminaraprobacion_Confirmtype ;
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
   private String divUnnamedtable1_Internalname ;
   private String bttBtnaprobacion_Internalname ;
   private String bttBtnaprobacion_Jsonclick ;
   private String bttBtneliminaraprobacion_Internalname ;
   private String bttBtneliminaraprobacion_Jsonclick ;
   private String bttBtncancelar_Internalname ;
   private String bttBtncancelar_Jsonclick ;
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
   private String divDdo_lb_cartazfauxdates_Internalname ;
   private String edtavDdo_lb_cartazfauxdate_Internalname ;
   private String edtavDdo_lb_cartazfauxdate_Jsonclick ;
   private String divDdo_lb_fechaenauxdates_Internalname ;
   private String edtavDdo_lb_fechaenauxdate_Internalname ;
   private String edtavDdo_lb_fechaenauxdate_Jsonclick ;
   private String divDdo_lb_fecharauxdates_Internalname ;
   private String edtavDdo_lb_fecharauxdate_Internalname ;
   private String edtavDdo_lb_fecharauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtLb_numero_Internalname ;
   private String A5555Lb_opcion ;
   private String edtLb_opcion_Internalname ;
   private String A5536Lb_ColNom ;
   private String edtLb_ColNom_Internalname ;
   private String edtLb_ColNum_Internalname ;
   private String edtLb_TipRec_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A5540Lb_Cartaz ;
   private String edtLb_Cartaz_Internalname ;
   private String edtLb_cartazf_Internalname ;
   private String edtLb_FechaEn_Internalname ;
   private String edtLb_FechaR_Internalname ;
   private String edtLb_ObsCR_Internalname ;
   private String edtTipColCod_Internalname ;
   private String AV32HayProcesos ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV100Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion ;
   private String lV102Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom ;
   private String lV110Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom ;
   private String lV112Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz ;
   private String AV101Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel ;
   private String AV100Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion ;
   private String AV103Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel ;
   private String AV102Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom ;
   private String AV111Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel ;
   private String AV110Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom ;
   private String AV113Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel ;
   private String AV112Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz ;
   private String hsh ;
   private String AV96Emprnom ;
   private String AV45Lb_opcioni ;
   private String AV51Opcion ;
   private String AV39Lb_ArtCod ;
   private String AV40Lb_ColNom ;
   private String AV37IN_Lb_opcion ;
   private String GXt_char22 ;
   private String GXv_char18[] ;
   private String GXt_char21 ;
   private String GXv_char13[] ;
   private String GXt_char20 ;
   private String GXv_char4[] ;
   private String GXt_char19 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTabledvelop_confirmpanel_eliminaraprobacion_Internalname ;
   private String Dvelop_confirmpanel_eliminaraprobacion_Internalname ;
   private String tblTabledvelop_confirmpanel_aprobacion_Internalname ;
   private String Dvelop_confirmpanel_aprobacion_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV23EmprCod ;
   private String sCtrlAV44Lb_Numero ;
   private String sCtrlAV42Lb_fechaR ;
   private String sGXsfl_56_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtLb_numero_Jsonclick ;
   private String edtLb_opcion_Jsonclick ;
   private String edtLb_ColNom_Jsonclick ;
   private String edtLb_ColNum_Jsonclick ;
   private String edtLb_TipRec_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtLb_Cartaz_Jsonclick ;
   private String edtLb_cartazf_Jsonclick ;
   private String edtLb_FechaEn_Jsonclick ;
   private String edtLb_FechaR_Jsonclick ;
   private String edtLb_ObsCR_Jsonclick ;
   private String edtTipColCod_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV43Lb_HoraR ;
   private java.util.Date AV33Hora_null ;
   private java.util.Date wcpOAV42Lb_fechaR ;
   private java.util.Date AV42Lb_fechaR ;
   private java.util.Date AV66TFLb_cartazf ;
   private java.util.Date AV74TFLb_FechaEn ;
   private java.util.Date AV76TFLb_FechaR ;
   private java.util.Date AV16DDO_Lb_cartazfAuxDate ;
   private java.util.Date AV18DDO_Lb_FechaEnAuxDate ;
   private java.util.Date AV20DDO_Lb_FechaRAuxDate ;
   private java.util.Date A5594Lb_cartazf ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date AV114Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf ;
   private java.util.Date AV115Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen ;
   private java.util.Date AV116Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar ;
   private java.util.Date GXv_date17[] ;
   private java.util.Date AV26Fec_null ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV54OrderedDsc ;
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
   private boolean AV56Seleccionar ;
   private boolean AV57SeleccionarEliminar ;
   private boolean n831TipColCod ;
   private boolean bGXsfl_56_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV91TFLb_Estado_SelsJson ;
   private String AV15ColumnsSelectorXML ;
   private String AV49ManageFiltersXml ;
   private String AV88UserCustomValue ;
   private String AV27FilterFullText ;
   private String AV80TFLb_ObsCR ;
   private String AV81TFLb_ObsCR_Sel ;
   private String A10822Lb_ObsCR ;
   private String lV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext ;
   private String lV118Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr ;
   private String AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext ;
   private String AV119Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel ;
   private String AV118Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr ;
   private String AV25ExcelFilename ;
   private String AV24ErrorMessage ;
   private String AV59Texto_i ;
   private GXSimpleCollection<Byte> AV117Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels ;
   private GXSimpleCollection<Byte> AV92TFLb_Estado_Sels ;
   private GXSimpleCollection<Integer> AV9Col_Lb_numero ;
   private GXSimpleCollection<Integer> AV10Col_Lb_numeroE ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV34HTTPRequest ;
   private com.genexus.webpanels.WebSession AV58Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminaraprobacion ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_aprobacion ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavSeleccionar ;
   private HTMLChoice cmbLb_Estado ;
   private ICheckbox chkavSeleccionareliminar ;
   private ICheckbox chkavHayprocesos ;
   private IDataStoreProvider pr_default ;
   private int[] H01U32_A5532Lb_numero ;
   private String[] H01U32_A396EmprCod ;
   private String[] H01U32_A5533Lb_ArtCod ;
   private byte[] H01U32_A831TipColCod ;
   private boolean[] H01U32_n831TipColCod ;
   private String[] H01U32_A10822Lb_ObsCR ;
   private byte[] H01U32_A5566Lb_Estado ;
   private java.util.Date[] H01U32_A5563Lb_FechaR ;
   private java.util.Date[] H01U32_A5567Lb_FechaEn ;
   private java.util.Date[] H01U32_A5594Lb_cartazf ;
   private String[] H01U32_A5540Lb_Cartaz ;
   private String[] H01U32_A279CliNom ;
   private int[] H01U32_A252CliCod ;
   private byte[] H01U32_A5597Lb_TipRec ;
   private int[] H01U32_A5537Lb_ColNum ;
   private String[] H01U32_A5536Lb_ColNom ;
   private String[] H01U32_A5555Lb_opcion ;
   private long[] H01U33_AGRID_nRecordCount ;
   private String[] H01U34_A396EmprCod ;
   private int[] H01U34_A5532Lb_numero ;
   private short[] H01U34_A5551Lb_lineaPq ;
   private GXSimpleCollection<String> AV11Col_Lb_opcion ;
   private GXSimpleCollection<String> AV12Col_Lb_opcionE ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV47ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV13ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV14ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV22DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV30GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState23[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV31GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV86TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV89WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class aprobacioninternaensayo_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01U32( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV117Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels ,
                                          String AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext ,
                                          int AV98Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero ,
                                          int AV99Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to ,
                                          String AV101Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel ,
                                          String AV100Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion ,
                                          String AV103Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel ,
                                          String AV102Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom ,
                                          int AV104Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum ,
                                          int AV105Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to ,
                                          byte AV106Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec ,
                                          byte AV107Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to ,
                                          int AV108Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod ,
                                          int AV109Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to ,
                                          String AV111Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel ,
                                          String AV110Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom ,
                                          String AV113Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel ,
                                          String AV112Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz ,
                                          java.util.Date AV114Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf ,
                                          java.util.Date AV115Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen ,
                                          java.util.Date AV116Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar ,
                                          int AV117Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels_size ,
                                          String AV119Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel ,
                                          String AV118Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr ,
                                          int A5532Lb_numero ,
                                          String A5555Lb_opcion ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A5597Lb_TipRec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A10822Lb_ObsCR ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          short AV52OrderedBy ,
                                          boolean AV54OrderedDsc ,
                                          String AV23EmprCod ,
                                          int AV44Lb_Numero ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int24 = new byte[38];
      Object[] GXv_Object25 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.Lb_numero, T1.EmprCod, T2.Lb_ArtCod, T2.TipColCod, T1.Lb_ObsCR, T1.Lb_Estado, T1.Lb_FechaR, T1.Lb_FechaEn, T2.Lb_cartazf, T2.Lb_Cartaz, T3.CliNom, T2.CliCod," ;
      sSelectString += " T2.Lb_TipRec, T2.Lb_ColNum, T2.Lb_ColNom, T1.Lb_opcion" ;
      sFromString = " FROM ((TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod" ;
      sFromString += " = T2.CliCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.Lb_numero = ?)");
      if ( ! (GXutil.strcmp("", AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_TipRec,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ObsCR) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int24[2] = (byte)(1) ;
         GXv_int24[3] = (byte)(1) ;
         GXv_int24[4] = (byte)(1) ;
         GXv_int24[5] = (byte)(1) ;
         GXv_int24[6] = (byte)(1) ;
         GXv_int24[7] = (byte)(1) ;
         GXv_int24[8] = (byte)(1) ;
         GXv_int24[9] = (byte)(1) ;
         GXv_int24[10] = (byte)(1) ;
         GXv_int24[11] = (byte)(1) ;
      }
      if ( ! (0==AV98Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int24[12] = (byte)(1) ;
      }
      if ( ! (0==AV99Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int24[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV100Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int24[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV102Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int24[17] = (byte)(1) ;
      }
      if ( ! (0==AV104Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int24[18] = (byte)(1) ;
      }
      if ( ! (0==AV105Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int24[19] = (byte)(1) ;
      }
      if ( ! (0==AV106Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec) )
      {
         addWhere(sWhereString, "(T2.Lb_TipRec >= ?)");
      }
      else
      {
         GXv_int24[20] = (byte)(1) ;
      }
      if ( ! (0==AV107Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to) )
      {
         addWhere(sWhereString, "(T2.Lb_TipRec <= ?)");
      }
      else
      {
         GXv_int24[21] = (byte)(1) ;
      }
      if ( ! (0==AV108Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int24[22] = (byte)(1) ;
      }
      if ( ! (0==AV109Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int24[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV110Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int24[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV112Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int24[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV114Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T2.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int24[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV115Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int24[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV116Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int24[30] = (byte)(1) ;
      }
      if ( AV117Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV117Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV119Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel)==0) && ( ! (GXutil.strcmp("", AV118Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ObsCR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ObsCR = ?)");
      }
      else
      {
         GXv_int24[32] = (byte)(1) ;
      }
      if ( ( AV52OrderedBy == 1 ) && ! AV54OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_numero" ;
      }
      else if ( ( AV52OrderedBy == 1 ) && ( AV54OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_numero DESC" ;
      }
      else if ( ( AV52OrderedBy == 2 ) && ! AV54OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_opcion" ;
      }
      else if ( ( AV52OrderedBy == 2 ) && ( AV54OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_opcion DESC" ;
      }
      else if ( ( AV52OrderedBy == 3 ) && ! AV54OrderedDsc )
      {
         sOrderString += " ORDER BY T2.Lb_ColNom" ;
      }
      else if ( ( AV52OrderedBy == 3 ) && ( AV54OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.Lb_ColNom DESC" ;
      }
      else if ( ( AV52OrderedBy == 4 ) && ! AV54OrderedDsc )
      {
         sOrderString += " ORDER BY T2.Lb_ColNum" ;
      }
      else if ( ( AV52OrderedBy == 4 ) && ( AV54OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.Lb_ColNum DESC" ;
      }
      else if ( ( AV52OrderedBy == 5 ) && ! AV54OrderedDsc )
      {
         sOrderString += " ORDER BY T2.Lb_TipRec" ;
      }
      else if ( ( AV52OrderedBy == 5 ) && ( AV54OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.Lb_TipRec DESC" ;
      }
      else if ( ( AV52OrderedBy == 6 ) && ! AV54OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV52OrderedBy == 6 ) && ( AV54OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV52OrderedBy == 7 ) && ! AV54OrderedDsc )
      {
         sOrderString += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV52OrderedBy == 7 ) && ( AV54OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV52OrderedBy == 8 ) && ! AV54OrderedDsc )
      {
         sOrderString += " ORDER BY T2.Lb_Cartaz" ;
      }
      else if ( ( AV52OrderedBy == 8 ) && ( AV54OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.Lb_Cartaz DESC" ;
      }
      else if ( ( AV52OrderedBy == 9 ) && ! AV54OrderedDsc )
      {
         sOrderString += " ORDER BY T2.Lb_cartazf" ;
      }
      else if ( ( AV52OrderedBy == 9 ) && ( AV54OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.Lb_cartazf DESC" ;
      }
      else if ( ( AV52OrderedBy == 10 ) && ! AV54OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_FechaEn" ;
      }
      else if ( ( AV52OrderedBy == 10 ) && ( AV54OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_FechaEn DESC" ;
      }
      else if ( ( AV52OrderedBy == 11 ) && ! AV54OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_FechaR" ;
      }
      else if ( ( AV52OrderedBy == 11 ) && ( AV54OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_FechaR DESC" ;
      }
      else if ( ( AV52OrderedBy == 12 ) && ! AV54OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_Estado" ;
      }
      else if ( ( AV52OrderedBy == 12 ) && ( AV54OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_Estado DESC" ;
      }
      else if ( ( AV52OrderedBy == 13 ) && ! AV54OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_ObsCR" ;
      }
      else if ( ( AV52OrderedBy == 13 ) && ( AV54OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_ObsCR DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object25[0] = scmdbuf ;
      GXv_Object25[1] = GXv_int24 ;
      return GXv_Object25 ;
   }

   protected Object[] conditional_H01U33( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV117Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels ,
                                          String AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext ,
                                          int AV98Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero ,
                                          int AV99Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to ,
                                          String AV101Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel ,
                                          String AV100Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion ,
                                          String AV103Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel ,
                                          String AV102Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom ,
                                          int AV104Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum ,
                                          int AV105Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to ,
                                          byte AV106Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec ,
                                          byte AV107Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to ,
                                          int AV108Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod ,
                                          int AV109Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to ,
                                          String AV111Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel ,
                                          String AV110Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom ,
                                          String AV113Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel ,
                                          String AV112Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz ,
                                          java.util.Date AV114Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf ,
                                          java.util.Date AV115Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen ,
                                          java.util.Date AV116Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar ,
                                          int AV117Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels_size ,
                                          String AV119Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel ,
                                          String AV118Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr ,
                                          int A5532Lb_numero ,
                                          String A5555Lb_opcion ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A5597Lb_TipRec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A10822Lb_ObsCR ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          short AV52OrderedBy ,
                                          boolean AV54OrderedDsc ,
                                          String AV23EmprCod ,
                                          int AV44Lb_Numero ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int27 = new byte[33];
      Object[] GXv_Object28 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.Lb_numero = ?)");
      if ( ! (GXutil.strcmp("", AV97Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_TipRec,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ObsCR) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int27[2] = (byte)(1) ;
         GXv_int27[3] = (byte)(1) ;
         GXv_int27[4] = (byte)(1) ;
         GXv_int27[5] = (byte)(1) ;
         GXv_int27[6] = (byte)(1) ;
         GXv_int27[7] = (byte)(1) ;
         GXv_int27[8] = (byte)(1) ;
         GXv_int27[9] = (byte)(1) ;
         GXv_int27[10] = (byte)(1) ;
         GXv_int27[11] = (byte)(1) ;
      }
      if ( ! (0==AV98Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int27[12] = (byte)(1) ;
      }
      if ( ! (0==AV99Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int27[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV100Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int27[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV102Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int27[17] = (byte)(1) ;
      }
      if ( ! (0==AV104Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int27[18] = (byte)(1) ;
      }
      if ( ! (0==AV105Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int27[19] = (byte)(1) ;
      }
      if ( ! (0==AV106Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec) )
      {
         addWhere(sWhereString, "(T2.Lb_TipRec >= ?)");
      }
      else
      {
         GXv_int27[20] = (byte)(1) ;
      }
      if ( ! (0==AV107Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to) )
      {
         addWhere(sWhereString, "(T2.Lb_TipRec <= ?)");
      }
      else
      {
         GXv_int27[21] = (byte)(1) ;
      }
      if ( ! (0==AV108Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int27[22] = (byte)(1) ;
      }
      if ( ! (0==AV109Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int27[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV110Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int27[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV112Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int27[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV114Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T2.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int27[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV115Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int27[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV116Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int27[30] = (byte)(1) ;
      }
      if ( AV117Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV117Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV119Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel)==0) && ( ! (GXutil.strcmp("", AV118Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ObsCR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ObsCR = ?)");
      }
      else
      {
         GXv_int27[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV52OrderedBy == 1 ) && ! AV54OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV52OrderedBy == 1 ) && ( AV54OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV52OrderedBy == 2 ) && ! AV54OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV52OrderedBy == 2 ) && ( AV54OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV52OrderedBy == 3 ) && ! AV54OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV52OrderedBy == 3 ) && ( AV54OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV52OrderedBy == 4 ) && ! AV54OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV52OrderedBy == 4 ) && ( AV54OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV52OrderedBy == 5 ) && ! AV54OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV52OrderedBy == 5 ) && ( AV54OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV52OrderedBy == 6 ) && ! AV54OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV52OrderedBy == 6 ) && ( AV54OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV52OrderedBy == 7 ) && ! AV54OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV52OrderedBy == 7 ) && ( AV54OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV52OrderedBy == 8 ) && ! AV54OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV52OrderedBy == 8 ) && ( AV54OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV52OrderedBy == 9 ) && ! AV54OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV52OrderedBy == 9 ) && ( AV54OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV52OrderedBy == 10 ) && ! AV54OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV52OrderedBy == 10 ) && ( AV54OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV52OrderedBy == 11 ) && ! AV54OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV52OrderedBy == 11 ) && ( AV54OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV52OrderedBy == 12 ) && ! AV54OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV52OrderedBy == 12 ) && ( AV54OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV52OrderedBy == 13 ) && ! AV54OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV52OrderedBy == 13 ) && ( AV54OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object28[0] = scmdbuf ;
      GXv_Object28[1] = GXv_int27 ;
      return GXv_Object28 ;
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
                  return conditional_H01U32(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , ((Number) dynConstraints[37]).shortValue() , ((Boolean) dynConstraints[38]).booleanValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] );
            case 1 :
                  return conditional_H01U33(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , ((Number) dynConstraints[37]).shortValue() , ((Boolean) dynConstraints[38]).booleanValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01U32", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01U33", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01U34", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_lineaPq FROM TXPENS000 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_lineaPq) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 20);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 13);
               ((String[]) buf[16])[0] = rslt.getString(16, 1);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 1);
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
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 300);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 300);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[62]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 300);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 300);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

