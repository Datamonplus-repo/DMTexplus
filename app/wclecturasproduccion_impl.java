package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wclecturasproduccion_impl extends GXWebComponent
{
   public wclecturasproduccion_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wclecturasproduccion_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wclecturasproduccion_impl.class ));
   }

   public wclecturasproduccion_impl( int remoteHandle ,
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
               AV61Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Emprcod", AV61Emprcod);
               AV62Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62Barcod), 8, 0));
               AV63Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Barcodreo", GXutil.str( AV63Barcodreo, 1, 0));
               AV64BarCodpar = httpContext.GetPar( "BarCodpar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64BarCodpar", AV64BarCodpar);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV61Emprcod,Integer.valueOf(AV62Barcod),Byte.valueOf(AV63Barcodreo),AV64BarCodpar});
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
      A561HisProLin = (int)(GXutil.lval( httpContext.GetPar( "HisProLin"))) ;
      A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
      A461Fase = httpContext.GetPar( "Fase") ;
      A7258FaseDsc = httpContext.GetPar( "FaseDsc") ;
      A566HisProTur = (byte)(GXutil.lval( httpContext.GetPar( "HisProTur"))) ;
      A557HisProF = httpContext.GetPar( "HisProF") ;
      A1525HisProKgr = CommonUtil.decimalVal( httpContext.GetPar( "HisProKgr"), ".") ;
      A1526HisProMtr = CommonUtil.decimalVal( httpContext.GetPar( "HisProMtr"), ".") ;
      A4714HisProNpzs = (short)(GXutil.lval( httpContext.GetPar( "HisProNpzs"))) ;
      A503GruOpeCod = (int)(GXutil.lval( httpContext.GetPar( "GruOpeCod"))) ;
      A656ParCod = (short)(GXutil.lval( httpContext.GetPar( "ParCod"))) ;
      A867ParCodNom = httpContext.GetPar( "ParCodNom") ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV61Emprcod = httpContext.GetPar( "Emprcod") ;
      AV38ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV33ColumnsSelector);
      AV62Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
      AV63Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
      AV64BarCodpar = httpContext.GetPar( "BarCodpar") ;
      AV106FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV40TFMaqCod = httpContext.GetPar( "TFMaqCod") ;
      AV41TFMaqCod_Sel = httpContext.GetPar( "TFMaqCod_Sel") ;
      AV43TFHisProFec = localUtil.parseDateParm( httpContext.GetPar( "TFHisProFec")) ;
      AV48TFHisProLin = (int)(GXutil.lval( httpContext.GetPar( "TFHisProLin"))) ;
      AV49TFHisProLin_To = (int)(GXutil.lval( httpContext.GetPar( "TFHisProLin_To"))) ;
      AV51TFBarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin"))) ;
      AV52TFBarOrdLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin_To"))) ;
      AV54TFFase = httpContext.GetPar( "TFFase") ;
      AV55TFFase_Sel = httpContext.GetPar( "TFFase_Sel") ;
      AV70TFFaseDsc = httpContext.GetPar( "TFFaseDsc") ;
      AV71TFFaseDsc_Sel = httpContext.GetPar( "TFFaseDsc_Sel") ;
      AV92TFHisProTur = (byte)(GXutil.lval( httpContext.GetPar( "TFHisProTur"))) ;
      AV93TFHisProTur_To = (byte)(GXutil.lval( httpContext.GetPar( "TFHisProTur_To"))) ;
      AV95TFHisProF = httpContext.GetPar( "TFHisProF") ;
      AV96TFHisProF_Sel = httpContext.GetPar( "TFHisProF_Sel") ;
      AV73TFHisProDTI = localUtil.parseDTimeParm( httpContext.GetPar( "TFHisProDTI")) ;
      AV78TFHisProDTF = localUtil.parseDTimeParm( httpContext.GetPar( "TFHisProDTF")) ;
      AV98TFHisProKgr = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProKgr"), ".") ;
      AV99TFHisProKgr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProKgr_To"), ".") ;
      AV101TFHisProMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProMtr"), ".") ;
      AV102TFHisProMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProMtr_To"), ".") ;
      AV104TFHisProNpzs = (short)(GXutil.lval( httpContext.GetPar( "TFHisProNpzs"))) ;
      AV105TFHisProNpzs_To = (short)(GXutil.lval( httpContext.GetPar( "TFHisProNpzs_To"))) ;
      AV83TFGruOpeCod = (int)(GXutil.lval( httpContext.GetPar( "TFGruOpeCod"))) ;
      AV84TFGruOpeCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFGruOpeCod_To"))) ;
      AV86TFParCod = (short)(GXutil.lval( httpContext.GetPar( "TFParCod"))) ;
      AV87TFParCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFParCod_To"))) ;
      AV89TFParCodNom = httpContext.GetPar( "TFParCodNom") ;
      AV90TFParCodNom_Sel = httpContext.GetPar( "TFParCodNom_Sel") ;
      AV147Pgmname = httpContext.GetPar( "Pgmname") ;
      AV13OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV14OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV113Wclecturasproduccionds_1_emprcod = httpContext.GetPar( "Wclecturasproduccionds_1_emprcod") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, A561HisProLin, A194BarOrdLin, A461Fase, A7258FaseDsc, A566HisProTur, A557HisProF, A1525HisProKgr, A1526HisProMtr, A4714HisProNpzs, A503GruOpeCod, A656ParCod, A867ParCodNom, A130BarCodPar, A132BarCodReo, A129BarCod, AV61Emprcod, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV62Barcod, AV63Barcodreo, AV64BarCodpar, AV106FilterFullText, AV40TFMaqCod, AV41TFMaqCod_Sel, AV43TFHisProFec, AV48TFHisProLin, AV49TFHisProLin_To, AV51TFBarOrdLin, AV52TFBarOrdLin_To, AV54TFFase, AV55TFFase_Sel, AV70TFFaseDsc, AV71TFFaseDsc_Sel, AV92TFHisProTur, AV93TFHisProTur_To, AV95TFHisProF, AV96TFHisProF_Sel, AV73TFHisProDTI, AV78TFHisProDTF, AV98TFHisProKgr, AV99TFHisProKgr_To, AV101TFHisProMtr, AV102TFHisProMtr_To, AV104TFHisProNpzs, AV105TFHisProNpzs_To, AV83TFGruOpeCod, AV84TFGruOpeCod_To, AV86TFParCod, AV87TFParCod_To, AV89TFParCodNom, AV90TFParCodNom_Sel, AV147Pgmname, AV13OrderedBy, AV14OrderedDsc, AV113Wclecturasproduccionds_1_emprcod, A396EmprCod, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paIV2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " PARTES PRODUCCION", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wclecturasproduccion", new String[] {GXutil.URLEncode(GXutil.rtrim(AV61Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV62Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV63Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV64BarCodpar))}, new String[] {"Emprcod","Barcod","Barcodreo","BarCodpar"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV147Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCLecturasProduccion");
      forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wclecturasproduccion:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_41", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_41, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV36ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV36ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV59GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV60GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV57DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV57DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV33ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV33ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV61Emprcod", GXutil.rtrim( wcpOAV61Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV62Barcod", GXutil.ltrim( localUtil.ntoc( wcpOAV62Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV63Barcodreo", GXutil.ltrim( localUtil.ntoc( wcpOAV63Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV64BarCodpar", GXutil.rtrim( wcpOAV64BarCodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV38ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV61Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD", GXutil.ltrim( localUtil.ntoc( AV62Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV63Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR", GXutil.rtrim( AV64BarCodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCOD", GXutil.rtrim( AV40TFMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCOD_SEL", GXutil.rtrim( AV41TFMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROFEC", localUtil.dtoc( AV43TFHisProFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROLIN", GXutil.ltrim( localUtil.ntoc( AV48TFHisProLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROLIN_TO", GXutil.ltrim( localUtil.ntoc( AV49TFHisProLin_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV51TFBarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARORDLIN_TO", GXutil.ltrim( localUtil.ntoc( AV52TFBarOrdLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASE", GXutil.rtrim( AV54TFFase));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASE_SEL", GXutil.rtrim( AV55TFFase_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASEDSC", GXutil.rtrim( AV70TFFaseDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASEDSC_SEL", GXutil.rtrim( AV71TFFaseDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROTUR", GXutil.ltrim( localUtil.ntoc( AV92TFHisProTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROTUR_TO", GXutil.ltrim( localUtil.ntoc( AV93TFHisProTur_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROF", GXutil.rtrim( AV95TFHisProF));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROF_SEL", GXutil.rtrim( AV96TFHisProF_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPRODTI", localUtil.ttoc( AV73TFHisProDTI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPRODTF", localUtil.ttoc( AV78TFHisProDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROKGR", GXutil.ltrim( localUtil.ntoc( AV98TFHisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROKGR_TO", GXutil.ltrim( localUtil.ntoc( AV99TFHisProKgr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROMTR", GXutil.ltrim( localUtil.ntoc( AV101TFHisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROMTR_TO", GXutil.ltrim( localUtil.ntoc( AV102TFHisProMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPRONPZS", GXutil.ltrim( localUtil.ntoc( AV104TFHisProNpzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPRONPZS_TO", GXutil.ltrim( localUtil.ntoc( AV105TFHisProNpzs_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFGRUOPECOD", GXutil.ltrim( localUtil.ntoc( AV83TFGruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFGRUOPECOD_TO", GXutil.ltrim( localUtil.ntoc( AV84TFGruOpeCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPARCOD", GXutil.ltrim( localUtil.ntoc( AV86TFParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPARCOD_TO", GXutil.ltrim( localUtil.ntoc( AV87TFParCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPARCODNOM", GXutil.rtrim( AV89TFParCodNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPARCODNOM_SEL", GXutil.rtrim( AV90TFParCodNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV147Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV147Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV13OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV14OrderedDsc);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vWCLECTURASPRODUCCIONDS_1_EMPRCOD", GXutil.rtrim( AV113Wclecturasproduccionds_1_emprcod));
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

   public void renderHtmlCloseFormIV2( )
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
      return "WCLecturasProduccion" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " PARTES PRODUCCION", "") ;
   }

   public void wbIV0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wclecturasproduccion");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCLecturasProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCLecturasProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCLecturasProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_IV2( true) ;
      }
      else
      {
         wb_table1_23_IV2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_IV2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV59GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV60GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV57DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCLecturasProduccion.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCod_Visible, 0, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCLecturasProduccion.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCodReo_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCLecturasProduccion.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCodPar_Visible, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCLecturasProduccion.htm");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV57DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV33ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_hisprofecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_hisprofecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_hisprofecauxdate_Internalname, localUtil.format(AV45DDO_HisProFecAuxDate, "99/99/99"), localUtil.format( AV45DDO_HisProFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,73);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_hisprofecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCLecturasProduccion.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_hisprofecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCLecturasProduccion.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_hisprodtiauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_hisprodtiauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_hisprodtiauxdate_Internalname, localUtil.format(AV75DDO_HisProDTIAuxDate, "99/99/99"), localUtil.format( AV75DDO_HisProDTIAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,75);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_hisprodtiauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCLecturasProduccion.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_hisprodtiauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCLecturasProduccion.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_hisprodtfauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_hisprodtfauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_hisprodtfauxdate_Internalname, localUtil.format(AV80DDO_HisProDTFAuxDate, "99/99/99"), localUtil.format( AV80DDO_HisProDTFAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,77);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_hisprodtfauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCLecturasProduccion.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_hisprodtfauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCLecturasProduccion.htm");
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

   public void startIV2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " PARTES PRODUCCION", ""), (short)(0)) ;
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
            strupIV0( ) ;
         }
      }
   }

   public void wsIV2( )
   {
      startIV2( ) ;
      evtIV2( ) ;
   }

   public void evtIV2( )
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
                              strupIV0( ) ;
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
                              strupIV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e11IV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupIV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e12IV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupIV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e13IV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupIV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e14IV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupIV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e15IV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupIV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e16IV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupIV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e17IV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupIV0( ) ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupIV0( ) ;
                           }
                           nGXsfl_41_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_412( ) ;
                           A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
                           A558HisProFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtHisProFec_Internalname), 0)) ;
                           A561HisProLin = (int)(localUtil.ctol( httpContext.cgiGet( edtHisProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A461Fase = httpContext.cgiGet( edtFase_Internalname) ;
                           A7258FaseDsc = httpContext.cgiGet( edtFaseDsc_Internalname) ;
                           A566HisProTur = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProTur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A557HisProF = GXutil.upper( httpContext.cgiGet( edtHisProF_Internalname)) ;
                           A4440HisProDTI = localUtil.ctot( httpContext.cgiGet( edtHisProDTI_Internalname), 0) ;
                           A4441HisProDTF = localUtil.ctot( httpContext.cgiGet( edtHisProDTF_Internalname), 0) ;
                           A1525HisProKgr = localUtil.ctond( httpContext.cgiGet( edtHisProKgr_Internalname)) ;
                           A1526HisProMtr = localUtil.ctond( httpContext.cgiGet( edtHisProMtr_Internalname)) ;
                           A4714HisProNpzs = (short)(localUtil.ctol( httpContext.cgiGet( edtHisProNpzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A503GruOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtGruOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV68OpeNom = httpContext.cgiGet( edtavOpenom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOpenom_Internalname, AV68OpeNom);
                           A656ParCod = (short)(localUtil.ctol( httpContext.cgiGet( edtParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A867ParCodNom = httpContext.cgiGet( edtParCodNom_Internalname) ;
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
                                       e18IV2 ();
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
                                       e19IV2 ();
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
                                       e20IV2 ();
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
                                    strupIV0( ) ;
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

   public void weIV2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormIV2( ) ;
         }
      }
   }

   public void paIV2( )
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
                                 int A561HisProLin ,
                                 short A194BarOrdLin ,
                                 String A461Fase ,
                                 String A7258FaseDsc ,
                                 byte A566HisProTur ,
                                 String A557HisProF ,
                                 java.math.BigDecimal A1525HisProKgr ,
                                 java.math.BigDecimal A1526HisProMtr ,
                                 short A4714HisProNpzs ,
                                 int A503GruOpeCod ,
                                 short A656ParCod ,
                                 String A867ParCodNom ,
                                 String A130BarCodPar ,
                                 byte A132BarCodReo ,
                                 int A129BarCod ,
                                 String AV61Emprcod ,
                                 byte AV38ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV33ColumnsSelector ,
                                 int AV62Barcod ,
                                 byte AV63Barcodreo ,
                                 String AV64BarCodpar ,
                                 String AV106FilterFullText ,
                                 String AV40TFMaqCod ,
                                 String AV41TFMaqCod_Sel ,
                                 java.util.Date AV43TFHisProFec ,
                                 int AV48TFHisProLin ,
                                 int AV49TFHisProLin_To ,
                                 short AV51TFBarOrdLin ,
                                 short AV52TFBarOrdLin_To ,
                                 String AV54TFFase ,
                                 String AV55TFFase_Sel ,
                                 String AV70TFFaseDsc ,
                                 String AV71TFFaseDsc_Sel ,
                                 byte AV92TFHisProTur ,
                                 byte AV93TFHisProTur_To ,
                                 String AV95TFHisProF ,
                                 String AV96TFHisProF_Sel ,
                                 java.util.Date AV73TFHisProDTI ,
                                 java.util.Date AV78TFHisProDTF ,
                                 java.math.BigDecimal AV98TFHisProKgr ,
                                 java.math.BigDecimal AV99TFHisProKgr_To ,
                                 java.math.BigDecimal AV101TFHisProMtr ,
                                 java.math.BigDecimal AV102TFHisProMtr_To ,
                                 short AV104TFHisProNpzs ,
                                 short AV105TFHisProNpzs_To ,
                                 int AV83TFGruOpeCod ,
                                 int AV84TFGruOpeCod_To ,
                                 short AV86TFParCod ,
                                 short AV87TFParCod_To ,
                                 String AV89TFParCodNom ,
                                 String AV90TFParCodNom_Sel ,
                                 String AV147Pgmname ,
                                 short AV13OrderedBy ,
                                 boolean AV14OrderedDsc ,
                                 String AV113Wclecturasproduccionds_1_emprcod ,
                                 String A396EmprCod ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e19IV2 ();
      GRID_nCurrentRecord = 0 ;
      rfIV2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCLecturasProduccion");
      forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wclecturasproduccion:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rfIV2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV147Pgmname = "WCLecturasProduccion" ;
      Gx_err = (short)(0) ;
      edtavOpenom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOpenom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpenom_Enabled), 5, 0), !bGXsfl_41_Refreshing);
   }

   public void rfIV2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e19IV2 ();
      nGXsfl_41_idx = 1 ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_412( ) ;
      bGXsfl_41_Refreshing = true ;
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
         subsflControlProps_412( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV119Wclecturasproduccionds_7_tfmaqcod_sel ,
                                              AV118Wclecturasproduccionds_6_tfmaqcod ,
                                              AV120Wclecturasproduccionds_8_tfhisprofec ,
                                              Integer.valueOf(AV121Wclecturasproduccionds_9_tfhisprolin) ,
                                              Integer.valueOf(AV122Wclecturasproduccionds_10_tfhisprolin_to) ,
                                              Short.valueOf(AV123Wclecturasproduccionds_11_tfbarordlin) ,
                                              Short.valueOf(AV124Wclecturasproduccionds_12_tfbarordlin_to) ,
                                              AV126Wclecturasproduccionds_14_tffase_sel ,
                                              AV125Wclecturasproduccionds_13_tffase ,
                                              Byte.valueOf(AV129Wclecturasproduccionds_17_tfhisprotur) ,
                                              Byte.valueOf(AV130Wclecturasproduccionds_18_tfhisprotur_to) ,
                                              AV132Wclecturasproduccionds_20_tfhisprof_sel ,
                                              AV131Wclecturasproduccionds_19_tfhisprof ,
                                              AV133Wclecturasproduccionds_21_tfhisprodti ,
                                              AV134Wclecturasproduccionds_22_tfhisprodtf ,
                                              AV135Wclecturasproduccionds_23_tfhisprokgr ,
                                              AV136Wclecturasproduccionds_24_tfhisprokgr_to ,
                                              AV137Wclecturasproduccionds_25_tfhispromtr ,
                                              AV138Wclecturasproduccionds_26_tfhispromtr_to ,
                                              Short.valueOf(AV139Wclecturasproduccionds_27_tfhispronpzs) ,
                                              Short.valueOf(AV140Wclecturasproduccionds_28_tfhispronpzs_to) ,
                                              Integer.valueOf(AV141Wclecturasproduccionds_29_tfgruopecod) ,
                                              Integer.valueOf(AV142Wclecturasproduccionds_30_tfgruopecod_to) ,
                                              Short.valueOf(AV143Wclecturasproduccionds_31_tfparcod) ,
                                              Short.valueOf(AV144Wclecturasproduccionds_32_tfparcod_to) ,
                                              AV146Wclecturasproduccionds_34_tfparcodnom_sel ,
                                              AV145Wclecturasproduccionds_33_tfparcodnom ,
                                              A602MaqCod ,
                                              A558HisProFec ,
                                              Integer.valueOf(A561HisProLin) ,
                                              Short.valueOf(A194BarOrdLin) ,
                                              A461Fase ,
                                              Byte.valueOf(A566HisProTur) ,
                                              A557HisProF ,
                                              A4440HisProDTI ,
                                              A4441HisProDTF ,
                                              A1525HisProKgr ,
                                              A1526HisProMtr ,
                                              Short.valueOf(A4714HisProNpzs) ,
                                              Integer.valueOf(A503GruOpeCod) ,
                                              Short.valueOf(A656ParCod) ,
                                              A867ParCodNom ,
                                              Short.valueOf(AV13OrderedBy) ,
                                              Boolean.valueOf(AV14OrderedDsc) ,
                                              AV117Wclecturasproduccionds_5_filterfulltext ,
                                              A7258FaseDsc ,
                                              AV128Wclecturasproduccionds_16_tffasedsc_sel ,
                                              AV127Wclecturasproduccionds_15_tffasedsc ,
                                              Integer.valueOf(A129BarCod) ,
                                              Integer.valueOf(AV114Wclecturasproduccionds_2_barcod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              Byte.valueOf(AV115Wclecturasproduccionds_3_barcodreo) ,
                                              A130BarCodPar ,
                                              AV116Wclecturasproduccionds_4_barcodpar ,
                                              A396EmprCod ,
                                              AV61Emprcod ,
                                              AV113Wclecturasproduccionds_1_emprcod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                              TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT,
                                              TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.INT,
                                              TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV117Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV117Wclecturasproduccionds_5_filterfulltext), "%", "") ;
         lV117Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV117Wclecturasproduccionds_5_filterfulltext), "%", "") ;
         lV117Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV117Wclecturasproduccionds_5_filterfulltext), "%", "") ;
         lV117Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV117Wclecturasproduccionds_5_filterfulltext), "%", "") ;
         lV117Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV117Wclecturasproduccionds_5_filterfulltext), "%", "") ;
         lV117Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV117Wclecturasproduccionds_5_filterfulltext), "%", "") ;
         lV117Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV117Wclecturasproduccionds_5_filterfulltext), "%", "") ;
         lV117Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV117Wclecturasproduccionds_5_filterfulltext), "%", "") ;
         lV117Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV117Wclecturasproduccionds_5_filterfulltext), "%", "") ;
         lV117Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV117Wclecturasproduccionds_5_filterfulltext), "%", "") ;
         lV117Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV117Wclecturasproduccionds_5_filterfulltext), "%", "") ;
         lV117Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV117Wclecturasproduccionds_5_filterfulltext), "%", "") ;
         lV117Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV117Wclecturasproduccionds_5_filterfulltext), "%", "") ;
         lV127Wclecturasproduccionds_15_tffasedsc = GXutil.padr( GXutil.rtrim( AV127Wclecturasproduccionds_15_tffasedsc), 28, "%") ;
         lV118Wclecturasproduccionds_6_tfmaqcod = GXutil.padr( GXutil.rtrim( AV118Wclecturasproduccionds_6_tfmaqcod), 6, "%") ;
         /* Using cursor H00IV2 */
         pr_default.execute(0, new Object[] {AV113Wclecturasproduccionds_1_emprcod, AV117Wclecturasproduccionds_5_filterfulltext, lV117Wclecturasproduccionds_5_filterfulltext, Integer.valueOf(A561HisProLin), lV117Wclecturasproduccionds_5_filterfulltext, Short.valueOf(A194BarOrdLin), lV117Wclecturasproduccionds_5_filterfulltext, A461Fase, lV117Wclecturasproduccionds_5_filterfulltext, A7258FaseDsc, lV117Wclecturasproduccionds_5_filterfulltext, Byte.valueOf(A566HisProTur), lV117Wclecturasproduccionds_5_filterfulltext, A557HisProF, lV117Wclecturasproduccionds_5_filterfulltext, A1525HisProKgr, lV117Wclecturasproduccionds_5_filterfulltext, A1526HisProMtr, lV117Wclecturasproduccionds_5_filterfulltext, Short.valueOf(A4714HisProNpzs), lV117Wclecturasproduccionds_5_filterfulltext, Integer.valueOf(A503GruOpeCod), lV117Wclecturasproduccionds_5_filterfulltext, Short.valueOf(A656ParCod), lV117Wclecturasproduccionds_5_filterfulltext, A867ParCodNom, lV117Wclecturasproduccionds_5_filterfulltext, AV128Wclecturasproduccionds_16_tffasedsc_sel, AV127Wclecturasproduccionds_15_tffasedsc, A7258FaseDsc, lV127Wclecturasproduccionds_15_tffasedsc, AV128Wclecturasproduccionds_16_tffasedsc_sel, A7258FaseDsc, AV128Wclecturasproduccionds_16_tffasedsc_sel, Integer.valueOf(A129BarCod), Integer.valueOf(AV114Wclecturasproduccionds_2_barcod), Byte.valueOf(A132BarCodReo), Byte.valueOf(AV115Wclecturasproduccionds_3_barcodreo), A130BarCodPar, AV116Wclecturasproduccionds_4_barcodpar, AV61Emprcod, lV118Wclecturasproduccionds_6_tfmaqcod, AV119Wclecturasproduccionds_7_tfmaqcod_sel, AV120Wclecturasproduccionds_8_tfhisprofec, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_41_idx = 1 ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A558HisProFec = H00IV2_A558HisProFec[0] ;
            A602MaqCod = H00IV2_A602MaqCod[0] ;
            A396EmprCod = H00IV2_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            e20IV2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(41) ;
         wbIV0( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesIV2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV147Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV147Pgmname, ""))));
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
      AV113Wclecturasproduccionds_1_emprcod = AV61Emprcod ;
      AV114Wclecturasproduccionds_2_barcod = AV62Barcod ;
      AV115Wclecturasproduccionds_3_barcodreo = AV63Barcodreo ;
      AV116Wclecturasproduccionds_4_barcodpar = AV64BarCodpar ;
      AV117Wclecturasproduccionds_5_filterfulltext = AV106FilterFullText ;
      AV118Wclecturasproduccionds_6_tfmaqcod = AV40TFMaqCod ;
      AV119Wclecturasproduccionds_7_tfmaqcod_sel = AV41TFMaqCod_Sel ;
      AV120Wclecturasproduccionds_8_tfhisprofec = AV43TFHisProFec ;
      AV121Wclecturasproduccionds_9_tfhisprolin = AV48TFHisProLin ;
      AV122Wclecturasproduccionds_10_tfhisprolin_to = AV49TFHisProLin_To ;
      AV123Wclecturasproduccionds_11_tfbarordlin = AV51TFBarOrdLin ;
      AV124Wclecturasproduccionds_12_tfbarordlin_to = AV52TFBarOrdLin_To ;
      AV125Wclecturasproduccionds_13_tffase = AV54TFFase ;
      AV126Wclecturasproduccionds_14_tffase_sel = AV55TFFase_Sel ;
      AV127Wclecturasproduccionds_15_tffasedsc = AV70TFFaseDsc ;
      AV128Wclecturasproduccionds_16_tffasedsc_sel = AV71TFFaseDsc_Sel ;
      AV129Wclecturasproduccionds_17_tfhisprotur = AV92TFHisProTur ;
      AV130Wclecturasproduccionds_18_tfhisprotur_to = AV93TFHisProTur_To ;
      AV131Wclecturasproduccionds_19_tfhisprof = AV95TFHisProF ;
      AV132Wclecturasproduccionds_20_tfhisprof_sel = AV96TFHisProF_Sel ;
      AV133Wclecturasproduccionds_21_tfhisprodti = AV73TFHisProDTI ;
      AV134Wclecturasproduccionds_22_tfhisprodtf = AV78TFHisProDTF ;
      AV135Wclecturasproduccionds_23_tfhisprokgr = AV98TFHisProKgr ;
      AV136Wclecturasproduccionds_24_tfhisprokgr_to = AV99TFHisProKgr_To ;
      AV137Wclecturasproduccionds_25_tfhispromtr = AV101TFHisProMtr ;
      AV138Wclecturasproduccionds_26_tfhispromtr_to = AV102TFHisProMtr_To ;
      AV139Wclecturasproduccionds_27_tfhispronpzs = AV104TFHisProNpzs ;
      AV140Wclecturasproduccionds_28_tfhispronpzs_to = AV105TFHisProNpzs_To ;
      AV141Wclecturasproduccionds_29_tfgruopecod = AV83TFGruOpeCod ;
      AV142Wclecturasproduccionds_30_tfgruopecod_to = AV84TFGruOpeCod_To ;
      AV143Wclecturasproduccionds_31_tfparcod = AV86TFParCod ;
      AV144Wclecturasproduccionds_32_tfparcod_to = AV87TFParCod_To ;
      AV145Wclecturasproduccionds_33_tfparcodnom = AV89TFParCodNom ;
      AV146Wclecturasproduccionds_34_tfparcodnom_sel = AV90TFParCodNom_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV119Wclecturasproduccionds_7_tfmaqcod_sel ,
                                           AV118Wclecturasproduccionds_6_tfmaqcod ,
                                           AV120Wclecturasproduccionds_8_tfhisprofec ,
                                           Integer.valueOf(AV121Wclecturasproduccionds_9_tfhisprolin) ,
                                           Integer.valueOf(AV122Wclecturasproduccionds_10_tfhisprolin_to) ,
                                           Short.valueOf(AV123Wclecturasproduccionds_11_tfbarordlin) ,
                                           Short.valueOf(AV124Wclecturasproduccionds_12_tfbarordlin_to) ,
                                           AV126Wclecturasproduccionds_14_tffase_sel ,
                                           AV125Wclecturasproduccionds_13_tffase ,
                                           Byte.valueOf(AV129Wclecturasproduccionds_17_tfhisprotur) ,
                                           Byte.valueOf(AV130Wclecturasproduccionds_18_tfhisprotur_to) ,
                                           AV132Wclecturasproduccionds_20_tfhisprof_sel ,
                                           AV131Wclecturasproduccionds_19_tfhisprof ,
                                           AV133Wclecturasproduccionds_21_tfhisprodti ,
                                           AV134Wclecturasproduccionds_22_tfhisprodtf ,
                                           AV135Wclecturasproduccionds_23_tfhisprokgr ,
                                           AV136Wclecturasproduccionds_24_tfhisprokgr_to ,
                                           AV137Wclecturasproduccionds_25_tfhispromtr ,
                                           AV138Wclecturasproduccionds_26_tfhispromtr_to ,
                                           Short.valueOf(AV139Wclecturasproduccionds_27_tfhispronpzs) ,
                                           Short.valueOf(AV140Wclecturasproduccionds_28_tfhispronpzs_to) ,
                                           Integer.valueOf(AV141Wclecturasproduccionds_29_tfgruopecod) ,
                                           Integer.valueOf(AV142Wclecturasproduccionds_30_tfgruopecod_to) ,
                                           Short.valueOf(AV143Wclecturasproduccionds_31_tfparcod) ,
                                           Short.valueOf(AV144Wclecturasproduccionds_32_tfparcod_to) ,
                                           AV146Wclecturasproduccionds_34_tfparcodnom_sel ,
                                           AV145Wclecturasproduccionds_33_tfparcodnom ,
                                           A602MaqCod ,
                                           A558HisProFec ,
                                           Integer.valueOf(A561HisProLin) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A557HisProF ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A4714HisProNpzs) ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) ,
                                           AV117Wclecturasproduccionds_5_filterfulltext ,
                                           A7258FaseDsc ,
                                           AV128Wclecturasproduccionds_16_tffasedsc_sel ,
                                           AV127Wclecturasproduccionds_15_tffasedsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV114Wclecturasproduccionds_2_barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV115Wclecturasproduccionds_3_barcodreo) ,
                                           A130BarCodPar ,
                                           AV116Wclecturasproduccionds_4_barcodpar ,
                                           A396EmprCod ,
                                           AV61Emprcod ,
                                           AV113Wclecturasproduccionds_1_emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV117Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV117Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV117Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV117Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV117Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV117Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV117Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV117Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV117Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV117Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV117Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV117Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV117Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV117Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV117Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV117Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV117Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV117Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV117Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV117Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV117Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV117Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV117Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV117Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV117Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV117Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV127Wclecturasproduccionds_15_tffasedsc = GXutil.padr( GXutil.rtrim( AV127Wclecturasproduccionds_15_tffasedsc), 28, "%") ;
      lV118Wclecturasproduccionds_6_tfmaqcod = GXutil.padr( GXutil.rtrim( AV118Wclecturasproduccionds_6_tfmaqcod), 6, "%") ;
      /* Using cursor H00IV3 */
      pr_default.execute(1, new Object[] {AV113Wclecturasproduccionds_1_emprcod, AV117Wclecturasproduccionds_5_filterfulltext, lV117Wclecturasproduccionds_5_filterfulltext, Integer.valueOf(A561HisProLin), lV117Wclecturasproduccionds_5_filterfulltext, Short.valueOf(A194BarOrdLin), lV117Wclecturasproduccionds_5_filterfulltext, A461Fase, lV117Wclecturasproduccionds_5_filterfulltext, A7258FaseDsc, lV117Wclecturasproduccionds_5_filterfulltext, Byte.valueOf(A566HisProTur), lV117Wclecturasproduccionds_5_filterfulltext, A557HisProF, lV117Wclecturasproduccionds_5_filterfulltext, A1525HisProKgr, lV117Wclecturasproduccionds_5_filterfulltext, A1526HisProMtr, lV117Wclecturasproduccionds_5_filterfulltext, Short.valueOf(A4714HisProNpzs), lV117Wclecturasproduccionds_5_filterfulltext, Integer.valueOf(A503GruOpeCod), lV117Wclecturasproduccionds_5_filterfulltext, Short.valueOf(A656ParCod), lV117Wclecturasproduccionds_5_filterfulltext, A867ParCodNom, lV117Wclecturasproduccionds_5_filterfulltext, AV128Wclecturasproduccionds_16_tffasedsc_sel, AV127Wclecturasproduccionds_15_tffasedsc, A7258FaseDsc, lV127Wclecturasproduccionds_15_tffasedsc, AV128Wclecturasproduccionds_16_tffasedsc_sel, A7258FaseDsc, AV128Wclecturasproduccionds_16_tffasedsc_sel, Integer.valueOf(A129BarCod), Integer.valueOf(AV114Wclecturasproduccionds_2_barcod), Byte.valueOf(A132BarCodReo), Byte.valueOf(AV115Wclecturasproduccionds_3_barcodreo), A130BarCodPar, AV116Wclecturasproduccionds_4_barcodpar, AV61Emprcod, lV118Wclecturasproduccionds_6_tfmaqcod, AV119Wclecturasproduccionds_7_tfmaqcod_sel, AV120Wclecturasproduccionds_8_tfhisprofec});
      GRID_nRecordCount = H00IV3_AGRID_nRecordCount[0] ;
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
      AV113Wclecturasproduccionds_1_emprcod = AV61Emprcod ;
      AV114Wclecturasproduccionds_2_barcod = AV62Barcod ;
      AV115Wclecturasproduccionds_3_barcodreo = AV63Barcodreo ;
      AV116Wclecturasproduccionds_4_barcodpar = AV64BarCodpar ;
      AV117Wclecturasproduccionds_5_filterfulltext = AV106FilterFullText ;
      AV118Wclecturasproduccionds_6_tfmaqcod = AV40TFMaqCod ;
      AV119Wclecturasproduccionds_7_tfmaqcod_sel = AV41TFMaqCod_Sel ;
      AV120Wclecturasproduccionds_8_tfhisprofec = AV43TFHisProFec ;
      AV121Wclecturasproduccionds_9_tfhisprolin = AV48TFHisProLin ;
      AV122Wclecturasproduccionds_10_tfhisprolin_to = AV49TFHisProLin_To ;
      AV123Wclecturasproduccionds_11_tfbarordlin = AV51TFBarOrdLin ;
      AV124Wclecturasproduccionds_12_tfbarordlin_to = AV52TFBarOrdLin_To ;
      AV125Wclecturasproduccionds_13_tffase = AV54TFFase ;
      AV126Wclecturasproduccionds_14_tffase_sel = AV55TFFase_Sel ;
      AV127Wclecturasproduccionds_15_tffasedsc = AV70TFFaseDsc ;
      AV128Wclecturasproduccionds_16_tffasedsc_sel = AV71TFFaseDsc_Sel ;
      AV129Wclecturasproduccionds_17_tfhisprotur = AV92TFHisProTur ;
      AV130Wclecturasproduccionds_18_tfhisprotur_to = AV93TFHisProTur_To ;
      AV131Wclecturasproduccionds_19_tfhisprof = AV95TFHisProF ;
      AV132Wclecturasproduccionds_20_tfhisprof_sel = AV96TFHisProF_Sel ;
      AV133Wclecturasproduccionds_21_tfhisprodti = AV73TFHisProDTI ;
      AV134Wclecturasproduccionds_22_tfhisprodtf = AV78TFHisProDTF ;
      AV135Wclecturasproduccionds_23_tfhisprokgr = AV98TFHisProKgr ;
      AV136Wclecturasproduccionds_24_tfhisprokgr_to = AV99TFHisProKgr_To ;
      AV137Wclecturasproduccionds_25_tfhispromtr = AV101TFHisProMtr ;
      AV138Wclecturasproduccionds_26_tfhispromtr_to = AV102TFHisProMtr_To ;
      AV139Wclecturasproduccionds_27_tfhispronpzs = AV104TFHisProNpzs ;
      AV140Wclecturasproduccionds_28_tfhispronpzs_to = AV105TFHisProNpzs_To ;
      AV141Wclecturasproduccionds_29_tfgruopecod = AV83TFGruOpeCod ;
      AV142Wclecturasproduccionds_30_tfgruopecod_to = AV84TFGruOpeCod_To ;
      AV143Wclecturasproduccionds_31_tfparcod = AV86TFParCod ;
      AV144Wclecturasproduccionds_32_tfparcod_to = AV87TFParCod_To ;
      AV145Wclecturasproduccionds_33_tfparcodnom = AV89TFParCodNom ;
      AV146Wclecturasproduccionds_34_tfparcodnom_sel = AV90TFParCodNom_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A561HisProLin, A194BarOrdLin, A461Fase, A7258FaseDsc, A566HisProTur, A557HisProF, A1525HisProKgr, A1526HisProMtr, A4714HisProNpzs, A503GruOpeCod, A656ParCod, A867ParCodNom, A130BarCodPar, A132BarCodReo, A129BarCod, AV61Emprcod, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV62Barcod, AV63Barcodreo, AV64BarCodpar, AV106FilterFullText, AV40TFMaqCod, AV41TFMaqCod_Sel, AV43TFHisProFec, AV48TFHisProLin, AV49TFHisProLin_To, AV51TFBarOrdLin, AV52TFBarOrdLin_To, AV54TFFase, AV55TFFase_Sel, AV70TFFaseDsc, AV71TFFaseDsc_Sel, AV92TFHisProTur, AV93TFHisProTur_To, AV95TFHisProF, AV96TFHisProF_Sel, AV73TFHisProDTI, AV78TFHisProDTF, AV98TFHisProKgr, AV99TFHisProKgr_To, AV101TFHisProMtr, AV102TFHisProMtr_To, AV104TFHisProNpzs, AV105TFHisProNpzs_To, AV83TFGruOpeCod, AV84TFGruOpeCod_To, AV86TFParCod, AV87TFParCod_To, AV89TFParCodNom, AV90TFParCodNom_Sel, AV147Pgmname, AV13OrderedBy, AV14OrderedDsc, AV113Wclecturasproduccionds_1_emprcod, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV113Wclecturasproduccionds_1_emprcod = AV61Emprcod ;
      AV114Wclecturasproduccionds_2_barcod = AV62Barcod ;
      AV115Wclecturasproduccionds_3_barcodreo = AV63Barcodreo ;
      AV116Wclecturasproduccionds_4_barcodpar = AV64BarCodpar ;
      AV117Wclecturasproduccionds_5_filterfulltext = AV106FilterFullText ;
      AV118Wclecturasproduccionds_6_tfmaqcod = AV40TFMaqCod ;
      AV119Wclecturasproduccionds_7_tfmaqcod_sel = AV41TFMaqCod_Sel ;
      AV120Wclecturasproduccionds_8_tfhisprofec = AV43TFHisProFec ;
      AV121Wclecturasproduccionds_9_tfhisprolin = AV48TFHisProLin ;
      AV122Wclecturasproduccionds_10_tfhisprolin_to = AV49TFHisProLin_To ;
      AV123Wclecturasproduccionds_11_tfbarordlin = AV51TFBarOrdLin ;
      AV124Wclecturasproduccionds_12_tfbarordlin_to = AV52TFBarOrdLin_To ;
      AV125Wclecturasproduccionds_13_tffase = AV54TFFase ;
      AV126Wclecturasproduccionds_14_tffase_sel = AV55TFFase_Sel ;
      AV127Wclecturasproduccionds_15_tffasedsc = AV70TFFaseDsc ;
      AV128Wclecturasproduccionds_16_tffasedsc_sel = AV71TFFaseDsc_Sel ;
      AV129Wclecturasproduccionds_17_tfhisprotur = AV92TFHisProTur ;
      AV130Wclecturasproduccionds_18_tfhisprotur_to = AV93TFHisProTur_To ;
      AV131Wclecturasproduccionds_19_tfhisprof = AV95TFHisProF ;
      AV132Wclecturasproduccionds_20_tfhisprof_sel = AV96TFHisProF_Sel ;
      AV133Wclecturasproduccionds_21_tfhisprodti = AV73TFHisProDTI ;
      AV134Wclecturasproduccionds_22_tfhisprodtf = AV78TFHisProDTF ;
      AV135Wclecturasproduccionds_23_tfhisprokgr = AV98TFHisProKgr ;
      AV136Wclecturasproduccionds_24_tfhisprokgr_to = AV99TFHisProKgr_To ;
      AV137Wclecturasproduccionds_25_tfhispromtr = AV101TFHisProMtr ;
      AV138Wclecturasproduccionds_26_tfhispromtr_to = AV102TFHisProMtr_To ;
      AV139Wclecturasproduccionds_27_tfhispronpzs = AV104TFHisProNpzs ;
      AV140Wclecturasproduccionds_28_tfhispronpzs_to = AV105TFHisProNpzs_To ;
      AV141Wclecturasproduccionds_29_tfgruopecod = AV83TFGruOpeCod ;
      AV142Wclecturasproduccionds_30_tfgruopecod_to = AV84TFGruOpeCod_To ;
      AV143Wclecturasproduccionds_31_tfparcod = AV86TFParCod ;
      AV144Wclecturasproduccionds_32_tfparcod_to = AV87TFParCod_To ;
      AV145Wclecturasproduccionds_33_tfparcodnom = AV89TFParCodNom ;
      AV146Wclecturasproduccionds_34_tfparcodnom_sel = AV90TFParCodNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A561HisProLin, A194BarOrdLin, A461Fase, A7258FaseDsc, A566HisProTur, A557HisProF, A1525HisProKgr, A1526HisProMtr, A4714HisProNpzs, A503GruOpeCod, A656ParCod, A867ParCodNom, A130BarCodPar, A132BarCodReo, A129BarCod, AV61Emprcod, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV62Barcod, AV63Barcodreo, AV64BarCodpar, AV106FilterFullText, AV40TFMaqCod, AV41TFMaqCod_Sel, AV43TFHisProFec, AV48TFHisProLin, AV49TFHisProLin_To, AV51TFBarOrdLin, AV52TFBarOrdLin_To, AV54TFFase, AV55TFFase_Sel, AV70TFFaseDsc, AV71TFFaseDsc_Sel, AV92TFHisProTur, AV93TFHisProTur_To, AV95TFHisProF, AV96TFHisProF_Sel, AV73TFHisProDTI, AV78TFHisProDTF, AV98TFHisProKgr, AV99TFHisProKgr_To, AV101TFHisProMtr, AV102TFHisProMtr_To, AV104TFHisProNpzs, AV105TFHisProNpzs_To, AV83TFGruOpeCod, AV84TFGruOpeCod_To, AV86TFParCod, AV87TFParCod_To, AV89TFParCodNom, AV90TFParCodNom_Sel, AV147Pgmname, AV13OrderedBy, AV14OrderedDsc, AV113Wclecturasproduccionds_1_emprcod, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV113Wclecturasproduccionds_1_emprcod = AV61Emprcod ;
      AV114Wclecturasproduccionds_2_barcod = AV62Barcod ;
      AV115Wclecturasproduccionds_3_barcodreo = AV63Barcodreo ;
      AV116Wclecturasproduccionds_4_barcodpar = AV64BarCodpar ;
      AV117Wclecturasproduccionds_5_filterfulltext = AV106FilterFullText ;
      AV118Wclecturasproduccionds_6_tfmaqcod = AV40TFMaqCod ;
      AV119Wclecturasproduccionds_7_tfmaqcod_sel = AV41TFMaqCod_Sel ;
      AV120Wclecturasproduccionds_8_tfhisprofec = AV43TFHisProFec ;
      AV121Wclecturasproduccionds_9_tfhisprolin = AV48TFHisProLin ;
      AV122Wclecturasproduccionds_10_tfhisprolin_to = AV49TFHisProLin_To ;
      AV123Wclecturasproduccionds_11_tfbarordlin = AV51TFBarOrdLin ;
      AV124Wclecturasproduccionds_12_tfbarordlin_to = AV52TFBarOrdLin_To ;
      AV125Wclecturasproduccionds_13_tffase = AV54TFFase ;
      AV126Wclecturasproduccionds_14_tffase_sel = AV55TFFase_Sel ;
      AV127Wclecturasproduccionds_15_tffasedsc = AV70TFFaseDsc ;
      AV128Wclecturasproduccionds_16_tffasedsc_sel = AV71TFFaseDsc_Sel ;
      AV129Wclecturasproduccionds_17_tfhisprotur = AV92TFHisProTur ;
      AV130Wclecturasproduccionds_18_tfhisprotur_to = AV93TFHisProTur_To ;
      AV131Wclecturasproduccionds_19_tfhisprof = AV95TFHisProF ;
      AV132Wclecturasproduccionds_20_tfhisprof_sel = AV96TFHisProF_Sel ;
      AV133Wclecturasproduccionds_21_tfhisprodti = AV73TFHisProDTI ;
      AV134Wclecturasproduccionds_22_tfhisprodtf = AV78TFHisProDTF ;
      AV135Wclecturasproduccionds_23_tfhisprokgr = AV98TFHisProKgr ;
      AV136Wclecturasproduccionds_24_tfhisprokgr_to = AV99TFHisProKgr_To ;
      AV137Wclecturasproduccionds_25_tfhispromtr = AV101TFHisProMtr ;
      AV138Wclecturasproduccionds_26_tfhispromtr_to = AV102TFHisProMtr_To ;
      AV139Wclecturasproduccionds_27_tfhispronpzs = AV104TFHisProNpzs ;
      AV140Wclecturasproduccionds_28_tfhispronpzs_to = AV105TFHisProNpzs_To ;
      AV141Wclecturasproduccionds_29_tfgruopecod = AV83TFGruOpeCod ;
      AV142Wclecturasproduccionds_30_tfgruopecod_to = AV84TFGruOpeCod_To ;
      AV143Wclecturasproduccionds_31_tfparcod = AV86TFParCod ;
      AV144Wclecturasproduccionds_32_tfparcod_to = AV87TFParCod_To ;
      AV145Wclecturasproduccionds_33_tfparcodnom = AV89TFParCodNom ;
      AV146Wclecturasproduccionds_34_tfparcodnom_sel = AV90TFParCodNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A561HisProLin, A194BarOrdLin, A461Fase, A7258FaseDsc, A566HisProTur, A557HisProF, A1525HisProKgr, A1526HisProMtr, A4714HisProNpzs, A503GruOpeCod, A656ParCod, A867ParCodNom, A130BarCodPar, A132BarCodReo, A129BarCod, AV61Emprcod, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV62Barcod, AV63Barcodreo, AV64BarCodpar, AV106FilterFullText, AV40TFMaqCod, AV41TFMaqCod_Sel, AV43TFHisProFec, AV48TFHisProLin, AV49TFHisProLin_To, AV51TFBarOrdLin, AV52TFBarOrdLin_To, AV54TFFase, AV55TFFase_Sel, AV70TFFaseDsc, AV71TFFaseDsc_Sel, AV92TFHisProTur, AV93TFHisProTur_To, AV95TFHisProF, AV96TFHisProF_Sel, AV73TFHisProDTI, AV78TFHisProDTF, AV98TFHisProKgr, AV99TFHisProKgr_To, AV101TFHisProMtr, AV102TFHisProMtr_To, AV104TFHisProNpzs, AV105TFHisProNpzs_To, AV83TFGruOpeCod, AV84TFGruOpeCod_To, AV86TFParCod, AV87TFParCod_To, AV89TFParCodNom, AV90TFParCodNom_Sel, AV147Pgmname, AV13OrderedBy, AV14OrderedDsc, AV113Wclecturasproduccionds_1_emprcod, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV113Wclecturasproduccionds_1_emprcod = AV61Emprcod ;
      AV114Wclecturasproduccionds_2_barcod = AV62Barcod ;
      AV115Wclecturasproduccionds_3_barcodreo = AV63Barcodreo ;
      AV116Wclecturasproduccionds_4_barcodpar = AV64BarCodpar ;
      AV117Wclecturasproduccionds_5_filterfulltext = AV106FilterFullText ;
      AV118Wclecturasproduccionds_6_tfmaqcod = AV40TFMaqCod ;
      AV119Wclecturasproduccionds_7_tfmaqcod_sel = AV41TFMaqCod_Sel ;
      AV120Wclecturasproduccionds_8_tfhisprofec = AV43TFHisProFec ;
      AV121Wclecturasproduccionds_9_tfhisprolin = AV48TFHisProLin ;
      AV122Wclecturasproduccionds_10_tfhisprolin_to = AV49TFHisProLin_To ;
      AV123Wclecturasproduccionds_11_tfbarordlin = AV51TFBarOrdLin ;
      AV124Wclecturasproduccionds_12_tfbarordlin_to = AV52TFBarOrdLin_To ;
      AV125Wclecturasproduccionds_13_tffase = AV54TFFase ;
      AV126Wclecturasproduccionds_14_tffase_sel = AV55TFFase_Sel ;
      AV127Wclecturasproduccionds_15_tffasedsc = AV70TFFaseDsc ;
      AV128Wclecturasproduccionds_16_tffasedsc_sel = AV71TFFaseDsc_Sel ;
      AV129Wclecturasproduccionds_17_tfhisprotur = AV92TFHisProTur ;
      AV130Wclecturasproduccionds_18_tfhisprotur_to = AV93TFHisProTur_To ;
      AV131Wclecturasproduccionds_19_tfhisprof = AV95TFHisProF ;
      AV132Wclecturasproduccionds_20_tfhisprof_sel = AV96TFHisProF_Sel ;
      AV133Wclecturasproduccionds_21_tfhisprodti = AV73TFHisProDTI ;
      AV134Wclecturasproduccionds_22_tfhisprodtf = AV78TFHisProDTF ;
      AV135Wclecturasproduccionds_23_tfhisprokgr = AV98TFHisProKgr ;
      AV136Wclecturasproduccionds_24_tfhisprokgr_to = AV99TFHisProKgr_To ;
      AV137Wclecturasproduccionds_25_tfhispromtr = AV101TFHisProMtr ;
      AV138Wclecturasproduccionds_26_tfhispromtr_to = AV102TFHisProMtr_To ;
      AV139Wclecturasproduccionds_27_tfhispronpzs = AV104TFHisProNpzs ;
      AV140Wclecturasproduccionds_28_tfhispronpzs_to = AV105TFHisProNpzs_To ;
      AV141Wclecturasproduccionds_29_tfgruopecod = AV83TFGruOpeCod ;
      AV142Wclecturasproduccionds_30_tfgruopecod_to = AV84TFGruOpeCod_To ;
      AV143Wclecturasproduccionds_31_tfparcod = AV86TFParCod ;
      AV144Wclecturasproduccionds_32_tfparcod_to = AV87TFParCod_To ;
      AV145Wclecturasproduccionds_33_tfparcodnom = AV89TFParCodNom ;
      AV146Wclecturasproduccionds_34_tfparcodnom_sel = AV90TFParCodNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A561HisProLin, A194BarOrdLin, A461Fase, A7258FaseDsc, A566HisProTur, A557HisProF, A1525HisProKgr, A1526HisProMtr, A4714HisProNpzs, A503GruOpeCod, A656ParCod, A867ParCodNom, A130BarCodPar, A132BarCodReo, A129BarCod, AV61Emprcod, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV62Barcod, AV63Barcodreo, AV64BarCodpar, AV106FilterFullText, AV40TFMaqCod, AV41TFMaqCod_Sel, AV43TFHisProFec, AV48TFHisProLin, AV49TFHisProLin_To, AV51TFBarOrdLin, AV52TFBarOrdLin_To, AV54TFFase, AV55TFFase_Sel, AV70TFFaseDsc, AV71TFFaseDsc_Sel, AV92TFHisProTur, AV93TFHisProTur_To, AV95TFHisProF, AV96TFHisProF_Sel, AV73TFHisProDTI, AV78TFHisProDTF, AV98TFHisProKgr, AV99TFHisProKgr_To, AV101TFHisProMtr, AV102TFHisProMtr_To, AV104TFHisProNpzs, AV105TFHisProNpzs_To, AV83TFGruOpeCod, AV84TFGruOpeCod_To, AV86TFParCod, AV87TFParCod_To, AV89TFParCodNom, AV90TFParCodNom_Sel, AV147Pgmname, AV13OrderedBy, AV14OrderedDsc, AV113Wclecturasproduccionds_1_emprcod, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV113Wclecturasproduccionds_1_emprcod = AV61Emprcod ;
      AV114Wclecturasproduccionds_2_barcod = AV62Barcod ;
      AV115Wclecturasproduccionds_3_barcodreo = AV63Barcodreo ;
      AV116Wclecturasproduccionds_4_barcodpar = AV64BarCodpar ;
      AV117Wclecturasproduccionds_5_filterfulltext = AV106FilterFullText ;
      AV118Wclecturasproduccionds_6_tfmaqcod = AV40TFMaqCod ;
      AV119Wclecturasproduccionds_7_tfmaqcod_sel = AV41TFMaqCod_Sel ;
      AV120Wclecturasproduccionds_8_tfhisprofec = AV43TFHisProFec ;
      AV121Wclecturasproduccionds_9_tfhisprolin = AV48TFHisProLin ;
      AV122Wclecturasproduccionds_10_tfhisprolin_to = AV49TFHisProLin_To ;
      AV123Wclecturasproduccionds_11_tfbarordlin = AV51TFBarOrdLin ;
      AV124Wclecturasproduccionds_12_tfbarordlin_to = AV52TFBarOrdLin_To ;
      AV125Wclecturasproduccionds_13_tffase = AV54TFFase ;
      AV126Wclecturasproduccionds_14_tffase_sel = AV55TFFase_Sel ;
      AV127Wclecturasproduccionds_15_tffasedsc = AV70TFFaseDsc ;
      AV128Wclecturasproduccionds_16_tffasedsc_sel = AV71TFFaseDsc_Sel ;
      AV129Wclecturasproduccionds_17_tfhisprotur = AV92TFHisProTur ;
      AV130Wclecturasproduccionds_18_tfhisprotur_to = AV93TFHisProTur_To ;
      AV131Wclecturasproduccionds_19_tfhisprof = AV95TFHisProF ;
      AV132Wclecturasproduccionds_20_tfhisprof_sel = AV96TFHisProF_Sel ;
      AV133Wclecturasproduccionds_21_tfhisprodti = AV73TFHisProDTI ;
      AV134Wclecturasproduccionds_22_tfhisprodtf = AV78TFHisProDTF ;
      AV135Wclecturasproduccionds_23_tfhisprokgr = AV98TFHisProKgr ;
      AV136Wclecturasproduccionds_24_tfhisprokgr_to = AV99TFHisProKgr_To ;
      AV137Wclecturasproduccionds_25_tfhispromtr = AV101TFHisProMtr ;
      AV138Wclecturasproduccionds_26_tfhispromtr_to = AV102TFHisProMtr_To ;
      AV139Wclecturasproduccionds_27_tfhispronpzs = AV104TFHisProNpzs ;
      AV140Wclecturasproduccionds_28_tfhispronpzs_to = AV105TFHisProNpzs_To ;
      AV141Wclecturasproduccionds_29_tfgruopecod = AV83TFGruOpeCod ;
      AV142Wclecturasproduccionds_30_tfgruopecod_to = AV84TFGruOpeCod_To ;
      AV143Wclecturasproduccionds_31_tfparcod = AV86TFParCod ;
      AV144Wclecturasproduccionds_32_tfparcod_to = AV87TFParCod_To ;
      AV145Wclecturasproduccionds_33_tfparcodnom = AV89TFParCodNom ;
      AV146Wclecturasproduccionds_34_tfparcodnom_sel = AV90TFParCodNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A561HisProLin, A194BarOrdLin, A461Fase, A7258FaseDsc, A566HisProTur, A557HisProF, A1525HisProKgr, A1526HisProMtr, A4714HisProNpzs, A503GruOpeCod, A656ParCod, A867ParCodNom, A130BarCodPar, A132BarCodReo, A129BarCod, AV61Emprcod, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV62Barcod, AV63Barcodreo, AV64BarCodpar, AV106FilterFullText, AV40TFMaqCod, AV41TFMaqCod_Sel, AV43TFHisProFec, AV48TFHisProLin, AV49TFHisProLin_To, AV51TFBarOrdLin, AV52TFBarOrdLin_To, AV54TFFase, AV55TFFase_Sel, AV70TFFaseDsc, AV71TFFaseDsc_Sel, AV92TFHisProTur, AV93TFHisProTur_To, AV95TFHisProF, AV96TFHisProF_Sel, AV73TFHisProDTI, AV78TFHisProDTF, AV98TFHisProKgr, AV99TFHisProKgr_To, AV101TFHisProMtr, AV102TFHisProMtr_To, AV104TFHisProNpzs, AV105TFHisProNpzs_To, AV83TFGruOpeCod, AV84TFGruOpeCod_To, AV86TFParCod, AV87TFParCod_To, AV89TFParCodNom, AV90TFParCodNom_Sel, AV147Pgmname, AV13OrderedBy, AV14OrderedDsc, AV113Wclecturasproduccionds_1_emprcod, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV147Pgmname = "WCLecturasProduccion" ;
      Gx_err = (short)(0) ;
      edtavOpenom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOpenom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpenom_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupIV0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e18IV2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV36ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV57DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV33ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV59GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV60GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV61Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV61Emprcod") ;
         wcpOAV62Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV62Barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV63Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV63Barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV64BarCodpar = httpContext.cgiGet( sPrefix+"wcpOAV64BarCodpar") ;
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
         AV106FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106FilterFullText", AV106FilterFullText);
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_hisprofecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_HISPROFECAUXDATE");
            GX_FocusControl = edtavDdo_hisprofecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV45DDO_HisProFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45DDO_HisProFecAuxDate", localUtil.format(AV45DDO_HisProFecAuxDate, "99/99/99"));
         }
         else
         {
            AV45DDO_HisProFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_hisprofecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45DDO_HisProFecAuxDate", localUtil.format(AV45DDO_HisProFecAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_hisprodtiauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_HISPRODTIAUXDATE");
            GX_FocusControl = edtavDdo_hisprodtiauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV75DDO_HisProDTIAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75DDO_HisProDTIAuxDate", localUtil.format(AV75DDO_HisProDTIAuxDate, "99/99/99"));
         }
         else
         {
            AV75DDO_HisProDTIAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_hisprodtiauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75DDO_HisProDTIAuxDate", localUtil.format(AV75DDO_HisProDTIAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_hisprodtfauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_HISPRODTFAUXDATE");
            GX_FocusControl = edtavDdo_hisprodtfauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV80DDO_HisProDTFAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80DDO_HisProDTFAuxDate", localUtil.format(AV80DDO_HisProDTFAuxDate, "99/99/99"));
         }
         else
         {
            AV80DDO_HisProDTFAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_hisprodtfauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80DDO_HisProDTFAuxDate", localUtil.format(AV80DDO_HisProDTFAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCLecturasProduccion");
         A396EmprCod = httpContext.cgiGet( edtEmprCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("wclecturasproduccion:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e18IV2 ();
      if (returnInSub) return;
   }

   public void e18IV2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV110Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wclecturasproduccion_impl.this.GXt_char1 = GXv_char2[0] ;
      AV110Station = GXt_char1 ;
      GXv_char2[0] = AV61Emprcod ;
      GXv_char3[0] = AV111Emprnom ;
      GXv_char4[0] = AV112Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV110Station, GXv_char2, GXv_char3, GXv_char4) ;
      wclecturasproduccion_impl.this.AV61Emprcod = GXv_char2[0] ;
      wclecturasproduccion_impl.this.AV111Emprnom = GXv_char3[0] ;
      wclecturasproduccion_impl.this.AV112Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Emprcod", AV61Emprcod);
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
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtBarCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Visible), 5, 0), true);
      edtBarCodReo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCodReo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Visible), 5, 0), true);
      edtBarCodPar_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCodPar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Visible), 5, 0), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV13OrderedBy < 1 )
      {
         AV13OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV57DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV57DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e19IV2( )
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
      if ( AV38ManageFiltersExecutionStep == 1 )
      {
         AV38ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38ManageFiltersExecutionStep", GXutil.str( AV38ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV38ManageFiltersExecutionStep == 2 )
      {
         AV38ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38ManageFiltersExecutionStep", GXutil.str( AV38ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV35Session.getValue("WCLecturasProduccionColumnsSelector"), "") != 0 )
      {
         AV31ColumnsSelectorXML = AV35Session.getValue("WCLecturasProduccionColumnsSelector") ;
         AV33ColumnsSelector.fromxml(AV31ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisProFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProFec_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisProLin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProLin_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarOrdLin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarOrdLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtFase_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFase_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFase_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtFaseDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFaseDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFaseDsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisProTur_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProTur_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProTur_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisProF_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProF_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProF_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisProDTI_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProDTI_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProDTI_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisProDTF_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProDTF_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProDTF_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisProKgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProKgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProKgr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisProMtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProMtr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisProNpzs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProNpzs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProNpzs_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtGruOpeCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtGruOpeCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGruOpeCod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavOpenom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOpenom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpenom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtParCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtParCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParCod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtParCodNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtParCodNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParCodNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      AV59GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59GridCurrentPage), 10, 0));
      AV60GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60GridPageCount), 10, 0));
      AV113Wclecturasproduccionds_1_emprcod = AV61Emprcod ;
      AV114Wclecturasproduccionds_2_barcod = AV62Barcod ;
      AV115Wclecturasproduccionds_3_barcodreo = AV63Barcodreo ;
      AV116Wclecturasproduccionds_4_barcodpar = AV64BarCodpar ;
      AV117Wclecturasproduccionds_5_filterfulltext = AV106FilterFullText ;
      AV118Wclecturasproduccionds_6_tfmaqcod = AV40TFMaqCod ;
      AV119Wclecturasproduccionds_7_tfmaqcod_sel = AV41TFMaqCod_Sel ;
      AV120Wclecturasproduccionds_8_tfhisprofec = AV43TFHisProFec ;
      AV121Wclecturasproduccionds_9_tfhisprolin = AV48TFHisProLin ;
      AV122Wclecturasproduccionds_10_tfhisprolin_to = AV49TFHisProLin_To ;
      AV123Wclecturasproduccionds_11_tfbarordlin = AV51TFBarOrdLin ;
      AV124Wclecturasproduccionds_12_tfbarordlin_to = AV52TFBarOrdLin_To ;
      AV125Wclecturasproduccionds_13_tffase = AV54TFFase ;
      AV126Wclecturasproduccionds_14_tffase_sel = AV55TFFase_Sel ;
      AV127Wclecturasproduccionds_15_tffasedsc = AV70TFFaseDsc ;
      AV128Wclecturasproduccionds_16_tffasedsc_sel = AV71TFFaseDsc_Sel ;
      AV129Wclecturasproduccionds_17_tfhisprotur = AV92TFHisProTur ;
      AV130Wclecturasproduccionds_18_tfhisprotur_to = AV93TFHisProTur_To ;
      AV131Wclecturasproduccionds_19_tfhisprof = AV95TFHisProF ;
      AV132Wclecturasproduccionds_20_tfhisprof_sel = AV96TFHisProF_Sel ;
      AV133Wclecturasproduccionds_21_tfhisprodti = AV73TFHisProDTI ;
      AV134Wclecturasproduccionds_22_tfhisprodtf = AV78TFHisProDTF ;
      AV135Wclecturasproduccionds_23_tfhisprokgr = AV98TFHisProKgr ;
      AV136Wclecturasproduccionds_24_tfhisprokgr_to = AV99TFHisProKgr_To ;
      AV137Wclecturasproduccionds_25_tfhispromtr = AV101TFHisProMtr ;
      AV138Wclecturasproduccionds_26_tfhispromtr_to = AV102TFHisProMtr_To ;
      AV139Wclecturasproduccionds_27_tfhispronpzs = AV104TFHisProNpzs ;
      AV140Wclecturasproduccionds_28_tfhispronpzs_to = AV105TFHisProNpzs_To ;
      AV141Wclecturasproduccionds_29_tfgruopecod = AV83TFGruOpeCod ;
      AV142Wclecturasproduccionds_30_tfgruopecod_to = AV84TFGruOpeCod_To ;
      AV143Wclecturasproduccionds_31_tfparcod = AV86TFParCod ;
      AV144Wclecturasproduccionds_32_tfparcod_to = AV87TFParCod_To ;
      AV145Wclecturasproduccionds_33_tfparcodnom = AV89TFParCodNom ;
      AV146Wclecturasproduccionds_34_tfparcodnom_sel = AV90TFParCodNom_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV33ColumnsSelector", AV33ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV36ManageFiltersData", AV36ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e12IV2( )
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
         AV58PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV58PageToGo) ;
      }
   }

   public void e13IV2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e14IV2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV13OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
         AV14OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14OrderedDsc", AV14OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCod") == 0 )
         {
            AV40TFMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFMaqCod", AV40TFMaqCod);
            AV41TFMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFMaqCod_Sel", AV41TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProFec") == 0 )
         {
            AV43TFHisProFec = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFHisProFec", localUtil.format(AV43TFHisProFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProLin") == 0 )
         {
            AV48TFHisProLin = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFHisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFHisProLin), 8, 0));
            AV49TFHisProLin_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFHisProLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFHisProLin_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarOrdLin") == 0 )
         {
            AV51TFBarOrdLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFBarOrdLin), 4, 0));
            AV52TFBarOrdLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFBarOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Fase") == 0 )
         {
            AV54TFFase = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFFase", AV54TFFase);
            AV55TFFase_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFFase_Sel", AV55TFFase_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FaseDsc") == 0 )
         {
            AV70TFFaseDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFFaseDsc", AV70TFFaseDsc);
            AV71TFFaseDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFFaseDsc_Sel", AV71TFFaseDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProTur") == 0 )
         {
            AV92TFHisProTur = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TFHisProTur", GXutil.str( AV92TFHisProTur, 1, 0));
            AV93TFHisProTur_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFHisProTur_To", GXutil.str( AV93TFHisProTur_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProF") == 0 )
         {
            AV95TFHisProF = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95TFHisProF", AV95TFHisProF);
            AV96TFHisProF_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV96TFHisProF_Sel", AV96TFHisProF_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProDTI") == 0 )
         {
            AV73TFHisProDTI = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFHisProDTI", localUtil.ttoc( AV73TFHisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProDTF") == 0 )
         {
            AV78TFHisProDTF = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFHisProDTF", localUtil.ttoc( AV78TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProKgr") == 0 )
         {
            AV98TFHisProKgr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98TFHisProKgr", GXutil.ltrimstr( AV98TFHisProKgr, 9, 2));
            AV99TFHisProKgr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99TFHisProKgr_To", GXutil.ltrimstr( AV99TFHisProKgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProMtr") == 0 )
         {
            AV101TFHisProMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101TFHisProMtr", GXutil.ltrimstr( AV101TFHisProMtr, 9, 2));
            AV102TFHisProMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFHisProMtr_To", GXutil.ltrimstr( AV102TFHisProMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProNpzs") == 0 )
         {
            AV104TFHisProNpzs = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104TFHisProNpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104TFHisProNpzs), 4, 0));
            AV105TFHisProNpzs_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105TFHisProNpzs_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105TFHisProNpzs_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "GruOpeCod") == 0 )
         {
            AV83TFGruOpeCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFGruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83TFGruOpeCod), 6, 0));
            AV84TFGruOpeCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFGruOpeCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84TFGruOpeCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ParCod") == 0 )
         {
            AV86TFParCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86TFParCod), 4, 0));
            AV87TFParCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TFParCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87TFParCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ParCodNom") == 0 )
         {
            AV89TFParCodNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFParCodNom", AV89TFParCodNom);
            AV90TFParCodNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFParCodNom_Sel", AV90TFParCodNom_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e20IV2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      GXt_char1 = AV68OpeNom ;
      GXv_char4[0] = GXt_char1 ;
      new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char4) ;
      wclecturasproduccion_impl.this.GXt_char1 = GXv_char4[0] ;
      AV68OpeNom = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOpenom_Internalname, AV68OpeNom);
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

   public void e15IV2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV31ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV33ColumnsSelector.fromJSonString(AV31ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WCLecturasProduccionColumnsSelector", ((GXutil.strcmp("", AV31ColumnsSelectorXML)==0) ? "" : AV33ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV33ColumnsSelector", AV33ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV36ManageFiltersData", AV36ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e11IV2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WCLecturasProduccionFilters")),GXutil.URLEncode(GXutil.rtrim(AV147Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV38ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38ManageFiltersExecutionStep", GXutil.str( AV38ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WCLecturasProduccionFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV38ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38ManageFiltersExecutionStep", GXutil.str( AV38ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV37ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WCLecturasProduccionFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         wclecturasproduccion_impl.this.GXt_char1 = GXv_char4[0] ;
         AV37ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV37ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV147Pgmname+"GridState", AV37ManageFiltersXml) ;
            AV10GridState.fromxml(AV37ManageFiltersXml, null, null);
            AV13OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
            AV14OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14OrderedDsc", AV14OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV33ColumnsSelector", AV33ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV36ManageFiltersData", AV36ManageFiltersData);
   }

   public void e16IV2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV29ExcelFilename ;
      GXv_char3[0] = AV30ErrorMessage ;
      new app.wclecturasproduccionexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      wclecturasproduccion_impl.this.AV29ExcelFilename = GXv_char4[0] ;
      wclecturasproduccion_impl.this.AV30ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV29ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV29ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV30ErrorMessage);
      }
   }

   public void e17IV2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.wclecturasproduccionexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV13OrderedBy, 4, 0))+":"+(AV14OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV33ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MaqCod", "", "Código Máquina", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProFec", "", "Fecha", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProLin", "", "Linea", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarOrdLin", "", "Orden", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Fase", "", "Fase", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "FaseDsc", "", "Descripcion", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProTur", "", "Turno", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProF", "", "F?", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProDTI", "", "Inicio", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProDTF", "", "Fin", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProKgr", "", "kgs", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProMtr", "", "mts", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProNpzs", "", "pcs", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "GruOpeCod", "", "Operario", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&OpeNom", "", "Nombre", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ParCod", "", "Paro", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ParCodNom", "", "Descripcion", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV32UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCLecturasProduccionColumnsSelector", GXv_char4) ;
      wclecturasproduccion_impl.this.GXt_char1 = GXv_char4[0] ;
      AV32UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV32UserCustomValue)==0) ) )
      {
         AV34ColumnsSelectorAux.fromxml(AV32UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV34ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV33ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV34ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV33ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV36ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WCLecturasProduccionFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV36ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV106FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106FilterFullText", AV106FilterFullText);
      AV40TFMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFMaqCod", AV40TFMaqCod);
      AV41TFMaqCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFMaqCod_Sel", AV41TFMaqCod_Sel);
      AV43TFHisProFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFHisProFec", localUtil.format(AV43TFHisProFec, "99/99/99"));
      AV48TFHisProLin = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFHisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFHisProLin), 8, 0));
      AV49TFHisProLin_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFHisProLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFHisProLin_To), 8, 0));
      AV51TFBarOrdLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFBarOrdLin), 4, 0));
      AV52TFBarOrdLin_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFBarOrdLin_To), 4, 0));
      AV54TFFase = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFFase", AV54TFFase);
      AV55TFFase_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFFase_Sel", AV55TFFase_Sel);
      AV70TFFaseDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFFaseDsc", AV70TFFaseDsc);
      AV71TFFaseDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFFaseDsc_Sel", AV71TFFaseDsc_Sel);
      AV92TFHisProTur = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TFHisProTur", GXutil.str( AV92TFHisProTur, 1, 0));
      AV93TFHisProTur_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFHisProTur_To", GXutil.str( AV93TFHisProTur_To, 1, 0));
      AV95TFHisProF = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95TFHisProF", AV95TFHisProF);
      AV96TFHisProF_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV96TFHisProF_Sel", AV96TFHisProF_Sel);
      AV73TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFHisProDTI", localUtil.ttoc( AV73TFHisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV78TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFHisProDTF", localUtil.ttoc( AV78TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV98TFHisProKgr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98TFHisProKgr", GXutil.ltrimstr( AV98TFHisProKgr, 9, 2));
      AV99TFHisProKgr_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99TFHisProKgr_To", GXutil.ltrimstr( AV99TFHisProKgr_To, 9, 2));
      AV101TFHisProMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101TFHisProMtr", GXutil.ltrimstr( AV101TFHisProMtr, 9, 2));
      AV102TFHisProMtr_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFHisProMtr_To", GXutil.ltrimstr( AV102TFHisProMtr_To, 9, 2));
      AV104TFHisProNpzs = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104TFHisProNpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104TFHisProNpzs), 4, 0));
      AV105TFHisProNpzs_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105TFHisProNpzs_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105TFHisProNpzs_To), 4, 0));
      AV83TFGruOpeCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFGruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83TFGruOpeCod), 6, 0));
      AV84TFGruOpeCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFGruOpeCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84TFGruOpeCod_To), 6, 0));
      AV86TFParCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86TFParCod), 4, 0));
      AV87TFParCod_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TFParCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87TFParCod_To), 4, 0));
      AV89TFParCodNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFParCodNom", AV89TFParCodNom);
      AV90TFParCodNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFParCodNom_Sel", AV90TFParCodNom_Sel);
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
      if ( GXutil.strcmp(AV35Session.getValue(AV147Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV147Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV35Session.getValue(AV147Pgmname+"GridState"), null, null);
      }
      AV13OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
      AV14OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14OrderedDsc", AV14OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV148GXV1 = 1 ;
      while ( AV148GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV148GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV106FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106FilterFullText", AV106FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV40TFMaqCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFMaqCod", AV40TFMaqCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV41TFMaqCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFMaqCod_Sel", AV41TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROFEC") == 0 )
         {
            AV43TFHisProFec = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFHisProFec", localUtil.format(AV43TFHisProFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLIN") == 0 )
         {
            AV48TFHisProLin = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFHisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFHisProLin), 8, 0));
            AV49TFHisProLin_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFHisProLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFHisProLin_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV51TFBarOrdLin = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFBarOrdLin), 4, 0));
            AV52TFBarOrdLin_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFBarOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE") == 0 )
         {
            AV54TFFase = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFFase", AV54TFFase);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_SEL") == 0 )
         {
            AV55TFFase_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFFase_Sel", AV55TFFase_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDSC") == 0 )
         {
            AV70TFFaseDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFFaseDsc", AV70TFFaseDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDSC_SEL") == 0 )
         {
            AV71TFFaseDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFFaseDsc_Sel", AV71TFFaseDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTUR") == 0 )
         {
            AV92TFHisProTur = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TFHisProTur", GXutil.str( AV92TFHisProTur, 1, 0));
            AV93TFHisProTur_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFHisProTur_To", GXutil.str( AV93TFHisProTur_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF") == 0 )
         {
            AV95TFHisProF = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95TFHisProF", AV95TFHisProF);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF_SEL") == 0 )
         {
            AV96TFHisProF_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV96TFHisProF_Sel", AV96TFHisProF_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTI") == 0 )
         {
            AV73TFHisProDTI = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFHisProDTI", localUtil.ttoc( AV73TFHisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV75DDO_HisProDTIAuxDate = GXutil.resetTime(AV73TFHisProDTI) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75DDO_HisProDTIAuxDate", localUtil.format(AV75DDO_HisProDTIAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV78TFHisProDTF = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFHisProDTF", localUtil.ttoc( AV78TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV80DDO_HisProDTFAuxDate = GXutil.resetTime(AV78TFHisProDTF) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80DDO_HisProDTFAuxDate", localUtil.format(AV80DDO_HisProDTFAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV98TFHisProKgr = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98TFHisProKgr", GXutil.ltrimstr( AV98TFHisProKgr, 9, 2));
            AV99TFHisProKgr_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99TFHisProKgr_To", GXutil.ltrimstr( AV99TFHisProKgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV101TFHisProMtr = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101TFHisProMtr", GXutil.ltrimstr( AV101TFHisProMtr, 9, 2));
            AV102TFHisProMtr_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFHisProMtr_To", GXutil.ltrimstr( AV102TFHisProMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRONPZS") == 0 )
         {
            AV104TFHisProNpzs = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104TFHisProNpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104TFHisProNpzs), 4, 0));
            AV105TFHisProNpzs_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105TFHisProNpzs_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105TFHisProNpzs_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD") == 0 )
         {
            AV83TFGruOpeCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFGruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83TFGruOpeCod), 6, 0));
            AV84TFGruOpeCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFGruOpeCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84TFGruOpeCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCOD") == 0 )
         {
            AV86TFParCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86TFParCod), 4, 0));
            AV87TFParCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TFParCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87TFParCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM") == 0 )
         {
            AV89TFParCodNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFParCodNom", AV89TFParCodNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM_SEL") == 0 )
         {
            AV90TFParCodNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFParCodNom_Sel", AV90TFParCodNom_Sel);
         }
         AV148GXV1 = (int)(AV148GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFMaqCod_Sel)==0), AV41TFMaqCod_Sel, GXv_char4) ;
      wclecturasproduccion_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFFase_Sel)==0), AV55TFFase_Sel, GXv_char3) ;
      wclecturasproduccion_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV71TFFaseDsc_Sel)==0), AV71TFFaseDsc_Sel, GXv_char2) ;
      wclecturasproduccion_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV96TFHisProF_Sel)==0), AV96TFHisProF_Sel, GXv_char15) ;
      wclecturasproduccion_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV90TFParCodNom_Sel)==0), AV90TFParCodNom_Sel, GXv_char17) ;
      wclecturasproduccion_impl.this.GXt_char16 = GXv_char17[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"||||"+GXt_char12+"|"+GXt_char13+"||"+GXt_char14+"|||||||||"+GXt_char16 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFMaqCod)==0), AV40TFMaqCod, GXv_char17) ;
      wclecturasproduccion_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFFase)==0), AV54TFFase, GXv_char15) ;
      wclecturasproduccion_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV70TFFaseDsc)==0), AV70TFFaseDsc, GXv_char4) ;
      wclecturasproduccion_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV95TFHisProF)==0), AV95TFHisProF, GXv_char3) ;
      wclecturasproduccion_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV89TFParCodNom)==0), AV89TFParCodNom, GXv_char2) ;
      wclecturasproduccion_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char16+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV43TFHisProFec)) ? "" : localUtil.dtoc( AV43TFHisProFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV48TFHisProLin) ? "" : GXutil.str( AV48TFHisProLin, 8, 0))+"|"+((0==AV51TFBarOrdLin) ? "" : GXutil.str( AV51TFBarOrdLin, 4, 0))+"|"+GXt_char14+"|"+GXt_char13+"|"+((0==AV92TFHisProTur) ? "" : GXutil.str( AV92TFHisProTur, 1, 0))+"|"+GXt_char12+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV73TFHisProDTI) ? "" : localUtil.dtoc( AV75DDO_HisProDTIAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV78TFHisProDTF) ? "" : localUtil.dtoc( AV80DDO_HisProDTFAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV98TFHisProKgr)==0) ? "" : GXutil.str( AV98TFHisProKgr, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV101TFHisProMtr)==0) ? "" : GXutil.str( AV101TFHisProMtr, 9, 2))+"|"+((0==AV104TFHisProNpzs) ? "" : GXutil.str( AV104TFHisProNpzs, 4, 0))+"|"+((0==AV83TFGruOpeCod) ? "" : GXutil.str( AV83TFGruOpeCod, 6, 0))+"||"+((0==AV86TFParCod) ? "" : GXutil.str( AV86TFParCod, 4, 0))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((0==AV49TFHisProLin_To) ? "" : GXutil.str( AV49TFHisProLin_To, 8, 0))+"|"+((0==AV52TFBarOrdLin_To) ? "" : GXutil.str( AV52TFBarOrdLin_To, 4, 0))+"|||"+((0==AV93TFHisProTur_To) ? "" : GXutil.str( AV93TFHisProTur_To, 1, 0))+"||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV99TFHisProKgr_To)==0) ? "" : GXutil.str( AV99TFHisProKgr_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV102TFHisProMtr_To)==0) ? "" : GXutil.str( AV102TFHisProMtr_To, 9, 2))+"|"+((0==AV105TFHisProNpzs_To) ? "" : GXutil.str( AV105TFHisProNpzs_To, 4, 0))+"|"+((0==AV84TFGruOpeCod_To) ? "" : GXutil.str( AV84TFGruOpeCod_To, 6, 0))+"||"+((0==AV87TFParCod_To) ? "" : GXutil.str( AV87TFParCod_To, 4, 0))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV35Session.getValue(AV147Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV13OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV14OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV106FilterFullText)==0), (short)(0), AV106FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFMAQCOD", "", !(GXutil.strcmp("", AV40TFMaqCod)==0), (short)(0), AV40TFMaqCod, "", !(GXutil.strcmp("", AV41TFMaqCod_Sel)==0), AV41TFMaqCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFHISPROFEC", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV43TFHisProFec)), (short)(0), GXutil.trim( localUtil.dtoc( AV43TFHisProFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFHISPROLIN", "", !((0==AV48TFHisProLin)&&(0==AV49TFHisProLin_To)), (short)(0), GXutil.trim( GXutil.str( AV48TFHisProLin, 8, 0)), GXutil.trim( GXutil.str( AV49TFHisProLin_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFBARORDLIN", "", !((0==AV51TFBarOrdLin)&&(0==AV52TFBarOrdLin_To)), (short)(0), GXutil.trim( GXutil.str( AV51TFBarOrdLin, 4, 0)), GXutil.trim( GXutil.str( AV52TFBarOrdLin_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFFASE", "", !(GXutil.strcmp("", AV54TFFase)==0), (short)(0), AV54TFFase, "", !(GXutil.strcmp("", AV55TFFase_Sel)==0), AV55TFFase_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFFASEDSC", "", !(GXutil.strcmp("", AV70TFFaseDsc)==0), (short)(0), AV70TFFaseDsc, "", !(GXutil.strcmp("", AV71TFFaseDsc_Sel)==0), AV71TFFaseDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFHISPROTUR", "", !((0==AV92TFHisProTur)&&(0==AV93TFHisProTur_To)), (short)(0), GXutil.trim( GXutil.str( AV92TFHisProTur, 1, 0)), GXutil.trim( GXutil.str( AV93TFHisProTur_To, 1, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFHISPROF", "", !(GXutil.strcmp("", AV95TFHisProF)==0), (short)(0), AV95TFHisProF, "", !(GXutil.strcmp("", AV96TFHisProF_Sel)==0), AV96TFHisProF_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFHISPRODTI", "", !GXutil.dateCompare(GXutil.nullDate(), AV73TFHisProDTI), (short)(0), GXutil.trim( localUtil.ttoc( AV73TFHisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFHISPRODTF", "", !GXutil.dateCompare(GXutil.nullDate(), AV78TFHisProDTF), (short)(0), GXutil.trim( localUtil.ttoc( AV78TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFHISPROKGR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV98TFHisProKgr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV99TFHisProKgr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV98TFHisProKgr, 9, 2)), GXutil.trim( GXutil.str( AV99TFHisProKgr_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFHISPROMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV101TFHisProMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV102TFHisProMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV101TFHisProMtr, 9, 2)), GXutil.trim( GXutil.str( AV102TFHisProMtr_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFHISPRONPZS", "", !((0==AV104TFHisProNpzs)&&(0==AV105TFHisProNpzs_To)), (short)(0), GXutil.trim( GXutil.str( AV104TFHisProNpzs, 4, 0)), GXutil.trim( GXutil.str( AV105TFHisProNpzs_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFGRUOPECOD", "", !((0==AV83TFGruOpeCod)&&(0==AV84TFGruOpeCod_To)), (short)(0), GXutil.trim( GXutil.str( AV83TFGruOpeCod, 6, 0)), GXutil.trim( GXutil.str( AV84TFGruOpeCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFPARCOD", "", !((0==AV86TFParCod)&&(0==AV87TFParCod_To)), (short)(0), GXutil.trim( GXutil.str( AV86TFParCod, 4, 0)), GXutil.trim( GXutil.str( AV87TFParCod_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFPARCODNOM", "", !(GXutil.strcmp("", AV89TFParCodNom)==0), (short)(0), AV89TFParCodNom, "", !(GXutil.strcmp("", AV90TFParCodNom_Sel)==0), AV90TFParCodNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      if ( ! (GXutil.strcmp("", AV61Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV61Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV62Barcod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV62Barcod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV63Barcodreo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV63Barcodreo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV64BarCodpar)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV64BarCodpar );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV147Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV147Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TPARPRO" );
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "Emprcod" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV61Emprcod );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "Barcod" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV62Barcod, 8, 0) );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "Barcodreo" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV63Barcodreo, 1, 0) );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "BarCodpar" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV64BarCodpar );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV35Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_23_IV2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV36ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_28_IV2( true) ;
      }
      else
      {
         wb_table2_28_IV2( false) ;
      }
      return  ;
   }

   public void wb_table2_28_IV2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_IV2e( true) ;
      }
      else
      {
         wb_table1_23_IV2e( false) ;
      }
   }

   public void wb_table2_28_IV2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV106FilterFullText, GXutil.rtrim( localUtil.format( AV106FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WCLecturasProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_28_IV2e( true) ;
      }
      else
      {
         wb_table2_28_IV2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV61Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Emprcod", AV61Emprcod);
      AV62Barcod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62Barcod), 8, 0));
      AV63Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Barcodreo", GXutil.str( AV63Barcodreo, 1, 0));
      AV64BarCodpar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64BarCodpar", AV64BarCodpar);
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
      paIV2( ) ;
      wsIV2( ) ;
      weIV2( ) ;
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
      sCtrlAV61Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV62Barcod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV63Barcodreo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV64BarCodpar = (String)getParm(obj,3,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paIV2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wclecturasproduccion", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paIV2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV61Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Emprcod", AV61Emprcod);
         AV62Barcod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62Barcod), 8, 0));
         AV63Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Barcodreo", GXutil.str( AV63Barcodreo, 1, 0));
         AV64BarCodpar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64BarCodpar", AV64BarCodpar);
      }
      wcpOAV61Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV61Emprcod") ;
      wcpOAV62Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV62Barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV63Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV63Barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV64BarCodpar = httpContext.cgiGet( sPrefix+"wcpOAV64BarCodpar") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV61Emprcod, wcpOAV61Emprcod) != 0 ) || ( AV62Barcod != wcpOAV62Barcod ) || ( AV63Barcodreo != wcpOAV63Barcodreo ) || ( GXutil.strcmp(AV64BarCodpar, wcpOAV64BarCodpar) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV61Emprcod = AV61Emprcod ;
      wcpOAV62Barcod = AV62Barcod ;
      wcpOAV63Barcodreo = AV63Barcodreo ;
      wcpOAV64BarCodpar = AV64BarCodpar ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV61Emprcod = httpContext.cgiGet( sPrefix+"AV61Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV61Emprcod) > 0 )
      {
         AV61Emprcod = httpContext.cgiGet( sCtrlAV61Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Emprcod", AV61Emprcod);
      }
      else
      {
         AV61Emprcod = httpContext.cgiGet( sPrefix+"AV61Emprcod_PARM") ;
      }
      sCtrlAV62Barcod = httpContext.cgiGet( sPrefix+"AV62Barcod_CTRL") ;
      if ( GXutil.len( sCtrlAV62Barcod) > 0 )
      {
         AV62Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV62Barcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62Barcod), 8, 0));
      }
      else
      {
         AV62Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV62Barcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV63Barcodreo = httpContext.cgiGet( sPrefix+"AV63Barcodreo_CTRL") ;
      if ( GXutil.len( sCtrlAV63Barcodreo) > 0 )
      {
         AV63Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV63Barcodreo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Barcodreo", GXutil.str( AV63Barcodreo, 1, 0));
      }
      else
      {
         AV63Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV63Barcodreo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV64BarCodpar = httpContext.cgiGet( sPrefix+"AV64BarCodpar_CTRL") ;
      if ( GXutil.len( sCtrlAV64BarCodpar) > 0 )
      {
         AV64BarCodpar = httpContext.cgiGet( sCtrlAV64BarCodpar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64BarCodpar", AV64BarCodpar);
      }
      else
      {
         AV64BarCodpar = httpContext.cgiGet( sPrefix+"AV64BarCodpar_PARM") ;
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
      paIV2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsIV2( ) ;
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
      wsIV2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61Emprcod_PARM", GXutil.rtrim( AV61Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV61Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61Emprcod_CTRL", GXutil.rtrim( sCtrlAV61Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62Barcod_PARM", GXutil.ltrim( localUtil.ntoc( AV62Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV62Barcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62Barcod_CTRL", GXutil.rtrim( sCtrlAV62Barcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63Barcodreo_PARM", GXutil.ltrim( localUtil.ntoc( AV63Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV63Barcodreo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63Barcodreo_CTRL", GXutil.rtrim( sCtrlAV63Barcodreo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64BarCodpar_PARM", GXutil.rtrim( AV64BarCodpar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV64BarCodpar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64BarCodpar_CTRL", GXutil.rtrim( sCtrlAV64BarCodpar));
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
      weIV2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115565655", true, true);
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
      httpContext.AddJavascriptSource("wclecturasproduccion.js", "?202682115565655", false, true);
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
      edtMaqCod_Internalname = sPrefix+"MAQCOD_"+sGXsfl_41_idx ;
      edtHisProFec_Internalname = sPrefix+"HISPROFEC_"+sGXsfl_41_idx ;
      edtHisProLin_Internalname = sPrefix+"HISPROLIN_"+sGXsfl_41_idx ;
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN_"+sGXsfl_41_idx ;
      edtFase_Internalname = sPrefix+"FASE_"+sGXsfl_41_idx ;
      edtFaseDsc_Internalname = sPrefix+"FASEDSC_"+sGXsfl_41_idx ;
      edtHisProTur_Internalname = sPrefix+"HISPROTUR_"+sGXsfl_41_idx ;
      edtHisProF_Internalname = sPrefix+"HISPROF_"+sGXsfl_41_idx ;
      edtHisProDTI_Internalname = sPrefix+"HISPRODTI_"+sGXsfl_41_idx ;
      edtHisProDTF_Internalname = sPrefix+"HISPRODTF_"+sGXsfl_41_idx ;
      edtHisProKgr_Internalname = sPrefix+"HISPROKGR_"+sGXsfl_41_idx ;
      edtHisProMtr_Internalname = sPrefix+"HISPROMTR_"+sGXsfl_41_idx ;
      edtHisProNpzs_Internalname = sPrefix+"HISPRONPZS_"+sGXsfl_41_idx ;
      edtGruOpeCod_Internalname = sPrefix+"GRUOPECOD_"+sGXsfl_41_idx ;
      edtavOpenom_Internalname = sPrefix+"vOPENOM_"+sGXsfl_41_idx ;
      edtParCod_Internalname = sPrefix+"PARCOD_"+sGXsfl_41_idx ;
      edtParCodNom_Internalname = sPrefix+"PARCODNOM_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      edtMaqCod_Internalname = sPrefix+"MAQCOD_"+sGXsfl_41_fel_idx ;
      edtHisProFec_Internalname = sPrefix+"HISPROFEC_"+sGXsfl_41_fel_idx ;
      edtHisProLin_Internalname = sPrefix+"HISPROLIN_"+sGXsfl_41_fel_idx ;
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN_"+sGXsfl_41_fel_idx ;
      edtFase_Internalname = sPrefix+"FASE_"+sGXsfl_41_fel_idx ;
      edtFaseDsc_Internalname = sPrefix+"FASEDSC_"+sGXsfl_41_fel_idx ;
      edtHisProTur_Internalname = sPrefix+"HISPROTUR_"+sGXsfl_41_fel_idx ;
      edtHisProF_Internalname = sPrefix+"HISPROF_"+sGXsfl_41_fel_idx ;
      edtHisProDTI_Internalname = sPrefix+"HISPRODTI_"+sGXsfl_41_fel_idx ;
      edtHisProDTF_Internalname = sPrefix+"HISPRODTF_"+sGXsfl_41_fel_idx ;
      edtHisProKgr_Internalname = sPrefix+"HISPROKGR_"+sGXsfl_41_fel_idx ;
      edtHisProMtr_Internalname = sPrefix+"HISPROMTR_"+sGXsfl_41_fel_idx ;
      edtHisProNpzs_Internalname = sPrefix+"HISPRONPZS_"+sGXsfl_41_fel_idx ;
      edtGruOpeCod_Internalname = sPrefix+"GRUOPECOD_"+sGXsfl_41_fel_idx ;
      edtavOpenom_Internalname = sPrefix+"vOPENOM_"+sGXsfl_41_fel_idx ;
      edtParCod_Internalname = sPrefix+"PARCOD_"+sGXsfl_41_fel_idx ;
      edtParCodNom_Internalname = sPrefix+"PARCODNOM_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wbIV0( ) ;
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_41_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProFec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProFec_Internalname,localUtil.format(A558HisProFec, "99/99/99"),localUtil.format( A558HisProFec, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisProFec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProLin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProLin_Internalname,GXutil.ltrim( localUtil.ntoc( A561HisProLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A561HisProLin), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProLin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarOrdLin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarOrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarOrdLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarOrdLin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFase_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFase_Internalname,GXutil.rtrim( A461Fase),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFase_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtFase_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFaseDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFaseDsc_Internalname,GXutil.rtrim( A7258FaseDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFaseDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtFaseDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProTur_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProTur_Internalname,GXutil.ltrim( localUtil.ntoc( A566HisProTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A566HisProTur), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProTur_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProTur_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisProF_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProF_Internalname,GXutil.rtrim( A557HisProF),GXutil.rtrim( localUtil.format( A557HisProF, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProF_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProDTI_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProDTI_Internalname,localUtil.ttoc( A4440HisProDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4440HisProDTI, "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProDTI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProDTI_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProDTF_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProDTF_Internalname,localUtil.ttoc( A4441HisProDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4441HisProDTF, "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProDTF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProDTF_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProKgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProKgr_Internalname,GXutil.ltrim( localUtil.ntoc( A1525HisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1525HisProKgr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProKgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProKgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProMtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A1526HisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1526HisProMtr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProMtr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProNpzs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProNpzs_Internalname,GXutil.ltrim( localUtil.ntoc( A4714HisProNpzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4714HisProNpzs), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProNpzs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProNpzs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtGruOpeCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGruOpeCod_Internalname,GXutil.ltrim( localUtil.ntoc( A503GruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A503GruOpeCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtGruOpeCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtGruOpeCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavOpenom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOpenom_Internalname,GXutil.rtrim( AV68OpeNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavOpenom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavOpenom_Visible),Integer.valueOf(edtavOpenom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtParCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParCod_Internalname,GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A656ParCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtParCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtParCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtParCodNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParCodNom_Internalname,GXutil.rtrim( A867ParCodNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtParCodNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtParCodNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesIV2( ) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProFec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProLin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarOrdLin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFase_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFaseDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProTur_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Turno", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProF_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "F?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProDTI_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProDTF_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProKgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "kgs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProMtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "mts", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProNpzs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "pcs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtGruOpeCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Operario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavOpenom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtParCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Paro", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtParCodNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A602MaqCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A558HisProFec, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProFec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A561HisProLin, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProLin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarOrdLin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A461Fase));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFase_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A7258FaseDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFaseDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A566HisProTur, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProTur_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A557HisProF));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProF_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4440HisProDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProDTI_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4441HisProDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProDTF_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1525HisProKgr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProKgr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1526HisProMtr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProMtr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4714HisProNpzs, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProNpzs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A503GruOpeCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtGruOpeCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV68OpeNom));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOpenom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavOpenom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtParCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A867ParCodNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtParCodNom_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtMaqCod_Internalname = sPrefix+"MAQCOD" ;
      edtHisProFec_Internalname = sPrefix+"HISPROFEC" ;
      edtHisProLin_Internalname = sPrefix+"HISPROLIN" ;
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN" ;
      edtFase_Internalname = sPrefix+"FASE" ;
      edtFaseDsc_Internalname = sPrefix+"FASEDSC" ;
      edtHisProTur_Internalname = sPrefix+"HISPROTUR" ;
      edtHisProF_Internalname = sPrefix+"HISPROF" ;
      edtHisProDTI_Internalname = sPrefix+"HISPRODTI" ;
      edtHisProDTF_Internalname = sPrefix+"HISPRODTF" ;
      edtHisProKgr_Internalname = sPrefix+"HISPROKGR" ;
      edtHisProMtr_Internalname = sPrefix+"HISPROMTR" ;
      edtHisProNpzs_Internalname = sPrefix+"HISPRONPZS" ;
      edtGruOpeCod_Internalname = sPrefix+"GRUOPECOD" ;
      edtavOpenom_Internalname = sPrefix+"vOPENOM" ;
      edtParCod_Internalname = sPrefix+"PARCOD" ;
      edtParCodNom_Internalname = sPrefix+"PARCODNOM" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_hisprofecauxdate_Internalname = sPrefix+"vDDO_HISPROFECAUXDATE" ;
      divDdo_hisprofecauxdates_Internalname = sPrefix+"DDO_HISPROFECAUXDATES" ;
      edtavDdo_hisprodtiauxdate_Internalname = sPrefix+"vDDO_HISPRODTIAUXDATE" ;
      divDdo_hisprodtiauxdates_Internalname = sPrefix+"DDO_HISPRODTIAUXDATES" ;
      edtavDdo_hisprodtfauxdate_Internalname = sPrefix+"vDDO_HISPRODTFAUXDATE" ;
      divDdo_hisprodtfauxdates_Internalname = sPrefix+"DDO_HISPRODTFAUXDATES" ;
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
      edtParCodNom_Jsonclick = "" ;
      edtParCod_Jsonclick = "" ;
      edtavOpenom_Jsonclick = "" ;
      edtavOpenom_Enabled = 0 ;
      edtGruOpeCod_Jsonclick = "" ;
      edtHisProNpzs_Jsonclick = "" ;
      edtHisProMtr_Jsonclick = "" ;
      edtHisProKgr_Jsonclick = "" ;
      edtHisProDTF_Jsonclick = "" ;
      edtHisProDTI_Jsonclick = "" ;
      edtHisProF_Jsonclick = "" ;
      edtHisProTur_Jsonclick = "" ;
      edtFaseDsc_Jsonclick = "" ;
      edtFase_Jsonclick = "" ;
      edtBarOrdLin_Jsonclick = "" ;
      edtHisProLin_Jsonclick = "" ;
      edtHisProFec_Jsonclick = "" ;
      edtMaqCod_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtParCodNom_Visible = -1 ;
      edtParCod_Visible = -1 ;
      edtavOpenom_Visible = -1 ;
      edtGruOpeCod_Visible = -1 ;
      edtHisProNpzs_Visible = -1 ;
      edtHisProMtr_Visible = -1 ;
      edtHisProKgr_Visible = -1 ;
      edtHisProDTF_Visible = -1 ;
      edtHisProDTI_Visible = -1 ;
      edtHisProF_Visible = -1 ;
      edtHisProTur_Visible = -1 ;
      edtFaseDsc_Visible = -1 ;
      edtFase_Visible = -1 ;
      edtBarOrdLin_Visible = -1 ;
      edtHisProLin_Visible = -1 ;
      edtHisProFec_Visible = -1 ;
      edtMaqCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_hisprodtfauxdate_Jsonclick = "" ;
      edtavDdo_hisprodtiauxdate_Jsonclick = "" ;
      edtavDdo_hisprofecauxdate_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Visible = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Visible = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Visible = 1 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "WCLecturasProduccionGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic||||Dynamic|Dynamic||Dynamic|||||||||Dynamic" ;
      Ddo_grid_Includedatalist = "T||||T|T||T|||||||||T" ;
      Ddo_grid_Filterisrange = "||T|T|||T||||T|T|T|T||T|" ;
      Ddo_grid_Filtertype = "Character|Date|Numeric|Numeric|Character|Character|Numeric|Character|Date|Date|Numeric|Numeric|Numeric|Numeric||Numeric|Character" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|T|T|T|T||T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T||T|T|T|T|T|T|T|T||T|T" ;
      Ddo_grid_Columnssortvalues = "3|4|2|1|5||6|7|8|9|10|11|12|13||14|15" ;
      Ddo_grid_Columnids = "0:MaqCod|1:HisProFec|2:HisProLin|3:BarOrdLin|4:Fase|5:FaseDsc|6:HisProTur|7:HisProF|8:HisProDTI|9:HisProDTF|10:HisProKgr|11:HisProMtr|12:HisProNpzs|13:GruOpeCod|14:OpeNom|15:ParCod|16:ParCodNom" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A461Fase',fld:'FASE',pic:''},{av:'A7258FaseDsc',fld:'FASEDSC',pic:''},{av:'A566HisProTur',fld:'HISPROTUR',pic:'9'},{av:'A557HisProF',fld:'HISPROF',pic:'@!'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A4714HisProNpzs',fld:'HISPRONPZS',pic:'ZZZ9'},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A867ParCodNom',fld:'PARCODNOM',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV113Wclecturasproduccionds_1_emprcod',fld:'vWCLECTURASPRODUCCIONDS_1_EMPRCOD',pic:'@!'},{av:'sPrefix'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV61Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV62Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV63Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV64BarCodpar',fld:'vBARCODPAR',pic:''},{av:'AV106FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV41TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV43TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV48TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV49TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV51TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV52TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV54TFFase',fld:'vTFFASE',pic:''},{av:'AV55TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV70TFFaseDsc',fld:'vTFFASEDSC',pic:''},{av:'AV71TFFaseDsc_Sel',fld:'vTFFASEDSC_SEL',pic:''},{av:'AV92TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV93TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV95TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV96TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV73TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV78TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV98TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV99TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV101TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV102TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV104TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV105TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV83TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV84TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV86TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV87TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV89TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV90TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV147Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtHisProFec_Visible',ctrl:'HISPROFEC',prop:'Visible'},{av:'edtHisProLin_Visible',ctrl:'HISPROLIN',prop:'Visible'},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtFase_Visible',ctrl:'FASE',prop:'Visible'},{av:'edtFaseDsc_Visible',ctrl:'FASEDSC',prop:'Visible'},{av:'edtHisProTur_Visible',ctrl:'HISPROTUR',prop:'Visible'},{av:'edtHisProF_Visible',ctrl:'HISPROF',prop:'Visible'},{av:'edtHisProDTI_Visible',ctrl:'HISPRODTI',prop:'Visible'},{av:'edtHisProDTF_Visible',ctrl:'HISPRODTF',prop:'Visible'},{av:'edtHisProKgr_Visible',ctrl:'HISPROKGR',prop:'Visible'},{av:'edtHisProMtr_Visible',ctrl:'HISPROMTR',prop:'Visible'},{av:'edtHisProNpzs_Visible',ctrl:'HISPRONPZS',prop:'Visible'},{av:'edtGruOpeCod_Visible',ctrl:'GRUOPECOD',prop:'Visible'},{av:'edtavOpenom_Visible',ctrl:'vOPENOM',prop:'Visible'},{av:'edtParCod_Visible',ctrl:'PARCOD',prop:'Visible'},{av:'edtParCodNom_Visible',ctrl:'PARCODNOM',prop:'Visible'},{av:'AV59GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV60GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV36ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12IV2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A461Fase',fld:'FASE',pic:''},{av:'A7258FaseDsc',fld:'FASEDSC',pic:''},{av:'A566HisProTur',fld:'HISPROTUR',pic:'9'},{av:'A557HisProF',fld:'HISPROF',pic:'@!'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A4714HisProNpzs',fld:'HISPRONPZS',pic:'ZZZ9'},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A867ParCodNom',fld:'PARCODNOM',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV61Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV62Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV63Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV64BarCodpar',fld:'vBARCODPAR',pic:''},{av:'AV106FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV41TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV43TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV48TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV49TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV51TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV52TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV54TFFase',fld:'vTFFASE',pic:''},{av:'AV55TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV70TFFaseDsc',fld:'vTFFASEDSC',pic:''},{av:'AV71TFFaseDsc_Sel',fld:'vTFFASEDSC_SEL',pic:''},{av:'AV92TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV93TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV95TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV96TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV73TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV78TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV98TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV99TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV101TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV102TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV104TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV105TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV83TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV84TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV86TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV87TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV89TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV90TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV147Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV113Wclecturasproduccionds_1_emprcod',fld:'vWCLECTURASPRODUCCIONDS_1_EMPRCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13IV2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A461Fase',fld:'FASE',pic:''},{av:'A7258FaseDsc',fld:'FASEDSC',pic:''},{av:'A566HisProTur',fld:'HISPROTUR',pic:'9'},{av:'A557HisProF',fld:'HISPROF',pic:'@!'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A4714HisProNpzs',fld:'HISPRONPZS',pic:'ZZZ9'},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A867ParCodNom',fld:'PARCODNOM',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV61Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV62Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV63Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV64BarCodpar',fld:'vBARCODPAR',pic:''},{av:'AV106FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV41TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV43TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV48TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV49TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV51TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV52TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV54TFFase',fld:'vTFFASE',pic:''},{av:'AV55TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV70TFFaseDsc',fld:'vTFFASEDSC',pic:''},{av:'AV71TFFaseDsc_Sel',fld:'vTFFASEDSC_SEL',pic:''},{av:'AV92TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV93TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV95TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV96TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV73TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV78TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV98TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV99TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV101TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV102TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV104TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV105TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV83TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV84TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV86TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV87TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV89TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV90TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV147Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV113Wclecturasproduccionds_1_emprcod',fld:'vWCLECTURASPRODUCCIONDS_1_EMPRCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14IV2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A461Fase',fld:'FASE',pic:''},{av:'A7258FaseDsc',fld:'FASEDSC',pic:''},{av:'A566HisProTur',fld:'HISPROTUR',pic:'9'},{av:'A557HisProF',fld:'HISPROF',pic:'@!'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A4714HisProNpzs',fld:'HISPRONPZS',pic:'ZZZ9'},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A867ParCodNom',fld:'PARCODNOM',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV61Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV62Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV63Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV64BarCodpar',fld:'vBARCODPAR',pic:''},{av:'AV106FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV41TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV43TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV48TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV49TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV51TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV52TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV54TFFase',fld:'vTFFASE',pic:''},{av:'AV55TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV70TFFaseDsc',fld:'vTFFASEDSC',pic:''},{av:'AV71TFFaseDsc_Sel',fld:'vTFFASEDSC_SEL',pic:''},{av:'AV92TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV93TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV95TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV96TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV73TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV78TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV98TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV99TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV101TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV102TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV104TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV105TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV83TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV84TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV86TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV87TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV89TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV90TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV147Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV113Wclecturasproduccionds_1_emprcod',fld:'vWCLECTURASPRODUCCIONDS_1_EMPRCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV89TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV90TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV86TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV87TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV83TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV84TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV104TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV105TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV101TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV102TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV98TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV99TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV78TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV73TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV95TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV96TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV92TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV93TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV70TFFaseDsc',fld:'vTFFASEDSC',pic:''},{av:'AV71TFFaseDsc_Sel',fld:'vTFFASEDSC_SEL',pic:''},{av:'AV54TFFase',fld:'vTFFASE',pic:''},{av:'AV55TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV51TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV52TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV48TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV49TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV43TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV40TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV41TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e20IV2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV68OpeNom',fld:'vOPENOM',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e15IV2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A461Fase',fld:'FASE',pic:''},{av:'A7258FaseDsc',fld:'FASEDSC',pic:''},{av:'A566HisProTur',fld:'HISPROTUR',pic:'9'},{av:'A557HisProF',fld:'HISPROF',pic:'@!'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A4714HisProNpzs',fld:'HISPRONPZS',pic:'ZZZ9'},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A867ParCodNom',fld:'PARCODNOM',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV61Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV62Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV63Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV64BarCodpar',fld:'vBARCODPAR',pic:''},{av:'AV106FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV41TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV43TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV48TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV49TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV51TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV52TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV54TFFase',fld:'vTFFASE',pic:''},{av:'AV55TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV70TFFaseDsc',fld:'vTFFASEDSC',pic:''},{av:'AV71TFFaseDsc_Sel',fld:'vTFFASEDSC_SEL',pic:''},{av:'AV92TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV93TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV95TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV96TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV73TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV78TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV98TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV99TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV101TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV102TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV104TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV105TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV83TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV84TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV86TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV87TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV89TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV90TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV147Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV113Wclecturasproduccionds_1_emprcod',fld:'vWCLECTURASPRODUCCIONDS_1_EMPRCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtHisProFec_Visible',ctrl:'HISPROFEC',prop:'Visible'},{av:'edtHisProLin_Visible',ctrl:'HISPROLIN',prop:'Visible'},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtFase_Visible',ctrl:'FASE',prop:'Visible'},{av:'edtFaseDsc_Visible',ctrl:'FASEDSC',prop:'Visible'},{av:'edtHisProTur_Visible',ctrl:'HISPROTUR',prop:'Visible'},{av:'edtHisProF_Visible',ctrl:'HISPROF',prop:'Visible'},{av:'edtHisProDTI_Visible',ctrl:'HISPRODTI',prop:'Visible'},{av:'edtHisProDTF_Visible',ctrl:'HISPRODTF',prop:'Visible'},{av:'edtHisProKgr_Visible',ctrl:'HISPROKGR',prop:'Visible'},{av:'edtHisProMtr_Visible',ctrl:'HISPROMTR',prop:'Visible'},{av:'edtHisProNpzs_Visible',ctrl:'HISPRONPZS',prop:'Visible'},{av:'edtGruOpeCod_Visible',ctrl:'GRUOPECOD',prop:'Visible'},{av:'edtavOpenom_Visible',ctrl:'vOPENOM',prop:'Visible'},{av:'edtParCod_Visible',ctrl:'PARCOD',prop:'Visible'},{av:'edtParCodNom_Visible',ctrl:'PARCODNOM',prop:'Visible'},{av:'AV59GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV60GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV36ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11IV2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A461Fase',fld:'FASE',pic:''},{av:'A7258FaseDsc',fld:'FASEDSC',pic:''},{av:'A566HisProTur',fld:'HISPROTUR',pic:'9'},{av:'A557HisProF',fld:'HISPROF',pic:'@!'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A4714HisProNpzs',fld:'HISPRONPZS',pic:'ZZZ9'},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A867ParCodNom',fld:'PARCODNOM',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV61Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV62Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV63Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV64BarCodpar',fld:'vBARCODPAR',pic:''},{av:'AV106FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV41TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV43TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV48TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV49TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV51TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV52TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV54TFFase',fld:'vTFFASE',pic:''},{av:'AV55TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV70TFFaseDsc',fld:'vTFFASEDSC',pic:''},{av:'AV71TFFaseDsc_Sel',fld:'vTFFASEDSC_SEL',pic:''},{av:'AV92TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV93TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV95TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV96TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV73TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV78TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV98TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV99TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV101TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV102TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV104TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV105TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV83TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV84TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV86TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV87TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV89TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV90TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV147Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV113Wclecturasproduccionds_1_emprcod',fld:'vWCLECTURASPRODUCCIONDS_1_EMPRCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV75DDO_HisProDTIAuxDate',fld:'vDDO_HISPRODTIAUXDATE',pic:''},{av:'AV80DDO_HisProDTFAuxDate',fld:'vDDO_HISPRODTFAUXDATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV106FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV41TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV43TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV48TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV49TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV51TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV52TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV54TFFase',fld:'vTFFASE',pic:''},{av:'AV55TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV70TFFaseDsc',fld:'vTFFASEDSC',pic:''},{av:'AV71TFFaseDsc_Sel',fld:'vTFFASEDSC_SEL',pic:''},{av:'AV92TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV93TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV95TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV96TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV73TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV78TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV98TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV99TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV101TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV102TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV104TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV105TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV83TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV84TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV86TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV87TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV89TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV90TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV80DDO_HisProDTFAuxDate',fld:'vDDO_HISPRODTFAUXDATE',pic:''},{av:'AV75DDO_HisProDTIAuxDate',fld:'vDDO_HISPRODTIAUXDATE',pic:''},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtHisProFec_Visible',ctrl:'HISPROFEC',prop:'Visible'},{av:'edtHisProLin_Visible',ctrl:'HISPROLIN',prop:'Visible'},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtFase_Visible',ctrl:'FASE',prop:'Visible'},{av:'edtFaseDsc_Visible',ctrl:'FASEDSC',prop:'Visible'},{av:'edtHisProTur_Visible',ctrl:'HISPROTUR',prop:'Visible'},{av:'edtHisProF_Visible',ctrl:'HISPROF',prop:'Visible'},{av:'edtHisProDTI_Visible',ctrl:'HISPRODTI',prop:'Visible'},{av:'edtHisProDTF_Visible',ctrl:'HISPRODTF',prop:'Visible'},{av:'edtHisProKgr_Visible',ctrl:'HISPROKGR',prop:'Visible'},{av:'edtHisProMtr_Visible',ctrl:'HISPROMTR',prop:'Visible'},{av:'edtHisProNpzs_Visible',ctrl:'HISPRONPZS',prop:'Visible'},{av:'edtGruOpeCod_Visible',ctrl:'GRUOPECOD',prop:'Visible'},{av:'edtavOpenom_Visible',ctrl:'vOPENOM',prop:'Visible'},{av:'edtParCod_Visible',ctrl:'PARCOD',prop:'Visible'},{av:'edtParCodNom_Visible',ctrl:'PARCODNOM',prop:'Visible'},{av:'AV59GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV60GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV36ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e16IV2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e17IV2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Parcodnom',iparms:[]");
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
      wcpOAV61Emprcod = "" ;
      wcpOAV64BarCodpar = "" ;
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
      AV61Emprcod = "" ;
      AV64BarCodpar = "" ;
      A461Fase = "" ;
      A7258FaseDsc = "" ;
      A557HisProF = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A867ParCodNom = "" ;
      A130BarCodPar = "" ;
      AV33ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV106FilterFullText = "" ;
      AV40TFMaqCod = "" ;
      AV41TFMaqCod_Sel = "" ;
      AV43TFHisProFec = GXutil.nullDate() ;
      AV54TFFase = "" ;
      AV55TFFase_Sel = "" ;
      AV70TFFaseDsc = "" ;
      AV71TFFaseDsc_Sel = "" ;
      AV95TFHisProF = "" ;
      AV96TFHisProF_Sel = "" ;
      AV73TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV78TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV98TFHisProKgr = DecimalUtil.ZERO ;
      AV99TFHisProKgr_To = DecimalUtil.ZERO ;
      AV101TFHisProMtr = DecimalUtil.ZERO ;
      AV102TFHisProMtr_To = DecimalUtil.ZERO ;
      AV89TFParCodNom = "" ;
      AV90TFParCodNom_Sel = "" ;
      AV147Pgmname = "" ;
      AV113Wclecturasproduccionds_1_emprcod = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV36ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV57DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
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
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV45DDO_HisProFecAuxDate = GXutil.nullDate() ;
      AV75DDO_HisProDTIAuxDate = GXutil.nullDate() ;
      AV80DDO_HisProDTFAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV68OpeNom = "" ;
      scmdbuf = "" ;
      lV117Wclecturasproduccionds_5_filterfulltext = "" ;
      lV127Wclecturasproduccionds_15_tffasedsc = "" ;
      lV118Wclecturasproduccionds_6_tfmaqcod = "" ;
      AV119Wclecturasproduccionds_7_tfmaqcod_sel = "" ;
      AV118Wclecturasproduccionds_6_tfmaqcod = "" ;
      AV120Wclecturasproduccionds_8_tfhisprofec = GXutil.nullDate() ;
      AV126Wclecturasproduccionds_14_tffase_sel = "" ;
      AV125Wclecturasproduccionds_13_tffase = "" ;
      AV132Wclecturasproduccionds_20_tfhisprof_sel = "" ;
      AV131Wclecturasproduccionds_19_tfhisprof = "" ;
      AV133Wclecturasproduccionds_21_tfhisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV134Wclecturasproduccionds_22_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV135Wclecturasproduccionds_23_tfhisprokgr = DecimalUtil.ZERO ;
      AV136Wclecturasproduccionds_24_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV137Wclecturasproduccionds_25_tfhispromtr = DecimalUtil.ZERO ;
      AV138Wclecturasproduccionds_26_tfhispromtr_to = DecimalUtil.ZERO ;
      AV146Wclecturasproduccionds_34_tfparcodnom_sel = "" ;
      AV145Wclecturasproduccionds_33_tfparcodnom = "" ;
      AV117Wclecturasproduccionds_5_filterfulltext = "" ;
      AV128Wclecturasproduccionds_16_tffasedsc_sel = "" ;
      AV127Wclecturasproduccionds_15_tffasedsc = "" ;
      AV116Wclecturasproduccionds_4_barcodpar = "" ;
      H00IV2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00IV2_A602MaqCod = new String[] {""} ;
      H00IV2_A396EmprCod = new String[] {""} ;
      H00IV3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV110Station = "" ;
      AV111Emprnom = "" ;
      AV112Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35Session = httpContext.getWebSession();
      AV31ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV37ManageFiltersXml = "" ;
      AV29ExcelFilename = "" ;
      AV30ErrorMessage = "" ;
      AV32UserCustomValue = "" ;
      AV34ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char16 = "" ;
      GXv_char17 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState18 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      AV9TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV61Emprcod = "" ;
      sCtrlAV62Barcod = "" ;
      sCtrlAV63Barcodreo = "" ;
      sCtrlAV64BarCodpar = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wclecturasproduccion__default(),
         new Object[] {
             new Object[] {
            H00IV2_A558HisProFec, H00IV2_A602MaqCod, H00IV2_A396EmprCod
            }
            , new Object[] {
            H00IV3_AGRID_nRecordCount
            }
         }
      );
      AV147Pgmname = "WCLecturasProduccion" ;
      /* GeneXus formulas. */
      AV147Pgmname = "WCLecturasProduccion" ;
      Gx_err = (short)(0) ;
      edtavOpenom_Enabled = 0 ;
   }

   private byte wcpOAV63Barcodreo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV63Barcodreo ;
   private byte A566HisProTur ;
   private byte A132BarCodReo ;
   private byte AV38ManageFiltersExecutionStep ;
   private byte AV92TFHisProTur ;
   private byte AV93TFHisProTur_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV129Wclecturasproduccionds_17_tfhisprotur ;
   private byte AV130Wclecturasproduccionds_18_tfhisprotur_to ;
   private byte AV115Wclecturasproduccionds_3_barcodreo ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short A194BarOrdLin ;
   private short A4714HisProNpzs ;
   private short A656ParCod ;
   private short AV51TFBarOrdLin ;
   private short AV52TFBarOrdLin_To ;
   private short AV104TFHisProNpzs ;
   private short AV105TFHisProNpzs_To ;
   private short AV86TFParCod ;
   private short AV87TFParCod_To ;
   private short AV13OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV123Wclecturasproduccionds_11_tfbarordlin ;
   private short AV124Wclecturasproduccionds_12_tfbarordlin_to ;
   private short AV139Wclecturasproduccionds_27_tfhispronpzs ;
   private short AV140Wclecturasproduccionds_28_tfhispronpzs_to ;
   private short AV143Wclecturasproduccionds_31_tfparcod ;
   private short AV144Wclecturasproduccionds_32_tfparcod_to ;
   private int wcpOAV62Barcod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_41 ;
   private int AV62Barcod ;
   private int nGXsfl_41_idx=1 ;
   private int A561HisProLin ;
   private int A503GruOpeCod ;
   private int A129BarCod ;
   private int AV48TFHisProLin ;
   private int AV49TFHisProLin_To ;
   private int AV83TFGruOpeCod ;
   private int AV84TFGruOpeCod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtEmprCod_Visible ;
   private int edtBarCod_Visible ;
   private int edtBarCodReo_Visible ;
   private int edtBarCodPar_Visible ;
   private int subGrid_Islastpage ;
   private int edtavOpenom_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV121Wclecturasproduccionds_9_tfhisprolin ;
   private int AV122Wclecturasproduccionds_10_tfhisprolin_to ;
   private int AV141Wclecturasproduccionds_29_tfgruopecod ;
   private int AV142Wclecturasproduccionds_30_tfgruopecod_to ;
   private int AV114Wclecturasproduccionds_2_barcod ;
   private int edtMaqCod_Visible ;
   private int edtHisProFec_Visible ;
   private int edtHisProLin_Visible ;
   private int edtBarOrdLin_Visible ;
   private int edtFase_Visible ;
   private int edtFaseDsc_Visible ;
   private int edtHisProTur_Visible ;
   private int edtHisProF_Visible ;
   private int edtHisProDTI_Visible ;
   private int edtHisProDTF_Visible ;
   private int edtHisProKgr_Visible ;
   private int edtHisProMtr_Visible ;
   private int edtHisProNpzs_Visible ;
   private int edtGruOpeCod_Visible ;
   private int edtavOpenom_Visible ;
   private int edtParCod_Visible ;
   private int edtParCodNom_Visible ;
   private int AV58PageToGo ;
   private int AV148GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV59GridCurrentPage ;
   private long AV60GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV98TFHisProKgr ;
   private java.math.BigDecimal AV99TFHisProKgr_To ;
   private java.math.BigDecimal AV101TFHisProMtr ;
   private java.math.BigDecimal AV102TFHisProMtr_To ;
   private java.math.BigDecimal AV135Wclecturasproduccionds_23_tfhisprokgr ;
   private java.math.BigDecimal AV136Wclecturasproduccionds_24_tfhisprokgr_to ;
   private java.math.BigDecimal AV137Wclecturasproduccionds_25_tfhispromtr ;
   private java.math.BigDecimal AV138Wclecturasproduccionds_26_tfhispromtr_to ;
   private String wcpOAV61Emprcod ;
   private String wcpOAV64BarCodpar ;
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
   private String AV61Emprcod ;
   private String AV64BarCodpar ;
   private String sGXsfl_41_idx="0001" ;
   private String A461Fase ;
   private String A7258FaseDsc ;
   private String A557HisProF ;
   private String A867ParCodNom ;
   private String A130BarCodPar ;
   private String AV40TFMaqCod ;
   private String AV41TFMaqCod_Sel ;
   private String AV54TFFase ;
   private String AV55TFFase_Sel ;
   private String AV70TFFaseDsc ;
   private String AV71TFFaseDsc_Sel ;
   private String AV95TFHisProF ;
   private String AV96TFHisProF_Sel ;
   private String AV89TFParCodNom ;
   private String AV90TFParCodNom_Sel ;
   private String AV147Pgmname ;
   private String AV113Wclecturasproduccionds_1_emprcod ;
   private String A396EmprCod ;
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
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_hisprofecauxdates_Internalname ;
   private String edtavDdo_hisprofecauxdate_Internalname ;
   private String edtavDdo_hisprofecauxdate_Jsonclick ;
   private String divDdo_hisprodtiauxdates_Internalname ;
   private String edtavDdo_hisprodtiauxdate_Internalname ;
   private String edtavDdo_hisprodtiauxdate_Jsonclick ;
   private String divDdo_hisprodtfauxdates_Internalname ;
   private String edtavDdo_hisprodtfauxdate_Internalname ;
   private String edtavDdo_hisprodtfauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String A602MaqCod ;
   private String edtMaqCod_Internalname ;
   private String edtHisProFec_Internalname ;
   private String edtHisProLin_Internalname ;
   private String edtBarOrdLin_Internalname ;
   private String edtFase_Internalname ;
   private String edtFaseDsc_Internalname ;
   private String edtHisProTur_Internalname ;
   private String edtHisProF_Internalname ;
   private String edtHisProDTI_Internalname ;
   private String edtHisProDTF_Internalname ;
   private String edtHisProKgr_Internalname ;
   private String edtHisProMtr_Internalname ;
   private String edtHisProNpzs_Internalname ;
   private String edtGruOpeCod_Internalname ;
   private String AV68OpeNom ;
   private String edtavOpenom_Internalname ;
   private String edtParCod_Internalname ;
   private String edtParCodNom_Internalname ;
   private String scmdbuf ;
   private String lV127Wclecturasproduccionds_15_tffasedsc ;
   private String lV118Wclecturasproduccionds_6_tfmaqcod ;
   private String AV119Wclecturasproduccionds_7_tfmaqcod_sel ;
   private String AV118Wclecturasproduccionds_6_tfmaqcod ;
   private String AV126Wclecturasproduccionds_14_tffase_sel ;
   private String AV125Wclecturasproduccionds_13_tffase ;
   private String AV132Wclecturasproduccionds_20_tfhisprof_sel ;
   private String AV131Wclecturasproduccionds_19_tfhisprof ;
   private String AV146Wclecturasproduccionds_34_tfparcodnom_sel ;
   private String AV145Wclecturasproduccionds_33_tfparcodnom ;
   private String AV128Wclecturasproduccionds_16_tffasedsc_sel ;
   private String AV127Wclecturasproduccionds_15_tffasedsc ;
   private String AV116Wclecturasproduccionds_4_barcodpar ;
   private String hsh ;
   private String AV110Station ;
   private String AV111Emprnom ;
   private String AV112Usurcod ;
   private String GXt_char16 ;
   private String GXv_char17[] ;
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV61Emprcod ;
   private String sCtrlAV62Barcod ;
   private String sCtrlAV63Barcodreo ;
   private String sCtrlAV64BarCodpar ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtMaqCod_Jsonclick ;
   private String edtHisProFec_Jsonclick ;
   private String edtHisProLin_Jsonclick ;
   private String edtBarOrdLin_Jsonclick ;
   private String edtFase_Jsonclick ;
   private String edtFaseDsc_Jsonclick ;
   private String edtHisProTur_Jsonclick ;
   private String edtHisProF_Jsonclick ;
   private String edtHisProDTI_Jsonclick ;
   private String edtHisProDTF_Jsonclick ;
   private String edtHisProKgr_Jsonclick ;
   private String edtHisProMtr_Jsonclick ;
   private String edtHisProNpzs_Jsonclick ;
   private String edtGruOpeCod_Jsonclick ;
   private String edtavOpenom_Jsonclick ;
   private String edtParCod_Jsonclick ;
   private String edtParCodNom_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV73TFHisProDTI ;
   private java.util.Date AV78TFHisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV133Wclecturasproduccionds_21_tfhisprodti ;
   private java.util.Date AV134Wclecturasproduccionds_22_tfhisprodtf ;
   private java.util.Date AV43TFHisProFec ;
   private java.util.Date AV45DDO_HisProFecAuxDate ;
   private java.util.Date AV75DDO_HisProDTIAuxDate ;
   private java.util.Date AV80DDO_HisProDTFAuxDate ;
   private java.util.Date A558HisProFec ;
   private java.util.Date AV120Wclecturasproduccionds_8_tfhisprofec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV14OrderedDsc ;
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
   private boolean bGXsfl_41_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV31ColumnsSelectorXML ;
   private String AV37ManageFiltersXml ;
   private String AV32UserCustomValue ;
   private String AV106FilterFullText ;
   private String lV117Wclecturasproduccionds_5_filterfulltext ;
   private String AV117Wclecturasproduccionds_5_filterfulltext ;
   private String AV29ExcelFilename ;
   private String AV30ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H00IV2_A558HisProFec ;
   private String[] H00IV2_A602MaqCod ;
   private String[] H00IV2_A396EmprCod ;
   private long[] H00IV3_AGRID_nRecordCount ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV36ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV9TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState18[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV33ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV34ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV57DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class wclecturasproduccion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00IV2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV119Wclecturasproduccionds_7_tfmaqcod_sel ,
                                          String AV118Wclecturasproduccionds_6_tfmaqcod ,
                                          java.util.Date AV120Wclecturasproduccionds_8_tfhisprofec ,
                                          int AV121Wclecturasproduccionds_9_tfhisprolin ,
                                          int AV122Wclecturasproduccionds_10_tfhisprolin_to ,
                                          short AV123Wclecturasproduccionds_11_tfbarordlin ,
                                          short AV124Wclecturasproduccionds_12_tfbarordlin_to ,
                                          String AV126Wclecturasproduccionds_14_tffase_sel ,
                                          String AV125Wclecturasproduccionds_13_tffase ,
                                          byte AV129Wclecturasproduccionds_17_tfhisprotur ,
                                          byte AV130Wclecturasproduccionds_18_tfhisprotur_to ,
                                          String AV132Wclecturasproduccionds_20_tfhisprof_sel ,
                                          String AV131Wclecturasproduccionds_19_tfhisprof ,
                                          java.util.Date AV133Wclecturasproduccionds_21_tfhisprodti ,
                                          java.util.Date AV134Wclecturasproduccionds_22_tfhisprodtf ,
                                          java.math.BigDecimal AV135Wclecturasproduccionds_23_tfhisprokgr ,
                                          java.math.BigDecimal AV136Wclecturasproduccionds_24_tfhisprokgr_to ,
                                          java.math.BigDecimal AV137Wclecturasproduccionds_25_tfhispromtr ,
                                          java.math.BigDecimal AV138Wclecturasproduccionds_26_tfhispromtr_to ,
                                          short AV139Wclecturasproduccionds_27_tfhispronpzs ,
                                          short AV140Wclecturasproduccionds_28_tfhispronpzs_to ,
                                          int AV141Wclecturasproduccionds_29_tfgruopecod ,
                                          int AV142Wclecturasproduccionds_30_tfgruopecod_to ,
                                          short AV143Wclecturasproduccionds_31_tfparcod ,
                                          short AV144Wclecturasproduccionds_32_tfparcod_to ,
                                          String AV146Wclecturasproduccionds_34_tfparcodnom_sel ,
                                          String AV145Wclecturasproduccionds_33_tfparcodnom ,
                                          String A602MaqCod ,
                                          java.util.Date A558HisProFec ,
                                          int A561HisProLin ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          byte A566HisProTur ,
                                          String A557HisProF ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          int A503GruOpeCod ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String AV117Wclecturasproduccionds_5_filterfulltext ,
                                          String A7258FaseDsc ,
                                          String AV128Wclecturasproduccionds_16_tffasedsc_sel ,
                                          String AV127Wclecturasproduccionds_15_tffasedsc ,
                                          int A129BarCod ,
                                          int AV114Wclecturasproduccionds_2_barcod ,
                                          byte A132BarCodReo ,
                                          byte AV115Wclecturasproduccionds_3_barcodreo ,
                                          String A130BarCodPar ,
                                          String AV116Wclecturasproduccionds_4_barcodpar ,
                                          String A396EmprCod ,
                                          String AV61Emprcod ,
                                          String AV113Wclecturasproduccionds_1_emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[49];
      Object[] GXv_Object20 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " HisProFec, MaqCod, EmprCod" ;
      sFromString = " FROM TXPCHIPRO" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'90'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(?) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ? = ?))");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( (GXutil.strcmp("", AV119Wclecturasproduccionds_7_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV118Wclecturasproduccionds_6_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Wclecturasproduccionds_7_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MaqCod = ?)");
      }
      else
      {
         GXv_int19[42] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV120Wclecturasproduccionds_8_tfhisprofec)) )
      {
         addWhere(sWhereString, "(HisProFec >= ?)");
      }
      else
      {
         GXv_int19[43] = (byte)(1) ;
      }
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, MaqCod" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, MaqCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, HisProFec" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, HisProFec DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, MaqCod, HisProFec" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_H00IV3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV119Wclecturasproduccionds_7_tfmaqcod_sel ,
                                          String AV118Wclecturasproduccionds_6_tfmaqcod ,
                                          java.util.Date AV120Wclecturasproduccionds_8_tfhisprofec ,
                                          int AV121Wclecturasproduccionds_9_tfhisprolin ,
                                          int AV122Wclecturasproduccionds_10_tfhisprolin_to ,
                                          short AV123Wclecturasproduccionds_11_tfbarordlin ,
                                          short AV124Wclecturasproduccionds_12_tfbarordlin_to ,
                                          String AV126Wclecturasproduccionds_14_tffase_sel ,
                                          String AV125Wclecturasproduccionds_13_tffase ,
                                          byte AV129Wclecturasproduccionds_17_tfhisprotur ,
                                          byte AV130Wclecturasproduccionds_18_tfhisprotur_to ,
                                          String AV132Wclecturasproduccionds_20_tfhisprof_sel ,
                                          String AV131Wclecturasproduccionds_19_tfhisprof ,
                                          java.util.Date AV133Wclecturasproduccionds_21_tfhisprodti ,
                                          java.util.Date AV134Wclecturasproduccionds_22_tfhisprodtf ,
                                          java.math.BigDecimal AV135Wclecturasproduccionds_23_tfhisprokgr ,
                                          java.math.BigDecimal AV136Wclecturasproduccionds_24_tfhisprokgr_to ,
                                          java.math.BigDecimal AV137Wclecturasproduccionds_25_tfhispromtr ,
                                          java.math.BigDecimal AV138Wclecturasproduccionds_26_tfhispromtr_to ,
                                          short AV139Wclecturasproduccionds_27_tfhispronpzs ,
                                          short AV140Wclecturasproduccionds_28_tfhispronpzs_to ,
                                          int AV141Wclecturasproduccionds_29_tfgruopecod ,
                                          int AV142Wclecturasproduccionds_30_tfgruopecod_to ,
                                          short AV143Wclecturasproduccionds_31_tfparcod ,
                                          short AV144Wclecturasproduccionds_32_tfparcod_to ,
                                          String AV146Wclecturasproduccionds_34_tfparcodnom_sel ,
                                          String AV145Wclecturasproduccionds_33_tfparcodnom ,
                                          String A602MaqCod ,
                                          java.util.Date A558HisProFec ,
                                          int A561HisProLin ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          byte A566HisProTur ,
                                          String A557HisProF ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          int A503GruOpeCod ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String AV117Wclecturasproduccionds_5_filterfulltext ,
                                          String A7258FaseDsc ,
                                          String AV128Wclecturasproduccionds_16_tffasedsc_sel ,
                                          String AV127Wclecturasproduccionds_15_tffasedsc ,
                                          int A129BarCod ,
                                          int AV114Wclecturasproduccionds_2_barcod ,
                                          byte A132BarCodReo ,
                                          byte AV115Wclecturasproduccionds_3_barcodreo ,
                                          String A130BarCodPar ,
                                          String AV116Wclecturasproduccionds_4_barcodpar ,
                                          String A396EmprCod ,
                                          String AV61Emprcod ,
                                          String AV113Wclecturasproduccionds_1_emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[44];
      Object[] GXv_Object22 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPCHIPRO" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'90'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(?) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ? = ?))");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( (GXutil.strcmp("", AV119Wclecturasproduccionds_7_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV118Wclecturasproduccionds_6_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Wclecturasproduccionds_7_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MaqCod = ?)");
      }
      else
      {
         GXv_int21[42] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV120Wclecturasproduccionds_8_tfhisprofec)) )
      {
         addWhere(sWhereString, "(HisProFec >= ?)");
      }
      else
      {
         GXv_int21[43] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
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
                  return conditional_H00IV2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Boolean) dynConstraints[43]).booleanValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).byteValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] );
            case 1 :
                  return conditional_H00IV3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Boolean) dynConstraints[43]).booleanValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).byteValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00IV2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00IV3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
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
                  stmt.setString(sIdx, (String)parms[49], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 28);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 28);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 28);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 28);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 28);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 28);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 28);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 28);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[86]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 1);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 3);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 6);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[92]);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 28);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 28);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 28);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 28);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 28);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 28);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 28);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 28);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 1);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 3);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 6);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[87]);
               }
               return;
      }
   }

}

